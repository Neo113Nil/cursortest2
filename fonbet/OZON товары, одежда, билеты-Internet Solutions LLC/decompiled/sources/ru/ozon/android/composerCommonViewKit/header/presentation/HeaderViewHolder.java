package ru.ozon.android.composerCommonViewKit.header.presentation;

import BS.a;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;", "containerView", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "Ll10/i;", "container", "<init>", "(Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;LWZ/l;Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;Ll10/i;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HeaderViewHolder extends k<HeaderVO> {
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HeaderView containerView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewHolder(@NotNull HeaderView containerView, @NotNull l tokenizedAnalytics, @NotNull ActionHandlersFactory actionHandlersFactory, @NotNull i container) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandlersFactory.createActionHandler(container, this);
        containerView.setOnClickListener(new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HeaderViewHolder headerViewHolder, View view) {
        HeaderVO boundData;
        AtomAction action;
        Function1<AtomAction, Unit> function1 = headerViewHolder.actionHandler;
        if (function1 == null || (boundData = headerViewHolder.getBoundData()) == null || (action = boundData.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item);
        this.containerView.bindBadge(item.getBadge(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HeaderViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
