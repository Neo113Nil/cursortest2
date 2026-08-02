package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒋ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0646 extends AbstractC0984 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public C0567 f2186;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public AbstractViewOnLayoutChangeListenerC3987z f2187;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f2188 = new WeakHashMap();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C0648 f2185 = new C0648();

    static {
        StringFog.decrypt("hS8+OqIlg86mNBMymSefz68/IA==\n", "w1pSVtFG8as=\n");
    }

    public AbstractC0646(C0567 c0567) {
        this.f2186 = c0567;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m390(Object obj) {
        JSONObject jSONObject = new JSONObject();
        L l = m391(obj).f286;
        mo101(jSONObject, l != null ? (WebView) l.f100.f78.get() : null, obj);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractViewOnLayoutChangeListenerC3987z m391(Object obj) {
        return this.f2185.f2192 ? (AbstractViewOnLayoutChangeListenerC3987z) this.f2188.get(obj) : this.f2187;
    }

    /* renamed from: ﾇ */
    public abstract View mo83(Object obj);

    /* renamed from: ﾇ */
    public abstract AbstractViewOnLayoutChangeListenerC3987z mo84();

    /* renamed from: ﾇ */
    public abstract void mo85(Object obj, ArrayList arrayList);

    /* renamed from: ﾒ */
    public abstract InterfaceC0881 mo86();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m393(JSONObject jSONObject, Object obj, String str) {
        C0648 c0648 = this.f2185;
        boolean z = c0648.f2197 && !TextUtils.isEmpty(c0648.f2200);
        AbstractViewOnLayoutChangeListenerC3987z m391 = m391(obj);
        if (m391 == null) {
            m391 = mo84();
            if (this.f2185.f2192) {
                this.f2188.put(obj, m391);
            } else {
                this.f2187 = m391;
            }
            m391.f3217 = mo86();
        }
        for (WebView webView : m391.f285.keySet()) {
            webView.removeOnLayoutChangeListener(m391);
            L l = (L) m391.f285.get(webView);
            Iterator it = m391.f283.iterator();
            while (it.hasNext()) {
                l.f99.remove((InterfaceC0705) it.next());
            }
        }
        m391.f283.clear();
        m391.f286 = null;
        m391.f285.clear();
        C0648 c06482 = this.f2185;
        String str2 = c06482.f2200;
        List list = c06482.f2199;
        boolean z2 = c06482.f2194;
        boolean z3 = c06482.f2193;
        m391.f288 = z;
        m391.f284 = new I(str2, z3);
        m391.f287 = z2;
        m391.f290 = list;
        m391.f289 = str;
        if (!this.f2185.f2195) {
            super.mo98(jSONObject, null, obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo85(obj, arrayList);
        List arrayList2 = new ArrayList();
        C0567 c0567 = this.f2186;
        if (c0567 != null) {
            try {
                C0499 c0499 = c0567.f1859;
                C1102 c1102 = c0567.f1857;
                C0950 c0950 = c1102.f3465;
                arrayList2 = (List) c0499.m325(c0950, c0950.f3165, c1102, Collections.singletonList(obj)).f3367;
            } catch (Exception unused) {
                AbstractC0420.m243(StringFog.decrypt("To8Scv+KstRQgwxp7oGWwg==\n", "HOp/HYvv87A=\n"), StringFog.decrypt("Y9YLbkZgGVdS0BBvU2AJV0TyEGRDM15UVMsUIQ==\n", "JqR5ATRAfjI=\n") + c0567.f1858);
                arrayList2 = null;
            }
        }
        String str3 = AbstractC0370.f1112;
        HashSet hashSet = new HashSet(arrayList);
        if (arrayList2 != null) {
            hashSet.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(hashSet);
        if (arrayList3.isEmpty() || this.f2185.f2196) {
            View mo83 = mo83(obj);
            if (mo83 != null) {
                mo83.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0685(this, obj));
            }
            if (arrayList3.isEmpty()) {
                super.mo98(jSONObject, null, obj);
                return;
            }
        }
        if (this.f2185.f2191) {
            AbstractC1008.f3252.post(new RunnableC0651(this, obj, arrayList3, jSONObject));
        } else {
            m392(obj, arrayList3);
            super.mo98(jSONObject, (WebView) arrayList3.get(0), obj);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0984, com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ｋ */
    public final void mo98(JSONObject jSONObject, View view, Object obj) {
        mo96(jSONObject, (WebView) view, obj);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m389(AbstractC0646 abstractC0646, JSONObject jSONObject, WebView webView, Object obj) {
        super.mo98(jSONObject, webView, obj);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m392(Object obj, ArrayList arrayList) {
        AbstractViewOnLayoutChangeListenerC3987z m391 = m391(obj);
        m391.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m391.m125((WebView) it.next());
        }
        if (this.f2185.f2198) {
            m391(obj).f289 = Integer.toHexString(((WebView) arrayList.get(0)).hashCode());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0984
    /* renamed from: ﾒ */
    public final String mo79(Object obj) {
        return m391(obj).f289;
    }
}
