package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ReviewGalleryBaseWidgetVH$actionHandler$1 extends C7735q implements Function1<AtomAction, Boolean> {
    ReviewGalleryBaseWidgetVH$actionHandler$1(Object obj) {
        super(1, obj, ReviewGalleryBaseWidgetVH.class, "handleDismissAction", "handleDismissAction(Lru/ozon/uni/atoms/af/AtomAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction p02) {
        boolean handleDismissAction;
        Intrinsics.checkNotNullParameter(p02, "p0");
        handleDismissAction = ((ReviewGalleryBaseWidgetVH) this.receiver).handleDismissAction(p02);
        return Boolean.valueOf(handleDismissAction);
    }
}
