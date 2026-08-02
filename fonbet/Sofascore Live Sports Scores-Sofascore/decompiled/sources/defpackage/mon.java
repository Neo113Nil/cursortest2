package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzcld;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcmy;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzcng;
import com.google.android.gms.internal.ads.zzgdk;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.android.gms.internal.ads.zzgdo;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgts;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.i;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mon implements zzbqh {
    public static final /* synthetic */ mon b = new mon(20);
    public static final /* synthetic */ mon c = new mon(21);
    public static final /* synthetic */ mon d = new mon(22);
    public static final /* synthetic */ mon e = new mon(23);
    public static final /* synthetic */ mon f = new mon(24);
    public static final /* synthetic */ mon g = new mon(25);
    public final /* synthetic */ int a;

    public /* synthetic */ mon(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:61|62|63)|(12:102|103|104|(10:68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(2:82|(1:84)))|85|86|87|(1:89)(1:98)|90|91|93|94)(1:65)|66|(0)|85|86|87|(0)(0)|90|91|93|94|59) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:61|62|63|(12:102|103|104|(10:68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(2:82|(1:84)))|85|86|87|(1:89)(1:98)|90|91|93|94)(1:65)|66|(0)|85|86|87|(0)(0)|90|91|93|94|59) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0230, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0231, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().d(r2.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0248, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0242  */
    @Override // com.google.android.gms.internal.ads.zzbqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Map map) {
        JSONObject zzc;
        JSONObject zzd;
        int i;
        boolean z;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        Intent parseUri;
        int i2 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                zzclm zzclmVar = (zzclm) obj;
                WindowManager windowManager = (WindowManager) zzclmVar.getContext().getSystemService("window");
                zzt.zzc();
                DisplayMetrics zzv = zzs.zzv(windowManager);
                int i3 = zzv.widthPixels;
                int i4 = zzv.heightPixels;
                int[] iArr = new int[2];
                HashMap hashMap = new HashMap();
                ((View) zzclmVar).getLocationInWindow(iArr);
                hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
                ljg.s(iArr[1], i3, "yInPixels", "windowWidthInPixels", hashMap);
                hashMap.put("windowHeightInPixels", Integer.valueOf(i4));
                zzclmVar.n("locationReady", hashMap);
                int i5 = zze.zza;
                zzo.zzi("GET LOCATION COMPILED");
                return;
            case 1:
                zzclm zzclmVar2 = (zzclm) obj;
                zzbmi z3 = zzclmVar2.z();
                if (z3 == null || (zzc = z3.zzc()) == null) {
                    zzclmVar2.t("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    zzclmVar2.t("nativeAdViewSignalsReady", zzc);
                    return;
                }
            case 2:
                zzclm zzclmVar3 = (zzclm) obj;
                zzbmi z4 = zzclmVar3.z();
                if (z4 == null || (zzd = z4.zzd()) == null) {
                    zzclmVar3.t("nativeClickMetaReady", new JSONObject());
                    return;
                } else {
                    zzclmVar3.t("nativeClickMetaReady", zzd);
                    return;
                }
            case 3:
                zzclm zzclmVar4 = (zzclm) obj;
                zzt.zzt().zza(zzclmVar4, zzclmVar4.getContext());
                return;
            case 4:
                zzclm zzclmVar5 = (zzclm) obj;
                if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
                    zze.zza("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                bgo bgoVar = new bgo();
                bgoVar.c = 8388691;
                byte b2 = (byte) (bgoVar.g | 1);
                bgoVar.d = -1.0f;
                bgoVar.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
                bgoVar.b = (String) map.get("appId");
                bgoVar.e = zzclmVar5.getWidth();
                bgoVar.g = (byte) (bgoVar.g | 32);
                IBinder windowToken = zzclmVar5.zzE().getWindowToken();
                if (windowToken == null) {
                    yhk.s("Null windowToken");
                    return;
                }
                bgoVar.a = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    bgoVar.c = Integer.parseInt((String) map.get("gravityY")) | Integer.parseInt((String) map.get("gravityX"));
                    bgoVar.g = (byte) (bgoVar.g | 1);
                } else {
                    bgoVar.c = 81;
                    bgoVar.g = (byte) (bgoVar.g | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    bgoVar.d = Float.parseFloat((String) map.get("verticalMargin"));
                    bgoVar.g = (byte) (bgoVar.g | 2);
                } else {
                    bgoVar.d = 0.02f;
                    bgoVar.g = (byte) (bgoVar.g | 2);
                }
                if (map.containsKey("enifd")) {
                    bgoVar.f = (String) map.get("enifd");
                }
                try {
                    zzt.zzt().zzc(zzclmVar5, bgoVar.a());
                    return;
                } catch (NullPointerException e2) {
                    zzt.zzh().d("DefaultGmsgHandlers.ShowLMDOverlay", e2);
                    zze.zza("Missing parameters for LMD Overlay show request");
                    return;
                }
            case 5:
                zzt.zzt().zzd();
                return;
            case 6:
                zzt.zzt().zze();
                return;
            case 7:
                zzt.zzt().zzf();
                return;
            case 8:
                zzclm zzclmVar6 = (zzclm) obj;
                try {
                    zzgdn f2 = zzgdn.f(zzclmVar6.getContext());
                    f2.getClass();
                    synchronized (zzgdn.class) {
                        f2.c(false);
                    }
                    zzgdo.f(zzclmVar6.getContext()).g();
                    zzgdp.a(zzclmVar6.getContext()).b();
                    return;
                } catch (IOException e3) {
                    zzt.zzh().d("DefaultGmsgHandlers.ResetPaid", e3);
                    return;
                }
            case 9:
                zzclm zzclmVar7 = (zzclm) obj;
                try {
                    String str = (String) map.get("enabled");
                    mon monVar = zzbqg.a;
                    if (zzgts.d(str, "true") || zzgts.d(str, "false")) {
                        zzgdk a = zzgdk.a(zzclmVar7.getContext());
                        boolean parseBoolean = Boolean.parseBoolean(str);
                        synchronized (zzgdk.class) {
                            a.a.h(Boolean.valueOf(parseBoolean), "paidv2_user_option");
                        }
                        return;
                    }
                    return;
                } catch (IOException e4) {
                    zzt.zzh().d("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e4);
                    return;
                }
            case 10:
                zzclm zzclmVar8 = (zzclm) obj;
                try {
                    JSONObject jSONObject = new JSONObject((String) map.get("args"));
                    Iterator<String> keys = jSONObject.keys();
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzclmVar8.getContext()).edit();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof Integer) {
                            edit.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            edit.putLong(next, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Double) {
                            edit.putFloat(next, ((Double) obj2).floatValue());
                        } else if (obj2 instanceof Float) {
                            edit.putFloat(next, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Boolean) {
                            edit.putBoolean(next, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            edit.putString(next, (String) obj2);
                        }
                    }
                    edit.apply();
                    return;
                } catch (JSONException e5) {
                    zzt.zzh().d("GMSG write local storage KV pairs handler", e5);
                    return;
                }
            case 11:
                zzclm zzclmVar9 = (zzclm) obj;
                try {
                    JSONArray jSONArray = new JSONArray((String) map.get("args"));
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(zzclmVar9.getContext()).edit();
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        edit2.remove(jSONArray.getString(i6));
                    }
                    edit2.apply();
                    return;
                } catch (JSONException e6) {
                    zzt.zzh().d("GMSG clear local storage keys handler", e6);
                    return;
                }
            case 12:
                zzclm zzclmVar10 = (zzclm) obj;
                if (zzclmVar10.B() != null) {
                    zzclmVar10.B().b();
                }
                zzm zzL = zzclmVar10.zzL();
                if (zzL != null) {
                    zzL.zza();
                    return;
                }
                zzm w = zzclmVar10.w();
                if (w != null) {
                    w.zza();
                    return;
                } else {
                    int i7 = zze.zza;
                    zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
            case 13:
                ((zzclm) obj).d0("1".equals(map.get("custom_close")));
                return;
            case 14:
                String valueOf = String.valueOf((String) map.get("string"));
                int i8 = zze.zza;
                zzo.zzh("Received log message: ".concat(valueOf));
                return;
            case 15:
                zzbmi z5 = ((zzclm) obj).z();
                if (z5 != null) {
                    z5.mo12zza();
                    return;
                }
                return;
            case 16:
                ((zzclm) obj).o0(!Boolean.parseBoolean((String) map.get(Y1.e)));
                return;
            case 17:
                zzclm zzclmVar11 = (zzclm) obj;
                String str2 = (String) map.get("action");
                if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str2)) {
                    zzclmVar11.zzdk();
                    return;
                } else {
                    if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equals(str2)) {
                        zzclmVar11.zzdl();
                        return;
                    }
                    return;
                }
            case 18:
                zzclm zzclmVar12 = (zzclm) obj;
                if (map.containsKey("start")) {
                    zzclx zzP = zzclmVar12.zzP();
                    synchronized (zzP.d) {
                    }
                    zzP.D++;
                    zzP.r0();
                    return;
                }
                if (map.containsKey("stop")) {
                    r0.D--;
                    zzclmVar12.zzP().r0();
                    return;
                }
                if (map.containsKey("cancel")) {
                    zzclx zzP2 = zzclmVar12.zzP();
                    zzbif zzbifVar = zzP2.b;
                    if (zzbifVar != null) {
                        zzbifVar.c(10005);
                    }
                    zzP2.C = true;
                    zzP2.n = 10004;
                    zzP2.o = "Page loaded delay cancel.";
                    zzP2.r0();
                    zzP2.a.destroy();
                    return;
                }
                return;
            case 19:
                zzclm zzclmVar13 = (zzclm) obj;
                if (map.containsKey("start")) {
                    zzclmVar13.K(true);
                }
                if (map.containsKey("stop")) {
                    zzclmVar13.K(false);
                    return;
                }
                return;
            case 20:
                zzcmy zzcmyVar = (zzcmy) obj;
                mon monVar2 = zzbqg.a;
                if (!((Boolean) zzba.zzc().a(zzbjg.E9)).booleanValue()) {
                    int i9 = zze.zza;
                    zzo.zzi("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str3 = (String) map.get("package_name");
                if (TextUtils.isEmpty(str3)) {
                    int i10 = zze.zza;
                    zzo.zzi("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                Boolean valueOf2 = Boolean.valueOf(zzcmyVar.getContext().getPackageManager().getLaunchIntentForPackage(str3) != null);
                hashMap2.put(str3, valueOf2);
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13 + valueOf2.toString().length());
                sb.append("/canOpenApp;");
                sb.append(str3);
                sb.append(";");
                sb.append(valueOf2);
                zze.zza(sb.toString());
                ((zzbte) zzcmyVar).n("openableApp", hashMap2);
                return;
            case 21:
                zzcmy zzcmyVar2 = (zzcmy) obj;
                mon monVar3 = zzbqg.a;
                PackageManager packageManager = zzcmyVar2.getContext().getPackageManager();
                try {
                    try {
                        JSONArray jSONArray2 = new JSONObject((String) map.get("data")).getJSONArray("intents");
                        JSONObject jSONObject2 = new JSONObject();
                        int i11 = 0;
                        while (i11 < jSONArray2.length()) {
                            try {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                                optString = jSONObject3.optString("id");
                                optString2 = jSONObject3.optString("u");
                                optString3 = jSONObject3.optString(i.a);
                                optString4 = jSONObject3.optString(InneractiveMediationDefs.GENDER_MALE);
                                optString5 = jSONObject3.optString(TtmlNode.TAG_P);
                                z = z2;
                                optString6 = jSONObject3.optString(a.q);
                                optString7 = jSONObject3.optString("intent_url");
                            } catch (JSONException e7) {
                                i = i2;
                                z = z2;
                                int i12 = zze.zza;
                                zzo.zzg("Error parsing the intent data.", e7);
                            }
                            if (TextUtils.isEmpty(optString7)) {
                                i = i2;
                            } else {
                                try {
                                    parseUri = Intent.parseUri(optString7, i2);
                                    i = i2;
                                } catch (URISyntaxException e8) {
                                    String valueOf3 = String.valueOf(optString7);
                                    int i13 = zze.zza;
                                    i = i2;
                                    zzo.zzg("Error parsing the url: ".concat(valueOf3), e8);
                                }
                                if (parseUri == null) {
                                    parseUri = new Intent();
                                    if (!TextUtils.isEmpty(optString2)) {
                                        parseUri.setData(Uri.parse(optString2));
                                    }
                                    if (!TextUtils.isEmpty(optString3)) {
                                        parseUri.setAction(optString3);
                                    }
                                    if (!TextUtils.isEmpty(optString4)) {
                                        parseUri.setType(optString4);
                                    }
                                    if (!TextUtils.isEmpty(optString5)) {
                                        parseUri.setPackage(optString5);
                                    }
                                    if (!TextUtils.isEmpty(optString6)) {
                                        String[] split = optString6.split("/", 2);
                                        if (split.length == 2) {
                                            parseUri.setComponent(new ComponentName(split[i], split[z ? 1 : 0]));
                                        }
                                    }
                                }
                                Intent intent = parseUri;
                                ResolveInfo resolveInfo = packageManager.resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                                jSONObject2.put(optString, resolveInfo == null ? z ? 1 : 0 : i);
                                i11++;
                                z2 = z;
                                i2 = i;
                            }
                            parseUri = null;
                            if (parseUri == null) {
                            }
                            Intent intent2 = parseUri;
                            ResolveInfo resolveInfo2 = packageManager.resolveActivity(intent2, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                            jSONObject2.put(optString, resolveInfo2 == null ? z ? 1 : 0 : i);
                            i11++;
                            z2 = z;
                            i2 = i;
                        }
                        ((zzbte) zzcmyVar2).t("openableIntents", jSONObject2);
                        return;
                    } catch (JSONException unused) {
                        ((zzbte) zzcmyVar2).t("openableIntents", new JSONObject());
                        return;
                    }
                } catch (JSONException unused2) {
                    ((zzbte) zzcmyVar2).t("openableIntents", new JSONObject());
                    return;
                }
            case 22:
                zzcmy zzcmyVar3 = (zzcmy) obj;
                mon monVar4 = zzbqg.a;
                String str4 = (String) map.get("u");
                if (str4 == null) {
                    int i14 = zze.zza;
                    zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                } else if (((Boolean) zzba.zzc().a(zzbjg.g)).booleanValue() && str4.isEmpty()) {
                    int i15 = zze.zza;
                    zzo.zzi("URL is empty from httpTrack GMSG.");
                    return;
                } else {
                    zzcld zzcldVar = (zzcld) zzcmyVar3;
                    new zzbt(zzcmyVar3.getContext(), ((zzcng) zzcmyVar3).zzs().afmaVersion, str4, null, zzcldVar.e() != null ? zzcldVar.e().x0 : null).zzb();
                    return;
                }
            case 23:
                zzcnf zzcnfVar = (zzcnf) obj;
                mon monVar5 = zzbqg.a;
                String str5 = (String) map.get("tx");
                String str6 = (String) map.get("ty");
                String str7 = (String) map.get("td");
                try {
                    int parseInt = Integer.parseInt(str5);
                    int parseInt2 = Integer.parseInt(str6);
                    int parseInt3 = Integer.parseInt(str7);
                    zzbbd p = zzcnfVar.p();
                    if (p != null) {
                        p.b.zze(parseInt, parseInt2, parseInt3);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    int i16 = zze.zza;
                    zzo.zzi("Could not parse touch parameters from gmsg.");
                    return;
                }
            case 24:
                zzcmy zzcmyVar4 = (zzcmy) obj;
                mon monVar6 = zzbqg.a;
                String str8 = (String) map.get("urls");
                if (TextUtils.isEmpty(str8)) {
                    int i17 = zze.zza;
                    zzo.zzi("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] split2 = str8.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                HashMap hashMap3 = new HashMap();
                PackageManager packageManager2 = zzcmyVar4.getContext().getPackageManager();
                for (String str9 : split2) {
                    String[] split3 = str9.split(";", 2);
                    Boolean valueOf4 = Boolean.valueOf(packageManager2.resolveActivity(new Intent(split3.length > 1 ? split3[1].trim() : "android.intent.action.VIEW", Uri.parse(split3[0].trim())), C.DEFAULT_BUFFER_SEGMENT_SIZE) != null);
                    hashMap3.put(str9, valueOf4);
                    StringBuilder sb2 = new StringBuilder(str9.length() + 14 + valueOf4.toString().length());
                    sb2.append("/canOpenURLs;");
                    sb2.append(str9);
                    sb2.append(";");
                    sb2.append(valueOf4);
                    zze.zza(sb2.toString());
                }
                ((zzbte) zzcmyVar4).n("openableURLs", hashMap3);
                return;
            default:
                int i18 = zze.zza;
                zzo.zzd("Show native ad policy validator overlay.");
                ((zzclm) obj).zzE().setVisibility(0);
                return;
        }
    }
}
