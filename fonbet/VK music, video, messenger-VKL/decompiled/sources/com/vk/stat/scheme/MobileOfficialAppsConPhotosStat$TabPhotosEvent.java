package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabPhotosEvent {

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("tab_photos_detailed_action_event")
    private final MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent tabPhotosDetailedActionEvent;

    @pmi0("tab_photos_multiple_items_action_event")
    private final MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent tabPhotosMultipleItemsActionEvent;

    @pmi0("tab_photos_navigation_event")
    private final MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent tabPhotosNavigationEvent;

    @pmi0("tab_photos_single_item_action_event")
    private final MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent tabPhotosSingleItemActionEvent;

    public MobileOfficialAppsConPhotosStat$TabPhotosEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent, MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent, MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent, MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent) {
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.tabPhotosNavigationEvent = mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent;
        this.tabPhotosSingleItemActionEvent = mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent;
        this.tabPhotosMultipleItemsActionEvent = mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent;
        this.tabPhotosDetailedActionEvent = mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TabPhotosEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TabPhotosEvent mobileOfficialAppsConPhotosStat$TabPhotosEvent = (MobileOfficialAppsConPhotosStat$TabPhotosEvent) obj;
        return this.contentType == mobileOfficialAppsConPhotosStat$TabPhotosEvent.contentType && epx.f(this.tabPhotosNavigationEvent, mobileOfficialAppsConPhotosStat$TabPhotosEvent.tabPhotosNavigationEvent) && epx.f(this.tabPhotosSingleItemActionEvent, mobileOfficialAppsConPhotosStat$TabPhotosEvent.tabPhotosSingleItemActionEvent) && epx.f(this.tabPhotosMultipleItemsActionEvent, mobileOfficialAppsConPhotosStat$TabPhotosEvent.tabPhotosMultipleItemsActionEvent) && epx.f(this.tabPhotosDetailedActionEvent, mobileOfficialAppsConPhotosStat$TabPhotosEvent.tabPhotosDetailedActionEvent);
    }

    public final int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent = this.tabPhotosNavigationEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent = this.tabPhotosSingleItemActionEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent = this.tabPhotosMultipleItemsActionEvent;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent = this.tabPhotosDetailedActionEvent;
        return hashCode4 + (mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent != null ? mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent.hashCode() : 0);
    }

    public final String toString() {
        return "TabPhotosEvent(contentType=" + this.contentType + ", tabPhotosNavigationEvent=" + this.tabPhotosNavigationEvent + ", tabPhotosSingleItemActionEvent=" + this.tabPhotosSingleItemActionEvent + ", tabPhotosMultipleItemsActionEvent=" + this.tabPhotosMultipleItemsActionEvent + ", tabPhotosDetailedActionEvent=" + this.tabPhotosDetailedActionEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$TabPhotosEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent, MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent, MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent, MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent, int i, zcl zclVar) {
        this(mobileOfficialAppsConPhotosStat$ContentType, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent, (i & 16) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent);
    }
}
