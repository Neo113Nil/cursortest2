package com.vk.photos.root.photoflow.presentation;

import com.vk.photos.root.photoflow.presentation.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: PhotoFlowReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements izs<h, l.b> {
    @Override // xsna.izs
    public final l.b invoke(h hVar) {
        h hVar2 = hVar;
        boolean a = ((g) this.receiver).e.a(hVar2.b);
        boolean z = hVar2.f;
        return new l.b(a, !z && hVar2.d, z, !hVar2.g.isEmpty());
    }
}
