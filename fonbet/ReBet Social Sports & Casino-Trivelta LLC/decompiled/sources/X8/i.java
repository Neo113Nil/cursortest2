package X8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13651b;

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13650a = context;
        this.f13651b = "RNSDK";
    }

    public final String a() {
        return this.f13651b;
    }

    public final String b() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f13650a.getPackageManager().getPackageInfo(this.f13650a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            packageInfo = null;
        }
        return String.valueOf(packageInfo != null ? packageInfo.versionName : null);
    }
}
