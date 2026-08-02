package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewHolders;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.utils.GalleryUtils;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryOrderOnDetailsViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ DeliveryOrderOnDetailsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryOrderOnDetailsViewHolder$actionHandler$1(DeliveryOrderOnDetailsViewHolder deliveryOrderOnDetailsViewHolder) {
        super(1);
        this.this$0 = deliveryOrderOnDetailsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (id2 != null) {
            DeliveryOrderOnDetailsViewHolder deliveryOrderOnDetailsViewHolder = this.this$0;
            if (id2.equals("openGallery")) {
                Map<String, String> params = action.getParams();
                List<String> parseImageUrlsFromEncodedModel = GalleryUtils.INSTANCE.parseImageUrlsFromEncodedModel(params != null ? params.get("encodedModel") : null);
                List<String> list = parseImageUrlsFromEncodedModel;
                if (list == null || list.isEmpty()) {
                    return;
                }
                deliveryOrderOnDetailsViewHolder.openGallery(parseImageUrlsFromEncodedModel);
            }
        }
    }
}
