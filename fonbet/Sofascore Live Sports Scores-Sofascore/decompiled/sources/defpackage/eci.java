package defpackage;

import com.sofascore.model.crowdsourcing.SuggestStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eci implements fci {
    public final long a;
    public final SuggestStatus b;

    public eci(long j, SuggestStatus suggestStatus) {
        suggestStatus.getClass();
        this.a = j;
        this.b = suggestStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eci)) {
            return false;
        }
        eci eciVar = (eci) obj;
        return this.a == eciVar.a && this.b == eciVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Voted(selectedTimestamp=" + this.a + ", status=" + this.b + ")";
    }
}
