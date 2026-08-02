package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ah extends ka {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f174 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char f175 = 4245;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f176 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f177 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f178 = 4095;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f179 = 17344;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f180 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f181 = 38971;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f182 = 13489;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int f183;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f184;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Handler f185;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f186;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private int f187;

    public interface d {
        void onEventGenerated(JSONObject jSONObject);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ int m5892(ah ahVar) {
        int i = 2 % 2;
        int i2 = f174 + 9;
        f177 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ahVar.f183;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ int m5895(ah ahVar) {
        int i = 2 % 2;
        int i2 = f174;
        int i3 = i2 + 111;
        f177 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ahVar.f187;
        ahVar.f187 = i5 + 1;
        int i6 = i2 + 23;
        f177 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ int m5897(ah ahVar) {
        int i = 2 % 2;
        int i2 = f177 + 1;
        f174 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ahVar.f183;
        if (i3 != 0) {
            ahVar.f183 = i4;
            return i4;
        }
        ahVar.f183 = i4 + 1;
        return i4;
    }

    ah(Context context, as asVar, int i, String str, long j) {
        super(context, asVar, j);
        this.f186 = i;
        this.f187 = 0;
        this.f183 = 1;
        this.f184 = str;
        HandlerThread handlerThread = new HandlerThread(m5896("聈䓬㎠◤흣\uf726\udda9ན↑蔳嬭\ue596㧲梙ᦩ̻ᚐ鱥⎋\uf7e0钶胙\ue2cf残", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CAN).intern());
        handlerThread.start();
        this.f185 = new Handler(handlerThread.getLooper());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private int m5894() {
        int i = 2 % 2;
        int i2 = this.f187;
        if (i2 == 0) {
            int i3 = f174 + 113;
            f177 = i3 % 128;
            int i4 = i3 % 2;
            return 1;
        }
        int i5 = f177 + 13;
        f174 = i5 % 128;
        int i6 = i5 % 2;
        return i2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m5901(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z, final d dVar) {
        try {
            try {
                int i = 2 % 2;
                this.f185.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.5

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static char[] f201 = {'8', 'g', 'i', 'l', 'l', GMTDateParser.SECONDS, 'i', 'i', GMTDateParser.SECONDS, 'j', 'i', GMTDateParser.SECONDS, 't', 'g', 200, 200, 202, '2', 'i', 145, 290, 280, 273, 275, 274, 272, 273, 278, 145, 289, 284, 284, 175, 180, 175, 165, Typography.paragraph, 186, 186};

                    /* renamed from: ﱟ, reason: contains not printable characters */
                    private static int f202 = 1;

                    /* renamed from: ﻏ, reason: contains not printable characters */
                    private static int f203;

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() throws Exception {
                        int i2 = 2 % 2;
                        int i3 = f203 + 21;
                        f202 = i3 % 128;
                        if (i3 % 2 != 0 ? str.equals(m5903("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{0, 13, 0, 12}, false).intern()) : str.equals(m5903("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{0, 13, 0, 12}, false).intern())) {
                            ah.m5895(ah.this);
                        }
                        int m5892 = ah.m5892(ah.this);
                        ah.m5897(ah.this);
                        JSONObject m8417 = kj.m8417(jSONObject);
                        m8417.put(m5903("\u0001\u0001\u0000\u0000", new int[]{13, 4, 97, 0}, false).intern(), str);
                        m8417.put(m5903("\u0001\u0001", new int[]{17, 2, 0, 0}, false).intern(), m5892);
                        String intern = m5903("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{19, 9, 175, 0}, false).intern();
                        JSONObject jSONObject3 = jSONObject2;
                        if (jSONObject3 != null) {
                            intern = jSONObject3.optString(is.f2637);
                            m8417.put(is.f2588, jSONObject2.optString(is.f2588, null));
                        }
                        if (TextUtils.isEmpty(intern)) {
                            intern = m5903("\u0000\u0001\u0001\u0001", new int[]{28, 4, 179, 3}, false).intern();
                        }
                        m8417.put(is.f2635, intern);
                        if (!m8417.has(is.f2633)) {
                            int i4 = f203 + 103;
                            f202 = i4 % 128;
                            int i5 = i4 % 2;
                            m8417.put(is.f2633, intern);
                        }
                        final JSONObject mo5900 = ah.this.mo5900(m8417, z, true, str.equals(m5903(null, new int[]{32, 7, 70, 6}, true).intern()));
                        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.5.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                dVar.onEventGenerated(mo5900);
                            }
                        });
                    }

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static String m5903(String str2, int[] iArr, boolean z2) {
                        String str3;
                        byte[] bArr = str2;
                        if (str2 != null) {
                            bArr = str2.getBytes(C.ISO88591_NAME);
                        }
                        byte[] bArr2 = bArr;
                        synchronized (h.f2286) {
                            int i2 = iArr[0];
                            int i3 = iArr[1];
                            int i4 = iArr[2];
                            int i5 = iArr[3];
                            char[] cArr = new char[i3];
                            System.arraycopy(f201, i2, cArr, 0, i3);
                            if (bArr2 != null) {
                                char[] cArr2 = new char[i3];
                                h.f2287 = 0;
                                char c = 0;
                                while (h.f2287 < i3) {
                                    if (bArr2[h.f2287] == 1) {
                                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                                    } else {
                                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                                    }
                                    c = cArr2[h.f2287];
                                    h.f2287++;
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
                            if (z2) {
                                char[] cArr4 = new char[i3];
                                h.f2287 = 0;
                                while (h.f2287 < i3) {
                                    cArr4[h.f2287] = cArr[(i3 - h.f2287) - 1];
                                    h.f2287++;
                                }
                                cArr = cArr4;
                            }
                            if (i4 > 0) {
                                h.f2287 = 0;
                                while (h.f2287 < i3) {
                                    cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                                    h.f2287++;
                                }
                            }
                            str3 = new String(cArr);
                        }
                        return str3;
                    }
                });
                int i2 = f174 + 93;
                f177 = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5899(final JSONArray jSONArray, final boolean z, final d dVar) {
        int i = 2 % 2;
        this.f185.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2

            /* renamed from: ﭖ, reason: contains not printable characters */
            private static int f188 = 1;

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f189 = 11;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f190 = 0;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static short[] f191 = null;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f192 = -708536083;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static byte[] f193 = {-28, Ascii.GS, Ascii.DC2, -12, 10, -21, 19, -5, 7, -27, Ascii.US, -31, -10, 59, -18, -31, 7, -39, 58, -8, Ascii.DC2, Ascii.GS, 19, -27, -29, Ascii.ESC, -59, -41, 53, 34, -29, 60, 51, -43, 43, Byte.MAX_VALUE, -125, -61, 63, -49, 41, -58, -55, 53, 121, -108, 57, -57, 58, Ascii.ETB, 0, 0, 0};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f194 = 1667463238;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() throws Exception {
                int i2 = 2 % 2;
                int i3 = f188 + 23;
                f190 = i3 % 128;
                int i4 = i3 % 2;
                final JSONObject mo5900 = ah.this.mo5900(null, z, false, false);
                try {
                    mo5900.put(m5902((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.alpha(0) + 708536184, Color.rgb(0, 0, 0) + 16777211, (-1667463238) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 27)).intern(), jSONArray);
                } catch (JSONException e) {
                    m.m8535(m5902((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 708536148 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 13, KeyEvent.normalizeMetaState(0) - 1667463233, (byte) ((-24) - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern(), m5902((short) Color.alpha(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 708536151, (-16777203) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1667463212, (byte) (58 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), e);
                }
                p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.2.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        dVar.onEventGenerated(mo5900);
                    }
                });
                int i5 = f188 + 5;
                f190 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m5902(short s, int i2, int i3, int i4, byte b) {
                String obj;
                synchronized (n.f3088) {
                    StringBuilder sb = new StringBuilder();
                    int i5 = f189;
                    int i6 = i3 + i5;
                    int i7 = i6 == -1 ? 1 : 0;
                    if (i7 != 0) {
                        byte[] bArr = f193;
                        if (bArr != null) {
                            i6 = (byte) (bArr[f194 + i4] + i5);
                        } else {
                            i6 = (short) (f191[f194 + i4] + i5);
                        }
                    }
                    if (i6 > 0) {
                        n.f3090 = ((i4 + i6) - 2) + f194 + i7;
                        n.f3091 = b;
                        n.f3092 = (char) (i2 + f192);
                        sb.append(n.f3092);
                        n.f3093 = n.f3092;
                        n.f3089 = 1;
                        while (n.f3089 < i6) {
                            byte[] bArr2 = f193;
                            if (bArr2 != null) {
                                int i8 = n.f3090;
                                n.f3090 = i8 - 1;
                                n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i8] + s)) ^ n.f3091));
                            } else {
                                short[] sArr = f191;
                                int i9 = n.f3090;
                                n.f3090 = i9 - 1;
                                n.f3092 = (char) (n.f3093 + (((short) (sArr[i9] + s)) ^ n.f3091));
                            }
                            sb.append(n.f3092);
                            n.f3093 = n.f3092;
                            n.f3089++;
                        }
                    }
                    obj = sb.toString();
                }
                return obj;
            }
        });
        int i2 = f177 + 9;
        f174 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ka
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject mo5900(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        long m8357;
        long m8359;
        synchronized (this) {
            m8357 = ke.m8357();
            m8359 = ke.m8359();
        }
        JSONObject mo5900 = super.mo5900(jSONObject, z, z2, z3);
        try {
            long optLong = mo5900.optLong(is.f2629);
            mo5900.remove(is.f2629);
            if (optLong != 0) {
                long j = m8359 - (m8357 - optLong);
                mo5900.put(m5898((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 60315), "\u0000\u0000\u0000\u0000", "㫔돰骕껫", "枛鲨ᑷ", (-1783369669) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m8357);
                mo5900.put(m5896("ꢪ\u2ffe氨샽", 3 - View.getDefaultSize(0, 0)).intern(), m8359);
                m8357 = optLong;
                m8359 = j;
            }
            mo5900.put(m5898((char) (28135 - ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", "ɩ䴂\ue8f5潭", "\ue28b䍏본", (ViewConfiguration.getDoubleTapTimeout() >> 16) - 179502590).intern(), m8357);
            mo5900.put(m5898((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4446), "\u0000\u0000\u0000\u0000", "怖簱帘㠑", "࢞袊", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m8359);
            mo5900.put(m5896("ꢪ\u2ffe눶⥑", 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), this.f184);
            mo5900.put(m5898((char) (50001 - TextUtils.indexOf((CharSequence) "", '0')), "\u0000\u0000\u0000\u0000", "\udd4c⢜刌웃", "\udaec駵⅖", 203988189 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), this.f186);
            mo5900.put(m5898((char) (2158 - AndroidCharacter.getMirror('0')), "\u0000\u0000\u0000\u0000", "쨵ỻ㹧\uef08", "\ue662\ue93c\udf11", 1730083786 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m5894());
            if (ar.m6041().mo6044()) {
                mo5900.put(m5896("餙䦯뗔䅹", 4 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), true);
            }
            ao mo6054 = ar.m6041().mo6054();
            if (mo6054 != null) {
                String m6021 = mo6054.m6021();
                if (!TextUtils.isEmpty(m6021)) {
                    mo5900.put(m5898((char) (27121 - AndroidCharacter.getMirror('0')), "\u0000\u0000\u0000\u0000", "\ue914䀃섉硩", "詐䮝簏", Drawable.resolveOpacity(0, 0) + 155190249).intern(), m6021);
                }
            }
            if (z2) {
                m5893(mo5900);
                return mo5900;
            }
        } catch (JSONException e) {
            m.m8535(m5896("聈䓬㎠◤흣\uf726\udda9ན↑蔳嬭\ue596㧲梙ᦩ̻ᚐ鱥⎋\uf7e0钶胙\ue2cf残", 23 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m5896("㟯⋍갍Ȋ嗰历鲁彊쬺\uebc6\uf546疧䴐⧠Ꮴ묓嬭\ue596㧲梙ᕇ昣\ue02b뚏", 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), e);
        }
        return mo5900;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m5893(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f174 + 83;
        f177 = i2 % 128;
        int i3 = i2 % 2;
        it m8287 = jq.m8269().m8287();
        try {
            jSONObject.put(m5896("⅞∀쀮ᙄ㠏쉣ށࡴ할虰", KeyEvent.keyCodeFromString("") + 9).intern(), kj.m8414(m8287.m8109(), m8287.m8108(), m8287.m8111(), m8287.m8110()));
            int i4 = f177 + 65;
            f174 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e) {
            m.m8535(m5896("聈䓬㎠◤흣\uf726\udda9ན↑蔳嬭\ue596㧲梙ᦩ̻ᚐ鱥⎋\uf7e0钶胙\ue2cf残", 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m5898((char) (37181 - KeyEvent.normalizeMetaState(0)), "\u0000\u0000\u0000\u0000", "\ue9cd귮㷇양", "走퀜\udabd\uf28c廎㺦蚯\ud8f8\u18ab蒳易뵕⛎憼⛪筫Ｅ뒡ﱓ꺙ﴅ≜\uef93扰ᙉˢ\ue346㔼ꩋ瘄", View.resolveSizeAndState(0, 0, 0)).intern(), e);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m5896(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f179)) ^ ((c2 >>> 5) + f181)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f178) ^ ((c3 + i2) ^ ((c3 << 4) + f182))));
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m5898(char c, String str, String str2, String str3, int i) {
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
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f180) ^ f176) ^ f175);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
