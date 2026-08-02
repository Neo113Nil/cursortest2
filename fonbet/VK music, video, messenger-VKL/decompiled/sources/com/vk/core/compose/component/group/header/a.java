package com.vk.core.compose.component.group.header;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.ck70;
import xsna.cku;
import xsna.cri;
import xsna.dt1;
import xsna.es5;
import xsna.jgz;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.s200;
import xsna.sy90;
import xsna.wh50;
import xsna.zak0;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public final class a {
    public final wh50 a;
    public final wh50 b;

    /* compiled from: GroupHeader.kt */
    /* renamed from: com.vk.core.compose.component.group.header.a$a, reason: collision with other inner class name */
    public static final class C0748a {
        public static a a(f fVar, androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new a(fVar, null);
                aVar.R(x);
            }
            a aVar2 = (a) x;
            ((zak0) aVar2.a).setValue(fVar);
            ((zak0) aVar2.b).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return aVar2;
        }
    }

    public a(f fVar, cku ckuVar) {
        this.a = k.b(fVar);
        this.b = k.b(ckuVar);
    }

    public final void a(b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(62706145);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED) != 1042)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(62706145, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Content (GroupHeader.kt:1068)");
            }
            jgz.s().getClass();
            q630 C = s200.C(q630Var, s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            jgz.s().getClass();
            a.j g = androidx.compose.foundation.layout.a.g(0);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, C);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f fVar = (f) ((zak0) this.a).getValue();
            int i3 = (i2 & 14) | 48;
            q630.a aVar3 = q630.a.a;
            fVar.a(bVar, aVar3, M, i3);
            cku ckuVar = (cku) ((zak0) this.b).getValue();
            if (ckuVar == null) {
                M.K(422052123);
                M.j();
            } else {
                M.K(422052124);
                ckuVar.a(bVar, aVar3, M, i3);
                jgz.s().getClass();
                ck70.b(aVar3, kqu0.s, M, 0);
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
            s.d = new es5(i, 4, this, bVar, q630Var);
        }
    }
}
