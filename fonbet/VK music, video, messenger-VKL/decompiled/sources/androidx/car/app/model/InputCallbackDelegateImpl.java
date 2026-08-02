package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.j1x;
import xsna.k1x;
import xsna.q580;

/* loaded from: classes11.dex */
public class InputCallbackDelegateImpl implements k1x {

    @Nullable
    private final IInputCallback mCallback;

    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final j1x mCallback;

        public OnInputCallbackStub(j1x j1xVar) {
            this.mCallback = j1xVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputSubmitted$0(String str) throws BundlerException {
            this.mCallback.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputTextChanged$1(String str) throws BundlerException {
            this.mCallback.getClass();
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onInputSubmitted", new RemoteUtils.a() { // from class: androidx.car.app.model.d
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onInputSubmitted$0;
                    lambda$onInputSubmitted$0 = InputCallbackDelegateImpl.OnInputCallbackStub.this.lambda$onInputSubmitted$0(str);
                    return lambda$onInputSubmitted$0;
                }
            });
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onInputTextChanged", new RemoteUtils.a() { // from class: androidx.car.app.model.c
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onInputTextChanged$1;
                    lambda$onInputTextChanged$1 = InputCallbackDelegateImpl.OnInputCallbackStub.this.lambda$onInputTextChanged$1(str);
                    return lambda$onInputTextChanged$1;
                }
            });
        }
    }

    private InputCallbackDelegateImpl(@NonNull j1x j1xVar) {
        this.mCallback = new OnInputCallbackStub(j1xVar);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static k1x create(@NonNull j1x j1xVar) {
        Objects.requireNonNull(j1xVar);
        return new InputCallbackDelegateImpl(j1xVar);
    }

    public void sendInputSubmitted(@NonNull String str, @NonNull q580 q580Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendInputTextChanged(@NonNull String str, @NonNull q580 q580Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
