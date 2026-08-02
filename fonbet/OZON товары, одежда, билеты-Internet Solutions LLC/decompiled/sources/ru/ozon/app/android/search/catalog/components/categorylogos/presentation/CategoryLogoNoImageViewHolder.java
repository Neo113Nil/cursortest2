package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import Lc0.e;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoVO;
import ru.ozon.app.android.search.databinding.ItemCategoryNoImageBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoNoImageViewHolder;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/BaseCategoryLogoViewHolder;", "Lru/ozon/app/android/search/databinding/ItemCategoryNoImageBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "", "clickListener", "<init>", "(Lru/ozon/app/android/search/databinding/ItemCategoryNoImageBinding;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "logo", "bind", "(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/search/databinding/ItemCategoryNoImageBinding;", "LWZ/l;", "item", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryLogoNoImageViewHolder extends BaseCategoryLogoViewHolder {

    @NotNull
    private final ItemCategoryNoImageBinding binding;
    private CategoryLogoVO.Logo item;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CategoryLogoNoImageViewHolder(@NotNull ItemCategoryNoImageBinding binding, @NotNull l tokenizedAnalytics, @NotNull Function1<? super CategoryLogoVO.Logo, Unit> clickListener) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        binding.getConstraintLayout().setOnClickListener(new e(1, this, clickListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CategoryLogoNoImageViewHolder categoryLogoNoImageViewHolder, Function1 function1, View view) {
        CategoryLogoVO.Logo logo = categoryLogoNoImageViewHolder.item;
        if (logo != null) {
            function1.invoke(logo);
        }
    }

    @Override // ru.ozon.app.android.search.catalog.components.categorylogos.presentation.BaseCategoryLogoViewHolder
    public void bind(@NotNull CategoryLogoVO logo) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        CategoryLogoVO.Logo logo2 = (CategoryLogoVO.Logo) logo;
        this.item = logo2;
        setIsRecyclable(false);
        this.binding.titleTv.setText(logo2.getTitle());
        TextView subtitleTv = this.binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        ViewExtKt.showOrGoneByPresence(subtitleTv, logo2.getSubtitle());
        this.binding.subtitleTv.setText(logo2.getSubtitle());
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        CategoryLogoVO.Logo logo = this.item;
        if (logo == null || (tokenizedEvent = logo.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
