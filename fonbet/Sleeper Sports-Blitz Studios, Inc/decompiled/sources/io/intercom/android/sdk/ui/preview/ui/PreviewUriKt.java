package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import coil.ImageLoader;
import coil.compose.AsyncImageKt;
import coil.request.ImageRequest;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreviewUri.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a)\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"PreviewUri", "", "modifier", "Landroidx/compose/ui/Modifier;", "file", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;Landroidx/compose/runtime/Composer;II)V", "ThumbnailPreview", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;Landroidx/compose/runtime/Composer;II)V", "VideoPlayer", "uri", "Landroid/net/Uri;", "(Landroidx/compose/ui/Modifier;Landroid/net/Uri;Landroidx/compose/runtime/Composer;II)V", "DocumentPreview", "showTitle", "", "(Landroidx/compose/ui/Modifier;Landroid/net/Uri;ZLandroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)V", "PdfPreview", "loadFilesAsBitmaps", "Landroidx/compose/runtime/State;", "", "Landroid/graphics/Bitmap;", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PreviewUriKt {

    /* compiled from: PreviewUri.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentPreview$lambda$11(Modifier modifier, Uri uri, boolean z, ContentScale contentScale, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        DocumentPreview(modifier, uri, z, contentScale, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfPreview$lambda$14(Modifier modifier, IntercomPreviewFile file, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(file, "$file");
        PdfPreview(modifier, file, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewUri$lambda$0(Modifier modifier, IntercomPreviewFile file, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(file, "$file");
        PreviewUri(modifier, file, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThumbnailPreview$lambda$2(Modifier modifier, ContentScale contentScale, IntercomPreviewFile file, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(file, "$file");
        ThumbnailPreview(modifier, contentScale, file, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer$lambda$10(Modifier modifier, Uri uri, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        VideoPlayer(modifier, uri, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PreviewUri(Modifier modifier, final IntercomPreviewFile file, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(file, "file");
        Composer startRestartGroup = composer.startRestartGroup(1385802164);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Uri uri = file.getUri();
        String mimeType = file.getMimeType((Context) consume);
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            startRestartGroup.startReplaceGroup(1931959814);
            ThumbnailPreview(modifier2, null, file, startRestartGroup, (i & 14) | 512, 2);
            startRestartGroup.endReplaceGroup();
        } else if (ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isAudio(mimeType)) {
            startRestartGroup.startReplaceGroup(1932086573);
            VideoPlayer(modifier2, uri, startRestartGroup, (i & 14) | 64, 0);
            startRestartGroup.endReplaceGroup();
        } else if (ContentTypeExtensionKt.isPdf(mimeType)) {
            startRestartGroup.startReplaceGroup(1932182828);
            PdfPreview(modifier2, file, startRestartGroup, (i & 14) | 64, 0);
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(1932268233);
            DocumentPreview(modifier2, uri, false, null, startRestartGroup, (i & 14) | 64, 12);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewUri$lambda$0;
                    PreviewUri$lambda$0 = PreviewUriKt.PreviewUri$lambda$0(Modifier.this, file, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewUri$lambda$0;
                }
            });
        }
    }

    public static final void ThumbnailPreview(Modifier modifier, ContentScale contentScale, final IntercomPreviewFile file, Composer composer, final int i, final int i2) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(file, "file");
        Composer startRestartGroup = composer.startRestartGroup(1221057551);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        ContentScale fit = (i2 & 2) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType) || ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isPdf(mimeType)) {
            startRestartGroup.startReplaceGroup(-1993113608);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            ImageLoader imageLoader = IntercomImageLoaderKt.getImageLoader(context);
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImageRequest.Builder data = new ImageRequest.Builder((Context) consume2).data(file.getUri());
            data.crossfade(true);
            composer2 = startRestartGroup;
            AsyncImageKt.m10070AsyncImageQgsmV_s(data.build(), "Image", imageLoader, fillMaxSize$default, null, null, null, fit, 0.0f, null, 0, false, null, composer2, ((i << 18) & 29360128) | 568, 0, 8048);
            composer2.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(-1992720435);
            DocumentPreview(modifier2, file.getUri(), false, fit, startRestartGroup, (i & 14) | 448 | ((i << 6) & 7168), 0);
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final ContentScale contentScale2 = fit;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ThumbnailPreview$lambda$2;
                    ThumbnailPreview$lambda$2 = PreviewUriKt.ThumbnailPreview$lambda$2(Modifier.this, contentScale2, file, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ThumbnailPreview$lambda$2;
                }
            });
        }
    }

    private static final void VideoPlayer(Modifier modifier, final Uri uri, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-1579699387);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(consume2, startRestartGroup, 8);
        MediaItem.Builder buildUpon = MediaItem.fromUri(uri).buildUpon();
        buildUpon.setMediaId(String.valueOf(uri.hashCode()));
        buildUpon.setTag(uri);
        MediaItem build = buildUpon.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        final ExoPlayer build2 = new ExoPlayer.Builder((Context) consume).build();
        build2.setMediaItem(build);
        build2.prepare();
        Intrinsics.checkNotNullExpressionValue(build2, "apply(...)");
        AndroidView_androidKt.AndroidView(new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PlayerView VideoPlayer$lambda$6;
                VideoPlayer$lambda$6 = PreviewUriKt.VideoPlayer$lambda$6(ExoPlayer.this, (Context) obj);
                return VideoPlayer$lambda$6;
            }
        }, modifier2, null, startRestartGroup, (i << 3) & 112, 4);
        EffectsKt.DisposableEffect("", (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult VideoPlayer$lambda$9;
                VideoPlayer$lambda$9 = PreviewUriKt.VideoPlayer$lambda$9(ExoPlayer.this, rememberUpdatedState, (DisposableEffectScope) obj);
                return VideoPlayer$lambda$9;
            }
        }, startRestartGroup, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VideoPlayer$lambda$10;
                    VideoPlayer$lambda$10 = PreviewUriKt.VideoPlayer$lambda$10(Modifier.this, uri, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return VideoPlayer$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView VideoPlayer$lambda$6(ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(it);
        playerView.setPlayer(exoPlayer);
        playerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult VideoPlayer$lambda$9(final ExoPlayer exoPlayer, State lifecycleOwner, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        exoPlayer.play();
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                PreviewUriKt.VideoPlayer$lambda$9$lambda$7(ExoPlayer.this, lifecycleOwner2, event);
            }
        };
        final Lifecycle lifecycle = ((LifecycleOwner) lifecycleOwner.getValue()).getLifecycle();
        lifecycle.addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Lifecycle.this.removeObserver(lifecycleEventObserver);
                exoPlayer.release();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoPlayer$lambda$9$lambda$7(ExoPlayer exoPlayer, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            exoPlayer.pause();
        }
    }

    private static final void DocumentPreview(final Modifier modifier, final Uri uri, boolean z, ContentScale contentScale, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1870066421);
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        final ContentScale fit = (i2 & 8) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1599096779, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$DocumentPreview$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                invoke(boxWithConstraintsScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i3) {
                int i4;
                String str;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) != 18 || !composer2.getSkipping()) {
                    float mo1045getMaxWidthD9Ej5fM = BoxWithConstraints.mo1045getMaxWidthD9Ej5fM();
                    Cursor query = context.getContentResolver().query(uri, null, null, null, null);
                    str = "";
                    if (query != null) {
                        Cursor cursor = query;
                        try {
                            Cursor cursor2 = cursor;
                            cursor2.moveToFirst();
                            str = cursor2.getColumnIndex("_display_name") != -1 ? cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name")) : "";
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(cursor, null);
                        } finally {
                        }
                    }
                    String str2 = str;
                    Modifier align = BoxWithConstraints.align(BackgroundKt.m582backgroundbw27NRU$default(SizeKt.m1211sizeVpY3zN4(Modifier.INSTANCE, mo1045getMaxWidthD9Ej5fM, Dp.m8798constructorimpl(1.414f * mo1045getMaxWidthD9Ej5fM)), IntercomTheme.INSTANCE.getColors(composer2, 6).m13094getBackground0d7_KjU(), null, 2, null), Alignment.INSTANCE.getCenter());
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ContentScale contentScale2 = fit;
                    boolean z3 = z2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, align);
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
                    Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_document, composer2, 0), "Doc Icon", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(Dp.m8797compareTo0680j_4(mo1045getMaxWidthD9Ej5fM, Dp.m8798constructorimpl((float) 48)) > 0 ? 56 : 24)), (Alignment) null, contentScale2, 0.0f, ColorFilter.Companion.m6080tintxETnrds$default(ColorFilter.INSTANCE, IntercomTheme.INSTANCE.getColors(composer2, 6).m13089getAction0d7_KjU(), 0, 2, null), composer2, 56, 40);
                    composer2.startReplaceGroup(-547888989);
                    if (z3) {
                        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), composer2, 6);
                        TextKt.m3901TextNvy7gAk(str2, null, IntercomTheme.INSTANCE.getColors(composer2, 6).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, 6).getType04Point5(), composer2, 0, 0, 131066);
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, 3072, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DocumentPreview$lambda$11;
                    DocumentPreview$lambda$11 = PreviewUriKt.DocumentPreview$lambda$11(Modifier.this, uri, z2, fit, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DocumentPreview$lambda$11;
                }
            });
        }
    }

    private static final void PdfPreview(Modifier modifier, final IntercomPreviewFile intercomPreviewFile, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(25606530);
        final Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final List<Bitmap> value = loadFilesAsBitmaps(intercomPreviewFile, startRestartGroup, 8).getValue();
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit PdfPreview$lambda$13;
                PdfPreview$lambda$13 = PreviewUriKt.PdfPreview$lambda$13(value, (LazyListScope) obj);
                return PdfPreview$lambda$13;
            }
        }, startRestartGroup, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PdfPreview$lambda$14;
                    PdfPreview$lambda$14 = PreviewUriKt.PdfPreview$lambda$14(Modifier.this, intercomPreviewFile, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PdfPreview$lambda$14;
                }
            });
        }
    }

    private static final State<List<Bitmap>> loadFilesAsBitmaps(IntercomPreviewFile intercomPreviewFile, Composer composer, int i) {
        composer.startReplaceGroup(-964565197);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        State<List<Bitmap>> produceState = SnapshotStateKt.produceState(CollectionsKt.emptyList(), intercomPreviewFile, new PreviewUriKt$loadFilesAsBitmaps$1(intercomPreviewFile, (Context) consume, null), composer, 582);
        composer.endReplaceGroup();
        return produceState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfPreview$lambda$13(final List bitmaps, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(bitmaps, "$bitmaps");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$1 previewUriKt$PdfPreview$lambda$13$$inlined$items$default$1 = new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Bitmap bitmap) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Bitmap) obj);
            }
        };
        LazyColumn.items(bitmaps.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(bitmaps.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                Bitmap bitmap = (Bitmap) bitmaps.get(i);
                composer.startReplaceGroup(-1436658847);
                ImageKt.m648Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "Pdf Preview", PaddingKt.m1161paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(8), 7, null), null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, composer, 25016, 232);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
