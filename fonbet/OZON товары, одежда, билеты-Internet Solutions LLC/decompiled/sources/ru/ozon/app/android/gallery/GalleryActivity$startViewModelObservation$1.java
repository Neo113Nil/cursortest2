package ru.ozon.app.android.gallery;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.gallery.GalleryViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class GalleryActivity$startViewModelObservation$1 extends C7735q implements Function1<GalleryViewModel.Action, Unit> {
    GalleryActivity$startViewModelObservation$1(Object obj) {
        super(1, obj, GalleryActivity.class, "handleAction", "handleAction(Lru/ozon/app/android/gallery/GalleryViewModel$Action;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryViewModel.Action p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((GalleryActivity) this.receiver).handleAction(p02);
    }
}
