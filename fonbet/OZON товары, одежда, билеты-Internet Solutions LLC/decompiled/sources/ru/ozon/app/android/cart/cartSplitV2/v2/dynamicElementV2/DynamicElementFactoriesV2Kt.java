package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/v3/AtomV3;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Landroid/view/ViewGroup$MarginLayoutParams;", "layoutParams", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "createVHV2", "(Lru/ozon/uni/atoms/v3/AtomV3;Lkotlin/jvm/functions/Function1;Landroid/view/ViewGroup$MarginLayoutParams;)Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementFactoriesV2Kt {
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    @NotNull
    public static final AtomItemViewHolder createVHV2(@NotNull AtomV3<?, ?> atomV3, Function1<? super AtomAction, Unit> function1, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkNotNullParameter(atomV3, "<this>");
        atomV3.setOnAtomAction(function1);
        ?? containerView = atomV3.getContainerView();
        if (marginLayoutParams == null) {
            marginLayoutParams = UtilsKt.createDefaultMarginLayoutParams();
        }
        containerView.setLayoutParams(marginLayoutParams);
        return new AtomItemViewHolder(atomV3, null, null);
    }

    public static /* synthetic */ AtomItemViewHolder createVHV2$default(AtomV3 atomV3, Function1 function1, ViewGroup.MarginLayoutParams marginLayoutParams, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            marginLayoutParams = null;
        }
        return createVHV2(atomV3, function1, marginLayoutParams);
    }
}
