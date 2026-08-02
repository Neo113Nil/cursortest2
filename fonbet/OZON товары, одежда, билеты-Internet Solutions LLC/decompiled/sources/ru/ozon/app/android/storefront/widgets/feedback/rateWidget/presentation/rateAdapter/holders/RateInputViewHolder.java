package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.databinding.WidgetRateInputItemBinding;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateSectionDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateInputViewHolder;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateBaseViewHolder;", "Landroid/view/View;", "containerView", "Lkotlin/Function2;", "", "", "onTextChanged", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;)V", "onCreateViewHolder", "()V", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "item", "", "position", "bindItem", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;I)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionTextInput;", "currentItem", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionTextInput;", "Lru/ozon/app/android/storefront/databinding/WidgetRateInputItemBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetRateInputItemBinding;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateInputViewHolder extends RateBaseViewHolder<View> {

    @NotNull
    private final WidgetRateInputItemBinding binding;

    @NotNull
    private final View containerView;
    private RateSection.RequiredSection.SectionTextInput currentItem;

    @NotNull
    private final Function2<String, String, Unit> onTextChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RateInputViewHolder(@NotNull View containerView, @NotNull Function2<? super String, ? super String, Unit> onTextChanged) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        this.containerView = containerView;
        this.onTextChanged = onTextChanged;
        WidgetRateInputItemBinding bind = WidgetRateInputItemBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void bindItem(@NotNull RateSection item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof RateSection.RequiredSection.SectionTextInput) {
            RateSection.RequiredSection.SectionTextInput sectionTextInput = (RateSection.RequiredSection.SectionTextInput) item;
            this.currentItem = sectionTextInput;
            WidgetRateInputItemBinding widgetRateInputItemBinding = this.binding;
            widgetRateInputItemBinding.rateInputTil.d0(sectionTextInput.getPlaceholder());
            widgetRateInputItemBinding.rateInputEt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(sectionTextInput.getMaxCharactersNumber())});
            widgetRateInputItemBinding.rateInputEt.setInputType(147457);
            getContainerView().setContentDescription(RateSectionDTO.TEXT_INPUT_SECTION + position);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder
    public void onCreateViewHolder() {
        TextInputEditText rateInputEt = this.binding.rateInputEt;
        Intrinsics.checkNotNullExpressionValue(rateInputEt, "rateInputEt");
        rateInputEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateInputViewHolder$onCreateViewHolder$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                RateSection.RequiredSection.SectionTextInput sectionTextInput;
                String key;
                Function2 function2;
                String str;
                sectionTextInput = RateInputViewHolder.this.currentItem;
                if (sectionTextInput == null || (key = sectionTextInput.getKey()) == null) {
                    return;
                }
                function2 = RateInputViewHolder.this.onTextChanged;
                if (s11 == null || (str = s11.toString()) == null) {
                    str = "";
                }
                function2.invoke(key, str);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }
}
