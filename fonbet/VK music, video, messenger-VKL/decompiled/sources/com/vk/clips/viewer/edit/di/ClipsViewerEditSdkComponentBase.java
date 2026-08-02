package com.vk.clips.viewer.edit.di;

import com.vk.clips.viewer.edit.api.di.ClipViewerEditSdkComponent;
import defpackage.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fpf0;
import xsna.fsk0;
import xsna.nwy;
import xsna.qcy;
import xsna.xtc;

/* compiled from: ClipsViewerEditSdkComponentBase.kt */
/* loaded from: classes17.dex */
public abstract class ClipsViewerEditSdkComponentBase implements ClipViewerEditSdkComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new i(this, 29));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsViewerEditSdkComponentBase.class, "router", "getRouter()Lcom/vk/clips/viewer/edit/api/router/ClipEditSdkRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public abstract fsk0 Df();

    @Override // com.vk.clips.viewer.edit.api.di.ClipViewerEditSdkComponent
    public final xtc a() {
        qcy<Object> qcyVar = b[0];
        return (xtc) this.a.c();
    }
}
