package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public class zzaua extends zzasx {
    private final Object zza;
    private final zzatc zzb;

    public zzaua(int i, String str, zzatc zzatcVar, zzatb zzatbVar) {
        super(i, str, zzatbVar);
        this.zza = new Object();
        this.zzb = zzatcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    protected final zzatd zzr(zzast zzastVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzastVar.zzb;
            Map map = zzastVar.zzc;
            String str3 = C.ISO88591_NAME;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzastVar.zzb);
        }
        return zzatd.zza(str, zzatu.zza(zzastVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzasx
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzatc zzatcVar;
        synchronized (this.zza) {
            zzatcVar = this.zzb;
        }
        zzatcVar.zza(str);
    }
}
