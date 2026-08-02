package com.vk.contactssync.impl.di;

import com.vk.bridges.di.ImBridgeComponent;
import com.vk.contactssync.api.di.ContactSyncColdStartModalComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dnh;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.q9j;
import xsna.qcy;

/* compiled from: ContactSyncColdStartModalComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ContactSyncColdStartModalComponentImpl implements ContactSyncColdStartModalComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final ImBridgeComponent a;
    public final nwy b = new nwy(new dnh(this, 7));

    /* compiled from: ContactSyncColdStartModalComponentImpl.kt */
    public static final class a implements c8m<ContactSyncColdStartModalComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ContactSyncColdStartModalComponentImpl((ImBridgeComponent) g8mVar.a(fpf0.a(ImBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ContactSyncColdStartModalComponentImpl.class, "modal", "getModal()Lcom/vk/contactssync/api/ContactSyncColdStartModal;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public ContactSyncColdStartModalComponentImpl(ImBridgeComponent imBridgeComponent) {
        this.a = imBridgeComponent;
    }

    @Override // com.vk.contactssync.api.di.ContactSyncColdStartModalComponent
    public final q9j Qd() {
        qcy<Object> qcyVar = c[0];
        return (q9j) this.b.c();
    }
}
