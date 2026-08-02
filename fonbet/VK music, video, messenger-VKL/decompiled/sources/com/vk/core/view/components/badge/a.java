package com.vk.core.view.components.badge;

import android.content.Context;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.avj;
import xsna.e3m;
import xsna.hbh0;
import xsna.krv0;
import xsna.vev0;

/* compiled from: ContentBadge.kt */
/* loaded from: classes.dex */
public final class a {
    public static final avj a = new avj(vev0.e);
    public static final avj b;
    public static final avj c;
    public static final avj d;
    public static final avj e;
    public static final avj f;

    /* compiled from: ContentBadge.kt */
    /* renamed from: com.vk.core.view.components.badge.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0803a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VkContentBadge.Size.values().length];
            try {
                iArr[VkContentBadge.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkContentBadge.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkContentBadge.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkContentBadge.Mode.values().length];
            try {
                iArr2[VkContentBadge.Mode.Secondary.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkContentBadge.Mode.Outline.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkContentBadge.Mode.Primary.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VkContentBadge.Appearance.Design.values().length];
            try {
                iArr3[VkContentBadge.Appearance.Design.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VkContentBadge.Appearance.Design.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[VkContentBadge.Appearance.Design.Positive.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[VkContentBadge.Appearance.Design.Negative.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[VkContentBadge.Appearance.Design.Overlay.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        float f2 = vev0.a;
        new avj(f2);
        float f3 = vev0.c;
        b = new avj(f3);
        c = new avj(vev0.f);
        new avj(f2);
        d = new avj(f3);
        e = new avj(vev0.g);
        f = new avj(f3);
    }

    public static int a(VkContentBadge.Appearance appearance, VkContentBadge.Mode mode, Context context) {
        int i;
        if (!(appearance instanceof VkContentBadge.Appearance.Design)) {
            if (appearance instanceof VkContentBadge.Appearance.a) {
                return ((VkContentBadge.Appearance.a) appearance).b.b(context);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = C0803a.$EnumSwitchMapping$2[((VkContentBadge.Appearance.Design) appearance).ordinal()];
        int i3 = R.attr.vk_ui_text_contrast;
        if (i2 == 1) {
            int i4 = C0803a.$EnumSwitchMapping$1[mode.ordinal()];
            i = R.attr.vk_ui_text_accent;
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i3 = i;
        } else if (i2 == 2) {
            int i5 = C0803a.$EnumSwitchMapping$1[mode.ordinal()];
            if (i5 == 1) {
                i3 = R.attr.vk_ui_text_primary;
            } else if (i5 == 2) {
                i3 = R.attr.vk_ui_text_secondary;
            } else if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 3) {
            int i6 = C0803a.$EnumSwitchMapping$1[mode.ordinal()];
            i = R.attr.vk_ui_accent_green;
            if (i6 != 1 && i6 != 2) {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i3 = i;
        } else if (i2 == 4) {
            int i7 = C0803a.$EnumSwitchMapping$1[mode.ordinal()];
            i = R.attr.vk_ui_accent_red;
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i3 = i;
        } else if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return krv0.m(i3, context);
    }

    public static int b(Context context, VkContentBadge.Size size, boolean z) {
        int i = C0803a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return hbh0.b(12, context);
        }
        if (i == 2) {
            return z ? hbh0.b(12, context) : hbh0.b(16, context);
        }
        if (i == 3) {
            return z ? hbh0.b(16, context) : hbh0.b(20, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int c(VkContentBadge.Size size, Context context) {
        int i = C0803a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return e3m.g(R.attr.vk_ui_typography_caption1_medium_unscaled, context);
        }
        if (i == 2) {
            return e3m.g(R.attr.vk_ui_typography_caption1_medium_unscaled, context);
        }
        if (i == 3) {
            return e3m.g(R.attr.vk_ui_typography_footnote_medium_unscaled, context);
        }
        throw new NoWhenBranchMatchedException();
    }
}
