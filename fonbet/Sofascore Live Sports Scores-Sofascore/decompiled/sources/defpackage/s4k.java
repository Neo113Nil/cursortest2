package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s4k implements kli {
    public static final s4k b = new s4k();
    public final List a;

    public s4k(l74 l74Var) {
        this.a = Collections.singletonList(l74Var);
    }

    @Override // defpackage.kli
    public final List getCues(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.kli
    public final long getEventTime(int i) {
        qx9.r(i == 0);
        return 0L;
    }

    @Override // defpackage.kli
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // defpackage.kli
    public final int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    public s4k() {
        this.a = Collections.EMPTY_LIST;
    }
}
