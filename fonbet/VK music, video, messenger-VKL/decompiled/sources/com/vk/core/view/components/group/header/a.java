package com.vk.core.view.components.group.header;

import android.content.Context;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public final class a {

    /* compiled from: GroupHeader.kt */
    /* renamed from: com.vk.core.view.components.group.header.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0845a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkGroupHeader.Size.values().length];
            try {
                iArr[VkGroupHeader.Size.ExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkGroupHeader.Size.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkGroupHeader.Size.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkGroupHeader.Size.Small.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static int a(VkGroupHeader.Size size) {
        int i = C0845a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return R.attr.vk_ui_text_primary;
        }
        if (i == 4) {
            return R.attr.vk_ui_text_secondary;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int b(Context context, VkGroupHeader.Size size) {
        int i;
        int i2 = C0845a.$EnumSwitchMapping$0[size.ordinal()];
        if (i2 == 1) {
            i = R.attr.vk_ui_typography_display_title2;
        } else if (i2 == 2) {
            i = R.attr.vk_ui_typography_display_title3;
        } else if (i2 == 3) {
            i = R.attr.vk_ui_typography_headline1;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_typography_footnote_caps;
        }
        return e3m.g(i, context);
    }
}
