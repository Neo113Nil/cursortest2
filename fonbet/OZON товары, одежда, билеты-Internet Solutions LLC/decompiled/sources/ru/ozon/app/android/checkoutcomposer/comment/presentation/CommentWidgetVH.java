package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.app.android.checkout.databinding.WidgetCommentBinding;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentVO;
import ru.ozon.app.android.checkoutcomposer.comment.presentation.CommentViewMapper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;", "Lru/ozon/app/android/checkout/databinding/WidgetCommentBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModel;", "vm", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetCommentBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModel;)V", "", "deeplink", "", "performRedirect", "(Ljava/lang/String;)V", "message", "showError", "Lru/ozon/uni/atoms/af/AtomAction$TextChange;", "action", "handleTextChanging", "(Lru/ozon/uni/atoms/af/AtomAction$TextChange;)V", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;Ll20/d;)V", "Lru/ozon/app/android/checkout/databinding/WidgetCommentBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "titleAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "inputAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommentWidgetVH extends k<CommentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCommentBinding binding;

    @NotNull
    private final AtomsAdapter inputAdapter;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final AtomsAdapter titleAdapter;

    @NotNull
    private final CommentViewModel vm;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommentWidgetVH(@NotNull WidgetCommentBinding binding, @NotNull ComposerReferences ref, @NotNull CommentViewModel vm) {
        super(r4);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(vm, "vm");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.vm = vm;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).configureBottomSheetWrapContent(true).onComposerAction(new CommentWidgetVH$actionHandler$1(this)).onTextChanged(new CommentWidgetVH$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 7, 12, R$style.TextStyle_Body_L_Gray60, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522211, null))), null, null, null, 14, null);
        this.titleAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(Input.class, null, 2, null), new InputAtom.Configuration(0, 0, 0, 0, InputAtom.Configuration.InputType.TEXT_MULTILINE, 10, 112, 15, null))), null, null, null, 14, null);
        atomsAdapter2.setOnAction(buildHandler);
        this.inputAdapter = atomsAdapter2;
        binding.titleVAL.setAdapter(atomsAdapter);
        binding.inputFAL.setAdapter(atomsAdapter2);
        binding.buttonAtom.setOnAction(buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextChanging(AtomAction.TextChange action) {
        this.ref.getController().d(new CommentViewMapper.UpdateComment(action.getText(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performRedirect(String deeplink) {
        this.actionHandler.invoke(new AtomAction.DismissRedirect(null, deeplink, null, null, null, 25, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showError(String message) {
        this.ref.getController().update(new CommentViewMapper.UpdateComment(null, message, 1, 0 == true ? 1 : 0));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.vm.getAction().observe(this, new CommentWidgetVH$sam$androidx_lifecycle_Observer$0(new CommentWidgetVH$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CommentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.titleAdapter.bind(getContext(), item.getInfo());
        this.inputAdapter.bind(getContext(), C7714v.a0(item.getInput()));
        this.binding.buttonAtom.bind(item.getButton());
    }
}
