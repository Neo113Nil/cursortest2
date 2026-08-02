package ru.ozon.app.android.ugc.widgets.reviewFormMobile.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.di.UgcRatingComponentApi;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
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
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0085\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\"\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\"\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\"\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bT\u0010\"\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\"\u001a\u0004\bZ\u0010[R\u001f\u0010b\u001a\u00060]j\u0002`^8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b_\u0010\"\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"ru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/di/UgcRatingComponentApi;", "ugcRatingComponentApi", "Lru/ozon/app/android/di/UgcRatingComponentApi;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/di/UgcReviewFormComponentApi;", "ugcReviewFormComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/di/UgcReviewFormComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/mediaupload/di/MediaUploadComponentApi;", "mediaUploadComponentApi", "Lru/ozon/app/android/mediaupload/di/MediaUploadComponentApi;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/core/ReviewFormMobileParser;", "parser$delegate", "LSc/j;", "getParser", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/core/ReviewFormMobileParser;", "parser", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerMapper;", "variantPickerMapper$delegate", "getVariantPickerMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/ReviewFormVariantPickerMapper;", "variantPickerMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsMapper;", "reviewFormQuestionsMapper$delegate", "getReviewFormQuestionsMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsMapper;", "reviewFormQuestionsMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingMapper;", "ratingMapper$delegate", "getRatingMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingMapper;", "ratingMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentMapper;", "commentMapper$delegate", "getCommentMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentMapper;", "commentMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousMapper;", "anonymousMapper$delegate", "getAnonymousMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousMapper;", "anonymousMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerMapper;", "disclaimerMapper$delegate", "getDisclaimerMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerMapper;", "disclaimerMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonMapper;", "submitButtonMapper$delegate", "getSubmitButtonMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonMapper;", "submitButtonMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressMapper;", "pointsProgressMapper$delegate", "getPointsProgressMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressMapper;", "pointsProgressMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAuthorCell/ReviewFormAuthorCellMapper;", "authorCellMapper$delegate", "getAuthorCellMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAuthorCell/ReviewFormAuthorCellMapper;", "authorCellMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellMapper;", "footerCellMapper$delegate", "getFooterCellMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellMapper;", "footerCellMapper", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2Mapper;", "headerV2Mapper$delegate", "getHeaderV2Mapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2Mapper;", "headerV2Mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "getReviewFormRepository", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "getFormViewModel", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "getMediaPickerViewModel", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "mediaPickerViewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModelImpl;", "getUploadViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModelImpl;", "uploadViewModel", "Lru/ozon/app/android/pdp/ui/configurators/tooltip/TooltipViewModel;", "getOnboardingViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/tooltip/TooltipViewModel;", "onboardingViewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "", "isSelect", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormComponent$Companion$getInstance$1$1 implements ReviewFormComponent {
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final MediaUploadComponentApi mediaUploadComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final OnBoardingComponentApi onboardingComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final UgcRatingComponentApi ugcRatingComponentApi;
    private final UgcReviewFormComponentApi ugcReviewFormComponentApi;

    /* renamed from: parser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j parser = k.b(new ReviewFormComponent$Companion$getInstance$1$1$parser$2(this));

    /* renamed from: variantPickerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j variantPickerMapper = k.b(new ReviewFormComponent$Companion$getInstance$1$1$variantPickerMapper$2(this));

    /* renamed from: reviewFormQuestionsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j reviewFormQuestionsMapper = k.b(new ReviewFormComponent$Companion$getInstance$1$1$reviewFormQuestionsMapper$2(this));

    /* renamed from: ratingMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j ratingMapper = k.b(new ReviewFormComponent$Companion$getInstance$1$1$ratingMapper$2(this));

    /* renamed from: commentMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j commentMapper = k.b(new ReviewFormComponent$Companion$getInstance$1$1$commentMapper$2(this));

    /* renamed from: anonymousMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j anonymousMapper = k.b(new ReviewFormComponent$Companion$getInstance$1$1$anonymousMapper$2(this));

    /* renamed from: disclaimerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j disclaimerMapper = k.b(ReviewFormComponent$Companion$getInstance$1$1$disclaimerMapper$2.INSTANCE);

    /* renamed from: submitButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j submitButtonMapper = k.b(ReviewFormComponent$Companion$getInstance$1$1$submitButtonMapper$2.INSTANCE);

    /* renamed from: pointsProgressMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j pointsProgressMapper = k.b(ReviewFormComponent$Companion$getInstance$1$1$pointsProgressMapper$2.INSTANCE);

    /* renamed from: authorCellMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j authorCellMapper = k.b(ReviewFormComponent$Companion$getInstance$1$1$authorCellMapper$2.INSTANCE);

    /* renamed from: footerCellMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j footerCellMapper = k.b(ReviewFormComponent$Companion$getInstance$1$1$footerCellMapper$2.INSTANCE);

    /* renamed from: headerV2Mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j headerV2Mapper = k.b(new ReviewFormComponent$Companion$getInstance$1$1$headerV2Mapper$2(this));

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory = k.b(new ReviewFormComponent$Companion$getInstance$1$1$customActionHandlersStoreFactory$2(this));

    ReviewFormComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.ugcRatingComponentApi = (UgcRatingComponentApi) c7475g.getComponent(UgcRatingComponentApi.class);
        this.ugcReviewFormComponentApi = (UgcReviewFormComponentApi) c7475g.getComponent(UgcReviewFormComponentApi.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
        this.mediaUploadComponentApi = (MediaUploadComponentApi) c7475g.getComponent(MediaUploadComponentApi.class);
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormAnonymousMapper getAnonymousMapper() {
        return (ReviewFormAnonymousMapper) this.anonymousMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormAuthorCellMapper getAuthorCellMapper() {
        return (ReviewFormAuthorCellMapper) this.authorCellMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormCommentMapper getCommentMapper() {
        return (ReviewFormCommentMapper) this.commentMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ComposerNavigator getComposerNavigator() {
        return this.retainComposerComponentApi.getComposerNavigator();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormDisclaimerMapper getDisclaimerMapper() {
        return (ReviewFormDisclaimerMapper) this.disclaimerMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormFooterCellMapper getFooterCellMapper() {
        return (ReviewFormFooterCellMapper) this.footerCellMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormViewModel getFormViewModel() {
        return new ReviewFormViewModel(this.androidPlatformComponentApi.getAppType(), this.actionComponentApi.getActionRepository(), this.accountComponentApi.getOrderChangePreferences(), getReviewFormRepository(), this.ugcRatingComponentApi.getUgcRatingService());
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormHeaderV2Mapper getHeaderV2Mapper() {
        return (ReviewFormHeaderV2Mapper) this.headerV2Mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public MediaPickerViewModelImpl getMediaPickerViewModel() {
        return new MediaPickerViewModelImpl();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public TooltipViewModel getOnboardingViewModel() {
        return new TooltipViewModel(this.onboardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormMobileParser getParser() {
        return (ReviewFormMobileParser) this.parser.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormPointsProgressMapper getPointsProgressMapper() {
        return (ReviewFormPointsProgressMapper) this.pointsProgressMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormRatingMapper getRatingMapper() {
        return (ReviewFormRatingMapper) this.ratingMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormQuestionsMapper getReviewFormQuestionsMapper() {
        return (ReviewFormQuestionsMapper) this.reviewFormQuestionsMapper.getValue();
    }

    public ReviewFormRepository getReviewFormRepository() {
        return this.ugcReviewFormComponentApi.getReviewFormRepository();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormSubmitButtonMapper getSubmitButtonMapper() {
        return (ReviewFormSubmitButtonMapper) this.submitButtonMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public UploadingAttachmentsViewModelImpl getUploadViewModel() {
        return new UploadingAttachmentsViewModelImpl(new PickedAttachmentsMapper.ProductAttachmentsMapper(), this.androidPlatformComponentApi.getImageResizer(), this.mediaUploadComponentApi.getUploadImageUseCase(), this.mediaUploadComponentApi.getUploadVideoRepository(), this.networkComponentApi.getFeatureChecker());
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public ReviewFormVariantPickerMapper getVariantPickerMapper() {
        return (ReviewFormVariantPickerMapper) this.variantPickerMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent
    public boolean isSelect() {
        return this.androidPlatformComponentApi.getAppType() == AppType.SELECT;
    }
}
