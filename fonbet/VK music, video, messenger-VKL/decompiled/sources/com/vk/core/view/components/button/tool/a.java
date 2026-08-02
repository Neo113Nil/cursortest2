package com.vk.core.view.components.button.tool;

import android.util.TypedValue;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e43;
import xsna.krv0;
import xsna.u2p0;

/* compiled from: ToolButtonStyle.kt */
/* loaded from: classes17.dex */
public class a {
    public Integer a(VkToolButton.Mode mode, VkToolButton.Appearance appearance) {
        int i;
        if (b.$EnumSwitchMapping$1[mode.ordinal()] != 1) {
            return null;
        }
        int i2 = b.$EnumSwitchMapping$0[appearance.ordinal()];
        if (i2 == 1) {
            i = R.attr.vk_ui_stroke_accent_themed;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_separator_primary_alpha;
        }
        return Integer.valueOf(i);
    }

    public u2p0 b(VkToolButton.Mode mode, VkToolButton.Appearance appearance) {
        int i = b.$EnumSwitchMapping$1[mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = b.$EnumSwitchMapping$0[appearance.ordinal()];
                if (i2 == 1) {
                    return new u2p0(R.attr.vk_ui_background_accent_themed, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_icon_contrast_themed);
                }
                if (i2 == 2 || i2 == 3) {
                    return new u2p0(R.attr.vk_ui_background_modal_inverse, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_icon_contrast_themed);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        int i3 = mode == VkToolButton.Mode.Secondary ? R.attr.vk_ui_background_secondary : R.attr.vk_ui_transparent;
        int i4 = b.$EnumSwitchMapping$0[appearance.ordinal()];
        if (i4 == 1) {
            return new u2p0(i3, R.attr.vk_ui_text_accent_themed, R.attr.vk_ui_icon_accent_themed);
        }
        if (i4 == 2 || i4 == 3) {
            return new u2p0(i3, R.attr.vk_ui_text_primary, R.attr.vk_ui_icon_primary);
        }
        throw new NoWhenBranchMatchedException();
    }

    public Integer c(VkToolButton.Mode mode, VkToolButton.Appearance appearance) {
        TypedValue typedValue = krv0.a;
        Integer valueOf = Integer.valueOf(krv0.j() ? -1 : -16777216);
        if (mode == VkToolButton.Mode.Primary && e43.l(VkToolButton.Appearance.Neutral, VkToolButton.Appearance.Overlay).contains(appearance)) {
            return valueOf;
        }
        return null;
    }
}
