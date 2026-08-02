package ru.ozon.android.uikit.common;

import D3.g;
import Ef0.c;
import Fj.b;
import Fj.f;
import Sc.InterfaceC3999a;
import Sc.w;
import T7.E;
import Xc.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
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
import ru.ozon.android.uikit.extensions.ThemeExtKt;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001:\u00056789:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0012\u001a\u00020\t*\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u0016\u00102\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00105\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006;"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser;", "", "<init>", "()V", "", "color", "", "parseHexColor", "(Ljava/lang/String;)Ljava/lang/Integer;", "Landroid/content/Context;", "context", "colorToken", "getColorResByToken", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", "parseColor", "mapColor", "resolveTheme$design_system_release", "(Landroid/content/Context;)Landroid/content/Context;", "resolveTheme", "", "LFj/b;", "UiKitCoreColorMap", "Ljava/util/Map;", "LFj/f;", "UiKitCoreTextStyleMap", "textStyleTokenMap", "newTextStyleTokenMap", "", "Lkotlin/Pair;", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color$Themed;", "colorTokenMap", "Ljava/util/List;", "", "Landroid/app/Activity;", "list", "Landroid/app/Application;", "savedApplication", "Landroid/app/Application;", "", "disableOldPalette", "Z", "getDisableOldPalette", "()Z", "setDisableOldPalette", "(Z)V", "disableOldTextStyles", "getDisableOldTextStyles", "setDisableOldTextStyles", "getActiveActivity", "()Landroid/app/Activity;", "activeActivity", "getApplication", "()Landroid/app/Application;", "application", "OzColor", "TextStyle", "ColorPalette", "DsColorPalette", "NewColorPalette", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StyleParser {
    public static final int $stable;

    @NotNull
    public static final StyleParser INSTANCE = new StyleParser();

    @NotNull
    private static final Map<String, b> UiKitCoreColorMap;

    @NotNull
    private static final Map<String, f> UiKitCoreTextStyleMap;

    @NotNull
    private static final List<Pair<String, ColorPalette.Color.Themed>> colorTokenMap;
    private static boolean disableOldPalette;
    private static boolean disableOldTextStyles;

    @NotNull
    private static final List<Activity> list;

    @NotNull
    private static final Map<String, Integer> newTextStyleTokenMap;
    private static Application savedApplication;

    @NotNull
    private static final Map<String, Integer> textStyleTokenMap;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001:\u0001\bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$ColorPalette;", "", "", "", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color;", "getTokenColorMap", "()Ljava/util/Map;", "tokenColorMap", "Color", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ColorPalette {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color;", "", "getResource", "", "context", "Landroid/content/Context;", "Raw", "Themed", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color$Raw;", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color$Themed;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Color {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color$Raw;", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color;", "", "colorRes", "<init>", "(I)V", "Landroid/content/Context;", "context", "getResource", "(Landroid/content/Context;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getColorRes", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

                @Override // ru.ozon.android.uikit.common.StyleParser.ColorPalette.Color
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

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color$Themed;", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color;", "", "attrRes", "<init>", "(I)V", "Landroid/content/Context;", "context", "getResource", "(Landroid/content/Context;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAttrRes", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

                @Override // ru.ozon.android.uikit.common.StyleParser.ColorPalette.Color
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$DsColorPalette;", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette;", "<init>", "()V", "tokenColorMap", "", "", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color;", "getTokenColorMap", "()Ljava/util/Map;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DsColorPalette implements ColorPalette {

        @NotNull
        public static final DsColorPalette INSTANCE = new DsColorPalette();

        @NotNull
        private static final Map<String, ColorPalette.Color> tokenColorMap = U.j(new Pair(OzColor.OZ_COLOR_WHITE_1.getValue(), new ColorPalette.Color.Raw(R.color.bg_light_key)), new Pair(OzColor.OZ_COLOR_WHITE_2.getValue(), new ColorPalette.Color.Raw(R.color.graphic_neutral_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_90.getValue(), new ColorPalette.Color.Raw(R.color.graphic_neutral_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_80.getValue(), new ColorPalette.Color.Raw(R.color.graphic_solid_neutral)), new Pair(OzColor.OZ_COLOR_GRAY_70.getValue(), new ColorPalette.Color.Raw(R.color.graphic_neutral_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_60.getValue(), new ColorPalette.Color.Raw(R.color.graphic_secondary)), new Pair(OzColor.OZ_COLOR_GRAY_40.getValue(), new ColorPalette.Color.Raw(R.color.graphic_secondary)), new Pair(OzColor.OZ_COLOR_GRAY_30.getValue(), new ColorPalette.Color.Raw(R.color.graphic_primary_on_light)), new Pair(OzColor.OZ_COLOR_GRAY_20.getValue(), new ColorPalette.Color.Raw(R.color.graphic_primary)), new Pair(OzColor.OZ_COLOR_BLUE_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_action_secondary)), new Pair(OzColor.OZ_COLOR_BLUE_LIGHT.getValue(), new ColorPalette.Color.Raw(R.color.bg_action_secondary)), new Pair(OzColor.OZ_COLOR_GREEN_UI.getValue(), new ColorPalette.Color.Raw(R.color.bg_positive_primary)), new Pair(OzColor.OZ_COLOR_GREEN_UI_HOVER.getValue(), new ColorPalette.Color.Raw(R.color.bg_active_positive_primary)), new Pair(OzColor.OZ_COLOR_BLUE_HOVER.getValue(), new ColorPalette.Color.Raw(R.color.bg_active_action_secondary)), new Pair(OzColor.OZ_COLOR_RED.getValue(), new ColorPalette.Color.Raw(R.color.bg_express_primary)), new Pair(OzColor.OZ_COLOR_RED_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_express_secondary)), new Pair(OzColor.OZ_COLOR_GREEN_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_positive_secondary)), new Pair(OzColor.OZ_COLOR_YELLOW_BRAND.getValue(), new ColorPalette.Color.Raw(R.color.graphic_warning_primary_inverted)), new Pair(OzColor.OZ_COLOR_INDIGO_BRAND.getValue(), new ColorPalette.Color.Raw(R.color.bg_active_marketing_primary)), new Pair(OzColor.OZ_COLOR_INDIGO_BRAND_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_active_marketing_secondary)), new Pair(OzColor.OZ_COLOR_AQUA_BRAND_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgAquaPrimary)), new Pair(OzColor.OZ_COLOR_AQUA_BRAND.getValue(), new ColorPalette.Color.Raw(R.color.bg_aqua_primary)), new Pair(OzColor.OZ_COLOR_CATBIRD_EGG_BRAND.getValue(), new ColorPalette.Color.Raw(R.color.bg_aqua_primary)), new Pair(OzColor.OZ_COLOR_CATBIRD_EGG_BRAND_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_aqua_primary)), new Pair(OzColor.OZ_COLOR_GREEN_BRAND.getValue(), new ColorPalette.Color.Raw(R.color.bg_fresh_primary)), new Pair(OzColor.OZ_COLOR_GREEN_BRAND_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_fresh_secondary)), new Pair(OzColor.OZ_COLOR_ORANGE.getValue(), new ColorPalette.Color.Raw(R.color.bg_accent_primary)), new Pair(OzColor.OZ_COLOR_PURPLE.getValue(), new ColorPalette.Color.Raw(R.color.bg_marketing_primary)), new Pair(OzColor.OZ_COLOR_PURPLE_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_marketing_secondary)), new Pair(OzColor.OZ_COLOR_ORANGE_PALE.getValue(), new ColorPalette.Color.Raw(R.color.bg_express_secondary)), new Pair(OzColor.OZ_COLOR_BLACK.getValue(), new ColorPalette.Color.Raw(R.color.graphic_primary_on_light)), new Pair(OzColor.OZ_COLOR_HITBOX.getValue(), new ColorPalette.Color.Themed(R.attr.bgLightKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_WHITE_OVERLAY.getValue(), new ColorPalette.Color.Themed(R.attr.graphicSecondaryOnDark)), new Pair(OzColor.OZ_SEMANTIC_COLOR_WHITE_OVERLAY_2.getValue(), new ColorPalette.Color.Themed(R.attr.layerFloor2)), new Pair(OzColor.OZ_COLOR_WHITE_OVERLAY_2_CONST.getValue(), new ColorPalette.Color.Raw(R.color.clear_light_key_700)), new Pair(OzColor.OZ_COLOR_WHITE_OVERLAY_3.getValue(), new ColorPalette.Color.Raw(R.color.clear_light_key_600)), new Pair(OzColor.OZ_COLOR_WHITE_OVERLAY_4.getValue(), new ColorPalette.Color.Raw(R.color.clear_light_key_500)), new Pair(OzColor.OZ_COLOR_BLUE.getValue(), new ColorPalette.Color.Raw(R.color.bg_action_primary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_DIMMING.getValue(), new ColorPalette.Color.Themed(R.attr.layerOverlayDimming)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BUTTON_VIDEO_CONTROL.getValue(), new ColorPalette.Color.Themed(R.attr.layerOverlayDimming)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PARANDJA.getValue(), new ColorPalette.Color.Themed(R.attr.layerOverlayParanja)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PARANDJA_HOVER.getValue(), new ColorPalette.Color.Themed(R.attr.layerActiveSurface)), new Pair(OzColor.OZ_SEMANTIC_COLOR_SEPARATOR_DARK.getValue(), new ColorPalette.Color.Themed(R.attr.graphicNeutralInverted)), new Pair(OzColor.OZ_SEMANTIC_COLOR_SEPARATOR.getValue(), new ColorPalette.Color.Themed(R.attr.graphicNeutral)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY.getValue(), new ColorPalette.Color.Themed(R.attr.layerFloor0)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.layerFloor1)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_TETRIARY.getValue(), new ColorPalette.Color.Themed(R.attr.layerFloor2)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_QUATERNARY.getValue(), new ColorPalette.Color.Themed(R.attr.layerSurface)), new Pair(OzColor.OZ_SEMANTIC_BG_PRIMARY_INVERSE.getValue(), new ColorPalette.Color.Themed(R.attr.bgPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_NOTIFICATION.getValue(), new ColorPalette.Color.Themed(R.attr.graphicPrimaryOnLight)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY_HOVER.getValue(), new ColorPalette.Color.Themed(R.attr.layerActiveFloor0)), new Pair(OzColor.OZ_SEMANTIC_BG_SECONDARY_INVERSE.getValue(), new ColorPalette.Color.Themed(R.attr.bgLightKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_BG_VIDEOPLEER.getValue(), new ColorPalette.Color.Themed(R.attr.graphicDarkKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), new ColorPalette.Color.Themed(R.attr.textPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.textSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_TETRIARY.getValue(), new ColorPalette.Color.Themed(R.attr.textSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_QUATERNARY.getValue(), new ColorPalette.Color.Themed(R.attr.textOriginalpriceAvailable)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R.attr.textLightKey)), new Pair(OzColor.OZ_SEMANTIC_TEXT_ACTION.getValue(), new ColorPalette.Color.Themed(R.attr.textAction)), new Pair(OzColor.OZ_SEMANTIC_TEXT_SALE.getValue(), new ColorPalette.Color.Themed(R.attr.textExpress)), new Pair(OzColor.OZ_SEMANTIC_TEXT_MARKETING.getValue(), new ColorPalette.Color.Themed(R.attr.textMarketing)), new Pair(OzColor.OZ_SEMANTIC_TEXT_POSITIVE.getValue(), new ColorPalette.Color.Themed(R.attr.textPositive)), new Pair(OzColor.OZ_SEMANTIC_TEXT_WARNING.getValue(), new ColorPalette.Color.Themed(R.attr.textWarning)), new Pair(OzColor.OZ_SEMANTIC_TEXT_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R.attr.textNegative)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY.getValue(), new ColorPalette.Color.Themed(R.attr.textAction)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_LIGHT.getValue(), new ColorPalette.Color.Themed(R.attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT.getValue(), new ColorPalette.Color.Themed(R.attr.bgAccentPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT_LIGHT.getValue(), new ColorPalette.Color.Themed(R.attr.bgAccentSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgAccentSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.graphicPositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_LIGHT.getValue(), new ColorPalette.Color.Themed(R.attr.graphicPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.graphicPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_FEED_2.getValue(), new ColorPalette.Color.Themed(R.attr.clearDarkKey600)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT_HOVER.getValue(), new ColorPalette.Color.Themed(R.attr.graphicActiveAccentPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_HOVER.getValue(), new ColorPalette.Color.Themed(R.attr.graphicActiveActionPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_HOVER.getValue(), new ColorPalette.Color.Themed(R.attr.graphicActivePositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PREMIUM.getValue(), new ColorPalette.Color.Themed(R.attr.graphicActivePremium)), new Pair(OzColor.OZ_SEMANTIC_COLOR_PREMIUM_BLUE.getValue(), new ColorPalette.Color.Raw(R.color.graphic_premium_blue)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CO_PURCHASE.getValue(), new ColorPalette.Color.Themed(R.attr.graphicNegativePrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_RATING.getValue(), new ColorPalette.Color.Themed(R.attr.graphicRating)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CREDIT.getValue(), new ColorPalette.Color.Raw(R.color.bg_instalment_secondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_RIPPLE.getValue(), new ColorPalette.Color.Themed(R.attr.graphicSecondaryOnLight)), new Pair(OzColor.OZ_SEMANTIC_COLOR_SHADOW_SPREAD.getValue(), new ColorPalette.Color.Themed(R.attr.clearDarkKey400)), new Pair(OzColor.OZ_SEMANTIC_VZHUH_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_LIGHT.getValue(), new ColorPalette.Color.Themed(R.attr.bgFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_HOVER.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_WHITE_OVERLAY_25.getValue(), new ColorPalette.Color.Themed(R.attr.graphicSecondaryOnDark)), new Pair(OzColor.OZ_SEMANTIC_WARNING_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgWarningPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_OVERLAY.getValue(), new ColorPalette.Color.Themed(R.attr.bgLightKey)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_OZON_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R.attr.bgNegativePrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEGATIVE_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_NEGATIVE_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_FRESH.getValue(), new ColorPalette.Color.Themed(R.attr.bgFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_FRESH_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_TEXT_FRESH.getValue(), new ColorPalette.Color.Themed(R.attr.textFresh)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_FRESH.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveFreshPrimary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_FRESH_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_PRIMARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgActionPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_SALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgExpressPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_SALE_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgExpressSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING.getValue(), new ColorPalette.Color.Themed(R.attr.bgMarketingPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgMarketingSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgMarketingSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE.getValue(), new ColorPalette.Color.Themed(R.attr.bgPositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING.getValue(), new ColorPalette.Color.Themed(R.attr.bgWarningPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEUTRAL.getValue(), new ColorPalette.Color.Themed(R.attr.graphicPrimary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_CTRL_NEUTRAL_SECONDARY.getValue(), new ColorPalette.Color.Themed(R.attr.layerOverlayParanja)), new Pair(OzColor.OZ_SEMANTIC_HOVER_PRIMARY.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveActionPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_PRIMARY_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_SALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveExpressPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_SALE_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveExpressSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_MARKETING.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveMarketingPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_MARKETING_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveMarketingSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_POSITIVE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActivePositivePrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_POSITIVE_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActivePositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_WARNING.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveWarningPrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_WARNING_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEGATIVE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveNegativePrimary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEGATIVE_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEUTRAL.getValue(), new ColorPalette.Color.Themed(R.attr.bgActivePremiumPrimaryInverted)), new Pair(OzColor.OZ_SEMANTIC_HOVER_NEUTRAL_PALE.getValue(), new ColorPalette.Color.Themed(R.attr.bgActiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_DARKER.getValue(), new ColorPalette.Color.Themed(R.attr.layerActiveSurface)), new Pair(OzColor.OZ_SEMANTIC_COLOR_HOVER_LIGHTER.getValue(), new ColorPalette.Color.Themed(R.attr.layerActiveSurfaceInverted)), new Pair(OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE_100.getValue(), new ColorPalette.Color.Themed(R.attr.bgActionSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_SALE_PALE_100.getValue(), new ColorPalette.Color.Themed(R.attr.bgExpressSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_FRESH_PALE_100.getValue(), new ColorPalette.Color.Themed(R.attr.bgFreshSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_MARKETING_PALE_100.getValue(), new ColorPalette.Color.Raw(R.color.bg_marketing_secondary_solid)), new Pair(OzColor.OZ_SEMANTIC_CTRL_POSITIVE_PALE_100.getValue(), new ColorPalette.Color.Themed(R.attr.bgPositiveSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_WARNING_PALE_100.getValue(), new ColorPalette.Color.Themed(R.attr.bgWarningSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEGATIVE_PALE_100.getValue(), new ColorPalette.Color.Themed(R.attr.bgNegativeSecondary)), new Pair(OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE_100.getValue(), new ColorPalette.Color.Themed(R.attr.bgPremiumPrimary)));

        private DsColorPalette() {
        }

        @Override // ru.ozon.android.uikit.common.StyleParser.ColorPalette
        @NotNull
        public Map<String, ColorPalette.Color> getTokenColorMap() {
            return tokenColorMap;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$NewColorPalette;", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette;", "<init>", "()V", "tokenColorMap", "", "", "Lru/ozon/android/uikit/common/StyleParser$ColorPalette$Color;", "getTokenColorMap", "()Ljava/util/Map;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Override // ru.ozon.android.uikit.common.StyleParser.ColorPalette
        @NotNull
        public Map<String, ColorPalette.Color> getTokenColorMap() {
            return tokenColorMap;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0092\u0001\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001¨\u0006\u0095\u0001"}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$OzColor;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OZ_COLOR_WHITE_1", "OZ_COLOR_WHITE_2", "OZ_COLOR_GRAY_90", "OZ_COLOR_GRAY_80", "OZ_COLOR_GRAY_70", "OZ_COLOR_GRAY_60", "OZ_COLOR_GRAY_40", "OZ_COLOR_GRAY_30", "OZ_COLOR_GRAY_20", "OZ_COLOR_BLUE", "OZ_COLOR_BLUE_PALE", "OZ_COLOR_BLUE_LIGHT", "OZ_COLOR_GREEN_UI", "OZ_COLOR_GREEN_UI_HOVER", "OZ_COLOR_BLUE_HOVER", "OZ_COLOR_RED", "OZ_COLOR_RED_PALE", "OZ_COLOR_GREEN_PALE", "OZ_COLOR_YELLOW_BRAND", "OZ_COLOR_INDIGO_BRAND", "OZ_COLOR_INDIGO_BRAND_PALE", "OZ_COLOR_AQUA_BRAND_PALE", "OZ_COLOR_AQUA_BRAND", "OZ_COLOR_CATBIRD_EGG_BRAND", "OZ_COLOR_CATBIRD_EGG_BRAND_PALE", "OZ_COLOR_GREEN_BRAND", "OZ_COLOR_GREEN_BRAND_PALE", "OZ_COLOR_ORANGE", "OZ_COLOR_PURPLE", "OZ_COLOR_PURPLE_PALE", "OZ_COLOR_ORANGE_PALE", "OZ_COLOR_BLACK", "OZ_COLOR_HITBOX", "OZ_SEMANTIC_COLOR_WHITE_OVERLAY", "OZ_SEMANTIC_COLOR_WHITE_OVERLAY_2", "OZ_COLOR_WHITE_OVERLAY_2_CONST", "OZ_COLOR_WHITE_OVERLAY_3", "OZ_COLOR_WHITE_OVERLAY_4", "OZ_SEMANTIC_COLOR_DIMMING", "OZ_SEMANTIC_COLOR_PARANDJA", "OZ_SEMANTIC_COLOR_PARANDJA_HOVER", "OZ_SEMANTIC_COLOR_SEPARATOR_DARK", "OZ_SEMANTIC_COLOR_SEPARATOR", "OZ_SEMANTIC_COLOR_BG_PRIMARY", "OZ_SEMANTIC_COLOR_BG_PRIMARY_HOVER", "OZ_SEMANTIC_COLOR_BG_SECONDARY", "OZ_SEMANTIC_COLOR_BG_TETRIARY", "OZ_SEMANTIC_COLOR_BG_QUATERNARY", "OZ_SEMANTIC_COLOR_BG_VIDEOPLEER", "OZ_SEMANTIC_BG_PRIMARY_INVERSE", "OZ_SEMANTIC_BG_SECONDARY_INVERSE", "OZ_SEMANTIC_COLOR_TEXT_PRIMARY", "OZ_SEMANTIC_COLOR_TEXT_SECONDARY", "OZ_SEMANTIC_COLOR_TEXT_TETRIARY", "OZ_SEMANTIC_COLOR_TEXT_QUATERNARY", "OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_LIGHT", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_PALE", "OZ_SEMANTIC_COLOR_ACCENT_ALERT", "OZ_SEMANTIC_COLOR_ACCENT_ALERT_LIGHT", "OZ_SEMANTIC_COLOR_ACCENT_ALERT_PALE", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_LIGHT", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_PALE", "OZ_SEMANTIC_COLOR_ACCENT_FEED_2", "OZ_SEMANTIC_COLOR_PREMIUM", "OZ_SEMANTIC_COLOR_PREMIUM_BLUE", "OZ_SEMANTIC_COLOR_CO_PURCHASE", "OZ_SEMANTIC_COLOR_RATING", "OZ_SEMANTIC_COLOR_CREDIT", "OZ_SEMANTIC_COLOR_RIPPLE", "OZ_SEMANTIC_COLOR_SHADOW_SPREAD", "OZ_SEMANTIC_COLOR_ACCENT_ALERT_HOVER", "OZ_SEMANTIC_COLOR_ACCENT_PRIMARY_HOVER", "OZ_SEMANTIC_COLOR_ACCENT_SECONDARY_HOVER", "OZ_SEMANTIC_COLOR_HOVER_DARKER", "OZ_SEMANTIC_COLOR_HOVER_LIGHTER", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_LIGHT", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_PALE", "OZ_SEMANTIC_COLOR_EXPRESS_ACCENT_PRIMARY_HOVER", "OZ_SEMANTIC_COLOR_WHITE_OVERLAY_25", "OZ_SEMANTIC_COLOR_CTRL_OVERLAY", "OZ_SEMANTIC_COLOR_CTRL_OZON_SECONDARY", "OZ_SEMANTIC_COLOR_CTRL_NEGATIVE", "OZ_SEMANTIC_COLOR_CTRL_NEGATIVE_SECONDARY", "OZ_SEMANTIC_COLOR_CTRL_NEUTRAL_SECONDARY", "OZ_SEMANTIC_COLOR_BUTTON_VIDEO_CONTROL", "OZ_SEMANTIC_VZHUH_PALE", "OZ_SEMANTIC_COLOR_BG_NOTIFICATION", "OZ_SEMANTIC_WARNING_SECONDARY", "OZ_SEMANTIC_COLOR_CTRL_FRESH", "OZ_SEMANTIC_COLOR_CTRL_FRESH_PALE", "OZ_SEMANTIC_COLOR_TEXT_FRESH", "OZ_SEMANTIC_COLOR_HOVER_FRESH", "OZ_SEMANTIC_COLOR_HOVER_FRESH_PALE", "OZ_SEMANTIC_CTRL_PRIMARY", "OZ_SEMANTIC_CTRL_PRIMARY_PALE", "OZ_SEMANTIC_CTRL_SALE", "OZ_SEMANTIC_CTRL_SALE_PALE", "OZ_SEMANTIC_CTRL_MARKETING", "OZ_SEMANTIC_CTRL_MARKETING_PALE", "OZ_SEMANTIC_CTRL_MARKETING_SECONDARY", "OZ_SEMANTIC_CTRL_POSITIVE", "OZ_SEMANTIC_CTRL_POSITIVE_PALE", "OZ_SEMANTIC_CTRL_POSITIVE_SECONDARY", "OZ_SEMANTIC_CTRL_WARNING", "OZ_SEMANTIC_CTRL_WARNING_PALE", "OZ_SEMANTIC_CTRL_WARNING_SECONDARY", "OZ_SEMANTIC_CTRL_NEGATIVE_PALE", "OZ_SEMANTIC_CTRL_NEUTRAL", "OZ_SEMANTIC_CTRL_NEUTRAL_PALE", "OZ_SEMANTIC_TEXT_ACTION", "OZ_SEMANTIC_TEXT_SALE", "OZ_SEMANTIC_TEXT_MARKETING", "OZ_SEMANTIC_TEXT_POSITIVE", "OZ_SEMANTIC_TEXT_WARNING", "OZ_SEMANTIC_TEXT_NEGATIVE", "OZ_SEMANTIC_HOVER_PRIMARY", "OZ_SEMANTIC_HOVER_PRIMARY_PALE", "OZ_SEMANTIC_HOVER_SALE", "OZ_SEMANTIC_HOVER_SALE_PALE", "OZ_SEMANTIC_HOVER_MARKETING", "OZ_SEMANTIC_HOVER_MARKETING_PALE", "OZ_SEMANTIC_HOVER_POSITIVE", "OZ_SEMANTIC_HOVER_POSITIVE_PALE", "OZ_SEMANTIC_HOVER_WARNING", "OZ_SEMANTIC_HOVER_WARNING_PALE", "OZ_SEMANTIC_HOVER_NEGATIVE", "OZ_SEMANTIC_HOVER_NEGATIVE_PALE", "OZ_SEMANTIC_HOVER_NEUTRAL", "OZ_SEMANTIC_HOVER_NEUTRAL_PALE", "OZ_SEMANTIC_CTRL_PRIMARY_PALE_100", "OZ_SEMANTIC_CTRL_SALE_PALE_100", "OZ_SEMANTIC_CTRL_FRESH_PALE_100", "OZ_SEMANTIC_CTRL_MARKETING_PALE_100", "OZ_SEMANTIC_CTRL_POSITIVE_PALE_100", "OZ_SEMANTIC_CTRL_WARNING_PALE_100", "OZ_SEMANTIC_CTRL_NEGATIVE_PALE_100", "OZ_SEMANTIC_CTRL_NEUTRAL_PALE_100", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            $ENTRIES = Xc.b.a($values);
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lru/ozon/android/uikit/common/StyleParser$TextStyle;", "", "styleName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStyleName", "()Ljava/lang/String;", "HEAD_XXL", "HEAD_XL", "HEAD_L", "HEAD_M", "HEAD_M_ITALIC", "BODY_L", "BODY_L_BOLD", "BODY_L_BOLD_ITALIC", "BODY_L_LONG", "BODY_M", "BODY_M_BOLD", "BODY_M_BOLD_MONO", "BODY_M_AC", "BODY_M_LONG", "BODY_XL", "BODY_XL_BOLD", "CAPTION", "CAPTION_AC", "CAPTION_ITALIC", "CAPTION_BOLD", "CAPTION_BOLD_MONO", "CAPTION_BOLD_ITALIC", "PROMO_XXL_ITALIC", "BADGE_BOLD_AC", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            $ENTRIES = Xc.b.a($values);
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
        a<b> b11 = b.b();
        int h11 = U.h(C7714v.z(b11, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : b11) {
            linkedHashMap.put(((b) obj).e(), obj);
        }
        UiKitCoreColorMap = linkedHashMap;
        a<f> a11 = f.a();
        int h12 = U.h(C7714v.z(a11, 10));
        if (h12 < 16) {
            h12 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12);
        for (Object obj2 : a11) {
            linkedHashMap2.put(((f) obj2).d(), obj2);
        }
        UiKitCoreTextStyleMap = linkedHashMap2;
        TextStyle textStyle = TextStyle.HEAD_XXL;
        Pair a12 = w.a(textStyle.getStyleName(), Integer.valueOf(R.style.TextStyle_Head_XXL));
        TextStyle textStyle2 = TextStyle.HEAD_XL;
        Pair a13 = w.a(textStyle2.getStyleName(), Integer.valueOf(R.style.TextStyle_Head_XL));
        TextStyle textStyle3 = TextStyle.HEAD_L;
        Pair a14 = w.a(textStyle3.getStyleName(), Integer.valueOf(R.style.TextStyle_Head_L));
        TextStyle textStyle4 = TextStyle.HEAD_M;
        Pair a15 = w.a(textStyle4.getStyleName(), Integer.valueOf(R.style.TextStyle_Head_M));
        TextStyle textStyle5 = TextStyle.HEAD_M_ITALIC;
        Pair a16 = w.a(textStyle5.getStyleName(), Integer.valueOf(R.style.TextStyle_Head_M_Italic));
        TextStyle textStyle6 = TextStyle.BODY_L;
        Pair a17 = w.a(textStyle6.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_L));
        TextStyle textStyle7 = TextStyle.BODY_L_BOLD;
        Pair a18 = w.a(textStyle7.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_L_Bold));
        TextStyle textStyle8 = TextStyle.BODY_L_BOLD_ITALIC;
        Pair a19 = w.a(textStyle8.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_L_Bold_Italic));
        TextStyle textStyle9 = TextStyle.BODY_L_LONG;
        Pair a21 = w.a(textStyle9.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_L_Long));
        TextStyle textStyle10 = TextStyle.BODY_M;
        Pair a22 = w.a(textStyle10.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_M));
        TextStyle textStyle11 = TextStyle.BODY_M_AC;
        Pair a23 = w.a(textStyle11.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_M_AC));
        TextStyle textStyle12 = TextStyle.BODY_M_BOLD;
        Pair a24 = w.a(textStyle12.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_M_Bold));
        TextStyle textStyle13 = TextStyle.BODY_M_BOLD_MONO;
        Pair a25 = w.a(textStyle13.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_M_Bold_Mono));
        TextStyle textStyle14 = TextStyle.BODY_M_LONG;
        Pair a26 = w.a(textStyle14.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_M_Long));
        TextStyle textStyle15 = TextStyle.BODY_XL;
        Pair a27 = w.a(textStyle15.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_XL));
        TextStyle textStyle16 = TextStyle.BODY_XL_BOLD;
        Pair a28 = w.a(textStyle16.getStyleName(), Integer.valueOf(R.style.TextStyle_Body_XL_Bold));
        TextStyle textStyle17 = TextStyle.CAPTION;
        Pair a29 = w.a(textStyle17.getStyleName(), Integer.valueOf(R.style.TextStyle_Caption));
        TextStyle textStyle18 = TextStyle.CAPTION_AC;
        Pair a31 = w.a(textStyle18.getStyleName(), Integer.valueOf(R.style.TextStyle_Caption_AC));
        TextStyle textStyle19 = TextStyle.CAPTION_ITALIC;
        Pair a32 = w.a(textStyle19.getStyleName(), Integer.valueOf(R.style.TextStyle_Caption_Italic));
        TextStyle textStyle20 = TextStyle.CAPTION_BOLD;
        Pair a33 = w.a(textStyle20.getStyleName(), Integer.valueOf(R.style.TextStyle_Caption_Bold));
        TextStyle textStyle21 = TextStyle.CAPTION_BOLD_MONO;
        Pair a34 = w.a(textStyle21.getStyleName(), Integer.valueOf(R.style.TextStyle_Caption_Bold_Mono));
        TextStyle textStyle22 = TextStyle.CAPTION_BOLD_ITALIC;
        Pair a35 = w.a(textStyle22.getStyleName(), Integer.valueOf(R.style.TextStyle_Caption_Bold_Italic));
        TextStyle textStyle23 = TextStyle.PROMO_XXL_ITALIC;
        Pair a36 = w.a(textStyle23.getStyleName(), Integer.valueOf(R.style.TextStyle_Promo_XXL_Italic));
        TextStyle textStyle24 = TextStyle.BADGE_BOLD_AC;
        textStyleTokenMap = U.j(a12, a13, a14, a15, a16, a17, a18, a19, a21, a22, a23, a24, a25, a26, a27, a28, a29, a31, a32, a33, a34, a35, a36, w.a(textStyle24.getStyleName(), Integer.valueOf(R.style.TextStyle_BadgeBoldAC)));
        Pair d11 = c.d(f.HEADLINE_800_X_X_LARGE, textStyle.getStyleName());
        Pair d12 = c.d(f.HEADLINE_700_X_LARGE, textStyle2.getStyleName());
        Pair d13 = c.d(f.HEADLINE_600_MEDIUM, textStyle3.getStyleName());
        String styleName = textStyle4.getStyleName();
        f fVar = f.HEADLINE_500_MEDIUM;
        Pair d14 = c.d(fVar, styleName);
        Pair d15 = c.d(f.HEADLINE_500_X_MEDIUM, textStyle5.getStyleName());
        Pair d16 = c.d(f.BODY_500_MEDIUM, textStyle6.getStyleName());
        Pair d17 = c.d(f.BODY_CONTROL_500_MEDIUM, textStyle7.getStyleName());
        Pair d18 = c.d(f.HEADLINE_PROMO_400_SMALL, textStyle8.getStyleName());
        Pair d19 = c.d(f.BODY_500_SMALL, textStyle9.getStyleName());
        Pair d21 = c.d(f.COMPACT_400_LARGE, textStyle10.getStyleName());
        String styleName2 = textStyle11.getStyleName();
        f fVar2 = f.HEADLINE_300_X_SMALL;
        Pair d22 = c.d(fVar2, styleName2);
        Pair d23 = c.d(f.BODY_CONTROL_400_SMALL, textStyle12.getStyleName());
        Pair d24 = c.d(f.BODY_NUMERIC_400_SMALL, textStyle13.getStyleName());
        Pair d25 = c.d(f.BODY_400_LARGE, textStyle14.getStyleName());
        Pair d26 = c.d(f.BODY_600_MEDIUM, textStyle15.getStyleName());
        Pair d27 = c.d(fVar, textStyle16.getStyleName());
        Pair d28 = c.d(f.BODY_300_X_SMALL, textStyle17.getStyleName());
        Pair d29 = c.d(fVar2, textStyle18.getStyleName());
        String styleName3 = textStyle19.getStyleName();
        f fVar3 = f.BODY_PROMO_300_X_SMALL;
        newTextStyleTokenMap = U.j(d11, d12, d13, d14, d15, d16, d17, d18, d19, d21, d22, d23, d24, d25, d26, d27, d28, d29, c.d(fVar3, styleName3), c.d(f.BODY_CONTROL_300_X_SMALL, textStyle20.getStyleName()), c.d(f.BODY_NUMERIC_300_X_SMALL, textStyle21.getStyleName()), c.d(fVar3, textStyle22.getStyleName()), c.d(f.KEY_PROMO_700_X_LARGE, textStyle23.getStyleName()), c.d(f.BODY_ACCENT_250_CAPTION, textStyle24.getStyleName()));
        Map j11 = U.j(g.h(R.attr.bgDarkKey, "bgDarkKey"), g.h(R.attr.bgLightKey, "bgLightKey"), g.h(R.attr.clearDarkKey100, "clearDarkKey100"), g.h(R.attr.clearDarkKey200, "clearDarkKey200"), g.h(R.attr.clearDarkKey300, "clearDarkKey300"), g.h(R.attr.clearDarkKey400, "clearDarkKey400"), g.h(R.attr.clearDarkKey500, "clearDarkKey500"), g.h(R.attr.clearDarkKey600, "clearDarkKey600"), g.h(R.attr.clearDarkKey700, "clearDarkKey700"), g.h(R.attr.clearDarkKey800, "clearDarkKey800"), g.h(R.attr.clearLightKey100, "clearLightKey100"), g.h(R.attr.clearLightKey200, "clearLightKey200"), g.h(R.attr.clearLightKey300, "clearLightKey300"), g.h(R.attr.clearLightKey400, "clearLightKey400"), g.h(R.attr.clearLightKey500, "clearLightKey500"), g.h(R.attr.clearLightKey600, "clearLightKey600"), g.h(R.attr.clearLightKey700, "clearLightKey700"), g.h(R.attr.clearLightKey800, "clearLightKey800"), g.h(R.attr.graphicActionOnDark, "graphicActionOnDark"), g.h(R.attr.graphicActionOnLight, "graphicActionOnLight"), g.h(R.attr.graphicDarkKey, "graphicDarkKey"), g.h(R.attr.graphicDisabledOnDark, "graphicDisabledOnDark"), g.h(R.attr.graphicDisabledOnLight, "graphicDisabledOnLight"), g.h(R.attr.graphicLightKey, "graphicLightKey"), g.h(R.attr.graphicNeutralOnDark, "graphicNeutralOnDark"), g.h(R.attr.graphicNeutralOnLight, "graphicNeutralOnLight"), g.h(R.attr.graphicPrimaryOnDark, "graphicPrimaryOnDark"), g.h(R.attr.graphicPrimaryOnLight, "graphicPrimaryOnLight"), g.h(R.attr.graphicSecondaryOnDark, "graphicSecondaryOnDark"), g.h(R.attr.graphicSecondaryOnLight, "graphicSecondaryOnLight"), g.h(R.attr.graphicTertiaryOnDark, "graphicTertiaryOnDark"), g.h(R.attr.graphicTertiaryOnLight, "graphicTertiaryOnLight"), g.h(R.attr.textActionOnDark, "textActionOnDark"), g.h(R.attr.textActionOnLight, "textActionOnLight"), g.h(R.attr.textDarkKey, "textDarkKey"), g.h(R.attr.textLightKey, "textLightKey"), g.h(R.attr.textPrimaryOnDark, "textPrimaryOnDark"), g.h(R.attr.textPrimaryOnLight, "textPrimaryOnLight"), g.h(R.attr.textSecondaryOnDark, "textSecondaryOnDark"), g.h(R.attr.textSecondaryOnLight, "textSecondaryOnLight"), g.h(R.attr.textTertiaryOnDark, "textTertiaryOnDark"), g.h(R.attr.textTertiaryOnLight, "textTertiaryOnLight"), g.h(R.attr.bgActiveAccentPrimary, "bgActiveAccentPrimary"), g.h(R.attr.bgActiveAccentPrimaryInverted, "bgActiveAccentPrimaryInverted"), g.h(R.attr.bgActiveAccentSecondary, "bgActiveAccentSecondary"), g.h(R.attr.bgActiveAccentSecondaryInverted, "bgActiveAccentSecondaryInverted"), g.h(R.attr.bgActiveActionPrimary, "bgActiveActionPrimary"), g.h(R.attr.bgActiveActionPrimaryInverted, "bgActiveActionPrimaryInverted"), g.h(R.attr.bgActiveActionSecondary, "bgActiveActionSecondary"), g.h(R.attr.bgActiveActionSecondaryInverted, "bgActiveActionSecondaryInverted"), g.h(R.attr.bgActiveBestpricePrimary, "bgActiveBestpricePrimary"), g.h(R.attr.bgActiveBestpricePrimaryInverted, "bgActiveBestpricePrimaryInverted"), g.h(R.attr.bgActiveBestpriceSecondary, "bgActiveBestpriceSecondary"), g.h(R.attr.bgActiveBestpriceSecondaryInverted, "bgActiveBestpriceSecondaryInverted"), g.h(R.attr.bgActiveExpressPrimary, "bgActiveExpressPrimary"), g.h(R.attr.bgActiveExpressPrimaryInverted, "bgActiveExpressPrimaryInverted"), g.h(R.attr.bgActiveExpressSecondary, "bgActiveExpressSecondary"), g.h(R.attr.bgActiveExpressSecondaryInverted, "bgActiveExpressSecondaryInverted"), g.h(R.attr.bgActiveFreshPrimary, "bgActiveFreshPrimary"), g.h(R.attr.bgActiveFreshPrimaryInverted, "bgActiveFreshPrimaryInverted"), g.h(R.attr.bgActiveFreshSecondary, "bgActiveFreshSecondary"), g.h(R.attr.bgActiveFreshSecondaryInverted, "bgActiveFreshSecondaryInverted"), g.h(R.attr.bgActiveMarketingPrimary, "bgActiveMarketingPrimary"), g.h(R.attr.bgActiveMarketingPrimaryInverted, "bgActiveMarketingPrimaryInverted"), g.h(R.attr.bgActiveMarketingSecondary, "bgActiveMarketingSecondary"), g.h(R.attr.bgActiveMarketingSecondaryInverted, "bgActiveMarketingSecondaryInverted"), g.h(R.attr.bgActiveNegativePrimary, "bgActiveNegativePrimary"), g.h(R.attr.bgActiveNegativePrimaryInverted, "bgActiveNegativePrimaryInverted"), g.h(R.attr.bgActiveNegativeSecondary, "bgActiveNegativeSecondary"), g.h(R.attr.bgActiveNegativeSecondaryInverted, "bgActiveNegativeSecondaryInverted"), g.h(R.attr.bgActivePositivePrimary, "bgActivePositivePrimary"), g.h(R.attr.bgActivePositivePrimaryInverted, "bgActivePositivePrimaryInverted"), g.h(R.attr.bgActivePositiveSecondary, "bgActivePositiveSecondary"), g.h(R.attr.bgActivePositiveSecondaryInverted, "bgActivePositiveSecondaryInverted"), g.h(R.attr.bgActivePremiumPrimary, "bgActivePremiumPrimary"), g.h(R.attr.bgActivePremiumPrimaryInverted, "bgActivePremiumPrimaryInverted"), g.h(R.attr.bgActivePremiumSecondary, "bgActivePremiumSecondary"), g.h(R.attr.bgActivePremiumSecondaryInverted, "bgActivePremiumSecondaryInverted"), g.h(R.attr.bgActivePrimary, "bgActivePrimary"), g.h(R.attr.bgActivePrimaryInverted, "bgActivePrimaryInverted"), g.h(R.attr.bgActiveSecondary, "bgActiveSecondary"), g.h(R.attr.bgActiveSecondaryInverted, "bgActiveSecondaryInverted"), g.h(R.attr.bgActiveWarningPrimary, "bgActiveWarningPrimary"), g.h(R.attr.bgActiveWarningPrimaryInverted, "bgActiveWarningPrimaryInverted"), g.h(R.attr.bgActiveWarningSecondary, "bgActiveWarningSecondary"), g.h(R.attr.bgActiveWarningSecondaryInverted, "bgActiveWarningSecondaryInverted"), g.h(R.attr.bgAccentOnLight, "bgAccentOnLight"), g.h(R.attr.bgAccentPrimary, "bgAccentPrimary"), g.h(R.attr.bgAccentPrimaryInverted, "bgAccentPrimaryInverted"), g.h(R.attr.bgAccentSecondary, "bgAccentSecondary"), g.h(R.attr.bgAccentSecondaryInverted, "bgAccentSecondaryInverted"), g.h(R.attr.bgActionPrimary, "bgActionPrimary"), g.h(R.attr.bgActionPrimaryInverted, "bgActionPrimaryInverted"), g.h(R.attr.bgActionSecondary, "bgActionSecondary"), g.h(R.attr.bgActionSecondaryInverted, "bgActionSecondaryInverted"), g.h(R.attr.bgAquaPrimary, "bgAquaPrimary"), g.h(R.attr.bgBestpricePrimary, "bgBestpricePrimary"), g.h(R.attr.bgBestpricePrimaryInverted, "bgBestpricePrimaryInverted"), g.h(R.attr.bgBestpriceSecondary, "bgBestpriceSecondary"), g.h(R.attr.bgBestpriceSecondaryInverted, "bgBestpriceSecondaryInverted"), g.h(R.attr.bgExpressPrimary, "bgExpressPrimary"), g.h(R.attr.bgExpressPrimaryInverted, "bgExpressPrimaryInverted"), g.h(R.attr.bgExpressSecondary, "bgExpressSecondary"), g.h(R.attr.bgExpressSecondaryInverted, "bgExpressSecondaryInverted"), g.h(R.attr.bgFreshPrimary, "bgFreshPrimary"), g.h(R.attr.bgFreshPrimaryInverted, "bgFreshPrimaryInverted"), g.h(R.attr.bgFreshSecondary, "bgFreshSecondary"), g.h(R.attr.bgFreshSecondaryInverted, "bgFreshSecondaryInverted"), g.h(R.attr.bgMarketingOnLight, "bgMarketingOnLight"), g.h(R.attr.bgMarketingPrimary, "bgMarketingPrimary"), g.h(R.attr.bgMarketingPrimaryInverted, "bgMarketingPrimaryInverted"), g.h(R.attr.bgMarketingSecondary, "bgMarketingSecondary"), g.h(R.attr.bgMarketingSecondaryInverted, "bgMarketingSecondaryInverted"), g.h(R.attr.bgNegativePrimary, "bgNegativePrimary"), g.h(R.attr.bgNegativePrimaryInverted, "bgNegativePrimaryInverted"), g.h(R.attr.bgNegativeSecondary, "bgNegativeSecondary"), g.h(R.attr.bgNegativeSecondaryInverted, "bgNegativeSecondaryInverted"), g.h(R.attr.bgOpaqueActionSecondary, "bgOpaqueActionSecondary"), g.h(R.attr.bgOpaqueAccentSecondary, "bgOpaqueAccentSecondary"), g.h(R.attr.bgOpaquePositiveSecondary, "bgOpaquePositiveSecondary"), g.h(R.attr.bgOpaqueWarningSecondary, "bgOpaqueWarningSecondary"), g.h(R.attr.bgOpaqueMarketingSecondary, "bgOpaqueMarketingSecondary"), g.h(R.attr.bgPositiveOnLight, "bgPositiveOnLight"), g.h(R.attr.bgPositivePrimary, "bgPositivePrimary"), g.h(R.attr.bgPositivePrimaryInverted, "bgPositivePrimaryInverted"), g.h(R.attr.bgPositiveSecondary, "bgPositiveSecondary"), g.h(R.attr.bgPositiveSecondaryInverted, "bgPositiveSecondaryInverted"), g.h(R.attr.bgPremiumPrimary, "bgPremiumPrimary"), g.h(R.attr.bgPremiumPrimaryInverted, "bgPremiumPrimaryInverted"), g.h(R.attr.bgPremiumSecondary, "bgPremiumSecondary"), g.h(R.attr.bgPremiumSecondaryInverted, "bgPremiumSecondaryInverted"), g.h(R.attr.bgPrimary, "bgPrimary"), g.h(R.attr.bgPrimaryInverted, "bgPrimaryInverted"), g.h(R.attr.bgSecondary, "bgSecondary"), g.h(R.attr.bgSecondaryInverted, "bgSecondaryInverted"), g.h(R.attr.bgWarningOnLight, "bgWarningOnLight"), g.h(R.attr.bgWarningPrimary, "bgWarningPrimary"), g.h(R.attr.bgWarningPrimaryInverted, "bgWarningPrimaryInverted"), g.h(R.attr.bgWarningSecondary, "bgWarningSecondary"), g.h(R.attr.bgWarningSecondaryInverted, "bgWarningSecondaryInverted"), g.h(R.attr.graphicActiveAccentPrimary, "graphicActiveAccentPrimary"), g.h(R.attr.graphicActiveAccentPrimaryInverted, "graphicActiveAccentPrimaryInverted"), g.h(R.attr.graphicActiveActionPrimary, "graphicActiveActionPrimary"), g.h(R.attr.graphicActiveActionPrimaryInverted, "graphicActiveActionPrimaryInverted"), g.h(R.attr.graphicActiveBestprice, "graphicActiveBestprice"), g.h(R.attr.graphicActiveBestpriceInverted, "graphicActiveBestpriceInverted"), g.h(R.attr.graphicActiveExpress, "graphicActiveExpress"), g.h(R.attr.graphicActiveExpressInverted, "graphicActiveExpressInverted"), g.h(R.attr.graphicActiveFresh, "graphicActiveFresh"), g.h(R.attr.graphicActiveFreshInverted, "graphicActiveFreshInverted"), g.h(R.attr.graphicActiveMarketing, "graphicActiveMarketing"), g.h(R.attr.graphicActiveMarketingInverted, "graphicActiveMarketingInverted"), g.h(R.attr.graphicActiveNegativePrimary, "graphicActiveNegativePrimary"), g.h(R.attr.graphicActiveNegativePrimaryInverted, "graphicActiveNegativePrimaryInverted"), g.h(R.attr.graphicActivePositivePrimary, "graphicActivePositivePrimary"), g.h(R.attr.graphicActivePositivePrimaryInverted, "graphicActivePositivePrimaryInverted"), g.h(R.attr.graphicActivePremium, "graphicActivePremium"), g.h(R.attr.graphicActivePremiumInverted, "graphicActivePremiumInverted"), g.h(R.attr.graphicActiveRating, "graphicActiveRating"), g.h(R.attr.graphicActiveRatingInverted, "graphicActiveRatingInverted"), g.h(R.attr.graphicActiveWarningPrimary, "graphicActiveWarningPrimary"), g.h(R.attr.graphicActiveWarningPrimaryInverted, "graphicActiveWarningPrimaryInverted"), g.h(R.attr.graphicAccentOnLight, "graphicAccentOnLight"), g.h(R.attr.graphicAccentPrimary, "graphicAccentPrimary"), g.h(R.attr.graphicAccentPrimaryInverted, "graphicAccentPrimaryInverted"), g.h(R.attr.graphicActionPrimary, "graphicActionPrimary"), g.h(R.attr.graphicActionPrimaryInverted, "graphicActionPrimaryInverted"), g.h(R.attr.graphicBestprice, "graphicBestprice"), g.h(R.attr.graphicBestpriceInverted, "graphicBestpriceInverted"), g.h(R.attr.graphicDisabled, "graphicDisabled"), g.h(R.attr.graphicDisabledInverted, "graphicDisabledInverted"), g.h(R.attr.graphicExpress, "graphicExpress"), g.h(R.attr.graphicExpressInverted, "graphicExpressInverted"), g.h(R.attr.graphicFresh, "graphicFresh"), g.h(R.attr.graphicFreshInverted, "graphicFreshInverted"), g.h(R.attr.graphicKey, "graphicKey"), g.h(R.attr.graphicKeyInverted, "graphicKeyInverted"), g.h(R.attr.graphicMarketing, "graphicMarketing"), g.h(R.attr.graphicMarketingOnLight, "graphicMarketingOnLight"), g.h(R.attr.graphicMarketingInverted, "graphicMarketingInverted"), g.h(R.attr.graphicNegativePrimary, "graphicNegativePrimary"), g.h(R.attr.graphicNegativePrimaryInverted, "graphicNegativePrimaryInverted"), g.h(R.attr.graphicNeutral, "graphicNeutral"), g.h(R.attr.graphicNeutralInverted, "graphicNeutralInverted"), g.h(R.attr.graphicPositiveOnDark, "graphicPositiveOnDark"), g.h(R.attr.graphicPositivePrimary, "graphicPositivePrimary"), g.h(R.attr.graphicPositivePrimaryInverted, "graphicPositivePrimaryInverted"), g.h(R.attr.graphicPositiveSecondary, "graphicPositiveSecondary"), g.h(R.attr.graphicPremium, "graphicPremium"), g.h(R.attr.graphicPremiumInverted, "graphicPremiumInverted"), g.h(R.attr.graphicPrimary, "graphicPrimary"), g.h(R.attr.graphicPrimaryInverted, "graphicPrimaryInverted"), g.h(R.attr.graphicRating, "graphicRating"), g.h(R.attr.graphicRatingInverted, "graphicRatingInverted"), g.h(R.attr.graphicSecondary, "graphicSecondary"), g.h(R.attr.graphicSecondaryInverted, "graphicSecondaryInverted"), g.h(R.attr.graphicTertiary, "graphicTertiary"), g.h(R.attr.graphicTertiaryInverted, "graphicTertiaryInverted"), g.h(R.attr.graphicWarningOnDark, "graphicWarningOnDark"), g.h(R.attr.graphicWarningPrimary, "graphicWarningPrimary"), g.h(R.attr.graphicWarningPrimaryInverted, "graphicWarningPrimaryInverted"), g.h(R.attr.layerActiveFloor0, "layerActiveFloor0"), g.h(R.attr.layerActiveFloor1, "layerActiveFloor1"), g.h(R.attr.layerActiveFloor1Inverted, "layerActiveFloor1Inverted"), g.h(R.attr.layerActiveFloor2, "layerActiveFloor2"), g.h(R.attr.layerActiveFloor2Inverted, "layerActiveFloor2Inverted"), g.h(R.attr.layerActiveFloor3, "layerActiveFloor3"), g.h(R.attr.layerActiveFloor3Inverted, "layerActiveFloor3Inverted"), g.h(R.attr.layerActiveSurface, "layerActiveSurface"), g.h(R.attr.layerActiveSurfaceInverted, "layerActiveSurfaceInverted"), g.h(R.attr.layerFloor0, "layerFloor0"), g.h(R.attr.layerFloor0Inverted, "layerFloor0Inverted"), g.h(R.attr.layerFloor1, StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR), g.h(R.attr.layerFloor1Inverted, "layerFloor1Inverted"), g.h(R.attr.layerFloor2, "layerFloor2"), g.h(R.attr.layerFloor2Inverted, "layerFloor2Inverted"), g.h(R.attr.layerFloor3, "layerFloor3"), g.h(R.attr.layerFloor3Inverted, "layerFloor3Inverted"), g.h(R.attr.layerOverlayDimming, "layerOverlayDimming"), g.h(R.attr.layerOverlayDimmingInverted, "layerOverlayDimmingInverted"), g.h(R.attr.layerOverlayParanja, "layerOverlayParanja"), g.h(R.attr.layerOverlayParanjaInverted, "layerOverlayParanjaInverted"), g.h(R.attr.layerSurface, "layerSurface"), g.h(R.attr.layerSurfaceInverted, "layerSurfaceInverted"), g.h(R.attr.textActiveAccent, "textActiveAccent"), g.h(R.attr.textActiveAccentInverted, "textActiveAccentInverted"), g.h(R.attr.textActiveAction, "textActiveAction"), g.h(R.attr.textActiveActionInverted, "textActiveActionInverted"), g.h(R.attr.textActiveBestprice, "textActiveBestprice"), g.h(R.attr.textActiveBestpriceInverted, "textActiveBestpriceInverted"), g.h(R.attr.textActiveExpress, "textActiveExpress"), g.h(R.attr.textActiveExpressInverted, "textActiveExpressInverted"), g.h(R.attr.textActiveFresh, "textActiveFresh"), g.h(R.attr.textActiveFreshInverted, "textActiveFreshInverted"), g.h(R.attr.textActiveMarketing, "textActiveMarketing"), g.h(R.attr.textActiveMarketingInverted, "textActiveMarketingInverted"), g.h(R.attr.textActiveNegative, "textActiveNegative"), g.h(R.attr.textActiveNegativeInverted, "textActiveNegativeInverted"), g.h(R.attr.textActivePositive, "textActivePositive"), g.h(R.attr.textActivePositiveInverted, "textActivePositiveInverted"), g.h(R.attr.textActivePremium, "textActivePremium"), g.h(R.attr.textActivePremiumInverted, "textActivePremiumInverted"), g.h(R.attr.textActiveWarning, "textActiveWarning"), g.h(R.attr.textActiveWarningInverted, "textActiveWarningInverted"), g.h(R.attr.textAccent, "textAccent"), g.h(R.attr.textAccentOnLight, "textAccentOnLight"), g.h(R.attr.textAccentInverted, "textAccentInverted"), g.h(R.attr.textAction, "textAction"), g.h(R.attr.textActionInverted, "textActionInverted"), g.h(R.attr.textBestprice, "textBestprice"), g.h(R.attr.textBestpriceInverted, "textBestpriceInverted"), g.h(R.attr.textDiscountUnavialable, "textDiscountUnavialable"), g.h(R.attr.textExpress, "textExpress"), g.h(R.attr.textExpressInverted, "textExpressInverted"), g.h(R.attr.textFresh, "textFresh"), g.h(R.attr.textFreshInverted, "textFreshInverted"), g.h(R.attr.textMarketing, "textMarketing"), g.h(R.attr.textMarketingOnLight, "textMarketingOnLight"), g.h(R.attr.textMarketingInverted, "textMarketingInverted"), g.h(R.attr.textNegative, "textNegative"), g.h(R.attr.textNegativeInverted, "textNegativeInverted"), g.h(R.attr.textOriginalprice, "textOriginalprice"), g.h(R.attr.textOriginalpriceAvailable, "textOriginalpriceAvailable"), g.h(R.attr.textPositive, "textPositive"), g.h(R.attr.textPositiveOnDark, "textPositiveOnDark"), g.h(R.attr.textPositiveInverted, "textPositiveInverted"), g.h(R.attr.textPremium, "textPremium"), g.h(R.attr.textPremiumInverted, "textPremiumInverted"), g.h(R.attr.textPrimary, "textPrimary"), g.h(R.attr.textPrimaryInverted, "textPrimaryInverted"), g.h(R.attr.textSecondary, "textSecondary"), g.h(R.attr.textSecondaryInverted, "textSecondaryInverted"), g.h(R.attr.textTertiary, "textTertiary"), g.h(R.attr.textTertiaryInverted, "textTertiaryInverted"), g.h(R.attr.textWarning, "textWarning"), g.h(R.attr.textWarningOnDark, "textWarningOnDark"), g.h(R.attr.textWarningInverted, "textWarningInverted"), g.h(R.attr.textPrimaryDynamic, "textPrimaryDynamic"), g.h(R.attr.textPrimaryDynamicInverted, "textPrimaryDynamicInverted"), g.h(R.attr.textSecondaryDynamic, "textSecondaryDynamic"), g.h(R.attr.textSecondaryDynamicInverted, "textSecondaryDynamicInverted"), g.h(R.attr.graphicPrimaryDynamic, "graphicPrimaryDynamic"), g.h(R.attr.graphicSecondaryDynamic, "graphicSecondaryDynamic"), g.h(R.attr.graphicPrimaryDynamicInverted, "graphicPrimaryDynamicInverted"), g.h(R.attr.graphicSecondaryDynamicInverted, "graphicSecondaryDynamicInverted"), g.h(R.attr.bgSecondaryDynamic, "bgSecondaryDynamic"), g.h(R.attr.bgSecondaryDynamicInverted, "bgSecondaryDynamicInverted"));
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

    private final Activity getActiveActivity() {
        return (Activity) C7714v.Z(list);
    }

    private final Integer getColorResByToken(Context context, String colorToken) {
        int themeColorRes;
        if (colorToken == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(colorToken, "attr", context.getApplicationContext().getPackageName());
        if (identifier != 0 && (themeColorRes = ThemeExtKt.themeColorRes(context, identifier)) != 0) {
            return Integer.valueOf(themeColorRes);
        }
        b bVar = UiKitCoreColorMap.get(colorToken);
        if (bVar != null) {
            return Integer.valueOf(bVar.d());
        }
        return null;
    }

    private final Integer parseHexColor(String color) {
        try {
            return Integer.valueOf(Color.parseColor(color));
        } catch (Exception unused) {
            return null;
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
            Context resolveTheme$design_system_release = resolveTheme$design_system_release(context);
            NewColorPalette newColorPalette = NewColorPalette.INSTANCE;
            String lowerCase = color.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer colorResource = newColorPalette.getColorResource(resolveTheme$design_system_release, lowerCase);
            if (colorResource == null) {
                colorResource = getColorResByToken(resolveTheme$design_system_release, color);
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
        Context resolveTheme$design_system_release = resolveTheme$design_system_release(context);
        Integer mapColor = mapColor(resolveTheme$design_system_release, color);
        if (mapColor == null) {
            return parseHexColor(color);
        }
        try {
            return Integer.valueOf(androidx.core.content.a.getColor(resolveTheme$design_system_release, mapColor.intValue()));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @NotNull
    public final Context resolveTheme$design_system_release(@NotNull Context context) {
        Activity activeActivity;
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (!Intrinsics.d(context.getApplicationContext(), context) || (activeActivity = getActiveActivity()) == null) ? context : activeActivity;
    }
}
