package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.SessionChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: classes14.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$9 extends FunctionReferenceImpl implements wzs<SessionChange, spj<? super s3q0>, Object> {
    public AndroidFullscreenWebViewAdPlayer$show$9(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // xsna.wzs
    public final Object invoke(SessionChange sessionChange, spj<? super s3q0> spjVar) {
        Object handleSessionChange;
        handleSessionChange = ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, spjVar);
        return handleSessionChange;
    }
}
