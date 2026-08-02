package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.i.jw;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class cl {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1361 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1362 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private ju f1363;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private cp f1364;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private w f1365;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private js f1366 = null;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private JSONObject f1367;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private dc f1368;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee f1369;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ic f1370;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ck f1371;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private be f1372;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f1360 = {1860317039, -1330722908, -322560091, 1444913596, -948547386, -416898581, -2004718925, -1526744215, 1446232069, 1496849647, 692336720, -878766901, 913135857, -386068479, -1129967580, -249245921, 537887988, 149874144};

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1359 = Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m7169(cl clVar, iy iyVar, boolean z) {
        int i = 2 % 2;
        int i2 = f1361 + 49;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        clVar.m7195(iyVar, z);
        int i4 = f1362 + 47;
        f1361 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ee m7174(cl clVar) {
        int i = 2 % 2;
        int i2 = f1362;
        int i3 = i2 + 45;
        f1361 = i3 % 128;
        int i4 = i3 % 2;
        ee eeVar = clVar.f1369;
        int i5 = i2 + 111;
        f1361 = i5 % 128;
        if (i5 % 2 == 0) {
            return eeVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7176(cl clVar, String str, boolean z, boolean z2, List list) {
        int i = 2 % 2;
        int i2 = f1361 + 11;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        clVar.m7198(str, z, z2, (List<Object>) list);
        int i4 = f1362 + 49;
        f1361 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m7187(Activity activity, List list) {
        int i = 2 % 2;
        int i2 = f1361 + 65;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        boolean m7172 = m7172(activity, (List<String>) list);
        int i4 = f1361 + 33;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
        return m7172;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m7193(cl clVar, Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = f1361 + 79;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m7183 = clVar.m7183(activity, bundle);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return m7183;
    }

    protected cl(cp cpVar, dc dcVar, be beVar, ic icVar, ee eeVar) {
        this.f1370 = icVar;
        ee eeVar2 = new ee(new HashMap(), eeVar, true);
        this.f1369 = eeVar2;
        eeVar2.m7717(m7210().m7932());
        eeVar.m7713(icVar.m7928(), this);
        this.f1368 = dcVar;
        this.f1372 = beVar;
        this.f1371 = m7156();
        this.f1364 = cpVar;
        this.f1365 = new w();
        m7197(m7167(new int[]{1708820623, 1001152392, 1938309327, -962546325, -1009309914, 1480401082, 1325773384, 281166181, -1166893187, 1763790414, -1131240364, 1624549410, -224986543, 1191355930}, 26 - Process.getGidForName("")).intern(), new ArrayList());
        m7161();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final cp m7208() {
        int i = 2 % 2;
        int i2 = f1362;
        int i3 = i2 + 45;
        f1361 = i3 % 128;
        int i4 = i3 % 2;
        cp cpVar = this.f1364;
        int i5 = i2 + 37;
        f1361 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return cpVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context m7214() {
        int i = 2 % 2;
        int i2 = f1361 + 3;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        Context m7289 = m7208().m7289();
        int i4 = f1361 + 65;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
        return m7289;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m7215(iv ivVar) {
        int i = 2 % 2;
        int i2 = f1362 + 11;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        this.f1364.m7292().m6289(ivVar);
        int i4 = f1361 + 9;
        f1362 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m7207(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1361 + 67;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        this.f1367 = kj.m8418(jSONObject, true);
        int i4 = f1361 + 69;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private dp m7162() {
        int i = 2 % 2;
        int i2 = f1362 + 113;
        f1361 = i2 % 128;
        if (i2 % 2 != 0) {
            m7208().m7291();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        dp m7291 = m7208().m7291();
        int i3 = f1361 + 45;
        f1362 = i3 % 128;
        int i4 = i3 % 2;
        return m7291;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m7212() {
        int i = 2 % 2;
        int i2 = f1361;
        int i3 = i2 + 39;
        f1362 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        JSONObject jSONObject = this.f1367;
        int i4 = i2 + 103;
        f1362 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ic m7210() {
        int i = 2 % 2;
        int i2 = f1361 + 77;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        ic icVar = this.f1370;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return icVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final be m7206() {
        int i = 2 % 2;
        int i2 = f1362 + 19;
        int i3 = i2 % 128;
        f1361 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        be beVar = this.f1372;
        int i4 = i3 + 113;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
        return beVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final dc m7201() {
        int i = 2 % 2;
        int i2 = f1362 + 1;
        int i3 = i2 % 128;
        f1361 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        dc dcVar = this.f1368;
        int i4 = i3 + 81;
        f1362 = i4 % 128;
        if (i4 % 2 != 0) {
            return dcVar;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ck m7205() {
        int i = 2 % 2;
        int i2 = f1362 + 79;
        f1361 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1371;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final ee m7202() {
        int i = 2 % 2;
        int i2 = f1362 + 113;
        f1361 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1369;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m7203() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7208().m7303()).append(m7167(new int[]{-217390633, -1850455822}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1).intern()).append(m7210().m7928()).toString();
        int i2 = f1361 + 13;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final dz m7209(String str) {
        int i = 2 % 2;
        int i2 = f1362 + 69;
        int i3 = i2 % 128;
        f1361 = i3;
        int i4 = i2 % 2;
        if (str == null) {
            return null;
        }
        int i5 = i3 + 109;
        f1362 = i5 % 128;
        if (i5 % 2 != 0) {
            return m7210().m7933(str);
        }
        m7210().m7933(str);
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m7161() {
        int i = 2 % 2;
        int i2 = f1362 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<dm> it = m7210().m7930().iterator();
        while (!(!it.hasNext())) {
            dm next = it.next();
            if (m7178(next)) {
                int i4 = f1362 + 63;
                f1361 = i4 % 128;
                int i5 = i4 % 2;
                m7185(next);
            }
            int i6 = f1362 + 109;
            f1361 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m7168(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1361 + 27;
        f1362 = i2 % 128;
        if (i2 % 2 != 0) {
            JSONObject m7204 = m7204();
            kj.m8425(m7204, jSONObject);
            int i3 = f1362 + 87;
            f1361 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 0;
            }
            return m7204;
        }
        kj.m8425(m7204(), jSONObject);
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final JSONObject m7204() {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(is.f2637, m7208().m7302());
            jsonObjectInit.put(is.f2592, m7208().m7296());
            jsonObjectInit.put(is.f2588, m7208().m7298());
        } catch (JSONException e2) {
            m.m8527(m7167(new int[]{1708820623, 1001152392, 1938309327, -962546325, -1009309914, 1480401082, 1325773384, 281166181}, TextUtils.indexOf((CharSequence) "", '0', 0) + 17).intern(), new StringBuilder().append(m7182(Gravity.getAbsoluteGravity(0, 0) + 27, true, 225 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0007\u0018\u0007ￂ\t\u0010\u000b\u0016\u0003\u0007\u0014\u0005ￂ\u0014\u0011\u0014\u0014\uffe7ￂￜ\u0010\u0011\u0015\fￂ\u0016\u0010", Color.alpha(0) + 18).intern()).append(e2.getLocalizedMessage()).toString());
        }
        int i2 = f1362 + 63;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        return jsonObjectInit;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7185(dm dmVar) {
        float f2;
        char c2;
        char c3;
        int i = 2 % 2;
        String m7589 = dmVar.m7589();
        switch (m7589.hashCode()) {
            case -1825565413:
                f2 = 0.0f;
                c2 = 4;
                if (m7589.equals(m7167(new int[]{1989079607, -53043683, 629314644, 412616326, 221114825, 964774119, 1364080971, 1117982860, -293436301, -618362377}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17).intern())) {
                    int i2 = f1362 + 41;
                    f1361 = i2 % 128;
                    if (i2 % 2 == 0) {
                        c3 = 3;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                }
                c3 = 65535;
                break;
            case -1655966961:
                f2 = 0.0f;
                c2 = 4;
                if (m7589.equals(m7182(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9, true, 241 - TextUtils.getTrimmedLength(""), "￼\u0007\ufff6\ufff4\f\u0007￼\t", 4 - Color.red(0)).intern())) {
                    int i3 = f1361 + 79;
                    int i4 = i3 % 128;
                    f1362 = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 7;
                    f1361 = i6 % 128;
                    int i7 = i6 % 2;
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -787751952:
                f2 = 0.0f;
                c2 = 4;
                if (m7589.equals(m7182(6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 242, "\ufffb\u0000\ufff6\u0001\t\t", 4 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 3619493:
                f2 = 0.0f;
                c2 = 4;
                if (m7589.equals(m7167(new int[]{-1750295589, 9689975}, 4 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    int i8 = f1362;
                    int i9 = i8 + 99;
                    f1361 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i8 + 15;
                    f1361 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 2 / 2;
                    }
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 1144592183:
                f2 = 0.0f;
                c2 = 4;
                if (m7589.equals(m7167(new int[]{-910707418, 973586255, 1822206439, 823999236}, 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    int i13 = f1361 + 55;
                    f1362 = i13 % 128;
                    int i14 = i13 % 2;
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            default:
                f2 = 0.0f;
                c2 = 4;
                c3 = 65535;
                break;
        }
        if (c3 == 0) {
            m7194(dmVar);
            m7196(m7182((ViewConfiguration.getKeyRepeatDelay() >> 16) + 8, true, 289 - AndroidCharacter.getMirror('0'), "￼\u0007\ufff6\ufff4\f\u0007￼\t", (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)) + 4).intern(), dmVar);
            int i15 = f1361 + 93;
            f1362 = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (c3 == 1) {
            m7164(dmVar);
            m7196(m7167(new int[]{-1750295589, 9689975}, Color.rgb(0, 0, 0) + 16777220).intern(), dmVar);
            return;
        }
        if (c3 == 2) {
            m7170(dmVar);
            m7196(m7182((ViewConfiguration.getWindowTouchSlop() >> 8) + 6, false, 242 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\ufffb\u0000\ufff6\u0001\t\t", 5 - TextUtils.indexOf("", "", 0, 0)).intern(), dmVar);
            return;
        }
        if (c3 == 3) {
            if (this.f1366 == null) {
                this.f1366 = m7165(m7163(dmVar.m7590()));
                jt.m8290().m8295(this.f1366);
                return;
            }
            return;
        }
        if (c3 != c2) {
            return;
        }
        this.f1363 = new ju(m7188(m7163(dmVar.m7590())));
        int i16 = f1361 + 91;
        f1362 = i16 % 128;
        int i17 = i16 % 2;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    protected final void m7200() {
        int i = 2 % 2;
        m7158();
        m7160();
        m7159();
        if (this.f1366 != null) {
            jt.m8290().m8291(this.f1366);
            this.f1366 = null;
            int i2 = f1361 + 23;
            f1362 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 3;
            }
        }
        ju juVar = this.f1363;
        if (juVar != null) {
            int i4 = f1362 + 57;
            f1361 = i4 % 128;
            int i5 = i4 % 2;
            juVar.m8307();
            this.f1363 = null;
        }
        this.f1371 = null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7194(dm dmVar) {
        ja jaVar;
        int i = 2 % 2;
        JSONObject m7184 = m7184(dmVar.m7587());
        if (m7184 != null) {
            final String m7585 = dmVar.m7585();
            if (!TextUtils.isEmpty(m7585)) {
                final dz m7209 = m7209(m7585);
                if (m7209 != null) {
                    jaVar = new ja() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.1

                        /* renamed from: ﮐ, reason: contains not printable characters */
                        private static int f1373 = 1;

                        /* renamed from: ﱡ, reason: contains not printable characters */
                        private static char f1374 = 39076;

                        /* renamed from: ﺙ, reason: contains not printable characters */
                        private static int f1375 = 0;

                        /* renamed from: ﻏ, reason: contains not printable characters */
                        private static char f1376 = 31488;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static char f1377 = 9466;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static char f1378 = 64344;

                        @Override // com.ironsource.adqualitysdk.sdk.i.ja
                        /* renamed from: ﾇ, reason: contains not printable characters */
                        public final List<WebView> mo7217(Object obj) {
                            int i2 = 2 % 2;
                            int i3 = f1373 + 7;
                            f1375 = i3 % 128;
                            try {
                                if (i3 % 2 == 0) {
                                    List<WebView> list = (List) m7209.m7671(cl.m7174(cl.this), cl.this, Collections.singletonList(obj)).m7684();
                                    int i4 = f1373 + 81;
                                    f1375 = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        return list;
                                    }
                                    throw null;
                                }
                                throw null;
                            } catch (Exception unused) {
                                m.m8527(m7216("睲ꎮ⟻\uf110嚫持胸䰌西偛\ue91cꕔ裝\ue3aeᵗ瘱", Color.blue(0) + 16).intern(), new StringBuilder().append(m7216("鋐촎潹喚盏ቐꚜ叅쎳㈜蹩偪ꨴ噦ѵ\uf1ef\uf8ecᬔ\ud896쌑鰴禱\ud9ceꐃ潹喚ዺ䙽", (-16777188) - Color.rgb(0, 0, 0)).intern()).append(m7585).toString());
                                return null;
                            }
                        }

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static String m7216(String str, int i2) {
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
                                    int i3 = 58224;
                                    for (int i4 = 0; i4 < 16; i4++) {
                                        char c2 = cArr4[1];
                                        char c3 = cArr4[0];
                                        char c4 = (char) (c2 - (((c3 + i3) ^ ((c3 << 4) + f1374)) ^ ((c3 >>> 5) + f1376)));
                                        cArr4[1] = c4;
                                        cArr4[0] = (char) (c3 - (((c4 >>> 5) + f1377) ^ ((c4 + i3) ^ ((c4 << 4) + f1378))));
                                        i3 -= 40503;
                                    }
                                    cArr3[o.f3095] = cArr4[0];
                                    cArr3[o.f3095 + 1] = cArr4[1];
                                    o.f3095 += 2;
                                }
                                str2 = new String(cArr3, 0, i2);
                            }
                            return str2;
                        }
                    };
                    m7186(m7184, m7181(false), m7181(true), jaVar);
                    int i2 = f1362 + 97;
                    f1361 = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    cn.m7273(m7203(), new StringBuilder().append(m7182((KeyEvent.getMaxKeyCode() >> 16) + 22, true, 226 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0006\u0005\uffc1\u0005\u0010\t\u0015\u0006￮\uffc1\u0013\u0010\u0007\uffc1\u000f\u0010\n\u0015\n\u000f\n\u0007", AndroidCharacter.getMirror('0') - '\'').intern()).append(m7585).append(m7167(new int[]{-1087524044, -2062297587, 1512150997, -217056271, -283034133, 357507171}, 10 - View.MeasureSpec.getSize(0)).intern()).toString());
                }
            }
            jaVar = null;
            m7186(m7184, m7181(false), m7181(true), jaVar);
            int i22 = f1362 + 97;
            f1361 = i22 % 128;
            int i32 = i22 % 2;
        }
        int i4 = f1361 + 45;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7186(JSONObject jSONObject, l lVar, l lVar2, ja jaVar) {
        int i = 2 % 2;
        int i2 = f1361 + 11;
        f1362 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1365.m8643(jSONObject, m7180(lVar, lVar2), m7157(), jaVar);
            throw null;
        }
        this.f1365.m8643(jSONObject, m7180(lVar, lVar2), m7157(), jaVar);
        int i3 = f1361 + 21;
        f1362 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7164(dm dmVar) {
        int i = 2 % 2;
        JSONObject m7184 = m7184(dmVar.m7587());
        if (m7184 != null) {
            int i2 = f1362 + 47;
            f1361 = i2 % 128;
            int i3 = i2 % 2;
            String m7586 = dmVar.m7586();
            q m7175 = m7175(true);
            q m71752 = m7175(false);
            if (TextUtils.isEmpty(m7586)) {
                m7171(m7184, m71752, m7175);
                int i4 = f1362 + 9;
                f1361 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            final dz m7209 = m7209(m7586);
            if (m7209 == null) {
                cn.m7273(m7203(), new StringBuilder().append(m7182((ViewConfiguration.getTouchSlop() >> 8) + 22, true, 227 - Color.green(0), "\u0006\u0005\uffc1\u0005\u0010\t\u0015\u0006￮\uffc1\u0013\u0010\u0007\uffc1\u000f\u0010\n\u0015\n\u000f\n\u0007", (ViewConfiguration.getTapTimeout() >> 16) + 9).intern()).append(m7586).append(m7167(new int[]{-1087524044, -2062297587, 1512150997, -217056271, -283034133, 357507171}, Color.argb(0, 0, 0, 0) + 10).intern()).toString());
                return;
            }
            m7199(m7184, m71752, m7175, new jc() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.10
                @Override // com.ironsource.adqualitysdk.sdk.i.jc
                /* renamed from: ｋ, reason: contains not printable characters */
                public final boolean mo7218(View view) {
                    return m7209.m7671(cl.m7174(cl.this), cl.this, Collections.singletonList(view)).m7682();
                }
            });
            int i6 = f1361 + 53;
            f1362 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7170(dm dmVar) {
        int i = 2 % 2;
        JSONObject m7184 = m7184(dmVar.m7587());
        if (m7184 != null) {
            int i2 = f1362 + 57;
            f1361 = i2 % 128;
            int i3 = i2 % 2;
            m7177(m7184, m7166(false), m7166(true));
            int i4 = f1361 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f1362 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f1362 + 101;
        f1361 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 12 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7196(String str, dm dmVar) {
        int i = 2 % 2;
        int i2 = f1362 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m7184 = m7184(dmVar.m7587());
        if (m7184 == null || !m7184.has(m7182(Color.red(0) + 18, true, TextUtils.lastIndexOf("", '0', 0) + 238, "￫\u0005\u0006\u0000\u000b\ufffa￼\u000b￼ￛ\uffff\ufffa\f\u0006\u000b￼\u0007\u0010", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15).intern())) {
            return;
        }
        int i4 = f1361 + 87;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
        jw.e m8317 = jw.e.m8317(m7184.optString(m7182(18 - (Process.myTid() >> 22), true, 237 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "￫\u0005\u0006\u0000\u000b\ufffa￼\u000b￼ￛ\uffff\ufffa\f\u0006\u000b￼\u0007\u0010", 15 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), null));
        String m7192 = m7192(str, m7184);
        if (m8317 != null) {
            int i6 = f1361 + 113;
            f1362 = i6 % 128;
            if (i6 % 2 != 0) {
                jw.m8308().m8315(m7192, m8317);
            } else {
                jw.m8308().m8315(m7192, m8317);
                throw null;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7177(JSONObject jSONObject, v vVar, v vVar2) {
        int i = 2 % 2;
        int i2 = f1362 + 73;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        this.f1365.m8641(jSONObject, m7190(vVar, vVar2));
        int i4 = f1361 + 45;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private void m7159() {
        int i = 2 % 2;
        int i2 = f1361 + 61;
        f1362 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1365.m8640();
            int i3 = 61 / 0;
        } else {
            this.f1365.m8640();
        }
        int i4 = f1362 + 35;
        f1361 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m7171(JSONObject jSONObject, q qVar, q qVar2) {
        int i = 2 % 2;
        int i2 = f1361 + 113;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        this.f1365.m8639(jSONObject, m7189(qVar, qVar2));
        int i4 = f1362 + 97;
        f1361 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7199(JSONObject jSONObject, q qVar, q qVar2, jc jcVar) {
        int i = 2 % 2;
        int i2 = f1361 + 67;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        this.f1365.m8644(jSONObject, m7189(qVar, qVar2), jcVar);
        int i4 = f1362 + 83;
        f1361 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6 != com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.UNKNOWN) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r6 != com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.UNKNOWN) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r1.contains(r6) == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        return true;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m7178(dm dmVar) {
        int i = 2 % 2;
        int i2 = f1361 + 115;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        List mo6042 = ar.m6041().mo6042();
        ISAdQualityAdType m7588 = dmVar.m7588();
        if (mo6042 != null) {
            int i4 = f1362 + 105;
            f1361 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
        }
        int i6 = f1362 + 27;
        f1361 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private void m7160() {
        int i = 2 % 2;
        int i2 = f1361 + 85;
        f1362 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1365.m8642();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f1365.m8642();
        int i3 = f1361 + 85;
        f1362 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7192(String str, JSONObject jSONObject) {
        char c2;
        int i = 2 % 2;
        int hashCode = str.hashCode();
        if (hashCode == -1655966961) {
            if (str.equals(m7182(8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), true, View.MeasureSpec.getSize(0) + 241, "￼\u0007\ufff6\ufff4\f\u0007￼\t", 3 - Process.getGidForName("")).intern())) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != -787751952) {
            if (hashCode == 3619493 && str.equals(m7167(new int[]{-1750295589, 9689975}, 4 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                int i2 = f1361 + 49;
                f1362 = i2 % 128;
                int i3 = i2 % 2;
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals(m7182((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6, false, 242 - (Process.myTid() >> 22), "\ufffb\u0000\ufff6\u0001\t\t", 4 - ImageFormat.getBitsPerPixel(0)).intern())) {
                int i4 = f1362 + 89;
                f1361 = i4 % 128;
                int i5 = i4 % 2;
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            return jSONObject.optString(m7167(new int[]{-1622968713, -1357284248, -536694828, -468983844, -2027944240, -8801527, 493075085, -18242798}, 13 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), null);
        }
        if (c2 == 1) {
            return jSONObject.optString(m7182((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, false, 231 - KeyEvent.keyCodeFromString(""), "\n\u0002\ufffe\u0001\ufff3\u0006\u0002\u0014￠\t\ufffe\u0010\u0010￫\ufffe", TextUtils.getOffsetBefore("", 0) + 2).intern(), null);
        }
        if (c2 != 2) {
            return null;
        }
        return jSONObject.optString(m7167(new int[]{-1750295589, 9689975, -1173875190, 450753665, 1107441653, 195144600, -293436301, -618362377}, 12 - MotionEvent.axisFromString("")).intern(), null);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private js m7165(final List<String> list) {
        int i = 2 % 2;
        js jsVar = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.8

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f1430 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f1431 = 1384324612079449931L;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f1432 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static long f1433 = 4240266721058687362L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            static /* synthetic */ void m7252(AnonymousClass8 anonymousClass8, String str, List list2) {
                int i2 = 2 % 2;
                int i3 = f1430 + 67;
                f1432 = i3 % 128;
                int i4 = i3 % 2;
                anonymousClass8.m7255(str, false, list2);
                int i5 = f1432 + 47;
                f1430 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* renamed from: ﾇ */
            public final void mo5970(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1430 + 103;
                f1432 = i3 % 128;
                int i4 = i3 % 2;
                m7253(m7251("ꉮꈁℌ䗪\u0fee⣠嚯ጘ萖໕粃䴎\uee0a瓊᪑机퀗嫵삝脗㨼胁\ueebb묦ᰢ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), activity);
                int i5 = f1432 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f1430 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 42 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* renamed from: ﾒ */
            public final void mo5971(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1432 + 83;
                f1430 = i3 % 128;
                int i4 = i3 % 2;
                m7253(m7251("彎弡\u2ef8룻鿭✔ꮾ茛礶Ġ膒\udd17ጫ笘\ue781\uf71eⴲ唶㶈ᄵ윁輨Ꮊ⬬\ue114\ue93d榢䔭묚", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), activity);
                int i5 = f1430 + 59;
                f1432 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = f1432 + 103;
                f1430 = i3 % 128;
                int i4 = i3 % 2;
                if (cl.m7187(activity, list)) {
                    int i5 = f1430 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                    f1432 = i5 % 128;
                    m7257((i5 % 2 != 0 ? m7256("眤ᤖ\uab6c㶱쿳凝\ue20f瑇ڧ꣹㫶쬈嵊\uefbd燵ϓ鐟", 16823 / (ViewConfiguration.getEdgeSlop() / 37)) : m7256("眤ᤖ\uab6c㶱쿳凝\ue20f瑇ڧ꣹㫶쬈嵊\uefbd燵ϓ鐟", 28211 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), activity, bundle);
                }
                int i6 = f1430 + 23;
                f1432 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 37 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1430 + 65;
                f1432 = i3 % 128;
                int i4 = i3 % 2;
                if (cl.m7187(activity, list)) {
                    m7253(m7256("眤ᴘꍰ䦟\udfcb搓\u0a53邉⛗쬗兺\ue7a0跶ሠ롩亽퓿", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27197).intern(), activity);
                }
                int i5 = f1432 + 79;
                f1430 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1430 + 91;
                f1432 = i3 % 128;
                int i4 = i3 % 2;
                if (!(!cl.m7187(activity, list))) {
                    m7253(m7251("絋紤꺿퇀\uf395ꝓ슅\uef70嬷腜\ue8ba녲ㄯﭔ躆魦༠핐咱絮\ue50f", ViewConfiguration.getLongPressTimeout() >> 16).intern(), activity);
                }
                int i5 = f1432 + 65;
                f1430 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1430 + 15;
                f1432 = i3 % 128;
                int i4 = i3 % 2;
                if (cl.m7187(activity, list)) {
                    int i5 = f1432 + 77;
                    f1430 = i5 % 128;
                    int i6 = i5 % 2;
                    m7253(m7251("⑁\u242e똾㈉赀뿒⅌醥Ƚ駝୳쾧栥\ue3d5浍\ue5b7嘬췗띰κ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), activity);
                    int i7 = f1432 + 107;
                    f1430 = i7 % 128;
                    int i8 = i7 % 2;
                }
                int i9 = f1430 + 89;
                f1432 = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1430 + 7;
                f1432 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    if (cl.m7187(activity, list)) {
                        m7253(m7256("眤뜒\uf764㞍矣똱\uf677㚣皇뛝\uf53e㕢疰뗰\uf439㐗瑟", 49255 - AndroidCharacter.getMirror('0')).intern(), activity);
                    }
                    int i4 = f1430 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                    f1432 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    super.hashCode();
                    throw null;
                }
                cl.m7187(activity, list);
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = f1430 + 93;
                f1432 = i3 % 128;
                if (i3 % 2 == 0) {
                    if (cl.m7187(activity, list)) {
                        m7257(m7251("蠞衱◃\ud7ffᜯⰯ쒺ொ깢ਠ\uee85嗈쑺瀨袸翘並帼努駟၍萕粺ꏧ㙕\ue20cڀ췵汏젅₮", View.resolveSizeAndState(0, 0, 0)).intern(), activity, bundle);
                        int i4 = f1432 + 97;
                        f1430 = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    return;
                }
                cl.m7187(activity, list);
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1432 + 3;
                f1430 = i3 % 128;
                int i4 = i3 % 2;
                if (cl.m7187(activity, list)) {
                    int i5 = f1430 + 33;
                    f1432 = i5 % 128;
                    int i6 = i5 % 2;
                    m7253(m7251("ﰔﱻ\uf3beฬ휾禍ᵩ쯛\uaa05d㝖闙끰ꙕ兼뿍蹿衐譂姏摍剹ꕬ", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), activity);
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m7253(String str, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1430 + 57;
                f1432 = i3 % 128;
                int i4 = i3 % 2;
                m7254(str, Collections.singletonList(activity));
                if (i4 != 0) {
                    int i5 = 91 / 0;
                }
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private void m7257(String str, Activity activity, Bundle bundle) {
                List<Object> asList;
                int i2 = 2 % 2;
                int i3 = f1430 + 31;
                f1432 = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = new Object[2];
                    objArr[1] = activity;
                    objArr[1] = bundle;
                    asList = Arrays.asList(objArr);
                } else {
                    asList = Arrays.asList(activity, bundle);
                }
                m7254(str, asList);
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private void m7254(final String str, final List<Object> list2) {
                int i2 = 2 % 2;
                m7255(str, true, list2);
                p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.8.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        AnonymousClass8.m7252(AnonymousClass8.this, str, list2);
                    }
                });
                int i3 = f1432 + 23;
                f1430 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private void m7255(String str, boolean z, List<Object> list2) {
                int i2 = 2 % 2;
                cl.m7176(cl.this, new StringBuilder().append(m7251("\uf82a\uf86b슦쮶㒐쭇\ud8c6⡿\ude54\ued45\uf2ce癧둶靝铄屣詑륅仉멢息挪", TextUtils.getTrimmedLength("")).intern()).append(str).toString(), z, false, list2);
                int i3 = f1430 + 59;
                f1432 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m7251(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2155) {
                    char[] m7785 = com.ironsource.adqualitysdk.sdk.i.g.m7785(f1433, cArr2, i2);
                    com.ironsource.adqualitysdk.sdk.i.g.f2157 = 4;
                    while (com.ironsource.adqualitysdk.sdk.i.g.f2157 < m7785.length) {
                        com.ironsource.adqualitysdk.sdk.i.g.f2156 = com.ironsource.adqualitysdk.sdk.i.g.f2157 - 4;
                        m7785[com.ironsource.adqualitysdk.sdk.i.g.f2157] = (char) ((m7785[com.ironsource.adqualitysdk.sdk.i.g.f2157] ^ m7785[com.ironsource.adqualitysdk.sdk.i.g.f2157 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2156 * f1433));
                        com.ironsource.adqualitysdk.sdk.i.g.f2157++;
                    }
                    str2 = new String(m7785, 4, m7785.length - 4);
                }
                return str2;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m7256(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (i.f2454) {
                    i.f2455 = i2;
                    char[] cArr3 = new char[cArr2.length];
                    i.f2453 = 0;
                    while (i.f2453 < cArr2.length) {
                        cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1431);
                        i.f2453++;
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        };
        int i2 = f1361 + 43;
        f1362 = i2 % 128;
        if (i2 % 2 != 0) {
            return jsVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m7172(Activity activity, List<String> list) {
        int i = 2 % 2;
        int i2 = f1361 + 105;
        f1362 = i2 % 128;
        if (i2 % 2 == 0) {
            list.isEmpty();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!list.isEmpty()) {
            int i3 = f1361 + 71;
            f1362 = i3 % 128;
            int i4 = i3 % 2;
            if (!list.contains(activity.getClass().getName())) {
                return false;
            }
        }
        int i5 = f1361 + 107;
        f1362 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m7184(JSONObject jSONObject) {
        dp m7162;
        int i = 2 % 2;
        int i2 = f1361 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        String optString = jSONObject.optString(m7167(new int[]{-351458919, 1379877152, 1710041998, 2053221501}, 8 - (Process.myPid() >> 22)).intern());
        jSONObject.remove(m7167(new int[]{-351458919, 1379877152, 1710041998, 2053221501}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8).intern());
        if (jSONObject.optBoolean(m7167(new int[]{-2106335768, 544960815, -520832964, 803362800}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8).intern()) && (m7162 = m7162()) != null) {
            if (!TextUtils.isEmpty(m7162.m7596())) {
                jSONObject.remove(m7167(new int[]{-2106335768, 544960815, -520832964, 803362800}, 7 - TextUtils.lastIndexOf("", '0')).intern());
                try {
                    jSONObject.put(m7182(10 - (ViewConfiguration.getScrollBarSize() >> 8), true, (ViewConfiguration.getPressedStateDuration() >> 16) + 234, "\u0004\u000e�\uffff\u0004\b￣\t￮\r", Drawable.resolveOpacity(0, 0) + 1).intern(), new StringBuilder().append(optString).append(m7162.m7596()).toString());
                } catch (JSONException unused) {
                }
            }
            if (m7162.m7599()) {
                int i4 = f1362 + 101;
                f1361 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    jSONObject.put(m7167(new int[]{-350757570, -965237085, -945804904, -224094103, -1631001599, -413038060}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10).intern(), true);
                    int i6 = f1362 + 19;
                    f1361 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            if (!m7173(jSONObject, keys.next())) {
                return null;
            }
        }
        return jSONObject;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m7173(JSONObject jSONObject, String str) {
        int i = 2 % 2;
        Object opt = jSONObject.opt(str);
        try {
            if (!(opt instanceof String)) {
                if (!(opt instanceof JSONArray)) {
                    return true;
                }
                jSONObject.put(str, new JSONArray((Collection) m7163(kj.m8409((JSONArray) opt))));
            } else {
                int i2 = f1361 + 39;
                f1362 = i2 % 128;
                if (i2 % 2 != 0) {
                    String str2 = (String) opt;
                    if (!m7179(str2)) {
                        return true;
                    }
                    String m7191 = m7191(str2);
                    if (m7191 != null) {
                        jSONObject.put(str, m7191);
                    } else {
                        cn.m7271(m7203(), new StringBuilder().append(m7167(new int[]{-1173875190, 450753665, -767548341, 550604511}, 6 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()).append(str2).append(m7167(new int[]{-1087524044, -2062297587, 1512150997, -217056271, -331715480, 1226089477, -831609404, -2096967992, 797587097, 997234958, -1645165983, -1643683666, -1412580647, 548486877, 68730649, 274581715, 392681614, -1816707418}, 36 - KeyEvent.getDeadChar(0, 0)).intern()).toString());
                        int i3 = f1361 + 77;
                        f1362 = i3 % 128;
                        int i4 = i3 % 2;
                        return false;
                    }
                } else {
                    m7179((String) opt);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
            }
            return true;
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m7163(List<String> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int i2 = f1361 + 85;
            f1362 = i2 % 128;
            int i3 = i2 % 2;
            if (m7179(str)) {
                String m7191 = m7191(str);
                if (m7191 != null) {
                    int i4 = f1362 + 89;
                    f1361 = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(m7191);
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m7191(String str) {
        int i = 2 % 2;
        int i2 = f1362 + 83;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        Class m6380 = m7206().m6380(kn.m8473(str, m7182(MotionEvent.axisFromString("") + 7, false, TextUtils.lastIndexOf("", '0', 0) + 229, "\u0013ￎ\u0003\f\u0001\u0013", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()));
        if (m6380 == null) {
            return null;
        }
        String name = m6380.getName();
        int i4 = f1362 + 91;
        f1361 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return name;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m7179(String str) {
        int i = 2 % 2;
        int i2 = f1361 + 99;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        boolean endsWith = str.endsWith(m7182(6 - (Process.myPid() >> 22), false, KeyEvent.getDeadChar(0, 0) + 228, "\u0013ￎ\u0003\f\u0001\u0013", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern());
        int i4 = f1361 + 53;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
        return endsWith;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private l m7181(final boolean z) {
        int i = 2 % 2;
        l lVar = new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.14

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f1398 = 0;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f1399 = -6396935853194111139L;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1400 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5820(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + 15;
                f1398 = i3 % 128;
                int i4 = i3 % 2;
                mo5820(jSONObject, webView, activity);
                int i5 = f1400 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1398 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5821(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + 23;
                f1398 = i3 % 128;
                int i4 = i3 % 2;
                mo5821(jSONObject, webView, obj, activity);
                if (i4 != 0) {
                    Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1398 + 37;
                f1400 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 91 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5822(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f1398 = i3 % 128;
                int i4 = i3 % 2;
                mo5822(jSONObject, webView, activity);
                int i5 = f1400 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f1398 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5823(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + 45;
                f1400 = i3 % 128;
                int i4 = i3 % 2;
                mo5823(jSONObject, webView, activity);
                if (i4 == 0) {
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1400 + 111;
                f1398 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5824(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + 37;
                f1398 = i3 % 128;
                int i4 = i3 % 2;
                mo5824(jSONObject, webView, obj, activity);
                if (i4 != 0) {
                    int i5 = 38 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5825(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + 19;
                f1400 = i3 % 128;
                int i4 = i3 % 2;
                mo5825(jSONObject, webView, activity);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5826(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + 59;
                f1400 = i3 % 128;
                int i4 = i3 % 2;
                mo5826(jSONObject, webView, activity);
                int i5 = f1398 + 115;
                f1400 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5827(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + 71;
                f1398 = i3 % 128;
                int i4 = i3 % 2;
                mo5827(jSONObject, webView, obj, activity);
                int i5 = f1398 + 61;
                f1400 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾇ */
            public final void mo5823(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + 67;
                f1398 = i3 % 128;
                int i4 = i3 % 2;
                long elapsedCpuTime = Process.getElapsedCpuTime();
                if (i4 != 0) {
                    m7247(m7248("ᶿᷞꥣ\ue84b戦㹚욵ꑘ䂸巂搉䇌Ꜯףּƍ", (elapsedCpuTime > 1L ? 1 : (elapsedCpuTime == 1L ? 0 : -1))).intern(), jSONObject, webView, null, activity);
                } else {
                    m7247(m7248("ᶿᷞꥣ\ue84b戦㹚욵ꑘ䂸巂搉䇌Ꜯףּƍ", (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1))).intern(), jSONObject, webView, null, activity);
                }
                int i5 = f1400 + 83;
                f1398 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ */
            public final void mo5820(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + 69;
                f1400 = i3 % 128;
                int i4 = i3 % 2;
                m7247(m7248("檹櫘\ue4d4ꄎﮏ班述㷱㞾ၵⵌ\ud865퀨뛴䣈笵犝䬙\ue66a▝", 1 - KeyEvent.keyCodeFromString("")).intern(), jSONObject, webView, null, activity);
                int i5 = f1398 + 15;
                f1400 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ */
            public final void mo5824(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + 33;
                f1400 = i3 % 128;
                if (i3 % 2 == 0) {
                    TextUtils.getTrimmedLength("");
                    m7247(m7248("희휍䉰ᆠⅣ핉㽙\ue718話뛂鷥ʍ淠", 0).intern(), jSONObject, webView, obj, activity);
                } else {
                    m7247(m7248("희휍䉰ᆠⅣ핉㽙\ue718話뛂鷥ʍ淠", TextUtils.getTrimmedLength("") + 1).intern(), jSONObject, webView, obj, activity);
                }
                int i4 = f1400 + 55;
                f1398 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ */
            public final void mo5821(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1400 = i3 % 128;
                if (i3 % 2 == 0) {
                    m7247(m7248("ﵾﴟ\ue95e끯い繧麖\uf63fꁣᷬ㰪Ꭺ䟲뭝妿냔\ue54f䚭\uf70a", 1 << View.resolveSizeAndState(0, 1, 1)).intern(), jSONObject, webView, obj, activity);
                } else {
                    m7247(m7248("ﵾﴟ\ue95e끯い繧麖\uf63fꁣᷬ㰪Ꭺ䟲뭝妿냔\ue54f䚭\uf70a", View.resolveSizeAndState(0, 0, 0) + 1).intern(), jSONObject, webView, obj, activity);
                }
                int i4 = f1400 + 27;
                f1398 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ */
            public final void mo5822(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + 101;
                f1398 = i3 % 128;
                int i4 = i3 % 2;
                m7247(m7248("搃摢퍁닭㘸䑸鰔\uf043㤘⟣㺦ᗗ", 1 - TextUtils.getOffsetBefore("", 0)).intern(), jSONObject, webView, null, activity);
                int i5 = f1400 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f1398 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾒ */
            public final void mo5825(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1400 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f1398 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7247(m7248("ℹ⅏ܪ镬픖逞뮳፶簌\uf38fᤶ\uf6fc鮲唇粫喍", (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1)) + 1).intern(), jSONObject, webView, null, activity);
                } else {
                    m7247(m7248("ℹ⅏ܪ镬픖逞뮳፶簌\uf38fᤶ\uf6fc鮲唇粫喍", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern(), jSONObject, webView, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ */
            public final void mo5827(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + 35;
                f1400 = i3 % 128;
                if (i3 % 2 == 0) {
                    m7247(m7248("ꇻꆌ臜ꙙ轱ᛤ袁䤥ﳧ畿⨘겗᭶폚侗\u0fe7맂⸋\ue13b兇푝貔ʽ듢", 0 % KeyEvent.keyCodeFromString("")).intern(), jSONObject, webView, obj, activity);
                } else {
                    m7247(m7248("ꇻꆌ臜ꙙ轱ᛤ袁䤥ﳧ畿⨘겗᭶폚侗\u0fe7맂⸋\ue13b兇푝貔ʽ듢", 1 - KeyEvent.keyCodeFromString("")).intern(), jSONObject, webView, obj, activity);
                }
                int i4 = f1398 + 49;
                f1400 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ */
            public final void mo5826(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1398 + 17;
                f1400 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7247(m7248("紷絔ꦸ堻춻㺐盲\u0bd8\u202c崄푐\uee46잺ﮓ뇭", 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), jSONObject, webView, null, activity);
                } else {
                    Process.getThreadPriority(0);
                    m7247(m7248("紷絔ꦸ堻춻㺐盲\u0bd8\u202c崄푐\uee46잺ﮓ뇭", 0).intern(), jSONObject, webView, null, activity);
                }
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private void m7247(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = 2 % 2;
                cl.m7176(cl.this, new StringBuilder().append(m7248("좼죽ﾑꗣ㫱梯謭ﲏ閾\u0b29⦹ᤃ爕궰䰍멧킓停\ue290\ue4ec봉\uf2ceŇ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()).append(str).toString(), z, false, Arrays.asList(jSONObject, webView, obj, activity));
                int i3 = f1400 + 19;
                f1398 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m7248(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2155) {
                    char[] m7785 = com.ironsource.adqualitysdk.sdk.i.g.m7785(f1399, cArr2, i2);
                    com.ironsource.adqualitysdk.sdk.i.g.f2157 = 4;
                    while (com.ironsource.adqualitysdk.sdk.i.g.f2157 < m7785.length) {
                        com.ironsource.adqualitysdk.sdk.i.g.f2156 = com.ironsource.adqualitysdk.sdk.i.g.f2157 - 4;
                        m7785[com.ironsource.adqualitysdk.sdk.i.g.f2157] = (char) ((m7785[com.ironsource.adqualitysdk.sdk.i.g.f2157] ^ m7785[com.ironsource.adqualitysdk.sdk.i.g.f2157 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2156 * f1399));
                        com.ironsource.adqualitysdk.sdk.i.g.f2157++;
                    }
                    str2 = new String(m7785, 4, m7785.length - 4);
                }
                return str2;
            }
        };
        int i2 = f1361 + 73;
        f1362 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return lVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private q m7175(final boolean z) {
        int i = 2 % 2;
        q qVar = new q() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.13

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f1393 = -8128729215004909133L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f1394 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1395 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5820(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1394 + 89;
                f1395 = i3 % 128;
                int i4 = i3 % 2;
                mo5820(jSONObject, view, activity);
                if (i4 == 0) {
                    int i5 = 2 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5821(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1394 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1395 = i3 % 128;
                int i4 = i3 % 2;
                mo5821(jSONObject, view, obj, activity);
                int i5 = f1394 + 31;
                f1395 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 16 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5822(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 67;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                mo5822(jSONObject, view, activity);
                if (i4 != 0) {
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                int i5 = f1395 + 13;
                f1394 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5823(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 7;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                mo5823(jSONObject, view, activity);
                if (i4 != 0) {
                    int i5 = 43 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5824(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1394 + 83;
                f1395 = i3 % 128;
                int i4 = i3 % 2;
                mo5824(jSONObject, view, obj, activity);
                int i5 = f1395 + 95;
                f1394 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5825(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 45;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                mo5825(jSONObject, view, activity);
                if (i4 != 0) {
                    int i5 = 42 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5826(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 21;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                mo5826(jSONObject, view, activity);
                int i5 = f1394 + 65;
                f1395 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5827(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1394 + 31;
                f1395 = i3 % 128;
                int i4 = i3 % 2;
                mo5827(jSONObject, view, obj, activity);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5823(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 67;
                f1394 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7238(m7237("\ue1d2葄⫑텣瞌\u1a1c肭⛗쵒珽ᙩ", 32158 >> TextUtils.getOffsetBefore("", 1)).intern(), jSONObject, view, null, activity);
                } else {
                    m7238(m7237("\ue1d2葄⫑텣瞌\u1a1c肭⛗쵒珽ᙩ", 26003 - TextUtils.getOffsetBefore("", 0)).intern(), jSONObject, view, null, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5820(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1394 + 43;
                f1395 = i3 % 128;
                if (i3 % 2 == 0) {
                    m7238(m7237("\ue1d2㈪䘍騭긴숲ᘱ⨹縢鈳\ua635﨩ท∞瘗訁", (ViewConfiguration.getKeyRepeatTimeout() % 14) * 54269).intern(), jSONObject, view, null, activity);
                } else {
                    m7238(m7237("\ue1d2㈪䘍騭긴숲ᘱ⨹縢鈳\ua635﨩ท∞瘗訁", 54269 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), jSONObject, view, null, activity);
                }
                int i4 = f1395 + 47;
                f1394 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5824(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 85;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                m7238(m7237("\ue1d2ꅾ悢․\ue37eꊝ戮╉\ue49f", (ViewConfiguration.getJumpTapTimeout() >> 16) + 16553).intern(), jSONObject, view, obj, activity);
                int i5 = f1395 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f1394 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5821(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 77;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                m7238(m7237("\ue1d2뚐佾\ue40a볆喳\uea72茧寯\uf08a複⇑\uf68a轢␢", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22342).intern(), jSONObject, view, obj, activity);
                int i5 = f1395 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f1394 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5822(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 53;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                m7238(m7237("\ue1d2쥀냞頚䎀⬳ቜﷶ", Gravity.getAbsoluteGravity(0, 0) + 10391).intern(), jSONObject, view, null, activity);
                int i5 = f1395 + 113;
                f1394 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5825(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 101;
                f1394 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7238(m7237("\ue1c5ⓓ毄껟\uf5d6㣪翱苭즘ಊ厌隴", 50440 / ExpandableListView.getPackedPositionChild(1L)).intern(), jSONObject, view, null, activity);
                } else {
                    m7238(m7237("\ue1c5ⓓ毄껟\uf5d6㣪翱苭즘ಊ厌隴", 50440 - ExpandableListView.getPackedPositionChild(0L)).intern(), jSONObject, view, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5827(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1394 + 89;
                f1395 = i3 % 128;
                int i4 = i3 % 2;
                m7238(m7237("\ue1c4㹵店缙齗뿮\udc0eﲫ\u1cce㵋嶁緛驲몚\udb2dﭻ\u1bf5㠅墫磞", Drawable.resolveOpacity(0, 0) + 57251).intern(), jSONObject, view, obj, activity);
                int i5 = f1395 + 95;
                f1394 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5826(JSONObject jSONObject, View view, Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1395 + 5;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
                m7238(m7237("\ue1d0ꄝ恶⍖\ue2b0ꖙ擔\u2438\ue70eꙮ楉", 16603 - TextUtils.getOffsetBefore("", 0)).intern(), jSONObject, view, null, activity);
                int i5 = f1395 + 37;
                f1394 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private void m7238(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = 2 % 2;
                cl.m7176(cl.this, new StringBuilder().append(m7237("\ue1e5ꫝ矘Ñ췮雴⏕\ueceb맸䋸ྐ\ud890斂\u2e9aﯿ", Process.getGidForName("") + 19208).intern()).append(str).toString(), z, false, Arrays.asList(jSONObject, view, obj, activity));
                int i3 = f1395 + 47;
                f1394 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m7237(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (i.f2454) {
                    i.f2455 = i2;
                    char[] cArr3 = new char[cArr2.length];
                    i.f2453 = 0;
                    while (i.f2453 < cArr2.length) {
                        cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1393);
                        i.f2453++;
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        };
        int i2 = f1362 + 21;
        f1361 = i2 % 128;
        if (i2 % 2 == 0) {
            return qVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private v m7166(final boolean z) {
        int i = 2 % 2;
        v vVar = new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.11

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f1384 = 1;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f1385 = {'a', GMTDateParser.DAY_OF_MONTH, 'D', 'i', GMTDateParser.SECONDS, 'p', 'l', 'y', 'e', 'E', 'x', 't', 'r', 'C', 'c', 'k', 'F', 'o', GMTDateParser.MINUTES, 'J', 'v', 'w', 'A', GMTDateParser.HOURS, 'b', 'n', AbstractJsonLexerKt.UNICODE_ESC, 'W', 'L', '.', 'f', 'g', 'j', 'q', GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char f1386 = 6;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1387;

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5820(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 57;
                f1387 = i3 % 128;
                int i4 = i3 % 2;
                mo5820(jSONObject, webView, view);
                int i5 = f1384 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1387 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 60 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5821(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 111;
                f1387 = i3 % 128;
                int i4 = i3 % 2;
                mo5821(jSONObject, webView, obj, view);
                int i5 = f1387 + 5;
                f1384 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5822(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 79;
                f1387 = i3 % 128;
                int i4 = i3 % 2;
                mo5822(jSONObject, webView, view);
                int i5 = f1387 + 99;
                f1384 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo5823(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 67;
                f1387 = i3 % 128;
                int i4 = i3 % 2;
                mo5823(jSONObject, webView, view);
                int i5 = f1384 + 89;
                f1387 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5824(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1387 + 87;
                f1384 = i3 % 128;
                int i4 = i3 % 2;
                mo5824(jSONObject, webView, obj, view);
                int i5 = f1384 + 99;
                f1387 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5825(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1387 + 23;
                f1384 = i3 % 128;
                int i4 = i3 % 2;
                mo5825(jSONObject, webView, view);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = f1387 + 29;
                f1384 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 92 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5826(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1387 + 91;
                f1384 = i3 % 128;
                int i4 = i3 % 2;
                mo5826(jSONObject, webView, view);
                int i5 = f1384 + 51;
                f1387 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5827(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 17;
                f1387 = i3 % 128;
                int i4 = i3 % 2;
                mo5827(jSONObject, webView, obj, view);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = f1384 + 69;
                f1387 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5823(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1387 + 109;
                f1384 = i3 % 128;
                int i4 = i3 % 2;
                m7219(m7220((ViewConfiguration.getFadingEdgeLength() >> 16) + 11, "\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\tÕ", (byte) (113 - KeyEvent.normalizeMetaState(0))).intern(), jSONObject, webView, null, view);
                int i5 = f1387 + 109;
                f1384 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5820(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1387 + 23;
                f1384 = i3 % 128;
                if (i3 % 2 == 0) {
                    m7219(m7220(61 / TextUtils.indexOf((CharSequence) "", (char) 27), "\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\t\u0003\u0007\u000b\u0006\u0012\u0006", (byte) ((-1) / (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), jSONObject, webView, null, view);
                } else {
                    m7219(m7220(15 - TextUtils.indexOf((CharSequence) "", '0'), "\u0001\u0002\u0003\u0004\u0005\u0000\f\u0006\b\t\u0003\u0007\u000b\u0006\u0012\u0006", (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern(), jSONObject, webView, null, view);
                }
                int i4 = f1384 + 59;
                f1387 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5824(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1387 + 71;
                f1384 = i3 % 128;
                if (i3 % 2 == 0) {
                    m7219(m7220(50 >>> (ViewConfiguration.getMaximumFlingVelocity() / 75), "\u0001\u0002\f\u0007\u0002\u000f\u000e\tÛ", (byte) (17 / (Process.myPid() % Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))).intern(), jSONObject, webView, obj, view);
                } else {
                    m7219(m7220((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, "\u0001\u0002\f\u0007\u0002\u000f\u000e\tÛ", (byte) (119 - (Process.myPid() >> 22))).intern(), jSONObject, webView, obj, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5821(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 85;
                f1387 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7219(m7220(12 % ImageFormat.getBitsPerPixel(1), "\u0001\u0002\f\u0007\u0002\u000f\u000e\t\u0004\r\r\f\u0013\u0014\u0080", (byte) (46 - (ViewConfiguration.getWindowTouchSlop() - 56))).intern(), jSONObject, webView, obj, view);
                } else {
                    m7219(m7220(14 - ImageFormat.getBitsPerPixel(0), "\u0001\u0002\f\u0007\u0002\u000f\u000e\t\u0004\r\r\f\u0013\u0014\u0080", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 13)).intern(), jSONObject, webView, obj, view);
                }
                int i4 = f1387 + 9;
                f1384 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5822(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 27;
                f1387 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7219(m7220(9 - (ExpandableListView.getPackedPositionForChild(1, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 0L ? 0 : -1)), "\u0001\u0002\f\u0007\u0010\u0005\u0007\u0002", (byte) (71 / View.resolveSizeAndState(1, 1, 1))).intern(), jSONObject, webView, null, view);
                } else {
                    m7219(m7220(7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0001\u0002\f\u0007\u0010\u0005\u0007\u0002", (byte) (120 - View.resolveSizeAndState(0, 0, 0))).intern(), jSONObject, webView, null, view);
                }
                int i4 = f1384 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f1387 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5825(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 89;
                f1387 = i3 % 128;
                if (i3 % 2 != 0) {
                    m7219(m7220(102 - TextUtils.getCapsMode("", 0, 0), "\u0015\u0002\t\u0014\u0017\n\u0006\u0005\u0011\u0014\u0007\u0002", (byte) (KeyEvent.getDeadChar(1, 0) + 2)).intern(), jSONObject, webView, null, view);
                } else {
                    m7219(m7220(12 - TextUtils.getCapsMode("", 0, 0), "\u0015\u0002\t\u0014\u0017\n\u0006\u0005\u0011\u0014\u0007\u0002", (byte) (5 - KeyEvent.getDeadChar(0, 0))).intern(), jSONObject, webView, null, view);
                }
                int i4 = f1387 + 59;
                f1384 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5827(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                int i3 = f1384 + 49;
                f1387 = i3 % 128;
                int i4 = i3 % 2;
                m7219(m7220(20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0014\t\u0019\f\u0012\u0011\f\u0017\u0007\u000e\t\u0000\u0007\u001a\u0006\n\u001a\u000e\u001d\u0007", (byte) (25 - Color.alpha(0))).intern(), jSONObject, webView, obj, view);
                int i5 = f1387 + 79;
                f1384 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 41 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5826(JSONObject jSONObject, WebView webView, View view) {
                int i2 = 2 % 2;
                int i3 = f1387 + 81;
                f1384 = i3 % 128;
                int i4 = i3 % 2;
                m7219(m7220((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, "\u0014 \u0005\n\f\u0017\b\u0015\u0007\u001a½", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 73)).intern(), jSONObject, webView, null, view);
                int i5 = f1384 + 101;
                f1387 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 28 / 0;
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private void m7219(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = 2 % 2;
                cl.m7176(cl.this, new StringBuilder().append(m7220((ViewConfiguration.getPressedStateDuration() >> 16) + 17, "!\t\u001f\u0007\u000f\u0017\u0013\u0004\u001b\u0004\u0005\n\u0007\u001a\u0006\u000e\u0097", (byte) (105 - View.getDefaultSize(0, 0))).intern()).append(str).toString(), z, false, Arrays.asList(jSONObject, webView, obj, view));
                int i3 = f1387 + 81;
                f1384 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                super.hashCode();
                throw null;
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m7220(int i2, String str, byte b2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (j.f2674) {
                    char[] cArr3 = f1385;
                    char c2 = f1386;
                    char[] cArr4 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr4[i2] = (char) (cArr2[i2] - b2);
                    }
                    if (i2 > 1) {
                        j.f2681 = 0;
                        while (j.f2681 < i2) {
                            j.f2680 = cArr2[j.f2681];
                            j.f2677 = cArr2[j.f2681 + 1];
                            if (j.f2680 == j.f2677) {
                                cArr4[j.f2681] = (char) (j.f2680 - b2);
                                cArr4[j.f2681 + 1] = (char) (j.f2677 - b2);
                            } else {
                                j.f2679 = j.f2680 / c2;
                                j.f2676 = j.f2680 % c2;
                                j.f2678 = j.f2677 / c2;
                                j.f2675 = j.f2677 % c2;
                                if (j.f2676 == j.f2675) {
                                    j.f2679 = ((j.f2679 + c2) - 1) % c2;
                                    j.f2678 = ((j.f2678 + c2) - 1) % c2;
                                    int i3 = (j.f2679 * c2) + j.f2676;
                                    int i4 = (j.f2678 * c2) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i3];
                                    cArr4[j.f2681 + 1] = cArr3[i4];
                                } else if (j.f2679 == j.f2678) {
                                    j.f2676 = ((j.f2676 + c2) - 1) % c2;
                                    j.f2675 = ((j.f2675 + c2) - 1) % c2;
                                    int i5 = (j.f2679 * c2) + j.f2676;
                                    int i6 = (j.f2678 * c2) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i5];
                                    cArr4[j.f2681 + 1] = cArr3[i6];
                                } else {
                                    int i7 = (j.f2679 * c2) + j.f2675;
                                    int i8 = (j.f2678 * c2) + j.f2676;
                                    cArr4[j.f2681] = cArr3[i7];
                                    cArr4[j.f2681 + 1] = cArr3[i8];
                                }
                            }
                            j.f2681 += 2;
                        }
                    }
                    str2 = new String(cArr4);
                }
                return str2;
            }
        };
        int i2 = f1361 + 21;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        return vVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private l m7180(final l lVar, final l lVar2) {
        int i = 2 % 2;
        int i2 = f1362 + 105;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        if (lVar == null) {
            lVar = new l();
        }
        if (lVar2 == null) {
            lVar2 = new l();
            int i4 = f1361 + 25;
            f1362 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5820(JSONObject jSONObject, WebView webView, Activity activity) {
                mo5820(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5821(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo5821(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5822(JSONObject jSONObject, WebView webView, Activity activity) {
                mo5822(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5823(JSONObject jSONObject, WebView webView, Activity activity) {
                mo5823(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5824(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo5824(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5825(JSONObject jSONObject, WebView webView, Activity activity) {
                mo5825(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5826(JSONObject jSONObject, WebView webView, Activity activity) {
                mo5826(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5827(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo5827(jSONObject, webView, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5823(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo5823(jSONObject, webView, activity);
                p.m8557(new c.AnonymousClass5(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5820(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo5820(jSONObject, webView, activity);
                p.m8557(new e.AnonymousClass5(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5824(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo5824(jSONObject, webView, obj, activity);
                p.m8557(new b.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5821(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo5821(jSONObject, webView, obj, activity);
                p.m8557(new d.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5822(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo5822(jSONObject, webView, activity);
                p.m8557(new a.AnonymousClass4(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5825(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo5825(jSONObject, webView, activity);
                p.m8557(new g.AnonymousClass4(lVar, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5827(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo5827(jSONObject, webView, obj, activity);
                p.m8557(new f.AnonymousClass5(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5826(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo5826(jSONObject, webView, activity);
                p.m8557(new h.AnonymousClass1(lVar, jSONObject, webView, activity));
            }
        };
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private v m7190(final v vVar, final v vVar2) {
        int i = 2 % 2;
        int i2 = f1362 + 107;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        if (vVar == null) {
            vVar = new v();
        }
        if (vVar2 == null) {
            vVar2 = new v();
        }
        v vVar3 = new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5820(JSONObject jSONObject, WebView webView, View view) {
                mo5820(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5821(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5821(jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5822(JSONObject jSONObject, WebView webView, View view) {
                mo5822(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo5823(JSONObject jSONObject, WebView webView, View view) {
                mo5823(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5824(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5824(jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5825(JSONObject jSONObject, WebView webView, View view) {
                mo5825(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5826(JSONObject jSONObject, WebView webView, View view) {
                mo5826(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5827(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5827(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ */
            public final void mo5823(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5823(jSONObject, webView, view);
                p.m8557(new c.AnonymousClass5(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ */
            public final void mo5820(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5820(jSONObject, webView, view);
                p.m8557(new e.AnonymousClass5(vVar, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾇ */
            public final void mo5824(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5824(jSONObject, webView, obj, view);
                p.m8557(new b.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ */
            public final void mo5821(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5821(jSONObject, webView, obj, view);
                p.m8557(new d.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻐ */
            public final void mo5822(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5822(jSONObject, webView, view);
                p.m8557(new a.AnonymousClass4(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﾒ */
            public final void mo5825(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5825(jSONObject, webView, view);
                p.m8557(new g.AnonymousClass4(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ｋ */
            public final void mo5827(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5827(jSONObject, webView, obj, view);
                p.m8557(new f.AnonymousClass5(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* renamed from: ﻛ */
            public final void mo5826(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5826(jSONObject, webView, view);
                p.m8557(new h.AnonymousClass1(vVar, jSONObject, webView, view));
            }
        };
        int i4 = f1361 + 77;
        f1362 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return vVar3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private q m7189(final q qVar, final q qVar2) {
        int i = 2 % 2;
        int i2 = f1361 + 79;
        f1362 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (qVar == null) {
            qVar = new q();
        }
        if (qVar2 == null) {
            qVar2 = new q();
            int i3 = f1361 + 63;
            f1362 = i3 % 128;
            int i4 = i3 % 2;
        }
        return new q() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5820(JSONObject jSONObject, View view, Activity activity) {
                mo5820(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo5821(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5821(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo5822(JSONObject jSONObject, View view, Activity activity) {
                mo5822(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5823(JSONObject jSONObject, View view, Activity activity) {
                mo5823(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ */
            public final /* synthetic */ void mo5824(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5824(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo5825(JSONObject jSONObject, View view, Activity activity) {
                mo5825(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5826(JSONObject jSONObject, View view, Activity activity) {
                mo5826(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo5827(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5827(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾒ */
            public final void mo5823(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo5823(jSONObject, view, activity);
                p.m8557(new c.AnonymousClass5(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ */
            public final void mo5820(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo5820(jSONObject, view, activity);
                p.m8557(new e.AnonymousClass5(qVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ */
            public final void mo5824(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo5824(jSONObject, view, obj, activity);
                p.m8557(new b.AnonymousClass2(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ｋ */
            public final void mo5821(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo5821(jSONObject, view, obj, activity);
                p.m8557(new d.AnonymousClass2(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻐ */
            public final void mo5822(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo5822(jSONObject, view, activity);
                p.m8557(new a.AnonymousClass4(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﻛ */
            public final void mo5825(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo5825(jSONObject, view, activity);
                p.m8557(new g.AnonymousClass4(qVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ */
            public final void mo5827(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo5827(jSONObject, view, obj, activity);
                p.m8557(new f.AnonymousClass5(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* renamed from: ﾇ */
            public final void mo5826(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo5826(jSONObject, view, activity);
                p.m8557(new h.AnonymousClass1(qVar, jSONObject, view, activity));
            }
        };
    }

    /* renamed from: סּ, reason: contains not printable characters */
    private js m7157() {
        int i = 2 % 2;
        js jsVar = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                cl.this.m7211(is.f2602, cl.m7193(cl.this, activity, null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                cl.this.m7211(is.f2600, cl.m7193(cl.this, activity, null));
            }
        };
        int i2 = f1362 + 79;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        return jsVar;
    }

    class c<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$c$5, reason: invalid class name */
        final class AnonymousClass5 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ t f1451;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1452;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1453;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1454;

            AnonymousClass5(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1451 = tVar;
                this.f1452 = jSONObject;
                this.f1453 = obj;
                this.f1454 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1451.mo5823(this.f1452, this.f1453, this.f1454);
            }
        }
    }

    class e<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$e$5, reason: invalid class name */
        final class AnonymousClass5 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1460;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ t f1461;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1462;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1463;

            AnonymousClass5(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1461 = tVar;
                this.f1463 = jSONObject;
                this.f1462 = obj;
                this.f1460 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1461.mo5820(this.f1463, this.f1462, this.f1460);
            }
        }
    }

    class b<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$b$2, reason: invalid class name */
        final class AnonymousClass2 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ t f1446;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1447;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1448;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1449;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1450;

            AnonymousClass2(t tVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1446 = tVar;
                this.f1447 = jSONObject;
                this.f1449 = obj;
                this.f1450 = obj2;
                this.f1448 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1446.mo5824(this.f1447, this.f1449, this.f1450, this.f1448);
            }
        }
    }

    class d<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$d$2, reason: invalid class name */
        final class AnonymousClass2 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ t f1455;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1456;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1457;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1458;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1459;

            AnonymousClass2(t tVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1455 = tVar;
                this.f1457 = jSONObject;
                this.f1456 = obj;
                this.f1459 = obj2;
                this.f1458 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1455.mo5821(this.f1457, this.f1456, this.f1459, this.f1458);
            }
        }
    }

    class a<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$a$4, reason: invalid class name */
        final class AnonymousClass4 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ t f1442;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1443;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1444;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1445;

            AnonymousClass4(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1442 = tVar;
                this.f1443 = jSONObject;
                this.f1444 = obj;
                this.f1445 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1442.mo5822(this.f1443, this.f1444, this.f1445);
            }
        }
    }

    class g<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$g$4, reason: invalid class name */
        final class AnonymousClass4 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1469;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1470;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1471;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ t f1472;

            AnonymousClass4(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1472 = tVar;
                this.f1470 = jSONObject;
                this.f1471 = obj;
                this.f1469 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1472.mo5825(this.f1470, this.f1471, this.f1469);
            }
        }
    }

    class f<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$f$5, reason: invalid class name */
        final class AnonymousClass5 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1464;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1465;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ t f1466;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1467;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1468;

            AnonymousClass5(t tVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1466 = tVar;
                this.f1465 = jSONObject;
                this.f1467 = obj;
                this.f1464 = obj2;
                this.f1468 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1466.mo5827(this.f1465, this.f1467, this.f1464, this.f1468);
            }
        }
    }

    class h<K, T> {

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cl$h$1, reason: invalid class name */
        final class AnonymousClass1 extends je {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1473;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ t f1474;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1475;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1476;

            AnonymousClass1(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1474 = tVar;
                this.f1476 = jSONObject;
                this.f1475 = obj;
                this.f1473 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                this.f1474.mo5826(this.f1476, this.f1475, this.f1473);
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m7183(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(is.f2637, m7208().m7302());
            jsonObjectInit.put(is.f2588, m7208().m7298());
            jsonObjectInit.put(is.f2592, m7208().m7296());
            jsonObjectInit.put(m7167(new int[]{-1289404514, -593432372, -294402696, 2141141873}, 7 - KeyEvent.keyCodeFromString("")).intern(), activity.getClass().getName());
            if (bundle != null) {
                int i2 = f1362 + 51;
                f1361 = i2 % 128;
                int i3 = i2 % 2;
                jsonObjectInit.put(m7167(new int[]{1916185296, 1293179582, -139890724, -759972298}, '8' - AndroidCharacter.getMirror('0')).intern(), true);
            }
        } catch (JSONException unused) {
            m.m8527(m7167(new int[]{1708820623, 1001152392, 1938309327, -962546325, -1009309914, 1480401082, 1325773384, 281166181}, 16 - View.getDefaultSize(0, 0)).intern(), m7182('N' - AndroidCharacter.getMirror('0'), false, View.getDefaultSize(0, 0) + 228, "\u0003\u0014\uffc0\n\u0013\u000f\u000e\uffc0\u000f\u0002\n\u0005\u0003\u0014￥\u0012\u0012\u000f\u0012\uffc0\u0003\u0012\u0005\u0001\u0014\t\u000e\u0007\uffc0\u0001", View.resolveSizeAndState(0, 0, 0) + 14).intern());
        }
        int i4 = f1361 + 51;
        f1362 = i4 % 128;
        int i5 = i4 % 2;
        return jsonObjectInit;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jx m7188(final List<String> list) {
        int i = 2 % 2;
        jx jxVar = new jx() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.4

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f1417 = 0;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1418 = {AbstractJsonLexerKt.COLON, GMTDateParser.SECONDS, 'q', AbstractJsonLexerKt.END_LIST, '_', 't', 'l', 'i', 'Z', 'Z', 'n', 148, 295, 275, 275, 290, 293, 301, 283, 276, 293, 300, 298, 297, 292, 285, Typography.amp, 'n', 137, 135, 135, 138, 145, 140, 'x', AbstractJsonLexerKt.END_OBJ, 146, 138, 135, 'x', 'y', 142, 'v'};

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f1419 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* renamed from: ｋ */
            public final void mo5967(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1417 + 103;
                f1419 = i3 % 128;
                int i4 = i3 % 2;
                m7249(m7250("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", new int[]{0, 11, 0, 0}, true).intern(), activity, list);
                int i5 = f1417 + 35;
                f1419 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 6 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* renamed from: ﻐ */
            public final void mo5966(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f1417 + 41;
                f1419 = i3 % 128;
                int[] iArr = {11, 15, 185, 0};
                m7249((i3 % 2 == 0 ? m7250("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", iArr, false) : m7250("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", iArr, false)).intern(), activity, list);
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m7249(String str, final Activity activity, List<String> list2) {
                int i2 = 2 % 2;
                int i3 = f1417 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1419 = i3 % 128;
                if (i3 % 2 == 0) {
                    cl.m7187(activity, list2);
                    throw null;
                }
                if (cl.m7187(activity, list2)) {
                    final String obj = new StringBuilder().append(m7250("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{26, 17, 30, 0}, true).intern()).append(str).toString();
                    cl.m7176(cl.this, obj, true, false, Collections.singletonList(activity));
                    p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            cl.m7176(cl.this, obj, false, false, Collections.singletonList(activity));
                        }
                    });
                }
                int i4 = f1419 + 103;
                f1417 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m7250(String str, int[] iArr, boolean z) {
                String str2;
                byte[] bArr = str;
                if (str != null) {
                    bArr = str.getBytes(C.ISO88591_NAME);
                }
                byte[] bArr2 = bArr;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2286) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f1418, i2, cArr, 0, i3);
                    if (bArr2 != null) {
                        char[] cArr2 = new char[i3];
                        com.ironsource.adqualitysdk.sdk.i.h.f2287 = 0;
                        char c2 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2287 < i3) {
                            if (bArr2[com.ironsource.adqualitysdk.sdk.i.h.f2287] == 1) {
                                cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2287] = (char) (((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2287] << 1) + 1) - c2);
                            } else {
                                cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2287] = (char) ((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2287] << 1) - c2);
                            }
                            c2 = cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2287];
                            com.ironsource.adqualitysdk.sdk.i.h.f2287++;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i6 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i6, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i3];
                        com.ironsource.adqualitysdk.sdk.i.h.f2287 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2287 < i3) {
                            cArr4[com.ironsource.adqualitysdk.sdk.i.h.f2287] = cArr[(i3 - com.ironsource.adqualitysdk.sdk.i.h.f2287) - 1];
                            com.ironsource.adqualitysdk.sdk.i.h.f2287++;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        com.ironsource.adqualitysdk.sdk.i.h.f2287 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.h.f2287 < i3) {
                            cArr[com.ironsource.adqualitysdk.sdk.i.h.f2287] = (char) (cArr[com.ironsource.adqualitysdk.sdk.i.h.f2287] - iArr[2]);
                            com.ironsource.adqualitysdk.sdk.i.h.f2287++;
                        }
                    }
                    str2 = new String(cArr);
                }
                return str2;
            }
        };
        int i2 = f1361 + 35;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        return jxVar;
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private ck m7156() {
        int i = 2 % 2;
        ck ckVar = new ck() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ck
            /* renamed from: ﻐ */
            public final void mo7155(final String str, final List<Object> list) {
                final boolean z = true;
                final boolean z2 = false;
                cl.m7176(cl.this, str, true, false, list);
                cl.m7169(cl.this, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        cl.m7176(cl.this, str, false, z2, list);
                    }
                }, false);
                cl.m7169(cl.this, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        cl.m7176(cl.this, str, false, z, list);
                    }
                }, true);
            }
        };
        int i2 = f1361 + 95;
        f1362 = i2 % 128;
        int i3 = i2 % 2;
        return ckVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    protected final void m7213(String str, List<Object> list) {
        int i = 2 % 2;
        m7197(new StringBuilder().append(m7182(15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, 230 - KeyEvent.normalizeMetaState(0), "\u0012\u0011\uffff\u0001\u0002\uffff\r\u0010￠\uffff\n\u000b\r\r\ufff1ￌ", (Process.myPid() >> 22) + 15).intern()).append(str).toString(), list);
        int i2 = f1362 + 47;
        f1361 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7197(final String str, final List<Object> list) {
        int i = 2 % 2;
        p.m8557(new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                cl.m7176(cl.this, str, false, false, list);
            }
        });
        p.m8554(new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                cl.m7176(cl.this, str, true, false, list);
            }
        });
        m7195(new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                cl.m7176(cl.this, str, false, true, list);
            }
        }, true);
        int i2 = f1361 + 13;
        f1362 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7198(String str, boolean z, boolean z2, List<Object> list) {
        int i = 2 % 2;
        try {
            dh m7929 = this.f1370.m7929(str);
            if (m7929 != null) {
                String m7490 = m7929.m7490();
                dz m7933 = this.f1370.m7933(m7929.m7490());
                if (m7933 == null) {
                    new dt(this, m7490, new StringBuilder().append(m7167(new int[]{1726650501, -220222271, -1972317907, 1697089025, 861502119, 928597312, -170788052, -2061117520, -1110104530, 393790835, -994150204, 1971244113}, KeyEvent.getDeadChar(0, 0) + 21).intern()).append(str).toString()).m7593(m7203());
                    return;
                }
                int i2 = f1361 + 33;
                f1362 = i2 % 128;
                int i3 = i2 % 2;
                if (z == m7929.m7489() && z2 == m7929.m7488()) {
                    if (s.m8592().m8615()) {
                        int i4 = f1362 + 93;
                        f1361 = i4 % 128;
                        int i5 = i4 % 2;
                        cn.m7271(m7203(), str);
                    }
                    m7933.m7671(this.f1369, this, list);
                }
            }
        } catch (Throwable th) {
            cn.m7268(m7203(), new StringBuilder().append(m7167(new int[]{1726650501, -220222271, -1972317907, 1697089025, 861502119, 928597312, -170788052, -2061117520, -1110104530, 393790835, -994150204, 1971244113}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21).intern()).append(str).toString(), th);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m7211(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f1361 + 23;
        f1362 = i2 % 128;
        if (i2 % 2 != 0 ? str.equals(m7182(12 - Drawable.resolveOpacity(0, 0), false, 236 - TextUtils.getCapsMode("", 0, 0), "�￼\ufff9￼\ufff7￼\u0001\u000b\b\u0004\ufff9\u0011", TextUtils.indexOf("", "", 0, 0) + 2).intern()) : str.equals(m7182(34 - Drawable.resolveOpacity(1, 1), true, 11878 << TextUtils.getCapsMode("", 1, 0), "�￼\ufff9￼\ufff7￼\u0001\u000b\b\u0004\ufff9\u0011", TextUtils.indexOf("", "", 1, 0) * 4).intern())) {
            this.f1364.m7292().m6291(jSONObject);
        } else if (str.equals(m7182(10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, 234 - View.MeasureSpec.makeMeasureSpec(0, 0), "\ufffe\ufff9�\u0006\t\r\uffff\ufffe\ufffb", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9).intern())) {
            int i3 = f1362 + 45;
            f1361 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f1364.m7292().m6290(jSONObject);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            this.f1364.m7292().m6290(jSONObject);
        }
        JSONObject m8417 = kj.m8417(m7168(jSONObject));
        if (str.equals(is.f2593)) {
            this.f1364.m7292().m6288(m8417);
            return;
        }
        if (str.equals(is.f2596)) {
            this.f1364.m7292().m6294(m8417);
            return;
        }
        if (str.equals(is.f2602)) {
            int i4 = f1362 + 95;
            f1361 = i4 % 128;
            if (i4 % 2 == 0) {
                this.f1364.m7292().m6286(m8417);
                return;
            } else {
                this.f1364.m7292().m6286(m8417);
                int i5 = 56 / 0;
                return;
            }
        }
        if (!str.equals(is.f2600)) {
            if (str.equals(is.f2595)) {
                int i6 = f1361 + 59;
                f1362 = i6 % 128;
                if (i6 % 2 != 0) {
                    this.f1364.m7292().m6284(m8417);
                    return;
                } else {
                    this.f1364.m7292().m6284(m8417);
                    int i7 = 85 / 0;
                    return;
                }
            }
            if (str.equals(is.f2594)) {
                this.f1364.m7292().m6283(m8417);
                return;
            } else if (str.equals(is.f2597)) {
                this.f1364.m7292().m6281(m8417);
                return;
            } else {
                this.f1364.m7292().m6287(str, jSONObject);
                return;
            }
        }
        int i8 = f1362 + 17;
        f1361 = i8 % 128;
        int i9 = i8 % 2;
        this.f1364.m7292().m6282(m8417);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7195(final iy iyVar, boolean z) {
        int i = 2 % 2;
        int i2 = f1362 + 9;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (z) {
                p.m8549(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        p.m8552(iy.this);
                    }
                });
                return;
            }
            p.m8552(iyVar);
            int i4 = f1362 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f1361 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    private void m7158() {
        int i = 2 % 2;
        int i2 = f1362 + 55;
        f1361 = i2 % 128;
        int i3 = i2 % 2;
        this.f1365.m8638();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7167(int[] iArr, int i) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1360.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f83 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f83] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f83];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f83 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f84 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f85 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f84 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f84 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f85 = com.ironsource.adqualitysdk.sdk.i.a.m5774(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f85;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                    com.ironsource.adqualitysdk.sdk.i.a.f84 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                    com.ironsource.adqualitysdk.sdk.i.a.f85 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                com.ironsource.adqualitysdk.sdk.i.a.f84 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                com.ironsource.adqualitysdk.sdk.i.a.f85 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f85 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f84 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f84 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f84;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f85 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f85;
                com.ironsource.adqualitysdk.sdk.i.a.m5773(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f83 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7182(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1641] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1643 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f1359);
                com.ironsource.adqualitysdk.sdk.i.d.f1641++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1642 = i3;
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
