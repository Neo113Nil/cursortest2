package com.unity3d.services.core.di;

import xsna.epx;
import xsna.gzs;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: IServiceComponent.kt */
/* loaded from: classes14.dex */
public final class IServiceComponentKt$inject$1<T> implements gzs<T> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    @Override // xsna.gzs
    public final T invoke() {
        this.$this_inject.getServiceProvider().getRegistry();
        epx.k();
        throw null;
    }
}
