package com.unity3d.ads.core.domain;

import defpackage.au3;
import defpackage.s9a;
import defpackage.xw3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonSafeCallbackInvoke;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lau3;", "mainDispatcher", "<init>", "(Lau3;)V", "Lkotlin/Function0;", "", "block", "invoke", "(Lkotlin/jvm/functions/Function0;)V", "Lau3;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {

    @NotNull
    private final au3 mainDispatcher;

    public CommonSafeCallbackInvoke(@NotNull au3 au3Var) {
        au3Var.getClass();
        this.mainDispatcher = au3Var;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(@NotNull Function0<Unit> block) {
        block.getClass();
        xw3.L(s9a.c(this.mainDispatcher), null, null, new CommonSafeCallbackInvoke$invoke$1(block, null), 3);
    }
}
