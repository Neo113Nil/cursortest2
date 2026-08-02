package com.facebook.react.views.image;

import B7.g;
import C7.EnumC1050n;
import H7.m;
import W6.b;
import W6.d;
import W6.f;
import Z6.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c7.AbstractC2894d;
import com.facebook.drawee.drawable.RunnableC3011b;
import com.facebook.drawee.drawable.r;
import com.facebook.imagepipeline.request.b;
import com.facebook.imagepipeline.request.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.fresco.ImageCacheControl;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.image.ImageLoadEvent;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import i3.C4527h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z7.AbstractC6940d;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0093\u0001\u0092\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b'\u0010\u0018J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020,¢\u0006\u0004\b1\u0010/J\u0015\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020,¢\u0006\u0004\b3\u0010/J\u0015\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020(¢\u0006\u0004\b5\u0010+J\u0015\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020(¢\u0006\u0004\b7\u0010+J\u001d\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020(2\u0006\u00108\u001a\u00020,¢\u0006\u0004\b7\u00109J\u0015\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00162\u0006\u0010F\u001a\u00020(¢\u0006\u0004\bG\u0010+J\u0017\u0010J\u001a\u00020\u00162\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00162\b\u0010L\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bM\u0010#J\u0017\u0010N\u001a\u00020\u00162\b\u0010L\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bN\u0010#J\u0015\u0010P\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u0014¢\u0006\u0004\bP\u0010\u0018J\u0015\u0010R\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020,¢\u0006\u0004\bR\u0010/J\u0017\u0010U\u001a\u00020\u00162\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0014H\u0016¢\u0006\u0004\bW\u0010\u001aJ\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020\u0016¢\u0006\u0004\b\\\u0010\u001cJ\u001f\u0010`\u001a\u00020\u00162\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]H\u0007¢\u0006\u0004\b`\u0010aJ/\u0010f\u001a\u00020\u00162\u0006\u0010b\u001a\u00020,2\u0006\u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020,2\u0006\u0010e\u001a\u00020,H\u0014¢\u0006\u0004\bf\u0010gR$\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010jR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001d0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010lR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010mR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u0016\u00102\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010wR\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010xR\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010yR\u0016\u0010z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001c\u0010}\u001a\b\u0018\u00010|R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\"\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020^\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010wR\u0018\u0010\u0088\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010{R\u0019\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u008c\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u001aR\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView;", "Lc7/d;", "Landroid/content/Context;", "context", "LW6/b;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "globalImageLoadListener", "", "callerContext", "<init>", "(Landroid/content/Context;LW6/b;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V", "", "cacheControl", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "computeCacheControl", "(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;", "Lcom/facebook/imagepipeline/request/b$c;", "computeRequestLevel", "(Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/imagepipeline/request/b$c;", "", "doResize", "", "maybeUpdateViewFromRequest", "(Z)V", "hasMultipleSources", "()Z", "setSourceImage", "()V", "Lcom/facebook/react/views/imagehelper/ImageSource;", "imageSource", "shouldResize", "(Lcom/facebook/react/views/imagehelper/ImageSource;)Z", "uri", "warnImageSource", "(Ljava/lang/String;)V", "updateCallerContext", "(Ljava/lang/Object;)V", "shouldNotify", "setShouldNotifyLoadEvents", "", "blurRadius", "setBlurRadius", "(F)V", "", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "(I)V", ViewProps.BORDER_COLOR, "setBorderColor", "overlayColor", "setOverlayColor", ViewProps.BORDER_WIDTH, "setBorderWidth", ViewProps.BORDER_RADIUS, "setBorderRadius", ViewProps.POSITION, "(FI)V", "Lcom/facebook/drawee/drawable/r;", "scaleType", "setScaleType", "(Lcom/facebook/drawee/drawable/r;)V", "Landroid/graphics/Shader$TileMode;", "tileMode", "setTileMode", "(Landroid/graphics/Shader$TileMode;)V", "Lcom/facebook/react/views/image/ImageResizeMethod;", ViewProps.RESIZE_METHOD, "setResizeMethod", "(Lcom/facebook/react/views/image/ImageResizeMethod;)V", "multiplier", "setResizeMultiplier", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSource", "(Lcom/facebook/react/bridge/ReadableArray;)V", "name", "setDefaultSource", "setLoadingIndicatorSource", ViewProps.ENABLED, "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)V", "hasOverlappingRendering", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "maybeUpdateView", "LW6/d;", "LH7/m;", "controllerListener", "setControllerListener", "(LW6/d;)V", "w", C4527h.f48087o, "oldw", "oldh", "onSizeChanged", "(IIII)V", "LW6/b;", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "Ljava/lang/Object;", "", "Ljava/util/List;", "Lcom/facebook/react/views/imagehelper/ImageSource;", "getImageSource$ReactAndroid_release", "()Lcom/facebook/react/views/imagehelper/ImageSource;", "setImageSource$ReactAndroid_release", "(Lcom/facebook/react/views/imagehelper/ImageSource;)V", "cachedImageSource", "Landroid/graphics/drawable/Drawable;", "defaultImageDrawable", "Landroid/graphics/drawable/Drawable;", "loadingImageDrawable", "I", "Lcom/facebook/drawee/drawable/r;", "Landroid/graphics/Shader$TileMode;", "isDirty", "Z", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "tilePostprocessor", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "LM7/a;", "iterativeBoxBlurPostProcessor", "LM7/a;", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "downloadListener", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "controllerForTesting", "LW6/d;", "fadeDurationMs", "progressiveRenderingEnabled", "Lcom/facebook/react/bridge/ReadableMap;", "resizeMultiplier", "F", "Lcom/facebook/react/views/image/ImageResizeMethod;", "isTiled", "LB7/g;", "getResizeOptions", "()LB7/g;", "resizeOptions", "Companion", "TilePostprocessor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
/* loaded from: classes2.dex */
public final class ReactImageView extends AbstractC2894d {
    public static final int REMOTE_IMAGE_FADE_DURATION_MS = 300;

