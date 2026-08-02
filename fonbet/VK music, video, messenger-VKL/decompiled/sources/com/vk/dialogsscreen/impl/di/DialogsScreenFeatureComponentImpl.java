package com.vk.dialogsscreen.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c13;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.k55;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qqm;

/* compiled from: DialogsScreenFeatureComponentImpl.kt */
/* loaded from: classes.dex */
public final class DialogsScreenFeatureComponentImpl implements DialogsScreenFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new c13(this, 5));

    /* compiled from: DialogsScreenFeatureComponentImpl.kt */
    public static final class a implements c8m<DialogsScreenFeatureComponent, pwj0> {
        public final k55 a;

        public a(k55 k55Var) {
            this.a = k55Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DialogsScreenFeatureComponentImpl(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DialogsScreenFeatureComponentImpl.class, "dialogsFragmentProvider", "getDialogsFragmentProvider()Lcom/vk/dialogsscreen/api/DialogsFragmentProvider;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public DialogsScreenFeatureComponentImpl(k55 k55Var) {
    }

    @Override // com.vk.dialogsscreen.api.DialogsScreenFeatureComponent
    public final qqm g7() {
        qcy<Object> qcyVar = b[0];
        return (qqm) this.a.c();
    }
}
