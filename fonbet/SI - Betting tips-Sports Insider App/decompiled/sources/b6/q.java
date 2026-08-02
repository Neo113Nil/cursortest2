package b6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f3082a;

    /* renamed from: b, reason: collision with root package name */
    public int f3083b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3084c;

    public q(Context context) {
        this.f3083b = 0;
        this.f3084c = context;
    }

    public io.sentry.android.core.internal.threaddump.a a() {
        int i5 = this.f3083b;
        if (i5 < 0 || i5 >= this.f3082a) {
            return null;
        }
        ArrayList arrayList = (ArrayList) this.f3084c;
        this.f3083b = i5 + 1;
        return (io.sentry.android.core.internal.threaddump.a) arrayList.get(i5);
    }

    public synchronized int b() {
        PackageInfo packageInfo;
        if (this.f3082a == 0) {
            try {
                packageInfo = s6.c.a((Context) this.f3084c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e7) {
                w0.m("Metadata", "Failed to find package ".concat(e7.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f3082a = packageInfo.versionCode;
            }
        }
        return this.f3082a;
    }

    public synchronized int c() {
        int i5 = this.f3083b;
        if (i5 != 0) {
            return i5;
        }
        Context context = (Context) this.f3084c;
        PackageManager packageManager = context.getPackageManager();
        if (s6.c.a(context).f22629a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            w0.d("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!q6.b.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f3083b = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f3083b = i10;
            return i10;
        }
        w0.m("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == q6.b.e()) {
            i10 = 2;
        }
        this.f3083b = i10;
        return i10;
    }

    public q(ArrayList arrayList) {
        this.f3084c = arrayList;
        this.f3082a = arrayList.size();
    }

    public q() {
        this.f3084c = new q[256];
        this.f3082a = 0;
        this.f3083b = 0;
    }

    public q(int i5, int i10) {
        this.f3084c = null;
        this.f3082a = i5;
        int i11 = i10 & 7;
        this.f3083b = i11 == 0 ? 8 : i11;
    }
}
