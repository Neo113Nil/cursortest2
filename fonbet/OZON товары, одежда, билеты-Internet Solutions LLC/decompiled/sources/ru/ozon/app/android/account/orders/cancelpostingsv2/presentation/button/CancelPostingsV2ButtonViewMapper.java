package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button;

import BZ.f;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import qk.a;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.ButtonModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingsV2ButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/di/CancelPostingsV2Component;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ButtonModel;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/ButtonVO;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;", "createView", "(Landroid/content/Context;)Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonBaseView;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonTeenView;", "createTeenView", "(Landroid/content/Context;)Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingV2StickyButtonTeenView;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ButtonModel;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CancelPostingsV2ButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<CancelPostingsV2Component, ButtonModel, ButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(CancelPostingV2StickyButtonBaseView cancelPostingV2StickyButtonBaseView, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cancelPostingV2StickyButtonBaseView;
    }

    private final CancelPostingV2StickyButtonTeenView createTeenView(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, f.b(component().getMiniAppConfigHolder()));
        Configuration configuration = new Configuration();
        configuration.uiMode = 32;
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        return new CancelPostingV2StickyButtonTeenView(contextThemeWrapper, null, 0, 0, 14, null);
    }

    private final CancelPostingV2StickyButtonBaseView createView(Context context) {
        if (component().getTeensModeStorage().isTeensModeEnabled()) {
            return createTeenView(context);
        }
        return new CancelPostingV2StickyButtonCommonView(context, null, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CancelPostingsV2Component widgetComponent$lambda$1(C7475g c7475g) {
        return CancelPostingsV2Component.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ButtonModel;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        CancelPostingV2StickyButtonBaseView createView = createView(L11);
        return new CancelPostingsV2ButtonWidgetViewHolder(createView, container, new a(createView, 0), component().getTokenizedAnalytics(), component().getCustomActionHandlersStoreFactory());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CancelPostingsV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CancelPostingsV2Component.class), new DU.a(storage, 9));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ButtonVO> map(@NotNull ButtonModel state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getButtonMapper().invoke(state, info);
    }
}
