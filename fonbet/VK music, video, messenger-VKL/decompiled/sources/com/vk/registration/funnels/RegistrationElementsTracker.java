package com.vk.registration.funnels;

import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.io.Serializable;
import java.util.HashMap;
import xsna.apl;
import xsna.frf0;
import xsna.irk0;
import xsna.qsk0;
import xsna.vu5;
import xsna.yuo0;

/* compiled from: RegistrationElementsTracker.kt */
/* loaded from: classes.dex */
public final class RegistrationElementsTracker {
    public static final RegistrationElementsTracker a = new RegistrationElementsTracker();
    public static final HashMap<TrackingElement, InteractionTime> b = new HashMap<>();
    public static final yuo0 c;

    /* compiled from: RegistrationElementsTracker.kt */
    /* loaded from: classes5.dex */
    public static final class InteractionTime implements Serializable {
        private final long firstTime;
        private final long lastTime;

        public InteractionTime() {
            this(0);
        }

        public static InteractionTime a(InteractionTime interactionTime, long j) {
            return new InteractionTime(interactionTime.firstTime, j);
        }

        public final long d() {
            return this.firstTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InteractionTime)) {
                return false;
            }
            InteractionTime interactionTime = (InteractionTime) obj;
            return this.firstTime == interactionTime.firstTime && this.lastTime == interactionTime.lastTime;
        }

        public final long g() {
            return this.lastTime;
        }

        public final int hashCode() {
            return Long.hashCode(this.lastTime) + (Long.hashCode(this.firstTime) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InteractionTime(firstTime=");
            sb.append(this.firstTime);
            sb.append(", lastTime=");
            return vu5.a(')', this.lastTime, sb);
        }

        public /* synthetic */ InteractionTime(int i) {
            this(0L, 0L);
        }

        public InteractionTime(long j, long j2) {
            this.firstTime = j;
            this.lastTime = j2;
        }
    }

    static {
        apl aplVar;
        irk0.a aVar = qsk0.a.d;
        if (aVar == null || (aplVar = aVar.e) == null) {
            aplVar = new apl();
        }
        c = aplVar;
    }

    public final void a(TrackingElement trackingElement, SchemeStatSak$TypeRegistrationItem.EventType eventType) {
        HashMap<TrackingElement, InteractionTime> hashMap = b;
        InteractionTime interactionTime = hashMap.get(trackingElement);
        boolean z = interactionTime == null;
        long a2 = c.a();
        hashMap.put(trackingElement, interactionTime != null ? InteractionTime.a(interactionTime, a2) : new InteractionTime(a2, a2));
        if (!z || eventType == null) {
            return;
        }
        frf0.a(eventType, null, null, null, null, null, null, 254);
    }
}
