package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1532colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, Composer composer, int i, int i2, int i3) {
        long j9;
        long j10;
        long j11;
        long j12;
        float f3;
        long j13;
        long j14;
        long j15;
        int i4;
        long j16;
        composer.startReplaceableGroup(-1032127534);
        ComposerKt.sourceInformation(composer, "C(colors)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color!1,7:c#ui.graphics.Color,9:c#ui.graphics.Color,8,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color)279@11288L6,282@11460L6,283@11527L6,286@11689L8,287@11740L6,289@11857L8,290@11908L6,292@12029L8,293@12080L6,295@12201L8,296@12252L6:Switch.kt#jmzs0o");
        long m1327getSecondaryVariant0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1327getSecondaryVariant0d7_KjU() : j;
        long j17 = (i3 & 2) != 0 ? m1327getSecondaryVariant0d7_KjU : j2;
        float f4 = (i3 & 4) != 0 ? 0.54f : f;
        long m1328getSurface0d7_KjU = (i3 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1328getSurface0d7_KjU() : j3;
        long m1323getOnSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU() : j4;
        float f5 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            long j18 = m1327getSecondaryVariant0d7_KjU;
            long m2111copywmQWz5c$default = Color.m2111copywmQWz5c$default(j18, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j9 = j18;
            j10 = j17;
            j11 = ColorKt.m2157compositeOverOWjLjI(m2111copywmQWz5c$default, MaterialTheme.INSTANCE.getColors(composer, 6).m1328getSurface0d7_KjU());
        } else {
            j9 = m1327getSecondaryVariant0d7_KjU;
            j10 = j17;
            j11 = j5;
        }
        if ((i3 & 128) != 0) {
            j12 = j10;
            f3 = f4;
            j13 = j11;
            j14 = ColorKt.m2157compositeOverOWjLjI(Color.m2111copywmQWz5c$default(j10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1328getSurface0d7_KjU());
        } else {
            j12 = j10;
            f3 = f4;
            j13 = j11;
            j14 = j6;
        }
        if ((i3 & 256) != 0) {
            i4 = 6;
            j15 = j14;
            j16 = ColorKt.m2157compositeOverOWjLjI(Color.m2111copywmQWz5c$default(m1328getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1328getSurface0d7_KjU());
        } else {
            j15 = j14;
            i4 = 6;
            j16 = j7;
        }
        float f6 = f3;
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j9, Color.m2111copywmQWz5c$default(j12, f6, 0.0f, 0.0f, 0.0f, 14, null), m1328getSurface0d7_KjU, Color.m2111copywmQWz5c$default(m1323getOnSurface0d7_KjU, f5, 0.0f, 0.0f, 0.0f, 14, null), j13, Color.m2111copywmQWz5c$default(j15, f6, 0.0f, 0.0f, 0.0f, 14, null), j16, Color.m2111copywmQWz5c$default((i3 & 512) != 0 ? ColorKt.m2157compositeOverOWjLjI(Color.m2111copywmQWz5c$default(m1323getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, i4).m1328getSurface0d7_KjU()) : j8, f5, 0.0f, 0.0f, 0.0f, 14, null), null);
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
