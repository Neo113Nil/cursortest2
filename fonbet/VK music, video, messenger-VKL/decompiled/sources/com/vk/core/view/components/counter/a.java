package com.vk.core.view.components.counter;

import android.content.Context;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.hbh0;

/* compiled from: Counter.kt */
/* loaded from: classes17.dex */
public final class a {

    /* compiled from: Counter.kt */
    /* renamed from: com.vk.core.view.components.counter.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0836a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkCounter.Size.values().length];
            try {
                iArr[VkCounter.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkCounter.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkCounter.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkCounter.Mode.values().length];
            try {
                iArr2[VkCounter.Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkCounter.Mode.Contrast.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkCounter.Mode.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static int a(VkCounter.Mode mode, VkCounter.CounterAppearance counterAppearance) {
        int i = C0836a.$EnumSwitchMapping$1[mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return R.attr.vk_ui_background_contrast;
            }
            if (i == 3) {
                return R.attr.vk_ui_transparent;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.Accent) {
            return R.attr.vk_ui_background_accent_themed;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.Neutral) {
            return R.attr.vk_ui_icon_secondary;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentGreen) {
            return R.attr.vk_ui_accent_green;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentRed || counterAppearance == VkCounter.CounterAppearance.Priority.High) {
            return R.attr.vk_ui_accent_red;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Priority.Medium) {
            return R.attr.vk_ui_background_accent_themed;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Priority.Low) {
            return R.attr.vk_ui_icon_secondary;
        }
        if (counterAppearance instanceof VkCounter.CounterAppearance.a) {
            return ((VkCounter.CounterAppearance.a) counterAppearance).b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int b(Context context, VkCounter.Size size) {
        int i = C0836a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return hbh0.b(18, context);
        }
        if (i == 2) {
            return hbh0.b(24, context);
        }
        if (i == 3) {
            return hbh0.b(24, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int c(VkCounter.Mode mode, VkCounter.CounterAppearance counterAppearance) {
        int i = C0836a.$EnumSwitchMapping$1[mode.ordinal()];
        if (i == 1) {
            if (counterAppearance == VkCounter.CounterAppearance.Appearance.Accent) {
                return R.attr.vk_ui_text_contrast_themed;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Appearance.Neutral || counterAppearance == VkCounter.CounterAppearance.Appearance.AccentGreen || counterAppearance == VkCounter.CounterAppearance.Appearance.AccentRed || counterAppearance == VkCounter.CounterAppearance.Priority.High) {
                return R.attr.vk_ui_text_contrast;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Priority.Medium) {
                return R.attr.vk_ui_text_contrast_themed;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Priority.Low) {
                return R.attr.vk_ui_text_contrast;
            }
            if (counterAppearance instanceof VkCounter.CounterAppearance.a) {
                return ((VkCounter.CounterAppearance.a) counterAppearance).c;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 2) {
            if (counterAppearance == VkCounter.CounterAppearance.Appearance.Accent) {
                return R.attr.vk_ui_text_accent;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Appearance.Neutral) {
                return R.attr.vk_ui_text_tertiary;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentGreen) {
                return R.attr.vk_ui_accent_green;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentRed || counterAppearance == VkCounter.CounterAppearance.Priority.High) {
                return R.attr.vk_ui_accent_red;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Priority.Medium) {
                return R.attr.vk_ui_text_accent;
            }
            if (counterAppearance == VkCounter.CounterAppearance.Priority.Low) {
                return R.attr.vk_ui_text_tertiary;
            }
            if (counterAppearance instanceof VkCounter.CounterAppearance.a) {
                return ((VkCounter.CounterAppearance.a) counterAppearance).c;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.Accent) {
            return R.attr.vk_ui_text_accent;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.Neutral) {
            return R.attr.vk_ui_text_tertiary;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentGreen) {
            return R.attr.vk_ui_accent_green;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentRed || counterAppearance == VkCounter.CounterAppearance.Priority.High) {
            return R.attr.vk_ui_accent_red;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Priority.Medium) {
            return R.attr.vk_ui_text_accent;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Priority.Low) {
            return R.attr.vk_ui_text_tertiary;
        }
        if (counterAppearance instanceof VkCounter.CounterAppearance.a) {
            return ((VkCounter.CounterAppearance.a) counterAppearance).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int d(Context context, VkCounter.Mode mode, VkCounter.Size size) {
        int i = C0836a.$EnumSwitchMapping$1[mode.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return 0;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = C0836a.$EnumSwitchMapping$0[size.ordinal()];
        if (i2 == 1) {
            return hbh0.b(4, context);
        }
        if (i2 == 2) {
            return hbh0.b(6, context);
        }
        if (i2 == 3) {
            return hbh0.b(6, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int e(Context context, VkCounter.Mode mode, VkCounter.Size size) {
        int i;
        int i2 = C0836a.$EnumSwitchMapping$1[mode.ordinal()];
        if (i2 == 1 || i2 == 2) {
            int i3 = C0836a.$EnumSwitchMapping$0[size.ordinal()];
            if (i3 != 1) {
                i = R.attr.vk_ui_typography_headline2_medium;
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = R.attr.vk_ui_typography_caption1_normal;
            }
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = C0836a.$EnumSwitchMapping$0[size.ordinal()];
            if (i4 != 1) {
                i = R.attr.vk_ui_typography_paragraph_normal;
                if (i4 != 2 && i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = R.attr.vk_ui_typography_footnote_normal;
            }
        }
        return e3m.g(i, context);
    }
}
