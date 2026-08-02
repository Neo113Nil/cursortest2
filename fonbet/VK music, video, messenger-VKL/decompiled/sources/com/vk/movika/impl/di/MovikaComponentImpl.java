package com.vk.movika.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.api.MovikaComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.ccx;
import xsna.e7m;
import xsna.ecm;
import xsna.ecx;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: MovikaComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MovikaComponentImpl implements MovikaComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final VideoRestrictedUserActionsComponent a;
    public final nwy b = new nwy(new ecm(this, 26));

    /* compiled from: MovikaComponentImpl.kt */
    public static final class a implements b7m<MovikaComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MovikaComponentImpl((VideoRestrictedUserActionsComponent) e7mVar.a(fpf0.a(VideoRestrictedUserActionsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MovikaComponentImpl.class, "interactiveVideoFactory", "getInteractiveVideoFactory()Lcom/vk/movika/api/InteractiveVideoFactory;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public MovikaComponentImpl(VideoRestrictedUserActionsComponent videoRestrictedUserActionsComponent) {
        this.a = videoRestrictedUserActionsComponent;
    }

    @Override // com.vk.movika.api.MovikaComponent
    public final ecx U4() {
        qcy<Object> qcyVar = c[0];
        return (ecx) this.b.c();
    }

    @Override // com.vk.movika.api.MovikaComponent
    public final com.vk.movika.api.a pd() {
        return new ccx();
    }
}
