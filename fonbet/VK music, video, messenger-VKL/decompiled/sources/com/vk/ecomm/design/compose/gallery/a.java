package com.vk.ecomm.design.compose.gallery;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import com.vk.toggle.features.SmbFeatures;
import com.vkontakte.android.R;
import java.util.List;
import xsna.a0t;
import xsna.aa90;
import xsna.alb0;
import xsna.azl;
import xsna.bap;
import xsna.cp10;
import xsna.cri;
import xsna.d6g;
import xsna.dt1;
import xsna.f5h0;
import xsna.f870;
import xsna.fwu0;
import xsna.gzs;
import xsna.hr80;
import xsna.ir;
import xsna.ixj0;
import xsna.iyk0;
import xsna.izs;
import xsna.ja8;
import xsna.jqh;
import xsna.jwx;
import xsna.k9q0;
import xsna.kai;
import xsna.kb10;
import xsna.kqu0;
import xsna.l52;
import xsna.lb10;
import xsna.lg90;
import xsna.n34;
import xsna.nb90;
import xsna.ojc;
import xsna.pg90;
import xsna.ps7;
import xsna.pzu0;
import xsna.q630;
import xsna.qa8;
import xsna.qow;
import xsna.qri;
import xsna.qzu0;
import xsna.ra8;
import xsna.rb10;
import xsna.rc90;
import xsna.rrv0;
import xsna.s200;
import xsna.s910;
import xsna.sb10;
import xsna.sg50;
import xsna.sua;
import xsna.sy90;
import xsna.txj0;
import xsna.ty6;
import xsna.ua8;
import xsna.ufk;
import xsna.uvi;
import xsna.vcl0;
import xsna.vog0;
import xsna.wkj;
import xsna.wlb0;
import xsna.wzs;
import xsna.yjl;
import xsna.ylu0;
import xsna.yqv0;
import xsna.yzs;
import xsna.zzs;

