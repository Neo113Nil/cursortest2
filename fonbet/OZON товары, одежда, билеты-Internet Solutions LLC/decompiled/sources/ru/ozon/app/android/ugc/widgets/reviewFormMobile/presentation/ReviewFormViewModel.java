package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CreateReviewResponse;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.RateItemsDelegate;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.SubmitActionPendingData;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormData;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SingleEvent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020\u000e0!¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b+\u0010,Jj\u00105\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e00\u0012\u0006\u0012\u0004\u0018\u00010$0/2\"\u00102\u001a\u001e\b\u0001\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e00\u0012\u0006\u0012\u0004\u0018\u00010$0/2\b\b\u0002\u00104\u001a\u000203H\u0082@¢\u0006\u0004\b5\u00106J6\u00109\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000207\u0018\u00010\"2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u000201H\u0082@¢\u0006\u0004\b<\u0010=J*\u0010C\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010B\u001a\u000203H\u0082@¢\u0006\u0004\bC\u0010DJ\u0013\u0010F\u001a\u00020-*\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ#\u0010J\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ7\u0010N\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010L\u001a\u00020E2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0002¢\u0006\u0004\bP\u0010\u0010J\u000f\u0010Q\u001a\u00020\u000eH\u0002¢\u0006\u0004\bQ\u0010\u0010J+\u0010V\u001a\u0002032\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010T\u001a\u00020R2\b\u0010I\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000eH\u0002¢\u0006\u0004\bX\u0010\u0010J\u0013\u0010Y\u001a\u000203*\u00020HH\u0002¢\u0006\u0004\bY\u0010ZJ1\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\b\u0010[\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\\\u0010]J\u001b\u0010^\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u000203H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000eH\u0002¢\u0006\u0004\bb\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010gR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020i0l8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020r0u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u0002030q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010tR\u001d\u0010{\u001a\b\u0012\u0004\u0012\u0002030u8\u0006¢\u0006\f\n\u0004\b{\u0010w\u001a\u0004\b{\u0010yR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00110h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010kR\u0018\u0010}\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u0087\u0001\u001a\u0002032\u0007\u0010\u0086\u0001\u001a\u0002038\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0088\u0001¨\u0006\u008d\u0001"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderPrefs", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "ugcRatingService", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/orders/OrderChangePreferences;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;Lru/ozon/app/android/ugcratingservice/UgcRatingService;)V", "", "onCleared", "()V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;", "viewIntent", "onViewIntent", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;)V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;", "event", "onMediaPickerEvent", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SubmitReason;", "submitReason", "processCreateReviewAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SubmitReason;)V", "Lxe/M;", "scope", "Lkotlin/Function1;", "", "", "", "onSuccess", "processCreateReviewActionFromBackButton", "(Lxe/M;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;", "response", "rating", "updateRatingService", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "actionRequest", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "onFailure", "", "showLoader", "sendReview", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "handleSuccess", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SubmitReason;Lkotlin/coroutines/d;)Ljava/lang/Object;", "throwable", "handleSendReviewError", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/android/haptic/HapticToken;", "notificationHaptic", "isError", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/android/haptic/HapticToken;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "toActionV2Request", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData;", "formData", "createReviewContentMap", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData;)Ljava/util/Map;", "action", "contentMap", "buildReviewParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/util/Map;)Ljava/util/Map;", "observeViewIntent", "updateSubmitCachedReviewAction", "", "minRating", "currentRating", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "withSubmit", "(Ljava/lang/Integer;ILru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;)Z", "updatePoints", "isDetailedReview", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData;)Z", "reviewUuid", "getCustomTrackingInfo", "(Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SubmitReason;)Ljava/util/Map;", "getClosingTrackingInfo", "()Ljava/util/Map;", "isSubmitAvailable", "()Z", "updateSubmitAvailability", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "LAe/w0;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "_singleEvent", "LAe/w0;", "LAe/B0;", "singleEvent", "LAe/B0;", "getSingleEvent", "()LAe/B0;", "LAe/x0;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "_bonusKey", "LAe/x0;", "LAe/M0;", "bonusKey", "LAe/M0;", "getBonusKey", "()LAe/M0;", "_isSubmitButtonAvailable", "isSubmitButtonAvailable", "viewIntents", "productId", "Ljava/lang/String;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormData;", "Lxe/B0;", "currentJob", "Lxe/B0;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "higherPointsTerms", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isMediaLoading", "Z", "setMediaLoading", "(Z)V", "initialRatingHasBeenSet", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormViewModel extends w0 {

    @NotNull
    private final x0<ReviewFormPointsProgressDTO.FieldType> _bonusKey;

    @NotNull
    private final x0<Boolean> _isSubmitButtonAvailable;

    @NotNull
    private final Ae.w0<SingleEvent> _singleEvent;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final AppType appType;

    @NotNull
    private final M0<ReviewFormPointsProgressDTO.FieldType> bonusKey;
    private B0 currentJob;

    @NotNull
    private ReviewFormData formData;
    private HigherPointsTerms higherPointsTerms;
    private boolean initialRatingHasBeenSet;
    private boolean isMediaLoading;

    @NotNull
    private final M0<Boolean> isSubmitButtonAvailable;

    @NotNull
    private final OrderChangePreferences orderPrefs;
    private String productId;

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    @NotNull
    private final Ae.B0<SingleEvent> singleEvent;

    @NotNull
    private final UgcRatingService ugcRatingService;

    @NotNull
    private final Ae.w0<ViewIntent> viewIntents;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel$Companion;", "", "<init>", "()V", "PARAM_CONTENT_ID", "", "REVIEW_UUID_KEY", "QUANTITY_KEY", "RATING_KEY", "STATUS_KEY", "PHOTO_QUANTITY_KEY", "VIDEO_QUANTITY_KEY", "REVIEW_SCORE_KEY", "CURRENT_ENTITY_KEY", "IS_ANONYMOUS_KEY", "REASON_KEY", "STATUS_EMPTY", "STATUS_CACHED", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReviewFormViewModel(@NotNull AppType appType, @NotNull ActionV2Repository actionV2Repository, @NotNull OrderChangePreferences orderPrefs, @NotNull ReviewFormRepository reviewFormRepository, @NotNull UgcRatingService ugcRatingService) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(orderPrefs, "orderPrefs");
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        Intrinsics.checkNotNullParameter(ugcRatingService, "ugcRatingService");
        this.appType = appType;
        this.actionV2Repository = actionV2Repository;
        this.orderPrefs = orderPrefs;
        this.reviewFormRepository = reviewFormRepository;
        this.ugcRatingService = ugcRatingService;
        C0 b11 = E0.b(0, 0, null, 7);
        this._singleEvent = b11;
        this.singleEvent = C2399j.a(b11);
        x0<ReviewFormPointsProgressDTO.FieldType> a11 = O0.a(ReviewFormPointsProgressDTO.FieldType.EMPTY);
        this._bonusKey = a11;
        this.bonusKey = C2399j.b(a11);
        x0<Boolean> a12 = O0.a(Boolean.FALSE);
        this._isSubmitButtonAvailable = a12;
        this.isSubmitButtonAvailable = C2399j.b(a12);
        this.viewIntents = E0.b(0, 0, null, 7);
        this.formData = new ReviewFormData(reviewFormRepository.getFormData() != null ? "cached" : "empty", null, null, null, null, null, null, null, null, null, null, 2046, null);
        observeViewIntent();
    }

    private final Map<String, Object> buildReviewParams(AtomAction.ComposerAction action, Map<String, ? extends Object> contentMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("content", contentMap);
        Map<String, String> params = action.getParams();
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        return linkedHashMap;
    }

    private final Map<String, Object> createReviewContentMap(ReviewFormData formData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> rating = formData.getRating();
        if (rating != null) {
            linkedHashMap.put(rating.a(), rating.b());
        }
        Pair<String, Boolean> anonymous = formData.getAnonymous();
        if (anonymous != null) {
            String a11 = anonymous.a();
            Boolean b11 = anonymous.b();
            b11.booleanValue();
            linkedHashMap.put(a11, b11);
        }
        Pair<String, String> comment = formData.getComment();
        if (comment != null) {
            linkedHashMap.put(comment.a(), comment.b());
        }
        Pair<String, List<Content.Photo>> photos = formData.getPhotos();
        if (photos != null) {
            linkedHashMap.put(photos.a(), photos.b());
        }
        Pair<String, List<Content.Video>> videos = formData.getVideos();
        if (videos != null) {
            linkedHashMap.put(videos.a(), videos.b());
        }
        Pair<String, Map<String, String>> questions = formData.getQuestions();
        if (questions != null) {
            linkedHashMap.put(questions.a(), questions.b());
        }
        Pair<String, String> variantId = formData.getVariantId();
        if (variantId != null) {
            linkedHashMap.put(variantId.a(), variantId.b());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getClosingTrackingInfo() {
        String f7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String status = this.formData.getStatus();
        if (status != null) {
            linkedHashMap.put("status", status);
        }
        Pair<String, String> rating = this.formData.getRating();
        if (rating != null && (f7 = rating.f()) != null) {
            linkedHashMap.put("rating", Integer.valueOf(Integer.parseInt(f7)));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r4.f().booleanValue() == true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> getCustomTrackingInfo(String reviewUuid, SubmitReason submitReason) {
        int i11;
        Integer num;
        String value;
        List<Content.Video> f7;
        List<Content.Photo> f11;
        String f12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(getClosingTrackingInfo());
        if (reviewUuid != null) {
            linkedHashMap.put("reviewUuid", reviewUuid);
        }
        Pair<String, String> comment = this.formData.getComment();
        int i12 = 0;
        linkedHashMap.put("quantity", Integer.valueOf((comment == null || (f12 = comment.f()) == null) ? 0 : f12.length()));
        Pair<String, List<Content.Photo>> photos = this.formData.getPhotos();
        linkedHashMap.put("photoQuantity", Integer.valueOf((photos == null || (f11 = photos.f()) == null) ? 0 : f11.size()));
        Pair<String, List<Content.Video>> videos = this.formData.getVideos();
        linkedHashMap.put("videoQuantity", Integer.valueOf((videos == null || (f7 = videos.f()) == null) ? 0 : f7.size()));
        Pair<String, Boolean> anonymous = this.formData.getAnonymous();
        if (anonymous != null) {
            i11 = 1;
        }
        i11 = 0;
        linkedHashMap.put("isAnonimous", Integer.valueOf(i11));
        if (submitReason != null && (value = submitReason.getValue()) != null) {
            linkedHashMap.put("reason", value);
        }
        Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap = this.formData.getPointsMap();
        if (pointsMap != null && (num = pointsMap.get(this.bonusKey.getValue())) != null) {
            i12 = num.intValue();
        }
        linkedHashMap.put("ReviewScore", Integer.valueOf(i12));
        String hintStatus = this.formData.getHintStatus();
        if (hintStatus != null) {
            linkedHashMap.put("currentEntityStatus", hintStatus);
        }
        return linkedHashMap;
    }

    static /* synthetic */ Map getCustomTrackingInfo$default(ReviewFormViewModel reviewFormViewModel, String str, SubmitReason submitReason, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            submitReason = null;
        }
        return reviewFormViewModel.getCustomTrackingInfo(str, submitReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleSendReviewError(Throwable th2, d<? super Unit> dVar) {
        ReviewFormViewModel$handleSendReviewError$1 reviewFormViewModel$handleSendReviewError$1;
        int i11;
        NotificationDTO createFailedToSendNotification;
        if (dVar instanceof ReviewFormViewModel$handleSendReviewError$1) {
            reviewFormViewModel$handleSendReviewError$1 = (ReviewFormViewModel$handleSendReviewError$1) dVar;
            int i12 = reviewFormViewModel$handleSendReviewError$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                reviewFormViewModel$handleSendReviewError$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = reviewFormViewModel$handleSendReviewError$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = reviewFormViewModel$handleSendReviewError$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Ae.w0<SingleEvent> w0Var = this._singleEvent;
                    if (g.c(th2)) {
                        createFailedToSendNotification = NotificationBarHelperKt.createNetworkErrorNotificationDTO(this.appType == AppType.SELECT);
                    } else {
                        createFailedToSendNotification = NotificationsKt.createFailedToSendNotification();
                    }
                    SingleEvent.ShowError showError = new SingleEvent.ShowError(createFailedToSendNotification, HapticToken.ERROR);
                    reviewFormViewModel$handleSendReviewError$1.L$0 = th2;
                    reviewFormViewModel$handleSendReviewError$1.label = 1;
                    if (w0Var.emit(showError, reviewFormViewModel$handleSendReviewError$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) reviewFormViewModel$handleSendReviewError$1.L$0;
                    s.b(obj);
                }
                Lm0.a.f17149a.e(th2);
                return Unit.f71690a;
            }
        }
        reviewFormViewModel$handleSendReviewError$1 = new ReviewFormViewModel$handleSendReviewError$1(this, dVar);
        Object obj2 = reviewFormViewModel$handleSendReviewError$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = reviewFormViewModel$handleSendReviewError$1.label;
        if (i11 != 0) {
        }
        Lm0.a.f17149a.e(th2);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSuccess(CreateReviewResponse createReviewResponse, Map<String, TokenizedTrackingInfo> map, SubmitReason submitReason, d<? super Unit> dVar) {
        Object emit;
        this.orderPrefs.markAsUpdated();
        this.reviewFormRepository.removeFormData();
        return (submitReason == SubmitReason.REVIEW_BACK || (emit = this._singleEvent.emit(new SingleEvent.PassResult(createReviewResponse.getLink(), map, getCustomTrackingInfo(createReviewResponse.getReviewUuid(), submitReason)), dVar)) != a.COROUTINE_SUSPENDED) ? Unit.f71690a : emit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDetailedReview(ReviewFormData reviewFormData) {
        List<Content.Video> f7;
        List<Content.Photo> f11;
        String f12;
        Pair<String, String> comment = reviewFormData.getComment();
        int length = (comment == null || (f12 = comment.f()) == null) ? 0 : f12.length();
        Pair<String, List<Content.Photo>> photos = reviewFormData.getPhotos();
        int size = (photos == null || (f11 = photos.f()) == null) ? 0 : f11.size();
        Pair<String, List<Content.Video>> videos = reviewFormData.getVideos();
        int size2 = size + ((videos == null || (f7 = videos.f()) == null) ? 0 : f7.size());
        HigherPointsTerms higherPointsTerms = this.higherPointsTerms;
        return (higherPointsTerms == null || higherPointsTerms.getDetailedReviewMediaCount() == null || higherPointsTerms.getDetailedReviewCommentLength() == null || length < higherPointsTerms.getDetailedReviewCommentLength().intValue() || size2 < higherPointsTerms.getDetailedReviewMediaCount().intValue()) ? false : true;
    }

    private final boolean isSubmitAvailable() {
        String f7;
        Integer w02;
        if (!this.isMediaLoading) {
            Pair<String, String> rating = this.formData.getRating();
            if (((rating == null || (f7 = rating.f()) == null || (w02 = h.w0(f7)) == null) ? 0 : w02.intValue()) > 0) {
                return true;
            }
        }
        return false;
    }

    private final void observeViewIntent() {
        C2399j.C(new C2408n0(this.viewIntents, new ReviewFormViewModel$observeViewIntent$1(this, null)), androidx.lifecycle.x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010d, code lost:
    
        if (xe.C10727i.f(r14, r2, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008f, code lost:
    
        if (r13.emit(r14, r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendReview(ActionV2Request actionV2Request, Function2<? super CreateReviewResponse, ? super d<? super Unit>, ? extends Object> function2, Function2<? super Throwable, ? super d<? super Unit>, ? extends Object> function22, boolean z11, d<? super Unit> dVar) {
        ReviewFormViewModel$sendReview$1 reviewFormViewModel$sendReview$1;
        a aVar;
        int i11;
        ReviewFormViewModel reviewFormViewModel;
        Object mo479requestActionResult0E7RQCE;
        Object obj;
        Function2<? super Throwable, ? super d<? super Unit>, ? extends Object> function23;
        ReviewFormViewModel reviewFormViewModel2;
        Function2<? super Throwable, ? super d<? super Unit>, ? extends Object> function24;
        Object obj2;
        Throwable b11;
        if (dVar instanceof ReviewFormViewModel$sendReview$1) {
            reviewFormViewModel$sendReview$1 = (ReviewFormViewModel$sendReview$1) dVar;
            int i12 = reviewFormViewModel$sendReview$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                reviewFormViewModel$sendReview$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj3 = reviewFormViewModel$sendReview$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = reviewFormViewModel$sendReview$1.label;
                if (i11 != 0) {
                    s.b(obj3);
                    if (z11) {
                        Ae.w0<SingleEvent> w0Var = this._singleEvent;
                        SingleEvent.UpdateLoader updateLoader = new SingleEvent.UpdateLoader(true);
                        reviewFormViewModel$sendReview$1.L$0 = this;
                        reviewFormViewModel$sendReview$1.L$1 = actionV2Request;
                        reviewFormViewModel$sendReview$1.L$2 = function2;
                        reviewFormViewModel$sendReview$1.L$3 = function22;
                        reviewFormViewModel$sendReview$1.label = 1;
                    }
                    reviewFormViewModel = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj3);
                                return Unit.f71690a;
                            }
                            obj2 = reviewFormViewModel$sendReview$1.L$2;
                            function24 = (Function2) reviewFormViewModel$sendReview$1.L$1;
                            reviewFormViewModel2 = (ReviewFormViewModel) reviewFormViewModel$sendReview$1.L$0;
                            s.b(obj3);
                            obj = obj2;
                            function23 = function24;
                            b11 = r.b(obj);
                            if (b11 != null) {
                                C10720e0 c10720e0 = C10720e0.f105451a;
                                L0 l02 = De.s.f6650a;
                                ReviewFormViewModel$sendReview$4$1 reviewFormViewModel$sendReview$4$1 = new ReviewFormViewModel$sendReview$4$1(reviewFormViewModel2, function23, b11, null);
                                reviewFormViewModel$sendReview$1.L$0 = obj;
                                reviewFormViewModel$sendReview$1.L$1 = null;
                                reviewFormViewModel$sendReview$1.L$2 = null;
                                reviewFormViewModel$sendReview$1.label = 4;
                            }
                            return Unit.f71690a;
                        }
                        function23 = (Function2) reviewFormViewModel$sendReview$1.L$2;
                        function2 = (Function2) reviewFormViewModel$sendReview$1.L$1;
                        reviewFormViewModel2 = (ReviewFormViewModel) reviewFormViewModel$sendReview$1.L$0;
                        s.b(obj3);
                        obj = ((r) obj3).getF26106a();
                        r.Companion companion = r.INSTANCE;
                        if (!(obj instanceof r.b)) {
                            try {
                                Object data = ((ActionV2Response) obj).getData();
                                if (data == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                obj = (CreateReviewResponse) data;
                            } catch (Throwable th2) {
                                r.Companion companion2 = r.INSTANCE;
                                obj = s.a(th2);
                            }
                        }
                        if (!(obj instanceof r.b)) {
                            C10720e0 c10720e02 = C10720e0.f105451a;
                            L0 l03 = De.s.f6650a;
                            ReviewFormViewModel$sendReview$3$1 reviewFormViewModel$sendReview$3$1 = new ReviewFormViewModel$sendReview$3$1(reviewFormViewModel2, (CreateReviewResponse) obj, function2, null);
                            reviewFormViewModel$sendReview$1.L$0 = reviewFormViewModel2;
                            reviewFormViewModel$sendReview$1.L$1 = function23;
                            reviewFormViewModel$sendReview$1.L$2 = obj;
                            reviewFormViewModel$sendReview$1.label = 3;
                            if (C10727i.f(l03, reviewFormViewModel$sendReview$3$1, reviewFormViewModel$sendReview$1) != aVar) {
                                function24 = function23;
                                obj2 = obj;
                                obj = obj2;
                                function23 = function24;
                            }
                            return aVar;
                        }
                        b11 = r.b(obj);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    function22 = (Function2) reviewFormViewModel$sendReview$1.L$3;
                    function2 = (Function2) reviewFormViewModel$sendReview$1.L$2;
                    actionV2Request = (ActionV2Request) reviewFormViewModel$sendReview$1.L$1;
                    reviewFormViewModel = (ReviewFormViewModel) reviewFormViewModel$sendReview$1.L$0;
                    s.b(obj3);
                }
                ActionV2Repository actionV2Repository = reviewFormViewModel.actionV2Repository;
                reviewFormViewModel$sendReview$1.L$0 = reviewFormViewModel;
                reviewFormViewModel$sendReview$1.L$1 = function2;
                reviewFormViewModel$sendReview$1.L$2 = function22;
                reviewFormViewModel$sendReview$1.L$3 = null;
                reviewFormViewModel$sendReview$1.label = 2;
                mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, CreateReviewResponse.class, reviewFormViewModel$sendReview$1);
                if (mo479requestActionResult0E7RQCE != aVar) {
                    ReviewFormViewModel reviewFormViewModel3 = reviewFormViewModel;
                    obj = mo479requestActionResult0E7RQCE;
                    function23 = function22;
                    reviewFormViewModel2 = reviewFormViewModel3;
                    r.Companion companion3 = r.INSTANCE;
                    if (!(obj instanceof r.b)) {
                    }
                    if (!(obj instanceof r.b)) {
                    }
                    b11 = r.b(obj);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        reviewFormViewModel$sendReview$1 = new ReviewFormViewModel$sendReview$1(this, dVar);
        Object obj32 = reviewFormViewModel$sendReview$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = reviewFormViewModel$sendReview$1.label;
        if (i11 != 0) {
        }
        ActionV2Repository actionV2Repository2 = reviewFormViewModel.actionV2Repository;
        reviewFormViewModel$sendReview$1.L$0 = reviewFormViewModel;
        reviewFormViewModel$sendReview$1.L$1 = function2;
        reviewFormViewModel$sendReview$1.L$2 = function22;
        reviewFormViewModel$sendReview$1.L$3 = null;
        reviewFormViewModel$sendReview$1.label = 2;
        mo479requestActionResult0E7RQCE = actionV2Repository2.mo479requestActionResult0E7RQCE(actionV2Request, CreateReviewResponse.class, reviewFormViewModel$sendReview$1);
        if (mo479requestActionResult0E7RQCE != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMediaLoading(boolean z11) {
        this.isMediaLoading = z11;
        updateSubmitAvailability();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showNotification(NotificationDTO notificationDTO, HapticToken hapticToken, boolean z11, d<? super Unit> dVar) {
        Object emit = this._singleEvent.emit(new SingleEvent.ShowNotification(notificationDTO, hapticToken, z11), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Request toActionV2Request(AtomAction.ComposerAction composerAction) {
        return new ActionV2Request(buildReviewParams(composerAction, createReviewContentMap(this.formData)), composerAction.getActionName(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePoints() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ReviewFormViewModel$updatePoints$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRatingService(CreateReviewResponse response, String rating) {
        if (response.getEditingAction() == null) {
            this.ugcRatingService.markFailedRatingService(this.productId);
        } else {
            this.ugcRatingService.markSucceedRatingService(rating, response.getEditingAction(), this.productId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubmitAvailability() {
        this._isSubmitButtonAvailable.setValue(Boolean.valueOf(isSubmitAvailable()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubmitCachedReviewAction() {
        String rating;
        Integer w02;
        ReviewFormData.SubmitCachedReviewData submitCachedReviewData = this.formData.getSubmitCachedReviewData();
        ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData formData = this.reviewFormRepository.getFormData();
        int intValue = (formData == null || (rating = formData.getRating()) == null || (w02 = h.w0(rating)) == null) ? 0 : w02.intValue();
        SubmitActionPendingData submitActionPendingData = null;
        AtomAction action = submitCachedReviewData != null ? submitCachedReviewData.getAction() : null;
        AtomAction.ComposerAction composerAction = action instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) action : null;
        if (!withSubmit(submitCachedReviewData != null ? Integer.valueOf(submitCachedReviewData.getMinRating()) : null, intValue, formData)) {
            composerAction = null;
        }
        ActionV2Request actionV2Request = composerAction != null ? toActionV2Request(composerAction) : null;
        if (actionV2Request != null) {
            submitActionPendingData = new SubmitActionPendingData(this.productId, actionV2Request.getActionName(), actionV2Request.getRequest(), submitCachedReviewData != null ? submitCachedReviewData.getWidgetId() : null, submitCachedReviewData != null ? submitCachedReviewData.getWidgetToken() : null, submitCachedReviewData != null ? submitCachedReviewData.getPageAnalyticsInfo() : null, submitCachedReviewData != null ? submitCachedReviewData.getSubmitActionTrackingInfo() : null, getCustomTrackingInfo(null, SubmitReason.REVIEW_CLOSE));
        }
        this.reviewFormRepository.updateSubmitAction(submitActionPendingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean withSubmit(Integer minRating, int currentRating, ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData formData) {
        return minRating != null && currentRating >= minRating.intValue() && formData != null && formData.getHasOnlyRating();
    }

    @NotNull
    public final M0<ReviewFormPointsProgressDTO.FieldType> getBonusKey() {
        return this.bonusKey;
    }

    @NotNull
    public final Ae.B0<SingleEvent> getSingleEvent() {
        return this.singleEvent;
    }

    @NotNull
    public final M0<Boolean> isSubmitButtonAvailable() {
        return this.isSubmitButtonAvailable;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.reviewFormRepository.clear();
    }

    public final void onMediaPickerEvent(@NotNull MediaPickerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ReviewFormViewModel$onMediaPickerEvent$1(event, this, null), 3);
    }

    public final void onViewIntent(@NotNull ViewIntent viewIntent) {
        Intrinsics.checkNotNullParameter(viewIntent, "viewIntent");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ReviewFormViewModel$onViewIntent$1(this, viewIntent, null), 3);
    }

    public final void processCreateReviewAction(@NotNull AtomAction atomAction, @NotNull SubmitReason submitReason) {
        String str;
        Long y02;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        Intrinsics.checkNotNullParameter(submitReason, "submitReason");
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction == null || (str = this.productId) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        long longValue = y02.longValue();
        ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData formData = this.reviewFormRepository.getFormData();
        String rating = formData != null ? formData.getRating() : null;
        B0 b02 = this.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.ugcRatingService.markPendingRatingService(rating, this.productId);
        this.currentJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ReviewFormViewModel$processCreateReviewAction$1(this, composerAction, rating, longValue, submitReason, null), 3);
    }

    public final void processCreateReviewActionFromBackButton(@NotNull M scope, @NotNull AtomAction atomAction, @NotNull Function1<? super Map<String, ? extends Object>, Unit> onSuccess) {
        String str;
        Long y02;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction == null || (str = this.productId) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData formData = this.reviewFormRepository.getFormData();
        String rating = formData != null ? formData.getRating() : null;
        RateItemsDelegate.INSTANCE.onReviewSuccess(y02, false);
        B0 b02 = this.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.ugcRatingService.markPendingRatingService(rating, this.productId);
        this.currentJob = C10727i.c(scope, null, null, new ReviewFormViewModel$processCreateReviewActionFromBackButton$1(this, composerAction, rating, onSuccess, null), 3);
    }
}
