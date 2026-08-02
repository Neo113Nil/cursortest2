package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.cast.framework.media.internal.zza;
import com.google.android.gms.cast.framework.media.internal.zzs;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzasp;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnj;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzdds;
import com.google.android.gms.internal.ads.zzdgv;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzeet;
import com.google.android.gms.internal.ads.zzeew;
import com.google.android.gms.internal.ads.zzeib;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzeup;
import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfrt;
import com.google.android.gms.internal.ads.zzfru;
import com.google.android.gms.internal.ads.zzfvm;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzghl;
import com.google.android.gms.internal.ads.zzgrf;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibp;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.cast.zzcz;
import com.google.android.gms.internal.cast.zzda;
import com.google.android.gms.internal.cast.zzwz;
import com.google.android.gms.internal.cast.zzxp;
import com.google.android.gms.internal.cast.zzym;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mxn implements zza, zzdjm, zzbie, zzaso, a4o, zzcnj, OnCompleteListener, zzeup, Continuation, u0l, zzghl, zzhcv, roo, wcn, zzeb {
    public final /* synthetic */ int a;
    public final Object b;

    public mxn(zzxp zzxpVar) {
        this.a = 22;
        Charset charset = zzym.a;
        this.b = zzxpVar;
        zzxpVar.a = this;
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public void a(zzbil.zzt.zza zzaVar) {
        zzbil.zza.zzb zzbVar = (zzbil.zza.zzb) ((zzbil.zzt) zzaVar.b).E().w();
        zzbil.zzi.zza zzaVar2 = (zzbil.zzi.zza) ((zzbil.zzt) zzaVar.b).E().H().w();
        String str = ((zzflo) this.b).b.b.b;
        zzaVar2.n();
        ((zzbil.zzi) zzaVar2.b).F(str);
        zzbVar.n();
        ((zzbil.zza) zzbVar.b).G((zzbil.zzi) zzaVar2.o());
        zzaVar.n();
        ((zzbil.zzt) zzaVar.b).M((zzbil.zza) zzbVar.o());
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public void b(Bitmap bitmap) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (bitmap != null) {
                    zzda zzdaVar = (zzda) obj;
                    View view = zzdaVar.e;
                    ImageView imageView = zzdaVar.b;
                    if (view != null) {
                        view.setVisibility(4);
                    }
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(bitmap);
                    zzcz zzczVar = zzdaVar.g;
                    if (zzczVar != null) {
                        zzczVar.a();
                        break;
                    }
                }
                break;
            case 12:
                if (bitmap != null) {
                    ExpandedControllerActivity expandedControllerActivity = (ExpandedControllerActivity) obj;
                    TextView textView = expandedControllerActivity.L;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    ImageView imageView2 = expandedControllerActivity.K;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        expandedControllerActivity.K.setImageBitmap(bitmap);
                        break;
                    }
                }
                break;
            default:
                ((zzs) obj).c(bitmap, 3);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public void c(zzcyl zzcylVar) {
        zzfku zzfkuVar = (zzfku) this.b;
        zzdwk zzdwkVar = (zzdwk) zzcylVar;
        synchronized (zzfkuVar) {
            try {
                zzfkuVar.i = zzdwkVar;
                if (((Boolean) zzba.zzc().a(zzbjg.C4)).booleanValue()) {
                    zzdwkVar.u.a = zzfkuVar.d;
                }
                zzfkuVar.i.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x00d7, TRY_ENTER, TryCatch #1 {Exception -> 0x00d7, blocks: (B:3:0x0008, B:10:0x0020, B:12:0x002d, B:14:0x0032, B:16:0x0036, B:18:0x003c, B:20:0x0044, B:22:0x00aa, B:23:0x00ba, B:25:0x00c6, B:29:0x00d9, B:31:0x00e3, B:32:0x00ea, B:34:0x010e, B:35:0x0121), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(int i) {
        zzasp zzaspVar;
        mjn mjnVar;
        zzeew zzeewVar = (zzeew) this.b;
        try {
            zzfrt D = zzfru.D();
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3;
            D.n();
            ((zzfru) D.b).L(i2);
            if (i == 0) {
                zzeet zzeetVar = zzeewVar.b;
                zzeetVar.getClass();
                try {
                    mjnVar = zzeetVar.b;
                } catch (RemoteException unused) {
                }
                if (mjnVar != null && mjnVar.a()) {
                    zzaspVar = mjnVar.b();
                    if (zzaspVar != null) {
                        long j = zzaspVar.a.getLong("referrer_click_timestamp_seconds");
                        D.n();
                        ((zzfru) D.b).F(j);
                        long j2 = zzaspVar.a.getLong("install_begin_timestamp_seconds");
                        D.n();
                        ((zzfru) D.b).G(j2);
                        boolean z = zzaspVar.a.getBoolean("google_play_instant");
                        D.n();
                        ((zzfru) D.b).H(z);
                        long j3 = zzaspVar.a.getLong("referrer_click_timestamp_server_seconds");
                        D.n();
                        ((zzfru) D.b).I(j3);
                        long j4 = zzaspVar.a.getLong("install_begin_timestamp_server_seconds");
                        D.n();
                        ((zzfru) D.b).J(j4);
                        if (!TextUtils.isEmpty(zzaspVar.a.getString("install_referrer"))) {
                            String string = zzaspVar.a.getString("install_referrer");
                            D.n();
                            ((zzfru) D.b).E(string);
                        }
                        if (!TextUtils.isEmpty(zzaspVar.a.getString(Payload.INSTALL_VERSION))) {
                            String string2 = zzaspVar.a.getString(Payload.INSTALL_VERSION);
                            D.n();
                            ((zzfru) D.b).K(string2);
                        }
                    }
                }
                zzaspVar = null;
                if (zzaspVar != null) {
                }
            }
            mjn mjnVar2 = zzeewVar.b.b;
            mjnVar2.a = 3;
            ljn ljnVar = mjnVar2.e;
            if (ljnVar != null) {
                mjnVar2.b.unbindService(ljnVar);
                mjnVar2.e = null;
            }
            mjnVar2.d = null;
            zzeaj zzeajVar = zzeewVar.c;
            String encodeToString = Base64.encodeToString(((zzfru) D.o()).d(), 1);
            if (((Boolean) zzba.zzc().a(zzbjg.Y5)).booleanValue()) {
                zzeai a = zzeajVar.a();
                a.b("action", "irda");
                a.b("irdd", encodeToString);
                a.e();
            }
            zzeewVar.d.zzQ(true);
        } catch (Exception e) {
            if (((Boolean) zzba.zzc().a(zzbjg.Z5)).booleanValue()) {
                zzcas zzcasVar = zzeewVar.f;
                if (zzcasVar == null) {
                    zzcasVar = zzcaq.e(zzeewVar.a);
                    zzeewVar.f = zzcasVar;
                }
                zzcasVar.a("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e);
                return;
            }
            zzcas zzcasVar2 = zzeewVar.e;
            if (zzcasVar2 == null) {
                zzcasVar2 = zzcaq.c(zzeewVar.a);
                zzeewVar.e = zzcasVar2;
            }
            zzcasVar2.a("InstallReferrer.onInstallReferrerSetupFinished", e);
        }
    }

    @Override // defpackage.a4o
    public /* synthetic */ ddb e(zzcbv zzcbvVar) {
        return ((zzejg) ((zzeib) this.b).c.zzb()).F4(zzcbvVar, Binder.getCallingUid());
    }

    public void f(int i, Object obj, bgp bgpVar) {
        zzxp zzxpVar = (zzxp) this.b;
        zzwz zzwzVar = (zzwz) obj;
        zzxpVar.b(i, 2);
        zzxpVar.o(zzwzVar.a(bgpVar));
        bgpVar.d(zzwzVar, this);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ((x7p) obj).a.m("joinApplication", task);
                break;
        }
    }

    @Override // defpackage.u0l
    public void onPostMessage(WebView webView, i0l i0lVar, Uri uri, boolean z, mda mdaVar) {
        zzfvy zzfvyVar = (zzfvy) this.b;
        try {
            JSONObject jSONObject = new JSONObject(i0lVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzfvyVar.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap hashMap = zzfvyVar.d;
                zzfvm zzfvmVar = (zzfvm) hashMap.get(string2);
                if (zzfvmVar != null) {
                    zzfvmVar.b();
                    hashMap.remove(string2);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        rbo rboVar = (rbo) this.b;
        rboVar.getClass();
        List list = (List) task.getResult();
        return Tasks.whenAllComplete(list).continueWith(rboVar.e, new wm2(list, false));
    }

    @Override // defpackage.roo
    public Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        zzibh zzibhVar = zzibh.b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((zzibp) this.b).a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        ((zzgrf) this.b).c();
    }

    public /* synthetic */ mxn(zznr zznrVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
        this.a = 19;
        this.b = iOException;
    }

    public /* synthetic */ mxn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public mxn(zzeew zzeewVar) {
        this.a = 5;
        Objects.requireNonNull(zzeewVar);
        this.b = zzeewVar;
    }

    public mxn(zzgrh zzgrhVar, zzgrf zzgrfVar) {
        this.a = 14;
        this.b = zzgrfVar;
        Objects.requireNonNull(zzgrhVar);
    }

    public /* synthetic */ mxn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    @Override // defpackage.wcn
    public Object zza() {
        return ((qc4) this.b).b;
    }

    @Override // com.google.android.gms.internal.ads.zzghl, defpackage.wcn
    public qpn zza() {
        return new qpn((vdf) this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzcnj, com.google.android.gms.internal.ads.zzeup
    /* renamed from: zza */
    public void mo12zza() {
        switch (this.a) {
            case 7:
                ((zzclm) this.b).l();
                return;
            default:
                zzfku zzfkuVar = (zzfku) this.b;
                synchronized (zzfkuVar) {
                    zzfkuVar.i = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((zzdds) obj).i0((zze) obj2);
                break;
            case 2:
                ((zzdgv) obj).Z((zzcbv) obj2);
                break;
            case 3:
                ((zzbfg) obj).A((zzbff) obj2);
                break;
            case 19:
                ((zznt) obj).b((IOException) obj2);
                break;
            default:
                zzbv zzbvVar = (zzbv) obj2;
                ((zznt) obj).a(zzbvVar);
                int i2 = zzbvVar.a;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzgrf zzgrfVar = (zzgrf) this.b;
        zzgrfVar.b(th);
        zzgrfVar.c();
    }
}
