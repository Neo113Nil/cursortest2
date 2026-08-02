package k5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f70562a;

    public G1(@NonNull Context context) {
        this.f70562a = context.getPackageManager();
    }

    @NonNull
    public final HashSet a() {
        List<ResolveInfo> queryIntentServices;
        PackageManager.ResolveInfoFlags of2;
        ArrayList arrayList = new ArrayList();
        int i11 = Build.VERSION.SDK_INT;
        PackageManager packageManager = this.f70562a;
        if (i11 >= 33) {
            Intent intent = new Intent("android.net.VpnService");
            of2 = PackageManager.ResolveInfoFlags.of(128L);
            queryIntentServices = packageManager.queryIntentServices(intent, of2);
        } else {
            queryIntentServices = packageManager.queryIntentServices(new Intent("android.net.VpnService"), UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        if (queryIntentServices != null) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    arrayList.add(serviceInfo.packageName);
                }
            }
        }
        return new HashSet(arrayList);
    }
}
