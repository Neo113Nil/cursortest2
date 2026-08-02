package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.rv;

import Eb0.a;
import android.view.View;
import com.google.android.flexbox.FlexboxLayoutManager;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsVO;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterBrandAspectItemBinding;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "customRefreshHandler", "", "itemWidth", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;", "trackClick", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectItemBinding;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/aspect/AspectView;", "", "scrollEnabled", "updateMaxWidthIfNeeded", "(Lru/ozon/uni/android/atom/aspect/AspectView;Z)V", "aspectBrand", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;)Lru/ozon/uni/android/atom/aspect/AspectView;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectItemBinding;", "getBinding", "()Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectItemBinding;", "Lkotlin/jvm/functions/Function1;", "getCustomRefreshHandler", "()Lkotlin/jvm/functions/Function1;", "I", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandAspectItemViewHolder extends j {
    private AtomAction action;

    @NotNull
    private final FilterBrandAspectItemBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> customRefreshHandler;
    private final int itemWidth;

    @NotNull
    private final Function1<BrandAspectsVO.AspectBrand, Unit> trackClick;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrandAspectItemViewHolder(@NotNull FilterBrandAspectItemBinding binding, @NotNull Function1<? super AtomAction, Unit> customRefreshHandler, int i11, @NotNull Function1<? super BrandAspectsVO.AspectBrand, Unit> trackClick) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(trackClick, "trackClick");
        AspectView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customRefreshHandler = customRefreshHandler;
        this.itemWidth = i11;
        this.trackClick = trackClick;
        AspectView aspectView = binding.aspectContainer;
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        bVar.f(i11);
        aspectView.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3$lambda$2(BrandAspectsVO.AspectBrand aspectBrand, BrandAspectItemViewHolder brandAspectItemViewHolder, View view) {
        AtomAction action = aspectBrand.getAction();
        if (action != null) {
            brandAspectItemViewHolder.customRefreshHandler.invoke(action);
        }
        brandAspectItemViewHolder.trackClick.invoke(aspectBrand);
    }

    private final void updateMaxWidthIfNeeded(AspectView aspectView, boolean z11) {
        if (z11) {
            return;
        }
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        bVar.f(this.itemWidth);
        aspectView.setLayoutParams(bVar);
    }

    @NotNull
    public final AspectView bind(@NotNull BrandAspectsVO.AspectBrand aspectBrand) {
        Intrinsics.checkNotNullParameter(aspectBrand, "aspectBrand");
        FilterBrandAspectItemBinding filterBrandAspectItemBinding = this.binding;
        AspectView constraintLayout = filterBrandAspectItemBinding.getConstraintLayout();
        TestInfo testInfo = aspectBrand.getTestInfo();
        String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
        AspectDTO.AspectState state = aspectBrand.getAspect().getState();
        constraintLayout.setContentDescription(automatizationId + "-" + (state != null ? state.name() : null));
        IconView brandIv = filterBrandAspectItemBinding.brandIv;
        Intrinsics.checkNotNullExpressionValue(brandIv, "brandIv");
        IconHolderKt.bindOrGone$default(brandIv, aspectBrand.getIcon(), null, 2, null);
        filterBrandAspectItemBinding.brandTitle.setText(aspectBrand.getTitle());
        this.action = aspectBrand.getAction();
        AspectView aspectView = filterBrandAspectItemBinding.aspectContainer;
        Intrinsics.f(aspectView);
        updateMaxWidthIfNeeded(aspectView, aspectBrand.getScrollEnabled());
        AspectHolderKt.bind$default(aspectView, aspectBrand.getAspect(), null, 2, null);
        aspectView.setOnClickListener(new a(1, aspectBrand, this));
        Intrinsics.checkNotNullExpressionValue(aspectView, "with(...)");
        return aspectView;
    }
}
