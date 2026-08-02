package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import AJ.a;
import Bc.i;
import H2.c;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountRepository;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModelImpl;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;", "repository", "<init>", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;)V", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Error;", "error", "Lkotlin/Pair;", "", "data", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "processError", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Error;Lkotlin/Pair;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "vo", "", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;)V", "link", "deleteAccount", "(Ljava/lang/String;)V", "id", "input", "textUpdated", "(Ljava/lang/String;Ljava/lang/String;)V", "onCleared", "()V", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$State;", "state", "Landroidx/lifecycle/V;", "getState", "()Landroidx/lifecycle/V;", "dataForSend", "Lkotlin/Pair;", "Lnc/a;", "disposable", "Lnc/a;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountDescriptionStickyViewModelImpl extends w0 implements DeleteAccountDescriptionStickyViewModel {

    @NotNull
    private final SingleLiveEvent<DeleteAccountDescriptionStickyViewModel.Action> action;

    @NotNull
    private Pair<String, String> dataForSend;

    @NotNull
    private final C8486a disposable;

    @NotNull
    private final DeleteAccountRepository repository;

    @NotNull
    private final V<DeleteAccountDescriptionStickyViewModel.State> state;

    public DeleteAccountDescriptionStickyViewModelImpl(@NotNull DeleteAccountRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.action = new SingleLiveEvent<>();
        this.state = new V<>();
        this.dataForSend = new Pair<>("", "");
        this.disposable = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final DeleteAccountDescriptionStickyViewModel.Action processError(DeleteAccountApiResponse.Error error, Pair<String, String> data) {
        String e11;
        if (Intrinsics.d(error.getType(), DeleteAccountApiResponse.Error.TYPE_RESTRICTION)) {
            return new DeleteAccountDescriptionStickyViewModel.Action.Restriction(error.getMessage());
        }
        if (Intrinsics.d(error.getType(), DeleteAccountApiResponse.Error.TYPE_RELOAD) && error.getDeeplink() != null) {
            return new DeleteAccountDescriptionStickyViewModel.Action.Reload(error.getDeeplink());
        }
        int i11 = 1;
        return Intrinsics.d(error.getType(), DeleteAccountApiResponse.Error.TYPE_VALIDATION) ? (data == null || (e11 = data.e()) == null) ? new DeleteAccountDescriptionStickyViewModel.Action.Restriction(null, i11, 0 == true ? 1 : 0) : new DeleteAccountDescriptionStickyViewModel.Action.FieldError(e11, error.getMessage()) : new DeleteAccountDescriptionStickyViewModel.Action.Restriction(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel
    public void bind(@NotNull DeleteAccountDescriptionStickyVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        getState().setValue(new DeleteAccountDescriptionStickyViewModel.State(vo, false));
        this.dataForSend = vo.getDataForSend();
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel
    public void deleteAccount(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Pair<String, String> pair = this.dataForSend;
        C8486a c8486a = this.disposable;
        y<DeleteAccountApiResponse> deleteAccountRequest = this.repository.deleteAccountRequest(link, pair);
        c cVar = new c(new DeleteAccountDescriptionStickyViewModelImpl$deleteAccount$1(this), 9);
        deleteAccountRequest.getClass();
        InterfaceC8487b h11 = new i(deleteAccountRequest, cVar).g(C8125a.a()).h(new a(new DeleteAccountDescriptionStickyViewModelImpl$deleteAccount$2(this, pair), 7), new DJ.c(new DeleteAccountDescriptionStickyViewModelImpl$deleteAccount$3(this), 10));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposable.d();
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel
    public void textUpdated(@NotNull String id2, @NotNull String input) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(input, "input");
        this.dataForSend = new Pair<>(id2, input);
        DeleteAccountDescriptionStickyViewModel.State value = getState().getValue();
        if (value == null) {
            return;
        }
        getState().setValue(value.copy(DeleteAccountDescriptionStickyVO.copy$default(value.getData(), 0L, null, new Pair(id2, input), 3, null), true));
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel
    @NotNull
    public SingleLiveEvent<DeleteAccountDescriptionStickyViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel
    @NotNull
    public V<DeleteAccountDescriptionStickyViewModel.State> getState() {
        return this.state;
    }
}
