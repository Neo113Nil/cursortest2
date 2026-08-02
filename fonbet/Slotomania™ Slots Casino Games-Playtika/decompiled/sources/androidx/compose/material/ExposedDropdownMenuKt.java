package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.RendererCapabilities;
import com.ironsource.Y3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a6\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u001a\"\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, d2 = {"ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "updateHeight", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "verticalMarginInPx", "", "onHeightUpdate", "expandable", "Lkotlin/Function0;", "menuLabel", "", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0328 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0072  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(final boolean z, final Function1<? super Boolean, Unit> onExpandedChange, Modifier modifier, final Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean changed;
        Object rememberedValue4;
        Object rememberedValue5;
        boolean changed2;
        Object rememberedValue6;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1456052980);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenuBox)P(1,3,2)95@4098L7,96@4131L7,97@4156L30,98@4209L30,100@4340L37,102@4395L486,115@4907L29,129@5318L31,130@5375L38,117@4942L550,136@5498L70,140@5574L441:ExposedDropdownMenu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onExpandedChange) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density = (Density) consume;
                ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localView);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final View view = (View) consume2;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) rememberedValue2;
                final int mo330roundToPx0680j_4 = density.mo330roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Ref();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                final Ref ref = (Ref) rememberedValue3;
                Integer valueOf = Integer.valueOf(m1398ExposedDropdownMenuBox$lambda4(mutableState2));
                int i5 = i3;
                Integer valueOf2 = Integer.valueOf(m1396ExposedDropdownMenuBox$lambda1(mutableState));
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(density) | startRestartGroup.changed(valueOf);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public void ExposedDropdownMenu(boolean z2, Function0<Unit> function0, Modifier modifier4, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer2, int i6, int i7) {
                            ExposedDropdownMenuBoxScope.DefaultImpls.ExposedDropdownMenu(this, z2, function0, modifier4, function3, composer2, i6, i7);
                        }

                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public Modifier exposedDropdownSize(Modifier modifier4, boolean z2) {
                            int m1398ExposedDropdownMenuBox$lambda4;
                            int m1396ExposedDropdownMenuBox$lambda1;
                            Intrinsics.checkNotNullParameter(modifier4, "<this>");
                            Density density2 = Density.this;
                            MutableState<Integer> mutableState3 = mutableState2;
                            MutableState<Integer> mutableState4 = mutableState;
                            m1398ExposedDropdownMenuBox$lambda4 = ExposedDropdownMenuKt.m1398ExposedDropdownMenuBox$lambda4(mutableState3);
                            Modifier m622heightInVpY3zN4$default = SizeKt.m622heightInVpY3zN4$default(modifier4, 0.0f, density2.mo333toDpu2uoSUM(m1398ExposedDropdownMenuBox$lambda4), 1, null);
                            if (!z2) {
                                return m622heightInVpY3zN4$default;
                            }
                            m1396ExposedDropdownMenuBox$lambda1 = ExposedDropdownMenuKt.m1396ExposedDropdownMenuBox$lambda1(mutableState4);
                            return SizeKt.m639width3ABfNKs(m622heightInVpY3zN4$default, density2.mo333toDpu2uoSUM(m1396ExposedDropdownMenuBox$lambda1));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue4;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                final FocusRequester focusRequester = (FocusRequester) rememberedValue5;
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ExposedDropdownMenuKt.m1397ExposedDropdownMenuBox$lambda2(mutableState, IntSize.m4610getWidthimpl(it.mo3390getSizeYbymL2g()));
                        ref.setValue(it);
                        View rootView = view.getRootView();
                        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                        LayoutCoordinates value = ref.getValue();
                        int i6 = mo330roundToPx0680j_4;
                        final MutableState<Integer> mutableState3 = mutableState2;
                        ExposedDropdownMenuKt.updateHeight(rootView, value, i6, new Function1<Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i7) {
                                ExposedDropdownMenuKt.m1399ExposedDropdownMenuBox$lambda5(mutableState3, i7);
                            }
                        });
                    }
                });
                Boolean valueOf3 = Boolean.valueOf(z);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(valueOf3) | startRestartGroup.changed(onExpandedChange);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onExpandedChange.invoke(Boolean.valueOf(!z));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(expandable(onGloballyPositioned, (Function0) rememberedValue6, Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1514getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6)), focusRequester);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume3;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                Modifier modifier4 = companion;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(localViewConfiguration);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(focusRequester2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-443225682);
                ComposerKt.sourceInformation(startRestartGroup, "C133@5477L9:ExposedDropdownMenu.kt#jmzs0o");
                content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, startRestartGroup, Integer.valueOf((i5 >> 6) & 112));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (z) {
                            focusRequester.requestFocus();
                        }
                    }
                }, startRestartGroup, 0);
                EffectsKt.DisposableEffect(view, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        View view2 = view;
                        final View view3 = view;
                        final Ref<LayoutCoordinates> ref2 = ref;
                        final int i6 = mo330roundToPx0680j_4;
                        final MutableState<Integer> mutableState3 = mutableState2;
                        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view2, new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                View rootView = view3.getRootView();
                                Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                                LayoutCoordinates value = ref2.getValue();
                                int i7 = i6;
                                final MutableState<Integer> mutableState4 = mutableState3;
                                ExposedDropdownMenuKt.updateHeight(rootView, value, i7, new Function1<Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                        invoke(num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int i8) {
                                        ExposedDropdownMenuKt.m1399ExposedDropdownMenuBox$lambda5(mutableState4, i8);
                                    }
                                });
                            }
                        });
                        return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                OnGlobalLayoutListener.this.dispose();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ExposedDropdownMenuKt.ExposedDropdownMenuBox(z, onExpandedChange, modifier3, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume6 = startRestartGroup.consume(localDensity3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density3 = (Density) consume6;
        ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localView2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final View view2 = (View) consume22;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Integer> mutableState3 = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Integer> mutableState22 = (MutableState) rememberedValue2;
        final int mo330roundToPx0680j_42 = density3.mo330roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final Ref<LayoutCoordinates> ref2 = (Ref) rememberedValue3;
        Integer valueOf4 = Integer.valueOf(m1398ExposedDropdownMenuBox$lambda4(mutableState22));
        int i52 = i3;
        Integer valueOf22 = Integer.valueOf(m1396ExposedDropdownMenuBox$lambda1(mutableState3));
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(density3) | startRestartGroup.changed(valueOf4);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
            public void ExposedDropdownMenu(boolean z2, Function0<Unit> function0, Modifier modifier42, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer2, int i6, int i7) {
                ExposedDropdownMenuBoxScope.DefaultImpls.ExposedDropdownMenu(this, z2, function0, modifier42, function3, composer2, i6, i7);
            }

            @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
            public Modifier exposedDropdownSize(Modifier modifier42, boolean z2) {
                int m1398ExposedDropdownMenuBox$lambda4;
                int m1396ExposedDropdownMenuBox$lambda1;
                Intrinsics.checkNotNullParameter(modifier42, "<this>");
                Density density22 = Density.this;
                MutableState<Integer> mutableState32 = mutableState22;
                MutableState<Integer> mutableState4 = mutableState3;
                m1398ExposedDropdownMenuBox$lambda4 = ExposedDropdownMenuKt.m1398ExposedDropdownMenuBox$lambda4(mutableState32);
                Modifier m622heightInVpY3zN4$default = SizeKt.m622heightInVpY3zN4$default(modifier42, 0.0f, density22.mo333toDpu2uoSUM(m1398ExposedDropdownMenuBox$lambda4), 1, null);
                if (!z2) {
                    return m622heightInVpY3zN4$default;
                }
                m1396ExposedDropdownMenuBox$lambda1 = ExposedDropdownMenuKt.m1396ExposedDropdownMenuBox$lambda1(mutableState4);
                return SizeKt.m639width3ABfNKs(m622heightInVpY3zN4$default, density22.mo333toDpu2uoSUM(m1396ExposedDropdownMenuBox$lambda1));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue4;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final FocusRequester focusRequester3 = (FocusRequester) rememberedValue5;
        Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ExposedDropdownMenuKt.m1397ExposedDropdownMenuBox$lambda2(mutableState3, IntSize.m4610getWidthimpl(it.mo3390getSizeYbymL2g()));
                ref2.setValue(it);
                View rootView = view2.getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                LayoutCoordinates value = ref2.getValue();
                int i6 = mo330roundToPx0680j_42;
                final MutableState<Integer> mutableState32 = mutableState22;
                ExposedDropdownMenuKt.updateHeight(rootView, value, i6, new Function1<Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i7) {
                        ExposedDropdownMenuKt.m1399ExposedDropdownMenuBox$lambda5(mutableState32, i7);
                    }
                });
            }
        });
        Boolean valueOf32 = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(valueOf32) | startRestartGroup.changed(onExpandedChange);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue6 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                onExpandedChange.invoke(Boolean.valueOf(!z));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        Modifier focusRequester22 = FocusRequesterModifierKt.focusRequester(expandable(onGloballyPositioned2, (Function0) rememberedValue6, Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1514getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6)), focusRequester3);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume32;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(localLayoutDirection2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection2 = (LayoutDirection) consume42;
        Modifier modifier42 = companion;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume52 = startRestartGroup.consume(localViewConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume52;
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(focusRequester22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl2, density22, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-443225682);
        ComposerKt.sourceInformation(startRestartGroup, "C133@5477L9:ExposedDropdownMenu.kt#jmzs0o");
        content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12, startRestartGroup, Integer.valueOf((i52 >> 6) & 112));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z) {
                    focusRequester3.requestFocus();
                }
            }
        }, startRestartGroup, 0);
        EffectsKt.DisposableEffect(view2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                View view22 = view2;
                final View view3 = view2;
                final Ref<LayoutCoordinates> ref22 = ref2;
                final int i6 = mo330roundToPx0680j_42;
                final MutableState<Integer> mutableState32 = mutableState22;
                final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view22, new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        View rootView = view3.getRootView();
                        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                        LayoutCoordinates value = ref22.getValue();
                        int i7 = i6;
                        final MutableState<Integer> mutableState4 = mutableState32;
                        ExposedDropdownMenuKt.updateHeight(rootView, value, i7, new Function1<Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i8) {
                                ExposedDropdownMenuKt.m1399ExposedDropdownMenuBox$lambda5(mutableState4, i8);
                            }
                        });
                    }
                });
                return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        OnGlobalLayoutListener.this.dispose();
                    }
                };
            }
        }, startRestartGroup, 8);
        modifier3 = modifier42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-1, reason: not valid java name */
    public static final int m1396ExposedDropdownMenuBox$lambda1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-2, reason: not valid java name */
    public static final void m1397ExposedDropdownMenuBox$lambda2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-4, reason: not valid java name */
    public static final int m1398ExposedDropdownMenuBox$lambda4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-5, reason: not valid java name */
    public static final void m1399ExposedDropdownMenuBox$lambda5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final Modifier expandable(Modifier modifier, final Function0<Unit> function0, final String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new ExposedDropdownMenuKt$expandable$1(function0, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                final Function0<Unit> function02 = function0;
                SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ExposedDropdownMenuKt$expandable$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        function02.invoke();
                        return true;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i, Function1<? super Integer, Unit> function1) {
        if (layoutCoordinates == null) {
            return;
        }
        view.getWindowVisibleDisplayFrame(new Rect());
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - r0.top, (r0.bottom - r0.top) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i));
    }
}
