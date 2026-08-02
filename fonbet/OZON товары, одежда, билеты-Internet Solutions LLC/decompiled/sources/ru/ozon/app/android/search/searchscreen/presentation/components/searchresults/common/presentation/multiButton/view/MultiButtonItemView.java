package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.extensions.AttrsExtensionKt;
import ru.ozon.app.android.search.R$styleable;
import ru.ozon.app.android.search.databinding.MultiButtonItemViewBinding;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/MultiButtonItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/search/databinding/MultiButtonItemViewBinding;", "getButtonView", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getFooterView", "onRecycle", "", "changeButtonWidth", "buttonWidth", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MultiButtonItemView extends LinearLayout {

    @NotNull
    private final MultiButtonItemViewBinding binding;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/res/TypedArray;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.MultiButtonItemView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<TypedArray, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypedArray typedArray) {
            invoke2(typedArray);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TypedArray it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MultiButtonItemView.this.changeButtonWidth(it.getInt(R$styleable.MultiButtonItemView_buttonWidth, 0));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiButtonItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeButtonWidth(int buttonWidth) {
        getButtonView().getLayoutParams().width = buttonWidth != 0 ? buttonWidth != 1 ? getButtonView().getLayoutParams().width : -1 : -2;
    }

    @NotNull
    public final SingleAtom getButtonView() {
        SingleAtom multiButtonButtonView = this.binding.multiButtonButtonView;
        Intrinsics.checkNotNullExpressionValue(multiButtonButtonView, "multiButtonButtonView");
        return multiButtonButtonView;
    }

    @NotNull
    public final SingleAtom getFooterView() {
        SingleAtom multiButtonFooter = this.binding.multiButtonFooter;
        Intrinsics.checkNotNullExpressionValue(multiButtonFooter, "multiButtonFooter");
        return multiButtonFooter;
    }

    public final void onRecycle() {
        getButtonView().onRecycle();
        getFooterView().onRecycle();
    }

    public /* synthetic */ MultiButtonItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiButtonItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        MultiButtonItemViewBinding inflate = MultiButtonItemViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setOrientation(1);
        if (attributeSet != null) {
            int[] MultiButtonItemView = R$styleable.MultiButtonItemView;
            Intrinsics.checkNotNullExpressionValue(MultiButtonItemView, "MultiButtonItemView");
            AttrsExtensionKt.obtain(attributeSet, context, MultiButtonItemView, i11, new AnonymousClass1());
        }
    }
}
