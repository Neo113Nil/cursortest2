package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/image/CommonImageVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CommonImageSubwidgetKt$commonImageElement$3 extends AbstractC7737t implements Function1<k<CommonImageVO>, Unit> {
    public static final CommonImageSubwidgetKt$commonImageElement$3 INSTANCE = new CommonImageSubwidgetKt$commonImageElement$3();

    CommonImageSubwidgetKt$commonImageElement$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(k<CommonImageVO> kVar) {
        invoke2(kVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(k<CommonImageVO> widgetSpec) {
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(ComposableSingletons$CommonImageSubwidgetKt.INSTANCE.m1508getLambda1$core_prodGoogleAllVendorsRelease());
    }
}
