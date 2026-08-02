package ru.ozon.app.android.marketing.widgets.sellerCategoryList.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.SellerCategoryListViewHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListViewHolder;", "v", "Landroid/view/View;", "reference", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SellerCategoryListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SellerCategoryListViewHolder> {
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ FeatureChecker $featureChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerCategoryListViewMapper$holderProducer$1(AdultHandler adultHandler, FeatureChecker featureChecker) {
        super(2);
        this.$adultHandler = adultHandler;
        this.$featureChecker = featureChecker;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SellerCategoryListViewHolder invoke(View v11, ComposerReferences reference) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(reference, "reference");
        return new SellerCategoryListViewHolder(v11, new AdultDelegate(this.$adultHandler, this.$featureChecker), reference);
    }
}
