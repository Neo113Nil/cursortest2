package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConStoriesStat$PreloadStoryInfo {

    @pmi0("is_photo_preload_story")
    private final Boolean isPhotoPreloadStory;

    @pmi0("preload_story_id")
    private final String preloadStoryId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConStoriesStat$PreloadStoryInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConStoriesStat$PreloadStoryInfo)) {
            return false;
        }
        MobileOfficialAppsConStoriesStat$PreloadStoryInfo mobileOfficialAppsConStoriesStat$PreloadStoryInfo = (MobileOfficialAppsConStoriesStat$PreloadStoryInfo) obj;
        return epx.f(this.preloadStoryId, mobileOfficialAppsConStoriesStat$PreloadStoryInfo.preloadStoryId) && epx.f(this.isPhotoPreloadStory, mobileOfficialAppsConStoriesStat$PreloadStoryInfo.isPhotoPreloadStory);
    }

    public final int hashCode() {
        String str = this.preloadStoryId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isPhotoPreloadStory;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadStoryInfo(preloadStoryId=");
        sb.append(this.preloadStoryId);
        sb.append(", isPhotoPreloadStory=");
        return tn.a(sb, this.isPhotoPreloadStory, ')');
    }

    public MobileOfficialAppsConStoriesStat$PreloadStoryInfo(String str, Boolean bool) {
        this.preloadStoryId = str;
        this.isPhotoPreloadStory = bool;
    }

    public /* synthetic */ MobileOfficialAppsConStoriesStat$PreloadStoryInfo(String str, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
