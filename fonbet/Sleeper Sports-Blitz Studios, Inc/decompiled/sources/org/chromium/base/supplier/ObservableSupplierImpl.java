package org.chromium.base.supplier;

import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.ObserverList;
import org.chromium.base.ThreadUtils;

/* loaded from: classes10.dex */
public class ObservableSupplierImpl<E> implements ObservableSupplier<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private E mObject;
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();
    protected final ObserverList<Callback<E>> mObservers = new ObserverList<>();

    private static boolean shouldNotifyOnAdd(int behavior) {
        return (behavior & 1) != 0;
    }

    private static boolean shouldPostOnAdd(int behavior) {
        return (behavior & 2) != 0;
    }

    public ObservableSupplierImpl() {
    }

    public ObservableSupplierImpl(E initialValue) {
        this.mObject = initialValue;
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public E addObserver(final Callback<E> obs, int behavior) {
        final E e;
        this.mObservers.addObserver(obs);
        if (shouldNotifyOnAdd(behavior) && (e = this.mObject) != null) {
            if (shouldPostOnAdd(behavior)) {
                ThreadUtils.assertOnUiThread();
                ThreadUtils.postOnUiThread(new Runnable() { // from class: org.chromium.base.supplier.ObservableSupplierImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ObservableSupplierImpl.this.lambda$addObserver$0(e, obs);
                    }
                });
            } else {
                obs.lambda$bind$0(e);
            }
        }
        return this.mObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$0(Object obj, Callback callback) {
        if (this.mObject == obj && this.mObservers.hasObserver(callback)) {
            callback.lambda$bind$0(obj);
        }
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public void removeObserver(Callback<E> obs) {
        this.mObservers.removeObserver(obs);
    }

    public void set(E object) {
        this.mThreadChecker.assertOnValidThread();
        if (Objects.equals(object, this.mObject)) {
            return;
        }
        this.mObject = object;
        Iterator<Callback<E>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            it.next().lambda$bind$0(object);
        }
    }

    @Override // org.chromium.base.supplier.ObservableSupplier, java.util.function.Supplier
    public E get() {
        this.mThreadChecker.assertOnValidOrInstrumentationThread();
        return this.mObject;
    }

    public boolean hasObservers() {
        return !this.mObservers.isEmpty();
    }
}
