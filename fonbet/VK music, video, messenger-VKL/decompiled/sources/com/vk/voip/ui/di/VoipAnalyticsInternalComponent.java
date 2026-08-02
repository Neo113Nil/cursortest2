package com.vk.voip.ui.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.kdw0;
import xsna.mdw0;
import xsna.nwy;
import xsna.ps0;
import xsna.qcy;

/* compiled from: VoipAnalyticsInternalComponent.kt */
/* loaded from: classes11.dex */
public final class VoipAnalyticsInternalComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new ps0(this, 15));

    /* compiled from: VoipAnalyticsInternalComponent.kt */
    public static final class a implements b7m<VoipAnalyticsInternalComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipAnalyticsInternalComponent();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipAnalyticsInternalComponent.class, "analyticsCollector", "getAnalyticsCollector$ui_release()Lcom/vk/voip/ui/prodstat/analytics/base/VoipAnalyticsDelegate;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public final kdw0<mdw0> Df() {
        qcy<Object> qcyVar = b[0];
        return (kdw0) this.a.c();
    }
}
