package com.unity3d.ads.adplayer;

import defpackage.au3;
import defpackage.cu3;
import defpackage.ku3;
import defpackage.s9a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lku3;", "Lau3;", "defaultDispatcher", "Lcu3;", "sdkErrorHandler", "<init>", "(Lau3;Lcu3;)V", "Lau3;", "Lcu3;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdPlayerScope implements ku3 {
    private final /* synthetic */ ku3 $$delegate_0;

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final cu3 sdkErrorHandler;

    public AdPlayerScope(@NotNull au3 au3Var, @NotNull cu3 cu3Var) {
        au3Var.getClass();
        cu3Var.getClass();
        this.$$delegate_0 = s9a.c(au3Var.plus(cu3Var));
        this.defaultDispatcher = au3Var;
        this.sdkErrorHandler = cu3Var;
    }

    @Override // defpackage.ku3
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
