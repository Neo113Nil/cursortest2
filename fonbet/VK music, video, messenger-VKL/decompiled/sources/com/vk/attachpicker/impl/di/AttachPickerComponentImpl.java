package com.vk.attachpicker.impl.di;

import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.android.defaultplayer.interactive.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c44;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: AttachPickerComponentImpl.kt */
/* loaded from: classes15.dex */
public final class AttachPickerComponentImpl implements AttachPickerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new b(2));

    /* compiled from: AttachPickerComponentImpl.kt */
    public static final class a implements c8m<AttachPickerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AttachPickerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AttachPickerComponentImpl.class, "attachVideoFragmentFactory", "getAttachVideoFragmentFactory()Lcom/vk/attachpicker/di/AttachVideoFragmentFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.attachpicker.di.AttachPickerComponent
    public final c44 J4() {
        qcy<Object> qcyVar = b[0];
        return (c44) this.a.c();
    }
}
