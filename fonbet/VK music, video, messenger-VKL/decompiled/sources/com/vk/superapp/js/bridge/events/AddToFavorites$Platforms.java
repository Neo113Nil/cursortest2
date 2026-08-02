package com.vk.superapp.js.bridge.events;

import com.vk.superapp.js.bridge.Objects$PlatformsAll;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AddToFavorites.kt */
/* loaded from: classes6.dex */
public final class AddToFavorites$Platforms {

    @pmi0("platforms_all")
    private final Objects$PlatformsAll platformsAll;

    /* JADX WARN: Multi-variable type inference failed */
    public AddToFavorites$Platforms() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddToFavorites$Platforms) && this.platformsAll == ((AddToFavorites$Platforms) obj).platformsAll;
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

    public AddToFavorites$Platforms(Objects$PlatformsAll objects$PlatformsAll) {
        this.platformsAll = objects$PlatformsAll;
    }

    public /* synthetic */ AddToFavorites$Platforms(Objects$PlatformsAll objects$PlatformsAll, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : objects$PlatformsAll);
    }
}
