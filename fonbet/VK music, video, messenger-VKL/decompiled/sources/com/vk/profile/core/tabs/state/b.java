package com.vk.profile.core.tabs.state;

import xsna.vu5;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class b {
    public final int a;

    public b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("RightButton(textId="), this.a, ')');
    }
}
