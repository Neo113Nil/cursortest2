package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.is8;
import defpackage.j40;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzauz implements zzava {
    public static final Logger b = Logger.getLogger(zzauz.class.getName());
    public final j40 a = new j40(8);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzava
    public final zzavd a(zzini zziniVar, zzinh zzinhVar) {
        int S0;
        long zzb;
        long zzc = zziniVar.zzc();
        j40 j40Var = this.a;
        ((ByteBuffer) j40Var.get()).rewind().limit(8);
        do {
            S0 = zziniVar.S0((ByteBuffer) j40Var.get());
            if (S0 == 8) {
                ((ByteBuffer) j40Var.get()).rewind();
                long a = zzavc.a((ByteBuffer) j40Var.get());
                if (a < 8 && a > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(a);
                    sb.append("). Stop parsing!");
                    b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) j40Var.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (a == 1) {
                        ((ByteBuffer) j40Var.get()).limit(16);
                        zziniVar.S0((ByteBuffer) j40Var.get());
                        ((ByteBuffer) j40Var.get()).position(8);
                        zzb = zzavc.b((ByteBuffer) j40Var.get()) - 16;
                    } else {
                        zzb = a == 0 ? zziniVar.zzb() - zziniVar.zzc() : a - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) j40Var.get()).limit(((ByteBuffer) j40Var.get()).limit() + 16);
                        zziniVar.S0((ByteBuffer) j40Var.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = ((ByteBuffer) j40Var.get()).position() - 16; position < ((ByteBuffer) j40Var.get()).position(); position++) {
                            bArr2[position - (((ByteBuffer) j40Var.get()).position() - 16)] = ((ByteBuffer) j40Var.get()).get(position);
                        }
                        zzb -= 16;
                    }
                    long j = zzb;
                    if (zzinhVar instanceof zzavd) {
                    }
                    zzavd b2 = b(str);
                    ((ByteBuffer) j40Var.get()).rewind();
                    b2.e(zziniVar, (ByteBuffer) j40Var.get(), j, this);
                    return b2;
                } catch (UnsupportedEncodingException e) {
                    is8.h(e);
                    return null;
                }
            }
        } while (S0 >= 0);
        zziniVar.l(zzc);
        a70.q();
        return null;
    }

    public abstract zzavd b(String str);
}
