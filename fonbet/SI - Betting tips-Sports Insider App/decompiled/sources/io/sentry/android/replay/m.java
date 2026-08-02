package io.sentry.android.replay;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends Lambda implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bitmap f16064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Bitmap bitmap, Ref.ObjectRef objectRef) {
        super(2);
        this.f16064e = bitmap;
        this.f16065f = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j onScreenshotRecorded = (j) obj;
        long longValue = ((Number) obj2).longValue();
        Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
        Bitmap bitmap = this.f16064e;
        String str = (String) this.f16065f.element;
        onScreenshotRecorded.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (onScreenshotRecorded.n() != null && !bitmap.isRecycled()) {
            File n9 = onScreenshotRecorded.n();
            if (n9 != null) {
                n9.mkdirs();
            }
            File file = new File(onScreenshotRecorded.n(), longValue + ".jpg");
            file.createNewFile();
            synchronized (bitmap) {
                if (!bitmap.isRecycled()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, onScreenshotRecorded.f16051a.getSessionReplay().f16404e.screenshotQuality, fileOutputStream);
                        fileOutputStream.flush();
                        Unit unit = Unit.f19194a;
                        fileOutputStream.close();
                        onScreenshotRecorded.c(file, longValue, str);
                    } finally {
                    }
                }
            }
        }
        return Unit.f19194a;
    }
}
