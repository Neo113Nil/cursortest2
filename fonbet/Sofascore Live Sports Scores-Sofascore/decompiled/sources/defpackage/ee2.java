package defpackage;

import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ee2 extends i2g {
    public final d45 d;
    public final String e;
    public final String f;
    public final lof g;

    public ee2(d45 d45Var, String str, String str2) {
        this.d = d45Var;
        this.e = str;
        this.f = str2;
        this.g = new lof(new de2((cwh) d45Var.c.get(1), this));
    }

    @Override // defpackage.i2g
    public final long contentLength() {
        String str = this.f;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = wol.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.i2g
    public final zdc contentType() {
        String str = this.e;
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
        return this.g;
    }
}
