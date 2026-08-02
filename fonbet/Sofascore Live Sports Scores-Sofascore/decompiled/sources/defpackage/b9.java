package defpackage;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b9 {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public b9(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public static b9 a(Map map) {
        d(map);
        try {
            return new b9((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new a9("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new a9("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    public static void d(Map map) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str = g[i];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a9(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public final hu b(String str) {
        hu huVar = new hu();
        huVar.a = str;
        huVar.m = this.d.getTime();
        huVar.b = this.a;
        huVar.c = this.b;
        String str2 = this.c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        huVar.d = str2;
        huVar.e = this.e;
        huVar.j = this.f;
        return huVar;
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.a);
        hashMap.put("variantId", this.b);
        hashMap.put("triggerEvent", this.c);
        hashMap.put("experimentStartTime", h.format(this.d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f));
        return hashMap;
    }
}
