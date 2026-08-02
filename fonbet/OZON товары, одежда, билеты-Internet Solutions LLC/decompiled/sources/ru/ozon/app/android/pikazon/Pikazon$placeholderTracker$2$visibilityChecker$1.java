package ru.ozon.app.android.pikazon;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.pikazon.placeholdertracker.ViewVisibilityInteractor;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class Pikazon$placeholderTracker$2$visibilityChecker$1 extends C7735q implements Function0<ViewVisibilityInteractor> {
    Pikazon$placeholderTracker$2$visibilityChecker$1(Object obj) {
        super(0, obj, Pikazon.class, "getViewVisibilityInteractor", "getViewVisibilityInteractor()Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewVisibilityInteractor invoke() {
        ViewVisibilityInteractor viewVisibilityInteractor;
        viewVisibilityInteractor = ((Pikazon) this.receiver).getViewVisibilityInteractor();
        return viewVisibilityInteractor;
    }
}
