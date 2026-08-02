package org.chromium.base.supplier;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;

/* loaded from: classes10.dex */
public class SyncOneshotSupplierImpl<T> implements SyncOneshotSupplier<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private T mObject;
    private ArrayList<Callback<T>> mPendingCallbacks;
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();

    @Override // org.chromium.base.supplier.SyncOneshotSupplier
    public T onAvailable(Callback<T> callback) {
        this.mThreadChecker.assertOnValidThread();
        T t = get();
        if (t != null) {
            callback.lambda$bind$0(t);
            return t;
        }
        if (this.mPendingCallbacks == null) {
            this.mPendingCallbacks = new ArrayList<>();
        }
        this.mPendingCallbacks.add(callback);
        return t;
    }

    @Override // java.util.function.Supplier
    public T get() {
        this.mThreadChecker.assertOnValidThread();
        return this.mObject;
    }

    public void set(T object) {
        this.mThreadChecker.assertOnValidThread();
        this.mObject = object;
        ArrayList<Callback<T>> arrayList = this.mPendingCallbacks;
        if (arrayList == null) {
            return;
        }
        Iterator<Callback<T>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().lambda$bind$0(object);
        }
        this.mPendingCallbacks = null;
    }
}
