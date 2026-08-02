package defpackage;

import android.os.Build;
import com.ironsource.Ua;
import com.ironsource.Y1;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ngg extends dkg {
    public final qcg k;
    public final wib l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngg(qcg qcgVar, wib wibVar) {
        super("https://http-intake.logs.datadoghq.eu/v1/input/7980212340a10b0d546fd264c2b6af80?&service=sdk&ddtags=display&ddsource=displaysdk");
        wibVar.getClass();
        this.k = qcgVar;
        this.l = wibVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ckg ckgVar, long j, hbg hbgVar, rag ragVar, rag ragVar2, Map map, String str, mgg mggVar, boolean z) {
        fig figVar;
        b10 b10Var;
        en0 n;
        bjg bjgVar;
        boolean z2;
        String str2;
        String str3;
        ekg p;
        int i;
        boolean z3;
        String str4;
        pp4 m;
        boolean z4;
        int i2;
        int i3;
        qcg qcgVar = this.k;
        fig figVar2 = qcgVar.c;
        b10 b10Var2 = qcgVar.b;
        mggVar.getClass();
        this.l.getClass();
        Boolean bool = Boolean.FALSE;
        meg megVar = new meg(2);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("channelType", Integer.valueOf(mggVar.a));
            hashMap.put("networkId", Long.valueOf(j));
            hashMap.put("inappBidding", Boolean.valueOf(z));
            hashMap.put("timeoutSettings", Long.valueOf(Ua.s));
            if (hbgVar != null) {
                hashMap.put("siteId", 415167L);
                figVar = figVar2;
                b10Var = b10Var2;
                try {
                    hashMap.put("formatId", Long.valueOf(hbgVar.b));
                    hashMap.put("pageId", Long.valueOf(hbgVar.a));
                    String str5 = hbgVar.c;
                    if (str5 != null) {
                        hashMap.put("target", str5);
                    }
                    hashMap.put("sdaUsed", bool);
                    hashMap.put("sdcUsed", bool);
                    hashMap.put("supplyChainObject", Y1.f);
                } catch (JSONException e) {
                    e = e;
                    jeg jegVar = jeg.d;
                    e.toString();
                    jegVar.f(1);
                    bjg bjgVar2 = bjg.GPP_V_UNKNOWN;
                    n = b10Var.n();
                    String str6 = "";
                    if (n == null) {
                    }
                    p = b10Var.p();
                    if (p == null) {
                    }
                    int i4 = i;
                    m = b10Var.m();
                    if (m == null) {
                    }
                    String str7 = str6;
                    String str8 = (String) qcgVar.a.b;
                    String str9 = (String) figVar.b;
                    String str10 = (String) figVar.c;
                    String str11 = (String) figVar.d;
                    String str12 = Build.MODEL;
                    String str13 = Build.VERSION.RELEASE;
                    b10 b10Var3 = b10Var;
                    b(ckgVar, b.j(megVar, new meg(str8, str9, str10, str11, b10Var3.b, Boolean.valueOf(b10Var3.t()), str2, str3, bjgVar, Boolean.valueOf(z2), str4, Boolean.valueOf(z3), i4, str7, Boolean.valueOf(z4), i2, qha.B().a, 1, !hkg.c ? zig.DEVICE_TYPE_TV : zig.DEVICE_TYPE_MOBILE, figVar.a)));
                }
            } else {
                figVar = figVar2;
                b10Var = b10Var2;
            }
            if (ragVar != null) {
                hashMap.put("expectedFormatType", Integer.valueOf(ragVar.a));
            }
            if (ragVar2 != null) {
                i3 = ragVar2.a;
            } else {
                fff fffVar = mgg.b;
                i3 = -1;
            }
            hashMap.put("templateFormatType", Integer.valueOf(i3));
            if (map != null) {
                Object obj = map.get("insertionId");
                String str14 = obj instanceof String ? (String) obj : null;
                if (str14 != null) {
                    hashMap.put("insertionId", str14);
                }
                Object obj2 = map.get("templateId");
                String str15 = obj2 instanceof String ? (String) obj2 : null;
                if (str15 != null) {
                    hashMap.put("templateId", str15);
                }
                Object obj3 = map.get("rtb");
                Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map2 != null) {
                    hashMap.put("rtb", new JSONObject(map2));
                    fff fffVar2 = mgg.b;
                    hashMap.put("channelType", 2);
                }
            }
            hashMap.put("adAdapterClassName", str == null ? "unknown" : str);
            JSONObject f0 = hkg.f0(hashMap);
            if (f0.length() > 0) {
                megVar.b = f0;
            }
        } catch (JSONException e2) {
            e = e2;
            figVar = figVar2;
            b10Var = b10Var2;
        }
        bjg bjgVar22 = bjg.GPP_V_UNKNOWN;
        n = b10Var.n();
        String str62 = "";
        if (n == null) {
            String str16 = (String) n.c;
            String str17 = (String) n.d;
            bjg bjgVar3 = (bjg) n.e;
            z2 = n.b;
            str2 = str16;
            str3 = str17;
            bjgVar = bjgVar3;
        } else {
            bjgVar = bjgVar22;
            z2 = false;
            str2 = "";
            str3 = str2;
        }
        p = b10Var.p();
        if (p == null) {
            String str18 = (String) p.d;
            z3 = p.a;
            i = p.c;
            str4 = str18;
        } else {
            i = 3;
            z3 = false;
            str4 = "";
        }
        int i42 = i;
        m = b10Var.m();
        if (m == null) {
            str62 = (String) m.d;
            z4 = m.b;
            i2 = m.c;
        } else {
            z4 = false;
            i2 = 2;
        }
        String str72 = str62;
        String str82 = (String) qcgVar.a.b;
        String str92 = (String) figVar.b;
        String str102 = (String) figVar.c;
        String str112 = (String) figVar.d;
        String str122 = Build.MODEL;
        String str132 = Build.VERSION.RELEASE;
        b10 b10Var32 = b10Var;
        b(ckgVar, b.j(megVar, new meg(str82, str92, str102, str112, b10Var32.b, Boolean.valueOf(b10Var32.t()), str2, str3, bjgVar, Boolean.valueOf(z2), str4, Boolean.valueOf(z3), i42, str72, Boolean.valueOf(z4), i2, qha.B().a, 1, !hkg.c ? zig.DEVICE_TYPE_TV : zig.DEVICE_TYPE_MOBILE, figVar.a)));
    }
}
