package com.unity3d.ads.core.data.datasource;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource", f = "AndroidInstallReferrerDataSource.kt", l = {35}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidInstallReferrerDataSource$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInstallReferrerDataSource$invoke$1(AndroidInstallReferrerDataSource androidInstallReferrerDataSource, spj<? super AndroidInstallReferrerDataSource$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidInstallReferrerDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
