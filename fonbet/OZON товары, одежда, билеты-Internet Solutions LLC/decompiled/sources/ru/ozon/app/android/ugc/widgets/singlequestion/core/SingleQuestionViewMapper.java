package ru.ozon.app.android.ugc.widgets.singlequestion.core;

import A00.a;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.VoteUpdateKey;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.view.questions.QuestionsDecoration;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.app.android.ugc.widgets.singlequestion.di.SingleQuestionComponent;
import ru.ozon.app.android.ugc.widgets.singlequestion.presentation.SingleQuestionVO;
import ru.ozon.app.android.ugc.widgets.singlequestion.presentation.SingleQuestionViewHolder;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00019B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R,\u0010/\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/core/SingleQuestionViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/singlequestion/di/SingleQuestionComponent;", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO;", "Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/ugc/view/questions/QuestionsDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;)Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;", "newItem", "getPayload", "(Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;)Ljava/lang/Object;", "Lru/ozon/app/android/ugc/widgets/singlequestion/core/SingleQuestionMapper;", "mapper", "Lru/ozon/app/android/ugc/widgets/singlequestion/core/SingleQuestionMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/singlequestion/core/SingleQuestionMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/question/VoteUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "QuestionPayload", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleQuestionViewMapper extends WidgetViewMapper2<SingleQuestionComponent, SingleQuestionDTO, SingleQuestionVO> {

    @NotNull
    private final SingleQuestionMapper mapper = new SingleQuestionMapper();
    private final int layout = R$layout.widget_single_question;

    @NotNull
    private final Function2<View, ComposerReferences, SingleQuestionViewHolder> holderProducer = new SingleQuestionViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<VoteUpdateKey>> supportedUpdates = C7714v.a0(VoteUpdateKey.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/core/SingleQuestionViewMapper$QuestionPayload;", "", "<init>", "(Ljava/lang/String;I)V", "VOTE", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class QuestionPayload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ QuestionPayload[] $VALUES;
        public static final QuestionPayload VOTE = new QuestionPayload("VOTE", 0);

        private static final /* synthetic */ QuestionPayload[] $values() {
            return new QuestionPayload[]{VOTE};
        }

        static {
            QuestionPayload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private QuestionPayload(String str, int i11) {
        }

        public static QuestionPayload valueOf(String str) {
            return (QuestionPayload) Enum.valueOf(QuestionPayload.class, str);
        }

        public static QuestionPayload[] values() {
            return (QuestionPayload[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SingleQuestionDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<QuestionsDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new QuestionsDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SingleQuestionViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<VoteUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SingleQuestionComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SingleQuestionComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SingleQuestionMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull SingleQuestionVO oldItem, @NotNull SingleQuestionVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.d(oldItem.getLikeButton(), newItem.getLikeButton())) {
            return QuestionPayload.VOTE;
        }
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public SingleQuestionVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SingleQuestionVO oldItem) {
        SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof VoteUpdateKey) {
            VoteUpdateKey voteUpdateKey = (VoteUpdateKey) update;
            if (voteUpdateKey.getId() == oldItem.getId() && voteUpdateKey.getActionType() == ActionType.VOTE_QUESTION && (likeButton = oldItem.getLikeButton()) != null) {
                boolean isSelected = likeButton.isSelected();
                int count = likeButton.getCount();
                return SingleQuestionVO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton.copy$default(likeButton, isSelected ? count - 1 : count + 1, null, !likeButton.isSelected(), null, null, 26, null), null, null, 1791, null);
            }
        }
        return null;
    }
}
