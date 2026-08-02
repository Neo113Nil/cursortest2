package com.vk.network.eventhub.api;

import androidx.annotation.Keep;
import xsna.epx;
import xsna.vu5;

/* compiled from: MessageErrorHandler.kt */
@Keep
/* loaded from: classes3.dex */
public interface MessageErrorHandler$ExpireStrategy {

    /* compiled from: MessageErrorHandler.kt */
    public static final class a implements MessageErrorHandler$ExpireStrategy {
        public static final a a = new a();
    }

    /* compiled from: MessageErrorHandler.kt */
    public static final class b implements MessageErrorHandler$ExpireStrategy {
        public final String a;
        public final long b;

        public b(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExpireChannelTs(channel=");
            sb.append(this.a);
            sb.append(", newTs=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: MessageErrorHandler.kt */
    public static final class c implements MessageErrorHandler$ExpireStrategy {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ExpireUserTs(newTs="));
        }
    }
}
