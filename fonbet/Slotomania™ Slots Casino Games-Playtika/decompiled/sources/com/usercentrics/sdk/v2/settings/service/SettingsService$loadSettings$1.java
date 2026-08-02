package com.usercentrics.sdk.v2.settings.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SettingsService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.settings.service.SettingsService", f = "SettingsService.kt", i = {0, 0, 1, 1}, l = {17, 18}, m = "loadSettings", n = {"this", "settingsInitializationParameters", "this", "settingsValue"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes7.dex */
final class SettingsService$loadSettings$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsService$loadSettings$1(SettingsService settingsService, Continuation<? super SettingsService$loadSettings$1> continuation) {
        super(continuation);
        this.this$0 = settingsService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadSettings(null, this);
    }
}
