package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv;

import CC.a;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.databinding.ItemTipsInputBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv.TipReviewItemInputV2ViewHolder;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/TipReviewItemInputV2ViewHolder;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/rv/BaseTipsReviewVH;", "containerView", "Landroid/view/View;", "viewModel", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "mapper", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;", "<init>", "(Landroid/view/View;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;)V", "binding", "Lru/ozon/app/android/csma/tips/databinding/ItemTipsInputBinding;", "item", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$CourierTipInput;", "textWatcher", "Landroid/text/TextWatcher;", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "onAttach", "", "onDetach", "bind", "tipItem", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "validate", "currentTips", "", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipReviewItemInputV2ViewHolder extends BaseTipsReviewVH {

    @NotNull
    private final ItemTipsInputBinding binding;
    private TipCourierReviewVO.CourierTipInput item;

    @NotNull
    private final TipCourierReviewMapper mapper;

    @NotNull
    private final View.OnFocusChangeListener onFocusChangeListener;
    private TextWatcher textWatcher;

    @NotNull
    private final TipCourierReviewViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipReviewItemInputV2ViewHolder(@NotNull View containerView, @NotNull TipCourierReviewViewModel viewModel, @NotNull TipCourierReviewMapper mapper) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.viewModel = viewModel;
        this.mapper = mapper;
        ItemTipsInputBinding bind = ItemTipsInputBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.textWatcher = new SimpleTextWatcher(new TipReviewItemInputV2ViewHolder$textWatcher$1(this));
        this.onFocusChangeListener = new View.OnFocusChangeListener() { // from class: ms.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                TipReviewItemInputV2ViewHolder.onFocusChangeListener$lambda$0(TipReviewItemInputV2ViewHolder.this, view, z11);
            }
        };
        TextInputEditText textInputEditText = bind.tipsEt;
        textInputEditText.setOnClickListener(new a(textInputEditText, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(TextInputEditText textInputEditText, View view) {
        textInputEditText.setFocusable(true);
        textInputEditText.setFocusableInTouchMode(true);
        textInputEditText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFocusChangeListener$lambda$0(TipReviewItemInputV2ViewHolder tipReviewItemInputV2ViewHolder, View view, boolean z11) {
        tipReviewItemInputV2ViewHolder.viewModel.setInputActive(z11);
        if (z11) {
            Intrinsics.f(view);
            KeyboardUtilsKt.showKeyboard(view);
        } else {
            Intrinsics.f(view);
            KeyboardUtilsKt.hideKeyboard(view);
        }
    }

    private final void validate(String currentTips) {
        TextInputLayout textInputLayout = this.binding.tipsTil;
        TipCourierReviewMapper tipCourierReviewMapper = this.mapper;
        TipCourierReviewVO.CourierTipInput courierTipInput = this.item;
        if (courierTipInput != null) {
            textInputLayout.Z(tipCourierReviewMapper.getError(courierTipInput, currentTips));
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.rv.BaseTipsReviewVH
    public void bind(@NotNull TipCourierReviewVO.BaseCourierTipVO tipItem) {
        Intrinsics.checkNotNullParameter(tipItem, "tipItem");
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        TextInputEditText textInputEditText = this.binding.tipsEt;
        textInputEditText.setOnFocusChangeListener(this.onFocusChangeListener);
        textInputEditText.addTextChangedListener(this.textWatcher);
        this.viewModel.getInputType().observe(this, new TipReviewItemInputV2ViewHolder$onAttach$2(this));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        TextInputEditText textInputEditText = this.binding.tipsEt;
        textInputEditText.removeTextChangedListener(this.textWatcher);
        textInputEditText.setOnFocusChangeListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(TipCourierReviewVO.CourierTipInput tipItem) {
        if (tipItem == null) {
            return;
        }
        this.item = tipItem;
        this.binding.tipsTil.d0(tipItem.getHint());
        validate(tipItem.getCurrentValue());
        TextInputEditText textInputEditText = this.binding.tipsEt;
        if (tipItem.getIsSelected()) {
            if (textInputEditText.isFocused()) {
                return;
            }
            textInputEditText.performClick();
        } else {
            textInputEditText.setFocusable(false);
            textInputEditText.setFocusableInTouchMode(false);
            textInputEditText.clearFocus();
        }
    }
}
