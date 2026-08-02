package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import De.s;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.domain.tiles.dislike.model.DislikeResult;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeId;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\"R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R\u001b\u0010+\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "needProcessNotifications", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayView;", "overlayView", "<init>", "(Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;Lru/ozon/app/android/composer/ComposerReferences;ZLSc/j;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "data", "", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "id", "", "getStringRes", "(I)Ljava/lang/String;", "forceShow", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "roundMode", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "dislikeId", "topOffset", "bind", "(ZLru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;Ljava/lang/Integer;)V", "subscribe", "()V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "Lru/ozon/app/android/composer/ComposerReferences;", "Z", "LSc/j;", "defaultErrorNotification$delegate", "getDefaultErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "defaultErrorNotification", "Lxe/M;", "scope", "Lxe/M;", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "Ljava/lang/Integer;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileOverlayBinder {

    /* renamed from: defaultErrorNotification$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultErrorNotification;
    private TileDislikeId dislikeId;
    private final boolean needProcessNotifications;
    private TileGrid2DTO.OverlayItem overlayItem;
    private InterfaceC4008j<? extends TileOverlayView> overlayView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private RoundMode roundMode;

    @NotNull
    private final M scope;
    private final TileDislikeInteractor tileDislikeInteractor;
    private Integer topOffset;

    public TileOverlayBinder(TileDislikeInteractor tileDislikeInteractor, @NotNull ComposerReferences references, boolean z11, InterfaceC4008j<? extends TileOverlayView> interfaceC4008j) {
        Intrinsics.checkNotNullParameter(references, "references");
        this.tileDislikeInteractor = tileDislikeInteractor;
        this.references = references;
        this.needProcessNotifications = z11;
        this.overlayView = interfaceC4008j;
        this.defaultErrorNotification = LazyUtilsKt.unsafeLazy(new TileOverlayBinder$defaultErrorNotification$2(this));
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11).plus(new TileOverlayBinder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.roundMode = RoundMode.ALL;
    }

    public static /* synthetic */ void bind$default(TileOverlayBinder tileOverlayBinder, boolean z11, TileGrid2DTO.OverlayItem overlayItem, RoundMode roundMode, TileDislikeId tileDislikeId, Integer num, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            tileDislikeId = null;
        }
        if ((i11 & 16) != 0) {
            num = null;
        }
        tileOverlayBinder.bind(z11, overlayItem, roundMode, tileDislikeId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultErrorNotification() {
        return (NotificationDTO) this.defaultErrorNotification.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStringRes(int id2) {
        Context context;
        Resources resources;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (context = c11.getContext()) == null || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getString(id2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO data) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = this.references.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, data, this.references.getContainer().f(), null, 8, null).show();
    }

    public final void bind(boolean forceShow, TileGrid2DTO.OverlayItem overlayItem, @NotNull RoundMode roundMode, TileDislikeId dislikeId, Integer topOffset) {
        TileOverlayView value;
        TileOverlayView value2;
        Intrinsics.checkNotNullParameter(roundMode, "roundMode");
        this.dislikeId = dislikeId;
        this.roundMode = roundMode;
        this.topOffset = topOffset;
        this.overlayItem = overlayItem;
        InterfaceC4008j<? extends TileOverlayView> interfaceC4008j = this.overlayView;
        if ((interfaceC4008j == null || !interfaceC4008j.isInitialized()) && !forceShow) {
            return;
        }
        InterfaceC4008j<? extends TileOverlayView> interfaceC4008j2 = this.overlayView;
        if (interfaceC4008j2 != null && (value2 = interfaceC4008j2.getValue()) != null) {
            value2.bind(overlayItem, roundMode, topOffset);
        }
        InterfaceC4008j<? extends TileOverlayView> interfaceC4008j3 = this.overlayView;
        if (interfaceC4008j3 == null || (value = interfaceC4008j3.getValue()) == null) {
            return;
        }
        value.setVisible(forceShow);
    }

    public final void subscribe() {
        InterfaceC4008j<? extends TileOverlayView> interfaceC4008j;
        TileDislikeInteractor tileDislikeInteractor;
        InterfaceC2395h<DislikeResult> observeDislikeInfo;
        TileDislikeId tileDislikeId = this.dislikeId;
        if (tileDislikeId == null || (interfaceC4008j = this.overlayView) == null || (tileDislikeInteractor = this.tileDislikeInteractor) == null || (observeDislikeInfo = tileDislikeInteractor.observeDislikeInfo(tileDislikeId)) == null) {
            return;
        }
        C2399j.C(new C2408n0(observeDislikeInfo, new TileOverlayBinder$subscribe$1(interfaceC4008j, this, null)), this.scope);
    }

    public final void unsubscribe() {
        E0.d(this.scope.getCoroutineContext());
    }
}
