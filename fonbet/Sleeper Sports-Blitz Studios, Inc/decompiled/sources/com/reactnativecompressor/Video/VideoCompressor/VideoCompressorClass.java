package com.reactnativecompressor.Video.VideoCompressor;

import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.reactnativecompressor.Video.VideoCompressor.compressor.Compressor;
import com.reactnativecompressor.Video.VideoCompressor.video.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: VideoCompressorClass.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0006\u0010\u0013\u001a\u00020\tJF\u0010\u0014\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002JR\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/VideoCompressorClass;", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "job", "Lkotlinx/coroutines/Job;", "start", "", "srcPath", "", "destPath", "outputWidth", "", "outputHeight", "bitrate", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/reactnativecompressor/Video/VideoCompressor/CompressionListener;", "cancel", "doVideoCompression", "uris", "", "Landroid/net/Uri;", "isStreamable", "", "startCompression", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Result;", "index", "srcUri", "streamableFile", "(ILandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIILcom/reactnativecompressor/Video/VideoCompressor/CompressionListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaPath", "uri", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VideoCompressorClass {
    private final ReactApplicationContext context;
    private Job job;

    public VideoCompressorClass(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void start(String srcPath, String destPath, int outputWidth, int outputHeight, int bitrate, CompressionListener listener) {
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(destPath, "destPath");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Uri parse = Uri.parse(srcPath);
        Intrinsics.checkNotNull(parse);
        arrayList.add(parse);
        doVideoCompression(arrayList, false, outputWidth, outputHeight, bitrate, listener, destPath);
    }

    public final void cancel() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Compressor.INSTANCE.setRunning(false);
    }

    private final void doVideoCompression(List<? extends Uri> uris, boolean isStreamable, int outputWidth, int outputHeight, int bitrate, CompressionListener listener, String destPath) {
        Job launch$default;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int size = uris.size();
        for (int i = 0; i < size; i++) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new VideoCompressorClass$doVideoCompression$1(destPath, isStreamable, objectRef, listener, i, this, uris, outputWidth, outputHeight, bitrate, null), 3, null);
            this.job = launch$default;
        }
    }

    static /* synthetic */ Object startCompression$default(VideoCompressorClass videoCompressorClass, int i, Uri uri, String str, String str2, int i2, int i3, int i4, CompressionListener compressionListener, Continuation continuation, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            str2 = null;
        }
        return videoCompressorClass.startCompression(i, uri, str, str2, i2, i3, i4, compressionListener, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startCompression(int i, Uri uri, String str, String str2, int i2, int i3, int i4, CompressionListener compressionListener, Continuation<? super Result> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new VideoCompressorClass$startCompression$2(i, this, uri, str, str2, i2, i3, i4, compressionListener, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r8 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getMediaPath(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || Intrinsics.areEqual(scheme, "file")) {
            String path = uri.getPath();
            return path == null ? "" : path;
        }
        Cursor cursor = null;
        try {
            cursor = this.context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cursor.close();
                return string;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (cursor == null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }
}
