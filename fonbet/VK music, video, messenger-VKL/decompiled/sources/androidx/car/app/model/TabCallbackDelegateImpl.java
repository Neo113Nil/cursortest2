package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import androidx.car.app.model.TabCallbackDelegateImpl;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.esn0;
import xsna.q580;

/* loaded from: classes11.dex */
public class TabCallbackDelegateImpl implements esn0 {

    @Nullable
    private final ITabCallback mStubCallback;

    public static class TabCallbackStub extends ITabCallback.Stub {
        private final TabTemplate.b mCallback;

        public TabCallbackStub(TabTemplate.b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTabSelected$0(String str) throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onTabSelected", new RemoteUtils.a() { // from class: androidx.car.app.model.l
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onTabSelected$0;
                    lambda$onTabSelected$0 = TabCallbackDelegateImpl.TabCallbackStub.this.lambda$onTabSelected$0(str);
                    return lambda$onTabSelected$0;
                }
            });
        }
    }

    private TabCallbackDelegateImpl(@NonNull TabTemplate.b bVar) {
        this.mStubCallback = new TabCallbackStub(bVar);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static esn0 create(@NonNull TabTemplate.b bVar) {
        return new TabCallbackDelegateImpl(bVar);
    }

    public void sendTabSelected(@NonNull String str, @NonNull q580 q580Var) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
