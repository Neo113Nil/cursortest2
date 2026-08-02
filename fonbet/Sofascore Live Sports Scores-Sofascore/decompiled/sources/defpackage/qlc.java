package defpackage;

import com.sofascore.model.mvvm.model.MmaEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qlc {
    public final MmaEvent a;
    public final fqc b;

    public qlc(MmaEvent mmaEvent, fqc fqcVar) {
        mmaEvent.getClass();
        this.a = mmaEvent;
        this.b = fqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlc)) {
            return false;
        }
        qlc qlcVar = (qlc) obj;
        return Intrinsics.c(this.a, qlcVar.a) && this.b.equals(qlcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MmaEventWithVotes(event=" + this.a + ", mmaPostMatchVotingData=" + this.b + ")";
    }
}
