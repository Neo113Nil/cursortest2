package defpackage;

import java.nio.charset.Charset;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xzf {
    public static wzf a(zdc zdcVar, byte[] bArr, int i, int i2) {
        bArr.getClass();
        wol.a(bArr.length, i, i2);
        return new wzf(zdcVar, bArr, i2, i);
    }

    public static wzf b(String str, zdc zdcVar) {
        str.getClass();
        Pair j = v7a.j(zdcVar);
        Charset charset = (Charset) j.a;
        zdc zdcVar2 = (zdc) j.b;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return a(zdcVar2, bytes, 0, bytes.length);
    }

    public static wzf c(xzf xzfVar, zdc zdcVar, byte[] bArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        int length = bArr.length;
        xzfVar.getClass();
        bArr.getClass();
        return a(zdcVar, bArr, i, length);
    }

    public static /* synthetic */ wzf d(xzf xzfVar, byte[] bArr, zdc zdcVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            zdcVar = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        xzfVar.getClass();
        return a(zdcVar, bArr, i, length);
    }
}
