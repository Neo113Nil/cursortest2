package com.google.android.gms.internal.pal;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.ilg;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzadg {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName(C.ASCII_NAME);
        a = Charset.forName(C.UTF8_NAME);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int i = 0 + 0;
        try {
            if (i < 0) {
                throw zzadi.i();
            }
            if (i > Integer.MAX_VALUE) {
                throw zzadi.j();
            }
        } catch (zzadi e) {
            ilg.k(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static zzaef b(Object obj, Object obj2) {
        zzacv g = ((zzaef) obj).g();
        zzaef zzaefVar = (zzaef) obj2;
        if (g.a.getClass().isInstance(zzaefVar)) {
            g.d((zzacz) ((zzabi) zzaefVar));
            return g.i();
        }
        a70.p("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
