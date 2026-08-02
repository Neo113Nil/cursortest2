package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TicketsLoadingScreen.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"TicketsLoadingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TicketsLoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TicketsLoadingScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsLoadingScreen$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        TicketsLoadingScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsLoadingScreenPreview$lambda$1(int i, Composer composer, int i2) {
        TicketsLoadingScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TicketsLoadingScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2079268510);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            LoadingScreenKt.LoadingScreen(modifier, R.drawable.intercom_inbox_loading_state, startRestartGroup, i3 & 14, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsLoadingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketsLoadingScreen$lambda$0;
                    TicketsLoadingScreen$lambda$0 = TicketsLoadingScreenKt.TicketsLoadingScreen$lambda$0(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketsLoadingScreen$lambda$0;
                }
            });
        }
    }

    public static final void TicketsLoadingScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-880557955);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsLoadingScreenKt.INSTANCE.m12873getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsLoadingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketsLoadingScreenPreview$lambda$1;
                    TicketsLoadingScreenPreview$lambda$1 = TicketsLoadingScreenKt.TicketsLoadingScreenPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketsLoadingScreenPreview$lambda$1;
                }
            });
        }
    }
}
