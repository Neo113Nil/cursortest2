package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u0001H\u0016J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003JN\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListDTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", "badges", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "horizontalScrollEnabled", "", "json", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBadges", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getHorizontalScrollEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJson", "()Ljava/lang/String;", "setJson", "(Ljava/lang/String;)V", "copyExcludingAnalytics", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListDTO;", "equals", "other", "", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeListDTO extends BasePlaceholderWidgetObject {
    public static final int $stable = 8;

    @NotNull
    private final List<Badge> badges;
    private final Boolean horizontalScrollEnabled;
    private String json;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public /* synthetic */ BadgeListDTO(List list, Map map, Boolean bool, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : map, bool, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BadgeListDTO copy$default(BadgeListDTO badgeListDTO, List list, Map map, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = badgeListDTO.badges;
        }
        if ((i11 & 2) != 0) {
            map = badgeListDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            bool = badgeListDTO.horizontalScrollEnabled;
        }
        if ((i11 & 8) != 0) {
            str = badgeListDTO.json;
        }
        return badgeListDTO.copy(list, map, bool, str);
    }

    @NotNull
    public final List<Badge> component1() {
        return this.badges;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHorizontalScrollEnabled() {
        return this.horizontalScrollEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final BadgeListDTO copy(@NotNull List<Badge> badges, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean horizontalScrollEnabled, String json) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new BadgeListDTO(badges, trackingInfo, horizontalScrollEnabled, json);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    @NotNull
    public BasePlaceholderWidgetObject copyExcludingAnalytics() {
        List<Badge> list = this.badges;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Badge.copy$default((Badge) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, 4095, null));
        }
        return copy$default(this, arrayList, null, null, null, 12, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListDTO)) {
            return false;
        }
        BadgeListDTO badgeListDTO = (BadgeListDTO) other;
        return Intrinsics.d(this.badges, badgeListDTO.badges) && Intrinsics.d(this.trackingInfo, badgeListDTO.trackingInfo) && Intrinsics.d(this.horizontalScrollEnabled, badgeListDTO.horizontalScrollEnabled) && Intrinsics.d(this.json, badgeListDTO.json);
    }

    @NotNull
    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final Boolean getHorizontalScrollEnabled() {
        return this.horizontalScrollEnabled;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public String getJson() {
        return this.json;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.badges.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.horizontalScrollEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.json;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public void setJson(String str) {
        this.json = str;
    }

    @NotNull
    public String toString() {
        return "BadgeListDTO(badges=" + this.badges + ", trackingInfo=" + this.trackingInfo + ", horizontalScrollEnabled=" + this.horizontalScrollEnabled + ", json=" + this.json + ")";
    }

    public BadgeListDTO(@NotNull List<Badge> badges, Map<String, TokenizedTrackingInfo> map, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.badges = badges;
        this.trackingInfo = map;
        this.horizontalScrollEnabled = bool;
        this.json = str;
    }
}
