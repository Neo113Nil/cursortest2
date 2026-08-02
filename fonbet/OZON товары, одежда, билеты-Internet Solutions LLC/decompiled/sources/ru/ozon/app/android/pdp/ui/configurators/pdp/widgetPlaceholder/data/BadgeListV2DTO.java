package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import B0.C2454a;
import C.o0;
import Ek.a;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0001H\u0016J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003JQ\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "spacedBy", "", "inset", "json", "<init>", "(Ljava/util/List;Ljava/util/Map;IILjava/lang/String;)V", "getBadges", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getSpacedBy", "()I", "getInset", "getJson", "()Ljava/lang/String;", "setJson", "(Ljava/lang/String;)V", "copyExcludingAnalytics", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeListV2DTO extends BasePlaceholderWidgetObject {
    public static final int $stable = 8;

    @NotNull
    private final List<BadgeDTO> badges;
    private final int inset;
    private String json;
    private final int spacedBy;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public /* synthetic */ BadgeListV2DTO(List list, Map map, int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 10 : i12, str);
    }

    public static /* synthetic */ BadgeListV2DTO copy$default(BadgeListV2DTO badgeListV2DTO, List list, Map map, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = badgeListV2DTO.badges;
        }
        if ((i13 & 2) != 0) {
            map = badgeListV2DTO.trackingInfo;
        }
        if ((i13 & 4) != 0) {
            i11 = badgeListV2DTO.spacedBy;
        }
        if ((i13 & 8) != 0) {
            i12 = badgeListV2DTO.inset;
        }
        if ((i13 & 16) != 0) {
            str = badgeListV2DTO.json;
        }
        String str2 = str;
        int i14 = i11;
        return badgeListV2DTO.copy(list, map, i14, i12, str2);
    }

    @NotNull
    public final List<BadgeDTO> component1() {
        return this.badges;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSpacedBy() {
        return this.spacedBy;
    }

    /* renamed from: component4, reason: from getter */
    public final int getInset() {
        return this.inset;
    }

    /* renamed from: component5, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final BadgeListV2DTO copy(@NotNull List<BadgeDTO> badges, Map<String, TokenizedTrackingInfo> trackingInfo, int spacedBy, int inset, String json) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new BadgeListV2DTO(badges, trackingInfo, spacedBy, inset, json);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    @NotNull
    public BasePlaceholderWidgetObject copyExcludingAnalytics() {
        List<BadgeDTO> list = this.badges;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (BadgeDTO badgeDTO : list) {
            CommonControlSettings common = badgeDTO.getCommon();
            arrayList.add(BadgeDTO.copy$default(badgeDTO, null, null, null, null, null, common != null ? CommonControlSettings.copy$default(common, null, null, null, 5, null) : null, null, null, null, null, null, null, 4063, null));
        }
        return copy$default(this, arrayList, null, 0, 0, null, 28, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListV2DTO)) {
            return false;
        }
        BadgeListV2DTO badgeListV2DTO = (BadgeListV2DTO) other;
        return Intrinsics.d(this.badges, badgeListV2DTO.badges) && Intrinsics.d(this.trackingInfo, badgeListV2DTO.trackingInfo) && this.spacedBy == badgeListV2DTO.spacedBy && this.inset == badgeListV2DTO.inset && Intrinsics.d(this.json, badgeListV2DTO.json);
    }

    @NotNull
    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final int getInset() {
        return this.inset;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public String getJson() {
        return this.json;
    }

    public final int getSpacedBy() {
        return this.spacedBy;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.badges.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int a11 = C2454a.a(this.inset, C2454a.a(this.spacedBy, (hashCode + (map == null ? 0 : map.hashCode())) * 31, 31), 31);
        String str = this.json;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public void setJson(String str) {
        this.json = str;
    }

    @NotNull
    public String toString() {
        List<BadgeDTO> list = this.badges;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int i11 = this.spacedBy;
        int i12 = this.inset;
        String str = this.json;
        StringBuilder sb2 = new StringBuilder("BadgeListV2DTO(badges=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", spacedBy=");
        a.f(i11, i12, ", inset=", ", json=", sb2);
        return o0.c(sb2, str, ")");
    }

    public BadgeListV2DTO(@NotNull List<BadgeDTO> badges, Map<String, TokenizedTrackingInfo> map, int i11, int i12, String str) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.badges = badges;
        this.trackingInfo = map;
        this.spacedBy = i11;
        this.inset = i12;
        this.json = str;
    }
}
