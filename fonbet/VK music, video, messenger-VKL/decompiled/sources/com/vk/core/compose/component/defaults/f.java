package com.vk.core.compose.component.defaults;

import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.NoWhenBranchMatchedException;
import xsna.alb0;
import xsna.fou0;
import xsna.iyk0;
import xsna.rrv0;
import xsna.uog0;
import xsna.vog0;
import xsna.ylu0;

/* compiled from: VkCounterDefaults.kt */
/* loaded from: classes17.dex */
public final class f {
    public static final float a = 18;
    public static final float b = 24;
    public static final float c = 4;
    public static final float d = 6;
    public static final float e = 2;
    public static final uog0 f = vog0.a;
    public static final DecimalFormat g;
    public static final int h;

    /* compiled from: VkCounterDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CounterSize.values().length];
            try {
                iArr[CounterSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CounterSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CounterSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CounterMode.values().length];
            try {
                iArr2[CounterMode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CounterMode.Contrast.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CounterMode.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        g = decimalFormat;
        h = 8;
    }

    public static fou0 a(CounterMode counterMode, CounterAppearance counterAppearance, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        fou0 b2;
        androidx.compose.runtime.a aVar3;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1832164495, i, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.colors (VkCounterDefaults.kt:83)");
        }
        int i2 = a.$EnumSwitchMapping$1[counterMode.ordinal()];
        if (i2 == 1) {
            aVar.K(226517296);
            int i3 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1854878841, i3, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.primaryCounterColor (VkCounterDefaults.kt:152)");
            }
            aVar.K(353911072);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1516272196, i3, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getMilkshakePrimaryCounterColor (VkCounterDefaults.kt:241)");
            }
            if (counterAppearance == CounterAppearance.Design.Accent) {
                aVar.K(-1143660609);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getBackground().d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar;
                b2 = b(j, ylu0Var2.getText().e, aVar2, (i3 << 3) & 896);
                aVar.j();
            } else if (counterAppearance == CounterAppearance.Design.Neutral) {
                aVar.K(-1143653942);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var2 = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) aVar.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var3.getIcon().l;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar;
                b2 = b(j2, ylu0Var4.getText().d, aVar2, (i3 << 3) & 896);
                aVar.j();
            } else if (counterAppearance == CounterAppearance.Design.AccentGreen) {
                aVar.K(-1143647798);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var3 = rrv0.a;
                ylu0 ylu0Var5 = (ylu0) aVar.r(iyk0Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j3 = ylu0Var5.q().e;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) aVar.r(iyk0Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar;
                b2 = b(j3, ylu0Var6.getText().d, aVar2, (i3 << 3) & 896);
                aVar.j();
            } else if (counterAppearance == CounterAppearance.Design.AccentRed) {
                aVar.K(-1143641720);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var4 = rrv0.a;
                ylu0 ylu0Var7 = (ylu0) aVar.r(iyk0Var4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j4 = ylu0Var7.q().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var8 = (ylu0) aVar.r(iyk0Var4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar;
                b2 = b(j4, ylu0Var8.getText().d, aVar2, (i3 << 3) & 896);
                aVar.j();
            } else if (counterAppearance == CounterAppearance.Priority.High) {
                aVar.K(-1143635800);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var5 = rrv0.a;
                ylu0 ylu0Var9 = (ylu0) aVar.r(iyk0Var5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j5 = ylu0Var9.q().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var10 = (ylu0) aVar.r(iyk0Var5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar;
                b2 = b(j5, ylu0Var10.getText().d, aVar2, (i3 << 3) & 896);
                aVar.j();
            } else if (counterAppearance == CounterAppearance.Priority.Medium) {
                aVar.K(-1143629793);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var6 = rrv0.a;
                ylu0 ylu0Var11 = (ylu0) aVar.r(iyk0Var6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j6 = ylu0Var11.getBackground().d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var12 = (ylu0) aVar.r(iyk0Var6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar;
                b2 = b(j6, ylu0Var12.getText().e, aVar2, (i3 << 3) & 896);
                aVar.j();
            } else if (counterAppearance == CounterAppearance.Priority.Low) {
                aVar.K(-1143623190);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var7 = rrv0.a;
                ylu0 ylu0Var13 = (ylu0) aVar.r(iyk0Var7);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j7 = ylu0Var13.getIcon().l;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var14 = (ylu0) aVar.r(iyk0Var7);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar;
                b2 = b(j7, ylu0Var14.getText().d, aVar2, (i3 << 3) & 896);
                aVar2.j();
            } else {
                aVar2 = aVar;
                if (!(counterAppearance instanceof CounterAppearance.a)) {
                    throw alb0.c(-1143661242, aVar2);
                }
                aVar2.K(-1143617383);
                CounterAppearance.a aVar4 = (CounterAppearance.a) counterAppearance;
                b2 = b(aVar4.b, aVar4.c, aVar2, (i3 << 3) & 896);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
        } else if (i2 == 2) {
            androidx.compose.runtime.a aVar5 = aVar;
            aVar5.K(226519473);
            int i4 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(284060459, i4, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.contrastCounterColor (VkCounterDefaults.kt:161)");
            }
            aVar5.K(1359794939);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2104035434, i4, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getMilkshakeContrastCounterColor (VkCounterDefaults.kt:331)");
            }
            if (counterAppearance == CounterAppearance.Design.Accent) {
                aVar5.K(951551161);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var8 = rrv0.a;
                ylu0 ylu0Var15 = (ylu0) aVar5.r(iyk0Var8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j8 = ylu0Var15.getBackground().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var16 = (ylu0) aVar5.r(iyk0Var8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b2 = b(j8, ylu0Var16.getText().a, aVar5, (i4 << 3) & 896);
                aVar5.j();
            } else if (counterAppearance == CounterAppearance.Design.Neutral) {
                aVar5.K(951557979);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var9 = rrv0.a;
                ylu0 ylu0Var17 = (ylu0) aVar5.r(iyk0Var9);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j9 = ylu0Var17.getBackground().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var18 = (ylu0) aVar5.r(iyk0Var9);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b2 = b(j9, ylu0Var18.getText().s, aVar5, (i4 << 3) & 896);
                aVar5.j();
            } else if (counterAppearance == CounterAppearance.Design.AccentGreen) {
                aVar5.K(951564988);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var10 = rrv0.a;
                ylu0 ylu0Var19 = (ylu0) aVar5.r(iyk0Var10);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j10 = ylu0Var19.getBackground().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var20 = (ylu0) aVar5.r(iyk0Var10);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b2 = b(j10, ylu0Var20.q().e, aVar5, (i4 << 3) & 896);
                aVar5.j();
            } else if (counterAppearance == CounterAppearance.Design.AccentRed) {
                aVar5.K(951571962);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var11 = rrv0.a;
                ylu0 ylu0Var21 = (ylu0) aVar5.r(iyk0Var11);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j11 = ylu0Var21.getBackground().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var22 = (ylu0) aVar5.r(iyk0Var11);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b2 = b(j11, ylu0Var22.q().m, aVar5, (i4 << 3) & 896);
                aVar5.j();
            } else if (counterAppearance == CounterAppearance.Priority.High) {
                aVar5.K(951578778);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var12 = rrv0.a;
                ylu0 ylu0Var23 = (ylu0) aVar5.r(iyk0Var12);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j12 = ylu0Var23.getBackground().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var24 = (ylu0) aVar5.r(iyk0Var12);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b2 = b(j12, ylu0Var24.q().m, aVar5, (i4 << 3) & 896);
                aVar5.j();
            } else if (counterAppearance == CounterAppearance.Priority.Medium) {
                aVar5.K(951585657);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var13 = rrv0.a;
                ylu0 ylu0Var25 = (ylu0) aVar5.r(iyk0Var13);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j13 = ylu0Var25.getBackground().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var26 = (ylu0) aVar5.r(iyk0Var13);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b2 = b(j13, ylu0Var26.getText().a, aVar5, (i4 << 3) & 896);
                aVar5.j();
            } else if (counterAppearance == CounterAppearance.Priority.Low) {
                aVar5.K(951592411);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var14 = rrv0.a;
                ylu0 ylu0Var27 = (ylu0) aVar5.r(iyk0Var14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j14 = ylu0Var27.getBackground().j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var28 = (ylu0) aVar5.r(iyk0Var14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b2 = b(j14, ylu0Var28.getText().s, aVar5, (i4 << 3) & 896);
                aVar5.j();
            } else {
                if (!(counterAppearance instanceof CounterAppearance.a)) {
                    throw alb0.c(951550535, aVar5);
                }
                aVar5.K(951599071);
                CounterAppearance.a aVar6 = (CounterAppearance.a) counterAppearance;
                b2 = b(aVar6.b, aVar6.c, aVar5, (i4 << 3) & 896);
                aVar5 = aVar5;
                aVar5.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar5.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar5.j();
        } else {
            if (i2 != 3) {
                throw alb0.c(226515925, aVar);
            }
            aVar.K(226521681);
            int i5 = (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1088778203, i5, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.tertiaryCounterColor (VkCounterDefaults.kt:170)");
            }
            aVar.K(198660171);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1299317690, i5, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getMilkshakeTertiaryCounterColor (VkCounterDefaults.kt:421)");
            }
            if (counterAppearance == CounterAppearance.Design.Accent) {
                aVar.K(1191189859);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var15 = rrv0.a;
                ylu0 ylu0Var29 = (ylu0) aVar.r(iyk0Var15);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j15 = ylu0Var29.d().a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var30 = (ylu0) aVar.r(iyk0Var15);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3 = aVar;
                b2 = b(j15, ylu0Var30.getText().a, aVar3, (i5 << 3) & 896);
                aVar3.j();
            } else {
                aVar3 = aVar;
                if (counterAppearance == CounterAppearance.Design.Neutral) {
                    aVar3.K(1191196485);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var16 = rrv0.a;
                    ylu0 ylu0Var31 = (ylu0) aVar3.r(iyk0Var16);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j16 = ylu0Var31.d().a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var32 = (ylu0) aVar3.r(iyk0Var16);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b2 = b(j16, ylu0Var32.getText().s, aVar3, (i5 << 3) & 896);
                    aVar3.j();
                } else if (counterAppearance == CounterAppearance.Design.AccentGreen) {
                    aVar3.K(1191203302);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var17 = rrv0.a;
                    ylu0 ylu0Var33 = (ylu0) aVar3.r(iyk0Var17);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j17 = ylu0Var33.d().a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var34 = (ylu0) aVar3.r(iyk0Var17);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b2 = b(j17, ylu0Var34.q().e, aVar3, (i5 << 3) & 896);
                    aVar3.j();
                } else if (counterAppearance == CounterAppearance.Design.AccentRed) {
                    aVar3.K(1191210084);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var18 = rrv0.a;
                    ylu0 ylu0Var35 = (ylu0) aVar3.r(iyk0Var18);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j18 = ylu0Var35.d().a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var36 = (ylu0) aVar3.r(iyk0Var18);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b2 = b(j18, ylu0Var36.q().m, aVar3, (i5 << 3) & 896);
                    aVar3.j();
                } else if (counterAppearance == CounterAppearance.Priority.High) {
                    aVar3.K(1191216708);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var19 = rrv0.a;
                    ylu0 ylu0Var37 = (ylu0) aVar3.r(iyk0Var19);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j19 = ylu0Var37.d().a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var38 = (ylu0) aVar3.r(iyk0Var19);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b2 = b(j19, ylu0Var38.q().m, aVar3, (i5 << 3) & 896);
                    aVar3.j();
                } else if (counterAppearance == CounterAppearance.Priority.Medium) {
                    aVar3.K(1191223395);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var20 = rrv0.a;
                    ylu0 ylu0Var39 = (ylu0) aVar3.r(iyk0Var20);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j20 = ylu0Var39.d().a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var40 = (ylu0) aVar3.r(iyk0Var20);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b2 = b(j20, ylu0Var40.getText().a, aVar3, (i5 << 3) & 896);
                    aVar3.j();
                } else if (counterAppearance == CounterAppearance.Priority.Low) {
                    aVar3.K(1191229957);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var21 = rrv0.a;
                    ylu0 ylu0Var41 = (ylu0) aVar3.r(iyk0Var21);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j21 = ylu0Var41.d().a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var42 = (ylu0) aVar3.r(iyk0Var21);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b2 = b(j21, ylu0Var42.getText().s, aVar3, (i5 << 3) & 896);
                    aVar3.j();
                } else {
                    if (!(counterAppearance instanceof CounterAppearance.a)) {
                        throw alb0.c(1191189197, aVar3);
                    }
                    aVar3.K(1191236431);
                    CounterAppearance.a aVar7 = (CounterAppearance.a) counterAppearance;
                    b2 = b(aVar7.b, aVar7.c, aVar3, (i5 << 3) & 896);
                    aVar3 = aVar3;
                    aVar3.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static fou0 b(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1760054410, i, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.colors (VkCounterDefaults.kt:95)");
        }
        fou0 fou0Var = new fou0(j, j2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return fou0Var;
    }

    public static float c(CounterSize counterSize, androidx.compose.runtime.a aVar, int i) {
        float f2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(719699180, i, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.size (VkCounterDefaults.kt:69)");
        }
        int i2 = a.$EnumSwitchMapping$0[counterSize.ordinal()];
        if (i2 != 1) {
            f2 = b;
            if (i2 == 2) {
                aVar.K(141182363);
                int i3 = (i >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(291493810, i3, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getMediumSize (VkCounterDefaults.kt:179)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else {
                if (i2 != 3) {
                    throw alb0.c(141179840, aVar);
                }
                aVar.K(141183802);
                int i4 = (i >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-642256132, i4, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getLargeSize (VkCounterDefaults.kt:188)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
        } else {
            aVar.K(141181077);
            aVar.j();
            f2 = a;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }

    public static float d(CounterSize counterSize, CounterMode counterMode, androidx.compose.runtime.a aVar, int i, int i2) {
        float f2;
        if ((i2 & 2) != 0) {
            counterMode = CounterMode.Primary;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(480438306, i, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.textHorizontalPadding (VkCounterDefaults.kt:103)");
        }
        int i3 = a.$EnumSwitchMapping$1[counterMode.ordinal()];
        if (i3 == 1 || i3 == 2) {
            aVar.K(2139718564);
            int i4 = (i & 14) | ((i >> 3) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1049306166, i4, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.defaultTextHorizontalPadding (VkCounterDefaults.kt:134)");
            }
            int i5 = a.$EnumSwitchMapping$0[counterSize.ordinal()];
            if (i5 != 1) {
                float f3 = d;
                if (i5 == 2) {
                    aVar.K(934096177);
                    int i6 = (i4 >> 3) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(421205588, i6, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getDefaultTextHorizontalPaddingMedium (VkCounterDefaults.kt:143)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                } else {
                    if (i5 != 3) {
                        throw alb0.c(934092912, aVar);
                    }
                    aVar.K(934098513);
                    int i7 = (i4 >> 3) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(421205588, i7, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getDefaultTextHorizontalPaddingMedium (VkCounterDefaults.kt:143)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                }
                f2 = f3;
            } else {
                aVar.K(934094212);
                aVar.j();
                f2 = c;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            if (i3 != 3) {
                throw alb0.c(2139716042, aVar);
            }
            aVar.K(2139720868);
            aVar.j();
            f2 = 0;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }

    public static float e(CounterMode counterMode, int i, int i2) {
        float f2;
        if ((i2 & 1) != 0) {
            counterMode = CounterMode.Primary;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1052632321, i, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.textVerticalPadding (VkCounterDefaults.kt:112)");
        }
        int i3 = a.$EnumSwitchMapping$1[counterMode.ordinal()];
        if (i3 == 1 || i3 == 2) {
            f2 = e;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 0;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }
}
