package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import l10.InterfaceC7851b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ReviewGalleryBaseWidgetVH$onAttachViewModel$1$4 extends C7735q implements Function1<Integer, Unit> {
    ReviewGalleryBaseWidgetVH$onAttachViewModel$1$4(Object obj) {
        super(1, obj, InterfaceC7851b.class, "scrollToPosition", "scrollToPosition(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((InterfaceC7851b) this.receiver).l(i11);
    }
}
