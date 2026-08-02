package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.core.fid.Constants;
import defpackage.m38;
import defpackage.n38;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzao implements zzd {
    public final Application a;
    public final zzaq b;
    public final zzl c;
    public final Executor d;

    public zzao(Application application, zzaq zzaqVar, zzl zzlVar, Executor executor) {
        this.a = application;
        this.b = zzaqVar;
        this.d = executor;
        this.c = zzlVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x01d0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(String str, JSONObject jSONObject) {
        zzaq zzaqVar;
        HashMap hashMap;
        HashMap hashMap2;
        String str2;
        String str3;
        String str4;
        int intValue;
        String str5;
        Integer num;
        Object obj;
        Object obj2;
        int hashCode = str.hashCode();
        Application application = this.a;
        r6 = false;
        boolean z = false;
        int i = 1;
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                zzcv zzcvVar = new zzcv(application);
                Iterator<String> keys = jSONObject.keys();
                while (true) {
                    boolean hasNext = keys.hasNext();
                    zzaqVar = this.b;
                    hashMap = zzcvVar.c;
                    hashMap2 = zzcvVar.a;
                    if (!hasNext) {
                        break;
                    }
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    String.valueOf(opt);
                    Context context = zzcvVar.b;
                    zzcu a = zzcw.a(context, next);
                    if (a != null) {
                        String str6 = a.b;
                        String str7 = a.a;
                        if (!hashMap.containsKey(str7)) {
                            hashMap.put(str7, context.getSharedPreferences(str7, 0).edit());
                        }
                        SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap.get(str7);
                        if (opt instanceof Integer) {
                            Integer num2 = (Integer) opt;
                            editor.putInt(str6, num2.intValue());
                            if (zzcv.d.contains(str6)) {
                                hashMap2.put(str6, num2);
                            }
                        } else if (opt instanceof Long) {
                            editor.putLong(str6, ((Long) opt).longValue());
                        } else if (opt instanceof Double) {
                            editor.putFloat(str6, ((Double) opt).floatValue());
                        } else if (opt instanceof Float) {
                            editor.putFloat(str6, ((Float) opt).floatValue());
                        } else if (opt instanceof Boolean) {
                            editor.putBoolean(str6, ((Boolean) opt).booleanValue());
                        } else if (opt instanceof String) {
                            editor.putString(str6, (String) opt);
                        }
                        zzaqVar.c.add(next);
                    }
                    "Failed writing key: ".concat(String.valueOf(next));
                }
                zzaqVar.b.edit().putStringSet("written_values", zzaqVar.c).commit();
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((SharedPreferences.Editor) it.next()).commit();
                }
                if (hashMap2.size() <= 1) {
                    return true;
                }
                zzl zzlVar = this.c;
                zzam zzamVar = zzlVar.a;
                AtomicReference atomicReference = zzamVar.g;
                AtomicReference atomicReference2 = zzamVar.f;
                AtomicReference atomicReference3 = zzamVar.e;
                AtomicReference atomicReference4 = zzamVar.d;
                AtomicReference atomicReference5 = zzamVar.c;
                AtomicReference atomicReference6 = zzamVar.b;
                if (atomicReference.get() != null) {
                    z = ((Boolean) atomicReference.get()).booleanValue();
                } else {
                    Context context2 = zzamVar.a;
                    if (context2 == null) {
                        atomicReference.set(Boolean.FALSE);
                    } else {
                        try {
                            atomicReference6.set(FirebaseAnalytics.class.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context2));
                            atomicReference5.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
                            Method declaredMethod = m38.class.getDeclaredMethod("valueOf", String.class);
                            Method declaredMethod2 = n38.class.getDeclaredMethod("valueOf", String.class);
                            atomicReference4.set(declaredMethod);
                            atomicReference3.set(declaredMethod2);
                            atomicReference.set(Boolean.TRUE);
                            z = true;
                        } catch (Exception unused) {
                            atomicReference.set(Boolean.FALSE);
                        }
                    }
                }
                if (z) {
                    Context context3 = zzlVar.b;
                    if (atomicReference2.get() == null) {
                        try {
                            atomicReference2.set(Wrappers.a(context3).a(128, context3.getPackageName()).metaData);
                        } catch (PackageManager.NameNotFoundException | NullPointerException unused2) {
                        }
                    }
                    String str8 = "IABTCF_gdprApplies";
                    Integer num3 = (Integer) hashMap2.get("IABTCF_gdprApplies");
                    HashMap hashMap3 = new HashMap();
                    for (String str9 : hashMap2.keySet()) {
                        if (!str9.equals(str8)) {
                            switch (str9.hashCode()) {
                                case -1926457382:
                                    if (str9.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) {
                                        str2 = "google_analytics_default_allow_ad_personalization_signals";
                                        str3 = "AD_PERSONALIZATION";
                                        intValue = ((Integer) hashMap2.get(str9)).intValue();
                                        str5 = str8;
                                        if (intValue == i) {
                                            num = num3;
                                            if (intValue == 2) {
                                                hashMap3.put(str3, "DENIED");
                                            } else if (intValue == 5) {
                                                if (atomicReference2.get() != null && (obj2 = ((Bundle) atomicReference2.get()).get(str2)) != null) {
                                                    if (obj2 instanceof Boolean) {
                                                        obj = (Boolean) obj2;
                                                    } else if (obj2 instanceof String) {
                                                        obj = (String) obj2;
                                                    }
                                                    if (obj != null) {
                                                        if (obj instanceof Boolean) {
                                                            hashMap3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                                        } else if ((obj instanceof String) && obj.equals("eu_consent_policy") && ((str3.equals("AD_PERSONALIZATION") || str3.equals("AD_USER_DATA")) && num != null)) {
                                                            hashMap3.put(str3, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                                        }
                                                    }
                                                }
                                                obj = null;
                                                if (obj != null) {
                                                }
                                            }
                                            str8 = str5;
                                            num3 = num;
                                            break;
                                        } else {
                                            hashMap3.put(str3, "GRANTED");
                                            str8 = str5;
                                            break;
                                        }
                                    }
                                    str5 = str8;
                                    num = num3;
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                case -142866440:
                                    if (str9.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                        str2 = "google_analytics_default_allow_analytics_storage";
                                        str4 = "ANALYTICS_STORAGE";
                                        str3 = str4;
                                        intValue = ((Integer) hashMap2.get(str9)).intValue();
                                        str5 = str8;
                                        if (intValue == i) {
                                        }
                                    }
                                    str5 = str8;
                                    num = num3;
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                case 1068702385:
                                    if (str9.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                        str2 = "google_analytics_default_allow_ad_storage";
                                        str4 = "AD_STORAGE";
                                        str3 = str4;
                                        intValue = ((Integer) hashMap2.get(str9)).intValue();
                                        str5 = str8;
                                        if (intValue == i) {
                                        }
                                    }
                                    str5 = str8;
                                    num = num3;
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                case 1479307131:
                                    if (str9.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                        str2 = "google_analytics_default_allow_ad_user_data";
                                        str3 = "AD_USER_DATA";
                                        intValue = ((Integer) hashMap2.get(str9)).intValue();
                                        str5 = str8;
                                        if (intValue == i) {
                                        }
                                    }
                                    str5 = str8;
                                    num = num3;
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                default:
                                    str5 = str8;
                                    num = num3;
                                    str8 = str5;
                                    num3 = num;
                                    break;
                            }
                            i = 1;
                        }
                    }
                    "Update Firebase: ".concat(hashMap3.toString());
                    HashMap hashMap4 = new HashMap();
                    for (String str10 : hashMap3.keySet()) {
                        try {
                            try {
                                hashMap4.put((Enum) ((Method) atomicReference3.get()).invoke(null, str10), (Enum) ((Method) atomicReference4.get()).invoke(null, hashMap3.get(str10)));
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                        }
                    }
                    if (atomicReference5.get() != null && !hashMap4.isEmpty()) {
                        try {
                            ((Method) atomicReference5.get()).invoke(atomicReference6.get(), hashMap4);
                        } catch (Exception unused5) {
                        }
                    }
                }
                hashMap2.clear();
                return true;
            }
        } else if (str.equals("clear")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString()));
                return true;
            }
            HashSet hashSet = new HashSet();
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    hashSet.add(optString);
                }
            }
            zzcw.b(application, hashSet);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.d;
    }
}
