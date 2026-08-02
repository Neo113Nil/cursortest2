package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder;

import Sc.C4005g;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view.MilesForBuyersView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR<\u0010\u0011\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000fj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012RP\u0010\u0014\u001a>\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00130\u000fj\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0013`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/MilesForBuyersViewBinderFactory;", "", "<init>", "()V", "Lkotlin/reflect/d;", "type", "", "binderNotFoundError", "(Lkotlin/reflect/d;)Ljava/lang/Void;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "view", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "getViewBinder", "(Lkotlin/reflect/d;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "Lkotlin/Function1;", "creators", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersViewBinderFactory {

    @NotNull
    private final HashMap<d<?>, BaseMilesForBuyersViewBinder> cache = new HashMap<>();

    @NotNull
    private final HashMap<d<?>, Function1<MilesForBuyersView, BaseMilesForBuyersViewBinder>> creators = U.f(new Pair(N.b(MilesForBuyersVO.State.CardState.class), MilesForBuyersViewBinderFactory$creators$1.INSTANCE), new Pair(N.b(MilesForBuyersVO.State.BannerState.class), MilesForBuyersViewBinderFactory$creators$2.INSTANCE), new Pair(N.b(MilesForBuyersVO.State.ProgressState.class), MilesForBuyersViewBinderFactory$creators$3.INSTANCE));

    private final Void binderNotFoundError(d<?> type) {
        throw new IllegalStateException(("No view binder found for type: " + type.u() + ". Make sure it is registered in binderCache or creators.").toString());
    }

    @NotNull
    public final BaseMilesForBuyersViewBinder getViewBinder(@NotNull d<? extends MilesForBuyersVO.State> type, @NotNull MilesForBuyersView view) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(view, "view");
        BaseMilesForBuyersViewBinder baseMilesForBuyersViewBinder = this.cache.get(type);
        if (baseMilesForBuyersViewBinder == null) {
            Function1<MilesForBuyersView, BaseMilesForBuyersViewBinder> function1 = this.creators.get(type);
            baseMilesForBuyersViewBinder = function1 != null ? function1.invoke(view) : null;
            this.cache.put(type, baseMilesForBuyersViewBinder);
        }
        if (baseMilesForBuyersViewBinder != null) {
            return baseMilesForBuyersViewBinder;
        }
        binderNotFoundError(type);
        throw new C4005g();
    }
}
