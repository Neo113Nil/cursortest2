package ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.reviewBlock;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsReviewBlockBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO$ReviewBlockVO;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsReviewBlockBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReviewBlockAdapterDelegateKt$reviewBlockAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<ReviewVO.ReviewBlockVO, ItemHotelsReviewBlockBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.reviewBlock.ReviewBlockAdapterDelegateKt$reviewBlockAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $onAction;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ReviewVO.ReviewBlockVO, ItemHotelsReviewBlockBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<ReviewVO.ReviewBlockVO, ItemHotelsReviewBlockBinding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            String str;
            Intrinsics.checkNotNullParameter(it, "it");
            ReviewVO.ReviewBlockVO item = this.$this_adapterDelegateViewBinding.getItem();
            final AdapterDelegateViewBindingViewHolder<ReviewVO.ReviewBlockVO, ItemHotelsReviewBlockBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            final Function1<AtomAction, Unit> function1 = this.$onAction;
            final ReviewVO.ReviewBlockVO reviewBlockVO = item;
            TextAtomView hotelsReviewBlockTitleTav = adapterDelegateViewBindingViewHolder.getBinding().hotelsReviewBlockTitleTav;
            Intrinsics.checkNotNullExpressionValue(hotelsReviewBlockTitleTav, "hotelsReviewBlockTitleTav");
            TextAtomHolderKt.bind$default(hotelsReviewBlockTitleTav, reviewBlockVO.getTitle(), null, 2, null);
            AppCompatTextView appCompatTextView = adapterDelegateViewBindingViewHolder.getBinding().hotelsReviewBlockTextTv;
            if (reviewBlockVO.getHasSpan()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reviewBlockVO.getText());
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.reviewBlock.ReviewBlockAdapterDelegateKt$reviewBlockAdapterDelegate$2$1$1$clickableSpan$1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View widget) {
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        AtomAction spanAtomAction = reviewBlockVO.getSpanAtomAction();
                        if (spanAtomAction != null) {
                            function1.invoke(spanAtomAction);
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint ds) {
                        Intrinsics.checkNotNullParameter(ds, "ds");
                        ds.setColor(ThemeExtKt.themeColor(adapterDelegateViewBindingViewHolder.getContext(), R$attr.textAction));
                        ds.setUnderlineText(false);
                    }
                }, reviewBlockVO.getSpanStartIndex(), reviewBlockVO.getSpanEndIndex(), 33);
                str = spannableStringBuilder;
            } else {
                str = reviewBlockVO.getText();
            }
            appCompatTextView.setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewBlockAdapterDelegateKt$reviewBlockAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<ReviewVO.ReviewBlockVO, ItemHotelsReviewBlockBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<ReviewVO.ReviewBlockVO, ItemHotelsReviewBlockBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.getBinding().hotelsReviewBlockTextTv.setMovementMethod(LinkMovementMethod.getInstance());
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onAction));
    }
}
