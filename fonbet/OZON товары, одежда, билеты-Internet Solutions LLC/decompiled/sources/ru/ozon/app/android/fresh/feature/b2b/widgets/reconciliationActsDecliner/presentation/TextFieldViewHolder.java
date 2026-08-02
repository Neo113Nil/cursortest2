package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import android.content.Context;
import android.text.Editable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetReconciliationActsDeclinerTextFieldItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0006*\u0001\u001a\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetReconciliationActsDeclinerTextFieldItemBinding;", "binding", "Lkotlin/Function2;", "", "", "", "onTextChangedListener", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetReconciliationActsDeclinerTextFieldItemBinding;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;", "item", "bindInputField", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "hideError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)V", "errorText", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;)V", "position", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;I)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetReconciliationActsDeclinerTextFieldItemBinding;", "Lkotlin/jvm/functions/Function2;", "ru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldViewHolder$inputTextWatcher$1", "inputTextWatcher", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldViewHolder$inputTextWatcher$1;", "currentItemPosition", "Ljava/lang/Integer;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextFieldViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetReconciliationActsDeclinerTextFieldItemBinding binding;
    private Integer currentItemPosition;

    @NotNull
    private final TextFieldViewHolder$inputTextWatcher$1 inputTextWatcher;

    @NotNull
    private final Function2<String, Integer, Unit> onTextChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.TextFieldViewHolder$inputTextWatcher$1] */
    public TextFieldViewHolder(@NotNull WidgetReconciliationActsDeclinerTextFieldItemBinding binding, @NotNull Function2<? super String, ? super Integer, Unit> onTextChangedListener) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onTextChangedListener, "onTextChangedListener");
        this.binding = binding;
        this.onTextChangedListener = onTextChangedListener;
        this.inputTextWatcher = new OzonTextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.TextFieldViewHolder$inputTextWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable text) {
                Function2 function2;
                Integer num;
                function2 = TextFieldViewHolder.this.onTextChangedListener;
                String valueOf = String.valueOf(text);
                num = TextFieldViewHolder.this.currentItemPosition;
                function2.invoke(valueOf, num);
            }
        };
        TextFieldCellView textFieldCellView = binding.inputField;
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setMainAddonSettings(MainAddonSettings.copy$default(textFieldCellView.getMainAddonSettings(), null, null, null, null, null, Dimens.INSTANCE.getDP_4(), 0, null, null, null, 991, null));
    }

    private final void bindInputField(ReconciliationActsDeclinerVO.TextField item) {
        TextFieldCellView textFieldCellView = this.binding.inputField;
        textFieldCellView.setInputLabelText(item.getPlaceholder());
        textFieldCellView.setInputText(item.getValue());
        textFieldCellView.getMainView().setTextWatcher(this.inputTextWatcher);
        if (item.getHasError()) {
            showError(textFieldCellView, item.getErrorRequiredText());
        } else {
            hideError(textFieldCellView);
        }
    }

    private final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    private final void showError(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.setLabelText(str);
    }

    public final void bind(@NotNull ReconciliationActsDeclinerVO.TextField item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetReconciliationActsDeclinerTextFieldItemBinding widgetReconciliationActsDeclinerTextFieldItemBinding = this.binding;
        this.currentItemPosition = Integer.valueOf(position);
        TextAtomV2View title = widgetReconciliationActsDeclinerTextFieldItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getTitle(), null, 2, null);
        bindInputField(item);
    }
}
