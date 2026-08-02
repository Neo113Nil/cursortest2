package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Q2 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R2 f12769a;

    public Q2(R2 r22) {
        this.f12769a = r22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f12769a.f12797b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f12769a.getClass();
        BatteryInfo a7 = R2.a(intent);
        this.f12769a.f12797b = a7;
        if (chargeType != a7.chargeType) {
            this.f12769a.f12796a.execute(new P2(this, a7));
        }
    }
}
