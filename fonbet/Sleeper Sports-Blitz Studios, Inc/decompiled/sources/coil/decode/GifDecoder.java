package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Movie;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.drawable.MovieDrawable;
import coil.fetch.SourceResult;
import coil.request.Gifs;
import coil.request.Options;
import coil.util.GifUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InterruptibleKt;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: GifDecoder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcoil/decode/GifDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "options", "Lcoil/request/Options;", "enforceMinimumFrameDelay", "", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Z)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "Companion", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GifDecoder implements Decoder {
    public static final String ANIMATED_TRANSFORMATION_KEY = "coil#animated_transformation";
    public static final String ANIMATION_END_CALLBACK_KEY = "coil#animation_end_callback";
    public static final String ANIMATION_START_CALLBACK_KEY = "coil#animation_start_callback";
    public static final String REPEAT_COUNT_KEY = "coil#repeat_count";
    private final boolean enforceMinimumFrameDelay;
    private final Options options;
    private final ImageSource source;

    public GifDecoder(ImageSource imageSource, Options options) {
        this(imageSource, options, false, 4, null);
    }

    public GifDecoder(ImageSource imageSource, Options options, boolean z) {
        this.source = imageSource;
        this.options = options;
        this.enforceMinimumFrameDelay = z;
    }

    public /* synthetic */ GifDecoder(ImageSource imageSource, Options options, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z);
    }

    @Override // coil.decode.Decoder
    public Object decode(Continuation<? super DecodeResult> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0() { // from class: coil.decode.GifDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DecodeResult decode$lambda$2;
                decode$lambda$2 = GifDecoder.decode$lambda$2(GifDecoder.this);
                return decode$lambda$2;
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecodeResult decode$lambda$2(GifDecoder gifDecoder) {
        BufferedSource source;
        Bitmap.Config config;
        if (gifDecoder.enforceMinimumFrameDelay) {
            source = Okio.buffer(new FrameDelayRewritingSource(gifDecoder.source.source()));
        } else {
            source = gifDecoder.source.source();
        }
        BufferedSource bufferedSource = source;
        try {
            Movie decodeStream = Movie.decodeStream(bufferedSource.inputStream());
            CloseableKt.closeFinally(bufferedSource, null);
            if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                throw new IllegalStateException("Failed to decode GIF.".toString());
            }
            if (decodeStream.isOpaque() && gifDecoder.options.getAllowRgb565()) {
                config = Bitmap.Config.RGB_565;
            } else {
                config = GifUtils.isHardware(gifDecoder.options.getConfig()) ? Bitmap.Config.ARGB_8888 : gifDecoder.options.getConfig();
            }
            MovieDrawable movieDrawable = new MovieDrawable(decodeStream, config, gifDecoder.options.getScale());
            Integer repeatCount = Gifs.repeatCount(gifDecoder.options.getParameters());
            movieDrawable.setRepeatCount(repeatCount != null ? repeatCount.intValue() : -1);
            Function0<Unit> animationStartCallback = Gifs.animationStartCallback(gifDecoder.options.getParameters());
            Function0<Unit> animationEndCallback = Gifs.animationEndCallback(gifDecoder.options.getParameters());
            if (animationStartCallback != null || animationEndCallback != null) {
                movieDrawable.registerAnimationCallback(GifUtils.animatable2CompatCallbackOf(animationStartCallback, animationEndCallback));
            }
            movieDrawable.setAnimatedTransformation(Gifs.animatedTransformation(gifDecoder.options.getParameters()));
            return new DecodeResult(movieDrawable, false);
        } finally {
        }
    }

    /* compiled from: GifDecoder.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcoil/decode/GifDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "enforceMinimumFrameDelay", "", "<init>", "(Z)V", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "equals", "other", "", "hashCode", "", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            if (GifDecodeUtils.isGif(DecodeUtils.INSTANCE, result.getSource().source())) {
                return new GifDecoder(result.getSource(), options, this.enforceMinimumFrameDelay);
            }
            return null;
        }

        public boolean equals(Object other) {
            return other instanceof Factory;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }
}
