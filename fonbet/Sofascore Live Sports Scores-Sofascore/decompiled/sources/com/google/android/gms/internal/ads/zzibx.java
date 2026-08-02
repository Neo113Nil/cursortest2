package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibx implements zzhfi {
    public static final byte[] e = {0};
    public final zzhrh a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public zzibx(zzhpq zzhpqVar) {
        String valueOf = String.valueOf(zzhpqVar.a.d);
        zzicj zzicjVar = zzhpqVar.b;
        zzhfr zzhfrVar = zzhfr.a;
        this.a = new zzibw("HMAC".concat(valueOf), new SecretKeySpec(zzicjVar.a.b(), "HMAC"));
        zzhpz zzhpzVar = zzhpqVar.a;
        this.b = zzhpzVar.b;
        this.c = zzhpqVar.c.b();
        if (zzhpzVar.c.equals(zzhpy.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public zzibx(zzhpf zzhpfVar) {
        zzhpm zzhpmVar = zzhpfVar.a;
        this.a = zzibu.b(zzhrf.c(zzhrg.b(zzhpmVar.a), zzhpfVar.b));
        this.b = zzhpmVar.b;
        this.c = zzhpfVar.c.b();
        if (zzhpmVar.c.equals(zzhpl.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public zzibx(zzibw zzibwVar, int i) {
        this.a = zzibwVar;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        zzibwVar.a(i, new byte[0]);
    }
}
