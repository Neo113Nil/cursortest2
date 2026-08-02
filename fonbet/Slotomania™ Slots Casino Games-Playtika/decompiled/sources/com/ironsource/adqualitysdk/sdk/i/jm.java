package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.TypedValue;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public class jm {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2815 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2816 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f2817 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2818 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2819 = {187, 213, 233, 198, 209, 220, 229, 195, 228, 223, 226, Typography.times, 158, 227, 224, 212};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Handler f2820 = null;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2821 = 112;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private io f2822;

    public interface d {
        /* renamed from: ﾒ, reason: contains not printable characters */
        void mo8237();
    }

    public interface e {
        /* renamed from: ﻐ, reason: contains not printable characters */
        void mo8238(String str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8226(jm jmVar, d dVar) {
        int i = 2 % 2;
        int i2 = f2816 + 69;
        f2815 = i2 % 128;
        int i3 = i2 % 2;
        jmVar.m8223(dVar);
        int i4 = f2815 + 105;
        f2816 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Handler m8222() {
        Handler handler;
        synchronized (jm.class) {
            if (f2820 == null) {
                HandlerThread handlerThread = new HandlerThread(m8224(null, TextUtils.getOffsetAfter("", 0) + 127, null, "\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                handlerThread.start();
                f2820 = new Handler(handlerThread.getLooper());
            }
            handler = f2820;
        }
        return handler;
    }

    public jm(Context context, String str, String str2) {
        this.f2822 = new io(context, str, str2);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m8231(String str) {
        int i = 2 % 2;
        int i2 = f2815 + 113;
        f2816 = i2 % 128;
        int i3 = i2 % 2;
        io ioVar = this.f2822;
        if (i3 == 0) {
            return ioVar.m8085(str);
        }
        ioVar.m8085(str);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m8234(String str, int i) {
        HashMap<String, String> m8082;
        int i2 = 2 % 2;
        int i3 = f2815 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2816 = i3 % 128;
        if (i3 % 2 != 0) {
            m8082 = this.f2822.m8082(str, i);
            int i4 = 11 / 0;
        } else {
            m8082 = this.f2822.m8082(str, i);
        }
        int i5 = f2815 + 29;
        f2816 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return m8082;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m8233(String str) {
        int i = 2 % 2;
        int i2 = f2815 + 71;
        f2816 = i2 % 128;
        int i3 = i2 % 2;
        io ioVar = this.f2822;
        if (i3 == 0) {
            return ioVar.m8081(str);
        }
        ioVar.m8081(str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8228(final String str, final e eVar) {
        int i = 2 % 2;
        m8222().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                final String m8233 = jm.this.m8233(str);
                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.1.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        eVar.mo8238(m8233);
                    }
                });
            }
        });
        int i2 = f2815 + 11;
        f2816 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8227(String str) {
        int i = 2 % 2;
        int i2 = f2815 + 101;
        f2816 = i2 % 128;
        int i3 = i2 % 2;
        this.f2822.m8083(str);
        int i4 = f2816 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2815 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8232(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2815 + 83;
        f2816 = i2 % 128;
        int i3 = i2 % 2;
        this.f2822.m8084(str, str2);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8229(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2815 + 33;
        f2816 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m8236(str, str2, null);
        if (i3 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8236(final String str, final String str2, final d dVar) {
        int i = 2 % 2;
        m8222().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                jm.this.m8232(str, str2);
                jm.m8226(jm.this, dVar);
            }
        });
        int i2 = f2815 + 37;
        f2816 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8235(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2815 + 53;
        f2816 = i2 % 128;
        if (i2 % 2 == 0) {
            m8232(str, str2);
            m8232(m8225(str), Long.toString(ke.m8357()));
            int i3 = f2816 + 49;
            f2815 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
                return;
            }
            return;
        }
        m8232(str, str2);
        m8232(m8225(str), Long.toString(ke.m8357()));
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8230(final String str, final String str2, final d dVar) {
        int i = 2 % 2;
        m8222().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                jm.this.m8235(str, str2);
                jm.m8226(jm.this, dVar);
            }
        });
        int i2 = f2816 + 1;
        f2815 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8225(String str) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(str).append(m8224(null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, "\u0082\u0089\u0085\u0090\u008f\u0087\u0089\u008e\u0085\u0086\u008d").intern()).toString();
        int i2 = f2816 + 73;
        f2815 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8223(d dVar) {
        int i = 2 % 2;
        if (dVar != null) {
            p.m8554(new je(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.jm.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                }
            });
            int i2 = f2816 + 97;
            f2815 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = f2816 + 33;
        f2815 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8224(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f2819;
            int i2 = f2821;
            if (f2817) {
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
            if (f2818) {
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
}
