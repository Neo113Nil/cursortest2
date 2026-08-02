package io.intercom.android.sdk.m5.components;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FooterNotice.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a;\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0002\u0010\u0013\u001a1\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0003¢\u0006\u0002\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001c\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001d\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0019\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001e"}, d2 = {"HandoverPillBottomPadding", "Landroidx/compose/ui/unit/Dp;", "getHandoverPillBottomPadding", "()F", "F", "FooterNoticePill", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ExpandedFooterNotice", "subtitle", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "FooterNoticePillWithoutAnimation", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FooterTitle", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ExpandedFooterNoticePreview", "(Landroidx/compose/runtime/Composer;I)V", "ExpandedFooterNoticePreviewMultipleAvatars", "ExpandedTitleOnlyFooterNoticePreview", "FooterNoticePillPreview", "FooterNoticePillMultipleAvatarsPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FooterNoticeKt {
    private static final float HandoverPillBottomPadding = Dp.m8798constructorimpl(10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFooterNotice$lambda$6(Modifier modifier, String title, String subtitle, List avatars, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(subtitle, "$subtitle");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        ExpandedFooterNotice(modifier, title, subtitle, avatars, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFooterNoticePreview$lambda$10(int i, Composer composer, int i2) {
        ExpandedFooterNoticePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(int i, Composer composer, int i2) {
        ExpandedFooterNoticePreviewMultipleAvatars(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTitleOnlyFooterNoticePreview$lambda$12(int i, Composer composer, int i2) {
        ExpandedTitleOnlyFooterNoticePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePill$lambda$4(Modifier modifier, String title, List avatars, Function0 onClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        FooterNoticePill(modifier, title, avatars, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePillMultipleAvatarsPreview$lambda$14(int i, Composer composer, int i2) {
        FooterNoticePillMultipleAvatarsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePillPreview$lambda$13(int i, Composer composer, int i2) {
        FooterNoticePillPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterNoticePillWithoutAnimation$lambda$7(String title, List avatars, Function0 onClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        FooterNoticePillWithoutAnimation(title, avatars, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterTitle$lambda$9(String title, List avatars, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        FooterTitle(title, avatars, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final float getHandoverPillBottomPadding() {
        return HandoverPillBottomPadding;
    }

    public static final void FooterNoticePill(Modifier modifier, final String title, final List<AvatarWrapper> avatars, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(2116373339);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
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
        startRestartGroup.startReplaceGroup(-2063426416);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Object obj = rememberedValue;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            MutableTransitionState mutableTransitionState = new MutableTransitionState(false);
            mutableTransitionState.setTargetState$animation_core(true);
            startRestartGroup.updateRememberedValue(mutableTransitionState);
            obj = mutableTransitionState;
        }
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) obj, (Modifier) null, TransitionsKt.floatingButtonEnterTransition((int) ((Density) consume).mo744toPx0680j_4(HandoverPillBottomPadding)), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1063955783, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$FooterNoticePill$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                FooterNoticeKt.FooterNoticePillWithoutAnimation(title, avatars, onClick, composer2, 64);
            }
        }, startRestartGroup, 54), startRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit FooterNoticePill$lambda$4;
                    FooterNoticePill$lambda$4 = FooterNoticeKt.FooterNoticePill$lambda$4(Modifier.this, title, avatars, onClick, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return FooterNoticePill$lambda$4;
                }
            });
        }
    }

    public static final void ExpandedFooterNotice(Modifier modifier, final String title, final String subtitle, final List<AvatarWrapper> avatars, Composer composer, final int i, final int i2) {
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Composer startRestartGroup = composer.startRestartGroup(-1076553086);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
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
        FooterTitle(title, avatars, startRestartGroup, ((i >> 3) & 14) | 64);
        startRestartGroup.startReplaceGroup(2043466329);
        if (subtitle.length() > 0) {
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
            TextStyle type04Point5 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5();
            composer2 = startRestartGroup;
            modifier2 = companion;
            TextKt.m3901TextNvy7gAk(subtitle, null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), 0L, 0, false, 0, 0, null, type04Point5, composer2, (i >> 6) & 14, 0, 130042);
        } else {
            composer2 = startRestartGroup;
            modifier2 = companion;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedFooterNotice$lambda$6;
                    ExpandedFooterNotice$lambda$6 = FooterNoticeKt.ExpandedFooterNotice$lambda$6(Modifier.this, title, subtitle, avatars, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedFooterNotice$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterNoticePillWithoutAnimation(final String str, final List<AvatarWrapper> list, final Function0<Unit> function0, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2078164816);
        IntercomCardKt.IntercomCard(function0, PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, HandoverPillBottomPadding), false, IntercomCardStyle.INSTANCE.m12918defaultStyleqUnfpCA(IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getExtraLarge(), 0L, 0L, 0.0f, null, 0L, startRestartGroup, IntercomCardStyle.$stable << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-1065463783, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$FooterNoticePillWithoutAnimation$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope IntercomCard, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(Modifier.INSTANCE, Dp.m8798constructorimpl(10), Dp.m8798constructorimpl(12));
                    String str2 = str;
                    List<AvatarWrapper> list2 = list;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1158paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m5333constructorimpl = Updater.m5333constructorimpl(composer2);
                    Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    FooterNoticeKt.FooterTitle(str2, list2, composer2, 64);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i >> 6) & 14) | 196656 | (IntercomCardStyle.Style.$stable << 9), 20);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FooterNoticePillWithoutAnimation$lambda$7;
                    FooterNoticePillWithoutAnimation$lambda$7 = FooterNoticeKt.FooterNoticePillWithoutAnimation$lambda$7(str, list, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FooterNoticePillWithoutAnimation$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterTitle(final String str, List<AvatarWrapper> list, Composer composer, final int i) {
        final List<AvatarWrapper> list2;
        Composer startRestartGroup = composer.startRestartGroup(-973759395);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
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
        startRestartGroup.startReplaceGroup(1829795659);
        if (list.isEmpty()) {
            list2 = list;
        } else {
            list2 = list;
            AvatarGroupKt.m12024AvatarGroupJ8mCjc(list2, null, Dp.m8798constructorimpl(16), TextUnitKt.getSp(10), startRestartGroup, 3464, 2);
            SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
        }
        startRestartGroup.endReplaceGroup();
        TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), startRestartGroup, i & 14, 0, 130042);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FooterTitle$lambda$9;
                    FooterTitle$lambda$9 = FooterNoticeKt.FooterTitle$lambda$9(str, list2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FooterTitle$lambda$9;
                }
            });
        }
    }

    public static final void ExpandedFooterNoticePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1644521079);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m12057getLambda1$intercom_sdk_base_release(), startRestartGroup, 12582912, 127);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedFooterNoticePreview$lambda$10;
                    ExpandedFooterNoticePreview$lambda$10 = FooterNoticeKt.ExpandedFooterNoticePreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedFooterNoticePreview$lambda$10;
                }
            });
        }
    }

    public static final void ExpandedFooterNoticePreviewMultipleAvatars(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(419901737);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m12058getLambda2$intercom_sdk_base_release(), startRestartGroup, 12582912, 127);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedFooterNoticePreviewMultipleAvatars$lambda$11;
                    ExpandedFooterNoticePreviewMultipleAvatars$lambda$11 = FooterNoticeKt.ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedFooterNoticePreviewMultipleAvatars$lambda$11;
                }
            });
        }
    }

    public static final void ExpandedTitleOnlyFooterNoticePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-385296499);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m12059getLambda3$intercom_sdk_base_release(), startRestartGroup, 12582912, 127);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedTitleOnlyFooterNoticePreview$lambda$12;
                    ExpandedTitleOnlyFooterNoticePreview$lambda$12 = FooterNoticeKt.ExpandedTitleOnlyFooterNoticePreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedTitleOnlyFooterNoticePreview$lambda$12;
                }
            });
        }
    }

    public static final void FooterNoticePillPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(615648759);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m12060getLambda4$intercom_sdk_base_release(), startRestartGroup, 12582912, 127);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FooterNoticePillPreview$lambda$13;
                    FooterNoticePillPreview$lambda$13 = FooterNoticeKt.FooterNoticePillPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FooterNoticePillPreview$lambda$13;
                }
            });
        }
    }

    public static final void FooterNoticePillMultipleAvatarsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(961872365);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m12061getLambda5$intercom_sdk_base_release(), startRestartGroup, 12582912, 127);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FooterNoticePillMultipleAvatarsPreview$lambda$14;
                    FooterNoticePillMultipleAvatarsPreview$lambda$14 = FooterNoticeKt.FooterNoticePillMultipleAvatarsPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FooterNoticePillMultipleAvatarsPreview$lambda$14;
                }
            });
        }
    }
}
