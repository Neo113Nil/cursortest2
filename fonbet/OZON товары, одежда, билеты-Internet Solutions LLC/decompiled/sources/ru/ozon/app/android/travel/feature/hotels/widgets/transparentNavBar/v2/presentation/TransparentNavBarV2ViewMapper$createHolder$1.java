package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TransparentNavBarV2ViewMapper$createHolder$1 extends AbstractC7737t implements Function0<ScrollAnchorViewModel> {
    final /* synthetic */ TransparentNavBarV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavBarV2ViewMapper$createHolder$1(TransparentNavBarV2ViewMapper transparentNavBarV2ViewMapper) {
        super(0);
        this.this$0 = transparentNavBarV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScrollAnchorViewModel invoke() {
        return this.this$0.component().getScrollAnchorViewModel();
    }
}
