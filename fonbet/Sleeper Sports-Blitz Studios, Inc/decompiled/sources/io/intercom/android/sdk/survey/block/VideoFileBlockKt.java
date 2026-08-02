package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.util.Patterns;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorMatrix;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainterKt;
import coil.request.ImageRequest;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.socure.imgcodecs.Imgcodecs;

/* compiled from: VideoFileBlock.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"VideoFileBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "videoUrl", "", "thumbnailUrl", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "isRemoteUrl", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VideoFileBlockKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoFileBlock$lambda$3(Modifier modifier, String videoUrl, String str, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(videoUrl, "$videoUrl");
        VideoFileBlock(modifier, videoUrl, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void VideoFileBlock(Modifier modifier, final String videoUrl, final String str, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Composer startRestartGroup = composer.startRestartGroup(-224511788);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(videoUrl) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            String str2 = str;
            ImageRequest.Builder data = new ImageRequest.Builder(context).data((str2 == null || str2.length() == 0) ? videoUrl : str);
            data.crossfade(true);
            data.error(R.drawable.intercom_image_load_failed);
            AsyncImagePainter m10076rememberAsyncImagePainter0YpotYA = AsyncImagePainterKt.m10076rememberAsyncImagePainter0YpotYA(data.build(), IntercomImageLoaderKt.getImageLoader(context), null, null, null, 0, null, startRestartGroup, 72, 124);
            Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(modifier3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.VideoFileBlockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit VideoFileBlock$lambda$1;
                    VideoFileBlock$lambda$1 = VideoFileBlockKt.VideoFileBlock$lambda$1(videoUrl, context);
                    return VideoFileBlock$lambda$1;
                }
            }, 15, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m623clickableoSLSa3U$default);
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
            float[] m6096constructorimpl$default = ColorMatrix.m6096constructorimpl$default(null, 1, null);
            ColorMatrix.m6110setToSaturationimpl(m6096constructorimpl$default, 0.0f);
            ImageKt.Image(m10076rememberAsyncImagePainter0YpotYA, "Video Thumbnail", boxScopeInstance.align(BackgroundKt.m582backgroundbw27NRU$default(SizeKt.m1211sizeVpY3zN4(Modifier.INSTANCE, Dp.m8798constructorimpl(Imgcodecs.IMWRITE_JPEGXL_QUALITY), Dp.m8798constructorimpl(180)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13097getBubbleBackground0d7_KjU(), null, 2, null), Alignment.INSTANCE.getCenter()), Alignment.INSTANCE.getCenter(), ContentScale.INSTANCE.getCrop(), 0.0f, isRemoteUrl(videoUrl) ? null : ColorFilter.INSTANCE.m6081colorMatrixjHGOpc(m6096constructorimpl$default), startRestartGroup, 27696, 32);
            if (isRemoteUrl(videoUrl)) {
                startRestartGroup.startReplaceGroup(1592327165);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.intercom_play_arrow, startRestartGroup, 0), "Play Video", BackgroundKt.m581backgroundbw27NRU(SizeKt.m1209size3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m8798constructorimpl(48)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)), (Alignment) null, ContentScale.INSTANCE.getNone(), 0.0f, ColorFilter.Companion.m6080tintxETnrds$default(ColorFilter.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), 0, 2, null), startRestartGroup, 24632, 40);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1592846880);
                ProgressIndicatorKt.m3476CircularProgressIndicator4lLiAd8(SizeKt.m1209size3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m8798constructorimpl(32)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), 0.0f, 0L, 0, 0.0f, startRestartGroup, 0, 60);
                startRestartGroup = startRestartGroup;
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.VideoFileBlockKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VideoFileBlock$lambda$3;
                    VideoFileBlock$lambda$3 = VideoFileBlockKt.VideoFileBlock$lambda$3(Modifier.this, videoUrl, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return VideoFileBlock$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoFileBlock$lambda$1(String videoUrl, Context context) {
        Intrinsics.checkNotNullParameter(videoUrl, "$videoUrl");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (isRemoteUrl(videoUrl)) {
            LinkOpener.handleUrl(videoUrl, context, Injector.get().getApi());
        }
        return Unit.INSTANCE;
    }

    private static final boolean isRemoteUrl(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }
}
