package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.kj;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ar extends AnonymousClass5 {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static ar f370;

    public interface c {
        /* renamed from: ｋ, reason: contains not printable characters */
        void mo6079();

        /* renamed from: ﾇ, reason: contains not printable characters */
        void mo6080();
    }

    /* renamed from: リ, reason: contains not printable characters */
    public abstract List mo6042();

    /* renamed from: ヮ, reason: contains not printable characters */
    public abstract int mo6043();

    /* renamed from: ヶ, reason: contains not printable characters */
    public abstract boolean mo6044();

    /* renamed from: 丫, reason: contains not printable characters */
    public abstract long mo6045();

    /* renamed from: 乁, reason: contains not printable characters */
    public abstract boolean mo6046();

    /* renamed from: 爫, reason: contains not printable characters */
    public abstract void mo6047();

    /* renamed from: ﬤ, reason: contains not printable characters */
    public abstract JSONObject mo6048();

    /* renamed from: טּ, reason: contains not printable characters */
    public abstract int mo6049();

    /* renamed from: סּ, reason: contains not printable characters */
    public abstract int mo6050();

    /* renamed from: ףּ, reason: contains not printable characters */
    public abstract String mo6051();

    /* renamed from: ﭖ, reason: contains not printable characters */
    public abstract aq mo6052();

    /* renamed from: ﭴ, reason: contains not printable characters */
    public abstract at mo6053();

    /* renamed from: ﭸ, reason: contains not printable characters */
    public abstract ao mo6054();

    /* renamed from: ﮉ, reason: contains not printable characters */
    public abstract ap mo6055();

    /* renamed from: ﮌ, reason: contains not printable characters */
    public abstract String mo6056();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public abstract double mo6057();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public abstract int mo6058();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public abstract boolean mo6059();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public abstract boolean mo6060();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public abstract double mo6061();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo6062();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract Map<String, au> mo6063();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo6064(ax axVar);

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo6065(JSONObject jSONObject);

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo6066(Context context, jj jjVar, al alVar, c cVar, boolean z);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo6067(ax axVar);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo6068(jh jhVar);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo6069();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo6070(String str, String str2);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract String mo6071(String str);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo6072(Context context, as asVar, boolean z);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo6073(ax axVar);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo6074();

    /* synthetic */ ar(byte b) {
        this();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized ar m6041() {
        ar arVar;
        synchronized (ar.class) {
            if (f370 == null) {
                f370 = new e();
            }
            arVar = f370;
        }
        return arVar;
    }

    private ar() {
    }

    static class e extends ar {

        /* renamed from: リ, reason: contains not printable characters */
        private static int f373 = 1;

        /* renamed from: ヮ, reason: contains not printable characters */
        private static int f374 = 0;

        /* renamed from: 丫, reason: contains not printable characters */
        private static char[] f375 = {AbstractJsonLexerKt.COLON, 'p', 'i', 'e', 140, 288, 292, 293, 238, 227, 231, 236, AbstractJsonLexerKt.COLON, 't', 'k', 'a', 'W', 179, 186, Typography.paragraph, '9', 'j', 'i', 'r', 'o', 228, 201, 193, 220, 194, 203, 233, 197, 197, 224, 219, 218, 220, 221, 219, 226, 236, 230, 225, 224, 227, 231, 226, 221, 229, 234, 231, 155, 307, 299, 303, 303, 260, 260, 302, 300, 291, 259, 261, 300, 301, 304, 300, 293, 301, 300, 259, 267, 306, 306, 308, 285, '8', 'j', 'l', '9', 'l', GMTDateParser.DAY_OF_MONTH, 'b', '9', GMTDateParser.SECONDS, 'k', '1', GMTDateParser.HOURS, 'o', 'o', '9', 'I', 'D', 'k', 'G', 'C', 'f', 'l', AbstractJsonLexerKt.BEGIN_LIST, GMTDateParser.YEAR, 'n', 'n', 'i', GMTDateParser.DAY_OF_MONTH, 'k', 'q', 'p', 'r', 'c', 'a', GMTDateParser.YEAR, 'V', 'n', 'j', 'a', 'g', GMTDateParser.HOURS, 'U', AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', AbstractJsonLexerKt.COLON, GMTDateParser.SECONDS, GMTDateParser.SECONDS, 210, 212, 211, 212, 201, 193};

        /* renamed from: 乁, reason: contains not printable characters */
        private static int f376 = 85;

        /* renamed from: ヶ, reason: contains not printable characters */
        private boolean f377;

        /* renamed from: 爫, reason: contains not printable characters */
        private boolean f378;

        /* renamed from: ﬤ, reason: contains not printable characters */
        private boolean f379;

        /* renamed from: טּ, reason: contains not printable characters */
        private int f380;

        /* renamed from: סּ, reason: contains not printable characters */
        private List f381;

        /* renamed from: ףּ, reason: contains not printable characters */
        private al f382;

        /* renamed from: ﭖ, reason: contains not printable characters */
        private c f383;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private ao f384;

        /* renamed from: ﭸ, reason: contains not printable characters */
        private List<ax> f385;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private List<ax> f386;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private ax f387;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private jj f388;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private aq f389;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private Handler f390;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private at f391;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private ap f392;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private final int f393;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private final int f394;

        /* renamed from: ｋ, reason: contains not printable characters */
        private final int f395;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private jm f396;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private final int f397;

        /* renamed from: ﱟ, reason: contains not printable characters */
        static /* synthetic */ int m6084(e eVar) {
            int i = 2 % 2;
            int i2 = f374 + 59;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            int m6082 = eVar.m6082();
            int i4 = f374 + 69;
            f373 = i4 % 128;
            int i5 = i4 % 2;
            return m6082;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        static /* synthetic */ ax m6085(e eVar) {
            int i = 2 % 2;
            int i2 = f374;
            int i3 = i2 + 113;
            f373 = i3 % 128;
            int i4 = i3 % 2;
            ax axVar = eVar.f387;
            int i5 = i2 + 77;
            f373 = i5 % 128;
            if (i5 % 2 != 0) {
                return axVar;
            }
            throw null;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        static /* synthetic */ int m6086(e eVar) {
            int i = 2 % 2;
            int i2 = f374 + 105;
            int i3 = i2 % 128;
            f373 = i3;
            int i4 = i2 % 2;
            int i5 = eVar.f380;
            eVar.f380 = i5 + 1;
            int i6 = i3 + 31;
            f374 = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        static /* synthetic */ Handler m6087(e eVar) {
            int i = 2 % 2;
            int i2 = f373 + 69;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = eVar.f390;
            if (i3 == 0) {
                return handler;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ c m6088(e eVar) {
            int i = 2 % 2;
            int i2 = f373 + 85;
            int i3 = i2 % 128;
            f374 = i3;
            int i4 = i2 % 2;
            c cVar = eVar.f383;
            int i5 = i3 + 95;
            f373 = i5 % 128;
            if (i5 % 2 != 0) {
                return cVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ void m6090(e eVar) {
            int i = 2 % 2;
            int i2 = f373 + 61;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            eVar.m6083();
            int i4 = f373 + 95;
            f374 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ jm m6093(e eVar) {
            int i = 2 % 2;
            int i2 = f373 + 113;
            int i3 = i2 % 128;
            f374 = i3;
            int i4 = i2 % 2;
            Object obj = null;
            jm jmVar = eVar.f396;
            if (i4 != 0) {
                super.hashCode();
                throw null;
            }
            int i5 = i3 + 95;
            f373 = i5 % 128;
            if (i5 % 2 != 0) {
                return jmVar;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ List m6095(e eVar) {
            int i = 2 % 2;
            int i2 = f373 + 101;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            List<ax> list = eVar.f386;
            if (i3 == 0) {
                return list;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ ax m6096(e eVar, ax axVar) {
            int i = 2 % 2;
            int i2 = f374 + 17;
            int i3 = i2 % 128;
            f373 = i3;
            int i4 = i2 % 2;
            eVar.f387 = axVar;
            int i5 = i3 + 83;
            f374 = i5 % 128;
            int i6 = i5 % 2;
            return axVar;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ List m6098(e eVar) {
            int i = 2 % 2;
            int i2 = f373;
            int i3 = i2 + 49;
            f374 = i3 % 128;
            int i4 = i3 % 2;
            List<ax> list = eVar.f385;
            int i5 = i2 + 99;
            f374 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ void m6100(JSONObject jSONObject, long j) {
            int i = 2 % 2;
            int i2 = f374 + 1;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            m6091(jSONObject, j);
            int i4 = f373 + 45;
            f374 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
        }

        public e() {
            super((byte) 0);
            m6089((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, false, 194 - ExpandableListView.getPackedPositionGroup(0L), "\u0001\t\ufff8", 2 - View.MeasureSpec.getSize(0)).intern();
            m6089(3 - Drawable.resolveOpacity(0, 0), true, 188 - (Process.myPid() >> 22), "�\u0006\ufffe", KeyEvent.keyCodeFromString("") + 3).intern();
            m6097("\u0000\u0000\u0001\u0000", new int[]{0, 4, 0, 0}, true).intern();
            m6097("\u0000\u0000\u0001\u0000", new int[]{4, 4, 181, 0}, false).intern();
            m6097((String) null, new int[]{8, 4, 126, 4}, true).intern();
            m6097("\u0000\u0000\u0000\u0001", new int[]{12, 4, 0, 3}, false).intern();
            m6097("\u0001\u0000\u0001\u0000", new int[]{16, 4, 75, 0}, true).intern();
            m6089(View.MeasureSpec.getSize(0) + 3, true, 192 - Drawable.resolveOpacity(0, 0), "\u0001\b\ufff9", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1).intern();
            m6097("\u0001\u0000\u0000\u0000", new int[]{20, 4, 0, 0}, false).intern();
            TimeUnit.HOURS.toMillis(24L);
            this.f394 = (int) TimeUnit.SECONDS.toMillis(5L);
            this.f397 = (int) TimeUnit.HOURS.toMillis(12L);
            this.f393 = (int) TimeUnit.SECONDS.toMillis(3L);
            this.f395 = (int) TimeUnit.SECONDS.toMillis(10L);
            this.f380 = 0;
            this.f381 = null;
            this.f377 = false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ｋ */
        public final void mo6066(Context context, jj jjVar, al alVar, c cVar, boolean z) {
            int i = 2 % 2;
            this.f396 = new jm(context, m6097("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{24, 28, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 18}, true).intern(), m6089(19 - TextUtils.indexOf((CharSequence) "", '0', 0), true, 183 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0001\u0010ￒￋ\u0012\u0003\u0010\u0001\u0003\u0011ￋ\uffff\n\u000b\r\r\u0011\u0004\f\r", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17).intern());
            this.f388 = jjVar;
            this.f379 = false;
            this.f378 = z;
            this.f382 = alVar;
            this.f390 = new Handler(Looper.getMainLooper());
            aw awVar = new aw();
            this.f391 = new at(awVar);
            this.f392 = new ap(awVar);
            this.f389 = new aq(awVar);
            this.f384 = new ao();
            mo6078(m6081());
            m6077(awVar);
            this.f383 = cVar;
            this.f386 = new ArrayList();
            this.f385 = new ArrayList();
            int i2 = f373 + 63;
            f374 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﭴ */
        public final at mo6053() {
            int i = 2 % 2;
            int i2 = f374 + 41;
            int i3 = i2 % 128;
            f373 = i3;
            int i4 = i2 % 2;
            at atVar = this.f391;
            int i5 = i3 + 103;
            f374 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
            }
            return atVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﮉ */
        public final ap mo6055() {
            int i = 2 % 2;
            int i2 = f373 + 45;
            int i3 = i2 % 128;
            f374 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            ap apVar = this.f392;
            int i4 = i3 + 53;
            f373 = i4 % 128;
            int i5 = i4 % 2;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﭖ */
        public final aq mo6052() {
            int i = 2 % 2;
            int i2 = f373;
            int i3 = i2 + 45;
            f374 = i3 % 128;
            int i4 = i3 % 2;
            aq aqVar = this.f389;
            int i5 = i2 + 91;
            f374 = i5 % 128;
            int i6 = i5 % 2;
            return aqVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﭸ */
        public final ao mo6054() {
            int i = 2 % 2;
            int i2 = f373;
            int i3 = i2 + 15;
            f374 = i3 % 128;
            int i4 = i3 % 2;
            ao aoVar = this.f384;
            int i5 = i2 + 17;
            f374 = i5 % 128;
            int i6 = i5 % 2;
            return aoVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﱡ */
        public final boolean mo6059() {
            boolean z;
            int i = 2 % 2;
            int i2 = f374;
            int i3 = i2 + 63;
            f373 = i3 % 128;
            if (i3 % 2 == 0) {
                z = this.f378;
                int i4 = 33 / 0;
            } else {
                z = this.f378;
            }
            int i5 = i2 + 75;
            f373 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: 爫 */
        public final synchronized void mo6047() {
            int i = 2 % 2;
            this.f390.removeCallbacksAndMessages(null);
            this.f390 = null;
            p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.1
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    e.m6095(e.this).clear();
                    e.m6098(e.this).clear();
                    e.m6096(e.this, (ax) null);
                }
            });
            int i2 = f374 + 59;
            f373 = i2 % 128;
            int i3 = i2 % 2;
        }

        /* renamed from: へ, reason: contains not printable characters */
        public final synchronized jj m6102() {
            jj jjVar;
            int i = 2 % 2;
            int i2 = f374 + 29;
            int i3 = i2 % 128;
            f373 = i3;
            int i4 = i2 % 2;
            jjVar = this.f388;
            int i5 = i3 + 57;
            f374 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return jjVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass5
        /* renamed from: ﾇ */
        public final synchronized void mo6078(JSONObject jSONObject) {
            int i = 2 % 2;
            Object obj = null;
            if (m6094(jSONObject)) {
                int i2 = f373 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f374 = i2 % 128;
                if (i2 % 2 != 0) {
                    m6099(jSONObject);
                    throw null;
                }
                m6099(jSONObject);
            }
            super.mo6078(jSONObject);
            this.f391.mo6078(jSONObject);
            this.f392.mo6078(jSONObject);
            this.f389.mo6078(jSONObject);
            this.f384.mo6078(jSONObject);
            int i3 = f374 + 67;
            f373 = i3 % 128;
            if (i3 % 2 == 0) {
                super.hashCode();
                throw null;
            }
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final synchronized void m6105(boolean z) {
            int i = 2 % 2;
            int i2 = f373 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            int i3 = i2 % 128;
            f374 = i3;
            int i4 = i2 % 2;
            this.f379 = z;
            int i5 = i3 + 25;
            f373 = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﺙ */
        public final synchronized boolean mo6060() {
            boolean z;
            int i = 2 % 2;
            int i2 = f374;
            int i3 = i2 + 103;
            f373 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            z = this.f379;
            int i4 = i2 + 61;
            f373 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾇ */
        public final void mo6068(jh jhVar) {
            int i = 2 % 2;
            int i2 = f373 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            m6076().m6238(jhVar);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: Ύ, reason: contains not printable characters */
        private JSONObject m6081() {
            int i = 2 % 2;
            int i2 = f373 + 11;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            String m8233 = this.f396.m8233(m6089(13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, TextUtils.lastIndexOf("", '0') + 185, "\u0003\u0006\u0004ￋ\u0000\ufffe\u0000\u0005\u0002\u000f\u0000\f\u000b", View.resolveSizeAndState(0, 0, 0) + 9).intern());
            if (m8233 != null) {
                try {
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(m8233);
                    int i4 = f373 + 87;
                    f374 = i4 % 128;
                    int i5 = i4 % 2;
                    return jsonObjectInit;
                } catch (JSONException unused) {
                }
            }
            return IronSourceNetworkBridge.jsonObjectInit();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾒ */
        public final void mo6072(final Context context, final as asVar, boolean z) {
            int i = 2 % 2;
            int i2 = f373 + 5;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            if (z) {
                p.m8547(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        if (!e.this.m6102().m8184().m8158()) {
                            e.m6088(e.this).mo6079();
                        } else {
                            if (e.this.mo6060()) {
                                return;
                            }
                            e.m6088(e.this).mo6080();
                        }
                    }
                }, ar.m6041().mo6049());
            }
            m6105(false);
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            try {
                jsonObjectInit = new ka(context, asVar, mo6045()).mo5900(IronSourceNetworkBridge.jsonObjectInit(), m6102().m8184().m8158(), true, false);
                int i4 = f374 + 33;
                f373 = i4 % 128;
                int i5 = i4 % 2;
            } catch (JSONException e) {
                m.m8535(m6089('<' - AndroidCharacter.getMirror('0'), true, 186 - KeyEvent.normalizeMetaState(0), "\u0004\u0001\t\n\uffde\u0000\u000f\n\b\u0000￭\u0002", 11 - Color.blue(0)).intern(), m6097("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{52, 25, 194, 0}, true).intern(), e);
            }
            m6102().m8186(this.f382.m6005(m6089((ViewConfiguration.getEdgeSlop() >> 16) + 4, true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 195, "\u0001￼\u0007￼", 2 - Color.red(0)).intern()), jsonObjectInit, new ji() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.5

                /* renamed from: ﱟ, reason: contains not printable characters */
                private static int f405 = 0;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static int f406 = 1;

                /* renamed from: ｋ, reason: contains not printable characters */
                private static char[] f409 = {GMTDateParser.SECONDS, 23904, 47716, 'R', 23905, 47717, 5987, 29796, 53617, 11867, 35699, 59470, 17730, 41537, 65355, 'l', 23911, 47740, 6015, 'E', 23926, 47738, 5987, 29794, 53556, 11880, 35709, 59474, 17751, 41537, 65346, 23639, 47380, 5706, 29529, 53293, 11563, 35388, 59177, 17520, 41271, 65079, 23346, 47110, 5389, 29199, 53068, 11290, 35079, 58903, 17170, 38497, 52050, 11358, 33095, 57926, 18192, 47195, 7517, 32368, 54132, 13413, 26982, 51827, 12080, 32895, 58743, 17930, 47878, 7173, 28943, 53844, 14102, 26638, 52503, 11817, 33632, 58431, 22829, 47654, 7974, 28729, 54570, 13982, 27520};

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static long f408 = 634313085264878852L;

                /* renamed from: ﻏ, reason: contains not printable characters */
                private static long f407 = 1611010990470846252L;

                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* renamed from: ﾇ */
                public final void mo5973(jd jdVar) {
                    int m8131;
                    String m8132;
                    Object obj;
                    int i6 = 2 % 2;
                    try {
                        m8131 = jdVar.m8128().m8131();
                        m8132 = jdVar.m8128().m8132();
                        obj = null;
                    } catch (Exception e2) {
                        kl.m8448(m6108((char) TextUtils.indexOf("", "", 0, 0), 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 12 - View.getDefaultSize(0, 0)).intern(), m6108((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC4, ImageFormat.getBitsPerPixel(0) + 33).intern(), e2, false, true);
                    }
                    if (m8131 >= 200 && m8131 <= 299) {
                        JSONObject m8129 = jdVar.m8129();
                        if (m8129.optBoolean(m6108((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), ViewConfiguration.getScrollBarFadeDuration() >> 16, 2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                            int i7 = f406 + 107;
                            f405 = i7 % 128;
                            if (i7 % 2 != 0) {
                                s.m8592().m8614();
                                super.hashCode();
                                throw null;
                            }
                            s.m8592().m8614();
                        }
                        m.m8528(m6108((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (Process.myPid() >> 22) + 3, 11 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m6106("\ue83b䱈\ue868鬑狽\udcc6\udc14姳듮翧禆㹆儮\udca8ᔩ\ue289︋ꄆ뛰䟣骞\u05cd厓\u2435✯\ueaf4བ袏쑵佢꣬淗惑", (Process.getThreadPriority(0) + 20) >> 6).intern(), m8129);
                        JSONObject m8417 = kj.m8417(m8129);
                        e.this.m6104(m8417.optLong(m6108((char) (Process.myTid() >> 22), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 4 - Color.alpha(0)).intern(), 0L));
                        m8417.remove(m6106("Ⰲ\ue3f9ⱱ㒡ꬵԞ\ueef9", Drawable.resolveOpacity(0, 0)).intern());
                        e.m6093(e.this).m8230(m6106("걕恩갧뜦砭혚ퟳ则\uf083叜獂㗩ᕖ\uf084ῶ\ue97f먠", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m8417.toString(), null);
                        m8129.put(m6106("\ude40鲗\ude34䯈끿䬳", TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern(), ke.m8357());
                        m8129.put(m6106("ꦺ\uf7ffꧏ₧鞗亩", TextUtils.getOffsetAfter("", 0)).intern(), ke.m8359());
                        e.m6100(m8129, jdVar.m8127());
                        e.this.mo6078(m8129);
                        e.m6090(e.this);
                        m6107(e.this.m6103());
                        return;
                    }
                    mo5974(jdVar, m8132);
                    int i8 = f405 + 51;
                    f406 = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
                
                    r8 = r8.m8128().m8131();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0015, code lost:
                
                    if (r8 != null) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
                
                    if (r8 != null) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
                
                    r8 = -1;
                 */
                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* renamed from: ﾒ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void mo5974(jd jdVar, String str) {
                    int m8131;
                    int i6 = 2 % 2;
                    int i7 = f405 + 67;
                    f406 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 33 / 0;
                    }
                    m.m8523(m6108((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12).intern(), new StringBuilder().append(m6108((char) (38437 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 51 - View.MeasureSpec.getMode(0), 34 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()).append(m8131).toString());
                    if (m8131 != 403) {
                        int i9 = f405 + 107;
                        f406 = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 73 / 0;
                            if (e.m6086(e.this) >= e.m6084(e.this)) {
                                return;
                            }
                        } else if (e.m6086(e.this) >= e.m6084(e.this)) {
                            return;
                        }
                        m6107(e.this.m6101());
                    }
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private void m6107(int i6) {
                    synchronized (e.this) {
                        if (e.m6087(e.this) != null) {
                            p.m8553(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.5.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() {
                                    e.this.mo6072(context, asVar, false);
                                }
                            }, i6);
                        }
                    }
                }

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static String m6108(char c, int i6, int i7) {
                    String str;
                    synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1197) {
                        char[] cArr = new char[i7];
                        com.ironsource.adqualitysdk.sdk.i.c.f1198 = 0;
                        while (com.ironsource.adqualitysdk.sdk.i.c.f1198 < i7) {
                            cArr[com.ironsource.adqualitysdk.sdk.i.c.f1198] = (char) ((f409[com.ironsource.adqualitysdk.sdk.i.c.f1198 + i6] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1198 * f408)) ^ c);
                            com.ironsource.adqualitysdk.sdk.i.c.f1198++;
                        }
                        str = new String(cArr);
                    }
                    return str;
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m6106(String str, int i6) {
                    String str2;
                    char[] cArr = str;
                    if (str != null) {
                        cArr = str.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (g.f2155) {
                        char[] m7785 = g.m7785(f407, cArr2, i6);
                        g.f2157 = 4;
                        while (g.f2157 < m7785.length) {
                            g.f2156 = g.f2157 - 4;
                            m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f407));
                            g.f2157++;
                        }
                        str2 = new String(m7785, 4, m7785.length - 4);
                    }
                    return str2;
                }
            });
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﻛ */
        public final void mo6065(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f373 + 13;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            mo6078(jSONObject);
            m6083();
            int i4 = f373 + 101;
            f374 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* renamed from: Ⅽ, reason: contains not printable characters */
        private synchronized void m6083() {
            int i = 2 % 2;
            int i2 = f374 + 55;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = this.f390;
            if (handler != null) {
                handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        e.this.m6105(true);
                        if (e.m6085(e.this) != null) {
                            e.m6085(e.this).mo5878();
                        }
                        Iterator it = new ArrayList(e.m6095(e.this)).iterator();
                        while (it.hasNext()) {
                            ((ax) it.next()).mo5878();
                        }
                        e.m6095(e.this).clear();
                        Iterator it2 = new ArrayList(e.m6098(e.this)).iterator();
                        while (it2.hasNext()) {
                            ((ax) it2.next()).mo5878();
                        }
                    }
                });
            }
            int i4 = f373 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f374 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾇ */
        public final void mo6067(final ax axVar) {
            int i = 2 % 2;
            int i2 = f374 + 67;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = this.f390;
            if (handler != null) {
                handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        e.m6098(e.this).add(axVar);
                        if (e.this.mo6060()) {
                            axVar.mo5878();
                        }
                    }
                });
                int i4 = f374 + 7;
                f373 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾒ */
        public final void mo6073(final ax axVar) {
            int i = 2 % 2;
            int i2 = f374 + 75;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            Handler handler = this.f390;
            if (handler != null) {
                handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        if (e.this.mo6060()) {
                            axVar.mo5878();
                        } else {
                            e.m6095(e.this).add(axVar);
                        }
                    }
                });
                int i4 = f374 + 35;
                f373 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﻛ */
        public final void mo6064(final ax axVar) {
            int i = 2 % 2;
            int i2 = f374 + 15;
            f373 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            Handler handler = this.f390;
            if (handler != null) {
                handler.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        e.m6096(e.this, axVar);
                        if (e.this.mo6060()) {
                            axVar.mo5878();
                        }
                    }
                });
            }
            int i3 = f374 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f373 = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾒ */
        public final boolean mo6074() {
            int i = 2 % 2;
            int i2 = f373 + 77;
            f374 = i2 % 128;
            boolean optBoolean = i2 % 2 != 0 ? m6075().optBoolean(m6089(KeyEvent.getDeadChar(0, 1) * 2, true, (ViewConfiguration.getDoubleTapTimeout() >>> 26) * TypedValues.Custom.TYPE_INT, "\ufffb￼\t", 5 / MotionEvent.axisFromString("")).intern(), true) : m6075().optBoolean(m6089(3 - KeyEvent.getDeadChar(0, 0), false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 191, "\ufffb￼\t", 2 - MotionEvent.axisFromString("")).intern(), false);
            int i3 = f373 + 53;
            f374 = i3 % 128;
            int i4 = i3 % 2;
            return optBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﻏ */
        public final double mo6061() {
            int i = 2 % 2;
            int i2 = f373 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            double optDouble = m6075().optDouble(m6097("\u0000\u0001\u0001", new int[]{77, 3, 0, 0}, true).intern(), 5.0d);
            int i4 = f373 + 97;
            f374 = i4 % 128;
            if (i4 % 2 == 0) {
                return optDouble;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﮐ */
        public final double mo6057() {
            int i = 2 % 2;
            int i2 = f373 + 99;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            double optDouble = m6075().optDouble(m6097((String) null, new int[]{8, 4, 126, 4}, true).intern(), 1.0d);
            int i4 = f373 + 43;
            f374 = i4 % 128;
            if (i4 % 2 == 0) {
                return optDouble;
            }
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﱟ */
        public final int mo6058() {
            aw m6076;
            int i;
            int i2 = 2 % 2;
            int i3 = f374 + 95;
            f373 = i3 % 128;
            if (i3 % 2 == 0) {
                m6076 = m6076();
                if (m6076 == null) {
                    i = 28847;
                }
                i = m6076.m6230();
            } else {
                m6076 = m6076();
                if (m6076 == null) {
                    i = 3000;
                }
                i = m6076.m6230();
            }
            int i4 = f374 + 73;
            f373 = i4 % 128;
            int i5 = i4 % 2;
            return i;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: טּ */
        public final int mo6049() {
            JSONObject m6075;
            String m6097;
            int i = 2 % 2;
            int i2 = f373 + 19;
            f374 = i2 % 128;
            if (i2 % 2 != 0) {
                m6075 = m6075();
                m6097 = m6097("\u0000\u0000\u0001\u0000", new int[]{0, 4, 0, 0}, false);
            } else {
                m6075 = m6075();
                m6097 = m6097("\u0000\u0000\u0001\u0000", new int[]{0, 4, 0, 0}, true);
            }
            int optInt = m6075.optInt(m6097.intern(), this.f393);
            int i3 = f373 + 29;
            f374 = i3 % 128;
            int i4 = i3 % 2;
            return optInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: סּ */
        public final int mo6050() {
            JSONObject m6075;
            String m6097;
            int i = 2 % 2;
            int i2 = f374 + 53;
            f373 = i2 % 128;
            if (i2 % 2 == 0) {
                m6075 = m6075();
                m6097 = m6097("\u0000\u0000\u0001\u0000", new int[]{4, 4, 181, 0}, true);
            } else {
                m6075 = m6075();
                m6097 = m6097("\u0000\u0000\u0001\u0000", new int[]{4, 4, 181, 0}, false);
            }
            return m6075.optInt(m6097.intern(), this.f395);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾇ */
        public final boolean mo6069() {
            int i = 2 % 2;
            int i2 = f374 + 97;
            f373 = i2 % 128;
            return i2 % 2 == 0 ? m6075().optBoolean(m6089((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) * 3, false, Color.rgb(0, 1, 0) - 16777026, "\t\ufffb￼", 5 - (ViewConfiguration.getJumpTapTimeout() - 84)).intern(), false) : m6075().optBoolean(m6089((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, false, (-16777026) - Color.rgb(0, 0, 0), "\t\ufffb￼", (ViewConfiguration.getJumpTapTimeout() >> 16) + 3).intern(), true);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﻐ */
        public final boolean mo6062() {
            int i = 2 % 2;
            int i2 = f373 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f374 = i2 % 128;
            return i2 % 2 != 0 ? m6075().optBoolean(m6097("\u0000\u0000\u0001\u0000", new int[]{80, 4, 0, 0}, true).intern(), false) : m6075().optBoolean(m6097("\u0000\u0000\u0001\u0000", new int[]{80, 4, 0, 0}, false).intern(), true);
        }

        /* renamed from: っ, reason: contains not printable characters */
        public final int m6101() {
            int i = 2 % 2;
            int i2 = f373 + 75;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            int optInt = m6075().optInt(m6097("\u0000\u0000\u0001", new int[]{84, 3, 0, 2}, false).intern(), this.f394);
            int i4 = f373 + 69;
            f374 = i4 % 128;
            if (i4 % 2 == 0) {
                return optInt;
            }
            throw null;
        }

        /* renamed from: ゥ, reason: contains not printable characters */
        public final int m6103() {
            JSONObject m6075;
            String m6089;
            int i = 2 % 2;
            int i2 = f374 + 83;
            f373 = i2 % 128;
            if (i2 % 2 == 0) {
                m6075 = m6075();
                m6089 = m6089(4 % (ViewConfiguration.getScrollDefaultDelay() << Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), true, 16750 % Color.red(0), "\ufffb\f\ufff9", 1 >> (ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)));
            } else {
                m6075 = m6075();
                m6089 = m6089((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, true, 189 - Color.red(0), "\ufffb\f\ufff9", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1);
            }
            int optInt = m6075.optInt(m6089.intern(), this.f397);
            int i3 = f373 + 103;
            f374 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 19 / 0;
            }
            return optInt;
        }

        /* renamed from: K, reason: contains not printable characters */
        private int m6082() {
            JSONObject m6075;
            String intern;
            int i;
            int i2 = 2 % 2;
            int i3 = f374 + 105;
            f373 = i3 % 128;
            if (i3 % 2 == 0) {
                m6075 = m6075();
                intern = m6097("\u0001\u0000\u0001\u0000", new int[]{87, 4, 0, 2}, false).intern();
                i = 5;
            } else {
                m6075 = m6075();
                intern = m6097("\u0001\u0000\u0001\u0000", new int[]{87, 4, 0, 2}, true).intern();
                i = 3;
            }
            int optInt = m6075.optInt(intern, i);
            int i4 = f373 + 45;
            f374 = i4 % 128;
            int i5 = i4 % 2;
            return optInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﻛ */
        public final Map<String, au> mo6063() {
            int i = 2 % 2;
            HashMap hashMap = new HashMap();
            try {
                String optString = m6075().optString(m6089(3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), true, Drawable.resolveOpacity(0, 0) + PsExtractor.PRIVATE_STREAM_1, "\ufffb￼\u000b", 2 - TextUtils.getCapsMode("", 0, 0)).intern());
                if (!TextUtils.isEmpty(optString)) {
                    Map<String, au> m8424 = kj.m8424(IronSourceNetworkBridge.jsonObjectInit(optString), new kj.a<au>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.e.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                        /* renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ au mo6109(JSONObject jSONObject, String str) {
                            return new au(jSONObject.optJSONObject(str));
                        }
                    });
                    int i2 = f374 + 79;
                    f373 = i2 % 128;
                    int i3 = i2 % 2;
                    return m8424;
                }
            } catch (JSONException e) {
                kl.m8458(m6089(12 - TextUtils.getOffsetAfter("", 0), true, ExpandableListView.getPackedPositionChild(0L) + 187, "\u0004\u0001\t\n\uffde\u0000\u000f\n\b\u0000￭\u0002", TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern(), m6097("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{91, 31, 0, 27}, false).intern(), (Throwable) e, false);
            }
            return hashMap;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾇ */
        public final boolean mo6070(String str, String str2) {
            int i = 2 % 2;
            au m6092 = m6092(str);
            if (m6092 != null) {
                int i2 = f374 + 71;
                f373 = i2 % 128;
                int i3 = i2 % 2;
                if (m6092.m6141(str2)) {
                    return false;
                }
            }
            int i4 = f374 + 103;
            f373 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﾒ */
        public final String mo6071(String str) {
            int i = 2 % 2;
            int i2 = f374 + 33;
            f373 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                au m6092 = m6092(str);
                if (m6092 == null) {
                    return null;
                }
                int i3 = f373 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f374 = i3 % 128;
                if (i3 % 2 == 0) {
                    return m6092.m6140();
                }
                m6092.m6140();
                throw null;
            }
            m6092(str);
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static void m6091(JSONObject jSONObject, long j) {
            int i = 2 % 2;
            int i2 = f374 + 49;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            if (jSONObject.has(m6097("\u0000\u0001\u0000", new int[]{Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 3, 0, 2}, false).intern())) {
                int i4 = f373 + 61;
                f374 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    jSONObject.put(m6097("\u0000\u0001\u0000", new int[]{Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 3, 0, 2}, false).intern(), jSONObject.optLong(m6097("\u0000\u0001\u0000", new int[]{Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 3, 0, 2}, false).intern()) + (j / 2));
                } catch (JSONException unused) {
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﮌ */
        public final String mo6056() {
            int i = 2 % 2;
            int i2 = f374 + 97;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            String optString = m6075().optString(m6089(3 - (ViewConfiguration.getJumpTapTimeout() >> 16), false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 194, "\u0001\t\ufff8", KeyEvent.getDeadChar(0, 0) + 2).intern());
            int i4 = f373 + 61;
            f374 = i4 % 128;
            int i5 = i4 % 2;
            return optString;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        
            if (r6.f381 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
        
            if (r6.f381 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            r6.f381 = com.ironsource.adqualitysdk.sdk.i.kj.m8423(m6075().optJSONArray(m6097("\u0000\u0000\u0000\u0001", new int[]{12, 4, 0, 3}, false).intern()), new com.ironsource.adqualitysdk.sdk.i.ar.e.AnonymousClass7());
            r1 = com.ironsource.adqualitysdk.sdk.i.ar.e.f373 + 67;
            com.ironsource.adqualitysdk.sdk.i.ar.e.f374 = r1 % 128;
            r1 = r1 % 2;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: リ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List mo6042() {
            int i = 2 % 2;
            int i2 = f374 + 15;
            f373 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
            return this.f381;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ヶ */
        public final boolean mo6044() {
            int i = 2 % 2;
            int i2 = f373 + 99;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            boolean optBoolean = m6075().optBoolean(m6097("\u0001\u0000\u0001\u0000", new int[]{16, 4, 75, 0}, true).intern());
            int i4 = f374 + 63;
            f373 = i4 % 128;
            if (i4 % 2 != 0) {
                return optBoolean;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ヮ */
        public final int mo6043() {
            int optInt;
            synchronized (this) {
                optInt = m6075().optInt(m6089(TextUtils.lastIndexOf("", '0', 0) + 4, true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 191, "\u0001\b\ufff9", 2 - Color.argb(0, 0, 0, 0)).intern(), 100);
            }
            return optInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ףּ */
        public final String mo6051() {
            int i = 2 % 2;
            int i2 = f374 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f373 = i2 % 128;
            int i3 = i2 % 2;
            if (m6075() != null) {
                String optString = m6075().optString(m6089(5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false, 192 - ExpandableListView.getPackedPositionChild(0L), "\ufff8\b\ufff8\b", TextUtils.indexOf("", "", 0) + 2).intern());
                return TextUtils.isEmpty(optString) ? m6076().m6231() : optString;
            }
            int i4 = f374 + 9;
            f373 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            if (m6076() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
        
            if (m6076() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        
            r1 = com.ironsource.adqualitysdk.sdk.i.ar.e.f373 + 105;
            com.ironsource.adqualitysdk.sdk.i.ar.e.f374 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            r1 = com.ironsource.adqualitysdk.sdk.i.ar.e.f373 + 87;
            com.ironsource.adqualitysdk.sdk.i.ar.e.f374 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        
            return m6076().m6229();
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: ﬤ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final JSONObject mo6048() {
            int i = 2 % 2;
            int i2 = f373 + 23;
            f374 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 86 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: 丫 */
        public final long mo6045() {
            String m8233;
            long j;
            int i = 2 % 2;
            int i2 = f374 + 89;
            f373 = i2 % 128;
            if (i2 % 2 == 0) {
                m8233 = this.f396.m8233(m6089(13 >> (ViewConfiguration.getTouchSlop() * 26), true, 29948 >>> Color.green(0), "\u0000\t\t\n\uffde\u000f\u000e￼\u0007\uffc9\f\uffff￼\uffc9\u0002\t\n\u0007\u000b\b￼\u000f\u000e\u0000\b\u0004\uffef\u0000\u000f￼\uffff\u000b\ufff0\r\n\u000f\ufffe", Color.green(0) * 32).intern());
                if (TextUtils.isEmpty(m8233)) {
                    j = 1;
                }
                j = Long.parseLong(m8233);
            } else {
                m8233 = this.f396.m8233(m6089(37 - (ViewConfiguration.getTouchSlop() >> 8), true, Color.green(0) + 186, "\u0000\t\t\n\uffde\u000f\u000e￼\u0007\uffc9\f\uffff￼\uffc9\u0002\t\n\u0007\u000b\b￼\u000f\u000e\u0000\b\u0004\uffef\u0000\u000f￼\uffff\u000b\ufff0\r\n\u000f\ufffe", Color.green(0) + 18).intern());
                if (TextUtils.isEmpty(m8233)) {
                    j = 0;
                }
                j = Long.parseLong(m8233);
            }
            int i3 = f374 + 109;
            f373 = i3 % 128;
            int i4 = i3 % 2;
            return j;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* renamed from: 乁 */
        public final boolean mo6046() {
            JSONObject m6075;
            String m6097;
            int i = 2 % 2;
            int i2 = f374 + 15;
            f373 = i2 % 128;
            if (i2 % 2 == 0) {
                m6075 = m6075();
                m6097 = m6097("\u0001\u0000\u0000\u0000", new int[]{20, 4, 0, 0}, false);
            } else {
                m6075 = m6075();
                m6097 = m6097("\u0001\u0000\u0000\u0000", new int[]{20, 4, 0, 0}, false);
            }
            return m6075.optBoolean(m6097.intern());
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final void m6104(long j) {
            int i = 2 % 2;
            if (this.f377) {
                return;
            }
            int i2 = f373 + 115;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            this.f396.m8229(m6089((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, true, 186 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0000\t\t\n\uffde\u000f\u000e￼\u0007\uffc9\f\uffff￼\uffc9\u0002\t\n\u0007\u000b\b￼\u000f\u000e\u0000\b\u0004\uffef\u0000\u000f￼\uffff\u000b\ufff0\r\n\u000f\ufffe", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18).intern(), String.valueOf(j));
            this.f377 = true;
            int i4 = f374 + 87;
            f373 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static boolean m6094(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f373 + 25;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            boolean has = jSONObject.has(m6097((String) null, new int[]{Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 6, 96, 2}, true).intern());
            int i4 = f374 + 47;
            f373 = i4 % 128;
            int i5 = i4 % 2;
            return has;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static void m6099(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = f373 + 107;
            f374 = i2 % 128;
            int i3 = i2 % 2;
            kj.m8425(jSONObject, jSONObject.optJSONObject(m6097((String) null, new int[]{Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 6, 96, 2}, true).intern()));
            int i4 = f374 + 95;
            f373 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private au m6092(String str) {
            int i = 2 % 2;
            if (str == null) {
                int i2 = f373 + 45;
                f374 = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i3 = f374 + 21;
            f373 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 1 / 0;
                return mo6063().get(str);
            }
            return mo6063().get(str);
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m6089(int i, boolean z, int i2, String str, int i3) {
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
                    cArr3[i4] = (char) (cArr3[i4] - f376);
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

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m6097(String str, int[] iArr, boolean z) {
            String str2;
            byte[] bArr = str;
            if (str != null) {
                bArr = str.getBytes(C.ISO88591_NAME);
            }
            byte[] bArr2 = bArr;
            synchronized (h.f2286) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f375, i, cArr, 0, i2);
                if (bArr2 != null) {
                    char[] cArr2 = new char[i2];
                    h.f2287 = 0;
                    char c = 0;
                    while (h.f2287 < i2) {
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
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    h.f2287 = 0;
                    while (h.f2287 < i2) {
                        cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                        h.f2287++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    h.f2287 = 0;
                    while (h.f2287 < i2) {
                        cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                        h.f2287++;
                    }
                }
                str2 = new String(cArr);
            }
            return str2;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ar$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private JSONObject f371;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private aw f372;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public synchronized void mo6078(JSONObject jSONObject) {
            this.f371 = jSONObject;
        }

        /* renamed from: く, reason: contains not printable characters */
        public final synchronized JSONObject m6075() {
            return this.f371;
        }

        /* renamed from: ト, reason: contains not printable characters */
        public final aw m6076() {
            return this.f372;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final void m6077(aw awVar) {
            this.f372 = awVar;
        }
    }
}
