package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.mz1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ঽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0558 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final C0298 f1829;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final C0643 f1830;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final C0972 f1831;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final String f1832;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public volatile C0527 f1833;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1828 = StringFog.decrypt("ViVL2mJjwu9nB0TaZmfT8g==\n", "FUoltAcAtoA=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1827 = StringFog.decrypt("R6rFeJ9nlg==\n", "AuSEOtMi0vk=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AtomicBoolean f1842 = new AtomicBoolean(false);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f1841 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public volatile ArrayList f1840 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f1839 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap f1838 = new HashMap();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final HashMap f1837 = new HashMap();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final C0306 f1836 = new C0306();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public C0950 f1835 = C0950.m562();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public HashMap f1834 = new HashMap();

    static {
        StringFog.decrypt("mDuSrPwsHKo=\n", "3HLB7b5gWe4=\n");
    }

    public C0558(C0643 c0643, C0926 c0926, String str, C0527 c0527, C0972 c0972) {
        this.f1830 = c0643;
        C0298 c0298 = new C0298(AbstractC1008.f3251, c0926);
        this.f1829 = c0298;
        AbstractC0356.f897 = new WeakReference(c0298);
        c0298.f548.add(new C0687(this));
        this.f1832 = str;
        this.f1833 = c0527;
        this.f1831 = c0972;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static ArrayList m357(C0558 c0558) {
        ArrayList arrayList;
        synchronized (c0558) {
            arrayList = c0558.f1839;
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static HashMap m359(C0558 c0558) {
        HashMap hashMap;
        synchronized (c0558) {
            hashMap = c0558.f1838;
        }
        return hashMap;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized boolean m363() {
        return AbstractC0274.m142().mo143();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized void m364() {
        try {
            if (this.f1842.getAndSet(true)) {
                return;
            }
            C0527 c0527 = this.f1833;
            AbstractC1008.m614(new C0670(this));
            if (c0527 != null) {
                AbstractC1008.m610(new C0532(c0527));
            }
            this.f1833 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m365() {
        boolean z;
        if (AbstractC0274.m142().mo145()) {
            z = m363();
        }
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m367() {
        HashMap hashMap;
        try {
            synchronized (this) {
                hashMap = this.f1838;
            }
            return m361(hashMap);
        } catch (JSONException e) {
            String str = f1828;
            AbstractC0420.m252(str, str, StringFog.decrypt("L+zgdQboijEO9/x9VKuEOwT78W4bussjD+zhcxummA==\n", "ap6SGnTI61U=\n"), e, null, false);
            return new JSONObject();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m370(Context context, String str, String str2, AbstractC0706 abstractC0706, AbstractRunnableC0606 abstractRunnableC0606) {
        C0528 c0528;
        HashMap hashMap;
        long j;
        abstractC0706.getClass();
        String mo155 = AbstractC0274.m142().mo155();
        if (((C0346) AbstractC0274.m142()).f857.m354()) {
            String m355 = ((C0346) AbstractC0274.m142()).f857.m355(abstractC0706.mo122());
            if (TextUtils.isEmpty(m355)) {
                c0528 = null;
            } else {
                c0528 = new C0512(StringFog.decrypt("sPmQmBsNvcSh5dE=\n", "05b+9n5uyas=\n") + abstractC0706.mo122(), mo155, m355);
            }
        } else {
            c0528 = new C0528(StringFog.decrypt("1m+BkRmfj5HHc8A=\n", "tQDv/3z8+/4=\n") + abstractC0706.mo122(), mo155);
        }
        if (c0528 == null) {
            AbstractC1008.m614(abstractRunnableC0606);
            return;
        }
        AbstractC0433 mo121 = abstractC0706.mo121();
        String m268 = mo121.m268();
        synchronized (this) {
            hashMap = this.f1838;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0615.f1992, m268);
        } catch (JSONException e) {
            String str3 = f1828;
            AbstractC0420.m252(str3, str3, StringFog.decrypt("sF1snZNoKhOQTmqbjy9pAppBcJeCPCYT1Vl7gJIhJg/VRW2djw==\n", "9S8e8uFISWE=\n"), e, null, false);
        }
        hashMap.put(str2, jSONObject);
        C0527 c0527 = this.f1833;
        if (c0527 != null) {
            AbstractC1008.m610(new C0536(c0527, str2, EnumC0546.f1808));
        }
        C0775 c0775 = new C0775(this, context, this.f1830.m387(c0528, new C0780(this, context, mo121, str, str2, abstractC0706, abstractRunnableC0606)), mo121, str, str2, abstractC0706, abstractRunnableC0606);
        if (!AbstractC0274.m142().mo146()) {
            C0643 c0643 = this.f1830;
            c0643.getClass();
            if (c0643.f2181.m208(c0528.mo291().replace(StringFog.decrypt("0Q==\n", "/s8tCROW0lA=\n"), StringFog.decrypt("hA==\n", "qhE2pP1ceB4=\n"))) != null) {
                j = 0;
                AbstractC1008.m615(c0775, j);
            }
        }
        j = 2000;
        AbstractC1008.m615(c0775, j);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized List m366() {
        return this.f1840;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m368() {
        return this.f1837;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static HashMap m356(C0558 c0558) {
        HashMap hashMap;
        synchronized (c0558) {
            hashMap = c0558.f1837;
        }
        return hashMap;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List m358(C0558 c0558) {
        ArrayList arrayList;
        synchronized (c0558) {
            arrayList = c0558.f1840;
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m360(C0558 c0558, C0845 c0845) {
        c0558.getClass();
        String m268 = c0845.f2789.m268();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0615.f1992, m268);
        } catch (JSONException e) {
            String str = f1828;
            AbstractC0420.m252(str, str, StringFog.decrypt("sF1snZNoKhOQTmqbjy9pAppBcJeCPCYT1Vl7gJIhJg/VRW2djw==\n", "9S8e8uFISWE=\n"), e, null, false);
        }
        try {
            jSONObject.put(AbstractC0615.f1993, c0845.f2792.f3074);
        } catch (JSONException e2) {
            String str2 = f1828;
            AbstractC0420.m252(str2, str2, StringFog.decrypt("Xi9uXw7YRax+PGhZEp8GvXQzclUfjEmsOyt5Qg+RSbA7N29fEg==\n", "G10cMHz4Jt4=\n"), e2, null, false);
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m371(Context context, LinkedHashMap linkedHashMap, C0649 c0649) {
        boolean mo143;
        if (linkedHashMap.size() > 0) {
            String str = (String) linkedHashMap.keySet().iterator().next();
            List list = (List) linkedHashMap.remove(str);
            String mo122 = (list == null || list.isEmpty() || list.get(0) == null) ? null : ((AbstractC0706) list.get(0)).mo122();
            if (mo122 != null) {
                C0527 c0527 = this.f1833;
                if (c0527 != null) {
                    c0527.f1763.put(mo122, new C0543(mo122));
                }
                AbstractC1008.m612(new C0564(this, mo122, context, str, list, linkedHashMap, c0649));
                synchronized (this) {
                    mo143 = AbstractC0274.m142().mo143();
                }
                if (mo143) {
                    return;
                }
                m371(context, linkedHashMap, c0649);
                return;
            }
            m371(context, linkedHashMap, c0649);
            return;
        }
        AbstractC1008.m614(new C0810(c0649));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m373(String str, JSONObject jSONObject) {
        C0527 c0527 = this.f1833;
        if (c0527 != null) {
            AbstractC1008.m610(new C0536(c0527, str, EnumC0546.f1805));
        }
        if (jSONObject != null) {
            try {
                jSONObject.put(StringFog.decrypt("3xXH\n", "u3a0h7YJN3A=\n"), true);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m362(C0558 c0558) {
        synchronized (c0558) {
            try {
                C0527 c0527 = c0558.f1833;
                if (c0527 == null) {
                    return;
                }
                if (c0527.m350(c0558.m365())) {
                    ((C0972) c0558.m369()).adQualitySdkInitSuccess();
                } else {
                    ((C0972) c0558.m369()).adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, StringFog.decrypt("e8GRlvWebSlW2t6H6dB0KUfLkZn1kWcpUY7CgPmTZj9GyMSZ9ok=\n", "Na6x9ZrwA0w=\n"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m374(String str) {
        return this.f1834.containsKey(str) && ((C0909) this.f1834.get(str)).m532(this.f1832);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m361(HashMap hashMap) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            jSONObject2.put(str.toLowerCase(), (JSONObject) hashMap.get(str));
        }
        jSONObject.put(StringFog.decrypt("ghn3OQ==\n", "9GqZSgSWDrg=\n"), jSONObject2);
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m372(String str, List list) {
        ArrayList arrayList;
        if (this.f1842.get()) {
            return;
        }
        if (this.f1840 != null) {
            arrayList = new ArrayList(this.f1840);
        } else {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C0845) it.next()).m514().iterator();
            while (it2.hasNext()) {
                C1102 c1102 = (C1102) it2.next();
                c1102.getClass();
                String o = mz1.o(new StringBuilder(), C1102.f3451, str);
                AbstractC1008.m611(new C0679(c1102, o, list));
                AbstractC1008.m610(new C0644(c1102, o, list));
                try {
                    AbstractC1008.m612(new C0582(new C0626(c1102, o, list)));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m369() {
        return this.f1831;
    }
}
