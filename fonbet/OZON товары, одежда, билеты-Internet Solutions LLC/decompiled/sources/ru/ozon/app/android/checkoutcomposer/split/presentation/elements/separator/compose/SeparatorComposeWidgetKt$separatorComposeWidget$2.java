package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.SeparatorVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SeparatorComposeWidgetKt$separatorComposeWidget$2 extends AbstractC7737t implements Function2<Object, d, List<? extends SeparatorVO>> {
    public static final SeparatorComposeWidgetKt$separatorComposeWidget$2 INSTANCE = new SeparatorComposeWidgetKt$separatorComposeWidget$2();

    SeparatorComposeWidgetKt$separatorComposeWidget$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<SeparatorVO> invoke(Object state, d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        SplitElementDTO.SplitSeparatorDTO splitSeparatorDTO = (SplitElementDTO.SplitSeparatorDTO) state;
        String d11 = info.d();
        Long index = splitSeparatorDTO.getIndex();
        return C7714v.a0(new SeparatorVO((d11 + index).hashCode(), splitSeparatorDTO.getColor(), splitSeparatorDTO.getPaddings()));
    }
}
