package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation;

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
/* loaded from: classes3.dex */
final class EmptyStateV3WidgetViewHolder$notificationBarDelegate$2 extends AbstractC7737t implements Function0<NotificationBarDelegate> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ EmptyStateV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV3WidgetViewHolder$notificationBarDelegate$2(ComposerReferences composerReferences, EmptyStateV3WidgetViewHolder emptyStateV3WidgetViewHolder) {
        super(0);
        this.$refs = composerReferences;
        this.this$0 = emptyStateV3WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationBarDelegate invoke() {
        ViewGroup composerContainer;
        Function1 function1;
        r a11 = this.$refs.getContainer().a();
        if (a11 == null) {
            return null;
        }
        EmptyStateV3WidgetViewHolder emptyStateV3WidgetViewHolder = this.this$0;
        ViewGroup rootView = ContextExtKt.getRootView(a11);
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null) {
            return null;
        }
        function1 = emptyStateV3WidgetViewHolder.actionHandler;
        return new NotificationBarDelegate(composerContainer, a11, function1);
    }
}
