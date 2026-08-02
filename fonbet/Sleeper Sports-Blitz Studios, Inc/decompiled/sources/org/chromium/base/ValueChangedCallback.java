package org.chromium.base;

import java.util.Objects;

/* loaded from: classes10.dex */
public class ValueChangedCallback<T> implements Callback<T> {
    private T mLastValue;
    private final ValueChangedObserver<T> mValueChangedObserver;

    @FunctionalInterface
    public interface ValueChangedObserver<T> {
        void onValueChanged(T newValue, T oldValue);
    }

    public ValueChangedCallback(ValueChangedObserver<T> onValueChangedObserver) {
        this.mValueChangedObserver = onValueChangedObserver;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public void lambda$bind$0(T newValue) {
        if (Objects.equals(newValue, this.mLastValue)) {
            return;
        }
        T t = this.mLastValue;
        this.mLastValue = newValue;
        this.mValueChangedObserver.onValueChanged(newValue, t);
    }
}
