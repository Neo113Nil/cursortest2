package com.vk.core.compose.component.defaults;

import com.vk.core.compose.component.cell.content.AlongIconType;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.kqu0;
import xsna.lg90;
import xsna.pg90;

/* compiled from: VkCellDefaults.kt */
/* loaded from: classes17.dex */
public final class c {
    public static final c a = new c();
    public static final float b = 48;
    public static final float c = 40;
    public static final ButtonAppearance d;

    /* compiled from: VkCellDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Cell$Left.Main.Size.values().length];
            try {
                iArr[Cell$Left.Main.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Cell$Left.Main.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Cell$Left.Main.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlongIconType.values().length];
            try {
                iArr2[AlongIconType.AlongTitle.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlongIconType.AlongSubtitle.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        CounterAppearance.Design design = CounterAppearance.Design.AccentRed;
        d = ButtonAppearance.Accent;
        BadgeAppearance.Design design2 = BadgeAppearance.Design.Accent;
    }

    public final float a(Cell$Left.Main.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        aVar.K(1944918804);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1944918804, i, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.avatarContentSize (VkCellDefaults.kt:38)");
        }
        int i3 = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i3 == 1) {
            i2 = 40;
        } else if (i3 == 2) {
            i2 = 48;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 72;
        }
        float f = i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final lg90 b(androidx.compose.runtime.a aVar) {
        aVar.K(-1146537990);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1146537990, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.chevronIconPainter (VkCellDefaults.kt:75)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1231053620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
        }
        lg90 a2 = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, 0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    public final float c(Cell$Left.Main.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        aVar.K(75991156);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(75991156, i, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.iconContentSize (VkCellDefaults.kt:30)");
        }
        int i3 = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i3 == 1) {
            i2 = 24;
        } else if (i3 == 2) {
            i2 = 28;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 32;
        }
        float f = i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final float d(androidx.compose.runtime.a aVar) {
        aVar.K(-946041484);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-946041484, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.leftPictureVerticalPadding (VkCellDefaults.kt:53)");
        }
        float f = kqu0.s;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final float e(Cell$Left.Main.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        aVar.K(2062435563);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2062435563, i, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.pictureContentSize (VkCellDefaults.kt:46)");
        }
        int i3 = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i3 == 1) {
            i2 = 40;
        } else if (i3 == 2) {
            i2 = 48;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 72;
        }
        float f = i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }
}
