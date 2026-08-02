package ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item;

import JE.a;
import W10.c;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.CategoryMenuViewModel;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetCategoryMenuBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0019\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryMenuItemViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryItemVO;", "Lru/ozon/app/android/search/databinding/WidgetCategoryMenuBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/CategoryMenuViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/CategoryMenuViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryItemVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryMenuItemViewHolder extends BindingViewHolder<CategoryItemVO, WidgetCategoryMenuBinding> {
    public static final int $stable = ComposerReferences.$stable;

    @NotNull
    private final ComposerReferences composerReferences;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item.CategoryMenuItemViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetCategoryMenuBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetCategoryMenuBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetCategoryMenuBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetCategoryMenuBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetCategoryMenuBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryMenuItemViewHolder(@NotNull View containerView, @NotNull CategoryMenuViewModel viewModel, @NotNull ComposerReferences composerReferences) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
        this.itemView.setOnClickListener(new a(1, this, viewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(CategoryMenuItemViewHolder categoryMenuItemViewHolder, CategoryMenuViewModel categoryMenuViewModel, View view) {
        CategoryItemVO categoryItemVO = (CategoryItemVO) categoryMenuItemViewHolder.getBoundData();
        if (categoryItemVO != null) {
            t tokenizedEvent = categoryItemVO.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(categoryMenuItemViewHolder.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
            categoryMenuViewModel.setDeeplink(categoryItemVO.getCategoryUrl());
            InterfaceC7851b.a.a(categoryMenuItemViewHolder.composerReferences.getController(), categoryItemVO.getModalUrl(), null, null, null, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CategoryItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCategoryMenuBinding binding = getBinding();
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.updatePadding$default(itemView, item.getStartOffset(), 0, 0, 0, 14, null);
        binding.nameTv.setText(item.getName());
        binding.selectedV.setSelected(item.getIsSelected());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CategoryItemVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CategoryMenuItemViewHolder) item, trackingData, viewedPond);
        CategoryItemVO categoryItemVO = (CategoryItemVO) getBoundData();
        if (categoryItemVO == null || (tokenizedEvent = categoryItemVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }
}
