package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzefj;
import com.google.android.gms.internal.ads.zzegd;
import com.google.android.gms.internal.ads.zzegq;
import com.google.android.gms.internal.ads.zzegt;
import com.google.android.gms.internal.ads.zzeha;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzejb;
import com.google.android.gms.internal.ads.zzejd;
import com.google.android.gms.internal.ads.zzeji;
import com.google.android.gms.internal.ads.zzejj;
import com.google.android.gms.internal.ads.zzejk;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzgiu;
import com.google.android.gms.internal.ads.zzgiv;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzims;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzqt;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.internal.measurement.zzro;
import com.google.android.gms.internal.measurement.zzru;
import com.google.android.gms.internal.measurement.zzse;
import com.google.android.gms.internal.measurement.zzsv;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.wearable.internal.zzkf;
import com.unity3d.services.core.fid.Constants;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class een implements Callable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public een(zzpg zzpgVar, zzr zzrVar) {
        this.a = 21;
        this.b = zzrVar;
        Objects.requireNonNull(zzpgVar);
        this.c = zzpgVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzcgo zzcgoVar;
        int i = 0;
        switch (this.a) {
            case 0:
                zin zinVar = (zin) this.b;
                WebViewInitData.JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData = (WebViewInitData.JavaScriptNativeBridgeInitData) this.c;
                wco wcoVar = zinVar.l;
                Integer msParameterTimeoutMs = javaScriptNativeBridgeInitData.msParameterTimeoutMs();
                wcoVar.getClass();
                if (msParameterTimeoutMs == null || msParameterTimeoutMs.intValue() <= 0) {
                    return wcoVar.a();
                }
                ddb b = wcoVar.b.b(new q7o(wcoVar, 11));
                try {
                    return (String) b.get(msParameterTimeoutMs.intValue(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    wcoVar.c.d(InstrumentationData.Component.SPAM_MS_PARAMETER_LOADER, InstrumentationData.Method.GET_SPAM_MS_PARAMETER, e);
                    String str = true != (e instanceof TimeoutException) ? "3" : "17";
                    b.cancel(false);
                    return str;
                }
            case 1:
                return ((zzbaa) this.b).a((Context) this.c);
            case 2:
                zzccc zzcccVar = (zzccc) this.c;
                WeakHashMap weakHashMap = zzcccVar.a;
                Context context = (Context) this.b;
                prn prnVar = (prn) weakHashMap.get(context);
                zzcbz a = (prnVar == null || prnVar.a + ((Long) zzbkw.d.c()).longValue() < zzt.zzk().a()) ? new zzcby(context).a() : new zzcby(context, prnVar.b).a();
                weakHashMap.put(context, new prn(zzcccVar, a));
                return a;
            case 3:
                return (String) ((zzcer) this.b).k((Context) this.c, Constants.GET_APP_INSTANCE_ID);
            case 4:
                return ((exn) this.b).a.a((NetworkRequestData) this.c);
            case 5:
                zzecu zzecuVar = (zzecu) this.b;
                zzfqw zzfqwVar = (zzfqw) this.c;
                zzecuVar.e.zzc(Boolean.TRUE);
                zzfqwVar.zzd(true);
                zzecuVar.p.b(zzfqwVar.zzm());
                return null;
            case 6:
                zzefj zzefjVar = (zzefj) this.b;
                zzcbv zzcbvVar = (zzcbv) this.c;
                zzegt zzegtVar = zzefjVar.c;
                synchronized (zzegtVar.b) {
                    try {
                        if (zzegtVar.c) {
                            zzcgoVar = zzegtVar.a;
                        } else {
                            zzegtVar.c = true;
                            zzegtVar.e = zzcbvVar;
                            zzegtVar.f.checkAvailabilityAndConnect();
                            zzcgoVar = zzegtVar.a;
                            zzcgoVar.addListener(new fsn(zzegtVar, 29), zzcgj.h);
                            zzeha.b(zzegtVar.g, zzcgoVar, zzegtVar.h);
                        }
                    } finally {
                    }
                }
                return (zzehq) zzcgoVar.get(((Integer) zzba.zzc().a(zzbjg.J6)).intValue(), TimeUnit.SECONDS);
            case 7:
                return (zzehq) ((zzegd) this.b).d.c((zzcbv) this.c).get(((Integer) zzba.zzc().a(zzbjg.J6)).intValue(), TimeUnit.SECONDS);
            case 8:
                zzegq zzegqVar = (zzegq) this.b;
                zzeji zzejiVar = (zzeji) this.c;
                zzegqVar.b(zzdzs.RENDERING_ADSTRING_TYPE2_FETCH_START);
                int i2 = -1;
                while (i < ((Integer) zzba.zzc().a(zzbjg.m8)).intValue()) {
                    try {
                        Context context2 = zzegqVar.b;
                        String str2 = zzegqVar.c.afmaVersion;
                        Binder.getCallingUid();
                        zzejj zza = new zzejk(context2, str2, null).zza(zzejiVar);
                        int i3 = zza.a;
                        if (((Boolean) zzba.zzc().a(zzbjg.n8)).booleanValue()) {
                            zzegqVar.i.b("fr", String.valueOf(i));
                        }
                        if (i3 == 200) {
                            zzegqVar.b(zzdzs.RENDERING_ADSTRING_TYPE2_FETCH_END);
                            return zza.c;
                        }
                        i++;
                        i2 = i3;
                    } catch (Exception e2) {
                        throw new zzeqf(e2.getMessage() == null ? "Fetch failed." : e2.getMessage(), e2);
                    }
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                sb.append("Received HTTP error code from ad server:");
                sb.append(i2);
                throw new zzeqf(1, sb.toString());
            case 9:
                zzejj zzejjVar = (zzejj) ((zzfpp) this.b).c.get();
                Object obj = ((xlo) this.c).a;
                return new zzejd(zzejjVar, ((zzejb) obj).b, ((zzejb) obj).a);
            case 10:
                zzfte zzfteVar = (zzfte) this.b;
                String str3 = (String) this.c;
                zzu zzuVar = zzfteVar.d;
                if (!((Boolean) zzba.zzc().a(zzbjg.oa)).booleanValue() || (!zzt.zzc().zzh(str3) && !zzt.zzc().zzi(str3))) {
                    return zzuVar.zzc(str3, null);
                }
                zzims zzimsVar = zzfteVar.g.c;
                String encodeToString = zzimsVar != null ? Base64.encodeToString(zzimsVar.d(), 10) : null;
                HashMap hashMap = new HashMap();
                if (encodeToString != null) {
                    hashMap.put((String) zzba.zzc().a(zzbjg.pa), encodeToString);
                }
                return zzuVar.zzc(str3, hashMap);
            case 11:
                zzgge zzggeVar = (zzgge) this.b;
                Object obj2 = this.c;
                synchronized (zzggeVar) {
                    File file = zzggeVar.a;
                    zzhat.b(file);
                    String parent = file.getParent();
                    String name = file.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
                    sb2.append(name);
                    sb2.append(".temp");
                    File file2 = new File(parent, sb2.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            zzggeVar.c.b(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file2.renameTo(zzggeVar.a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } finally {
                        }
                    } catch (IOException e3) {
                        file2.delete();
                        throw e3;
                    }
                }
                return null;
            case 12:
                qdo qdoVar = (qdo) this.b;
                zzgja zzgjaVar = (zzgja) this.c;
                DexClassLoader dexClassLoader = qdoVar.l;
                zzgiv zzgivVar = qdoVar.d;
                byte[] bArr = qdoVar.k;
                String str4 = zzgjaVar.a;
                String str5 = zzgjaVar.b;
                Class<?>[] clsArr = zzgjaVar.c;
                try {
                    zzgivVar.getClass();
                    byte[] a2 = zzgiv.a(str4, bArr);
                    Charset charset = zzgiv.a;
                    return dexClassLoader.loadClass(new String(a2, charset)).getMethod(new String(zzgiv.a(str5, bArr), charset), clsArr);
                } catch (zzgiu | ClassNotFoundException | NoSuchMethodException | NullPointerException e4) {
                    yhk.q(e4);
                    return null;
                }
            case 13:
                qeo qeoVar = (qeo) this.b;
                Context context3 = (Context) this.c;
                zzgrh zzgrhVar = qeoVar.d;
                n72 b2 = qeoVar.a.b();
                if (b2 == null) {
                    zzgrhVar.b(15004);
                    return "";
                }
                String o = b2.o(context3);
                if (o != null) {
                    return o;
                }
                zzgrhVar.b(15006);
                return "";
            case 14:
                veo veoVar = (veo) this.b;
                Context context4 = (Context) this.c;
                HashMap hashMap2 = new HashMap();
                veoVar.f.f(20106, new lv4(veoVar, hashMap2, context4, false, 29));
                String g = veoVar.g(hashMap2);
                hashMap2.clear();
                return g;
            case 15:
                return ((xfo) this.b).a((Context) this.c);
            case 16:
                return ((uno) this.b).g((Context) this.c);
            case 17:
                zzpg zzpgVar = ((zzjd) this.c).a;
                zzpgVar.W();
                hkn hknVar = zzpgVar.c;
                zzpg.U(hknVar);
                return hknVar.N0((String) this.b);
            case 18:
                zzpg zzpgVar2 = ((zzjd) this.c).a;
                zzpgVar2.W();
                return new zzao(zzpgVar2.q0(((zzr) this.b).a));
            case 19:
                zro zroVar = (zro) this.b;
                gmo gmoVar = zroVar.j;
                if ((gmoVar != null ? (q8p) gmoVar.b : zroVar.i) != null) {
                    (gmoVar != null ? (q8p) gmoVar.b : zroVar.i).get();
                }
                cmn b3 = zroVar.b();
                if (b3 != null) {
                    try {
                        s9n s9nVar = (s9n) this.c;
                        synchronized (s9nVar) {
                            byte[] b4 = b3.b();
                            z8n z8nVar = z8n.b;
                            int i4 = o7n.a;
                            s9nVar.e(b4, b4.length, z8n.c);
                        }
                    } catch (NullPointerException | lan unused) {
                    }
                }
                return null;
            case 20:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.b;
                if (Log.isLoggable("WearableClient", 3)) {
                    "processAssets: writing data to FD : ".concat(String.valueOf(parcelFileDescriptor));
                }
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    try {
                        autoCloseOutputStream.write((byte[]) this.c);
                        autoCloseOutputStream.flush();
                        if (Log.isLoggable("WearableClient", 3)) {
                            new StringBuilder(String.valueOf(parcelFileDescriptor).length() + 27);
                        }
                        Boolean bool = Boolean.TRUE;
                        try {
                            if (Log.isLoggable("WearableClient", 3)) {
                                new StringBuilder(String.valueOf(parcelFileDescriptor).length() + 24);
                            }
                            autoCloseOutputStream.close();
                            return bool;
                        } catch (IOException unused2) {
                            return bool;
                        }
                    } catch (Throwable th) {
                        try {
                            if (Log.isLoggable("WearableClient", 3)) {
                                new StringBuilder(String.valueOf(parcelFileDescriptor).length() + 24);
                            }
                            autoCloseOutputStream.close();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                    new StringBuilder(String.valueOf(parcelFileDescriptor).length() + 36);
                    try {
                        if (Log.isLoggable("WearableClient", 3)) {
                            new StringBuilder(String.valueOf(parcelFileDescriptor).length() + 24);
                        }
                        autoCloseOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return Boolean.FALSE;
                }
            case 21:
                zzr zzrVar = (zzr) this.b;
                String str6 = zzrVar.a;
                Preconditions.i(str6);
                zzpg zzpgVar3 = (zzpg) this.c;
                zzjl c = zzpgVar3.c(str6);
                zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                if (c.i(zzjkVar) && zzjl.c(100, zzrVar.s).i(zzjkVar)) {
                    return zzpgVar3.d0(zzrVar).F();
                }
                zzpgVar3.b().o.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                zzqt zzqtVar = (zzqt) this.b;
                zzqv zzqvVar = (zzqv) this.c;
                zzlk zzlkVar = zzqtVar.a;
                zzse zzseVar = new zzse();
                try {
                    zzru zzruVar = (zzru) zzlkVar.f.get();
                    Uri uri = zzqtVar.b;
                    zzsv zzsvVar = new zzsv(zzqvVar);
                    zzsvVar.b = new zzro[]{zzseVar};
                } catch (IOException | RuntimeException e5) {
                    zzlz.a(Level.WARNING, zzlkVar.a(), e5, "Failed to update snapshot for %s flags may be stale.", zzqtVar.c);
                }
                return null;
        }
    }

    public /* synthetic */ een(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ een(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public een(zzkf zzkfVar, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.a = 20;
        this.b = parcelFileDescriptor;
        this.c = bArr;
    }
}
