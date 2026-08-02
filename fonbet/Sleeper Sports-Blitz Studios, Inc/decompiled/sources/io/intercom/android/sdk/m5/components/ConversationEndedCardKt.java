package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEndedCard.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000e"}, d2 = {"ConversationEndedCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "onButtonClick", "Lkotlin/Function0;", "conversationEndedUiState", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;Landroidx/compose/runtime/Composer;II)V", "ConversationEndedCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "ConversationEndedCardWithButtonPreview", "ConversationEndedCardWithButtonBotPreview", "ConversationMergedCardPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationEndedCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCard$lambda$0(Modifier modifier, Function0 function0, ComposerState.ConversationEnded conversationEndedUiState, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(conversationEndedUiState, "$conversationEndedUiState");
        ConversationEndedCard(modifier, function0, conversationEndedUiState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCardPreview$lambda$1(int i, Composer composer, int i2) {
        ConversationEndedCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCardWithButtonBotPreview$lambda$3(int i, Composer composer, int i2) {
        ConversationEndedCardWithButtonBotPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCardWithButtonPreview$lambda$2(int i, Composer composer, int i2) {
        ConversationEndedCardWithButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationMergedCardPreview$lambda$4(int i, Composer composer, int i2) {
        ConversationMergedCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConversationEndedCard(Modifier modifier, Function0<Unit> function0, final ComposerState.ConversationEnded conversationEndedUiState, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(conversationEndedUiState, "conversationEndedUiState");
        Composer startRestartGroup = composer.startRestartGroup(-517544614);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(conversationEndedUiState) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                function03 = i5 == 0 ? null : function02;
                composer2 = startRestartGroup;
                CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RectangleShapeKt.getRectangleShape(), CardDefaults.INSTANCE.m2729cardColorsro_MJ88(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-676087732, true, new ConversationEndedCardKt$ConversationEndedCard$1(conversationEndedUiState, function03), composer2, 54), composer2, 196656, 24);
                modifier2 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ConversationEndedCard$lambda$0;
                        ConversationEndedCard$lambda$0 = ConversationEndedCardKt.ConversationEndedCard$lambda$0(Modifier.this, function03, conversationEndedUiState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ConversationEndedCard$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        composer2 = startRestartGroup;
        CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RectangleShapeKt.getRectangleShape(), CardDefaults.INSTANCE.m2729cardColorsro_MJ88(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-676087732, true, new ConversationEndedCardKt$ConversationEndedCard$1(conversationEndedUiState, function03), composer2, 54), composer2, 196656, 24);
        modifier2 = companion;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @IntercomPreviews
    private static final void ConversationEndedCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-172245026);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m12036getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationEndedCardPreview$lambda$1;
                    ConversationEndedCardPreview$lambda$1 = ConversationEndedCardKt.ConversationEndedCardPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationEndedCardPreview$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1576691098);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m12037getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationEndedCardWithButtonPreview$lambda$2;
                    ConversationEndedCardWithButtonPreview$lambda$2 = ConversationEndedCardKt.ConversationEndedCardWithButtonPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationEndedCardWithButtonPreview$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonBotPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-317527071);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m12038getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationEndedCardWithButtonBotPreview$lambda$3;
                    ConversationEndedCardWithButtonBotPreview$lambda$3 = ConversationEndedCardKt.ConversationEndedCardWithButtonBotPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationEndedCardWithButtonBotPreview$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ConversationMergedCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-233275222);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m12039getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationMergedCardPreview$lambda$4;
                    ConversationMergedCardPreview$lambda$4 = ConversationEndedCardKt.ConversationMergedCardPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationMergedCardPreview$lambda$4;
                }
            });
        }
    }
}
