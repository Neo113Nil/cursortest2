package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.j0;
import com.vk.core.compose.component.cell.content.k0;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.cell.content.u0;
import com.vkontakte.android.R;
import java.util.List;
import xsna.hik0;
import xsna.i35;
import xsna.j5g;
import xsna.jf30;
import xsna.kai;
import xsna.q2;
import xsna.q630;
import xsna.rdi;
import xsna.rl3;
import xsna.s3q0;
import xsna.us2;
import xsna.wiu0;
import xsna.wlb0;
import xsna.wuv0;
import xsna.ylu0;
import xsna.zzs;

/* compiled from: MovieSearchSuggestionVh.kt */
/* loaded from: classes16.dex */
public final class a {
    public static final void a(final jf30 jf30Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str;
        String g0;
        int m;
        androidx.compose.runtime.a M = aVar.M(-1994285423);
        int i3 = (M.J(jf30Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1994285423, i3, -1, "com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestion (MovieSearchSuggestionVh.kt:123)");
            }
            wuv0 l = wlb0.l(M);
            ylu0 h = wlb0.h(M);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean J = ((i3 & 14) == 4) | M.J(l) | M.J(h);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                us2.b bVar = new us2.b();
                Float f = jf30Var.d;
                if (f != null) {
                    float k = i35.k(f.floatValue(), 1);
                    m = bVar.m(hik0.a(l.l0.a.a, k >= 7.0f ? h.getText().l : h.getText().p, 65534));
                    try {
                        bVar.g(k + "  ");
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                    }
                }
                List x2 = rdi.x(rl3.I(new Object[]{jf30Var.i, jf30Var.f}));
                String g02 = x2 != null ? j5g.g0(x2, null, null, null, 0, null, 63) : null;
                String str2 = jf30Var.g;
                Integer num = jf30Var.h;
                if (num != null) {
                    int intValue = num.intValue();
                    int i4 = intValue / 60;
                    int i5 = intValue % 60;
                    str = i4 > 0 ? context.getString(R.string.search_suggest_movie_duration, Integer.valueOf(i4), Integer.valueOf(i5)) : context.getString(R.string.search_suggest_movie_duration_minutes, Integer.valueOf(i5));
                } else {
                    str = null;
                }
                List x3 = rdi.x(rl3.I(new String[]{str2, str, jf30Var.e}));
                List x4 = rdi.x(rl3.I(new String[]{g02, x3 != null ? j5g.g0(x3, null, null, null, 0, null, 63) : null}));
                if (x4 != null && (g0 = j5g.g0(x4, " · ", null, null, 0, null, 62)) != null) {
                    m = bVar.m(hik0.a(l.i0.a.a, h.getText().p, 65534));
                    try {
                        bVar.g(g0);
                        s3q0 s3q0Var2 = s3q0.a;
                    } finally {
                    }
                }
                x = bVar.n();
                M.R(x);
            }
            us2 us2Var = (us2) x;
            j0 a = Cell$Left.Main.a.C0731a.a(kai.c(-1934297014, new zzs() { // from class: xsna.kf30
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue2 & 1, (intValue2 & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1934297014, intValue2, -1, "com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestion.<anonymous> (MovieSearchSuggestionVh.kt:160)");
                        }
                        r0v0.a(fwu0.l(jf30.this.c, null, null, null, aVar2, 0, 62), rte0.d(txj0.h(txj0.v(q630.a.a, 24), 36), vog0.b(2)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar2, 8, 252);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M);
            k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(jf30Var.b.a(0, M), null, null, 2, null, null, M, 12610560, 102), us2Var.c.length() > 0 ? Cell$Middle.c.b.a(us2Var, null, 1, 2, null, null, null, null, M, 805309824, 498) : null, null, null, M, 196608, 28);
            M = M;
            M.K(528410437);
            i2 = 4;
            u0 a3 = o.b.a.a(null, null, 0L, false, M, 196608, 31);
            M.j();
            wiu0.b(q630Var, false, a, a2, a3, null, null, M, (i3 >> 3) & 14, 98);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 4;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new q2(jf30Var, q630Var, i, i2);
        }
    }
}
