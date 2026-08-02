package m3;

import e3.f0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends k2.d {
    public final void a(s2.c statement, Object obj) {
        int i5;
        o entity = (o) obj;
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(entity, "entity");
        String str = entity.f20331a;
        int i10 = 1;
        statement.B(1, str);
        statement.f(2, rh.g.J(entity.f20332b));
        statement.B(3, entity.f20333c);
        statement.B(4, entity.f20334d);
        e3.j jVar = e3.j.f8531b;
        statement.g(5, rh.g.L(entity.f20335e));
        statement.g(6, rh.g.L(entity.f20336f));
        statement.f(7, entity.f20337g);
        statement.f(8, entity.f20338h);
        statement.f(9, entity.f20339i);
        statement.f(10, entity.f20340k);
        e3.a backoffPolicy = entity.f20341l;
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i11 = v.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i11 == 1) {
            i5 = 0;
        } else {
            if (i11 != 2) {
                throw new gf.m();
            }
            i5 = 1;
        }
        statement.f(11, i5);
        statement.f(12, entity.f20342m);
        statement.f(13, entity.f20343n);
        statement.f(14, entity.f20344o);
        statement.f(15, entity.f20345p);
        statement.f(16, entity.q ? 1L : 0L);
        f0 policy = entity.f20346r;
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i12 = v.$EnumSwitchMapping$3[policy.ordinal()];
        if (i12 == 1) {
            i10 = 0;
        } else if (i12 != 2) {
            throw new gf.m();
        }
        statement.f(17, i10);
        statement.f(18, entity.f20347s);
        statement.f(19, entity.f20348t);
        statement.f(20, entity.f20349u);
        statement.f(21, entity.f20350v);
        statement.f(22, entity.f20351w);
        String str2 = entity.f20352x;
        if (str2 == null) {
            statement.h(23);
        } else {
            statement.B(23, str2);
        }
        Boolean bool = entity.f20353y;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            statement.h(24);
        } else {
            statement.f(24, r1.intValue());
        }
        e3.f fVar = entity.j;
        statement.f(25, rh.g.D(fVar.f8506a));
        statement.g(26, rh.g.m(fVar.f8507b));
        statement.f(27, fVar.f8508c ? 1L : 0L);
        statement.f(28, fVar.f8509d ? 1L : 0L);
        statement.f(29, fVar.f8510e ? 1L : 0L);
        statement.f(30, fVar.f8511f ? 1L : 0L);
        statement.f(31, fVar.f8512g);
        statement.f(32, fVar.f8513h);
        statement.g(33, rh.g.H(fVar.f8514i));
        statement.B(34, str);
    }
}
