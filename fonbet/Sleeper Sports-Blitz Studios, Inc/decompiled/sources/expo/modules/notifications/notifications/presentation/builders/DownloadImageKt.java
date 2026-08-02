package expo.modules.notifications.notifications.presentation.builders;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: DownloadImage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"downloadImage", "Landroid/graphics/Bitmap;", "imageUrl", "Landroid/net/Uri;", "connectTimeout", "", "readTimeout", "(Landroid/net/Uri;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-notifications_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DownloadImageKt {
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|12|(1:14)(1:16)))|26|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r14 = kotlin.Result.m13470constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object downloadImage(Uri uri, long j, long j2, Continuation<? super Bitmap> continuation) {
        DownloadImageKt$downloadImage$1 downloadImageKt$downloadImage$1;
        int i;
        Object m13470constructorimpl;
        if (continuation instanceof DownloadImageKt$downloadImage$1) {
            downloadImageKt$downloadImage$1 = (DownloadImageKt$downloadImage$1) continuation;
            if ((downloadImageKt$downloadImage$1.label & Integer.MIN_VALUE) != 0) {
                downloadImageKt$downloadImage$1.label -= Integer.MIN_VALUE;
                Object obj = downloadImageKt$downloadImage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadImageKt$downloadImage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    DownloadImageKt$downloadImage$2$1 downloadImageKt$downloadImage$2$1 = new DownloadImageKt$downloadImage$2$1(uri, j, j2, null);
                    downloadImageKt$downloadImage$1.label = 1;
                    obj = TimeoutKt.withTimeout(j + j2, downloadImageKt$downloadImage$2$1, downloadImageKt$downloadImage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                m13470constructorimpl = Result.m13470constructorimpl((Bitmap) obj);
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    return m13470constructorimpl;
                }
                return null;
            }
        }
        downloadImageKt$downloadImage$1 = new DownloadImageKt$downloadImage$1(continuation);
        Object obj2 = downloadImageKt$downloadImage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadImageKt$downloadImage$1.label;
        if (i != 0) {
        }
        m13470constructorimpl = Result.m13470constructorimpl((Bitmap) obj2);
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
        }
    }

    public static /* synthetic */ Object downloadImage$default(Uri uri, long j, long j2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 8000;
        }
        if ((i & 4) != 0) {
            j2 = 8000;
        }
        return downloadImage(uri, j, j2, continuation);
    }
}
