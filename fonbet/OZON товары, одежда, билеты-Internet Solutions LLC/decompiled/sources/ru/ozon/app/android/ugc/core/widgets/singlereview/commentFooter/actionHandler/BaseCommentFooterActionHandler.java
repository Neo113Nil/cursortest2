package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler;

import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterVO;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/BaseCommentFooterActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel;", "commentModalViewModelProvider", "<init>", "(LPc/a;)V", "viewModel", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "checkAndObserveAuth", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "completeAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseCommentFooterActionHandler extends CustomActionHandler {

    @NotNull
    private final a<CommentFooterViewModel> commentModalViewModelProvider;

    public BaseCommentFooterActionHandler(@NotNull a<CommentFooterViewModel> commentModalViewModelProvider) {
        Intrinsics.checkNotNullParameter(commentModalViewModelProvider, "commentModalViewModelProvider");
        this.commentModalViewModelProvider = commentModalViewModelProvider;
    }

    private final void checkAndObserveAuth(CommentFooterViewModel viewModel, CustomActionHandler.HandlerReferences handlerRefs) {
        viewModel.getCommentAction().observe(handlerRefs.getRefs().getContainer().g(), new BaseCommentFooterActionHandler$sam$androidx_lifecycle_Observer$0(new BaseCommentFooterActionHandler$checkAndObserveAuth$1(this, handlerRefs)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeAction(AtomAction.Click action, CustomActionHandler.HandlerReferences handlerRefs) {
        String id2 = action.getId();
        if (Intrinsics.d(id2, "comment")) {
            handlerRefs.getRefs().getNavigator().openDeeplink(String.valueOf(action.getLink()), U.i(new Pair("activateCommentField", Boolean.TRUE)));
        } else if (Intrinsics.d(id2, "commentModal")) {
            ComposerNavigator navigator = handlerRefs.getRefs().getNavigator();
            String valueOf = String.valueOf(action.getLink());
            Boolean bool = Boolean.TRUE;
            navigator.openDeeplink(valueOf, U.j(new Pair("activateCommentField", bool), new Pair("openInModal", bool)));
        }
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click)) {
            new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new BaseCommentFooterActionHandler$processAction$1(handlerRefs), new BaseCommentFooterActionHandler$processAction$2(handlerRefs)).buildHandler().invoke(action);
            return;
        }
        AtomAction.Click click = (AtomAction.Click) action;
        if (click.getLink() == null) {
            return;
        }
        CommentFooterViewModel commentFooterViewModel = (CommentFooterViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler.BaseCommentFooterActionHandler$processAction$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = BaseCommentFooterActionHandler.this.commentModalViewModelProvider;
                CommentFooterViewModel commentFooterViewModel2 = (CommentFooterViewModel) aVar.get();
                Intrinsics.g(commentFooterViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return commentFooterViewModel2;
            }
        }).a(CommentFooterViewModel.class);
        Intrinsics.f(commentFooterViewModel);
        checkAndObserveAuth(commentFooterViewModel, handlerRefs);
        l viewItem = handlerRefs.getViewItem();
        commentFooterViewModel.checkAuthorise(click, (viewItem != null ? viewItem.d() : null) instanceof CommentFooterVO);
    }
}
