package com.unity3d.ads.adplayer;

import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidWebViewContainer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {SQLiteStatementType.STATEMENT_OTHER, 103, 105}, m = "loadUrl")
/* loaded from: classes14.dex */
public final class AndroidWebViewContainer$loadUrl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$loadUrl$1(AndroidWebViewContainer androidWebViewContainer, spj<? super AndroidWebViewContainer$loadUrl$1> spjVar) {
        super(spjVar);
        this.this$0 = androidWebViewContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadUrl(null, this);
    }
}
