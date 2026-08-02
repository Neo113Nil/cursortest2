package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ad extends u<View, Activity> {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f109 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f110 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private Class f115;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private View.OnLayoutChangeListener f116;

    /* renamed from: ｋ, reason: contains not printable characters */
    private jc f118;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private jv f119;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f111 = {40467, 37927, 35382, 32787, 46632, 44054, 41588, 55360, 52860, 50248, 64079, 61520, 59044, 7352, 'E', 2681, 5220, 7758, 10334, 12823, 15397, 17960, 20524, 23063, 25607, 28183, 30947, 33455, 36089, 38601, 41169, 43720, 46261, 48881, 31550, 28984, 28456, 4065, AbstractJsonLexerKt.BEGIN_LIST, 2597, 5195, 51651};

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static long f108 = 1602204366149716491L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final Map<WebView, z> f117 = new WeakHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final Map<View, ad> f120 = new WeakHashMap();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final Map<View, View.OnLayoutChangeListener> f113 = new WeakHashMap();

    /* renamed from: ﮐ, reason: contains not printable characters */
    private a f112 = new a();

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final List<View> f114 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ a m5799(ad adVar) {
        int i = 2 % 2;
        int i2 = f110;
        int i3 = i2 + 29;
        f109 = i3 % 128;
        int i4 = i3 % 2;
        a aVar = adVar.f112;
        int i5 = i2 + 49;
        f109 = i5 % 128;
        int i6 = i5 % 2;
        return aVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m5805(ad adVar) {
        int i = 2 % 2;
        int i2 = f110 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        int i3 = i2 % 128;
        f109 = i3;
        int i4 = i2 % 2;
        List<View> list = adVar.f114;
        int i5 = i3 + 39;
        f110 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Class m5806(ad adVar) {
        int i = 2 % 2;
        int i2 = f109;
        int i3 = i2 + 99;
        f110 = i3 % 128;
        int i4 = i3 % 2;
        Class cls = adVar.f115;
        int i5 = i2 + 89;
        f110 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return cls;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5809(ad adVar, List list) {
        int i = 2 % 2;
        int i2 = f109 + 77;
        f110 = i2 % 128;
        int i3 = i2 % 2;
        adVar.m5814((List<View>) list);
        int i4 = f109 + 5;
        f110 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ View.OnLayoutChangeListener m5811(ad adVar) {
        int i = 2 % 2;
        int i2 = f110 + 7;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = adVar.f116;
        if (i3 == 0) {
            return onLayoutChangeListener;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m5812(ad adVar) {
        int i = 2 % 2;
        int i2 = f110 + 111;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        Map<View, View.OnLayoutChangeListener> map = adVar.f113;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return map;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5813(Activity activity, View view, Class cls, boolean z, List list, List list2, List list3) {
        int i = 2 % 2;
        int i2 = f110 + 87;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        m5801(activity, view, cls, z, list, list2, list3);
        int i4 = f110 + 93;
        f109 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* renamed from: ﾒ, reason: contains not printable characters */
    protected final /* synthetic */ String mo5818(Activity activity) {
        int i = 2 % 2;
        int i2 = f110 + 37;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        String m5807 = m5807();
        int i4 = f110 + 49;
        f109 = i4 % 128;
        if (i4 % 2 == 0) {
            return m5807;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    ad(JSONObject jSONObject, jc jcVar) {
        m5817(jSONObject, jcVar);
        m5800();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m5817(JSONObject jSONObject, jc jcVar) {
        int i = 2 % 2;
        this.f112 = new a(jSONObject);
        this.f118 = jcVar;
        int i2 = f109 + 49;
        f110 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5800() {
        int i = 2 % 2;
        this.f116 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.5

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f128 = 2870287396655799270L;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f129 = 0;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f130 = 1;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = 2 % 2;
                int i11 = f129 + 19;
                f130 = i11 % 128;
                try {
                    if (i11 % 2 != 0) {
                        ad.this.m5816(view);
                        return;
                    }
                    ad.this.m5816(view);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                } catch (Throwable th) {
                    kl.m8458(m5829("笨签兲䫽䫭組\u08e2ᓱ쇧\uedfa嬧頥ꑹ놅屵榩㖅‡", MotionEvent.axisFromString("") + 1).intern(), m5829("왏옊㸢▶\uef49\ud8f7䘁ꦥ껨䡄ᗜ훸ᥟ\udecf率❲裦佡榲럓硛ﾳᤍޯ\uebd9氏諨", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern(), th, false);
                }
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m5829(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (g.f2155) {
                    char[] m7785 = g.m7785(f128, cArr2, i2);
                    g.f2157 = 4;
                    while (g.f2157 < m7785.length) {
                        g.f2156 = g.f2157 - 4;
                        m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f128));
                        g.f2157++;
                    }
                    str2 = new String(m7785, 4, m7785.length - 4);
                }
                return str2;
            }
        };
        this.f119 = new jv() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.4
            @Override // com.ironsource.adqualitysdk.sdk.i.jv
            /* renamed from: ｋ */
            public final void mo5787(View view) {
                view.addOnLayoutChangeListener(ad.m5811(ad.this));
                ad.m5812(ad.this).put(view, ad.m5811(ad.this));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jv
            /* renamed from: ﻛ */
            public final void mo5784(View view) {
                view.removeOnLayoutChangeListener(ad.m5811(ad.this));
                ad.m5812(ad.this).remove(view);
            }
        };
        jp.m8258().m8266(this.f119);
        int i2 = f109 + 31;
        f110 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final void m5819() {
        int i = 2 % 2;
        Object obj = null;
        m8631((t) null);
        jp.m8258().m8265(this.f119);
        HashSet hashSet = new HashSet(this.f113.keySet());
        this.f113.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int i2 = f109 + 21;
            f110 = i2 % 128;
            int i3 = i2 % 2;
            ((View) it.next()).removeOnLayoutChangeListener(this.f116);
        }
        int i4 = f110 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f109 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m5807() {
        int i = 2 % 2;
        int i2 = f109;
        int i3 = i2 + 25;
        f110 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        f110 = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5816(final View view) {
        Activity m8509;
        int i = 2 % 2;
        int i2 = f110 + 111;
        int i3 = i2 % 128;
        f109 = i3;
        int i4 = i2 % 2;
        try {
            if (this.f115 == null) {
                int i5 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f110 = i5 % 128;
                int i6 = i5 % 2;
                this.f115 = Class.forName(a.m5857(this.f112));
                int i7 = f110 + 65;
                f109 = i7 % 128;
                int i8 = i7 % 2;
            }
            final Activity mo8296 = jt.m8290().mo8296();
            if (mo8296 == null) {
                return;
            }
            if (a.m5846(this.f112).isEmpty() || (m8509 = kq.m8509(view)) == null || !a.m5846(this.f112).contains(m8509.getClass().getName())) {
                p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ, reason: contains not printable characters */
                    public final void mo5828() {
                        ad.m5805(ad.this).clear();
                        ad.m5813(mo8296, view, ad.m5806(ad.this), a.m5853(ad.m5799(ad.this)), a.m5861(ad.m5799(ad.this)), a.m5849(ad.m5799(ad.this)), ad.m5805(ad.this));
                        if (kq.m8514(view, ad.m5806(ad.this), null, a.m5861(ad.m5799(ad.this)), a.m5849(ad.m5799(ad.this)))) {
                            ad.m5805(ad.this).add(view);
                        }
                        final ArrayList arrayList = new ArrayList(ad.m5805(ad.this));
                        if (a.m5838(ad.m5799(ad.this))) {
                            p.m8549(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3.5
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() {
                                    ad.m5809(ad.this, arrayList);
                                }
                            });
                        } else {
                            ad.m5809(ad.this, arrayList);
                        }
                    }
                });
                int i9 = f110 + 87;
                f109 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 72 / 0;
                }
            }
        } catch (Throwable th) {
            m.m8527(m5804((char) (40517 - (Process.myPid() >> 22)), Drawable.resolveOpacity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14).intern(), new StringBuilder().append(m5804((char) View.combineMeasuredStates(0, 0), 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0') + 21).intern()).append(a.m5857(this.f112)).append(m5804((char) ((Process.myPid() >> 22) + 31518), TextUtils.getCapsMode("", 0, 0) + 34, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3).intern()).append(th.getLocalizedMessage()).toString());
            m5819();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m5814(List<View> list) {
        int i = 2 % 2;
        int i2 = f110 + 17;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = f109 + 99;
            f110 = i5 % 128;
            int i6 = i5 % 2;
            m5802(list.get(i4), this.f112);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <E extends View> void m5801(Activity activity, View view, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        int i;
        int i2 = 2 % 2;
        int i3 = f110;
        int i4 = i3 + 69;
        f109 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (view != null) {
            int i5 = i3 + 39;
            f109 = i5 % 128;
            int i6 = i5 % 2;
            kq.m8517(view, cls, false, z, list, list2, list3);
            i = f110 + 107;
        } else {
            kq.m8516(activity, cls, z, list, list2, list3);
            i = f110 + 49;
        }
        f109 = i % 128;
        int i7 = i % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5802(View view, a aVar) {
        int i = 2 % 2;
        if (m5810(view)) {
            int i2 = f109 + 71;
            f110 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            if (a.m5837(aVar)) {
                if (this.f120.get(view) == null) {
                    this.f120.put(view, this);
                    mo5823(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                    return;
                } else {
                    if (a.m5836(aVar)) {
                        mo5823(IronSourceNetworkBridge.jsonObjectInit(), view, null);
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            kq.m8517(view, WebView.class, false, a.m5853(aVar), a.m5861(aVar), a.m5849(aVar), arrayList);
            if (!(!(view instanceof WebView))) {
                int i4 = f110 + 7;
                f109 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add((WebView) view);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i6 = f109 + 63;
                f110 = i6 % 128;
                if (i6 % 2 == 0) {
                    this.f120.get((WebView) it.next());
                    super.hashCode();
                    throw null;
                }
                WebView webView = (WebView) it.next();
                if (this.f120.get(webView) == null && webView.getClass().getName().startsWith(a.m5840(aVar))) {
                    ab abVar = new ab();
                    this.f117.put(webView, abVar);
                    abVar.m8732(a.m5841(aVar), TextUtils.isEmpty(a.m5832(aVar)) ? null : Arrays.asList(a.m5832(aVar).split(m5804((char) (4045 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.combineMeasuredStates(0, 0) + 37, -TextUtils.lastIndexOf("", '0', 0)).intern())), a.m5831(aVar), a.m5833(aVar), a.m5834(aVar));
                    abVar.m8631(m5803());
                    abVar.m8736(webView);
                    abVar.m8737(Integer.toHexString(webView.hashCode()));
                    this.f120.put(webView, this);
                }
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private t<WebView, Activity> m5803() {
        int i = 2 % 2;
        ba.d dVar = new ba.d() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.2
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5820(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo5820(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5821(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ad.this.mo5821(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5822(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo5822(jSONObject, (JSONObject) obj, (WebView) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5823(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo5823(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5824(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ad.this.mo5824(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5825(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo5825(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5826(JSONObject jSONObject, Object obj, Object obj2) {
                ad.this.mo5826(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo5827(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                ad.this.mo5827(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        int i2 = f109 + 77;
        f110 = i2 % 128;
        int i3 = i2 % 2;
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r7.f118.mo7218(r8) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r7.f118.mo7218(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r2 + 57;
        com.ironsource.adqualitysdk.sdk.i.ad.f110 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001b, code lost:
    
        if (r7.f118 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r7.f118 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (m5815(r8, (java.util.List<java.lang.String>) com.ironsource.adqualitysdk.sdk.i.ad.a.m5830(r7.f112)) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ad.f110 + 31;
        com.ironsource.adqualitysdk.sdk.i.ad.f109 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m5810(View view) {
        int i = 2 % 2;
        int i2 = f110 + 105;
        int i3 = i2 % 128;
        f109 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i4 = 68 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5815(View view, List<String> list) {
        int i = 2 % 2;
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i2 = f109 + 87;
        f110 = i2 % 128;
        if (i2 % 2 == 0) {
            view.getClass().getPackage().getName();
            list.iterator();
            throw null;
        }
        String name = view.getClass().getPackage().getName();
        Iterator<String> it = list.iterator();
        int i3 = f109 + 51;
        f110 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (!it.hasNext()) {
                return false;
            }
            String m5808 = m5808(it.next());
            if (!TextUtils.isEmpty(m5808) && name.startsWith(m5808)) {
                return true;
            }
            i3 = f109 + 61;
            f110 = i3 % 128;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m5808(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i2 = f110 + 103;
        f109 = i2 % 128;
        int i3 = i2 % 2;
        List asList = Arrays.asList(str.split(m5804((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 38 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 3 - (Process.myTid() >> 22)).intern()));
        if (asList.size() > 3) {
            return TextUtils.join(m5804((char) (Color.green(0) + 51693), ((Process.getThreadPriority(0) + 20) >> 6) + 41, Color.alpha(0) + 1).intern(), asList.subList(0, 3));
        }
        int i4 = f110 + 3;
        f109 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public class a {

        /* renamed from: 爫, reason: contains not printable characters */
        private static int f132 = 67;

        /* renamed from: ﬤ, reason: contains not printable characters */
        private static int f133 = 0;

        /* renamed from: סּ, reason: contains not printable characters */
        private static long f134 = -6187910030764481974L;

        /* renamed from: ףּ, reason: contains not printable characters */
        private static int f135 = 1;

        /* renamed from: ﭖ, reason: contains not printable characters */
        private boolean f136;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f141;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private boolean f142;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private boolean f143;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private boolean f144;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private boolean f145;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private String f146;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private String f147;

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f148;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f149;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f150;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private List<Integer> f139 = new ArrayList();

        /* renamed from: ﮌ, reason: contains not printable characters */
        private List<String> f140 = new ArrayList();

        /* renamed from: ﭸ, reason: contains not printable characters */
        private List<String> f138 = new ArrayList();

        /* renamed from: ﭴ, reason: contains not printable characters */
        private List<String> f137 = new ArrayList();

        /* renamed from: ﭖ, reason: contains not printable characters */
        static /* synthetic */ List m5830(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 109;
            f133 = i2 % 128;
            int i3 = i2 % 2;
            List<String> list = aVar.f137;
            if (i3 == 0) {
                return list;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﭴ, reason: contains not printable characters */
        static /* synthetic */ boolean m5831(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            int i3 = i2 % 128;
            f133 = i3;
            int i4 = i2 % 2;
            boolean z = aVar.f144;
            int i5 = i3 + 99;
            f135 = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            throw null;
        }

        /* renamed from: ﭸ, reason: contains not printable characters */
        static /* synthetic */ String m5832(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 17;
            f133 = i2 % 128;
            int i3 = i2 % 2;
            String str = aVar.f148;
            if (i3 != 0) {
                int i4 = 28 / 0;
            }
            return str;
        }

        /* renamed from: ﮉ, reason: contains not printable characters */
        static /* synthetic */ boolean m5833(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 105;
            int i3 = i2 % 128;
            f133 = i3;
            int i4 = i2 % 2;
            boolean z = aVar.f150;
            int i5 = i3 + 113;
            f135 = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            throw null;
        }

        /* renamed from: ﮌ, reason: contains not printable characters */
        static /* synthetic */ boolean m5834(a aVar) {
            int i = 2 % 2;
            int i2 = f133 + 57;
            f135 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = aVar.f143;
            if (i3 != 0) {
                return z;
            }
            throw null;
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        static /* synthetic */ boolean m5836(a aVar) {
            int i = 2 % 2;
            int i2 = f133;
            int i3 = i2 + 51;
            f135 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = aVar.f141;
            int i5 = i2 + 5;
            f135 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* renamed from: ﱟ, reason: contains not printable characters */
        static /* synthetic */ boolean m5837(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 85;
            f133 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = aVar.f142;
            if (i3 == 0) {
                return z;
            }
            throw null;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        static /* synthetic */ boolean m5838(a aVar) {
            int i = 2 % 2;
            int i2 = f133 + 29;
            f135 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = aVar.f136;
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            return z;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        static /* synthetic */ String m5840(a aVar) {
            int i = 2 % 2;
            int i2 = f133 + 81;
            f135 = i2 % 128;
            int i3 = i2 % 2;
            String str = aVar.f147;
            if (i3 != 0) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        static /* synthetic */ String m5841(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 97;
            f133 = i2 % 128;
            int i3 = i2 % 2;
            String str = aVar.f146;
            if (i3 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ List m5846(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 37;
            int i3 = i2 % 128;
            f133 = i3;
            int i4 = i2 % 2;
            List<String> list = aVar.f140;
            int i5 = i3 + 39;
            f135 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ List m5849(a aVar) {
            int i = 2 % 2;
            int i2 = f133;
            int i3 = i2 + 3;
            f135 = i3 % 128;
            int i4 = i3 % 2;
            List<String> list = aVar.f138;
            int i5 = i2 + 17;
            f135 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ boolean m5853(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 31;
            f133 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = aVar.f145;
            if (i3 == 0) {
                return z;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ String m5857(a aVar) {
            int i = 2 % 2;
            int i2 = f135 + 57;
            int i3 = i2 % 128;
            f133 = i3;
            int i4 = i2 % 2;
            String str = aVar.f149;
            int i5 = i3 + 59;
            f135 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
            return str;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ List m5861(a aVar) {
            int i = 2 % 2;
            int i2 = f135;
            int i3 = i2 + 91;
            f133 = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            List<Integer> list = aVar.f139;
            if (i4 != 0) {
                super.hashCode();
                throw null;
            }
            int i5 = i2 + 11;
            f133 = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            throw null;
        }

        public a() {
        }

        public a(JSONObject jSONObject) {
            m5842(jSONObject.optString(m5845(View.combineMeasuredStates(0, 0) + 15, false, 166 - TextUtils.getCapsMode("", 0, 0), "\ufffe\u0010\u0010￫\ufffe\n\u0002\ufffe\u0001\ufff3\u0006\u0002\u0014￠\t", TextUtils.indexOf((CharSequence) "", '0') + 8).intern()));
            m5858(jSONObject.optString(m5852("畋甪絜齲俠╴謢菃ﰆᙙȌᔓ杸覭饥鰽\uee56", ViewConfiguration.getTouchSlop() >> 8).intern()));
            m5850(jSONObject.optString(m5852("뿔뾾㥎\udb77㔶厶\uf1f6\uf507㚵剒磠揕귧춠", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()));
            m5856(jSONObject.optBoolean(m5845((ViewConfiguration.getEdgeSlop() >> 16) + 16, true, (KeyEvent.getMaxKeyCode() >> 16) + 169, "\uffff\u0003\u0006\uffdd\u0011\uffff\u0003\ufff0￼\uffff\ufff1\uffff\r\u000f\u000e\b", 14 - Color.argb(0, 0, 0, 0)).intern()));
            jSONObject.optBoolean(m5852("朙杬뺧岞ύ餁으㾈\uee54햷串ꥯ画䩒필⁊ﰢ쌉推\udb32䏗령", ViewConfiguration.getEdgeSlop() >> 16).intern());
            m5854(jSONObject.optString(m5845((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, false, 173 - TextUtils.indexOf("", "", 0, 0), "\u0002￦\b\ufffb￼\uffff\u000e\u000b\b", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6).intern()));
            m5851(jSONObject.optBoolean(m5852("\uf7e9\uf780䇧ꏞﴦ\ue25e㧼䓡纵⫼냬툽\ue5f8딙", TextUtils.indexOf("", "", 0)).intern()));
            m5844(jSONObject.optBoolean(m5845(18 - (ViewConfiguration.getScrollBarSize() >> 8), false, 167 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\t\uffffￜ\u0007\u0007￠\u0011\u0000\t\u000f\u000e\u0001\n\r\ufffe\u0000￮\u0000", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11).intern()));
            m5848(jSONObject.optBoolean(m5845(Color.argb(0, 0, 0, 0) + 9, false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 176, "\b\u0005\u0006￼\t\ufff8\u0005\ufff8\ufff6", TextUtils.getTrimmedLength("") + 6).intern()));
            m5860(jSONObject.optBoolean(m5845(Color.blue(0) + 13, false, ExpandableListView.getPackedPositionType(0L) + 173, "\f\ufff7\t\ufff9\b\uffff\u0006\n\u000b\t\ufffb￠\ufff7", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8).intern(), true));
            m5839(jSONObject.optBoolean(m5852("\uedb5\uedc0ḩﰐ骙\udfef幨祴擥甯흗\uef88ﾯ\ueac0", TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern()));
            m5835(jSONObject.optBoolean(m5852("粯糟C\ue27b\u0d84怐쥿욭\uf5e2歂䁋偀準\uf4bc\udb17\ud94d\ue798緯淅∧塦ۇ\ue4e4ꬆ턕逴羹㓒", ViewConfiguration.getTouchSlop() >> 8).intern(), true));
            m5847(kj.m8411(jSONObject.optJSONArray(m5845(7 - View.resolveSizeAndState(0, 0, 0), false, 172 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "￼\u000b\u000e\u0001�\u000f￡", View.getDefaultSize(0, 0) + 2).intern())));
            m5859(kj.m8411(jSONObject.optJSONArray(m5845(View.combineMeasuredStates(0, 0) + 18, true, 172 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\f\ufffb\ufff9�\n\u0007\u0006\uffff￡\u0007￬\u000b�\u0001\f\u0001\u000e\u0001", 3 - (ViewConfiguration.getTapTimeout() >> 16)).intern())));
            m5843(kj.m8411(jSONObject.optJSONArray(m5845(Color.blue(0) + 13, true, 172 - Gravity.getAbsoluteGravity(0, 0), "\t\u0006\u0005\ufffe￠\u0006￫\n\u000e￼\u0000\r￼", View.resolveSizeAndState(0, 0, 0) + 12).intern())));
            m5855(kj.m8411(jSONObject.optJSONArray(m5852("\uf728\uf74b듺囜ᰝꪰ\ud8e8ఝ繳\udfed凒髢\ue517䀫쪜ᏻ氠", ViewConfiguration.getTapTimeout() >> 16).intern())));
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private a m5842(String str) {
            int i = 2 % 2;
            int i2 = f133 + 39;
            int i3 = i2 % 128;
            f135 = i3;
            if (i2 % 2 == 0) {
                this.f149 = str;
                int i4 = 64 / 0;
            } else {
                this.f149 = str;
            }
            int i5 = i3 + 113;
            f133 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private a m5858(String str) {
            int i = 2 % 2;
            int i2 = f133 + 25;
            f135 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f147 = str;
                return this;
            }
            this.f147 = str;
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private a m5850(String str) {
            int i = 2 % 2;
            int i2 = f135;
            int i3 = i2 + 33;
            f133 = i3 % 128;
            int i4 = i3 % 2;
            this.f146 = str;
            int i5 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f133 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private a m5856(boolean z) {
            int i = 2 % 2;
            int i2 = f133 + 53;
            int i3 = i2 % 128;
            f135 = i3;
            int i4 = i2 % 2;
            this.f150 = z;
            int i5 = i3 + 63;
            f133 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private a m5854(String str) {
            int i = 2 % 2;
            int i2 = f135 + 33;
            int i3 = i2 % 128;
            f133 = i3;
            int i4 = i2 % 2;
            this.f148 = str;
            int i5 = i3 + 51;
            f135 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private a m5851(boolean z) {
            int i = 2 % 2;
            int i2 = f133 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            int i3 = i2 % 128;
            f135 = i3;
            int i4 = i2 % 2;
            this.f142 = z;
            int i5 = i3 + 111;
            f133 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private a m5844(boolean z) {
            int i = 2 % 2;
            int i2 = f135 + 79;
            f133 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f141 = z;
                return this;
            }
            this.f141 = z;
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private a m5848(boolean z) {
            int i = 2 % 2;
            int i2 = f133;
            int i3 = i2 + 63;
            f135 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                this.f145 = z;
                int i4 = i2 + 97;
                f135 = i4 % 128;
                if (i4 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.f145 = z;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private a m5860(boolean z) {
            int i = 2 % 2;
            int i2 = f133 + 67;
            int i3 = i2 % 128;
            f135 = i3;
            if (i2 % 2 == 0) {
                this.f144 = z;
                int i4 = 70 / 0;
            } else {
                this.f144 = z;
            }
            int i5 = i3 + 17;
            f133 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 49 / 0;
            }
            return this;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        private a m5839(boolean z) {
            int i = 2 % 2;
            int i2 = f133;
            int i3 = i2 + 19;
            f135 = i3 % 128;
            int i4 = i3 % 2;
            this.f143 = z;
            int i5 = i2 + 43;
            f135 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        private a m5835(boolean z) {
            int i = 2 % 2;
            int i2 = f135 + 33;
            int i3 = i2 % 128;
            f133 = i3;
            int i4 = i2 % 2;
            this.f136 = z;
            int i5 = i3 + 87;
            f135 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private a m5847(List<Integer> list) {
            int i = 2 % 2;
            int i2 = f135;
            int i3 = i2 + 43;
            f133 = i3 % 128;
            int i4 = i3 % 2;
            if (list == null) {
                return this;
            }
            int i5 = i2 + 23;
            f133 = i5 % 128;
            if (i5 % 2 == 0) {
                this.f139 = list;
                return this;
            }
            this.f139 = list;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private a m5859(List<String> list) {
            int i = 2 % 2;
            int i2 = f135 + 87;
            int i3 = i2 % 128;
            f133 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (list == null) {
                return this;
            }
            int i4 = i3 + 101;
            f135 = i4 % 128;
            if (i4 % 2 != 0) {
                this.f140 = list;
                return this;
            }
            this.f140 = list;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private a m5843(List<String> list) {
            int i = 2 % 2;
            if (list != null) {
                int i2 = f135 + 1;
                f133 = i2 % 128;
                int i3 = i2 % 2;
                this.f138 = list;
            }
            int i4 = f135 + 51;
            f133 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private a m5855(List<String> list) {
            int i = 2 % 2;
            int i2 = f135;
            int i3 = i2 + 81;
            f133 = i3 % 128;
            int i4 = i3 % 2;
            if (list != null) {
                int i5 = i2 + 55;
                f133 = i5 % 128;
                if (i5 % 2 != 0) {
                    this.f137 = list;
                    int i6 = 94 / 0;
                } else {
                    this.f137 = list;
                }
                int i7 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f133 = i7 % 128;
                int i8 = i7 % 2;
            }
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m5845(int i, boolean z, int i2, String str, int i3) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (d.f1644) {
                char[] cArr3 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    d.f1643 = cArr2[d.f1641];
                    cArr3[d.f1641] = (char) (d.f1643 + i2);
                    int i4 = d.f1641;
                    cArr3[i4] = (char) (cArr3[i4] - f132);
                    d.f1641++;
                }
                if (i3 > 0) {
                    d.f1642 = i3;
                    char[] cArr4 = new char[i];
                    System.arraycopy(cArr3, 0, cArr4, 0, i);
                    System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                    System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    d.f1641 = 0;
                    while (d.f1641 < i) {
                        cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                        d.f1641++;
                    }
                    cArr3 = cArr5;
                }
                str2 = new String(cArr3);
            }
            return str2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m5852(String str, int i) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (g.f2155) {
                char[] m7785 = g.m7785(f134, cArr2, i);
                g.f2157 = 4;
                while (g.f2157 < m7785.length) {
                    g.f2156 = g.f2157 - 4;
                    m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f134));
                    g.f2157++;
                }
                str2 = new String(m7785, 4, m7785.length - 4);
            }
            return str2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m5804(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f111[c.f1198 + i] ^ (c.f1198 * f108)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
