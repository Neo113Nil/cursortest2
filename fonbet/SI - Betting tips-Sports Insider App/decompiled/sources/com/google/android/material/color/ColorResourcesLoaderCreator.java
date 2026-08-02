package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.w0;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    public static ResourcesLoader create(@NonNull Context context, @NonNull Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        try {
            byte[] create = ColorResourcesTableCreator.create(context, map);
            Log.i(TAG, "Table created, length: " + create.length);
            if (create.length != 0) {
                try {
                    fileDescriptor = Os.memfd_create("temp.arsc", 0);
                    try {
                        if (fileDescriptor != null) {
                            FileOutputStream j = a.a.j(new FileOutputStream(fileDescriptor), fileDescriptor);
                            try {
                                j.write(create);
                                ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                                try {
                                    ResourcesLoader resourcesLoader = new ResourcesLoader();
                                    resourcesLoader.addProvider(ResourcesProvider.loadFromTable(dup, null));
                                    if (dup != null) {
                                        dup.close();
                                    }
                                    j.close();
                                    Os.close(fileDescriptor);
                                    return resourcesLoader;
                                } finally {
                                }
                            } finally {
                            }
                        }
                        w0.m(TAG, "Cannot create memory file descriptor.");
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = null;
                }
            }
            return null;
        } catch (Exception e7) {
            w0.e(TAG, "Failed to create the ColorResourcesTableCreator.", e7);
            return null;
        }
    }
}
