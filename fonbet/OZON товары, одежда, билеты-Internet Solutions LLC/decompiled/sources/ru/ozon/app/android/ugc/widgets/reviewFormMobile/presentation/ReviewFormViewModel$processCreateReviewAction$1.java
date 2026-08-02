package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CreateReviewResponse;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.RateItemsDelegate;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewAction$1", f = "ReviewFormViewModel.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$processCreateReviewAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ long $productId;
    final /* synthetic */ String $rating;
    final /* synthetic */ SubmitReason $submitReason;
    int label;
    final /* synthetic */ ReviewFormViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewAction$1$1", f = "ReviewFormViewModel.kt", l = {171, 175}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CreateReviewResponse, d<? super Unit>, Object> {
        final /* synthetic */ AtomAction.ComposerAction $action;
        final /* synthetic */ long $productId;
        final /* synthetic */ String $rating;
        final /* synthetic */ SubmitReason $submitReason;
        /* synthetic */ Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ ReviewFormViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReviewFormViewModel reviewFormViewModel, String str, long j11, AtomAction.ComposerAction composerAction, SubmitReason submitReason, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = reviewFormViewModel;
            this.$rating = str;
            this.$productId = j11;
            this.$action = composerAction;
            this.$submitReason = submitReason;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$rating, this.$productId, this.$action, this.$submitReason, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
        
            if (r8 != r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CreateReviewResponse createReviewResponse;
            Object showNotification;
            boolean z11;
            Object handleSuccess;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                createReviewResponse = (CreateReviewResponse) this.L$0;
                this.this$0.updateRatingService(createReviewResponse, this.$rating);
                NotificationDTO notification = createReviewResponse.getNotification();
                if (notification != null) {
                    ReviewFormViewModel reviewFormViewModel = this.this$0;
                    boolean z12 = notification.getPreset() == NotificationDTO.Preset.WARNING || notification.getPreset() == NotificationDTO.Preset.NEGATIVE;
                    HapticToken notificationHaptic = createReviewResponse.getNotificationHaptic();
                    this.L$0 = createReviewResponse;
                    this.Z$0 = z12;
                    this.label = 1;
                    showNotification = reviewFormViewModel.showNotification(notification, notificationHaptic, z12, this);
                    if (showNotification != aVar) {
                        z11 = z12;
                    }
                    return aVar;
                }
                RateItemsDelegate.INSTANCE.onReviewSuccess(new Long(this.$productId), true);
                ReviewFormViewModel reviewFormViewModel2 = this.this$0;
                Map<String, TokenizedTrackingInfo> trackingInfo = this.$action.getTrackingInfo();
                SubmitReason submitReason = this.$submitReason;
                this.L$0 = null;
                this.label = 2;
                handleSuccess = reviewFormViewModel2.handleSuccess(createReviewResponse, trackingInfo, submitReason, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                z11 = this.Z$0;
                createReviewResponse = (CreateReviewResponse) this.L$0;
                s.b(obj);
            }
            if (z11) {
                return Unit.f71690a;
            }
            RateItemsDelegate.INSTANCE.onReviewSuccess(new Long(this.$productId), true);
            ReviewFormViewModel reviewFormViewModel22 = this.this$0;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = this.$action.getTrackingInfo();
            SubmitReason submitReason2 = this.$submitReason;
            this.L$0 = null;
            this.label = 2;
            handleSuccess = reviewFormViewModel22.handleSuccess(createReviewResponse, trackingInfo2, submitReason2, this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateReviewResponse createReviewResponse, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(createReviewResponse, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "throwable", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewAction$1$2", f = "ReviewFormViewModel.kt", l = {179}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewAction$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReviewFormViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReviewFormViewModel reviewFormViewModel, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = reviewFormViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            UgcRatingService ugcRatingService;
            String str;
            Object handleSendReviewError;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                Throwable th2 = (Throwable) this.L$0;
                ugcRatingService = this.this$0.ugcRatingService;
                str = this.this$0.productId;
                ugcRatingService.markFailedRatingService(str);
                ReviewFormViewModel reviewFormViewModel = this.this$0;
                this.label = 1;
                handleSendReviewError = reviewFormViewModel.handleSendReviewError(th2, this);
                if (handleSendReviewError == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th2, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(th2, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormViewModel$processCreateReviewAction$1(ReviewFormViewModel reviewFormViewModel, AtomAction.ComposerAction composerAction, String str, long j11, SubmitReason submitReason, d<? super ReviewFormViewModel$processCreateReviewAction$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormViewModel;
        this.$action = composerAction;
        this.$rating = str;
        this.$productId = j11;
        this.$submitReason = submitReason;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormViewModel$processCreateReviewAction$1(this.this$0, this.$action, this.$rating, this.$productId, this.$submitReason, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Request actionV2Request;
        Object sendReview;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ReviewFormViewModel reviewFormViewModel = this.this$0;
            actionV2Request = reviewFormViewModel.toActionV2Request(this.$action);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$rating, this.$productId, this.$action, this.$submitReason, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            sendReview = reviewFormViewModel.sendReview(actionV2Request, anonymousClass1, anonymousClass2, true, this);
            if (sendReview == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormViewModel$processCreateReviewAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
