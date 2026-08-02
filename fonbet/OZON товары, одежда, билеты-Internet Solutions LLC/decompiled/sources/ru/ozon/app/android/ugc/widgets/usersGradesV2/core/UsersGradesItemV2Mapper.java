package ru.ozon.app.android.ugc.widgets.usersGradesV2.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.data.UsersGradesV2DTO;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/core/UsersGradesItemV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextAnswerItem;", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO$ContextAnswerItem;", "toAnswersVO", "(Ljava/util/List;)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersGradesItemV2Mapper implements Function2<UsersGradesV2DTO.ContextQuestionItemDTO, d, List<? extends ContextQuestionItemVO>> {
    private final List<ContextQuestionItemVO.ContextAnswerItem> toAnswersVO(List<UsersGradesV2DTO.ContextAnswerItem> list) {
        List<UsersGradesV2DTO.ContextAnswerItem> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (UsersGradesV2DTO.ContextAnswerItem contextAnswerItem : list2) {
            arrayList.add(new ContextQuestionItemVO.ContextAnswerItem(contextAnswerItem.getTitle(), contextAnswerItem.getValue(), contextAnswerItem.getTextValue(), contextAnswerItem.getProgressColor()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ContextQuestionItemVO> invoke(@NotNull UsersGradesV2DTO.ContextQuestionItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CellDTO foldedCell = state.getFoldedCell();
        CellDTO unfoldedCell = state.getUnfoldedCell();
        boolean isUnfolded = state.isUnfolded();
        List<UsersGradesV2DTO.ContextAnswerItem> contextAnswers = state.getContextAnswers();
        List<ContextQuestionItemVO.ContextAnswerItem> answersVO = contextAnswers != null ? toAnswersVO(contextAnswers) : null;
        String color = state.getColor();
        String rootBackgroundColor = state.getRootBackgroundColor();
        Integer bottomPadding = state.getBottomPadding();
        int intValue = bottomPadding != null ? bottomPadding.intValue() : 8;
        Float rootCornerRadius = state.getRootCornerRadius();
        return C7714v.a0(new ContextQuestionItemVO(hashCode, foldedCell, unfoldedCell, isUnfolded, answersVO, color, rootBackgroundColor, intValue, rootCornerRadius != null ? rootCornerRadius.floatValue() : ResourceExtKt.toPxF(CornerRadius.RADIUS_300.getPx())));
    }
}
