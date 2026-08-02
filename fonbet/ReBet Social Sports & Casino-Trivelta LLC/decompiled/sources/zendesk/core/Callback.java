package zendesk.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class Callback<E> {
    private final AtomicBoolean canceled = new AtomicBoolean(false);

    public void cancel() {
        this.canceled.set(true);
    }

    public void internalSuccess(final E e10) {
        if (this.canceled.get()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: zendesk.core.b
            @Override // java.lang.Runnable
            public final void run() {
                Callback.this.lambda$internalSuccess$0(e10);
            }
        });
    }

    /* renamed from: success, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$internalSuccess$0(E e10);
}
