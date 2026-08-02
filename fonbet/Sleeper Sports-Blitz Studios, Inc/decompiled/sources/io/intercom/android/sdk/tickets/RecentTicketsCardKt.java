package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.m5.components.HomeCardScaffoldKt;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentTicketsCard.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"RecentTicketsCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "cardTitle", "", "tickets", "", "Lio/intercom/android/sdk/models/Ticket;", ViewProps.ON_CLICK, "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RecentTicketsCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RecentTicketsCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentTicketsCard$lambda$1(Modifier modifier, String cardTitle, List tickets, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(cardTitle, "$cardTitle");
        Intrinsics.checkNotNullParameter(tickets, "$tickets");
        RecentTicketsCard(modifier, cardTitle, tickets, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentTicketsCardPreview$lambda$2(int i, Composer composer, int i2) {
        RecentTicketsCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentTicketsCard$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void RecentTicketsCard(Modifier modifier, final String cardTitle, final List<Ticket> tickets, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        Composer startRestartGroup = composer.startRestartGroup(1214351394);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super String, Unit> function12 = (i2 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.tickets.RecentTicketsCardKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit RecentTicketsCard$lambda$0;
                RecentTicketsCard$lambda$0 = RecentTicketsCardKt.RecentTicketsCard$lambda$0((String) obj);
                return RecentTicketsCard$lambda$0;
            }
        } : function1;
        HomeCardScaffoldKt.HomeCardScaffold(modifier2, cardTitle, ComposableLambdaKt.rememberComposableLambda(1499488214, true, new RecentTicketsCardKt$RecentTicketsCard$2(tickets, function12), startRestartGroup, 54), startRestartGroup, (i & 14) | 384 | (i & 112), 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1<? super String, Unit> function13 = function12;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.RecentTicketsCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecentTicketsCard$lambda$1;
                    RecentTicketsCard$lambda$1 = RecentTicketsCardKt.RecentTicketsCard$lambda$1(Modifier.this, cardTitle, tickets, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return RecentTicketsCard$lambda$1;
                }
            });
        }
    }

    private static final void RecentTicketsCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1547026625);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$RecentTicketsCardKt.INSTANCE.m12812getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.RecentTicketsCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecentTicketsCardPreview$lambda$2;
                    RecentTicketsCardPreview$lambda$2 = RecentTicketsCardKt.RecentTicketsCardPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecentTicketsCardPreview$lambda$2;
                }
            });
        }
    }
}
