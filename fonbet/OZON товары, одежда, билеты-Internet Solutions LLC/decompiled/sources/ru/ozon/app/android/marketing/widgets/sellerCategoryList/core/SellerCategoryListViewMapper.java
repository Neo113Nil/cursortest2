package ru.ozon.app.android.marketing.widgets.sellerCategoryList.core;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.data.SellerCategoryListDTO;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.SellerCategoryListViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo.SellerCategoryListVO;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/data/SellerCategoryListDTO;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/SellerCategoryListVO;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "mapper", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerCategoryListViewMapper extends WidgetViewMapper<SellerCategoryListDTO, SellerCategoryListVO> {

    @NotNull
    private final Function2<View, ComposerReferences, SellerCategoryListViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final SellerCategoryListMapper mapper;

    public SellerCategoryListViewMapper(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.mapper = new SellerCategoryListMapper();
        this.layout = R$layout.widget_seller_category_list;
        this.holderProducer = new SellerCategoryListViewMapper$holderProducer$1(adultHandler, featureChecker);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SellerCategoryListVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SellerCategoryListDTO, d, List<SellerCategoryListVO>> getMapper() {
        return this.mapper;
    }
}
