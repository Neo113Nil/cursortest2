package com.usercentrics.sdk.v2.settings.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SettingsRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.settings.repository.SettingsRepository", f = "SettingsRepository.kt", i = {0, 0}, l = {33}, m = "fetchSettings", n = {"this", "bypassCache"}, s = {"L$0", "Z$0"})
/* loaded from: classes6.dex */
final class SettingsRepository$fetchSettings$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsRepository$fetchSettings$1(SettingsRepository settingsRepository, Continuation<? super SettingsRepository$fetchSettings$1> continuation) {
        super(continuation);
        this.this$0 = settingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchSettings(null, this);
    }
}
