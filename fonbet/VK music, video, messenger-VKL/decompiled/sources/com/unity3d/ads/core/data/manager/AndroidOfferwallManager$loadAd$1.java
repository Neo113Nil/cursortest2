package com.unity3d.ads.core.data.manager;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidOfferwallManager.kt */
@b6l(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", l = {29}, m = "loadAd")
/* loaded from: classes14.dex */
public final class AndroidOfferwallManager$loadAd$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidOfferwallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$loadAd$1(AndroidOfferwallManager androidOfferwallManager, spj<? super AndroidOfferwallManager$loadAd$1> spjVar) {
        super(spjVar);
        this.this$0 = androidOfferwallManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadAd(null, this);
    }
}
