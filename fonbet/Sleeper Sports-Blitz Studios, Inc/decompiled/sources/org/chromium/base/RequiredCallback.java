package org.chromium.base;

import org.chromium.base.lifetime.LifetimeAssert;

/* loaded from: classes10.dex */
public class RequiredCallback<T> implements Callback<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Callback<T> mCallback;
    private final LifetimeAssert mLifetimeAssert = LifetimeAssert.create(this);

    public RequiredCallback(Callback<T> callback) {
        this.mCallback = callback;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public void lambda$bind$0(T result) {
        this.mCallback.lambda$bind$0(result);
        LifetimeAssert.destroy(this.mLifetimeAssert);
        this.mCallback = null;
    }
}
