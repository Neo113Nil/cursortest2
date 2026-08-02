package com.inmobi.media;

import android.content.Context;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.joa;
import defpackage.ok3;
import defpackage.u9g;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S4 {
    public static final S4 a;
    public static final joa b;
    public static LinkedList c;
    public static LinkedList d;
    public static byte[] e;
    public static String f;

    static {
        S4 s4 = new S4();
        a = s4;
        b = ypa.b(new u9g(16));
        LinkedList linkedList = new LinkedList();
        c = linkedList;
        Object clone = linkedList.clone();
        clone.getClass();
        d = (LinkedList) clone;
        P4 p4 = new P4();
        M4 m4 = new M4();
        C3694q4 c3694q4 = AbstractC3435g4.a;
        e = AbstractC3411f6.a(((SignalsConfig) c3694q4.a(SignalsConfig.class)).getKA());
        List<String> skipFields = c().getContextualData().getSkipFields();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(T4.j);
        arrayList.removeAll(skipFields);
        f = CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            Qa a2 = Pa.a(context, "c_data_store");
            Context context2 = AbstractC3424fj.a;
            if (((SignalsConfig) c3694q4.a(SignalsConfig.class)).getVAK() != (context2 != null ? Pa.a(context2, "c_data_store").a.getInt("akv", 1) : 1)) {
                a2.a("akv", ((SignalsConfig) c3694q4.a(SignalsConfig.class)).getVAK(), false);
                s4.f();
            }
        }
        AbstractC3435g4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, m4);
        AbstractC3435g4.a("signals", p4);
    }

    public static final void a() {
        long currentTimeMillis = System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        a(currentTimeMillis, c().getContextualData().getMaxAdRecords());
        Object clone = c.clone();
        clone.getClass();
        d = (LinkedList) clone;
        ok3.J(new R4(currentTimeMillis, null));
    }

    public static final K4 b() {
        return new K4(AbstractC3750s9.b());
    }

    public static AdConfig c() {
        return (AdConfig) AbstractC3435g4.a.a(AdConfig.class);
    }

    public static String d() {
        if (f.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long currentTimeMillis = System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        LinkedList linkedList = d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C3385e6) obj).b >= currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(StringsKt.l0(((C3385e6) it.next()).a).toString());
        }
        String jSONArray2 = jSONArray.toString();
        jSONArray2.getClass();
        return jSONArray2;
    }

    public static boolean e() {
        boolean z;
        AdConfig.ContextualDataConfig contextualData;
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            z = Pa.a(context, "c_data_store").a.getBoolean("isEnabled", true);
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        AdConfig c2 = c();
        return ((c2 == null || (contextualData = c2.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
    }

    public final void f() {
        synchronized (this) {
            ok3.J(new O4(null));
            LinkedList linkedList = new LinkedList();
            c = linkedList;
            Object clone = linkedList.clone();
            clone.getClass();
            d = (LinkedList) clone;
            Unit unit = Unit.a;
        }
    }

    public final void a(boolean z) {
        Context context = AbstractC3424fj.a;
        if (context == null || z == e()) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa.a(Pa.a(context, "c_data_store"), "isEnabled", z);
        if (z) {
            return;
        }
        f();
    }

    public static void a(long j, int i) {
        for (int size = c.size(); size > i; size--) {
            c.remove();
        }
        Iterator it = c.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            if (((C3385e6) next).b >= j) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
