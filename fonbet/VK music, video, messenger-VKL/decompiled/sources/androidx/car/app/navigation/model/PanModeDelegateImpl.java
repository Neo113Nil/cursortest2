package androidx.car.app.navigation.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.q580;
import xsna.ug90;
import xsna.vg90;

/* loaded from: classes11.dex */
public class PanModeDelegateImpl implements ug90 {

    @Nullable
    private final IPanModeListener mStub;

    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final vg90 mListener;

        public PanModeListenerStub(vg90 vg90Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onPanModeChanged", new RemoteUtils.a() { // from class: androidx.car.app.navigation.model.a
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onPanModeChanged$0;
                    lambda$onPanModeChanged$0 = PanModeDelegateImpl.PanModeListenerStub.this.lambda$onPanModeChanged$0(z);
                    return lambda$onPanModeChanged$0;
                }
            });
        }
    }

    private PanModeDelegateImpl(@NonNull vg90 vg90Var) {
        this.mStub = new PanModeListenerStub(vg90Var);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static ug90 create(@NonNull vg90 vg90Var) {
        return new PanModeDelegateImpl(vg90Var);
    }

    public void sendPanModeChanged(boolean z, @NonNull q580 q580Var) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
