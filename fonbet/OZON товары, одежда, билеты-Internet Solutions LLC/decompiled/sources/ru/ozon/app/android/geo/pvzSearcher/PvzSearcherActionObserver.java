package ru.ozon.app.android.geo.pvzSearcher;

import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditformprompt.data.ViewPort;
import ru.ozon.app.android.geo.mapupdater.MapUpdateProducer;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002JI\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherActionObserver;", "", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "mapUpdateProducer", "Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;", "onLoaderVisibilityChanged", "Lkotlin/Function1;", "", "", "actionHandler", "Lru/ozon/uni/atoms/af/AtomAction;", "widgetId", "", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;)V", "Ljava/lang/Long;", "handleAction", "action", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel$Action;", "sendUpdate", "link", "", "viewPort", "Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;", "showError", "showRestriction", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "trackingPayloads", "", "(Lru/ozon/uni/android/flashbar/model/Restriction;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;)V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PvzSearcherActionObserver {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final MapUpdateProducer mapUpdateProducer;
    private final Function1<Boolean, Unit> onLoaderVisibilityChanged;

    @NotNull
    private final ComposerReferences references;
    private final Long widgetId;

    /* JADX WARN: Multi-variable type inference failed */
    public PvzSearcherActionObserver(@NotNull ComposerReferences references, @NotNull MapUpdateProducer mapUpdateProducer, Function1<? super Boolean, Unit> function1, @NotNull Function1<? super AtomAction, Unit> actionHandler, Long l11) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(mapUpdateProducer, "mapUpdateProducer");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.references = references;
        this.mapUpdateProducer = mapUpdateProducer;
        this.onLoaderVisibilityChanged = function1;
        this.actionHandler = actionHandler;
        this.widgetId = l11;
    }

    private final void sendUpdate(String link, ViewPort viewPort) {
        this.mapUpdateProducer.sendMapUpdate(link, viewPort);
    }

    private final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.references.getContainer().g(), 62, null).show();
    }

    private final void showRestriction(Restriction restriction, Map<String, String> trackingPayloads, Function1<? super AtomAction, Unit> actionHandler, Long widgetId) {
        ViewGroup rootView;
        if (trackingPayloads != null) {
            this.references.getTokenizedAnalytics().e(trackingPayloads);
        }
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(restriction), this.references.getContainer().g(), null, actionHandler, new PvzSearcherActionObserver$showRestriction$2$1(restriction, widgetId, this), null, null, m.e.DEFAULT_DRAG_ANIMATION_DURATION, null);
    }

    public final void handleAction(@NotNull PvzSearcherViewModel.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof PvzSearcherViewModel.Action.ShowLoader) {
            Function1<Boolean, Unit> function1 = this.onLoaderVisibilityChanged;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (action instanceof PvzSearcherViewModel.Action.HideLoader) {
            Function1<Boolean, Unit> function12 = this.onLoaderVisibilityChanged;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (action instanceof PvzSearcherViewModel.Action.Error) {
            showError();
            return;
        }
        if (action instanceof PvzSearcherViewModel.Action.Refresh) {
            PvzSearcherViewModel.Action.Refresh refresh = (PvzSearcherViewModel.Action.Refresh) action;
            sendUpdate(refresh.getLink(), refresh.getViewPort());
        } else {
            if (!(action instanceof PvzSearcherViewModel.Action.Notification)) {
                throw new o();
            }
            PvzSearcherViewModel.Action.Notification notification = (PvzSearcherViewModel.Action.Notification) action;
            showRestriction(notification.getRestriction(), notification.getTrackingPayloads(), this.actionHandler, this.widgetId);
        }
    }

    public /* synthetic */ PvzSearcherActionObserver(ComposerReferences composerReferences, MapUpdateProducer mapUpdateProducer, Function1 function1, Function1 function12, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerReferences, mapUpdateProducer, (i11 & 4) != 0 ? null : function1, function12, l11);
    }
}
