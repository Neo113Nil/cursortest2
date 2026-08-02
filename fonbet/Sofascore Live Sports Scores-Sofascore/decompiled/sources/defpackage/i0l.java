package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i0l {
    public final String a;
    public final int b;

    public i0l(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.a = null;
        this.b = 1;
    }

    public final String a() {
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        throw new IllegalStateException(wt3.m(i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", new StringBuilder("Wrong data accessor type detected. "), "String"));
    }

    public i0l(String str) {
        this.a = str;
        this.b = 0;
    }
}
