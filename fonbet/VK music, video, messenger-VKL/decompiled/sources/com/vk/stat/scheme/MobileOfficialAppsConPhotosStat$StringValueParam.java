package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$StringValueParam {

    @pmi0("string_value")
    private final String stringValue;

    public MobileOfficialAppsConPhotosStat$StringValueParam(String str) {
        this.stringValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPhotosStat$StringValueParam) && epx.f(this.stringValue, ((MobileOfficialAppsConPhotosStat$StringValueParam) obj).stringValue);
    }

    public final int hashCode() {
        return this.stringValue.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("StringValueParam(stringValue="), this.stringValue, ')');
    }
}
