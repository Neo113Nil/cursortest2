package defpackage;

import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdso;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hfi implements Runnable {
    public final /* synthetic */ int a = 1;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;

    public hfi(g8f g8fVar, cci cciVar, boolean z, int i) {
        g8fVar.getClass();
        cciVar.getClass();
        this.d = g8fVar;
        this.e = cciVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gdl b;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                g8f g8fVar = (g8f) this.d;
                cci cciVar = (cci) this.e;
                if (z) {
                    int i = this.c;
                    g8fVar.getClass();
                    String str = cciVar.a.a;
                    synchronized (g8fVar.k) {
                        b = g8fVar.b(str);
                    }
                    g8f.d(b, i);
                } else {
                    int i2 = this.c;
                    g8fVar.getClass();
                    String str2 = cciVar.a.a;
                    synchronized (g8fVar.k) {
                        try {
                            if (g8fVar.f.get(str2) != null) {
                                rik.o().getClass();
                            } else {
                                Set set = (Set) g8fVar.h.get(str2);
                                if (set != null && set.contains(cciVar)) {
                                    g8f.d(g8fVar.b(str2), i2);
                                }
                            }
                        } finally {
                        }
                    }
                }
                rik o = rik.o();
                rik.x("StopWorkRunnable");
                String str3 = ((cci) this.e).a.a;
                o.getClass();
                return;
            default:
                zzdqm zzdqmVar = (zzdqm) this.d;
                View view = (View) this.e;
                boolean z2 = this.b;
                int i3 = this.c;
                zzdso zzdsoVar = zzdqmVar.w;
                if (zzdsoVar != null) {
                    zzdqmVar.n.e(view, zzdsoVar.l2(), zzdqmVar.w.zzh(), zzdqmVar.w.zzi(), z2, zzdqmVar.k(), i3);
                    return;
                } else {
                    int i4 = zze.zza;
                    zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                    return;
                }
        }
    }

    public /* synthetic */ hfi(zzdqm zzdqmVar, View view, boolean z, int i) {
        this.d = zzdqmVar;
        this.e = view;
        this.b = z;
        this.c = i;
    }
}
