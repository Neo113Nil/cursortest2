package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem implements SchemeStat$TypeClick.b {

    @pmi0("type_geo_discovery_card_tab_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem typeGeoDiscoveryCardTabClickItem;

    @pmi0("type_geo_discovery_event_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem typeGeoDiscoveryEventClickItem;

    @pmi0("type_geo_discovery_filter_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem typeGeoDiscoveryFilterClickItem;

    @pmi0("type_geo_discovery_map_control_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem typeGeoDiscoveryMapControlClickItem;

    @pmi0("type_geo_discovery_marker_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem typeGeoDiscoveryMarkerClickItem;

    @pmi0("type_geo_discovery_place_card_tab_addresses_show_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem typeGeoDiscoveryPlaceCardTabAddressesShowClickItem;

    @pmi0("type_geo_discovery_place_card_tab_addresses_work_hours_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem typeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem;

    @pmi0("type_geo_discovery_place_click_item")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem typeGeoDiscoveryPlaceClickItem;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem) obj;
        return epx.f(this.typeGeoDiscoveryPlaceCardTabAddressesShowClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryPlaceCardTabAddressesShowClickItem) && epx.f(this.typeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem) && epx.f(this.typeGeoDiscoveryCardTabClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryCardTabClickItem) && epx.f(this.typeGeoDiscoveryFilterClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryFilterClickItem) && epx.f(this.typeGeoDiscoveryEventClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryEventClickItem) && epx.f(this.typeGeoDiscoveryPlaceClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryPlaceClickItem) && epx.f(this.typeGeoDiscoveryMapControlClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryMapControlClickItem) && epx.f(this.typeGeoDiscoveryMarkerClickItem, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem.typeGeoDiscoveryMarkerClickItem);
    }

    public final int hashCode() {
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem = this.typeGeoDiscoveryPlaceCardTabAddressesShowClickItem;
        int hashCode = (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem == null ? 0 : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem.hashCode()) * 31;
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem = this.typeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem;
        int hashCode2 = (hashCode + (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem == null ? 0 : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem.hashCode())) * 31;
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem = this.typeGeoDiscoveryCardTabClickItem;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem == null ? 0 : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem.hashCode())) * 31;
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem = this.typeGeoDiscoveryFilterClickItem;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem == null ? 0 : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem.hashCode())) * 31;
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem = this.typeGeoDiscoveryEventClickItem;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem == null ? 0 : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem.hashCode())) * 31;
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem = this.typeGeoDiscoveryPlaceClickItem;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem == null ? 0 : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem.hashCode())) * 31;
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem = this.typeGeoDiscoveryMapControlClickItem;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem == null ? 0 : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem.hashCode())) * 31;
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem = this.typeGeoDiscoveryMarkerClickItem;
        return hashCode7 + (mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem != null ? mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeGeoDiscoveryClickItem(typeGeoDiscoveryPlaceCardTabAddressesShowClickItem=" + this.typeGeoDiscoveryPlaceCardTabAddressesShowClickItem + ", typeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem=" + this.typeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem + ", typeGeoDiscoveryCardTabClickItem=" + this.typeGeoDiscoveryCardTabClickItem + ", typeGeoDiscoveryFilterClickItem=" + this.typeGeoDiscoveryFilterClickItem + ", typeGeoDiscoveryEventClickItem=" + this.typeGeoDiscoveryEventClickItem + ", typeGeoDiscoveryPlaceClickItem=" + this.typeGeoDiscoveryPlaceClickItem + ", typeGeoDiscoveryMapControlClickItem=" + this.typeGeoDiscoveryMapControlClickItem + ", typeGeoDiscoveryMarkerClickItem=" + this.typeGeoDiscoveryMarkerClickItem + ')';
    }

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem(MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem) {
        this.typeGeoDiscoveryPlaceCardTabAddressesShowClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem;
        this.typeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem;
        this.typeGeoDiscoveryCardTabClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem;
        this.typeGeoDiscoveryFilterClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem;
        this.typeGeoDiscoveryEventClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem;
        this.typeGeoDiscoveryPlaceClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem;
        this.typeGeoDiscoveryMapControlClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem;
        this.typeGeoDiscoveryMarkerClickItem = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem;
    }

    public /* synthetic */ MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryClickItem(MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem, (i & 2) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem, (i & 4) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryCardTabClickItem, (i & 8) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem, (i & 16) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem, (i & 32) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceClickItem, (i & 64) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapControlClickItem, (i & 128) != 0 ? null : mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem);
    }
}
