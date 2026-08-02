package com.vk.photo.editor.ivm.filter;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: FilterStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore", f = "FilterStore.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "maybeGeneratePreview")
/* loaded from: classes4.dex */
public final class e extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.a(this.this$0, null, this);
    }
}
