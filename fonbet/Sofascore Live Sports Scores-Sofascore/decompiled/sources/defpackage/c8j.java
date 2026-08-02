package defpackage;

import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c8j extends rwd {
    public final String a;
    public final up3 b;
    public final byte[] c;

    public c8j(String str, up3 up3Var) {
        str.getClass();
        up3Var.getClass();
        this.a = str;
        this.b = up3Var;
        Charset w = f5p.w(up3Var);
        this.c = yfa.N(str, w == null ? Charsets.UTF_8 : w);
    }

    @Override // defpackage.swd
    public final Long a() {
        return Long.valueOf(this.c.length);
    }

    @Override // defpackage.swd
    public final up3 b() {
        return this.b;
    }

    @Override // defpackage.rwd
    public final byte[] d() {
        return this.c;
    }

    public final String toString() {
        return "TextContent[" + this.b + "] \"" + iii.H(30, this.a) + '\"';
    }
}
