package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jg3 implements a5h {
    public final a5h a;
    public final hv9 b;

    public jg3(a5h a5hVar, List list) {
        this.a = a5hVar;
        this.b = hv9.v(list);
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        return this.a.g(mgbVar);
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        return this.a.getBufferedPositionUs();
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        return this.a.getNextLoadPositionUs();
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j);
    }
}
