package com.vk.core.view.components.button;

import android.content.Context;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.a;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.hbh0;
import xsna.hp8;
import xsna.r890;

/* compiled from: MilkshakeButtonDefaults.kt */
/* loaded from: classes.dex */
public final class c implements com.vk.core.view.components.button.a {
    public static final c a = new c();

    /* compiled from: MilkshakeButtonDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VkButton.Size.values().length];
            try {
                iArr[VkButton.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkButton.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkButton.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkButton.Appearance.values().length];
            try {
                iArr2[VkButton.Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkButton.Appearance.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkButton.Appearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VkButton.Appearance.Neutral.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkButton.Appearance.Overlay.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VkButton.Mode.values().length];
            try {
                iArr3[VkButton.Mode.Outline.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[VkButton.Mode.Link.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.vk.core.view.components.button.a
    public final int a(Context context, VkButton.Size size) {
        int i = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return hbh0.b(30, context);
        }
        if (i == 2) {
            return hbh0.b(36, context);
        }
        if (i == 3) {
            return hbh0.b(44, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.core.view.components.button.a
    public final hp8 b(int i) {
        return new hp8(i, R.attr.vk_ui_text_primary, R.attr.vk_ui_icon_primary, R.attr.vk_ui_text_contrast, R.attr.vk_ui_icon_secondary);
    }

    @Override // com.vk.core.view.components.button.a
    public final float c(Context context, VkButton.Mode mode, VkButton.Appearance appearance) {
        return hbh0.a(context, 1.0f);
    }

    @Override // com.vk.core.view.components.button.a
    public final int d(Context context) {
        return hbh0.b(6, context);
    }

    @Override // com.vk.core.view.components.button.a
    public final Integer e(VkButton.Mode mode, VkButton.Appearance appearance) {
        int i;
        if (a.$EnumSwitchMapping$2[mode.ordinal()] != 1) {
            return null;
        }
        int i2 = a.$EnumSwitchMapping$1[appearance.ordinal()];
        if (i2 == 1) {
            i = R.attr.vk_ui_stroke_accent_themed;
        } else if (i2 == 2) {
            i = R.attr.vk_ui_stroke_positive;
        } else if (i2 == 3) {
            i = R.attr.vk_ui_stroke_negative;
        } else if (i2 == 4) {
            i = R.attr.vk_ui_field_border_alpha;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_stroke_contrast;
        }
        return Integer.valueOf(i);
    }

    @Override // com.vk.core.view.components.button.a
    public final hp8 f() {
        return new hp8(R.attr.vk_ui_background_accent_themed, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_icon_contrast_themed, R.attr.vk_ui_text_accent_themed, R.attr.vk_ui_background_content);
    }

    @Override // com.vk.core.view.components.button.a
    public final hp8 g() {
        return new hp8(R.attr.vk_ui_background_contrast, R.attr.vk_ui_text_primary_invariably, R.attr.vk_ui_icon_primary_invariably, R.attr.vk_ui_text_contrast, R.attr.vk_ui_background_contrast_inverse);
    }

    @Override // com.vk.core.view.components.button.a
    public final int h(Context context, VkButton.Size size) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i2 == 1) {
            i = R.attr.vk_ui_typography_subhead_medium;
        } else if (i2 == 2) {
            i = R.attr.vk_ui_typography_headline2_medium;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_typography_headline1_medium;
        }
        return e3m.g(i, context);
    }

    @Override // com.vk.core.view.components.button.a
    public final int i(Context context, VkButton.Size size) {
        int i = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return hbh0.b(16, context);
        }
        if (i == 2 || i == 3) {
            return hbh0.b(24, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.core.view.components.button.a
    public final int j(Context context, VkButton.Size size) {
        return i(context, size) - (size == VkButton.Size.Small ? (int) hbh0.a(context, 2.5f) : hbh0.b(2, context));
    }

    @Override // com.vk.core.view.components.button.a
    public final r890 k(Context context, VkButton.Size size, VkButton.Mode mode) {
        int i = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            if (a.$EnumSwitchMapping$2[mode.ordinal()] == 2) {
                return new r890((int) hbh0.a(context, 5.5f), (int) hbh0.a(context, 4.5f), 5);
            }
            int a2 = (int) hbh0.a(context, 5.5f);
            int a3 = (int) hbh0.a(context, 4.5f);
            return new r890(hbh0.b(12, context), a2, hbh0.b(12, context), a3);
        }
        if (i == 2) {
            if (a.$EnumSwitchMapping$2[mode.ordinal()] == 2) {
                return new r890((int) hbh0.a(context, 5.5f), (int) hbh0.a(context, 4.5f), 5);
            }
            int a4 = (int) hbh0.a(context, 5.5f);
            int a5 = (int) hbh0.a(context, 4.5f);
            return new r890(hbh0.b(12, context), a4, hbh0.b(12, context), a5);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (a.$EnumSwitchMapping$2[mode.ordinal()] == 2) {
            return new r890((int) hbh0.a(context, 9.5f), (int) hbh0.a(context, 8.5f), 5);
        }
        int a6 = (int) hbh0.a(context, 9.5f);
        int a7 = (int) hbh0.a(context, 8.5f);
        return new r890(hbh0.b(16, context), a6, hbh0.b(16, context), a7);
    }

    @Override // com.vk.core.view.components.button.a
    public final int l() {
        return R.attr.vk_ui_background_secondary_alpha;
    }

    @Override // com.vk.core.view.components.button.a
    public final hp8 m(VkButton.Mode mode, VkButton.Appearance appearance) {
        int i = a.b.$EnumSwitchMapping$2[mode.ordinal()];
        if (i == 1) {
            int i2 = a.b.$EnumSwitchMapping$1[appearance.ordinal()];
            if (i2 == 1) {
                return f();
            }
            if (i2 == 2) {
                return new hp8(R.attr.vk_ui_background_positive, R.attr.vk_ui_text_contrast, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_accent_green, R.attr.vk_ui_background_contrast);
            }
            if (i2 == 3) {
                return new hp8(R.attr.vk_ui_background_negative, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_accent_red, R.attr.vk_ui_background_contrast);
            }
            if (i2 == 4) {
                return s();
            }
            if (i2 == 5) {
                return g();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 2) {
            int i3 = a.b.$EnumSwitchMapping$1[appearance.ordinal()];
            if (i3 == 1) {
                return t(l());
            }
            if (i3 == 2) {
                return a.C0808a.b(R.attr.vk_ui_background_secondary_alpha);
            }
            if (i3 == 3) {
                return a.C0808a.a(R.attr.vk_ui_background_secondary_alpha);
            }
            if (i3 == 4) {
                return b(l());
            }
            if (i3 == 5) {
                return q(o());
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 3) {
            int i4 = a.b.$EnumSwitchMapping$1[appearance.ordinal()];
            if (i4 == 1) {
                return t(R.attr.vk_ui_transparent);
            }
            if (i4 == 2) {
                return a.C0808a.b(R.attr.vk_ui_transparent);
            }
            if (i4 == 3) {
                return a.C0808a.a(R.attr.vk_ui_transparent);
            }
            if (i4 == 4) {
                return b(R.attr.vk_ui_transparent);
            }
            if (i4 == 5) {
                return q(R.attr.vk_ui_transparent);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 4) {
            int i5 = a.b.$EnumSwitchMapping$1[appearance.ordinal()];
            if (i5 == 1) {
                return t(R.attr.vk_ui_transparent);
            }
            if (i5 == 2) {
                return a.C0808a.b(R.attr.vk_ui_transparent);
            }
            if (i5 == 3) {
                return a.C0808a.a(R.attr.vk_ui_transparent);
            }
            if (i5 == 4) {
                return b(R.attr.vk_ui_transparent);
            }
            if (i5 == 5) {
                return q(R.attr.vk_ui_transparent);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = a.b.$EnumSwitchMapping$1[appearance.ordinal()];
        if (i6 == 1) {
            return t(R.attr.vk_ui_transparent);
        }
        if (i6 == 2) {
            return a.C0808a.b(R.attr.vk_ui_transparent);
        }
        if (i6 == 3) {
            return a.C0808a.a(R.attr.vk_ui_transparent);
        }
        if (i6 == 4) {
            return b(R.attr.vk_ui_transparent);
        }
        if (i6 == 5) {
            return q(R.attr.vk_ui_transparent);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.core.view.components.button.a
    public final VkCounter.Size n(VkButton.Size size) {
        int i = a.b.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return VkCounter.Size.Small;
        }
        if (i == 2) {
            return VkCounter.Size.Medium;
        }
        if (i == 3) {
            return VkCounter.Size.Medium;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.core.view.components.button.a
    public final int o() {
        return R.attr.vk_ui_overlay_primary;
    }

    @Override // com.vk.core.view.components.button.a
    public final float p(Context context, VkButton.Size size) {
        return hbh0.b(8, context);
    }

    @Override // com.vk.core.view.components.button.a
    public final hp8 q(int i) {
        return new hp8(i, R.attr.vk_ui_text_contrast, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_text_primary_invariably, R.attr.vk_ui_background_contrast);
    }

    @Override // com.vk.core.view.components.button.a
    public final float r(Context context, VkButton.Size size) {
        int i = a.b.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return hbh0.a(context, 1.0f);
        }
        if (i == 2) {
            return hbh0.a(context, 2.0f);
        }
        if (i == 3) {
            return hbh0.a(context, 2.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.core.view.components.button.a
    public final hp8 s() {
        return new hp8(R.attr.vk_ui_background_content_inverse, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_icon_contrast_themed, R.attr.vk_ui_text_primary, R.attr.vk_ui_background_content);
    }

    @Override // com.vk.core.view.components.button.a
    public final hp8 t(int i) {
        return new hp8(i, R.attr.vk_ui_text_accent_themed, R.attr.vk_ui_icon_accent_themed, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_background_accent_themed);
    }
}
