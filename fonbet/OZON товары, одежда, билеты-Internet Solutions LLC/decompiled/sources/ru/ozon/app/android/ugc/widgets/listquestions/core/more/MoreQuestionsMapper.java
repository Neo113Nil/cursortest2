package ru.ozon.app.android.ugc.widgets.listquestions.core.more;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.listquestions.data.ListQuestionsDTO;
import ru.ozon.app.android.ugc.widgets.listquestions.presentation.more.MoreQuestionsVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listquestions/core/more/MoreQuestionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/listquestions/data/ListQuestionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/listquestions/presentation/more/MoreQuestionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/listquestions/data/ListQuestionsDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MoreQuestionsMapper implements Function2<ListQuestionsDTO, d, List<? extends MoreQuestionsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MoreQuestionsVO> invoke(@NotNull ListQuestionsDTO dto, @NotNull d widgetInfo) {
        List<MoreQuestionsVO> a02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter moreQuestions = dto.getMoreQuestions();
        return (moreQuestions == null || (a02 = C7714v.a0(new MoreQuestionsVO((long) widgetInfo.d().hashCode(), moreQuestions))) == null) ? K.f71697a : a02;
    }
}
