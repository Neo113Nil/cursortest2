package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC2606q0;
import com.ironsource.F0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2385dc extends AbstractC2606q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2385dc(C2588p0 adTools, C2403ec adUnitData, InterfaceC2421fc listener) {
        super(adTools, adUnitData, listener, null, 8, null);
        String format;
        int b;
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C2440gd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.b(adUnitData.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    @Override // com.ironsource.AbstractC2606q0
    protected E a() {
        return new E() { // from class: com.ironsource.dc$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c, I i) {
                B a;
                a = C2385dc.a(C2385dc.this, c, i);
                return a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(C2385dc this$0, C adInstanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new Vb(new V0(this$0.f(), F0.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC2606q0.a());
    }
}
