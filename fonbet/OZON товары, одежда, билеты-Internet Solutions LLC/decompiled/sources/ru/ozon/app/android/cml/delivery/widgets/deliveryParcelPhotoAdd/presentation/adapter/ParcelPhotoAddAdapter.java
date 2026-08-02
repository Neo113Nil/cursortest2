package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.adapter;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.view.ParcelPhotoAddItemView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\r2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R0\u0010.\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddAdapter;", "Ljk0/i;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddItemViewHolder;", "LWZ/l;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(LWZ/l;Landroidx/lifecycle/J;)V", "holder", "", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddItemViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddItemViewHolder;", "", "list", "submitList", "(Ljava/util/List;)V", "LWZ/l;", "itemWidth", "Ljava/lang/Integer;", "Lkotlin/Function0;", "onAddClick", "Lkotlin/jvm/functions/Function0;", "getOnAddClick", "()Lkotlin/jvm/functions/Function0;", "setOnAddClick", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "onDeleteClick", "Lkotlin/jvm/functions/Function1;", "getOnDeleteClick", "()Lkotlin/jvm/functions/Function1;", "setOnDeleteClick", "(Lkotlin/jvm/functions/Function1;)V", "onRetryClick", "getOnRetryClick", "setOnRetryClick", "onCancelClick", "getOnCancelClick", "setOnCancelClick", "Landroid/view/ViewGroup$LayoutParams;", "getItemLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "itemLayoutParams", "ParcelPhotoAddItemDiffCallback", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddAdapter extends i<ParcelPhotoAddVO.PickerItemVO, ParcelPhotoAddItemViewHolder> {
    private Integer itemWidth;
    private Function0<Unit> onAddClick;
    private Function1<? super String, Unit> onCancelClick;
    private Function1<? super String, Unit> onDeleteClick;
    private Function1<? super String, Unit> onRetryClick;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddAdapter$ParcelPhotoAddItemDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;)Z", "areContentsTheSame", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParcelPhotoAddItemDiffCallback extends i.d<ParcelPhotoAddVO.PickerItemVO> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ParcelPhotoAddVO.PickerItemVO oldItem, @NotNull ParcelPhotoAddVO.PickerItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (!(oldItem instanceof ParcelPhotoAddVO.PhotoVO) || !(newItem instanceof ParcelPhotoAddVO.PhotoVO)) {
                return true;
            }
            ParcelPhotoAddVO.PhotoVO photoVO = (ParcelPhotoAddVO.PhotoVO) oldItem;
            ParcelPhotoAddVO.PhotoVO photoVO2 = (ParcelPhotoAddVO.PhotoVO) newItem;
            return Intrinsics.d(photoVO.getPhoto(), photoVO2.getPhoto()) && Intrinsics.d(photoVO.getImage(), photoVO2.getImage());
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ParcelPhotoAddVO.PickerItemVO oldItem, @NotNull ParcelPhotoAddVO.PickerItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof ParcelPhotoAddVO.PickerVO) && (newItem instanceof ParcelPhotoAddVO.PickerVO)) {
                return true;
            }
            if ((oldItem instanceof ParcelPhotoAddVO.EmptyVO) && (newItem instanceof ParcelPhotoAddVO.EmptyVO)) {
                return true;
            }
            return (oldItem instanceof ParcelPhotoAddVO.PhotoVO) && (newItem instanceof ParcelPhotoAddVO.PhotoVO) && Intrinsics.d(((ParcelPhotoAddVO.PhotoVO) oldItem).getPhoto().getPhotoKey(), ((ParcelPhotoAddVO.PhotoVO) newItem).getPhoto().getPhotoKey());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelPhotoAddAdapter(@NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(new ParcelPhotoAddItemDiffCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final ViewGroup.LayoutParams getItemLayoutParams() {
        Integer num = this.itemWidth;
        return new ViewGroup.LayoutParams(num != null ? num.intValue() : 0, -2);
    }

    public final Function0<Unit> getOnAddClick() {
        return this.onAddClick;
    }

    public final Function1<String, Unit> getOnCancelClick() {
        return this.onCancelClick;
    }

    public final Function1<String, Unit> getOnDeleteClick() {
        return this.onDeleteClick;
    }

    public final Function1<String, Unit> getOnRetryClick() {
        return this.onRetryClick;
    }

    public final void setOnAddClick(Function0<Unit> function0) {
        this.onAddClick = function0;
    }

    public final void setOnCancelClick(Function1<? super String, Unit> function1) {
        this.onCancelClick = function1;
    }

    public final void setOnDeleteClick(Function1<? super String, Unit> function1) {
        this.onDeleteClick = function1;
    }

    public final void setOnRetryClick(Function1<? super String, Unit> function1) {
        this.onRetryClick = function1;
    }

    @Override // androidx.recyclerview.widget.t
    public void submitList(List<ParcelPhotoAddVO.PickerItemVO> list) {
        ParcelPhotoAddVO.PickerItemVO pickerItemVO;
        ImageDTO image;
        Integer imageWidth;
        if (this.itemWidth == null) {
            this.itemWidth = (list == null || (pickerItemVO = (ParcelPhotoAddVO.PickerItemVO) C7714v.M(list)) == null || (image = pickerItemVO.getImage()) == null || (imageWidth = image.getImageWidth()) == null) ? null : Integer.valueOf(Dimens.INSTANCE.getDp6() + UiExtKt.toPx(imageWidth.intValue()));
        }
        super.submitList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ParcelPhotoAddItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ParcelPhotoAddVO.PickerItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ParcelPhotoAddItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ParcelPhotoAddItemViewHolder parcelPhotoAddItemViewHolder = new ParcelPhotoAddItemViewHolder(new ParcelPhotoAddItemView(context), this.tokenizedAnalytics, new ParcelPhotoAddAdapter$onCreateViewHolder$1(this), new ParcelPhotoAddAdapter$onCreateViewHolder$2(this), new ParcelPhotoAddAdapter$onCreateViewHolder$3(this), new ParcelPhotoAddAdapter$onCreateViewHolder$4(this));
        parcelPhotoAddItemViewHolder.itemView.setLayoutParams(getItemLayoutParams());
        return parcelPhotoAddItemViewHolder;
    }
}
