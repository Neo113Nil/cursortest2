package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0014\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationCarouselV2BaseItemViewHolder$Companion$ROUNDED_CORNERS$2 extends AbstractC7737t implements Function0<float[]> {
    public static final NotificationCarouselV2BaseItemViewHolder$Companion$ROUNDED_CORNERS$2 INSTANCE = new NotificationCarouselV2BaseItemViewHolder$Companion$ROUNDED_CORNERS$2();

    NotificationCarouselV2BaseItemViewHolder$Companion$ROUNDED_CORNERS$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final float[] invoke() {
        NotificationCarouselV2BaseItemViewHolder.Companion companion;
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            companion = NotificationCarouselV2BaseItemViewHolder.Companion;
            fArr[i11] = companion.getCORNER_RADIUS();
        }
        return fArr;
    }
}
