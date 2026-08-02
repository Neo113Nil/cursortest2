package ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation;

import W10.c;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetSellerCategoryListBinding;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo.CategoryVO;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo.SellerCategoryListVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/SellerCategoryListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/CategoryVO;", "adultDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListAdapter;", "createAdapter", "()Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListAdapter;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/SellerCategoryListVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/SellerCategoryListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "adapter", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListAdapter;", "Lru/ozon/app/android/marketing/databinding/WidgetSellerCategoryListBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetSellerCategoryListBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerCategoryListViewHolder extends k<SellerCategoryListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SellerCategoryListAdapter adapter;

    @NotNull
    private final AdultDelegate<CategoryVO> adultDelegate;

    @NotNull
    private final WidgetSellerCategoryListBinding binding;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerCategoryListViewHolder(@NotNull View containerView, @NotNull AdultDelegate<CategoryVO> adultDelegate, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(references, "references");
        this.adultDelegate = adultDelegate;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        SellerCategoryListAdapter createAdapter = createAdapter();
        this.adapter = createAdapter;
        WidgetSellerCategoryListBinding bind = WidgetSellerCategoryListBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.sellerCategoriesRv.setAdapter(createAdapter);
    }

    private final SellerCategoryListAdapter createAdapter() {
        return new SellerCategoryListAdapter(this.actionHandler, this.adultDelegate, new SellerCategoryListDiffItemCallback(), this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerCategoryListVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getCategoryList());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SellerCategoryListVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
