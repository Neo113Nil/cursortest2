package com.usercentrics.sdk.services.settings;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SettingsLegacy.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.services.settings.SettingsLegacy", f = "SettingsLegacy.kt", i = {0}, l = {31}, m = "initSettings-gIAlu-s", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class SettingsLegacy$initSettings$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsLegacy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsLegacy$initSettings$1(SettingsLegacy settingsLegacy, Continuation<? super SettingsLegacy$initSettings$1> continuation) {
        super(continuation);
        this.this$0 = settingsLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo10603initSettingsgIAlus = this.this$0.mo10603initSettingsgIAlus(null, this);
        return mo10603initSettingsgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo10603initSettingsgIAlus : Result.m11179boximpl(mo10603initSettingsgIAlus);
    }
}
