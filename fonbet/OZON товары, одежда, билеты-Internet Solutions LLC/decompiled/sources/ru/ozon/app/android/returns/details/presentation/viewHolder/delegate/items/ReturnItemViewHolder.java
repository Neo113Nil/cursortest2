package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.items;

import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.listed.gallery.GalleryHolderKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImageViewHolder;
import ru.ozon.app.android.returns.details.data.dto.ReturnItemsDto;
import ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.items.exemplarstates.ExemplarStatesAdapter;
import ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.items.exemplarstates.ExemplarStatesItemDecoration;
import ru.ozon.app.android.returns.details.presentation.viewObject.ReturnItemsVO;
import ru.ozon.app.android.returns.details.presentation.views.ReturnItemView;
import ru.ozon.app.android.returns.details.presentation.views.ReturnProductInfoView;
import ru.ozon.app.android.returns.details.presentation.views.ReturnReasonView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0011J\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/ReturnItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/returns/details/presentation/views/ReturnItemView;", "returnItemView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/returns/details/presentation/views/ReturnItemView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/returns/details/presentation/views/ReturnProductInfoView;", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "bind", "(Lru/ozon/app/android/returns/details/presentation/views/ReturnProductInfoView;Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;)V", "Lru/ozon/app/android/returns/details/presentation/views/ReturnReasonView;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "(Lru/ozon/app/android/returns/details/presentation/views/ReturnReasonView;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;)V", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ItemVO;", "item", "(Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ItemVO;)V", "Lru/ozon/app/android/returns/details/presentation/views/ReturnItemView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ItemVO;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "attributesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/exemplarstates/ExemplarStatesAdapter;", "exemplarStatesAdapter", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/exemplarstates/ExemplarStatesAdapter;", "", "containerRoundRadius", "F", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "imageHolder", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnItemViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter attributesAdapter;
    private final float containerRoundRadius;

    @NotNull
    private final ExemplarStatesAdapter exemplarStatesAdapter;

    @NotNull
    private final ImageViewHolder imageHolder;
    private ReturnItemsVO.ItemVO item;

    @NotNull
    private final ReturnItemView returnItemView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReturnItemViewHolder(@NotNull ReturnItemView returnItemView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(returnItemView);
        Intrinsics.checkNotNullParameter(returnItemView, "returnItemView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.returnItemView = returnItemView;
        this.actionHandler = actionHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.attributesAdapter = atomsAdapter;
        ExemplarStatesAdapter exemplarStatesAdapter = new ExemplarStatesAdapter();
        this.exemplarStatesAdapter = exemplarStatesAdapter;
        this.containerRoundRadius = ResourceExtKt.toPxF(16);
        this.imageHolder = new ImageViewHolder(returnItemView.getProductInfo().getItemImageBinding(), actionHandler);
        ReturnProductInfoView productInfo = returnItemView.getProductInfo();
        productInfo.getAttributesVerticalAtomsLayout().setAdapter(atomsAdapter);
        productInfo.getExemplarStatesRv().setAdapter(exemplarStatesAdapter);
        productInfo.getExemplarStatesRv().addItemDecoration(new ExemplarStatesItemDecoration());
        returnItemView.setClipToOutline(true);
        returnItemView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.items.ReturnItemViewHolder$2$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                int f11 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = ReturnItemViewHolder.this.containerRoundRadius;
                outline.setRoundRect(0, 0, f11, height, f7);
            }
        });
    }

    public final void bind(@NotNull ReturnItemsVO.ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ReturnItemView returnItemView = this.returnItemView;
        bind(returnItemView.getProductInfo(), item.getProductInfo());
        bind(returnItemView.getReturnReason(), item.getReturnReason());
    }

    private final void bind(ReturnProductInfoView returnProductInfoView, ReturnItemsVO.ProductInfoVO productInfoVO) {
        this.imageHolder.bind(productInfoVO.getItemImage());
        SmallBorderlessButtonView productLinkSmallBorderlessButtonView = returnProductInfoView.getProductLinkSmallBorderlessButtonView();
        WrappedBorderlessButtonHolderKt.bind(productLinkSmallBorderlessButtonView, productInfoVO.getProductLink(), this.actionHandler);
        productLinkSmallBorderlessButtonView.setSingleLine(false);
        productLinkSmallBorderlessButtonView.setMaxLines(2);
        productLinkSmallBorderlessButtonView.setGravity(8388627);
        SingleAtom.bind$default(returnProductInfoView.getPriceSingleAtom(), productInfoVO.getPrice(), false, 2, null);
        TextAtomHolderKt.bind$default(returnProductInfoView.getQuantityTextAtomView(), productInfoVO.getQuantity(), null, 2, null);
        List<TextAtom> attributes = productInfoVO.getAttributes();
        if (attributes != null) {
            AtomsAdapter atomsAdapter = this.attributesAdapter;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, attributes);
            ViewExtKt.show(returnProductInfoView.getAttributesVerticalAtomsLayout());
        } else {
            ViewExtKt.gone(returnProductInfoView.getAttributesVerticalAtomsLayout());
        }
        this.exemplarStatesAdapter.submitList(productInfoVO.getExemplarStates());
        returnProductInfoView.getExemplarStatesRv().setVisibility(productInfoVO.getExemplarStates() != null ? 0 : 8);
    }

    private final void bind(ReturnReasonView returnReasonView, ReturnItemsDto.ReturnReason returnReason) {
        TextAtomHolderKt.bind$default(returnReasonView.getReasonTextAtomView(), returnReason.getReason(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(returnReasonView.getCommentTextAtomView(), returnReason.getComment(), null, 2, null);
        returnReasonView.getPhotosGalleryView().gradientEnabled(false);
        GalleryHolderKt.bindOrGone$default(returnReasonView.getPhotosGalleryView(), returnReason.getPhotos(), null, 2, null);
    }
}
