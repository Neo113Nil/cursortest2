package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainterKt;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import coil.transform.Transformation;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CircularAvatarComponent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"CircularAvatar", "", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/unit/Dp;", "CircularAvatar-aM-cp0Q", "(Lio/intercom/android/sdk/models/Avatar;JFLandroidx/compose/runtime/Composer;II)V", "PreviewDefaultAvatar", "(Landroidx/compose/runtime/Composer;I)V", "PreviewInitialAvatar", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CircularAvatarComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularAvatar_aM_cp0Q$lambda$6(Avatar avatar, long j, float f, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatar, "$avatar");
        m12690CircularAvataraMcp0Q(avatar, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewDefaultAvatar$lambda$7(int i, Composer composer, int i2) {
        PreviewDefaultAvatar(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewInitialAvatar$lambda$8(int i, Composer composer, int i2) {
        PreviewInitialAvatar(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* renamed from: CircularAvatar-aM-cp0Q, reason: not valid java name */
    public static final void m12690CircularAvataraMcp0Q(final Avatar avatar, final long j, float f, Composer composer, final int i, final int i2) {
        String str;
        char c;
        int i3;
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Composer startRestartGroup = composer.startRestartGroup(-276383091);
        float m8798constructorimpl = (i2 & 4) != 0 ? Dp.m8798constructorimpl(40) : f;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
        final String stringResource = StringResources_androidKt.stringResource(R.string.intercom_surveys_sender_image, startRestartGroup, 0);
        String initials = avatar.getInitials();
        Intrinsics.checkNotNullExpressionValue(initials, "getInitials(...)");
        if (initials.length() > 0) {
            startRestartGroup.startReplaceGroup(-2071598305);
            Modifier m582backgroundbw27NRU$default = BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl), RoundedCornerShapeKt.getCircleShape()), j, null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m582backgroundbw27NRU$default);
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
            Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            String initials2 = avatar.getInitials();
            Intrinsics.checkNotNullExpressionValue(initials2, "getInitials(...)");
            Modifier align = boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
            startRestartGroup.startReplaceGroup(592336280);
            boolean changed = startRestartGroup.changed(stringResource);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0;
                        CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0 = CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(stringResource, (SemanticsPropertyReceiver) obj);
                        return CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(align, false, (Function1) rememberedValue, 1, null);
            c = 0;
            str = stringResource;
            TextKt.m3901TextNvy7gAk(initials2, semantics$default, ColorExtensionsKt.m13180generateTextColor8_81llA(j), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 0, 0, 262136);
            startRestartGroup = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceGroup();
            i3 = 1;
        } else {
            str = stringResource;
            startRestartGroup.startReplaceGroup(-2071004283);
            Modifier m582backgroundbw27NRU$default2 = BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl), RoundedCornerShapeKt.getCircleShape()), j, null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m582backgroundbw27NRU$default2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
            }
            Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            c = 0;
            i3 = 1;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.intercom_default_avatar_icon, startRestartGroup, 0), str, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, ColorFilter.Companion.m6080tintxETnrds$default(ColorFilter.INSTANCE, ColorExtensionsKt.m13180generateTextColor8_81llA(j), 0, 2, null), startRestartGroup, 24584, 40);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceGroup();
        }
        startRestartGroup.startReplaceGroup(-1313708522);
        String imageUrl = avatar.getImageUrl();
        Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
        if (imageUrl.length() > 0) {
            String imageUrl2 = avatar.getImageUrl();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImageLoader imageLoader = IntercomImageLoaderKt.getImageLoader((Context) consume);
            startRestartGroup.startReplaceableGroup(1750824323);
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImageRequest.Builder data = new ImageRequest.Builder((Context) consume2).data(imageUrl2);
            data.crossfade((boolean) i3);
            Transformation[] transformationArr = new Transformation[i3];
            transformationArr[c] = new CircleCropTransformation();
            data.transformations(transformationArr);
            AsyncImagePainter m10076rememberAsyncImagePainter0YpotYA = AsyncImagePainterKt.m10076rememberAsyncImagePainter0YpotYA(data.build(), imageLoader, null, null, null, 0, null, startRestartGroup, 72, 124);
            startRestartGroup.endReplaceableGroup();
            ImageKt.Image(m10076rememberAsyncImagePainter0YpotYA, str, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final float f2 = m8798constructorimpl;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CircularAvatar_aM_cp0Q$lambda$6;
                    CircularAvatar_aM_cp0Q$lambda$6 = CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$6(Avatar.this, j, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CircularAvatar_aM_cp0Q$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(String contentDescription, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, contentDescription);
        return Unit.INSTANCE;
    }

    public static final void PreviewDefaultAvatar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1706634993);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Avatar create = Avatar.create("", "");
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            m12690CircularAvataraMcp0Q(create, Color.INSTANCE.m6077getYellow0d7_KjU(), 0.0f, startRestartGroup, 56, 4);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewDefaultAvatar$lambda$7;
                    PreviewDefaultAvatar$lambda$7 = CircularAvatarComponentKt.PreviewDefaultAvatar$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewDefaultAvatar$lambda$7;
                }
            });
        }
    }

    public static final void PreviewInitialAvatar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1788709612);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Avatar create = Avatar.create("", "PS");
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            m12690CircularAvataraMcp0Q(create, Color.INSTANCE.m6066getBlue0d7_KjU(), 0.0f, startRestartGroup, 56, 4);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewInitialAvatar$lambda$8;
                    PreviewInitialAvatar$lambda$8 = CircularAvatarComponentKt.PreviewInitialAvatar$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewInitialAvatar$lambda$8;
                }
            });
        }
    }
}
