package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.jl;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class jh {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2713 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2714 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2715;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2716;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String f2717;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f2718;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<Runnable> f2719 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private jj f2720;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jm f2721;

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m8171() {
        f2716 = (char) 7;
        f2713 = new char[]{'t', 'r', 'a', 'c', 'e', 'b', 'k', '.', 'v', GMTDateParser.DAY_OF_MONTH, GMTDateParser.MINUTES, 'o', GMTDateParser.SECONDS, 'l', '-', '4', FileSystemKt.UnixPathSeparator, Typography.dollar, '0', 'O', '\'', 'n', '9', 'K', '6', 'y', 'B', '7', '3', 'p', '1', 'P', '5', '~', GMTDateParser.HOURS, AbstractJsonLexerKt.UNICODE_ESC, 'i', 'T', 'N', 'H', 'W', '+', 'w', 'x', GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, Ascii.MAX};
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ jj m8164(jh jhVar) {
        int i = 2 % 2;
        int i2 = f2715 + 19;
        f2714 = i2 % 128;
        int i3 = i2 % 2;
        jj jjVar = jhVar.f2720;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return jjVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ jm m8166(jh jhVar) {
        int i = 2 % 2;
        int i2 = f2715 + 57;
        int i3 = i2 % 128;
        f2714 = i3;
        int i4 = i2 % 2;
        jm jmVar = jhVar.f2721;
        int i5 = i3 + 27;
        f2715 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return jmVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m8167() {
        int i = 2 % 2;
        int i2 = f2715 + 59;
        f2714 = i2 % 128;
        if (i2 % 2 != 0) {
            return f2717;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m8169(jh jhVar) {
        int i = 2 % 2;
        int i2 = f2715 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i3 = i2 % 128;
        f2714 = i3;
        int i4 = i2 % 2;
        List<Runnable> list = jhVar.f2719;
        int i5 = i3 + 57;
        f2715 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8172(jh jhVar, jl jlVar, iz izVar) {
        int i = 2 % 2;
        int i2 = f2714 + 19;
        f2715 = i2 % 128;
        int i3 = i2 % 2;
        jhVar.m8168(jlVar, izVar);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = f2714 + 77;
        f2715 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
    }

    static {
        m8171();
        f2717 = m8170(TextUtils.indexOf("", "", 0) + 70, "\u0012\u0013\u0011\f\b\u0014\u0013\r\f\u0014\u0016\u0017\u0018\u0019\u0016\u0012\u0019\u0005gg\u0005\u0002#\u001c\u0004\u0002\u0016 \u0002\u001c\u000e\u0019\u0011\u001c\u0004\u000f\t\u001d\u000b\u0002!\"\u0006\u001c\u0005\u0006\u0005\u000b\u0005\u001c'\u000b\u0000&\b+'\u0017%'\u0004#\u0005'\b\u0004\u0007\n#\u0014", (byte) (47 - TextUtils.lastIndexOf("", '0'))).intern();
        int i = f2715 + 79;
        f2714 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public jh(Context context, jj jjVar, String str) {
        this.f2721 = new jm(context, m8170(24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0001\u0002\u0003\u0004\u0005\u0006\u0003\u0004\u0000\r\u0001\r\b\n\u0000\f\u0002\u0005\u000b\f\u0001\u0005\f\u0002", (byte) (19 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), m8170(ImageFormat.getBitsPerPixel(0) + 18, "\r\f\f\u000b\t\u0006\u0013\u0007\u0005\u0004\u0002\u0005\u0007\u0015\u0010\b\u0090", (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46)).intern());
        this.f2720 = jjVar;
        this.f2718 = str;
        ar.m6041().mo6067(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ax
            /* renamed from: ﾇ */
            public final void mo5878() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(jh.m8169(jh.this));
                    jh.m8169(jh.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private synchronized String m8165() {
        String str;
        int i = 2 % 2;
        int i2 = f2715;
        int i3 = i2 + 105;
        f2714 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        str = this.f2718;
        int i4 = i2 + 37;
        f2714 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m8174(String str, String str2, iz izVar) {
        int i = 2 % 2;
        jl.d dVar = new jl.d(str, str2);
        if (ar.m6041().mo6052().m6040()) {
            int i2 = f2715 + 99;
            f2714 = i2 % 128;
            if (i2 % 2 != 0) {
                String m6039 = ar.m6041().mo6052().m6039(str);
                if (TextUtils.isEmpty(m6039)) {
                    return null;
                }
                dVar = new jl.c(str, str2, m6039);
            } else {
                TextUtils.isEmpty(ar.m6041().mo6052().m6039(str));
                throw null;
            }
        }
        String m8173 = m8173(dVar, izVar);
        int i3 = f2715 + 35;
        f2714 = i3 % 128;
        int i4 = i3 % 2;
        return m8173;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m8173(final jl jlVar, final iz izVar) {
        boolean z;
        if (TextUtils.isEmpty(jlVar.m8219()) || TextUtils.isEmpty(jlVar.m8216())) {
            return null;
        }
        String m8215 = jlVar.m8215();
        synchronized (this) {
            if (ar.m6041().mo6060()) {
                z = true;
            } else {
                this.f2719.add(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        jh.m8172(jh.this, jlVar, izVar);
                    }
                });
                z = false;
            }
        }
        if (z) {
            m8168(jlVar, izVar);
        }
        return this.f2721.m8233(m8215);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8168(final jl jlVar, final iz izVar) {
        int i = 2 % 2;
        final String obj = new StringBuilder().append(m8165()).append(m8170(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "0", (byte) (1 - (Process.myPid() >> 22))).intern()).append(jlVar.mo8217()).toString();
        final String m8215 = jlVar.m8215();
        if (ar.m6041().mo6069()) {
            int i2 = f2714 + 31;
            f2715 = i2 % 128;
            if (i2 % 2 != 0) {
                ar.m6041().mo6062();
                throw null;
            }
            if (ar.m6041().mo6062() || this.f2721.m8233(m8215) == null) {
                ke.m8356(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.1

                    /* renamed from: ﭴ, reason: contains not printable characters */
                    private static int f2722 = 1;

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static boolean f2723 = true;

                    /* renamed from: ﱟ, reason: contains not printable characters */
                    private static int f2724 = 0;

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static int f2725 = 58;

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static boolean f2726 = true;

                    /* renamed from: ﻏ, reason: contains not printable characters */
                    private static char[] f2727 = {143, 141, 'g', AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ, 131, 140, 159, Typography.section, Typography.copyright, Typography.registered, '~', '|', 157, 172, 179, 170, 158, 'Z', 173, Typography.pound, 168, 161, Typography.nbsp, 155, Typography.degree, 166, Typography.cent, 'i', Ascii.MAX};

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        int i3 = 2 % 2;
                        int i4 = f2724 + 79;
                        f2722 = i4 % 128;
                        Object obj2 = null;
                        if (i4 % 2 == 0) {
                            m8177(obj, jlVar, m8215, izVar);
                            super.hashCode();
                            throw null;
                        }
                        m8177(obj, jlVar, m8215, izVar);
                        int i5 = f2722 + 67;
                        f2724 = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
                    
                        if (r6.m8128().m8131() != 403) goto L37;
                     */
                    /* renamed from: ﻐ, reason: contains not printable characters */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private void m8177(String str, jl jlVar2, String str2, iz izVar2) {
                        int i3 = 2 % 2;
                        int i4 = f2722 + 95;
                        f2724 = i4 % 128;
                        Object obj2 = null;
                        if (i4 % 2 == 0) {
                            if (!jh.m8164(jh.this).m8184().m8158()) {
                                m8179(jlVar2, izVar2);
                                return;
                            }
                            try {
                                jd m8141 = jf.m8141(str);
                                if (m8141 != null && m8141.m8128().m8131() == 200) {
                                    String m8176 = m8176(jf.m8139(m8141));
                                    if (!Charset.forName(m8178(null, (ViewConfiguration.getTapTimeout() >> 16) + 127, null, "\u0086\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern()).newEncoder().canEncode(m8176)) {
                                        kl.m8458(m8178(null, KeyEvent.normalizeMetaState(0) + 127, null, "\u008d\u008c\u0088\u008b\u008a\u0089\u0088\u0087").intern(), new StringBuilder().append(m8178(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u0093\u0089\u008a\u008f\u0098\u0093\u0097\u0096\u0095\u008f\u008b\u0094\u0093\u0092\u0088\u008b\u0091\u0090\u008f\u008e\u0088\u008c").intern()).append(str).append(m8178(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, null, "\u0094\u008f\u0099\u009c\u008e\u0093\u0092\u0095\u009b\u0099\u009a\u0096\u0095\u0093\u0094\u0096\u0095\u0099\u008b\u0096\u008a\u008e\u0093").intern()).toString(), (Throwable) null, false);
                                        int i5 = f2722 + 13;
                                        f2724 = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            return;
                                        }
                                        super.hashCode();
                                        throw null;
                                    }
                                    if (TextUtils.isEmpty(m8176)) {
                                        return;
                                    }
                                    jh.m8166(jh.this).m8235(str2, m8176);
                                    p.m8549(new je(str2, m8176) { // from class: com.ironsource.adqualitysdk.sdk.i.jh.1.2

                                        /* renamed from: ﾇ, reason: contains not printable characters */
                                        private /* synthetic */ String f2737;

                                        {
                                            this.f2737 = m8176;
                                        }

                                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                                        /* renamed from: ｋ */
                                        public final void mo5828() {
                                            iz.this.mo6221(this.f2737);
                                        }
                                    });
                                    return;
                                }
                                if (!jh.m8164(jh.this).m8184().m8158()) {
                                    m8179(jlVar2, izVar2);
                                    return;
                                }
                                if (m8141 == null) {
                                    return;
                                }
                                int i6 = f2724 + 51;
                                f2722 = i6 % 128;
                                if (i6 % 2 == 0) {
                                    if (m8141.m8128().m8131() != 1893) {
                                        if (m8141.m8128().m8131() != 404) {
                                            return;
                                        }
                                    }
                                    if (str.contains(m8178(null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, null, "\u009d\u009a\u0096\u0088").intern())) {
                                        jlVar2.m8214();
                                        jh.this.m8173(jlVar2, izVar2);
                                    }
                                }
                            } catch (Exception e) {
                                if (!jh.m8164(jh.this).m8184().m8158()) {
                                    m8179(jlVar2, izVar2);
                                } else {
                                    kl.m8458(m8178(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, null, "\u008d\u008c\u0088\u008b\u008a\u0089\u0088\u0087").intern(), new StringBuilder().append(m8178(null, 127 - View.resolveSize(0, 0), null, "\u0093\u0089\u008a\u008f\u0098\u0093\u0097\u0096\u0095\u008f\u008b\u0082\u0093\u0088\u008b\u008a\u0089\u0088\u008f\u0093\u0097\u0096\u0095\u008b\u008b\u0088\u0097\u0093\u008f\u008a\u008f\u008f\u009e").intern()).append(str).toString(), (Throwable) e, false);
                                }
                            }
                        } else {
                            jh.m8164(jh.this).m8184().m8158();
                            super.hashCode();
                            throw null;
                        }
                    }

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static String m8176(String str) throws JSONException {
                        int i3 = 2 % 2;
                        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                        Object obj2 = null;
                        String optString = jsonObjectInit.optString(m8178(null, (ViewConfiguration.getTouchSlop() >> 8) + 127, null, "\u008e\u0096\u0088").intern());
                        if (!TextUtils.isEmpty(optString)) {
                            String m8355 = ke.m8355(optString, jh.m8167(), jsonObjectInit.optString(m8178(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u009a\u0095").intern()), jsonObjectInit.optString(m8178(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u008b\u009b\u0099\u0094").intern()));
                            int i4 = f2724 + 61;
                            f2722 = i4 % 128;
                            int i5 = i4 % 2;
                            return m8355;
                        }
                        int i6 = f2724 + 65;
                        f2722 = i6 % 128;
                        if (i6 % 2 != 0) {
                            return str;
                        }
                        super.hashCode();
                        throw null;
                    }

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private void m8179(final jl jlVar2, final iz izVar2) {
                        int i3 = 2 % 2;
                        jh.m8164(jh.this).m8184().m8160(new jb() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.1.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.jb
                            /* renamed from: ﻐ */
                            public final void mo5981() {
                                jh.m8164(jh.this).m8184().m8162(this);
                                jh.m8172(jh.this, jlVar2, izVar2);
                            }
                        });
                        int i4 = f2722 + 91;
                        f2724 = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static String m8178(String str, int i3, int[] iArr, String str2) {
                        byte[] bArr = str2;
                        if (str2 != null) {
                            bArr = str2.getBytes(C.ISO88591_NAME);
                        }
                        byte[] bArr2 = bArr;
                        char[] cArr = str;
                        if (str != null) {
                            cArr = str.toCharArray();
                        }
                        char[] cArr2 = cArr;
                        synchronized (k.f2956) {
                            char[] cArr3 = f2727;
                            int i4 = f2725;
                            if (f2723) {
                                int length = bArr2.length;
                                k.f2955 = length;
                                char[] cArr4 = new char[length];
                                k.f2957 = 0;
                                while (k.f2957 < k.f2955) {
                                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i3] - i4);
                                    k.f2957++;
                                }
                                return new String(cArr4);
                            }
                            if (f2726) {
                                int length2 = cArr2.length;
                                k.f2955 = length2;
                                char[] cArr5 = new char[length2];
                                k.f2957 = 0;
                                while (k.f2957 < k.f2955) {
                                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i3] - i4);
                                    k.f2957++;
                                }
                                return new String(cArr5);
                            }
                            int length3 = iArr.length;
                            k.f2955 = length3;
                            char[] cArr6 = new char[length3];
                            k.f2957 = 0;
                            while (k.f2957 < k.f2955) {
                                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i3] - i4);
                                k.f2957++;
                            }
                            return new String(cArr6);
                        }
                    }
                });
            }
        }
        int i3 = f2714 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2715 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m8175(jl jlVar) {
        int i = 2 % 2;
        int i2 = f2714 + 87;
        f2715 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f2721.m8233(jlVar.m8215()) != null) {
            return true;
        }
        int i4 = f2714 + 95;
        f2715 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8170(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2713;
            char c = f2716;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
