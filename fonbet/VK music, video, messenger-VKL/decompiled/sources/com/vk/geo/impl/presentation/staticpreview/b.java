package com.vk.geo.impl.presentation.staticpreview;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: GeoStaticPreview.kt */
@b6l(c = "com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview", f = "GeoStaticPreview.kt", l = {471}, m = "prefetchIcon-4GVqg6g")
/* loaded from: classes2.dex */
public final class b extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GeoStaticPreview this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GeoStaticPreview geoStaticPreview, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = geoStaticPreview;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GeoStaticPreview.e(this.this$0, null, null, 0, null, this);
    }
}
