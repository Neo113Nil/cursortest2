package ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.configurator;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import gk0.p;
import gk0.q;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pdp.flags.ReviewsActionsFooterButtonsPreCreateCountFlag;
import ru.ozon.app.android.pdp.flags.ReviewsActionsFooterIconButtonsPreCreateCountFlag;
import ru.ozon.app.android.pdp.flags.ReviewsPreCreateCellViewFlag;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/configurator/ListReviewConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "onComposerInitialized", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListReviewConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FeatureService featureService;

    public ListReviewConfigurator(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        String componentCallbacksC5392m;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (componentCallbacksC5392m = c11.toString()) == null) {
            return;
        }
        r i11 = getContainer().i();
        q.f64554a.e(i11, componentCallbacksC5392m, C7714v.b0(new p(this.featureService.getIntKey(ReviewsPreCreateCellViewFlag.INSTANCE), new ListReviewConfigurator$onComposerInitialized$1$infos$1(i11)), new p(this.featureService.getIntKey(ReviewsActionsFooterIconButtonsPreCreateCountFlag.INSTANCE), new ListReviewConfigurator$onComposerInitialized$1$infos$2(i11)), new p(this.featureService.getIntKey(ReviewsActionsFooterButtonsPreCreateCountFlag.INSTANCE), new ListReviewConfigurator$onComposerInitialized$1$infos$3(i11))));
    }
}
