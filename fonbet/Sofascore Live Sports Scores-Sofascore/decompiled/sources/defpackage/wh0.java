package defpackage;

import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.iab.omid.library.smartadserver1.adsession.media.MediaEvents;
import com.iab.omid.library.smartadserver1.adsession.media.PlayerState;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wh0 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public wh0(zzlj zzljVar, boolean z) {
        this.a = 7;
        this.b = z;
        Objects.requireNonNull(zzljVar);
        this.c = zzljVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r5 != r1) goto L27;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                this.b = false;
                break;
            case 1:
                this.b = false;
                break;
            case 2:
                o65 o65Var = (o65) ((pyn) this.c).c;
                if (this.b) {
                    o65Var.s = true;
                    if (o65Var.p > 0) {
                        jfi jfiVar = o65Var.r;
                        jfiVar.a = false;
                        jfiVar.b();
                    }
                }
                o65Var.x = false;
                break;
            case 3:
                try {
                    MediaEvents mediaEvents = ((rjg) this.c).c;
                    if (mediaEvents != null) {
                        mediaEvents.playerStateChange(this.b ? PlayerState.FULLSCREEN : PlayerState.NORMAL);
                        break;
                    }
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                    return;
                }
                break;
            case 4:
                c2a c2aVar = (c2a) this.c;
                boolean z2 = this.b;
                kik.g();
                en0 en0Var = (en0) c2aVar.b;
                boolean z3 = en0Var.b;
                en0Var.b = z2;
                if (z3 != z2) {
                    ((xih) en0Var.c).a(z2);
                    break;
                }
                break;
            case 5:
                ((zzbys) this.c).g(this.b);
                break;
            case 6:
                zzdqm zzdqmVar = (zzdqm) this.c;
                boolean z4 = this.b;
                zzdso zzdsoVar = zzdqmVar.w;
                if (zzdsoVar != null) {
                    zzdqmVar.n.e(null, zzdsoVar.l2(), zzdqmVar.w.zzh(), zzdqmVar.w.zzi(), z4, zzdqmVar.k(), 0);
                    break;
                } else {
                    int i = zze.zza;
                    zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    break;
                }
            case 7:
                zzlj zzljVar = (zzlj) this.c;
                zzic zzicVar = (zzic) zzljVar.b;
                boolean c = zzicVar.c();
                boolean z5 = zzicVar.y != null && zzicVar.y.booleanValue();
                boolean z6 = this.b;
                zzicVar.y = Boolean.valueOf(z6);
                if (z5 == z6) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.o.b(Boolean.valueOf(z6), "Default data collection state already set to");
                }
                if (zzicVar.c() != c) {
                    boolean c2 = zzicVar.c();
                    if (zzicVar.y == null || !zzicVar.y.booleanValue()) {
                        z = false;
                        break;
                    }
                }
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.l.c(Boolean.valueOf(z6), Boolean.valueOf(c), "Default data collection is different than actual status");
                zzljVar.i0();
                break;
            default:
                zzry zzryVar = (zzry) this.c;
                boolean z7 = this.b;
                String str = zzfm.a;
                cwo cwoVar = zzryVar.b.a;
                if (cwoVar.P != z7) {
                    cwoVar.P = z7;
                    zzeg zzegVar = cwoVar.m;
                    zzegVar.c(23, new w9f(z7));
                    zzegVar.d();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wh0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ wh0(FrameLayout frameLayout, int i) {
        this.a = i;
        this.c = frameLayout;
    }
}
