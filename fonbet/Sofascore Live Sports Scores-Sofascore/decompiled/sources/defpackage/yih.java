package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzemu;
import com.google.android.gms.internal.ads.zzers;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzhcv;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yih implements p2c, lt9, zrb, pz8, jwc, iem, zzdey, zzhcv {
    public static volatile yih e;
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public yih(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.c = Collections.newSetFromMap(new WeakHashMap());
                this.d = new HashSet();
                break;
        }
    }

    public static yih k(Context context) {
        if (e == null) {
            synchronized (yih.class) {
                try {
                    if (e == null) {
                        e = new yih(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // defpackage.lt9
    public void E(fq5 fq5Var) {
        ((ImageView) this.c).setVisibility(!this.b ? 0 : 8);
    }

    @Override // defpackage.jwc
    public boolean a(long j, ilg ilgVar) {
        q5b q5bVar;
        tbj tbjVar = (tbj) this.d;
        if (!tbjVar.i() || tbjVar.l().a.b.length() == 0 || (q5bVar = tbjVar.d) == null || q5bVar.d() == null) {
            return false;
        }
        s(tbjVar.l(), j, false, ilgVar);
        return true;
    }

    @Override // defpackage.jwc
    public void b() {
        if (this.b) {
            ((tbj) this.d).n((pej) this.c);
        }
    }

    @Override // defpackage.jwc
    public boolean c(long j, ilg ilgVar, int i) {
        q5b q5bVar;
        tbj tbjVar = (tbj) this.d;
        if (!tbjVar.i() || tbjVar.l().a.b.length() == 0 || (q5bVar = tbjVar.d) == null || q5bVar.d() == null) {
            return false;
        }
        ce8 ce8Var = tbjVar.k;
        if (ce8Var != null) {
            ce8.a(ce8Var);
        }
        tbjVar.n = j;
        tbjVar.s = -1;
        tbjVar.e(true);
        long s = s(tbjVar.l(), tbjVar.n, true, ilgVar);
        if (i >= 2) {
            this.b = true;
            this.c = new pej(s);
        }
        return true;
    }

    @Override // defpackage.jwc
    public boolean e(long j) {
        q5b q5bVar;
        tbj tbjVar = (tbj) this.d;
        if (!tbjVar.i() || tbjVar.l().a.b.length() == 0 || (q5bVar = tbjVar.d) == null || q5bVar.d() == null) {
            return false;
        }
        s(tbjVar.l(), j, false, k03.f);
        return true;
    }

    @Override // defpackage.iem
    public void f(ArrayList arrayList, boolean z) {
        jtm jtmVar;
        ((lum) this.d).n = z;
        int size = arrayList.size();
        boolean z2 = this.b || ((lum) this.d).m > ((lum) this.d).l;
        AtomicInteger atomicInteger = ((lum) this.d).i;
        if (z) {
            boolean z3 = atomicInteger.get() > 0;
            ((lum) this.d).i.set(0);
            lum lumVar = (lum) this.d;
            if (!arrayList.isEmpty()) {
                synchronized (lumVar.f) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        try {
                            lumVar.f.add(((itm) arrayList.get(i)).wh());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                jwm jwmVar = lumVar.b;
                if (!jwmVar.e.hasMessages(1003, lumVar)) {
                    jwmVar.e.sendMessageDelayed(jwmVar.e.obtainMessage(1003, lumVar), jwmVar.b.qf());
                }
            }
            lum lumVar2 = (lum) this.d;
            lumVar2.b.f(lumVar2, z2, true, z3);
        } else {
            atomicInteger.getAndAdd(1);
            lum lumVar3 = (lum) this.d;
            if (!arrayList.isEmpty()) {
                synchronized (lumVar3.g) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        try {
                            lumVar3.g.add(((itm) arrayList.get(i2)).wh());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                jwm jwmVar2 = lumVar3.b;
                if (!jwmVar2.e.hasMessages(1004, lumVar3)) {
                    jwmVar2.e.sendMessageDelayed(jwmVar2.e.obtainMessage(1004, lumVar3), jwmVar2.b.qf());
                }
            }
            lum lumVar4 = (lum) this.d;
            lumVar4.b.f(lumVar4, z2, false, false);
        }
        iem iemVar = (iem) this.c;
        if (iemVar != null) {
            iemVar.f(arrayList, z);
        }
        if (!z || (jtmVar = ((lum) this.d).j) == null) {
            return;
        }
        jtmVar.b(2, size);
    }

    @Override // defpackage.jwc
    public boolean g(long j) {
        tbj tbjVar = (tbj) this.d;
        q5b q5bVar = tbjVar.d;
        if (q5bVar == null || q5bVar.d() == null || !tbjVar.i()) {
            return false;
        }
        tbjVar.s = -1;
        ce8 ce8Var = tbjVar.k;
        if (ce8Var != null) {
            ce8.a(ce8Var);
        }
        s(tbjVar.l(), j, false, k03.f);
        return true;
    }

    @Override // defpackage.pz8
    public Object get() {
        if (this.b) {
            a70.r("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        Trace.beginSection(h5a.U("Glide registry"));
        this.b = true;
        try {
            return w1a.n((a) this.c, (ArrayList) this.d);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    public boolean h(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((k1d) this.d).b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (ufa.o(((oze) obj).a, j)) {
                break;
            }
            i++;
        }
        oze ozeVar = (oze) obj;
        if (ozeVar != null) {
            return ozeVar.h;
        }
        return false;
    }

    public boolean i(rzf rzfVar) {
        boolean z = true;
        if (rzfVar == null) {
            return true;
        }
        boolean remove = ((Set) this.c).remove(rzfVar);
        if (!((HashSet) this.d).remove(rzfVar) && !remove) {
            z = false;
        }
        if (z) {
            rzfVar.clear();
        }
        return z;
    }

    @Override // defpackage.p2c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public fl0 d(vng vngVar) {
        MediaCodec mediaCodec;
        v2c kl0Var;
        int i;
        fl0 fl0Var;
        String str = ((a3c) vngVar.a).a;
        fl0 fl0Var2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    kl0Var = new kl0(mediaCodec, (HandlerThread) ((el0) this.d).get());
                    i = 0;
                } else {
                    kl0Var = new d4a(mediaCodec, 18);
                    i = 4;
                }
                fl0Var = new fl0(mediaCodec, (HandlerThread) ((el0) this.c).get(), kl0Var, (umb) vngVar.f);
            } catch (Exception e2) {
                e = e2;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) vngVar.d;
                if (surface == null && ((a3c) vngVar.a).h && Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                fl0Var.F((MediaFormat) vngVar.b, surface, (MediaCrypto) vngVar.e, i);
                return fl0Var;
            } catch (Exception e3) {
                e = e3;
                fl0Var2 = fl0Var;
                if (fl0Var2 != null) {
                    fl0Var2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodec = null;
        }
    }

    public z14 l() {
        zz0 zz0Var = (zz0) this.d;
        int i = zz0Var.b;
        int i2 = zz0Var.c;
        return i < i2 ? z14.b : i > i2 ? z14.a : z14.c;
    }

    public void m() {
        cn0 cn0Var = (cn0) this.d;
        Context context = (Context) this.c;
        if (this.b) {
            context.unregisterReceiver(cn0Var);
            this.b = false;
        }
    }

    public void n(ScheduledFuture scheduledFuture) {
        synchronized (this.c) {
            try {
                if (!this.b) {
                    this.d = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o(yih yihVar) {
        if (((w2h) this.c) == null || yihVar == null || this.b != yihVar.b) {
            return true;
        }
        zz0 zz0Var = (zz0) this.d;
        zz0 zz0Var2 = (zz0) yihVar.d;
        return (zz0Var.b == zz0Var2.b && zz0Var.c == zz0Var2.c) ? false : true;
    }

    @Override // defpackage.lt9
    public void onSuccess() {
        ((ImageView) this.d).setVisibility(0);
    }

    public void p(boolean z) {
        t8a t8aVar = (t8a) this.d;
        t8aVar.k.execute(new o8a(t8aVar, (p8a) this.c, z, 0));
    }

    public void q(xei xeiVar) {
        t8a t8aVar = (t8a) this.d;
        t8aVar.i.E("{0} SHUTDOWN with {1}", 2, ((p8a) this.c).b(), t8a.g(xeiVar));
        this.b = true;
        t8aVar.k.execute(new vlo(this, xeiVar, false, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r() {
        z1a.D("transportShutdown() must be called before transportTerminated().", this.b);
        t8a t8aVar = (t8a) this.d;
        ao2 ao2Var = t8aVar.i;
        p8a p8aVar = (p8a) this.c;
        ao2Var.E("{0} Terminated", 2, p8aVar.b());
        xx3 xx3Var = t8aVar.k;
        xx3Var.execute(new o8a(t8aVar, p8aVar, false, 0 == true ? 1 : 0));
        Iterator it = t8aVar.j.iterator();
        if (!it.hasNext()) {
            xx3Var.execute(new r8a(this, 1));
        } else if (it.next() != null) {
            pvd.j();
        } else {
            p8aVar.getAttributes();
            throw null;
        }
    }

    public long s(wcj wcjVar, long j, boolean z, ilg ilgVar) {
        tbj tbjVar = (tbj) this.d;
        long v = tbjVar.v(wcjVar, j, z, false, ilgVar, false, null);
        if (!pej.b((pej) this.c, v)) {
            this.b = false;
        }
        tbjVar.r(pej.d(v) ? p69.c : p69.b);
        return v;
    }

    public synchronized void t() {
        ((zzcgo) this.d).zzc(null);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("{numRequests=");
                sb.append(((Set) this.c).size());
                sb.append(", isPaused=");
                return wt3.p(sb, this.b, "}");
            case 10:
            default:
                return super.toString();
            case 11:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + l() + ", info=\n\t" + ((zz0) this.d) + ')';
        }
    }

    public synchronized void u(int i) {
        if (this.b) {
            return;
        }
        this.b = true;
        v(new zze(i, zzers.c(i, ((zzemt) this.c).a), AdError.UNDEFINED_DOMAIN, null, null));
    }

    public synchronized void v(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzba.zzc().a(zzbjg.F6)).booleanValue()) {
            i = 3;
        }
        ((zzcgo) this.d).zzd(new zzemu(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzfqw zzfqwVar = (zzfqw) this.d;
        if (zzfqwVar.zzb()) {
            zzfrg zzfrgVar = (zzfrg) this.c;
            zzfqwVar.a(th);
            zzfqwVar.zzd(false);
            zzfrgVar.a(zzfqwVar);
            if (this.b) {
                zzfrgVar.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        zzfqw zzfqwVar = (zzfqw) this.d;
        zzfqwVar.zzd(true);
        zzfrg zzfrgVar = (zzfrg) this.c;
        zzfrgVar.a(zzfqwVar);
        if (this.b) {
            zzfrgVar.h();
        }
    }

    public yih(Context context, boolean z, q qVar) {
        this.a = 13;
        context.getClass();
        qVar.getClass();
        this.c = context;
        this.b = z;
        this.d = qVar;
    }

    public yih(zzers zzersVar, zzemt zzemtVar, zzcgo zzcgoVar) {
        this.a = 15;
        this.c = zzemtVar;
        this.d = zzcgoVar;
        this.b = false;
    }

    public yih(lto ltoVar) {
        this.a = 17;
        this.c = ltoVar.t();
        this.b = ltoVar.u();
        this.d = ltoVar.w();
        ltoVar.x();
    }

    public /* synthetic */ yih(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public yih(nkb nkbVar, k1d k1dVar) {
        this.a = 6;
        this.c = nkbVar;
        this.d = k1dVar;
    }

    public yih(Context context, Handler handler, lg6 lg6Var) {
        this.a = 2;
        this.c = context.getApplicationContext();
        this.d = new cn0(this, handler, lg6Var);
    }

    public yih(Context context) {
        this.a = 0;
        this.d = new HashSet();
        this.c = new en0(new ggf(new qc4(context, 3)), new xih(this));
    }

    public yih(el0 el0Var, el0 el0Var2) {
        this.a = 1;
        this.c = el0Var;
        this.d = el0Var2;
        this.b = true;
    }

    public yih(a aVar, ArrayList arrayList, ml4 ml4Var) {
        this.a = 8;
        this.c = aVar;
        this.d = arrayList;
    }

    public yih(boolean z, w2h w2hVar, zz0 zz0Var) {
        this.a = 11;
        this.b = z;
        this.c = w2hVar;
        this.d = zz0Var;
    }

    public yih(lum lumVar, boolean z, iem iemVar) {
        this.a = 14;
        this.d = lumVar;
        this.b = z;
        this.c = iemVar;
    }

    public yih(tbj tbjVar) {
        this.a = 12;
        this.d = tbjVar;
        this.b = true;
    }

    public yih(ImageView imageView, boolean z, ImageView imageView2) {
        this.a = 5;
        this.c = imageView;
        this.b = z;
        this.d = imageView2;
    }

    public yih(t8a t8aVar, p8a p8aVar) {
        this.a = 7;
        this.d = t8aVar;
        this.b = false;
        this.c = p8aVar;
    }

    public yih(Object obj) {
        this.a = 10;
        this.c = obj;
    }
}
