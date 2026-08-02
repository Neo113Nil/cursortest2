package s;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import b.InterfaceC5494b;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.internal.auth.AuthActivity$callback$1;
import com.vk.id.internal.auth.AuthActivity$handleStartAuth$1;
import java.util.ArrayList;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C9556d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5494b f98029a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f98030b;

    C9556d(InterfaceC5494b interfaceC5494b, ComponentName componentName) {
        this.f98029a = interfaceC5494b;
        this.f98030b = componentName;
    }

    public static void a(@NonNull AuthActivity authActivity, String str, @NonNull AuthActivity$handleStartAuth$1 authActivity$handleStartAuth$1) {
        authActivity$handleStartAuth$1.setApplicationContext(authActivity.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        authActivity.bindService(intent, authActivity$handleStartAuth$1, 33);
    }

    public static String b(@NonNull AuthActivity authActivity) {
        PackageManager packageManager = authActivity.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public final g c(AuthActivity$callback$1 authActivity$callback$1) {
        BinderC9555c binderC9555c = new BinderC9555c(authActivity$callback$1);
        InterfaceC5494b interfaceC5494b = this.f98029a;
        try {
            if (interfaceC5494b.j(binderC9555c)) {
                return new g(interfaceC5494b, binderC9555c, this.f98030b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void d() {
        try {
            this.f98029a.q();
        } catch (RemoteException unused) {
        }
    }
}
