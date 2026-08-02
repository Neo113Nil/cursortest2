package com.vk.design.demo.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.pr1;
import xsna.qcy;
import xsna.s3m;

/* compiled from: DesignDemoComponentImpl.kt */
/* loaded from: classes18.dex */
public final class DesignDemoComponentImpl implements DesignDemoComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final BridgeComponent a;
    public final nwy b = new nwy(new pr1(16));

    /* compiled from: DesignDemoComponentImpl.kt */
    public static final class a implements b7m<DesignDemoComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new DesignDemoComponentImpl((BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DesignDemoComponentImpl.class, "navigator", "getNavigator()Lcom/vk/design/demo/DesignDemoNavigator;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public DesignDemoComponentImpl(BridgeComponent bridgeComponent) {
        this.a = bridgeComponent;
    }

    @Override // com.vk.design.demo.di.DesignDemoComponent
    public final s3m f() {
        qcy<Object> qcyVar = c[0];
        return (s3m) this.b.c();
    }
}
