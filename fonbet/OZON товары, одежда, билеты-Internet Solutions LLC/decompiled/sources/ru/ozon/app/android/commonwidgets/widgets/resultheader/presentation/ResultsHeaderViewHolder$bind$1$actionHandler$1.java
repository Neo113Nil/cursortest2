package ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultHeaderAtomActionSheetHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class ResultsHeaderViewHolder$bind$1$actionHandler$1 extends C7735q implements Function1<AtomAction, Boolean> {
    ResultsHeaderViewHolder$bind$1$actionHandler$1(Object obj) {
        super(1, obj, ResultHeaderAtomActionSheetHandler.class, "handle", "handle(Lru/ozon/uni/atoms/af/AtomAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(((ResultHeaderAtomActionSheetHandler) this.receiver).handle(p02));
    }
}
