package defpackage;

import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class h2g {
    public static g2g a(gc2 gc2Var, zdc zdcVar) {
        gc2Var.getClass();
        x52 x52Var = new x52();
        x52Var.X0(gc2Var);
        return new g2g(zdcVar, gc2Var.h(), x52Var);
    }

    public static g2g b(String str, zdc zdcVar) {
        str.getClass();
        Pair j = v7a.j(zdcVar);
        Charset charset = (Charset) j.a;
        zdc zdcVar2 = (zdc) j.b;
        x52 x52Var = new x52();
        charset.getClass();
        int length = str.length();
        str.getClass();
        if (length < 0) {
            ogj.h(dmi.k(length, 0, "endIndex < beginIndex: ", " < "));
        } else if (length > str.length()) {
            ogj.e(str.length(), lnb.t(length, "endIndex > string.length: ", " > "));
        } else if (charset.equals(Charsets.UTF_8)) {
            x52Var.f1(0, length, str);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            bytes.getClass();
            x52Var.write(bytes, 0, bytes.length);
        }
        return new g2g(zdcVar2, x52Var.b, x52Var);
    }

    public static g2g c(byte[] bArr, zdc zdcVar) {
        bArr.getClass();
        x52 x52Var = new x52();
        x52Var.write(bArr, 0, bArr.length);
        return new g2g(zdcVar, bArr.length, x52Var);
    }
}
