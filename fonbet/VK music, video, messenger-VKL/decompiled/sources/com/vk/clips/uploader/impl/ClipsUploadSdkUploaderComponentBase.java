package com.vk.clips.uploader.impl;

import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import defpackage.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.eef;
import xsna.fp;
import xsna.fpf0;
import xsna.fsk0;
import xsna.nwy;
import xsna.pbf;
import xsna.qcy;
import xsna.z4f;

/* compiled from: ClipsUploadSdkUploaderComponentBase.kt */
/* loaded from: classes17.dex */
public abstract class ClipsUploadSdkUploaderComponentBase implements ClipsUploadSdkUploaderComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipsUploadSdkUploaderComponentBase.class, "uploadController", "getUploadController()Lcom/vk/clips/uploader/api/ClipsUploadController;", 0), fp.c(0, ClipsUploadSdkUploaderComponentBase.class, "apiRequestBuilder", "getApiRequestBuilder()Lcom/vk/clips/uploader/api/ClipsUploadApiRequestBuilder;", fpf0.a)};
    public final nwy a = new nwy(new f(this, 20));
    public final nwy b = new nwy(new z4f(this, 1));

    public abstract fsk0 Df();

    @Override // com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent
    public final eef Zb() {
        qcy<Object> qcyVar = c[0];
        return (eef) this.a.c();
    }

    @Override // com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent
    public final pbf k3() {
        qcy<Object> qcyVar = c[1];
        return (pbf) this.b.c();
    }
}
