package com.vk.core.compose.component.defaults;

import com.vk.core.compose.component.defaults.BadgeAppearance;
import xsna.uog0;
import xsna.vog0;

/* compiled from: VkBadgeDefaults.kt */
/* loaded from: classes17.dex */
public final class d {
    public static final float a = 6;
    public static final uog0 b = vog0.a;

    /* compiled from: VkBadgeDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BadgeAppearance.Design.values().length];
            try {
                iArr[BadgeAppearance.Design.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeAppearance.Design.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeAppearance.Design.AccentGreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeAppearance.Design.AccentRed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeAppearance.Design.Contrast.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BadgeAppearance.LegoDesign.values().length];
            try {
                iArr2[BadgeAppearance.LegoDesign.High.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BadgeAppearance.LegoDesign.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BadgeAppearance.LegoDesign.Low.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
