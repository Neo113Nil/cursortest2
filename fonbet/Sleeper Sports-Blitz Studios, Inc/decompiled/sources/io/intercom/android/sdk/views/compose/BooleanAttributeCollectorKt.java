package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BooleanAttributeCollector.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001aQ\u0010\f\u001a\u00020\u0001*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018¨\u0006\u001c²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002"}, d2 = {"BooleanAttributeCollector", "", "modifier", "Landroidx/compose/ui/Modifier;", "attributeData", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "hasErrors", "", "loading", "onSubmitAttribute", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/conversation/states/AttributeData;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BooleanAttributeCollectorOption", "Landroidx/compose/foundation/layout/RowScope;", "value", "yesOption", "shape", "Landroidx/compose/foundation/shape/CornerBasedShape;", "disabled", MetricTracker.Action.SUBMITTED, ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/Boolean;ZLandroidx/compose/foundation/shape/CornerBasedShape;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BooleanAttributePreview", "(Landroidx/compose/runtime/Composer;I)V", "SubmittedBooleanAttributePreview", "DisabledBooleanAttributePreview", "SubmittedAndDisabledBooleanAttributePreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BooleanAttributeCollectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$7(Modifier modifier, AttributeData attributeData, boolean z, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        BooleanAttributeCollector(modifier, attributeData, z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollectorOption$lambda$9(RowScope this_BooleanAttributeCollectorOption, Boolean bool, boolean z, CornerBasedShape shape, boolean z2, boolean z3, boolean z4, Function0 onClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(this_BooleanAttributeCollectorOption, "$this_BooleanAttributeCollectorOption");
        Intrinsics.checkNotNullParameter(shape, "$shape");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        BooleanAttributeCollectorOption(this_BooleanAttributeCollectorOption, bool, z, shape, z2, z3, z4, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributePreview$lambda$10(int i, Composer composer, int i2) {
        BooleanAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledBooleanAttributePreview$lambda$12(int i, Composer composer, int i2) {
        DisabledBooleanAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedAndDisabledBooleanAttributePreview$lambda$13(int i, Composer composer, int i2) {
        SubmittedAndDisabledBooleanAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedBooleanAttributePreview$lambda$11(int i, Composer composer, int i2) {
        SubmittedBooleanAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BooleanAttributeCollector(Modifier modifier, final AttributeData attributeData, boolean z, boolean z2, Function1<? super AttributeData, Unit> function1, Composer composer, final int i, final int i2) {
        boolean z3;
        boolean z4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(attributeData, "attributeData");
        Composer startRestartGroup = composer.startRestartGroup(2100686120);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        boolean z5 = (i2 & 4) != 0 ? false : z;
        boolean z6 = (i2 & 8) != 0 ? false : z2;
        final Function1<? super AttributeData, Unit> function12 = (i2 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BooleanAttributeCollector$lambda$0;
                BooleanAttributeCollector$lambda$0 = BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$0((AttributeData) obj);
                return BooleanAttributeCollector$lambda$0;
            }
        } : function1;
        final boolean isFormDisabled = attributeData.isFormDisabled();
        final boolean submitted = attributeData.getAttribute().getSubmitted();
        final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState BooleanAttributeCollector$lambda$1;
                BooleanAttributeCollector$lambda$1 = BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$1(submitted, isFormDisabled, attributeData);
                return BooleanAttributeCollector$lambda$1;
            }
        }, startRestartGroup, 8);
        long m13098getCollectorBorder0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13098getCollectorBorder0d7_KjU();
        float m8798constructorimpl = Dp.m8798constructorimpl(1);
        CornerBasedShape small = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
        CornerBasedShape cornerBasedShape = small;
        final boolean z7 = z5;
        final Modifier modifier3 = modifier2;
        Modifier m594borderxT4_qwU = BorderKt.m594borderxT4_qwU(SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(ClipKt.clip(modifier2, cornerBasedShape), 0.0f, 1, null), Dp.m8798constructorimpl(40)), m8798constructorimpl, m13098getCollectorBorder0d7_KjU, cornerBasedShape);
        Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m594borderxT4_qwU);
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
        BooleanAttributeCollectorOption(rowScopeInstance, z7 ? null : BooleanAttributeCollector$lambda$2(mutableState), true, small, isFormDisabled, submitted, z6 && Intrinsics.areEqual((Object) BooleanAttributeCollector$lambda$2(mutableState), (Object) true), new Function0() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BooleanAttributeCollector$lambda$6$lambda$4;
                BooleanAttributeCollector$lambda$6$lambda$4 = BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$6$lambda$4(Function1.this, attributeData, mutableState);
                return BooleanAttributeCollector$lambda$6$lambda$4;
            }
        }, startRestartGroup, 390);
        DividerKt.m3049VerticalDivider9IZ8Weo(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), m8798constructorimpl, m13098getCollectorBorder0d7_KjU, startRestartGroup, 54, 0);
        Boolean BooleanAttributeCollector$lambda$2 = z7 ? null : BooleanAttributeCollector$lambda$2(mutableState);
        if (z6) {
            Boolean BooleanAttributeCollector$lambda$22 = BooleanAttributeCollector$lambda$2(mutableState);
            z3 = false;
            if (Intrinsics.areEqual((Object) BooleanAttributeCollector$lambda$22, (Object) false)) {
                z4 = true;
                BooleanAttributeCollectorOption(rowScopeInstance, BooleanAttributeCollector$lambda$2, false, small, isFormDisabled, submitted, z4, new Function0() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BooleanAttributeCollector$lambda$6$lambda$5;
                        BooleanAttributeCollector$lambda$6$lambda$5 = BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$6$lambda$5(Function1.this, attributeData, mutableState);
                        return BooleanAttributeCollector$lambda$6$lambda$5;
                    }
                }, startRestartGroup, 390);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    final boolean z8 = z6;
                    final Function1<? super AttributeData, Unit> function13 = function12;
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BooleanAttributeCollector$lambda$7;
                            BooleanAttributeCollector$lambda$7 = BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$7(Modifier.this, attributeData, z7, z8, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BooleanAttributeCollector$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
        } else {
            z3 = false;
        }
        z4 = z3;
        BooleanAttributeCollectorOption(rowScopeInstance, BooleanAttributeCollector$lambda$2, false, small, isFormDisabled, submitted, z4, new Function0() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BooleanAttributeCollector$lambda$6$lambda$5;
                BooleanAttributeCollector$lambda$6$lambda$5 = BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$6$lambda$5(Function1.this, attributeData, mutableState);
                return BooleanAttributeCollector$lambda$6$lambda$5;
            }
        }, startRestartGroup, 390);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Boolean BooleanAttributeCollector$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState BooleanAttributeCollector$lambda$1(boolean z, boolean z2, AttributeData attributeData) {
        String value;
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(((z || z2) && (value = attributeData.getAttribute().getValue()) != null) ? StringsKt.toBooleanStrictOrNull(value) : null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$6$lambda$4(Function1 function1, AttributeData attributeData, MutableState value$delegate) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
        value$delegate.setValue(true);
        function1.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, "true", 127, null), null, false, 6, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCollector$lambda$6$lambda$5(Function1 function1, AttributeData attributeData, MutableState value$delegate) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
        value$delegate.setValue(false);
        function1.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, "false", 127, null), null, false, 6, null));
        return Unit.INSTANCE;
    }

    private static final void BooleanAttributeCollectorOption(final RowScope rowScope, final Boolean bool, final boolean z, final CornerBasedShape cornerBasedShape, final boolean z2, final boolean z3, final boolean z4, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Function0<Unit> function02;
        CornerBasedShape copy$default;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1323902640);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(bool) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(cornerBasedShape) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            function02 = function0;
            i2 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        } else {
            function02 = function0;
        }
        if ((i2 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
            CornerSize m1514CornerSize0680j_4 = CornerSizeKt.m1514CornerSize0680j_4(Dp.m8798constructorimpl(0));
            if (z) {
                copy$default = CornerBasedShape.copy$default(cornerBasedShape, null, m1514CornerSize0680j_4, m1514CornerSize0680j_4, null, 9, null);
            } else {
                copy$default = CornerBasedShape.copy$default(cornerBasedShape, m1514CornerSize0680j_4, null, null, m1514CornerSize0680j_4, 6, null);
            }
            long m13099getCollectorSelected0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13099getCollectorSelected0d7_KjU();
            long m6038copywmQWz5c$default = Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            Modifier clip = ClipKt.clip(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), copy$default);
            if (!Intrinsics.areEqual(bool, Boolean.valueOf(z))) {
                m13099getCollectorSelected0d7_KjU = Color.INSTANCE.m6074getTransparent0d7_KjU();
            }
            Modifier weight$default = RowScope.weight$default(rowScope, ClickableKt.m623clickableoSLSa3U$default(BackgroundKt.m582backgroundbw27NRU$default(clip, m13099getCollectorSelected0d7_KjU, null, 2, null), (z2 || z3) ? false : true, null, null, null, function02, 14, null), 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
            startRestartGroup.startReplaceGroup(872785261);
            if (z4) {
                ProgressIndicatorKt.m3476CircularProgressIndicator4lLiAd8(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(20)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), Dp.m8798constructorimpl(3), 0L, 0, 0.0f, startRestartGroup, 390, 56);
                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            if (z) {
                i3 = R.string.intercom_attribute_collector_positive;
            } else {
                i3 = R.string.intercom_attribute_collector_negative;
            }
            String stringResource = StringResources_androidKt.stringResource(i3, startRestartGroup, 0);
            int m8654getCentere0LSkKk = TextAlign.INSTANCE.m8654getCentere0LSkKk();
            startRestartGroup.startReplaceGroup(872804846);
            if (!z2 && !Intrinsics.areEqual(bool, Boolean.valueOf(!z))) {
                m6038copywmQWz5c$default = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU();
            }
            long j = m6038copywmQWz5c$default;
            startRestartGroup.endReplaceGroup();
            TextKt.m3901TextNvy7gAk(stringResource, null, j, null, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(m8654getCentere0LSkKk), 0L, 0, false, 0, 0, null, null, startRestartGroup, 0, 0, 261114);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BooleanAttributeCollectorOption$lambda$9;
                    BooleanAttributeCollectorOption$lambda$9 = BooleanAttributeCollectorKt.BooleanAttributeCollectorOption$lambda$9(RowScope.this, bool, z, cornerBasedShape, z2, z3, z4, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BooleanAttributeCollectorOption$lambda$9;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void BooleanAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1269323591);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m13204getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BooleanAttributePreview$lambda$10;
                    BooleanAttributePreview$lambda$10 = BooleanAttributeCollectorKt.BooleanAttributePreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BooleanAttributePreview$lambda$10;
                }
            });
        }
    }

    public static final void SubmittedBooleanAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-875849702);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m13206getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubmittedBooleanAttributePreview$lambda$11;
                    SubmittedBooleanAttributePreview$lambda$11 = BooleanAttributeCollectorKt.SubmittedBooleanAttributePreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubmittedBooleanAttributePreview$lambda$11;
                }
            });
        }
    }

    public static final void DisabledBooleanAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2015578211);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m13208getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisabledBooleanAttributePreview$lambda$12;
                    DisabledBooleanAttributePreview$lambda$12 = BooleanAttributeCollectorKt.DisabledBooleanAttributePreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DisabledBooleanAttributePreview$lambda$12;
                }
            });
        }
    }

    public static final void SubmittedAndDisabledBooleanAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1476435233);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m13210getLambda8$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubmittedAndDisabledBooleanAttributePreview$lambda$13;
                    SubmittedAndDisabledBooleanAttributePreview$lambda$13 = BooleanAttributeCollectorKt.SubmittedAndDisabledBooleanAttributePreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubmittedAndDisabledBooleanAttributePreview$lambda$13;
                }
            });
        }
    }
}