    @Nullable
    private ImageSource cachedImageSource;

    @Nullable
    private Object callerContext;

    @Nullable
    private d controllerForTesting;

    @Nullable
    private Drawable defaultImageDrawable;

    @Nullable
    private ReactImageDownloadListener<m> downloadListener;

    @NotNull
    private final b draweeControllerBuilder;
    private int fadeDurationMs;

    @Nullable
    private final GlobalImageLoadListener globalImageLoadListener;

    @Nullable
    private ReadableMap headers;

    @Nullable
    private ImageSource imageSource;
    private boolean isDirty;

    @Nullable
    private M7.a iterativeBoxBlurPostProcessor;

    @Nullable
    private Drawable loadingImageDrawable;
    private int overlayColor;
    private boolean progressiveRenderingEnabled;

    @NotNull
    private ImageResizeMethod resizeMethod;
    private float resizeMultiplier;

    @NotNull
    private r scaleType;

    @NotNull
    private final List<ImageSource> sources;

    @NotNull
    private Shader.TileMode tileMode;

    @Nullable
    private TilePostprocessor tilePostprocessor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Matrix tileMatrix = new Matrix();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LZ6/a;", "buildHierarchy", "(Landroid/content/Context;)LZ6/a;", "", "REMOTE_IMAGE_FADE_DURATION_MS", "I", "Landroid/graphics/Matrix;", "tileMatrix", "Landroid/graphics/Matrix;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Z6.a buildHierarchy(Context context) {
            Z6.b bVar = new Z6.b(context.getResources());
            e a10 = e.a(0.0f);
            a10.s(true);
            Z6.a a11 = bVar.J(a10).a();
            Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
            return a11;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "Lcom/facebook/imagepipeline/request/a;", "<init>", "(Lcom/facebook/react/views/image/ReactImageView;)V", "Landroid/graphics/Bitmap;", "source", "Lz7/d;", "bitmapFactory", "LH6/a;", "process", "(Landroid/graphics/Bitmap;Lz7/d;)LH6/a;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TilePostprocessor extends com.facebook.imagepipeline.request.a {
        public TilePostprocessor() {
        }

        @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
        @NotNull
        public H6.a process(@NotNull Bitmap source, @NotNull AbstractC6940d bitmapFactory) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.scaleType.getTransform(ReactImageView.tileMatrix, rect, source.getWidth(), source.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, ReactImageView.this.tileMode, ReactImageView.this.tileMode);
            bitmapShader.setLocalMatrix(ReactImageView.tileMatrix);
            paint.setShader(bitmapShader);
            H6.a a10 = bitmapFactory.a(ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            Intrinsics.checkNotNullExpressionValue(a10, "createBitmap(...)");
            try {
                new Canvas((Bitmap) a10.z0()).drawRect(rect, paint);
                H6.a clone = a10.clone();
                Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
                return clone;
            } finally {
                H6.a.U(a10);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageResizeMethod.values().length];
            try {
                iArr2[ImageResizeMethod.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ImageResizeMethod.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactImageView(@NotNull Context context, @NotNull b draweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable Object obj) {
        super(context, INSTANCE.buildHierarchy(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContext = obj;
        this.sources = new ArrayList();
        this.scaleType = ImageResizeMode.defaultValue();
        this.tileMode = ImageResizeMode.defaultTileMode();
        this.fadeDurationMs = -1;
        this.resizeMultiplier = 1.0f;
        this.resizeMethod = ImageResizeMethod.AUTO;
        setLegacyVisibilityHandlingEnabled(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r2.equals(com.facebook.hermes.intl.Constants.COLLATION_DEFAULT) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImageCacheControl computeCacheControl(String cacheControl) {
        if (cacheControl != null) {
            switch (cacheControl.hashCode()) {
                case -1564134880:
                    if (cacheControl.equals("force-cache")) {
                        return ImageCacheControl.FORCE_CACHE;
                    }
                    return ImageCacheControl.DEFAULT;
                case -934641255:
                    if (cacheControl.equals("reload")) {
                        return ImageCacheControl.RELOAD;
                    }
                    return ImageCacheControl.DEFAULT;
                case 706834161:
                    if (cacheControl.equals("only-if-cached")) {
                        return ImageCacheControl.ONLY_IF_CACHED;
                    }
                    return ImageCacheControl.DEFAULT;
                case 1544803905:
                    break;
                default:
                    return ImageCacheControl.DEFAULT;
            }
        }
        return ImageCacheControl.DEFAULT;
    }

    private final b.c computeRequestLevel(ImageCacheControl cacheControl) {
        return WhenMappings.$EnumSwitchMapping$0[cacheControl.ordinal()] == 1 ? b.c.DISK_CACHE : b.c.FULL_FETCH;
    }

    private final g getResizeOptions() {
        int round = Math.round(getWidth() * this.resizeMultiplier);
        int round2 = Math.round(getHeight() * this.resizeMultiplier);
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        return new g(round, round2, 0.0f, 0.0f, 12, null);
    }

    private final boolean hasMultipleSources() {
        return this.sources.size() > 1;
    }

    private final boolean isTiled() {
        return this.tileMode != Shader.TileMode.CLAMP;
    }

    private final void maybeUpdateViewFromRequest(boolean doResize) {
        ImageSource imageSource = this.imageSource;
        if (imageSource == null) {
            return;
        }
        Uri uri = imageSource.getUri();
        ImageCacheControl cacheControl = imageSource.getCacheControl();
        b.c computeRequestLevel = computeRequestLevel(cacheControl);
        ArrayList arrayList = new ArrayList();
        M7.a aVar = this.iterativeBoxBlurPostProcessor;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        TilePostprocessor tilePostprocessor = this.tilePostprocessor;
        if (tilePostprocessor != null) {
            arrayList.add(tilePostprocessor);
        }
        com.facebook.imagepipeline.request.d from = MultiPostprocessor.INSTANCE.from(arrayList);
        g resizeOptions = doResize ? getResizeOptions() : null;
        if (cacheControl == ImageCacheControl.RELOAD) {
            com.facebook.drawee.backends.pipeline.d.a().g(uri);
        }
        c I10 = c.x(uri).J(from).N(resizeOptions).y(true).K(this.progressiveRenderingEnabled).I(computeRequestLevel);
        ImageResizeMethod imageResizeMethod = this.resizeMethod;
        ImageResizeMethod imageResizeMethod2 = ImageResizeMethod.NONE;
        if (imageResizeMethod == imageResizeMethod2) {
            I10.E(EnumC1050n.f1295c);
        }
        ReactNetworkImageRequest.Companion companion = ReactNetworkImageRequest.INSTANCE;
        Intrinsics.checkNotNull(I10);
        ReactNetworkImageRequest fromBuilderWithHeaders = companion.fromBuilderWithHeaders(I10, this.headers, cacheControl);
        GlobalImageLoadListener globalImageLoadListener = this.globalImageLoadListener;
        if (globalImageLoadListener != null) {
            globalImageLoadListener.onLoadAttempt(uri);
        }
        W6.b bVar = this.draweeControllerBuilder;
        Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        bVar.z();
        bVar.E(fromBuilderWithHeaders).A(true).a(getController());
        Object obj = this.callerContext;
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(bVar.B(obj), "setCallerContext(...)");
        }
        ImageSource imageSource2 = this.cachedImageSource;
        if (imageSource2 != null) {
            c K10 = c.x(imageSource2.getUri()).J(from).N(resizeOptions).y(true).K(this.progressiveRenderingEnabled);
            if (this.resizeMethod == imageResizeMethod2) {
                K10.E(EnumC1050n.f1295c);
            }
            Intrinsics.checkNotNullExpressionValue(bVar.F(K10.a()), "setLowResImageRequest(...)");
        }
        ReactImageDownloadListener<m> reactImageDownloadListener = this.downloadListener;
        if (reactImageDownloadListener == null || this.controllerForTesting == null) {
            d dVar = this.controllerForTesting;
            if (dVar != null) {
                bVar.C(dVar);
            } else if (reactImageDownloadListener != null) {
                bVar.C(reactImageDownloadListener);
            }
        } else {
            f fVar = new f();
            fVar.a(this.downloadListener);
            fVar.a(this.controllerForTesting);
            bVar.C(fVar);
        }
        if (this.downloadListener != null) {
            ((Z6.a) getHierarchy()).B(this.downloadListener);
        }
        setController(bVar.build());
        bVar.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDraw$lambda$1(ReactImageView reactImageView, Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            if (reactImageView.downloadListener != null) {
                Context context = reactImageView.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, reactImageView.getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(reactImageView), reactImageView.getId(), e10));
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void setSourceImage() {
        this.imageSource = null;
        if (this.sources.isEmpty()) {
            List<ImageSource> list = this.sources;
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            list.add(companion.getTransparentBitmapImageSource(context));
        } else if (hasMultipleSources()) {
            MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.sources);
            this.imageSource = bestSourceForSize.bestResult;
            this.cachedImageSource = bestSourceForSize.bestResultInCache;
            return;
        }
        this.imageSource = this.sources.get(0);
    }

    private final boolean shouldResize(ImageSource imageSource) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[this.resizeMethod.ordinal()];
        return i10 != 1 ? i10 == 2 : com.facebook.common.util.f.m(imageSource.getUri()) || com.facebook.common.util.f.n(imageSource.getUri());
    }

    private final void warnImageSource(String uri) {
        if (!ReactBuildConfig.DEBUG || ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RNLog.w((ReactContext) context, "ReactImageView: Image source \"" + uri + "\" doesn't exist");
    }

    @Nullable
    /* renamed from: getImageSource$ReactAndroid_release, reason: from getter */
    public final ImageSource getImageSource() {
        return this.imageSource;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void maybeUpdateView() {
        if (this.isDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                ImageSource imageSource = this.imageSource;
                if (imageSource == null) {
                    return;
                }
                boolean shouldResize = shouldResize(imageSource);
                if (!shouldResize || (getWidth() > 0 && getHeight() > 0)) {
                    if (!isTiled() || (getWidth() > 0 && getHeight() > 0)) {
                        Z6.a aVar = (Z6.a) getHierarchy();
                        aVar.t(this.scaleType);
                        Drawable drawable = this.defaultImageDrawable;
                        if (drawable != null) {
                            aVar.z(drawable, this.scaleType);
                        }
                        Drawable drawable2 = this.loadingImageDrawable;
                        if (drawable2 != null) {
                            aVar.z(drawable2, r.f30526g);
                        }
                        e o10 = aVar.o();
                        if (o10 != null) {
                            int i10 = this.overlayColor;
                            if (i10 != 0) {
                                o10.q(i10);
                            } else {
                                o10.u(e.a.BITMAP_ONLY);
                            }
                            aVar.C(o10);
                        }
                        int i11 = this.fadeDurationMs;
                        if (i11 < 0) {
                            i11 = imageSource.get_isResource() ? 0 : 300;
                        }
                        aVar.v(i11);
                        maybeUpdateViewFromRequest(shouldResize);
                        this.isDirty = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull final Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        BackgroundStyleApplicator.clipToPaddingBoxWithAntiAliasing(this, canvas, new Function0() { // from class: com.facebook.react.views.image.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onDraw$lambda$1;
                onDraw$lambda$1 = ReactImageView.onDraw$lambda$1(ReactImageView.this, canvas);
                return onDraw$lambda$1;
            }
        });
    }

    @Override // android.view.View
    public void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        if (w10 <= 0 || h10 <= 0) {
            return;
        }
        this.isDirty = this.isDirty || hasMultipleSources() || isTiled();
        maybeUpdateView();
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(backgroundColor));
    }

    public final void setBlurRadius(float blurRadius) {
        int dpToPx = ((int) PixelUtil.INSTANCE.dpToPx(blurRadius)) / 2;
        this.iterativeBoxBlurPostProcessor = dpToPx == 0 ? null : new M7.a(2, dpToPx);
        this.isDirty = true;
    }

    public final void setBorderColor(int borderColor) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.ALL, Integer.valueOf(borderColor));
    }

    public final void setBorderRadius(float borderRadius) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.BORDER_RADIUS, Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }

    public final void setBorderWidth(float borderWidth) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @VisibleForTesting
    public final void setControllerListener(@Nullable d controllerListener) {
        this.controllerForTesting = controllerListener;
        this.isDirty = true;
        maybeUpdateView();
    }

    public final void setDefaultSource(@Nullable String name) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(context, name);
        if (Intrinsics.areEqual(this.defaultImageDrawable, resourceDrawable)) {
            return;
        }
        this.defaultImageDrawable = resourceDrawable;
        this.isDirty = true;
    }

    public final void setFadeDuration(int durationMs) {
        this.fadeDurationMs = durationMs;
    }

    public final void setHeaders(@Nullable ReadableMap headers) {
        this.headers = headers;
    }

    public final void setImageSource$ReactAndroid_release(@Nullable ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    public final void setLoadingIndicatorSource(@Nullable String name) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(context, name);
        RunnableC3011b runnableC3011b = resourceDrawable != null ? new RunnableC3011b(resourceDrawable, 1000) : null;
        if (Intrinsics.areEqual(this.loadingImageDrawable, runnableC3011b)) {
            return;
        }
        this.loadingImageDrawable = runnableC3011b;
        this.isDirty = true;
    }

    public final void setOverlayColor(int overlayColor) {
        if (this.overlayColor != overlayColor) {
            this.overlayColor = overlayColor;
            this.isDirty = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean enabled) {
        this.progressiveRenderingEnabled = enabled;
    }

    public final void setResizeMethod(@NotNull ImageResizeMethod resizeMethod) {
        Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
        if (this.resizeMethod != resizeMethod) {
            this.resizeMethod = resizeMethod;
            this.isDirty = true;
        }
    }

    public final void setResizeMultiplier(float multiplier) {
        if (Math.abs(this.resizeMultiplier - multiplier) > 9.999999747378752E-5d) {
            this.resizeMultiplier = multiplier;
            this.isDirty = true;
        }
    }

    public final void setScaleType(@NotNull r scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (this.scaleType != scaleType) {
            this.scaleType = scaleType;
            this.isDirty = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean shouldNotify) {
        if (shouldNotify == (this.downloadListener != null)) {
            return;
        }
        if (shouldNotify) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
            this.downloadListener = new ReactImageDownloadListener<m>() { // from class: com.facebook.react.views.image.ReactImageView$setShouldNotifyLoadEvents$1
                @Override // com.facebook.react.views.image.ReactImageDownloadListener, W6.d
                public void onFailure(String id2, Throwable throwable) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    EventDispatcher eventDispatcher = EventDispatcher.this;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(this), this.getId(), throwable));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener
                public void onProgressChange(int loaded, int total) {
                    if (EventDispatcher.this == null || this.getImageSource() == null) {
                        return;
                    }
                    EventDispatcher eventDispatcher = EventDispatcher.this;
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id2 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher.dispatchEvent(companion.createProgressEvent(surfaceId, id2, imageSource != null ? imageSource.getSource() : null, loaded, total));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, W6.d
                public void onSubmit(String id2, Object callerContext) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    EventDispatcher eventDispatcher = EventDispatcher.this;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.INSTANCE.createLoadStartEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, W6.d
                public void onFinalImageSet(String id2, m imageInfo, Animatable animatable) {
                    EventDispatcher eventDispatcher;
                    Intrinsics.checkNotNullParameter(id2, "id");
                    if (imageInfo == null || this.getImageSource() == null || (eventDispatcher = EventDispatcher.this) == null) {
                        return;
                    }
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id3 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher.dispatchEvent(companion.createLoadEvent(surfaceId, id3, imageSource != null ? imageSource.getSource() : null, imageInfo.getWidth(), imageInfo.getHeight()));
                    EventDispatcher.this.dispatchEvent(companion.createLoadEndEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }
            };
        } else {
            this.downloadListener = null;
        }
        this.isDirty = true;
    }

    public final void setSource(@Nullable ReadableArray sources) {
        ArrayList arrayList = new ArrayList();
        if (sources == null || sources.size() == 0) {
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(companion.getTransparentBitmapImageSource(context));
        } else {
            if (sources.size() == 1) {
                ReadableMap map = sources.getMap(0);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ImageCacheControl computeCacheControl = computeCacheControl(map.getString("cache"));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ImageSource imageSource = new ImageSource(context2, map.getString("uri"), 0.0d, 0.0d, computeCacheControl, 12, null);
                if (Intrinsics.areEqual(Uri.EMPTY, imageSource.getUri())) {
                    warnImageSource(map.getString("uri"));
                    ImageSource.Companion companion2 = ImageSource.INSTANCE;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    imageSource = companion2.getTransparentBitmapImageSource(context3);
                }
                arrayList.add(imageSource);
            } else {
                int size = sources.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ReadableMap map2 = sources.getMap(i10);
                    if (map2 != null) {
                        ImageCacheControl computeCacheControl2 = computeCacheControl(map2.getString("cache"));
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        ImageSource imageSource2 = new ImageSource(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"), computeCacheControl2);
                        if (Intrinsics.areEqual(Uri.EMPTY, imageSource2.getUri())) {
                            warnImageSource(map2.getString("uri"));
                            ImageSource.Companion companion3 = ImageSource.INSTANCE;
                            Context context5 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            imageSource2 = companion3.getTransparentBitmapImageSource(context5);
                        }
                        arrayList.add(imageSource2);
                    }
                }
            }
        }
        if (Intrinsics.areEqual(this.sources, arrayList)) {
            return;
        }
        this.sources.clear();
        this.sources.addAll(arrayList);
        this.isDirty = true;
    }

    public final void setTileMode(@NotNull Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        if (this.tileMode != tileMode) {
            this.tileMode = tileMode;
            this.tilePostprocessor = isTiled() ? new TilePostprocessor() : null;
            this.isDirty = true;
        }
    }

    public final void updateCallerContext(@Nullable Object callerContext) {
        if (Intrinsics.areEqual(this.callerContext, callerContext)) {
            return;
        }
        this.callerContext = callerContext;
        this.isDirty = true;
    }

    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[position], Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }
}
