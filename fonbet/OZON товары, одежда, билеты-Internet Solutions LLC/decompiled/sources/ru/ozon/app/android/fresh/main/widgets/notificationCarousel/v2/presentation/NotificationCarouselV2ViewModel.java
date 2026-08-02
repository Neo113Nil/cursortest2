package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2Repository;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import xe.B0;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u0011\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2Repository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2Repository;)V", "", "cancelScheduledWidgetUpdate", "()V", "onCleared", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "currentState", "scheduleUpdate", "(Ll20/d;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;)V", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2Repository;", "Lxe/B0;", "updateTimerJob", "Lxe/B0;", "", "shouldUpdateImmediately", "Z", "getShouldUpdateImmediately", "()Z", "setShouldUpdateImmediately", "(Z)V", "Lze/h;", "_widgetUpdates", "Lze/h;", "LAe/h;", "widgetUpdates", "LAe/h;", "getWidgetUpdates", "()LAe/h;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2ViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final h<NotificationCarouselV2VO> _widgetUpdates;

    @NotNull
    private final NotificationCarouselV2Repository repository;
    private boolean shouldUpdateImmediately;
    private B0 updateTimerJob;

    @NotNull
    private final InterfaceC2395h<NotificationCarouselV2VO> widgetUpdates;

    public NotificationCarouselV2ViewModel(@NotNull NotificationCarouselV2Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C11115c a11 = k.a(-2, 6, null);
        this._widgetUpdates = a11;
        this.widgetUpdates = C2399j.H(a11);
    }

    private final void cancelScheduledWidgetUpdate() {
        B0 b02 = this.updateTimerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.updateTimerJob = null;
    }

    public final boolean getShouldUpdateImmediately() {
        return this.shouldUpdateImmediately;
    }

    @NotNull
    public final InterfaceC2395h<NotificationCarouselV2VO> getWidgetUpdates() {
        return this.widgetUpdates;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        cancelScheduledWidgetUpdate();
    }

    public final void scheduleUpdate(@NotNull d info, @NotNull NotificationCarouselV2VO currentState) {
        B0 b02;
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        if (this.shouldUpdateImmediately || (b02 = this.updateTimerJob) == null || !b02.isActive()) {
            cancelScheduledWidgetUpdate();
            this.updateTimerJob = C10727i.c(x0.a(this), null, null, new NotificationCarouselV2ViewModel$scheduleUpdate$1(this, currentState, info, null), 3);
        }
    }

    public final void setShouldUpdateImmediately(boolean z11) {
        this.shouldUpdateImmediately = z11;
    }
}
