package defpackage;

import com.ironsource.C4376w8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class d28 extends c28 {
    public static void f(C4376w8 c4376w8, File file) {
        c4376w8.getClass();
        file.getClass();
        if (!c4376w8.exists()) {
            throw new idd(c4376w8, null, "The source file doesn't exist.", 2, null);
        }
        if (file.exists() && !file.delete()) {
            throw new k08(c4376w8, file, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (c4376w8.isDirectory()) {
            if (!file.mkdirs()) {
                throw new jz2(c4376w8, file, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(c4376w8);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                m6k.z(fileInputStream, fileOutputStream);
                Unit unit = Unit.a;
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static void g(File file) {
        z55 z55Var = new z55(c28.e(file, FileWalkDirection.b));
        while (true) {
            boolean z = true;
            while (z55Var.hasNext()) {
                File file2 = (File) z55Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return;
        }
    }

    public static String h(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.e0('.', name, "");
    }

    public static File i(File file, String str) {
        int O;
        file.getClass();
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int i = 0;
        int O2 = StringsKt.O(path, c, 0, 4);
        if (O2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (O = StringsKt.O(path, c, 2, 4)) < 0) {
                i = 1;
            } else {
                int O3 = StringsKt.O(path, c, O + 1, 4);
                i = O3 >= 0 ? O3 + 1 : path.length();
            }
        } else if (O2 > 0 && path.charAt(O2 - 1) == ':') {
            i = O2 + 1;
        } else if (O2 == -1 && StringsKt.L(path, ':')) {
            i = path.length();
        }
        if (i > 0) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() == 0 || StringsKt.L(file3, c)) {
            return new File(fc6.k(file2, file3));
        }
        return new File(file3 + c + file2);
    }
}
