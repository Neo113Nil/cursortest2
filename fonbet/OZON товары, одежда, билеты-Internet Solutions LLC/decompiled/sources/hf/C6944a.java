package hf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.K;
import sf.M;
import sf.z;

/* renamed from: hf.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6944a implements InterfaceC6945b {
    @Override // hf.InterfaceC6945b
    public final void a(@NotNull File directory) throws IOException {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File[] listFiles = directory.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + directory);
        }
        for (File file : listFiles) {
            Intrinsics.checkNotNullExpressionValue(file, "file");
            if (file.isDirectory()) {
                a(file);
            }
            if (!file.delete()) {
                throw new IOException("failed to delete " + file);
            }
        }
    }

    @Override // hf.InterfaceC6945b
    public final void b(@NotNull File from, @NotNull File to) throws IOException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        c(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    @Override // hf.InterfaceC6945b
    public final void c(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    @Override // hf.InterfaceC6945b
    public final boolean d(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists();
    }

    @Override // hf.InterfaceC6945b
    @NotNull
    public final K e(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            return z.a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return z.a(file);
        }
    }

    @Override // hf.InterfaceC6945b
    public final long f(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.length();
    }

    @Override // hf.InterfaceC6945b
    @NotNull
    public final M g(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        return z.j(file);
    }

    @Override // hf.InterfaceC6945b
    @NotNull
    public final K h(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            return z.h(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return z.h(file);
        }
    }

    @NotNull
    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
