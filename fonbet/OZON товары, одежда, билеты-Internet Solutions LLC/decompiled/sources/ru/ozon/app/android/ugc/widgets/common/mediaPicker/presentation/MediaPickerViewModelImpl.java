package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModel;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;", "event", "", "onViewIntent", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;)V", "LAe/w0;", "_events", "LAe/w0;", "LAe/B0;", "mediaPickerEvents", "LAe/B0;", "getMediaPickerEvents", "()LAe/B0;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MediaPickerViewModelImpl extends w0 implements MediaPickerViewModel {

    @NotNull
    private final Ae.w0<MediaPickerEvent> _events;

    @NotNull
    private final B0<MediaPickerEvent> mediaPickerEvents;

    public MediaPickerViewModelImpl() {
        C0 b11 = E0.b(0, 0, null, 7);
        this._events = b11;
        this.mediaPickerEvents = C2399j.a(b11);
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModel
    @NotNull
    public B0<MediaPickerEvent> getMediaPickerEvents() {
        return this.mediaPickerEvents;
    }

    public void onViewIntent(@NotNull MediaPickerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c(x0.a(this), null, null, new MediaPickerViewModelImpl$onViewIntent$1(this, event, null), 3);
    }
}
