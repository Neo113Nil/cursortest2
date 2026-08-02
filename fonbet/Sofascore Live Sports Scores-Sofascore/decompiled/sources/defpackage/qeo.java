package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzfzr;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgab;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgmf;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgoa;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qeo implements zzgmf {
    public final zzgab a;
    public final zzgoa b;
    public final zzgpx c;
    public final zzgrh d;
    public final ExecutorService e;
    public final AtomicReference f = new AtomicReference("2.904631200.-1");

    public qeo(zzgab zzgabVar, zzgoa zzgoaVar, zzgpx zzgpxVar, zzgrh zzgrhVar, ExecutorService executorService) {
        this.a = zzgabVar;
        this.b = zzgoaVar;
        this.c = zzgpxVar;
        this.d = zzgrhVar;
        this.e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final emo a(Context context, View view, Activity activity) {
        return zzhcy.c(this.e, new r0o(this, context, view, activity, 3));
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final emo b(Context context, String str, View view) {
        return zzhcy.c(this.e, new r0o(this, context, str, view, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final emo c(Context context) {
        return zzhcy.c(this.e, new een(13, this, context));
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final void d(InputEvent inputEvent) {
        n72 b = this.a.b();
        zzgrh zzgrhVar = this.d;
        if (b == null) {
            zzgrhVar.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                b.x((MotionEvent) inputEvent);
            } catch (zzgaa e) {
                zzgrhVar.d(15005, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final String zza() {
        return (String) this.f.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final zzhcq zzb() {
        zzhcq r = zzhcq.r(this.b.zzb());
        ahn ahnVar = ahn.C;
        slo sloVar = slo.a;
        final int i = 0;
        hlo h = zzhcy.h(zzhcy.i(zzhcy.e(r, Throwable.class, ahnVar, sloVar), new zzgub(this) { // from class: peo
            public final /* synthetic */ qeo b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgub
            public final Object apply(Object obj) {
                int i2 = i;
                qeo qeoVar = this.b;
                switch (i2) {
                    case 0:
                        zzggt zzggtVar = (zzggt) obj;
                        if (qeoVar.c.a(zzggtVar) && zzggtVar != null) {
                            return new Boolean(true);
                        }
                        qeoVar.d.b(15003);
                        throw new zzgmg(1);
                    default:
                        zzfzr zzfzrVar = (zzfzr) obj;
                        if (zzfzrVar == null) {
                            throw new zzgmg(3);
                        }
                        File file = zzfzrVar.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        qeoVar.d.f(15002, new nkn(qeoVar, zzfzrVar, false, 25));
                        return new Boolean(true);
                }
            }
        }, sloVar), new cpn(this, 15), sloVar);
        final int i2 = 1;
        return zzhcy.i(zzhcy.i(h, new zzgub(this) { // from class: peo
            public final /* synthetic */ qeo b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgub
            public final Object apply(Object obj) {
                int i22 = i2;
                qeo qeoVar = this.b;
                switch (i22) {
                    case 0:
                        zzggt zzggtVar = (zzggt) obj;
                        if (qeoVar.c.a(zzggtVar) && zzggtVar != null) {
                            return new Boolean(true);
                        }
                        qeoVar.d.b(15003);
                        throw new zzgmg(1);
                    default:
                        zzfzr zzfzrVar = (zzfzr) obj;
                        if (zzfzrVar == null) {
                            throw new zzgmg(3);
                        }
                        File file = zzfzrVar.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        qeoVar.d.f(15002, new nkn(qeoVar, zzfzrVar, false, 25));
                        return new Boolean(true);
                }
            }
        }, sloVar), ahn.B, sloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final int zzg() {
        return 3;
    }
}
