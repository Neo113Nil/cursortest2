package ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.DefaultRecycledAtomPool;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BadgesContainerView$recycledAtomPool$2 extends AbstractC7737t implements Function0<RecycledAtomPool> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgesContainerView$recycledAtomPool$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RecycledAtomPool invoke() {
        RecycledAtomPool defaultRecycledAtomPool;
        Object obj = this.$context;
        CacheHolder cacheHolder = obj instanceof CacheHolder ? (CacheHolder) obj : null;
        if (cacheHolder == null || (defaultRecycledAtomPool = cacheHolder.getAtomPool()) == null) {
            defaultRecycledAtomPool = new DefaultRecycledAtomPool();
        }
        defaultRecycledAtomPool.setMaxRecycledAtoms(BadgeDTO.class, null, 20);
        return defaultRecycledAtomPool;
    }
}
