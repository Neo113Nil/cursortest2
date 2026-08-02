package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import androidx.car.app.model.OnContentRefreshDelegateImpl;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.n380;
import xsna.o380;
import xsna.q580;

/* loaded from: classes11.dex */
public class OnContentRefreshDelegateImpl implements n380 {

    @Nullable
    private final IOnContentRefreshListener mListener;

    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final o380 mOnContentRefreshListener;

        public OnContentRefreshListenerStub(o380 o380Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onClick", new RemoteUtils.a() { // from class: androidx.car.app.model.g
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onContentRefreshRequested$0;
                    lambda$onContentRefreshRequested$0 = OnContentRefreshDelegateImpl.OnContentRefreshListenerStub.this.lambda$onContentRefreshRequested$0();
                    return lambda$onContentRefreshRequested$0;
                }
            });
        }
    }

    private OnContentRefreshDelegateImpl(@NonNull o380 o380Var) {
        this.mListener = new OnContentRefreshListenerStub(o380Var);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static n380 create(@NonNull o380 o380Var) {
        return new OnContentRefreshDelegateImpl(o380Var);
    }

    public void sendContentRefreshRequested(@NonNull q580 q580Var) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
