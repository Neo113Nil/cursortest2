package io.radar.sdk.util;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: RadarFileStorage.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ3\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0010j\b\u0012\u0004\u0012\u00020\r`\u0011¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lio/radar/sdk/util/RadarFileStorage;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deleteFileAtPath", "", "subDir", "", "filePath", "readFileAtPath", "sortedFilesInDirectory", "", "Ljava/io/File;", "directoryPath", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/String;Ljava/util/Comparator;)[Ljava/io/File;", "writeData", "", "filename", "content", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarFileStorage {
    private final Context context;

    public RadarFileStorage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ void writeData$default(RadarFileStorage radarFileStorage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        radarFileStorage.writeData(str, str2, str3);
    }

    public final void writeData(String subDir, String filename, String content) {
        Intrinsics.checkNotNullParameter(subDir, "subDir");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            File file = subDir.length() > 0 ? new File(this.context.getFilesDir(), subDir) : this.context.getFilesDir();
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, filename));
            try {
                byte[] bytes = content.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                fileOutputStream.write(bytes);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ String readFileAtPath$default(RadarFileStorage radarFileStorage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return radarFileStorage.readFileAtPath(str, str2);
    }

    public final String readFileAtPath(String subDir, String filePath) {
        FileInputStream fileInputStream;
        Intrinsics.checkNotNullParameter(subDir, "subDir");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(subDir.length() > 0 ? new File(this.context.getFilesDir(), subDir) : this.context.getFilesDir(), filePath));
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
        } catch (Exception e) {
            e = e;
        }
        try {
            String readText = TextStreamsKt.readText(new InputStreamReader(fileInputStream, Charsets.UTF_8));
            String str = readText != null ? readText : "";
            fileInputStream.close();
            return str;
        } catch (FileNotFoundException unused2) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return "";
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public static /* synthetic */ boolean deleteFileAtPath$default(RadarFileStorage radarFileStorage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return radarFileStorage.deleteFileAtPath(str, str2);
    }

    public final boolean deleteFileAtPath(String subDir, String filePath) {
        Intrinsics.checkNotNullParameter(subDir, "subDir");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            return new File(subDir.length() > 0 ? new File(this.context.getFilesDir(), subDir) : this.context.getFilesDir(), filePath).delete();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final File[] sortedFilesInDirectory(String directoryPath, Comparator<File> comparator) {
        Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        try {
            File[] listFiles = new File(this.context.getFilesDir(), directoryPath).listFiles();
            if (listFiles != null) {
                ArraysKt.sortWith(listFiles, comparator);
            }
            return listFiles;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
