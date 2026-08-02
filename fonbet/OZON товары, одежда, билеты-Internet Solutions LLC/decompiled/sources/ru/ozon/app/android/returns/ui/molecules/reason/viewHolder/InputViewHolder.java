package ru.ozon.app.android.returns.ui.molecules.reason.viewHolder;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.app.android.returns.ui.utils.KeyboardScrollToTargetHelper;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/InputViewHolder;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/ReasonViewHolder;", "view", "Lru/ozon/uni/android/textArea/TextAreaView;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "viewModel", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onUpdateComment", "Lkotlin/Function2;", "", "", "<init>", "(Lru/ozon/uni/android/textArea/TextAreaView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "boundedData", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$InputRow;", "keyboardHelper", "Lru/ozon/app/android/returns/ui/utils/KeyboardScrollToTargetHelper;", "bind", "item", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputViewHolder extends ReasonViewHolder {
    private ReasonRow.InputRow boundedData;

    @NotNull
    private final KeyboardScrollToTargetHelper keyboardHelper;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function2<Long, String, Unit> onUpdateComment;

    @NotNull
    private final TextAreaView view;

    @NotNull
    private final InputViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputViewHolder(@NotNull TextAreaView view, @NotNull ComposerReferences refs, @NotNull InputViewModel viewModel, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function2<? super Long, ? super String, Unit> onUpdateComment) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onUpdateComment, "onUpdateComment");
        this.view = view;
        this.viewModel = viewModel;
        this.onAction = onAction;
        this.onUpdateComment = onUpdateComment;
        KeyboardScrollToTargetHelper keyboardScrollToTargetHelper = new KeyboardScrollToTargetHelper(refs, view);
        this.keyboardHelper = keyboardScrollToTargetHelper;
        keyboardScrollToTargetHelper.setup();
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextAreaView.INSTANCE.doOnTextChanged(view, new InputViewHolder$1$1(this));
        view.setHasInfoIcon(false);
    }

    public final void bind(@NotNull ReasonRow.InputRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        TextAreaView textAreaView = this.view;
        textAreaView.setStatus(item.getShowValidationBorder() ? TextAreaView.Status.ERROR : TextAreaView.Status.NEUTRAL);
        textAreaView.setLabel(item.getTextArea().getPlaceholder());
        Integer maxLength = item.getTextArea().getMaxLength();
        if (maxLength != null) {
            textAreaView.setMaxLength(maxLength.intValue());
        }
        textAreaView.setInputText(item.getTextArea().getValue());
    }
}
