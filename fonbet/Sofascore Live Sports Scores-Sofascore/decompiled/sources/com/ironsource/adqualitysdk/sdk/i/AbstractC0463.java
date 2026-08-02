package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ר, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0463 extends RuntimeException {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Throwable f1386;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC1131 f1387;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1388;

    public AbstractC0463(String str, AbstractC1131 abstractC1131, Throwable th) {
        this.f1388 = str;
        this.f1387 = abstractC1131;
        this.f1386 = th;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo136());
        sb.append(StringFog.decrypt("7EY=\n", "1mYD/fjEzfI=\n"));
        sb.append(this.f1388);
        sb.append('\n');
        sb.append(this.f1387);
        if (this.f1386 != null) {
            str = StringFog.decrypt("ElcwnYs2ejt6bWvI\n", "GBRR6PhTHhs=\n") + Log.getStackTraceString(this.f1386);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ﾒ */
    public abstract String mo136();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m277(String str) {
        AbstractC0962.m595(str, this.f1388, null, this);
    }
}
