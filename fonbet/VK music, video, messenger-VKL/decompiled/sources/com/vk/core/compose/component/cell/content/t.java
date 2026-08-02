package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import ru.ok.android.commons.http.Http;
import xsna.cq;
import xsna.efj;
import xsna.egi;
import xsna.fvr;
import xsna.g4j0;
import xsna.gzs;
import xsna.ir;
import xsna.izs;
import xsna.k18;
import xsna.kqu0;
import xsna.ldu0;
import xsna.nh0;
import xsna.ojc;
import xsna.pco;
import xsna.q630;
import xsna.qhg;
import xsna.s200;
import xsna.sg50;
import xsna.spg0;
import xsna.wh50;
import xsna.wow;
import xsna.z190;
import xsna.zak0;

/* compiled from: CommonAvatarImpl.kt */
/* loaded from: classes17.dex */
public final class t implements Cell$Left.Main, g4j0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h = androidx.compose.runtime.k.b(null);

    public t(efj efjVar, float f, List list, k18 k18Var, z190 z190Var, gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.c = cq.f(f);
        this.d = androidx.compose.runtime.k.b(new wow(list));
        this.e = androidx.compose.runtime.k.b(k18Var);
        this.f = androidx.compose.runtime.k.b(z190Var);
        this.g = androidx.compose.runtime.k.b(gzsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1346149909);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1346149909, i2, -1, "com.vk.core.compose.component.cell.content.CommonAvatarImpl.Content (CommonAvatarImpl.kt:56)");
            }
            M.K(-864890165);
            M.K(-864897540);
            fvr.n();
            com.vk.core.compose.component.defaults.c.a.d(M);
            q630 b = com.vk.core.compose.component.semantics.b.b(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1, q630Var), (SemanticsConfiguration) ((zak0) this.b).getValue());
            izs izsVar = (izs) ((zak0) this.h).getValue();
            q630.a aVar2 = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (izsVar != null) {
                boolean z = (i2 & 896) == 256;
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 28);
                    M.R(x);
                }
                q630 g = b.g(egi.o(aVar2, (izs) x));
                if (g != null) {
                    b = g;
                }
            }
            M.j();
            wh50 wh50Var = this.g;
            if (((gzs) ((zak0) wh50Var).getValue()) != null) {
                gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                if (gzsVar == null) {
                    M.K(-1560478960);
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new nh0(8);
                        M.R(x2);
                    }
                    gzsVar = (gzs) x2;
                } else {
                    M.K(1058040285);
                }
                M.j();
                gzs gzsVar2 = gzsVar;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = ir.h(M);
                }
                q630 g2 = b.g(ojc.b(aVar2, (sg50) x3, null, true, null, gzsVar2, 24));
                if (g2 != null) {
                    q630Var2 = g2;
                    M.j();
                    ldu0.a((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.d).getValue()).b, q630Var2, (k18) ((zak0) this.e).getValue(), false, (z190) ((zak0) this.f).getValue(), null, null, M, 0, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            q630Var2 = b;
            M.j();
            ldu0.a((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.d).getValue()).b, q630Var2, (k18) ((zak0) this.e).getValue(), false, (z190) ((zak0) this.f).getValue(), null, null, M, 0, Http.StatusCode.RANGE_NOT_SATISFIABLE);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qhg(this, spg0Var, q630Var, i, 0);
        }
    }
}
