package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jn6 implements c8g {
    public final b8g a;

    public jn6(Throwable th) {
        this.a = new b8g(this, null, th, 2);
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
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.c8g
    public final b8g e() {
        return this.a;
    }

    @Override // defpackage.c8g
    public final b8g g() {
        return this.a;
    }

    @Override // defpackage.c8g
    public final boolean isReady() {
        return false;
    }
}
