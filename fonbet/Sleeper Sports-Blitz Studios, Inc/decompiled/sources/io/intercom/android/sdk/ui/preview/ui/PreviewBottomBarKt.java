package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PreviewBottomBar.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a7\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"PreviewBottomBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "uiState", "Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;", "onThumbnailClick", "Lkotlin/Function1;", "", "onCtaClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ThumbnailList", "files", "", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "currentPage", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PreviewBottomBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBottomBar$lambda$2(Modifier modifier, PreviewUiState uiState, Function1 onThumbnailClick, Function0 onCtaClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "$onThumbnailClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "$onCtaClick");
        PreviewBottomBar(modifier, uiState, onThumbnailClick, onCtaClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThumbnailList$lambda$9(List files, int i, Function1 onThumbnailClick, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(files, "$files");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "$onThumbnailClick");
        ThumbnailList(files, i, onThumbnailClick, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void PreviewBottomBar(Modifier modifier, final PreviewUiState uiState, final Function1<? super Integer, Unit> onThumbnailClick, final Function0<Unit> onCtaClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "onThumbnailClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Composer startRestartGroup = composer.startRestartGroup(1411281377);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        float f = 16;
        Modifier m1157padding3ABfNKs = PaddingKt.m1157padding3ABfNKs(BackgroundKt.m582backgroundbw27NRU$default(SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m8798constructorimpl(100)), Color.m6038copywmQWz5c$default(Color.INSTANCE.m6065getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m8798constructorimpl(f));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1016spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1157padding3ABfNKs);
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
        startRestartGroup.startReplaceGroup(-2090574877);
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(654440355);
        if (uiState.getFiles().size() > 1) {
            ThumbnailList(uiState.getFiles(), uiState.getCurrentPage(), onThumbnailClick, startRestartGroup, (i & 896) | 8);
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        String confirmationText = uiState.getConfirmationText();
        if (confirmationText == null || StringsKt.isBlank(confirmationText)) {
            modifier2 = modifier3;
            startRestartGroup.endReplaceGroup();
        } else {
            modifier2 = modifier3;
            ButtonKt.Button(onCtaClick, PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m8798constructorimpl(f), 0.0f, 11, null), false, IntercomTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m13089getAction0d7_KjU(), 0L, 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-950541555, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$PreviewBottomBar$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i3 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        TextKt.m3901TextNvy7gAk(PreviewUiState.this.getConfirmationText(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ((i >> 9) & 14) | 805306416, 484);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBottomBar$lambda$2;
                    PreviewBottomBar$lambda$2 = PreviewBottomBarKt.PreviewBottomBar$lambda$2(Modifier.this, uiState, onThumbnailClick, onCtaClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBottomBar$lambda$2;
                }
            });
        }
    }

    private static final void ThumbnailList(final List<? extends IntercomPreviewFile> list, final int i, final Function1<? super Integer, Unit> function1, Composer composer, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-1185141070);
        final LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(1591198182);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1591201463);
        boolean changed = startRestartGroup.changed(rememberLazyListState);
        PreviewBottomBarKt$ThumbnailList$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new PreviewBottomBarKt$ThumbnailList$1$1(rememberLazyListState, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect("", (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 70);
        LazyDslKt.LazyRow(Modifier.INSTANCE, rememberLazyListState, PaddingKt.m1151PaddingValuesYgX7TsA(Dp.m8798constructorimpl(8), Dp.m8798constructorimpl(4)), false, Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ThumbnailList$lambda$8;
                ThumbnailList$lambda$8 = PreviewBottomBarKt.ThumbnailList$lambda$8(list, mutableState, i, coroutineScope, function1, rememberLazyListState, (LazyListScope) obj);
                return ThumbnailList$lambda$8;
            }
        }, startRestartGroup, 221574, 456);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ThumbnailList$lambda$9;
                    ThumbnailList$lambda$9 = PreviewBottomBarKt.ThumbnailList$lambda$9(list, i, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ThumbnailList$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThumbnailList$lambda$8(final List files, MutableState visibleItems, final int i, CoroutineScope scope, final Function1 onThumbnailClick, LazyListState listState, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(files, "$files");
        Intrinsics.checkNotNullParameter(visibleItems, "$visibleItems");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "$onThumbnailClick");
        Intrinsics.checkNotNullParameter(listState, "$listState");
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.items(files.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                files.get(i2);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, final int i2, Composer composer, int i3) {
                int i4;
                ComposerKt.sourceInformation(composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                boolean z = true;
                if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2039820996, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                IntercomPreviewFile intercomPreviewFile = (IntercomPreviewFile) files.get(i2);
                composer.startReplaceGroup(534177283);
                Modifier m1157padding3ABfNKs = PaddingKt.m1157padding3ABfNKs(BorderKt.m594borderxT4_qwU(Modifier.INSTANCE, Dp.m8798constructorimpl(2), i == i2 ? Color.INSTANCE.m6076getWhite0d7_KjU() : Color.INSTANCE.m6074getTransparent0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(10)), Dp.m8798constructorimpl(4));
                composer.startReplaceGroup(-1229685931);
                boolean changed = composer.changed(onThumbnailClick);
                if ((((i4 & 112) ^ 48) <= 32 || !composer.changed(i2)) && (i4 & 48) != 32) {
                    z = false;
                }
                boolean z2 = changed | z;
                Object rememberedValue = composer.rememberedValue();
                if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function1 = onThumbnailClick;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$2$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(Integer.valueOf(i2));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(m1157padding3ABfNKs, false, null, null, null, (Function0) rememberedValue, 15, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m623clickableoSLSa3U$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m5333constructorimpl = Updater.m5333constructorimpl(composer);
                Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                PreviewUriKt.ThumbnailPreview(ClipKt.clip(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(48)), RoundedCornerShapeKt.RoundedCornerShape(10)), ContentScale.INSTANCE.getCrop(), intercomPreviewFile, composer, 560, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!((List) visibleItems.getValue()).contains(Integer.valueOf(i))) {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new PreviewBottomBarKt$ThumbnailList$2$2(listState, i, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
