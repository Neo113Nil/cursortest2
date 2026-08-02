package ig;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public abstract class p implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f66452a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f66452a = Collections.unmodifiableMap(hashMap);
    }

    p() {
        if (getClass() != q.class && getClass() != r.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static p e(String str) {
        if (str.equals("Z")) {
            return q.f66455f;
        }
        if (str.length() == 1) {
            throw new C7073b("Invalid zone: ".concat(str));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return q.l(str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            q qVar = q.f66455f;
            qVar.getClass();
            return new r(str, ng.f.h(qVar));
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            q l11 = q.l(str.substring(3));
            if (l11.i() == 0) {
                return new r(str.substring(0, 3), ng.f.h(l11));
            }
            return new r(str.substring(0, 3) + l11.a(), ng.f.h(l11));
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return r.h(str, true);
        }
        q l12 = q.l(str.substring(2));
        if (l12.i() == 0) {
            return new r("UT", ng.f.h(l12));
        }
        return new r("UT" + l12.a(), ng.f.h(l12));
    }

    public static p f() {
        String id2 = TimeZone.getDefault().getID();
        lg.c.e(id2, "zoneId");
        Map<String, String> map = f66452a;
        lg.c.e(map, "aliasMap");
        String str = map.get(id2);
        if (str != null) {
            id2 = str;
        }
        return e(id2);
    }

    public abstract String a();

    public abstract ng.f b();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return a().equals(((p) obj).a());
        }
        return false;
    }

    abstract void g(ObjectOutput objectOutput) throws IOException;

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a();
    }
}
