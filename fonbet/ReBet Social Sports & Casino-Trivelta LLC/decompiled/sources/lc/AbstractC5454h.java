package lc;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: lc.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5454h {
    public static void a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        Throwable th2;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                fileChannel = fileOutputStream.getChannel();
                try {
                    channel.transferTo(0L, channel.size(), fileChannel);
                    try {
                        channel.close();
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel2 = channel;
                    if (fileChannel2 != null) {
                        try {
                            fileChannel2.close();
                        } finally {
                        }
                    }
                    if (fileChannel == null) {
                        throw th2;
                    }
                    fileChannel.close();
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                fileChannel = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            fileChannel = null;
        }
    }

    public static ArrayList b(Context context) {
        ArrayList arrayList = new ArrayList();
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
        } catch (Exception e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }

    public static File c(ArrayList arrayList) {
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        Iterator it = arrayList.iterator();
        long j10 = -1;
        while (it.hasNext()) {
            File file2 = (File) it.next();
            long e10 = e(file2);
            if (e10 > j10) {
                file = file2;
                j10 = e10;
            }
        }
        return file != null ? file : (File) arrayList.get(0);
    }

    public static long d(File file) {
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        try {
            path = file.toPath();
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) AbstractC5450d.a(), new LinkOption[0]);
            creationTime = readAttributes.creationTime();
            millis = creationTime.toMillis();
            return millis;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static long e(File file) {
        try {
            return Build.VERSION.SDK_INT >= 26 ? d(file) : file.lastModified();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static boolean f(Context context) {
        return context.getDatabasePath("RKStorage").exists();
    }

    public static void g(Context context) {
        ArrayList b10;
        File c10;
        if (f(context) || (c10 = c((b10 = b(context)))) == null) {
            return;
        }
        try {
            C5457k.U(context).J();
            a(new FileInputStream(c10), new FileOutputStream(context.getDatabasePath("RKStorage")));
            c10.getName();
            try {
                Iterator it = b10.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.delete()) {
                        file.getName();
                    } else {
                        file.getName();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            c10.getName();
            e11.printStackTrace();
        }
    }
}
