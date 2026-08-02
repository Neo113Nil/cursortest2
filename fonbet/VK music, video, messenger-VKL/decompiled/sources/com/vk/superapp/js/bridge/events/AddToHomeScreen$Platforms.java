package com.vk.superapp.js.bridge.events;

import com.vk.superapp.js.bridge.Objects$PlatformsMobileAndroidOnly;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AddToHomeScreen.kt */
/* loaded from: classes6.dex */
public final class AddToHomeScreen$Platforms {

    @pmi0("platforms_mobile_android_only")
    private final Objects$PlatformsMobileAndroidOnly platformsMobileAndroidOnly;

    /* JADX WARN: Multi-variable type inference failed */
    public AddToHomeScreen$Platforms() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddToHomeScreen$Platforms) && this.platformsMobileAndroidOnly == ((AddToHomeScreen$Platforms) obj).platformsMobileAndroidOnly;
    }

    public final int hashCode() {
        Objects$PlatformsMobileAndroidOnly objects$PlatformsMobileAndroidOnly = this.platformsMobileAndroidOnly;
        if (objects$PlatformsMobileAndroidOnly == null) {
            return 0;
        }
        return objects$PlatformsMobileAndroidOnly.hashCode();
    }

    public final String toString() {
        return "Platforms(platformsMobileAndroidOnly=" + this.platformsMobileAndroidOnly + ')';
    }

    public AddToHomeScreen$Platforms(Objects$PlatformsMobileAndroidOnly objects$PlatformsMobileAndroidOnly) {
        this.platformsMobileAndroidOnly = objects$PlatformsMobileAndroidOnly;
    }

    public /* synthetic */ AddToHomeScreen$Platforms(Objects$PlatformsMobileAndroidOnly objects$PlatformsMobileAndroidOnly, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : objects$PlatformsMobileAndroidOnly);
    }
}
