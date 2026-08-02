package sb;

import a2.k;
import android.database.sqlite.SQLiteConstraintException;
import f3.x;
import k2.d0;
import k2.w;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final tb.f f23426a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.f f23427b;

    public j(tb.f generalDao, ub.f predictionDao) {
        Intrinsics.checkNotNullParameter(generalDao, "generalDao");
        Intrinsics.checkNotNullParameter(predictionDao, "predictionDao");
        this.f23426a = generalDao;
        this.f23427b = predictionDao;
    }

    public final boolean a(Boolean bool, int i5) {
        if (bool != null && !Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return true;
        }
        ub.f fVar = this.f23427b;
        x.n0(fVar.f24213a, false, true, new eb.b(i5, 29));
        ((Number) x.n0(fVar.f24213a, false, true, new eb.b(i5, 27))).intValue();
        w wVar = fVar.f24213a;
        x.n0(wVar, false, true, new ub.d(i5, 4));
        ((Number) x.n0(wVar, false, true, new ub.d(i5, 5))).intValue();
        x.n0(wVar, false, true, new ub.d(i5, 10));
        return false;
    }

    public final void b(int i5, Integer[] keepKind) {
        Integer[] kinds = keepKind == null ? new Integer[0] : keepKind;
        ub.f fVar = this.f23427b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        for (Integer num : kinds) {
            ((Number) x.n0(fVar.f24213a, false, true, new tb.b(i5, num.intValue(), 1))).longValue();
        }
        if (keepKind == null) {
            keepKind = new Integer[0];
        }
        Intrinsics.checkNotNullParameter(keepKind, "keepKind");
        StringBuilder b10 = v.f.b("DELETE  FROM prediction_kind_table WHERE idPrediction == ? AND idKind NOT IN (");
        m4.g.c(keepKind.length, b10);
        b10.append(") ");
        String sb2 = b10.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        x.n0(fVar.f24213a, false, true, new pb.a(sb2, i5, keepKind));
    }

    public final void c(String str) {
        String str2;
        tb.f fVar = this.f23426a;
        if (((Number) x.n0(fVar.f23832a, true, false, new d0(25))).intValue() > 0) {
            ((Number) x.n0(fVar.f23832a, false, true, new k(str, 28))).intValue();
            return;
        }
        try {
            str2 = str;
            try {
                r4.k.i(this.f23426a, str2, null, null, null, null, null, 8190);
            } catch (SQLiteConstraintException unused) {
                ((Number) x.n0(fVar.f23832a, false, true, new k(str2, 28))).intValue();
            }
        } catch (SQLiteConstraintException unused2) {
            str2 = str;
        }
    }
}
