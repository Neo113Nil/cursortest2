package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5ButtonsOnBoardingRepository;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;", "buttonsOnBoardingRepository", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;)V", "", "id", "", "days", "Lxe/B0;", "startOnBoardingJob", "(Ljava/lang/String;I)Lxe/B0;", "", "startOnBoarding", "(Ljava/lang/String;I)V", "cancelOnBoarding", "()V", "resetShown", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;", "", "wasShown", "Z", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5buttonsOnBoardingViewState;", "_events", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Landroidx/lifecycle/P;", "events", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "", "jobs", "Ljava/util/List;", "LAe/w0;", "_showZoomEvent", "LAe/w0;", "LAe/B0;", "showZoomEvent", "LAe/B0;", "getShowZoomEvent", "()LAe/B0;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5OnboardingViewModel extends w0 {

    @NotNull
    private final BroadcastSingleLiveEvent<GalleryV5buttonsOnBoardingViewState> _events;

    @NotNull
    private final Ae.w0<Unit> _showZoomEvent;

    @NotNull
    private final GalleryV5ButtonsOnBoardingRepository buttonsOnBoardingRepository;

    @NotNull
    private final P<GalleryV5buttonsOnBoardingViewState> events;

    @NotNull
    private final List<B0> jobs;

    @NotNull
    private final Ae.B0<Unit> showZoomEvent;
    private boolean wasShown;
    public static final int $stable = 8;

    public GalleryV5OnboardingViewModel(@NotNull GalleryV5ButtonsOnBoardingRepository buttonsOnBoardingRepository) {
        Intrinsics.checkNotNullParameter(buttonsOnBoardingRepository, "buttonsOnBoardingRepository");
        this.buttonsOnBoardingRepository = buttonsOnBoardingRepository;
        BroadcastSingleLiveEvent<GalleryV5buttonsOnBoardingViewState> broadcastSingleLiveEvent = new BroadcastSingleLiveEvent<>();
        this._events = broadcastSingleLiveEvent;
        this.events = broadcastSingleLiveEvent;
        this.jobs = new ArrayList();
        C0 b11 = E0.b(0, 0, null, 7);
        this._showZoomEvent = b11;
        this.showZoomEvent = C2399j.a(b11);
    }

    private final B0 startOnBoardingJob(String id2, int days) {
        return C10727i.c(x0.a(this), null, null, new GalleryV5OnboardingViewModel$startOnBoardingJob$1(this, id2, days, null), 3);
    }

    public final void cancelOnBoarding() {
        if (this.jobs.isEmpty()) {
            return;
        }
        Iterator<T> it = this.jobs.iterator();
        while (it.hasNext()) {
            ((B0) it.next()).j(null);
        }
        this.jobs.clear();
    }

    @NotNull
    public final P<GalleryV5buttonsOnBoardingViewState> getEvents() {
        return this.events;
    }

    public final void resetShown() {
        this.wasShown = false;
    }

    public final void startOnBoarding(@NotNull String id2, int days) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.jobs.add(startOnBoardingJob(id2, days));
    }
}
