package ru.ozon.app.android.ugc.widgets.reviewFormMobile.di;

import Du.C2881a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModelImpl;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileParser;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous.ReviewFormAnonymousMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAuthorCell.ReviewFormAuthorCellMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormDisclaimer.ReviewFormDisclaimerMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell.ReviewFormFooterCellMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.ReviewFormHeaderV2Mapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewFormSubmitButtonMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.ReviewFormVariantPickerMapper;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u0000 S2\u00060\u0001j\u0002`\u0002:\u0001SR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0018\u0010O\u001a\u00060Kj\u0002`L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/core/ReviewFormMobileParser;", "getParser", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/core/ReviewFormMobileParser;", "parser", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingMapper;", "getRatingMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingMapper;", "ratingMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerMapper;", "getVariantPickerMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerMapper;", "variantPickerMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentMapper;", "getCommentMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentMapper;", "commentMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousMapper;", "getAnonymousMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousMapper;", "anonymousMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerMapper;", "getDisclaimerMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerMapper;", "disclaimerMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonMapper;", "getSubmitButtonMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonMapper;", "submitButtonMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressMapper;", "getPointsProgressMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressMapper;", "pointsProgressMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsMapper;", "getReviewFormQuestionsMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsMapper;", "reviewFormQuestionsMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAuthorCell/ReviewFormAuthorCellMapper;", "getAuthorCellMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAuthorCell/ReviewFormAuthorCellMapper;", "authorCellMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellMapper;", "getFooterCellMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellMapper;", "footerCellMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2Mapper;", "getHeaderV2Mapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2Mapper;", "headerV2Mapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "getFormViewModel", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "getMediaPickerViewModel", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "mediaPickerViewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModelImpl;", "getUploadViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModelImpl;", "uploadViewModel", "Lru/ozon/app/android/pdp/ui/configurators/tooltip/TooltipViewModel;", "getOnboardingViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/tooltip/TooltipViewModel;", "onboardingViewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "", "isSelect", "()Z", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReviewFormComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReviewFormComponent getInstance$lambda$0(C7475g c7475g) {
            return new ReviewFormComponent$Companion$getInstance$1$1(c7475g);
        }

        @NotNull
        public final C7473e<ReviewFormComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ReviewFormComponent.class), new C2881a(storage, 13));
        }
    }

    @NotNull
    ReviewFormAnonymousMapper getAnonymousMapper();

    @NotNull
    ReviewFormAuthorCellMapper getAuthorCellMapper();

    @NotNull
    ReviewFormCommentMapper getCommentMapper();

    @NotNull
    ComposerNavigator getComposerNavigator();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ReviewFormDisclaimerMapper getDisclaimerMapper();

    @NotNull
    ReviewFormFooterCellMapper getFooterCellMapper();

    @NotNull
    ReviewFormViewModel getFormViewModel();

    @NotNull
    ReviewFormHeaderV2Mapper getHeaderV2Mapper();

    @NotNull
    MediaPickerViewModelImpl getMediaPickerViewModel();

    @NotNull
    TooltipViewModel getOnboardingViewModel();

    @NotNull
    ReviewFormMobileParser getParser();

    @NotNull
    ReviewFormPointsProgressMapper getPointsProgressMapper();

    @NotNull
    ReviewFormRatingMapper getRatingMapper();

    @NotNull
    ReviewFormQuestionsMapper getReviewFormQuestionsMapper();

    @NotNull
    ReviewFormSubmitButtonMapper getSubmitButtonMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    UploadingAttachmentsViewModelImpl getUploadViewModel();

    @NotNull
    ReviewFormVariantPickerMapper getVariantPickerMapper();

    boolean isSelect();
}
