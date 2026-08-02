package rf;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n extends m {
    public static void d(File file, File target) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new p(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            Intrinsics.checkNotNullParameter(file, "file");
            throw new b(file, target, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new y4(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream m6 = y4.a.m(new FileInputStream(file), file);
        try {
            FileOutputStream i5 = a.a.i(new FileOutputStream(target), target);
            try {
                d5.m(m6, i5);
                i5.close();
                m6.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean e(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.f19229b;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        h hVar = new h(new j(start, direction, null, null, null, 0, 32, null));
        while (true) {
            boolean z5 = true;
            while (hVar.hasNext()) {
                File file = (File) hVar.next();
                if (file.delete() || !file.exists()) {
                    if (z5) {
                        break;
                    }
                }
                z5 = false;
            }
            return z5;
        }
    }
}
