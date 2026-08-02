package com.vk.superapp.js.bridge.events;

import com.vk.superapp.js.bridge.Objects$PlatformsAll;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetAuthToken.kt */
/* loaded from: classes6.dex */
public final class GetAuthToken$Platforms {

    @pmi0("platforms_all")
    private final Objects$PlatformsAll platformsAll;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAuthToken$Platforms() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAuthToken$Platforms) && this.platformsAll == ((GetAuthToken$Platforms) obj).platformsAll;
    }

    public final int hashCode() {
        Objects$PlatformsAll objects$PlatformsAll = this.platformsAll;
        if (objects$PlatformsAll == null) {
            return 0;
        }
        return objects$PlatformsAll.hashCode();
    }

    public final String toString() {
        return "Platforms(platformsAll=" + this.platformsAll + ')';
    }

    public GetAuthToken$Platforms(Objects$PlatformsAll objects$PlatformsAll) {
        this.platformsAll = objects$PlatformsAll;
    }

    public /* synthetic */ GetAuthToken$Platforms(Objects$PlatformsAll objects$PlatformsAll, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : objects$PlatformsAll);
    }
}
