package tg;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p implements qg.g {

    /* renamed from: a, reason: collision with root package name */
    public final gf.t f23956a;

    public p(Function0 function0) {
        this.f23956a = gf.k.b(function0);
    }

    @Override // qg.g
    public final String a() {
        return b().a();
    }

    public final qg.g b() {
        return (qg.g) this.f23956a.getValue();
    }

    @Override // qg.g
    public final boolean c() {
        return false;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return b().d(name);
    }

    @Override // qg.g
    public final a.a e() {
        return b().e();
    }

    @Override // qg.g
    public final int f() {
        return b().f();
    }

    @Override // qg.g
    public final String g(int i5) {
        return b().g(i5);
    }

    @Override // qg.g
    public final List getAnnotations() {
        return e0.f19204a;
    }

    @Override // qg.g
    public final List h(int i5) {
        return b().h(i5);
    }

    @Override // qg.g
    public final qg.g i(int i5) {
        return b().i(i5);
    }

    @Override // qg.g
    public final boolean isInline() {
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        return b().j(i5);
    }
}
