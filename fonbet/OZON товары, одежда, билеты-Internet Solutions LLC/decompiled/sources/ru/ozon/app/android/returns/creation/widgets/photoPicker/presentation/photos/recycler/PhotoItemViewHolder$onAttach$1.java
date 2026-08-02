package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PhotoItemViewHolder$onAttach$1 extends C7735q implements Function1<PhotoItemViewState, Unit> {
    PhotoItemViewHolder$onAttach$1(Object obj) {
        super(1, obj, PhotoItemViewHolder.class, "applyState", "applyState(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PhotoItemViewState photoItemViewState) {
        invoke2(photoItemViewState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PhotoItemViewState photoItemViewState) {
        ((PhotoItemViewHolder) this.receiver).applyState(photoItemViewState);
    }
}
