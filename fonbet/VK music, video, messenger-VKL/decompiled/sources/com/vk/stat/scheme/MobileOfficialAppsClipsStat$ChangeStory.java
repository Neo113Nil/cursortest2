package com.vk.stat.scheme;

import xsna.pmi0;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ChangeStory {

    @pmi0("is_story_on")
    private final boolean isStoryOn;

    public MobileOfficialAppsClipsStat$ChangeStory(boolean z) {
        this.isStoryOn = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$ChangeStory) && this.isStoryOn == ((MobileOfficialAppsClipsStat$ChangeStory) obj).isStoryOn;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isStoryOn);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ChangeStory(isStoryOn="), this.isStoryOn, ')');
    }
}
