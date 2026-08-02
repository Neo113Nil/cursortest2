package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsEmptyScreen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"TicketsEmptyScreen", "", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/models/EmptyState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmptyScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TicketsEmptyScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenPreview$lambda$1(int i, Composer composer, int i2) {
        EmptyScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsEmptyScreen$lambda$0(EmptyState emptyState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(emptyState, "$emptyState");
        TicketsEmptyScreen(emptyState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void TicketsEmptyScreen(final EmptyState emptyState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Composer startRestartGroup = composer.startRestartGroup(1360358580);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(emptyState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            EmptyStateKt.EmptyState(emptyState.getTitle(), modifier2, emptyState.getText(), Integer.valueOf(R.drawable.intercom_ticket_detail_icon), null, startRestartGroup, i3 & 112, 16);
            modifier = modifier2;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsEmptyScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketsEmptyScreen$lambda$0;
                    TicketsEmptyScreen$lambda$0 = TicketsEmptyScreenKt.TicketsEmptyScreen$lambda$0(EmptyState.this, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketsEmptyScreen$lambda$0;
                }
            });
        }
    }

    private static final void EmptyScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1850741992);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsEmptyScreenKt.INSTANCE.m12869getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsEmptyScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyScreenPreview$lambda$1;
                    EmptyScreenPreview$lambda$1 = TicketsEmptyScreenKt.EmptyScreenPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyScreenPreview$lambda$1;
                }
            });
        }
    }
}
