package com.reactnativecompressor.Video.VideoCompressor.compressor;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.reactnativecompressor.Video.VideoCompressor.CompressionProgressListener;
import com.reactnativecompressor.Video.VideoCompressor.utils.CompressorUtils;
import com.reactnativecompressor.Video.VideoCompressor.video.Result;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Compressor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativecompressor.Video.VideoCompressor.compressor.Compressor$compressVideo$2", f = "Compressor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class Compressor$compressVideo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $destination;
    final /* synthetic */ int $index;
    final /* synthetic */ CompressionProgressListener $listener;
    final /* synthetic */ int $outputBitrate;
    final /* synthetic */ int $outputHeight;
    final /* synthetic */ int $outputWidth;
    final /* synthetic */ Uri $srcUri;
    final /* synthetic */ String $streamableFile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Compressor$compressVideo$2(Context context, Uri uri, int i, int i2, int i3, int i4, String str, String str2, CompressionProgressListener compressionProgressListener, Continuation<? super Compressor$compressVideo$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$srcUri = uri;
        this.$index = i;
        this.$outputBitrate = i2;
        this.$outputWidth = i3;
        this.$outputHeight = i4;
        this.$destination = str;
        this.$streamableFile = str2;
        this.$listener = compressionProgressListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Compressor$compressVideo$2 compressor$compressVideo$2 = new Compressor$compressVideo$2(this.$context, this.$srcUri, this.$index, this.$outputBitrate, this.$outputWidth, this.$outputHeight, this.$destination, this.$streamableFile, this.$listener, continuation);
        compressor$compressVideo$2.L$0 = obj;
        return compressor$compressVideo$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
        return ((Compressor$compressVideo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        Result start;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.$context, this.$srcUri);
            Context context = this.$context;
            Uri uri = this.$srcUri;
            try {
                Result.Companion companion = kotlin.Result.INSTANCE;
                mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
                kotlin.Result.m13470constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            CompressorUtils.INSTANCE.prepareVideoHeight(mediaMetadataRetriever);
            CompressorUtils.INSTANCE.prepareVideoWidth(mediaMetadataRetriever);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            String str3 = extractMetadata;
            if (str3 == null || str3.length() == 0 || (str = extractMetadata2) == null || str.length() == 0 || (str2 = extractMetadata3) == null || str2.length() == 0) {
                return new com.reactnativecompressor.Video.VideoCompressor.video.Result(this.$index, false, "Failed to extract video metadata, please try again", 0L, null, 24, null);
            }
            int parseInt = Integer.parseInt(extractMetadata);
            long parseLong = Long.parseLong(extractMetadata3) * 1000;
            int i4 = this.$outputBitrate;
            Pair pair = new Pair(Boxing.boxInt(this.$outputWidth), Boxing.boxInt(this.$outputHeight));
            int intValue = ((Number) pair.component1()).intValue();
            int intValue2 = ((Number) pair.component2()).intValue();
            if (parseInt != 90) {
                if (parseInt == 180) {
                    i = intValue;
                    i2 = 0;
                    i3 = intValue2;
                } else if (parseInt != 270) {
                    i3 = intValue2;
                    i2 = parseInt;
                    i = intValue;
                }
                start = Compressor.INSTANCE.start(this.$index, i, i3, this.$destination, i4, this.$streamableFile, false, mediaExtractor, this.$listener, parseLong, i2);
                return start;
            }
            i = intValue2;
            i2 = 0;
            i3 = intValue;
            start = Compressor.INSTANCE.start(this.$index, i, i3, this.$destination, i4, this.$streamableFile, false, mediaExtractor, this.$listener, parseLong, i2);
            return start;
        } catch (IllegalArgumentException e) {
            CompressorUtils.INSTANCE.printException(e);
            return new com.reactnativecompressor.Video.VideoCompressor.video.Result(this.$index, false, String.valueOf(e.getMessage()), 0L, null, 24, null);
        }
    }
}
