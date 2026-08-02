package com.unity3d.ads.injection;

import kotlin.Lazy;
import xsna.gzs;

/* compiled from: Factory.kt */
/* loaded from: classes14.dex */
public final class Factory<T> implements Lazy<T> {
    private final gzs<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(gzs<? extends T> gzsVar) {
        this.initializer = gzsVar;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return this.initializer.invoke();
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return false;
    }
}
