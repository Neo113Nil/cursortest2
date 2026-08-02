package io.intercom.android.sdk.lightcompressor.compressor;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import io.intercom.android.sdk.lightcompressor.CompressionProgressListener;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.utils.CompressorUtils;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Compressor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/intercom/android/sdk/lightcompressor/video/Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2", f = "Compressor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class Compressor$compressVideo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $destination;
    final /* synthetic */ int $index;
    final /* synthetic */ CompressionProgressListener $listener;
    final /* synthetic */ Uri $srcUri;
    final /* synthetic */ String $streamableFile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Compressor$compressVideo$2(Context context, Uri uri, int i, Configuration configuration, String str, String str2, CompressionProgressListener compressionProgressListener, Continuation<? super Compressor$compressVideo$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$srcUri = uri;
        this.$index = i;
        this.$configuration = configuration;
        this.$destination = str;
        this.$streamableFile = str2;
        this.$listener = compressionProgressListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Compressor$compressVideo$2 compressor$compressVideo$2 = new Compressor$compressVideo$2(this.$context, this.$srcUri, this.$index, this.$configuration, this.$destination, this.$streamableFile, this.$listener, continuation);
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
        int intValue;
        Pair<Integer, Integer> generateWidthAndHeight;
        int i;
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
            double prepareVideoHeight = CompressorUtils.INSTANCE.prepareVideoHeight(mediaMetadataRetriever);
            double prepareVideoWidth = CompressorUtils.INSTANCE.prepareVideoWidth(mediaMetadataRetriever);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            String str3 = extractMetadata;
            if (str3 == null || str3.length() == 0 || (str = extractMetadata2) == null || str.length() == 0 || (str2 = extractMetadata3) == null || str2.length() == 0) {
                return new io.intercom.android.sdk.lightcompressor.video.Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
            }
            try {
                Triple triple = new Triple(Boxing.boxInt(Integer.parseInt(extractMetadata)), Boxing.boxInt(Integer.parseInt(extractMetadata2)), Boxing.boxLong(Long.parseLong(extractMetadata3) * 1000));
                int intValue2 = ((Number) triple.component1()).intValue();
                int intValue3 = ((Number) triple.component2()).intValue();
                long longValue = ((Number) triple.component3()).longValue();
                if (this.$configuration.isMinBitrateCheckEnabled() && intValue3 <= 2000000) {
                    return new io.intercom.android.sdk.lightcompressor.video.Result(this.$index, false, "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false", 0L, null, 24, null);
                }
                if (this.$configuration.getVideoBitrateInMbps() == null) {
                    intValue = CompressorUtils.INSTANCE.getBitrate(intValue3, this.$configuration.getQuality());
                } else {
                    Integer videoBitrateInMbps = this.$configuration.getVideoBitrateInMbps();
                    Intrinsics.checkNotNull(videoBitrateInMbps);
                    intValue = videoBitrateInMbps.intValue() * 1000000;
                }
                int i2 = intValue;
                if (this.$configuration.getVideoHeight() != null) {
                    Double videoWidth = this.$configuration.getVideoWidth();
                    Integer boxInt = videoWidth != null ? Boxing.boxInt((int) videoWidth.doubleValue()) : null;
                    Double videoHeight = this.$configuration.getVideoHeight();
                    generateWidthAndHeight = new Pair<>(boxInt, videoHeight != null ? Boxing.boxInt((int) videoHeight.doubleValue()) : null);
                } else {
                    generateWidthAndHeight = CompressorUtils.INSTANCE.generateWidthAndHeight(prepareVideoWidth, prepareVideoHeight, this.$configuration.getKeepOriginalResolution());
                }
                Integer component1 = generateWidthAndHeight.component1();
                Integer component2 = generateWidthAndHeight.component2();
                if (intValue2 != 90) {
                    if (intValue2 != 180) {
                        if (intValue2 != 270) {
                            i = intValue2;
                            Compressor compressor = Compressor.INSTANCE;
                            Integer num = component1;
                            int i3 = this.$index;
                            Intrinsics.checkNotNull(num);
                            int intValue4 = num.intValue();
                            Intrinsics.checkNotNull(component2);
                            start = compressor.start(i3, intValue4, component2.intValue(), this.$destination, i2, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, longValue, i);
                            return start;
                        }
                    }
                    i = 0;
                    Compressor compressor2 = Compressor.INSTANCE;
                    Integer num2 = component1;
                    int i32 = this.$index;
                    Intrinsics.checkNotNull(num2);
                    int intValue42 = num2.intValue();
                    Intrinsics.checkNotNull(component2);
                    start = compressor2.start(i32, intValue42, component2.intValue(), this.$destination, i2, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, longValue, i);
                    return start;
                }
                component1 = component2;
                component2 = component1;
                i = 0;
                Compressor compressor22 = Compressor.INSTANCE;
                Integer num22 = component1;
                int i322 = this.$index;
                Intrinsics.checkNotNull(num22);
                int intValue422 = num22.intValue();
                Intrinsics.checkNotNull(component2);
                start = compressor22.start(i322, intValue422, component2.intValue(), this.$destination, i2, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, longValue, i);
                return start;
            } catch (Exception unused) {
                return new io.intercom.android.sdk.lightcompressor.video.Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
            }
        } catch (IllegalArgumentException e) {
            CompressorUtils.INSTANCE.printException(e);
            return new io.intercom.android.sdk.lightcompressor.video.Result(this.$index, false, String.valueOf(e.getMessage()), 0L, null, 24, null);
        }
    }
}
