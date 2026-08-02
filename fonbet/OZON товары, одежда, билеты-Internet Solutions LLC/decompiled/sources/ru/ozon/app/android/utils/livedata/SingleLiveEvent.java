package ru.ozon.app.android.utils.livedata;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.J;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

/* loaded from: classes7.dex */
public class SingleLiveEvent<T> extends V<T> {
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observe$0(W w11, Object obj) {
        if (this.mPending.compareAndSet(true, false)) {
            w11.onChanged(obj);
        }
    }

    public void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.P
    public void observe(@NonNull J j11, @NonNull final W<? super T> w11) {
        if (hasActiveObservers()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(j11, new W() { // from class: xY.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                SingleLiveEvent.this.lambda$observe$0(w11, obj);
            }
        });
    }

    @Override // androidx.lifecycle.V, androidx.lifecycle.P
    public void setValue(T t2) {
        this.mPending.set(true);
        super.setValue(t2);
    }
}
