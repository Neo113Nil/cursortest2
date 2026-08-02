package com.unity3d.ads.core.domain.events;

import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import defpackage.dt8;
import defpackage.lt8;
import defpackage.ot8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class MaxAdRevenueObserver$invoke$1$proxy$1 implements CommunicatorSubscriberProxy.CommunicatorMessageListener, lt8 {
    final /* synthetic */ MaxAdRevenueListener $tmp0;

    public MaxAdRevenueObserver$invoke$1$proxy$1(MaxAdRevenueListener maxAdRevenueListener) {
        this.$tmp0 = maxAdRevenueListener;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CommunicatorSubscriberProxy.CommunicatorMessageListener) && (obj instanceof lt8)) {
            return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        return new ot8(1, 0, MaxAdRevenueListener.class, this.$tmp0, "onMessageReceived", "onMessageReceived(Landroid/os/Bundle;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.unity3d.services.core.reflection.CommunicatorSubscriberProxy.CommunicatorMessageListener
    public final void onMessageReceived(Bundle bundle) {
        bundle.getClass();
        this.$tmp0.onMessageReceived(bundle);
    }
}
