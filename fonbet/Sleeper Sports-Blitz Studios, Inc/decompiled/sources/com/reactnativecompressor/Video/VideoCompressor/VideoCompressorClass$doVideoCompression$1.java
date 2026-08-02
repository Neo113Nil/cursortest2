package com.reactnativecompressor.Video.VideoCompressor;

import android.net.Uri;
import com.reactnativecompressor.Video.VideoCompressor.compressor.Compressor;
import com.reactnativecompressor.Video.VideoCompressor.video.Result;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: VideoCompressorClass.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativecompressor.Video.VideoCompressor.VideoCompressorClass$doVideoCompression$1", f = "VideoCompressorClass.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class VideoCompressorClass$doVideoCompression$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $bitrate;
    final /* synthetic */ String $destPath;
    final /* synthetic */ int $i;
    final /* synthetic */ boolean $isStreamable;
    final /* synthetic */ CompressionListener $listener;
    final /* synthetic */ int $outputHeight;
    final /* synthetic */ int $outputWidth;
    final /* synthetic */ Ref.ObjectRef<File> $streamableFile;
    final /* synthetic */ List<Uri> $uris;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ VideoCompressorClass this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoCompressorClass$doVideoCompression$1(String str, boolean z, Ref.ObjectRef<File> objectRef, CompressionListener compressionListener, int i, VideoCompressorClass videoCompressorClass, List<? extends Uri> list, int i2, int i3, int i4, Continuation<? super VideoCompressorClass$doVideoCompression$1> continuation) {
        super(2, continuation);
        this.$destPath = str;
        this.$isStreamable = z;
        this.$streamableFile = objectRef;
        this.$listener = compressionListener;
        this.$i = i;
        this.this$0 = videoCompressorClass;
        this.$uris = list;
        this.$outputWidth = i2;
        this.$outputHeight = i3;
        this.$bitrate = i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoCompressorClass$doVideoCompression$1(this.$destPath, this.$isStreamable, this.$streamableFile, this.$listener, this.$i, this.this$0, this.$uris, this.$outputWidth, this.$outputHeight, this.$bitrate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VideoCompressorClass$doVideoCompression$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.io.File] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CompressionListener compressionListener;
        int i;
        Object startCompression;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            File file = new File(this.$destPath);
            if (this.$isStreamable) {
                this.$streamableFile.element = new File(this.$destPath);
            }
            compressionListener = this.$listener;
            int i3 = this.$i;
            VideoCompressorClass videoCompressorClass = this.this$0;
            List<Uri> list = this.$uris;
            Ref.ObjectRef<File> objectRef = this.$streamableFile;
            int i4 = this.$outputWidth;
            int i5 = this.$outputHeight;
            int i6 = this.$bitrate;
            Compressor.INSTANCE.setRunning(true);
            compressionListener.onStart(i3);
            Uri uri = list.get(i3);
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            File file2 = objectRef.element;
            String path2 = file2 != null ? file2.getPath() : null;
            this.L$0 = compressionListener;
            this.I$0 = i3;
            this.label = 1;
            i = i3;
            startCompression = videoCompressorClass.startCompression(i, uri, path, path2, i4, i5, i6, compressionListener, this);
            if (startCompression == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = this.I$0;
            CompressionListener compressionListener2 = (CompressionListener) this.L$0;
            ResultKt.throwOnFailure(obj);
            compressionListener = compressionListener2;
            i = i7;
            startCompression = obj;
        }
        Result result = (Result) startCompression;
        if (result.getSuccess()) {
            compressionListener.onSuccess(i, result.getSize(), result.getPath());
        } else {
            String failureMessage = result.getFailureMessage();
            if (failureMessage == null) {
                failureMessage = "An error has occurred!";
            }
            compressionListener.onFailure(i, failureMessage);
        }
        return Unit.INSTANCE;
    }
}
