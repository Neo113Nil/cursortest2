package com.vk.core.view.components.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.k;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.banner.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.blk;
import xsna.d16;
import xsna.e16;
import xsna.fko;
import xsna.gko;
import xsna.gzs;
import xsna.lg90;
import xsna.q630;
import xsna.rpo0;
import xsna.s3q0;
import xsna.s6v0;
import xsna.tp8;
import xsna.vua0;
import xsna.wh50;
import xsna.xl20;
import xsna.xzy;
import xsna.y7g;
import xsna.yfi0;
import xsna.z06;
import xsna.zak0;
import xsna.zp8;

/* compiled from: VkNotificationBanner.kt */
/* loaded from: classes17.dex */
public class VkNotificationBanner extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;

    /* compiled from: VkNotificationBanner.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkBanner$Notification$Appearance.values().length];
            try {
                iArr[VkBanner$Notification$Appearance.Neutral.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkBanner$Notification$Appearance.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkBanner$Notification$Appearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkBanner$Notification$Appearance.Positive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkNotificationBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static zp8 B(VkBanner.c cVar, androidx.compose.runtime.a aVar, int i) {
        lg90 a2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2090403933, i, -1, "com.vk.core.view.components.banner.VkNotificationBanner.buildMiddleButton (VkNotificationBanner.kt:116)");
        }
        zp8 zp8Var = null;
        if (cVar != null) {
            VkBanner.c.a aVar2 = cVar.f;
            aVar.K(1802365235);
            String J = blk.J(cVar.a, aVar);
            ButtonSize b = tp8.b(cVar.e);
            ButtonStyle c = tp8.c(cVar.c);
            ButtonAppearance a3 = tp8.a(cVar.d);
            gzs<s3q0> gzsVar = cVar.b;
            gko gkoVar = aVar2 != null ? aVar2.a : null;
            if (gkoVar == null) {
                aVar.K(1802651891);
                aVar.j();
                a2 = null;
            } else {
                aVar.K(1166528718);
                a2 = fko.a(gkoVar, aVar);
                aVar.j();
            }
            aVar.K(1802710574);
            aVar.j();
            aVar.K(1802773814);
            aVar.j();
            aVar.K(1802871123);
            aVar.j();
            aVar.K(1802945678);
            aVar.j();
            aVar.K(1803024790);
            aVar.j();
            String I = blk.I(null, aVar);
            SemanticsConfiguration semanticsConfiguration = cVar.g;
            zp8Var = d16.a.C2697a.a(c, a3, b, J, a2, null, null, null, null, null, I, semanticsConfiguration == null ? null : semanticsConfiguration, gzsVar, aVar, 134250496, 24576, 0);
            aVar.j();
        } else {
            aVar.K(1803194298);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return zp8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
    @Override // xsna.rpo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i, androidx.compose.runtime.a aVar) {
        Banner$Notification$Appearance banner$Notification$Appearance;
        xzy xzyVar;
        z06 z06Var;
        z06 a2;
        VkBanner.e middle;
        androidx.compose.runtime.a aVar2 = aVar;
        aVar2.K(1769962294);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1769962294, 8, -1, "com.vk.core.view.components.banner.VkNotificationBanner.ThemedContent (VkNotificationBanner.kt:58)");
        }
        SemanticsConfiguration m86getSemanticsConfigurationtn9DF0s = m86getSemanticsConfigurationtn9DF0s();
        if (m86getSemanticsConfigurationtn9DF0s == null) {
            m86getSemanticsConfigurationtn9DF0s = null;
        }
        q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, m86getSemanticsConfigurationtn9DF0s);
        int i2 = a.$EnumSwitchMapping$0[getAppearance().ordinal()];
        if (i2 == 1) {
            banner$Notification$Appearance = Banner$Notification$Appearance.Neutral;
        } else if (i2 == 2) {
            banner$Notification$Appearance = Banner$Notification$Appearance.Warning;
        } else if (i2 == 3) {
            banner$Notification$Appearance = Banner$Notification$Appearance.Negative;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            banner$Notification$Appearance = Banner$Notification$Appearance.Positive;
        }
        Banner$Notification$Appearance banner$Notification$Appearance2 = banner$Notification$Appearance;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1677530230, 8, -1, "com.vk.core.view.components.banner.VkNotificationBanner.buildLeft (VkNotificationBanner.kt:75)");
        }
        c left = getLeft();
        if (left instanceof c.a) {
            aVar2.K(-1493811808);
            c.a aVar3 = (c.a) left;
            xzy a3 = e16.a(fko.a(aVar3.a, aVar2), y7g.a(aVar3.b, aVar2), vua0.F(null, aVar2), blk.I(null, aVar2), null, aVar2, 0);
            aVar2.j();
            xzyVar = a3;
        } else {
            aVar2.K(936790099);
            aVar2.j();
            xzyVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(148024300, 8, -1, "com.vk.core.view.components.banner.VkNotificationBanner.buildRight (VkNotificationBanner.kt:88)");
        }
        VkBanner.a after = getAfter();
        if (after instanceof VkBanner.a.C0804a) {
            aVar2.K(517434867);
            a2 = z06.a.C4145a.a(((VkBanner.a.C0804a) after).a, blk.I(null, aVar2), null, aVar2, 3072, 0);
            aVar2.j();
        } else {
            if (!(after instanceof VkBanner.a.b)) {
                aVar2.K(-1138951919);
                aVar2.j();
                z06Var = null;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1743385542, 72, -1, "com.vk.core.view.components.banner.VkNotificationBanner.buildMiddle (VkNotificationBanner.kt:105)");
                }
                VkBanner.e middle2 = getMiddle();
                String I = blk.I(middle2 == null ? middle2.a : null, aVar2);
                VkBanner.e middle3 = getMiddle();
                String I2 = blk.I(middle3 == null ? middle3.b : null, aVar2);
                VkBanner.e middle4 = getMiddle();
                d16.c a4 = com.vk.core.view.components.banner.a.a(middle4 == null ? middle4.c : null, aVar2);
                middle = getMiddle();
                if (middle != null || (r3 = middle.h) == null) {
                    SemanticsConfiguration semanticsConfiguration = null;
                }
                VkBanner.e middle5 = getMiddle();
                zp8 B = B(middle5 == null ? middle5.d : null, aVar2, 64);
                VkBanner.e middle6 = getMiddle();
                zp8 B2 = B(middle6 == null ? middle6.e : null, aVar2, 64);
                VkBanner.e middle7 = getMiddle();
                xl20 a5 = d16.b.a(I, I2, a4, B, B2, null, middle7 != null ? middle7.g : null, semanticsConfiguration, aVar, 100663296, 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s6v0.a(a5, banner$Notification$Appearance2, b, xzyVar, z06Var, null, getOnClick(), aVar, 0, 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            aVar2.K(517442195);
            VkBanner.a.b bVar = (VkBanner.a.b) after;
            gzs<s3q0> gzsVar = bVar.a;
            String I3 = blk.I(bVar.b, aVar2);
            SemanticsConfiguration semanticsConfiguration2 = bVar.c;
            if (semanticsConfiguration2 == null) {
                semanticsConfiguration2 = null;
            }
            a2 = z06.b.a.a(gzsVar, I3, semanticsConfiguration2, null, null, null, aVar, 1572864, 56);
            aVar2 = aVar;
            aVar2.j();
        }
        z06Var = a2;
        if (androidx.compose.runtime.b.d()) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        VkBanner.e middle22 = getMiddle();
        String I4 = blk.I(middle22 == null ? middle22.a : null, aVar2);
        VkBanner.e middle32 = getMiddle();
        String I22 = blk.I(middle32 == null ? middle32.b : null, aVar2);
        VkBanner.e middle42 = getMiddle();
        d16.c a42 = com.vk.core.view.components.banner.a.a(middle42 == null ? middle42.c : null, aVar2);
        middle = getMiddle();
        if (middle != null) {
        }
        SemanticsConfiguration semanticsConfiguration3 = null;
        VkBanner.e middle52 = getMiddle();
        zp8 B3 = B(middle52 == null ? middle52.d : null, aVar2, 64);
        VkBanner.e middle62 = getMiddle();
        zp8 B22 = B(middle62 == null ? middle62.e : null, aVar2, 64);
        VkBanner.e middle72 = getMiddle();
        xl20 a52 = d16.b.a(I4, I22, a42, B3, B22, null, middle72 != null ? middle72.g : null, semanticsConfiguration3, aVar, 100663296, 32);
        if (androidx.compose.runtime.b.d()) {
        }
        s6v0.a(a52, banner$Notification$Appearance2, b, xzyVar, z06Var, null, getOnClick(), aVar, 0, 32);
        if (androidx.compose.runtime.b.d()) {
        }
        aVar.j();
    }

    public final VkBanner.a getAfter() {
        return (VkBanner.a) ((zak0) this.o).getValue();
    }

    public final VkBanner$Notification$Appearance getAppearance() {
        return (VkBanner$Notification$Appearance) ((zak0) this.m).getValue();
    }

    @Override // android.view.View
    public final c getLeft() {
        return (c) ((zak0) this.n).getValue();
    }

    public final VkBanner.e getMiddle() {
        return (VkBanner.e) ((zak0) this.p).getValue();
    }

    public final gzs<s3q0> getOnClick() {
        return (gzs) ((zak0) this.q).getValue();
    }

    /* renamed from: getSemanticsConfiguration-tn9DF0s, reason: not valid java name */
    public final SemanticsConfiguration m86getSemanticsConfigurationtn9DF0s() {
        yfi0 yfi0Var = (yfi0) ((zak0) this.r).getValue();
        if (yfi0Var != null) {
            return yfi0Var.a;
        }
        return null;
    }

    public final void setAfter(VkBanner.a aVar) {
        ((zak0) this.o).setValue(aVar);
    }

    public final void setAppearance(VkBanner$Notification$Appearance vkBanner$Notification$Appearance) {
        ((zak0) this.m).setValue(vkBanner$Notification$Appearance);
    }

    public final void setLeft(c cVar) {
        ((zak0) this.n).setValue(cVar);
    }

    public final void setMiddle(VkBanner.e eVar) {
        ((zak0) this.p).setValue(eVar);
    }

    public final void setOnClick(gzs<s3q0> gzsVar) {
        ((zak0) this.q).setValue(gzsVar);
    }

    /* renamed from: setSemanticsConfiguration-lkKuBUQ, reason: not valid java name */
    public final void m87setSemanticsConfigurationlkKuBUQ(SemanticsConfiguration semanticsConfiguration) {
        ((zak0) this.r).setValue(semanticsConfiguration != null ? new yfi0(semanticsConfiguration) : null);
    }

    public VkNotificationBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.m = k.b(VkBanner$Notification$Appearance.Neutral);
        this.n = k.b(null);
        this.o = k.b(null);
        this.p = k.b(null);
        this.q = k.b(null);
        this.r = k.b(null);
    }
}
