package com.google.android.gms.internal.ads;

import com.ironsource.C4427z5;
import com.ironsource.U3;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzauv extends zzats {
    public final Object m;
    public final zzatx n;

    public zzauv(int i, String str, zzatx zzatxVar, zzatw zzatwVar) {
        super(i, str, zzatwVar);
        this.m = new Object();
        this.n = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final zzaty c(zzato zzatoVar) {
        String str;
        String str2;
        byte[] bArr = zzatoVar.b;
        try {
            Map map = zzatoVar.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split(U3.j.b, 0);
                    if (split2.length == 2 && split2[0].equals(C4427z5.N)) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new zzaty(str, zzaup.a(zzatoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzats
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(String str) {
        zzatx zzatxVar;
        synchronized (this.m) {
            zzatxVar = this.n;
        }
        zzatxVar.zza(str);
    }
}
