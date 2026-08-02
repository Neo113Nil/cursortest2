package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.cell;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.CellModel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/CellModel;", "dto", "Ll20/d;", "<unused var>", "", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellVO;", "invoke", "(Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/CellModel;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class FeedbackCellViewMapper$mapper$1 extends AbstractC7737t implements Function2<CellModel, d, List<? extends FeedbackCellVO>> {
    public static final FeedbackCellViewMapper$mapper$1 INSTANCE = new FeedbackCellViewMapper$mapper$1();

    FeedbackCellViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<FeedbackCellVO> invoke(CellModel dto, d dVar) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        return C7714v.a0(new FeedbackCellVO(dto.hashCode(), dto.getCell(), dto.getInputSettings(), dto.getOptionType(), dto.getIsFirstCell(), dto.getIsLastCell(), false, dto.getTrackingInfo()));
    }
}
