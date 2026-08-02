package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostCardRow.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aG\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"PostCardRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "part", "Lio/intercom/android/sdk/models/Part;", "companyName", "", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/models/Part;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "PostContent", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "participantName", "participantCompanyName", "participantAvatarWrapper", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "headerColor", "Landroidx/compose/ui/graphics/Color;", "PostContent-FHprtrg", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PostCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PostCardRowKt {

    /* compiled from: PostCardRow.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.HEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostCardPreview$lambda$5(int i, Composer composer, int i2) {
        PostCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostCardRow$lambda$0(Modifier modifier, Part part, String companyName, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(part, "$part");
        Intrinsics.checkNotNullParameter(companyName, "$companyName");
        PostCardRow(modifier, part, companyName, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContent_FHprtrg$lambda$4(List blocks, String participantName, String participantCompanyName, AvatarWrapper participantAvatarWrapper, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blocks, "$blocks");
        Intrinsics.checkNotNullParameter(participantName, "$participantName");
        Intrinsics.checkNotNullParameter(participantCompanyName, "$participantCompanyName");
        Intrinsics.checkNotNullParameter(participantAvatarWrapper, "$participantAvatarWrapper");
        m12388PostContentFHprtrg(blocks, participantName, participantCompanyName, participantAvatarWrapper, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PostCardRow(Modifier modifier, final Part part, final String companyName, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Composer startRestartGroup = composer.startRestartGroup(-1691901714);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Modifier modifier2 = companion;
        IntercomCardKt.IntercomCard(SizeKt.m1195height3ABfNKs(PaddingKt.m1158paddingVpY3zN4(companion, Dp.m8798constructorimpl(14), Dp.m8798constructorimpl(12)), Dp.m8798constructorimpl(200)), IntercomCardStyle.INSTANCE.m12917conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, startRestartGroup, IntercomCardStyle.$stable << 15, 31), ComposableLambdaKt.rememberComposableLambda(1178622818, true, new PostCardRowKt$PostCardRow$1(part, companyName, ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU()), new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m6029boximpl(Color.INSTANCE.m6074getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m6029boximpl(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU()))}, (Context) consume), startRestartGroup, 54), startRestartGroup, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PostCardRow$lambda$0;
                    PostCardRow$lambda$0 = PostCardRowKt.PostCardRow$lambda$0(Modifier.this, part, companyName, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PostCardRow$lambda$0;
                }
            });
        }
    }

    /* renamed from: PostContent-FHprtrg, reason: not valid java name */
    public static final void m12388PostContentFHprtrg(final List<? extends Block> blocks, final String participantName, final String participantCompanyName, final AvatarWrapper participantAvatarWrapper, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        float m8798constructorimpl;
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(participantName, "participantName");
        Intrinsics.checkNotNullParameter(participantCompanyName, "participantCompanyName");
        Intrinsics.checkNotNullParameter(participantAvatarWrapper, "participantAvatarWrapper");
        Composer startRestartGroup = composer.startRestartGroup(-1350453300);
        Modifier.Companion companion = (i2 & 32) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
        Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        AvatarIconKt.m12134AvatarIconRd90Nhg(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), participantAvatarWrapper, null, false, 0L, null, startRestartGroup, 70, 60);
        SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(12)), startRestartGroup, 6);
        final Modifier modifier2 = companion;
        TextKt.m3901TextNvy7gAk(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", participantName).put("company", participantCompanyName).format().toString(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 0, 0, 131070);
        Composer composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        int i3 = 16;
        float f = 16;
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), composer2, 6);
        composer2.startReplaceGroup(-83078379);
        Iterator it = blocks.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Block block = (Block) next;
            float f2 = f;
            Composer composer3 = composer2;
            int i6 = i4;
            Iterator it2 = it;
            int i7 = i3;
            BlockViewKt.BlockView(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new BlockRenderData(block, null, new BlockRenderTextStyle(TextUnitKt.getSp(20), FontWeight.INSTANCE.getMedium(), 0L, Color.m6029boximpl(j), null, null, 52, null), new BlockRenderTextStyle(TextUnitKt.getSp(i3), FontWeight.INSTANCE.getNormal(), 0L, Color.m6029boximpl(j), null, null, 52, null), null, 18, null), false, null, false, null, null, null, null, false, null, null, composer3, 70, 0, 4092);
            composer2 = composer3;
            BlockType type = block.getType();
            int i8 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i8 == 1) {
                m8798constructorimpl = Dp.m8798constructorimpl(32);
            } else if (i8 == 2) {
                m8798constructorimpl = Dp.m8798constructorimpl(f2);
            } else {
                m8798constructorimpl = Dp.m8798constructorimpl(8);
            }
            composer2.startReplaceGroup(-83051140);
            if (i6 != CollectionsKt.getLastIndex(blocks)) {
                SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, m8798constructorimpl), composer2, 0);
            }
            composer2.endReplaceGroup();
            it = it2;
            i4 = i5;
            f = f2;
            i3 = i7;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PostContent_FHprtrg$lambda$4;
                    PostContent_FHprtrg$lambda$4 = PostCardRowKt.PostContent_FHprtrg$lambda$4(blocks, participantName, participantCompanyName, participantAvatarWrapper, j, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PostContent_FHprtrg$lambda$4;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PostCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(620144177);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PostCardRowKt.INSTANCE.m12355getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PostCardPreview$lambda$5;
                    PostCardPreview$lambda$5 = PostCardRowKt.PostCardPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PostCardPreview$lambda$5;
                }
            });
        }
    }
}
