package com.vk.catalog2.common.ui.mvp.auto;

import android.content.Context;
import android.support.v4.media.MediaDescriptionCompat;
import com.vk.catalog2.common.ui.mvp.auto.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b22;
import xsna.izs;
import xsna.k8u0;
import xsna.q22;

/* compiled from: AndroidAutoPlaybackQueueManager.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements izs<b.a, MediaDescriptionCompat> {
    @Override // xsna.izs
    public final MediaDescriptionCompat invoke(b.a aVar) {
        b.a aVar2 = aVar;
        b bVar = (b) this.receiver;
        Context context = bVar.a;
        k8u0 k8u0Var = bVar.c;
        return b22.a(context, k8u0Var.a.serialize(new q22.c(aVar2.a.t(), true, aVar2.b)), true);
    }
}
