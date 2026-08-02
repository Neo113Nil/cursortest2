package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.IAlertCallback;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.kr1;
import xsna.lr1;
import xsna.q580;

/* loaded from: classes11.dex */
public class AlertCallbackDelegateImpl implements lr1 {

    @Nullable
    private final IAlertCallback mCallback;

    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final kr1 mCallback;

        public AlertCallbackStub(kr1 kr1Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertCancelled$0(int i) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertDismissed$1() throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onCancel", new RemoteUtils.a() { // from class: androidx.car.app.model.b
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onAlertCancelled$0;
                    lambda$onAlertCancelled$0 = AlertCallbackDelegateImpl.AlertCallbackStub.this.lambda$onAlertCancelled$0(i);
                    return lambda$onAlertCancelled$0;
                }
            });
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onDismiss", new RemoteUtils.a() { // from class: androidx.car.app.model.a
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onAlertDismissed$1;
                    lambda$onAlertDismissed$1 = AlertCallbackDelegateImpl.AlertCallbackStub.this.lambda$onAlertDismissed$1();
                    return lambda$onAlertDismissed$1;
                }
            });
        }
    }

    private AlertCallbackDelegateImpl(@NonNull kr1 kr1Var) {
        this.mCallback = new AlertCallbackStub(kr1Var);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static lr1 create(@NonNull kr1 kr1Var) {
        return new AlertCallbackDelegateImpl(kr1Var);
    }

    public void sendCancel(int i, @NonNull q580 q580Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDismiss(@NonNull q580 q580Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
