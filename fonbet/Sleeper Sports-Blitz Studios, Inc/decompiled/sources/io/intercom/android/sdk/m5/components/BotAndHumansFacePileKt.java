package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotAndHumansFacePile.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001aK\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0000\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"BotAndHumansFacePile", "", "modifier", "Landroidx/compose/ui/Modifier;", "botAvatar", "Lio/intercom/android/sdk/models/Avatar;", "teammateAvatarPair", "Lkotlin/Pair;", "botAvatarSize", "Landroidx/compose/ui/unit/Dp;", "botName", "", "BotAndHumansFacePile-hGBTI10", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/models/Avatar;Lkotlin/Pair;FLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "humanAvatarPairForHome", "humanAvatars", "", "BotWithTwoTeammatesPreview", "(Landroidx/compose/runtime/Composer;I)V", "BotsWithOneTeammatePreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BotAndHumansFacePileKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAndHumansFacePile_hGBTI10$lambda$11(Modifier modifier, Avatar botAvatar, Pair teammateAvatarPair, float f, String str, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(botAvatar, "$botAvatar");
        Intrinsics.checkNotNullParameter(teammateAvatarPair, "$teammateAvatarPair");
        m12028BotAndHumansFacePilehGBTI10(modifier, botAvatar, teammateAvatarPair, f, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotWithTwoTeammatesPreview$lambda$12(int i, Composer composer, int i2) {
        BotWithTwoTeammatesPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotsWithOneTeammatePreview$lambda$13(int i, Composer composer, int i2) {
        BotsWithOneTeammatePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: BotAndHumansFacePile-hGBTI10, reason: not valid java name */
    public static final void m12028BotAndHumansFacePilehGBTI10(Modifier modifier, final Avatar botAvatar, final Pair<? extends Avatar, ? extends Avatar> teammateAvatarPair, final float f, String str, Composer composer, final int i, final int i2) {
        float f2;
        Modifier modifier2;
        DefaultConstructorMarker defaultConstructorMarker;
        String str2;
        int i3;
        boolean z;
        Intrinsics.checkNotNullParameter(botAvatar, "botAvatar");
        Intrinsics.checkNotNullParameter(teammateAvatarPair, "teammateAvatarPair");
        Composer startRestartGroup = composer.startRestartGroup(957129373);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        String str3 = (i2 & 16) != 0 ? "" : str;
        final float m8798constructorimpl = Dp.m8798constructorimpl(((float) 0.75d) * f);
        final float m8798constructorimpl2 = Dp.m8798constructorimpl(((float) 0.25d) * m8798constructorimpl);
        Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(Dp.m8798constructorimpl(((float) 0.0625d) * f) - m8798constructorimpl2));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1016spacedBy0680j_4, centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
        Avatar first = teammateAvatarPair.getFirst();
        startRestartGroup.startReplaceGroup(1213840539);
        if (first == null) {
            str2 = str3;
            modifier2 = modifier3;
            f2 = m8798constructorimpl2;
            z = false;
            defaultConstructorMarker = null;
            i3 = 2;
        } else {
            AvatarWrapper avatarWrapper = new AvatarWrapper(first, false, 2, null);
            Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl);
            startRestartGroup.startReplaceGroup(1012545465);
            boolean changed = startRestartGroup.changed(m8798constructorimpl) | startRestartGroup.changed(m8798constructorimpl2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2;
                        BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2 = BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(m8798constructorimpl, m8798constructorimpl2, (ContentDrawScope) obj);
                        return BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            f2 = m8798constructorimpl2;
            modifier2 = modifier3;
            defaultConstructorMarker = null;
            str2 = str3;
            i3 = 2;
            z = false;
            AvatarIconKt.m12134AvatarIconRd90Nhg(DrawModifierKt.drawWithContent(m1209size3ABfNKs, (Function1) rememberedValue), avatarWrapper, null, false, 0L, null, startRestartGroup, 64, 60);
        }
        startRestartGroup.endReplaceGroup();
        AvatarIconKt.m12134AvatarIconRd90Nhg(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, f), new AvatarWrapper(botAvatar, true), null, false, 0L, null, startRestartGroup, 64, 60);
        Avatar second = teammateAvatarPair.getSecond();
        startRestartGroup.startReplaceGroup(1213869401);
        if (second != null) {
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(second, z, i3, defaultConstructorMarker);
            Modifier m1209size3ABfNKs2 = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl);
            startRestartGroup.startReplaceGroup(1012574327);
            final float f3 = f2;
            boolean changed2 = startRestartGroup.changed(f3) | startRestartGroup.changed(m8798constructorimpl);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7;
                        BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7 = BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(f3, m8798constructorimpl, (ContentDrawScope) obj);
                        return BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            AvatarIconKt.m12134AvatarIconRd90Nhg(DrawModifierKt.drawWithContent(m1209size3ABfNKs2, (Function1) rememberedValue2), avatarWrapper2, null, false, 0L, null, startRestartGroup, 64, 60);
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final String str4 = str2;
            final Modifier modifier4 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BotAndHumansFacePile_hGBTI10$lambda$11;
                    BotAndHumansFacePile_hGBTI10$lambda$11 = BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$11(Modifier.this, botAvatar, teammateAvatarPair, f, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BotAndHumansFacePile_hGBTI10$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(float f, float f2, ContentDrawScope drawWithContent) {
        DrawContext drawContext;
        long mo6539getSizeNHjbRc;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (drawWithContent.getLayoutDirection() == LayoutDirection.Ltr) {
            ContentDrawScope contentDrawScope = drawWithContent;
            float f3 = drawWithContent.mo744toPx0680j_4(Dp.m8798constructorimpl(f - f2));
            float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo6618getSizeNHjbRc() & 4294967295L));
            int m6028getIntersectrtfAjoo = ClipOp.INSTANCE.m6028getIntersectrtfAjoo();
            drawContext = contentDrawScope.getDrawContext();
            mo6539getSizeNHjbRc = drawContext.mo6539getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6542clipRectN_I0leg(0.0f, 0.0f, f3, intBitsToFloat, m6028getIntersectrtfAjoo);
                drawWithContent.drawContent();
                drawContext.getCanvas().restore();
                drawContext.mo6540setSizeuvyYCjk(mo6539getSizeNHjbRc);
            } finally {
            }
        } else {
            ContentDrawScope contentDrawScope2 = drawWithContent;
            float f4 = drawWithContent.mo744toPx0680j_4(f2);
            float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope2.mo6618getSizeNHjbRc() >> 32));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope2.mo6618getSizeNHjbRc() & 4294967295L));
            int m6028getIntersectrtfAjoo2 = ClipOp.INSTANCE.m6028getIntersectrtfAjoo();
            drawContext = contentDrawScope2.getDrawContext();
            mo6539getSizeNHjbRc = drawContext.mo6539getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6542clipRectN_I0leg(f4, 0.0f, intBitsToFloat2, intBitsToFloat3, m6028getIntersectrtfAjoo2);
                drawWithContent.drawContent();
            } finally {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(float f, float f2, ContentDrawScope drawWithContent) {
        DrawContext drawContext;
        long mo6539getSizeNHjbRc;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (drawWithContent.getLayoutDirection() == LayoutDirection.Ltr) {
            ContentDrawScope contentDrawScope = drawWithContent;
            float f3 = drawWithContent.mo744toPx0680j_4(f);
            float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo6618getSizeNHjbRc() >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo6618getSizeNHjbRc() & 4294967295L));
            int m6028getIntersectrtfAjoo = ClipOp.INSTANCE.m6028getIntersectrtfAjoo();
            drawContext = contentDrawScope.getDrawContext();
            mo6539getSizeNHjbRc = drawContext.mo6539getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6542clipRectN_I0leg(f3, 0.0f, intBitsToFloat, intBitsToFloat2, m6028getIntersectrtfAjoo);
                drawWithContent.drawContent();
                drawContext.getCanvas().restore();
                drawContext.mo6540setSizeuvyYCjk(mo6539getSizeNHjbRc);
            } finally {
            }
        } else {
            ContentDrawScope contentDrawScope2 = drawWithContent;
            float f4 = drawWithContent.mo744toPx0680j_4(Dp.m8798constructorimpl(f2 - f));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope2.mo6618getSizeNHjbRc() & 4294967295L));
            int m6028getIntersectrtfAjoo2 = ClipOp.INSTANCE.m6028getIntersectrtfAjoo();
            drawContext = contentDrawScope2.getDrawContext();
            mo6539getSizeNHjbRc = drawContext.mo6539getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6542clipRectN_I0leg(0.0f, 0.0f, f4, intBitsToFloat3, m6028getIntersectrtfAjoo2);
                drawWithContent.drawContent();
            } finally {
            }
        }
        return Unit.INSTANCE;
    }

    public static final Pair<Avatar, Avatar> humanAvatarPairForHome(List<? extends Avatar> humanAvatars) {
        Intrinsics.checkNotNullParameter(humanAvatars, "humanAvatars");
        int size = humanAvatars.size();
        if (size == 0) {
            return TuplesKt.to(null, null);
        }
        if (size == 1) {
            return new Pair<>(null, humanAvatars.get(0));
        }
        return new Pair<>(humanAvatars.get(0), humanAvatars.get(1));
    }

    @IntercomPreviews
    private static final void BotWithTwoTeammatesPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-366024049);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m12034getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BotWithTwoTeammatesPreview$lambda$12;
                    BotWithTwoTeammatesPreview$lambda$12 = BotAndHumansFacePileKt.BotWithTwoTeammatesPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BotWithTwoTeammatesPreview$lambda$12;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void BotsWithOneTeammatePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1130939763);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m12035getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BotsWithOneTeammatePreview$lambda$13;
                    BotsWithOneTeammatePreview$lambda$13 = BotAndHumansFacePileKt.BotsWithOneTeammatePreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BotsWithOneTeammatePreview$lambda$13;
                }
            });
        }
    }
}
