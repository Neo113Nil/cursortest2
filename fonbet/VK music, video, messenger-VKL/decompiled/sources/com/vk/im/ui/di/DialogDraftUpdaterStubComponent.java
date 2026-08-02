package com.vk.im.ui.di;

import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.cdm;
import xsna.fpf0;
import xsna.nwy;
import xsna.pr1;
import xsna.qcy;

/* compiled from: DialogDraftUpdaterStubComponent.kt */
/* loaded from: classes2.dex */
public final class DialogDraftUpdaterStubComponent implements DialogDraftUpdaterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new pr1(17));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DialogDraftUpdaterStubComponent.class, "dialogDraftUpdater", "getDialogDraftUpdater()Lcom/vk/im/ui/components/viewcontrollers/msg_send/DialogDraftUpdater;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.ui.di.DialogDraftUpdaterComponent
    public final cdm V1() {
        qcy<Object> qcyVar = b[0];
        return (cdm) this.a.c();
    }
}
