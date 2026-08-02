package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import Sc.o;
import Ve.C4636t5;
import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoVO;
import ru.ozon.app.android.search.databinding.ItemCategoryButtonBinding;
import ru.ozon.app.android.search.databinding.ItemCategoryLogoBinding;
import ru.ozon.app.android.search.databinding.ItemCategoryNoImageBinding;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J#\u0010*\u001a\u00020\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R \u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00101R(\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/BaseCategoryLogoViewHolder;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "", "logoClick", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/BaseCategoryLogoViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/BaseCategoryLogoViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "items", "", "hideImage", "updateItems", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryLogosWidgetAdapter extends LifecycleAdapter<BaseCategoryLogoViewHolder> {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final FeatureChecker featureChecker;
    private boolean hideImage;

    @NotNull
    private List<? extends CategoryLogoVO> items;

    @NotNull
    private final Function1<CategoryLogoVO.Logo, Unit> logoClick;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final k<?> widgetViewHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CategoryLogosWidgetAdapter(@NotNull AdultHandler adultHandler, @NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull FeatureChecker featureChecker, @NotNull J containerViewLifecycleOwner, @NotNull Function1<? super CategoryLogoVO.Logo, Unit> logoClick) {
        super(containerViewLifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(logoClick, "logoClick");
        this.adultHandler = adultHandler;
        this.widgetViewHolder = widgetViewHolder;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.featureChecker = featureChecker;
        this.logoClick = logoClick;
        this.items = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        CategoryLogoVO categoryLogoVO = this.items.get(position);
        if (categoryLogoVO instanceof CategoryLogoVO.Logo) {
            return 0;
        }
        if (categoryLogoVO instanceof CategoryLogoVO.Button) {
            return 1;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseCategoryLogoViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType != 0) {
            if (viewType == 1) {
                ItemCategoryButtonBinding bind = ItemCategoryButtonBinding.bind(a11.inflate(R$layout.item_category_button, parent, false));
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                return new CategoryButtonViewHolder(bind, this.widgetViewHolder, this.composerReferences);
            }
            throw new IllegalStateException(("Unknown view type: " + viewType).toString());
        }
        if (this.hideImage) {
            ItemCategoryNoImageBinding bind2 = ItemCategoryNoImageBinding.bind(a11.inflate(R$layout.item_category_no_image, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind2, "bind(...)");
            return new CategoryLogoNoImageViewHolder(bind2, this.tokenizedAnalytics, this.logoClick);
        }
        ItemCategoryLogoBinding bind3 = ItemCategoryLogoBinding.bind(a11.inflate(R$layout.item_category_logo, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind3, "bind(...)");
        return new CategoryLogoViewHolder(bind3, new AdultDelegate(this.adultHandler, this.featureChecker), this.tokenizedAnalytics, this.logoClick);
    }

    public final void updateItems(@NotNull List<? extends CategoryLogoVO> items, boolean hideImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.hideImage = hideImage;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseCategoryLogoViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }
}
