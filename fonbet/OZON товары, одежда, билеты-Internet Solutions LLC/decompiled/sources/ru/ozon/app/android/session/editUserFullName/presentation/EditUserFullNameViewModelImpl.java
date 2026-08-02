package ru.ozon.app.android.session.editUserFullName.presentation;

import AJ.c;
import AJ.d;
import Bc.f;
import Bc.i;
import Mc.a;
import android.content.Context;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameRepository;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModelImpl;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameRepository;", "repository", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameRepository;Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;)V", "", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "inputs", "", "onDataReceived", "(Ljava/util/List;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "text", "onTextChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "onSubmitButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "onCleared", "()V", "Landroid/content/Context;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameRepository;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "Landroidx/lifecycle/V;", "", "showLoader", "Landroidx/lifecycle/V;", "getShowLoader", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;", "result", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getResult", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/b;", "disposable", "Lnc/b;", "", "userData", "Ljava/util/Map;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EditUserFullNameViewModelImpl extends w0 implements EditUserFullNameViewModel {

    @NotNull
    private final CheckoutPrefetchController checkoutPrefetchController;

    @NotNull
    private final Context context;
    private InterfaceC8487b disposable;

    @NotNull
    private final EditUserFullNameRepository repository;

    @NotNull
    private final SingleLiveEvent<EditUserFullNameViewModel.Result> result;

    @NotNull
    private final V<Boolean> showLoader;

    @NotNull
    private final Map<String, String> userData;

    public EditUserFullNameViewModelImpl(@NotNull Context context, @NotNull EditUserFullNameRepository repository, @NotNull CheckoutPrefetchController checkoutPrefetchController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(checkoutPrefetchController, "checkoutPrefetchController");
        this.context = context;
        this.repository = repository;
        this.checkoutPrefetchController = checkoutPrefetchController;
        this.showLoader = new V<>();
        this.result = new SingleLiveEvent<>();
        this.userData = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSubmitButtonClicked$lambda$2(EditUserFullNameViewModelImpl editUserFullNameViewModelImpl) {
        editUserFullNameViewModelImpl.getShowLoader().setValue(Boolean.FALSE);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel
    public void onDataReceived(@NotNull List<EditUserFullNameVO.InputVO> inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        if (this.userData.isEmpty()) {
            for (EditUserFullNameVO.InputVO inputVO : inputs) {
                Map<String, String> map = this.userData;
                String name = inputVO.getName();
                String value = inputVO.getValue();
                if (value == null) {
                    value = "";
                }
                map.put(name, value);
            }
        }
    }

    @Override // ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel
    public void onSubmitButtonClicked(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.checkoutPrefetchController.removeAllCache();
        this.disposable = new f(new i(this.repository.editUserFullName(action.getActionName(), this.userData).j(a.b()).g(C8125a.a()), new AJ.a(new EditUserFullNameViewModelImpl$onSubmitButtonClicked$1(this), 0)), new InterfaceC9019a() { // from class: AJ.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                EditUserFullNameViewModelImpl.onSubmitButtonClicked$lambda$2(EditUserFullNameViewModelImpl.this);
            }
        }).h(new c(new EditUserFullNameViewModelImpl$onSubmitButtonClicked$3(this), 0), new d(new EditUserFullNameViewModelImpl$onSubmitButtonClicked$4(this), 0));
    }

    @Override // ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel
    public void onTextChanged(@NotNull String name, @NotNull String text) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(text, "text");
        this.userData.put(name, text);
    }

    @Override // ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel
    @NotNull
    public SingleLiveEvent<EditUserFullNameViewModel.Result> getResult() {
        return this.result;
    }

    @Override // ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel
    @NotNull
    public V<Boolean> getShowLoader() {
        return this.showLoader;
    }
}
