package ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.presentation;

import Sc.InterfaceC4008j;
import UZ.a;
import UZ.d;
import W10.c;
import WZ.e;
import WZ.g;
import WZ.t;
import android.app.NotificationManager;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.presentation.TravelNotificationModalCheckViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import v10.C10183a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001f¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelNotificationModalCheck/presentation/TravelNotificationModalCheckViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelNotificationModalCheck/presentation/TravelNotificationModalCheckVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "getCustomParamsModifier", "()LWZ/e;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelNotificationModalCheck/presentation/TravelNotificationModalCheckVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelNotificationModalCheck/presentation/TravelNotificationModalCheckVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "parent", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "view$delegate", "LSc/j;", "getView", "()Landroid/view/View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "areNotificationsEnabled", "Z", "getMetricView", "metricView", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelNotificationModalCheckViewHolder extends AbstractC6065b<TravelNotificationModalCheckVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean areNotificationsEnabled;

    @NotNull
    private final i container;

    @NotNull
    private final LinearLayout parent;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;
    public static final int $stable = 8;

    public TravelNotificationModalCheckViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.parent = C10183a.o(container.Y());
        this.view = LazyUtilsKt.unsafeLazy(new TravelNotificationModalCheckViewHolder$view$2(viewFactory, this));
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    private final e getCustomParamsModifier() {
        final Map i11 = U.i(new Pair("hasPermission", Boolean.valueOf(this.areNotificationsEnabled)));
        return new e() { // from class: HQ.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g customParamsModifier$lambda$2;
                customParamsModifier$lambda$2 = TravelNotificationModalCheckViewHolder.getCustomParamsModifier$lambda$2(i11, (d) aVar, gVar);
                return customParamsModifier$lambda$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getCustomParamsModifier$lambda$2(Map map, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    private final View getView() {
        return (View) this.view.getValue();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getView();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelNotificationModalCheckVO item) {
        AtomAction action;
        Intrinsics.checkNotNullParameter(item, "item");
        Object systemService = this.container.L().getSystemService("notification");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        boolean areNotificationsEnabled = ((NotificationManager) systemService).areNotificationsEnabled();
        this.areNotificationsEnabled = areNotificationsEnabled;
        if ((areNotificationsEnabled && item.getIsSubscribed()) || (action = item.getAction()) == null) {
            return;
        }
        this.actionHandler.invoke(action);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull TravelNotificationModalCheckVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents(this.container.X(), viewEvent, getCustomParamsModifier());
        }
    }
}
