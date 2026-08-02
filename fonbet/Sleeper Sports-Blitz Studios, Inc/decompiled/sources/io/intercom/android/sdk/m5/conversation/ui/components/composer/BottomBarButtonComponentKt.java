package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomBarButtonComponent.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\r\u001a1\u0010\u000e\u001a\u00020\u00012\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0017"}, d2 = {"BottomBarButtonComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "buttons", "", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "enabled", "", "onGifInputSelected", "Lkotlin/Function0;", "onMediaInputSelected", "onVoiceNotesInputSelected", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BottomBarIcon", "icon", "", ViewProps.ON_CLICK, "(IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BottomBarButtonComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "BottomBarButtonComponentPreviewGifOnly", "BottomBarButtonComponentPreviewMediaOnly", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BottomBarButtonComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponent$lambda$5(Modifier modifier, List buttons, boolean z, Function0 function0, Function0 function02, Function0 function03, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(buttons, "$buttons");
        BottomBarButtonComponent(modifier, buttons, z, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponentPreview$lambda$8(int i, Composer composer, int i2) {
        BottomBarButtonComponentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponentPreviewGifOnly$lambda$9(int i, Composer composer, int i2) {
        BottomBarButtonComponentPreviewGifOnly(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponentPreviewMediaOnly$lambda$10(int i, Composer composer, int i2) {
        BottomBarButtonComponentPreviewMediaOnly(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarIcon$lambda$7(int i, boolean z, Function0 function0, int i2, int i3, Composer composer, int i4) {
        BottomBarIcon(i, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void BottomBarButtonComponent(Modifier modifier, final List<? extends BottomBarUiState.BottomBarButton> buttons, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer startRestartGroup = composer.startRestartGroup(665212828);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        boolean z2 = (i2 & 4) != 0 ? true : z;
        final Function0<Unit> function04 = (i2 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0;
        final Function0<Unit> function05 = (i2 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02;
        final Function0<Unit> function06 = (i2 & 32) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1981853813);
        for (BottomBarUiState.BottomBarButton bottomBarButton : buttons) {
            if (Intrinsics.areEqual(bottomBarButton, BottomBarUiState.BottomBarButton.GifInsert.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1310963612);
                BottomBarIcon(R.drawable.intercom_ic_gif_input, z2, function04, startRestartGroup, (i >> 3) & 1008, 0);
                startRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(bottomBarButton, BottomBarUiState.BottomBarButton.VoiceNotesInsert.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1311270450);
                BottomBarIcon(io.intercom.android.sdk.ui.R.drawable.intercom_ic_microphone, z2, function06, startRestartGroup, ((i >> 9) & 896) | ((i >> 3) & 112), 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(bottomBarButton, BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1427760810);
                    startRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1311581535);
                BottomBarIcon(R.drawable.intercom_ic_plus, z2, function05, startRestartGroup, ((i >> 6) & 896) | ((i >> 3) & 112), 0);
                startRestartGroup.endReplaceGroup();
            }
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = modifier;
            final boolean z3 = z2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomBarButtonComponent$lambda$5;
                    BottomBarButtonComponent$lambda$5 = BottomBarButtonComponentKt.BottomBarButtonComponent$lambda$5(Modifier.this, buttons, z3, function04, function05, function06, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomBarButtonComponent$lambda$5;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BottomBarIcon(final int i, boolean z, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        final boolean z2;
        int i5;
        Function0<Unit> function02;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1211476790);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            z2 = z;
            i4 |= startRestartGroup.changed(z2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                function02 = function0;
                i4 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if ((i4 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    boolean z3 = i6 != 0 ? true : z2;
                    if (i5 != 0) {
                        function02 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        };
                    }
                    IconButtonKt.IconButton(function02, null, z3, null, null, null, ComposableLambdaKt.rememberComposableLambda(2035069272, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$BottomBarIcon$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), composer2, 440, 0);
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i4 >> 6) & 14) | 1572864 | ((i4 << 3) & 896), 58);
                    z2 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                final Function0<Unit> function03 = function02;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BottomBarIcon$lambda$7;
                            BottomBarIcon$lambda$7 = BottomBarButtonComponentKt.BottomBarIcon$lambda$7(i, z2, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return BottomBarIcon$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if ((i4 & 731) == 146) {
            }
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            IconButtonKt.IconButton(function02, null, z3, null, null, null, ComposableLambdaKt.rememberComposableLambda(2035069272, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$BottomBarIcon$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), composer2, 440, 0);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 6) & 14) | 1572864 | ((i4 << 3) & 896), 58);
            z2 = z3;
            final Function0 function032 = function02;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i4 & 731) == 146) {
        }
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        IconButtonKt.IconButton(function02, null, z3, null, null, null, ComposableLambdaKt.rememberComposableLambda(2035069272, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$BottomBarIcon$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), composer2, 440, 0);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 6) & 14) | 1572864 | ((i4 << 3) & 896), 58);
        z2 = z3;
        final Function0 function0322 = function02;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void BottomBarButtonComponentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-179036889);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m12256getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomBarButtonComponentPreview$lambda$8;
                    BottomBarButtonComponentPreview$lambda$8 = BottomBarButtonComponentKt.BottomBarButtonComponentPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomBarButtonComponentPreview$lambda$8;
                }
            });
        }
    }

    private static final void BottomBarButtonComponentPreviewGifOnly(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1619387831);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m12258getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomBarButtonComponentPreviewGifOnly$lambda$9;
                    BottomBarButtonComponentPreviewGifOnly$lambda$9 = BottomBarButtonComponentKt.BottomBarButtonComponentPreviewGifOnly$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomBarButtonComponentPreviewGifOnly$lambda$9;
                }
            });
        }
    }

    private static final void BottomBarButtonComponentPreviewMediaOnly(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1269009367);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m12260getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomBarButtonComponentPreviewMediaOnly$lambda$10;
                    BottomBarButtonComponentPreviewMediaOnly$lambda$10 = BottomBarButtonComponentKt.BottomBarButtonComponentPreviewMediaOnly$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomBarButtonComponentPreviewMediaOnly$lambda$10;
                }
            });
        }
    }
}
