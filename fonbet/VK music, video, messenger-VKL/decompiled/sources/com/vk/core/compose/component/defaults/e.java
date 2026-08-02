package com.vk.core.compose.component.defaults;

import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.alb0;
import xsna.gub0;
import xsna.kqu0;
import xsna.rrv0;
import xsna.uog0;
import xsna.vog0;
import xsna.ylu0;

/* compiled from: VkContentBadgeDefaults.kt */
/* loaded from: classes17.dex */
public final class e {
    public static final uog0 a = vog0.b(kqu0.r);
    public static final uog0 b;
    public static final uog0 c;
    public static final uog0 d;
    public static final uog0 e;
    public static final uog0 f;

    /* compiled from: VkContentBadgeDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContentBadgeSize.values().length];
            try {
                iArr[ContentBadgeSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentBadgeSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentBadgeSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContentBadgeMode.values().length];
            try {
                iArr2[ContentBadgeMode.Secondary.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ContentBadgeMode.Outline.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ContentBadgeMode.Primary.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        float f2 = kqu0.a;
        float f3 = kqu0.h;
        b = vog0.b(f3);
        c = vog0.b(kqu0.s);
        d = vog0.b(f3);
        e = vog0.b(kqu0.t);
        f = vog0.b(f3);
    }

    public static long a(ContentBadgeAppearance contentBadgeAppearance, ContentBadgeMode contentBadgeMode, androidx.compose.runtime.a aVar, int i) {
        long a2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-26667950, i, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.contentColor (VkContentBadgeDefaults.kt:132)");
        }
        if (contentBadgeAppearance == ContentBadgeAppearance.Design.Accent) {
            aVar.K(141909677);
            int i2 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1330919252, i2, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getContentColorAccent (VkContentBadgeDefaults.kt:344)");
            }
            aVar.K(-1722219730);
            int i3 = a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
            if (i3 == 1) {
                a2 = gub0.a(aVar, -886834626, aVar).a;
                aVar.j();
            } else if (i3 == 2) {
                a2 = gub0.a(aVar, -886832354, aVar).a;
                aVar.j();
            } else {
                if (i3 != 3) {
                    throw alb0.c(-886839164, aVar);
                }
                a2 = gub0.a(aVar, -886837024, aVar).d;
                aVar.j();
            }
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Neutral) {
            aVar.K(141912142);
            int i4 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1681552787, i4, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getContentColorNeutral (VkContentBadgeDefaults.kt:362)");
            }
            aVar.K(1359884753);
            int i5 = a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
            if (i5 == 1) {
                a2 = gub0.a(aVar, -1064506568, aVar).m;
                aVar.j();
            } else if (i5 == 2) {
                a2 = gub0.a(aVar, -1064504262, aVar).p;
                aVar.j();
            } else {
                if (i5 != 3) {
                    throw alb0.c(-1064511103, aVar);
                }
                a2 = gub0.a(aVar, -1064508967, aVar).d;
                aVar.j();
            }
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Positive) {
            aVar.K(141914671);
            int i6 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-71661629, i6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getContentColorPositive (VkContentBadgeDefaults.kt:379)");
            }
            int i7 = a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
            if (i7 == 1) {
                aVar.K(-147339858);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = ylu0Var.q().e;
                aVar.j();
            } else if (i7 == 2) {
                aVar.K(-147337618);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = ylu0Var2.q().e;
                aVar.j();
            } else {
                if (i7 != 3) {
                    throw alb0.c(-147344215, aVar);
                }
                aVar.K(-147342193);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = ylu0Var3.getText().d;
                aVar.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Negative) {
            aVar.K(141917231);
            int i8 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(175020287, i8, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getContentColorNegative (VkContentBadgeDefaults.kt:388)");
            }
            int i9 = a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
            if (i9 == 1) {
                aVar.K(690780136);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = ylu0Var4.q().m;
                aVar.j();
            } else if (i9 == 2) {
                aVar.K(690782312);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = ylu0Var5.q().m;
                aVar.j();
            } else {
                if (i9 != 3) {
                    throw alb0.c(690775777, aVar);
                }
                aVar.K(690777803);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = ylu0Var6.getText().d;
                aVar.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Overlay) {
            aVar.K(141920382);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var7 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a2 = ylu0Var7.getText().d;
            aVar.j();
        } else if (contentBadgeAppearance instanceof ContentBadgeAppearance.a) {
            aVar.K(141922558);
            aVar.j();
            a2 = ((ContentBadgeAppearance.a) contentBadgeAppearance).c;
        } else {
            if (!(contentBadgeAppearance instanceof ContentBadgeAppearance.b)) {
                throw alb0.c(141908054, aVar);
            }
            aVar.K(141925346);
            a2 = ((ContentBadgeAppearance.b) contentBadgeAppearance).c.a(0, aVar);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }

    public static float b(ContentBadgeSize contentBadgeSize, boolean z, androidx.compose.runtime.a aVar, int i) {
        float f2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1982894265, i, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.iconSize (VkContentBadgeDefaults.kt:55)");
        }
        int i2 = a.$EnumSwitchMapping$0[contentBadgeSize.ordinal()];
        if (i2 == 1) {
            aVar.K(-1404085861);
            aVar.j();
            f2 = 12;
        } else if (i2 == 2) {
            aVar.K(-1404084492);
            int i3 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(693466537, i3, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getMediumIconSize (VkContentBadgeDefaults.kt:190)");
            }
            f2 = z ? 12 : 16;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            if (i2 != 3) {
                throw alb0.c(-1404087424, aVar);
            }
            aVar.K(-1404082381);
            int i4 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2058081121, i4, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getLargeIconSize (VkContentBadgeDefaults.kt:199)");
            }
            f2 = z ? 16 : 20;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }

    public static float c(ContentBadgeSize contentBadgeSize, int i) {
        float f2 = kqu0.r;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-309156611, i, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.innerItemSpacing (VkContentBadgeDefaults.kt:65)");
        }
        int i2 = a.$EnumSwitchMapping$0[contentBadgeSize.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }
}
