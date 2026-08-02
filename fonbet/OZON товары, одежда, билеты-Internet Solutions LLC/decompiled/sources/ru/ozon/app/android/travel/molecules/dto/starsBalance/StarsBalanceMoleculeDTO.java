package ru.ozon.app.android.travel.molecules.dto.starsBalance;

import D3.g;
import El.C2971a;
import F3.G;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/starsBalance/StarsBalanceMoleculeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titlePrefix", "subtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitlePrefix", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StarsBalanceMoleculeDTO {

    @NotNull
    private final IconDTO icon;
    private final TravelWidgetSettingsDTO settings;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final TextDTO titlePrefix;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public StarsBalanceMoleculeDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull TextDTO subtitle, @NotNull IconDTO icon, TravelWidgetSettingsDTO travelWidgetSettingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.title = title;
        this.titlePrefix = textDTO;
        this.subtitle = subtitle;
        this.icon = icon;
        this.settings = travelWidgetSettingsDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ StarsBalanceMoleculeDTO copy$default(StarsBalanceMoleculeDTO starsBalanceMoleculeDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconDTO iconDTO, TravelWidgetSettingsDTO travelWidgetSettingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = starsBalanceMoleculeDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = starsBalanceMoleculeDTO.titlePrefix;
        }
        if ((i11 & 4) != 0) {
            textDTO3 = starsBalanceMoleculeDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            iconDTO = starsBalanceMoleculeDTO.icon;
        }
        if ((i11 & 16) != 0) {
            travelWidgetSettingsDTO = starsBalanceMoleculeDTO.settings;
        }
        if ((i11 & 32) != 0) {
            map = starsBalanceMoleculeDTO.trackingInfo;
        }
        TravelWidgetSettingsDTO travelWidgetSettingsDTO2 = travelWidgetSettingsDTO;
        Map map2 = map;
        return starsBalanceMoleculeDTO.copy(textDTO, textDTO2, textDTO3, iconDTO, travelWidgetSettingsDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitlePrefix() {
        return this.titlePrefix;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final StarsBalanceMoleculeDTO copy(@NotNull TextDTO title, TextDTO titlePrefix, @NotNull TextDTO subtitle, @NotNull IconDTO icon, TravelWidgetSettingsDTO settings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new StarsBalanceMoleculeDTO(title, titlePrefix, subtitle, icon, settings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarsBalanceMoleculeDTO)) {
            return false;
        }
        StarsBalanceMoleculeDTO starsBalanceMoleculeDTO = (StarsBalanceMoleculeDTO) other;
        return Intrinsics.d(this.title, starsBalanceMoleculeDTO.title) && Intrinsics.d(this.titlePrefix, starsBalanceMoleculeDTO.titlePrefix) && Intrinsics.d(this.subtitle, starsBalanceMoleculeDTO.subtitle) && Intrinsics.d(this.icon, starsBalanceMoleculeDTO.icon) && Intrinsics.d(this.settings, starsBalanceMoleculeDTO.settings) && Intrinsics.d(this.trackingInfo, starsBalanceMoleculeDTO.trackingInfo);
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final TextDTO getTitlePrefix() {
        return this.titlePrefix;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.titlePrefix;
        int a11 = C2971a.a(this.icon, b.a(this.subtitle, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31);
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
        int hashCode2 = (a11 + (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.titlePrefix;
        TextDTO textDTO3 = this.subtitle;
        IconDTO iconDTO = this.icon;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("StarsBalanceMoleculeDTO(title=", textDTO, ", titlePrefix=", textDTO2, ", subtitle=");
        G.f(g10, textDTO3, ", icon=", iconDTO, ", settings=");
        g10.append(travelWidgetSettingsDTO);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
