package com.vk.voip.ui.notifications.incoming;

import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import org.webrtc.PeerConnectionFactory;

/* compiled from: VoipIncomingCallNotificationEnabled.kt */
/* loaded from: classes7.dex */
public interface e {

    /* compiled from: VoipIncomingCallNotificationEnabled.kt */
    public static final class a implements e {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("Disabled(reasonList="), this.a);
        }
    }

    /* compiled from: VoipIncomingCallNotificationEnabled.kt */
    public static final class b implements e {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 611551067;
        }

        public final String toString() {
            return PeerConnectionFactory.TRIAL_ENABLED;
        }
    }
}
