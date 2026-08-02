package com.usercentrics.sdk.v2.settings.facade;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SettingsFacade.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.settings.facade.SettingsFacade", f = "SettingsFacade.kt", i = {0, 0, 1, 1}, l = {21, 23}, m = "loadSettings-gIAlu-s", n = {"this", "settingsInitParameters", "this", "settingsInitParameters"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class SettingsFacade$loadSettings$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsFacade$loadSettings$1(SettingsFacade settingsFacade, Continuation<? super SettingsFacade$loadSettings$1> continuation) {
        super(continuation);
        this.this$0 = settingsFacade;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo10625loadSettingsgIAlus = this.this$0.mo10625loadSettingsgIAlus(null, this);
        return mo10625loadSettingsgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo10625loadSettingsgIAlus : Result.m11179boximpl(mo10625loadSettingsgIAlus);
    }
}
