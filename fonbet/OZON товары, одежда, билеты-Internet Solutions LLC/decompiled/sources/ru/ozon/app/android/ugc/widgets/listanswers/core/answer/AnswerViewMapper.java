package ru.ozon.app.android.ugc.widgets.listanswers.core.answer;

import A00.a;
import Xc.b;
import android.content.Context;
import android.view.View;
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
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.VoteUpdateKey;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.view.questions.AnswersDecoration;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.listanswers.di.AnswerComponent;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerHighlightedStateUpdateKey;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerVO;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerViewHolder;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00017B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010*\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190.0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/listanswers/di/AnswerComponent;", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/ugc/view/questions/AnswersDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;)Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "newItem", "getPayload", "(Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;)Ljava/lang/Object;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerMapper;", "mapper", "Payload", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnswerViewMapper extends WidgetViewMapper2<AnswerComponent, ListAnswersDTO, AnswerVO> {
    private final int layout = R$layout.widget_answer;

    @NotNull
    private final Function2<View, ComposerReferences, AnswerViewHolder> holderProducer = new AnswerViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(VoteUpdateKey.class, AnswerHighlightedStateUpdateKey.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerViewMapper$Payload;", "", "<init>", "(Ljava/lang/String;I)V", "VOTE", "TEXT", "HIGHLIGHTED_STATE", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Payload {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload VOTE = new Payload("VOTE", 0);
        public static final Payload TEXT = new Payload("TEXT", 1);
        public static final Payload HIGHLIGHTED_STATE = new Payload("HIGHLIGHTED_STATE", 2);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{VOTE, TEXT, HIGHLIGHTED_STATE};
        }

        static {
            Payload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Payload(String str, int i11) {
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ListAnswersDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<AnswersDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new AnswersDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AnswerViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AnswerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AnswerComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public AnswerMapper getMapper() {
        return component().getAnswersMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AnswerVO oldItem, @NotNull AnswerVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getLike(), newItem.getLike()) || !Intrinsics.d(oldItem.getDislike(), newItem.getDislike())) {
            arrayList.add(Payload.VOTE);
        }
        if (!Intrinsics.d(oldItem.getAnswerText(), newItem.getAnswerText())) {
            arrayList.add(Payload.TEXT);
        }
        if (!Intrinsics.d(oldItem.getBackgroundColor(), newItem.getBackgroundColor())) {
            arrayList.add(Payload.HIGHLIGHTED_STATE);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AnswerVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AnswerVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return new AnswerUpdateConsumer().invoke(update, oldItem);
    }
}
