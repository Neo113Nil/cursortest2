package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.CutAvatarBoxShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarTriangleGroup.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"AvatarTriangleGroup", "", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "modifier", "Landroidx/compose/ui/Modifier;", "avatarShape", "Landroidx/compose/ui/graphics/Shape;", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/unit/Dp;", "AvatarTriangleGroup--jt2gSs", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/runtime/Composer;II)V", "SingleAvatarPreview", "(Landroidx/compose/runtime/Composer;I)V", "DoubleAvatarsPreview", "TripleAvatarsPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AvatarTriangleGroupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarTriangleGroup__jt2gSs$lambda$5(List avatars, Modifier modifier, Shape shape, float f, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        m12025AvatarTriangleGroupjt2gSs(avatars, modifier, shape, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DoubleAvatarsPreview$lambda$7(int i, Composer composer, int i2) {
        DoubleAvatarsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleAvatarPreview$lambda$6(int i, Composer composer, int i2) {
        SingleAvatarPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TripleAvatarsPreview$lambda$8(int i, Composer composer, int i2) {
        TripleAvatarsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: AvatarTriangleGroup--jt2gSs, reason: not valid java name */
    public static final void m12025AvatarTriangleGroupjt2gSs(final List<AvatarWrapper> avatars, Modifier modifier, Shape shape, float f, Composer composer, final int i, final int i2) {
        Shape shape2;
        int i3;
        Shape shape3;
        float f2;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Composer startRestartGroup = composer.startRestartGroup(-534156342);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 4) != 0) {
            shape2 = AvatarIconKt.getComposeShape(AvatarShape.CIRCLE);
            i3 = i & (-897);
        } else {
            shape2 = shape;
            i3 = i;
        }
        float m8798constructorimpl = (i2 & 8) != 0 ? Dp.m8798constructorimpl(32) : f;
        long sp = TextUnitKt.getSp(12);
        if (avatars.size() <= 1) {
            Modifier modifier3 = companion;
            shape3 = shape2;
            float f3 = m8798constructorimpl;
            startRestartGroup.startReplaceGroup(645459394);
            AvatarWrapper avatarWrapper = avatars.size() > 0 ? avatars.get(0) : AvatarWrapper.INSTANCE.getNULL();
            f2 = f3;
            modifier2 = modifier3;
            Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(modifier2, f2);
            AvatarShape shape4 = avatarWrapper.getAvatar().getShape();
            Intrinsics.checkNotNullExpressionValue(shape4, "getShape(...)");
            AvatarIconKt.m12134AvatarIconRd90Nhg(m1209size3ABfNKs, avatarWrapper, AvatarIconKt.getComposeShape(shape4), false, 0L, null, startRestartGroup, 64, 56);
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(643591148);
            float f4 = 2;
            float m8798constructorimpl2 = Dp.m8798constructorimpl(Dp.m8798constructorimpl(m8798constructorimpl / f4) + Dp.m8798constructorimpl(Dp.m8798constructorimpl(1) * f4));
            Modifier m1209size3ABfNKs2 = SizeKt.m1209size3ABfNKs(companion, m8798constructorimpl);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1209size3ABfNKs2);
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
            float f5 = m8798constructorimpl - m8798constructorimpl2;
            float f6 = m8798constructorimpl;
            Modifier modifier4 = companion;
            AvatarIconKt.m12134AvatarIconRd90Nhg(boxScopeInstance.align(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl2), Alignment.INSTANCE.getTopCenter()), avatars.size() > 0 ? avatars.get(0) : AvatarWrapper.INSTANCE.getNULL(), new CutAvatarBoxShape(shape2, Dp.m8798constructorimpl(f4), CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Dp.m8796boximpl(Dp.m8798constructorimpl(Dp.m8798constructorimpl(f5) / f4)), Dp.m8796boximpl(Dp.m8798constructorimpl(f5))), TuplesKt.to(Dp.m8796boximpl(Dp.m8798constructorimpl(-Dp.m8798constructorimpl(Dp.m8798constructorimpl(f5) / f4))), Dp.m8796boximpl(Dp.m8798constructorimpl(f5)))}), null), false, sp, null, startRestartGroup, 24640, 40);
            AvatarIconKt.m12134AvatarIconRd90Nhg(boxScopeInstance.align(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl2), Alignment.INSTANCE.getBottomStart()), 1 < avatars.size() ? avatars.get(1) : AvatarWrapper.INSTANCE.getNULL(), new CutAvatarBoxShape(shape2, Dp.m8798constructorimpl(f4), CollectionsKt.listOf(TuplesKt.to(Dp.m8796boximpl(Dp.m8798constructorimpl(f5)), Dp.m8796boximpl(Dp.m8798constructorimpl(0)))), null), false, sp, null, startRestartGroup, 24640, 40);
            Shape shape5 = shape2;
            AvatarIconKt.m12134AvatarIconRd90Nhg(boxScopeInstance.align(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl2), Alignment.INSTANCE.getBottomEnd()), 2 < avatars.size() ? avatars.get(2) : AvatarWrapper.INSTANCE.getNULL(), shape5, false, sp, null, startRestartGroup, (i3 & 896) | 24640, 40);
            shape3 = shape5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceGroup();
            f2 = f6;
            modifier2 = modifier4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Shape shape6 = shape3;
            final float f7 = f2;
            final Modifier modifier5 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.AvatarTriangleGroupKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarTriangleGroup__jt2gSs$lambda$5;
                    AvatarTriangleGroup__jt2gSs$lambda$5 = AvatarTriangleGroupKt.AvatarTriangleGroup__jt2gSs$lambda$5(avatars, modifier5, shape6, f7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarTriangleGroup__jt2gSs$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void SingleAvatarPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-932654159);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m12031getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.AvatarTriangleGroupKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleAvatarPreview$lambda$6;
                    SingleAvatarPreview$lambda$6 = AvatarTriangleGroupKt.SingleAvatarPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleAvatarPreview$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void DoubleAvatarsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2121947035);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m12032getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.AvatarTriangleGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DoubleAvatarsPreview$lambda$7;
                    DoubleAvatarsPreview$lambda$7 = AvatarTriangleGroupKt.DoubleAvatarsPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DoubleAvatarsPreview$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void TripleAvatarsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-724464974);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.m12033getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.AvatarTriangleGroupKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TripleAvatarsPreview$lambda$8;
                    TripleAvatarsPreview$lambda$8 = AvatarTriangleGroupKt.TripleAvatarsPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TripleAvatarsPreview$lambda$8;
                }
            });
        }
    }
}
