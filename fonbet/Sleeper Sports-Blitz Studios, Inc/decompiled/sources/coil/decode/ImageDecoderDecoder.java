package coil.decode;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.drawable.ScaleDrawable;
import coil.fetch.SourceResult;
import coil.request.Gifs;
import coil.request.Options;
import coil.size.Sizes;
import coil.transform.AnimatedTransformation;
import coil.util.GifUtils;
import com.braze.managers.x$$ExternalSyntheticApiModelOutline0;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import okio.BufferedSource;
import okio.Okio;
import okio.Path;

/* compiled from: ImageDecoderDecoder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0003H\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcoil/decode/ImageDecoderDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "options", "Lcoil/request/Options;", "enforceMinimumFrameDelay", "", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Z)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapImageSource", "toImageDecoderSource", "Landroid/graphics/ImageDecoder$Source;", "configureImageDecoderProperties", "", "Landroid/graphics/ImageDecoder;", "wrapDrawable", "Landroid/graphics/drawable/Drawable;", "baseDrawable", "(Landroid/graphics/drawable/Drawable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImageDecoderDecoder implements Decoder {
    private final boolean enforceMinimumFrameDelay;
    private final Options options;
    private final ImageSource source;

    public ImageDecoderDecoder(ImageSource imageSource, Options options) {
        this(imageSource, options, false, 4, null);
    }

    public ImageDecoderDecoder(ImageSource imageSource, Options options, boolean z) {
        this.source = imageSource;
        this.options = options;
        this.enforceMinimumFrameDelay = z;
    }

    public /* synthetic */ ImageDecoderDecoder(ImageSource imageSource, Options options, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // coil.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decode(Continuation<? super DecodeResult> continuation) {
        ImageDecoderDecoder$decode$1 imageDecoderDecoder$decode$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Ref.BooleanRef booleanRef;
        ImageDecoderDecoder imageDecoderDecoder;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof ImageDecoderDecoder$decode$1) {
            imageDecoderDecoder$decode$1 = (ImageDecoderDecoder$decode$1) continuation;
            if ((imageDecoderDecoder$decode$1.label & Integer.MIN_VALUE) != 0) {
                imageDecoderDecoder$decode$1.label -= Integer.MIN_VALUE;
                obj = imageDecoderDecoder$decode$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = imageDecoderDecoder$decode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    Function0 function0 = new Function0() { // from class: coil.decode.ImageDecoderDecoder$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Drawable decode$lambda$3;
                            decode$lambda$3 = ImageDecoderDecoder.decode$lambda$3(ImageDecoderDecoder.this, booleanRef3);
                            return decode$lambda$3;
                        }
                    };
                    imageDecoderDecoder$decode$1.L$0 = this;
                    imageDecoderDecoder$decode$1.L$1 = booleanRef3;
                    imageDecoderDecoder$decode$1.label = 1;
                    Object runInterruptible$default = InterruptibleKt.runInterruptible$default(null, function0, imageDecoderDecoder$decode$1, 1, null);
                    if (runInterruptible$default != coroutine_suspended) {
                        booleanRef = booleanRef3;
                        obj = runInterruptible$default;
                        imageDecoderDecoder = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef2 = (Ref.BooleanRef) imageDecoderDecoder$decode$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return new DecodeResult((Drawable) obj, booleanRef2.element);
                }
                booleanRef = (Ref.BooleanRef) imageDecoderDecoder$decode$1.L$1;
                imageDecoderDecoder = (ImageDecoderDecoder) imageDecoderDecoder$decode$1.L$0;
                ResultKt.throwOnFailure(obj);
                imageDecoderDecoder$decode$1.L$0 = booleanRef;
                imageDecoderDecoder$decode$1.L$1 = null;
                imageDecoderDecoder$decode$1.label = 2;
                obj = imageDecoderDecoder.wrapDrawable((Drawable) obj, imageDecoderDecoder$decode$1);
                if (obj != coroutine_suspended) {
                    booleanRef2 = booleanRef;
                    return new DecodeResult((Drawable) obj, booleanRef2.element);
                }
                return coroutine_suspended;
            }
        }
        imageDecoderDecoder$decode$1 = new ImageDecoderDecoder$decode$1(this, continuation);
        obj = imageDecoderDecoder$decode$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = imageDecoderDecoder$decode$1.label;
        if (i != 0) {
        }
        imageDecoderDecoder$decode$1.L$0 = booleanRef;
        imageDecoderDecoder$decode$1.L$1 = null;
        imageDecoderDecoder$decode$1.label = 2;
        obj = imageDecoderDecoder.wrapDrawable((Drawable) obj, imageDecoderDecoder$decode$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable decode$lambda$3(final ImageDecoderDecoder imageDecoderDecoder, final Ref.BooleanRef booleanRef) {
        Drawable decodeDrawable;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ImageSource wrapImageSource = imageDecoderDecoder.wrapImageSource(imageDecoderDecoder.source);
        try {
            decodeDrawable = ImageDecoder.decodeDrawable(imageDecoderDecoder.toImageDecoderSource(wrapImageSource), HalfKt$$ExternalSyntheticApiModelOutline0.m((Object) new ImageDecoder$OnHeaderDecodedListener() { // from class: coil.decode.ImageDecoderDecoder$decode$lambda$3$$inlined$decodeDrawable$1
                /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
                
                    if (r2.getAllowInexactSize() == false) goto L22;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    Size size;
                    Options options;
                    Options options2;
                    Options options3;
                    Options options4;
                    Options options5;
                    Options options6;
                    Ref.ObjectRef.this.element = imageDecoder;
                    size = imageInfo.getSize();
                    int width = size.getWidth();
                    int height = size.getHeight();
                    options = imageDecoderDecoder.options;
                    coil.size.Size size2 = options.getSize();
                    options2 = imageDecoderDecoder.options;
                    int px = Sizes.isOriginal(size2) ? width : GifUtils.toPx(size2.getWidth(), options2.getScale());
                    options3 = imageDecoderDecoder.options;
                    coil.size.Size size3 = options3.getSize();
                    options4 = imageDecoderDecoder.options;
                    int px2 = Sizes.isOriginal(size3) ? height : GifUtils.toPx(size3.getHeight(), options4.getScale());
                    if (width > 0 && height > 0 && (width != px || height != px2)) {
                        options5 = imageDecoderDecoder.options;
                        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, px, px2, options5.getScale());
                        booleanRef.element = computeSizeMultiplier < 1.0d;
                        if (!booleanRef.element) {
                            options6 = imageDecoderDecoder.options;
                        }
                        imageDecoder.setTargetSize(MathKt.roundToInt(width * computeSizeMultiplier), MathKt.roundToInt(computeSizeMultiplier * height));
                    }
                    imageDecoderDecoder.configureImageDecoderProperties(imageDecoder);
                }
            }));
            return decodeDrawable;
        } finally {
            ImageDecoder m10317m = x$$ExternalSyntheticApiModelOutline0.m10317m((Object) objectRef.element);
            if (m10317m != null) {
                m10317m.close();
            }
            wrapImageSource.close();
        }
    }

    private final ImageSource wrapImageSource(ImageSource source) {
        return (this.enforceMinimumFrameDelay && GifDecodeUtils.isGif(DecodeUtils.INSTANCE, source.source())) ? ImageSources.create(Okio.buffer(new FrameDelayRewritingSource(source.source())), this.options.getContext()) : source;
    }

    private final ImageDecoder.Source toImageDecoderSource(ImageSource imageSource) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        ImageDecoder.Source createSource4;
        ImageDecoder.Source createSource5;
        ImageDecoder.Source createSource6;
        ImageDecoder.Source createSource7;
        Path fileOrNull = imageSource.fileOrNull();
        if (fileOrNull != null) {
            createSource7 = ImageDecoder.createSource(fileOrNull.toFile());
            return createSource7;
        }
        ImageSource.Metadata metadata = imageSource.getMetadata();
        if (metadata instanceof AssetMetadata) {
            createSource6 = ImageDecoder.createSource(this.options.getContext().getAssets(), ((AssetMetadata) metadata).getFilePath());
            return createSource6;
        }
        if (metadata instanceof ContentMetadata) {
            createSource5 = ImageDecoder.createSource(this.options.getContext().getContentResolver(), ((ContentMetadata) metadata).getUri());
            return createSource5;
        }
        if (metadata instanceof ResourceMetadata) {
            ResourceMetadata resourceMetadata = (ResourceMetadata) metadata;
            if (Intrinsics.areEqual(resourceMetadata.getPackageName(), this.options.getContext().getPackageName())) {
                createSource4 = ImageDecoder.createSource(this.options.getContext().getResources(), resourceMetadata.getResId());
                return createSource4;
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            createSource3 = ImageDecoder.createSource(imageSource.source().readByteArray());
            return createSource3;
        }
        if (Build.VERSION.SDK_INT == 30) {
            createSource2 = ImageDecoder.createSource(ByteBuffer.wrap(imageSource.source().readByteArray()));
            return createSource2;
        }
        createSource = ImageDecoder.createSource(imageSource.file().toFile());
        return createSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureImageDecoderProperties(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(GifUtils.isHardware(this.options.getConfig()) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!this.options.getAllowRgb565() ? 1 : 0);
        if (this.options.getColorSpace() != null) {
            imageDecoder.setTargetColorSpace(this.options.getColorSpace());
        }
        imageDecoder.setUnpremultipliedRequired(!this.options.getPremultipliedAlpha());
        AnimatedTransformation animatedTransformation = Gifs.animatedTransformation(this.options.getParameters());
        imageDecoder.setPostProcessor(animatedTransformation != null ? GifUtils.asPostProcessor(animatedTransformation) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object wrapDrawable(Drawable drawable, Continuation<? super Drawable> continuation) {
        ImageDecoderDecoder$wrapDrawable$1 imageDecoderDecoder$wrapDrawable$1;
        int i;
        ImageDecoderDecoder imageDecoderDecoder;
        if (continuation instanceof ImageDecoderDecoder$wrapDrawable$1) {
            imageDecoderDecoder$wrapDrawable$1 = (ImageDecoderDecoder$wrapDrawable$1) continuation;
            if ((imageDecoderDecoder$wrapDrawable$1.label & Integer.MIN_VALUE) != 0) {
                imageDecoderDecoder$wrapDrawable$1.label -= Integer.MIN_VALUE;
                Object obj = imageDecoderDecoder$wrapDrawable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = imageDecoderDecoder$wrapDrawable$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!x$$ExternalSyntheticApiModelOutline0.m10330m((Object) drawable)) {
                        return drawable;
                    }
                    AnimatedImageDrawable m10318m = x$$ExternalSyntheticApiModelOutline0.m10318m((Object) drawable);
                    Integer repeatCount = Gifs.repeatCount(this.options.getParameters());
                    m10318m.setRepeatCount(repeatCount != null ? repeatCount.intValue() : -1);
                    Function0<Unit> animationStartCallback = Gifs.animationStartCallback(this.options.getParameters());
                    Function0<Unit> animationEndCallback = Gifs.animationEndCallback(this.options.getParameters());
                    if (animationStartCallback != null || animationEndCallback != null) {
                        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                        ImageDecoderDecoder$wrapDrawable$2 imageDecoderDecoder$wrapDrawable$2 = new ImageDecoderDecoder$wrapDrawable$2(drawable, animationStartCallback, animationEndCallback, null);
                        imageDecoderDecoder$wrapDrawable$1.L$0 = this;
                        imageDecoderDecoder$wrapDrawable$1.L$1 = drawable;
                        imageDecoderDecoder$wrapDrawable$1.label = 1;
                        if (BuildersKt.withContext(immediate, imageDecoderDecoder$wrapDrawable$2, imageDecoderDecoder$wrapDrawable$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    imageDecoderDecoder = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    drawable = (Drawable) imageDecoderDecoder$wrapDrawable$1.L$1;
                    imageDecoderDecoder = (ImageDecoderDecoder) imageDecoderDecoder$wrapDrawable$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new ScaleDrawable(drawable, imageDecoderDecoder.options.getScale());
            }
        }
        imageDecoderDecoder$wrapDrawable$1 = new ImageDecoderDecoder$wrapDrawable$1(this, continuation);
        Object obj2 = imageDecoderDecoder$wrapDrawable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = imageDecoderDecoder$wrapDrawable$1.label;
        if (i != 0) {
        }
        return new ScaleDrawable(drawable, imageDecoderDecoder.options.getScale());
    }

    /* compiled from: ImageDecoderDecoder.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcoil/decode/ImageDecoderDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "enforceMinimumFrameDelay", "", "<init>", "(Z)V", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "source", "Lokio/BufferedSource;", "equals", "other", "", "hashCode", "", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        private final boolean enforceMinimumFrameDelay;

        public Factory() {
            this(false, 1, null);
        }

        public Factory(boolean z) {
            this.enforceMinimumFrameDelay = z;
        }

        public /* synthetic */ Factory(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        @Override // coil.decode.Decoder.Factory
        public Decoder create(SourceResult result, Options options, ImageLoader imageLoader) {
            if (isApplicable(result.getSource().source())) {
                return new ImageDecoderDecoder(result.getSource(), options, this.enforceMinimumFrameDelay);
            }
            return null;
        }

        private final boolean isApplicable(BufferedSource source) {
            if (GifDecodeUtils.isGif(DecodeUtils.INSTANCE, source) || GifDecodeUtils.isAnimatedWebP(DecodeUtils.INSTANCE, source)) {
                return true;
            }
            return Build.VERSION.SDK_INT >= 30 && GifDecodeUtils.isAnimatedHeif(DecodeUtils.INSTANCE, source);
        }

        public boolean equals(Object other) {
            return other instanceof Factory;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }
}
