package com.socure.idplus.device.internal.input.manager.compose;

import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f866a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f866a = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlatformTextInputService platformTextInputService = (PlatformTextInputService) obj;
        d dVar = this.f866a;
        Intrinsics.checkNotNull(platformTextInputService);
        return new b(dVar, platformTextInputService);
    }
}
