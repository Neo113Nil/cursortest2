package com.vk.clips.precache.impl.di;

import com.vk.clips.precache.api.di.ClipsPrecacheRecyclerComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.sie;
import xsna.zq3;

/* compiled from: ClipsPrecacheRecyclerComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsPrecacheRecyclerComponentImpl implements ClipsPrecacheRecyclerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new zq3(9));

    /* compiled from: ClipsPrecacheRecyclerComponentImpl.kt */
    public static final class a implements b7m<ClipsPrecacheRecyclerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsPrecacheRecyclerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsPrecacheRecyclerComponentImpl.class, "clipsItemsCacheRecyclerListenerFactory", "getClipsItemsCacheRecyclerListenerFactory()Lcom/vk/clips/precache/api/recycler/ClipsItemsCacheRecyclerListenerFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.clips.precache.api.di.ClipsPrecacheRecyclerComponent
    public final sie t2() {
        qcy<Object> qcyVar = b[0];
        return (sie) this.a.c();
    }
}
