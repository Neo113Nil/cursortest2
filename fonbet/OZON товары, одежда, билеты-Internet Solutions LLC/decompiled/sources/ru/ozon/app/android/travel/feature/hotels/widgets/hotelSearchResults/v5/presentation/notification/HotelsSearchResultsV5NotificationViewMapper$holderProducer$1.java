package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.notification;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class HotelsSearchResultsV5NotificationViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, HotelsSearchResultsV5NotificationWidgetViewHolder> {
    public static final HotelsSearchResultsV5NotificationViewMapper$holderProducer$1 INSTANCE = new HotelsSearchResultsV5NotificationViewMapper$holderProducer$1();

    HotelsSearchResultsV5NotificationViewMapper$holderProducer$1() {
        super(2, HotelsSearchResultsV5NotificationWidgetViewHolder.class, "<init>", "<init>(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final HotelsSearchResultsV5NotificationWidgetViewHolder invoke(View p02, ComposerReferences p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return new HotelsSearchResultsV5NotificationWidgetViewHolder(p02, p12);
    }
}
