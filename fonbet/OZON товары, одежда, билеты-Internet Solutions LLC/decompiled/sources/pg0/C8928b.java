package pg0;

import Dj.EnumC2873a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import a5.C4946d;
import android.app.Application;
import android.content.pm.PackageInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg0.InterfaceC9693a;

/* renamed from: pg0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8928b implements InterfaceC8927a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f80521a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f80522b;

    /* renamed from: pg0.b$a */
    static final class a extends AbstractC7737t implements Function0<PackageInfo> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PackageInfo invoke() {
            return C8928b.c(C8928b.this);
        }
    }

    public C8928b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f80521a = application;
        this.f80522b = k.b(new a());
    }

    public static final PackageInfo c(C8928b c8928b) {
        Object a11;
        String[] strArr;
        Object a12;
        Application application = c8928b.f80521a;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = C4946d.a(application);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        PackageInfo packageInfo = null;
        PackageInfo packageInfo2 = (PackageInfo) (a11 instanceof r.b ? null : a11);
        if (packageInfo2 == null) {
            strArr = C8929c.f80524a;
            int i11 = 0;
            while (true) {
                if (i11 >= 3) {
                    break;
                }
                String str = strArr[i11];
                try {
                    r.Companion companion3 = r.INSTANCE;
                    a12 = application.getPackageManager().getPackageInfo(str, 0);
                } catch (Throwable th3) {
                    r.Companion companion4 = r.INSTANCE;
                    a12 = s.a(th3);
                }
                if (a12 instanceof r.b) {
                    a12 = null;
                }
                PackageInfo packageInfo3 = (PackageInfo) a12;
                if (packageInfo3 != null) {
                    packageInfo = packageInfo3;
                    break;
                }
                i11++;
            }
            packageInfo2 = packageInfo;
        }
        if (packageInfo2 == null) {
            InterfaceC9693a.f98765a.f(EnumC2873a.ERROR, "WebViewDataProviderImpl: Не удалось получить данные пакета WebView ни одним способом", new C8930d(r.b(a11)));
        }
        return packageInfo2;
    }

    @Override // pg0.InterfaceC8927a
    public final String a() {
        PackageInfo packageInfo = (PackageInfo) this.f80522b.getValue();
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    @Override // pg0.InterfaceC8927a
    public final String b() {
        PackageInfo packageInfo = (PackageInfo) this.f80522b.getValue();
        if (packageInfo != null) {
            return packageInfo.packageName;
        }
        return null;
    }
}
