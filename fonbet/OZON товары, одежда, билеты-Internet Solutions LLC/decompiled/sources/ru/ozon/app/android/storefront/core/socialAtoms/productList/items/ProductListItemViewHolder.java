package ru.ozon.app.android.storefront.core.socialAtoms.productList.items;

import Ax.ViewOnClickListenerC2451a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H$¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "VO", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "", "viewId", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/view/View;ILkotlin/jvm/functions/Function1;)V", "vo", "bind", "(Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;)V", "onBind", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "setAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Ljava/util/Map;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProductListItemViewHolder<VO extends ProductListItemVO> extends RecyclerView.C {
    private AtomActionDTO action;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductListItemViewHolder(@NotNull View view, int i11, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        view.setId(i11);
        view.setOnClickListener(new ViewOnClickListenerC2451a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ProductListItemViewHolder productListItemViewHolder, View view) {
        AtomAction atomAction;
        AtomActionDTO atomActionDTO = productListItemViewHolder.action;
        if (atomActionDTO == null || (atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, productListItemViewHolder.trackingInfo)) == null) {
            return;
        }
        productListItemViewHolder.onAction.invoke(atomAction);
    }

    public final void bind(@NotNull VO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.action = vo.getAction();
        this.trackingInfo = vo.getTrackingInfo();
        onBind(vo);
    }

    protected abstract void onBind(@NotNull VO vo);
}
