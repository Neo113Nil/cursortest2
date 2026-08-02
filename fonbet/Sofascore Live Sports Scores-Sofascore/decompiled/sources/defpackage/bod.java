package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bod extends i2g {
    public final i2g d;
    public final lof e;
    public IOException f;

    public bod(i2g i2gVar) {
        this.d = i2gVar;
        this.e = new lof(new de2(this, i2gVar.source()));
    }

    @Override // defpackage.i2g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.i2g
    public final long contentLength() {
        return this.d.contentLength();
    }

    @Override // defpackage.i2g
    public final zdc contentType() {
        return this.d.contentType();
    }

    @Override // defpackage.i2g
    public final l62 source() {
        return this.e;
    }
}
