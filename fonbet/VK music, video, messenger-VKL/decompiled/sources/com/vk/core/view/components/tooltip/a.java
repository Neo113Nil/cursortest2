package com.vk.core.view.components.tooltip;

import android.content.Context;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.hbh0;

/* compiled from: LegoTooltipDefaults.kt */
/* loaded from: classes17.dex */
public final class a implements c {

    /* compiled from: LegoTooltipDefaults.kt */
    /* renamed from: com.vk.core.view.components.tooltip.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0868a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkTooltip.Appearance.values().length];
            try {
                iArr[VkTooltip.Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkTooltip.Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkTooltip.Appearance.Inversion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkTooltip.Appearance.InvariablyWhite.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkTooltip.Appearance.InvariablyBlack.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkTooltip.Appearance.Transparent.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new a();
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final VkTooltip.d a() {
        return new VkTooltip.d();
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final int b(VkTooltip.Appearance appearance) {
        switch (C0868a.$EnumSwitchMapping$0[appearance.ordinal()]) {
            case 1:
            case 2:
                return R.attr.vk_ui_text_primary;
            case 3:
                return R.attr.vk_ui_text_contrast_themed;
            case 4:
                return R.attr.vk_ui_text_primary_invariably;
            case 5:
                return R.attr.vk_ui_text_contrast;
            case 6:
                return R.attr.vk_ui_text_primary;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final int c(Context context) {
        return hbh0.b(8, context);
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final int d(VkTooltip.Appearance appearance) {
        switch (C0868a.$EnumSwitchMapping$0[appearance.ordinal()]) {
            case 1:
            case 2:
                return R.attr.vk_ui_background_contrast_themed;
            case 3:
                return R.attr.vk_ui_background_modal_inverse;
            case 4:
                return R.attr.vk_ui_background_contrast;
            case 5:
                return R.attr.vk_ui_background_contrast_inverse;
            case 6:
                return R.attr.vk_ui_background_contrast_themed;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final int e(Context context) {
        return hbh0.b(10, context);
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final int f(VkTooltip.Appearance appearance) {
        switch (C0868a.$EnumSwitchMapping$0[appearance.ordinal()]) {
            case 1:
            case 2:
                return R.attr.vk_ui_icon_secondary;
            case 3:
                return R.attr.vk_ui_icon_contrast_themed;
            case 4:
                return R.attr.vk_ui_icon_secondary;
            case 5:
                return R.attr.vk_ui_icon_contrast;
            case 6:
                return R.attr.vk_ui_icon_secondary;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final float g(Context context) {
        return hbh0.a(context, 12.0f);
    }

    @Override // com.vk.core.view.components.tooltip.c
    public final float h(Context context) {
        return hbh0.a(context, 2.0f);
    }
}
