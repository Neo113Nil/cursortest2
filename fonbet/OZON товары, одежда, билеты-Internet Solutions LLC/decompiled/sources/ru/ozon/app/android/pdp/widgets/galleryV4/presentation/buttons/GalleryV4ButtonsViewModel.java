package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV4.data.GalleryV4ButtonsOnBoardingRepository;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4ButtonsOnBoardingRepository;", "buttonsOnBoardingRepository", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4ButtonsOnBoardingRepository;)V", "", "id", "", "days", "Lxe/B0;", "startOnBoardingJob", "(Ljava/lang/String;I)Lxe/B0;", "", "startOnBoarding", "(Ljava/lang/String;I)V", "cancelOnBoarding", "()V", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4ButtonsOnBoardingRepository;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4buttonsOnBoardingViewState;", "_events", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Landroidx/lifecycle/P;", "events", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "", "jobs", "Ljava/util/List;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4ButtonsViewModel extends w0 {

    @NotNull
    private final BroadcastSingleLiveEvent<GalleryV4buttonsOnBoardingViewState> _events;

    @NotNull
    private final GalleryV4ButtonsOnBoardingRepository buttonsOnBoardingRepository;

    @NotNull
    private final P<GalleryV4buttonsOnBoardingViewState> events;

    @NotNull
    private final List<B0> jobs;
    public static final int $stable = 8;

    public GalleryV4ButtonsViewModel(@NotNull GalleryV4ButtonsOnBoardingRepository buttonsOnBoardingRepository) {
        Intrinsics.checkNotNullParameter(buttonsOnBoardingRepository, "buttonsOnBoardingRepository");
        this.buttonsOnBoardingRepository = buttonsOnBoardingRepository;
        BroadcastSingleLiveEvent<GalleryV4buttonsOnBoardingViewState> broadcastSingleLiveEvent = new BroadcastSingleLiveEvent<>();
        this._events = broadcastSingleLiveEvent;
        this.events = broadcastSingleLiveEvent;
        this.jobs = new ArrayList();
    }

    private final B0 startOnBoardingJob(String id2, int days) {
        return C10727i.c(x0.a(this), null, null, new GalleryV4ButtonsViewModel$startOnBoardingJob$1(this, id2, days, null), 3);
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
    public final P<GalleryV4buttonsOnBoardingViewState> getEvents() {
        return this.events;
    }

    public final void startOnBoarding(@NotNull String id2, int days) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.jobs.add(startOnBoardingJob(id2, days));
    }
}
