package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import androidx.car.app.model.Toggle;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.q580;
import xsna.x280;

/* loaded from: classes11.dex */
public class OnCheckedChangeDelegateImpl implements x280 {

    @Nullable
    private final IOnCheckedChangeListener mStub;

    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final Toggle.b mListener;

        public OnCheckedChangeListenerStub(Toggle.b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onCheckedChange", new RemoteUtils.a() { // from class: androidx.car.app.model.e
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onCheckedChange$0;
                    lambda$onCheckedChange$0 = OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.this.lambda$onCheckedChange$0(z);
                    return lambda$onCheckedChange$0;
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(@NonNull Toggle.b bVar) {
        this.mStub = new OnCheckedChangeListenerStub(bVar);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static x280 create(@NonNull Toggle.b bVar) {
        return new OnCheckedChangeDelegateImpl(bVar);
    }

    public void sendCheckedChange(boolean z, @NonNull q580 q580Var) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
