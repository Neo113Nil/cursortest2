package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a0 extends u0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23605l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String name, b0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f23605l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gf.i, java.lang.Object] */
    @Override // sg.u0
    public final boolean equals(Object obj) {
        int i5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            qg.g gVar = (qg.g) obj;
            if (Intrinsics.areEqual(this.f23700a, gVar.a())) {
                a0 a0Var = (a0) obj;
                if (a0Var.f23605l && Arrays.equals((qg.g[]) this.j.getValue(), (qg.g[]) a0Var.j.getValue())) {
                    int f6 = gVar.f();
                    int i10 = this.f23702c;
                    if (i10 == f6) {
                        for (0; i5 < i10; i5 + 1) {
                            i5 = (Intrinsics.areEqual(i(i5).a(), gVar.i(i5).a()) && Intrinsics.areEqual(i(i5).e(), gVar.i(i5).e())) ? i5 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // sg.u0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // sg.u0, qg.g
    public final boolean isInline() {
        return this.f23605l;
    }
}
