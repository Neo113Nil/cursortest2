package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3963a extends AbstractC0984 {

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f118 = StringFog.decrypt("XLUxT8YxC8RrsjBU4ic=\n", "CtxUOIdVeIw=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public C0323 f120;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public Class f121;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final C0617 f124;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C0526 f126;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f127 = new WeakHashMap();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final WeakHashMap f123 = new WeakHashMap();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f122 = new WeakHashMap();

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final ArrayList f119 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC0312 f125 = new ViewOnLayoutChangeListenerC0312(this);

    public C3963a(JSONObject jSONObject, C0526 c0526) {
        this.f120 = new C0323();
        this.f120 = new C0323(jSONObject);
        this.f126 = c0526;
        C0617 c0617 = new C0617(this);
        this.f124 = c0617;
        C1064.m629().m631(c0617);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m77(C3963a c3963a, ArrayList arrayList) {
        int i;
        c3963a.getClass();
        for (0; i < arrayList.size(); i + 1) {
            View view = (View) arrayList.get(i);
            C0323 c0323 = c3963a.f120;
            if (c3963a.f126 != null) {
                List<String> list = c0323.f781;
                if (list != null && !list.isEmpty()) {
                    String name = view.getClass().getPackage().getName();
                    for (String str : list) {
                        if (TextUtils.isEmpty(str)) {
                            str = null;
                        } else {
                            List asList = Arrays.asList(str.split(StringFog.decrypt("b7RX\n", "NJoKrvNHlnM=\n")));
                            if (asList.size() > 3) {
                                str = TextUtils.join(StringFog.decrypt("hw==\n", "qQMN0bNcgYY=\n"), asList.subList(0, 3));
                            }
                        }
                        if (TextUtils.isEmpty(str) || !name.startsWith(str)) {
                        }
                    }
                }
                C0526 c0526 = c3963a.f126;
                C0499 c0499 = c0526.f1762;
                C1102 c1102 = c0526.f1761;
                C0950 c0950 = c1102.f3465;
                i = c0499.m325(c0950, c0950.f3165, c1102, Collections.singletonList(view)).m640() ? 0 : i + 1;
            }
            if (!c0323.f790) {
                ArrayList arrayList2 = new ArrayList();
                AbstractC3964b.m88(view, WebView.class, null, false, c0323.f788, c0323.f784, c0323.f782, arrayList2);
                if (view instanceof WebView) {
                    arrayList2.add((WebView) view);
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    WebView webView = (WebView) it.next();
                    if (c3963a.f123.get(webView) == null && webView.getClass().getName().startsWith(c0323.f794)) {
                        A a = new A();
                        c3963a.f127.put(webView, a);
                        String str2 = c0323.f793;
                        List asList2 = TextUtils.isEmpty(c0323.f791) ? null : Arrays.asList(c0323.f791.split(StringFog.decrypt("dQ==\n", "WdbcypPCWI8=\n")));
                        boolean z = c0323.f787;
                        boolean z2 = c0323.f792;
                        boolean z3 = c0323.f786;
                        a.f288 = z;
                        a.f284 = new I(str2, z3);
                        a.f287 = z2;
                        a.f290 = asList2;
                        a.f3217 = new C0324(c3963a);
                        a.m125(webView);
                        a.f289 = Integer.toHexString(webView.hashCode());
                        c3963a.f123.put(webView, c3963a);
                    }
                }
            } else if (((C3963a) c3963a.f123.get(view)) == null) {
                c3963a.f123.put(view, c3963a);
                c3963a.mo98(new JSONObject(), view, null);
            } else if (c0323.f789) {
                c3963a.mo98(new JSONObject(), view, null);
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m78(View view) {
        Activity m89;
        try {
            if (this.f121 == null) {
                this.f121 = Class.forName(this.f120.f795);
            }
            Activity mo265 = AbstractC0430.m262().mo265();
            if (mo265 == null) {
                return;
            }
            if (this.f120.f783.isEmpty() || (m89 = AbstractC3964b.m89(view)) == null || !this.f120.f783.contains(m89.getClass().getName())) {
                AbstractC1008.m614(new C0327(this, mo265, view));
            }
        } catch (Throwable th) {
            AbstractC0420.m243(f118, StringFog.decrypt("v9Ey3jLOxESO1ynfJ87ATZvQM5E=\n", "+qNAsUDuoyE=\n") + this.f120.f795 + StringFog.decrypt("eCz3\n", "WAHXg5tAUxY=\n") + th.getLocalizedMessage());
            m80();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0984
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ String mo79(Object obj) {
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m80() {
        this.f3217 = null;
        C1064.m629().m630(this.f124);
        HashSet hashSet = new HashSet(this.f122.keySet());
        this.f122.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.f125);
        }
    }
}
