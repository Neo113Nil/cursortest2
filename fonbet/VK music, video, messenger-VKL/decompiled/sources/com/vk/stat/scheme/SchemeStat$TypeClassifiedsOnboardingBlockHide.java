package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsOnboardingBlockHide {

    @pmi0("owner_id")
    private final long ownerId;

    public SchemeStat$TypeClassifiedsOnboardingBlockHide(long j) {
        this.ownerId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeClassifiedsOnboardingBlockHide) && this.ownerId == ((SchemeStat$TypeClassifiedsOnboardingBlockHide) obj).ownerId;
    }

    public final int hashCode() {
        return Long.hashCode(this.ownerId);
    }

    public final String toString() {
        return vu5.a(')', this.ownerId, new StringBuilder("TypeClassifiedsOnboardingBlockHide(ownerId="));
    }
}
