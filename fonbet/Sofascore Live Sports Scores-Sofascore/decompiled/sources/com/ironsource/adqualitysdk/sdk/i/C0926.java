package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ἶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0926 {

    /* renamed from: סּ, reason: contains not printable characters */
    public final C1000 f3090;

    /* renamed from: ףּ, reason: contains not printable characters */
    public final String f3091;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public C0785 f3092;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final C0851 f3094;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public C0979 f3095;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final Context f3096;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public boolean f3099;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f3100;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Handler f3101;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final C0892 f3102;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C0233 f3103;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0392 f3104;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f3105;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0841 f3106;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3089 = StringFog.decrypt("SVOMP0dXMVx7\n", "CD3tUz4jWD8=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3088 = StringFog.decrypt("C+bhmpsNkh8UuuuP0AuRUh764ZWHG5ofDA==\n", "f5SA+f5v83w=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3087 = StringFog.decrypt("TVggcaeIvrdbVD15v8SnpVBWI2W/gPC3\n", "PjdPHMvpk8Q=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3086 = StringFog.decrypt("KJZGjtslZT8InA==\n", "QfgyoKhAFkw=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3085 = StringFog.decrypt("AS23VREcZoEdNqhQHi4hlg==\n", "clnFPH97SPI=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final ArrayList f3098 = new ArrayList();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ArrayList f3097 = new ArrayList();

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final Thread.UncaughtExceptionHandler f3093 = Thread.getDefaultUncaughtExceptionHandler();

    public C0926(Context context, C0931 c0931, C0841 c0841, boolean z, String str, C1000 c1000) {
        this.f3090 = c1000;
        Thread.setDefaultUncaughtExceptionHandler(new C1011(this));
        this.f3106 = c0841;
        this.f3096 = context;
        C0358 c0358 = new C0358(context, StringFog.decrypt("XIChjy+2YWxD3KuaZLBiIUmcoYAzoGlsWw==\n", "KPLA7ErUAA8=\n"), StringFog.decrypt("SbcCOCbFZNJfux8wPol9wFS5ASw+zSrS\n", "OthtVUqkSaE=\n"));
        this.f3103 = new C0233(c0358, StringFog.decrypt("ivdXzpm9188=\n", "wqASuPzTo7w=\n"), StringFog.decrypt("wpr3NLH9\n", "p+ySWsXTHE8=\n"));
        String str2 = f3086;
        String m208 = c0358.m208(str2);
        int parseInt = !TextUtils.isEmpty(m208) ? Integer.parseInt(m208) + 1 : 1;
        c0358.m209(str2, "" + parseInt);
        String str3 = f3085;
        String m2082 = c0358.m208(str3);
        if (TextUtils.isEmpty(m2082)) {
            m2082 = UUID.randomUUID().toString();
            c0358.m209(str3, m2082);
        }
        String str4 = m2082;
        String m2083 = ((C0346) AbstractC0274.m142()).f862.m208(C0346.f839);
        this.f3102 = new C0892(context, c0931, parseInt, str4, !TextUtils.isEmpty(m2083) ? Long.parseLong(m2083) : 0L);
        this.f3104 = new C0392(context);
        this.f3105 = false;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("DJcufKysLrsskz5npo4=\n", "T/ZNFMn8XNQ=\n"));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3101 = handler;
        this.f3094 = new C0851(parseInt);
        this.f3100 = !z;
        this.f3091 = str;
        synchronized (this) {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new C1123(this), 0L);
        }
        m547();
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final void m544() {
        C0979 c0979 = this.f3095;
        if (c0979 != null) {
            C0331 c0331 = this.f3104.f1142;
            synchronized (c0331) {
                c0331.f812.remove(c0979);
            }
        }
        this.f3092.m449();
        this.f3092 = null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m545() {
        try {
            this.f3105 = false;
            Handler handler = this.f3101;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C0392 c0392 = this.f3104;
            C0331 c0331 = c0392.f1142;
            c0331.f814.unregisterReceiver(c0331);
            c0392.f1141 = true;
            m544();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized void m546() {
        this.f3099 = true;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m547() {
        C0979 c0979 = new C0979(this);
        this.f3095 = c0979;
        C0331 c0331 = this.f3104.f1142;
        synchronized (c0331) {
            c0331.f812.add(c0979);
        }
        this.f3092 = new C0785(new C0963(this));
        AbstractC0430.m262().m267(new C0958(this));
        AbstractC0274 m142 = AbstractC0274.m142();
        C0955 c0955 = new C0955(this);
        C0346 c0346 = (C0346) m142;
        Handler handler = c0346.f860;
        if (handler != null) {
            handler.post(new C0382(c0346, c0955));
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m548() {
        synchronized (this) {
            try {
                Handler handler = this.f3101;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m559(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m549() {
        try {
            this.f3100 = true;
            AbstractC1008.m611(new C1003(this));
            m548();
        } catch (Exception e) {
            AbstractC0356.m204(f3089, StringFog.decrypt("gdpGh/r9R7zkx1qp+K16vYbJV4Pvr0Gnqsw=\n", "xKg06IjdLtI=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m550() {
        return this.f3105;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m551(JSONObject jSONObject) {
        ArrayList arrayList;
        if (C0808.m476().m487()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f3098);
            }
            AbstractC1008.m610(new C1028(arrayList, jSONObject));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m557(String str, JSONObject jSONObject, JSONObject jSONObject2, C0299 c0299) {
        boolean z;
        String str2 = f3089;
        AbstractC0420.m251(str2, str2, AbstractC1133.m662("ToeQUaURCPYagpgFpF8L4VQ=\n", "bvD5Jc0xbY4=\n", AbstractC1072.m642("+8+NWM9YvcnAnYdUz1u92NnYmkWbHw==\n", "r730MaE/nb0=\n", new StringBuilder(), str)), jSONObject, true);
        try {
            if (m553().m500().contains(str)) {
                AbstractC0420.m250(str2, StringFog.decrypt("20UdRXFZ3r38RA5FZ0rVt+EKHgx2VJC39EcMXyI=\n", "lSppZQI8sNk=\n") + str + StringFog.decrypt("/ZxXEGc87oi40BIKfXDoia/CVxot\n", "3bQyaARQm+w=\n"));
                return;
            }
            AbstractC0420.m250(str2, StringFog.decrypt("Jr8tBpa0J8cd7ScKlrcn1gSoOhvYpG7HGu06DpW2PZM=\n", "cs1Ub/jTB7M=\n") + str);
            C0892 c0892 = this.f3102;
            C0331 c0331 = this.f3104.f1142;
            synchronized (c0331) {
                z = c0331.f813;
            }
            c0892.m529(str, jSONObject, jSONObject2, z, new C0983(this, c0299));
        } catch (Exception e) {
            AbstractC0356.m205(f3089, StringFog.decrypt("rK/1U3wBtbTJruJSamSqv4ep\n", "6d2HPA4h3No=\n"), e, false, false, true);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m552() {
        return this.f3099;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m541(C0926 c0926) {
        synchronized (c0926) {
            c0926.f3099 = false;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m543(C0926 c0926, ArrayList arrayList, C1116 c1116) {
        JSONObject jSONObject;
        c0926.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0911 c0911 = (C0911) it.next();
            synchronized (c0911) {
                jSONObject = c0911.f3047.f531;
            }
            if (!jSONObject.has(StringFog.decrypt("ZjtR\n", "Ak8iy7wo/+U=\n"))) {
                try {
                    jSONObject.put(StringFog.decrypt("bL1B\n", "CMkyCCVCUK8=\n"), jSONObject.optLong(AbstractC0615.f2034));
                } catch (JSONException unused) {
                }
            }
            if (c0926.f3094.m520(jSONObject)) {
                c0926.f3103.m135(c0911.f3047, null);
            }
            jSONArray.put(jSONObject);
        }
        C0892 c0892 = c0926.f3102;
        c0892.f2997.post(new C0894(c0892, c0926.f3104.f1142.m189(), jSONArray, new C1031(c0926, jSONArray, arrayList, c1116)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m555(C0999 c0999) {
        this.f3098.add(c0999);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m554(C0985 c0985) {
        this.f3097.add(c0985);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m556(String str, JSONObject jSONObject) {
        m557(str, jSONObject, null, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m542(C0926 c0926) {
        synchronized (c0926) {
            if (c0926.m550() && !TextUtils.isEmpty(c0926.f3102.f1176.m560()) && !c0926.m552()) {
                c0926.m546();
                AbstractC0420.m250(f3089, StringFog.decrypt("kGoRbaWpYCumeRpnuLQnbbFgEimvpmRjpg==\n", "ww9/CczHBws=\n"));
                C0233 c0233 = c0926.f3103;
                int m499 = c0926.m553().m499();
                C1115 c1115 = new C1115(c0926);
                c0233.getClass();
                C0358.m206().post(new C0259(c0233, m499, c1115));
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized C0812 m553() {
        return ((C0346) AbstractC0274.m142()).f858;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m559(boolean z) {
        try {
            if (z) {
                this.f3101.removeCallbacksAndMessages(null);
                this.f3101.postDelayed(new C1123(this), 0L);
            } else {
                C0233 c0233 = this.f3103;
                C0927 c0927 = new C0927(this);
                c0233.getClass();
                C0358.m206().post(new C0244(c0233, c0927));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m558(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C0812 m553 = m553();
        C1037 c1037 = m553.f3205;
        JSONObject jSONObject3 = c1037.f3308;
        String str = c1037.f3310;
        List arrayList = new ArrayList();
        String str2 = AbstractC0523.f1759;
        JSONArray optJSONArray = jSONObject3.optJSONArray(str);
        if (optJSONArray != null) {
            arrayList = AbstractC0523.m344(optJSONArray);
        }
        synchronized (m553) {
            jSONObject2 = m553.f3206;
        }
        String decrypt = StringFog.decrypt("9Vkv\n", "ky1XiUjAbMw=\n");
        List arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = jSONObject2.optJSONArray(decrypt);
        if (optJSONArray2 != null) {
            arrayList2 = AbstractC0523.m344(optJSONArray2);
        }
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
    }
}
