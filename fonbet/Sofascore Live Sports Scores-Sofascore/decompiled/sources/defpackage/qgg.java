package defpackage;

import com.ironsource.Nf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qgg implements pgg {
    public final rag a;
    public final ngg b;
    public final Function0 c;
    public String d;
    public long e;
    public hbg f;
    public String g;
    public String h;
    public Map i;
    public Long j;
    public Long k;
    public Long l;
    public Long m;
    public Long n;
    public Long o;
    public Map p;
    public rag q;
    public String r;
    public meg s;
    public mgg t;

    public qgg(rag ragVar, qcg qcgVar, wib wibVar) {
        ngg nggVar = new ngg(qcgVar, wibVar);
        u9g u9gVar = new u9g(17);
        wibVar.getClass();
        this.a = ragVar;
        this.b = nggVar;
        this.c = u9gVar;
        this.d = "";
        this.e = -1L;
        this.q = rag.UNKNOWN;
        this.t = mgg.UNKNOWN;
    }

    public final void a(hbg hbgVar, String str, Map map) {
        hbgVar.getClass();
        map.getClass();
        this.j = (Long) this.c.invoke();
        this.f = hbgVar;
        this.h = str;
        this.i = map;
    }

    public final void b(wjg wjgVar, long j, String str) {
        str.getClass();
        ngg nggVar = this.b;
        synchronized (nggVar) {
            try {
                if (wjgVar != null) {
                    String str2 = wjgVar.a;
                    if (str2 != null && !str2.isEmpty()) {
                        nggVar.d = str2;
                    }
                    nggVar.i = wjgVar.b;
                    LinkedHashMap linkedHashMap = wjgVar.c;
                    Integer num = (Integer) linkedHashMap.get(bkg.DEBUG);
                    nggVar.e = num != null ? num.intValue() : -1;
                    Integer num2 = (Integer) linkedHashMap.get(bkg.INFO);
                    nggVar.f = num2 != null ? num2.intValue() : -1;
                    Integer num3 = (Integer) linkedHashMap.get(bkg.WARNING);
                    nggVar.g = num3 != null ? num3.intValue() : -1;
                    Integer num4 = (Integer) linkedHashMap.get(bkg.ERROR);
                    nggVar.h = num4 != null ? num4.intValue() : -1;
                } else {
                    nggVar.i = bkg.NONE;
                    nggVar.e = -1;
                    nggVar.f = -1;
                    nggVar.g = -1;
                    nggVar.h = -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = str;
        this.e = j;
    }

    public final ArrayList c(ijg... ijgVarArr) {
        ArrayList Z = ph0.Z(ijgVarArr);
        meg megVar = this.s;
        if (megVar != null && this.t == mgg.MEDIATION) {
            Z.add(megVar);
        }
        return Z;
    }

    public final void d(String str, boolean z) {
        str.getClass();
        long longValue = ((Number) this.c.invoke()).longValue();
        this.k = Long.valueOf(longValue);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = this.j;
        if (l != null) {
            linkedHashMap.put("response_time", Long.valueOf(longValue - l.longValue()));
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        linkedHashMap.put("response_size", Integer.valueOf(bytes.length));
        meg megVar = new meg(linkedHashMap);
        mgg mggVar = z ? mgg.NOAD : mgg.AD_RESPONSE;
        this.g = str;
        ArrayList c = c(megVar);
        String str2 = this.d;
        ngg nggVar = this.b;
        ckg a = nggVar.a("Ad call response", bkg.INFO, "ad_call_response", str2, c);
        if (a != null) {
            nggVar.e(a, this.e, this.f, this.a, this.q, this.p, this.r, mggVar, false);
        }
    }

    public final void e(Exception exc) {
        String obj = exc.toString();
        String str = this.g;
        String str2 = this.h;
        Map map = this.i;
        ArrayList c = c(new meg(obj, str, str2, map != null ? yfa.O(map) : null));
        String str3 = this.d;
        ngg nggVar = this.b;
        ckg a = nggVar.a("Ad loading error", bkg.ERROR, "ad_loading_error", str3, c);
        if (a != null) {
            nggVar.e(a, this.e, this.f, this.a, this.q, this.p, this.r, this.t, false);
        }
    }

    public final void f(Exception exc) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = this.j;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.k;
            if (l2 != null) {
                linkedHashMap.put("response_time", Long.valueOf(l2.longValue() - longValue));
            }
        }
        meg megVar = new meg(linkedHashMap);
        String obj = exc.toString();
        String str = this.g;
        String str2 = this.h;
        Map map = this.i;
        ArrayList c = c(new meg(obj, str, str2, map != null ? yfa.O(map) : null), megVar);
        String str3 = this.d;
        ngg nggVar = this.b;
        ckg a = nggVar.a("Ad loading timeout", bkg.WARNING, "ad_loading_timeout", str3, c);
        if (a != null) {
            nggVar.e(a, this.e, this.f, this.a, this.q, this.p, this.r, this.t, false);
        }
    }

    public final void g() {
        Function0 function0 = this.c;
        this.n = Long.valueOf(((Number) function0.invoke()).longValue());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = this.m;
        if (l != null) {
            linkedHashMap.put("delay_between_load_and_show", Long.valueOf(((Number) function0.invoke()).longValue() - l.longValue()));
        }
        ArrayList c = c(new meg(linkedHashMap));
        String str = this.d;
        ngg nggVar = this.b;
        ckg a = nggVar.a("Ad shown", bkg.INFO, "ad_shown", str, c);
        if (a != null) {
            nggVar.e(a, this.e, this.f, this.a, this.q, this.p, this.r, this.t, false);
        }
    }

    public final void h(keg kegVar, String str, long j) {
        leg[] legVarArr = leg.a;
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = this.o;
        if (l != null) {
            linkedHashMap.put("media_loading_time", Long.valueOf(((Number) this.c.invoke()).longValue() - l.longValue()));
        }
        ijg megVar = new meg(linkedHashMap);
        meg megVar2 = new meg(0);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("type", 0);
            hashMap.put("container", Integer.valueOf(kegVar.a));
            hashMap.put("url", str);
            hashMap.put("bitrate", -1L);
            hashMap.put("width", -1L);
            hashMap.put("height", -1L);
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
            JSONObject f0 = hkg.f0(hashMap);
            if (f0.length() > 0) {
                megVar2.b = f0;
            }
        } catch (JSONException e) {
            jeg jegVar = jeg.d;
            e.toString();
            jegVar.f(1);
        }
        ArrayList c = c(megVar, megVar2);
        String str2 = this.d;
        ngg nggVar = this.b;
        ckg a = nggVar.a("Media info", bkg.INFO, "media_info", str2, c);
        if (a != null) {
            nggVar.e(a, this.e, this.f, this.a, this.q, this.p, this.r, this.t, false);
        }
    }

    public final void i(IllegalArgumentException illegalArgumentException, String str, String str2, int i) {
        if (i == 0) {
            throw null;
        }
        meg megVar = new meg(str, str2, i);
        String valueOf = String.valueOf(illegalArgumentException);
        String str3 = this.g;
        String str4 = this.h;
        Map map = this.i;
        ArrayList c = c(megVar, new meg(valueOf, str3, str4, map != null ? yfa.O(map) : null));
        String str5 = this.d;
        ngg nggVar = this.b;
        ckg a = nggVar.a("Open Measurement API Error", bkg.ERROR, "om_api_error", str5, c);
        if (a != null) {
            nggVar.e(a, this.e, this.f, this.a, this.q, this.p, this.r, this.t, false);
        }
    }

    public final void j(String str, String str2) {
        ArrayList c = c(new meg(str, str2, 1));
        String str3 = this.d;
        ngg nggVar = this.b;
        ckg a = nggVar.a("Open Measurement Interface Definition info", bkg.DEBUG, "omid_info", str3, c);
        if (a != null) {
            nggVar.e(a, this.e, this.f, this.a, this.q, this.p, this.r, this.t, false);
        }
    }

    public final void k(ogg oggVar) {
        meg megVar;
        if (oggVar != null) {
            String str = oggVar.a;
            String str2 = oggVar.b;
            String str3 = oggVar.c;
            String str4 = oggVar.d;
            w1l.y(str, str2, str3, str4);
            megVar = new meg(1);
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("sdkName", str);
                hashMap.put("sdkVersion", str2);
                hashMap.put(Nf.b, str3);
                hashMap.put("adapterClassname", str4);
                JSONObject f0 = hkg.f0(hashMap);
                if (f0.length() > 0) {
                    megVar.b = f0;
                }
            } catch (JSONException e) {
                jeg jegVar = jeg.d;
                e.toString();
                jegVar.f(1);
            }
        } else {
            megVar = null;
        }
        this.s = megVar;
    }
}
