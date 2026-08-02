package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.core.compose.component.defaults.SpinnerState;
import java.util.Arrays;
import xsna.alb0;
import xsna.ame;
import xsna.ao50;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.epx;
import xsna.f3;
import xsna.fe00;
import xsna.gzs;
import xsna.izs;
import xsna.ja8;
import xsna.jk50;
import xsna.k9q0;
import xsna.n0u0;
import xsna.n34;
import xsna.n87;
import xsna.q2q0;
import xsna.q630;
import xsna.qri;
import xsna.ra8;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.txj0;
import xsna.wow;
import xsna.zfr0;

/* compiled from: ClipsGeoPickerContentView.kt */
/* loaded from: classes16.dex */
public final class d extends ame<j, a> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((j) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(j jVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1434636443);
        int i2 = i | (M.J(jVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1434636443, i2, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.ClipsGeoPickerContentView.ThemedContent (ClipsGeoPickerContentView.kt:28)");
            }
            n0u0[] n0u0VarArr = {jVar.a, jVar.b, jVar.c};
            int i3 = i2 << 3;
            j.c cVar = j.c.a;
            j.d dVar = (j.d) d(cVar, (n0u0[]) Arrays.copyOf(n0u0VarArr, 3), M, ((((i3 & 7168) | 4102) >> 3) & 896) | 6).getValue();
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (dVar instanceof j.b) {
                M.K(-823329245);
                j.b bVar = (j.b) dVar;
                fe00.c((String) jk50.c(bVar.a, M).getValue(), ((wow) jk50.c(bVar.b, M).getValue()).b, izsVar, null, M, i3 & 896);
                M.j();
            } else if (epx.f(dVar, cVar)) {
                M.K(-823074146);
                zfr0.f(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, 0L, null, null, M, 6, 60);
                M = M;
                M.j();
            } else {
                if (!epx.f(dVar, j.e.a)) {
                    throw alb0.c(-1134939130, M);
                }
                M.K(-822803423);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new f3(izsVar, 3);
                    M.R(x);
                }
                q2q0.a(48, M, (gzs) x, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.d(aVar2, 1.0f)));
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n87(this, jVar, izsVar, i, 1);
        }
    }
}
