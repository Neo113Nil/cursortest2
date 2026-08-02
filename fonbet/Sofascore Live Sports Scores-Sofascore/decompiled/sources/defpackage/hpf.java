package defpackage;

import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hpf extends i2g {
    public final String d;
    public final long e;
    public final lof f;

    public hpf(String str, long j, lof lofVar) {
        this.d = str;
        this.e = j;
        this.f = lofVar;
    }

    @Override // defpackage.i2g
    public final long contentLength() {
        return this.e;
    }

    @Override // defpackage.i2g
    public final zdc contentType() {
        String str = this.d;
        if (str != null) {
            Regex regex = zdc.e;
            try {
                return bea.v(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.i2g
    public final l62 source() {
        return this.f;
    }
}
