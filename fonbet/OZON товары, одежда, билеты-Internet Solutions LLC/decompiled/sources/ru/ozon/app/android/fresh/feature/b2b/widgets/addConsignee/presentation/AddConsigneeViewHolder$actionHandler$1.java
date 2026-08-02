package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddConsigneeBinding;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddConsigneeViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ AddConsigneeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewHolder$actionHandler$1(AddConsigneeViewHolder addConsigneeViewHolder) {
        super(1);
        this.this$0 = addConsigneeViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding;
        String inputText;
        AddConsigneeViewModel addConsigneeViewModel;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        AddConsigneeViewHolder addConsigneeViewHolder = this.this$0;
        widgetAddConsigneeBinding = addConsigneeViewHolder.binding;
        TextFieldCellView kppInput = widgetAddConsigneeBinding.kppInput;
        Intrinsics.checkNotNullExpressionValue(kppInput, "kppInput");
        inputText = addConsigneeViewHolder.getInputText(kppInput);
        if (!(action instanceof AtomAction.Refresh)) {
            return Boolean.FALSE;
        }
        addConsigneeViewModel = this.this$0.viewModel;
        if (AddConsigneeViewModel.allFieldsValid$default(addConsigneeViewModel, inputText, null, null, 6, null)) {
            composerReferences = this.this$0.references;
            InterfaceC7851b.a.a(composerReferences.getController(), d.e(((AtomAction.Refresh) action).getLink(), inputText), null, null, null, 14);
        }
        return Boolean.TRUE;
    }
}
