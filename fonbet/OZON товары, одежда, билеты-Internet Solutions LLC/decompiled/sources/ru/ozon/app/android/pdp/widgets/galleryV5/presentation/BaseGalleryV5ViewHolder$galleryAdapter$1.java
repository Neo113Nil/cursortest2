package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class BaseGalleryV5ViewHolder$galleryAdapter$1 extends C7735q implements Function2<AtomAction, GallerySyncModel, Unit> {
    BaseGalleryV5ViewHolder$galleryAdapter$1(Object obj) {
        super(2, obj, BaseGalleryV5ViewHolder.class, "onItemClick", "onItemClick(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, GallerySyncModel gallerySyncModel) {
        invoke2(atomAction, gallerySyncModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction p02, GallerySyncModel p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((BaseGalleryV5ViewHolder) this.receiver).onItemClick(p02, p12);
    }
}
