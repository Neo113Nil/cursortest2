package com.unity3d.services.core.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class IServiceComponentKt$inject$1<T> implements Function0<T> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        this.$this_inject.getServiceProvider().getRegistry();
        Intrinsics.h();
        throw null;
    }
}
