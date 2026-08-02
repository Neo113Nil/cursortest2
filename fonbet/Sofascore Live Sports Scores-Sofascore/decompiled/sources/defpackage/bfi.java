package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bfi extends i0a {
    public final wei n;

    public bfi(wei weiVar) {
        super(null);
        this.n = weiVar;
    }

    @Override // defpackage.g5d
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusMessage{code=");
        wei weiVar = this.n;
        sb.append(weiVar.a);
        sb.append(", message='");
        return mz1.o(sb, weiVar.b, "'}");
    }
}
