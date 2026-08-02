package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class off implements ikk {
    public boolean a = false;
    public boolean b = false;
    public nz7 c;
    public final nff d;

    public off(nff nffVar) {
        this.d = nffVar;
    }

    @Override // defpackage.ikk
    public final ikk b(String str) {
        if (this.a) {
            throw new mn5("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.ikk
    public final ikk c(boolean z) {
        if (this.a) {
            throw new mn5("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
