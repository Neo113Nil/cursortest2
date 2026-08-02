package com.reactnativecompressor.Video.VideoCompressor;

import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecompressor.Video.VideoCompressor.compressor.Compressor;
import com.reactnativecompressor.Video.VideoCompressor.video.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: VideoCompressorClass.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativecompressor.Video.VideoCompressor.VideoCompressorClass$startCompression$2", f = "VideoCompressorClass.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class VideoCompressorClass$startCompression$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
    final /* synthetic */ int $bitrate;
    final /* synthetic */ String $destPath;
    final /* synthetic */ int $index;
    final /* synthetic */ CompressionListener $listener;
    final /* synthetic */ int $outputHeight;
    final /* synthetic */ int $outputWidth;
    final /* synthetic */ Uri $srcUri;
    final /* synthetic */ String $streamableFile;
    int label;
    final /* synthetic */ VideoCompressorClass this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoCompressorClass$startCompression$2(int i, VideoCompressorClass videoCompressorClass, Uri uri, String str, String str2, int i2, int i3, int i4, CompressionListener compressionListener, Continuation<? super VideoCompressorClass$startCompression$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.this$0 = videoCompressorClass;
        this.$srcUri = uri;
        this.$destPath = str;
        this.$streamableFile = str2;
        this.$outputWidth = i2;
        this.$outputHeight = i3;
        this.$bitrate = i4;
        this.$listener = compressionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoCompressorClass$startCompression$2(this.$index, this.this$0, this.$srcUri, this.$destPath, this.$streamableFile, this.$outputWidth, this.$outputHeight, this.$bitrate, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
        return ((VideoCompressorClass$startCompression$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReactApplicationContext reactApplicationContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Compressor compressor = Compressor.INSTANCE;
        int i2 = this.$index;
        reactApplicationContext = this.this$0.context;
        Uri uri = this.$srcUri;
        String str = this.$destPath;
        String str2 = this.$streamableFile;
        int i3 = this.$outputWidth;
        int i4 = this.$outputHeight;
        int i5 = this.$bitrate;
        final CompressionListener compressionListener = this.$listener;
        this.label = 1;
        Object compressVideo = compressor.compressVideo(i2, reactApplicationContext, uri, str, str2, i3, i4, i5, new CompressionProgressListener() { // from class: com.reactnativecompressor.Video.VideoCompressor.VideoCompressorClass$startCompression$2.1
            @Override // com.reactnativecompressor.Video.VideoCompressor.CompressionProgressListener
            public void onProgressChanged(int index, float percent) {
                CompressionListener.this.onProgress(index, percent);
            }

            @Override // com.reactnativecompressor.Video.VideoCompressor.CompressionProgressListener
            public void onProgressCancelled(int index) {
                CompressionListener.this.onCancelled(index);
            }
        }, this);
        return compressVideo == coroutine_suspended ? coroutine_suspended : compressVideo;
    }
}
