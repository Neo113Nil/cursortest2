package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.mio;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqe implements zzaru {
    public final List a;

    public zzaqe(int i) {
        mio mioVar = zzgxm.b;
        this.a = s.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final List a(zzart zzartVar) {
        String str;
        int i;
        List list;
        zzeu zzeuVar = new zzeu(zzartVar.c);
        ArrayList arrayList = this.a;
        while (zzeuVar.B() > 0) {
            int I = zzeuVar.I();
            int I2 = zzeuVar.b + zzeuVar.I();
            if (I == 134) {
                arrayList = new ArrayList();
                int I3 = zzeuVar.I() & 31;
                for (int i2 = 0; i2 < I3; i2++) {
                    String k = zzeuVar.k(3, StandardCharsets.UTF_8);
                    int I4 = zzeuVar.I();
                    boolean z = (I4 & 128) != 0;
                    if (z) {
                        i = I4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte I5 = (byte) zzeuVar.I();
                    zzeuVar.E(1);
                    if (z) {
                        int i3 = I5 & 64;
                        byte[] bArr = zzdr.a;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.d(str);
                    zztVar.d = k;
                    zztVar.M = i;
                    zztVar.q = list;
                    arrayList.add(new zzv(zztVar));
                }
            }
            zzeuVar.D(I2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public zzaqe() {
        this(0);
    }

    public zzaqe(List list) {
        this.a = list;
    }
}
