package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class g4g implements c8g {
    public final qof a;

    public g4g(qof qofVar) {
        qofVar.getClass();
        this.a = qofVar;
    }

    @Override // defpackage.c8g
    public final c8g c() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.c8g
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.c8g
    public final qof d() {
        return this.a;
    }

    @Override // defpackage.c8g
    public final b8g e() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.c8g
    public final b8g g() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.c8g
    public final boolean isReady() {
        return true;
    }
}
