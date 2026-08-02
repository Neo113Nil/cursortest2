package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Observable<T> {
    private final List<IObserver<T>> _observers = new ArrayList();

    public synchronized void notifyObservers(T t) {
        Iterator<IObserver<T>> it = this._observers.iterator();
        while (it.hasNext()) {
            it.next().updated(t);
        }
    }

    public synchronized void registerObserver(IObserver<T> iObserver) {
        if (this._observers.contains(iObserver)) {
            return;
        }
        this._observers.add(iObserver);
    }

    public synchronized void unregisterObserver(IObserver<T> iObserver) {
        if (this._observers.contains(iObserver)) {
            this._observers.remove(iObserver);
        }
    }
}
