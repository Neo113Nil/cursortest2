package ru.ozon.app.android.session.userSocialsMobile.presentation.item;

import AJ.d;
import Bc.f;
import Bc.i;
import Hs.b;
import Hs.c;
import Mc.a;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UnbindResponse;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileRepository;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemVO;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModelImpl;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileRepository;", "repository", "<init>", "(Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileRepository;)V", "", "voId", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UnbindResponse;", "unbindResponse", "", "onSuccess", "(JLru/ozon/app/android/session/userSocialsMobile/data/item/UnbindResponse;)V", "", "throwable", "onError", "(JLjava/lang/Throwable;)V", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "confirmationData", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "clickAction", "onUnbindButtonClicked", "(JLru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "unbindRequestBody", "link", "onUnbindDialogButtonClicked", "(JLjava/lang/String;Ljava/lang/String;)V", "onCleared", "()V", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileRepository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$Action;", "action", "Landroidx/lifecycle/V;", "getAction", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;", "singleAction", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getSingleAction", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lnc/b;", "disposable", "Lnc/b;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserSocialsMobileItemViewModelImpl extends w0 implements UserSocialsMobileItemViewModel {

    @NotNull
    private final V<UserSocialsMobileItemViewModel.Action> action;
    private InterfaceC8487b disposable;

    @NotNull
    private final UserSocialsMobileRepository repository;

    @NotNull
    private final BroadcastSingleLiveEvent<UserSocialsMobileItemViewModel.SingleAction> singleAction;

    public UserSocialsMobileItemViewModelImpl(@NotNull UserSocialsMobileRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.action = new V<>();
        this.singleAction = new BroadcastSingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(long voId, Throwable throwable) {
        getSingleAction().setValue(new UserSocialsMobileItemViewModel.SingleAction.ShowErrorMessage(voId, throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess(long voId, UnbindResponse unbindResponse) {
        getSingleAction().setValue(new UserSocialsMobileItemViewModel.SingleAction.ShowSuccessMessage(voId, unbindResponse.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnbindDialogButtonClicked$lambda$4(UserSocialsMobileItemViewModelImpl userSocialsMobileItemViewModelImpl, long j11) {
        userSocialsMobileItemViewModelImpl.getAction().setValue(new UserSocialsMobileItemViewModel.Action.HideLoader(j11));
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel
    public void onUnbindButtonClicked(long voId, @NotNull UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationData, @NotNull AtomAction.Click clickAction) {
        Intrinsics.checkNotNullParameter(confirmationData, "confirmationData");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Map<String, String> params = clickAction.getParams();
        if (params == null) {
            throw new IllegalArgumentException("Atom action params must not be null.");
        }
        String str = params.get("postData");
        if (str == null) {
            throw new IllegalArgumentException("Post data must not be null.");
        }
        String str2 = str;
        String link = clickAction.getLink();
        if (link == null) {
            throw new IllegalArgumentException("Link must not be null.");
        }
        getSingleAction().setValue(new UserSocialsMobileItemViewModel.SingleAction.ShowConfirmationDialog(voId, confirmationData, link, str2));
    }

    @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel
    public void onUnbindDialogButtonClicked(final long voId, @NotNull String unbindRequestBody, @NotNull String link) {
        Intrinsics.checkNotNullParameter(unbindRequestBody, "unbindRequestBody");
        Intrinsics.checkNotNullParameter(link, "link");
        this.disposable = new f(new i(this.repository.unbindSocial(unbindRequestBody, link).j(a.b()).g(C8125a.a()), new d(new UserSocialsMobileItemViewModelImpl$onUnbindDialogButtonClicked$1(this, voId), 1)), new InterfaceC9019a() { // from class: MJ.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                UserSocialsMobileItemViewModelImpl.onUnbindDialogButtonClicked$lambda$4(UserSocialsMobileItemViewModelImpl.this, voId);
            }
        }).h(new b(new UserSocialsMobileItemViewModelImpl$onUnbindDialogButtonClicked$3(this, voId), 2), new c(new UserSocialsMobileItemViewModelImpl$onUnbindDialogButtonClicked$4(this, voId), 2));
    }

    @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel
    @NotNull
    public V<UserSocialsMobileItemViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel
    @NotNull
    public BroadcastSingleLiveEvent<UserSocialsMobileItemViewModel.SingleAction> getSingleAction() {
        return this.singleAction;
    }
}
