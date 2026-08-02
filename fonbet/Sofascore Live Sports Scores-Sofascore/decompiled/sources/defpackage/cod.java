package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cod extends i2g {
    public final zdc d;
    public final long e;

    public cod(zdc zdcVar, long j) {
        this.d = zdcVar;
        this.e = j;
    }

    @Override // defpackage.i2g
    public final long contentLength() {
        return this.e;
    }

    @Override // defpackage.i2g
    public final zdc contentType() {
        return this.d;
    }

    @Override // defpackage.i2g
    public final l62 source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
