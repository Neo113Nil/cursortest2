package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import androidx.car.app.model.SearchCallbackDelegateImpl;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.nnh0;
import xsna.q580;

/* loaded from: classes11.dex */
public class SearchCallbackDelegateImpl implements nnh0 {

    @Nullable
    private final ISearchCallback mStubCallback;

    public static class SearchCallbackStub extends ISearchCallback.Stub {
        private final SearchTemplate.b mCallback;

        public SearchCallbackStub(SearchTemplate.b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSearchSubmitted$1(String str) throws BundlerException {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSearchTextChanged$0(String str) throws BundlerException {
            throw null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSearchSubmitted", new RemoteUtils.a() { // from class: androidx.car.app.model.j
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onSearchSubmitted$1;
                    lambda$onSearchSubmitted$1 = SearchCallbackDelegateImpl.SearchCallbackStub.this.lambda$onSearchSubmitted$1(str);
                    return lambda$onSearchSubmitted$1;
                }
            });
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSearchTextChanged", new RemoteUtils.a() { // from class: androidx.car.app.model.k
                @Override // androidx.car.app.utils.RemoteUtils.a
                public final Object a() {
                    Object lambda$onSearchTextChanged$0;
                    lambda$onSearchTextChanged$0 = SearchCallbackDelegateImpl.SearchCallbackStub.this.lambda$onSearchTextChanged$0(str);
                    return lambda$onSearchTextChanged$0;
                }
            });
        }
    }

    private SearchCallbackDelegateImpl(@NonNull SearchTemplate.b bVar) {
        this.mStubCallback = new SearchCallbackStub(bVar);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static nnh0 create(@NonNull SearchTemplate.b bVar) {
        return new SearchCallbackDelegateImpl(bVar);
    }

    public void sendSearchSubmitted(@NonNull String str, @NonNull q580 q580Var) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchSubmitted(str, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendSearchTextChanged(@NonNull String str, @NonNull q580 q580Var) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchTextChanged(str, RemoteUtils.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
