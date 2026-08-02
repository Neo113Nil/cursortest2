package com.socure.docv.capturesdk.common.workers;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageWorker.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/workers/ImageWorker;", "", "context", "Landroid/content/Context;", "baseDirName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "baseDir", "Ljava/io/File;", "clearDir", "", "saveToDisk", "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "fileName", "writeToInternalStorage", "file", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageWorker {
    private final File baseDir;

    public ImageWorker(Context context, String baseDirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseDirName, "baseDirName");
        this.baseDir = context.getExternalFilesDir(baseDirName);
    }

    public /* synthetic */ ImageWorker(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? ImageWorkerKt.DBG_IMG_BASE_DIR : str);
    }

    public final Uri saveToDisk(Bitmap bitmap, String fileName) {
        Unit unit;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(this.baseDir, fileName);
        LoggerKt.logDetailed("SDLT_IW", "Trying to save image: " + fileName);
        if (bitmap == null) {
            unit = null;
        } else if (bitmap.isRecycled()) {
            LoggerKt.logE$default("SDLT_IW", "bitmap is recycled", null, 4, null);
            unit = Unit.INSTANCE;
        } else {
            Uri writeToInternalStorage = writeToInternalStorage(bitmap, file);
            LoggerKt.logD("SDLT_IW", "wrote image to disk (" + file.getAbsolutePath() + "): " + writeToInternalStorage);
            return writeToInternalStorage;
        }
        if (unit == null) {
            LoggerKt.logDetailed("SDLT_IW", "Bitmap received was null");
        }
        return null;
    }

    private final Uri writeToInternalStorage(Bitmap bitmap, File file) {
        try {
            if (file.exists()) {
                LoggerKt.logE$default("SDLT_IW", "Deleting the existing file", null, 4, null);
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                Uri fromFile = Uri.fromFile(file);
                CloseableKt.closeFinally(fileOutputStream, null);
                return fromFile;
            } finally {
            }
        } catch (IOException e) {
            LoggerKt.logE$default("SDLT_IW", "IOEx in writeToDisk: " + e, null, 4, null);
            return null;
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_IW", "Th caught in writeToDisk: " + th, null, 4, null);
            return null;
        }
    }

    public final void clearDir() {
        try {
            File file = this.baseDir;
            LoggerKt.logD("SDLT_IW", "Deleted files: " + (file != null ? Boolean.valueOf(FilesKt.deleteRecursively(file)) : null));
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_IW", "Clearing base dir hit error: " + th, null, 4, null);
        }
    }
}
