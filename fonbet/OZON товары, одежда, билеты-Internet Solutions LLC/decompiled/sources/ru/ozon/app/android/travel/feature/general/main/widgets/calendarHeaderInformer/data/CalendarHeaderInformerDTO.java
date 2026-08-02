package ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.data;

import Gl.C3124a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/data/CalendarHeaderInformerDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarHeaderInformerDTO {
    public static final int $stable = 8;

    @NotNull
    private final BadgeDTO badge;
    private final DisclaimerDTO disclaimer;
    private final TravelWidgetSettingsDTO settings;

    @NotNull
    private final TextDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CalendarHeaderInformerDTO(@NotNull TextDTO text, @NotNull BadgeDTO badge, DisclaimerDTO disclaimerDTO, TravelWidgetSettingsDTO travelWidgetSettingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.text = text;
        this.badge = badge;
        this.disclaimer = disclaimerDTO;
        this.settings = travelWidgetSettingsDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CalendarHeaderInformerDTO copy$default(CalendarHeaderInformerDTO calendarHeaderInformerDTO, TextDTO textDTO, BadgeDTO badgeDTO, DisclaimerDTO disclaimerDTO, TravelWidgetSettingsDTO travelWidgetSettingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = calendarHeaderInformerDTO.text;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = calendarHeaderInformerDTO.badge;
        }
        if ((i11 & 4) != 0) {
            disclaimerDTO = calendarHeaderInformerDTO.disclaimer;
        }
        if ((i11 & 8) != 0) {
            travelWidgetSettingsDTO = calendarHeaderInformerDTO.settings;
        }
        if ((i11 & 16) != 0) {
            map = calendarHeaderInformerDTO.trackingInfo;
        }
        Map map2 = map;
        DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
        return calendarHeaderInformerDTO.copy(textDTO, badgeDTO, disclaimerDTO2, travelWidgetSettingsDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component4, reason: from getter */
    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final CalendarHeaderInformerDTO copy(@NotNull TextDTO text, @NotNull BadgeDTO badge, DisclaimerDTO disclaimer, TravelWidgetSettingsDTO settings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(badge, "badge");
        return new CalendarHeaderInformerDTO(text, badge, disclaimer, settings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarHeaderInformerDTO)) {
            return false;
        }
        CalendarHeaderInformerDTO calendarHeaderInformerDTO = (CalendarHeaderInformerDTO) other;
        return Intrinsics.d(this.text, calendarHeaderInformerDTO.text) && Intrinsics.d(this.badge, calendarHeaderInformerDTO.badge) && Intrinsics.d(this.disclaimer, calendarHeaderInformerDTO.disclaimer) && Intrinsics.d(this.settings, calendarHeaderInformerDTO.settings) && Intrinsics.d(this.trackingInfo, calendarHeaderInformerDTO.trackingInfo);
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C3124a.c(this.badge, this.text.hashCode() * 31, 31);
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int hashCode = (c11 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
        int hashCode2 = (hashCode + (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        BadgeDTO badgeDTO = this.badge;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CalendarHeaderInformerDTO(text=");
        sb2.append(textDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", disclaimer=");
        sb2.append(disclaimerDTO);
        sb2.append(", settings=");
        sb2.append(travelWidgetSettingsDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
