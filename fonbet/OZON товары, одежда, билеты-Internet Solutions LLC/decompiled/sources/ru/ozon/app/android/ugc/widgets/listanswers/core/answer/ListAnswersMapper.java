package ru.ozon.app.android.ugc.widgets.listanswers.core.answer;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerVO;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.ListAnswersVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/ListAnswersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/ListAnswersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerMapper;", "answerMapper", "<init>", "(Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerMapper;)V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerMapper;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListAnswersMapper implements Function2<ListAnswersDTO, d, List<? extends ListAnswersVO>> {

    @NotNull
    private final AnswerMapper answerMapper;

    public ListAnswersMapper(@NotNull AnswerMapper answerMapper) {
        Intrinsics.checkNotNullParameter(answerMapper, "answerMapper");
        this.answerMapper = answerMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ListAnswersVO> invoke(@NotNull ListAnswersDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<AnswerVO> invoke = this.answerMapper.invoke(dto, widgetInfo);
        if (invoke.isEmpty()) {
            invoke = null;
        }
        List<ListAnswersVO> a02 = invoke != null ? C7714v.a0(new ListAnswersVO(widgetInfo.d().hashCode(), invoke)) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
