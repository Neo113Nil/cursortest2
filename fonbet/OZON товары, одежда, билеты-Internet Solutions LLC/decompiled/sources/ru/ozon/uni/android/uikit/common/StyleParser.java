package ru.ozon.uni.android.uikit.common;

import B0.C2454a;
import Sc.InterfaceC3999a;
import Sc.w;
import T7.E;
import Xc.a;
import Xc.b;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.gradient.OzGradient;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent0;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent1;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent2;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent3;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent4;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientBlackOverlay;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientBlackOverlay2;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005HIJKLB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u000fJ#\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u000fJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\t*\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010!\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\"J)\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020#H\u0007¢\u0006\u0004\b\u0016\u0010$J+\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010!\u001a\u00020\u0006H\u0007¢\u0006\u0004\b%\u0010\"J\u001b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010\bR \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R&\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002000/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u0016\u0010D\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010G\u001a\u0002058F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006M"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser;", "", "<init>", "()V", "", "color", "", "parseHexColor", "(Ljava/lang/String;)Ljava/lang/Integer;", "Landroid/content/Context;", "context", "colorResToHexColor", "(Landroid/content/Context;I)Ljava/lang/String;", "colorToken", "getColorResByToken", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", "Landroid/app/Activity;", "activity", "", "addActivity", "(Landroid/app/Activity;)V", "removeActivity", "parseColor", "mapColor", "gradient", "Lru/ozon/uni/android/uikit/common/gradient/OzGradient;", "parseGradient", "(Ljava/lang/String;)Lru/ozon/uni/android/uikit/common/gradient/OzGradient;", "resolveTheme$uni_release", "(Landroid/content/Context;)Landroid/content/Context;", "resolveTheme", "parseOzColorToHex", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "default", "(Landroid/content/Context;Ljava/lang/String;I)I", "Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "(Landroid/content/Context;Ljava/lang/String;Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;)I", "parseColorInt", "style", "parseTextStyle", "", "UiKitCoreColorMap", "Ljava/util/Map;", "Lru/ozon/uni/core/UniTextStyles;", "UiKitCoreTextStyleMap", "newTextStyleTokenMap", "", "Lkotlin/Pair;", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color$Themed;", "colorTokenMap", "Ljava/util/List;", "", "list", "Landroid/app/Application;", "savedApplication", "Landroid/app/Application;", "", "disableOldPalette", "Z", "getDisableOldPalette", "()Z", "setDisableOldPalette", "(Z)V", "disableOldTextStyles", "getDisableOldTextStyles", "setDisableOldTextStyles", "getActiveActivity", "()Landroid/app/Activity;", "activeActivity", "getApplication", "()Landroid/app/Application;", "application", "OzColor", "TextStyle", "ColorPalette", "DsColorPalette", "NewColorPalette", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StyleParser {
    public static final int $stable;

    @NotNull
    public static final StyleParser INSTANCE = new StyleParser();

    @NotNull
    private static final Map<String, Integer> UiKitCoreColorMap;

    @NotNull
    private static final Map<String, UniTextStyles> UiKitCoreTextStyleMap;

    @NotNull
    private static final List<Pair<String, ColorPalette.Color.Themed>> colorTokenMap;
    private static boolean disableOldPalette;
    private static boolean disableOldTextStyles;

    @NotNull
    private static final List<Activity> list;

    @NotNull
    private static final Map<String, Integer> newTextStyleTokenMap;
    private static Application savedApplication;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001:\u0001\bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette;", "", "", "", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color;", "getTokenColorMap", "()Ljava/util/Map;", "tokenColorMap", "Color", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface ColorPalette {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color;", "", "getResource", "", "context", "Landroid/content/Context;", "Raw", "Themed", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color$Raw;", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color$Themed;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Color {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color$Raw;", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color;", "", "colorRes", "<init>", "(I)V", "Landroid/content/Context;", "context", "getResource", "(Landroid/content/Context;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getColorRes", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Raw implements Color {
                private final int colorRes;

                public Raw(int i11) {
                    this.colorRes = i11;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Raw) && this.colorRes == ((Raw) other).colorRes;
                }

                @Override // ru.ozon.uni.android.uikit.common.StyleParser.ColorPalette.Color
                public int getResource(@NotNull Context context) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    return this.colorRes;
                }

                public int hashCode() {
                    return Integer.hashCode(this.colorRes);
                }

                @NotNull
                public String toString() {
                    return E.a(this.colorRes, "Raw(colorRes=", ")");
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color$Themed;", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color;", "", "attrRes", "<init>", "(I)V", "Landroid/content/Context;", "context", "getResource", "(Landroid/content/Context;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAttrRes", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Themed implements Color {
                private final int attrRes;

                public Themed(int i11) {
                    this.attrRes = i11;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Themed) && this.attrRes == ((Themed) other).attrRes;
                }

                @Override // ru.ozon.uni.android.uikit.common.StyleParser.ColorPalette.Color
                public int getResource(@NotNull Context context) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    return ThemeExtKt.themeColorRes(context, this.attrRes);
                }

                public int hashCode() {
                    return Integer.hashCode(this.attrRes);
                }

                @NotNull
                public String toString() {
                    return E.a(this.attrRes, "Themed(attrRes=", ")");
                }
            }

            int getResource(@NotNull Context context);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static Integer getColorResource(@NotNull ColorPalette colorPalette, @NotNull Context context, @NotNull String color) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(color, "color");
                Color color2 = colorPalette.getTokenColorMap().get(color);
                Integer valueOf = color2 != null ? Integer.valueOf(color2.getResource(context)) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    return null;
                }
                return valueOf;
            }
        }

        @NotNull
        Map<String, Color> getTokenColorMap();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$DsColorPalette;", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette;", "<init>", "()V", "tokenColorMap", "", "", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color;", "getTokenColorMap", "()Ljava/util/Map;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DsColorPalette implements ColorPalette {

        @NotNull
        public static final DsColorPalette INSTANCE = new DsColorPalette();

        @NotNull
        private static final Map<String, ColorPalette.Color> tokenColorMap = U.j(new Pair(OzColor.OZ_COLOR_WHITE_1.getValue(), new ColorPalette.Color.Raw(R$color.bg_light_key)), new Pair(OzColor.OZ_COLOR_WHITE_2.getValue(), new ColorPalette.Color.Raw(R$color.graphic_neutral_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_90.getValue(), new ColorPalette.Color.Raw(R$color.graphic_neutral_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_80.getValue(), new ColorPalette.Color.Raw(R$color.graphic_solid_neutral)), new Pair(OzColor.OZ_COLOR_GRAY_70.getValue(), new ColorPalette.Color.Raw(R$color.graphic_neutral_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_60.getValue(), new ColorPalette.Color.Raw(R$color.graphic_secondary)), new Pair(OzColor.OZ_COLOR_GRAY_40.getValue(), new ColorPalette.Color.Raw(R$color.graphic_secondary)), new Pair(OzColor.OZ_COLOR_GRAY_30.getValue(), new ColorPalette.Color.Raw(R$color.graphic_primary_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_20.getValue(), new ColorPalette.Color.Raw(R$color.graphic_primary)), new Pair(OzColor.OZ_COLOR_BLUE_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_action_secondary)), new Pair(OzColor.OZ_COLOR_BLUE_LIGHT.getValue(), new ColorPalette.Color.Raw(R$color.bg_action_secondary)), new Pair(OzColor.OZ_COLOR_GREEN_UI.getValue(), new ColorPalette.Color.Raw(R$color.bg_positive_primary)), new Pair(OzColor.OZ_COLOR_GREEN_UI_HOVER.getValue(), new ColorPalette.Color.Raw(R$color.bg_active_positive_primary)), new Pair(OzColor.OZ_COLOR_BLUE_HOVER.getValue(), new ColorPalette.Color.Raw(R$color.bg_active_action_secondary)), new Pair(OzColor.OZ_COLOR_RED.getValue(), new ColorPalette.Color.Raw(R$color.bg_express_primary)), new Pair(OzColor.OZ_COLOR_RED_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_express_secondary)), new Pair(OzColor.OZ_COLOR_GREEN_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_positive_secondary)), new Pair(OzColor.OZ_COLOR_YELLOW_BRAND.getValue(), new ColorPalette.Color.Raw(R$color.graphic_warning_primary_inverted)), new Pair(OzColor.OZ_COLOR_INDIGO_BRAND.getValue(), new ColorPalette.Color.Raw(R$color.bg_active_marketing_primary)), new Pair(OzColor.OZ_COLOR_INDIGO_BRAND_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_active_marketing_secondary)), new Pair(OzColor.OZ_COLOR_AQUA_BRAND_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgAquaPrimary)), new Pair(OzColor.OZ_COLOR_AQUA_BRAND.getValue(), new ColorPalette.Color.Raw(R$color.bg_aqua_primary)), new Pair(OzColor.OZ_COLOR_CATBIRD_EGG_BRAND.getValue(), new ColorPalette.Color.Raw(R$color.bg_aqua_primary)), new Pair(OzColor.OZ_COLOR_CATBIRD_EGG_BRAND_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_aqua_primary)), new Pair(OzColor.OZ_COLOR_GREEN_BRAND.getValue(), new ColorPalette.Color.Raw(R$color.bg_fresh_primary)), new Pair(OzColor.OZ_COLOR_GREEN_BRAND_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_fresh_secondary)), new Pair(OzColor.OZ_COLOR_ORANGE.getValue(), new ColorPalette.Color.Raw(R$color.bg_accent_primary)), new Pair(OzColor.OZ_COLOR_PURPLE.getValue(), new ColorPalette.Color.Raw(R$color.bg_marketing_primary)), new Pair(OzColor.OZ_COLOR_PURPLE_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_marketing_secondary)), new Pair(OzColor.OZ_COLOR_ORANGE_PALE.getValue(), new ColorPalette.Color.Raw(R$color.bg_express_secondary)), new Pair(OzColor.OZ_COLOR_BLACK.getValue(), new ColorPalette.Color.Raw(R$color.graphic_primary_on_light)), new Pair(OzColor.OZ_COLOR_HITBOX.getValue(), new ColorPalette.Color.Themed(R$attr.bgLightKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_WHITE_OVERLAY.getValue(), new ColorPalette.Color.Themed(R$attr.graphicSecondaryOnDark)), new Pair(OzColor.OZ_SEMANTIC_COLOR_WHITE_OVERLAY_2.getValue(), new ColorPalette.Color.Themed(R$attr.layerFloor2)), new Pair(OzColor.OZ_COLOR_WHITE_OVERLAY_2_CONST.getValue(), new ColorPalette.Color.Raw(R$color.clear_light_key_700)), new Pair(OzColor.OZ_COLOR_WHITE_OVERLAY_3.getValue(), new ColorPalette.Color.Raw(R$color.clear_light_key_600)), new Pair(OzColor.OZ_COLOR_WHITE_OVERLAY_4.getValue(), new ColorPalette.Color.Raw(R$color.clear_light_key_500)), new Pair(OzColor.OZ_COLOR_BLUE.getValue(), new ColorPalette.Color.Raw(R$color.bg_action_primary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_DIMMING.getValue(), new ColorPalette.Color.Themed(R$attr.layerOverlayDimming)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BUTTON_VIDEO_CONTROL.getValue(), new ColorPalette.Color.Themed(R$attr.layerOverlayDimming)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PARANDJA.getValue(), new ColorPalette.Color.Themed(R$attr.layerOverlayParanja)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PARANDJA_HOVER.getValue(), new ColorPalette.Color.Themed(R$attr.layerActiveSurface)), new Pair(OzColor.OZ_SEMANTIC_COLOR_SEPARATOR_DARK.getValue(), new ColorPalette.Color.Themed(R$attr.graphicNeutralInverted)), new Pair(OzColor.OZ_SEMANTIC_COLOR_SEPARATOR.getValue(), new ColorPalette.Color.Themed(R$attr.graphicNeutral)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY.getValue(), new ColorPalette.Color.Themed(R$attr.layerFloor0)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.layerFloor1)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_TETRIARY.getValue(), new ColorPalette.Color.Themed(R$attr.layerFloor2)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_QUATERNARY.getValue(), new ColorPalette.Color.Themed(R$attr.layerSurface)), new Pair(OzColor.OZ_SEMANTIC_BG_PRIMARY_INVERSE.getValue(), new ColorPalette.Color.Themed(R$attr.bgPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_NOTIFICATION.getValue(), new ColorPalette.Color.Themed(R$attr.graphicPrimaryOnLight)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY_HOVER.getValue(), new ColorPalette.Color.Themed(R$attr.layerActiveFloor0)), new Pair(OzColor.OZ_SEMANTIC_BG_SECONDARY_INVERSE.getValue(), new ColorPalette.Color.Themed(R$attr.bgLightKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_VIDEOPLEER.getValue(), new ColorPalette.Color.Themed(R$attr.graphicDarkKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), new ColorPalette.Color.Themed(R$attr.textPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.textSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_TETRIARY.getValue(), new ColorPalette.Color.Themed(R$attr.textSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_QUATERNARY.getValue(), new ColorPalette.Color.Themed(R$attr.textOriginalpriceAvailable)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R$attr.textLightKey)), new Pair(OzColor.OZ_SEMANTIC_TEXT_ACTION.getValue(), new ColorPalette.Color.Themed(R$attr.textAction)), new Pair(OzColor.OZ_SEMANTIC_TEXT_SALE.getValue(), new ColorPalette.Color.Themed(R$attr.textExpress)), new Pair(OzColor.OZ_SEMANTIC_TEXT_MARKETING.getValue(), new ColorPalette.Color.Themed(R$attr.textMarketing)), new Pair(OzColor.OZ_SEMANTIC_TEXT_POSITIVE.getValue(), new ColorPalette.Color.Themed(R$attr.textPositive)), new Pair(OzColor.OZ_SEMANTIC_TEXT_WARNING.getValue(), new ColorPalette.Color.Themed(R$attr.textWarning)), new Pair(OzColor.OZ_SEMANTIC_TEXT_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R$attr.textNegative)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY.getValue(), new ColorPalette.Color.Themed(R$attr.textAction)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_LIGHT.getValue(), new ColorPalette.Color.Themed(R$attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT.getValue(), new ColorPalette.Color.Themed(R$attr.bgAccentPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT_LIGHT.getValue(), new ColorPalette.Color.Themed(R$attr.bgAccentSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgAccentSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.graphicPositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_LIGHT.getValue(), new ColorPalette.Color.Themed(R$attr.graphicPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.graphicPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_FEED_2.getValue(), new ColorPalette.Color.Themed(R$attr.clearDarkKey600)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT_HOVER.getValue(), new ColorPalette.Color.Themed(R$attr.graphicActiveAccentPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_HOVER.getValue(), new ColorPalette.Color.Themed(R$attr.graphicActiveActionPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_HOVER.getValue(), new ColorPalette.Color.Themed(R$attr.graphicActivePositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PREMIUM.getValue(), new ColorPalette.Color.Themed(R$attr.graphicActivePremium)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PREMIUM_BLUE.getValue(), new ColorPalette.Color.Raw(R$color.graphic_premium_blue)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CO_PURCHASE.getValue(), new ColorPalette.Color.Themed(R$attr.graphicNegativePrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_RATING.getValue(), new ColorPalette.Color.Themed(R$attr.graphicRating)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CREDIT.getValue(), new ColorPalette.Color.Raw(R$color.bg_instalment_secondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_RIPPLE.getValue(), new ColorPalette.Color.Themed(R$attr.graphicSecondaryOnLight)), new Pair(OzColor.OZ_SEMANTIC_COLOR_SHADOW_SPREAD.getValue(), new ColorPalette.Color.Themed(R$attr.clearDarkKey400)), new Pair(OzColor.OZ_SEMANTIC_VZHUH_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_LIGHT.getValue(), new ColorPalette.Color.Themed(R$attr.bgFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_HOVER.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_WHITE_OVERLAY_25.getValue(), new ColorPalette.Color.Themed(R$attr.graphicSecondaryOnDark)), new Pair(OzColor.OZ_SEMANTIC_WARNING_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgWarningPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_OVERLAY.getValue(), new ColorPalette.Color.Themed(R$attr.bgLightKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_OZON_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R$attr.bgNegativePrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEGATIVE_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_NEGATIVE_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_FRESH.getValue(), new ColorPalette.Color.Themed(R$attr.bgFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_FRESH_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_FRESH.getValue(), new ColorPalette.Color.Themed(R$attr.textFresh)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_FRESH.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_FRESH_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_PRIMARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgActionPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_SALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgExpressPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_SALE_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgExpressSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING.getValue(), new ColorPalette.Color.Themed(R$attr.bgMarketingPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgMarketingSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgMarketingSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE.getValue(), new ColorPalette.Color.Themed(R$attr.bgPositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING.getValue(), new ColorPalette.Color.Themed(R$attr.bgWarningPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEUTRAL.getValue(), new ColorPalette.Color.Themed(R$attr.graphicPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_NEUTRAL_SECONDARY.getValue(), new ColorPalette.Color.Themed(R$attr.layerOverlayParanja)), new Pair(OzColor.OZ_SEMANTIC_HOVER_PRIMARY.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveActionPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_SALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveExpressPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_SALE_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveExpressSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_MARKETING.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveMarketingPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_MARKETING_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveMarketingSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_POSITIVE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActivePositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_POSITIVE_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActivePositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_WARNING.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveWarningPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_WARNING_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveNegativePrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEGATIVE_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEUTRAL.getValue(), new ColorPalette.Color.Themed(R$attr.bgActivePremiumPrimaryInverted)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEUTRAL_PALE.getValue(), new ColorPalette.Color.Themed(R$attr.bgActiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_DARKER.getValue(), new ColorPalette.Color.Themed(R$attr.layerActiveSurface)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_LIGHTER.getValue(), new ColorPalette.Color.Themed(R$attr.layerActiveSurfaceInverted)), new Pair(OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE_100.getValue(), new ColorPalette.Color.Themed(R$attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_SALE_PALE_100.getValue(), new ColorPalette.Color.Themed(R$attr.bgExpressSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_FRESH_PALE_100.getValue(), new ColorPalette.Color.Themed(R$attr.bgFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING_PALE_100.getValue(), new ColorPalette.Color.Raw(R$color.bg_marketing_secondary_solid)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE_PALE_100.getValue(), new ColorPalette.Color.Themed(R$attr.bgPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING_PALE_100.getValue(), new ColorPalette.Color.Themed(R$attr.bgWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEGATIVE_PALE_100.getValue(), new ColorPalette.Color.Themed(R$attr.bgNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE_100.getValue(), new ColorPalette.Color.Themed(R$attr.bgPremiumPrimary)));

        private DsColorPalette() {
        }

        @Override // ru.ozon.uni.android.uikit.common.StyleParser.ColorPalette
        @NotNull
        public Map<String, ColorPalette.Color> getTokenColorMap() {
            return tokenColorMap;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$NewColorPalette;", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette;", "<init>", "()V", "tokenColorMap", "", "", "Lru/ozon/uni/android/uikit/common/StyleParser$ColorPalette$Color;", "getTokenColorMap", "()Ljava/util/Map;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class NewColorPalette implements ColorPalette {

        @NotNull
        public static final NewColorPalette INSTANCE = new NewColorPalette();

        @NotNull
        private static final Map<String, ColorPalette.Color> tokenColorMap;

        static {
            Map<String, ColorPalette.Color> map;
            Map<String, ColorPalette.Color> tokenColorMap2 = DsColorPalette.INSTANCE.getTokenColorMap();
            List pairs = StyleParser.colorTokenMap;
            Intrinsics.checkNotNullParameter(tokenColorMap2, "<this>");
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            if (tokenColorMap2.isEmpty()) {
                map = U.s(pairs);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(tokenColorMap2);
                U.p(linkedHashMap, pairs);
                map = linkedHashMap;
            }
            tokenColorMap = map;
        }

        private NewColorPalette() {
        }

        public Integer getColorResource(@NotNull Context context, @NotNull String str) {
            return ColorPalette.DefaultImpls.getColorResource(this, context, str);
        }

        @Override // ru.ozon.uni.android.uikit.common.StyleParser.ColorPalette
        @NotNull
        public Map<String, ColorPalette.Color> getTokenColorMap() {
            return tokenColorMap;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0092\u0001\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001¨\u0006\u0095\u0001"}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OZ_COLOR_WHITE_1", "OZ_COLOR_WHITE_2", "OZ_COLOR_GRAY_90", "OZ_COLOR_GRAY_80", "OZ_COLOR_GRAY_70", "OZ_COLOR_GRAY_60", "OZ_COLOR_GRAY_40", "OZ_COLOR_GRAY_30", "OZ_COLOR_GRAY_20", "OZ_COLOR_BLUE", "OZ_COLOR_BLUE_PALE", "OZ_COLOR_BLUE_LIGHT", "OZ_COLOR_GREEN_UI", "OZ_COLOR_GREEN_UI_HOVER", "OZ_COLOR_BLUE_HOVER", "OZ_COLOR_RED", "OZ_COLOR_RED_PALE", "OZ_COLOR_GREEN_PALE", "OZ_COLOR_YELLOW_BRAND", "OZ_COLOR_INDIGO_BRAND", "OZ_COLOR_INDIGO_BRAND_PALE", "OZ_COLOR_AQUA_BRAND_PALE", "OZ_COLOR_AQUA_BRAND", "OZ_COLOR_CATBIRD_EGG_BRAND", "OZ_COLOR_CATBIRD_EGG_BRAND_PALE", "OZ_COLOR_GREEN_BRAND", "OZ_COLOR_GREEN_BRAND_PALE", "OZ_COLOR_ORANGE", "OZ_COLOR_PURPLE", "OZ_COLOR_PURPLE_PALE", "OZ_COLOR_ORANGE_PALE", "OZ_COLOR_BLACK", "OZ_COLOR_HITBOX", "OZ_SEMANTIC_COLOR_WHITE_OVERLAY", "OZ_SEMANTIC_COLOR_WHITE_OVERLAY_2", "OZ_COLOR_WHITE_OVERLAY_2_CONST", "OZ_COLOR_WHITE_OVERLAY_3", "OZ_COLOR_WHITE_OVERLAY_4", "OZ_SEMANTIC_COLOR_DIMMING", "OZ_SEMANTIC_COLOR_PARANDJA", "OZ_SEMANTIC_COLOR_PARANDJA_HOVER", "OZ_SEMANTIC_COLOR_SEPARATOR_DARK", "OZ_SEMANTIC_COLOR_SEPARATOR", "OZ_SEMANTIC_COLOR_BG_PRIMARY", "OZ_SEMANTIC_COLOR_BG_PRIMARY_HOVER", "OZ_SEMANTIC_COLOR_BG_SECONDARY", "OZ_SEMANTIC_COLOR_BG_TETRIARY", "OZ_SEMANTIC_COLOR_BG_QUATERNARY", "OZ_SEMANTIC_COLOR_BG_VIDEOPLEER", "OZ_SEMANTIC_BG_PRIMARY_INVERSE", "OZ_SEMANTIC_BG_SECONDARY_INVERSE", "OZ_SEMANTIC_COLOR_TEXT_PRIMARY", "OZ_SEMANTIC_COLOR_TEXT_SECONDARY", "OZ_SEMANTIC_COLOR_TEXT_TETRIARY", "OZ_SEMANTIC_COLOR_TEXT_QUATERNARY", "OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_LIGHT", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_PALE", "OZ_SEMANTIC_COLOR_ACCENT_ALERT", "OZ_SEMANTIC_COLOR_ACCENT_ALERT_LIGHT", "OZ_SEMANTIC_COLOR_ACCENT_ALERT_PALE", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_LIGHT", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_PALE", "OZ_SEMANTIC_COLOR_ACCENT_FEED_2", "OZ_SEMANTIC_COLOR_PREMIUM", "OZ_SEMANTIC_COLOR_PREMIUM_BLUE", "OZ_SEMANTIC_COLOR_CO_PURCHASE", "OZ_SEMANTIC_COLOR_RATING", "OZ_SEMANTIC_COLOR_CREDIT", "OZ_SEMANTIC_COLOR_RIPPLE", "OZ_SEMANTIC_COLOR_SHADOW_SPREAD", "OZ_SEMANTIC_COLOR_ACCENT_ALERT_HOVER", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_HOVER", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_HOVER", "OZ_SEMANTIC_COLOR_HOVER_DARKER", "OZ_SEMANTIC_COLOR_HOVER_LIGHTER", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_LIGHT", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_PALE", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_HOVER", "OZ_SEMANTIC_COLOR_WHITE_OVERLAY_25", "OZ_SEMANTIC_COLOR_CTRL_OVERLAY", "OZ_SEMANTIC_COLOR_CTRL_OZON_SECONDARY", "OZ_SEMANTIC_COLOR_CTRL_NEGATIVE", "OZ_SEMANTIC_COLOR_CTRL_NEGATIVE_SECONDARY", "OZ_SEMANTIC_COLOR_CTRL_NEUTRAL_SECONDARY", "OZ_SEMANTIC_COLOR_BUTTON_VIDEO_CONTROL", "OZ_SEMANTIC_VZHUH_PALE", "OZ_SEMANTIC_COLOR_BG_NOTIFICATION", "OZ_SEMANTIC_WARNING_SECONDARY", "OZ_SEMANTIC_COLOR_CTRL_FRESH", "OZ_SEMANTIC_COLOR_CTRL_FRESH_PALE", "OZ_SEMANTIC_COLOR_TEXT_FRESH", "OZ_SEMANTIC_COLOR_HOVER_FRESH", "OZ_SEMANTIC_COLOR_HOVER_FRESH_PALE", "OZ_SEMANTIC_CTRL_PRIMARY", "OZ_SEMANTIC_CTRL_PRIMARY_PALE", "OZ_SEMANTIC_CTRL_SALE", "OZ_SEMANTIC_CTRL_SALE_PALE", "OZ_SEMANTIC_CTRL_MARKETING", "OZ_SEMANTIC_CTRL_MARKETING_PALE", "OZ_SEMANTIC_CTRL_MARKETING_SECONDARY", "OZ_SEMANTIC_CTRL_POSITIVE", "OZ_SEMANTIC_CTRL_POSITIVE_PALE", "OZ_SEMANTIC_CTRL_POSITIVE_SECONDARY", "OZ_SEMANTIC_CTRL_WARNING", "OZ_SEMANTIC_CTRL_WARNING_PALE", "OZ_SEMANTIC_CTRL_WARNING_SECONDARY", "OZ_SEMANTIC_CTRL_NEGATIVE_PALE", "OZ_SEMANTIC_CTRL_NEUTRAL", "OZ_SEMANTIC_CTRL_NEUTRAL_PALE", "OZ_SEMANTIC_TEXT_ACTION", "OZ_SEMANTIC_TEXT_SALE", "OZ_SEMANTIC_TEXT_MARKETING", "OZ_SEMANTIC_TEXT_POSITIVE", "OZ_SEMANTIC_TEXT_WARNING", "OZ_SEMANTIC_TEXT_NEGATIVE", "OZ_SEMANTIC_HOVER_PRIMARY", "OZ_SEMANTIC_HOVER_PRIMARY_PALE", "OZ_SEMANTIC_HOVER_SALE", "OZ_SEMANTIC_HOVER_SALE_PALE", "OZ_SEMANTIC_HOVER_MARKETING", "OZ_SEMANTIC_HOVER_MARKETING_PALE", "OZ_SEMANTIC_HOVER_POSITIVE", "OZ_SEMANTIC_HOVER_POSITIVE_PALE", "OZ_SEMANTIC_HOVER_WARNING", "OZ_SEMANTIC_HOVER_WARNING_PALE", "OZ_SEMANTIC_HOVER_NEGATIVE", "OZ_SEMANTIC_HOVER_NEGATIVE_PALE", "OZ_SEMANTIC_HOVER_NEUTRAL", "OZ_SEMANTIC_HOVER_NEUTRAL_PALE", "OZ_SEMANTIC_CTRL_PRIMARY_PALE_100", "OZ_SEMANTIC_CTRL_SALE_PALE_100", "OZ_SEMANTIC_CTRL_FRESH_PALE_100", "OZ_SEMANTIC_CTRL_MARKETING_PALE_100", "OZ_SEMANTIC_CTRL_POSITIVE_PALE_100", "OZ_SEMANTIC_CTRL_WARNING_PALE_100", "OZ_SEMANTIC_CTRL_NEGATIVE_PALE_100", "OZ_SEMANTIC_CTRL_NEUTRAL_PALE_100", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OzColor {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OzColor[] $VALUES;

        @NotNull
        private final String value;
        public static final OzColor OZ_COLOR_WHITE_1 = new OzColor("OZ_COLOR_WHITE_1", 0, "ozwhite1");
        public static final OzColor OZ_COLOR_WHITE_2 = new OzColor("OZ_COLOR_WHITE_2", 1, "ozwhite2");
        public static final OzColor OZ_COLOR_GRAY_90 = new OzColor("OZ_COLOR_GRAY_90", 2, "ozgray90");
        public static final OzColor OZ_COLOR_GRAY_80 = new OzColor("OZ_COLOR_GRAY_80", 3, "ozgray80");
        public static final OzColor OZ_COLOR_GRAY_70 = new OzColor("OZ_COLOR_GRAY_70", 4, "ozgray70");
        public static final OzColor OZ_COLOR_GRAY_60 = new OzColor("OZ_COLOR_GRAY_60", 5, "ozgray60");
        public static final OzColor OZ_COLOR_GRAY_40 = new OzColor("OZ_COLOR_GRAY_40", 6, "ozgray40");
        public static final OzColor OZ_COLOR_GRAY_30 = new OzColor("OZ_COLOR_GRAY_30", 7, "ozgray30");
        public static final OzColor OZ_COLOR_GRAY_20 = new OzColor("OZ_COLOR_GRAY_20", 8, "ozgray20");
        public static final OzColor OZ_COLOR_BLUE = new OzColor("OZ_COLOR_BLUE", 9, "ozblue");
        public static final OzColor OZ_COLOR_BLUE_PALE = new OzColor("OZ_COLOR_BLUE_PALE", 10, "ozbluepale");
        public static final OzColor OZ_COLOR_BLUE_LIGHT = new OzColor("OZ_COLOR_BLUE_LIGHT", 11, "ozbluelight");
        public static final OzColor OZ_COLOR_GREEN_UI = new OzColor("OZ_COLOR_GREEN_UI", 12, "ozgreenui");
        public static final OzColor OZ_COLOR_GREEN_UI_HOVER = new OzColor("OZ_COLOR_GREEN_UI_HOVER", 13, "ozgreenuihover");
        public static final OzColor OZ_COLOR_BLUE_HOVER = new OzColor("OZ_COLOR_BLUE_HOVER", 14, "ozbluehover");
        public static final OzColor OZ_COLOR_RED = new OzColor("OZ_COLOR_RED", 15, "ozred");
        public static final OzColor OZ_COLOR_RED_PALE = new OzColor("OZ_COLOR_RED_PALE", 16, "ozredpale");
        public static final OzColor OZ_COLOR_GREEN_PALE = new OzColor("OZ_COLOR_GREEN_PALE", 17, "ozgreenpale");
        public static final OzColor OZ_COLOR_YELLOW_BRAND = new OzColor("OZ_COLOR_YELLOW_BRAND", 18, "ozyellowbrand");
        public static final OzColor OZ_COLOR_INDIGO_BRAND = new OzColor("OZ_COLOR_INDIGO_BRAND", 19, "ozindigobrand");
        public static final OzColor OZ_COLOR_INDIGO_BRAND_PALE = new OzColor("OZ_COLOR_INDIGO_BRAND_PALE", 20, "ozindigobrandpale");
        public static final OzColor OZ_COLOR_AQUA_BRAND_PALE = new OzColor("OZ_COLOR_AQUA_BRAND_PALE", 21, "ozaquabrandpale");
        public static final OzColor OZ_COLOR_AQUA_BRAND = new OzColor("OZ_COLOR_AQUA_BRAND", 22, "ozaquabrand");
        public static final OzColor OZ_COLOR_CATBIRD_EGG_BRAND = new OzColor("OZ_COLOR_CATBIRD_EGG_BRAND", 23, "ozcatbirdeggbrand");
        public static final OzColor OZ_COLOR_CATBIRD_EGG_BRAND_PALE = new OzColor("OZ_COLOR_CATBIRD_EGG_BRAND_PALE", 24, "ozcatbirdeggbrandpale");
        public static final OzColor OZ_COLOR_GREEN_BRAND = new OzColor("OZ_COLOR_GREEN_BRAND", 25, "ozgreenbrand");
        public static final OzColor OZ_COLOR_GREEN_BRAND_PALE = new OzColor("OZ_COLOR_GREEN_BRAND_PALE", 26, "ozgreenbrandpale");
        public static final OzColor OZ_COLOR_ORANGE = new OzColor("OZ_COLOR_ORANGE", 27, "ozorange");
        public static final OzColor OZ_COLOR_PURPLE = new OzColor("OZ_COLOR_PURPLE", 28, "ozpurple");
        public static final OzColor OZ_COLOR_PURPLE_PALE = new OzColor("OZ_COLOR_PURPLE_PALE", 29, "ozpurplepale");
        public static final OzColor OZ_COLOR_ORANGE_PALE = new OzColor("OZ_COLOR_ORANGE_PALE", 30, "ozorangepale");
        public static final OzColor OZ_COLOR_BLACK = new OzColor("OZ_COLOR_BLACK", 31, "ozblack");
        public static final OzColor OZ_COLOR_HITBOX = new OzColor("OZ_COLOR_HITBOX", 32, "ozhitbox");
        public static final OzColor OZ_SEMANTIC_COLOR_WHITE_OVERLAY = new OzColor("OZ_SEMANTIC_COLOR_WHITE_OVERLAY", 33, "ozwhiteoverlay");
        public static final OzColor OZ_SEMANTIC_COLOR_WHITE_OVERLAY_2 = new OzColor("OZ_SEMANTIC_COLOR_WHITE_OVERLAY_2", 34, "ozwhiteoverlay2");
        public static final OzColor OZ_COLOR_WHITE_OVERLAY_2_CONST = new OzColor("OZ_COLOR_WHITE_OVERLAY_2_CONST", 35, "ozwhiteoverlay2const");
        public static final OzColor OZ_COLOR_WHITE_OVERLAY_3 = new OzColor("OZ_COLOR_WHITE_OVERLAY_3", 36, "ozwhiteoverlay3");
        public static final OzColor OZ_COLOR_WHITE_OVERLAY_4 = new OzColor("OZ_COLOR_WHITE_OVERLAY_4", 37, "ozwhiteoverlay4");
        public static final OzColor OZ_SEMANTIC_COLOR_DIMMING = new OzColor("OZ_SEMANTIC_COLOR_DIMMING", 38, "ozdimming");
        public static final OzColor OZ_SEMANTIC_COLOR_PARANDJA = new OzColor("OZ_SEMANTIC_COLOR_PARANDJA", 39, "ozparandja");
        public static final OzColor OZ_SEMANTIC_COLOR_PARANDJA_HOVER = new OzColor("OZ_SEMANTIC_COLOR_PARANDJA_HOVER", 40, "ozparandjahover");
        public static final OzColor OZ_SEMANTIC_COLOR_SEPARATOR_DARK = new OzColor("OZ_SEMANTIC_COLOR_SEPARATOR_DARK", 41, "ozseparatordark");
        public static final OzColor OZ_SEMANTIC_COLOR_SEPARATOR = new OzColor("OZ_SEMANTIC_COLOR_SEPARATOR", 42, "ozseparator");
        public static final OzColor OZ_SEMANTIC_COLOR_BG_PRIMARY = new OzColor("OZ_SEMANTIC_COLOR_BG_PRIMARY", 43, "ozbgprimary");
        public static final OzColor OZ_SEMANTIC_COLOR_BG_PRIMARY_HOVER = new OzColor("OZ_SEMANTIC_COLOR_BG_PRIMARY_HOVER", 44, "ozbgprimaryhover");
        public static final OzColor OZ_SEMANTIC_COLOR_BG_SECONDARY = new OzColor("OZ_SEMANTIC_COLOR_BG_SECONDARY", 45, "ozbgsecondary");
        public static final OzColor OZ_SEMANTIC_COLOR_BG_TETRIARY = new OzColor("OZ_SEMANTIC_COLOR_BG_TETRIARY", 46, "ozbgtetriary");
        public static final OzColor OZ_SEMANTIC_COLOR_BG_QUATERNARY = new OzColor("OZ_SEMANTIC_COLOR_BG_QUATERNARY", 47, "ozbgquaternary");
        public static final OzColor OZ_SEMANTIC_COLOR_BG_VIDEOPLEER = new OzColor("OZ_SEMANTIC_COLOR_BG_VIDEOPLEER", 48, "ozbgvideopleer");
        public static final OzColor OZ_SEMANTIC_BG_PRIMARY_INVERSE = new OzColor("OZ_SEMANTIC_BG_PRIMARY_INVERSE", 49, "ozbgprimaryinverse");
        public static final OzColor OZ_SEMANTIC_BG_SECONDARY_INVERSE = new OzColor("OZ_SEMANTIC_BG_SECONDARY_INVERSE", 50, "ozbgsecondaryinverse");
        public static final OzColor OZ_SEMANTIC_COLOR_TEXT_PRIMARY = new OzColor("OZ_SEMANTIC_COLOR_TEXT_PRIMARY", 51, "oztextprimary");
        public static final OzColor OZ_SEMANTIC_COLOR_TEXT_SECONDARY = new OzColor("OZ_SEMANTIC_COLOR_TEXT_SECONDARY", 52, "oztextsecondary");
        public static final OzColor OZ_SEMANTIC_COLOR_TEXT_TETRIARY = new OzColor("OZ_SEMANTIC_COLOR_TEXT_TETRIARY", 53, "oztexttetriary");
        public static final OzColor OZ_SEMANTIC_COLOR_TEXT_QUATERNARY = new OzColor("OZ_SEMANTIC_COLOR_TEXT_QUATERNARY", 54, "oztextquaternary");
        public static final OzColor OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE = new OzColor("OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE", 55, "oztextprimarynegative");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_PRIMARY = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_PRIMARY", 56, "ozaccentprimary");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_LIGHT = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_LIGHT", 57, "ozaccentprimarylight");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_PALE = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_PALE", 58, "ozaccentprimarypale");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_ALERT = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_ALERT", 59, "ozaccentalert");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_ALERT_LIGHT = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_ALERT_LIGHT", 60, "ozaccentalertlight");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_ALERT_PALE = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_ALERT_PALE", 61, "ozaccentalertpale");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_SECONDARY = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_SECONDARY", 62, "ozaccentsecondary");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_LIGHT = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_LIGHT", 63, "ozaccentsecondarylight");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_PALE = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_PALE", 64, "ozaccentsecondarypale");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_FEED_2 = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_FEED_2", 65, "ozaccentfeed2");
        public static final OzColor OZ_SEMANTIC_COLOR_PREMIUM = new OzColor("OZ_SEMANTIC_COLOR_PREMIUM", 66, "ozpremium");
        public static final OzColor OZ_SEMANTIC_COLOR_PREMIUM_BLUE = new OzColor("OZ_SEMANTIC_COLOR_PREMIUM_BLUE", 67, "ozpremiumblue");
        public static final OzColor OZ_SEMANTIC_COLOR_CO_PURCHASE = new OzColor("OZ_SEMANTIC_COLOR_CO_PURCHASE", 68, "ozcopurchase");
        public static final OzColor OZ_SEMANTIC_COLOR_RATING = new OzColor("OZ_SEMANTIC_COLOR_RATING", 69, "ozrating");
        public static final OzColor OZ_SEMANTIC_COLOR_CREDIT = new OzColor("OZ_SEMANTIC_COLOR_CREDIT", 70, "ozcredit");
        public static final OzColor OZ_SEMANTIC_COLOR_RIPPLE = new OzColor("OZ_SEMANTIC_COLOR_RIPPLE", 71, "ozripple");
        public static final OzColor OZ_SEMANTIC_COLOR_SHADOW_SPREAD = new OzColor("OZ_SEMANTIC_COLOR_SHADOW_SPREAD", 72, "ozshadowspread");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_ALERT_HOVER = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_ALERT_HOVER", 73, "ozaccentalerthover");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_HOVER = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_HOVER", 74, "ozaccentprimaryhover");
        public static final OzColor OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_HOVER = new OzColor("OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_HOVER", 75, "ozaccentsecondaryhover");
        public static final OzColor OZ_SEMANTIC_COLOR_HOVER_DARKER = new OzColor("OZ_SEMANTIC_COLOR_HOVER_DARKER", 76, "ozhoverdarker");
        public static final OzColor OZ_SEMANTIC_COLOR_HOVER_LIGHTER = new OzColor("OZ_SEMANTIC_COLOR_HOVER_LIGHTER", 77, "ozhoverlighter");
        public static final OzColor OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY = new OzColor("OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY", 78, "ozexpressaccentprimary");
        public static final OzColor OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_LIGHT = new OzColor("OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_LIGHT", 79, "ozexpressaccentprimarylight");
        public static final OzColor OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_PALE = new OzColor("OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_PALE", 80, "ozexpressaccentprimarypale");
        public static final OzColor OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_HOVER = new OzColor("OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_HOVER", 81, "ozexpressaccentprimaryhover");
        public static final OzColor OZ_SEMANTIC_COLOR_WHITE_OVERLAY_25 = new OzColor("OZ_SEMANTIC_COLOR_WHITE_OVERLAY_25", 82, "ozwhiteoverlay25");
        public static final OzColor OZ_SEMANTIC_COLOR_CTRL_OVERLAY = new OzColor("OZ_SEMANTIC_COLOR_CTRL_OVERLAY", 83, "ozctrloverlay");
        public static final OzColor OZ_SEMANTIC_COLOR_CTRL_OZON_SECONDARY = new OzColor("OZ_SEMANTIC_COLOR_CTRL_OZON_SECONDARY", 84, "ozctrlozonsecondary");
        public static final OzColor OZ_SEMANTIC_COLOR_CTRL_NEGATIVE = new OzColor("OZ_SEMANTIC_COLOR_CTRL_NEGATIVE", 85, "ozctrlnegative");
        public static final OzColor OZ_SEMANTIC_COLOR_CTRL_NEGATIVE_SECONDARY = new OzColor("OZ_SEMANTIC_COLOR_CTRL_NEGATIVE_SECONDARY", 86, "ozctrlnegativesecondary");
        public static final OzColor OZ_SEMANTIC_COLOR_CTRL_NEUTRAL_SECONDARY = new OzColor("OZ_SEMANTIC_COLOR_CTRL_NEUTRAL_SECONDARY", 87, "ozctrlneutralsecondary");
        public static final OzColor OZ_SEMANTIC_COLOR_BUTTON_VIDEO_CONTROL = new OzColor("OZ_SEMANTIC_COLOR_BUTTON_VIDEO_CONTROL", 88, "ozbuttonvideocontrol");
        public static final OzColor OZ_SEMANTIC_VZHUH_PALE = new OzColor("OZ_SEMANTIC_VZHUH_PALE", 89, "ozvzhuhpale");
        public static final OzColor OZ_SEMANTIC_COLOR_BG_NOTIFICATION = new OzColor("OZ_SEMANTIC_COLOR_BG_NOTIFICATION", 90, "ozbgnotification");
        public static final OzColor OZ_SEMANTIC_WARNING_SECONDARY = new OzColor("OZ_SEMANTIC_WARNING_SECONDARY", 91, "ozwarningsecondary");
        public static final OzColor OZ_SEMANTIC_COLOR_CTRL_FRESH = new OzColor("OZ_SEMANTIC_COLOR_CTRL_FRESH", 92, "ozctrlfresh");
        public static final OzColor OZ_SEMANTIC_COLOR_CTRL_FRESH_PALE = new OzColor("OZ_SEMANTIC_COLOR_CTRL_FRESH_PALE", 93, "ozctrlfreshpale");
        public static final OzColor OZ_SEMANTIC_COLOR_TEXT_FRESH = new OzColor("OZ_SEMANTIC_COLOR_TEXT_FRESH", 94, "oztextfresh");
        public static final OzColor OZ_SEMANTIC_COLOR_HOVER_FRESH = new OzColor("OZ_SEMANTIC_COLOR_HOVER_FRESH", 95, "ozhoverfresh");
        public static final OzColor OZ_SEMANTIC_COLOR_HOVER_FRESH_PALE = new OzColor("OZ_SEMANTIC_COLOR_HOVER_FRESH_PALE", 96, "ozhoverfreshpale");
        public static final OzColor OZ_SEMANTIC_CTRL_PRIMARY = new OzColor("OZ_SEMANTIC_CTRL_PRIMARY", 97, "ozctrlprimary");
        public static final OzColor OZ_SEMANTIC_CTRL_PRIMARY_PALE = new OzColor("OZ_SEMANTIC_CTRL_PRIMARY_PALE", 98, "ozctrlprimarypale");
        public static final OzColor OZ_SEMANTIC_CTRL_SALE = new OzColor("OZ_SEMANTIC_CTRL_SALE", 99, "ozctrlsale");
        public static final OzColor OZ_SEMANTIC_CTRL_SALE_PALE = new OzColor("OZ_SEMANTIC_CTRL_SALE_PALE", 100, "ozctrlsalepale");
        public static final OzColor OZ_SEMANTIC_CTRL_MARKETING = new OzColor("OZ_SEMANTIC_CTRL_MARKETING", 101, "ozctrlmarketing");
        public static final OzColor OZ_SEMANTIC_CTRL_MARKETING_PALE = new OzColor("OZ_SEMANTIC_CTRL_MARKETING_PALE", 102, "ozctrlmarketingpale");
        public static final OzColor OZ_SEMANTIC_CTRL_MARKETING_SECONDARY = new OzColor("OZ_SEMANTIC_CTRL_MARKETING_SECONDARY", 103, "ozctrlmarketingsecondary");
        public static final OzColor OZ_SEMANTIC_CTRL_POSITIVE = new OzColor("OZ_SEMANTIC_CTRL_POSITIVE", 104, "ozctrlpositive");
        public static final OzColor OZ_SEMANTIC_CTRL_POSITIVE_PALE = new OzColor("OZ_SEMANTIC_CTRL_POSITIVE_PALE", 105, "ozctrlpositivepale");
        public static final OzColor OZ_SEMANTIC_CTRL_POSITIVE_SECONDARY = new OzColor("OZ_SEMANTIC_CTRL_POSITIVE_SECONDARY", 106, "ozctrlpositivesecondary");
        public static final OzColor OZ_SEMANTIC_CTRL_WARNING = new OzColor("OZ_SEMANTIC_CTRL_WARNING", 107, "ozctrlwarning");
        public static final OzColor OZ_SEMANTIC_CTRL_WARNING_PALE = new OzColor("OZ_SEMANTIC_CTRL_WARNING_PALE", 108, "ozctrlwarningpale");
        public static final OzColor OZ_SEMANTIC_CTRL_WARNING_SECONDARY = new OzColor("OZ_SEMANTIC_CTRL_WARNING_SECONDARY", 109, "ozctrlwarningsecondary");
        public static final OzColor OZ_SEMANTIC_CTRL_NEGATIVE_PALE = new OzColor("OZ_SEMANTIC_CTRL_NEGATIVE_PALE", 110, "ozctrlnegativepale");
        public static final OzColor OZ_SEMANTIC_CTRL_NEUTRAL = new OzColor("OZ_SEMANTIC_CTRL_NEUTRAL", 111, "ozctrlneutral");
        public static final OzColor OZ_SEMANTIC_CTRL_NEUTRAL_PALE = new OzColor("OZ_SEMANTIC_CTRL_NEUTRAL_PALE", 112, "ozctrlneutralpale");
        public static final OzColor OZ_SEMANTIC_TEXT_ACTION = new OzColor("OZ_SEMANTIC_TEXT_ACTION", 113, "oztextaction");
        public static final OzColor OZ_SEMANTIC_TEXT_SALE = new OzColor("OZ_SEMANTIC_TEXT_SALE", 114, "oztextsale");
        public static final OzColor OZ_SEMANTIC_TEXT_MARKETING = new OzColor("OZ_SEMANTIC_TEXT_MARKETING", 115, "oztextmarketing");
        public static final OzColor OZ_SEMANTIC_TEXT_POSITIVE = new OzColor("OZ_SEMANTIC_TEXT_POSITIVE", 116, "oztextpositive");
        public static final OzColor OZ_SEMANTIC_TEXT_WARNING = new OzColor("OZ_SEMANTIC_TEXT_WARNING", 117, "oztextwarning");
        public static final OzColor OZ_SEMANTIC_TEXT_NEGATIVE = new OzColor("OZ_SEMANTIC_TEXT_NEGATIVE", 118, "oztextnegative");
        public static final OzColor OZ_SEMANTIC_HOVER_PRIMARY = new OzColor("OZ_SEMANTIC_HOVER_PRIMARY", 119, "ozhoverprimary");
        public static final OzColor OZ_SEMANTIC_HOVER_PRIMARY_PALE = new OzColor("OZ_SEMANTIC_HOVER_PRIMARY_PALE", 120, "ozhoverprimarypale");
        public static final OzColor OZ_SEMANTIC_HOVER_SALE = new OzColor("OZ_SEMANTIC_HOVER_SALE", 121, "ozhoversale");
        public static final OzColor OZ_SEMANTIC_HOVER_SALE_PALE = new OzColor("OZ_SEMANTIC_HOVER_SALE_PALE", 122, "ozhoversalepale");
        public static final OzColor OZ_SEMANTIC_HOVER_MARKETING = new OzColor("OZ_SEMANTIC_HOVER_MARKETING", 123, "ozhovermarketing");
        public static final OzColor OZ_SEMANTIC_HOVER_MARKETING_PALE = new OzColor("OZ_SEMANTIC_HOVER_MARKETING_PALE", 124, "ozhovermarketingpale");
        public static final OzColor OZ_SEMANTIC_HOVER_POSITIVE = new OzColor("OZ_SEMANTIC_HOVER_POSITIVE", 125, "ozhoverpositive");
        public static final OzColor OZ_SEMANTIC_HOVER_POSITIVE_PALE = new OzColor("OZ_SEMANTIC_HOVER_POSITIVE_PALE", 126, "ozhoverpositivepale");
        public static final OzColor OZ_SEMANTIC_HOVER_WARNING = new OzColor("OZ_SEMANTIC_HOVER_WARNING", 127, "ozhoverwarning");
        public static final OzColor OZ_SEMANTIC_HOVER_WARNING_PALE = new OzColor("OZ_SEMANTIC_HOVER_WARNING_PALE", UserVerificationMethods.USER_VERIFY_PATTERN, "ozhoverwarningpale");
        public static final OzColor OZ_SEMANTIC_HOVER_NEGATIVE = new OzColor("OZ_SEMANTIC_HOVER_NEGATIVE", 129, "ozhovernegative");
        public static final OzColor OZ_SEMANTIC_HOVER_NEGATIVE_PALE = new OzColor("OZ_SEMANTIC_HOVER_NEGATIVE_PALE", 130, "ozhovernegativepale");
        public static final OzColor OZ_SEMANTIC_HOVER_NEUTRAL = new OzColor("OZ_SEMANTIC_HOVER_NEUTRAL", 131, "ozhoverneutral");
        public static final OzColor OZ_SEMANTIC_HOVER_NEUTRAL_PALE = new OzColor("OZ_SEMANTIC_HOVER_NEUTRAL_PALE", 132, "ozhoverneutralpale");
        public static final OzColor OZ_SEMANTIC_CTRL_PRIMARY_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_PRIMARY_PALE_100", 133, "ozctrlprimarypale100");
        public static final OzColor OZ_SEMANTIC_CTRL_SALE_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_SALE_PALE_100", 134, "ozctrlsalepale100");
        public static final OzColor OZ_SEMANTIC_CTRL_FRESH_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_FRESH_PALE_100", 135, "ozctrlfreshpale100");
        public static final OzColor OZ_SEMANTIC_CTRL_MARKETING_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_MARKETING_PALE_100", 136, "ozctrlmarketingpale100");
        public static final OzColor OZ_SEMANTIC_CTRL_POSITIVE_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_POSITIVE_PALE_100", 137, "ozctrlpositivepale100");
        public static final OzColor OZ_SEMANTIC_CTRL_WARNING_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_WARNING_PALE_100", 138, "ozctrlwarningpale100");
        public static final OzColor OZ_SEMANTIC_CTRL_NEGATIVE_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_NEGATIVE_PALE_100", 139, "ozctrlnegativepale100");
        public static final OzColor OZ_SEMANTIC_CTRL_NEUTRAL_PALE_100 = new OzColor("OZ_SEMANTIC_CTRL_NEUTRAL_PALE_100", 140, "ozctrlneutralpale100");

        private static final /* synthetic */ OzColor[] $values() {
            return new OzColor[]{OZ_COLOR_WHITE_1, OZ_COLOR_WHITE_2, OZ_COLOR_GRAY_90, OZ_COLOR_GRAY_80, OZ_COLOR_GRAY_70, OZ_COLOR_GRAY_60, OZ_COLOR_GRAY_40, OZ_COLOR_GRAY_30, OZ_COLOR_GRAY_20, OZ_COLOR_BLUE, OZ_COLOR_BLUE_PALE, OZ_COLOR_BLUE_LIGHT, OZ_COLOR_GREEN_UI, OZ_COLOR_GREEN_UI_HOVER, OZ_COLOR_BLUE_HOVER, OZ_COLOR_RED, OZ_COLOR_RED_PALE, OZ_COLOR_GREEN_PALE, OZ_COLOR_YELLOW_BRAND, OZ_COLOR_INDIGO_BRAND, OZ_COLOR_INDIGO_BRAND_PALE, OZ_COLOR_AQUA_BRAND_PALE, OZ_COLOR_AQUA_BRAND, OZ_COLOR_CATBIRD_EGG_BRAND, OZ_COLOR_CATBIRD_EGG_BRAND_PALE, OZ_COLOR_GREEN_BRAND, OZ_COLOR_GREEN_BRAND_PALE, OZ_COLOR_ORANGE, OZ_COLOR_PURPLE, OZ_COLOR_PURPLE_PALE, OZ_COLOR_ORANGE_PALE, OZ_COLOR_BLACK, OZ_COLOR_HITBOX, OZ_SEMANTIC_COLOR_WHITE_OVERLAY, OZ_SEMANTIC_COLOR_WHITE_OVERLAY_2, OZ_COLOR_WHITE_OVERLAY_2_CONST, OZ_COLOR_WHITE_OVERLAY_3, OZ_COLOR_WHITE_OVERLAY_4, OZ_SEMANTIC_COLOR_DIMMING, OZ_SEMANTIC_COLOR_PARANDJA, OZ_SEMANTIC_COLOR_PARANDJA_HOVER, OZ_SEMANTIC_COLOR_SEPARATOR_DARK, OZ_SEMANTIC_COLOR_SEPARATOR, OZ_SEMANTIC_COLOR_BG_PRIMARY, OZ_SEMANTIC_COLOR_BG_PRIMARY_HOVER, OZ_SEMANTIC_COLOR_BG_SECONDARY, OZ_SEMANTIC_COLOR_BG_TETRIARY, OZ_SEMANTIC_COLOR_BG_QUATERNARY, OZ_SEMANTIC_COLOR_BG_VIDEOPLEER, OZ_SEMANTIC_BG_PRIMARY_INVERSE, OZ_SEMANTIC_BG_SECONDARY_INVERSE, OZ_SEMANTIC_COLOR_TEXT_PRIMARY, OZ_SEMANTIC_COLOR_TEXT_SECONDARY, OZ_SEMANTIC_COLOR_TEXT_TETRIARY, OZ_SEMANTIC_COLOR_TEXT_QUATERNARY, OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE, OZ_SEMANTIC_COLOR_ACCENT_PRIMARY, OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_LIGHT, OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_PALE, OZ_SEMANTIC_COLOR_ACCENT_ALERT, OZ_SEMANTIC_COLOR_ACCENT_ALERT_LIGHT, OZ_SEMANTIC_COLOR_ACCENT_ALERT_PALE, OZ_SEMANTIC_COLOR_ACCENT_SECONDARY, OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_LIGHT, OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_PALE, OZ_SEMANTIC_COLOR_ACCENT_FEED_2, OZ_SEMANTIC_COLOR_PREMIUM, OZ_SEMANTIC_COLOR_PREMIUM_BLUE, OZ_SEMANTIC_COLOR_CO_PURCHASE, OZ_SEMANTIC_COLOR_RATING, OZ_SEMANTIC_COLOR_CREDIT, OZ_SEMANTIC_COLOR_RIPPLE, OZ_SEMANTIC_COLOR_SHADOW_SPREAD, OZ_SEMANTIC_COLOR_ACCENT_ALERT_HOVER, OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_HOVER, OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_HOVER, OZ_SEMANTIC_COLOR_HOVER_DARKER, OZ_SEMANTIC_COLOR_HOVER_LIGHTER, OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY, OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_LIGHT, OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_PALE, OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_HOVER, OZ_SEMANTIC_COLOR_WHITE_OVERLAY_25, OZ_SEMANTIC_COLOR_CTRL_OVERLAY, OZ_SEMANTIC_COLOR_CTRL_OZON_SECONDARY, OZ_SEMANTIC_COLOR_CTRL_NEGATIVE, OZ_SEMANTIC_COLOR_CTRL_NEGATIVE_SECONDARY, OZ_SEMANTIC_COLOR_CTRL_NEUTRAL_SECONDARY, OZ_SEMANTIC_COLOR_BUTTON_VIDEO_CONTROL, OZ_SEMANTIC_VZHUH_PALE, OZ_SEMANTIC_COLOR_BG_NOTIFICATION, OZ_SEMANTIC_WARNING_SECONDARY, OZ_SEMANTIC_COLOR_CTRL_FRESH, OZ_SEMANTIC_COLOR_CTRL_FRESH_PALE, OZ_SEMANTIC_COLOR_TEXT_FRESH, OZ_SEMANTIC_COLOR_HOVER_FRESH, OZ_SEMANTIC_COLOR_HOVER_FRESH_PALE, OZ_SEMANTIC_CTRL_PRIMARY, OZ_SEMANTIC_CTRL_PRIMARY_PALE, OZ_SEMANTIC_CTRL_SALE, OZ_SEMANTIC_CTRL_SALE_PALE, OZ_SEMANTIC_CTRL_MARKETING, OZ_SEMANTIC_CTRL_MARKETING_PALE, OZ_SEMANTIC_CTRL_MARKETING_SECONDARY, OZ_SEMANTIC_CTRL_POSITIVE, OZ_SEMANTIC_CTRL_POSITIVE_PALE, OZ_SEMANTIC_CTRL_POSITIVE_SECONDARY, OZ_SEMANTIC_CTRL_WARNING, OZ_SEMANTIC_CTRL_WARNING_PALE, OZ_SEMANTIC_CTRL_WARNING_SECONDARY, OZ_SEMANTIC_CTRL_NEGATIVE_PALE, OZ_SEMANTIC_CTRL_NEUTRAL, OZ_SEMANTIC_CTRL_NEUTRAL_PALE, OZ_SEMANTIC_TEXT_ACTION, OZ_SEMANTIC_TEXT_SALE, OZ_SEMANTIC_TEXT_MARKETING, OZ_SEMANTIC_TEXT_POSITIVE, OZ_SEMANTIC_TEXT_WARNING, OZ_SEMANTIC_TEXT_NEGATIVE, OZ_SEMANTIC_HOVER_PRIMARY, OZ_SEMANTIC_HOVER_PRIMARY_PALE, OZ_SEMANTIC_HOVER_SALE, OZ_SEMANTIC_HOVER_SALE_PALE, OZ_SEMANTIC_HOVER_MARKETING, OZ_SEMANTIC_HOVER_MARKETING_PALE, OZ_SEMANTIC_HOVER_POSITIVE, OZ_SEMANTIC_HOVER_POSITIVE_PALE, OZ_SEMANTIC_HOVER_WARNING, OZ_SEMANTIC_HOVER_WARNING_PALE, OZ_SEMANTIC_HOVER_NEGATIVE, OZ_SEMANTIC_HOVER_NEGATIVE_PALE, OZ_SEMANTIC_HOVER_NEUTRAL, OZ_SEMANTIC_HOVER_NEUTRAL_PALE, OZ_SEMANTIC_CTRL_PRIMARY_PALE_100, OZ_SEMANTIC_CTRL_SALE_PALE_100, OZ_SEMANTIC_CTRL_FRESH_PALE_100, OZ_SEMANTIC_CTRL_MARKETING_PALE_100, OZ_SEMANTIC_CTRL_POSITIVE_PALE_100, OZ_SEMANTIC_CTRL_WARNING_PALE_100, OZ_SEMANTIC_CTRL_NEGATIVE_PALE_100, OZ_SEMANTIC_CTRL_NEUTRAL_PALE_100};
        }

        static {
            OzColor[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private OzColor(String str, int i11, String str2) {
            this.value = str2;
        }

        public static OzColor valueOf(String str) {
            return (OzColor) Enum.valueOf(OzColor.class, str);
        }

        public static OzColor[] values() {
            return (OzColor[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/android/uikit/common/StyleParser$TextStyle;", "", "styleName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStyleName", "()Ljava/lang/String;", "HEAD_XXL", "HEAD_XL", "HEAD_L", "HEAD_M", "HEAD_M_ITALIC", "BODY_L", "BODY_L_BOLD", "BODY_L_BOLD_ITALIC", "BODY_L_LONG", "BODY_M", "BODY_M_BOLD", "BODY_M_BOLD_MONO", "BODY_M_AC", "BODY_M_LONG", "BODY_XL", "BODY_XL_BOLD", "CAPTION", "CAPTION_AC", "CAPTION_ITALIC", "CAPTION_BOLD", "CAPTION_BOLD_MONO", "CAPTION_BOLD_ITALIC", "PROMO_XXL_ITALIC", "BADGE_BOLD_AC", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TextStyle[] $VALUES;

        @NotNull
        private final String styleName;
        public static final TextStyle HEAD_XXL = new TextStyle("HEAD_XXL", 0, "tsheadxxl");
        public static final TextStyle HEAD_XL = new TextStyle("HEAD_XL", 1, "tsheadxl");
        public static final TextStyle HEAD_L = new TextStyle("HEAD_L", 2, "tsheadl");
        public static final TextStyle HEAD_M = new TextStyle("HEAD_M", 3, "tsheadm");
        public static final TextStyle HEAD_M_ITALIC = new TextStyle("HEAD_M_ITALIC", 4, "tsheadmitalic");
        public static final TextStyle BODY_L = new TextStyle("BODY_L", 5, "tsbodyl");
        public static final TextStyle BODY_L_BOLD = new TextStyle("BODY_L_BOLD", 6, "tsbodylbold");
        public static final TextStyle BODY_L_BOLD_ITALIC = new TextStyle("BODY_L_BOLD_ITALIC", 7, "tsbodylbolditalic");
        public static final TextStyle BODY_L_LONG = new TextStyle("BODY_L_LONG", 8, "tsbodyllong");
        public static final TextStyle BODY_M = new TextStyle("BODY_M", 9, "tsbodym");
        public static final TextStyle BODY_M_BOLD = new TextStyle("BODY_M_BOLD", 10, "tsbodymbold");
        public static final TextStyle BODY_M_BOLD_MONO = new TextStyle("BODY_M_BOLD_MONO", 11, "tsbodymboldmono");
        public static final TextStyle BODY_M_AC = new TextStyle("BODY_M_AC", 12, "tsbodymac");
        public static final TextStyle BODY_M_LONG = new TextStyle("BODY_M_LONG", 13, "tsbodymlong");
        public static final TextStyle BODY_XL = new TextStyle("BODY_XL", 14, "tsbodyxl");
        public static final TextStyle BODY_XL_BOLD = new TextStyle("BODY_XL_BOLD", 15, "tsbodyxlbold");
        public static final TextStyle CAPTION = new TextStyle("CAPTION", 16, "tscaption");
        public static final TextStyle CAPTION_AC = new TextStyle("CAPTION_AC", 17, "tscaptionac");
        public static final TextStyle CAPTION_ITALIC = new TextStyle("CAPTION_ITALIC", 18, "tscaptionitalic");
        public static final TextStyle CAPTION_BOLD = new TextStyle("CAPTION_BOLD", 19, "tscaptionbold");
        public static final TextStyle CAPTION_BOLD_MONO = new TextStyle("CAPTION_BOLD_MONO", 20, "tscaptionboldmono");
        public static final TextStyle CAPTION_BOLD_ITALIC = new TextStyle("CAPTION_BOLD_ITALIC", 21, "tscaptionbolditalic");
        public static final TextStyle PROMO_XXL_ITALIC = new TextStyle("PROMO_XXL_ITALIC", 22, "tspromoxxlitalic");
        public static final TextStyle BADGE_BOLD_AC = new TextStyle("BADGE_BOLD_AC", 23, "tsbadgeboldac");

        private static final /* synthetic */ TextStyle[] $values() {
            return new TextStyle[]{HEAD_XXL, HEAD_XL, HEAD_L, HEAD_M, HEAD_M_ITALIC, BODY_L, BODY_L_BOLD, BODY_L_BOLD_ITALIC, BODY_L_LONG, BODY_M, BODY_M_BOLD, BODY_M_BOLD_MONO, BODY_M_AC, BODY_M_LONG, BODY_XL, BODY_XL_BOLD, CAPTION, CAPTION_AC, CAPTION_ITALIC, CAPTION_BOLD, CAPTION_BOLD_MONO, CAPTION_BOLD_ITALIC, PROMO_XXL_ITALIC, BADGE_BOLD_AC};
        }

        static {
            TextStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TextStyle(String str, int i11, String str2) {
            this.styleName = str2;
        }

        public static TextStyle valueOf(String str) {
            return (TextStyle) Enum.valueOf(TextStyle.class, str);
        }

        public static TextStyle[] values() {
            return (TextStyle[]) $VALUES.clone();
        }

        @NotNull
        public final String getStyleName() {
            return this.styleName;
        }
    }

    static {
        a<UniColors> entries = UniColors.getEntries();
        int h11 = U.h(C7714v.z(entries, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (UniColors uniColors : entries) {
            linkedHashMap.put(uniColors.getToken(), Integer.valueOf(uniColors.getResId()));
        }
        a<UniColorsSelect> entries2 = UniColorsSelect.getEntries();
        int h12 = U.h(C7714v.z(entries2, 10));
        if (h12 < 16) {
            h12 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12);
        for (UniColorsSelect uniColorsSelect : entries2) {
            linkedHashMap2.put(uniColorsSelect.getToken(), Integer.valueOf(uniColorsSelect.getResId()));
        }
        UiKitCoreColorMap = U.m(linkedHashMap, linkedHashMap2);
        a<UniTextStyles> entries3 = UniTextStyles.getEntries();
        int h13 = U.h(C7714v.z(entries3, 10));
        if (h13 < 16) {
            h13 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(h13);
        for (Object obj : entries3) {
            linkedHashMap3.put(((UniTextStyles) obj).getToken(), obj);
        }
        UiKitCoreTextStyleMap = linkedHashMap3;
        Pair c11 = C2454a.c(UniTextStyles.HEADLINE_800_X_X_LARGE, TextStyle.HEAD_XXL.getStyleName());
        Pair c12 = C2454a.c(UniTextStyles.HEADLINE_700_X_LARGE, TextStyle.HEAD_XL.getStyleName());
        Pair c13 = C2454a.c(UniTextStyles.HEADLINE_600_MEDIUM, TextStyle.HEAD_L.getStyleName());
        String styleName = TextStyle.HEAD_M.getStyleName();
        UniTextStyles uniTextStyles = UniTextStyles.HEADLINE_500_MEDIUM;
        Pair c14 = C2454a.c(uniTextStyles, styleName);
        Pair c15 = C2454a.c(UniTextStyles.HEADLINE_500_X_MEDIUM, TextStyle.HEAD_M_ITALIC.getStyleName());
        Pair c16 = C2454a.c(UniTextStyles.BODY_500_MEDIUM, TextStyle.BODY_L.getStyleName());
        Pair c17 = C2454a.c(UniTextStyles.BODY_CONTROL_500_MEDIUM, TextStyle.BODY_L_BOLD.getStyleName());
        Pair c18 = C2454a.c(UniTextStyles.HEADLINE_PROMO_400_SMALL, TextStyle.BODY_L_BOLD_ITALIC.getStyleName());
        Pair c19 = C2454a.c(UniTextStyles.BODY_500_SMALL, TextStyle.BODY_L_LONG.getStyleName());
        Pair c21 = C2454a.c(UniTextStyles.COMPACT_400_LARGE, TextStyle.BODY_M.getStyleName());
        String styleName2 = TextStyle.BODY_M_AC.getStyleName();
        UniTextStyles uniTextStyles2 = UniTextStyles.HEADLINE_300_X_SMALL;
        Pair c22 = C2454a.c(uniTextStyles2, styleName2);
        Pair c23 = C2454a.c(UniTextStyles.BODY_CONTROL_400_SMALL, TextStyle.BODY_M_BOLD.getStyleName());
        Pair c24 = C2454a.c(UniTextStyles.BODY_NUMERIC_400_SMALL, TextStyle.BODY_M_BOLD_MONO.getStyleName());
        Pair c25 = C2454a.c(UniTextStyles.BODY_400_LARGE, TextStyle.BODY_M_LONG.getStyleName());
        Pair c26 = C2454a.c(UniTextStyles.BODY_600_MEDIUM, TextStyle.BODY_XL.getStyleName());
        Pair c27 = C2454a.c(uniTextStyles, TextStyle.BODY_XL_BOLD.getStyleName());
        Pair c28 = C2454a.c(UniTextStyles.BODY_300_X_SMALL, TextStyle.CAPTION.getStyleName());
        Pair c29 = C2454a.c(uniTextStyles2, TextStyle.CAPTION_AC.getStyleName());
        String styleName3 = TextStyle.CAPTION_ITALIC.getStyleName();
        UniTextStyles uniTextStyles3 = UniTextStyles.BODY_PROMO_300_X_SMALL;
        newTextStyleTokenMap = U.j(c11, c12, c13, c14, c15, c16, c17, c18, c19, c21, c22, c23, c24, c25, c26, c27, c28, c29, C2454a.c(uniTextStyles3, styleName3), C2454a.c(UniTextStyles.BODY_CONTROL_300_X_SMALL, TextStyle.CAPTION_BOLD.getStyleName()), C2454a.c(UniTextStyles.BODY_NUMERIC_300_X_SMALL, TextStyle.CAPTION_BOLD_MONO.getStyleName()), C2454a.c(uniTextStyles3, TextStyle.CAPTION_BOLD_ITALIC.getStyleName()), C2454a.c(UniTextStyles.KEY_PROMO_700_X_LARGE, TextStyle.PROMO_XXL_ITALIC.getStyleName()), C2454a.c(UniTextStyles.BODY_ACCENT_250_CAPTION, TextStyle.BADGE_BOLD_AC.getStyleName()));
        Map j11 = U.j(w.a("bgDarkKey", new ColorPalette.Color.Themed(R$attr.bgDarkKey)), w.a("bgLightKey", new ColorPalette.Color.Themed(R$attr.bgLightKey)), w.a("clearDarkKey100", new ColorPalette.Color.Themed(R$attr.clearDarkKey100)), w.a("clearDarkKey200", new ColorPalette.Color.Themed(R$attr.clearDarkKey200)), w.a("clearDarkKey300", new ColorPalette.Color.Themed(R$attr.clearDarkKey300)), w.a("clearDarkKey400", new ColorPalette.Color.Themed(R$attr.clearDarkKey400)), w.a("clearDarkKey500", new ColorPalette.Color.Themed(R$attr.clearDarkKey500)), w.a("clearDarkKey600", new ColorPalette.Color.Themed(R$attr.clearDarkKey600)), w.a("clearDarkKey700", new ColorPalette.Color.Themed(R$attr.clearDarkKey700)), w.a("clearDarkKey800", new ColorPalette.Color.Themed(R$attr.clearDarkKey800)), w.a("clearLightKey100", new ColorPalette.Color.Themed(R$attr.clearLightKey100)), w.a("clearLightKey200", new ColorPalette.Color.Themed(R$attr.clearLightKey200)), w.a("clearLightKey300", new ColorPalette.Color.Themed(R$attr.clearLightKey300)), w.a("clearLightKey400", new ColorPalette.Color.Themed(R$attr.clearLightKey400)), w.a("clearLightKey500", new ColorPalette.Color.Themed(R$attr.clearLightKey500)), w.a("clearLightKey600", new ColorPalette.Color.Themed(R$attr.clearLightKey600)), w.a("clearLightKey700", new ColorPalette.Color.Themed(R$attr.clearLightKey700)), w.a("clearLightKey800", new ColorPalette.Color.Themed(R$attr.clearLightKey800)), w.a("graphicActionOnDark", new ColorPalette.Color.Themed(R$attr.graphicActionOnDark)), w.a("graphicActionOnLight", new ColorPalette.Color.Themed(R$attr.graphicActionOnLight)), w.a("graphicDarkKey", new ColorPalette.Color.Themed(R$attr.graphicDarkKey)), w.a("graphicDisabledOnDark", new ColorPalette.Color.Themed(R$attr.graphicDisabledOnDark)), w.a("graphicDisabledOnLight", new ColorPalette.Color.Themed(R$attr.graphicDisabledOnLight)), w.a("graphicLightKey", new ColorPalette.Color.Themed(R$attr.graphicLightKey)), w.a("graphicNeutralOnDark", new ColorPalette.Color.Themed(R$attr.graphicNeutralOnDark)), w.a("graphicNeutralOnLight", new ColorPalette.Color.Themed(R$attr.graphicNeutralOnLight)), w.a("graphicPrimaryOnDark", new ColorPalette.Color.Themed(R$attr.graphicPrimaryOnDark)), w.a("graphicPrimaryOnLight", new ColorPalette.Color.Themed(R$attr.graphicPrimaryOnLight)), w.a("graphicSecondaryOnDark", new ColorPalette.Color.Themed(R$attr.graphicSecondaryOnDark)), w.a("graphicSecondaryOnLight", new ColorPalette.Color.Themed(R$attr.graphicSecondaryOnLight)), w.a("graphicTertiaryOnDark", new ColorPalette.Color.Themed(R$attr.graphicTertiaryOnDark)), w.a("graphicTertiaryOnLight", new ColorPalette.Color.Themed(R$attr.graphicTertiaryOnLight)), w.a("textActionOnDark", new ColorPalette.Color.Themed(R$attr.textActionOnDark)), w.a("textActionOnLight", new ColorPalette.Color.Themed(R$attr.textActionOnLight)), w.a("textDarkKey", new ColorPalette.Color.Themed(R$attr.textDarkKey)), w.a("textLightKey", new ColorPalette.Color.Themed(R$attr.textLightKey)), w.a("textPrimaryOnDark", new ColorPalette.Color.Themed(R$attr.textPrimaryOnDark)), w.a("textPrimaryOnLight", new ColorPalette.Color.Themed(R$attr.textPrimaryOnLight)), w.a("textSecondaryOnDark", new ColorPalette.Color.Themed(R$attr.textSecondaryOnDark)), w.a("textSecondaryOnLight", new ColorPalette.Color.Themed(R$attr.textSecondaryOnLight)), w.a("textTertiaryOnDark", new ColorPalette.Color.Themed(R$attr.textTertiaryOnDark)), w.a("textTertiaryOnLight", new ColorPalette.Color.Themed(R$attr.textTertiaryOnLight)), w.a("bgActiveAccentPrimary", new ColorPalette.Color.Themed(R$attr.bgActiveAccentPrimary)), w.a("bgActiveAccentPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveAccentPrimaryInverted)), w.a("bgActiveAccentSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveAccentSecondary)), w.a("bgActiveAccentSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveAccentSecondaryInverted)), w.a("bgActiveActionPrimary", new ColorPalette.Color.Themed(R$attr.bgActiveActionPrimary)), w.a("bgActiveActionPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveActionPrimaryInverted)), w.a("bgActiveActionSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveActionSecondary)), w.a("bgActiveActionSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveActionSecondaryInverted)), w.a("bgActiveBestpricePrimary", new ColorPalette.Color.Themed(R$attr.bgActiveBestpricePrimary)), w.a("bgActiveBestpricePrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveBestpricePrimaryInverted)), w.a("bgActiveBestpriceSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveBestpriceSecondary)), w.a("bgActiveBestpriceSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveBestpriceSecondaryInverted)), w.a("bgActiveExpressPrimary", new ColorPalette.Color.Themed(R$attr.bgActiveExpressPrimary)), w.a("bgActiveExpressPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveExpressPrimaryInverted)), w.a("bgActiveExpressSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveExpressSecondary)), w.a("bgActiveExpressSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveExpressSecondaryInverted)), w.a("bgActiveFreshPrimary", new ColorPalette.Color.Themed(R$attr.bgActiveFreshPrimary)), w.a("bgActiveFreshPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveFreshPrimaryInverted)), w.a("bgActiveFreshSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveFreshSecondary)), w.a("bgActiveFreshSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveFreshSecondaryInverted)), w.a("bgActiveMarketingPrimary", new ColorPalette.Color.Themed(R$attr.bgActiveMarketingPrimary)), w.a("bgActiveMarketingPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveMarketingPrimaryInverted)), w.a("bgActiveMarketingSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveMarketingSecondary)), w.a("bgActiveMarketingSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveMarketingSecondaryInverted)), w.a("bgActiveNegativePrimary", new ColorPalette.Color.Themed(R$attr.bgActiveNegativePrimary)), w.a("bgActiveNegativePrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveNegativePrimaryInverted)), w.a("bgActiveNegativeSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveNegativeSecondary)), w.a("bgActiveNegativeSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveNegativeSecondaryInverted)), w.a("bgActivePositivePrimary", new ColorPalette.Color.Themed(R$attr.bgActivePositivePrimary)), w.a("bgActivePositivePrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActivePositivePrimaryInverted)), w.a("bgActivePositiveSecondary", new ColorPalette.Color.Themed(R$attr.bgActivePositiveSecondary)), w.a("bgActivePositiveSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActivePositiveSecondaryInverted)), w.a("bgActivePremiumPrimary", new ColorPalette.Color.Themed(R$attr.bgActivePremiumPrimary)), w.a("bgActivePremiumPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActivePremiumPrimaryInverted)), w.a("bgActivePremiumSecondary", new ColorPalette.Color.Themed(R$attr.bgActivePremiumSecondary)), w.a("bgActivePremiumSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActivePremiumSecondaryInverted)), w.a("bgActivePrimary", new ColorPalette.Color.Themed(R$attr.bgActivePrimary)), w.a("bgActivePrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActivePrimaryInverted)), w.a("bgActiveSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveSecondary)), w.a("bgActiveSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveSecondaryInverted)), w.a("bgActiveWarningPrimary", new ColorPalette.Color.Themed(R$attr.bgActiveWarningPrimary)), w.a("bgActiveWarningPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveWarningPrimaryInverted)), w.a("bgActiveWarningSecondary", new ColorPalette.Color.Themed(R$attr.bgActiveWarningSecondary)), w.a("bgActiveWarningSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActiveWarningSecondaryInverted)), w.a("bgAccentOnLight", new ColorPalette.Color.Themed(R$attr.bgAccentOnLight)), w.a("bgAccentPrimary", new ColorPalette.Color.Themed(R$attr.bgAccentPrimary)), w.a("bgAccentPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgAccentPrimaryInverted)), w.a("bgAccentSecondary", new ColorPalette.Color.Themed(R$attr.bgAccentSecondary)), w.a("bgAccentSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgAccentSecondaryInverted)), w.a("bgActionPrimary", new ColorPalette.Color.Themed(R$attr.bgActionPrimary)), w.a("bgActionPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgActionPrimaryInverted)), w.a("bgActionSecondary", new ColorPalette.Color.Themed(R$attr.bgActionSecondary)), w.a("bgActionSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgActionSecondaryInverted)), w.a("bgAquaPrimary", new ColorPalette.Color.Themed(R$attr.bgAquaPrimary)), w.a("bgBestpricePrimary", new ColorPalette.Color.Themed(R$attr.bgBestpricePrimary)), w.a("bgBestpricePrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgBestpricePrimaryInverted)), w.a("bgBestpriceSecondary", new ColorPalette.Color.Themed(R$attr.bgBestpriceSecondary)), w.a("bgBestpriceSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgBestpriceSecondaryInverted)), w.a("bgExpressPrimary", new ColorPalette.Color.Themed(R$attr.bgExpressPrimary)), w.a("bgExpressPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgExpressPrimaryInverted)), w.a("bgExpressSecondary", new ColorPalette.Color.Themed(R$attr.bgExpressSecondary)), w.a("bgExpressSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgExpressSecondaryInverted)), w.a("bgFreshPrimary", new ColorPalette.Color.Themed(R$attr.bgFreshPrimary)), w.a("bgFreshPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgFreshPrimaryInverted)), w.a("bgFreshSecondary", new ColorPalette.Color.Themed(R$attr.bgFreshSecondary)), w.a("bgFreshSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgFreshSecondaryInverted)), w.a("bgMarketingOnLight", new ColorPalette.Color.Themed(R$attr.bgMarketingOnLight)), w.a("bgMarketingPrimary", new ColorPalette.Color.Themed(R$attr.bgMarketingPrimary)), w.a("bgMarketingPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgMarketingPrimaryInverted)), w.a("bgMarketingSecondary", new ColorPalette.Color.Themed(R$attr.bgMarketingSecondary)), w.a("bgMarketingSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgMarketingSecondaryInverted)), w.a("bgNegativePrimary", new ColorPalette.Color.Themed(R$attr.bgNegativePrimary)), w.a("bgNegativePrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgNegativePrimaryInverted)), w.a("bgNegativeSecondary", new ColorPalette.Color.Themed(R$attr.bgNegativeSecondary)), w.a("bgNegativeSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgNegativeSecondaryInverted)), w.a("bgOpaqueActionSecondary", new ColorPalette.Color.Themed(R$attr.bgOpaqueActionSecondary)), w.a("bgOpaqueAccentSecondary", new ColorPalette.Color.Themed(R$attr.bgOpaqueAccentSecondary)), w.a("bgOpaquePositiveSecondary", new ColorPalette.Color.Themed(R$attr.bgOpaquePositiveSecondary)), w.a("bgOpaqueWarningSecondary", new ColorPalette.Color.Themed(R$attr.bgOpaqueWarningSecondary)), w.a("bgOpaqueMarketingSecondary", new ColorPalette.Color.Themed(R$attr.bgOpaqueMarketingSecondary)), w.a("bgPositiveOnLight", new ColorPalette.Color.Themed(R$attr.bgPositiveOnLight)), w.a("bgPositivePrimary", new ColorPalette.Color.Themed(R$attr.bgPositivePrimary)), w.a("bgPositivePrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgPositivePrimaryInverted)), w.a("bgPositiveSecondary", new ColorPalette.Color.Themed(R$attr.bgPositiveSecondary)), w.a("bgPositiveSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgPositiveSecondaryInverted)), w.a("bgPremiumPrimary", new ColorPalette.Color.Themed(R$attr.bgPremiumPrimary)), w.a("bgPremiumPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgPremiumPrimaryInverted)), w.a("bgPremiumSecondary", new ColorPalette.Color.Themed(R$attr.bgPremiumSecondary)), w.a("bgPremiumSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgPremiumSecondaryInverted)), w.a("bgPrimary", new ColorPalette.Color.Themed(R$attr.bgPrimary)), w.a("bgPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgPrimaryInverted)), w.a("bgSecondary", new ColorPalette.Color.Themed(R$attr.bgSecondary)), w.a("bgSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgSecondaryInverted)), w.a("bgWarningOnLight", new ColorPalette.Color.Themed(R$attr.bgWarningOnLight)), w.a("bgWarningPrimary", new ColorPalette.Color.Themed(R$attr.bgWarningPrimary)), w.a("bgWarningPrimaryInverted", new ColorPalette.Color.Themed(R$attr.bgWarningPrimaryInverted)), w.a("bgWarningSecondary", new ColorPalette.Color.Themed(R$attr.bgWarningSecondary)), w.a("bgWarningSecondaryInverted", new ColorPalette.Color.Themed(R$attr.bgWarningSecondaryInverted)), w.a("graphicActiveAccentPrimary", new ColorPalette.Color.Themed(R$attr.graphicActiveAccentPrimary)), w.a("graphicActiveAccentPrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveAccentPrimaryInverted)), w.a("graphicActiveActionPrimary", new ColorPalette.Color.Themed(R$attr.graphicActiveActionPrimary)), w.a("graphicActiveActionPrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveActionPrimaryInverted)), w.a("graphicActiveBestprice", new ColorPalette.Color.Themed(R$attr.graphicActiveBestprice)), w.a("graphicActiveBestpriceInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveBestpriceInverted)), w.a("graphicActiveExpress", new ColorPalette.Color.Themed(R$attr.graphicActiveExpress)), w.a("graphicActiveExpressInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveExpressInverted)), w.a("graphicActiveFresh", new ColorPalette.Color.Themed(R$attr.graphicActiveFresh)), w.a("graphicActiveFreshInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveFreshInverted)), w.a("graphicActiveMarketing", new ColorPalette.Color.Themed(R$attr.graphicActiveMarketing)), w.a("graphicActiveMarketingInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveMarketingInverted)), w.a("graphicActiveNegativePrimary", new ColorPalette.Color.Themed(R$attr.graphicActiveNegativePrimary)), w.a("graphicActiveNegativePrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveNegativePrimaryInverted)), w.a("graphicActivePositivePrimary", new ColorPalette.Color.Themed(R$attr.graphicActivePositivePrimary)), w.a("graphicActivePositivePrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicActivePositivePrimaryInverted)), w.a("graphicActivePremium", new ColorPalette.Color.Themed(R$attr.graphicActivePremium)), w.a("graphicActivePremiumInverted", new ColorPalette.Color.Themed(R$attr.graphicActivePremiumInverted)), w.a("graphicActiveRating", new ColorPalette.Color.Themed(R$attr.graphicActiveRating)), w.a("graphicActiveRatingInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveRatingInverted)), w.a("graphicActiveWarningPrimary", new ColorPalette.Color.Themed(R$attr.graphicActiveWarningPrimary)), w.a("graphicActiveWarningPrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicActiveWarningPrimaryInverted)), w.a("graphicAccentOnLight", new ColorPalette.Color.Themed(R$attr.graphicAccentOnLight)), w.a("graphicAccentPrimary", new ColorPalette.Color.Themed(R$attr.graphicAccentPrimary)), w.a("graphicAccentPrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicAccentPrimaryInverted)), w.a("graphicActionPrimary", new ColorPalette.Color.Themed(R$attr.graphicActionPrimary)), w.a("graphicActionPrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicActionPrimaryInverted)), w.a("graphicBestprice", new ColorPalette.Color.Themed(R$attr.graphicBestprice)), w.a("graphicBestpriceInverted", new ColorPalette.Color.Themed(R$attr.graphicBestpriceInverted)), w.a("graphicDisabled", new ColorPalette.Color.Themed(R$attr.graphicDisabled)), w.a("graphicDisabledInverted", new ColorPalette.Color.Themed(R$attr.graphicDisabledInverted)), w.a("graphicExpress", new ColorPalette.Color.Themed(R$attr.graphicExpress)), w.a("graphicExpressInverted", new ColorPalette.Color.Themed(R$attr.graphicExpressInverted)), w.a("graphicFresh", new ColorPalette.Color.Themed(R$attr.graphicFresh)), w.a("graphicFreshInverted", new ColorPalette.Color.Themed(R$attr.graphicFreshInverted)), w.a("graphicKey", new ColorPalette.Color.Themed(R$attr.graphicKey)), w.a("graphicKeyInverted", new ColorPalette.Color.Themed(R$attr.graphicKeyInverted)), w.a("graphicMarketing", new ColorPalette.Color.Themed(R$attr.graphicMarketing)), w.a("graphicMarketingOnLight", new ColorPalette.Color.Themed(R$attr.graphicMarketingOnLight)), w.a("graphicMarketingInverted", new ColorPalette.Color.Themed(R$attr.graphicMarketingInverted)), w.a("graphicNegativePrimary", new ColorPalette.Color.Themed(R$attr.graphicNegativePrimary)), w.a("graphicNegativePrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicNegativePrimaryInverted)), w.a("graphicNeutral", new ColorPalette.Color.Themed(R$attr.graphicNeutral)), w.a("graphicNeutralInverted", new ColorPalette.Color.Themed(R$attr.graphicNeutralInverted)), w.a("graphicPositiveOnDark", new ColorPalette.Color.Themed(R$attr.graphicPositiveOnDark)), w.a("graphicPositivePrimary", new ColorPalette.Color.Themed(R$attr.graphicPositivePrimary)), w.a("graphicPositivePrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicPositivePrimaryInverted)), w.a("graphicPositiveSecondary", new ColorPalette.Color.Themed(R$attr.graphicPositiveSecondary)), w.a("graphicPremium", new ColorPalette.Color.Themed(R$attr.graphicPremium)), w.a("graphicPremiumInverted", new ColorPalette.Color.Themed(R$attr.graphicPremiumInverted)), w.a("graphicPrimary", new ColorPalette.Color.Themed(R$attr.graphicPrimary)), w.a("graphicPrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicPrimaryInverted)), w.a("graphicRating", new ColorPalette.Color.Themed(R$attr.graphicRating)), w.a("graphicRatingInverted", new ColorPalette.Color.Themed(R$attr.graphicRatingInverted)), w.a("graphicSecondary", new ColorPalette.Color.Themed(R$attr.graphicSecondary)), w.a("graphicSecondaryInverted", new ColorPalette.Color.Themed(R$attr.graphicSecondaryInverted)), w.a("graphicTertiary", new ColorPalette.Color.Themed(R$attr.graphicTertiary)), w.a("graphicTertiaryInverted", new ColorPalette.Color.Themed(R$attr.graphicTertiaryInverted)), w.a("graphicWarningOnDark", new ColorPalette.Color.Themed(R$attr.graphicWarningOnDark)), w.a("graphicWarningPrimary", new ColorPalette.Color.Themed(R$attr.graphicWarningPrimary)), w.a("graphicWarningPrimaryInverted", new ColorPalette.Color.Themed(R$attr.graphicWarningPrimaryInverted)), w.a("layerActiveFloor0", new ColorPalette.Color.Themed(R$attr.layerActiveFloor0)), w.a("layerActiveFloor1", new ColorPalette.Color.Themed(R$attr.layerActiveFloor1)), w.a("layerActiveFloor1Inverted", new ColorPalette.Color.Themed(R$attr.layerActiveFloor1Inverted)), w.a("layerActiveFloor2", new ColorPalette.Color.Themed(R$attr.layerActiveFloor2)), w.a("layerActiveFloor2Inverted", new ColorPalette.Color.Themed(R$attr.layerActiveFloor2Inverted)), w.a("layerActiveFloor3", new ColorPalette.Color.Themed(R$attr.layerActiveFloor3)), w.a("layerActiveFloor3Inverted", new ColorPalette.Color.Themed(R$attr.layerActiveFloor3Inverted)), w.a("layerActiveSurface", new ColorPalette.Color.Themed(R$attr.layerActiveSurface)), w.a("layerActiveSurfaceInverted", new ColorPalette.Color.Themed(R$attr.layerActiveSurfaceInverted)), w.a("layerFloor0", new ColorPalette.Color.Themed(R$attr.layerFloor0)), w.a("layerFloor0Inverted", new ColorPalette.Color.Themed(R$attr.layerFloor0Inverted)), w.a(StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR, new ColorPalette.Color.Themed(R$attr.layerFloor1)), w.a("layerFloor1Inverted", new ColorPalette.Color.Themed(R$attr.layerFloor1Inverted)), w.a("layerFloor2", new ColorPalette.Color.Themed(R$attr.layerFloor2)), w.a("layerFloor2Inverted", new ColorPalette.Color.Themed(R$attr.layerFloor2Inverted)), w.a("layerFloor3", new ColorPalette.Color.Themed(R$attr.layerFloor3)), w.a("layerFloor3Inverted", new ColorPalette.Color.Themed(R$attr.layerFloor3Inverted)), w.a("layerOverlayDimming", new ColorPalette.Color.Themed(R$attr.layerOverlayDimming)), w.a("layerOverlayDimmingInverted", new ColorPalette.Color.Themed(R$attr.layerOverlayDimmingInverted)), w.a("layerOverlayParanja", new ColorPalette.Color.Themed(R$attr.layerOverlayParanja)), w.a("layerOverlayParanjaInverted", new ColorPalette.Color.Themed(R$attr.layerOverlayParanjaInverted)), w.a("layerSurface", new ColorPalette.Color.Themed(R$attr.layerSurface)), w.a("layerSurfaceInverted", new ColorPalette.Color.Themed(R$attr.layerSurfaceInverted)), w.a("textActiveAccent", new ColorPalette.Color.Themed(R$attr.textActiveAccent)), w.a("textActiveAccentInverted", new ColorPalette.Color.Themed(R$attr.textActiveAccentInverted)), w.a("textActiveAction", new ColorPalette.Color.Themed(R$attr.textActiveAction)), w.a("textActiveActionInverted", new ColorPalette.Color.Themed(R$attr.textActiveActionInverted)), w.a("textActiveBestprice", new ColorPalette.Color.Themed(R$attr.textActiveBestprice)), w.a("textActiveBestpriceInverted", new ColorPalette.Color.Themed(R$attr.textActiveBestpriceInverted)), w.a("textActiveExpress", new ColorPalette.Color.Themed(R$attr.textActiveExpress)), w.a("textActiveExpressInverted", new ColorPalette.Color.Themed(R$attr.textActiveExpressInverted)), w.a("textActiveFresh", new ColorPalette.Color.Themed(R$attr.textActiveFresh)), w.a("textActiveFreshInverted", new ColorPalette.Color.Themed(R$attr.textActiveFreshInverted)), w.a("textActiveMarketing", new ColorPalette.Color.Themed(R$attr.textActiveMarketing)), w.a("textActiveMarketingInverted", new ColorPalette.Color.Themed(R$attr.textActiveMarketingInverted)), w.a("textActiveNegative", new ColorPalette.Color.Themed(R$attr.textActiveNegative)), w.a("textActiveNegativeInverted", new ColorPalette.Color.Themed(R$attr.textActiveNegativeInverted)), w.a("textActivePositive", new ColorPalette.Color.Themed(R$attr.textActivePositive)), w.a("textActivePositiveInverted", new ColorPalette.Color.Themed(R$attr.textActivePositiveInverted)), w.a("textActivePremium", new ColorPalette.Color.Themed(R$attr.textActivePremium)), w.a("textActivePremiumInverted", new ColorPalette.Color.Themed(R$attr.textActivePremiumInverted)), w.a("textActiveWarning", new ColorPalette.Color.Themed(R$attr.textActiveWarning)), w.a("textActiveWarningInverted", new ColorPalette.Color.Themed(R$attr.textActiveWarningInverted)), w.a("textAccent", new ColorPalette.Color.Themed(R$attr.textAccent)), w.a("textAccentOnLight", new ColorPalette.Color.Themed(R$attr.textAccentOnLight)), w.a("textAccentInverted", new ColorPalette.Color.Themed(R$attr.textAccentInverted)), w.a("textAction", new ColorPalette.Color.Themed(R$attr.textAction)), w.a("textActionInverted", new ColorPalette.Color.Themed(R$attr.textActionInverted)), w.a("textBestprice", new ColorPalette.Color.Themed(R$attr.textBestprice)), w.a("textBestpriceInverted", new ColorPalette.Color.Themed(R$attr.textBestpriceInverted)), w.a("textDiscountUnavialable", new ColorPalette.Color.Themed(R$attr.textDiscountUnavialable)), w.a("textExpress", new ColorPalette.Color.Themed(R$attr.textExpress)), w.a("textExpressInverted", new ColorPalette.Color.Themed(R$attr.textExpressInverted)), w.a("textFresh", new ColorPalette.Color.Themed(R$attr.textFresh)), w.a("textFreshInverted", new ColorPalette.Color.Themed(R$attr.textFreshInverted)), w.a("textMarketing", new ColorPalette.Color.Themed(R$attr.textMarketing)), w.a("textMarketingOnLight", new ColorPalette.Color.Themed(R$attr.textMarketingOnLight)), w.a("textMarketingInverted", new ColorPalette.Color.Themed(R$attr.textMarketingInverted)), w.a("textNegative", new ColorPalette.Color.Themed(R$attr.textNegative)), w.a("textNegativeInverted", new ColorPalette.Color.Themed(R$attr.textNegativeInverted)), w.a("textOriginalprice", new ColorPalette.Color.Themed(R$attr.textOriginalprice)), w.a("textOriginalpriceAvailable", new ColorPalette.Color.Themed(R$attr.textOriginalpriceAvailable)), w.a("textPositive", new ColorPalette.Color.Themed(R$attr.textPositive)), w.a("textPositiveOnDark", new ColorPalette.Color.Themed(R$attr.textPositiveOnDark)), w.a("textPositiveInverted", new ColorPalette.Color.Themed(R$attr.textPositiveInverted)), w.a("textPremium", new ColorPalette.Color.Themed(R$attr.textPremium)), w.a("textPremiumInverted", new ColorPalette.Color.Themed(R$attr.textPremiumInverted)), w.a("textPrimary", new ColorPalette.Color.Themed(R$attr.textPrimary)), w.a("textPrimaryInverted", new ColorPalette.Color.Themed(R$attr.textPrimaryInverted)), w.a("textSecondary", new ColorPalette.Color.Themed(R$attr.textSecondary)), w.a("textSecondaryInverted", new ColorPalette.Color.Themed(R$attr.textSecondaryInverted)), w.a("textTertiary", new ColorPalette.Color.Themed(R$attr.textTertiary)), w.a("textTertiaryInverted", new ColorPalette.Color.Themed(R$attr.textTertiaryInverted)), w.a("textWarning", new ColorPalette.Color.Themed(R$attr.textWarning)), w.a("textWarningOnDark", new ColorPalette.Color.Themed(R$attr.textWarningOnDark)), w.a("textWarningInverted", new ColorPalette.Color.Themed(R$attr.textWarningInverted)), w.a("textPrimaryDynamic", new ColorPalette.Color.Themed(R$attr.textPrimaryDynamic)), w.a("textPrimaryDynamicInverted", new ColorPalette.Color.Themed(R$attr.textPrimaryDynamicInverted)), w.a("textSecondaryDynamic", new ColorPalette.Color.Themed(R$attr.textSecondaryDynamic)), w.a("textSecondaryDynamicInverted", new ColorPalette.Color.Themed(R$attr.textSecondaryDynamicInverted)), w.a("graphicPrimaryDynamic", new ColorPalette.Color.Themed(R$attr.graphicPrimaryDynamic)), w.a("graphicSecondaryDynamic", new ColorPalette.Color.Themed(R$attr.graphicSecondaryDynamic)), w.a("graphicPrimaryDynamicInverted", new ColorPalette.Color.Themed(R$attr.graphicPrimaryDynamicInverted)), w.a("graphicSecondaryDynamicInverted", new ColorPalette.Color.Themed(R$attr.graphicSecondaryDynamicInverted)), w.a("bgSecondaryDynamic", new ColorPalette.Color.Themed(R$attr.bgSecondaryDynamic)), w.a("bgSecondaryDynamicInverted", new ColorPalette.Color.Themed(R$attr.bgSecondaryDynamicInverted)));
        ArrayList arrayList = new ArrayList(j11.size());
        for (Map.Entry entry : j11.entrySet()) {
            String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(w.a(lowerCase, entry.getValue()));
        }
        colorTokenMap = arrayList;
        list = new ArrayList();
        disableOldPalette = true;
        disableOldTextStyles = true;
        $stable = 8;
    }

    private StyleParser() {
    }

    private final String colorResToHexColor(Context context, int color) {
        String format = String.format(Locale.getDefault(), "#%06x", Arrays.copyOf(new Object[]{Integer.valueOf(androidx.core.content.a.getColor(resolveTheme$uni_release(context), color) & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final Activity getActiveActivity() {
        return (Activity) C7714v.Z(list);
    }

    private final Integer getColorResByToken(Context context, String colorToken) {
        int themeColorRes;
        if (colorToken == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(colorToken, "attr", context.getApplicationContext().getPackageName());
        return (identifier == 0 || (themeColorRes = ThemeExtKt.themeColorRes(context, identifier)) == 0) ? UiKitCoreColorMap.get(colorToken) : Integer.valueOf(themeColorRes);
    }

    private final Integer parseHexColor(String color) {
        try {
            return Integer.valueOf(Color.parseColor(color));
        } catch (Exception unused) {
            return null;
        }
    }

    public final void addActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        list.add(activity);
        if (savedApplication == null) {
            savedApplication = activity.getApplication();
        }
    }

    @NotNull
    public final Application getApplication() {
        Application application = savedApplication;
        if (application == null) {
            throw new IllegalStateException("before use StyleParser need to call addActivity or use StyleParserLifecycleAdapter");
        }
        if (application != null) {
            return application;
        }
        Intrinsics.n("savedApplication");
        throw null;
    }

    public final Integer mapColor(@NotNull Context context, String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (color != null && color.length() != 0) {
            Context resolveTheme$uni_release = resolveTheme$uni_release(context);
            NewColorPalette newColorPalette = NewColorPalette.INSTANCE;
            String lowerCase = color.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer colorResource = newColorPalette.getColorResource(resolveTheme$uni_release, lowerCase);
            if (colorResource == null) {
                colorResource = getColorResByToken(resolveTheme$uni_release, color);
            }
            if (colorResource != null && colorResource.intValue() != 0) {
                return colorResource;
            }
        }
        return null;
    }

    public final Integer parseColor(@NotNull Context context, String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (color == null || color.length() == 0) {
            return null;
        }
        Context resolveTheme$uni_release = resolveTheme$uni_release(context);
        Integer mapColor = mapColor(resolveTheme$uni_release, color);
        if (mapColor == null) {
            return parseHexColor(color);
        }
        try {
            return Integer.valueOf(androidx.core.content.a.getColor(resolveTheme$uni_release, mapColor.intValue()));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final int parseColorInt(@NotNull Context context, String color, int r42) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer parseColor = parseColor(resolveTheme$uni_release(context), color);
        return parseColor != null ? parseColor.intValue() : r42;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final OzGradient parseGradient(String gradient) {
        String str;
        if (gradient != null) {
            str = gradient.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -960823130) {
                if (hashCode != 107553036) {
                    switch (hashCode) {
                        case -1975093717:
                            if (str.equals("ozgradientaccent0")) {
                                return new OzGradientAccent0();
                            }
                            break;
                        case -1975093716:
                            if (str.equals("ozgradientaccent1")) {
                                return new OzGradientAccent1();
                            }
                            break;
                        case -1975093715:
                            if (str.equals("ozgradientaccent2")) {
                                return new OzGradientAccent2();
                            }
                            break;
                        case -1975093714:
                            if (str.equals("ozgradientaccent3")) {
                                return new OzGradientAccent3();
                            }
                            break;
                        case -1975093713:
                            if (str.equals("ozgradientaccent4")) {
                                return new OzGradientAccent4();
                            }
                            break;
                    }
                } else if (str.equals("ozgradientblackoverlay")) {
                    return new OzGradientBlackOverlay();
                }
            } else if (str.equals("ozgradientblackoverlay2")) {
                return new OzGradientBlackOverlay2();
            }
        }
        return null;
    }

    @NotNull
    public final String parseOzColorToHex(@NotNull Context context, @NotNull String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        Integer mapColor = mapColor(context, color);
        if (mapColor != null) {
            String colorResToHexColor = INSTANCE.colorResToHexColor(context, mapColor.intValue());
            if (colorResToHexColor != null) {
                return colorResToHexColor;
            }
        }
        return color;
    }

    public final Integer parseTextStyle(String style) {
        String str;
        Map<String, Integer> map = newTextStyleTokenMap;
        if (style != null) {
            str = style.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        Integer num = map.get(str);
        if (num != null) {
            return num;
        }
        UniTextStyles uniTextStyles = UiKitCoreTextStyleMap.get(style);
        if (uniTextStyles != null) {
            return Integer.valueOf(uniTextStyles.getResId());
        }
        return null;
    }

    public final void removeActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        list.remove(activity);
    }

    @NotNull
    public final Context resolveTheme$uni_release(@NotNull Context context) {
        Activity activeActivity;
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (!Intrinsics.d(context.getApplicationContext(), context) || (activeActivity = getActiveActivity()) == null) ? context : activeActivity;
    }

    public final int parseColor(@NotNull Context context, String color, int r42) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context resolveTheme$uni_release = resolveTheme$uni_release(context);
        Integer parseColor = parseColor(resolveTheme$uni_release, color);
        return parseColor != null ? parseColor.intValue() : androidx.core.content.a.getColor(resolveTheme$uni_release, r42);
    }

    public final int parseColor(@NotNull Context context, String color, @NotNull OzColor r42) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(r42, "default");
        Context resolveTheme$uni_release = resolveTheme$uni_release(context);
        Integer parseColor = parseColor(resolveTheme$uni_release, color);
        if (parseColor != null) {
            return parseColor.intValue();
        }
        Integer parseColor2 = parseColor(resolveTheme$uni_release, r42.getValue());
        Intrinsics.f(parseColor2);
        return parseColor2.intValue();
    }
}
