package com.vk.libvideo.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.di.WatchLaterComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qbe0;
import xsna.qcy;
import xsna.sbx0;

/* compiled from: WatchLaterComponentImpl.kt */
/* loaded from: classes14.dex */
public final class WatchLaterComponentImpl implements WatchLaterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new qbe0(15));

    /* compiled from: WatchLaterComponentImpl.kt */
    public static final class a implements b7m<WatchLaterComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new WatchLaterComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(WatchLaterComponentImpl.class, "navigator", "getNavigator()Lcom/vk/libvideo/impl/watchlater/WatchLaterNavigationImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.WatchLaterComponent
    public final sbx0 f() {
        qcy<Object> qcyVar = b[0];
        return (sbx0) this.a.c();
    }
}
