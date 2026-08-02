package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchBrowseCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SearchBrowseCardKt$SearchBrowseCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $accessToTeammateEnabled;
    final /* synthetic */ List<AvatarWrapper> $avatars;
    final /* synthetic */ Context $context;
    final /* synthetic */ HomeCards.HomeHelpCenterData $helpCenterData;
    final /* synthetic */ boolean $isSearchFirstEnabled;
    final /* synthetic */ MetricTracker $metricTracker;

    SearchBrowseCardKt$SearchBrowseCard$1(boolean z, HomeCards.HomeHelpCenterData homeHelpCenterData, boolean z2, List<AvatarWrapper> list, MetricTracker metricTracker, Context context) {
        this.$isSearchFirstEnabled = z;
        this.$helpCenterData = homeHelpCenterData;
        this.$accessToTeammateEnabled = z2;
        this.$avatars = list;
        this.$metricTracker = metricTracker;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope IntercomCard, Composer composer, int i) {
        long m6074getTransparent0d7_KjU;
        int i2;
        float m8798constructorimpl;
        float f;
        int i3;
        int i4;
        Modifier modifier;
        float f2;
        final MetricTracker metricTracker;
        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            boolean z = this.$isSearchFirstEnabled || !this.$helpCenterData.getSuggestedArticles().isEmpty();
            HomeCards.HomeHelpCenterData homeHelpCenterData = this.$helpCenterData;
            boolean z2 = this.$isSearchFirstEnabled;
            boolean z3 = this.$accessToTeammateEnabled;
            List<AvatarWrapper> list = this.$avatars;
            final MetricTracker metricTracker2 = this.$metricTracker;
            final Context context = this.$context;
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float m8798constructorimpl2 = Dp.m8798constructorimpl(z ? 8 : 0);
            float f3 = 0;
            float m8798constructorimpl3 = Dp.m8798constructorimpl(f3);
            float m8798constructorimpl4 = z ? Dp.m8798constructorimpl(8) : Dp.m8798constructorimpl(f3);
            if (z) {
                f3 = 8;
            }
            Modifier clip = ClipKt.clip(PaddingKt.m1160paddingqDBjuR0(companion2, m8798constructorimpl4, m8798constructorimpl2, Dp.m8798constructorimpl(f3), m8798constructorimpl3), IntercomTheme.INSTANCE.getShapes(composer, IntercomTheme.$stable).getSmall());
            composer.startReplaceGroup(343614555);
            if (z) {
                m6074getTransparent0d7_KjU = Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m6074getTransparent0d7_KjU = Color.INSTANCE.m6074getTransparent0d7_KjU();
            }
            composer.endReplaceGroup();
            Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(BackgroundKt.m582backgroundbw27NRU$default(clip, m6074getTransparent0d7_KjU, null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$0;
                    invoke$lambda$7$lambda$0 = SearchBrowseCardKt$SearchBrowseCard$1.invoke$lambda$7$lambda$0(MetricTracker.this, context);
                    return invoke$lambda$7$lambda$0;
                }
            }, 15, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m623clickableoSLSa3U$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            if (z) {
                m8798constructorimpl = Dp.m8798constructorimpl(8);
                i2 = 16;
            } else {
                i2 = 16;
                m8798constructorimpl = Dp.m8798constructorimpl(16);
            }
            Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(fillMaxWidth$default, m8798constructorimpl, Dp.m8798constructorimpl(z ? 12 : 20));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m1158paddingVpY3zN4);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
            }
            Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String str = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
            Context context2 = context;
            TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_search_for_help, composer, 0), null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1572864, 0, 262078);
            Composer composer2 = composer;
            int i5 = R.drawable.intercom_gif_search_icon;
            float f4 = i2;
            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i5, composer2, 0), (String) null, TestTagKt.testTag(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f4)), String.valueOf(i5)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), composer2, 56, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            List<SuggestedArticle> suggestedArticles = homeHelpCenterData.getSuggestedArticles();
            composer2.startReplaceGroup(343677614);
            List<SuggestedArticle> list2 = suggestedArticles;
            int i6 = 6;
            if (list2.isEmpty()) {
                f = f4;
                i3 = 6;
                i4 = 2;
                modifier = null;
                f2 = 0.0f;
            } else {
                ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                String str2 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                int i7 = -1159599143;
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str2);
                int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                String str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                int i8 = -553112988;
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer m5333constructorimpl4 = Updater.m5333constructorimpl(composer2);
                Updater.m5340setimpl(m5333constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl4.getInserting() || !Intrinsics.areEqual(m5333constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                    m5333constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                    m5333constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                }
                Updater.m5340setimpl(m5333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-562735688);
                if (list2.isEmpty()) {
                    metricTracker = metricTracker2;
                    modifier = null;
                } else {
                    metricTracker = metricTracker2;
                    modifier = null;
                    EffectsKt.LaunchedEffect("", new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(metricTracker, suggestedArticles, null), composer2, 70);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-562721890);
                int i9 = 0;
                for (Object obj : suggestedArticles) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final SuggestedArticle suggestedArticle = (SuggestedArticle) obj;
                    composer2.startReplaceGroup(-562722059);
                    if (i9 == 0) {
                        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), composer2, i6);
                    }
                    composer2.endReplaceGroup();
                    final Context context3 = context2;
                    float f5 = 4;
                    Modifier testTag = TestTagKt.testTag(PaddingKt.m1161paddingqDBjuR0$default(ClickableKt.m623clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, modifier), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$7$lambda$6$lambda$5$lambda$3;
                            invoke$lambda$7$lambda$6$lambda$5$lambda$3 = SearchBrowseCardKt$SearchBrowseCard$1.invoke$lambda$7$lambda$6$lambda$5$lambda$3(MetricTracker.this, suggestedArticle, context3);
                            return invoke$lambda$7$lambda$6$lambda$5$lambda$3;
                        }
                    }, 15, null), Dp.m8798constructorimpl(f4), Dp.m8798constructorimpl(f5), 0.0f, Dp.m8798constructorimpl(f5), 4, null), "suggested article");
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    String str4 = str;
                    ComposerKt.sourceInformationMarkerStart(composer2, 844473419, str4);
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, i7, str2);
                    int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, testTag);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, i8, str3);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer m5333constructorimpl5 = Updater.m5333constructorimpl(composer2);
                    Updater.m5340setimpl(m5333constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl5.getInserting() || !Intrinsics.areEqual(m5333constructorimpl5.rememberedValue(), Integer.valueOf(hashCode5))) {
                        m5333constructorimpl5.updateRememberedValue(Integer.valueOf(hashCode5));
                        m5333constructorimpl5.apply(Integer.valueOf(hashCode5), setCompositeKeyHash5);
                    }
                    Updater.m5340setimpl(m5333constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    str = str4;
                    float f6 = f4;
                    TextKt.m3901TextNvy7gAk(suggestedArticle.getTitle(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, FontWeight.INSTANCE.getNormal(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, null, composer, 1572864, 24960, 241596);
                    composer2 = composer;
                    modifier = null;
                    IntercomChevronKt.IntercomChevron(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(20), 0.0f, 2, null), composer2, 6, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f6)), composer2, 6);
                    i6 = 6;
                    i9 = i10;
                    f4 = f6;
                    str2 = str2;
                    context2 = context3;
                    i8 = i8;
                    i7 = -1159599143;
                    metricTracker = metricTracker;
                    str3 = str3;
                }
                f = f4;
                i3 = i6;
                i4 = 2;
                f2 = 0.0f;
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(343755978);
            if (z2 && z3) {
                composer2.startReplaceGroup(343758114);
                if (!list2.isEmpty()) {
                    IntercomDividerKt.IntercomDivider(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f), f2, i4, modifier), composer2, i3, 0);
                }
                composer2.endReplaceGroup();
                TeamPresenceRowKt.TeamPresenceRow(modifier, list, composer2, 64, 1);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$0(MetricTracker metricTracker, Context context) {
        Intrinsics.checkNotNullParameter(metricTracker, "$metricTracker");
        Intrinsics.checkNotNullParameter(context, "$context");
        metricTracker.clickedSearchBrowseCard();
        context.startActivity(IntercomArticleSearchActivity.INSTANCE.buildIntent(context, true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$3(MetricTracker metricTracker, SuggestedArticle it, Context context) {
        Intrinsics.checkNotNullParameter(metricTracker, "$metricTracker");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(context, "$context");
        metricTracker.clickedArticleSuggestion(it.getId());
        context.startActivity(IntercomArticleActivity.INSTANCE.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(it.getId(), "search_browse_card", true, false, 8, null)));
        return Unit.INSTANCE;
    }
}
