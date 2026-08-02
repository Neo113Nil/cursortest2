package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewHolder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ReturnCreationItemViewHolder$actionHandler$2 extends C7735q implements Function1<AtomAction, Boolean> {
    ReturnCreationItemViewHolder$actionHandler$2(Object obj) {
        super(1, obj, OneTimePostRefreshHandler.class, "handle", "handle(Lru/ozon/uni/atoms/af/AtomAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(((OneTimePostRefreshHandler) this.receiver).handle(p02));
    }
}
