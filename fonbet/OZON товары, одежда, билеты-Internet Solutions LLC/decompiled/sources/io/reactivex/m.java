package io.reactivex;

import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public interface m<T> {
    void onComplete();

    void onError(Throwable th2);

    void onSubscribe(InterfaceC8487b interfaceC8487b);

    void onSuccess(T t2);
}
