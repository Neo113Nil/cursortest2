package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzccf;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzckh;
import com.google.android.gms.internal.ads.zzdyf;
import com.google.android.gms.internal.ads.zzdyh;
import com.google.android.gms.internal.ads.zzebm;
import com.google.android.gms.internal.ads.zzebp;
import com.google.android.gms.internal.ads.zzedp;
import com.google.android.gms.internal.ads.zzejt;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzevc;
import com.google.android.gms.internal.ads.zzevd;
import com.google.android.gms.internal.ads.zzevj;
import com.google.android.gms.internal.ads.zzevk;
import com.google.android.gms.internal.ads.zzewa;
import com.google.android.gms.internal.ads.zzewb;
import com.google.android.gms.internal.ads.zzewi;
import com.google.android.gms.internal.ads.zzewl;
import com.google.android.gms.internal.ads.zzewm;
import com.google.android.gms.internal.ads.zzexc;
import com.google.android.gms.internal.ads.zzexd;
import com.google.android.gms.internal.ads.zzexg;
import com.google.android.gms.internal.ads.zzexh;
import com.google.android.gms.internal.ads.zzexn;
import com.google.android.gms.internal.ads.zzexo;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzeyd;
import com.google.android.gms.internal.ads.zzfab;
import com.google.android.gms.internal.ads.zzfai;
import com.google.android.gms.internal.ads.zzfaj;
import com.google.android.gms.internal.ads.zzfam;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfaq;
import com.google.android.gms.internal.ads.zzfar;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfay;
import com.google.android.gms.internal.ads.zzfbi;
import com.google.android.gms.internal.ads.zzfbj;
import com.google.android.gms.internal.ads.zzfbq;
import com.google.android.gms.internal.ads.zzfbr;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzhfd;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhft;
import com.google.android.gms.internal.ads.zzhns;
import com.google.android.gms.internal.ads.zzhnw;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpc;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v35 implements Callable, bt8 {
    public final /* synthetic */ int a;
    public final Object b;

    public v35(View view) {
        this.a = 4;
        this.b = new WeakReference(view);
    }

    private final Object a() {
        String str;
        boolean z;
        zzedp zzedpVar = ((zzfax) this.b).b;
        synchronized (zzedpVar) {
            if (((Boolean) zzba.zzc().a(zzbjg.va)).booleanValue() && zzedpVar.f()) {
                if (zzedpVar.q < zzt.zzk().a() / 1000) {
                    zzedpVar.o = "{}";
                    zzedpVar.q = Long.MAX_VALUE;
                    str = "";
                } else if (!zzedpVar.o.equals("{}")) {
                    str = zzedpVar.o;
                }
            }
            str = "";
        }
        synchronized (zzedpVar) {
            z = zzedpVar.s;
        }
        return new zzfay(str, z, zzt.zzo().zzk(), zzedpVar.p != null, zzedpVar.w < ((Long) zzba.zzc().a(zzbjg.Qa)).longValue());
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0261  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        long j;
        byte[] bArr;
        zzhfj zzhfjVar;
        zzhfd e;
        zzfmu a;
        Bundle bundle;
        int i;
        int i2;
        int intExtra;
        boolean z;
        int intExtra2;
        JSONObject jSONObject;
        ViewGroup viewGroup;
        HashMap hashMap;
        String str = null;
        Boolean valueOf = null;
        Bundle bundle2 = null;
        str = null;
        int i3 = 0;
        switch (this.a) {
            case 0:
                synchronized (((k45) this.b)) {
                    try {
                        k45 k45Var = (k45) this.b;
                        if (k45Var.i != null) {
                            k45Var.M();
                            if (((k45) this.b).k()) {
                                ((k45) this.b).C();
                                ((k45) this.b).k = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 1:
                return this.b;
            case 2:
                Bitmap decodeStream = BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream((URL) this.b));
                decodeStream.setDensity(160);
                return new BitmapDrawable(Resources.getSystem(), decodeStream);
            case 3:
                uk0 uk0Var = (uk0) this.b;
                uk0Var.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    zbc zbcVar = uk0Var.e;
                    Iterator it = zbcVar.k.iterator();
                    while (it.hasNext()) {
                        if (((GoogleApiClient) it.next()).d(zbcVar)) {
                            i3++;
                        }
                    }
                    try {
                        zbcVar.j.tryAcquire(i3, 5L, TimeUnit.SECONDS);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        uk0Var.c.set(true);
                        throw th;
                    } finally {
                        uk0Var.a(null);
                    }
                }
            case 4:
                View view = (View) ((WeakReference) this.b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return "";
                }
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                createBitmap.getClass();
                view.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                encodeToString.getClass();
                return encodeToString;
            case 5:
                rbo rboVar = (rbo) this.b;
                rboVar.getClass();
                try {
                    Task task = rboVar.c.getTask();
                    b7p b7pVar = rboVar.e;
                    Task continueWith = task.continueWith(b7pVar, new omf(17)).continueWithTask(b7pVar, new b1l(rboVar, 23)).continueWith(b7pVar, new wje(18));
                    return (List) Tasks.await(rboVar.g == null ? Tasks.forResult(new ArrayList()) : Tasks.withTimeout(continueWith, r2.intValue(), TimeUnit.MILLISECONDS).addOnFailureListener(new ewm(rboVar, 25)));
                } catch (InterruptedException | ExecutionException unused2) {
                    return new ArrayList();
                }
            case 6:
                zzez zzezVar = ((FirebaseAnalytics) this.b).a;
                zzezVar.getClass();
                zzcm zzcmVar = new zzcm();
                zzezVar.c(new y0o(zzezVar, zzcmVar, 5));
                return zzcmVar.S1(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            case 7:
                Context a2 = zzccf.a(((zzcfv) this.b).e);
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo b = Wrappers.a(a2).b(4096, a2.getApplicationInfo().packageName);
                    if (b.requestedPermissions != null && b.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = b.requestedPermissions;
                            if (i3 < strArr.length) {
                                if ((b.requestedPermissionsFlags[i3] & 2) != 0) {
                                    arrayList.add(strArr[i3]);
                                }
                                i3++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                }
                return arrayList;
            case 8:
                zzcjk zzcjkVar = (zzcjk) this.b;
                return Boolean.valueOf(zzcjkVar.c.i(zzcjkVar.d, zzcjkVar.e, zzcjkVar));
            case 9:
                zzckh zzckhVar = (zzckh) this.b;
                zzckhVar.getClass();
                zzbhn zzj = zzt.zzj();
                zzbhr zzbhrVar = zzckhVar.n;
                synchronized (zzj.c) {
                    try {
                        j = -2;
                        if (zzj.f != null) {
                            if (zzj.d.t()) {
                                try {
                                    zzbht zzbhtVar = zzj.f;
                                    Parcel J = zzbhtVar.J();
                                    zzbew.c(J, zzbhrVar);
                                    Parcel S1 = zzbhtVar.S1(J, 3);
                                    long readLong = S1.readLong();
                                    S1.recycle();
                                    j = readLong;
                                } catch (RemoteException e2) {
                                    int i4 = zze.zza;
                                    zzo.zzg("Unable to call into cache service.", e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return Long.valueOf(j);
            case 10:
                AudioManager audioManager = (AudioManager) this.b;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                return streamMaxVolume == 0 ? Double.valueOf(0.0d) : Double.valueOf(streamVolume / streamMaxVolume);
            case 11:
                CookieManager cookieManager = (CookieManager) this.b;
                return cookieManager == null ? "" : cookieManager.getCookie((String) zzba.zzc().a(zzbjg.E1));
            case 12:
                return ((zzejt) this.b).getWritableDatabase();
            case 13:
                return ((zzele) this.b).getWritableDatabase();
            case 14:
                zzevc zzevcVar = (zzevc) this.b;
                ArrayList arrayList2 = new ArrayList();
                View view2 = zzevcVar.d;
                while (view2 != null) {
                    ViewParent parent = view2.getParent();
                    if (parent != null) {
                        int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view2) : -1;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("type", parent.getClass().getName());
                        bundle3.putInt("index_of_child", indexOfChild);
                        arrayList2.add(bundle3);
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                    return new zzevd(zzevcVar.b, zzevcVar.c.f, arrayList2);
                }
                return new zzevd(zzevcVar.b, zzevcVar.c.f, arrayList2);
            case 15:
                zzevj zzevjVar = (zzevj) this.b;
                if (((Boolean) zzba.zzc().a(zzbjg.e8)).booleanValue()) {
                    if ((((Boolean) zzba.zzc().a(zzbjg.g8)).booleanValue() ? Arrays.asList(((String) zzba.zzc().a(zzbjg.h8)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) : Arrays.asList(((String) zzba.zzc().a(zzbjg.f8)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR))).contains(zzv.zzb(zzv.zzc(zzevjVar.b.d)))) {
                        try {
                            zzhns zzhnsVar = zzhns.b;
                            synchronized (zzhnsVar) {
                                HashMap hashMap2 = zzhnsVar.a;
                                if (!hashMap2.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                zzhfjVar = (zzhfj) hashMap2.get("AES128_GCM");
                            }
                            if (zzhfjVar == null) {
                                try {
                                    zzhfjVar = zzhft.a(((zzhot) zzhnw.b.h(null)).b.d());
                                } catch (GeneralSecurityException e3) {
                                    throw new zzhpc("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e3);
                                }
                            }
                            e = zzhfd.e(zzhfjVar);
                        } catch (GeneralSecurityException e4) {
                            zze.zza("Failed to generate key".concat(e4.toString()));
                            zzt.zzh().d("CryptoUtils.generateKey", e4);
                            bArr = new byte[0];
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                e.b().b(byteArrayOutputStream2);
                                byteArrayOutputStream2.close();
                                bArr = byteArrayOutputStream2.toByteArray();
                                str = Base64.encodeToString(bArr, 11);
                            } catch (Throwable th2) {
                                byteArrayOutputStream2.close();
                                throw th2;
                            }
                        } catch (IOException unused4) {
                            throw new GeneralSecurityException("Serialize keyset failed");
                        }
                    }
                }
                return new zzevk(str);
            case 16:
                zzewa zzewaVar = (zzewa) this.b;
                List<String> asList = Arrays.asList(((String) zzba.zzc().a(zzbjg.h2)).split(";"));
                Bundle bundle4 = new Bundle();
                for (String str2 : asList) {
                    try {
                        a = zzewaVar.b.a(str2, new JSONObject());
                        a.a();
                        boolean z2 = zzewaVar.c.b;
                        bundle = new Bundle();
                        if (!((Boolean) zzba.zzc().a(zzbjg.od)).booleanValue() || z2) {
                            try {
                                zzbyi l = a.a.l();
                                if (l != null) {
                                    try {
                                        bundle.putString("sdk_version", l.toString());
                                    } catch (zzfmd unused5) {
                                    }
                                }
                            } catch (Throwable th3) {
                                throw new zzfmd(th3);
                                break;
                            }
                        }
                    } catch (zzfmd unused6) {
                    }
                    try {
                        zzbyi zzH = a.a.zzH();
                        if (zzH != null) {
                            try {
                                bundle.putString("adapter_version", zzH.toString());
                            } catch (zzfmd unused7) {
                            }
                        }
                        bundle4.putBundle(str2, bundle);
                    } catch (Throwable th4) {
                        throw new zzfmd(th4);
                        break;
                    }
                }
                zzewb zzewbVar = new zzewb(bundle4);
                if (((Boolean) zzba.zzc().a(zzbjg.od)).booleanValue()) {
                    zzewaVar.d.b = zzewbVar;
                }
                return zzewbVar;
            case 17:
                ContentResolver contentResolver = (ContentResolver) this.b;
                return new zzewi(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            case 18:
                zzewl zzewlVar = (zzewl) this.b;
                return new zzewm(zzewlVar.b.k, zzewlVar.c.g);
            case 19:
                return zzexd.a(((zzexc) this.b).b);
            case 20:
                AudioManager audioManager2 = (AudioManager) ((zzexg) this.b).b.getSystemService("audio");
                float zzb = zzt.zzi().zzb();
                boolean zzd = zzt.zzi().zzd();
                if (audioManager2 == null) {
                    return new zzexh(-1, false, false, -1, -1, -1, -1, -1, zzb, zzd, true);
                }
                int mode = audioManager2.getMode();
                boolean isMusicActive = audioManager2.isMusicActive();
                boolean isSpeakerphoneOn = audioManager2.isSpeakerphoneOn();
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (((Boolean) zzba.zzc().a(zzbjg.Ec)).booleanValue()) {
                    int zzi = zzt.zzf().zzi(audioManager2);
                    i2 = audioManager2.getStreamMaxVolume(3);
                    i = zzi;
                } else {
                    i = -1;
                    i2 = -1;
                }
                return new zzexh(mode, isMusicActive, isSpeakerphoneOn, streamVolume2, i, i2, audioManager2.getRingerMode(), audioManager2.getStreamVolume(2), zzb, zzd, false);
            case 21:
                zzexn zzexnVar = (zzexn) this.b;
                if (((Boolean) zzba.zzc().a(zzbjg.Id)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) zzexnVar.b.getSystemService("batterymanager");
                    r11 = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        z = batteryManager.isCharging();
                        return new zzexo(r11, z);
                    }
                    Intent a3 = zzexnVar.a();
                    if (a3 == null || ((intExtra2 = a3.getIntExtra("status", -1)) != 2 && intExtra2 != 5)) {
                        r9 = false;
                    }
                } else {
                    Intent a4 = zzexnVar.a();
                    if (a4 == null || ((intExtra = a4.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
                        r9 = false;
                    }
                    if (a4 != null) {
                        r11 = a4.getIntExtra("level", -1) / a4.getIntExtra("scale", -1);
                    }
                }
                z = r9;
                return new zzexo(r11, z);
            case 22:
                zzeyc zzeycVar = (zzeyc) this.b;
                zzflw zzflwVar = zzeycVar.d;
                zzdyf zzdyfVar = zzeycVar.b;
                String str3 = zzflwVar.g;
                String str4 = zzeycVar.c;
                zzdyfVar.getClass();
                if (((Boolean) zzba.zzc().a(zzbjg.d5)).booleanValue() && str3 != null && str4 != null) {
                    if (!zzdyfVar.d) {
                        zzdyfVar.a();
                        if (((Boolean) zzba.zzc().a(zzbjg.e5)).booleanValue() && !zzdyfVar.f.getAndSet(true)) {
                            zzt.zzh().g().zzk(new r1o(zzdyfVar, 0));
                        }
                    }
                    Map map = (Map) zzdyfVar.a.get(str4);
                    if (map != null) {
                        jSONObject = (JSONObject) map.get(str3);
                        if (jSONObject == null) {
                            String a5 = zzdyh.a(zzdyfVar.e, str3, str4);
                            if (a5 != null) {
                                jSONObject = (JSONObject) map.get(a5);
                            }
                        }
                        return new zzeyd(jSONObject, ((Boolean) zzba.zzc().a(zzbjg.f5)).booleanValue() ? zzdyfVar.b : null);
                    }
                }
                jSONObject = null;
                return new zzeyd(jSONObject, ((Boolean) zzba.zzc().a(zzbjg.f5)).booleanValue() ? zzdyfVar.b : null);
            case 23:
                Context context = ((zzfab) this.b).a;
                zzt.zzc();
                String string = !((Boolean) zzba.zzc().a(zzbjg.f7)).booleanValue() ? "" : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                String string2 = ((Boolean) zzba.zzc().a(zzbjg.h7)).booleanValue() ? context.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                zzt.zzc();
                if (((Boolean) zzba.zzc().a(zzbjg.g7)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Bundle bundle5 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle5.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr2 = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    while (i3 < 4) {
                        String str5 = strArr2[i3];
                        if (defaultSharedPreferences.contains(str5)) {
                            bundle5.putString(str5, defaultSharedPreferences.getString(str5, null));
                        }
                        i3++;
                    }
                    bundle2 = bundle5;
                }
                return new w6o(string, string2, bundle2);
            case 24:
                zzfai zzfaiVar = (zzfai) this.b;
                zzt.zzc();
                return new zzfaj(zzs.zzu(zzfaiVar.a));
            case 25:
                return new zzfan("requester_type_2".equals(zzv.zzc(((zzfam) this.b).b.d)));
            case 26:
                zzfaq zzfaqVar = (zzfaq) this.b;
                Set set = zzfaqVar.d;
                if (((Boolean) zzba.zzc().a(zzbjg.X6)).booleanValue() && (viewGroup = zzfaqVar.b) != null && set.contains("banner")) {
                    return new zzfar(Boolean.valueOf(viewGroup.isHardwareAccelerated()));
                }
                if (((Boolean) zzba.zzc().a(zzbjg.Y6)).booleanValue() && set.contains(IronSourceConstants.EVENTS_NATIVE)) {
                    Context context2 = zzfaqVar.c;
                    if (context2 instanceof Activity) {
                        Activity activity = (Activity) context2;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & C.DEFAULT_MUXED_BUFFER_SIZE) == 0) {
                            try {
                                if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                                    r9 = false;
                                }
                                valueOf = Boolean.valueOf(r9);
                            } catch (PackageManager.NameNotFoundException unused8) {
                            }
                        } else {
                            valueOf = Boolean.TRUE;
                        }
                        return new zzfar(valueOf);
                    }
                }
                return new zzfar(null);
            case 27:
                return a();
            case 28:
                zzfbi zzfbiVar = (zzfbi) this.b;
                return new zzfbj(zzfbiVar.b, zzfbiVar.c, zzfbiVar.d);
            default:
                zzebm zzebmVar = ((zzfbq) this.b).b;
                synchronized (zzebmVar) {
                    hashMap = new HashMap();
                    if (((Boolean) zzba.zzc().a(zzbjg.Q8)).booleanValue()) {
                        zzebmVar.b();
                        for (Map.Entry entry : zzebmVar.a.entrySet()) {
                            hashMap.put((zzebp) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                        }
                    }
                }
                return new zzfbr(hashMap);
        }
    }

    public /* synthetic */ v35(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
