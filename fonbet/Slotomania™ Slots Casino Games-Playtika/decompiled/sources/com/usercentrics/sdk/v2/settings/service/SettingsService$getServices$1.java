package com.usercentrics.sdk.v2.settings.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SettingsService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.settings.service.SettingsService", f = "SettingsService.kt", i = {0, 0, 0, 0}, l = {45}, m = "getServices", n = {"this", "settings", "categoriesMap", "servicesCount"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes7.dex */
final class SettingsService$getServices$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsService$getServices$1(SettingsService settingsService, Continuation<? super SettingsService$getServices$1> continuation) {
        super(continuation);
        this.this$0 = settingsService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object services;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        services = this.this$0.getServices(null, null, false, this);
        return services;
    }
}
