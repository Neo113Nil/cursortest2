package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jk {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2769 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2770;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2771 = {-582691312, 1924115435, -451963214, 284979676, -2112418696, -147628989, 523987450, -277916954, -225388084, -995723752, 842428440, -2085018337, -66989101, 114489072, -1123848973, 534971733, -513488456, 1377636630};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final int f2772;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final jm f2773;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f2774;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final String f2775;

    public interface b {
        /* renamed from: ﾇ */
        void mo5972(int i);
    }

    public interface c {
        /* renamed from: ﾒ */
        void mo5975(List<jn> list);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ int m8192(jk jkVar) {
        int i = 2 % 2;
        int i2 = f2769 + 61;
        f2770 = i2 % 128;
        return i2 % 2 != 0 ? 13568 : 10000;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m8193(jk jkVar, String str) {
        int i = 2 % 2;
        int i2 = f2769 + 107;
        f2770 = i2 % 128;
        if (i2 % 2 != 0) {
            jkVar.m8200(str);
            throw null;
        }
        String m8200 = jkVar.m8200(str);
        int i3 = f2769 + 63;
        f2770 = i3 % 128;
        int i4 = i3 % 2;
        return m8200;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m8194(jk jkVar) {
        int i = 2 % 2;
        int i2 = f2769 + 7;
        f2770 = i2 % 128;
        if (i2 % 2 == 0) {
            return jkVar.m8199();
        }
        jkVar.m8199();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m8195(jk jkVar, jn jnVar) {
        int i = 2 % 2;
        int i2 = f2770 + 67;
        f2769 = i2 % 128;
        int i3 = i2 % 2;
        String m8196 = jkVar.m8196(jnVar);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = f2769 + 33;
        f2770 = i5 % 128;
        int i6 = i5 % 2;
        return m8196;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ jm m8201(jk jkVar) {
        int i = 2 % 2;
        int i2 = f2769 + 45;
        int i3 = i2 % 128;
        f2770 = i3;
        int i4 = i2 % 2;
        jm jmVar = jkVar.f2773;
        int i5 = i3 + 7;
        f2769 = i5 % 128;
        int i6 = i5 % 2;
        return jmVar;
    }

    public jk(String str, String str2, jm jmVar) {
        this(str, str2, jmVar, (byte) 0);
    }

    private jk(String str, String str2, jm jmVar, byte b2) {
        this.f2774 = str2;
        this.f2772 = 10000;
        this.f2775 = str;
        this.f2773 = jmVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static jn m8198(JSONObject jSONObject) {
        int i = 2 % 2;
        jn jnVar = new jn(jSONObject);
        int i2 = f2770 + 111;
        f2769 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return jnVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8202(final int i, final c cVar) {
        int i2 = 2 % 2;
        jm.m8222().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.5

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f2793 = 1;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f2794 = -4869605148438052513L;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f2795;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i3 = 2 % 2;
                final ArrayList arrayList = new ArrayList();
                for (String str : jk.m8201(jk.this).m8234(jk.m8193(jk.this, m8208("\udb1a萃咋ﳇ\udb30", 1 - KeyEvent.getDeadChar(0, 0)).intern()), i).values()) {
                    try {
                        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                        arrayList.add(new jn(jsonObjectInit.getJSONObject(m8208("㭅溍睫鵣㬵꾽\uf5a6\ud90a㹽꠷Ｅ풛", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()), jsonObjectInit.optString(m8208("韰\ufdcb鳅碟鞅㳡Ḓ㳦", -MotionEvent.axisFromString("")).intern())));
                        int i4 = f2793 + 45;
                        f2795 = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Exception unused) {
                        m.m8525(jk.m8194(jk.this), m8208("課쪑岩詂諱ய\ude74츷辫ఙ퓧쎴耸ڧ텸씲", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new StringBuilder().append(m8208("䦥⣫ी\uee19䧦\ue9db讋ꩨ䲽\uee5e腝ꟴ䍽\ue4df蒄ꅩ妰樓騗모尶ￅ醍둼劬\uf444靊뇵椻쫉ꪈ譨濯켈ꀑ蓬户얽Ʞ膃磙\uda26봻鬌缈킹냬铌", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1).intern()).append(str).toString(), true);
                    }
                }
                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        cVar.mo5975(arrayList);
                    }
                });
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ﻐ */
            public final void mo6217(Throwable th) {
                int i3 = 2 % 2;
                super.mo6217(th);
                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.5.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        cVar.mo5975(new ArrayList());
                    }
                });
                int i4 = f2793 + 97;
                f2795 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m8208(String str, int i3) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (g.f2155) {
                    char[] m7785 = g.m7785(f2794, cArr2, i3);
                    g.f2157 = 4;
                    while (g.f2157 < m7785.length) {
                        g.f2156 = g.f2157 - 4;
                        m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2794));
                        g.f2157++;
                    }
                    str2 = new String(m7785, 4, m7785.length - 4);
                }
                return str2;
            }
        });
        int i3 = f2769 + 7;
        f2770 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8203(final b bVar) {
        int i = 2 % 2;
        jm.m8222().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.2

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f2778 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f2781;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char[] f2780 = {20943};

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f2779 = 5823997524483215100L;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i2 = 2 % 2;
                final int m8231 = jk.m8201(jk.this).m8231(jk.m8193(jk.this, m8206((char) ((-16756251) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()));
                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        bVar.mo5972(m8231);
                    }
                });
                int i3 = f2781 + 33;
                f2778 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m8206(char c2, int i2, int i3) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1197) {
                    char[] cArr = new char[i3];
                    com.ironsource.adqualitysdk.sdk.i.c.f1198 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.c.f1198 < i3) {
                        cArr[com.ironsource.adqualitysdk.sdk.i.c.f1198] = (char) ((f2780[com.ironsource.adqualitysdk.sdk.i.c.f1198 + i2] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1198 * f2779)) ^ c2);
                        com.ironsource.adqualitysdk.sdk.i.c.f1198++;
                    }
                    str = new String(cArr);
                }
                return str;
            }
        });
        int i2 = f2769 + 9;
        f2770 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8205(final jn jnVar, final je jeVar) {
        int i = 2 % 2;
        jm.m8222().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.4

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f2786 = 0;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f2787 = 1;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f2788 = {GMTDateParser.ANY, 'C', 'a', 'c', GMTDateParser.HOURS, 'e', 'S', 't', 'o', 'r', 'g', 'T', 'i', GMTDateParser.SECONDS, ' ', 'b', GMTDateParser.DAY_OF_MONTH, '!', 'n', '\'', 'k', 'y', 'f', 'j', AbstractJsonLexerKt.COLON};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char f2789 = 5;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x00ad, code lost:
            
                r6 = r2.m8242().toString();
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x00b7, code lost:
            
                r7 = com.ironsource.adqualitysdk.sdk.i.jk.AnonymousClass4.f2787 + 63;
                com.ironsource.adqualitysdk.sdk.i.jk.AnonymousClass4.f2786 = r7 % 128;
                r7 = r7 % 2;
                com.ironsource.adqualitysdk.sdk.i.m.m8529(com.ironsource.adqualitysdk.sdk.i.jk.m8194(r10.f2792), m8207(12 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "\u0002\u0003\u0004\u0000\u0006\u0007\b\t\u0007\u0004\u000f\n", (byte) (android.text.TextUtils.indexOf("", "") + 47)).intern(), m8207(16 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0002\u0003\u0004\u0000\r\u0011\u000b\n\u0005\u0012\u0014\b\u0002\bn", (byte) (52 - android.text.TextUtils.getOffsetAfter("", 0))).intern(), r6, true);
                com.ironsource.adqualitysdk.sdk.i.jk.m8201(r10.f2792).m8232(r1, r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0104, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
            
                if (android.text.TextUtils.isEmpty(r1) != false) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0061, code lost:
            
                if (android.text.TextUtils.isEmpty(r1) != false) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0072, code lost:
            
                com.ironsource.adqualitysdk.sdk.i.m.m8525(com.ironsource.adqualitysdk.sdk.i.jk.m8194(r10.f2792), m8207((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 12, "\u0002\u0003\u0004\u0000\u0006\u0007\b\t\u0007\u0004\u000f\n", (byte) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 48)).intern(), m8207(45 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "\u000e\u0001\r\u000e\n\r\u000e\n\u0011\u0000\u0011\u0012\u000b\u0004\u0003\u0011\u0011\t\n\u000b\u0006\b\n\u000e\b\t\u0007\u0004\u000f\n\n\u0018\u0006\u0014\f\u0018\t\u0005\r\t\u0012\u0014\b\u0000\u0094", (byte) (android.os.Process.getGidForName("") + 33)).intern(), true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x00ac, code lost:
            
                return;
             */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void mo5828() {
                String m8195;
                int i2 = 2 % 2;
                int i3 = f2786 + 7;
                f2787 = i3 % 128;
                int i4 = i3 % 2;
                if (jk.m8201(jk.this).m8231(jk.m8193(jk.this, m8207(1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExifInterface.LATITUDE_SOUTH, (byte) (41 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) <= jk.m8192(jk.this)) {
                    int i5 = f2787 + 3;
                    f2786 = i5 % 128;
                    if (i5 % 2 != 0) {
                        m8195 = jk.m8195(jk.this, jnVar);
                        int i6 = 60 / 0;
                    } else {
                        m8195 = jk.m8195(jk.this, jnVar);
                    }
                }
                je jeVar2 = jeVar;
                if (jeVar2 != null) {
                    p.m8554(jeVar2);
                    int i7 = f2786 + 85;
                    f2787 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m8207(int i2, String str, byte b2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (j.f2674) {
                    char[] cArr3 = f2788;
                    char c2 = f2789;
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
        });
        int i2 = f2769 + 105;
        f2770 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8204(final jn jnVar) {
        int i = 2 % 2;
        jm.m8222().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                jk.m8201(jk.this).m8227(jk.m8195(jk.this, jnVar));
            }
        });
        int i2 = f2769 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2770 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m8196(jn jnVar) {
        int i = 2 % 2;
        int i2 = f2770 + 57;
        f2769 = i2 % 128;
        int i3 = i2 % 2;
        String m8200 = m8200(jnVar.m8240());
        int i4 = f2770 + 113;
        f2769 = i4 % 128;
        if (i4 % 2 != 0) {
            return m8200;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m8200(String str) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f2774).append(str).toString();
        int i2 = f2770 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2769 = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m8199() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m8197(new int[]{235701349, 1115764619, 932403187, 1059882888, -845004983, -1318028799, 446969457, 283280006}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14).intern()).append(this.f2775).append(m8197(new int[]{-1112986590, -1836055716}, (KeyEvent.getMaxKeyCode() >> 16) + 1).intern()).toString();
        int i2 = f2770 + 79;
        f2769 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8197(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2771.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
