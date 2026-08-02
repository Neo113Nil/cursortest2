package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Wc.a;
import android.os.Parcelable;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2Repository;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00102\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0013\u00101\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2Repository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2Repository;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "updatePeriodSeconds", "", "scheduleUpdate", "(Ll20/d;J)V", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "newState", "setNewState", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cancelScheduledWidgetUpdate", "()V", "onCleared", "item", "trySetNewState", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;Ll20/d;)V", "Landroid/os/Parcelable;", "state", "saveRecyclerViewState", "(Landroid/os/Parcelable;)V", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2Repository;", "Lxe/B0;", "updateTimerJob", "Lxe/B0;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "widgetStatesCache", "Ljava/util/HashSet;", "LAe/x0;", "_widgetUpdates", "LAe/x0;", "LAe/h;", "widgetUpdates", "LAe/h;", "getWidgetUpdates", "()LAe/h;", "getCurrentWidgetState", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "currentWidgetState", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2ViewModelFF extends w0 implements InterfaceC6786a {

    @NotNull
    private final x0<NotificationCarouselV2VO> _widgetUpdates;

    @NotNull
    private final NotificationCarouselV2Repository repository;
    private B0 updateTimerJob;

    @NotNull
    private final HashSet<Integer> widgetStatesCache;

    @NotNull
    private final InterfaceC2395h<NotificationCarouselV2VO> widgetUpdates;

    public NotificationCarouselV2ViewModelFF(@NotNull NotificationCarouselV2Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.widgetStatesCache = new HashSet<>();
        x0<NotificationCarouselV2VO> a11 = O0.a(null);
        this._widgetUpdates = a11;
        this.widgetUpdates = new C2406m0(C2399j.b(a11));
    }

    private final void cancelScheduledWidgetUpdate() {
        B0 b02 = this.updateTimerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.updateTimerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleUpdate(d info, long updatePeriodSeconds) {
        B0 b02 = this.updateTimerJob;
        if (b02 == null || !b02.isActive()) {
            cancelScheduledWidgetUpdate();
            this.updateTimerJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NotificationCarouselV2ViewModelFF$scheduleUpdate$1(updatePeriodSeconds, this, info, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setNewState(NotificationCarouselV2VO notificationCarouselV2VO, kotlin.coroutines.d<? super Unit> dVar) {
        this.widgetStatesCache.add(new Integer(notificationCarouselV2VO.hashCode()));
        Object emit = this._widgetUpdates.emit(notificationCarouselV2VO, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    public final NotificationCarouselV2VO getCurrentWidgetState() {
        return this._widgetUpdates.getValue();
    }

    @NotNull
    public final InterfaceC2395h<NotificationCarouselV2VO> getWidgetUpdates() {
        return this.widgetUpdates;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        cancelScheduledWidgetUpdate();
    }

    public final void saveRecyclerViewState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NotificationCarouselV2ViewModelFF$saveRecyclerViewState$1(this, state, null), 3);
    }

    public final void trySetNewState(@NotNull NotificationCarouselV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NotificationCarouselV2ViewModelFF$trySetNewState$1(this, item, info, null), 3);
    }
}
