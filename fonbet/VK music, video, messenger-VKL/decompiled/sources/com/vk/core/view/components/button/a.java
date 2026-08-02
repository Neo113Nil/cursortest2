package com.vk.core.view.components.button;

import android.content.Context;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import xsna.hp8;
import xsna.r890;

/* compiled from: ButtonDefaults.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: ButtonDefaults.kt */
    /* renamed from: com.vk.core.view.components.button.a$a, reason: collision with other inner class name */
    public static final class C0808a {
        public static hp8 a(int i) {
            return new hp8(i, R.attr.vk_ui_text_negative, R.attr.vk_ui_icon_negative, R.attr.vk_ui_text_contrast, R.attr.vk_ui_accent_red);
        }

        public static hp8 b(int i) {
            return new hp8(i, R.attr.vk_ui_text_positive, R.attr.vk_ui_icon_positive, R.attr.vk_ui_text_contrast, R.attr.vk_ui_accent_green);
        }
    }

    /* compiled from: ButtonDefaults.kt */
    public static final /* synthetic */ class b {
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
                iArr3[VkButton.Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[VkButton.Mode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[VkButton.Mode.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[VkButton.Mode.Outline.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[VkButton.Mode.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    int a(Context context, VkButton.Size size);

    hp8 b(int i);

    float c(Context context, VkButton.Mode mode, VkButton.Appearance appearance);

    int d(Context context);

    Integer e(VkButton.Mode mode, VkButton.Appearance appearance);

    hp8 f();

    hp8 g();

    int h(Context context, VkButton.Size size);

    int i(Context context, VkButton.Size size);

    int j(Context context, VkButton.Size size);

    r890 k(Context context, VkButton.Size size, VkButton.Mode mode);

    int l();

    hp8 m(VkButton.Mode mode, VkButton.Appearance appearance);

    VkCounter.Size n(VkButton.Size size);

    int o();

    float p(Context context, VkButton.Size size);

    hp8 q(int i);

    float r(Context context, VkButton.Size size);

    hp8 s();

    hp8 t(int i);
}
