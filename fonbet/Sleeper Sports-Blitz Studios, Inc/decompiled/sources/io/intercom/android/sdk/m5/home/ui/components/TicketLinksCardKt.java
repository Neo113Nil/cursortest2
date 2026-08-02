package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketLinksCard.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"TicketLinksCard", "", "ticketLinksData", "Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeTicketLinksData;", "onTicketLinkClicked", "Lkotlin/Function1;", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeTicketLinksData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ExternalLinkCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TicketLinksCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExternalLinkCardPreview$lambda$1(int i, Composer composer, int i2) {
        ExternalLinkCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketLinksCard$lambda$0(HomeCards.HomeTicketLinksData ticketLinksData, Function1 onTicketLinkClicked, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(ticketLinksData, "$ticketLinksData");
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "$onTicketLinkClicked");
        TicketLinksCard(ticketLinksData, onTicketLinkClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TicketLinksCard(final HomeCards.HomeTicketLinksData ticketLinksData, final Function1<? super TicketType, Unit> onTicketLinkClicked, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(ticketLinksData, "ticketLinksData");
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "onTicketLinkClicked");
        Composer startRestartGroup = composer.startRestartGroup(-1931742368);
        IntercomCardKt.IntercomCard(null, null, ComposableLambdaKt.rememberComposableLambda(1008312684, true, new TicketLinksCardKt$TicketLinksCard$1(ticketLinksData, onTicketLinkClicked), startRestartGroup, 54), startRestartGroup, 384, 3);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketLinksCard$lambda$0;
                    TicketLinksCard$lambda$0 = TicketLinksCardKt.TicketLinksCard$lambda$0(HomeCards.HomeTicketLinksData.this, onTicketLinkClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketLinksCard$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ExternalLinkCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1962060809);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketLinksCardKt.INSTANCE.m12494getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExternalLinkCardPreview$lambda$1;
                    ExternalLinkCardPreview$lambda$1 = TicketLinksCardKt.ExternalLinkCardPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExternalLinkCardPreview$lambda$1;
                }
            });
        }
    }
}
