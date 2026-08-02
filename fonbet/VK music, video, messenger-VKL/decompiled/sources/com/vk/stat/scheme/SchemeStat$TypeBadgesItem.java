package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeBadgesItem implements SchemeStat$TypeClick.b {

    @pmi0("badge_id")
    private final int badgeId;

    public SchemeStat$TypeBadgesItem(int i) {
        this.badgeId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeBadgesItem) && this.badgeId == ((SchemeStat$TypeBadgesItem) obj).badgeId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.badgeId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("TypeBadgesItem(badgeId="), this.badgeId, ')');
    }
}
