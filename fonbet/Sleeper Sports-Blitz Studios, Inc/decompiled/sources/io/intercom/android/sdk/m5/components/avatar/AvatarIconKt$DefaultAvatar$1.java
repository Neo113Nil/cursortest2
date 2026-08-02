package io.intercom.android.sdk.m5.components.avatar;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.SubcomposeAsyncImageKt;
import coil.compose.SubcomposeAsyncImageScope;
import io.intercom.android.sdk.m5.shapes.CutAvatarWithIndicatorShape;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarIcon.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class AvatarIconKt$DefaultAvatar$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ AvatarWrapper $avatarWrapper;
    final /* synthetic */ MutableState<Color> $backgroundColor$delegate;
    final /* synthetic */ Color $customBackgroundColor;
    final /* synthetic */ MutableState<Shape> $cutShape$delegate;
    final /* synthetic */ long $defaultBackgroundColor;
    final /* synthetic */ MutableState<Dp> $indicatorSize$delegate;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ long $placeHolderTextSize;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $shouldDrawBorder;
    final /* synthetic */ long $textColor;

    AvatarIconKt$DefaultAvatar$1(boolean z, Shape shape, boolean z2, MutableState<Dp> mutableState, MutableState<Shape> mutableState2, MutableState<Color> mutableState3, AvatarWrapper avatarWrapper, long j, Color color, long j2, long j3) {
        this.$isActive = z;
        this.$shape = shape;
        this.$shouldDrawBorder = z2;
        this.$indicatorSize$delegate = mutableState;
        this.$cutShape$delegate = mutableState2;
        this.$backgroundColor$delegate = mutableState3;
        this.$avatarWrapper = avatarWrapper;
        this.$defaultBackgroundColor = j;
        this.$customBackgroundColor = color;
        this.$textColor = j2;
        this.$placeHolderTextSize = j3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        long DefaultAvatar_Rd90Nhg$lambda$2;
        Shape DefaultAvatar_Rd90Nhg$lambda$8;
        Shape DefaultAvatar_Rd90Nhg$lambda$82;
        Shape DefaultAvatar_Rd90Nhg$lambda$83;
        float DefaultAvatar_Rd90Nhg$lambda$5;
        float DefaultAvatar_Rd90Nhg$lambda$52;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (this.$isActive) {
                AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$6(this.$indicatorSize$delegate, Dp.m8798constructorimpl(Dp.m8797compareTo0680j_4(BoxWithConstraints.mo1045getMaxWidthD9Ej5fM(), Dp.m8798constructorimpl((float) 36)) > 0 ? 16 : 8));
                MutableState<Shape> mutableState = this.$cutShape$delegate;
                Shape shape = this.$shape;
                DefaultAvatar_Rd90Nhg$lambda$52 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate);
                mutableState.setValue(new CutAvatarWithIndicatorShape(shape, DefaultAvatar_Rd90Nhg$lambda$52, null));
            } else {
                this.$cutShape$delegate.setValue(this.$shape);
            }
            Modifier matchParentSize = BoxWithConstraints.matchParentSize(Modifier.INSTANCE);
            DefaultAvatar_Rd90Nhg$lambda$2 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(this.$backgroundColor$delegate);
            DefaultAvatar_Rd90Nhg$lambda$8 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate);
            Modifier m581backgroundbw27NRU = BackgroundKt.m581backgroundbw27NRU(matchParentSize, DefaultAvatar_Rd90Nhg$lambda$2, DefaultAvatar_Rd90Nhg$lambda$8);
            boolean z = this.$shouldDrawBorder;
            DefaultAvatar_Rd90Nhg$lambda$82 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate);
            Modifier avatarBorder = AvatarIconKt.avatarBorder(m581backgroundbw27NRU, z, DefaultAvatar_Rd90Nhg$lambda$82);
            DefaultAvatar_Rd90Nhg$lambda$83 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate);
            Modifier clip = ClipKt.clip(avatarBorder, DefaultAvatar_Rd90Nhg$lambda$83);
            final AvatarWrapper avatarWrapper = this.$avatarWrapper;
            final long j = this.$defaultBackgroundColor;
            final Color color = this.$customBackgroundColor;
            final long j2 = this.$textColor;
            final long j3 = this.$placeHolderTextSize;
            final MutableState<Color> mutableState2 = this.$backgroundColor$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, clip);
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
            String imageUrl = avatarWrapper.getImageUrl(composer, 8);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0.0f, 1, null);
            String label = avatarWrapper.getLabel();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ImageLoader imageLoader = IntercomImageLoaderKt.getImageLoader((Context) consume);
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1513639009, true, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, AsyncImagePainter.State.Loading loading, Composer composer2, Integer num) {
                    invoke(subcomposeAsyncImageScope, loading, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SubcomposeAsyncImageScope SubcomposeAsyncImage, AsyncImagePainter.State.Loading it, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i3 & 14) == 0) {
                        i3 |= composer2.changed(SubcomposeAsyncImage) ? 4 : 2;
                    }
                    if ((i3 & 651) != 130 || !composer2.getSkipping()) {
                        AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(AvatarWrapper.this, j2, j3, SubcomposeAsyncImage.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), composer2, 0, 0);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composer, 54);
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(427755177, true, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, AsyncImagePainter.State.Error error, Composer composer2, Integer num) {
                    invoke(subcomposeAsyncImageScope, error, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SubcomposeAsyncImageScope SubcomposeAsyncImage, AsyncImagePainter.State.Error it, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i3 & 14) == 0) {
                        i3 |= composer2.changed(SubcomposeAsyncImage) ? 4 : 2;
                    }
                    if ((i3 & 651) != 130 || !composer2.getSkipping()) {
                        AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(AvatarWrapper.this, j2, j3, SubcomposeAsyncImage.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), composer2, 0, 0);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composer, 54);
            composer.startReplaceGroup(1981535699);
            boolean changed = composer.changed(j);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$6$lambda$1$lambda$0;
                        invoke$lambda$6$lambda$1$lambda$0 = AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$1$lambda$0(j, mutableState2, (AsyncImagePainter.State.Loading) obj);
                        return invoke$lambda$6$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1981548379);
            boolean changed2 = composer.changed(color) | composer.changed(j);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$6$lambda$3$lambda$2;
                        invoke$lambda$6$lambda$3$lambda$2 = AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$3$lambda$2(Color.this, j, mutableState2, (AsyncImagePainter.State.Success) obj);
                        return invoke$lambda$6$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1981542035);
            boolean changed3 = composer.changed(j);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$6$lambda$5$lambda$4;
                        invoke$lambda$6$lambda$5$lambda$4 = AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$5$lambda$4(j, mutableState2, (AsyncImagePainter.State.Error) obj);
                        return invoke$lambda$6$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            SubcomposeAsyncImageKt.m10115SubcomposeAsyncImageTCQMD7g(imageUrl, label, imageLoader, fillMaxSize$default, null, rememberComposableLambda, null, rememberComposableLambda2, function1, function12, (Function1) rememberedValue3, null, crop, 0.0f, null, 0, false, null, composer, 12780032, 384, 256080);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (this.$isActive) {
                Modifier.Companion companion = Modifier.INSTANCE;
                DefaultAvatar_Rd90Nhg$lambda$5 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate);
                AvatarIconKt.AvatarActiveIndicator(BoxWithConstraints.align(SizeKt.m1209size3ABfNKs(companion, DefaultAvatar_Rd90Nhg$lambda$5), Alignment.INSTANCE.getBottomEnd()), composer, 0, 0);
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(long j, MutableState backgroundColor$delegate, AsyncImagePainter.State.Loading it) {
        long DefaultAvatar_Rd90Nhg$lambda$2;
        Intrinsics.checkNotNullParameter(backgroundColor$delegate, "$backgroundColor$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        DefaultAvatar_Rd90Nhg$lambda$2 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(backgroundColor$delegate);
        if (Color.m6040equalsimpl0(DefaultAvatar_Rd90Nhg$lambda$2, Color.INSTANCE.m6074getTransparent0d7_KjU())) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(long j, MutableState backgroundColor$delegate, AsyncImagePainter.State.Error it) {
        long DefaultAvatar_Rd90Nhg$lambda$2;
        Intrinsics.checkNotNullParameter(backgroundColor$delegate, "$backgroundColor$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        DefaultAvatar_Rd90Nhg$lambda$2 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(backgroundColor$delegate);
        if (Color.m6040equalsimpl0(DefaultAvatar_Rd90Nhg$lambda$2, Color.INSTANCE.m6074getTransparent0d7_KjU())) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(Color color, long j, MutableState backgroundColor$delegate, AsyncImagePainter.State.Success it) {
        Intrinsics.checkNotNullParameter(backgroundColor$delegate, "$backgroundColor$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, color != null ? color.m6049unboximpl() : ColorExtensionsKt.m13179darken8_81llA(j));
        return Unit.INSTANCE;
    }
}
