package com.vk.profile.community.impl.ui.events;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pk50;

/* compiled from: CommunityEventsEvent.kt */
/* loaded from: classes5.dex */
public interface b extends pk50 {

    /* compiled from: CommunityEventsEvent.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2004157716;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: CommunityEventsEvent.kt */
    /* renamed from: com.vk.profile.community.impl.ui.events.b$b, reason: collision with other inner class name */
    public static final class C1565b implements b {
        public final UserId a;

        public C1565b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1565b) && epx.f(this.a, ((C1565b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenCommunity(id="), this.a, ')');
        }
    }
}
