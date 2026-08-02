package ru.ozon.app.android.ads.widgets.advPageStay.presentation;

import BD.a;
import c20.r;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advPageStay.data.AdvPageStayDTO;
import ru.ozon.app.android.ads.widgets.advPageStay.di.AdvPageStayComponent;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ads/widgets/advPageStay/di/AdvPageStayComponent;", "Lru/ozon/app/android/ads/widgets/advPageStay/data/AdvPageStayDTO;", "Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ads/widgets/advPageStay/data/AdvPageStayDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvPageStayViewMapper extends OverlayWidgetScreenViewItemMapper2<AdvPageStayComponent, AdvPageStayDTO, AdvPageStayVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvPageStayComponent widgetComponent$lambda$0(C7475g c7475g) {
        return AdvPageStayComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof AdvPageStayDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AdvPageStayVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new AdvPageStayViewHolder(container, component().getViewModel(), component().getTokenizedAnalytics());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AdvPageStayComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(AdvPageStayComponent.class), new a(storage, 1));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AdvPageStayVO> map(@NotNull AdvPageStayDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        List<AdvPageStayDTO.AdvPageStayEventDTO> events = state.getEvents();
        ArrayList arrayList = new ArrayList(C7714v.z(events, 10));
        for (AdvPageStayDTO.AdvPageStayEventDTO advPageStayEventDTO : events) {
            arrayList.add(new AdvPageStayVO.AdvEvent(advPageStayEventDTO.getDelayMS(), TrackingInfoMapperKt.toTokenizedEvent$default(U.i(new Pair(ActionType.VIEW.INSTANCE.getType(), advPageStayEventDTO.getTrackingInfo())), Long.valueOf(hashCode), null, 2, null)));
        }
        return C7714v.a0(new AdvPageStayVO(hashCode, arrayList));
    }
}
