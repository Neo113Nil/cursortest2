package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.atom;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentAtomBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/atom/AtomItemVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentAtomBinding;", "binding", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentAtomBinding;)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentAtomBinding;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomItemVH extends RecyclerView.C {

    @NotNull
    private final ItemDeliveryReviewComponentAtomBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomItemVH(@NotNull ItemDeliveryReviewComponentAtomBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        SingleAtom singleAtom = binding.atomSA;
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        singleAtom.setDecorator(new AtomItemDecorator(context));
    }

    public final void bind(@NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        ItemDeliveryReviewComponentAtomBinding itemDeliveryReviewComponentAtomBinding = this.binding;
        SingleAtom atomSA = itemDeliveryReviewComponentAtomBinding.atomSA;
        Intrinsics.checkNotNullExpressionValue(atomSA, "atomSA");
        ViewExtKt.showOrGone(atomSA, Boolean.valueOf(!component.getHidden()));
        if (component.getHidden()) {
            return;
        }
        ElementVO element = component.getElement();
        ElementVO.Atom atom = element instanceof ElementVO.Atom ? (ElementVO.Atom) element : null;
        if (atom != null) {
            SingleAtom.bind$default(itemDeliveryReviewComponentAtomBinding.atomSA, atom.getAtom(), false, 2, null);
        }
    }
}
