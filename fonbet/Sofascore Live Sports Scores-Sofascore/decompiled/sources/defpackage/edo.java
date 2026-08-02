package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzghq;
import com.google.android.gms.internal.ads.zzghr;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzgia;
import com.google.android.gms.internal.ads.zzgqc;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzinq;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class edo implements zzggu {
    public final ExecutorService a;
    public final zzinq b;
    public final zzinq c;
    public final zzgqc d;
    public final zzinq e;
    public final mco f;
    public final zzgei g;

    public edo(ExecutorService executorService, zzinq zzinqVar, zzinq zzinqVar2, zzgqc zzgqcVar, zzinq zzinqVar3, mco mcoVar, zzgei zzgeiVar) {
        this.a = executorService;
        this.b = zzinqVar;
        this.c = zzinqVar2;
        this.d = zzgqcVar;
        this.e = zzinqVar3;
        this.f = mcoVar;
        this.g = zzgeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb a(Context context, View view, Activity activity) {
        ji3 a = ((zzgia) this.f.zzb()).a(context);
        a.d = view;
        a.e = activity;
        a.f = true != this.g.Y() ? "" : null;
        a.g = this.d.b(context, view);
        a.l(zzaza.G0());
        a.i = zzgff.b;
        return a.k().b().a();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb b(Context context, String str, View view) {
        zzinq zzinqVar = this.e;
        HashMap c = this.d.c();
        zzghs zzghsVar = (zzghs) zzinqVar.zzb();
        synchronized (zzghsVar) {
            try {
                MotionEvent motionEvent = zzghsVar.b;
                if (motionEvent != null) {
                    c.put("nv", motionEvent);
                }
                c.put("oe", zzghsVar.c);
                ArrayDeque arrayDeque = zzghsVar.a;
                c.put("ro", arrayDeque.toArray(new zzghr[arrayDeque.size()]));
                zzghsVar.c = new zzghq();
                arrayDeque.clear();
                MotionEvent motionEvent2 = zzghsVar.b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    zzghsVar.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ji3 a = ((zzgia) this.f.zzb()).a(context);
        a.d = view;
        a.e = null;
        a.f = str;
        a.g = c;
        a.i = zzgff.c;
        a.l(zzaza.G0());
        return a.k().b().a();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb c(Context context) {
        ji3 a = ((zzgia) this.f.zzb()).a(context);
        a.g = this.d.a();
        a.l(zzaza.G0());
        a.i = zzgff.a;
        return a.k().b().a();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final void d(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            zzghs zzghsVar = (zzghs) this.e.zzb();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (zzghsVar) {
                try {
                    if (motionEvent.getAction() == 1) {
                        zzghsVar.b = MotionEvent.obtain(motionEvent);
                    }
                    zzghsVar.c.a(motionEvent);
                    ArrayDeque arrayDeque = zzghsVar.a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new zzghr(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final String zza() {
        return "1.904631200";
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ddb zzb() {
        return zzhcy.c(this.a, new q7o(this, 13));
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final int zzg() {
        return 2;
    }
}
