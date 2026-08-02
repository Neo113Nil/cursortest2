package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation;

import Bi.a;
import El.C2971a;
import G.g;
import Ns.b;
import Tz.C4055a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/ButtonVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "", "backgroundColor", "activeBackgroundColor", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettings", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;", "settings", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Ljava/lang/String;", "getBackgroundColor", "getActiveBackgroundColor", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonVO {
    public static final int $stable = IconDTO.$stable;
    private final String activeBackgroundColor;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CommonControlSettings commonControlSettings;

    @NotNull
    private final IconDTO icon;
    private final int id;
    private final IndicatorDTO indicator;

    @NotNull
    private final SettingsVO settings;

    @NotNull
    private final TextDTO text;

    public ButtonVO(int i11, @NotNull TextDTO text, @NotNull IconDTO icon, IndicatorDTO indicatorDTO, @NotNull String backgroundColor, String str, @NotNull CommonControlSettings commonControlSettings, @NotNull SettingsVO settings) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.id = i11;
        this.text = text;
        this.icon = icon;
        this.indicator = indicatorDTO;
        this.backgroundColor = backgroundColor;
        this.activeBackgroundColor = str;
        this.commonControlSettings = commonControlSettings;
        this.settings = settings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonVO)) {
            return false;
        }
        ButtonVO buttonVO = (ButtonVO) other;
        return this.id == buttonVO.id && Intrinsics.d(this.text, buttonVO.text) && Intrinsics.d(this.icon, buttonVO.icon) && Intrinsics.d(this.indicator, buttonVO.indicator) && Intrinsics.d(this.backgroundColor, buttonVO.backgroundColor) && Intrinsics.d(this.activeBackgroundColor, buttonVO.activeBackgroundColor) && Intrinsics.d(this.commonControlSettings, buttonVO.commonControlSettings) && Intrinsics.d(this.settings, buttonVO.settings);
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

    public final int getId() {
        return this.id;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    @NotNull
    public final SettingsVO getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = C2971a.a(this.icon, b.a(this.text, Integer.hashCode(this.id) * 31, 31), 31);
        IndicatorDTO indicatorDTO = this.indicator;
        int a12 = g.a((a11 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31, 31, this.backgroundColor);
        String str = this.activeBackgroundColor;
        return this.settings.hashCode() + a.a(this.commonControlSettings, (a12 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        IndicatorDTO indicatorDTO = this.indicator;
        String str = this.backgroundColor;
        String str2 = this.activeBackgroundColor;
        CommonControlSettings commonControlSettings = this.commonControlSettings;
        SettingsVO settingsVO = this.settings;
        StringBuilder b11 = C4055a.b(textDTO, "ButtonVO(id=", ", text=", ", icon=", i11);
        b11.append(iconDTO);
        b11.append(", indicator=");
        b11.append(indicatorDTO);
        b11.append(", backgroundColor=");
        Nh.a.h(b11, str, ", activeBackgroundColor=", str2, ", commonControlSettings=");
        b11.append(commonControlSettings);
        b11.append(", settings=");
        b11.append(settingsVO);
        b11.append(")");
        return b11.toString();
    }
}
