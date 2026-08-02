package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zziin;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h5o implements zzdom, who {
    public final Object a;
    public final Object b;
    public final Object c;

    public h5o(zziin zziinVar, zziin zziinVar2, Object obj) {
        this.a = zziinVar;
        this.b = zziinVar2;
        this.c = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public void b(boolean z, Context context, zzdec zzdecVar) {
        try {
            zzt.zzb();
            zzn.zza(context, (AdOverlayInfoParcel) ((zzcgo) this.a).get(), true, ((zzeod) this.c).e);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    @Override // defpackage.who
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        long j = ((zzpj) this.b).a;
        zzpg zzpgVar = (zzpg) this.c;
        String str2 = (String) this.a;
        zzpgVar.d().Q();
        zzpgVar.m0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                zzpgVar.u = false;
                zzpgVar.O();
                throw th2;
            }
        }
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            String str3 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str3.substring(0, Math.min(32, str3.length()));
            zzgs zzgsVar = zzpgVar.b().l;
            Integer valueOf = Integer.valueOf(i);
            if (th == null) {
                th = substring;
            }
            zzgsVar.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf, th);
            hkn hknVar = zzpgVar.c;
            zzpg.U(hknVar);
            hknVar.c0(Long.valueOf(j));
            zzpgVar.N();
            zzpgVar.u = false;
            zzpgVar.O();
        }
        if (th == null) {
            hkn hknVar2 = zzpgVar.c;
            zzpg.U(hknVar2);
            hknVar2.X(Long.valueOf(j));
            zzpgVar.b().o.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
            zzgz zzgzVar = zzpgVar.b;
            zzpg.U(zzgzVar);
            if (zzgzVar.U()) {
                hkn hknVar3 = zzpgVar.c;
                zzpg.U(hknVar3);
                if (hknVar3.W(str2)) {
                    zzpgVar.t(str2);
                    zzpgVar.u = false;
                    zzpgVar.O();
                }
            }
            zzpgVar.N();
            zzpgVar.u = false;
            zzpgVar.O();
        }
        String str32 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
        zzgs zzgsVar2 = zzpgVar.b().l;
        Integer valueOf2 = Integer.valueOf(i);
        if (th == null) {
        }
        zzgsVar2.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, th);
        hkn hknVar4 = zzpgVar.c;
        zzpg.U(hknVar4);
        hknVar4.c0(Long.valueOf(j));
        zzpgVar.N();
        zzpgVar.u = false;
        zzpgVar.O();
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public zzfld zzb() {
        return (zzfld) this.b;
    }

    public /* synthetic */ h5o(Object obj, Object obj2, Object obj3) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }
}
