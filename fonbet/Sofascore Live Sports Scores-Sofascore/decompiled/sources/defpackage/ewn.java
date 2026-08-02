package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.r;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzeib;
import com.google.android.gms.internal.ads.zzemm;
import com.google.android.gms.internal.ads.zzemq;
import com.google.android.gms.internal.ads.zzeqi;
import com.google.android.gms.internal.ads.zzfhw;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzfod;
import com.google.android.gms.internal.ads.zzfof;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzgeb;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ewn implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ewn(zzdua zzduaVar, String str, zzcea zzceaVar, zzb zzbVar) {
        this.a = 1;
        this.c = zzduaVar;
        this.b = str;
        this.d = zzceaVar;
        this.e = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        ddb b;
        xlo a;
        switch (this.a) {
            case 0:
                zzcub zzcubVar = (zzcub) this.c;
                Uri.Builder builder = (Uri.Builder) this.d;
                String str = (String) this.b;
                InputEvent inputEvent = (InputEvent) this.e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) zzba.zzc().a(zzbjg.Qb), "10");
                    return zzhcy.a(builder.toString());
                }
                Uri.Builder buildUpon = builder.build().buildUpon();
                buildUpon.appendQueryParameter((String) zzba.zzc().a(zzbjg.Rb), "1");
                buildUpon.appendQueryParameter((String) zzba.zzc().a(zzbjg.Qb), "12");
                if (str.contains((CharSequence) zzba.zzc().a(zzbjg.Sb))) {
                    buildUpon.authority((String) zzba.zzc().a(zzbjg.Tb));
                }
                zzemm zzemmVar = zzcubVar.c;
                Uri build = buildUpon.build();
                zzemmVar.getClass();
                try {
                    r1c r1cVar = zzemmVar.a;
                    Objects.requireNonNull(r1cVar);
                    b = r1cVar.e(build, inputEvent);
                } catch (Exception e) {
                    b = zzhcy.b(e);
                }
                return zzhcy.h(zzhcq.r(b), new cpn(builder, 2), zzcubVar.f);
            case 1:
                zzdua zzduaVar = (zzdua) this.c;
                String str2 = (String) this.b;
                zzcef zzcefVar = (zzcef) this.d;
                zzb zzbVar = (zzb) this.e;
                zzduaVar.getClass();
                zzt.zzd();
                zzclm a2 = zzcmc.a(zzduaVar.a, new zzcnw(0, 0, 0), "native-omid", false, false, zzduaVar.c, null, zzduaVar.d, null, zzduaVar.e, zzduaVar.f, null, null, zzduaVar.p, zzduaVar.q, zzduaVar.m);
                zzcgn zzcgnVar = new zzcgn(a2);
                a2.zzP().g = new xtn(zzcgnVar, 1);
                a2.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) zzba.zzc().a(zzbjg.yf)).booleanValue()) {
                    if (zzcefVar != null) {
                        a2.zzP().y = zzcefVar;
                    }
                    a2.zzP().w = zzbVar;
                }
                return zzcgnVar;
            case 2:
                zzeib zzeibVar = (zzeib) this.c;
                return zzhcy.h(((a4o) this.d).e((zzcbv) this.b), (zzhcg) this.e, zzeibVar.a);
            case 3:
                zzeqi zzeqiVar = (zzeqi) this.c;
                zzfld zzfldVar = (zzfld) this.d;
                zzflo zzfloVar = (zzflo) this.b;
                zzemq zzemqVar = (zzemq) this.e;
                zzfqw e2 = zzfqw.e(12, zzeqiVar.j);
                e2.zzi(zzfldVar.E);
                e2.zza();
                ddb g = zzhcy.g(zzemqVar.a(zzfloVar, zzfldVar), zzfldVar.R, TimeUnit.MILLISECONDS, zzeqiVar.f);
                zzeqiVar.h.b(zzfloVar, zzfldVar, g, zzeqiVar.c);
                zzfrf.c(g, zzeqiVar.k, e2, false);
                return g;
            case 4:
                zzfon zzfonVar = (zzfon) this.c;
                ohn ohnVar = (ohn) this.d;
                r rVar = (r) this.b;
                zzfof zzfofVar = (zzfof) this.e;
                zzfnu zzfnuVar = (zzfnu) obj;
                synchronized (zzfonVar) {
                    try {
                        zzfonVar.d = true;
                        zzfnuVar.a = ((zzfhw) ohnVar.b).a;
                        if (zzfonVar.c) {
                            a = zzhcy.a(new zzfod(zzfnuVar, zzfofVar));
                        } else {
                            rVar.a(zzfofVar.zzb(), zzfnuVar);
                            a = xlo.b;
                        }
                    } finally {
                    }
                }
                return a;
            case 5:
                return ((zzggu) ((zzgeb) this.c).b.f.get()).a((Context) this.d, (View) this.b, (Activity) this.e);
            default:
                return ((zzggu) ((zzgeb) this.c).b.f.get()).b((Context) this.d, (String) this.b, (View) this.e);
        }
    }

    public /* synthetic */ ewn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }
}
