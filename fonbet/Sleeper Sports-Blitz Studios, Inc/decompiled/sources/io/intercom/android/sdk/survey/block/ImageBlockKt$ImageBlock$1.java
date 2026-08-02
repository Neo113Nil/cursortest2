package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorMatrix;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import coil.ImageLoader;
import coil.compose.AsyncImageKt;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import com.google.accompanist.placeholder.PlaceholderHighlight;
import com.google.accompanist.placeholder.PlaceholderHighlightKt;
import com.google.accompanist.placeholder.PlaceholderKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ImageBlock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ImageBlockKt$ImageBlock$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ Block $block;
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Uri $dataUri;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Block, Unit> $onClick;
    final /* synthetic */ ImageRenderType $renderType;
    final /* synthetic */ MutableState<AsyncImagePainter.State> $state$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    ImageBlockKt$ImageBlock$1(Block block, ImageRenderType imageRenderType, String str, Uri uri, Modifier modifier, MutableState<AsyncImagePainter.State> mutableState, Function1<? super Block, Unit> function1) {
        this.$block = block;
        this.$renderType = imageRenderType;
        this.$cacheKey = str;
        this.$dataUri = uri;
        this.$modifier = modifier;
        this.$state$delegate = mutableState;
        this.$onClick = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        float m8798constructorimpl;
        Pair pair;
        AsyncImagePainter.State ImageBlock$lambda$1;
        boolean z;
        boolean hasUri;
        Object rememberedValue;
        AsyncImagePainter.State ImageBlock$lambda$12;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            boolean z2 = this.$block.getHeight() > 0 && this.$block.getWidth() > 0;
            if (this.$renderType == ImageRenderType.WITH_MAX_SIZE && z2) {
                float mo744toPx0680j_4 = density.mo744toPx0680j_4(Dp.m8798constructorimpl(268));
                if (this.$block.getWidth() > this.$block.getHeight()) {
                    pair = TuplesKt.to(Dp.m8796boximpl(density.mo740toDpu2uoSUM(mo744toPx0680j_4)), Dp.m8796boximpl(density.mo740toDpu2uoSUM(mo744toPx0680j_4 * ((this.$block.getHeight() * 1.0f) / this.$block.getWidth()))));
                } else {
                    pair = TuplesKt.to(Dp.m8796boximpl(density.mo740toDpu2uoSUM(((this.$block.getWidth() * 1.0f) / this.$block.getHeight()) * mo744toPx0680j_4)), Dp.m8796boximpl(density.mo740toDpu2uoSUM(mo744toPx0680j_4)));
                }
            } else if (this.$renderType == ImageRenderType.WITH_MAX_SIZE) {
                float f = 268;
                pair = TuplesKt.to(Dp.m8796boximpl(Dp.m8798constructorimpl(f)), Dp.m8796boximpl(Dp.m8798constructorimpl(f)));
            } else {
                float mo1045getMaxWidthD9Ej5fM = BoxWithConstraints.mo1045getMaxWidthD9Ej5fM();
                if (this.$renderType == ImageRenderType.FULL) {
                    m8798constructorimpl = BoxWithConstraints.mo1044getMaxHeightD9Ej5fM();
                } else {
                    m8798constructorimpl = Dp.m8798constructorimpl(1.5f * mo1045getMaxWidthD9Ej5fM);
                }
                if (this.$block.getHeight() > 0) {
                    Block block = this.$block;
                    m8798constructorimpl = Dp.m8798constructorimpl(RangesKt.coerceAtMost(density.mo741toDpu2uoSUM(ImageUtils.getAspectHeight((int) density.mo744toPx0680j_4(mo1045getMaxWidthD9Ej5fM), ImageUtils.getAspectRatio(block.getWidth(), block.getHeight()))), m8798constructorimpl));
                }
                pair = TuplesKt.to(Dp.m8796boximpl(mo1045getMaxWidthD9Ej5fM), Dp.m8796boximpl(m8798constructorimpl));
            }
            final float m8812unboximpl = ((Dp) pair.component1()).m8812unboximpl();
            final float m8812unboximpl2 = ((Dp) pair.component2()).m8812unboximpl();
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composer);
            final View view = (View) consume2;
            float[] m6096constructorimpl$default = ColorMatrix.m6096constructorimpl$default(null, 1, null);
            ColorMatrix.m6110setToSaturationimpl(m6096constructorimpl$default, 0.0f);
            final String stringResource = StringResources_androidKt.stringResource(R.string.intercom_permission_denied, composer, 0);
            final String stringResource2 = StringResources_androidKt.stringResource(R.string.intercom_file_saved, composer, 0);
            final String stringResource3 = StringResources_androidKt.stringResource(R.string.intercom_saving, composer, 0);
            final String stringResource4 = StringResources_androidKt.stringResource(R.string.intercom_something_went_wrong_try_again, composer, 0);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ImageRequest build = new ImageRequest.Builder((Context) consume3).memoryCacheKey(this.$cacheKey).diskCacheKey(this.$cacheKey).data(this.$dataUri).size((int) density.mo744toPx0680j_4(m8812unboximpl), (int) density.mo744toPx0680j_4(m8812unboximpl2)).crossfade(true).error(R.drawable.intercom_image_load_failed).build();
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume4 = composer.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ImageLoader imageLoader = IntercomImageLoaderKt.getImageLoader((Context) consume4);
            composer.startReplaceGroup(1738641811);
            String text = this.$block.getText();
            if (StringsKt.isBlank(text)) {
                text = StringResources_androidKt.stringResource(R.string.intercom_image_attached, composer, 0);
            }
            String str = text;
            composer.endReplaceGroup();
            Modifier modifier = this.$modifier;
            boolean z3 = this.$renderType == ImageRenderType.WITH_MAX_SIZE && !z2;
            composer.startReplaceGroup(1738649296);
            boolean changed = composer.changed(m8812unboximpl) | composer.changed(m8812unboximpl2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.survey.block.ImageBlockKt$ImageBlock$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Modifier invoke$lambda$8$lambda$7;
                        invoke$lambda$8$lambda$7 = ImageBlockKt$ImageBlock$1.invoke$lambda$8$lambda$7(m8812unboximpl, m8812unboximpl2, (Modifier) obj);
                        return invoke$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier ifTrue = ModifierExtensionsKt.ifTrue(modifier, z3, (Function1) rememberedValue2);
            boolean z4 = this.$renderType != ImageRenderType.WITH_MAX_SIZE || z2;
            composer.startReplaceGroup(1738655368);
            boolean changed2 = composer.changed(m8812unboximpl) | composer.changed(m8812unboximpl2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.survey.block.ImageBlockKt$ImageBlock$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Modifier invoke$lambda$10$lambda$9;
                        invoke$lambda$10$lambda$9 = ImageBlockKt$ImageBlock$1.invoke$lambda$10$lambda$9(m8812unboximpl, m8812unboximpl2, (Modifier) obj);
                        return invoke$lambda$10$lambda$9;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier m582backgroundbw27NRU$default = BackgroundKt.m582backgroundbw27NRU$default(ModifierExtensionsKt.ifTrue(ifTrue, z4, (Function1) rememberedValue3), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13097getBubbleBackground0d7_KjU(), null, 2, null);
            ImageBlock$lambda$1 = ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate);
            if (!(ImageBlock$lambda$1 instanceof AsyncImagePainter.State.Empty)) {
                ImageBlock$lambda$12 = ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate);
                if (!(ImageBlock$lambda$12 instanceof AsyncImagePainter.State.Loading)) {
                    z = false;
                    Modifier focusable$default = FocusableKt.focusable$default(PlaceholderKt.m11064placeholdercf5BqRc$default(m582backgroundbw27NRU$default, z, ColorKt.Color(869059788), null, PlaceholderHighlightKt.m11060shimmerRPmYEkk$default(PlaceholderHighlight.INSTANCE, ColorKt.Color(2499805183L), null, 0.0f, 6, null), null, null, 52, null), false, null, 3, null);
                    final Function1<Block, Unit> function1 = this.$onClick;
                    final Block block2 = this.$block;
                    Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(focusable$default, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.ImageBlockKt$ImageBlock$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$12;
                            invoke$lambda$12 = ImageBlockKt$ImageBlock$1.invoke$lambda$12(Function1.this, block2, view, stringResource3, stringResource2, stringResource4, stringResource);
                            return invoke$lambda$12;
                        }
                    }, 15, null);
                    ContentScale crop = this.$renderType != ImageRenderType.CROPPED ? ContentScale.INSTANCE.getCrop() : ContentScale.INSTANCE.getFit();
                    hasUri = ImageBlockKt.getHasUri(this.$block);
                    ColorFilter m6081colorMatrixjHGOpc = hasUri ? ColorFilter.INSTANCE.m6081colorMatrixjHGOpc(m6096constructorimpl$default) : null;
                    composer.startReplaceGroup(1738644608);
                    final MutableState<AsyncImagePainter.State> mutableState = this.$state$delegate;
                    rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.block.ImageBlockKt$ImageBlock$1$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit invoke$lambda$14$lambda$13;
                                invoke$lambda$14$lambda$13 = ImageBlockKt$ImageBlock$1.invoke$lambda$14$lambda$13(MutableState.this, (AsyncImagePainter.State) obj);
                                return invoke$lambda$14$lambda$13;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    AsyncImageKt.m10070AsyncImageQgsmV_s(build, str, imageLoader, m623clickableoSLSa3U$default, null, (Function1) rememberedValue, null, crop, 0.0f, m6081colorMatrixjHGOpc, 0, false, null, composer, 197128, 0, 7504);
                    return;
                }
            }
            z = true;
            Modifier focusable$default2 = FocusableKt.focusable$default(PlaceholderKt.m11064placeholdercf5BqRc$default(m582backgroundbw27NRU$default, z, ColorKt.Color(869059788), null, PlaceholderHighlightKt.m11060shimmerRPmYEkk$default(PlaceholderHighlight.INSTANCE, ColorKt.Color(2499805183L), null, 0.0f, 6, null), null, null, 52, null), false, null, 3, null);
            final Function1 function12 = this.$onClick;
            final Block block22 = this.$block;
            Modifier m623clickableoSLSa3U$default2 = ClickableKt.m623clickableoSLSa3U$default(focusable$default2, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.ImageBlockKt$ImageBlock$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12;
                    invoke$lambda$12 = ImageBlockKt$ImageBlock$1.invoke$lambda$12(Function1.this, block22, view, stringResource3, stringResource2, stringResource4, stringResource);
                    return invoke$lambda$12;
                }
            }, 15, null);
            ContentScale crop2 = this.$renderType != ImageRenderType.CROPPED ? ContentScale.INSTANCE.getCrop() : ContentScale.INSTANCE.getFit();
            hasUri = ImageBlockKt.getHasUri(this.$block);
            ColorFilter m6081colorMatrixjHGOpc2 = hasUri ? ColorFilter.INSTANCE.m6081colorMatrixjHGOpc(m6096constructorimpl$default) : null;
            composer.startReplaceGroup(1738644608);
            final MutableState mutableState2 = this.$state$delegate;
            rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composer.endReplaceGroup();
            AsyncImageKt.m10070AsyncImageQgsmV_s(build, str, imageLoader, m623clickableoSLSa3U$default2, null, (Function1) rememberedValue, null, crop2, 0.0f, m6081colorMatrixjHGOpc2, 0, false, null, composer, 197128, 0, 7504);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(MutableState state$delegate, AsyncImagePainter.State it) {
        Intrinsics.checkNotNullParameter(state$delegate, "$state$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        state$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier invoke$lambda$8$lambda$7(float f, float f2, Modifier ifTrue) {
        Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
        return SizeKt.m1213sizeInqDBjuR0$default(ifTrue, 0.0f, 0.0f, f, f2, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier invoke$lambda$10$lambda$9(float f, float f2, Modifier ifTrue) {
        Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
        return SizeKt.m1211sizeVpY3zN4(ifTrue, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12(Function1 function1, Block block, View currentView, String fileSavingText, String fileSavedText, String saveFailedText, String permissionDeniedText) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(currentView, "$currentView");
        Intrinsics.checkNotNullParameter(fileSavingText, "$fileSavingText");
        Intrinsics.checkNotNullParameter(fileSavedText, "$fileSavedText");
        Intrinsics.checkNotNullParameter(saveFailedText, "$saveFailedText");
        Intrinsics.checkNotNullParameter(permissionDeniedText, "$permissionDeniedText");
        if (function1 != null) {
            function1.invoke(block);
        } else {
            String linkUrl = block.getLinkUrl();
            Intrinsics.checkNotNullExpressionValue(linkUrl, "getLinkUrl(...)");
            if (linkUrl.length() > 0) {
                LinkOpener.handleUrl(block.getLinkUrl(), currentView.getContext(), Injector.get().getApi());
            } else {
                Context context = currentView.getContext();
                IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.INSTANCE;
                Intrinsics.checkNotNull(context);
                String url = block.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                List listOf = CollectionsKt.listOf(new IntercomPreviewFile.NetworkFile(url, "image/*"));
                String url2 = block.getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(listOf, null, null, false, new DownloadState(url2.length() > 0, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText), 14, null)));
            }
        }
        return Unit.INSTANCE;
    }
}
