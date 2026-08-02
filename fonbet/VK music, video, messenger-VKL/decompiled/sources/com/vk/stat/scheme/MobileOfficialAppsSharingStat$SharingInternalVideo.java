package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$SharingInternalVideo {

    @pmi0("timecode")
    private final int timecode;

    public MobileOfficialAppsSharingStat$SharingInternalVideo(int i) {
        this.timecode = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsSharingStat$SharingInternalVideo) && this.timecode == ((MobileOfficialAppsSharingStat$SharingInternalVideo) obj).timecode;
    }

    public final int hashCode() {
        return Integer.hashCode(this.timecode);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("SharingInternalVideo(timecode="), this.timecode, ')');
    }
}
