package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrj;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a3o extends zzbsk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zzfqw d;
    public final /* synthetic */ zzcgo e;
    public final /* synthetic */ zzecu f;

    public a3o(long j, zzcgo zzcgoVar, zzecu zzecuVar, zzfqw zzfqwVar, Object obj, String str) {
        this.a = obj;
        this.b = str;
        this.c = j;
        this.d = zzfqwVar;
        this.e = zzcgoVar;
        Objects.requireNonNull(zzecuVar);
        this.f = zzecuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zze() {
        synchronized (this.a) {
            zzecu zzecuVar = this.f;
            String str = this.b;
            zzecuVar.d((int) (zzt.zzk().elapsedRealtime() - this.c), str, "", true);
            zzecuVar.l.b(str);
            zzecuVar.o.zzb(str);
            zzfrj zzfrjVar = zzecuVar.p;
            zzfqw zzfqwVar = this.d;
            zzfqwVar.zzd(true);
            zzfrjVar.b(zzfqwVar.zzm());
            this.e.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzf(String str) {
        synchronized (this.a) {
            zzecu zzecuVar = this.f;
            String str2 = this.b;
            zzecuVar.d((int) (zzt.zzk().elapsedRealtime() - this.c), str2, str, false);
            zzecuVar.l.c(str2, "error");
            zzecuVar.o.c(str2, "error");
            zzfrj zzfrjVar = zzecuVar.p;
            zzfqw zzfqwVar = this.d;
            zzfqwVar.zzk(str);
            zzfqwVar.zzd(false);
            zzfrjVar.b(zzfqwVar.zzm());
            this.e.zzc(Boolean.FALSE);
        }
    }
}
