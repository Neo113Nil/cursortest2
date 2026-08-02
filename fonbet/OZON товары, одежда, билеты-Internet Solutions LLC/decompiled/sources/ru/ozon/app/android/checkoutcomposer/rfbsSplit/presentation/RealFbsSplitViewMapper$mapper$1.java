package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.data.RealFbsSplitDTO;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.decorator.RfbsCornerRoundedDecorator;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class RealFbsSplitViewMapper$mapper$1 extends AbstractC7737t implements Function2<RealFbsSplitDTO, d, List<? extends RealFbsSplitVO>> {
    final /* synthetic */ RealFbsSplitViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealFbsSplitViewMapper$mapper$1(RealFbsSplitViewMapper realFbsSplitViewMapper) {
        super(2);
        this.this$0 = realFbsSplitViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<RealFbsSplitVO> invoke(RealFbsSplitDTO dto, d info) {
        RfbsCornerRoundedDecorator decorator;
        RealFbsSplitWidgetComponent realFbsSplitWidgetComponent;
        RealFbsSplitVO viewObject;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        this.this$0.widgetInfo = info;
        decorator = this.this$0.getDecorator();
        Boolean showSeparator = dto.getShowSeparator();
        decorator.setShowSeparator(showSeparator != null ? showSeparator.booleanValue() : true);
        RealFbsSplitViewMapper realFbsSplitViewMapper = this.this$0;
        realFbsSplitWidgetComponent = realFbsSplitViewMapper.component;
        viewObject = realFbsSplitViewMapper.toViewObject(realFbsSplitWidgetComponent.getAppContext(), info.d(), dto);
        return C7714v.a0(viewObject);
    }
}
