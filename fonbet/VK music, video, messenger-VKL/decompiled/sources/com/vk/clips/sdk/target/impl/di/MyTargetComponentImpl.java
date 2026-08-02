package com.vk.clips.sdk.target.impl.di;

import com.vk.clips.sdk.parcer.api.MyTargetComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.movika.sdk.android.defaultplayer.interactive.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cq50;
import xsna.da50;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.ms50;
import xsna.nly;
import xsna.nuj;
import xsna.nwy;
import xsna.qcy;
import xsna.vex;

/* compiled from: MyTargetComponentImpl.kt */
/* loaded from: classes17.dex */
public final class MyTargetComponentImpl implements MyTargetComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final nwy a;
    public final nwy b = new nwy(new nly(this, 15));
    public final nwy c = new nwy(new da50(this, 1));
    public final nwy d = new nwy(new nuj(this, 27));
    public final nwy e = new nwy(new b(22));

    /* compiled from: MyTargetComponentImpl.kt */
    public static final class a implements b7m<MyTargetComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MyTargetComponentImpl((AppContextDiComponent) e7mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MyTargetComponentImpl.class, "internalNativeAdFactory", "getInternalNativeAdFactory()Lcom/my/target/internal/api/InternalNativeAdFactory;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, MyTargetComponentImpl.class, "internalNativeAdParser", "getInternalNativeAdParser()Lcom/my/target/internal/api/internalnativead/InternalNativeAdParser;", hpf0Var), ep.a(0, MyTargetComponentImpl.class, "internalNativeAdControllerFactory", "getInternalNativeAdControllerFactory()Lcom/my/target/internal/api/internalnativead/InternalNativeAdControllerFactory;", hpf0Var), ep.a(0, MyTargetComponentImpl.class, "myTargetParcer", "getMyTargetParcer()Lcom/vk/clips/sdk/parcer/api/MyTargetParcer;", hpf0Var), ep.a(0, MyTargetComponentImpl.class, "myTargetFeedItemBuilder", "getMyTargetFeedItemBuilder()Lcom/vk/clips/sdk/parcer/api/builder/MyTargetFeedItemBuilder;", hpf0Var)};
    }

    public MyTargetComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.a = new nwy(new vex(appContextDiComponent, 9));
    }

    @Override // com.vk.clips.sdk.parcer.api.MyTargetComponent
    public final ms50 X0() {
        qcy<Object> qcyVar = f[3];
        return (ms50) this.d.c();
    }

    @Override // com.vk.clips.sdk.parcer.api.MyTargetComponent
    public final cq50 ta() {
        qcy<Object> qcyVar = f[4];
        return (cq50) this.e.c();
    }
}
