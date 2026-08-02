package ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class SearchBarViewHolder$actionHandler$1 extends C7735q implements Function1<AtomAction, Boolean> {
    SearchBarViewHolder$actionHandler$1(Object obj) {
        super(1, obj, SearchBarViewHolder.class, "scrollToTop", "scrollToTop(Lru/ozon/uni/atoms/af/AtomAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction p02) {
        boolean scrollToTop;
        Intrinsics.checkNotNullParameter(p02, "p0");
        scrollToTop = ((SearchBarViewHolder) this.receiver).scrollToTop(p02);
        return Boolean.valueOf(scrollToTop);
    }
}
