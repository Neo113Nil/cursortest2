package com.vk.managed_groups.impl.list;

import com.vk.dto.common.Peer;
import xsna.epx;

/* compiled from: ManagedGroupsListEvent.kt */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ManagedGroupsListEvent.kt */
    public static final class a implements b {
        public final Peer.Group a;

        public a(Peer.Group group) {
            this.a = group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return "OnGroupClicked(peer=" + this.a + ')';
        }
    }
}
