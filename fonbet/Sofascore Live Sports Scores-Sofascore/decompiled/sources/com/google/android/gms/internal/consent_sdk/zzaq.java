package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaq {
    public static final zzdw d = zzdw.p(4, AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    public final Application a;
    public final SharedPreferences b;
    public final HashSet c;

    public zzaq(Application application) {
        this.a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = sharedPreferences;
        this.c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String str;
        int i = zzdw.c;
        Set<String> stringSet = this.b.getStringSet("stored_info", b.j);
        if (stringSet.isEmpty()) {
            stringSet = d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.a;
            zzcu a = zzcw.a(application, str2);
            if (a == null) {
                "Fetching request info: failed for key: ".concat(String.valueOf(str2));
            } else {
                Object obj = application.getSharedPreferences(a.a, 0).getAll().get(a.b);
                if (obj == null) {
                    "Stored info not exists: ".concat(String.valueOf(str2));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        "Failed to fetch stored info: ".concat(String.valueOf(str2));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }
}
