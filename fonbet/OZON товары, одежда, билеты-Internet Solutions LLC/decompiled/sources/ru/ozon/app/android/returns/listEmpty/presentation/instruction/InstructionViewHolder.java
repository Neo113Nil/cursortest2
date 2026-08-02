package ru.ozon.app.android.returns.listEmpty.presentation.instruction;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO;
import ru.ozon.app.android.returns.listEmpty.presentation.TextBlockViewHolder;
import ru.ozon.app.android.returns.listEmpty.presentation.instruction.adapter.InstructionAdapter;
import ru.ozon.app.android.returns.listEmpty.presentation.instruction.adapter.InstructionDecoration;
import ru.ozon.app.android.returns.listEmpty.presentation.view.ReturnInstructionTextBlockView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/instruction/InstructionViewHolder;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockViewHolder;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction;", "instructionTextBlockView", "Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnInstructionTextBlockView;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnInstructionTextBlockView;Lru/ozon/app/android/composer/ComposerReferences;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "headerTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getHeaderTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "largeButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getLargeButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "adapter", "Lru/ozon/app/android/returns/listEmpty/presentation/instruction/adapter/InstructionAdapter;", "bindContent", "item", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstructionViewHolder extends TextBlockViewHolder<TextBlockVO.Instruction> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InstructionAdapter adapter;

    @NotNull
    private final ReturnInstructionTextBlockView instructionTextBlockView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstructionViewHolder(@NotNull ReturnInstructionTextBlockView instructionTextBlockView, @NotNull ComposerReferences refs) {
        super(instructionTextBlockView);
        Intrinsics.checkNotNullParameter(instructionTextBlockView, "instructionTextBlockView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.instructionTextBlockView = instructionTextBlockView;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        InstructionAdapter instructionAdapter = new InstructionAdapter(getActionHandler());
        this.adapter = instructionAdapter;
        RecyclerView textRecyclerView = instructionTextBlockView.getTextRecyclerView();
        textRecyclerView.addItemDecoration(new InstructionDecoration());
        textRecyclerView.setAdapter(instructionAdapter);
    }

    @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockViewHolder
    @NotNull
    protected Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockViewHolder
    @NotNull
    protected TextAtomView getHeaderTextAtomView() {
        return this.instructionTextBlockView.getHeaderTextAtomView();
    }

    @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockViewHolder
    @NotNull
    protected ImageView getImageView() {
        return this.instructionTextBlockView.getImageView();
    }

    @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockViewHolder
    @NotNull
    protected LargeButtonView getLargeButtonView() {
        return this.instructionTextBlockView.getLargeButtonView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockViewHolder
    public void bindContent(@NotNull TextBlockVO.Instruction item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.adapter.submitList(item.getItems());
    }
}
