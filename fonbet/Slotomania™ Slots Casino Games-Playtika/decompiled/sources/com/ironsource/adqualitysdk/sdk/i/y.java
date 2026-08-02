package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.x;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y extends x<Activity> implements jr {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f3247 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3248;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3249;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String f3250;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private d f3251;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private boolean f3252;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3253;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f3254;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Class f3255;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3256;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jr f3257;

    /* renamed from: ﺙ, reason: contains not printable characters */
    static void m8680() {
        f3249 = 160;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ String m8676() {
        int i = 2 % 2;
        int i2 = f3247 + 35;
        f3248 = i2 % 128;
        if (i2 % 2 == 0) {
            return f3250;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ boolean m8678(y yVar) {
        int i = 2 % 2;
        int i2 = f3248 + 31;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = yVar.f3253;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ d m8682(y yVar) {
        int i = 2 % 2;
        int i2 = f3247 + 11;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        d dVar = yVar.f3251;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return dVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m8686(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3248 + 75;
        int i3 = i2 % 128;
        f3247 = i3;
        int i4 = i2 % 2;
        yVar.f3256 = z;
        int i5 = i3 + 33;
        f3248 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m8687(Activity activity) {
        int i = 2 % 2;
        int i2 = f3248 + 61;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
        String m8679 = m8679(activity);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return m8679;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m8688(y yVar) {
        int i = 2 % 2;
        int i2 = f3248 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i3 = i2 % 128;
        f3247 = i3;
        int i4 = i2 % 2;
        boolean z = yVar.f3256;
        int i5 = i3 + 105;
        f3248 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m8689(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3248;
        int i3 = i2 + 101;
        f3247 = i3 % 128;
        int i4 = i3 % 2;
        yVar.f3254 = z;
        int i5 = i2 + 101;
        f3247 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8691() {
        int i = 2 % 2;
        int i2 = f3247 + 89;
        f3248 = i2 % 128;
        return i2 % 2 != 0;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8692(y yVar) {
        int i = 2 % 2;
        int i2 = f3247;
        int i3 = i2 + 19;
        f3248 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = yVar.f3254;
        int i5 = i2 + 43;
        f3248 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ jr m8693(y yVar) {
        int i = 2 % 2;
        int i2 = f3248 + 95;
        f3247 = i2 % 128;
        if (i2 % 2 != 0) {
            return yVar.m8681();
        }
        yVar.m8681();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m8694(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3247 + 19;
        int i3 = i2 % 128;
        f3248 = i3;
        int i4 = i2 % 2;
        yVar.f3252 = z;
        int i5 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f3247 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Class m8695(y yVar, Class cls) {
        int i = 2 % 2;
        int i2 = f3247 + 25;
        int i3 = i2 % 128;
        f3248 = i3;
        int i4 = i2 % 2;
        yVar.f3255 = cls;
        int i5 = i3 + 57;
        f3247 = i5 % 128;
        if (i5 % 2 != 0) {
            return cls;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m8696(y yVar) {
        int i = 2 % 2;
        int i2 = f3248;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3247 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = yVar.f3252;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 25;
        f3247 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m8697(y yVar, Activity activity) {
        int i = 2 % 2;
        int i2 = f3248 + 113;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8677 = yVar.m8677(activity);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return m8677;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m8698(y yVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3248;
        int i3 = i2 + 13;
        f3247 = i3 % 128;
        int i4 = i3 % 2;
        yVar.f3253 = z;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 13;
        f3247 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻐ */
    final /* synthetic */ View mo5783(Activity activity) {
        int i = 2 % 2;
        int i2 = f3248 + 111;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
        View m8690 = m8690(activity);
        int i4 = f3248 + 45;
        f3247 = i4 % 128;
        int i5 = i4 % 2;
        return m8690;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ｋ */
    final /* synthetic */ void mo8652(Activity activity) {
        int i = 2 % 2;
        int i2 = f3247 + 83;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        m8700(activity);
        int i4 = f3247 + 31;
        f3248 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ */
    final /* synthetic */ void mo8653(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = f3247 + 57;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        m8701(activity, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ */
    final /* synthetic */ void mo5789(Activity activity, List list) {
        int i = 2 % 2;
        int i2 = f3248 + 111;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
        m8684(activity, (List<WebView>) list);
        int i4 = f3248 + 43;
        f3247 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static {
        m8680();
        f3250 = m8683(Gravity.getAbsoluteGravity(0, 0) + 39, ImageFormat.getBitsPerPixel(0) + 38, "\tￊ\u0005\u000e\u000b\n\u000f\u000b\u0011\u000e\uffff\u0001ￊ�\u0000\r\u0011�\b\u0005\u0010\u0015\u000f\u0000\u0007ￊ\u000f\u0000\u0007ￊ\uffdd\u0000\uffef\u0004\u000b\u0013\n\uffff\u000b", false, TextUtils.lastIndexOf("", '0', 0) + 261).intern();
        int i = f3247 + 111;
        f3248 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    y(JSONObject jSONObject, ja jaVar) {
        super(jaVar);
        this.f3254 = false;
        this.f3256 = false;
        this.f3253 = false;
        this.f3252 = false;
        m8703(jSONObject);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    final void m8703(JSONObject jSONObject) {
        int i = 2 % 2;
        d dVar = new d(this, jSONObject);
        m8651(dVar);
        this.f3251 = dVar;
        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.4

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f3268 = 78809993641010138L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f3269 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f3270 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i2 = 2 % 2;
                try {
                    y yVar = y.this;
                    y.m8695(yVar, Class.forName(d.m8713(y.m8682(yVar))));
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.4.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            y.this.m8699();
                        }
                    });
                    int i3 = f3270 + 91;
                    f3269 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (ClassNotFoundException e) {
                    m.m8527(m8705("㺤㻥\u0b12⢫鯔\udc14ꌦ놺령\u0b7c죁㉎‵䧜뫘䋾郲\ud964⦔텢Ͷ", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), new StringBuilder().append(m8705("睿眺츉\ueda1碬㽪긵\uf865絫\ue81a엔㽋槜賗妋俤\ud92eᱵ쫡\udc32䪫꼜먞沟먁㺎⮸ﴶ⭼乣鬡Ɍ鲇", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()).append(d.m8713(y.m8682(y.this))).append(m8705("傥傟帘緢좩ᒐ", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern()).append(e.getLocalizedMessage()).toString());
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m8705(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (g.f2155) {
                    char[] m7785 = g.m7785(f3268, cArr2, i2);
                    g.f2157 = 4;
                    while (g.f2157 < m7785.length) {
                        g.f2156 = g.f2157 - 4;
                        m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f3268));
                        g.f2157++;
                    }
                    str2 = new String(m7785, 4, m7785.length - 4);
                }
                return str2;
            }
        });
        int i2 = f3248 + 17;
        f3247 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8699() {
        int i = 2 % 2;
        int i2 = f3247 + 43;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        jt.m8290().m8295(this);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8702() {
        int i = 2 % 2;
        int i2 = f3247 + 53;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        m8631((t) null);
        m8704((jr) null);
        jt.m8290().m8291(this);
        int i4 = f3247 + 59;
        f3248 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8704(jr jrVar) {
        int i = 2 % 2;
        int i2 = f3247 + 51;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        this.f3257 = jrVar;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private jr m8681() {
        int i = 2 % 2;
        int i2 = f3247;
        int i3 = i2 + 19;
        f3248 = i3 % 128;
        int i4 = i3 % 2;
        jr jrVar = this.f3257;
        int i5 = i2 + 39;
        f3248 = i5 % 128;
        if (i5 % 2 == 0) {
            return jrVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m8690(Activity activity) {
        int i = 2 % 2;
        int i2 = f3248 + 35;
        f3247 = i2 % 128;
        if (i2 % 2 != 0) {
            return activity.findViewById(R.id.content);
        }
        activity.findViewById(R.id.content);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ */
    final t<WebView, Activity> mo5788() {
        int i = 2 % 2;
        int i2 = f3248;
        int i3 = i2 + 83;
        f3247 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        f3247 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jr
    /* renamed from: ﾇ */
    public final void mo5970(final Activity activity) {
        int i = 2 % 2;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    y.m8693(y.this).mo5970(activity);
                }
            }
        });
        int i2 = f3247 + 105;
        f3248 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jr
    /* renamed from: ﾒ */
    public final void mo5971(final Activity activity) {
        int i = 2 % 2;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    y.m8693(y.this).mo5971(activity);
                }
            }
        });
        int i2 = f3248 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3247 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        int i = 2 % 2;
        m8685(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    y.m8693(y.this).onActivityCreated(activity, bundle);
                    y.m8691();
                    y.m8686(y.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        y.m8689(y.this, bundle2.getBoolean(y.m8676()));
                        if (y.m8692(y.this)) {
                            y.m8686(y.this, true);
                        }
                        y.m8694(y.this, true);
                        return;
                    }
                    y.m8689(y.this, false);
                }
            }
        });
        int i2 = f3248 + 51;
        f3247 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        int i = 2 % 2;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.7
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    y.m8693(y.this).onActivityStarted(activity);
                }
            }
        });
        int i2 = f3247 + 31;
        f3248 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        int i = 2 % 2;
        m8685(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.8
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.8.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            y.m8693(y.this).onActivityResumed(activity);
                        }
                    });
                    y.m8698(y.this, false);
                    y.m8686(y.this, true);
                    if ((!y.m8692(y.this) || y.m8696(y.this)) && !activity.isFinishing()) {
                        y yVar = y.this;
                        Activity activity2 = activity;
                        yVar.m8701(activity2, y.m8687(activity2));
                    }
                    y.m8694(y.this, false);
                }
            }
        });
        int i2 = f3248 + 99;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        int i = 2 % 2;
        m8685(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.9
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    y.m8693(y.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(y.m8676(), y.m8692(y.this));
                    }
                    y.m8698(y.this, true);
                }
            }
        });
        int i2 = f3247 + 95;
        f3248 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        int i = 2 % 2;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.10
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    y.m8693(y.this).onActivityPaused(activity);
                }
            }
        });
        int i2 = f3247 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        int i = 2 % 2;
        m8685(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.6
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.6.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            y.m8693(y.this).onActivityStopped(activity);
                        }
                    });
                    if (y.m8688(y.this) && !y.m8678(y.this) && activity.isFinishing()) {
                        y.this.m8700(activity);
                    }
                }
            }
        });
        int i2 = f3247 + 55;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        int i = 2 % 2;
        m8685(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (y.m8697(y.this, activity)) {
                    p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            y.m8693(y.this).onActivityDestroyed(activity);
                        }
                    });
                    if (y.m8688(y.this) && y.m8692(y.this) && activity.isFinishing()) {
                        y.this.m8700(activity);
                    }
                }
            }
        });
        int i2 = f3247 + 81;
        f3248 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8685(je jeVar) {
        int i = 2 % 2;
        int i2 = f3247 + 9;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!d.m8715(this.f3251)) {
            p.m8549(jeVar);
            int i4 = f3248 + 67;
            f3247 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i5 = f3248 + 93;
        f3247 = i5 % 128;
        if (i5 % 2 != 0) {
            p.m8554(jeVar);
        } else {
            p.m8554(jeVar);
            super.hashCode();
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8684(Activity activity, List<WebView> list) {
        int i = 2 % 2;
        int i2 = f3247 + 27;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        kq.m8510(activity, WebView.class, d.m8711(this.f3251), d.m8710(this.f3251), false, false, null, this.f3251.f3244, list);
        int i4 = f3247 + 7;
        f3248 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean m8677(Activity activity) {
        int i = 2 % 2;
        int i2 = f3248 + 49;
        f3247 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Class<?> cls = activity.getClass();
            if (this.f3255 == null) {
                return false;
            }
            if (!d.m8717(this.f3251)) {
                return this.f3255.isAssignableFrom(cls);
            }
            int i3 = f3247 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f3248 = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f3255.equals(cls);
            }
            this.f3255.equals(cls);
            super.hashCode();
            throw null;
        }
        activity.getClass();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m8701(Activity activity, String str) {
        int i = 2 % 2;
        if (!this.f3254) {
            this.f3254 = true;
            super.mo8653((y) activity, str);
            int i2 = f3248 + 9;
            f3247 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 20 / 0;
                return;
            }
            return;
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(is.f2583, true);
        } catch (JSONException e) {
            m.m8527(m8683(17 - KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 3, "\u0001\u000e\uffdd\uffff\u0010\u0005\u0012\u0005\u0010\u0015\uffdd\u0000￤�\n\u0000\b", false, 260 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new StringBuilder().append(m8683(32 - Color.red(0), TextUtils.getOffsetAfter("", 0) + 20, "ￅ\t\u0014\ufff3\u0014\u0019\ufff8\n\u0013\tￅ\u0019\u0014ￅ\u000f\u0018\u0014\u0013\uffdfￅ￪\u0017\u0017\u0014\u0017ￅ\u0006\t\t\u000e\u0013\f", false, 251 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()).append(e.getLocalizedMessage()).toString());
        }
        super.m8650(jsonObjectInit, (JSONObject) activity, str);
        int i4 = f3247 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3248 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾒ */
    final z mo5790() {
        int i = 2 % 2;
        ab abVar = new ab();
        int i2 = f3247 + 87;
        f3248 = i2 % 128;
        int i3 = i2 % 2;
        return abVar;
    }

    /* renamed from: ﻐ, reason: avoid collision after fix types in other method and contains not printable characters */
    final void m8700(Activity activity) {
        int i = 2 % 2;
        int i2 = f3248 + 31;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
        super.mo8652((y) activity);
        this.f3254 = false;
        int i4 = f3247 + 89;
        f3248 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m8679(Activity activity) {
        int i = 2 % 2;
        int i2 = f3248 + 41;
        f3247 = i2 % 128;
        int i3 = i2 % 2;
        String hexString = Integer.toHexString(activity.hashCode());
        int i4 = f3247 + 31;
        f3248 = i4 % 128;
        int i5 = i4 % 2;
        return hexString;
    }

    public class d extends x.a {

        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f3286 = 1;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private static char f3287 = 0;

        /* renamed from: ﭸ, reason: contains not printable characters */
        private static int f3288 = 0;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private static long f3289 = 0;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f3290 = -1678541851;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char f3291 = 22123;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f3292 = 11070;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f3293 = 58660;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static char f3294 = 4314;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3295 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private int f3296;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3297;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f3298;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f3299;

        /* renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ String m8710(d dVar) {
            int i = 2 % 2;
            int i2 = f3288;
            int i3 = i2 + 111;
            f3286 = i3 % 128;
            int i4 = i3 % 2;
            String str = dVar.f3298;
            if (i4 == 0) {
                int i5 = 15 / 0;
            }
            int i6 = i2 + 91;
            f3286 = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ int m8711(d dVar) {
            int i = 2 % 2;
            int i2 = f3288;
            int i3 = i2 + 47;
            f3286 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = dVar.f3296;
            int i6 = i2 + 9;
            f3286 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ String m8713(d dVar) {
            int i = 2 % 2;
            int i2 = f3288 + 47;
            f3286 = i2 % 128;
            int i3 = i2 % 2;
            String str = dVar.f3299;
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            return str;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ boolean m8715(d dVar) {
            int i = 2 % 2;
            int i2 = f3288 + 53;
            f3286 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = dVar.f3295;
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            return z;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ boolean m8717(d dVar) {
            int i = 2 % 2;
            int i2 = f3288;
            int i3 = i2 + 9;
            f3286 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = dVar.f3297;
            int i5 = i2 + 79;
            f3286 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public d(y yVar, JSONObject jSONObject) {
            long j;
            List<String> asList;
            m8708(jSONObject.optString(m8714("鶺䒋オ嵓䥺ೕ짦㚫弯ꌔ㰼蚚늗铐", View.MeasureSpec.makeMeasureSpec(0, 0) + 14).intern()));
            m8716(jSONObject.optString(m8709((-1) - TextUtils.lastIndexOf("", '0'), "ᯗ联즛垴\uf5ea쐃Ǆꮱ\uf588\ue4da\ud897㱐\uecbc㦐ᔱ\ue1d1❟ᤄ놵䑵옆\uef61", "\u0000\u0000\u0000\u0000", "ࡦ錜聝\udc0c", (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern()));
            m8712(jSONObject.optInt(m8709(((Process.getThreadPriority(0) + 20) >> 6) - 33906124, "\uf18e탪⫹댨䘴\uf886烧䈣痥", "\u0000\u0000\u0000\u0000", "㐴甆엽䏶", (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern(), -1));
            m8707(jSONObject.optBoolean(m8709(KeyEvent.keyCodeFromString("") + 1582896338, "ᤢ薸㿾憕ꆴ蠽辩ࡏळ츱榖뉲慿슏ꪾⶊ\ue8a9", "\u0000\u0000\u0000\u0000", "툙夔ﵞ潖", (char) (22270 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()));
            m8706(jSONObject.optBoolean(m8714("奶瘇帵돎㶱䦹깲⪏奶瘇嗸\ue1cf갘\ue269ℯ쵋죭틻䀢ꨴ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19).intern()));
            m8669(jSONObject.optString(m8709(Color.alpha(0), "ꐿ屜⾍璔⮃嶉専卧햧禬", "\u0000\u0000\u0000\u0000", "ࡩ鿠Ύ⎁", (char) (MotionEvent.axisFromString("") + 1)).intern()));
            if (TextUtils.isEmpty(jSONObject.optString(m8714("\ue977垹록\udfaa쵑喘芢獔ꂫ⼇", 9 - KeyEvent.getDeadChar(0, 0)).intern()))) {
                asList = null;
                j = -1;
            } else {
                j = -1;
                asList = Arrays.asList(jSONObject.optString(m8714("\ue977垹록\udfaa쵑喘芢獔ꂫ⼇", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9).intern()).split(m8709((-1181456804) - Color.green(0), "䚶", "\u0000\u0000\u0000\u0000", "尛鑦庹퉁", (char) (16735 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()));
            }
            m8673(asList);
            m8672(jSONObject.optBoolean(m8709(1 - (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)), "\u070e魭퐕❔៓녂ɴ鸊ʢ冐砋ꬥ⢽ﱭ", "\u0000\u0000\u0000\u0000", "淁\ueb72\uda63쾹", (char) (47578 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern()));
            m8671(jSONObject.optBoolean(m8714("\uf34c\u1b4f\ue507颪咂울佑൏幫\ue9bcዞ哩騜锧", Gravity.getAbsoluteGravity(0, 0) + 13).intern(), true));
            m8668(!TextUtils.isEmpty(jSONObject.optString(m8709(Process.myPid() >> 22, "ꐿ屜⾍璔⮃嶉専卧햧禬", "\u0000\u0000\u0000\u0000", "ࡩ鿠Ύ⎁", (char) View.combineMeasuredStates(0, 0)).intern())) || jSONObject.optBoolean(m8709((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + (-1), "Ẳ\uf4c1읞锅꧁훬\ue54d䴜ᕛ턮눗⑻汎쳷뱔뜸", "\u0000\u0000\u0000\u0000", "恍精፨\ud89b", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 39699)).intern()) || jSONObject.optBoolean(m8714("\uf34c\u1b4f袭Ţ札Ὶ눼\u18f6節ᅓ늗铐鵬檬➏ꁼर像", (Process.myTid() >> 22) + 18).intern()));
            m8674(jSONObject.optBoolean(m8709((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "Ẳ\uf4c1읞锅꧁훬\ue54d䴜ᕛ턮눗⑻汎쳷뱔뜸", "\u0000\u0000\u0000\u0000", "恍精፨\ud89b", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39699)).intern()));
            m8665(jSONObject.optBoolean(m8709((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "擤鄏봥怨ᙥ崷姙搧\uef31\uef5c", "\u0000\u0000\u0000\u0000", "焤感閱摽", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()));
            m8675(jSONObject.optBoolean(m8714("\uf34c\u1b4f\ue12d䫠곇\uebe6䥺ೕ蝒兽袭Ţ札Ὶऽ嘎픠㉿吇䋼", TextUtils.lastIndexOf("", '0', 0, 0) + 20).intern()));
            m8667(jSONObject.optBoolean(m8709((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1092848816, "隆撸Ӿ䄦⥶惣亩侻뙕頹࿔봦楸遱ﺢ\uf5cc릦", "\u0000\u0000\u0000\u0000", "儈\udc73늾罏", (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 20403)).intern()));
            m8666(jSONObject.optBoolean(m8709((-738987826) - TextUtils.lastIndexOf("", '0', 0), "ኼ䰍卥奇欁ㆦꅖ騫䔥", "\u0000\u0000\u0000\u0000", "켅\uf3f0駓얃", (char) KeyEvent.keyCodeFromString("")).intern()));
            m8670(kj.m8411(jSONObject.optJSONArray(m8709(ExpandableListView.getPackedPositionChild(0L) - 770190081, "\ue5fd럀\ueb7fሓ蕋븜Ӳﯚ\u0010ꋻ\uf04cⅇ佐", "\u0000\u0000\u0000\u0000", "﹡។ￒ쿮", (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 61183)).intern())));
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private d m8708(String str) {
            int i = 2 % 2;
            int i2 = f3286 + 47;
            int i3 = i2 % 128;
            f3288 = i3;
            int i4 = i2 % 2;
            this.f3299 = str;
            int i5 = i3 + 17;
            f3286 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private d m8716(String str) {
            int i = 2 % 2;
            int i2 = f3288 + 21;
            int i3 = i2 % 128;
            f3286 = i3;
            int i4 = i2 % 2;
            this.f3298 = str;
            int i5 = i3 + 103;
            f3288 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private d m8712(int i) {
            int i2 = 2 % 2;
            int i3 = f3286;
            int i4 = i3 + 53;
            f3288 = i4 % 128;
            int i5 = i4 % 2;
            this.f3296 = i;
            int i6 = i3 + 95;
            f3288 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 23 / 0;
            }
            return this;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        private d m8707(boolean z) {
            int i = 2 % 2;
            int i2 = f3288;
            int i3 = i2 + 95;
            f3286 = i3 % 128;
            int i4 = i3 % 2;
            this.f3297 = z;
            int i5 = i2 + 101;
            f3286 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ﱟ, reason: contains not printable characters */
        private d m8706(boolean z) {
            int i = 2 % 2;
            int i2 = f3288 + 21;
            f3286 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f3295 = z;
                int i3 = 26 / 0;
                return this;
            }
            this.f3295 = z;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m8714(String str, int i) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (o.f3094) {
                char[] cArr3 = new char[cArr2.length];
                o.f3095 = 0;
                char[] cArr4 = new char[2];
                while (o.f3095 < cArr2.length) {
                    cArr4[0] = cArr2[o.f3095];
                    cArr4[1] = cArr2[o.f3095 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr4[1];
                        char c2 = cArr4[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3292)) ^ ((c2 >>> 5) + f3291)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3294) ^ ((c3 + i2) ^ ((c3 << 4) + f3293))));
                        i2 -= 40503;
                    }
                    cArr3[o.f3095] = cArr4[0];
                    cArr3[o.f3095 + 1] = cArr4[1];
                    o.f3095 += 2;
                }
                str2 = new String(cArr3, 0, i);
            }
            return str2;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m8709(int i, String str, String str2, String str3, char c) {
            String str4;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                cArr5 = str.toCharArray();
            }
            char[] cArr6 = cArr5;
            synchronized (f.f2042) {
                char[] cArr7 = (char[]) cArr2.clone();
                char[] cArr8 = (char[]) cArr4.clone();
                cArr7[0] = (char) (c ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i));
                int length = cArr6.length;
                char[] cArr9 = new char[length];
                f.f2041 = 0;
                while (f.f2041 < length) {
                    int i2 = (f.f2041 + 2) % 4;
                    int i3 = (f.f2041 + 3) % 4;
                    f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                    cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                    cArr7[i3] = f.f2043;
                    cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr6[f.f2041]) ^ f3289) ^ f3290) ^ f3287);
                    f.f2041++;
                }
                str4 = new String(cArr9);
            }
            return str4;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8683(int i, int i2, String str, boolean z, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1644) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1641 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1641 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1643 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1641];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1641] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1643 + i3);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f3249);
                com.ironsource.adqualitysdk.sdk.i.d.f1641++;
            }
            if (i2 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1642 = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1642, com.ironsource.adqualitysdk.sdk.i.d.f1642);
                System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1642, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1641 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1641 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1641] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1641) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
