package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.q580;
import xsna.u680;

/* loaded from: classes11.dex */
public class OnItemVisibilityChangedDelegateImpl implements u680 {

    @Nullable
    private final IOnItemVisibilityChangedListener mStub;

    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final ItemList.b mListener;

        public OnItemVisibilityChangedListenerStub(ItemList.b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onItemVisibilityChanged", new RemoteUtils.a() { // from class: androidx.car.app.model.h
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onItemVisibilityChanged$0;
                    lambda$onItemVisibilityChanged$0 = OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub.this.lambda$onItemVisibilityChanged$0(i, i2);
                    return lambda$onItemVisibilityChanged$0;
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(@NonNull ItemList.b bVar) {
        this.mStub = new OnItemVisibilityChangedListenerStub(bVar);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static u680 create(@NonNull ItemList.b bVar) {
        return new OnItemVisibilityChangedDelegateImpl(bVar);
    }

    public void sendItemVisibilityChanged(int i, int i2, @NonNull q580 q580Var) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
