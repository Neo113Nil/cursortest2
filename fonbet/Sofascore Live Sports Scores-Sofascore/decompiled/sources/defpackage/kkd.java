package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kkd extends tz9 implements hrg {
    public final Object h;

    public kkd(Object obj) {
        this.h = obj;
    }

    @Override // defpackage.tz9
    public final void O(rkd rkdVar) {
        mkd mkdVar = new mkd(rkdVar, this.h);
        rkdVar.a(mkdVar);
        mkdVar.run();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.h;
    }
}
