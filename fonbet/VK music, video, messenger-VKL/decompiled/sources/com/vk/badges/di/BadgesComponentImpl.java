package com.vk.badges.di;

import com.vk.badges.api.di.BadgesComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.i13;
import xsna.nwy;
import xsna.oz5;
import xsna.qcy;

/* compiled from: BadgesComponentImpl.kt */
/* loaded from: classes15.dex */
public final class BadgesComponentImpl implements BadgesComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new i13(1));

    /* compiled from: BadgesComponentImpl.kt */
    public static final class a implements b7m<BadgesComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new BadgesComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BadgesComponentImpl.class, "badgesRouter", "getBadgesRouter()Lcom/vk/badges/api/BadgesRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.badges.api.di.BadgesComponent
    public final oz5 Kb() {
        qcy<Object> qcyVar = b[0];
        return (oz5) this.a.c();
    }
}
