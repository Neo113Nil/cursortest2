package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpacesCard.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"SpacesCard", "", "homeSpacesData", "Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeSpacesData;", "onItemClick", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/home/data/SpaceItemType;", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeSpacesData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SpacesCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpacesCard$lambda$0(HomeCards.HomeSpacesData homeSpacesData, Function1 onItemClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(homeSpacesData, "$homeSpacesData");
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        SpacesCard(homeSpacesData, onItemClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SpacesCard(final HomeCards.HomeSpacesData homeSpacesData, final Function1<? super SpaceItemType, Unit> onItemClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(homeSpacesData, "homeSpacesData");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer startRestartGroup = composer.startRestartGroup(-261271608);
        IntercomCardKt.IntercomCard(null, null, ComposableLambdaKt.rememberComposableLambda(1212336956, true, new SpacesCardKt$SpacesCard$1(homeSpacesData, onItemClick), startRestartGroup, 54), startRestartGroup, 384, 3);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SpacesCard$lambda$0;
                    SpacesCard$lambda$0 = SpacesCardKt.SpacesCard$lambda$0(HomeCards.HomeSpacesData.this, onItemClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SpacesCard$lambda$0;
                }
            });
        }
    }
}
