package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "Ll20/d;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormCommentMapper implements Function2<ReviewFormCommentVO, d, List<? extends ReviewFormCommentVO>> {

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    public ReviewFormCommentMapper(@NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.reviewFormRepository = reviewFormRepository;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewFormCommentVO> invoke(@NotNull ReviewFormCommentVO state, @NotNull d widgetInfo) {
        ReviewFormCommentVO copy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String value = state.getValue();
        if (value == null) {
            ReviewFormData formData = this.reviewFormRepository.getFormData();
            value = formData != null ? formData.getComment() : null;
        }
        copy = state.copy((r35 & 1) != 0 ? state.id : 0L, (r35 & 2) != 0 ? state.uploadKey : null, (r35 & 4) != 0 ? state.placeholder : null, (r35 & 8) != 0 ? state.value : value, (r35 & 16) != 0 ? state.hints : null, (r35 & 32) != 0 ? state.suggests : null, (r35 & 64) != 0 ? state.maxLines : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.minLines : 0, (r35 & 256) != 0 ? state.maxInputLength : 0, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.clickTokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.mediaPickerButton : null, (r35 & 2048) != 0 ? state.isFooterSticky : false, (r35 & 4096) != 0 ? state.isExpanded : false, (r35 & 8192) != 0 ? state.isModal : false, (r35 & 16384) != 0 ? state.isPickerButtonVisible : false);
        return C7714v.a0(copy);
    }
}
