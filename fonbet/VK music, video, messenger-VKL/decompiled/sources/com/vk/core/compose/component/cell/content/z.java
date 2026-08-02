package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import xsna.bg4;
import xsna.cq;
import xsna.efj;
import xsna.g4j0;
import xsna.gdv0;
import xsna.gzs;
import xsna.ir;
import xsna.jb;
import xsna.ojc;
import xsna.pco;
import xsna.q630;
import xsna.s200;
import xsna.sg50;
import xsna.spg0;
import xsna.wh50;
import xsna.wow;
import xsna.z190;
import xsna.zak0;

/* compiled from: CommonPictureImpl.kt */
/* loaded from: classes17.dex */
public final class z implements Cell$Left.Main, o.e, g4j0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;

    public z(efj efjVar, float f, float f2, List list, z190 z190Var, PictureRadius pictureRadius, gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.c = cq.f(f);
        this.d = cq.f(f2);
        this.e = androidx.compose.runtime.k.b(new wow(list));
        this.f = androidx.compose.runtime.k.b(z190Var);
        this.g = androidx.compose.runtime.k.b(pictureRadius);
        this.h = androidx.compose.runtime.k.b(gzsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-509770685);
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
                androidx.compose.runtime.b.f(-509770685, i2, -1, "com.vk.core.compose.component.cell.content.CommonPictureImpl.Content (CommonPictureImpl.kt:51)");
            }
            M.K(-263348381);
            q630 b = com.vk.core.compose.component.semantics.b.b(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((pco) ((zak0) this.d).getValue()).b, 1, q630Var), (SemanticsConfiguration) ((zak0) this.b).getValue());
            wh50 wh50Var = this.h;
            if (((gzs) ((zak0) wh50Var).getValue()) != null) {
                gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (gzsVar == null) {
                    M.K(547514104);
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new jb(11);
                        M.R(x);
                    }
                    gzsVar = (gzs) x;
                } else {
                    M.K(848945397);
                }
                M.j();
                gzs gzsVar2 = gzsVar;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = ir.h(M);
                }
                q630 g = b.g(ojc.b(q630.a.a, (sg50) x2, null, true, null, gzsVar2, 24));
                if (g != null) {
                    q630Var2 = g;
                    M.j();
                    gdv0.b((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.e).getValue()).b, q630Var2, (PictureRadius) ((zak0) this.g).getValue(), (z190) ((zak0) this.f).getValue(), null, M, 0, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            q630Var2 = b;
            M.j();
            gdv0.b((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.c).getValue()).b, ((wow) ((zak0) this.e).getValue()).b, q630Var2, (PictureRadius) ((zak0) this.g).getValue(), (z190) ((zak0) this.f).getValue(), null, M, 0, 64);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bg4(this, spg0Var, q630Var, i, 1);
        }
    }
}
