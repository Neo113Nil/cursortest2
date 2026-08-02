package com.vk.music.ui.search.history;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.p;
import com.vk.core.compose.component.cell.content.x;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import xsna.buw;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.er;
import xsna.gzs;
import xsna.ijd0;
import xsna.izs;
import xsna.ja8;
import xsna.jai;
import xsna.k9q0;
import xsna.lg90;
import xsna.n34;
import xsna.ojc;
import xsna.plg0;
import xsna.q630;
import xsna.qri;
import xsna.sg50;
import xsna.sy90;
import xsna.txj0;
import xsna.wzs;
import xsna.x620;

/* compiled from: SearchHistoryCellRight.kt */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: SearchHistoryCellRight.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchHistoryItemViewParams$ActionIconParams.IconType.values().length];
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.More.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.MoreWithPreAction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.Chevron.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.Add.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.Done.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchHistoryItemViewParams$ActionIconParams.IconType.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final long j, final boolean z, final gzs gzsVar, final sg50 sg50Var, final buw buwVar, final q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        final jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1257410728);
        int i2 = i | (M.p(j) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        int i3 = i2 | (M.y(gzsVar) ? 256 : 128) | (M.J(buwVar) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1257410728, i3, -1, "com.vk.music.ui.search.history.IconRippleButton (SearchHistoryCellRight.kt:268)");
            }
            q630 r = txj0.r(j, q630Var);
            boolean z2 = true;
            plg0 plg0Var = new plg0(0);
            if ((i3 & 896) != 256) {
                z2 = false;
            }
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new ijd0(1, gzsVar);
                M.R(x);
            }
            q630 b = ojc.b(r, sg50Var, buwVar, z, plg0Var, (gzs) x, 8);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar2 = jaiVar;
            if (er.f(6, M, jaiVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ouh0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.music.ui.search.history.b.a(j, z, gzsVar, sg50Var, buwVar, q630Var, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final x b(lg90 lg90Var, long j, long j2, int i, gzs gzsVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1425477438, 8, -1, "com.vk.music.ui.search.history.singleIconCell (SearchHistoryCellRight.kt:296)");
        }
        String N = d370.N(i, 0, aVar);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new x620(22);
            aVar.R(x);
        }
        x a2 = p.a(lg90Var, j2, j, N, gzsVar, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar, 1572872, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }
}
