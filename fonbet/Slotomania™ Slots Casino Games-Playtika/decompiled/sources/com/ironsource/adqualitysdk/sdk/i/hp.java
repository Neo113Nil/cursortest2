package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public final class hp extends hi<View.OnClickListener> implements View.OnClickListener {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2375 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2376 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2377 = 13250;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2378 = 5498;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2379 = 3923;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2380 = 15413;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private b f2381;

    public interface b {
        /* renamed from: ﾒ */
        void mo7409(hp hpVar, View view);
    }

    public hp(View.OnClickListener onClickListener, b bVar) {
        super(onClickListener);
        this.f2381 = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = f2375 + 113;
        f2376 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2381.mo7409(this, view);
                int i3 = 66 / 0;
            } else {
                this.f2381.mo7409(this, view);
            }
        } catch (Throwable th) {
            kl.m8458(m7843("誖农\udeac騱륻燔᷶稀햓㈿\udd54䄪刐犼\u1ff1怯袃喿亃瞖宵湵亃瞖", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24).intern(), m7843("륗佩ᆢ鏂爎俍慟淎㹦苁\uec0d똳몽₷२媜禘즥\udc0b᩹㨆哖榏ﻜ它樤ꐲ㍅", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28).intern(), th, false);
        }
        if (mo6363() != null) {
            int i4 = f2376 + 51;
            f2375 = i4 % 128;
            int i5 = i4 % 2;
            mo6363().onClick(view);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7843(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2378)) ^ ((c2 >>> 5) + f2377)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2380) ^ ((c3 + i2) ^ ((c3 << 4) + f2379))));
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
}
