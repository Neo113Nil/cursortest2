package ru.ozon.app.android.csma.tips.core.rv.v2;

import Cz.ViewOnClickListenerC2788a;
import Nk0.a;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.utils.EditTextExtKt;
import ru.ozon.app.android.csma.tips.databinding.ItemTipsInputBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.BaseCourierTipVI;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.CourierTipInput;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsMapper;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0018\u001a\u00020\u0013*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/csma/tips/core/rv/v2/TipItemInputV2ViewHolder;", "Lru/ozon/app/android/csma/tips/core/rv/v2/BaseTipsVH;", "containerView", "Landroid/view/View;", "viewModel", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "mapper", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "<init>", "(Landroid/view/View;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;)V", "binding", "Lru/ozon/app/android/csma/tips/databinding/ItemTipsInputBinding;", "item", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;", "textWatcher", "Landroid/text/TextWatcher;", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "onAttach", "", "onDetach", "bind", "tipItem", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "saveSetText", "Lcom/google/android/material/textfield/TextInputEditText;", "currentValue", "", "validate", "currentTips", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipItemInputV2ViewHolder extends BaseTipsVH {

    @NotNull
    private final ItemTipsInputBinding binding;
    private CourierTipInput item;

    @NotNull
    private final TipCourierDetailsMapper mapper;

    @NotNull
    private final View.OnFocusChangeListener onFocusChangeListener;
    private TextWatcher textWatcher;

    @NotNull
    private final TipCourierDetailsViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipItemInputV2ViewHolder(@NotNull View containerView, @NotNull TipCourierDetailsViewModel viewModel, @NotNull TipCourierDetailsMapper mapper) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.viewModel = viewModel;
        this.mapper = mapper;
        ItemTipsInputBinding bind = ItemTipsInputBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.textWatcher = new SimpleTextWatcher(new TipItemInputV2ViewHolder$textWatcher$1(this));
        this.onFocusChangeListener = new a(this, 1);
        TextInputEditText textInputEditText = bind.tipsEt;
        Intrinsics.f(textInputEditText);
        EditTextExtKt.setupBackgroundForSelect(textInputEditText);
        textInputEditText.setOnClickListener(new ViewOnClickListenerC2788a(textInputEditText, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(TextInputEditText textInputEditText, View view) {
        textInputEditText.setFocusableInTouchMode(true);
        textInputEditText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFocusChangeListener$lambda$0(TipItemInputV2ViewHolder tipItemInputV2ViewHolder, View view, boolean z11) {
        tipItemInputV2ViewHolder.viewModel.setInputActive(z11);
        if (z11) {
            Intrinsics.f(view);
            KeyboardUtilsKt.showKeyboard(view);
        } else {
            Intrinsics.f(view);
            KeyboardUtilsKt.hideKeyboard(view);
        }
    }

    private final void saveSetText(TextInputEditText textInputEditText, String str) {
        textInputEditText.removeTextChangedListener(this.textWatcher);
        if (!Intrinsics.d(str, String.valueOf(textInputEditText.getText()))) {
            textInputEditText.setText(str);
            textInputEditText.setSelection(str != null ? str.length() : 0);
        }
        textInputEditText.addTextChangedListener(this.textWatcher);
    }

    private final void validate(String currentTips) {
        TipCourierDetailsMapper tipCourierDetailsMapper = this.mapper;
        CourierTipInput courierTipInput = this.item;
        if (courierTipInput == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (tipCourierDetailsMapper.getError(courierTipInput, currentTips) == null) {
            this.binding.tipsTil.a0(false);
            return;
        }
        this.binding.tipsTil.a0(true);
        TextInputLayout textInputLayout = this.binding.tipsTil;
        TipCourierDetailsMapper tipCourierDetailsMapper2 = this.mapper;
        CourierTipInput courierTipInput2 = this.item;
        if (courierTipInput2 != null) {
            textInputLayout.Z(tipCourierDetailsMapper2.getError(courierTipInput2, currentTips));
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.csma.tips.core.rv.v2.BaseTipsVH
    public void bind(@NotNull BaseCourierTipVI tipItem) {
        Intrinsics.checkNotNullParameter(tipItem, "tipItem");
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        TextInputEditText textInputEditText = this.binding.tipsEt;
        textInputEditText.setOnFocusChangeListener(this.onFocusChangeListener);
        textInputEditText.addTextChangedListener(this.textWatcher);
        this.viewModel.getInputType().observe(this, new TipItemInputV2ViewHolder$onAttach$2(this));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        TextInputEditText textInputEditText = this.binding.tipsEt;
        textInputEditText.removeTextChangedListener(this.textWatcher);
        textInputEditText.setOnFocusChangeListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(CourierTipInput tipItem) {
        if (tipItem == null) {
            return;
        }
        this.item = tipItem;
        this.binding.tipsTil.d0(tipItem.getHint());
        String currentValue = tipItem.getCurrentValue();
        if (currentValue != null) {
            TextInputEditText tipsEt = this.binding.tipsEt;
            Intrinsics.checkNotNullExpressionValue(tipsEt, "tipsEt");
            saveSetText(tipsEt, currentValue);
            this.viewModel.setTipsAmount(this.mapper.toFormattedPrice(currentValue));
        }
        validate(tipItem.getCurrentValue());
        if (!tipItem.getIsSelected()) {
            this.binding.tipsEt.setFocusableInTouchMode(false);
            this.binding.tipsEt.clearFocus();
        } else {
            if (this.binding.tipsEt.isFocused()) {
                return;
            }
            this.binding.tipsEt.performClick();
        }
    }
}
