package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import A00.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ProductRateUpdate;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "", "reviewFormHeaderV2Widget", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormHeaderV2WidgetKt {
    public static final void reviewFormHeaderV2Widget(@NotNull e<Object, ReviewFormHeaderV2VO> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C7475g widgetComponentStorage = eVar.getWidgetComponentStorage();
        ReviewFormComponent reviewFormComponent = (ReviewFormComponent) widgetComponentStorage.getComponent(ReviewFormComponent.class);
        eVar.i(ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$1.INSTANCE, new ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$2(reviewFormComponent));
        eVar.c().put(ProductRateUpdate.class, new c.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$$inlined$update$1
            @Override // ru.ozon.composer.compose.widget.c.a
            public final I handle(a.J.InterfaceC0007a update, I old) {
                ReviewFormHeaderV2VO copy;
                Intrinsics.checkNotNullParameter(update, "update");
                Intrinsics.checkNotNullParameter(old, "old");
                ReviewFormHeaderV2VO reviewFormHeaderV2VO = (ReviewFormHeaderV2VO) old;
                copy = reviewFormHeaderV2VO.copy((r29 & 1) != 0 ? reviewFormHeaderV2VO.id : 0L, (r29 & 2) != 0 ? reviewFormHeaderV2VO.productImage : null, (r29 & 4) != 0 ? reviewFormHeaderV2VO.title : null, (r29 & 8) != 0 ? reviewFormHeaderV2VO.subtitle : null, (r29 & 16) != 0 ? reviewFormHeaderV2VO.rating : ReviewFormDTO.RatingDTO.copy$default(reviewFormHeaderV2VO.getRating(), null, null, RatingDTO.copy$default(reviewFormHeaderV2VO.getRating().getRating(), null, null, null, null, Float.valueOf(((ProductRateUpdate) update).getRate()), null, null, 111, null), null, null, 27, null), (r29 & 32) != 0 ? reviewFormHeaderV2VO.closeButton : null, (r29 & 64) != 0 ? reviewFormHeaderV2VO.closeReviewFormEvent : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewFormHeaderV2VO.submitOnBackConfig : null, (r29 & 256) != 0 ? reviewFormHeaderV2VO.placeholdersSheetConfig : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewFormHeaderV2VO.widgetToken : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewFormHeaderV2VO.pageAnalyticsInfo : null, (r29 & 2048) != 0 ? reviewFormHeaderV2VO.viewEvent : null, (r29 & 4096) != 0 ? reviewFormHeaderV2VO.ratingTokenizedEvent : null);
                return copy;
            }
        });
        eVar.s(d.e.f94687b, new ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4(widgetComponentStorage, reviewFormComponent));
    }
}
