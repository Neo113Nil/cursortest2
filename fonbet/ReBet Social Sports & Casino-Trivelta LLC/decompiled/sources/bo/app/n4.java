package bo.app;

import android.content.Context;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n4 {
    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            final File file = new File(context.getCacheDir(), "appboy.imageloader.lru.cache");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.p6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.n4.a(file);
                }
            }, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(file);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.q6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.n4.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(File file) {
        return "Deleting lru image cache directory at: " + file.getAbsolutePath();
    }

    public static final String a() {
        return "Failed to delete stored data in image loader";
    }

    public static File a(Context context, String uniqueName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
        return new File(context.getCacheDir().getPath() + File.separator + uniqueName);
    }
}
