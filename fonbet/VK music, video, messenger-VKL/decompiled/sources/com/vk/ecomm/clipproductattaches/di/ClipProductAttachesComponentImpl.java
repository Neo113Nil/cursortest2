package com.vk.ecomm.clipproductattaches.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.f24;
import xsna.fpf0;
import xsna.mid0;
import xsna.qcy;
import xsna.rad;
import xsna.tj2;

/* compiled from: ClipProductAttachesComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ClipProductAttachesComponentImpl implements ClipProductAttachesComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new tj2(3));

    /* compiled from: ClipProductAttachesComponentImpl.kt */
    public static final class a implements b7m<ClipProductAttachesComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipProductAttachesComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipProductAttachesComponentImpl.class, "clipProductAttachesHolderFactory", "getClipProductAttachesHolderFactory()Lcom/vk/ecomm/clipproductattaches/di/ClipProductAttachesHolderFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.clipproductattaches.di.ClipProductAttachesComponent
    public final mid0 C0(Context context, boolean z, f24 f24Var) {
        qcy<Object> qcyVar = b[0];
        return ((rad) this.a.c()).a(context, z, f24Var);
    }
}
