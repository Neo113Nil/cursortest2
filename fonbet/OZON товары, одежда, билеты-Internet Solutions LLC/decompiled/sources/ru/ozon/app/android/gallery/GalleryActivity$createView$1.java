package ru.ozon.app.android.gallery;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class GalleryActivity$createView$1 extends C7735q implements Function1<Integer, Unit> {
    GalleryActivity$createView$1(Object obj) {
        super(1, obj, GalleryViewModel.class, "onPageSelected", "onPageSelected(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((GalleryViewModel) this.receiver).onPageSelected(i11);
    }
}
