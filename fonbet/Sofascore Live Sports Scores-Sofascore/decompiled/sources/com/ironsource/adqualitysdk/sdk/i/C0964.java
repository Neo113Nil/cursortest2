package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0964 extends BroadcastReceiver {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0776 f3184;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f3185;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3186;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3187;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f3188;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3189;

    public C0964(C0776 c0776, C0499 c0499, C1102 c1102, C0950 c0950, List list, boolean z) {
        this.f3184 = c0776;
        this.f3189 = z;
        this.f3188 = c0499;
        this.f3187 = c0950;
        this.f3186 = c1102;
        this.f3185 = list;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (!this.f3189) {
                AbstractC1008.m611(new C0980(this, context, intent));
                return;
            }
            C0499 c0499 = this.f3188;
            C0950 c0950 = this.f3187;
            C1102 c1102 = this.f3186;
            ArrayList m437 = C0776.m437(this.f3184, this.f3185, new Object[]{this, context, intent});
            c0499.getClass();
            c0499.m325(c0950, c0950.f3165, c1102, m437);
        } catch (Throwable th) {
            AbstractC0356.m204(this.f3186.m651(), StringFog.decrypt("R/d4NlK6aMcix3g2Qf5iyHHxWDxD/2jfZ/cqME7paM1npQ==\n", "AoUKWSCaAak=\n") + this.f3188.f1614, th, false);
        }
    }
}
