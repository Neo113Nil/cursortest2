package ru.ozon.app.android.ugc.widgets.stickyBubble.core;

import A00.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.SubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.UnsubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.profileHeader.ProfileHeaderVisibilityKey;
import ru.ozon.app.android.ugc.widgets.stickyBubble.data.StickyBubbleDTO;
import ru.ozon.app.android.ugc.widgets.stickyBubble.di.StickyBubbleComponent;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleVO;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleView;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\"0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/core/StickyBubbleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/di/StickyBubbleComponent;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;)Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickyBubbleViewMapper extends OverlayWidgetScreenViewItemMapper2<StickyBubbleComponent, StickyBubbleDTO, StickyBubbleVO> {

    @NotNull
    private final r.a viewType = r.a.MULTIPLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(SubscribeAuthorUpdateKey.class, UnsubscribeAuthorUpdateKey.class, ProfileHeaderVisibilityKey.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StickyBubbleView stickyBubbleView = new StickyBubbleView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        stickyBubbleView.setWeightSum(1.0f);
        layoutParams.gravity = 8388613;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMarginEnd(dimens.getDP_12());
        layoutParams.bottomMargin = dimens.getDP_12();
        stickyBubbleView.setLayoutParams(layoutParams);
        return stickyBubbleView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyBubbleVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new StickyBubbleViewHolder(container, component().getCustomActionHandlersStoreFactory().create(SubscribeAuthorActionHandler.class, UnsubscribeAuthorActionHandler.class), component().getTokenizedAnalytics(), new Jp.a(2));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StickyBubbleComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return StickyBubbleComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public StickyBubbleVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull StickyBubbleVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof ProfileHeaderVisibilityKey)) {
            return ((update instanceof SubscribeAuthorUpdateKey) && Intrinsics.d(((SubscribeAuthorUpdateKey) update).getAuthorId(), oldItem.getDefaultState().getAuthorId())) ? StickyBubbleVO.copy$default(oldItem, 0L, false, false, true, false, false, null, null, null, 503, null) : ((update instanceof UnsubscribeAuthorUpdateKey) && Intrinsics.d(((UnsubscribeAuthorUpdateKey) update).getAuthorId(), oldItem.getDefaultState().getAuthorId())) ? StickyBubbleVO.copy$default(oldItem, 0L, false, false, false, false, false, null, null, null, 503, null) : oldItem;
        }
        return StickyBubbleVO.copy$default(oldItem, 0L, !r0.getIsVisible(), false, false, Intrinsics.d(((ProfileHeaderVisibilityKey) update).getIsSubscribed(), Boolean.TRUE), false, null, null, null, 493, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyBubbleVO> map(@NotNull StickyBubbleDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
