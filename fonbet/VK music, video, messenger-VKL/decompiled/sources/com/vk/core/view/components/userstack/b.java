package com.vk.core.view.components.userstack;

import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserStackParams.kt */
/* loaded from: classes17.dex */
public final class b {

    /* compiled from: UserStackParams.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkUserStack.Size.values().length];
            try {
                iArr[VkUserStack.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkUserStack.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkUserStack.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static float a(VkUserStack.Size size) {
        int i = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return 14.5f;
        }
        if (i == 2) {
            return 22.0f;
        }
        if (i == 3) {
            return 29.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float b(VkUserStack.Size size) {
        int i = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return 16.0f;
        }
        if (i == 2) {
            return 24.0f;
        }
        if (i == 3) {
            return 32.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int c(VkUserStack.Size size) {
        int i = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return R.attr.vk_ui_typography_caption3_caps_semi_bold;
        }
        if (i == 2) {
            return R.attr.vk_ui_typography_caption2_caps;
        }
        if (i == 3) {
            return R.attr.vk_ui_typography_footnote_caps;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float d(VkUserStack.Size size) {
        int i = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return 18.0f;
        }
        if (i == 2) {
            return 27.0f;
        }
        if (i == 3) {
            return 36.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
