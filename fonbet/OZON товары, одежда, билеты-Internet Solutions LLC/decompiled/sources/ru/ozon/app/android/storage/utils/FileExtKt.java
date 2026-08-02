package ru.ozon.app.android.storage.utils;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljava/io/File;", "", "recursively", "createDirectory", "(Ljava/io/File;Z)Ljava/io/File;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$CompressFormat;", "format", "", "quality", "", "writeBitmap", "(Ljava/io/File;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)V", "storage_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileExtKt {
    @NotNull
    public static final File createDirectory(@NotNull File file, boolean z11) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (!file.exists()) {
            if (z11) {
                file.mkdirs();
                return file;
            }
            file.mkdir();
        }
        return file;
    }

    public static final void writeBitmap(@NotNull File file, @NotNull Bitmap bitmap, @NotNull Bitmap.CompressFormat format, int i11) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(format, "format");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(format, i11, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.f71690a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static /* synthetic */ void writeBitmap$default(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 90;
        }
        writeBitmap(file, bitmap, compressFormat, i11);
    }
}
