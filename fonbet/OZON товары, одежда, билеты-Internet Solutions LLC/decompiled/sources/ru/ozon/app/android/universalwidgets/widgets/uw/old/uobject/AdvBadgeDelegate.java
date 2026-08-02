package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeDelegate;", "", "setAdvBadgeOrGone", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AdvBadgeDelegate {
    void setAdvBadgeOrGone(BadgeDTO badge, Function1<? super AtomAction, Unit> onAction);
}
