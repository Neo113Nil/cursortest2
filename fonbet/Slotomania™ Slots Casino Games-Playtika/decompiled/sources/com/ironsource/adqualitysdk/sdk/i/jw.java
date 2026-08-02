package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.kj;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class jw {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static jw f2926;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, e> f2927;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, e> f2929 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    private Handler f2928 = new Handler(Looper.getMainLooper());

    public enum e {
        f2939,
        f2936,
        f2937;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2933 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static long f2934 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2935 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2940;

        /* renamed from: ﾇ, reason: contains not printable characters */
        static void m8316() {
            f2940 = new char[]{'n', 52960, 40304, 5506, 56088, 34961, 48531, 29442, 3684, 49386, 37754, 26050, 'T', 52957, 40287, 27619, 14959, 2203, 55067, 42427, 29757, 17225, 4546, 57466, 44792, 32002, 19339, 6692, 59554, 64199, 13407, 26587, 37236, 49384, 61981, 11658, 24355, 36537, 47581, 60246, 6899, 21609, 34697, 45323, 57533, 4662, 19902, 31966, 44614, 55804, 2940};
            f2934 = 298594857175731855L;
        }

        public static e valueOf(String str) {
            int i = 2 % 2;
            int i2 = f2933 + 29;
            f2935 = i2 % 128;
            int i3 = i2 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = f2933 + 107;
            f2935 = i4 % 128;
            int i5 = i4 % 2;
            return eVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f2933 + 3;
            f2935 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                super.hashCode();
                throw null;
            }
            e[] eVarArr = (e[]) values().clone();
            int i3 = f2935 + 101;
            f2933 = i3 % 128;
            if (i3 % 2 == 0) {
                return eVarArr;
            }
            super.hashCode();
            throw null;
        }

        static {
            m8316();
            int i = f2933 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f2935 = i % 128;
            if (i % 2 == 0) {
                int i2 = 17 / 0;
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static e m8317(String str) {
            int i = 2 % 2;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int i2 = f2933 + 53;
            f2935 = i2 % 128;
            int i3 = i2 % 2;
            int hashCode = str.hashCode();
            char c = 0;
            if (hashCode == 3642) {
                if (str.equals(m8318((char) (48609 - (Process.myTid() >> 22)), 6 - (Process.myTid() >> 22), 2 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    int i4 = f2933;
                    int i5 = i4 + 83;
                    f2935 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 15;
                    f2935 = i7 % 128;
                    int i8 = i7 % 2;
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 96921) {
                if (hashCode == 109261 && str.equals(m8318((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionGroup(0L) + 3).intern())) {
                    int i9 = f2935;
                    int i10 = i9 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f2933 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 + 115;
                    f2933 = i12 % 128;
                    int i13 = i12 % 2;
                }
                c = 65535;
            } else {
                if (str.equals(m8318((char) (5603 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 3, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3).intern())) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                return f2939;
            }
            if (c == 1) {
                return f2936;
            }
            if (c != 2) {
                return null;
            }
            return f2937;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m8318(char c, int i, int i2) {
            String str;
            synchronized (c.f1197) {
                char[] cArr = new char[i2];
                c.f1198 = 0;
                while (c.f1198 < i2) {
                    cArr[c.f1198] = (char) ((f2940[c.f1198 + i] ^ (c.f1198 * f2934)) ^ c);
                    c.f1198++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jw m8308() {
        jw jwVar;
        synchronized (jw.class) {
            if (f2926 == null) {
                f2926 = new jw();
            }
            jwVar = f2926;
        }
        return jwVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m8315(final String str, final e eVar) {
        this.f2928.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                synchronized (jw.this) {
                    jw.this.f2929.put(str, eVar);
                }
            }
        });
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m8314(Activity activity) {
        return e.f2936 == m8311(activity);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m8313(Activity activity) {
        return e.f2937 == m8311(activity);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private synchronized e m8311(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m8309().containsKey(name)) {
                return m8309().get(name);
            }
            if (m8310().containsKey(name)) {
                return m8310().get(name);
            }
        }
        return e.m8317(ar.m6041().mo6051());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized Map<String, e> m8309() {
        return new HashMap(this.f2929);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized Map<String, e> m8310() {
        if (this.f2927 == null) {
            this.f2927 = new HashMap();
            JSONObject mo6048 = ar.m6041().mo6048();
            if (mo6048 != null) {
                this.f2927 = kj.m8424(mo6048, new kj.a<e>() { // from class: com.ironsource.adqualitysdk.sdk.i.jw.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                    /* renamed from: ﻛ */
                    public final /* synthetic */ e mo6109(JSONObject jSONObject, String str) {
                        return e.m8317(jSONObject.optString(str));
                    }
                });
            }
        }
        return this.f2927;
    }
}
