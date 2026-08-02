package rl0;

import Sc.InterfaceC4008j;
import Sc.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f83615a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f83616b;

    public static final class a extends AbstractC7737t implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Object a11;
            PackageInfo packageInfo;
            PackageManager.PackageInfoFlags of2;
            I i11 = I.this;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                PackageManager packageManager = i11.f83615a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                String packageName = i11.f83615a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                if (Build.VERSION.SDK_INT >= 33) {
                    of2 = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(packageName, of2);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n            getPackage…nfoFlags.of(0))\n        }");
                } else {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n            getPackage…packageName, 0)\n        }");
                }
                a11 = packageInfo.versionName;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            if (a11 instanceof r.b) {
                a11 = null;
            }
            return (String) a11;
        }
    }

    public I(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83615a = context;
        this.f83616b = Sc.k.b(new a());
    }
}
