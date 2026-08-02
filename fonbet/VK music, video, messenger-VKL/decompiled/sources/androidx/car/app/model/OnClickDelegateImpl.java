package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.a380;
import xsna.q580;
import xsna.z280;

/* loaded from: classes11.dex */
public class OnClickDelegateImpl implements z280 {
    private final boolean mIsParkedOnly;

    @Nullable
    private final IOnClickListener mListener;

    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final a380 mOnClickListener;

        public OnClickListenerStub(a380 a380Var) {
            this.mOnClickListener = a380Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$0() throws BundlerException {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onClick", new RemoteUtils.a() { // from class: androidx.car.app.model.f
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onClick$0;
                    lambda$onClick$0 = OnClickDelegateImpl.OnClickListenerStub.this.lambda$onClick$0();
                    return lambda$onClick$0;
                }
            });
        }
    }

    private OnClickDelegateImpl(@NonNull a380 a380Var, boolean z) {
        this.mListener = new OnClickListenerStub(a380Var);
        this.mIsParkedOnly = z;
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static z280 create(@NonNull a380 a380Var) {
        return new OnClickDelegateImpl(a380Var, a380Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // xsna.z280
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(@NonNull q580 q580Var) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
