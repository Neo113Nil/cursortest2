package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.PsExtractor;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinStreamingRow.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a)\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"FinStreamingRow", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "streamingPart", "Lio/intercom/android/sdk/models/StreamingPart;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lio/intercom/android/sdk/models/StreamingPart;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FinStreamingBlock", "blockRenderData", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "showCursor", "", "(Lio/intercom/android/sdk/survey/block/BlockRenderData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "FinStreamingRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FinStreamingRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingBlock$lambda$9(BlockRenderData blockRenderData, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        FinStreamingBlock(blockRenderData, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingRow$lambda$1(List blocks, StreamingPart streamingPart, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blocks, "$blocks");
        Intrinsics.checkNotNullParameter(streamingPart, "$streamingPart");
        FinStreamingRow(blocks, streamingPart, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingRowPreview$lambda$10(int i, Composer composer, int i2) {
        FinStreamingRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FinStreamingRow(final List<? extends Block> blocks, final StreamingPart streamingPart, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(streamingPart, "streamingPart");
        Composer startRestartGroup = composer.startRestartGroup(-918532595);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final FinRowStyle finRowStyle = FinAnswerRowKt.getFinRowStyle(GroupingPosition.STANDALONE, startRestartGroup, 6);
        Modifier padding = PaddingKt.padding(companion, finRowStyle.getRowPadding());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        SurfaceKt.m3729SurfaceT9BRK9s(null, finRowStyle.getBubbleStyle().getShape(), finRowStyle.getBubbleStyle().m12381getColor0d7_KjU(), 0L, 0.0f, 0.0f, finRowStyle.getBubbleStyle().getBorderStroke(), ComposableLambdaKt.rememberComposableLambda(610304332, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$FinStreamingRow$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                Composer composer3 = composer2;
                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier padding2 = PaddingKt.padding(Modifier.INSTANCE, FinRowStyle.this.getBubbleStyle().getPadding());
                    Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(16));
                    StreamingPart streamingPart2 = streamingPart;
                    List<Block> list = blocks;
                    FinRowStyle finRowStyle2 = FinRowStyle.this;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, padding2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer3);
                    Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                    }
                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    io.intercom.android.sdk.models.Metadata metadata = streamingPart2.getMetadata();
                    composer3.startReplaceGroup(-989627254);
                    if (metadata != null) {
                        List<Avatar> avatars = metadata.getAvatars();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
                        Iterator<T> it = avatars.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                        }
                        FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), null, false, null, composer2, 196616, 196);
                        composer3 = composer2;
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-989612763);
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        FinStreamingRowKt.FinStreamingBlock(new BlockRenderData((Block) obj, Color.m6029boximpl(ColorSchemeKt.m2863contentColorForek8zF_U(finRowStyle2.getBubbleStyle().m12381getColor0d7_KjU(), composer3, 0)), null, null, BlockRenderTextStyle.m12643copyZsBm6Y$default(BlockRenderTextStyle.INSTANCE.getParagraphDefault(), 0L, null, 0L, null, Color.m6029boximpl(IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU()), null, 47, null), 12, null), ClipKt.clip(Modifier.INSTANCE, finRowStyle2.getContentShape()), i4 == CollectionsKt.getLastIndex(list), composer3, 8, 0);
                        composer3 = composer2;
                        i4 = i5;
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, 12582912, 57);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinStreamingRow$lambda$1;
                    FinStreamingRow$lambda$1 = FinStreamingRowKt.FinStreamingRow$lambda$1(blocks, streamingPart, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FinStreamingRow$lambda$1;
                }
            });
        }
    }

    public static final void FinStreamingBlock(final BlockRenderData blockRenderData, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        Composer startRestartGroup = composer.startRestartGroup(1420678116);
        final Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z2 = (i2 & 4) != 0 ? false : z;
        startRestartGroup.startReplaceGroup(-382486785);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        Pair pair = TuplesKt.to(Float.valueOf(density.mo744toPx0680j_4(Dp.m8798constructorimpl(3)) * density.getFontScale()), Float.valueOf(density.mo744toPx0680j_4(Dp.m8798constructorimpl(12)) * density.getFontScale()));
        final float floatValue = ((Number) pair.component1()).floatValue();
        final float floatValue2 = ((Number) pair.component2()).floatValue();
        startRestartGroup.startReplaceGroup(-382476587);
        boolean changed = ((((i & 896) ^ 384) > 256 && startRestartGroup.changed(z2)) || (i & 384) == 256) | startRestartGroup.changed(floatValue2) | startRestartGroup.changed(floatValue);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit FinStreamingBlock$lambda$6$lambda$5;
                    FinStreamingBlock$lambda$6$lambda$5 = FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z2, mutableState, floatValue2, floatValue, (ContentDrawScope) obj);
                    return FinStreamingBlock$lambda$6$lambda$5;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceGroup();
        Modifier drawWithContent = DrawModifierKt.drawWithContent(companion, (Function1) rememberedValue2);
        startRestartGroup.startReplaceGroup(-382442246);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit FinStreamingBlock$lambda$8$lambda$7;
                    FinStreamingBlock$lambda$8$lambda$7 = FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(MutableState.this, (TextLayoutResult) obj);
                    return FinStreamingBlock$lambda$8$lambda$7;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceGroup();
        BlockViewKt.BlockView(drawWithContent, blockRenderData, false, null, false, null, null, null, null, false, null, (Function1) rememberedValue3, startRestartGroup, 64, 48, 2044);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinStreamingBlock$lambda$9;
                    FinStreamingBlock$lambda$9 = FinStreamingRowKt.FinStreamingBlock$lambda$9(BlockRenderData.this, companion, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FinStreamingBlock$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingBlock$lambda$6$lambda$5(boolean z, MutableState layoutResult, float f, float f2, ContentDrawScope drawWithContent) {
        TextLayoutResult textLayoutResult;
        Intrinsics.checkNotNullParameter(layoutResult, "$layoutResult");
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (z && (textLayoutResult = (TextLayoutResult) layoutResult.getValue()) != null) {
            int lineCount = textLayoutResult.getLineCount() - 1;
            float lineBottom = textLayoutResult.getLineBottom(lineCount) - textLayoutResult.getLineTop(lineCount);
            float lineRight = textLayoutResult.getLineRight(lineCount) + 12.0f;
            float lineTop = textLayoutResult.getLineTop(lineCount);
            float f3 = 2;
            DrawScope.m6614drawRoundRectuAw5IA$default(drawWithContent, Color.INSTANCE.m6065getBlack0d7_KjU(), Offset.m5763constructorimpl((Float.floatToRawIntBits(lineTop + ((lineBottom / f3) - (f / f3))) & 4294967295L) | (Float.floatToRawIntBits(lineRight) << 32)), Size.m5831constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), CornerRadius.m5725constructorimpl((Float.floatToRawIntBits(f2) << 32) | (4294967295L & Float.floatToRawIntBits(f2))), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinStreamingBlock$lambda$8$lambda$7(MutableState layoutResult, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(layoutResult, "$layoutResult");
        Intrinsics.checkNotNullParameter(it, "it");
        layoutResult.setValue(it);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void FinStreamingRowPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1248993407);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FinStreamingRowKt.INSTANCE.m12351getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinStreamingRowPreview$lambda$10;
                    FinStreamingRowPreview$lambda$10 = FinStreamingRowKt.FinStreamingRowPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FinStreamingRowPreview$lambda$10;
                }
            });
        }
    }
}