/* compiled from: MarketProductGallery.kt */
/* loaded from: classes18.dex */
public final class a {
    public static final void a(final List list, final int i, final izs izsVar, final wzs wzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-1350023990);
        int i3 = (M.J(list) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(wzsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (b.d()) {
                b.f(-1350023990, i3, -1, "com.vk.ecomm.design.compose.gallery.MarketProductGallery (MarketProductGallery.kt:68)");
            }
            ua8.a(sua.d(1.0f, txj0.f(q630Var, 1.0f), false), null, false, kai.c(-1788569056, new yzs() { // from class: xsna.ib10
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1788569056, intValue, -1, "com.vk.ecomm.design.compose.gallery.MarketProductGallery.<anonymous> (MarketProductGallery.kt:74)");
                        }
                        int i4 = o6j.i(va8Var.f());
                        int j = o6j.j(va8Var.f());
                        int i5 = intValue;
                        List list2 = list;
                        int size = list2.size();
                        q630.a aVar3 = q630.a.a;
                        wzs wzsVar2 = wzsVar;
                        if (size > 1) {
                            aVar2.K(103683494);
                            com.vk.ecomm.design.compose.gallery.a.f(va8Var, list2, wzsVar2, i, izsVar, (j & 4294967295L) | (i4 << 32), txj0.d(aVar3, 1.0f), aVar2, (i5 & 14) | 1572864);
                            aVar2.j();
                        } else if (list2.size() == 1) {
                            aVar2.K(104094492);
                            ProductGalleryItem productGalleryItem = (ProductGalleryItem) j5g.Y(new wow(list2));
                            boolean J = aVar2.J(wzsVar2) | aVar2.J(productGalleryItem);
                            Object x = aVar2.x();
                            if (J || x == a.C0011a.a) {
                                x = new com.vk.movika.sdk.base.ui.z(8, wzsVar2, productGalleryItem);
                                aVar2.R(x);
                            }
                            com.vk.ecomm.design.compose.gallery.a.b(productGalleryItem, (gzs) x, (i4 << 32) | (j & 4294967295L), true, txj0.d(aVar3, 1.0f), aVar2, 27648);
                            aVar2.j();
                        } else {
                            aVar2.K(-827912316);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new lb10(list, i, izsVar, wzsVar, q630Var, i2);
        }
    }

    public static final void b(final ProductGalleryItem productGalleryItem, final gzs gzsVar, final long j, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        qow qowVar;
        char c;
        final d6g d6gVar;
        androidx.compose.runtime.a M = aVar.M(1339084877);
        int i2 = i | (M.J(productGalleryItem) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.p(j) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (b.d()) {
                b.f(1339084877, i2, -1, "com.vk.ecomm.design.compose.gallery.ProductGalleryImage (MarketProductGallery.kt:187)");
            }
            ProductGalleryItem.a aVar2 = productGalleryItem.c;
            Image image = productGalleryItem.a;
            final boolean z2 = aVar2 instanceof ProductGalleryItem.a.b;
            Object obj = a.C0011a.a;
            if (z2) {
                M.K(1021625851);
                Object x = M.x();
                if (x == obj) {
                    qow qowVar2 = new qow(new jwx(2, 32));
                    M.R(qowVar2);
                    x = qowVar2;
                }
                T t = ((qow) x).a;
                M.j();
                qowVar = new qow(t);
            } else {
                M.K(1021811169);
                M.j();
                qowVar = null;
            }
            if (z2) {
                c = ' ';
                M.K(1021883554);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                long j2 = ylu0Var.j().a;
                boolean p = M.p(j2);
                Object x2 = M.x();
                if (p || x2 == obj) {
                    x2 = l52.a(new PorterDuffColorFilter(f870.H(j2), PorterDuff.Mode.SRC_OVER));
                    M.R(x2);
                }
                M.j();
                d6gVar = (d6g) x2;
            } else {
                c = ' ';
                M.K(1022185153);
                M.j();
                d6gVar = null;
            }
            boolean z3 = (i2 & 14) == 4;
            int i3 = i2 & 896;
            boolean z4 = z3 | (i3 == 256);
            Object x3 = M.x();
            if (z4 || x3 == obj) {
                x3 = z2 ? (ImageSize) ixj0.c(image.b, ((int) (j >> c)) / 3, ((int) (j & 4294967295L)) / 3) : (ImageSize) ixj0.c(image.b, (int) (j >> c), (int) (j & 4294967295L));
                M.R(x3);
            }
            final ImageSize imageSize = (ImageSize) x3;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var2.getImage().b, e.a);
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = ir.h(M);
            }
            q630 b = ojc.b(m, (sg50) x4, null, false, null, gzsVar, 28);
            String str = imageSize != null ? imageSize.d.d : null;
            boolean y = M.y(imageSize) | (i3 == 256) | M.l(z2);
            Object x5 = M.x();
            if (y || x5 == obj) {
                izs izsVar = new izs() { // from class: xsna.ob10
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        ojt ojtVar = (ojt) obj2;
                        ImageSize imageSize2 = ImageSize.this;
                        f5h0.d dVar = f5h0.f.a;
                        if (imageSize2 != null) {
                            int i4 = (int) (j >> 32);
                            if (!z2) {
                                boolean z5 = z;
                                f5h0.i iVar = f5h0.i.a;
                                if (!z5) {
                                    com.vk.dto.common.im.Image image2 = imageSize2.d;
                                    int i5 = image2.b;
                                    if (i5 > image2.c) {
                                        if (i5 >= i4) {
                                            dVar = f5h0.g.a;
                                        }
                                    }
                                }
                                dVar = iVar;
                            }
                        }
                        ojtVar.l = dVar;
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x5 = izsVar;
            }
            fwu0.c(b, null, str, null, null, (izs) x5, qowVar, kai.c(1595519390, new a0t() { // from class: xsna.pb10
                @Override // xsna.a0t
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i4;
                    qa8 qa8Var = (qa8) obj2;
                    lg90 lg90Var = (lg90) obj4;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    if ((intValue & 6) == 0) {
                        i4 = (aVar3.J(qa8Var) ? 4 : 2) | intValue;
                    } else {
                        i4 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i4 |= (intValue & 512) == 0 ? aVar3.J(lg90Var) : aVar3.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar3.t(i4 & 1, (i4 & 1155) != 1154)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1595519390, i4, -1, "com.vk.ecomm.design.compose.gallery.ProductGalleryImage.<anonymous> (MarketProductGallery.kt:239)");
                        }
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.f;
                        q630.a aVar4 = q630.a.a;
                        vjw.a(lg90Var, null, qa8Var.b(aVar4, ty6Var), ty6Var, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6g.this, aVar3, 27704 | ((i4 >> 6) & 14), 32);
                        ProductGalleryItem productGalleryItem2 = productGalleryItem;
                        if (productGalleryItem2.c != null) {
                            aVar3.K(-284560375);
                            com.vk.ecomm.design.compose.gallery.a.c(productGalleryItem2.c, qa8Var.b(aVar4, ty6Var), aVar3, 0);
                        } else {
                            aVar3.K(-292657916);
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, 154);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(gzsVar, j, z, q630Var, i) { // from class: xsna.qb10
                public final /* synthetic */ gzs c;
                public final /* synthetic */ long d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(27649);
                    com.vk.ecomm.design.compose.gallery.a.b(ProductGalleryItem.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(ProductGalleryItem.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1401045153);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-1401045153, i2, -1, "com.vk.ecomm.design.compose.gallery.ProductGalleryImageOverlay (MarketProductGallery.kt:263)");
            }
            if (aVar instanceof ProductGalleryItem.a.C0934a) {
                M.K(-43769985);
                d(q630Var, M, (i2 >> 3) & 14);
                M.j();
            } else {
                if (!(aVar instanceof ProductGalleryItem.a.b)) {
                    throw alb0.c(-2079623669, M);
                }
                M.K(-43614985);
                e((ProductGalleryItem.a.b) aVar, q630Var, M, i2 & 112);
                M.j();
            }
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ps7(aVar, q630Var, i, 3);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1170382478);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-1170382478, i2, -1, "com.vk.ecomm.design.compose.gallery.ProductGalleryPlayButton (MarketProductGallery.kt:283)");
            }
            q630 q = txj0.q(q630Var, 64);
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (b.d()) {
                b.e();
            }
            q630 m = hr80.m(q, ylu0Var.j().a, vog0.a);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            qzu0.a.getClass();
            if (b.d()) {
                b.f(524684162, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Play32> (VkIcons.kt:8890)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_play_32, 0, M);
            if (b.d()) {
                b.e();
            }
            q630 b = ra8.a.b(q630.a.a, ty6Var);
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (b.d()) {
                b.e();
            }
            pzu0.b(a, null, b, ylu0Var2.getIcon().c, M, 56, 0);
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new kb10(q630Var, i, 0);
        }
    }

    public static final void e(ProductGalleryItem.a.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1493573650);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-1493573650, i2, -1, "com.vk.ecomm.design.compose.gallery.ProductGalleryRestriction (MarketProductGallery.kt:307)");
            }
            q630 F = s200.F(kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            dt1.a.getClass();
            c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            qzu0.a.getClass();
            pzu0.b(qzu0.g0(M), null, null, wlb0.h(M).getIcon().c, M, 56, 4);
            String str = bVar.a;
            if (str == null) {
                M.K(136691295);
                M.j();
                aVar2 = M;
            } else {
                aVar2 = M;
                yqv0.c(str, null, vcl0.a(M, 136691296, M).c, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).J, aVar2, 0, 0, 8122);
                aVar2.j();
            }
            aVar2.G();
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new jqh(bVar, q630Var, i, 3);
        }
    }

    public static final void f(final qa8 qa8Var, final List list, final wzs wzsVar, final int i, final izs izsVar, final long j, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        q630 q630Var2;
        yjl yjlVar;
        androidx.compose.runtime.a M = aVar.M(728963928);
        if ((i2 & 6) == 0) {
            i3 = (M.J(qa8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(wzsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.p(j) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (b.d()) {
                b.f(728963928, i3, -1, "com.vk.ecomm.design.compose.gallery.ProductGallerySlider (MarketProductGallery.kt:117)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_CARD_PARAMS;
                smbFeatures.getClass();
                x = Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                SmbFeatures smbFeatures2 = SmbFeatures.PRODUCT_CARD_PARAMS;
                smbFeatures2.getClass();
                x2 = Float.valueOf(com.vk.toggle.b.A.a(smbFeatures2) ? 0.75f : 0.8f);
                M.R(x2);
            }
            float floatValue = ((Number) x2).floatValue();
            boolean z = (i3 & 112) == 32;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new ufk(list, 13);
                M.R(x3);
            }
            yjl b = rc90.b(0, (gzs) x3, M, 0, 3);
            nb90.a(b, q630Var2, null, new aa90.b(((azl) M.r(uvi.h)).j1((int) (j >> 32)) * floatValue), 0, kqu0.q, null, null, false, null, null, null, null, kai.c(1976011255, new zzs() { // from class: xsna.mb10
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    final int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1976011255, intValue2, -1, "com.vk.ecomm.design.compose.gallery.ProductGallerySlider.<anonymous> (MarketProductGallery.kt:141)");
                    }
                    final ProductGalleryItem productGalleryItem = (ProductGalleryItem) list.get(intValue);
                    final wzs wzsVar2 = wzsVar;
                    boolean J = ((((intValue2 & 112) ^ 48) > 32 && aVar2.o(intValue)) || (intValue2 & 48) == 32) | aVar2.J(wzsVar2) | aVar2.J(productGalleryItem);
                    Object x4 = aVar2.x();
                    if (J || x4 == a.C0011a.a) {
                        x4 = new gzs() { // from class: xsna.jb10
                            @Override // xsna.gzs
                            public final Object invoke() {
                                wzs.this.invoke(Integer.valueOf(intValue), productGalleryItem.b);
                                return s3q0.a;
                            }
                        };
                        aVar2.R(x4);
                    }
                    com.vk.ecomm.design.compose.gallery.a.b(productGalleryItem, (gzs) x4, j, false, txj0.d(q630.a.a, 1.0f), aVar2, 27648);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, (i3 >> 15) & 112, 24576, 16340);
            M = M;
            if (booleanValue) {
                yjlVar = b;
                M.K(1205658314);
            } else {
                M.K(1211002900);
                int o = b.o();
                int k = b.k();
                dt1.a.getClass();
                yjlVar = b;
                s910.a(o, k, s200.H(qa8Var.b(q630.a.a, dt1.a.i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 7), null, M, 0, 8);
            }
            M.j();
            Integer valueOf = Integer.valueOf(i);
            boolean J = M.J(yjlVar) | ((i3 & 7168) == 2048);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new rb10(yjlVar, i, null);
                M.R(x4);
            }
            bap.g(valueOf, (wzs) x4, M, (i3 >> 9) & 14);
            boolean J2 = M.J(yjlVar) | ((i3 & 57344) == 16384);
            Object x5 = M.x();
            if (J2 || x5 == c0012a) {
                x5 = new sb10(yjlVar, izsVar, null);
                M.R(x5);
            }
            bap.g(yjlVar, (wzs) x5, M, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nb10
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.ecomm.design.compose.gallery.a.f(qa8.this, list, wzsVar, i, izsVar, j, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
