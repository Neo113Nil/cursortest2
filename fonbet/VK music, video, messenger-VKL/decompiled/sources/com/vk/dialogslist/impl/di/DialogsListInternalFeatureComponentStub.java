package com.vk.dialogslist.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.jg0;
import xsna.m7p;
import xsna.nwy;
import xsna.qcy;

/* compiled from: DialogsListInternalFeatureComponentStub.kt */
/* loaded from: classes18.dex */
public final class DialogsListInternalFeatureComponentStub implements DialogsListInternalFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new jg0(14));

    /* compiled from: DialogsListInternalFeatureComponentStub.kt */
    public static final class a implements b7m<DialogsListInternalFeatureComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new DialogsListInternalFeatureComponentStub();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DialogsListInternalFeatureComponentStub.class, "eduSwitchAccountInfoFactory", "getEduSwitchAccountInfoFactory()Lcom/vk/dialogslist/impl/list/external/edu_switch_account/EduSwitchAccountInfoFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.dialogslist.impl.di.DialogsListInternalFeatureComponent
    public final m7p O5() {
        qcy<Object> qcyVar = b[0];
        return (m7p) this.a.c();
    }
}
