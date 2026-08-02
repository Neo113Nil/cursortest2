package ru.ozon.app.android.sellerproducts.sellerProducts.secondarybutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.databinding.UwAtomCompositeButtonViewBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/UwButtonsContainerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonWidthWithMargin", "binding", "Lru/ozon/app/android/sellerproducts/databinding/UwAtomCompositeButtonViewBinding;", "currentAtomDto", "Lru/ozon/uni/atoms/data/AtomDTO;", "onLayout", "", "changed", "", "l", "t", "r", "b", "getSecondaryButton", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "bindSecondaryButton", "atom", "switchVisibilityIfNeedIt", "newVisibility", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UwButtonsContainerView extends LinearLayout {

    @NotNull
    private final UwAtomCompositeButtonViewBinding binding;
    private final int buttonWidthWithMargin;
    private AtomDTO currentAtomDto;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UwButtonsContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void switchVisibilityIfNeedIt(int newVisibility) {
        if (this.binding.secondaryProductButton.getVisibility() == newVisibility) {
            return;
        }
        this.binding.secondaryProductButton.setVisibility(newVisibility);
    }

    public final void bindSecondaryButton(AtomDTO atom) {
        this.currentAtomDto = atom;
        SingleAtom secondaryProductButton = this.binding.secondaryProductButton;
        Intrinsics.checkNotNullExpressionValue(secondaryProductButton, "secondaryProductButton");
        ContainerExtKt.bindOrGone$default(secondaryProductButton, atom, false, 2, null);
    }

    @NotNull
    public final SingleAtom getSecondaryButton() {
        SingleAtom secondaryProductButton = this.binding.secondaryProductButton;
        Intrinsics.checkNotNullExpressionValue(secondaryProductButton, "secondaryProductButton");
        return secondaryProductButton;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        if (this.currentAtomDto != null) {
            switchVisibilityIfNeedIt(getPaddingRight() + (getPaddingLeft() + (this.binding.productSa.getMeasuredWidth() + this.buttonWidthWithMargin)) > getMeasuredWidth() ? 8 : 0);
        }
        super.onLayout(changed, l11, t2, r11, b11);
    }

    public /* synthetic */ UwButtonsContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UwButtonsContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.buttonWidthWithMargin = ResourceExtKt.toPx(8) + ResourceExtKt.toPx(32);
        UwAtomCompositeButtonViewBinding inflate = UwAtomCompositeButtonViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setOrientation(0);
    }
}
