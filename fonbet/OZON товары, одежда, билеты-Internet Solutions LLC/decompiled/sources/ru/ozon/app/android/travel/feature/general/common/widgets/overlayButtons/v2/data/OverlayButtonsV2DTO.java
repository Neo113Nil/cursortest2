package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data;

import B3.p;
import Bi.a;
import Bk.C2638a;
import Bl.C2639a;
import El.C2971a;
import G.g;
import GR.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%BI\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;", "", "buttons", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$ButtonDTO;", "backgroundColor", "", "dividerColor", "viewTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "asyncBehavior", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;)V", "getButtons", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getDividerColor", "getViewTracking", "()Ljava/util/Map;", "getAsyncBehavior", "()Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ButtonDTO", "SettingsDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OverlayButtonsV2DTO {
    public static final int $stable = 8;
    private final AsyncActionDTO asyncBehavior;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<ButtonDTO> buttons;
    private final String dividerColor;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JS\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$ButtonDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "backgroundColor", "", "activeBackgroundColor", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "settings", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$SettingsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$SettingsDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getActiveBackgroundColor", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getSettings", "()Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$SettingsDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonDTO {
        public static final int $stable = IconDTO.$stable;
        private final String activeBackgroundColor;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final CommonControlSettings commonControlSettings;

        @NotNull
        private final IconDTO icon;
        private final IndicatorDTO indicator;

        @NotNull
        private final SettingsDTO settings;

        @NotNull
        private final TextDTO text;

        public ButtonDTO(@NotNull TextDTO text, @NotNull IconDTO icon, IndicatorDTO indicatorDTO, @NotNull String backgroundColor, String str, @NotNull CommonControlSettings commonControlSettings, @NotNull SettingsDTO settings) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.text = text;
            this.icon = icon;
            this.indicator = indicatorDTO;
            this.backgroundColor = backgroundColor;
            this.activeBackgroundColor = str;
            this.commonControlSettings = commonControlSettings;
            this.settings = settings;
        }

        public static /* synthetic */ ButtonDTO copy$default(ButtonDTO buttonDTO, TextDTO textDTO, IconDTO iconDTO, IndicatorDTO indicatorDTO, String str, String str2, CommonControlSettings commonControlSettings, SettingsDTO settingsDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = buttonDTO.text;
            }
            if ((i11 & 2) != 0) {
                iconDTO = buttonDTO.icon;
            }
            if ((i11 & 4) != 0) {
                indicatorDTO = buttonDTO.indicator;
            }
            if ((i11 & 8) != 0) {
                str = buttonDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                str2 = buttonDTO.activeBackgroundColor;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = buttonDTO.commonControlSettings;
            }
            if ((i11 & 64) != 0) {
                settingsDTO = buttonDTO.settings;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            SettingsDTO settingsDTO2 = settingsDTO;
            String str3 = str2;
            IndicatorDTO indicatorDTO2 = indicatorDTO;
            return buttonDTO.copy(textDTO, iconDTO, indicatorDTO2, str, str3, commonControlSettings2, settingsDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getActiveBackgroundColor() {
            return this.activeBackgroundColor;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final SettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final ButtonDTO copy(@NotNull TextDTO text, @NotNull IconDTO icon, IndicatorDTO indicator, @NotNull String backgroundColor, String activeBackgroundColor, @NotNull CommonControlSettings commonControlSettings, @NotNull SettingsDTO settings) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new ButtonDTO(text, icon, indicator, backgroundColor, activeBackgroundColor, commonControlSettings, settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonDTO)) {
                return false;
            }
            ButtonDTO buttonDTO = (ButtonDTO) other;
            return Intrinsics.d(this.text, buttonDTO.text) && Intrinsics.d(this.icon, buttonDTO.icon) && Intrinsics.d(this.indicator, buttonDTO.indicator) && Intrinsics.d(this.backgroundColor, buttonDTO.backgroundColor) && Intrinsics.d(this.activeBackgroundColor, buttonDTO.activeBackgroundColor) && Intrinsics.d(this.commonControlSettings, buttonDTO.commonControlSettings) && Intrinsics.d(this.settings, buttonDTO.settings);
        }

        public final String getActiveBackgroundColor() {
            return this.activeBackgroundColor;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final SettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.icon, this.text.hashCode() * 31, 31);
            IndicatorDTO indicatorDTO = this.indicator;
            int a12 = g.a((a11 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31, 31, this.backgroundColor);
            String str = this.activeBackgroundColor;
            return this.settings.hashCode() + a.a(this.commonControlSettings, (a12 + (str != null ? str.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.icon;
            IndicatorDTO indicatorDTO = this.indicator;
            String str = this.backgroundColor;
            String str2 = this.activeBackgroundColor;
            CommonControlSettings commonControlSettings = this.commonControlSettings;
            SettingsDTO settingsDTO = this.settings;
            StringBuilder d11 = C2639a.d("ButtonDTO(text=", ", icon=", ", indicator=", iconDTO, textDTO);
            d11.append(indicatorDTO);
            d11.append(", backgroundColor=");
            d11.append(str);
            d11.append(", activeBackgroundColor=");
            d11.append(str2);
            d11.append(", commonControlSettings=");
            d11.append(commonControlSettings);
            d11.append(", settings=");
            d11.append(settingsDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$SettingsDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottomPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings leftPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings rightPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings topPadding;

        public SettingsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = settingsDTO.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = settingsDTO.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = settingsDTO.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = settingsDTO.rightPadding;
            }
            return settingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final SettingsDTO copy(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            return new SettingsDTO(topPadding, bottomPadding, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return this.topPadding == settingsDTO.topPadding && this.bottomPadding == settingsDTO.bottomPadding && this.leftPadding == settingsDTO.leftPadding && this.rightPadding == settingsDTO.rightPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.rightPadding.hashCode() + b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return b.e(p.b("SettingsDTO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }

        public SettingsDTO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
        }

        public /* synthetic */ SettingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    public OverlayButtonsV2DTO(@NotNull List<ButtonDTO> buttons, @NotNull String backgroundColor, String str, Map<String, TokenizedTrackingInfo> map, AsyncActionDTO asyncActionDTO) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.buttons = buttons;
        this.backgroundColor = backgroundColor;
        this.dividerColor = str;
        this.viewTracking = map;
        this.asyncBehavior = asyncActionDTO;
    }

    public static /* synthetic */ OverlayButtonsV2DTO copy$default(OverlayButtonsV2DTO overlayButtonsV2DTO, List list, String str, String str2, Map map, AsyncActionDTO asyncActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = overlayButtonsV2DTO.buttons;
        }
        if ((i11 & 2) != 0) {
            str = overlayButtonsV2DTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            str2 = overlayButtonsV2DTO.dividerColor;
        }
        if ((i11 & 8) != 0) {
            map = overlayButtonsV2DTO.viewTracking;
        }
        if ((i11 & 16) != 0) {
            asyncActionDTO = overlayButtonsV2DTO.asyncBehavior;
        }
        AsyncActionDTO asyncActionDTO2 = asyncActionDTO;
        String str3 = str2;
        return overlayButtonsV2DTO.copy(list, str, str3, map, asyncActionDTO2);
    }

    @NotNull
    public final List<ButtonDTO> component1() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDividerColor() {
        return this.dividerColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.viewTracking;
    }

    /* renamed from: component5, reason: from getter */
    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    @NotNull
    public final OverlayButtonsV2DTO copy(@NotNull List<ButtonDTO> buttons, @NotNull String backgroundColor, String dividerColor, Map<String, TokenizedTrackingInfo> viewTracking, AsyncActionDTO asyncBehavior) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new OverlayButtonsV2DTO(buttons, backgroundColor, dividerColor, viewTracking, asyncBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayButtonsV2DTO)) {
            return false;
        }
        OverlayButtonsV2DTO overlayButtonsV2DTO = (OverlayButtonsV2DTO) other;
        return Intrinsics.d(this.buttons, overlayButtonsV2DTO.buttons) && Intrinsics.d(this.backgroundColor, overlayButtonsV2DTO.backgroundColor) && Intrinsics.d(this.dividerColor, overlayButtonsV2DTO.dividerColor) && Intrinsics.d(this.viewTracking, overlayButtonsV2DTO.viewTracking) && Intrinsics.d(this.asyncBehavior, overlayButtonsV2DTO.asyncBehavior);
    }

    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonDTO> getButtons() {
        return this.buttons;
    }

    public final String getDividerColor() {
        return this.dividerColor;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int a11 = g.a(this.buttons.hashCode() * 31, 31, this.backgroundColor);
        String str = this.dividerColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        AsyncActionDTO asyncActionDTO = this.asyncBehavior;
        return hashCode2 + (asyncActionDTO != null ? asyncActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ButtonDTO> list = this.buttons;
        String str = this.backgroundColor;
        String str2 = this.dividerColor;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        AsyncActionDTO asyncActionDTO = this.asyncBehavior;
        StringBuilder a11 = C4055a.a("OverlayButtonsV2DTO(buttons=", ", backgroundColor=", str, ", dividerColor=", list);
        C2638a.e(a11, str2, ", viewTracking=", map, ", asyncBehavior=");
        a11.append(asyncActionDTO);
        a11.append(")");
        return a11.toString();
    }

    public OverlayButtonsV2DTO(List list, String str, String str2, Map map, AsyncActionDTO asyncActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, str, str2, map, asyncActionDTO);
    }
}
