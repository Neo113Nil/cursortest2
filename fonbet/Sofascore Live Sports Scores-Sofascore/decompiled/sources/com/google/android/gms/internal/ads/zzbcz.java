package com.google.android.gms.internal.ads;

import defpackage.dpo;
import defpackage.hbo;
import defpackage.jqo;
import defpackage.tg0;
import defpackage.vp2;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcz implements Callable {
    public final zzbcg a;
    public final zzaya b;

    public zzbcz(zzbcg zzbcgVar, zzaya zzayaVar) {
        this.a = zzbcgVar;
        this.b = zzayaVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzbcg zzbcgVar = this.a;
        zzbbg zzbbgVar = zzbcgVar.j;
        if ((zzbbgVar != null ? zzbbgVar.a : zzbcgVar.i) != null) {
            (zzbbgVar != null ? zzbbgVar.a : zzbcgVar.i).get();
        }
        zzaza b = zzbcgVar.b();
        if (b == null) {
            return null;
        }
        try {
            zzaya zzayaVar = this.b;
            synchronized (zzayaVar) {
                try {
                    byte[] d = b.d();
                    zziew zziewVar = zziew.b;
                    int i = dpo.a;
                    zziew zziewVar2 = zziew.c;
                    int length = d.length;
                    zzayaVar.n();
                    try {
                        try {
                            jqo.c.a(zzayaVar.b.getClass()).d(zzayaVar.b, d, 0, length, new tg0(zziewVar2));
                        } catch (zzige e) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        vp2.e("Reading from byte array should not throw IOException.", e2);
                    } catch (IndexOutOfBoundsException unused) {
                        hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzige | NullPointerException unused2) {
            return null;
        }
    }
}
