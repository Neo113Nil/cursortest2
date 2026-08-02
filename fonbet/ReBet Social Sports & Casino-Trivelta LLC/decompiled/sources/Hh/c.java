package Hh;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4965a;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4965a = context;
    }

    public final String a(String subDir, String filePath) {
        FileInputStream fileInputStream;
        Intrinsics.checkNotNullParameter(subDir, "subDir");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(subDir.length() > 0 ? new File(this.f4965a.getFilesDir(), subDir) : this.f4965a.getFilesDir(), filePath));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                String readText = TextStreamsKt.readText(new InputStreamReader(fileInputStream, Charsets.UTF_8));
                String str = readText != null ? readText : "";
                fileInputStream.close();
                return str;
            } catch (FileNotFoundException unused) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return "";
            } catch (Exception e10) {
                e = e10;
                fileInputStream2 = fileInputStream;
                e.printStackTrace();
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return "";
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final File[] b(String directoryPath, Comparator comparator) {
        Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        try {
            File[] listFiles = new File(this.f4965a.getFilesDir(), directoryPath).listFiles();
            if (listFiles == null) {
                return listFiles;
            }
            ArraysKt.sortWith(listFiles, comparator);
            return listFiles;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void c(String subDir, String filename, String content) {
        Intrinsics.checkNotNullParameter(subDir, "subDir");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            File file = subDir.length() > 0 ? new File(this.f4965a.getFilesDir(), subDir) : this.f4965a.getFilesDir();
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, filename));
            try {
                byte[] bytes = content.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
