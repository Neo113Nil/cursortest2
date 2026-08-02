package ru.ozon.app.android.ui.widgets.textWidget.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TextWidgetViewHolder$textWidgetListAdapter$1 extends C7735q implements Function1<TextWidgetVO.TextWidgetItemVO.TextExpandableVO, Unit> {
    TextWidgetViewHolder$textWidgetListAdapter$1(Object obj) {
        super(1, obj, TextWidgetViewHolder.class, "changeExpandedState", "changeExpandedState(Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextWidgetVO.TextWidgetItemVO.TextExpandableVO textExpandableVO) {
        invoke2(textExpandableVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TextWidgetVO.TextWidgetItemVO.TextExpandableVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TextWidgetViewHolder) this.receiver).changeExpandedState(p02);
    }
}
