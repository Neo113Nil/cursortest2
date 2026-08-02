package com.vk.clips.sdk.shared.upload.badge;

import android.content.Context;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.eef;
import xsna.fpf0;
import xsna.la0;
import xsna.nwy;
import xsna.pa;
import xsna.qcy;
import xsna.sdl;
import xsna.t9q0;
import xsna.u9q0;
import xsna.y9q0;

/* compiled from: UploadBadgeComponentImpl.kt */
/* loaded from: classes17.dex */
public abstract class UploadBadgeComponentImpl implements UploadBadgeComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new la0(24));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(UploadBadgeComponentImpl.class, "hiddenUploadIds", "getHiddenUploadIds()Ljava/util/concurrent/ConcurrentHashMap;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public abstract sdl Df();

    public abstract pa Ef();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.sdk.shared.upload.badge.UploadBadgeComponent
    public final y9q0 S5(t9q0 t9q0Var, Context context) {
        eef Zb = ((ClipsUploadSdkUploaderComponent) Ef().c).Zb();
        qcy<Object> qcyVar = b[0];
        return new y9q0(context, new u9q0(t9q0Var, Zb, (ConcurrentHashMap) this.a.c()), Df());
    }
}
