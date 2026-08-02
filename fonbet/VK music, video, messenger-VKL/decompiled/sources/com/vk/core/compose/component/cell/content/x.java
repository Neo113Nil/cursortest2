package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.c;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.byc0;
import xsna.f20;
import xsna.fvr;
import xsna.g4j0;
import xsna.gzs;
import xsna.kkg;
import xsna.l5g;
import xsna.lg90;
import xsna.lkg;
import xsna.nzu0;
import xsna.q630;
import xsna.spg0;
import xsna.txj0;
import xsna.uco;
import xsna.vqv;
import xsna.wh50;
import xsna.wzs;
import xsna.zak0;
import xsna.zy60;

/* compiled from: CommonIconImpl.kt */
/* loaded from: classes17.dex */
public final class x extends a1.g.a.AbstractC0735a implements Cell$Left.b, o.d, Cell$Left.Main, Cell$Middle.d.a.InterfaceC0732a, RichCell$Middle.h.a, RichCell$Middle.g.a, RichCell$Middle.c.a, Cell$Middle.c.a, g4j0, a1.f.a {
    public final boolean c;
    public final AlongIconType d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;

    public x() {
        throw null;
    }

    public x(lg90 lg90Var, long j, uco ucoVar, String str, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, boolean z, AlongIconType alongIconType) {
        this.c = z;
        this.d = alongIconType;
        this.e = androidx.compose.runtime.k.b(lg90Var);
        this.f = zy60.d(j);
        this.g = androidx.compose.runtime.k.b(ucoVar);
        this.h = androidx.compose.runtime.k.b(gzsVar);
        this.i = androidx.compose.runtime.k.b(str);
        this.j = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // com.vk.core.compose.component.cell.content.a1.g.a, com.vk.core.compose.component.cell.content.a1.f.a
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        float f;
        androidx.compose.runtime.a M = aVar.M(-41568085);
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
                androidx.compose.runtime.b.f(-41568085, i2, -1, "com.vk.core.compose.component.cell.content.CommonIconImpl.Content (CommonIconImpl.kt:50)");
            }
            uco ucoVar = (uco) ((zak0) this.g).getValue();
            if (ucoVar == null) {
                M.K(-1404118488);
                AlongIconType alongIconType = this.d;
                if (alongIconType == null) {
                    M.K(-1404118489);
                    M.j();
                    ucoVar = null;
                } else {
                    M.K(-1404118488);
                    fvr.n();
                    com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
                    ((Boolean) ((zak0) this.b).getValue()).getClass();
                    M.K(2121707978);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2121707978, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.alongIconSize (VkCellDefaults.kt:57)");
                    }
                    int i3 = c.a.$EnumSwitchMapping$1[alongIconType.ordinal()];
                    if (i3 == 1) {
                        f = 16;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = 12;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    long b = byc0.b(f, f);
                    M.j();
                    ucoVar = new uco(b);
                }
            } else {
                M.K(-1292220971);
            }
            M.j();
            long j = ucoVar != null ? ucoVar.a : 9205357640488583168L;
            boolean z = this.c;
            wh50 wh50Var = this.i;
            wh50 wh50Var2 = this.f;
            wh50 wh50Var3 = this.e;
            wh50 wh50Var4 = this.j;
            if (z) {
                M.K(-1403947182);
                q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) wh50Var4).getValue());
                lg90 lg90Var = (lg90) ((zak0) wh50Var3).getValue();
                long j2 = ((l5g) ((zak0) wh50Var2).getValue()).a;
                wh50 wh50Var5 = this.h;
                boolean z2 = ((gzs) ((zak0) wh50Var5).getValue()) != null;
                gzs gzsVar = (gzs) ((zak0) wh50Var5).getValue();
                if (gzsVar == null) {
                    M.K(-1403652651);
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = new f20(9);
                        M.R(x);
                    }
                    gzsVar = (gzs) x;
                } else {
                    M.K(-1292205448);
                }
                M.j();
                nzu0.b(gzsVar, lg90Var, j, (String) ((zak0) wh50Var).getValue(), b2, j2, false, null, z2, null, null, M, 64, 0, 1728);
                M = M;
                M.j();
            } else {
                M.K(-1403556675);
                q630 b3 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) wh50Var4).getValue());
                if (!uco.a(j, 9205357640488583168L)) {
                    b3 = b3.g(txj0.r(j, q630.a.a));
                }
                vqv.a((lg90) ((zak0) wh50Var3).getValue(), (String) ((zak0) wh50Var).getValue(), b3, ((l5g) ((zak0) wh50Var2).getValue()).a, M, 8, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lkg(this, spg0Var, q630Var, i, 0);
        }
    }

    @Override // com.vk.core.compose.component.cell.content.RichCell.Middle.h.a, com.vk.core.compose.component.cell.content.RichCell.Middle.g.a, com.vk.core.compose.component.cell.content.RichCell.Middle.c.a
    public final void b(spg0 spg0Var, q630 q630Var, RichCell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-161219360);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-161219360, i2, -1, "com.vk.core.compose.component.cell.content.CommonIconImpl.Content (CommonIconImpl.kt:85)");
            }
            a(spg0Var, q630Var, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 3) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kkg(this, spg0Var, q630Var, size, i);
        }
    }

    @Override // com.vk.core.compose.component.cell.content.Cell.Middle.d.a
    public final void c(final spg0 spg0Var, final q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-161219360);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-161219360, i2, -1, "com.vk.core.compose.component.cell.content.CommonIconImpl.Content (CommonIconImpl.kt:80)");
            }
            a(spg0Var, q630Var, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 3) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mkg
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.core.compose.component.cell.content.x.this.c(spg0Var, q630Var, size, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
