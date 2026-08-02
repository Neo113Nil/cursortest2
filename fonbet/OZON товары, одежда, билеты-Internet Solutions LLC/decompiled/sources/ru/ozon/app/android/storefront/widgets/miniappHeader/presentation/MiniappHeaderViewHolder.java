package ru.ozon.app.android.storefront.widgets.miniappHeader.presentation;

import DN.b;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.navBar.views.MiniappHeaderView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/miniappHeader/presentation/MiniappHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/miniappHeader/presentation/MiniappHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/navBar/views/MiniappHeaderView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/storefront/navBar/views/MiniappHeaderView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/miniappHeader/presentation/MiniappHeaderVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/miniappHeader/presentation/MiniappHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/navBar/views/MiniappHeaderView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MiniappHeaderViewHolder extends k<MiniappHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final MiniappHeaderView containerView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniappHeaderViewHolder(@NotNull MiniappHeaderView containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        containerView.setOnClickListener(new b(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MiniappHeaderViewHolder miniappHeaderViewHolder, View view) {
        AtomAction action;
        MiniappHeaderVO boundData = miniappHeaderViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        miniappHeaderViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MiniappHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        MiniappHeaderView miniappHeaderView = this.containerView;
        miniappHeaderView.bindIcon(item.getIcon());
        miniappHeaderView.bindLogoOrGone(item.getLogo());
        miniappHeaderView.bindTitle(item.getTitle());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull MiniappHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
