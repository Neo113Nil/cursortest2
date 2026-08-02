package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import A00.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\rJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00020\"j\b\u0012\u0004\u0012\u00020\u0002`#2\n\u0010!\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b$\u0010%R,\u0010*\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110.0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;", "<init>", "()V", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "questions", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerStateUpdate;", "update", "getUpdatedQuestions", "(Ljava/util/List;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerStateUpdate;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO$AnswerVO;", "answers", "getUpdatedAnswer", "LA00/a$J$a;", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsMapper;", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormQuestionsViewMapper extends WidgetViewMapper2<ReviewFormComponent, ReviewFormQuestionsDTO, ReviewFormQuestionsVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ReviewFormQuestionsVH> holderProducer = new ReviewFormQuestionsViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(AnswerStateUpdate.class);

    private final List<ReviewFormQuestionsVO.QuestionVO.AnswerVO> getUpdatedAnswer(List<ReviewFormQuestionsVO.QuestionVO.AnswerVO> answers, AnswerStateUpdate update) {
        TagButtonDTO copy;
        List<ReviewFormQuestionsVO.QuestionVO.AnswerVO> list = answers;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ReviewFormQuestionsVO.QuestionVO.AnswerVO answerVO : list) {
            copy = r4.copy((r34 & 1) != 0 ? r4.styleType : null, (r34 & 2) != 0 ? r4.size : null, (r34 & 4) != 0 ? r4.isSelected : Boolean.valueOf(Intrinsics.d(answerVO.getId(), update.getAnswerId()) && update.getIsSelected()), (r34 & 8) != 0 ? r4.isDisabled : null, (r34 & 16) != 0 ? r4.isClosable : null, (r34 & 32) != 0 ? r4.icon : null, (r34 & 64) != 0 ? r4.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.indicator : null, (r34 & 256) != 0 ? r4.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.common : null, (r34 & 2048) != 0 ? r4.closeControlSettings : null, (r34 & 4096) != 0 ? r4.context : null, (r34 & 8192) != 0 ? r4.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r4.image : null, (r34 & 32768) != 0 ? answerVO.getTagButton().round : null);
            arrayList.add(ReviewFormQuestionsVO.QuestionVO.AnswerVO.copy$default(answerVO, null, null, copy, null, 11, null));
        }
        return arrayList;
    }

    private final List<ReviewFormQuestionsVO.QuestionVO> getUpdatedQuestions(List<ReviewFormQuestionsVO.QuestionVO> questions, AnswerStateUpdate update) {
        List<ReviewFormQuestionsVO.QuestionVO> list = questions;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ReviewFormQuestionsVO.QuestionVO questionVO : list) {
            if (Intrinsics.d(questionVO.getId(), update.getQuestionId())) {
                questionVO = ReviewFormQuestionsVO.QuestionVO.copy$default(questionVO, null, null, getUpdatedAnswer(questionVO.getAnswers(), update), 3, null);
            }
            arrayList.add(questionVO);
        }
        return arrayList;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewFormQuestionsDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ReviewFormQuestionsVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public RecyclerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setId(R$id.reviewFormMobileQuestionsRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ReviewFormQuestionsMapper getMapper() {
        return component().getReviewFormQuestionsMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public ReviewFormQuestionsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ReviewFormQuestionsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof AnswerStateUpdate)) {
            return null;
        }
        AnswerStateUpdate answerStateUpdate = (AnswerStateUpdate) update;
        return ReviewFormQuestionsVO.copy$default(oldItem, 0L, null, getUpdatedQuestions(oldItem.getQuestions(), answerStateUpdate), (!Intrinsics.d(oldItem.getQuestions().get(oldItem.getVisibleQuestionsCount() + (-1)).getId(), answerStateUpdate.getQuestionId()) || oldItem.getQuestions().size() == oldItem.getVisibleQuestionsCount()) ? oldItem.getVisibleQuestionsCount() : oldItem.getVisibleQuestionsCount() + 1, 3, null);
    }
}
