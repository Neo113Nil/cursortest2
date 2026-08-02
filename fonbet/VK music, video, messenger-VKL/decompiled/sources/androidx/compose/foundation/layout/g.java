package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.dp10;
import xsna.ejk;
import xsna.ep10;
import xsna.izs;
import xsna.jgp;
import xsna.npg0;
import xsna.o6j;
import xsna.s6j;
import xsna.tra0;

/* compiled from: FlowLayout.kt */
/* loaded from: classes11.dex */
public interface g extends npg0 {
    @Override // xsna.npg0
    default long a(int i, int i2, int i3, boolean z) {
        if (isHorizontal()) {
            k kVar = j.a;
            return !z ? s6j.a(i, i2, 0, i3) : o6j.a.b(i, i2, 0, i3);
        }
        c cVar = b.a;
        return !z ? s6j.a(0, i3, i, i2) : o6j.a.a(0, i3, i, i2);
    }

    @Override // xsna.npg0
    default int d(tra0 tra0Var) {
        return isHorizontal() ? tra0Var.m0() : tra0Var.n0();
    }

    @Override // xsna.npg0
    default int h(tra0 tra0Var) {
        return isHorizontal() ? tra0Var.n0() : tra0Var.m0();
    }

    @Override // xsna.npg0
    default void i(int i, int[] iArr, int[] iArr2, ep10 ep10Var) {
        if (isHorizontal()) {
            l().b(ep10Var, i, iArr, ep10Var.getLayoutDirection(), iArr2);
        } else {
            k().c(ep10Var, i, iArr, iArr2);
        }
    }

    boolean isHorizontal();

    @Override // xsna.npg0
    default dp10 j(final tra0[] tra0VarArr, ep10 ep10Var, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        if (isHorizontal()) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
        }
        final LayoutDirection layoutDirection = isHorizontal() ? LayoutDirection.Ltr : ep10Var.getLayoutDirection();
        return ep10Var.Q(i8, i7, jgp.b, new izs() { // from class: xsna.eur
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ejk m;
                tra0.a aVar = (tra0.a) obj;
                int[] iArr3 = iArr2;
                int i9 = iArr3 != null ? iArr3[i4] : 0;
                int i10 = i5;
                for (int i11 = i10; i11 < i6; i11++) {
                    tra0 tra0Var = tra0VarArr[i11];
                    androidx.compose.foundation.layout.g gVar = this;
                    gVar.getClass();
                    Object c = tra0Var.c();
                    opg0 opg0Var = c instanceof opg0 ? (opg0) c : null;
                    if (opg0Var == null || (m = opg0Var.c) == null) {
                        m = gVar.m();
                    }
                    int a = m.a(i3, gVar.d(tra0Var), layoutDirection, tra0Var, i) + i9;
                    boolean isHorizontal = gVar.isHorizontal();
                    int[] iArr4 = iArr;
                    if (isHorizontal) {
                        aVar.q(tra0Var, iArr4[i11 - i10], a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        aVar.q(tra0Var, a, iArr4[i11 - i10], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                return s3q0.a;
            }
        });
    }

    a.n k();

    a.e l();

    ejk m();
}
