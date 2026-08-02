package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.rv;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsVO;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterBrandAspectItemBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B7\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectAdapter;", "Ljk0/i;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "customRefreshHandler", "trackClick", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandAspectAdapter extends i<BrandAspectsVO.AspectBrand, BrandAspectItemViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> customRefreshHandler;

    @NotNull
    private final Function1<BrandAspectsVO.AspectBrand, Unit> trackClick;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectAdapter$Companion;", "", "<init>", "()V", "MAX_WIDTH_COEFFICIENT", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrandAspectAdapter(@NotNull Function1<? super AtomAction, Unit> customRefreshHandler, @NotNull Function1<? super BrandAspectsVO.AspectBrand, Unit> trackClick, @NotNull J lifecycleOwner) {
        super(new BrandAspectDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(trackClick, "trackClick");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.customRefreshHandler = customRefreshHandler;
        this.trackClick = trackClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BrandAspectItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BrandAspectsVO.AspectBrand aspectBrand = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(aspectBrand, "get(...)");
        holder.bind(aspectBrand);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BrandAspectItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FilterBrandAspectItemBinding inflate = FilterBrandAspectItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new BrandAspectItemViewHolder(inflate, this.customRefreshHandler, (int) (parent.getMeasuredWidth() * 0.6666667f), this.trackClick);
    }
}
