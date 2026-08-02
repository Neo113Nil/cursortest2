package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2BlockWidgetViewHolder$notificationBarDelegate$2 extends AbstractC7737t implements Function0<NotificationBarDelegate> {
    final /* synthetic */ FlightSeatsSchemeV2BlockWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2BlockWidgetViewHolder$notificationBarDelegate$2(FlightSeatsSchemeV2BlockWidgetViewHolder flightSeatsSchemeV2BlockWidgetViewHolder) {
        super(0);
        this.this$0 = flightSeatsSchemeV2BlockWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationBarDelegate invoke() {
        i iVar;
        ViewGroup composerContainer;
        Function1 function1;
        iVar = this.this$0.container;
        r a11 = iVar.Q().a();
        if (a11 == null) {
            return null;
        }
        FlightSeatsSchemeV2BlockWidgetViewHolder flightSeatsSchemeV2BlockWidgetViewHolder = this.this$0;
        ViewGroup rootView = ContextExtKt.getRootView(a11);
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null) {
            return null;
        }
        function1 = flightSeatsSchemeV2BlockWidgetViewHolder.actionHandler;
        return new NotificationBarDelegate(composerContainer, a11, function1);
    }
}
