package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.zabu;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzaek;
import com.google.android.gms.internal.ads.zzafq;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzchv;
import com.google.android.gms.internal.ads.zzckf;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnj;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzczp;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdfh;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdly;
import com.google.android.gms.internal.ads.zzdmy;
import com.google.android.gms.internal.ads.zzegq;
import com.google.android.gms.internal.ads.zzeib;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzfgl;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhlw;
import com.google.android.gms.internal.ads.zzlv;
import com.google.android.gms.internal.ads.zzlw;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzfp;
import com.google.android.gms.internal.play_billing.zzhr;
import com.google.android.gms.measurement.internal.zzic;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d1l implements c1l, iem, zabu, zzadd, zzafq, zzaun, zzhcv, zzcgq, InitializationCompleteCallback, zzckf, zzdjm, zzcnj, e4o, a4o, zzg, zzfit, zzfng, zzfpi, zzgcj, hho, zzhlw, fwo, eqo, zzlw {
    public final /* synthetic */ int a;
    public final Object b;

    public d1l() {
        this.a = 26;
        this.b = new AtomicBoolean(false);
    }

    @Override // defpackage.e4o, defpackage.eqo
    public boolean a(Class cls) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((e4o[]) obj)[i2].a(cls)) {
                        break;
                    }
                }
                break;
            default:
                for (int i3 = 0; i3 < 2; i3++) {
                    if (((eqo[]) obj)[i3].a(cls)) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // defpackage.e4o
    /* renamed from: b, reason: collision with other method in class */
    public m6o mo783b(Class cls) {
        for (int i = 0; i < 2; i++) {
            e4o e4oVar = ((e4o[]) this.b)[i];
            if (e4oVar.a(cls)) {
                return e4oVar.mo783b(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafq
    public long c(long j) {
        ((zzagu) this.b).getClass();
        String str = zzfm.a;
        return Math.max(0L, Math.min((j * r4.e) / 1000000, r4.j - 1));
    }

    @Override // defpackage.c1l
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) s02.E(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // defpackage.fwo
    public /* synthetic */ void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((zzic) this.b).i(i, th, bArr);
    }

    @Override // defpackage.a4o
    public /* synthetic */ ddb e(zzcbv zzcbvVar) {
        return ((zzejg) ((zzeib) this.b).c.zzb()).G4(zzcbvVar.h);
    }

    @Override // defpackage.iem
    public void f(ArrayList arrayList, boolean z) {
        arrayList.size();
        if (z) {
            synchronized (((lum) this.b).a) {
                ((lum) this.b).a.removeAll(arrayList);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void g(Bundle bundle) {
        g gVar = (g) this.b;
        Lock lock = gVar.m;
        lock.lock();
        try {
            gVar.k = ConnectionResult.f;
            gVar.h();
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.c1l
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) s02.E(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getProfileStore());
    }

    @Override // defpackage.c1l
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) s02.E(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // defpackage.c1l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) s02.E(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getWebkitToCompatConverter());
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public /* synthetic */ zzdcw h(zzfis zzfisVar) {
        return ((zzfgl) this.b).c(zzfisVar);
    }

    @Override // defpackage.hho
    public /* synthetic */ Iterator i(zzguz zzguzVar, CharSequence charSequence) {
        return new fho(zzguzVar, charSequence, ((bho) this.b).a(charSequence), 1);
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void j(int i) {
        g gVar = (g) this.b;
        Lock lock = gVar.m;
        lock.lock();
        try {
            if (gVar.l) {
                gVar.l = false;
                gVar.b.j(i);
                gVar.k = null;
                gVar.j = null;
            } else {
                gVar.l = true;
                gVar.d.onConnectionSuspended(i);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void k(ConnectionResult connectionResult) {
        g gVar = (g) this.b;
        Lock lock = gVar.m;
        lock.lock();
        try {
            gVar.k = connectionResult;
            gVar.h();
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.c1l
    public String[] l() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    public /* synthetic */ void m(long j, boolean z) {
        zzchv zzchvVar = ((zzcku) this.b).l;
        if (zzchvVar != null) {
            zzchvVar.a(j, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public void n(float f) {
        zzaek zzaekVar = ((zzaed) this.b).b;
        if (zzaekVar.e == f) {
            return;
        }
        zzaekVar.e = f;
        zzaekVar.b(false);
    }

    public /* synthetic */ void o(zzlv zzlvVar) {
        cwo cwoVar = (cwo) this.b;
        cwoVar.j.f(new yuo(0, cwoVar, zzlvVar));
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationFailed(String str) {
        try {
            ((zzbsl) this.b).zzf(str);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationSucceeded() {
        try {
            ((zzbsl) this.b).zze();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    public void q(int i, Object obj, qoo qooVar) {
        eao eaoVar = (eao) this.b;
        zzfa zzfaVar = (zzfa) obj;
        eaoVar.s(i, 2);
        eaoVar.u(zzfaVar.c(qooVar));
        qooVar.g(zzfaVar, this);
    }

    public void r(int i, Object obj) {
        boolean z = obj instanceof zzfp;
        eao eaoVar = (eao) this.b;
        if (z) {
            eaoVar.u(11);
            eaoVar.t(2, i);
            eaoVar.h(3, (zzfp) obj);
            eaoVar.u(12);
            return;
        }
        eaoVar.u(11);
        eaoVar.t(2, i);
        eaoVar.u(26);
        eaoVar.p((zzhr) obj);
        eaoVar.u(12);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 12:
                ((zzdef) obj).t((zze) obj2);
                break;
            case 13:
                ((zzdfh) obj).f0((zzcyl) obj2);
                break;
            default:
                ((zzdjg) obj).h((zzbil.zzb) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public /* synthetic */ void zzb(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 7:
                zzclm zzclmVar = (zzclm) obj2;
                new zzbt(zzclmVar.getContext(), zzclmVar.zzs().afmaVersion, (String) obj, null, zzclmVar.e() != null ? zzclmVar.e().x0 : null).zzb();
                break;
            case 11:
                ((zzczp) obj2).f.c0(true);
                break;
            default:
                zzflo zzfloVar = (zzflo) obj;
                if (((Boolean) zzba.zzc().a(zzbjg.X2)).booleanValue()) {
                    ((zzegq) obj2).k.N(zzfloVar);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
        zzdmy zzdmyVar = (zzdmy) this.b;
        zzdmyVar.b().zza();
        zzdly c = zzdmyVar.c();
        synchronized (c) {
            c.p0(pff.g);
        }
    }

    public /* synthetic */ d1l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ d1l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public d1l(zzbug zzbugVar) {
        this.a = 8;
        Objects.requireNonNull(zzbugVar);
        this.b = zzbugVar;
    }

    public d1l(eao eaoVar) {
        this.a = 23;
        this.b = eaoVar;
        eaoVar.a = this;
    }

    private final void p(Throwable th) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public /* synthetic */ Object zza(Object obj) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            ((zzfqw) this.b).zza();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzcgq
    /* renamed from: zza */
    public void mo17zza() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                ((zzbug) obj).d.e();
                break;
            default:
                ((zzcgn) obj).b();
                break;
        }
    }

    @Override // defpackage.eqo
    public lqo b(Class cls) {
        for (int i = 0; i < 2; i++) {
            eqo eqoVar = ((eqo[]) this.b)[i];
            if (eqoVar.a(cls)) {
                return eqoVar.b(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    /* renamed from: zza */
    public File mo16zza() {
        return (File) this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 7:
                zzt.zzh().d("DefaultGmsgHandlers.attributionReportingManager", th);
                break;
            case 11:
                ((zzczp) this.b).f.c0(false);
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        ((zzdmy) this.b).a().onAdClicked();
    }
}
