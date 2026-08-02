package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$subscribeOnPlaybackEvents$1", f = "CoreInteractivePlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c0 extends SuspendLambda implements wzs<PlaybackStateListener.PlaybackState, spj<? super s3q0>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(y yVar, spj<? super c0> spjVar) {
        super(2, spjVar);
        this.b = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        c0 c0Var = new c0(this.b, spjVar);
        c0Var.a = obj;
        return c0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(PlaybackStateListener.PlaybackState playbackState, spj<? super s3q0> spjVar) {
        return ((c0) create(playbackState, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        this.b.u((PlaybackStateListener.PlaybackState) this.a);
        return s3q0.a;
    }
}
