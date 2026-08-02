package ru.ozon.app.android.common.filterWidgets.filters.presentation.boolfilter;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.common.filterWidgets.filters.data.BoolFilterModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/BoolFilterModel;", "model", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/boolfilter/BoolFilterVO;", "invoke", "(Lru/ozon/app/android/common/filterWidgets/filters/data/BoolFilterModel;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class BoolFilterViewMapper$mapper$1 extends AbstractC7737t implements Function2<BoolFilterModel, d, List<? extends BoolFilterVO>> {
    public static final BoolFilterViewMapper$mapper$1 INSTANCE = new BoolFilterViewMapper$mapper$1();

    BoolFilterViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<BoolFilterVO> invoke(BoolFilterModel model, d info) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(BoolFilterVOKt.toVo(model, info.d()));
    }
}
