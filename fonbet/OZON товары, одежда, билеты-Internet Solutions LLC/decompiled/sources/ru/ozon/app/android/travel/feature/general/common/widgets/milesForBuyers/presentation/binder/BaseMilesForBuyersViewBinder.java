package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bj\u0002`\nH&J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "", "prepareViewLayout", "", "bind", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onViewCompletelyVisible", "onViewDetached", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BaseMilesForBuyersViewBinder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onViewCompletelyVisible(@NotNull BaseMilesForBuyersViewBinder baseMilesForBuyersViewBinder) {
        }

        public static void onViewDetached(@NotNull BaseMilesForBuyersViewBinder baseMilesForBuyersViewBinder) {
        }
    }

    void bind(@NotNull MilesForBuyersVO.State state, @NotNull Function1<? super AtomAction, Unit> onAction);

    void onViewCompletelyVisible();

    void onViewDetached();

    void prepareViewLayout();
}
