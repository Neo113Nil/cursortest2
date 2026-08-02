package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$updatePoints$1", f = "ReviewFormViewModel.kt", l = {458, 459, 460, 461, 462, 463}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$updatePoints$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReviewFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormViewModel$updatePoints$1(ReviewFormViewModel reviewFormViewModel, d<? super ReviewFormViewModel$updatePoints$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormViewModel$updatePoints$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0108, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L54;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReviewFormData reviewFormData;
        boolean isDetailedReview;
        ReviewFormData reviewFormData2;
        ReviewFormData reviewFormData3;
        ReviewFormData reviewFormData4;
        ReviewFormData reviewFormData5;
        x0 x0Var;
        x0 x0Var2;
        String f7;
        Integer w02;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        x0 x0Var6;
        a aVar = a.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                s.b(obj);
                ReviewFormViewModel reviewFormViewModel = this.this$0;
                reviewFormData = reviewFormViewModel.formData;
                isDetailedReview = reviewFormViewModel.isDetailedReview(reviewFormData);
                if (!isDetailedReview) {
                    reviewFormData2 = this.this$0.formData;
                    Pair<String, List<Content.Video>> videos = reviewFormData2.getVideos();
                    if (!CollectionsExtKt.isNotNullOrEmpty(videos != null ? videos.f() : null)) {
                        reviewFormData3 = this.this$0.formData;
                        Pair<String, List<Content.Photo>> photos = reviewFormData3.getPhotos();
                        if (!CollectionsExtKt.isNotNullOrEmpty(photos != null ? photos.f() : null)) {
                            reviewFormData4 = this.this$0.formData;
                            Pair<String, String> comment = reviewFormData4.getComment();
                            String f11 = comment != null ? comment.f() : null;
                            if (f11 != null && !h.K(f11)) {
                                x0Var3 = this.this$0._bonusKey;
                                ReviewFormPointsProgressDTO.FieldType fieldType = ReviewFormPointsProgressDTO.FieldType.COMMENT;
                                this.label = 4;
                                break;
                            } else {
                                reviewFormData5 = this.this$0.formData;
                                Pair<String, String> rating = reviewFormData5.getRating();
                                if (((rating == null || (f7 = rating.f()) == null || (w02 = h.w0(f7)) == null) ? 0 : w02.intValue()) == 0) {
                                    x0Var = this.this$0._bonusKey;
                                    ReviewFormPointsProgressDTO.FieldType fieldType2 = ReviewFormPointsProgressDTO.FieldType.EMPTY;
                                    this.label = 6;
                                    break;
                                } else {
                                    x0Var2 = this.this$0._bonusKey;
                                    ReviewFormPointsProgressDTO.FieldType fieldType3 = ReviewFormPointsProgressDTO.FieldType.RATING;
                                    this.label = 5;
                                    break;
                                }
                            }
                        } else {
                            x0Var4 = this.this$0._bonusKey;
                            ReviewFormPointsProgressDTO.FieldType fieldType4 = ReviewFormPointsProgressDTO.FieldType.PHOTO;
                            this.label = 3;
                            break;
                        }
                    } else {
                        x0Var5 = this.this$0._bonusKey;
                        ReviewFormPointsProgressDTO.FieldType fieldType5 = ReviewFormPointsProgressDTO.FieldType.VIDEO;
                        this.label = 2;
                        break;
                    }
                } else {
                    x0Var6 = this.this$0._bonusKey;
                    ReviewFormPointsProgressDTO.FieldType fieldType6 = ReviewFormPointsProgressDTO.FieldType.DETAILED_REVIEW;
                    this.label = 1;
                    break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                s.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormViewModel$updatePoints$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
