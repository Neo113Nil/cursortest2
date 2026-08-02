package com.vk.donut.video.subscription.impl.model;

import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CachedSubscription.kt */
/* loaded from: classes18.dex */
public final class CachedSubscription {
    public final UserId a;
    public final Status b;
    public final long c;
    public final long d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CachedSubscription.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status ACTIVE;
        public static final Status EXPIRED;
        public static final Status EXPIRING;
        private final String value;

        static {
            Status status = new Status(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = status;
            Status status2 = new Status("EXPIRING", 1, "expiring");
            EXPIRING = status2;
            Status status3 = new Status("EXPIRED", 2, "expired");
            EXPIRED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<Status> h() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    public CachedSubscription(UserId userId, Status status, long j, long j2) {
        this.a = userId;
        this.b = status;
        this.c = j;
        this.d = j2;
    }

    public final long a() {
        return this.c;
    }

    public final UserId b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedSubscription)) {
            return false;
        }
        CachedSubscription cachedSubscription = (CachedSubscription) obj;
        return epx.f(this.a, cachedSubscription.a) && this.b == cachedSubscription.b && this.c == cachedSubscription.c && this.d == cachedSubscription.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedSubscription(owner=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", nextPaymentDate=");
        sb.append(this.c);
        sb.append(", lastUpdated=");
        return vu5.a(')', this.d, sb);
    }
}
