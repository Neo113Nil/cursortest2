package com.vk.superapp.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.j2;
import xsna.qcy;
import xsna.x0;

/* compiled from: AboutAppComponentImpl.kt */
/* loaded from: classes6.dex */
public final class AboutAppComponentImpl implements AboutAppComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new x0(0));

    /* compiled from: AboutAppComponentImpl.kt */
    public static final class a implements b7m<AboutAppComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new AboutAppComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AboutAppComponentImpl.class, "aboutAppRepository", "getAboutAppRepository()Lcom/vk/superapp/repository/AboutAppRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.di.AboutAppComponent
    public final j2 e6() {
        qcy<Object> qcyVar = b[0];
        return (j2) this.a.c();
    }
}
