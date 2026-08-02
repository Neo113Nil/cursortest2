package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToursSearchResultWidgetViewHolder$notificationBarDelegate$2 extends AbstractC7737t implements Function0<NotificationBarDelegate> {
    final /* synthetic */ ToursSearchResultWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultWidgetViewHolder$notificationBarDelegate$2(ToursSearchResultWidgetViewHolder toursSearchResultWidgetViewHolder) {
        super(0);
        this.this$0 = toursSearchResultWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationBarDelegate invoke() {
        ComposerReferences composerReferences;
        ViewGroup composerContainer;
        Function1 function1;
        composerReferences = this.this$0.refs;
        r a11 = composerReferences.getContainer().a();
        if (a11 == null) {
            return null;
        }
        ToursSearchResultWidgetViewHolder toursSearchResultWidgetViewHolder = this.this$0;
        ViewGroup rootView = ContextExtKt.getRootView(a11);
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null) {
            return null;
        }
        function1 = toursSearchResultWidgetViewHolder.actionHandler;
        return new NotificationBarDelegate(composerContainer, a11, function1);
    }
}
