package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SingleReviewGalleryRowViewHolder$bind$1 extends C7735q implements Function1<String, Unit> {
    SingleReviewGalleryRowViewHolder$bind$1(Object obj) {
        super(1, obj, SingleReviewGalleryRowViewHolder.class, "openDeeplink", "openDeeplink(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((SingleReviewGalleryRowViewHolder) this.receiver).openDeeplink(str);
    }
}
