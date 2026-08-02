package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.gm;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.sf;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialService;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialClientImpl;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient;
import com.google.android.gms.internal.ads.zzafu;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzcow;
import com.google.android.gms.internal.ads.zzcsj;
import com.google.android.gms.internal.ads.zzcsl;
import com.google.android.gms.internal.ads.zzcsm;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcvy;
import com.google.android.gms.internal.ads.zzcwd;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzczp;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzddt;
import com.google.android.gms.internal.ads.zzdeo;
import com.google.android.gms.internal.ads.zzdgg;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdve;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzegu;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeil;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzejp;
import com.google.android.gms.internal.ads.zzete;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzeup;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzghz;
import com.google.android.gms.internal.ads.zzgib;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgje;
import com.google.android.gms.internal.ads.zzgjg;
import com.google.android.gms.internal.ads.zzgji;
import com.google.android.gms.internal.ads.zzgjk;
import com.google.android.gms.internal.ads.zzgjm;
import com.google.android.gms.internal.ads.zzgjo;
import com.google.android.gms.internal.ads.zzgjq;
import com.google.android.gms.internal.ads.zzgjs;
import com.google.android.gms.internal.ads.zzgju;
import com.google.android.gms.internal.ads.zzgjw;
import com.google.android.gms.internal.ads.zzgjy;
import com.google.android.gms.internal.ads.zzgkc;
import com.google.android.gms.internal.ads.zzgke;
import com.google.android.gms.internal.ads.zzgkg;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinx;
import com.google.android.gms.internal.ads.zzioh;
import com.google.android.gms.internal.ads.zzioi;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzfu;
import com.google.android.gms.internal.cast.zzfv;
import com.google.android.gms.internal.cast.zzgc;
import com.google.android.gms.internal.cast.zzgh;
import com.google.android.gms.internal.cast.zzgm;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzaz;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.google.android.gms.internal.consent_sdk.zzbf;
import com.google.android.gms.internal.consent_sdk.zzbs;
import com.google.android.gms.internal.consent_sdk.zzby;
import com.google.android.gms.internal.consent_sdk.zzca;
import com.google.android.gms.internal.consent_sdk.zzce;
import com.google.android.gms.internal.consent_sdk.zztf;
import com.google.android.gms.internal.consent_sdk.zztg;
import com.google.android.gms.internal.consent_sdk.zzti;
import com.google.android.gms.internal.identity_credentials.zzh;
import com.google.android.gms.internal.measurement.zzacb;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzafc;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ewm implements gm, zzaz, zzhb, zzfzg, OnH5AdsEventListener, zzcgs, SignalCallbacks, zzhcv, OnSuccessListener, zzeih, zzfpi, zzdjm, zzbmi, zzegu, zzcyj, zzeup, RemoteCall, OnFailureListener, OnCompleteListener, zzgib, hho {
    public final /* synthetic */ int a;
    public final Object b;

    public ewm(vdf vdfVar, qpn qpnVar, Context context, View view, Activity activity, String str, HashMap hashMap, zzaya zzayaVar, zzgff zzgffVar) {
        this.a = 27;
        zzinx a = zzinx.a(zzgffVar);
        zzinx b = zzinx.b(str);
        zzinx a2 = zzinx.a(zzayaVar);
        zzinv zzinvVar = (zzinv) qpnVar.d;
        zzinx zzinxVar = (zzinx) vdfVar.b;
        zzinv zzinvVar2 = (zzinv) vdfVar.i;
        zzgjm zzgjmVar = new zzgjm(zzinvVar, zzinvVar2, a2, zzinxVar);
        zzgjk zzgjkVar = new zzgjk(zzinvVar, zzinvVar2, a2);
        zzinx a3 = zzinx.a(hashMap);
        zzinv zzinvVar3 = (zzinv) qpnVar.d;
        zzinv zzinvVar4 = (zzinv) vdfVar.i;
        zzgjs zzgjsVar = new zzgjs(zzinvVar3, zzinvVar4, a2, a3);
        zzgjo zzgjoVar = new zzgjo(zzinvVar3, zzinvVar4, a2, (zzinx) vdfVar.e);
        zzgkc zzgkcVar = new zzgkc(zzinvVar3, zzinvVar4, a2, a, a3);
        zzgjq zzgjqVar = new zzgjq(zzinvVar3, zzinvVar4, a2);
        zzinx a4 = zzinx.a(context);
        zzinv zzinvVar5 = (zzinv) qpnVar.d;
        zzinv zzinvVar6 = (zzinv) vdfVar.i;
        zzgjy zzgjyVar = new zzgjy(a2, zzinvVar5, a, a4, a3, zzinvVar6);
        zzinx zzinxVar2 = (zzinx) vdfVar.b;
        zzinx zzinxVar3 = (zzinx) vdfVar.e;
        zzgji zzgjiVar = new zzgji(a2, zzinvVar5, a3, zzinxVar2, a, zzinxVar3, zzinvVar6);
        zzgju zzgjuVar = new zzgju(zzinvVar5, zzinvVar6, a2, zzinxVar2);
        zzgjw zzgjwVar = new zzgjw(zzinvVar5, zzinvVar6, a2, a3, zzinxVar2);
        zzgjg zzgjgVar = new zzgjg(a2, a3, zzinxVar3, zzinvVar6);
        int i = zzioi.c;
        zzioh zziohVar = new zzioh(11, 0);
        zziohVar.a(zzgjmVar);
        zziohVar.a(zzgjkVar);
        zziohVar.a(zzgjsVar);
        zziohVar.a(zzgjoVar);
        zziohVar.a(zzgkcVar);
        zziohVar.a(zzgjqVar);
        zziohVar.a(zzgjyVar);
        zziohVar.a(zzgjiVar);
        zziohVar.a(zzgjuVar);
        zziohVar.a(zzgjwVar);
        zziohVar.a(zzgjgVar);
        zzioi c = zziohVar.c();
        zzinx b2 = zzinx.b(view);
        zzinx b3 = zzinx.b(activity);
        zzinv zzinvVar7 = (zzinv) qpnVar.d;
        zzinv zzinvVar8 = (zzinv) vdfVar.i;
        zzgje zzgjeVar = new zzgje(zzinvVar7, zzinvVar8, a2, b2, b3);
        zzinv a5 = zzinv.a(new zzgic(a4));
        zzgkg zzgkgVar = new zzgkg(zzinvVar7, a5, zzinvVar8, a2, b2);
        zzioh zziohVar2 = new zzioh(11, 0);
        zziohVar2.a(zzgjmVar);
        zziohVar2.a(zzgjkVar);
        zziohVar2.a(zzgjoVar);
        zziohVar2.a(zzgjeVar);
        zziohVar2.a(zzgkgVar);
        zziohVar2.a(zzgkcVar);
        zziohVar2.a(zzgjqVar);
        zziohVar2.a(zzgjyVar);
        zziohVar2.a(zzgjiVar);
        zziohVar2.a(zzgjuVar);
        zziohVar2.a(zzgjwVar);
        zzioi c2 = zziohVar2.c();
        zzgke zzgkeVar = new zzgke((zzinv) qpnVar.d, a5, (zzinv) vdfVar.i, a2, a3);
        zzioh zziohVar3 = new zzioh(12, 0);
        zziohVar3.a(zzgjmVar);
        zziohVar3.a(zzgjkVar);
        zziohVar3.a(zzgjoVar);
        zziohVar3.a(zzgjeVar);
        zziohVar3.a(zzgkgVar);
        zziohVar3.a(zzgkcVar);
        zziohVar3.a(zzgjqVar);
        zziohVar3.a(zzgjyVar);
        zziohVar3.a(zzgjiVar);
        zziohVar3.a(zzgjuVar);
        zziohVar3.a(zzgjwVar);
        zziohVar3.a(zzgkeVar);
        this.b = zzinv.a(new zzghz((zzinv) vdfVar.j, (zzinv) vdfVar.l, (zzinv) qpnVar.d, a, b, a2, c, c2, zziohVar3.c(), (zzinv) vdfVar.i));
    }

    @Override // com.google.android.gms.internal.ads.zzegu
    public void a(RemoteException remoteException) {
        ((zzeil) this.b).a();
        if (((Boolean) zzba.zzc().a(zzbjg.Vf)).booleanValue()) {
            zzt.zzh().d("Preconnect Remote", remoteException);
        }
    }

    public zzghy b() {
        return (zzghy) ((zzinv) this.b).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public void c(zzcyl zzcylVar) {
        zzdck zzdckVar;
        switch (this.a) {
            case 21:
                zzete zzeteVar = (zzete) this.b;
                zzcwd zzcwdVar = (zzcwd) zzcylVar;
                synchronized (zzeteVar) {
                    try {
                        zzcwd zzcwdVar2 = zzeteVar.i;
                        if (zzcwdVar2 != null) {
                            zzdck zzdckVar2 = zzcwdVar.j;
                            if (zzdckVar2 != null && (zzdckVar = zzcwdVar2.j) != null) {
                                zzdckVar2.a(zzdckVar.a.get());
                            }
                            zzdeo zzdeoVar = zzeteVar.i.c;
                            zzdeoVar.getClass();
                            zzdeoVar.p0(new qc4(null, 4));
                        }
                        zzeteVar.i = zzcwdVar;
                        zzcwdVar.a();
                    } finally {
                    }
                }
                return;
            default:
                zzcvx zzcvxVar = (zzcvx) zzcylVar;
                zzfhk zzfhkVar = (zzfhk) this.b;
                synchronized (zzfhkVar) {
                    try {
                        zzcvx zzcvxVar2 = zzfhkVar.k;
                        if (zzcvxVar2 != null) {
                            zzcvxVar2.d();
                        }
                        zzfhkVar.k = zzcvxVar;
                        zzclm zzclmVar = zzcvxVar.l;
                        if (zzclmVar != null) {
                            zzclmVar.C(zzfhkVar);
                        }
                        zzfhkVar.f.j(new zzcvy(zzcvxVar, zzfhkVar, zzfhkVar.f, zzfhkVar.h));
                        zzcvxVar.a();
                    } finally {
                    }
                }
                return;
        }
    }

    public zzbe e() {
        return (zzbe) ((zztf) this.b).zzb();
    }

    public void f(int i, Object obj, odn odnVar) {
        zzada zzadaVar = (zzada) this.b;
        zzacb zzacbVar = (zzacb) obj;
        zzadaVar.f(i, 2);
        zzadaVar.v(zzacbVar.i(odnVar));
        odnVar.d(zzacbVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public /* synthetic */ void g(long j, zzeu zzeuVar) {
        zzafu.a(j, zzeuVar, ((zzamd) this.b).I);
    }

    public void h(int i, Object obj) {
        boolean z = obj instanceof zzacr;
        zzada zzadaVar = (zzada) this.b;
        if (z) {
            zzadaVar.r(i, (zzacr) obj);
        } else {
            zzadaVar.q(i, (zzafc) obj);
        }
    }

    @Override // defpackage.hho
    public /* synthetic */ Iterator i(zzguz zzguzVar, CharSequence charSequence) {
        return new fho(zzguzVar, charSequence, (sgo) this.b, 0);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        kco kcoVar = (kco) this.b;
        if (task.isCanceled()) {
            kcoVar.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            kcoVar.d(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            kcoVar.e(exception);
        } else {
            zzl.s();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(AdError adError) {
        try {
            ((zzbxw) this.b).a(adError.zza());
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
    public /* synthetic */ void onH5AdsEvent(String str) {
        int i = zzbrr.d;
        ((WebView) this.b).evaluateJavascript(str, null);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        zzfv zzfvVar = (zzfv) obj;
        Logger logger = zzcn.d;
        boolean z = false;
        if (zzfvVar != null) {
            zzgc zzgcVar = zzfvVar.a.b;
            Preconditions.i(zzgcVar);
            if (zzgcVar.a == 1) {
                z = true;
            }
        }
        ((TaskCompletionSource) this.b).trySetResult(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[Catch: all -> 0x003b, TryCatch #5 {all -> 0x003b, blocks: (B:10:0x001b, B:13:0x0025, B:15:0x0040, B:30:0x0078, B:31:0x0090, B:33:0x0099, B:35:0x00a3, B:40:0x00ba, B:41:0x00c0, B:64:0x010f, B:65:0x0110, B:43:0x00c1, B:47:0x00df, B:49:0x00e7, B:51:0x00ef, B:53:0x00fd, B:54:0x010a), top: B:9:0x001b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    @Override // com.bytedance.sdk.component.sf.pcc.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(sf sfVar, gbb gbbVar) {
        jr jrVar;
        Object obj;
        int i;
        int i2;
        qwm qwmVar = (qwm) this.b;
        if (gbbVar == null) {
            qwmVar.b(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                qwmVar.i = gbbVar.oo();
                if (((qwm) this.b).i) {
                    jrVar = gbbVar.wh();
                    try {
                        if (((qwm) this.b).i && jrVar != null) {
                            ((qwm) this.b).b = jrVar.pcc() + ((qwm) this.b).f;
                            inputStream = jrVar.gm();
                        }
                        if (inputStream != null) {
                            int i3 = sea.t;
                            byte[] bArr = new byte[i3];
                            long j = ((qwm) this.b).f;
                            ((qwm) this.b).k.dax();
                            long j2 = 0;
                            int i4 = 0;
                            long j3 = 0;
                            int i5 = 0;
                            while (true) {
                                int read = inputStream.read(bArr, i5, i3 - i5);
                                if (read == -1) {
                                    break;
                                }
                                i5 += read;
                                j3 += read;
                                if (j3 % i3 != j2 && j3 != ((qwm) this.b).b - ((qwm) this.b).f) {
                                    i = i4;
                                    if (i == 0) {
                                        synchronized (((qwm) this.b).c) {
                                            try {
                                                RandomAccessFile randomAccessFile = ((qwm) this.b).j;
                                                int intValue = Long.valueOf(j).intValue();
                                                ((qwm) this.b).k.nac();
                                                try {
                                                    randomAccessFile.seek(intValue);
                                                    randomAccessFile.write(bArr, i4, i5);
                                                } catch (Throwable unused) {
                                                }
                                                qwm qwmVar2 = (qwm) this.b;
                                                if (!qwmVar2.a || qwmVar2.l <= -1) {
                                                    i2 = i5;
                                                } else {
                                                    qwm qwmVar3 = (qwm) this.b;
                                                    i2 = i5;
                                                    if (qwmVar3.f + j3 >= qwmVar3.l) {
                                                        ((qwm) this.b).c.notify();
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        j += i2;
                                        i5 = 0;
                                    }
                                    j2 = 0;
                                    i4 = 0;
                                }
                                i = 1;
                                if (i == 0) {
                                }
                                j2 = 0;
                                i4 = 0;
                            }
                        } else {
                            ((qwm) this.b).b(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (jrVar != null) {
                                jrVar.close();
                            }
                            gbbVar.close();
                            if (((qwm) this.b).i && ((qwm) this.b).d.length() == ((qwm) this.b).b) {
                                obj = this.b;
                                ((qwm) obj).c();
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            ((qwm) this.b).b(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (jrVar != null) {
                                jrVar.close();
                            }
                            gbbVar.close();
                            if (((qwm) this.b).i && ((qwm) this.b).d.length() == ((qwm) this.b).b) {
                                ((qwm) this.b).c();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable unused2) {
                                    throw th2;
                                }
                            }
                            if (jrVar != null) {
                                jrVar.close();
                            }
                            gbbVar.close();
                            if (((qwm) this.b).i && ((qwm) this.b).d.length() == ((qwm) this.b).b) {
                                ((qwm) this.b).c();
                            }
                            throw th2;
                        }
                    }
                } else {
                    ((qwm) this.b).b(gbbVar.gm(), gbbVar.vj());
                    jrVar = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (jrVar != null) {
                    jrVar.close();
                }
                gbbVar.close();
                if (((qwm) this.b).i && ((qwm) this.b).d.length() == ((qwm) this.b).b) {
                    obj = this.b;
                    ((qwm) obj).c();
                }
            } catch (Throwable th3) {
                th = th3;
                jrVar = null;
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$clearCredentialState$1$callback$1] */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, final TaskCompletionSource taskCompletionSource) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 24:
                v9o v9oVar = new v9o((zzfu) obj, taskCompletionSource);
                zzgh zzghVar = (zzgh) ((zzgm) anyClient).getService();
                Parcel J = zzghVar.J();
                zzc.c(J, v9oVar);
                zzghVar.Z1(J, 2);
                break;
            default:
                IdentityCredentialClientImpl identityCredentialClientImpl = (IdentityCredentialClientImpl) anyClient;
                Api api = InternalIdentityCredentialClient.l;
                ?? r0 = new IdentityCredentialBaseCallbacks() { // from class: com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$clearCredentialState$1$callback$1
                    @Override // com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
                    public final void q4(Status status, ClearCredentialStateResponse clearCredentialStateResponse) {
                        status.getClass();
                        TaskUtil.a(status, clearCredentialStateResponse, TaskCompletionSource.this);
                    }
                };
                IIdentityCredentialService iIdentityCredentialService = (IIdentityCredentialService) identityCredentialClientImpl.getService();
                identityCredentialClientImpl.getContext();
                iIdentityCredentialService.n3(r0, (ClearCredentialStateRequest) obj, zzh.a());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzegu, com.google.android.gms.internal.ads.zzeup
    /* renamed from: zza */
    public void mo12zza() {
        switch (this.a) {
            case 17:
                zzdqm zzdqmVar = ((zzdve) this.b).d;
                if (zzdqmVar != null) {
                    synchronized (zzdqmVar) {
                        zzdqmVar.n.n(NativeCustomFormatAd.ASSET_NAME_VIDEO);
                    }
                    return;
                }
                return;
            case 18:
            case 20:
            default:
                zzfhk zzfhkVar = (zzfhk) this.b;
                synchronized (zzfhkVar) {
                    zzfhkVar.k = null;
                }
                return;
            case 19:
                if (((Boolean) zzba.zzc().a(zzbjg.Uf)).booleanValue()) {
                    zzeai a = ((zzeil) this.b).f.a();
                    a.b("action", "ptard");
                    a.b("ptard", "r");
                    a.c();
                    return;
                }
                return;
            case 21:
                zzete zzeteVar = (zzete) this.b;
                synchronized (zzeteVar) {
                    zzeteVar.i = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        switch (this.a) {
            case 9:
                ((zzcgv) this.b).b.set(1);
                return;
            default:
                String str = (String) obj;
                synchronized (this) {
                    zzecu zzecuVar = (zzecu) this.b;
                    zzecuVar.c = true;
                    zzecuVar.d((int) (zzt.zzk().elapsedRealtime() - zzecuVar.d), "com.google.android.gms.ads.MobileAds", "", true);
                    zzecuVar.i.execute(new bnn(13, this, str));
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public JSONObject zzd() {
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        rbo rboVar = (rbo) this.b;
        rboVar.getClass();
        rboVar.f.d(InstrumentationData.Component.NATIVE_ESP, InstrumentationData.Method.COLLECT_SIGNALS, exc);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public void d(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onSuccess(String str) {
        try {
            ((zzbxw) this.b).zze(str);
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public void zzb(int i, long j, String str) {
        ((zzfyi) this.b).e(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Object zza(Object obj) {
        zzflo zzfloVar = (zzflo) obj;
        zzcsj zzcsjVar = ((zzczp) this.b).d;
        Iterator it = zzfloVar.b.c.iterator();
        while (it.hasNext()) {
            zzflm zzflmVar = (zzflm) it.next();
            Map map = zzcsjVar.a;
            String str = zzflmVar.a;
            JSONObject jSONObject = zzflmVar.b;
            if (map.containsKey(str) && jSONObject != null) {
                ((zzcsm) map.get(str)).a(jSONObject);
            } else {
                Map map2 = zzcsjVar.b;
                if (map2.containsKey(str) && jSONObject != null) {
                    zzcsl zzcslVar = (zzcsl) map2.get(str);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    zzcslVar.a(hashMap);
                }
            }
        }
        return zzfloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public /* synthetic */ zzea zza() {
        return ((zzclm) this.b).zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public void zza(int i, long j) {
        ((zzfyi) this.b).b(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 7:
                zze.zza("Getting a new session for JS Engine.");
                ((zzbug) obj2).a.zzc(((zzbth) obj).zzl());
                break;
            case 13:
                ((zzddt) obj).L((zzdol) obj2);
                break;
            case 14:
                ((zzdgg) obj).h((com.google.android.gms.ads.internal.client.zzt) obj2);
                break;
            case 15:
                ((zzdjg) obj).t((zzbil.zzb) obj2);
                break;
            case 16:
                ((zzdmi) obj).zzd((zzbc) obj2);
                break;
            default:
                zzfpp zzfppVar = (zzfpp) obj2;
                ((zzfqj) obj).h((zzfqc) zzfppVar.a, zzfppVar.b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 9:
                ((zzcgv) this.b).b.set(-1);
                return;
            default:
                synchronized (this) {
                    zzecu zzecuVar = (zzecu) this.b;
                    zzecuVar.c = true;
                    zzecuVar.d((int) (zzt.zzk().elapsedRealtime() - zzecuVar.d), "com.google.android.gms.ads.MobileAds", "Internal Error.", false);
                    zzecuVar.e.zzd(new Exception());
                }
                return;
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.gm
    public void pcc(sf sfVar, IOException iOException) {
        ((qwm) this.b).b(30000, iOException.getMessage());
    }

    public ewm(uun uunVar) {
        this.a = 11;
        zzejp zzejpVar = new zzejp(uunVar.b0);
        zzcok zzcokVar = uunVar.h;
        zzfoy zzfoyVar = l9o.a;
        int i = run.a;
        zzcow zzcowVar = uunVar.a0;
        zzinv zzinvVar = uunVar.c0;
        int i2 = qun.a;
        this.b = new zzejh(zzcokVar, zzcowVar, zzejpVar, zzinvVar, uunVar.z, uunVar.y);
    }

    public /* synthetic */ ewm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public ewm(zzbul zzbulVar, zzbug zzbugVar) {
        this.a = 7;
        this.b = zzbugVar;
        Objects.requireNonNull(zzbulVar);
    }

    public ewm(zzbyg zzbygVar, zzbxw zzbxwVar) {
        this.a = 8;
        this.b = zzbxwVar;
    }

    public ewm(zzecu zzecuVar) {
        this.a = 18;
        Objects.requireNonNull(zzecuVar);
        this.b = zzecuVar;
    }

    public ewm(zzada zzadaVar) {
        this.a = 2;
        this.b = zzadaVar;
        zzadaVar.a = this;
    }

    public ewm(jfn jfnVar, zzbs zzbsVar) {
        this.a = 3;
        zztg a = zztg.a(new zzca(jfnVar.c));
        if (zzbsVar != null) {
            zzti zztiVar = new zzti(zzbsVar);
            zztf zztfVar = new zztf();
            this.b = zztfVar;
            zzti zztiVar2 = jfnVar.c;
            int i = vjn.a;
            int i2 = gkn.a;
            zztg zztgVar = jfnVar.g;
            zzap zzapVar = jfnVar.h;
            zztg zztgVar2 = jfnVar.d;
            zztg a2 = zztg.a(new zzbf(zztiVar2, jfnVar.e, a, zztgVar2, zztiVar, new zzby(a, new zzce(zztiVar2, a, zztgVar, zzapVar, zztfVar, zztgVar2)), jfnVar.i));
            if (zztfVar.a == null) {
                zztfVar.a = a2;
                return;
            } else {
                zzl.s();
                throw null;
            }
        }
        yhk.s("instance cannot be null");
        throw null;
    }
}
