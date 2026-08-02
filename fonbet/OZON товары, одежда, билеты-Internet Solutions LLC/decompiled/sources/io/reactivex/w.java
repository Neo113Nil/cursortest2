package io.reactivex;

import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public interface w<T> {
    void onComplete();

    void onError(Throwable th2);

    void onNext(T t2);

    void onSubscribe(InterfaceC8487b interfaceC8487b);
}
