package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import Lm0.a;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$string;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentRepository;
import ru.ozon.app.android.checkoutcomposer.comment.data.NewCommentBody;
import ru.ozon.app.android.checkoutcomposer.comment.data.NewCommentResponse;
import ru.ozon.app.android.checkoutcomposer.comment.presentation.CommentViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModel;", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentRepository;", "repository", "<init>", "(Lru/ozon/app/android/checkoutcomposer/comment/data/CommentRepository;)V", "Lru/ozon/app/android/checkoutcomposer/comment/data/NewCommentResponse;", "response", "", "processSendingSuccess", "(Lru/ozon/app/android/checkoutcomposer/comment/data/NewCommentResponse;)V", "", "e", "processSendingError", "(Ljava/lang/Throwable;)V", "showDefaultError", "()V", "", "message", "showError", "(Ljava/lang/String;)V", "deeplink", "performRedirect", "actionName", "comment", "sendComment", "(Ljava/lang/String;Ljava/lang/String;)V", "onCleared", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "disposables", "Lnc/a;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommentViewModelImpl extends w0 implements CommentViewModel {

    @NotNull
    private final SingleLiveEvent<CommentViewModel.Action> action;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final CommentRepository repository;

    public CommentViewModelImpl(@NotNull CommentRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.action = new SingleLiveEvent<>();
        this.disposables = new C8486a();
    }

    private final void performRedirect(String deeplink) {
        getAction().setValue(new CommentViewModel.Action.RedirectAndRefresh(deeplink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSendingError(Throwable e11) {
        showDefaultError();
        a.f17149a.e(e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSendingSuccess(NewCommentResponse response) {
        String errorMessage = response.getErrorMessage();
        if (errorMessage != null) {
            showError(errorMessage);
        }
        String link = response.getLink();
        if (link != null) {
            performRedirect(link);
        }
    }

    private final void showDefaultError() {
        getAction().setValue(new CommentViewModel.Action.Error(StringProvider.getString(R$string.common_error_try_one_more_time)));
    }

    private final void showError(String message) {
        getAction().setValue(new CommentViewModel.Action.Error(message));
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.comment.presentation.CommentViewModel
    public void sendComment(@NotNull String actionName, @NotNull String comment) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(comment, "comment");
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.repository.sendComment(actionName, new NewCommentBody(comment)).g(C8125a.a()).h(new IJ.a(new CommentViewModelImpl$sendComment$1(this), 6), new HX.a(new CommentViewModelImpl$sendComment$2(this), 5));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.checkoutcomposer.comment.presentation.CommentViewModel
    @NotNull
    public SingleLiveEvent<CommentViewModel.Action> getAction() {
        return this.action;
    }
}
