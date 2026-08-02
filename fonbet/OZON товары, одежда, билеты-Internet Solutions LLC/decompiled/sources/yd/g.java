package yd;

import Ld.w;
import ge.C6718a;
import ge.C6722e;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import yd.f;

/* loaded from: classes.dex */
public final class g implements w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClassLoader f106568a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6722e f106569b;

    public g(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f106568a = classLoader;
        this.f106569b = new C6722e();
    }

    @Override // Ld.w
    public final w.a.b a(@NotNull Sd.b classId, @NotNull Rd.e jvmMetadataVersion) {
        f a11;
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        String b11 = classId.g().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        String Y11 = kotlin.text.h.Y(b11, '.', '$');
        if (!classId.f().d()) {
            Y11 = classId.f() + '.' + Y11;
        }
        Class<?> a12 = e.a(this.f106568a, Y11);
        if (a12 == null || (a11 = f.a.a(a12)) == null) {
            return null;
        }
        return new w.a.b(a11);
    }

    @Override // fe.InterfaceC6516A
    public final InputStream b(@NotNull Sd.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (!packageFqName.i(s.f81864k)) {
            return null;
        }
        C6718a.f64290m.getClass();
        String m11 = C6718a.m(packageFqName);
        this.f106569b.getClass();
        return C6722e.a(m11);
    }

    public final w.a.b c(@NotNull Jd.g javaClass, @NotNull Rd.e jvmMetadataVersion) {
        String b11;
        Class<?> a11;
        f a12;
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        Sd.c c11 = javaClass.c();
        if (c11 == null || (b11 = c11.b()) == null || (a11 = e.a(this.f106568a, b11)) == null || (a12 = f.a.a(a11)) == null) {
            return null;
        }
        return new w.a.b(a12);
    }
}
