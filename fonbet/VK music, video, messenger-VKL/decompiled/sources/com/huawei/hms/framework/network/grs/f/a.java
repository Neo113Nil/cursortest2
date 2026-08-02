package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class a {
    protected com.huawei.hms.framework.network.grs.local.model.a a;
    protected List<com.huawei.hms.framework.network.grs.local.model.b> b;
    protected boolean c = false;
    protected boolean d = false;
    protected Set<String> e = new HashSet(16);

    private int b(String str, Context context) {
        if (h(com.huawei.hms.framework.network.grs.h.c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    private int h(String str) {
        int c;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.d && (c = c(str)) != 0) {
            return c;
        }
        int b = b(str);
        return b != 0 ? b : g(str);
    }

    private int i(String str) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        int e;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.d || !((list = this.b) == null || list.isEmpty()) || (e = e(str)) == 0) ? f(str) : e;
    }

    public int a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand(DomExceptionUtils.SEPARATOR));
        sb.append(str);
        return b(sb.toString(), context) != 0 ? -1 : 0;
    }

    public abstract int b(String str);

    public abstract int c(String str);

    public Set<String> c() {
        return this.e;
    }

    public boolean d() {
        return this.c;
    }

    public int e(String str) {
        JSONArray jSONArray;
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.b.addAll(a(jSONArray));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public int f(String str) {
        try {
            b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public abstract int g(String str);

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> a = a(context, aVar, grsBaseInfo, str, z);
        if (a != null) {
            return a.get(str2);
        }
        Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    public com.huawei.hms.framework.network.grs.local.model.a b() {
        return this.a;
    }

    public boolean d(String str) {
        String str2;
        try {
            this.a = new com.huawei.hms.framework.network.grs.local.model.a();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("name")) {
                this.a.b(jSONObject.getString("name"));
            }
            if (jSONObject.has("cacheControl")) {
                this.a.a(jSONObject.getLong("cacheControl"));
            }
            if (jSONObject.has("services")) {
                b(jSONObject.getJSONArray("services"));
            }
            if (jSONObject.has("countryGroups")) {
                JSONArray jSONArray = jSONObject.getJSONArray("countryGroups");
                ArrayList arrayList = new ArrayList(16);
                this.b = arrayList;
                arrayList.addAll(a(jSONArray));
            }
            Logger.i("AbstractLocalManager", "parse from sp services size : %d, countryGroups size: %d:", Integer.valueOf(this.e.size()), Integer.valueOf(this.b.size()));
            return true;
        } catch (JSONException unused) {
            str2 = "Parse local config from sp failed, JSONException";
            Logger.w("AbstractLocalManager", str2);
            return false;
        } catch (Throwable th) {
            str2 = "Parse local config from sp failed, Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.w("AbstractLocalManager", str2);
            return false;
        }
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> list = this.b;
        if (list != null && !list.isEmpty()) {
            for (com.huawei.hms.framework.network.grs.local.model.b bVar : this.b) {
                if (bVar.a().contains(str)) {
                    return bVar.b();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(JSONArray jSONArray) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        String str;
        Iterator<String> keys;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            com.huawei.hms.framework.network.grs.local.model.c cVar = new com.huawei.hms.framework.network.grs.local.model.c();
            String string = jSONObject.getString("name");
            cVar.b(string);
            if (!this.e.contains(string)) {
                this.e.add(string);
                if (this.d) {
                    cVar.c(jSONObject.getString("routeBy"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("servings");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i2);
                        com.huawei.hms.framework.network.grs.local.model.d dVar = new com.huawei.hms.framework.network.grs.local.model.d();
                        String str2 = "countryOrAreaGroup";
                        if (!jSONObject2.has("countryOrAreaGroup")) {
                            str2 = "countryGroup";
                            if (!jSONObject2.has("countryGroup")) {
                                Logger.v("AbstractLocalManager", "maybe this service{%s} routeBy is unconditional.", string);
                                str = "no-country";
                                dVar.a(str);
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("addresses");
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                                keys = jSONObject3.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    String string2 = jSONObject3.getString(next);
                                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                        concurrentHashMap.put(next, jSONObject3.getString(next));
                                    }
                                }
                                dVar.a(concurrentHashMap);
                                cVar.a(dVar.b(), dVar);
                            }
                        }
                        str = jSONObject2.getString(str2);
                        dVar.a(str);
                        JSONObject jSONObject32 = jSONObject2.getJSONObject("addresses");
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(16);
                        keys = jSONObject32.keys();
                        while (keys.hasNext()) {
                        }
                        dVar.a(concurrentHashMap2);
                        cVar.a(dVar.b(), dVar);
                    }
                    String str3 = "countryOrAreaGroups";
                    if (!jSONObject.has("countryOrAreaGroups")) {
                        str3 = "countryGroups";
                        if (!jSONObject.has("countryGroups")) {
                            Logger.i("AbstractLocalManager", "service use default countryOrAreaGroup");
                            list = null;
                            cVar.a(list);
                            if (this.a == null) {
                                this.a = new com.huawei.hms.framework.network.grs.local.model.a();
                            }
                            this.a.a(string, cVar);
                        }
                    }
                    list = a(jSONObject.getJSONArray(str3));
                    cVar.a(list);
                    if (this.a == null) {
                    }
                    this.a.a(string, cVar);
                }
            }
        }
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray) {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
            bVar.b(jSONObject.getString("id"));
            bVar.c(jSONObject.getString("name"));
            bVar.a(jSONObject.getString("description"));
            String str = "countriesOrAreas";
            if (!jSONObject.has("countriesOrAreas")) {
                str = "countries";
                if (!jSONObject.has("countries")) {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
            }
            jSONArray2 = jSONObject.getJSONArray(str);
            HashSet hashSet2 = new HashSet(16);
            if (jSONArray2 != null) {
            }
            return new ArrayList();
        }
        return arrayList;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c a = aVar2.a(str);
        if (a == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String b = e.b(context, aVar, a.b(), grsBaseInfo, z);
        if (b == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", a.b());
            return null;
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> a2 = a.a();
        com.huawei.hms.framework.network.grs.local.model.d a3 = a.a((a2 == null || a2.size() == 0) ? a(b) : a(a2, grsBaseInfo, b).get(b));
        if (a3 == null) {
            return null;
        }
        return a3.a();
    }

    private Map<String, String> a(List<com.huawei.hms.framework.network.grs.local.model.b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }

    public JSONObject a() {
        JSONObject b = this.a.b();
        if (this.b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<com.huawei.hms.framework.network.grs.local.model.b> it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().c());
            }
            b.put("countryGroups", jSONArray);
        }
        return b;
    }

    public void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            Logger.d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                Object[] objArr = {str};
                if (i(com.huawei.hms.framework.network.grs.h.c.a(GrsApp.getInstance().getBrand(DomExceptionUtils.SEPARATOR) + str, context)) == 0) {
                    Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", objArr);
                } else {
                    Logger.w("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", objArr);
                }
            }
        }
    }
}
