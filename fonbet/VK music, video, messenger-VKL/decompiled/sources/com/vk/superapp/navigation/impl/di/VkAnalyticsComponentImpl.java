package com.vk.superapp.navigation.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.superapp.navigation.api.di.VkAnalyticsComponent;
import com.vk.superapp.navigation.api.di.c;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.qqf0;

/* compiled from: VkAnalyticsComponentImpl.kt */
/* loaded from: classes6.dex */
public final class VkAnalyticsComponentImpl implements VkAnalyticsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new qqf0(5));

    /* compiled from: VkAnalyticsComponentImpl.kt */
    public static final class a implements b7m<VkAnalyticsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VkAnalyticsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkAnalyticsComponentImpl.class, "analyticsFactory", "getAnalyticsFactory()Lcom/vk/superapp/navigation/api/di/VkAnalyticsFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.navigation.api.di.VkAnalyticsComponent
    public final c qc() {
        qcy<Object> qcyVar = b[0];
        return (c) this.a.c();
    }
}
