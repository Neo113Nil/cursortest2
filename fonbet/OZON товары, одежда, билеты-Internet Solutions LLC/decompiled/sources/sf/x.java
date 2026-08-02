package sf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class x extends AbstractC9688n {
    @Override // sf.AbstractC9688n
    public final void b(@NotNull D dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.h().mkdir()) {
            return;
        }
        C9687m h11 = h(dir);
        if (h11 == null || !h11.e()) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override // sf.AbstractC9688n
    public final void c(@NotNull D path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File h11 = path.h();
        if (h11.delete() || !h11.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final List<D> f(@NotNull D dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File h11 = dir.h();
        String[] list = h11.list();
        if (list == null) {
            if (h11.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String it : list) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(dir.g(it));
        }
        C7714v.F0(arrayList);
        return arrayList;
    }

    @Override // sf.AbstractC9688n
    public C9687m h(@NotNull D path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File h11 = path.h();
        boolean isFile = h11.isFile();
        boolean isDirectory = h11.isDirectory();
        long lastModified = h11.lastModified();
        long length = h11.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || h11.exists()) {
            return new C9687m(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final AbstractC9686l i(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new w(true, new RandomAccessFile(file.h(), "rw"));
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final K j(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return z.h(file.h());
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final M k(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return z.j(file.h());
    }

    public void l(@NotNull D source, @NotNull D target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.h().renameTo(target.h())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @NotNull
    public final AbstractC9686l m(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new w(false, new RandomAccessFile(file.h(), "r"));
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }
}
