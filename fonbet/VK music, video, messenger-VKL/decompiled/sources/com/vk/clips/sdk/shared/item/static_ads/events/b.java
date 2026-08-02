package com.vk.clips.sdk.shared.item.static_ads.events;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: StaticAdsItemEvent.kt */
/* loaded from: classes17.dex */
public interface b {

    /* compiled from: StaticAdsItemEvent.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1755779082;
        }

        public final String toString() {
            return "DisableCinemaMode";
        }
    }

    /* compiled from: StaticAdsItemEvent.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.static_ads.events.b$b, reason: collision with other inner class name */
    public static final class C0696b implements b {
        public static final C0696b a = new C0696b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0696b);
        }

        public final int hashCode() {
            return 194620183;
        }

        public final String toString() {
            return "InterceptLinkCommunityWithSubscribeClick";
        }
    }

    /* compiled from: StaticAdsItemEvent.kt */
    public interface c extends b {

        /* compiled from: StaticAdsItemEvent.kt */
        public static final class a implements c {
            public final UserId a;

            public a(UserId userId) {
                this.a = userId;
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
                return gp.b(new StringBuilder("SubscriptionSuccess(ownerId="), this.a, ')');
            }
        }
    }
}
