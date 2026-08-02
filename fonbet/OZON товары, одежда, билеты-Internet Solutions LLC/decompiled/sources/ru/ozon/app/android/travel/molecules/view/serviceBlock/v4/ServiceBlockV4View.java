package ru.ozon.app.android.travel.molecules.view.serviceBlock.v4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters.ServiceBlockV4Adapter;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters.ServiceBlockV4Decoration;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewServiceBlockV4Binding;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJE\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyAction;", "copyHandler", "bind", "(Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV4Binding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV4Binding;", "cachedCopyHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/adapters/ServiceBlockV4Adapter;", "listAdapter", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/adapters/ServiceBlockV4Adapter;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV4View extends ConstraintLayout {

    @NotNull
    private final ViewServiceBlockV4Binding binding;
    private Function1<? super ServiceBlockV4DTO.CopyAction, Unit> cachedCopyHandler;

    @NotNull
    private final ServiceBlockV4Adapter listAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceBlockV4View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull ServiceBlockV4VO item, Function1<? super AtomAction, Unit> onClick, Function1<? super ServiceBlockV4DTO.CopyAction, Unit> copyHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomView travelServiceBlockV4TitleTAV = this.binding.travelServiceBlockV4TitleTAV;
        Intrinsics.checkNotNullExpressionValue(travelServiceBlockV4TitleTAV, "travelServiceBlockV4TitleTAV");
        TextAtomHolderKt.bind$default(travelServiceBlockV4TitleTAV, item.getTitle(), null, 2, null);
        SmallButtonView travelServiceBlockV4ChangeServiceSBV = this.binding.travelServiceBlockV4ChangeServiceSBV;
        Intrinsics.checkNotNullExpressionValue(travelServiceBlockV4ChangeServiceSBV, "travelServiceBlockV4ChangeServiceSBV");
        WrappedButtonHolderKt.bindOrGone(travelServiceBlockV4ChangeServiceSBV, item.getChangeServiceButton(), onClick);
        TextAtomView travelServiceBlockV4DescriptionTAV = this.binding.travelServiceBlockV4DescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(travelServiceBlockV4DescriptionTAV, "travelServiceBlockV4DescriptionTAV");
        TextAtomHolderKt.bind$default(travelServiceBlockV4DescriptionTAV, item.getContent(), null, 2, null);
        boolean z11 = (item.getMoreAction() == null || onClick == null) ? false : true;
        SmallBorderlessButtonView moreActionSBBV = this.binding.moreActionSBBV;
        Intrinsics.checkNotNullExpressionValue(moreActionSBBV, "moreActionSBBV");
        moreActionSBBV.setVisibility(z11 ? 0 : 8);
        if (z11) {
            if (onClick == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (item.getMoreAction() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            SmallBorderlessButtonView moreActionSBBV2 = this.binding.moreActionSBBV;
            Intrinsics.checkNotNullExpressionValue(moreActionSBBV2, "moreActionSBBV");
            WrappedBorderlessButtonHolderKt.bind(moreActionSBBV2, item.getMoreAction(), onClick);
        }
        RecyclerView additionalListRV = this.binding.additionalListRV;
        Intrinsics.checkNotNullExpressionValue(additionalListRV, "additionalListRV");
        additionalListRV.setVisibility(item.getAdditionalListVisible() ? 0 : 8);
        this.listAdapter.setItems(item.getAdditionalList());
        this.cachedCopyHandler = copyHandler;
        Group travelServiceBlockV4PriceGroup = this.binding.travelServiceBlockV4PriceGroup;
        Intrinsics.checkNotNullExpressionValue(travelServiceBlockV4PriceGroup, "travelServiceBlockV4PriceGroup");
        travelServiceBlockV4PriceGroup.setVisibility(item.getPriceDescription() != null ? 0 : 8);
        ServiceBlockV4DTO.PriceDescription priceDescription = item.getPriceDescription();
        if (priceDescription != null) {
            PriceView travelServiceBlockV4PricePV = this.binding.travelServiceBlockV4PricePV;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV4PricePV, "travelServiceBlockV4PricePV");
            PriceHolderKt.bindOrGone$default(travelServiceBlockV4PricePV, priceDescription.getPrice(), null, 2, null);
            TextAtomView travelServiceBlockV4PriceSuffixTAV = this.binding.travelServiceBlockV4PriceSuffixTAV;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV4PriceSuffixTAV, "travelServiceBlockV4PriceSuffixTAV");
            TextAtomHolderKt.bindOrGone$default(travelServiceBlockV4PriceSuffixTAV, priceDescription.getTitle(), null, 2, null);
        }
        this.binding.travelServiceBlockV4BadgeListView.bindOrGone(item.getTravelBadgesList());
    }

    public /* synthetic */ ServiceBlockV4View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceBlockV4View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewServiceBlockV4Binding inflate = ViewServiceBlockV4Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        ServiceBlockV4Adapter serviceBlockV4Adapter = new ServiceBlockV4Adapter(new ServiceBlockV4View$listAdapter$1(this));
        this.listAdapter = serviceBlockV4Adapter;
        RecyclerView recyclerView = inflate.additionalListRV;
        recyclerView.setAdapter(serviceBlockV4Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new ServiceBlockV4Decoration(context));
    }
}
