package zd;

import Jd.InterfaceC3390A;
import Jd.InterfaceC3391a;
import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class J extends y implements InterfaceC3390A {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H f108807a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Annotation[] f108808b;

    /* renamed from: c, reason: collision with root package name */
    private final String f108809c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f108810d;

    public J(@NotNull H type, @NotNull Annotation[] reflectAnnotations, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reflectAnnotations, "reflectAnnotations");
        this.f108807a = type;
        this.f108808b = reflectAnnotations;
        this.f108809c = str;
        this.f108810d = z11;
    }

    @Override // Jd.InterfaceC3390A
    public final boolean a() {
        return this.f108810d;
    }

    @Override // Jd.d
    public final Collection getAnnotations() {
        return C11108j.b(this.f108808b);
    }

    @Override // Jd.InterfaceC3390A
    public final Sd.f getName() {
        String str = this.f108809c;
        if (str != null) {
            return Sd.f.e(str);
        }
        return null;
    }

    @Override // Jd.InterfaceC3390A
    public final Jd.w getType() {
        return this.f108807a;
    }

    @Override // Jd.d
    public final InterfaceC3391a j(Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return C11108j.a(this.f108808b, fqName);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(J.class.getName());
        sb2.append(": ");
        sb2.append(this.f108810d ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(this.f108807a);
        return sb2.toString();
    }
}
