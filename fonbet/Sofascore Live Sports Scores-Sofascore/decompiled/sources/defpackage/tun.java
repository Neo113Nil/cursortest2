package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfn;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzdzj;
import com.google.android.gms.internal.ads.zzfbu;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzfev;
import com.google.android.gms.internal.ads.zzfex;
import com.google.android.gms.internal.ads.zzffd;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzffk;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzffo;
import com.google.android.gms.internal.ads.zzffp;
import com.google.android.gms.internal.ads.zzffq;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzfft;
import com.google.android.gms.internal.ads.zzffz;
import com.google.android.gms.internal.ads.zzfgb;
import com.google.android.gms.internal.ads.zzfgd;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzfql;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrh;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinz;
import com.google.android.gms.internal.ads.zzioa;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.internal.ads.zzioh;
import com.google.android.gms.internal.ads.zzioi;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tun extends zzfek {
    public final zzffn a;
    public final uun b;
    public final zzfff c;
    public final zzffm d;
    public final zzfej e;
    public final zzfgd f;
    public final zzfex g;
    public final zzfet h;
    public final zzffz i;
    public final zzinv j;
    public final zzinv k;

    public tun(uun uunVar, zzffn zzffnVar) {
        this.b = uunVar;
        this.a = zzffnVar;
        zzffo zzffoVar = new zzffo(zzffnVar);
        int i = svn.a;
        zzfoy zzfoyVar = l9o.a;
        this.c = new zzfff(zzffoVar);
        int i2 = vvn.a;
        zzinv zzinvVar = uunVar.e;
        zzcok zzcokVar = uunVar.h;
        this.d = new zzffm(zzcokVar, zzinvVar);
        zzffp zzffpVar = new zzffp(zzffnVar);
        zzffq zzffqVar = new zzffq(zzffnVar);
        zzffr zzffrVar = new zzffr(zzffnVar);
        int i3 = wvn.a;
        this.e = new zzfej(zzcokVar, zzinvVar, zzffpVar, zzffqVar, zzffrVar);
        this.f = new zzfgd();
        int i4 = rvn.a;
        this.g = new zzfex(zzcokVar);
        int i5 = qvn.a;
        zzinv zzinvVar2 = uunVar.H;
        this.h = new zzfet(zzffoVar, zzinvVar2, zzinvVar);
        zzfft zzfftVar = new zzfft(zzffnVar);
        int i6 = xvn.a;
        this.i = new zzffz(zzinvVar2, zzffrVar, zzffoVar, zzinvVar, zzfftVar);
        this.j = zzinv.a(new zzfrh(uunVar.z));
        zzffs zzffsVar = new zzffs(zzffnVar);
        zzinv a = zzinv.a(x1o.a);
        zzinv a2 = zzinv.a(w1o.a);
        zzinv a3 = zzinv.a(y1o.a);
        zzinv a4 = zzinv.a(z1o.a);
        int i7 = zzioa.b;
        zzinz zzinzVar = new zzinz(4);
        zzinzVar.a(zzfqc.GMS_SIGNALS, a);
        zzinzVar.a(zzfqc.BUILD_URL, a2);
        zzinzVar.a(zzfqc.HTTP, a3);
        zzinzVar.a(zzfqc.PRE_PROCESS, a4);
        zzinv a5 = zzinv.a(new zzdzj(zzffsVar, uunVar.h, zzinzVar.c()));
        int i8 = zzioi.c;
        zzioh zziohVar = new zzioh(0, 1);
        zziohVar.b(a5);
        this.k = zzinv.a(new zzfqk(uunVar.e, new zzfql(zziohVar.c())));
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final zzfdl a() {
        uun uunVar = this.b;
        Context context = uunVar.b.b;
        zzioe.a(context);
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzfff zzfffVar = this.c;
        zzfffVar.getClass();
        new zzcfk();
        zzioe.a(hsnVar);
        zzioe.a(zzfffVar.a.a.a.d);
        zzffd zzffdVar = new zzffd();
        zzinv zzinvVar = uunVar.e;
        zzfbu zzfbuVar = new zzfbu(zzffdVar, 0L, (ScheduledExecutorService) zzinvVar.zzb());
        zzffm zzffmVar = this.d;
        zzffmVar.getClass();
        new zzbzx();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzffmVar.a.zzb();
        ((zzcok) zzffmVar.b).a();
        zzfbu zzfbuVar2 = new zzfbu(new zzffk(scheduledExecutorService), ((Long) zzba.zzc().a(zzbjg.m5)).longValue(), (ScheduledExecutorService) zzinvVar.zzb());
        zzfbu zzfbuVar3 = new zzfbu(this.e.zzb(), 0L, (ScheduledExecutorService) zzinvVar.zzb());
        zzioe.a(hsnVar);
        zzfbu zzfbuVar4 = new zzfbu(new zzfgb(hsnVar), 0L, (ScheduledExecutorService) zzinvVar.zzb());
        zzfex zzfexVar = this.g;
        zzfexVar.getClass();
        new zzbhu();
        zzioe.a(hsnVar);
        ((zzcok) zzfexVar.a).a();
        zzfev zzfevVar = new zzfev(hsnVar);
        new zzbiq();
        zzioe.a(hsnVar);
        List list = this.a.a.e;
        zzioe.a(list);
        return new zzfdl(context, hsnVar, zzgxw.s(zzfbuVar, zzfbuVar2, zzfbuVar3, zzfbuVar4, zzfevVar, new zzffh(hsnVar, list), d(), (zzfdi) uunVar.S0.zzb(), this.h.zzb(), this.i.zzb()), (zzfrg) this.j.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final zzfqi b() {
        return (zzfqi) this.k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final zzfrg c() {
        return (zzfrg) this.j.zzb();
    }

    public final zzfen d() {
        new zzcfn();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzffn zzffnVar = this.a;
        String string = zzffnVar.a.a.getString("ms");
        if (string == null) {
            string = "";
        }
        PackageInfo packageInfo = zzffnVar.a.f;
        return new zzfen(hsnVar, string);
    }
}
