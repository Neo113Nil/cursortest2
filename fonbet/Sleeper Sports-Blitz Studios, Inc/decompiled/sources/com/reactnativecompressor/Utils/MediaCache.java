package com.reactnativecompressor.Utils;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MediaCache.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/reactnativecompressor/Utils/MediaCache;", "", "<init>", "()V", "TAG", "", "completedImagePaths", "", "addCompletedImagePath", "", "imagePath", "removeCompletedImagePath", "cleanupCache", "deleteFile", "filePath", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MediaCache {
    private static final String TAG = "MediaCache";
    public static final MediaCache INSTANCE = new MediaCache();
    private static final List<String> completedImagePaths = new ArrayList();

    private MediaCache() {
    }

    public final void addCompletedImagePath(String imagePath) {
        if (imagePath != null) {
            completedImagePaths.add(imagePath);
            Log.d(TAG, "Successfully added image path: " + imagePath);
        }
    }

    @JvmStatic
    public static final void removeCompletedImagePath(String imagePath) {
        if (imagePath != null) {
            List<String> list = completedImagePaths;
            if (list.contains(imagePath)) {
                list.remove(imagePath);
                if (StringsKt.startsWith$default(imagePath, "file://", false, 2, (Object) null)) {
                    imagePath = imagePath.substring(7);
                    Intrinsics.checkNotNullExpressionValue(imagePath, "substring(...)");
                }
                File file = new File(imagePath);
                if (file.exists()) {
                    if (file.delete()) {
                        Log.d(TAG, "Successfully deleted image file: " + imagePath);
                        return;
                    } else {
                        Log.d(TAG, "Failed to delete image file: " + imagePath);
                        return;
                    }
                }
                Log.d(TAG, "Image file not found: " + imagePath);
                return;
            }
            Log.d(TAG, "Image path not found in the completedImagePaths list: " + imagePath);
        }
    }

    public final void cleanupCache() {
        for (String str : completedImagePaths) {
            File file = new File(str);
            if (!file.exists()) {
                Log.d(TAG, "Image file not found during cache cleanup: " + str);
            } else if (file.delete()) {
                Log.d(TAG, "Successfully deleted image file during cache cleanup: " + str);
            } else {
                Log.d(TAG, "Failed to delete image file during cache cleanup: " + str);
            }
        }
        completedImagePaths.clear();
    }

    public final void deleteFile(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(StringsKt.replace$default(filePath, "file://", "", false, 4, (Object) null));
        if (file.exists()) {
            if (file.delete()) {
                System.out.println((Object) "File deleted successfully.");
                return;
            } else {
                System.out.println((Object) "File couldn't be deleted.");
                return;
            }
        }
        System.out.println((Object) "File not found.");
    }
}
