package ru.ozon.uni.ozi.utils.internal.presets;

import S0.InterfaceC3967k;
import Sc.o;
import U7.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.theme.DefaultDarkOziColorSchemeKt;
import ru.ozon.uni.ozi.theme.DefaultLightOziColorSchemeKt;
import ru.ozon.uni.ozi.theme.FreshOziColorSchemeKt;
import ru.ozon.uni.ozi.theme.OziColorTheme;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.theme.OziMiniAppColorScheme;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;", "Ll1/Z;", "getValue", "(Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;LS0/k;I)J", "getValue$annotations", "(Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeyTokenUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OziMiniAppColorScheme.values().length];
            try {
                iArr[OziMiniAppColorScheme.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziMiniAppColorScheme.Fresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OziColorTheme.values().length];
            try {
                iArr2[OziColorTheme.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OziColorTheme.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final long getValue(@NotNull OziColorsKeyTokens oziColorsKeyTokens, InterfaceC3967k interfaceC3967k, int i11) {
        long w11;
        long w12;
        Intrinsics.checkNotNullParameter(oziColorsKeyTokens, "<this>");
        OziTheme oziTheme = OziTheme.INSTANCE;
        int i12 = UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable;
        int i13 = WhenMappings.$EnumSwitchMapping$1[oziTheme.getColors(interfaceC3967k, i12).getColorConfig().getTheme().ordinal()];
        if (i13 == 1) {
            interfaceC3967k.o(-532890656);
            int i14 = WhenMappings.$EnumSwitchMapping$0[oziTheme.getColors(interfaceC3967k, i12).getColorConfig().getScheme().ordinal()];
            if (i14 == 1) {
                w11 = DefaultLightOziColorSchemeKt.getLightColorList().get(oziColorsKeyTokens.ordinal()).w();
            } else {
                if (i14 != 2) {
                    throw new o();
                }
                w11 = FreshOziColorSchemeKt.getFreshLightOziColorList().get(oziColorsKeyTokens.ordinal()).w();
            }
            interfaceC3967k.k();
            return w11;
        }
        if (i13 != 2) {
            throw l.c(interfaceC3967k, -848476040);
        }
        interfaceC3967k.o(-532628830);
        int i15 = WhenMappings.$EnumSwitchMapping$0[oziTheme.getColors(interfaceC3967k, i12).getColorConfig().getScheme().ordinal()];
        if (i15 == 1) {
            w12 = DefaultDarkOziColorSchemeKt.getDarkColorList().get(oziColorsKeyTokens.ordinal()).w();
        } else {
            if (i15 != 2) {
                throw new o();
            }
            w12 = FreshOziColorSchemeKt.getFreshDarkOziColorList().get(oziColorsKeyTokens.ordinal()).w();
        }
        interfaceC3967k.k();
        return w12;
    }
}
