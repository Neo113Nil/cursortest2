package bi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f25200a;

    /* renamed from: b, reason: collision with root package name */
    public final KClass f25201b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25202c;

    public c(f original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f25200a = original;
        this.f25201b = kClass;
        this.f25202c = original.h() + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    @Override // bi.f
    public boolean b() {
        return this.f25200a.b();
    }

    @Override // bi.f
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f25200a.c(name);
    }

    @Override // bi.f
    public int d() {
        return this.f25200a.d();
    }

    @Override // bi.f
    public String e(int i10) {
        return this.f25200a.e(i10);
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && Intrinsics.areEqual(this.f25200a, cVar.f25200a) && Intrinsics.areEqual(cVar.f25201b, this.f25201b);
    }

    @Override // bi.f
    public List f(int i10) {
        return this.f25200a.f(i10);
    }

    @Override // bi.f
    public f g(int i10) {
        return this.f25200a.g(i10);
    }

    @Override // bi.f
    public List getAnnotations() {
        return this.f25200a.getAnnotations();
    }

    @Override // bi.f
    public m getKind() {
        return this.f25200a.getKind();
    }

    @Override // bi.f
    public String h() {
        return this.f25202c;
    }

    public int hashCode() {
        return (this.f25201b.hashCode() * 31) + h().hashCode();
    }

    @Override // bi.f
    public boolean i(int i10) {
        return this.f25200a.i(i10);
    }

    @Override // bi.f
    public boolean isInline() {
        return this.f25200a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f25201b + ", original: " + this.f25200a + ')';
    }
}
