package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TypePhotosItem implements SchemeStat$TypeClick.b {

    @pmi0("album_create_edit_event")
    private final MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent albumCreateEditEvent;

    @pmi0("album_details_event")
    private final MobileOfficialAppsConPhotosStat$AlbumDetailsEvent albumDetailsEvent;

    @pmi0("albums_settings_event")
    private final MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent albumsSettingsEvent;

    @pmi0("archive_event")
    private final MobileOfficialAppsConPhotosStat$ArchiveEvent archiveEvent;

    @pmi0("nav_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen navScreen;

    @pmi0("onboarding_event")
    private final MobileOfficialAppsConPhotosStat$OnboardingEvent onboardingEvent;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("photo_tags_event")
    private final MobileOfficialAppsConPhotosStat$PhotoTagsEvent photoTagsEvent;

    @pmi0("photo_viewer_event")
    private final MobileOfficialAppsConPhotosStat$PhotoViewerEvent photoViewerEvent;

    @pmi0("photos_settings_event")
    private final MobileOfficialAppsConPhotosStat$PhotosSettingsEvent photosSettingsEvent;

    @pmi0("picker_event")
    private final MobileOfficialAppsConPhotosStat$PickerEvent pickerEvent;

    @pmi0("tab_albums_event")
    private final MobileOfficialAppsConPhotosStat$TabAlbumsEvent tabAlbumsEvent;

    @pmi0("tab_photos_event")
    private final MobileOfficialAppsConPhotosStat$TabPhotosEvent tabPhotosEvent;

    @pmi0("tabs_event")
    private final MobileOfficialAppsConPhotosStat$TabsEvent tabsEvent;

    public MobileOfficialAppsConPhotosStat$TypePhotosItem(long j, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConPhotosStat$TabsEvent mobileOfficialAppsConPhotosStat$TabsEvent, MobileOfficialAppsConPhotosStat$PickerEvent mobileOfficialAppsConPhotosStat$PickerEvent, MobileOfficialAppsConPhotosStat$TabPhotosEvent mobileOfficialAppsConPhotosStat$TabPhotosEvent, MobileOfficialAppsConPhotosStat$TabAlbumsEvent mobileOfficialAppsConPhotosStat$TabAlbumsEvent, MobileOfficialAppsConPhotosStat$PhotosSettingsEvent mobileOfficialAppsConPhotosStat$PhotosSettingsEvent, MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent, MobileOfficialAppsConPhotosStat$ArchiveEvent mobileOfficialAppsConPhotosStat$ArchiveEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsEvent mobileOfficialAppsConPhotosStat$AlbumDetailsEvent, MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent, MobileOfficialAppsConPhotosStat$PhotoViewerEvent mobileOfficialAppsConPhotosStat$PhotoViewerEvent, MobileOfficialAppsConPhotosStat$OnboardingEvent mobileOfficialAppsConPhotosStat$OnboardingEvent, MobileOfficialAppsConPhotosStat$PhotoTagsEvent mobileOfficialAppsConPhotosStat$PhotoTagsEvent) {
        this.ownerId = j;
        this.navScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.tabsEvent = mobileOfficialAppsConPhotosStat$TabsEvent;
        this.pickerEvent = mobileOfficialAppsConPhotosStat$PickerEvent;
        this.tabPhotosEvent = mobileOfficialAppsConPhotosStat$TabPhotosEvent;
        this.tabAlbumsEvent = mobileOfficialAppsConPhotosStat$TabAlbumsEvent;
        this.photosSettingsEvent = mobileOfficialAppsConPhotosStat$PhotosSettingsEvent;
        this.albumsSettingsEvent = mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent;
        this.archiveEvent = mobileOfficialAppsConPhotosStat$ArchiveEvent;
        this.albumDetailsEvent = mobileOfficialAppsConPhotosStat$AlbumDetailsEvent;
        this.albumCreateEditEvent = mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent;
        this.photoViewerEvent = mobileOfficialAppsConPhotosStat$PhotoViewerEvent;
        this.onboardingEvent = mobileOfficialAppsConPhotosStat$OnboardingEvent;
        this.photoTagsEvent = mobileOfficialAppsConPhotosStat$PhotoTagsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TypePhotosItem)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TypePhotosItem mobileOfficialAppsConPhotosStat$TypePhotosItem = (MobileOfficialAppsConPhotosStat$TypePhotosItem) obj;
        return this.ownerId == mobileOfficialAppsConPhotosStat$TypePhotosItem.ownerId && this.navScreen == mobileOfficialAppsConPhotosStat$TypePhotosItem.navScreen && epx.f(this.tabsEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.tabsEvent) && epx.f(this.pickerEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.pickerEvent) && epx.f(this.tabPhotosEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.tabPhotosEvent) && epx.f(this.tabAlbumsEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.tabAlbumsEvent) && epx.f(this.photosSettingsEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.photosSettingsEvent) && epx.f(this.albumsSettingsEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.albumsSettingsEvent) && epx.f(this.archiveEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.archiveEvent) && epx.f(this.albumDetailsEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.albumDetailsEvent) && epx.f(this.albumCreateEditEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.albumCreateEditEvent) && epx.f(this.photoViewerEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.photoViewerEvent) && epx.f(this.onboardingEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.onboardingEvent) && epx.f(this.photoTagsEvent, mobileOfficialAppsConPhotosStat$TypePhotosItem.photoTagsEvent);
    }

    public final int hashCode() {
        int hashCode = (this.navScreen.hashCode() + (Long.hashCode(this.ownerId) * 31)) * 31;
        MobileOfficialAppsConPhotosStat$TabsEvent mobileOfficialAppsConPhotosStat$TabsEvent = this.tabsEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$TabsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabsEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$PickerEvent mobileOfficialAppsConPhotosStat$PickerEvent = this.pickerEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsConPhotosStat$PickerEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PickerEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$TabPhotosEvent mobileOfficialAppsConPhotosStat$TabPhotosEvent = this.tabPhotosEvent;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsConPhotosStat$TabPhotosEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabPhotosEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$TabAlbumsEvent mobileOfficialAppsConPhotosStat$TabAlbumsEvent = this.tabAlbumsEvent;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsConPhotosStat$TabAlbumsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabAlbumsEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$PhotosSettingsEvent mobileOfficialAppsConPhotosStat$PhotosSettingsEvent = this.photosSettingsEvent;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsConPhotosStat$PhotosSettingsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PhotosSettingsEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent = this.albumsSettingsEvent;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$ArchiveEvent mobileOfficialAppsConPhotosStat$ArchiveEvent = this.archiveEvent;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsConPhotosStat$ArchiveEvent == null ? 0 : mobileOfficialAppsConPhotosStat$ArchiveEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$AlbumDetailsEvent mobileOfficialAppsConPhotosStat$AlbumDetailsEvent = this.albumDetailsEvent;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsConPhotosStat$AlbumDetailsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumDetailsEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent = this.albumCreateEditEvent;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$PhotoViewerEvent mobileOfficialAppsConPhotosStat$PhotoViewerEvent = this.photoViewerEvent;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsConPhotosStat$PhotoViewerEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PhotoViewerEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$OnboardingEvent mobileOfficialAppsConPhotosStat$OnboardingEvent = this.onboardingEvent;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsConPhotosStat$OnboardingEvent == null ? 0 : mobileOfficialAppsConPhotosStat$OnboardingEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$PhotoTagsEvent mobileOfficialAppsConPhotosStat$PhotoTagsEvent = this.photoTagsEvent;
        return hashCode12 + (mobileOfficialAppsConPhotosStat$PhotoTagsEvent != null ? mobileOfficialAppsConPhotosStat$PhotoTagsEvent.hashCode() : 0);
    }

    public final String toString() {
        return "TypePhotosItem(ownerId=" + this.ownerId + ", navScreen=" + this.navScreen + ", tabsEvent=" + this.tabsEvent + ", pickerEvent=" + this.pickerEvent + ", tabPhotosEvent=" + this.tabPhotosEvent + ", tabAlbumsEvent=" + this.tabAlbumsEvent + ", photosSettingsEvent=" + this.photosSettingsEvent + ", albumsSettingsEvent=" + this.albumsSettingsEvent + ", archiveEvent=" + this.archiveEvent + ", albumDetailsEvent=" + this.albumDetailsEvent + ", albumCreateEditEvent=" + this.albumCreateEditEvent + ", photoViewerEvent=" + this.photoViewerEvent + ", onboardingEvent=" + this.onboardingEvent + ", photoTagsEvent=" + this.photoTagsEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$TypePhotosItem(long j, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConPhotosStat$TabsEvent mobileOfficialAppsConPhotosStat$TabsEvent, MobileOfficialAppsConPhotosStat$PickerEvent mobileOfficialAppsConPhotosStat$PickerEvent, MobileOfficialAppsConPhotosStat$TabPhotosEvent mobileOfficialAppsConPhotosStat$TabPhotosEvent, MobileOfficialAppsConPhotosStat$TabAlbumsEvent mobileOfficialAppsConPhotosStat$TabAlbumsEvent, MobileOfficialAppsConPhotosStat$PhotosSettingsEvent mobileOfficialAppsConPhotosStat$PhotosSettingsEvent, MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent, MobileOfficialAppsConPhotosStat$ArchiveEvent mobileOfficialAppsConPhotosStat$ArchiveEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsEvent mobileOfficialAppsConPhotosStat$AlbumDetailsEvent, MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent, MobileOfficialAppsConPhotosStat$PhotoViewerEvent mobileOfficialAppsConPhotosStat$PhotoViewerEvent, MobileOfficialAppsConPhotosStat$OnboardingEvent mobileOfficialAppsConPhotosStat$OnboardingEvent, MobileOfficialAppsConPhotosStat$PhotoTagsEvent mobileOfficialAppsConPhotosStat$PhotoTagsEvent, int i, zcl zclVar) {
        this(j, mobileOfficialAppsCoreNavStat$EventScreen, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$TabsEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$PickerEvent, (i & 16) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosEvent, (i & 32) != 0 ? null : mobileOfficialAppsConPhotosStat$TabAlbumsEvent, (i & 64) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotosSettingsEvent, (i & 128) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent, (i & 256) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveEvent, (i & 512) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsEvent, (i & 1024) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent, (i & 2048) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoViewerEvent, (i & 4096) != 0 ? null : mobileOfficialAppsConPhotosStat$OnboardingEvent, (i & 8192) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoTagsEvent);
    }
}
