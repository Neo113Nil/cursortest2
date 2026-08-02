package ru.ozon.app.android.pdp.view.crosssale;

import CG.c;
import GZ.g;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.PdpWidgetCrossSaleItemBinding;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.crosssale.data.CrossSaleDTO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/view/crosssale/CrossSaleListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetCrossSaleItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/pdp/databinding/PdpWidgetCrossSaleItemBinding;)V", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Image;", "imageDto", "", "hasStartMargin", "Landroid/view/View;", "getItemView", "(Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Image;Z)Landroid/view/View;", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem;", "item", "LGZ/g;", "router", "", "bind", "(Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem;LGZ/g;)V", "Lru/ozon/app/android/pdp/databinding/PdpWidgetCrossSaleItemBinding;", "LGZ/g;", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem;", "Landroid/graphics/drawable/Drawable;", "rippleDrawable", "Landroid/graphics/drawable/Drawable;", "colorDrawable", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossSaleListViewHolder extends RecyclerView.C {

    @NotNull
    private final PdpWidgetCrossSaleItemBinding binding;
    private final Drawable colorDrawable;
    private CrossSaleDTO.CrossSaleItem item;
    private final Drawable rippleDrawable;
    private g router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossSaleListViewHolder(@NotNull PdpWidgetCrossSaleItemBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.rippleDrawable = a.getDrawable(this.itemView.getContext(), R$drawable.bg_white_ripple_blue);
        this.colorDrawable = a.getDrawable(this.itemView.getContext(), R$color.bg_light_key);
        binding.itemCrossaleCl.setOnClickListener(new c(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CrossSaleListViewHolder crossSaleListViewHolder, View view) {
        CrossSaleDTO.CrossSaleItem crossSaleItem = crossSaleListViewHolder.item;
        if (crossSaleItem == null) {
            Intrinsics.n("item");
            throw null;
        }
        String deeplink = crossSaleItem.getDeeplink();
        if (deeplink != null) {
            g gVar = crossSaleListViewHolder.router;
            if (gVar != null) {
                g.a.a(gVar, deeplink, null, null, 6);
            } else {
                Intrinsics.n("router");
                throw null;
            }
        }
    }

    private final View getItemView(CrossSaleDTO.CrossSaleItem.Image imageDto, boolean hasStartMargin) {
        ImageView imageView = new ImageView(this.itemView.getContext());
        imageView.setId(View.generateViewId());
        Dimens dimens = Dimens.INSTANCE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimens.getDP_56(), dimens.getDP_56());
        if (hasStartMargin) {
            layoutParams.setMarginStart(dimens.getDP_8());
        }
        imageView.setLayoutParams(layoutParams);
        ImageViewExtKt.load$default(imageView, imageDto.getUrl(), C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(dimens.getDP_4(), null, 2, null)), null, null, null, false, null, 124, null);
        ThemeExtKt.setParandjaForDarkTheme(imageView);
        return imageView;
    }

    public final void bind(@NotNull CrossSaleDTO.CrossSaleItem item, @NotNull g router) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(router, "router");
        PdpWidgetCrossSaleItemBinding pdpWidgetCrossSaleItemBinding = this.binding;
        this.router = router;
        this.item = item;
        pdpWidgetCrossSaleItemBinding.titleTv.setText(item.getTitle());
        pdpWidgetCrossSaleItemBinding.subtitleTv.setText(item.getSubtitle());
        if (item.getSubitems() == null && item.getDeeplink() == null) {
            pdpWidgetCrossSaleItemBinding.itemCrossaleCl.setBackground(this.colorDrawable);
            ImageView disclosureIv = pdpWidgetCrossSaleItemBinding.disclosureIv;
            Intrinsics.checkNotNullExpressionValue(disclosureIv, "disclosureIv");
            ViewExtKt.gone(disclosureIv);
        } else {
            pdpWidgetCrossSaleItemBinding.itemCrossaleCl.setBackground(this.rippleDrawable);
            ImageView disclosureIv2 = pdpWidgetCrossSaleItemBinding.disclosureIv;
            Intrinsics.checkNotNullExpressionValue(disclosureIv2, "disclosureIv");
            ViewExtKt.show(disclosureIv2);
        }
        ConstraintLayout itemCrossaleCl = pdpWidgetCrossSaleItemBinding.itemCrossaleCl;
        Intrinsics.checkNotNullExpressionValue(itemCrossaleCl, "itemCrossaleCl");
        Flow containerFlow = pdpWidgetCrossSaleItemBinding.containerFlow;
        Intrinsics.checkNotNullExpressionValue(containerFlow, "containerFlow");
        ru.ozon.app.android.pdp.view.ViewExtKt.cleanUpFlow(itemCrossaleCl, containerFlow);
        List<CrossSaleDTO.CrossSaleItem.Image> images = item.getImages();
        if (images == null || images.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = pdpWidgetCrossSaleItemBinding.titleTv.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            Dimens dimens = Dimens.INSTANCE;
            ((ConstraintLayout.b) layoutParams).setMarginStart(dimens.getDP_16());
            ViewGroup.LayoutParams layoutParams2 = pdpWidgetCrossSaleItemBinding.subtitleTv.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.b) layoutParams2).setMarginStart(dimens.getDP_16());
            return;
        }
        List<CrossSaleDTO.CrossSaleItem.Image> images2 = item.getImages();
        ArrayList arrayList = new ArrayList(C7714v.z(images2, 10));
        int i11 = 0;
        for (Object obj : images2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(getItemView((CrossSaleDTO.CrossSaleItem.Image) obj, i11 > 0));
            i11 = i12;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pdpWidgetCrossSaleItemBinding.itemCrossaleCl.addView((View) it.next());
        }
        Flow flow = pdpWidgetCrossSaleItemBinding.containerFlow;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((View) it2.next()).getId()));
        }
        flow.setReferencedIds(C7714v.T0(arrayList2));
    }
}
