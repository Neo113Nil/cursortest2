package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AskedAboutRow.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"AskedAboutRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "part", "Lio/intercom/android/sdk/models/Part;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/models/Part;Landroidx/compose/runtime/Composer;II)V", "AskedAboutRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AskedAboutRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskedAboutRow$lambda$3(Modifier modifier, Part part, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(part, "$part");
        AskedAboutRow(modifier, part, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskedAboutRowPreview$lambda$4(int i, Composer composer, int i2) {
        AskedAboutRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AskedAboutRow(Modifier modifier, final Part part, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(part, "part");
        Composer startRestartGroup = composer.startRestartGroup(1277406973);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(companion, Dp.m8798constructorimpl(16), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default);
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
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        final Modifier modifier2 = companion;
        TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_asked_about, startRestartGroup, 0), PaddingKt.m1161paddingqDBjuR0$default(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(8), 7, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m8245copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m8654getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), startRestartGroup, 0, 0, 131068);
        Composer composer2 = startRestartGroup;
        List<Block> blocks = part.getBlocks();
        Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
        final Block block = (Block) CollectionsKt.firstOrNull((List) blocks);
        composer2.startReplaceGroup(-1827597217);
        if (block != null) {
            IntercomCardKt.IntercomCard(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AskedAboutRow$lambda$2$lambda$1$lambda$0;
                    AskedAboutRow$lambda$2$lambda$1$lambda$0 = AskedAboutRowKt.AskedAboutRow$lambda$2$lambda$1$lambda$0(context, block);
                    return AskedAboutRow$lambda$2$lambda$1$lambda$0;
                }
            }, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, IntercomCardStyle.INSTANCE.m12917conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, composer2, IntercomCardStyle.$stable << 15, 31), null, ComposableLambdaKt.rememberComposableLambda(-1866574392, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt$AskedAboutRow$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope IntercomCard, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                    if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                        Modifier m1157padding3ABfNKs = PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16));
                        Block block2 = Block.this;
                        ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1157padding3ABfNKs);
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
                        Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                        }
                        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        String title = block2.getTitle();
                        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
                        TextKt.m3901TextNvy7gAk(title, PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04SemiBold(), composer3, 48, 0, 131068);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), composer2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
            composer2 = composer2;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AskedAboutRow$lambda$3;
                    AskedAboutRow$lambda$3 = AskedAboutRowKt.AskedAboutRow$lambda$3(Modifier.this, part, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AskedAboutRow$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskedAboutRow$lambda$2$lambda$1$lambda$0(Context context, Block it) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "$it");
        IntercomArticleActivity.Companion companion = IntercomArticleActivity.INSTANCE;
        String articleId = it.getArticleId();
        Intrinsics.checkNotNullExpressionValue(articleId, "getArticleId(...)");
        context.startActivity(companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, "conversation", false, true)));
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void AskedAboutRowPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(97963709);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AskedAboutRowKt.INSTANCE.m12334getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AskedAboutRowPreview$lambda$4;
                    AskedAboutRowPreview$lambda$4 = AskedAboutRowKt.AskedAboutRowPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AskedAboutRowPreview$lambda$4;
                }
            });
        }
    }
}
