package com.fyber.inneractive.sdk.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class l1 {
    public static final Charset a = Charset.forName(C.UTF8_NAME);
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static z0 a(Object obj, Object obj2) {
        d2 d2Var = (d2) obj2;
        t0 t0Var = (t0) ((d2) obj).toBuilder();
        if (!t0Var.a.getClass().isInstance(d2Var)) {
            a70.p("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        t0Var.c();
        t0.a(t0Var.b, (z0) ((b) d2Var));
        return t0Var.b();
    }

    public static String a(byte[] bArr) {
        return new String(bArr, a);
    }
}
