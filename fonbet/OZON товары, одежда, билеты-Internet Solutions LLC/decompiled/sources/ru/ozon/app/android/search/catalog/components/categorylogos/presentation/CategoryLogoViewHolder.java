package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import AI.b;
import H2.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoVO;
import ru.ozon.app.android.search.databinding.ItemCategoryLogoBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoViewHolder;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/BaseCategoryLogoViewHolder;", "Lru/ozon/app/android/search/databinding/ItemCategoryLogoBinding;", "binding", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "adultDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "", "clickListener", "<init>", "(Lru/ozon/app/android/search/databinding/ItemCategoryLogoBinding;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "logo", "bindImage", "(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;)V", "bindText", "calculateTitleMaxLines", "()V", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "bind", "(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;)V", "onAttach", "onDetach", "onRecycle", "onViewInVisibleBounds", "Lru/ozon/app/android/search/databinding/ItemCategoryLogoBinding;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "", "itemWidth", "I", "Lnc/b;", "disposable", "Lnc/b;", "item", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryLogoViewHolder extends BaseCategoryLogoViewHolder {

    @NotNull
    private final AdultDelegate<CategoryLogoVO.Logo> adultDelegate;

    @NotNull
    private final ItemCategoryLogoBinding binding;

    @NotNull
    private final Function1<CategoryLogoVO.Logo, Unit> clickListener;
    private InterfaceC8487b disposable;
    private CategoryLogoVO.Logo item;
    private final int itemWidth;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CategoryLogoViewHolder(@NotNull ItemCategoryLogoBinding binding, @NotNull AdultDelegate<CategoryLogoVO.Logo> adultDelegate, @NotNull l tokenizedAnalytics, @NotNull Function1<? super CategoryLogoVO.Logo, Unit> clickListener) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.adultDelegate = adultDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.clickListener = clickListener;
        this.itemWidth = ResourceExtKt.toPx(124);
        binding.getConstraintLayout().setOnClickListener(new b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CategoryLogoViewHolder categoryLogoViewHolder, View view) {
        CategoryLogoVO.Logo logo = categoryLogoViewHolder.item;
        if (logo != null) {
            categoryLogoViewHolder.clickListener.invoke(logo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindImage(CategoryLogoVO.Logo logo) {
        int i11 = 0;
        if (logo.getShouldBlur()) {
            ImageView logoIv = this.binding.logoIv;
            Intrinsics.checkNotNullExpressionValue(logoIv, "logoIv");
            ImageViewExtKt.load$default(logoIv, logo.getImage(), C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.Blur(i11, i11, 3, null)), null, Integer.valueOf(R$drawable.ozon_image_placeholder), null, false, null, 116, null);
        } else {
            ImageView logoIv2 = this.binding.logoIv;
            Intrinsics.checkNotNullExpressionValue(logoIv2, "logoIv");
            ImageViewExtKt.load$default(logoIv2, logo.getImage(), null, null, null, null, false, null, 126, null);
        }
    }

    private final void bindText(CategoryLogoVO.Logo logo) {
        ItemCategoryLogoBinding itemCategoryLogoBinding = this.binding;
        String subtitle = logo.getSubtitle();
        if (subtitle == null || h.K(subtitle)) {
            TextView subtitleTv = itemCategoryLogoBinding.subtitleTv;
            Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
            ViewExtKt.gone(subtitleTv);
            itemCategoryLogoBinding.titleTv.setMaxLines(3);
            itemCategoryLogoBinding.titleTv.setText(logo.getTitle());
            return;
        }
        TextView subtitleTv2 = itemCategoryLogoBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv2, "subtitleTv");
        ViewExtKt.show(subtitleTv2);
        itemCategoryLogoBinding.subtitleTv.setText(logo.getSubtitle());
        calculateTitleMaxLines();
        itemCategoryLogoBinding.titleTv.setText(logo.getTitle());
    }

    private final void calculateTitleMaxLines() {
        ItemCategoryLogoBinding itemCategoryLogoBinding = this.binding;
        itemCategoryLogoBinding.subtitleTv.measure(View.MeasureSpec.makeMeasureSpec(this.itemWidth, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (itemCategoryLogoBinding.subtitleTv.getLineCount() == 1) {
            itemCategoryLogoBinding.titleTv.setMaxLines(2);
        } else {
            itemCategoryLogoBinding.titleTv.setMaxLines(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.search.catalog.components.categorylogos.presentation.BaseCategoryLogoViewHolder
    public void bind(@NotNull CategoryLogoVO logo) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        CategoryLogoVO.Logo logo2 = (CategoryLogoVO.Logo) logo;
        this.item = logo2;
        bindText(logo2);
        if (logo2.getIsAdult()) {
            this.adultDelegate.bindItem((AdultVO) logo);
        } else {
            bindImage(logo2);
        }
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        CategoryLogoVO.Logo logo = this.item;
        if (logo == null || !logo.getIsAdult()) {
            return;
        }
        this.disposable = this.adultDelegate.observeItem().subscribe(new c(new CategoryLogoViewHolder$onAttach$1(this), 1));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.adultDelegate.clear();
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
