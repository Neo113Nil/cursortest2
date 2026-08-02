package com.unity3d.ads.core.domain.events;

import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.g0t;
import xsna.xzs;

/* compiled from: MaxAdRevenueObserver.kt */
/* loaded from: classes14.dex */
public /* synthetic */ class MaxAdRevenueObserver$invoke$1$proxy$1 implements CommunicatorSubscriberProxy.CommunicatorMessageListener, g0t {
    final /* synthetic */ MaxAdRevenueListener $tmp0;

    public MaxAdRevenueObserver$invoke$1$proxy$1(MaxAdRevenueListener maxAdRevenueListener) {
        this.$tmp0 = maxAdRevenueListener;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CommunicatorSubscriberProxy.CommunicatorMessageListener) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, MaxAdRevenueListener.class, "onMessageReceived", "onMessageReceived(Landroid/os/Bundle;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.unity3d.services.core.reflection.CommunicatorSubscriberProxy.CommunicatorMessageListener
    public final void onMessageReceived(Bundle bundle) {
        this.$tmp0.onMessageReceived(bundle);
    }
}
