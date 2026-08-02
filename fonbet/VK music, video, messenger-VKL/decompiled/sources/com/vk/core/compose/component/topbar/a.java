package com.vk.core.compose.component.topbar;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.k;
import kotlin.NoWhenBranchMatchedException;
import xsna.a71;
import xsna.cri;
import xsna.dt1;
import xsna.k9q0;
import xsna.n34;
import xsna.q630;
import xsna.q6x;
import xsna.qri;
import xsna.s200;
import xsna.sy90;
import xsna.ty6;
import xsna.u890;
import xsna.wh50;
import xsna.zak0;
import xsna.znk0;

/* compiled from: AfterImpl.kt */
/* loaded from: classes17.dex */
public final class a extends d {
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public a(d.c cVar, d.b bVar, d.b bVar2, SemanticsConfiguration semanticsConfiguration) {
        this.c = androidx.compose.runtime.k.b(cVar);
        this.d = androidx.compose.runtime.k.b(bVar);
        this.e = androidx.compose.runtime.k.b(bVar2);
        this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // com.vk.core.compose.component.topbar.d
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        k.b bVar;
        k kVar;
        androidx.compose.runtime.a M = aVar.M(-1345305206);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1345305206, i2, -1, "com.vk.core.compose.component.topbar.AfterImpl.Content (AfterImpl.kt:31)");
            }
            wh50 wh50Var = this.d;
            d.b bVar2 = (d.b) ((zak0) wh50Var).getValue();
            if (bVar2 != null) {
                ((zak0) bVar2.c).setValue(b());
            }
            wh50 wh50Var2 = this.e;
            d.b bVar3 = (d.b) ((zak0) wh50Var2).getValue();
            if (bVar3 != null) {
                ((zak0) bVar3.c).setValue(b());
            }
            wh50 wh50Var3 = this.c;
            ((zak0) ((d.c) ((zak0) wh50Var3).getValue()).c).setValue(b());
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.f).getValue());
            znk0.z().getClass();
            float f = 0;
            q630 C = s200.C(b, new u890(f, f, f, f));
            dt1.a.getClass();
            ty6.b bVar4 = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            b z = znk0.z();
            k b2 = b();
            wh50<Float> wh50Var4 = this.a;
            float floatValue = ((Number) ((zak0) wh50Var4).getValue()).floatValue();
            z.getClass();
            boolean z2 = b2 instanceof k.b;
            if (z2) {
                bVar = (k.b) b2;
            } else {
                if (!(b2 instanceof k.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = k.b.a;
            }
            float b3 = b.b(bVar);
            if (z2) {
                kVar = k.a.C0761a.a;
            } else {
                if (!(b2 instanceof k.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = (k.a) b2;
            }
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(q6x.z(b3, b.b(kVar), floatValue)), bVar4, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, C);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            d.b bVar5 = (d.b) ((zak0) wh50Var).getValue();
            if (bVar5 == null) {
                M.K(749614144);
            } else {
                M.K(-391460895);
                bVar5.e(wh50Var4, M, 6);
            }
            M.j();
            d.b bVar6 = (d.b) ((zak0) wh50Var2).getValue();
            if (bVar6 == null) {
                M.K(749666720);
            } else {
                M.K(-391459199);
                bVar6.e(wh50Var4, M, 6);
            }
            M.j();
            ((d.c) ((zak0) wh50Var3).getValue()).e(wh50Var4, M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a71(this, i);
        }
    }
}
