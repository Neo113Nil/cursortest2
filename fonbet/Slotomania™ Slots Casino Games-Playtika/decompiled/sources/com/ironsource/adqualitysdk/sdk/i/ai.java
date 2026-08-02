package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.adqualitysdk.sdk.i.ah;
import com.ironsource.adqualitysdk.sdk.i.jk;
import com.ironsource.adqualitysdk.sdk.i.jm;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ai {

    /* renamed from: ヮ, reason: contains not printable characters */
    private static int f212 = 0;

    /* renamed from: 乁, reason: contains not printable characters */
    private static int f213 = 1;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private String f217;

    /* renamed from: ףּ, reason: contains not printable characters */
    private r f218;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private jb f219;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Context f220;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private ju f221;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private af f222;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean f224;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Handler f225;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private boolean f226;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ah f229;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private al f230;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f231;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private jk f232;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jj f233;

    /* renamed from: סּ, reason: contains not printable characters */
    private static int[] f216 = {-273396827, 1991117988, -140373644, -1899534251, 1812404021, 1179041260, -1405591274, 1352431095, -362664538, 1756310275, 1956557433, 1054952864, 1851384113, 829553372, -864998997, -1150917754, -1922972381, 1600772937};

    /* renamed from: 爫, reason: contains not printable characters */
    private static char f214 = 6;

    /* renamed from: טּ, reason: contains not printable characters */
    private static char[] f215 = {GMTDateParser.SECONDS, 'o', GMTDateParser.MINUTES, 'l', 'a', '-', 'e', 'c', 'r', 't', '4', 'n', 'y', 'i', 'v', '.', 'E', ' ', 'A', 'p', 'T', 'B', 'k', 'g', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.DAY_OF_MONTH, 'w', GMTDateParser.HOURS, 'x', 'f', AbstractJsonLexerKt.COLON, 'N', 'U', 'S', GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ};

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List<ae> f228 = new ArrayList();

    /* renamed from: ﺙ, reason: contains not printable characters */
    private List<jm.d> f227 = new ArrayList();

    /* renamed from: ﮌ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f223 = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: ףּ, reason: contains not printable characters */
    static /* synthetic */ jj m5906(ai aiVar) {
        int i = 2 % 2;
        int i2 = f212;
        int i3 = i2 + 7;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        jj jjVar = aiVar.f233;
        int i5 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f213 = i5 % 128;
        int i6 = i5 % 2;
        return jjVar;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ List m5907(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 29;
        int i3 = i2 % 128;
        f212 = i3;
        int i4 = i2 % 2;
        List<jm.d> list = aiVar.f227;
        int i5 = i3 + 19;
        f213 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return list;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    static /* synthetic */ al m5909(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 79;
        int i3 = i2 % 128;
        f212 = i3;
        int i4 = i2 % 2;
        al alVar = aiVar.f230;
        int i5 = i3 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f213 = i5 % 128;
        int i6 = i5 % 2;
        return alVar;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ ah m5911(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 19;
        int i3 = i2 % 128;
        f212 = i3;
        int i4 = i2 % 2;
        ah ahVar = aiVar.f229;
        int i5 = i3 + 77;
        f213 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return ahVar;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ String m5913(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 5;
        f212 = i2 % 128;
        if (i2 % 2 != 0) {
            aiVar.m5905();
            throw null;
        }
        String m5905 = aiVar.m5905();
        int i3 = f213 + 65;
        f212 = i3 % 128;
        int i4 = i3 % 2;
        return m5905;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ jk m5915(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 21;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        jk jkVar = aiVar.f232;
        if (i3 == 0) {
            return jkVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ void m5918(ai aiVar) {
        int i = 2 % 2;
        int i2 = f212 + 93;
        f213 = i2 % 128;
        aiVar.m5943(i2 % 2 == 0);
        int i3 = f212 + 33;
        f213 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ void m5920(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 33;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m5908();
        int i4 = f212 + 9;
        f213 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ void m5922(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 35;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m5919();
        int i4 = f212 + 33;
        f213 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ int m5923(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 85;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        int m5904 = aiVar.m5904();
        int i4 = f212 + 59;
        f213 = i4 % 128;
        int i5 = i4 % 2;
        return m5904;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ void m5925(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 91;
        f212 = i2 % 128;
        aiVar.m5938(i2 % 2 == 0);
        int i3 = f213 + 79;
        f212 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5930(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m5921();
        int i4 = f213 + 53;
        f212 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5931(ai aiVar, int i) {
        int i2 = 2 % 2;
        int i3 = f212 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        aiVar.m5929(i);
        int i5 = f213 + 97;
        f212 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5932(ai aiVar, List list, ji jiVar) {
        int i = 2 % 2;
        int i2 = f213 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m5947((List<ag>) list, jiVar);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5933(ai aiVar, JSONObject jSONObject, je jeVar) {
        int i = 2 % 2;
        int i2 = f213 + 9;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m5937(jSONObject, jeVar);
        int i4 = f212 + 1;
        f213 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ r m5935(ai aiVar) {
        int i = 2 % 2;
        int i2 = f212;
        int i3 = i2 + 61;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        r rVar = aiVar.f218;
        int i5 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f213 = i5 % 128;
        int i6 = i5 % 2;
        return rVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m5941(ai aiVar, ag agVar) {
        int i = 2 % 2;
        int i2 = f213 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        boolean m5940 = aiVar.m5940(agVar);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return m5940;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ af m5942(ai aiVar) {
        int i = 2 % 2;
        int i2 = f212 + 95;
        int i3 = i2 % 128;
        f213 = i3;
        int i4 = i2 % 2;
        af afVar = aiVar.f222;
        int i5 = i3 + 91;
        f212 = i5 % 128;
        int i6 = i5 % 2;
        return afVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m5944(ai aiVar, int i) {
        int i2 = 2 % 2;
        int i3 = f212 + 25;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        boolean m5939 = aiVar.m5939(i);
        int i5 = f213 + 61;
        f212 = i5 % 128;
        int i6 = i5 % 2;
        return m5939;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Thread.UncaughtExceptionHandler m5946(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 99;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = aiVar.f223;
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return uncaughtExceptionHandler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5950(ai aiVar) {
        int i = 2 % 2;
        int i2 = f213 + 7;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m5949(false);
        int i4 = f212 + 33;
        f213 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public ai(Context context, as asVar, al alVar, boolean z, String str, r rVar) {
        this.f218 = rVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f267 = 0;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f268 = 1;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static long f269 = 2505939019195218751L;

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                int i = 2 % 2;
                int i2 = f267 + 53;
                f268 = i2 % 128;
                int i3 = i2 % 2;
                kl.m8450(m5976("ꆹ䔔畨݃ꇸ빅荷\uf692䴼굛陻\ud999砲", -TextUtils.indexOf((CharSequence) "", '0')).intern(), m5976("뛵咉왲팂뚠꿘は⋞婼볕╠ා漭臛ᙼᣔ灤雊筴毚ժ\ufbc8", -ExpandableListView.getPackedPositionChild(0L)).intern(), m5976("霍൲\uf1f3댌静\uf63f߬䋒箔\ue52bየ淖亞", Drawable.resolveOpacity(0, 0) + 1).intern(), th);
                ai.this.m5958();
                if (ai.m5946(ai.this) == null) {
                    try {
                        Process.killProcess(Process.myPid());
                        System.exit(10);
                    } catch (SecurityException unused) {
                    }
                } else {
                    int i4 = f267 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f268 = i4 % 128;
                    if (i4 % 2 != 0) {
                        ai.m5946(ai.this).uncaughtException(thread, th);
                    } else {
                        ai.m5946(ai.this).uncaughtException(thread, th);
                        throw null;
                    }
                }
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m5976(String str2, int i) {
                String str3;
                char[] cArr = str2;
                if (str2 != null) {
                    cArr = str2.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (g.f2155) {
                    char[] m7785 = g.m7785(f269, cArr2, i);
                    g.f2157 = 4;
                    while (g.f2157 < m7785.length) {
                        g.f2156 = g.f2157 - 4;
                        m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f269));
                        g.f2157++;
                    }
                    str3 = new String(m7785, 4, m7785.length - 4);
                }
                return str3;
            }
        });
        this.f230 = alVar;
        this.f220 = context;
        jm jmVar = new jm(context, m5936(new int[]{-968057682, -578501872, -32246131, 1530168203, 1626638423, 1824758932, 1107459845, -936546178, 689654494, -1042904481, 1937791097, 508227192, -1716780430, 1956801535}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 25).intern(), m5927(TextUtils.indexOf("", "", 0) + 24, "\u0001\u0002\u0002\u0003\u0004\u0005\u0000\u0001\u0007\b\t\u0007\u000b\u0003\u0010\n\n\u0005\u0000\u000f\u0007\u000f\u0006\u0001", (byte) (21 - KeyEvent.normalizeMetaState(0))).intern());
        this.f232 = new jk(m5936(new int[]{1062436741, 1147541228, 89445770, 1827172052}, 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m5927((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, "\b\f\u0007\u0006\u000f\u0015", (byte) (48 - ImageFormat.getBitsPerPixel(0))).intern(), jmVar);
        int m5926 = m5926(jmVar);
        this.f229 = new ah(context, asVar, m5926, m5945(jmVar), ar.m6041().mo6045());
        this.f233 = new jj(context);
        this.f231 = false;
        HandlerThread handlerThread = new HandlerThread(m5936(new int[]{1878304910, -79956209, 333456112, -1267285209, -962777280, 702027236, 1055773906, -1568630021}, 14 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        handlerThread.start();
        this.f225 = new Handler(handlerThread.getLooper());
        this.f222 = new af(m5926);
        this.f224 = !z;
        this.f217 = str;
        m5949(true);
        m5924();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
    
        if (r4.f225 != null) goto L11;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m5957() {
        int i = 2 % 2;
        int i2 = f212;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f213 = i3 % 128;
        if (i3 % 2 == 0) {
            this.f231 = true;
            if (this.f225 != null) {
                int i4 = i2 + 17;
                f213 = i4 % 128;
                int i5 = i4 % 2;
                this.f225.removeCallbacksAndMessages(null);
            }
            this.f233.m8185();
            m5917();
        } else {
            this.f231 = false;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m5938(boolean z) {
        int i = 2 % 2;
        int i2 = f213 + 91;
        f212 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f231 = false;
        } else {
            this.f231 = true;
        }
        m5949(true);
        int i3 = f212 + 75;
        f213 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m5954(ae aeVar) {
        int i = 2 % 2;
        int i2 = f212 + 55;
        f213 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f228.add(aeVar);
            throw null;
        }
        this.f228.add(aeVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5961(jm.d dVar) {
        int i = 2 % 2;
        int i2 = f212 + 63;
        f213 = i2 % 128;
        int i3 = i2 % 2;
        this.f227.add(dVar);
        int i4 = f213 + 73;
        f212 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r4.f224 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r4.f224 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        m5956();
        r1 = com.ironsource.adqualitysdk.sdk.i.ai.f213 + 53;
        com.ironsource.adqualitysdk.sdk.i.ai.f212 = r1 % 128;
        r1 = r1 % 2;
     */
    /* renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m5919() {
        int i = 2 % 2;
        int i2 = f213 + 23;
        f212 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        this.f224 = false;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5953() {
        int i = 2 % 2;
        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.6

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char f295 = 3;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f296 = {'t', 'p', '_', GMTDateParser.SECONDS, 'e', 'n', GMTDateParser.DAY_OF_MONTH, AbstractJsonLexerKt.UNICODE_ESC, 'v'};

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f297 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f298 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i2 = 2 % 2;
                ai.m5935(ai.this).onEvent(m5979((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, "\u0001\u0002\u0000\u0005\u0005\u0004\u0005\u0000\u0005\u0003«", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 70)).intern());
                ai.this.m5959(m5979(12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0001\u0002\u0000\u0005\u0005\u0004\u0005\u0000\u0005\u0003«", (byte) (71 - ExpandableListView.getPackedPositionType(0L))).intern(), IronSourceNetworkBridge.jsonObjectInit());
                int i3 = f297 + 101;
                f298 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m5979(int i2, String str, byte b) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (j.f2674) {
                    char[] cArr3 = f296;
                    char c = f295;
                    char[] cArr4 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr4[i2] = (char) (cArr2[i2] - b);
                    }
                    if (i2 > 1) {
                        j.f2681 = 0;
                        while (j.f2681 < i2) {
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
                                    int i3 = (j.f2679 * c) + j.f2676;
                                    int i4 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i3];
                                    cArr4[j.f2681 + 1] = cArr3[i4];
                                } else if (j.f2679 == j.f2678) {
                                    j.f2676 = ((j.f2676 + c) - 1) % c;
                                    j.f2675 = ((j.f2675 + c) - 1) % c;
                                    int i5 = (j.f2679 * c) + j.f2676;
                                    int i6 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i5];
                                    cArr4[j.f2681 + 1] = cArr3[i6];
                                } else {
                                    int i7 = (j.f2679 * c) + j.f2675;
                                    int i8 = (j.f2678 * c) + j.f2676;
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
        int i2 = f213 + 115;
        f212 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5956() {
        int i = 2 % 2;
        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.9

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f307 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f308 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static boolean f309 = true;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static boolean f310 = true;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f311 = 13;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f312 = {129, AbstractJsonLexerKt.END_OBJ, 'l', 128, 'r', 'n', Ascii.MAX};

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i2 = 2 % 2;
                Object obj = null;
                ai.m5935(ai.this).onEvent(m5982(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0081\u0087\u0086\u0081\u0084\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern());
                ai.this.m5959(m5982(null, 127 - KeyEvent.keyCodeFromString(""), null, "\u0081\u0087\u0086\u0081\u0084\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern(), IronSourceNetworkBridge.jsonObjectInit());
                int i3 = f308 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f307 = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m5982(String str, int i2, int[] iArr, String str2) {
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
                    char[] cArr3 = f312;
                    int i3 = f311;
                    if (f310) {
                        int length = bArr2.length;
                        k.f2955 = length;
                        char[] cArr4 = new char[length];
                        k.f2957 = 0;
                        while (k.f2957 < k.f2955) {
                            cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i2] - i3);
                            k.f2957++;
                        }
                        return new String(cArr4);
                    }
                    if (f309) {
                        int length2 = cArr2.length;
                        k.f2955 = length2;
                        char[] cArr5 = new char[length2];
                        k.f2957 = 0;
                        while (k.f2957 < k.f2955) {
                            cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i2] - i3);
                            k.f2957++;
                        }
                        return new String(cArr5);
                    }
                    int length3 = iArr.length;
                    k.f2955 = length3;
                    char[] cArr6 = new char[length3];
                    k.f2957 = 0;
                    while (k.f2957 < k.f2955) {
                        cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i2] - i3);
                        k.f2957++;
                    }
                    return new String(cArr6);
                }
            }
        });
        int i2 = f212 + 115;
        f213 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5958() {
        int i = 2 % 2;
        int i2 = f213 + 105;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f224 = true;
            m5953();
            m5960();
            int i4 = f213 + 115;
            f212 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Exception e) {
            kl.m8458(m5936(new int[]{-975114579, 715142747, 1937791097, 508227192, -1716780430, 1956801535}, 9 - Color.green(0)).intern(), m5927(27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u000e\n\u0007\u0002\u000b\u000e\u0011\u0007\r\u0005\u0006\u0017¼¼\u0013\u0002\u0016\u0003\n\u0013\u0014\u000b\u0000\u0019\u0007\u001d", (byte) ('|' - AndroidCharacter.getMirror('0'))).intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5960() {
        synchronized (this) {
            Handler handler = this.f225;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            m5949(true);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m5928(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(m5936(new int[]{1944005695, 1805443840, -572114337, -839421583}, 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), str);
            jsonObjectInit.put(m5936(new int[]{-1232119428, 1223538008, -572114337, -839421583}, TextUtils.getOffsetBefore("", 0) + 5).intern(), str2);
            jsonObjectInit.put(m5936(new int[]{1205636218, 808946429, -984365930, -1293069947}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                int i2 = f212 + 11;
                f213 = i2 % 128;
                jsonObjectInit.put(i2 % 2 == 0 ? m5927(5 >>> Color.blue(0), "\u0007\t\u0003\u0006¼", (byte) (20 >> (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern() : m5927(Color.blue(0) + 5, "\u0007\t\u0003\u0006¼", (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 80)).intern(), str4);
            }
            if (jSONObject != null) {
                int i3 = f213 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f212 = i3 % 128;
                int i4 = i3 % 2;
                kj.m8425(jsonObjectInit, jSONObject);
            }
            return jsonObjectInit;
        } catch (JSONException e) {
            m.m8535(m5936(new int[]{-975114579, 715142747, 1937791097, 508227192, -1716780430, 1956801535}, TextUtils.indexOf((CharSequence) "", '0', 0) + 10).intern(), m5927(Process.getGidForName("") + 27, "\u000e\n\u0007\u0002\u000b\u000e\u0001\u001c\u001f\u0013\u0011\u001d\f\u000b××\u0002\u0007\u000e\u0005\f\u0006\u0001\u0005\u0012\u000b", (byte) (100 - TextUtils.lastIndexOf("", '0'))).intern(), e);
            return jsonObjectInit;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5959(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f212 + 19;
        f213 = i2 % 128;
        int i3 = i2 % 2;
        m5951(str, jSONObject, null);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = f213 + 59;
        f212 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m5951(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 2 % 2;
        int i2 = f212 + 13;
        f213 = i2 % 128;
        int i3 = i2 % 2;
        m5955(str, jSONObject, jSONObject2, null);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5955(String str, JSONObject jSONObject, JSONObject jSONObject2, final je jeVar) {
        int i = 2 % 2;
        m.m8528(m5936(new int[]{-975114579, 715142747, 1937791097, 508227192, -1716780430, 1956801535}, TextUtils.indexOf((CharSequence) "", '0') + 10).intern(), new StringBuilder().append(m5936(new int[]{1728509119, 53460020, -965694690, -1915944890, 2046216842, 1654453183, 389467243, -5358556, 1569405817, 624472978, -256904007, -2060025598}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22).intern()).append(str).append(m5927(TextUtils.indexOf("", "") + 17, "\u000e\u001d\u000f\u0007\u001d\u000f\n\u0018\n\t\u0005\u0010\u0011\u0007\u0019\u0005M", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19)).intern()).toString(), jSONObject);
        try {
            Object obj = null;
            if (m5910().m6031().contains(str)) {
                m.m8519(m5936(new int[]{-975114579, 715142747, 1937791097, 508227192, -1716780430, 1956801535}, 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new StringBuilder().append(m5927('M' - AndroidCharacter.getMirror('0'), "\u0001\u0007\u000b\u000f\u0006\f\u0007\u001d\u0011\u0007\u001d\u0017\b\f\u0007\u0006\u000b\u000f\u0019\u000e\u000f!\u0017\u0011\u0005\u0003\f\u0000\u0081", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 97)).intern()).append(str).append(m5936(new int[]{-15185019, -1897799905, 155216459, 1638256051, 164596872, 1182274276, -739962942, -1932881033, 532477109, -528299008, 478183925, -1539380835}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21).intern()).toString());
                int i2 = f213 + 37;
                f212 = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                super.hashCode();
                throw null;
            }
            m.m8519(m5936(new int[]{-975114579, 715142747, 1937791097, 508227192, -1716780430, 1956801535}, Process.getGidForName("") + 10).intern(), new StringBuilder().append(m5927((ViewConfiguration.getFadingEdgeLength() >> 16) + 32, "\u001a\u000e\r\u000e\u0011\u001d\u000f\u000b\u0005\r\u0006\f\u0007\u001d\f\u000b\f\b\u0006\n\u000e\u001d\u000f\u0007\u001d\u000f\n\u0005\u0000\b#\f", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 120)).intern()).append(str).toString());
            this.f229.m5901(str, jSONObject, jSONObject2, this.f233.m8184().m8158(), new ah.d() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7
                @Override // com.ironsource.adqualitysdk.sdk.i.ah.d
                public void onEventGenerated(JSONObject jSONObject3) {
                    ai.m5942(ai.this).m5876(jSONObject3);
                    ai.m5933(ai.this, jSONObject3, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7.2

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static int f302 = 72;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f303 = 1;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f304;

                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            int i3 = 2 % 2;
                            ai.m5950(ai.this);
                            if (jeVar != null) {
                                int i4 = f304 + 29;
                                f303 = i4 % 128;
                                try {
                                    if (i4 % 2 == 0) {
                                        jeVar.mo5828();
                                        Object obj2 = null;
                                        super.hashCode();
                                        throw null;
                                    }
                                    jeVar.mo5828();
                                    int i5 = f303 + 57;
                                    f304 = i5 % 128;
                                    int i6 = i5 % 2;
                                } catch (Exception e) {
                                    kl.m8459(m5980(View.resolveSizeAndState(0, 0, 0) + 9, false, 176 - (ViewConfiguration.getTouchSlop() >> 8), "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m5980(Color.green(0) + 32, true, 168 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0012\u000f\u0012\u0012￥\u000e\u000f\t\u0014\u0005\f\u0010\r\u000f￣\u000e\u000f\uffc0ￚ\u0014\u000e\u0005\u0016￥\u0004\u000e\u0005\u0013\uffc0\u000e\t\uffc0", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5).intern(), (Throwable) e, false, false, true);
                                }
                            }
                        }

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static String m5980(int i3, boolean z, int i4, String str2, int i5) {
                            String str3;
                            char[] cArr = str2;
                            if (str2 != null) {
                                cArr = str2.toCharArray();
                            }
                            char[] cArr2 = cArr;
                            synchronized (d.f1644) {
                                char[] cArr3 = new char[i3];
                                d.f1641 = 0;
                                while (d.f1641 < i3) {
                                    d.f1643 = cArr2[d.f1641];
                                    cArr3[d.f1641] = (char) (d.f1643 + i4);
                                    int i6 = d.f1641;
                                    cArr3[i6] = (char) (cArr3[i6] - f302);
                                    d.f1641++;
                                }
                                if (i5 > 0) {
                                    d.f1642 = i5;
                                    char[] cArr4 = new char[i3];
                                    System.arraycopy(cArr3, 0, cArr4, 0, i3);
                                    System.arraycopy(cArr4, 0, cArr3, i3 - d.f1642, d.f1642);
                                    System.arraycopy(cArr4, d.f1642, cArr3, 0, i3 - d.f1642);
                                }
                                if (z) {
                                    char[] cArr5 = new char[i3];
                                    d.f1641 = 0;
                                    while (d.f1641 < i3) {
                                        cArr5[d.f1641] = cArr3[(i3 - d.f1641) - 1];
                                        d.f1641++;
                                    }
                                    cArr3 = cArr5;
                                }
                                str3 = new String(cArr3);
                            }
                            return str3;
                        }
                    });
                }
            });
            int i3 = f212 + 81;
            f213 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            super.hashCode();
            throw null;
        } catch (Exception e) {
            kl.m8459(m5936(new int[]{-975114579, 715142747, 1937791097, 508227192, -1716780430, 1956801535}, 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m5936(new int[]{-951392180, 625823943, -457146318, 803927118, 59608803, -217702102, -1250346357, 2068411852, -1956270719, 1078703535}, View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern(), (Throwable) e, false, false, true);
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m5921() {
        int i = 2 % 2;
        int i2 = f213 + 41;
        f212 = i2 % 128;
        m5949(i2 % 2 != 0);
        int i3 = f212 + 35;
        f213 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m5924() {
        int i = 2 % 2;
        this.f219 = new jb() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.8
            @Override // com.ironsource.adqualitysdk.sdk.i.jb
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5981() {
                ai.m5930(ai.this);
            }
        };
        this.f233.m8184().m8160(this.f219);
        this.f221 = new ju(new jx() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f241 = 0;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f242 = 1;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f244 = {'a', 20237, 40616, 60932, 15833, 36171, 56561, 'A', 20224, 40637, 60966, 15809, 36178, 56573, 11361, 31491, 42820, 59421, 14767, 18724, 39627, 10759, 31732, 35687, 56341, 28086, 48419, 52956, 7689, 45046, 65382, 7, 20872, 57657, 13012, 16991, 37856, 8999, 29723, 34178, 54588, 26330};

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f243 = -1282943046550728850L;

            /* renamed from: ﾇ, reason: contains not printable characters */
            static /* synthetic */ JSONObject m5965(Activity activity) {
                int i2 = 2 % 2;
                int i3 = f241 + 7;
                f242 = i3 % 128;
                if (i3 % 2 != 0) {
                    return m5963(activity);
                }
                m5963(activity);
                Object obj = null;
                super.hashCode();
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo5967(final Activity activity) {
                int i2 = 2 % 2;
                p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10.2

                    /* renamed from: ﻏ, reason: contains not printable characters */
                    private static int f246 = 1;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static char[] f247 = {'f', 'o', 'c', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.SECONDS, '_', 'l', 't', 'g'};

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static char f248 = 3;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static int f249;

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        int i3 = 2 % 2;
                        int i4 = f249 + 13;
                        f246 = i4 % 128;
                        int i5 = i4 % 2;
                        ai.m5935(ai.this).onEvent(m5968(9 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0001\u0002\u0000\u0005\u0005\u0003\u0007\u0000\u0007\u0001", (byte) (57 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern());
                        ai.this.m5959(m5968(Process.getGidForName("") + 11, "\u0001\u0002\u0000\u0005\u0005\u0003\u0007\u0000\u0007\u0001", (byte) (View.combineMeasuredStates(0, 0) + 57)).intern(), AnonymousClass10.m5965(activity));
                        int i6 = f246 + 77;
                        f249 = i6 % 128;
                        int i7 = i6 % 2;
                    }

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static String m5968(int i3, String str, byte b) {
                        String str2;
                        char[] cArr = str;
                        if (str != null) {
                            cArr = str.toCharArray();
                        }
                        char[] cArr2 = cArr;
                        synchronized (j.f2674) {
                            char[] cArr3 = f247;
                            char c = f248;
                            char[] cArr4 = new char[i3];
                            if (i3 % 2 != 0) {
                                i3--;
                                cArr4[i3] = (char) (cArr2[i3] - b);
                            }
                            if (i3 > 1) {
                                j.f2681 = 0;
                                while (j.f2681 < i3) {
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
                                            int i4 = (j.f2679 * c) + j.f2676;
                                            int i5 = (j.f2678 * c) + j.f2675;
                                            cArr4[j.f2681] = cArr3[i4];
                                            cArr4[j.f2681 + 1] = cArr3[i5];
                                        } else if (j.f2679 == j.f2678) {
                                            j.f2676 = ((j.f2676 + c) - 1) % c;
                                            j.f2675 = ((j.f2675 + c) - 1) % c;
                                            int i6 = (j.f2679 * c) + j.f2676;
                                            int i7 = (j.f2678 * c) + j.f2675;
                                            cArr4[j.f2681] = cArr3[i6];
                                            cArr4[j.f2681 + 1] = cArr3[i7];
                                        } else {
                                            int i8 = (j.f2679 * c) + j.f2675;
                                            int i9 = (j.f2678 * c) + j.f2676;
                                            cArr4[j.f2681] = cArr3[i8];
                                            cArr4[j.f2681 + 1] = cArr3[i9];
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
                int i3 = f242 + 65;
                f241 = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo5966(final Activity activity) {
                int i2 = 2 % 2;
                p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10.4

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static short[] f252 = null;

                    /* renamed from: ﱟ, reason: contains not printable characters */
                    private static byte[] f253 = {-99, 68, SignedBytes.MAX_POWER_OF_TWO, Ascii.DLE, 72, Ascii.DC2, 19, SignedBytes.MAX_POWER_OF_TWO, 32, 53, 67, Ascii.US, Base64.padSymbol, Ascii.SUB};

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static int f254 = 1;

                    /* renamed from: ﻏ, reason: contains not printable characters */
                    private static int f255 = 0;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static int f256 = 256025723;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static int f257 = 113;

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static int f258 = -305507509;

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        int i3 = 2 % 2;
                        int i4 = f255 + 77;
                        f254 = i4 % 128;
                        int i5 = i4 % 2;
                        ai.m5935(ai.this).onEvent(m5969((short) ((-43) - KeyEvent.normalizeMetaState(0)), (-256025621) - (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 114, 305507509 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((-26) - (KeyEvent.getMaxKeyCode() >> 16))).intern());
                        ai.this.m5959(m5969((short) ((-42) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 256025622, MotionEvent.axisFromString("") - 113, 305507509 - View.resolveSizeAndState(0, 0, 0), (byte) (Color.blue(0) - 26)).intern(), AnonymousClass10.m5965(activity));
                        int i6 = f254 + 97;
                        f255 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static String m5969(short s, int i3, int i4, int i5, byte b) {
                        String obj;
                        synchronized (n.f3088) {
                            StringBuilder sb = new StringBuilder();
                            int i6 = f257;
                            int i7 = i4 + i6;
                            int i8 = i7 == -1 ? 1 : 0;
                            if (i8 != 0) {
                                byte[] bArr = f253;
                                if (bArr != null) {
                                    i7 = (byte) (bArr[f258 + i5] + i6);
                                } else {
                                    i7 = (short) (f252[f258 + i5] + i6);
                                }
                            }
                            if (i7 > 0) {
                                n.f3090 = ((i5 + i7) - 2) + f258 + i8;
                                n.f3091 = b;
                                n.f3092 = (char) (i3 + f256);
                                sb.append(n.f3092);
                                n.f3093 = n.f3092;
                                n.f3089 = 1;
                                while (n.f3089 < i7) {
                                    byte[] bArr2 = f253;
                                    if (bArr2 != null) {
                                        int i9 = n.f3090;
                                        n.f3090 = i9 - 1;
                                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i9] + s)) ^ n.f3091));
                                    } else {
                                        short[] sArr = f252;
                                        int i10 = n.f3090;
                                        n.f3090 = i10 - 1;
                                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i10] + s)) ^ n.f3091));
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
                int i3 = f242 + 97;
                f241 = i3 % 128;
                int i4 = i3 % 2;
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static JSONObject m5963(Activity activity) {
                int i2 = 2 % 2;
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                try {
                    jsonObjectInit.put(m5964((char) ((-1) - TextUtils.lastIndexOf("", '0')), ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionType(0L) + 7).intern(), activity.getClass().getName());
                } catch (JSONException unused) {
                    m.m8527(m5964((char) TextUtils.indexOf("", ""), Color.rgb(0, 0, 0) + 16777223, 9 - (Process.myPid() >> 22)).intern(), m5964((char) (42753 - TextUtils.getTrimmedLength("")), 16 - View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27).intern());
                }
                int i3 = f241 + 47;
                f242 = i3 % 128;
                int i4 = i3 % 2;
                return jsonObjectInit;
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m5964(char c, int i2, int i3) {
                String str;
                synchronized (c.f1197) {
                    char[] cArr = new char[i3];
                    c.f1198 = 0;
                    while (c.f1198 < i3) {
                        cArr[c.f1198] = (char) ((f244[c.f1198 + i2] ^ (c.f1198 * f243)) ^ c);
                        c.f1198++;
                    }
                    str = new String(cArr);
                }
                return str;
            }
        });
        jt.m8290().m8295(new js() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.13
            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5970(Activity activity) {
                ai.this.m5958();
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5971(Activity activity) {
                ai.m5922(ai.this);
            }
        });
        ar.m6041().mo6067(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.11
            @Override // com.ironsource.adqualitysdk.sdk.i.ax
            /* renamed from: ﾇ */
            public final void mo5878() {
                ai.m5925(ai.this);
            }
        });
        int i2 = f212 + 57;
        f213 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m5917() {
        int i = 2 % 2;
        int i2 = f212;
        int i3 = i2 + 97;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f219 != null) {
            int i5 = i2 + 43;
            f213 = i5 % 128;
            int i6 = i5 % 2;
            this.f233.m8184().m8162(this.f219);
        }
        this.f221.m8307();
        this.f221 = null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int m5926(jm jmVar) {
        int i = 2 % 2;
        int i2 = f212 + 17;
        f213 = i2 % 128;
        int i3 = i2 % 2;
        String m8233 = jmVar.m8233(m5936(new int[]{-82944963, 123124798, -991830736, 57812389, -921215328, 2096923104}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9).intern());
        int i4 = 1;
        if (!TextUtils.isEmpty(m8233)) {
            int i5 = f212 + 79;
            f213 = i5 % 128;
            int i6 = i5 % 2;
            i4 = 1 + Integer.parseInt(m8233);
            int i7 = f213 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f212 = i7 % 128;
            int i8 = i7 % 2;
        }
        jmVar.m8232(m5936(new int[]{-82944963, 123124798, -991830736, 57812389, -921215328, 2096923104}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9).intern(), String.valueOf(i4));
        return i4;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m5952() {
        int i = 2 % 2;
        String m5945 = m5945(new jm(this.f220, m5936(new int[]{-968057682, -578501872, -32246131, 1530168203, 1626638423, 1824758932, 1107459845, -936546178, 689654494, -1042904481, 1937791097, 508227192, -1716780430, 1956801535}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 25).intern(), m5927(TextUtils.getTrimmedLength("") + 24, "\u0001\u0002\u0002\u0003\u0004\u0005\u0000\u0001\u0007\b\t\u0007\u000b\u0003\u0010\n\n\u0005\u0000\u000f\u0007\u000f\u0006\u0001", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 21)).intern()));
        int i2 = f212 + 71;
        f213 = i2 % 128;
        if (i2 % 2 != 0) {
            return m5945;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m5945(jm jmVar) {
        int i = 2 % 2;
        int i2 = f212 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f213 = i2 % 128;
        int i3 = i2 % 2;
        String m8233 = jmVar.m8233(m5927(16 - Gravity.getAbsoluteGravity(0, 0), "\u0003\u0006\u0007\u000e\u0011\u001d\f\u0003´´\u0003\u0004\u0002\"\u0013\u001f", (byte) (69 - TextUtils.getOffsetAfter("", 0))).intern());
        if (TextUtils.isEmpty(m8233)) {
            m8233 = UUID.randomUUID().toString();
            jmVar.m8232(m5927((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, "\u0003\u0006\u0007\u000e\u0011\u001d\f\u0003´´\u0003\u0004\u0002\"\u0013\u001f", (byte) ('u' - AndroidCharacter.getMirror('0'))).intern(), m8233);
        }
        int i4 = f212 + 5;
        f213 = i4 % 128;
        int i5 = i4 % 2;
        return m8233;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m5912() {
        boolean z;
        int i = 2 % 2;
        int i2 = f212;
        int i3 = i2 + 97;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        z = this.f226;
        int i5 = i2 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f213 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m5943(boolean z) {
        int i = 2 % 2;
        int i2 = f213 + 77;
        f212 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f226 = z;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f226 = z;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private synchronized ap m5910() {
        ap mo6055;
        int i = 2 % 2;
        int i2 = f213 + 17;
        f212 = i2 % 128;
        if (i2 % 2 != 0) {
            mo6055 = ar.m6041().mo6055();
            int i3 = 85 / 0;
        } else {
            mo6055 = ar.m6041().mo6055();
        }
        int i4 = f212 + 23;
        f213 = i4 % 128;
        if (i4 % 2 != 0) {
            return mo6055;
        }
        int i5 = 80 / 0;
        return mo6055;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m5914() {
        int i = 2 % 2;
        int i2 = f213 + 25;
        f212 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return this.f231;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r5 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r4.f232.m8203(new com.ironsource.adqualitysdk.sdk.i.ai.AnonymousClass14(r4));
        r5 = com.ironsource.adqualitysdk.sdk.i.ai.f213 + 67;
        com.ironsource.adqualitysdk.sdk.i.ai.f212 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r5 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        m5916();
        r5 = com.ironsource.adqualitysdk.sdk.i.ai.f213 + 1;
        com.ironsource.adqualitysdk.sdk.i.ai.f212 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if ((r5 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x001a, code lost:
    
        if (r5 != true) goto L14;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void m5949(boolean z) {
        int i = 2 % 2;
        int i2 = f212 + 81;
        f213 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private void m5916() {
        int i = 2 % 2;
        int i2 = f212 + 15;
        f213 = i2 % 128;
        int i3 = i2 % 2;
        m5929(0);
        int i4 = f213 + 53;
        f212 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5929(int i) {
        int i2 = 2 % 2;
        this.f225.removeCallbacksAndMessages(null);
        this.f225.postDelayed(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.1

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f234 = 1;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f235 = 0;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f236 = 264;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static boolean f237 = true;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static boolean f238 = true;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f239 = {329, 374, 361, 372, 385, 380, 369, 363, 379, 333, 378, 375, 296, 365, 364, 367, 382, 366, 373, 368};

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i3 = 2 % 2;
                int i4 = f234 + 65;
                f235 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    ai.m5920(ai.this);
                    int i6 = f234 + 105;
                    f235 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 22 / 0;
                    }
                } catch (Throwable th) {
                    m.m8530(m5962(null, 127 - TextUtils.indexOf("", ""), null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m5962(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u008e\u0094\u0088\u0083\u0088\u008d\u0093\u008c\u008b\u0092\u008d\u0089\u0086\u0082\u008e\u0091\u008e\u008d\u0090\u0082\u0087\u008f\u0082\u008e\u0089\u008d\u008b\u008c\u008b\u008b\u008a").intern(), th);
                    ai.m5918(ai.this);
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m5962(String str, int i3, int[] iArr, String str2) {
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
                    char[] cArr3 = f239;
                    int i4 = f236;
                    if (f238) {
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
                    if (f237) {
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
        }, i);
        int i3 = f212 + 29;
        f213 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m5939(int i) {
        int i2 = 2 % 2;
        int i3 = f212 + 11;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        if (i >= m5910().m6032()) {
            int i5 = f212 + 41;
            f213 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = f212 + 111;
        f213 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ai$3, reason: invalid class name */
    final class AnonymousClass3 implements ji, jk.c {
        AnonymousClass3() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk.c
        /* renamed from: ﾒ, reason: contains not printable characters */
        public final void mo5975(List<jn> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<jn> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new ag(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ag agVar = (ag) priorityQueue.poll(); agVar != null; agVar = (ag) priorityQueue.poll()) {
                            if (ai.m5941(ai.this, agVar)) {
                                if (TextUtils.isEmpty(agVar.m5887())) {
                                    agVar.m5888(ai.m5911(ai.this).m8332().m6120());
                                }
                                arrayList.add(agVar);
                            } else {
                                ai.m5915(ai.this).m8204(agVar.m5886());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ai.m5932(ai.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    ai.m5918(ai.this);
                    return;
                }
            }
            ai.m5918(ai.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji
        /* renamed from: ﾇ, reason: contains not printable characters */
        public final void mo5973(jd jdVar) {
            ai.m5918(ai.this);
            ai.m5950(ai.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji
        /* renamed from: ﾒ, reason: contains not printable characters */
        public final void mo5974(jd jdVar, String str) {
            ai.m5918(ai.this);
        }
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private synchronized void m5908() {
        int i = 2 % 2;
        int i2 = f212 + 31;
        f213 = i2 % 128;
        if (i2 % 2 != 0) {
            if (m5914() && !TextUtils.isEmpty(this.f229.m8332().m6120()) && !m5912()) {
                m5943(true);
                m.m8519(m5936(new int[]{-975114579, 715142747, 1937791097, 508227192, -1716780430, 1956801535}, KeyEvent.getDeadChar(0, 0) + 9).intern(), m5927(25 - View.combineMeasuredStates(0, 0), "\u001e\t\u0007\u001d\u0011\u0007\u001d\u0017\b\f\u0007\u0006\u0006\u0003\u0017#\u0007\u0002\u0005\u000e\n\u0001\t\u0019Ç", (byte) (98 - (KeyEvent.getMaxKeyCode() >> 16))).intern());
                this.f232.m8202(m5910().m6032(), new AnonymousClass3());
            }
            int i3 = f213 + 77;
            f212 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            m5914();
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m5940(ag agVar) {
        int i = 2 % 2;
        int i2 = f212 + 75;
        f213 = i2 % 128;
        if (i2 % 2 == 0) {
            ar.m6041().mo6070(agVar.m5889(), this.f217);
            throw null;
        }
        boolean mo6070 = ar.m6041().mo6070(agVar.m5889(), this.f217);
        int i3 = f213 + 109;
        f212 = i3 % 128;
        int i4 = i3 % 2;
        return mo6070;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ai$5, reason: invalid class name */
    class AnonymousClass5 implements ah.d {

        /* renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ List f271;

        /* renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ ji f272;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ JSONArray f274;

        AnonymousClass5(JSONArray jSONArray, List list, ji jiVar) {
            this.f274 = jSONArray;
            this.f271 = list;
            this.f272 = jiVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ah.d
        public void onEventGenerated(JSONObject jSONObject) {
            ai.m5942(ai.this).m5876(jSONObject);
            ai.m5906(ai.this).m8186(ai.m5909(ai.this).m6004(ai.m5913(ai.this)), jSONObject, new ji() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1

                /* renamed from: ﮐ, reason: contains not printable characters */
                private static int f275 = 0;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static int f276 = 1;

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static boolean f277 = true;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f278 = {273, 318, 305, 316, 329, 324, 313, 307, 323, 279, 319, 240, 325, 309, 322, 320, 310, 308, 277, 326, 241, 291, 317, 312, 311, 327, 254, 266};

                /* renamed from: ｋ, reason: contains not printable characters */
                private static boolean f279 = true;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static int f280 = 208;

                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* renamed from: ﾇ */
                public final void mo5973(final jd jdVar) {
                    final int m8131 = jdVar.m8128().m8131();
                    final String m8132 = jdVar.m8128().m8132();
                    if (m8131 >= 200 && m8131 <= 299) {
                        m.m8528(m5977(null, View.getDefaultSize(0, 0) + 127, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m5977(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u0095\u0086\u0082\u008e\u0094\u0093\u0092\u0082\u008e\u0089\u008c\u008f\u008b\u0091\u008c\u008e\u0089\u0082\u008b\u0090\u0089\u008e\u008f\u008c\u0089\u0089\u008e\u0088\u0088\u008d\u0089\u008c\u0083\u008c\u0086\u008b\u008a").intern(), AnonymousClass5.this.f274);
                        Iterator it = AnonymousClass5.this.f271.iterator();
                        while (it.hasNext()) {
                            ai.m5915(ai.this).m8204(((ag) it.next()).m5886());
                        }
                        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                AnonymousClass5.this.f272.mo5973(jdVar);
                            }
                        });
                        return;
                    }
                    if (m8131 == 403) {
                        synchronized (ai.this) {
                            for (final jm.d dVar : ai.m5907(ai.this)) {
                                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.3
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* renamed from: ｋ */
                                    public final void mo5828() {
                                        jm.d.this.mo8237();
                                    }
                                });
                            }
                        }
                    } else {
                        m.m8519(m5977(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new StringBuilder().append(m5977(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u008c\u009c\u008e\u0089\u0082\u008b\u0090\u0089\u008e\u008f\u008c\u0086\u008b\u008a\u008c\u009b\u0086\u0082\u008e\u0094\u0093\u0092\u0082\u008e\u0089\u008c\u0098\u0086\u0087\u009a\u008c\u0099\u0082\u008b\u008f\u009a\u008c\u0086\u0082\u008e\u009a\u008c\u0099\u0082\u0087\u0098\u0086\u008e\u0097\u008b\u0096").intern()).append(m8131).append(m5977(null, (Process.myPid() >> 22) + 127, null, "\u008c").intern()).append(m8132).toString());
                    }
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.1

                        /* renamed from: ﺙ, reason: contains not printable characters */
                        private static int f282 = 1;

                        /* renamed from: ﻏ, reason: contains not printable characters */
                        private static int f283 = 0;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f284 = 31;

                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            int i = 2 % 2;
                            AnonymousClass5.this.f272.mo5974(jdVar, new StringBuilder().append(m5978(Process.getGidForName("") + 52, false, TextUtils.indexOf((CharSequence) "", '0') + 126, "\nￂ\u0015\u0007\u0010\u0006\uffe7\u0018\u0007\u0010\u0016\uffd0ￂ￩\u0011\u0016ￂ\u0014\u0007\u0015\u0012\u0011\u0010\u0015\u0007ￜￂ\ufff5\u0011\u000f\u0007\u0016\n\u000b\u0010\tￂ\u0019\u0007\u0010\u0016ￂ\u0019\u0014\u0011\u0010\tￂ\u0019\u000b\u0016", (ViewConfiguration.getTouchSlop() >> 8) + 27).intern()).append(m8131).append(m5978(-((byte) KeyEvent.getModifierMetaStateMask()), true, 63 - ((Process.getThreadPriority(0) + 20) >> 6), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - View.resolveSize(0, 0)).intern()).append(m8132).toString());
                            int i2 = f282 + 69;
                            f283 = i2 % 128;
                            int i3 = i2 % 2;
                        }

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static String m5978(int i, boolean z, int i2, String str, int i3) {
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
                                    cArr3[i4] = (char) (cArr3[i4] - f284);
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
                    });
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* renamed from: ﾒ */
                public final void mo5974(final jd jdVar, final String str) {
                    int i = 2 % 2;
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            AnonymousClass5.this.f272.mo5974(jdVar, str);
                        }
                    });
                    int i2 = f275 + 25;
                    f276 = i2 % 128;
                    if (i2 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static String m5977(String str, int i, int[] iArr, String str2) {
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
                        char[] cArr3 = f278;
                        int i2 = f280;
                        if (f279) {
                            int length = bArr2.length;
                            k.f2955 = length;
                            char[] cArr4 = new char[length];
                            k.f2957 = 0;
                            while (k.f2957 < k.f2955) {
                                cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                                k.f2957++;
                            }
                            return new String(cArr4);
                        }
                        if (f277) {
                            int length2 = cArr2.length;
                            k.f2955 = length2;
                            char[] cArr5 = new char[length2];
                            k.f2957 = 0;
                            while (k.f2957 < k.f2955) {
                                cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                                k.f2957++;
                            }
                            return new String(cArr5);
                        }
                        int length3 = iArr.length;
                        k.f2955 = length3;
                        char[] cArr6 = new char[length3];
                        k.f2957 = 0;
                        while (k.f2957 < k.f2955) {
                            cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                            k.f2957++;
                        }
                        return new String(cArr6);
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r7.has(m5936(new int[]{-1197410726, -447952176}, 3 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r7.has(m5936(new int[]{-1197410726, -447952176}, 3 << (android.media.AudioTrack.getMinVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 2.0f ? 0 : -1))).intern()) == false) goto L21;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m5947(List<ag> list, ji jiVar) {
        ag next;
        JSONObject m5891;
        int i = 2 % 2;
        JSONArray jSONArray = new JSONArray();
        Iterator<ag> it = list.iterator();
        while (it.hasNext()) {
            int i2 = f213 + 15;
            f212 = i2 % 128;
            if (i2 % 2 != 0) {
                next = it.next();
                m5891 = next.m5891();
            } else {
                next = it.next();
                m5891 = next.m5891();
            }
            try {
                m5891.put(m5936(new int[]{-1197410726, -447952176}, 3 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m5891.optLong(is.f2629));
                int i3 = f213 + 79;
                f212 = i3 % 128;
                int i4 = i3 % 2;
            } catch (JSONException unused) {
            }
            if (this.f222.m5876(m5891)) {
                int i5 = f213 + 87;
                f212 = i5 % 128;
                int i6 = i5 % 2;
                this.f232.m8205(next.m5886(), null);
            }
            jSONArray.put(m5891);
        }
        this.f229.m5899(jSONArray, this.f233.m8184().m8158(), new AnonymousClass5(jSONArray, list, jiVar));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m5937(JSONObject jSONObject, je jeVar) {
        int i = 2 % 2;
        m5934(jSONObject);
        ag agVar = new ag(jk.m8198(jSONObject));
        agVar.m5890(m5910().m6034());
        this.f232.m8205(agVar.m5886(), jeVar);
        m5948(agVar.m5891());
        p.m8554(jeVar);
        int i2 = f212 + 21;
        f213 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m5948(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (s.m8592().m8615()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f228);
            }
            p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ae) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5934(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f212 + 53;
        f213 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<String> it = m5910().m6033().iterator();
        while (it.hasNext()) {
            int i4 = f212 + 89;
            f213 = i4 % 128;
            if (i4 % 2 == 0) {
                jSONObject.remove(it.next());
                int i5 = 86 / 0;
            } else {
                jSONObject.remove(it.next());
            }
        }
    }

    /* renamed from: טּ, reason: contains not printable characters */
    private int m5904() {
        int i = 2 % 2;
        int i2 = f213 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f212 = i2 % 128;
        int i3 = i2 % 2;
        if (m5910() == null) {
            return 100;
        }
        int i4 = f212 + 17;
        f213 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
            if (ar.m6041().mo6059()) {
                return 100;
            }
        } else if (ar.m6041().mo6059()) {
            return 100;
        }
        int i6 = f212 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f213 = i6 % 128;
        int i7 = i6 % 2;
        return m5910().m6035();
    }

    /* renamed from: סּ, reason: contains not printable characters */
    private String m5905() {
        int i = 2 % 2;
        int i2 = f212 + 97;
        f213 = i2 % 128;
        if (i2 % 2 == 0) {
            ar.m6041().mo6059();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!ar.m6041().mo6059()) {
            return m5910().m6029();
        }
        String m6030 = m5910().m6030();
        int i3 = f212 + 1;
        f213 = i3 % 128;
        int i4 = i3 % 2;
        return m6030;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m5936(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f216.clone();
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

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m5927(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f215;
            char c = f214;
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
