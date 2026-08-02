package com.vk.ecomm.design.compose.tile;

import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.akk;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.f9t;
import xsna.gzk0;
import xsna.gzs;
import xsna.hrd0;
import xsna.i9p0;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.kkk;
import xsna.kqu0;
import xsna.l3v0;
import xsna.l5g;
import xsna.lg90;
import xsna.mnw;
import xsna.n0;
import xsna.n34;
import xsna.n3v0;
import xsna.o3v0;
import xsna.ojc;
import xsna.pco;
import xsna.q630;
import xsna.qhw;
import xsna.qri;
import xsna.ra8;
import xsna.rte0;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.szw;
import xsna.t490;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.v1m;
import xsna.vi0;
import xsna.vog0;
import xsna.vqd0;
import xsna.wow;
import xsna.wy5;
import xsna.xc10;
import xsna.xm6;
import xsna.xpy;
import xsna.xy0;
import xsna.y6e0;
import xsna.yq1;
import xsna.zak0;
import xsna.zxe0;

/* compiled from: MarketProductTile.kt */
/* loaded from: classes18.dex */
public final class a {

    /* compiled from: MarketProductTile.kt */
    /* renamed from: com.vk.ecomm.design.compose.tile.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0936a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProductTileConfig.ViewerType.values().length];
            try {
                iArr[MarketProductTileConfig.ViewerType.Bayer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketProductTileConfig.ViewerType.Seller.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(MarketProductTileConfig marketProductTileConfig, q630 q630Var, pco pcoVar, izs izsVar, izs izsVar2, izs izsVar3, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        int i4;
        pco pcoVar2;
        int i5;
        izs izsVar4;
        int i6;
        int i7;
        q630 q630Var2;
        izs izsVar5;
        pco pcoVar3;
        izs izsVar6;
        f s;
        Object obj;
        q630 q630Var3;
        int i8;
        izs izsVar7;
        i9p0 i9p0Var;
        izs izsVar8;
        boolean z;
        izs izsVar9;
        int i9;
        a.C0011a.C0012a c0012a;
        izs izsVar10;
        MarketProductTileConfig.b bVar;
        n3v0 n3v0Var;
        kkk kkkVar;
        int i10;
        gzk0 gzk0Var;
        hrd0 hrd0Var;
        int i11;
        String str;
        lg90 lg90Var;
        long j;
        l5g l5gVar;
        vqd0 vqd0Var;
        int i12;
        lg90 a;
        String l;
        t490 t490Var;
        zxe0 zxe0Var;
        zxe0 a2;
        List list;
        y6e0 y6e0Var;
        Object x;
        hrd0 hrd0Var2;
        vqd0 vqd0Var2;
        t490 t490Var2;
        zxe0 zxe0Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object x2;
        izs izsVar11;
        akk akkVar;
        MarketProductTileConfig.a aVar2;
        wy5 wy5Var;
        akk akkVar2;
        String str2;
        lg90 lg90Var2;
        long j2;
        gzs gzsVar;
        long j3;
        MarketProductTileConfig.ProductStatusType productStatusType = marketProductTileConfig.c;
        MarketProductTileConfig.HoldDescriptionSecondLineType holdDescriptionSecondLineType = marketProductTileConfig.n;
        MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType = marketProductTileConfig.d;
        MarketProductTileConfig.b bVar2 = marketProductTileConfig.p;
        MarketProductTileConfig.ViewerType viewerType = marketProductTileConfig.b;
        androidx.compose.runtime.a M = aVar.M(-1225333565);
        if ((i & 6) == 0) {
            i3 = (M.J(marketProductTileConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                pcoVar2 = pcoVar;
                i3 |= M.J(pcoVar2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= M.y(izsVar) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    izsVar4 = izsVar2;
                    i3 |= M.y(izsVar4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= M.y(izsVar3) ? 131072 : 65536;
                    }
                    i7 = i3 | 1572864;
                    if (M.t(i7 & 1, (i7 & 599187) == 599186)) {
                        M.h();
                        q630Var2 = q630Var;
                        izsVar5 = izsVar3;
                        pcoVar3 = pcoVar2;
                        izsVar6 = izsVar4;
                    } else {
                        q630.a aVar3 = q630.a.a;
                        q630 q630Var4 = i13 != 0 ? aVar3 : q630Var;
                        if (i4 != 0) {
                            pcoVar2 = null;
                        }
                        if (i5 != 0) {
                            izsVar4 = null;
                        }
                        izs izsVar12 = i6 != 0 ? null : izsVar3;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1225333565, i7, -1, "com.vk.ecomm.design.compose.tile.MarketProductTile (MarketProductTile.kt:75)");
                        }
                        boolean o = M.o(viewerType.ordinal());
                        Object x3 = M.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (o || x3 == c0012a2) {
                            int i14 = C0936a.$EnumSwitchMapping$0[viewerType.ordinal()];
                            if (i14 == 1) {
                                obj = l3v0.a;
                            } else {
                                if (i14 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                obj = o3v0.a;
                            }
                            x3 = obj;
                            M.R(x3);
                        }
                        n3v0 n3v0Var2 = (n3v0) x3;
                        if (pcoVar2 == null || (q630Var3 = txj0.v(aVar3, pcoVar2.b)) == null) {
                            q630Var3 = aVar3;
                        }
                        q630 q630Var5 = q630Var4;
                        q630 d = rte0.d(q630Var3.g(q630Var4), vog0.b(10));
                        int i15 = i7 & 14;
                        boolean z5 = ((i7 & 7168) == 2048) | (i15 == 4);
                        Object x4 = M.x();
                        if (z5 || x4 == c0012a2) {
                            i8 = i7;
                            x4 = new xm6(7, izsVar, marketProductTileConfig);
                            M.R(x4);
                        } else {
                            i8 = i7;
                        }
                        q630 c = ojc.c(d, false, null, null, (gzs) x4, 15);
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.b;
                        pco pcoVar4 = pcoVar2;
                        cp10 d2 = ja8.d(ty6Var, false);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c2 = qri.c(M, c);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar4);
                        } else {
                            M.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(M, d2, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(M, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar3 = cri.a.g;
                        k9q0.w(M, valueOf, bVar3);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(M, c2678a);
                        izs izsVar13 = izsVar12;
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(M, c2, dVar);
                        float f = kqu0.r;
                        float f2 = kqu0.s;
                        q630 G = s200.G(aVar3, f2, f, f2, f2);
                        izs izsVar14 = izsVar4;
                        c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c3 = qri.c(M, G);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar4);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a3, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar3, M, c2678a);
                        k9q0.w(M, c3, dVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1425206243, i15, -1, "com.vk.ecomm.design.compose.tile.buildImageContent (MarketProductTile.kt:156)");
                        }
                        List list2 = marketProductTileConfig.f;
                        boolean z6 = marketProductTileConfig.h;
                        boolean b = n3v0Var2.b(productStatusType, z6, M, 0);
                        boolean f3 = n3v0Var2.f(z6, M, 0);
                        boolean m = n3v0Var2.m(productStatusType, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(189092216, 24576, -1, "com.vk.ecomm.design.compose.tile.impl.image.ImageContent.Companion.invoke (ImageContent.kt:168)");
                        }
                        Object x5 = M.x();
                        if (x5 == c0012a2) {
                            x5 = new qhw(list2, b, m, f3);
                            M.R(x5);
                        }
                        qhw qhwVar = (qhw) x5;
                        ((zak0) qhwVar.a).setValue(list2 != null ? new wow(list2) : null);
                        ((zak0) qhwVar.b).setValue(Boolean.valueOf(b));
                        ((zak0) qhwVar.c).setValue(Boolean.valueOf(f3));
                        ((zak0) qhwVar.d).setValue(Boolean.valueOf(m));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        MarketProductTileConfig.i iVar = marketProductTileConfig.l;
                        boolean z7 = ((i8 & 57344) == 16384) | (i15 == 4);
                        Object x6 = M.x();
                        if (z7 || x6 == c0012a2) {
                            izsVar7 = izsVar14;
                            x6 = new xy0(12, izsVar7, marketProductTileConfig);
                            M.R(x6);
                        } else {
                            izsVar7 = izsVar14;
                        }
                        gzs gzsVar2 = (gzs) x6;
                        boolean z8 = ((i8 & 3670016) == 1048576) | (i15 == 4);
                        Object x7 = M.x();
                        if (z8 || x7 == c0012a2) {
                            x7 = new vi0(marketProductTileConfig, 26);
                            M.R(x7);
                        }
                        gzs gzsVar3 = (gzs) x7;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1893988507, 0, -1, "com.vk.ecomm.design.compose.tile.buildTopRightAction (MarketProductTile.kt:170)");
                        }
                        if (iVar == null) {
                            M.K(-826022493);
                            M.j();
                            i9p0Var = null;
                        } else {
                            M.K(-826022492);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-539176044, 3072, -1, "com.vk.ecomm.design.compose.tile.impl.image.TopRightActionContent.Companion.invoke (TopRightActionContent.kt:102)");
                            }
                            if (!(iVar instanceof MarketProductTileConfig.i.b)) {
                                gzsVar2 = gzsVar3;
                            }
                            Object x8 = M.x();
                            if (x8 == c0012a2) {
                                x8 = new i9p0(iVar, gzsVar2);
                                M.R(x8);
                            }
                            i9p0Var = (i9p0) x8;
                            ((zak0) i9p0Var.a).setValue(iVar);
                            ((zak0) i9p0Var.b).setValue(gzsVar2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean z9 = displayCtaButtonType == MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE;
                        int i16 = i8 & 458752;
                        boolean z10 = (i16 == 131072) | (i15 == 4);
                        Object x9 = M.x();
                        if (z10 || x9 == c0012a2) {
                            izsVar8 = izsVar13;
                            x9 = new n0(18, izsVar8, marketProductTileConfig);
                            M.R(x9);
                        } else {
                            izsVar8 = izsVar13;
                        }
                        gzs gzsVar4 = (gzs) x9;
                        if (androidx.compose.runtime.b.d()) {
                            z = z9;
                            androidx.compose.runtime.b.f(645986785, 0, -1, "com.vk.ecomm.design.compose.tile.buildCtaIconButton (MarketProductTile.kt:186)");
                        } else {
                            z = z9;
                        }
                        if (z) {
                            M.K(-1155890897);
                            if (bVar2 == null) {
                                M.K(-1155870903);
                                M.j();
                                izsVar9 = izsVar8;
                                i9 = i16;
                                c0012a = c0012a2;
                                izsVar10 = izsVar7;
                                bVar = bVar2;
                                kkkVar = null;
                                n3v0Var = n3v0Var2;
                            } else {
                                MarketProductTileConfig.CtaButtonType ctaButtonType = bVar2.a;
                                M.K(-1155870902);
                                lg90 r = n3v0Var2.r(ctaButtonType, M, 0);
                                long d3 = n3v0Var2.d(ctaButtonType, M, 0);
                                long t = n3v0Var2.t(ctaButtonType, M, 0);
                                String str3 = bVar2.b;
                                if (androidx.compose.runtime.b.d()) {
                                    izsVar9 = izsVar8;
                                    n3v0Var = n3v0Var2;
                                    androidx.compose.runtime.b.f(1978536472, 196616, -1, "com.vk.ecomm.design.compose.tile.impl.image.CtaIconButtonContent.Companion.invoke (CtaIconButtonContent.kt:71)");
                                } else {
                                    izsVar9 = izsVar8;
                                    n3v0Var = n3v0Var2;
                                }
                                Object x10 = M.x();
                                if (x10 == c0012a2) {
                                    c0012a = c0012a2;
                                    x10 = new kkk(r, d3, t, str3, gzsVar4);
                                    lg90Var2 = r;
                                    str2 = str3;
                                    gzsVar = gzsVar4;
                                    i9 = i16;
                                    izsVar10 = izsVar7;
                                    j3 = d3;
                                    j2 = t;
                                    M.R(x10);
                                } else {
                                    str2 = str3;
                                    c0012a = c0012a2;
                                    izsVar10 = izsVar7;
                                    lg90Var2 = r;
                                    j2 = t;
                                    gzsVar = gzsVar4;
                                    i9 = i16;
                                    j3 = d3;
                                }
                                kkkVar = (kkk) x10;
                                bVar = bVar2;
                                ((zak0) kkkVar.a).setValue(lg90Var2);
                                ((zak0) kkkVar.b).setValue(new l5g(j3));
                                ((zak0) kkkVar.c).setValue(new l5g(j2));
                                ((zak0) kkkVar.d).setValue(str2);
                                ((zak0) kkkVar.e).setValue(gzsVar);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            }
                            M.j();
                        } else {
                            izsVar9 = izsVar8;
                            i9 = i16;
                            c0012a = c0012a2;
                            izsVar10 = izsVar7;
                            bVar = bVar2;
                            n3v0Var = n3v0Var2;
                            M.K(-1155467748);
                            M.j();
                            kkkVar = null;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1816268508, i15, -1, "com.vk.ecomm.design.compose.tile.buildStatus (MarketProductTile.kt:201)");
                            i10 = -1;
                        } else {
                            i10 = -1;
                        }
                        int i17 = i10;
                        n3v0 n3v0Var3 = n3v0Var;
                        a.C0011a.C0012a c0012a3 = c0012a;
                        int i18 = i9;
                        String k = n3v0Var3.k(marketProductTileConfig.g, marketProductTileConfig.c, marketProductTileConfig.h, M, 0);
                        if (k == null) {
                            M.K(457434713);
                            M.j();
                            gzk0Var = null;
                        } else {
                            M.K(457434714);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-181884664, 48, i17, "com.vk.ecomm.design.compose.tile.impl.image.StatusContent.Companion.invoke (StatusContent.kt:52)");
                            }
                            Object x11 = M.x();
                            if (x11 == c0012a3) {
                                x11 = new gzk0(k);
                                M.R(x11);
                            }
                            gzk0Var = (gzk0) x11;
                            ((zak0) gzk0Var.a).setValue(k);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1346414956, 24576, i17, "com.vk.ecomm.design.compose.tile.impl.image.ImagesContainer.Companion.invoke (ImagesContainer.kt:77)");
                        }
                        Object x12 = M.x();
                        if (x12 == c0012a3) {
                            x12 = new mnw(qhwVar, i9p0Var, kkkVar, gzk0Var);
                            M.R(x12);
                        }
                        mnw mnwVar = (mnw) x12;
                        ((zak0) mnwVar.a).setValue(qhwVar);
                        ((zak0) mnwVar.b).setValue(i9p0Var);
                        ((zak0) mnwVar.c).setValue(kkkVar);
                        ((zak0) mnwVar.d).setValue(gzk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        mnwVar.a(null, pcoVar4 != null ? new pco(pcoVar4.b - (2 * f2)) : null, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(611259213, i15, i17, "com.vk.ecomm.design.compose.tile.buildPrice (MarketProductTile.kt:215)");
                        }
                        MarketProductTileConfig.e eVar2 = marketProductTileConfig.i;
                        if (eVar2 == null) {
                            M.K(-637940477);
                            M.j();
                            hrd0Var = null;
                        } else {
                            M.K(-637940476);
                            String n = n3v0Var3.n(eVar2, M, 0);
                            String e = n3v0Var3.e(eVar2, M, 0);
                            long g = n3v0Var3.g(productStatusType, M, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-2087105375, 3072, i17, "com.vk.ecomm.design.compose.tile.impl.description.ProductPriceContent.Companion.invoke (ProductPriceContent.kt:67)");
                            }
                            Object x13 = M.x();
                            if (x13 == c0012a3) {
                                x13 = new hrd0(n, g, e);
                                M.R(x13);
                            }
                            hrd0 hrd0Var3 = (hrd0) x13;
                            ((zak0) hrd0Var3.a).setValue(n);
                            ((zak0) hrd0Var3.b).setValue(e);
                            ((zak0) hrd0Var3.c).setValue(new l5g(g));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            hrd0Var = hrd0Var3;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1506486199, i15, i17, "com.vk.ecomm.design.compose.tile.buildName (MarketProductTile.kt:226)");
                        }
                        String str4 = marketProductTileConfig.j;
                        if (str4 == null) {
                            M.K(-1616907477);
                            M.j();
                            i11 = 48;
                            vqd0Var = null;
                        } else {
                            M.K(-1616907476);
                            lg90 h = n3v0Var3.h(productStatusType, M, 0);
                            long p = n3v0Var3.p(0, M);
                            l5g c4 = n3v0Var3.c(productStatusType, M, 0);
                            i11 = 48;
                            String o2 = n3v0Var3.o(str4, marketProductTileConfig.h, marketProductTileConfig.c, M, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-988217368, 24640, i17, "com.vk.ecomm.design.compose.tile.impl.description.ProductNameContent.Companion.invoke (ProductNameContent.kt:78)");
                            }
                            Object x14 = M.x();
                            if (x14 == c0012a3) {
                                x14 = new vqd0(o2, h, p, c4);
                                str = o2;
                                lg90Var = h;
                                j = p;
                                l5gVar = c4;
                                M.R(x14);
                            } else {
                                str = o2;
                                lg90Var = h;
                                j = p;
                                l5gVar = c4;
                            }
                            vqd0 vqd0Var3 = (vqd0) x14;
                            ((zak0) vqd0Var3.d).setValue(str);
                            ((zak0) vqd0Var3.a).setValue(lg90Var);
                            ((zak0) vqd0Var3.b).setValue(new l5g(j));
                            ((zak0) vqd0Var3.c).setValue(l5gVar);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            vqd0Var = vqd0Var3;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        MarketProductTileConfig.c cVar2 = marketProductTileConfig.k;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(332761210, 0, i17, "com.vk.ecomm.design.compose.tile.buildOwner (MarketProductTile.kt:242)");
                        }
                        if (cVar2 == null) {
                            M.K(504824188);
                            M.j();
                            t490Var = null;
                        } else {
                            MarketProductTileConfig.d dVar2 = cVar2.b;
                            M.K(504824189);
                            String str5 = cVar2.a;
                            if (dVar2 == null) {
                                M.K(2059317002);
                                M.j();
                                i12 = 0;
                                a = null;
                            } else {
                                M.K(2059317003);
                                i12 = 0;
                                a = n3v0Var3.a(dVar2, M, 0);
                                M.j();
                            }
                            if (dVar2 == null) {
                                M.K(2059418310);
                                M.j();
                                l = null;
                            } else {
                                M.K(2059418311);
                                l = n3v0Var3.l(dVar2, M, i12);
                                M.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1189348086, 3136, i17, "com.vk.ecomm.design.compose.tile.impl.description.OwnerContent.Companion.invoke (OwnerContent.kt:66)");
                            }
                            Object x15 = M.x();
                            if (x15 == c0012a3) {
                                x15 = new t490(str5, l, a);
                                M.R(x15);
                            }
                            t490 t490Var3 = (t490) x15;
                            ((zak0) t490Var3.a).setValue(str5);
                            ((zak0) t490Var3.c).setValue(a);
                            ((zak0) t490Var3.b).setValue(l);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            t490Var = t490Var3;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        MarketProductTileConfig.g gVar = marketProductTileConfig.m;
                        boolean z11 = holdDescriptionSecondLineType == MarketProductTileConfig.HoldDescriptionSecondLineType.Rating;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(988559074, 0, i17, "com.vk.ecomm.design.compose.tile.buildRating (MarketProductTile.kt:253)");
                        }
                        if (gVar != null) {
                            M.K(817502195);
                            a2 = zxe0.a.a(gVar.a, 3072, 4, M, gVar.b);
                            M.j();
                        } else if (Boolean.valueOf(z11).equals(Boolean.TRUE)) {
                            M.K(817506870);
                            a2 = zxe0.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3510, 0, M, "");
                            M.j();
                        } else {
                            M.K(-426962341);
                            M.j();
                            zxe0Var = null;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            list = marketProductTileConfig.q;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1933379825, 0, i17, "com.vk.ecomm.design.compose.tile.buildProperties (MarketProductTile.kt:269)");
                            }
                            if (list != null) {
                                M.K(1807049883);
                                M.j();
                                y6e0Var = null;
                            } else {
                                M.K(1807049884);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1532829715, i11, i17, "com.vk.ecomm.design.compose.tile.impl.description.PropertiesContent.Companion.invoke (PropertiesContent.kt:52)");
                                }
                                Object x16 = M.x();
                                if (x16 == c0012a3) {
                                    x16 = new y6e0(list);
                                    M.R(x16);
                                }
                                y6e0 y6e0Var2 = (y6e0) x16;
                                ((zak0) y6e0Var2.a).setValue(new wow(list));
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                                y6e0Var = y6e0Var2;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(878417665, 1572864, i17, "com.vk.ecomm.design.compose.tile.impl.description.DescriptionContainer.Companion.invoke (DescriptionContainer.kt:62)");
                            }
                            x = M.x();
                            if (x != c0012a3) {
                                x = new v1m(hrd0Var, vqd0Var, t490Var, zxe0Var, y6e0Var);
                                hrd0Var2 = hrd0Var;
                                vqd0Var2 = vqd0Var;
                                t490Var2 = t490Var;
                                zxe0Var2 = zxe0Var;
                                M.R(x);
                            } else {
                                hrd0Var2 = hrd0Var;
                                vqd0Var2 = vqd0Var;
                                t490Var2 = t490Var;
                                zxe0Var2 = zxe0Var;
                            }
                            v1m v1mVar = (v1m) x;
                            ((zak0) v1mVar.a).setValue(hrd0Var2);
                            ((zak0) v1mVar.b).setValue(vqd0Var2);
                            ((zak0) v1mVar.c).setValue(t490Var2);
                            ((zak0) v1mVar.d).setValue(zxe0Var2);
                            ((zak0) v1mVar.f).setValue(holdDescriptionSecondLineType);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            v1mVar.a(ahn.E(aVar3, "product_description_container"), M, 6);
                            if (marketProductTileConfig.e) {
                                z2 = true;
                                M.K(-1240256541);
                            } else {
                                M.K(-1233965029);
                                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                    szw.a("invalid weight; must be greater than zero");
                                }
                                z2 = true;
                                f9t.e(new xpy(1.0f, true), M, 0);
                            }
                            M.j();
                            z3 = displayCtaButtonType != MarketProductTileConfig.DisplayCtaButtonType.BOTTOM ? z2 : false;
                            boolean z12 = i18 != 131072 ? z2 : false;
                            if (i15 != 4) {
                                z2 = false;
                            }
                            z4 = z12 | z2;
                            x2 = M.x();
                            if (!z4 || x2 == c0012a3) {
                                izsVar11 = izsVar9;
                                x2 = new yq1(11, izsVar11, marketProductTileConfig);
                                M.R(x2);
                            } else {
                                izsVar11 = izsVar9;
                            }
                            gzs gzsVar5 = (gzs) x2;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1088526814, 0, i17, "com.vk.ecomm.design.compose.tile.buildCtaButtons (MarketProductTile.kt:283)");
                            }
                            if (z3) {
                                M.K(1299976191);
                                M.j();
                                akkVar = null;
                            } else {
                                M.K(1299479045);
                                if (bVar == null) {
                                    M.K(1299499039);
                                    M.j();
                                    akkVar2 = null;
                                } else {
                                    MarketProductTileConfig.b bVar4 = bVar;
                                    MarketProductTileConfig.CtaButtonType ctaButtonType2 = bVar4.a;
                                    M.K(1299499040);
                                    akkVar2 = new akk(n3v0Var3.s(ctaButtonType2, bVar4.b, M, 0), n3v0Var3.i(ctaButtonType2, M, 0), n3v0Var3.q(ctaButtonType2, M, 0), n3v0Var3.j(ctaButtonType2, M, 0), bVar4.c, gzsVar5);
                                    M.j();
                                }
                                M.j();
                                akkVar = akkVar2;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (akkVar != null) {
                                M.K(-1233656270);
                                M.j();
                            } else {
                                M.K(-1563816017);
                                akkVar.a(ahn.E(txj0.f(aVar3, 1.0f), "product_cta_button"), M, 6);
                                M.j();
                                s3q0 s3q0Var = s3q0.a;
                            }
                            M.G();
                            aVar2 = marketProductTileConfig.o;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-438913821, 0, i17, "com.vk.ecomm.design.compose.tile.buildBadges (MarketProductTile.kt:299)");
                            }
                            if (aVar2 != null) {
                                M.K(-1801074586);
                                M.j();
                                wy5Var = null;
                            } else {
                                M.K(-1801074585);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1958583744, i11, i17, "com.vk.ecomm.design.compose.tile.impl.badges.BadgeContent.Companion.invoke (BadgeContent.kt:151)");
                                }
                                Object x17 = M.x();
                                if (x17 == c0012a3) {
                                    x17 = new wy5(aVar2);
                                    M.R(x17);
                                }
                                wy5Var = (wy5) x17;
                                ((zak0) wy5Var.a).setValue(aVar2);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (wy5Var != null) {
                                M.K(666916597);
                                M.j();
                            } else {
                                M.K(1545534092);
                                wy5Var.a(s200.H(ra8.a.b(aVar3, ty6Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
                                M.j();
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            M.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            pcoVar3 = pcoVar4;
                            izsVar5 = izsVar11;
                            q630Var2 = q630Var5;
                            izsVar6 = izsVar10;
                        }
                        zxe0Var = a2;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        list = marketProductTileConfig.q;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (list != null) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        x = M.x();
                        if (x != c0012a3) {
                        }
                        v1m v1mVar2 = (v1m) x;
                        ((zak0) v1mVar2.a).setValue(hrd0Var2);
                        ((zak0) v1mVar2.b).setValue(vqd0Var2);
                        ((zak0) v1mVar2.c).setValue(t490Var2);
                        ((zak0) v1mVar2.d).setValue(zxe0Var2);
                        ((zak0) v1mVar2.f).setValue(holdDescriptionSecondLineType);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        v1mVar2.a(ahn.E(aVar3, "product_description_container"), M, 6);
                        if (marketProductTileConfig.e) {
                        }
                        M.j();
                        if (displayCtaButtonType != MarketProductTileConfig.DisplayCtaButtonType.BOTTOM) {
                        }
                        if (i18 != 131072) {
                        }
                        if (i15 != 4) {
                        }
                        z4 = z12 | z2;
                        x2 = M.x();
                        if (z4) {
                        }
                        izsVar11 = izsVar9;
                        x2 = new yq1(11, izsVar11, marketProductTileConfig);
                        M.R(x2);
                        gzs gzsVar52 = (gzs) x2;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (z3) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (akkVar != null) {
                        }
                        M.G();
                        aVar2 = marketProductTileConfig.o;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (aVar2 != null) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (wy5Var != null) {
                        }
                        M.G();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        pcoVar3 = pcoVar4;
                        izsVar5 = izsVar11;
                        q630Var2 = q630Var5;
                        izsVar6 = izsVar10;
                    }
                    s = M.s();
                    if (s == null) {
                        s.d = new xc10(marketProductTileConfig, q630Var2, pcoVar3, izsVar, izsVar6, izsVar5, i, i2);
                        return;
                    }
                    return;
                }
                izsVar4 = izsVar2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i3 | 1572864;
                if (M.t(i7 & 1, (i7 & 599187) == 599186)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            pcoVar2 = pcoVar;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            izsVar4 = izsVar2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i3 | 1572864;
            if (M.t(i7 & 1, (i7 & 599187) == 599186)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        pcoVar2 = pcoVar;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        izsVar4 = izsVar2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i3 | 1572864;
        if (M.t(i7 & 1, (i7 & 599187) == 599186)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
