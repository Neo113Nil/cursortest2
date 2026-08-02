package t20;

import T7.Z;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f98970a;

    public c(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98970a = context;
    }

    @NotNull
    public final String a() {
        String valueOf;
        long longVersionCode;
        Application application = this.f98970a;
        PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        return Z.a(packageInfo.versionName, " (", valueOf, ")");
    }
}
