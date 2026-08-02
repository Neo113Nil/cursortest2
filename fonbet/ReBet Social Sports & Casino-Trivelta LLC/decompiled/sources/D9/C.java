package D9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2602a;

    /* renamed from: b, reason: collision with root package name */
    public int f2603b;

    /* renamed from: c, reason: collision with root package name */
    public int f2604c = 0;

    public C(Context context) {
        this.f2602a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f2603b == 0) {
            try {
                packageInfo = M9.e.a(this.f2602a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f2603b = packageInfo.versionCode;
            }
        }
        return this.f2603b;
    }

    public final synchronized int b() {
        int i10 = this.f2604c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f2602a;
        PackageManager packageManager = context.getPackageManager();
        if (M9.e.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!K9.n.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f2604c = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.f2604c = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == K9.n.e()) {
            i11 = 2;
        }
        this.f2604c = i11;
        return i11;
    }
}
