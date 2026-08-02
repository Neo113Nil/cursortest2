package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.android.exoplayer2.ExoPlayer;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.az;
import com.ironsource.adqualitysdk.sdk.i.ba.AnonymousClass3;
import com.ironsource.adqualitysdk.sdk.i.ba.AnonymousClass5;
import com.ironsource.adqualitysdk.sdk.i.jl;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class av {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f458 = 1;

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f459 = 0;

    /* renamed from: סּ, reason: contains not printable characters */
    private static char[] f460 = {'-', 63406, 61227, 59044, 56865, 54690, 52543, 50360, 48181, 46006, 43827, 41612, 39433, 37258, 35082, 32964, 30786, 28636, 26456, 24298, 22099, 19914, 17712, 15526, 13357, 11243, 8975, 6837, 4613, 2466, 315, 63665, 61449, 59287, 57119, 54985, 15294, 52272, 54453, 56634, 58815, 60988, 63137, 65318, 34731, 34856, 37037, 39186, 41367, 43540, 45721, 50147, 13399, 11474, 9536, 7640, 5641, 3797, 1879, 32730, 28756, 26838, 24928, 22946, 21090, 19171, 17253, 48120, 44144, 42227, 40299, 38389, 36459, 34500, 65301, 63371, 59423, 57499, 55582, 53661, 51743, 49807, 'E', 63473, 61300, 59110, 56958, 54703, 52595, 50417, 48252, 46066, 43888, 41670, 39428, 37316, 35141, 32963, 30814, 28630, 26453, 24269, 22099, 19917, 17762, 15520, 13370, 11193, 8993, 6819, 4647, ' ', 63456, 61289, 59111, 56930, 54762, 52593, 50401, 48247, 46057, 'v', 63472, 61288, 59130};

    /* renamed from: ףּ, reason: contains not printable characters */
    private static long f461 = 709779389642307459L;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static long f462 = -9000078972453840529L;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private String f463;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private bb f464;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private ISAdQualityInitListener f465;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private jh f466;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private volatile ba f471;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final AtomicBoolean f474 = new AtomicBoolean(false);

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f476 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private volatile List<cp> f475 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<gt> f472 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, JSONObject> f473 = new HashMap();

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Map<String, String> f467 = new HashMap();

    /* renamed from: ﺙ, reason: contains not printable characters */
    private dc f470 = new dc();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private ee f468 = ee.m7702();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Map<String, au> f469 = new HashMap();

    /* renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ List m6146(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + 49;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            avVar.m6156();
            throw null;
        }
        List<gt> m6156 = avVar.m6156();
        int i3 = f459 + 1;
        f458 = i3 % 128;
        int i4 = i3 % 2;
        return m6156;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ void m6149(av avVar) {
        int i = 2 % 2;
        int i2 = f458 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6145();
        int i4 = f458 + 35;
        f459 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ void m6151(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + 89;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6196();
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f459 + 19;
        f458 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ String m6152(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + 29;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        String str = avVar.f463;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ Map m6155(av avVar) {
        int i = 2 % 2;
        int i2 = f458 + 111;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, JSONObject> m6148 = avVar.m6148();
        int i4 = f458 + 33;
        f459 = i4 % 128;
        int i5 = i4 % 2;
        return m6148;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ boolean m6157(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            avVar.m6147();
            throw null;
        }
        boolean m6147 = avVar.m6147();
        int i3 = f458 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f459 = i3 % 128;
        int i4 = i3 % 2;
        return m6147;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m6159(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + 77;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        List<cp> m6150 = avVar.m6150();
        int i4 = f458 + 57;
        f459 = i4 % 128;
        int i5 = i4 % 2;
        return m6150;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m6163(av avVar, String str) {
        int i = 2 % 2;
        int i2 = f459 + 65;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            avVar.m6176(str);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean m6176 = avVar.m6176(str);
        int i3 = f459 + 83;
        f458 = i3 % 128;
        int i4 = i3 % 2;
        return m6176;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ee m6164(av avVar, ee eeVar) {
        int i = 2 % 2;
        int i2 = f459 + 23;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.f468 = eeVar;
        if (i3 != 0) {
            return eeVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ AtomicBoolean m6166(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + 101;
        int i3 = i2 % 128;
        f458 = i3;
        int i4 = i2 % 2;
        AtomicBoolean atomicBoolean = avVar.f474;
        int i5 = i3 + 59;
        f459 = i5 % 128;
        int i6 = i5 % 2;
        return atomicBoolean;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m6167(av avVar, cp cpVar) {
        int i = 2 % 2;
        int i2 = f458 + 95;
        f459 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6168(cpVar);
        }
        m6168(cpVar);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6170(av avVar, Context context, String str, String str2, gt gtVar, cp cpVar, boolean z, be beVar, je jeVar) {
        int i = 2 % 2;
        int i2 = f459 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6161(context, str, str2, gtVar, cpVar, z, beVar, jeVar);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6171(av avVar, Context context, String str, String str2, gt gtVar, je jeVar) {
        int i = 2 % 2;
        int i2 = f459 + 101;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6185(context, str, str2, gtVar, jeVar);
        int i4 = f458 + 3;
        f459 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6172(av avVar, Context context, String str, String str2, List list, je jeVar) {
        int i = 2 % 2;
        int i2 = f459 + 113;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6186(context, str, str2, (List<gt>) list, jeVar);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6173(av avVar, cp cpVar, String str) {
        int i = 2 % 2;
        int i2 = f458 + 27;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6175(cpVar, str);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6174(av avVar, String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f459 + 79;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6188(str, jSONObject);
        int i4 = f458 + 29;
        f459 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ba m6177(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + 113;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        ba baVar = avVar.f471;
        int i4 = f458 + 5;
        f459 = i4 % 128;
        if (i4 % 2 == 0) {
            return baVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Map m6178(av avVar, Map map) {
        int i = 2 % 2;
        int i2 = f458 + 17;
        int i3 = i2 % 128;
        f459 = i3;
        int i4 = i2 % 2;
        avVar.f469 = map;
        int i5 = i3 + 83;
        f458 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ cp m6182(av avVar, Context context, String str, be beVar) {
        int i = 2 % 2;
        int i2 = f458 + 45;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        cp m6192 = avVar.m6192(context, str, beVar);
        int i4 = f458 + 89;
        f459 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6192;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Map m6183(av avVar) {
        int i = 2 % 2;
        int i2 = f458 + 31;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> m6153 = avVar.m6153();
        int i4 = f458 + 89;
        f459 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6153;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6187(av avVar, Context context, String str, String str2, List list, je jeVar) {
        int i = 2 % 2;
        int i2 = f458 + 13;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6162(context, str, str2, list, jeVar);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = f459 + 85;
        f458 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m6190(cp cpVar, String str) {
        int i = 2 % 2;
        int i2 = f458 + 35;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        boolean m6204 = m6204(cpVar, str);
        int i4 = f459 + 53;
        f458 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6204;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m6194(av avVar) {
        int i = 2 % 2;
        int i2 = f459 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            avVar.m6154();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        List<cp> m6154 = avVar.m6154();
        int i3 = f459 + 29;
        f458 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        return m6154;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m6195(av avVar, List list) {
        int i = 2 % 2;
        int i2 = f459 + 83;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.f475 = list;
        int i4 = f459 + 45;
        f458 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6199(av avVar, Context context) {
        int i = 2 % 2;
        int i2 = f458 + 73;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6197(context);
        int i4 = f459 + 63;
        f458 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6200(av avVar, Context context, List list, List list2, je jeVar) {
        int i = 2 % 2;
        int i2 = f459 + 73;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6198(context, (List<gt>) list, (List<String>) list2, jeVar);
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6201(av avVar, Context context, Map map, Runnable runnable) {
        int i = 2 % 2;
        int i2 = f459 + 25;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        avVar.m6181(context, map, runnable);
        int i4 = f458 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f459 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m6203(cp cpVar) {
        int i = 2 % 2;
        int i2 = f459 + 5;
        f458 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6189(cpVar);
        }
        m6189(cpVar);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public av(jh jhVar, ai aiVar, String str, ba baVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f466 = jhVar;
        bb bbVar = new bb(p.m8550(), aiVar);
        this.f464 = bbVar;
        kl.m8454(bbVar);
        this.f464.m6289(new iv() { // from class: com.ironsource.adqualitysdk.sdk.i.av.3

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f539 = 0;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f540 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char f541 = 58449;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char f542 = 52552;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char f543 = 18296;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char f544 = 61146;

            @Override // com.ironsource.adqualitysdk.sdk.i.iv
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final JSONObject mo6220(String str2, JSONObject jSONObject) {
                int i = 2 % 2;
                int i2 = f540 + 17;
                f539 = i2 % 128;
                int i3 = i2 % 2;
                if (!str2.equals(m6219("饄垾\u20f8鬺¡ƃ\ueb39\uee61", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7).intern())) {
                    int i4 = f539 + 37;
                    f540 = i4 % 128;
                    int i5 = i4 % 2;
                    return null;
                }
                int i6 = f540 + 1;
                f539 = i6 % 128;
                if (i6 % 2 == 0) {
                    return av.this.m6205();
                }
                int i7 = 24 / 0;
                return av.this.m6205();
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m6219(String str2, int i) {
                String str3;
                char[] cArr = str2;
                if (str2 != null) {
                    cArr = str2.toCharArray();
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
                            char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f541)) ^ ((c2 >>> 5) + f542)));
                            cArr4[1] = c3;
                            cArr4[0] = (char) (c2 - (((c3 >>> 5) + f544) ^ ((c3 + i2) ^ ((c3 << 4) + f543))));
                            i2 -= 40503;
                        }
                        cArr3[o.f3095] = cArr4[0];
                        cArr3[o.f3095 + 1] = cArr4[1];
                        o.f3095 += 2;
                    }
                    str3 = new String(cArr3, 0, i);
                }
                return str3;
            }
        });
        this.f463 = str;
        this.f471 = baVar;
        this.f465 = iSAdQualityInitListener;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m6208(final Context context, final Runnable runnable) {
        int i = 2 % 2;
        if (this.f474.get()) {
            int i2 = f458 + 53;
            f459 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            if (this.f476) {
                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        runnable.run();
                    }
                });
                return;
            }
            m.m8538(m6193("ꁪ撛ᢤ鎺ꀫ綐⨫\udf82얷ᯜ聗⇇歫耯\ue6b6萴", (ViewConfiguration.getTouchSlop() >> 8) + 1).intern(), new StringBuilder().append(m6165((char) View.MeasureSpec.getSize(0), Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0) + 36).intern()).append(IronSourceAdQuality.getSDKVersion()).append(m6165((char) (Color.rgb(0, 0, 0) + 16792478), 36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()).toString());
            je jeVar = new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.10
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.10.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            runnable.run();
                        }
                    });
                    av.m6199(av.this, context);
                }
            };
            if (m6144()) {
                int i4 = f459 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f458 = i4 % 128;
                int i5 = i4 % 2;
                m6184(context, jeVar);
            } else {
                m6180(context, jeVar);
                int i6 = 2 % 2;
            }
            this.f476 = true;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m6206(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f459 + 85;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        this.f464.m6292(iSAdQualityAdListener);
        int i4 = f459 + 77;
        f458 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0021, code lost:
    
        if (r4.f474.getAndSet(true) != false) goto L11;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m6210() {
        int i = 2 % 2;
        int i2 = f459 + 63;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.f474.getAndSet(false)) {
                int i3 = f459 + 7;
                f458 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                } else {
                    throw null;
                }
            }
            ba baVar = this.f471;
            p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.13
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    Iterator it = av.m6194(av.this).iterator();
                    while (it.hasNext()) {
                        ((cp) it.next()).m7299();
                    }
                    List m6159 = av.m6159(av.this);
                    if (m6159 != null) {
                        m6159.clear();
                    }
                    av.m6195(av.this, (List) null);
                    av.m6164(av.this, (ee) null);
                }
            });
            if (baVar != null) {
                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ba.1
                    AnonymousClass1() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        Map map = ba.this.f658;
                        if (map != null) {
                            map.clear();
                        }
                    }
                });
            }
            this.f471 = null;
            int i4 = f458 + 99;
            f459 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m6205() {
        int i = 2 % 2;
        int i2 = f458 + 9;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        try {
            JSONObject m6179 = m6179(m6148());
            int i4 = f459 + 17;
            f458 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
            }
            return m6179;
        } catch (JSONException e) {
            m.m8535(m6193("䌸姃ꑧ쭚䍻䃃雗蝹⛡⚋㲉礼蠲뵩婐\udcf1牭ጇ쀐뚩", 1 - View.MeasureSpec.getSize(0)).intern(), m6165((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 50086), 51 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31).intern(), e);
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m6207() {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        try {
            Iterator it = new HashSet(m6153().keySet()).iterator();
            int i2 = f459 + 89;
            f458 = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = f458 + 13;
                f459 = i4 % 128;
                int i5 = i4 % 2;
                String str = (String) it.next();
                jsonObjectInit2.put(str, m6153().get(str));
            }
            jsonObjectInit.put(m6193("琞\ue698蟼宊瑻ﾅ땐឴", AndroidCharacter.getMirror('0') - '/').intern(), jsonObjectInit2);
            return jsonObjectInit;
        } catch (JSONException e) {
            m.m8535(m6193("䌸姃ꑧ쭚䍻䃃雗蝹⛡⚋㲉礼蠲뵩婐\udcf1牭ጇ쀐뚩", -MotionEvent.axisFromString("")).intern(), m6165((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getCapsMode("", 0, 0) + 82, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29).intern(), e);
            return jsonObjectInit;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m6184(Context context, je jeVar) {
        int i = 2 % 2;
        m6198(context, new ArrayList(ay.m6243()), new ArrayList(ay.m6248()), jeVar);
        int i2 = f458 + 41;
        f459 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m6198(Context context, final List<gt> list, final List<String> list2, final je jeVar) {
        final Context context2;
        int i = 2 % 2;
        if (list.isEmpty()) {
            return;
        }
        gt remove = list.remove(0);
        String remove2 = list2.remove(0);
        if (!list.isEmpty()) {
            context2 = context;
            jeVar = new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.15
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    p.m8553(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.15.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            av.m6200(av.this, context2, list, list2, jeVar);
                        }
                    }, ar.m6041().mo6043());
                }
            };
        } else {
            int i2 = f458;
            int i3 = i2 + 77;
            f459 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i4 = i2 + 113;
            f459 = i4 % 128;
            int i5 = i4 % 2;
            context2 = context;
        }
        m6169(context2, remove, remove2, jeVar);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m6180(Context context, je jeVar) {
        int i = 2 % 2;
        int i2 = f458 + 99;
        f459 = i2 % 128;
        if (i2 % 2 != 0) {
            m6169(context, ay.m6242(), ay.m6240(), jeVar);
            int i3 = 15 / 0;
        } else {
            m6169(context, ay.m6242(), ay.m6240(), jeVar);
        }
        int i4 = f459 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f458 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m6169(final Context context, final gt gtVar, final String str, final je jeVar) {
        int i = 2 % 2;
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.14
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (av.m6166(av.this).get()) {
                    return;
                }
                final String lowerCase = str.toLowerCase();
                ba m6177 = av.m6177(av.this);
                if (m6177 == null) {
                    return;
                }
                m6177.m6272(lowerCase);
                p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.14.3

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static int f499 = 1;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static int f500;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static char[] f501 = {'C', 14393, 28866, 43372, 57661, 6605, 21104, 35381, 49858, 64331, 13117, 27612, 42089, 56377, 5329, 19832, 56548, 58517, 44136, 30171, 15772, 50530, 36549, 22174, 7783, 10178, 61343, 46968, 30853, 144, 51318, 37321, 22947, 24958, 10946, 62139, 47738, 17361, 3049, 19229, 29564, 15238, 57909, 43634, 21206, 6463, 49520, 35213, 45119, 30832, 8323, 61246, 38753, 24524, 1585, 52823, 63104, 48442, 25951, 11651, 54306, 40019, 17552, 872};

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static long f502 = -7453827829434730410L;

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        int i2 = 2 % 2;
                        int i3 = f500 + 13;
                        f499 = i3 % 128;
                        int i4 = i3 % 2;
                        if (!av.m6166(av.this).get()) {
                            m.m8519(m6214((char) Color.red(0), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16).intern(), new StringBuilder().append(m6214((char) (56493 - TextUtils.indexOf("", "", 0, 0)), 16 - Drawable.resolveOpacity(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23).intern()).append(lowerCase).toString());
                            try {
                                av.m6171(av.this, context, str, lowerCase, gtVar, jeVar);
                                return;
                            } catch (Throwable th) {
                                ba m61772 = av.m6177(av.this);
                                if (m61772 != null) {
                                    p.m8554(m61772.new AnonymousClass3(lowerCase, az.b.f653));
                                }
                                av.m6183(av.this).put(str, kl.m8449(th).toString());
                                kl.m8459(m6214((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16).intern(), new StringBuilder().append(m6214((char) (19288 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (Process.myPid() >> 22) + 39, 24 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()).append(lowerCase).toString(), th, true, true, true);
                                return;
                            }
                        }
                        int i5 = f499 + 49;
                        f500 = i5 % 128;
                        int i6 = i5 % 2;
                    }

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static String m6214(char c, int i2, int i3) {
                        String str2;
                        synchronized (c.f1197) {
                            char[] cArr = new char[i3];
                            c.f1198 = 0;
                            while (c.f1198 < i3) {
                                cArr[c.f1198] = (char) ((f501[c.f1198 + i2] ^ (c.f1198 * f502)) ^ c);
                                c.f1198++;
                            }
                            str2 = new String(cArr);
                        }
                        return str2;
                    }
                });
            }
        });
        int i2 = f458 + 51;
        f459 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m6197(final Context context) {
        int i = 2 % 2;
        int i2 = f458 + 1;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        if (!m6147()) {
            p.m8553(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.11
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.11.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            av.m6149(av.this);
                        }
                    });
                }
            }, ar.m6041().mo6050());
            int i4 = f459 + 13;
            f458 = i4 % 128;
            int i5 = i4 % 2;
        }
        final Map<String, List<gt>> m6246 = ay.m6246();
        p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.12
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                av.m6178(av.this, ar.m6041().mo6063());
                av.m6201(av.this, context, m6246, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.12.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        if (av.m6157(av.this)) {
                            av.m6149(av.this);
                        }
                    }
                });
                ar.m6041().mo6067(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.av.12.3

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static int f488 = 1;

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static long f489 = -4552750541862551196L;

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private static int f490;

                    @Override // com.ironsource.adqualitysdk.sdk.i.ax
                    /* renamed from: ﾇ */
                    public final void mo5878() {
                        int i6 = 2 % 2;
                        int i7 = f490 + 21;
                        f488 = i7 % 128;
                        int i8 = i7 % 2;
                        av.m6178(av.this, ar.m6041().mo6063());
                        m.m8519(m6213("ᓀ\ud9bfᒃଛ㔷ᢴ覽煵ᄵἨ茷糤ᾒᕶ蚒稕Бௌ順憙", TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern(), m6213("\uf403ꌖ\uf447\u20f6磌戛ꉍ㲁\uf1f1斎\ua8c7ㄞｄ澲굷㟮\ue4da煶돧ⱱ\ue22f瓛름⋅\uefb7縂븍❟픍䆼蒻ᴣ튇䬭褼Ꭳ", TextUtils.indexOf("", "")).intern());
                        av.m6151(av.this);
                        int i9 = f490 + 69;
                        f488 = i9 % 128;
                        int i10 = i9 % 2;
                    }

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static String m6213(String str, int i6) {
                        String str2;
                        char[] cArr = str;
                        if (str != null) {
                            cArr = str.toCharArray();
                        }
                        char[] cArr2 = cArr;
                        synchronized (g.f2155) {
                            char[] m7785 = g.m7785(f489, cArr2, i6);
                            g.f2157 = 4;
                            while (g.f2157 < m7785.length) {
                                g.f2156 = g.f2157 - 4;
                                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f489));
                                g.f2157++;
                            }
                            str2 = new String(m7785, 4, m7785.length - 4);
                        }
                        return str2;
                    }
                });
            }
        });
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.av$17, reason: invalid class name */
    final class AnonymousClass17 extends je {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private /* synthetic */ List f511;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private /* synthetic */ String f512;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ String f513;

        /* renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ Map f515;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ Runnable f516;

        /* renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Context f517;

        AnonymousClass17(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f513 = str;
            this.f517 = context;
            this.f512 = str2;
            this.f511 = list;
            this.f515 = map;
            this.f516 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5828() {
            if (ar.m6041().mo6070(this.f513, av.m6152(av.this))) {
                av.m6187(av.this, this.f517, this.f512, this.f513, this.f511, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.17.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        if (av.m6157(av.this)) {
                            p.m8547(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.17.3.1
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() {
                                    av.m6201(av.this, AnonymousClass17.this.f517, AnonymousClass17.this.f515, AnonymousClass17.this.f516);
                                }
                            }, ar.m6041().mo6043());
                        }
                    }
                });
                return;
            }
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            av.m6174(av.this, this.f513, jsonObjectInit);
            av.m6155(av.this).put(this.f513, jsonObjectInit);
            p.m8547(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.17.1
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    av.m6201(av.this, AnonymousClass17.this.f517, AnonymousClass17.this.f515, AnonymousClass17.this.f516);
                }
            }, ar.m6041().mo6043());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m6181(Context context, Map<String, List<gt>> map, Runnable runnable) {
        String next;
        List<gt> remove;
        String m6158;
        ba baVar;
        int i = 2 % 2;
        while (map != null && map.size() > 0) {
            int i2 = f458 + 47;
            f459 = i2 % 128;
            if (i2 % 2 != 0) {
                next = map.keySet().iterator().next();
                remove = map.remove(next);
                m6158 = m6158(remove);
                int i3 = 56 / 0;
                if (m6158 != null) {
                    String str = next;
                    List<gt> list = remove;
                    String str2 = m6158;
                    baVar = this.f471;
                    if (baVar != null) {
                        int i4 = f459 + 65;
                        f458 = i4 % 128;
                        if (i4 % 2 == 0) {
                            baVar.m6272(str2);
                            Object obj = null;
                            super.hashCode();
                            throw null;
                        }
                        baVar.m6272(str2);
                    }
                    Context context2 = context;
                    Map<String, List<gt>> map2 = map;
                    Runnable runnable2 = runnable;
                    p.m8549(new AnonymousClass17(str2, context2, str, list, map2, runnable2));
                    if (m6147()) {
                        m6181(context2, map2, runnable2);
                        return;
                    }
                    return;
                }
                context = context;
                map = map;
                runnable = runnable;
            } else {
                next = map.keySet().iterator().next();
                remove = map.remove(next);
                m6158 = m6158(remove);
                if (m6158 != null) {
                    String str3 = next;
                    List<gt> list2 = remove;
                    String str22 = m6158;
                    baVar = this.f471;
                    if (baVar != null) {
                    }
                    Context context22 = context;
                    Map<String, List<gt>> map22 = map;
                    Runnable runnable22 = runnable;
                    p.m8549(new AnonymousClass17(str22, context22, str3, list2, map22, runnable22));
                    if (m6147()) {
                    }
                } else {
                    context = context;
                    map = map;
                    runnable = runnable;
                }
            }
        }
        final Runnable runnable3 = runnable;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                p.m8549(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        runnable3.run();
                    }
                });
            }
        });
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m6188(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f459 + 71;
        f458 = i2 % 128;
        if (i2 % 2 != 0) {
            ba baVar = this.f471;
            if (baVar != null) {
                p.m8554(baVar.new AnonymousClass5(str, az.a.f640));
            }
            if (jSONObject != null) {
                try {
                    jSONObject.put(m6193("ᳩ卲拚젘\u1c8d䩾偷", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), true);
                    int i3 = f459 + 63;
                    f458 = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6158(List<gt> list) {
        int i = 2 % 2;
        if (list == null || list.isEmpty() || list.get(0) == null) {
            int i2 = f459 + 61;
            f458 = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i3 = f459 + 61;
        f458 = i3 % 128;
        int i4 = i3 % 2;
        return list.get(0).mo7797();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m6162(final Context context, final String str, final String str2, final List<gt> list, final je jeVar) {
        int i = 2 % 2;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.5

            /* renamed from: ﭖ, reason: contains not printable characters */
            private static int f553 = 0;

            /* renamed from: ﭴ, reason: contains not printable characters */
            private static int f554 = 1;

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static boolean f555 = true;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static char[] f556 = {336, 380, 379, 370, 368, 385, 383, 346, 366, 372, 342, 374, 377, 391, 301, 338};

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static boolean f557 = true;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f558 = 269;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i2 = 2 % 2;
                m.m8519(m6222(null, 126 - TextUtils.lastIndexOf("", '0'), null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), new StringBuilder().append(m6222(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u008e\u008c\u008d\u0089\u008c\u0086\u008c\u0083\u008b").intern()).append(str2).toString());
                try {
                    av.m6172(av.this, context, str, str2, list, jeVar);
                } catch (Throwable th) {
                    ba m6177 = av.m6177(av.this);
                    if (m6177 != null) {
                        p.m8554(m6177.new AnonymousClass3(str2, az.b.f653));
                    }
                    av.m6183(av.this).put(str, kl.m8449(th).toString());
                    kl.m8459(m6222(null, MotionEvent.axisFromString("") + 128, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), new StringBuilder().append(m6222(null, Color.alpha(0) + 127, null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u0086\u0089\u0084\u0087\u0085\u008f\u0087\u0082\u0087\u0087\u0090").intern()).append(str2).toString(), th, true, true, false);
                    int i3 = f554 + 13;
                    f553 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 22 / 0;
                    }
                }
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m6222(String str3, int i2, int[] iArr, String str4) {
                byte[] bArr = str4;
                if (str4 != null) {
                    bArr = str4.getBytes(C.ISO88591_NAME);
                }
                byte[] bArr2 = bArr;
                char[] cArr = str3;
                if (str3 != null) {
                    cArr = str3.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (k.f2956) {
                    char[] cArr3 = f556;
                    int i3 = f558;
                    if (f555) {
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
                    if (f557) {
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
        int i2 = f459 + 59;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m6175(final cp cpVar, final String str) {
        int i = 2 % 2;
        Object obj = null;
        if (!this.f474.get()) {
            final String m7302 = cpVar.m7302();
            ba baVar = this.f471;
            if (baVar == null) {
                return;
            }
            p.m8554(baVar.new AnonymousClass5(m7302, az.a.f641));
            p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.2

                /* renamed from: ﮉ, reason: contains not printable characters */
                private static int f521 = 1;

                /* renamed from: ﮐ, reason: contains not printable characters */
                private static boolean f522 = true;

                /* renamed from: ﱟ, reason: contains not printable characters */
                private static int f523 = 138;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static int f524 = 0;

                /* renamed from: ﺙ, reason: contains not printable characters */
                private static boolean f525 = true;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static char[] f527 = {239, 258, 205, 249, 248, 237, 254, 252, Typography.times, 235, 241, 170, 243, 253, 238, 236, 246, 257, 240, 247, 242, 256};

                /* renamed from: ﻏ, reason: contains not printable characters */
                private static long f526 = -1687670554335756052L;

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() throws Exception {
                    int i2;
                    int i3 = 2 % 2;
                    int i4 = f524 + 1;
                    f521 = i4 % 128;
                    int i5 = i4 % 2;
                    JSONObject m6167 = av.m6167(av.this, cpVar);
                    m6167.put(m6216(null, TextUtils.getOffsetBefore("", 0) + 127, null, "\u0082\u0081").intern(), true);
                    av.m6155(av.this).put(cpVar.m7302(), m6167);
                    String m7293 = cpVar.m7293();
                    ba m6177 = av.m6177(av.this);
                    if (m6215("㏠齏㎤\udfea\udf7c廷\ufaf7〒㡲\udb9f媱﹂", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern().equals(m7293)) {
                        m.m8519(m6216(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0088\u0081\u008b\u008a\u0085\u008a\u0089\u0088\u0084\u0087\u0086\u0081\u0085\u0085\u0084\u0083").intern(), new StringBuilder().append(cpVar.m7303()).append(m6216(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u008f\u0081\u0091\u0090\u008a\u008e\u008d\u008f\u008c\u008e\u008d\u008c\u0088\u0084\u0087\u0086\u0081\u0085\u0085\u0084\u0086\u008c").intern()).toString());
                        if (m6177 != null) {
                            p.m8554(m6177.new AnonymousClass5(m7302, az.a.f640));
                            i2 = f524 + 105;
                            f521 = i2 % 128;
                        }
                        m6167.remove(m6216(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0082\u0081").intern());
                    }
                    if (!av.m6163(av.this, m7302)) {
                        if (av.m6190(cpVar, m7293)) {
                            p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.2.1

                                /* renamed from: ﮐ, reason: contains not printable characters */
                                private static int f532 = 0;

                                /* renamed from: ﻏ, reason: contains not printable characters */
                                private static int f533 = 1;

                                /* renamed from: ﻐ, reason: contains not printable characters */
                                private static boolean f534 = true;

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static int f535 = 147;

                                /* renamed from: ｋ, reason: contains not printable characters */
                                private static boolean f536 = true;

                                /* renamed from: ﾒ, reason: contains not printable characters */
                                private static char[] f537 = {214, 258, 257, 248, 246, 263, 261, 224, 244, 250, 179, 262, 264, 249, 255, 268, 252, 269, 247, 216, 265, 253, 212, 228, 230, Typography.times, 222, 266, 251, 220, 193};

                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() {
                                    int i6 = 2 % 2;
                                    int i7 = f532 + 25;
                                    f533 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        cpVar.m7300();
                                        ba m61772 = av.m6177(av.this);
                                        if (m61772 != null) {
                                            p.m8554(m61772.new AnonymousClass5(m7302, az.a.f639));
                                        }
                                        m.m8519(m6218(null, Color.argb(0, 0, 0, 0) + 127, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), new StringBuilder().append(cpVar.m7303()).append(m6218(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0093\u0084\u0092\u0091\u008f\u0089\u0091\u0086\u0091\u0083\u0091\u008b\u0090\u008f\u008f\u008d\u008e\u008c\u008c\u0084\u0085\u0085\u008d\u008c\u008b\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008b").intern()).toString());
                                        int i8 = f532 + 27;
                                        f533 = i8 % 128;
                                        int i9 = i8 % 2;
                                        return;
                                    }
                                    cpVar.m7300();
                                    av.m6177(av.this);
                                    throw null;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ﻐ */
                                public final void mo6217(Throwable th) {
                                    int i6 = 2 % 2;
                                    int i7 = f532 + 111;
                                    f533 = i7 % 128;
                                    int i8 = i7 % 2;
                                    try {
                                        ((JSONObject) av.m6155(av.this).get(cpVar.m7302())).put(m6218(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0086\u0091\u0083\u0091").intern(), false);
                                    } catch (JSONException e) {
                                        m.m8535(m6218(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), m6218(null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, "\u0083\u0082\u008c\u0096\u008b\u0083\u0082\u0091\u008c\u0087\u0084\u0095\u008b\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008b\u0082\u0086\u008b\u0086\u0091\u0083\u0091\u008b\u008a\u0083\u0091\u0086\u0086\u0084\u008c\u008b\u0087\u0082\u0087\u0087\u0094").intern(), e);
                                    }
                                    ba m61772 = av.m6177(av.this);
                                    if (m61772 != null) {
                                        p.m8554(m61772.new AnonymousClass3(m7302, az.b.f651));
                                        int i9 = f532 + 21;
                                        f533 = i9 % 128;
                                        int i10 = i9 % 2;
                                    }
                                    kl.m8459(m6218(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), new StringBuilder().append(m6218(null, Color.green(0) + 127, null, "\u008b\u008a\u0083\u0091\u0092\u0091\u008f\u0089\u0091\u0086\u0091\u0083\u0091\u008b\u0087\u0082\u0087\u0087\u0094").intern()).append(cpVar.m7303()).append(m6218(null, ImageFormat.getBitsPerPixel(0) + 128, null, "\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008b").intern()).toString(), th, true, true, true);
                                    m.m8523(m6218(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u009b\u009a\u0099\u0090\u0086\u0091\u008f\u0089\u008d\u0098\u0093\u0097").intern(), new StringBuilder().append(m6218(null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, "\u008b\u009b\u009a\u0099\u008b\u0090\u0086\u0091\u008f\u0089\u008d\u0098\u0093\u0097\u0099\u009e\u008b\u008a\u0083\u0091\u0092\u0091\u008f\u0089\u0091\u0086\u0091\u0083\u0091\u008b\u0084\u008f\u0091\u009d\u009c\u008b\u0093\u0084\u0087\u0087\u008d\u0085\u0085\u0082\u008b\u0087\u0082\u0087\u0087\u0084\u008b\u0083\u0097").intern()).append(cpVar.m7303()).append(m6218(null, 127 - TextUtils.getCapsMode("", 0, 0), null, "\u009f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008b").intern()).toString());
                                }

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static String m6218(String str2, int i6, int[] iArr, String str3) {
                                    byte[] bArr = str3;
                                    if (str3 != null) {
                                        bArr = str3.getBytes(C.ISO88591_NAME);
                                    }
                                    byte[] bArr2 = bArr;
                                    char[] cArr = str2;
                                    if (str2 != null) {
                                        cArr = str2.toCharArray();
                                    }
                                    char[] cArr2 = cArr;
                                    synchronized (k.f2956) {
                                        char[] cArr3 = f537;
                                        int i7 = f535;
                                        if (f534) {
                                            int length = bArr2.length;
                                            k.f2955 = length;
                                            char[] cArr4 = new char[length];
                                            k.f2957 = 0;
                                            while (k.f2957 < k.f2955) {
                                                cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i6] - i7);
                                                k.f2957++;
                                            }
                                            return new String(cArr4);
                                        }
                                        if (f536) {
                                            int length2 = cArr2.length;
                                            k.f2955 = length2;
                                            char[] cArr5 = new char[length2];
                                            k.f2957 = 0;
                                            while (k.f2957 < k.f2955) {
                                                cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i6] - i7);
                                                k.f2957++;
                                            }
                                            return new String(cArr5);
                                        }
                                        int length3 = iArr.length;
                                        k.f2955 = length3;
                                        char[] cArr6 = new char[length3];
                                        k.f2957 = 0;
                                        while (k.f2957 < k.f2955) {
                                            cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i6] - i7);
                                            k.f2957++;
                                        }
                                        return new String(cArr6);
                                    }
                                }
                            });
                            av.m6159(av.this).add(cpVar);
                        } else {
                            m6167.put(m6216(null, 127 - TextUtils.indexOf("", ""), null, "\u008e\u0096\u008e").intern(), false);
                            if (m6177 != null) {
                                p.m8554(m6177.new AnonymousClass3(m7302, az.b.f649));
                            }
                            kl.m8459(m6216(null, 127 - TextUtils.getTrimmedLength(""), null, "\u0088\u0081\u008b\u008a\u0085\u008a\u0089\u0088\u0084\u0087\u0086\u0081\u0085\u0085\u0084\u0083").intern(), new StringBuilder().append(str).append(m6215("\uf58cῲ\uf5ac彍磛磊\u00ad\uf61c숢嬘ﴶФ\uf29f埗\uf18cࡨﺼ", (-1) - Process.getGidForName("")).intern()).append(m7293).append(m6215("坞뭼坾ﯹ㽠뻋쒕咀ٱﾏ몜쀥假\uf355똬챵尽\uf0f5돸쯕姱\uf4a2꾌힐䕊\ue800ꭊ팼䅞\uec04꣰\udef0亮\ue1a3꒧\uda8b䪰\ue575ꁛ\ue641瘁\ud912", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()).toString(), (Throwable) null, true, true, false);
                            if (cpVar.m7290()) {
                                av.this.m6209().adQualitySdkInitFailed(ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET, new StringBuilder().append(cpVar.m7303()).append(m6215("\uf58cῲ\uf5ac彍磛磊\u00ad\uf61c숢嬘ﴶФ\uf29f埗\uf18cࡨﺼ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern()).append(cpVar.m7293()).append(m6215("坞뭼坾ﯹ㽠뻋쒕咀ٱﾏ몜쀥假\uf355똬챵尽\uf0f5돸쯕姱\uf4a2꾌힐䕊\ue800ꭊ팼䅞\uec04꣰\udef0亮\ue1a3꒧\uda8b䪰\ue575ꁛ\ue641瘁\ud912", Gravity.getAbsoluteGravity(0, 0)).intern()).toString());
                                i2 = f521 + 83;
                                f524 = i2 % 128;
                            }
                        }
                        m6167.remove(m6216(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0082\u0081").intern());
                    }
                    m.m8519(m6216(null, (Process.myTid() >> 22) + 127, null, "\u0088\u0081\u008b\u008a\u0085\u008a\u0089\u0088\u0084\u0087\u0086\u0081\u0085\u0085\u0084\u0083").intern(), new StringBuilder().append(cpVar.m7303()).append(m6216(null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0088\u0081\u0096\u0088\u0081\u008e\u008c\u0081\u0095\u0087\u008c\u0094\u0084\u0088\u0093\u008c\u008f\u0081\u0091\u0090\u008a\u008e\u008d\u008f\u008c\u008e\u008a\u0092\u008c\u0088\u0084\u0087\u0086\u0081\u0085\u0085\u0084\u0086\u008c").intern()).toString());
                    if (m6177 != null) {
                        p.m8554(m6177.new AnonymousClass5(m7302, az.a.f640));
                    }
                    m6167.put(m6216(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u008e\u0086\u008f").intern(), true);
                    i2 = f524 + 59;
                    f521 = i2 % 128;
                    int i6 = i2 % 2;
                    m6167.remove(m6216(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0082\u0081").intern());
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ﻐ, reason: contains not printable characters */
                public final void mo6217(Throwable th) {
                    int i2 = 2 % 2;
                    int i3 = f524 + 89;
                    f521 = i3 % 128;
                    Object obj2 = null;
                    if (i3 % 2 != 0) {
                        ba m6177 = av.m6177(av.this);
                        if (m6177 != null) {
                            p.m8554(m6177.new AnonymousClass3(m7302, az.b.f648));
                            int i4 = f524 + 53;
                            f521 = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        kl.m8459(m6216(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u0088\u0081\u008b\u008a\u0085\u008a\u0089\u0088\u0084\u0087\u0086\u0081\u0085\u0085\u0084\u0083").intern(), new StringBuilder().append(m6215("겂ꆛ곇\ue105鷮᱄㩹꽀\uf8d2\ue527᠏㻈ꮋ\ue9a3ᒿ㊗ꟾ\uea0eᅼ㕯ꈬ\uee50ൖ⤵뺝\uf2a9ৈⶃ뫁\uf6e3\u0a79⁄땲", Gravity.getAbsoluteGravity(0, 0)).intern()).append(m7302).toString(), th, true, true, true);
                        return;
                    }
                    av.m6177(av.this);
                    super.hashCode();
                    throw null;
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m6216(String str2, int i2, int[] iArr, String str3) {
                    byte[] bArr = str3;
                    if (str3 != null) {
                        bArr = str3.getBytes(C.ISO88591_NAME);
                    }
                    byte[] bArr2 = bArr;
                    char[] cArr = str2;
                    if (str2 != null) {
                        cArr = str2.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (k.f2956) {
                        char[] cArr3 = f527;
                        int i3 = f523;
                        if (f522) {
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
                        if (f525) {
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

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m6215(String str2, int i2) {
                    String str3;
                    char[] cArr = str2;
                    if (str2 != null) {
                        cArr = str2.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (g.f2155) {
                        char[] m7785 = g.m7785(f526, cArr2, i2);
                        g.f2157 = 4;
                        while (g.f2157 < m7785.length) {
                            g.f2156 = g.f2157 - 4;
                            m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f526));
                            g.f2157++;
                        }
                        str3 = new String(m7785, 4, m7785.length - 4);
                    }
                    return str3;
                }
            });
            int i2 = f458 + 63;
            f459 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
        int i3 = f459 + 107;
        f458 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m6186(Context context, String str, String str2, List<gt> list, je jeVar) {
        int i = 2 % 2;
        Iterator<gt> it = list.iterator();
        int i2 = f458 + 99;
        f459 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 % 4;
        }
        while (it.hasNext()) {
            int i4 = f459 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f458 = i4 % 128;
            int i5 = i4 % 2;
            Context context2 = context;
            String str3 = str;
            String str4 = str2;
            je jeVar2 = jeVar;
            m6185(context2, str3, str4, it.next(), jeVar2);
            context = context2;
            str = str3;
            str2 = str4;
            jeVar = jeVar2;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m6185(final Context context, final String str, final String str2, final gt gtVar, final je jeVar) {
        int i = 2 % 2;
        jl.e m7817 = gtVar.m7817();
        if (m7817 != null) {
            int i2 = f458 + 59;
            f459 = i2 % 128;
            int i3 = i2 % 2;
            final be mo7799 = gtVar.mo7799();
            m6202(str2, mo7799);
            ba baVar = this.f471;
            if (baVar != null) {
                p.m8554(baVar.new AnonymousClass5(str2, az.a.f642));
            }
            final String m8173 = this.f466.m8173(m7817, new iz() { // from class: com.ironsource.adqualitysdk.sdk.i.av.4
                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* renamed from: ﻐ, reason: contains not printable characters */
                public final void mo6221(String str3) {
                    av.m6170(av.this, context, str, str2, gtVar, av.m6182(av.this, context, str3, mo7799), false, mo7799, jeVar);
                }
            });
            p.m8553(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.9
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    cp m6182 = av.m6182(av.this, context, m8173, mo7799);
                    if (m6182 != null) {
                        av.m6170(av.this, context, str, str2, gtVar, m6182, true, mo7799, jeVar);
                    } else {
                        p.m8552(jeVar);
                    }
                }
            }, m6191(m7817));
            return;
        }
        p.m8552(jeVar);
        int i4 = f459 + 45;
        f458 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private cp m6192(Context context, String str, be beVar) {
        int i = 2 % 2;
        int i2 = f458;
        int i3 = i2 + 85;
        f459 = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            return new cp(context, new dg(str, this.f468), this.f464, this.f470, beVar);
        }
        int i5 = i2 + 33;
        f459 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m6161(final Context context, final String str, final String str2, final gt gtVar, final cp cpVar, final boolean z, final be beVar, final je jeVar) {
        int i = 2 % 2;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.7

            /* renamed from: ﮉ, reason: contains not printable characters */
            private static int f566 = 0;

            /* renamed from: ﮌ, reason: contains not printable characters */
            private static int f567 = 1;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static char[] f568 = {'9', 137, 158, 158, 153, 148, 155, 161, Typography.nbsp, 143, 135, 151, 151, 148, 150, 155, 16, 'C', 'j', 'k', 'q', 'q', 'j', 'f', 'e', 'n', 'n', 'k', AbstractJsonLexerKt.BEGIN_LIST, 16, 'I', 'p', 'q', 'k', GMTDateParser.DAY_OF_MONTH, 'i', 'n', 'n', 'i', 'A', 'B', 'l', 'q', 'n', 'i', 'k', 'I', 'a', 224, 253, 253, 256, 257, 255, 225, ';', 150, 180, 187, 186, 180, 181, 179, 149};

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                ba m6177;
                String intern;
                je jeVar2;
                je jeVar3;
                int i2 = 2 % 2;
                int i3 = f566 + 81;
                f567 = i3 % 128;
                int i4 = i3 % 2;
                if (av.m6166(av.this).get() || cpVar == null || av.m6146(av.this).contains(gtVar) || (m6177 = av.m6177(av.this)) == null) {
                    return;
                }
                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ba.4

                    /* renamed from: ﻐ */
                    private /* synthetic */ String f663;

                    /* renamed from: ｋ */
                    private /* synthetic */ cp f664;

                    /* renamed from: ﾒ */
                    private /* synthetic */ boolean f666;

                    AnonymousClass4(String str3, cp cpVar2, boolean z2) {
                        r2 = str3;
                        r3 = cpVar2;
                        r4 = z2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        az m6267 = ba.m6267(ba.this, r2);
                        if (m6267 != null) {
                            m6267.m6260(r3);
                        }
                    }
                });
                if (!cpVar.m7290() && (jeVar3 = jeVar) != null) {
                    int i5 = f567 + 55;
                    f566 = i5 % 128;
                    int i6 = i5 % 2;
                    p.m8552(jeVar3);
                    int i7 = f567 + 5;
                    f566 = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (!av.m6203(cpVar)) {
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.7.5

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f578 = 0;

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static int[] f579 = {-353830306, 157172804, 1589264190, -449514305, -13660640, 266784307, 983383635, -263068689, -883337894, 30317648, 543488338, -598860890, 1590455646, 431094045, -1079764358, -795179691, 1565219521, -71510538};

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static int f580 = 1;

                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            int i9 = 2 % 2;
                            Object obj = null;
                            if (!av.m6183(av.this).containsKey(cpVar.m7302())) {
                                int i10 = f580 + 87;
                                f578 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    ba m61772 = av.m6177(av.this);
                                    if (m61772 == null) {
                                        return;
                                    }
                                    p.m8554(m61772.new AnonymousClass3(cpVar.m7302(), az.b.f652));
                                    JSONObject m6167 = av.m6167(av.this, cpVar);
                                    try {
                                        m6167.put(m6224(new int[]{-394812700, 622067883}, TextUtils.getOffsetBefore("", 0) + 3).intern(), false);
                                    } catch (JSONException unused) {
                                    }
                                    av.m6155(av.this).put(cpVar.m7302(), m6167);
                                    String m6271 = m61772.m6271(cpVar.m7302());
                                    av.m6183(av.this).put(cpVar.m7302(), m6271);
                                    if (cpVar.m7290()) {
                                        av.this.m6209().adQualitySdkInitFailed(ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK, new StringBuilder().append(cpVar.m7303()).append(m6224(new int[]{131149706, 1777451454, 1270792726, -1914932362, 1349211448, -1504279274, -1845354533, 1115631153}, 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()).append(cpVar.m7293()).append(m6224(new int[]{1580448367, -1639120621, -487726824, 1541672938, 1720465832, 1337311892, -1556973571, 672271594, 131149706, 1777451454, 1270792726, -1914932362, 1349211448, -1504279274, -1845354533, 1115631153}, 28 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()).append(cpVar.m7297()).append(m6224(new int[]{567457838, 1653783974, -1074036783, -1914547778, 1885426800, 1263251731}, 9 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).toString());
                                    }
                                    kl.m8459(m6224(new int[]{-541048765, 502196268, -1130764483, -1817635433, 599247651, -1051131061, -95222833, 310743366}, 16 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), m6271, (Throwable) null, true, true, false);
                                } else {
                                    av.m6177(av.this);
                                    super.hashCode();
                                    throw null;
                                }
                            }
                            int i11 = f580 + 75;
                            f578 = i11 % 128;
                            if (i11 % 2 == 0) {
                                return;
                            }
                            super.hashCode();
                            throw null;
                        }

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static String m6224(int[] iArr, int i9) {
                            String str3;
                            synchronized (a.f86) {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f579.clone();
                                a.f83 = 0;
                                while (a.f83 < iArr.length) {
                                    cArr[0] = (char) (iArr[a.f83] >> 16);
                                    cArr[1] = (char) iArr[a.f83];
                                    cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                                    cArr[3] = (char) iArr[a.f83 + 1];
                                    a.f84 = (cArr[0] << 16) + cArr[1];
                                    a.f85 = (cArr[2] << 16) + cArr[3];
                                    a.m5773(iArr2);
                                    for (int i10 = 0; i10 < 16; i10++) {
                                        int i11 = a.f84 ^ iArr2[i10];
                                        a.f84 = i11;
                                        a.f85 = a.m5774(i11) ^ a.f85;
                                        int i12 = a.f84;
                                        a.f84 = a.f85;
                                        a.f85 = i12;
                                    }
                                    int i13 = a.f84;
                                    a.f84 = a.f85;
                                    a.f85 = i13;
                                    a.f85 = i13 ^ iArr2[16];
                                    a.f84 ^= iArr2[17];
                                    int i14 = a.f84;
                                    int i15 = a.f85;
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
                                str3 = new String(cArr2, 0, i9);
                            }
                            return str3;
                        }
                    });
                    return;
                }
                String intern2 = m6223("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 16, 48, 0}, false).intern();
                StringBuilder append = new StringBuilder().append(m6223("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{16, 13, 0, 0}, true).intern()).append(str).append(m6223("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{29, 18, 0, 0}, true).intern());
                if (z) {
                    intern = m6223("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{47, 8, 155, 0}, false).intern();
                    int i9 = f567 + 55;
                    f566 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    intern = m6223("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{55, 9, 79, 0}, false).intern();
                }
                cn.m7271(intern2, append.append(intern).toString());
                beVar.m6386();
                if (cpVar.m7290() && (jeVar2 = jeVar) != null) {
                    int i11 = f567 + 17;
                    f566 = i11 % 128;
                    int i12 = i11 % 2;
                    p.m8552(jeVar2);
                }
                if (!(!s.m8592().m8616())) {
                    return;
                }
                av.m6173(av.this, cpVar, str);
                if (av.m6163(av.this, cpVar.m7302())) {
                    return;
                }
                av.m6146(av.this).add(gtVar);
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static String m6223(String str3, int[] iArr, boolean z2) {
                String str4;
                byte[] bArr = str3;
                if (str3 != null) {
                    bArr = str3.getBytes(C.ISO88591_NAME);
                }
                byte[] bArr2 = bArr;
                synchronized (h.f2286) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f568, i2, cArr, 0, i3);
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
                    str4 = new String(cArr);
                }
                return str4;
            }
        });
        int i2 = f458 + 39;
        f459 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m6168(cp cpVar) {
        int i = 2 % 2;
        int i2 = f459 + 5;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m6160 = m6160(cpVar.m7293());
        try {
            m6160.put(is.f2588, cpVar.m7298());
        } catch (JSONException e) {
            m.m8535(m6193("䌸姃ꑧ쭚䍻䃃雗蝹⛡⚋㲉礼蠲뵩婐\udcf1牭ጇ쀐뚩", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern(), m6193("\udf2dം㚫衈\udf68ᐟЇ쑪뫣爉깒㨳ᐰ\ue984좉鿤\uee77䟆劙\uf5aa䦲봳＋欐⏢᭭᥎샃뵥皣ꎈ⚏\u177a\uecf8췆鱗\uf2ed䨧噦\uf20a䳟", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), e);
        }
        int i4 = f458 + 29;
        f459 = i4 % 128;
        int i5 = i4 % 2;
        return m6160;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.kn.m8470(r6, r5.m7294()) < 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.kn.m8470(r6, r5.m7295()) > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.kn.m8470(r6, r5.m7294());
        r5 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (m6193("꣄Ｄౌ翲ꢁ\ue605㻓㏽촴聊钒", 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern().equals(r6) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (m6193("꣄Ｄౌ翲ꢁ\ue605㻓㏽촴聊钒", 0).intern().equals(r6) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.av.f459 + 41;
        com.ironsource.adqualitysdk.sdk.i.av.f458 = r1 % 128;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m6204(cp cpVar, String str) {
        int i = 2 % 2;
        int i2 = f458 + 77;
        f459 = i2 % 128;
        if (i2 % 2 != 0) {
            ViewConfiguration.getScrollBarFadeDuration();
        }
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m6189(cp cpVar) {
        int i = 2 % 2;
        int i2 = f458 + 103;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        String m7297 = cpVar.m7297();
        if (m7297 != null) {
            int i4 = f458 + 95;
            f459 = i4 % 128;
            int i5 = i4 % 2;
            if (kn.m8470(IronSourceAdQuality.getSDKVersion(), m7297) < 0) {
                return false;
            }
        }
        int i6 = f459 + 23;
        f458 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m6176(String str) {
        int i = 2 % 2;
        int i2 = f459 + 57;
        f458 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.f469.containsKey(str);
            throw null;
        }
        if (this.f469.containsKey(str) && this.f469.get(str).m6141(this.f463)) {
            return true;
        }
        int i3 = f458 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f459 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m6196() {
        int i = 2 % 2;
        ArrayList<cp> arrayList = new ArrayList();
        for (cp cpVar : m6154()) {
            int i2 = f458 + 113;
            f459 = i2 % 128;
            int i3 = i2 % 2;
            if (m6176(cpVar.m7302())) {
                arrayList.add(cpVar);
                int i4 = f458 + 19;
                f459 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        for (final cp cpVar2 : arrayList) {
            m.m8538(m6193("䌸姃ꑧ쭚䍻䃃雗蝹⛡⚋㲉礼蠲뵩婐\udcf1牭ጇ쀐뚩", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), new StringBuilder().append(m6193("ꐯ끏旹ꖳꑫꥉ坔\ue99f쇱켈ﴊ។漰咈", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern()).append(cpVar2.m7303()).append(m6165((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 111 - View.resolveSize(0, 0), 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()).toString());
            String m7302 = cpVar2.m7302();
            m6188(m7302, m6148().get(m7302));
            p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.6
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    cp.this.m7299();
                }
            });
            m6150().remove(cpVar2);
        }
        int i6 = f459 + 47;
        f458 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private long m6191(jl.e eVar) {
        int i = 2 % 2;
        Object obj = null;
        if (!(!ar.m6041().mo6062())) {
            int i2 = f459 + 47;
            f458 = i2 % 128;
            if (i2 % 2 != 0) {
                return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
            }
            throw null;
        }
        if (eVar == null) {
            return 0L;
        }
        int i3 = f459 + 67;
        f458 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f466.m8175(eVar)) {
            return 0L;
        }
        int i5 = f459 + 75;
        f458 = i5 % 128;
        if (i5 % 2 != 0) {
            return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private synchronized List<cp> m6150() {
        List<cp> list;
        int i = 2 % 2;
        int i2 = f459 + 57;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        list = this.f475;
        int i3 = f459 + 109;
        f458 = i3 % 128;
        int i4 = i3 % 2;
        return list;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private synchronized List<gt> m6156() {
        List<gt> list;
        int i = 2 % 2;
        int i2 = f458 + 33;
        int i3 = i2 % 128;
        f459 = i3;
        int i4 = i2 % 2;
        list = this.f472;
        int i5 = i3 + 5;
        f458 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m6148() {
        Map<String, JSONObject> map;
        int i = 2 % 2;
        int i2 = f459 + 13;
        int i3 = i2 % 128;
        f458 = i3;
        int i4 = i2 % 2;
        map = this.f473;
        int i5 = i3 + 99;
        f459 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private synchronized Map<String, String> m6153() {
        Map<String, String> map;
        int i = 2 % 2;
        int i2 = f458 + 51;
        int i3 = i2 % 128;
        f459 = i3;
        int i4 = i2 % 2;
        map = this.f467;
        int i5 = i3 + 7;
        f458 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private List<cp> m6154() {
        int i = 2 % 2;
        int i2 = f458 + 25;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f475 != null) {
            return new ArrayList(this.f475);
        }
        ArrayList arrayList = new ArrayList();
        int i4 = f459 + 67;
        f458 = i4 % 128;
        if (i4 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m6202(String str, be beVar) {
        int i = 2 % 2;
        int i2 = f459 + 3;
        int i3 = i2 % 128;
        f458 = i3;
        int i4 = i2 % 2;
        if (beVar != null) {
            int i5 = i3 + 31;
            f459 = i5 % 128;
            int i6 = i5 % 2;
            m6148().put(str, m6160(beVar.m6379()));
            int i7 = f458 + 33;
            f459 = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = f459 + 75;
        f458 = i9 % 128;
        int i10 = i9 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m6160(String str) {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(is.f2592, str);
        } catch (JSONException e) {
            m.m8535(m6193("䌸姃ꑧ쭚䍻䃃雗蝹⛡⚋㲉礼蠲뵩婐\udcf1牭ጇ쀐뚩", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1).intern(), m6193("\udf2dം㚫衈\udf68ᐟЇ쑪뫣爉깒㨳ᐰ\ue984좉鿤\uee77䟆劙\uf5aa䦲봳＋欐⏢᭭᥎샃뵥皣ꎈ⚏\u177a\uecf8췆鱗\uf2ed䨧噦\uf20a䳟", View.resolveSizeAndState(0, 0, 0) + 1).intern(), e);
        }
        int i2 = f458 + 95;
        f459 = i2 % 128;
        int i3 = i2 % 2;
        return jsonObjectInit;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m6179(Map<String, JSONObject> map) throws JSONException {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            int i2 = f459 + 59;
            f458 = i2 % 128;
            if (i2 % 2 == 0) {
                String str = (String) it.next();
                jsonObjectInit2.put(str.toLowerCase(), map.get(str));
                Object obj = null;
                super.hashCode();
                throw null;
            }
            String str2 = (String) it.next();
            jsonObjectInit2.put(str2.toLowerCase(), map.get(str2));
        }
        jsonObjectInit.put(m6165((char) Drawable.resolveOpacity(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 120, 4 - KeyEvent.getDeadChar(0, 0)).intern(), jsonObjectInit2);
        int i3 = f458 + 47;
        f459 = i3 % 128;
        int i4 = i3 % 2;
        return jsonObjectInit;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m6211(String str) {
        int i = 2 % 2;
        m6212(str, new ArrayList());
        int i2 = f459 + 65;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6212(String str, List<Object> list) {
        int i = 2 % 2;
        int i2 = f459 + 47;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f474.get();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (this.f474.get()) {
            return;
        }
        Iterator<cp> it = m6154().iterator();
        while (it.hasNext()) {
            it.next().m7301(str, list);
            int i3 = f458 + 99;
            f459 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 3;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m6209() {
        ISAdQualityInitListener iSAdQualityInitListener;
        int i = 2 % 2;
        int i2 = f459 + 109;
        int i3 = i2 % 128;
        f458 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        iSAdQualityInitListener = this.f465;
        int i4 = i3 + 99;
        f459 = i4 % 128;
        int i5 = i4 % 2;
        return iSAdQualityInitListener;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private synchronized void m6145() {
        int i = 2 % 2;
        int i2 = f459 + 61;
        f458 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ba baVar = this.f471;
            if (baVar == null) {
                return;
            }
            if (!baVar.m6273(m6144())) {
                m6209().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m6193("ో崕妃ꡆఅ䐕歽\ue468榘≐셷ᨪ읐릆Ꞻ뿱㴌ព㷦햢髉\ued2f遭䬗\uf088䭯癭\ue0da湇⛢첶چ쐌볥ꋤ뱄⇘ᨼ㥈툇龻\uf067", TextUtils.indexOf("", "", 0, 0) + 1).intern());
                int i3 = f458 + 75;
                f459 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            int i5 = f458 + 77;
            f459 = i5 % 128;
            if (i5 % 2 == 0) {
                m6209().adQualitySdkInitSuccess();
                return;
            } else {
                m6209().adQualitySdkInitSuccess();
                throw null;
            }
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m6147() {
        boolean mo6044;
        int i = 2 % 2;
        int i2 = f459 + 67;
        f458 = i2 % 128;
        int i3 = i2 % 2;
        mo6044 = ar.m6041().mo6044();
        int i4 = f459 + 59;
        f458 = i4 % 128;
        int i5 = i4 % 2;
        return mo6044;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if ((!com.ironsource.adqualitysdk.sdk.i.ar.m6041().mo6046()) != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (m6147() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.av.f458 + 101;
        com.ironsource.adqualitysdk.sdk.i.av.f459 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m6041().mo6046() != false) goto L16;
     */
    /* renamed from: ﭖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean m6144() {
        int i = 2 % 2;
        int i2 = f459 + 77;
        f458 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6193(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f462, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f462));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6165(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f460[c.f1198 + i] ^ (c.f1198 * f461)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
