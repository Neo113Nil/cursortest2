package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.margelo.nitro.core.ArrayBuffer$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class AsyncStorageExpoMigration {
    static final String LOG_TAG = "AsyncStorageExpoMigration";

    public static void migrate(Context context) {
        if (isAsyncStorageDatabaseCreated(context)) {
            return;
        }
        ArrayList<File> expoDatabases = getExpoDatabases(context);
        File lastModifiedFile = getLastModifiedFile(expoDatabases);
        if (lastModifiedFile == null) {
            Log.v(LOG_TAG, "No scoped database found");
            return;
        }
        try {
            ReactDatabaseSupplier.getInstance(context).get();
            copyFile(new FileInputStream(lastModifiedFile), new FileOutputStream(context.getDatabasePath(ReactDatabaseSupplier.DATABASE_NAME)));
            Log.v(LOG_TAG, "Migrated most recently modified database " + lastModifiedFile.getName() + " to RKStorage");
            try {
                Iterator<File> it = expoDatabases.iterator();
                while (it.hasNext()) {
                    File next = it.next();
                    if (next.delete()) {
                        Log.v(LOG_TAG, "Deleted scoped database " + next.getName());
                    } else {
                        Log.v(LOG_TAG, "Failed to delete scoped database " + next.getName());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Log.v(LOG_TAG, "Completed the scoped AsyncStorage migration");
        } catch (Exception e2) {
            Log.v(LOG_TAG, "Failed to migrate scoped database " + lastModifiedFile.getName());
            e2.printStackTrace();
        }
    }

    private static boolean isAsyncStorageDatabaseCreated(Context context) {
        return context.getDatabasePath(ReactDatabaseSupplier.DATABASE_NAME).exists();
    }

    private static ArrayList<File> getExpoDatabases(Context context) {
        ArrayList<File> arrayList = new ArrayList<>();
        try {
            File[] listFiles = context.getDatabasePath("noop").getParentFile().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().startsWith("RKStorage-scoped-experience-") && !file.getName().endsWith("-journal")) {
                        arrayList.add(file);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    private static File getLastModifiedFile(ArrayList<File> files) {
        File file = null;
        if (files.size() == 0) {
            return null;
        }
        Iterator<File> it = files.iterator();
        long j = -1;
        while (it.hasNext()) {
            File next = it.next();
            long lastModifiedTimeInMillis = getLastModifiedTimeInMillis(next);
            if (lastModifiedTimeInMillis > j) {
                file = next;
                j = lastModifiedTimeInMillis;
            }
        }
        return file != null ? file : files.get(0);
    }

    private static long getLastModifiedTimeInMillis(File file) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return getLastModifiedTimeFromBasicFileAttrs(file);
            }
            return file.lastModified();
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    private static long getLastModifiedTimeFromBasicFileAttrs(File file) {
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        try {
            path = file.toPath();
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) ArrayBuffer$$ExternalSyntheticApiModelOutline0.m11390m(), new LinkOption[0]);
            creationTime = readAttributes.creationTime();
            millis = creationTime.toMillis();
            return millis;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static void copyFile(FileInputStream fromFile, FileOutputStream toFile) throws IOException {
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = fromFile.getChannel();
            try {
                fileChannel = toFile.getChannel();
                try {
                    channel.transferTo(0L, channel.size(), fileChannel);
                    if (channel != null) {
                        try {
                            channel.close();
                        } finally {
                        }
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel2 = channel;
                    if (fileChannel2 != null) {
                        try {
                            fileChannel2.close();
                        } finally {
                        }
                    }
                    if (fileChannel == null) {
                        throw th;
                    }
                    fileChannel.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileChannel = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }
}
