package ru.ozon.app.android.utils.livedata;

import androidx.annotation.NonNull;
import androidx.lifecycle.J;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;

/* loaded from: classes2.dex */
public class BroadcastSingleLiveEvent<T> extends V<T> {
    private List<AtomicBoolean> pendings = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$observe$0(AtomicBoolean atomicBoolean, W w11, Object obj) {
        if (atomicBoolean.compareAndSet(true, false)) {
            w11.onChanged(obj);
        }
    }

    public void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.P
    public void observe(@NonNull J j11, @NonNull final W<? super T> w11) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.pendings.add(atomicBoolean);
        super.observe(j11, new W() { // from class: xY.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                BroadcastSingleLiveEvent.lambda$observe$0(atomicBoolean, w11, obj);
            }
        });
    }

    @Override // androidx.lifecycle.V, androidx.lifecycle.P
    public void setValue(T t2) {
        Iterator<AtomicBoolean> it = this.pendings.iterator();
        while (it.hasNext()) {
            it.next().set(true);
        }
        super.setValue(t2);
    }
}
