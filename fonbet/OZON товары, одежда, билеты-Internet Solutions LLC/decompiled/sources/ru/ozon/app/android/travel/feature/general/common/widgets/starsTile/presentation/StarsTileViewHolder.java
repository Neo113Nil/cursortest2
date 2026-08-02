package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.view.StarsTileView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u000e\u0010\u0012J)\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/view/StarsTileView;", "view", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/view/StarsTileView;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/view/StarsTileView;", "LWZ/l;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StarsTileViewHolder extends k<StarsTileVI> {

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final StarsTileView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarsTileViewHolder(@NotNull StarsTileView view, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull StarsTileVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StarsTileVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StarsTileVI item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj == StarsTilePayload.FIRST_BLOCK) {
                this.view.bindFirstBlock(item.getFirstBlock());
            } else if (obj == StarsTilePayload.SECOND_BLOCK) {
                this.view.bindSecondBlock(item.getSecondBlock());
            } else if (obj == StarsTilePayload.BACKGROUND) {
                this.view.bindBackground(item.getBackgroundColor());
            }
        }
    }
}
