package com.vk.messagetemplates.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.messagetemplates.api.TemplatesComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.jkg0;
import xsna.qcy;

/* compiled from: TemplatesComponentImpl.kt */
/* loaded from: classes3.dex */
public final class TemplatesComponentImpl implements TemplatesComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new jkg0(5));

    /* compiled from: TemplatesComponentImpl.kt */
    public static final class a implements b7m<TemplatesComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new TemplatesComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(TemplatesComponentImpl.class, "keyboardFactory", "getKeyboardFactory()Lcom/vk/messagetemplates/api/TemplatesKeyboardFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.messagetemplates.api.TemplatesComponent
    public final com.vk.messagetemplates.api.a zf() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.messagetemplates.api.a) this.a.c();
    }
}
