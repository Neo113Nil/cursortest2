package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "position", "", "savePosition", "(I)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "fullScreen", "galleryVideoItemClicked", "(Lru/ozon/uni/atoms/af/AtomAction;Z)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "item", "", "openGalleryVideoFromPosition", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;JZLru/ozon/uni/atoms/af/AtomAction;)V", "LAe/w0;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction;", "_action", "LAe/w0;", "LAe/B0;", "action", "LAe/B0;", "getAction", "()LAe/B0;", "LAe/x0;", "_savedPosition", "LAe/x0;", "LAe/M0;", "savedPosition", "LAe/M0;", "getSavedPosition", "()LAe/M0;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryViewModel extends w0 {

    @NotNull
    private final Ae.w0<GalleryAction> _action;

    @NotNull
    private final x0<Integer> _savedPosition;

    @NotNull
    private final B0<GalleryAction> action;

    @NotNull
    private final M0<Integer> savedPosition;

    public HotelsGalleryViewModel() {
        C0 b11 = E0.b(0, 0, null, 7);
        this._action = b11;
        this.action = C2399j.a(b11);
        x0<Integer> a11 = O0.a(0);
        this._savedPosition = a11;
        this.savedPosition = C2399j.b(a11);
    }

    public final void galleryVideoItemClicked(AtomAction atomAction, boolean fullScreen) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new HotelsGalleryViewModel$galleryVideoItemClicked$1(this, fullScreen, atomAction, null), 3);
    }

    @NotNull
    public final B0<GalleryAction> getAction() {
        return this.action;
    }

    @NotNull
    public final M0<Integer> getSavedPosition() {
        return this.savedPosition;
    }

    public final void openGalleryVideoFromPosition(@NotNull HotelsGalleryVO.Video item, long position, boolean fullScreen, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new HotelsGalleryViewModel$openGalleryVideoFromPosition$1(this, item, position, fullScreen, atomAction, null), 3);
    }

    public final void savePosition(int position) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new HotelsGalleryViewModel$savePosition$1(this, position, null), 3);
    }
}
