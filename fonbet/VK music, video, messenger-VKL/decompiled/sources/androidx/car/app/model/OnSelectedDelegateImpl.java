package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.OnSelectedDelegateImpl;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.nb80;
import xsna.q580;

/* loaded from: classes11.dex */
public class OnSelectedDelegateImpl implements nb80 {

    @Nullable
    private final IOnSelectedListener mStub;

    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final ItemList.c mListener;

        public OnSelectedListenerStub(ItemList.c cVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i) throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSelectedListener", new RemoteUtils.a() { // from class: androidx.car.app.model.i
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onSelected$0;
                    lambda$onSelected$0 = OnSelectedDelegateImpl.OnSelectedListenerStub.this.lambda$onSelected$0(i);
                    return lambda$onSelected$0;
                }
            });
        }
    }

    private OnSelectedDelegateImpl(@NonNull ItemList.c cVar) {
        this.mStub = new OnSelectedListenerStub(cVar);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static nb80 create(@NonNull ItemList.c cVar) {
        return new OnSelectedDelegateImpl(cVar);
    }

    public void sendSelected(int i, @NonNull q580 q580Var) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
