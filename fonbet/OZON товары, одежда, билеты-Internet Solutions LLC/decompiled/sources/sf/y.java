package sf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.D;

/* loaded from: classes10.dex */
public final class y extends x {
    private static Long n(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // sf.x, sf.AbstractC9688n
    public final C9687m h(@NotNull D path) {
        D d11;
        Intrinsics.checkNotNullParameter(path, "path");
        Path nioPath = path.i();
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = D.f98654b;
                Intrinsics.checkNotNullParameter(readSymbolicLink, "<this>");
                d11 = D.a.a(readSymbolicLink.toString(), false);
            } else {
                d11 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long n11 = creationTime != null ? n(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long n12 = lastModifiedTime != null ? n(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new C9687m(isRegularFile, isDirectory, d11, valueOf, n11, n12, lastAccessTime != null ? n(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // sf.x
    public final void l(@NotNull D source, @NotNull D target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.i(), target.i(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e11) {
            throw new FileNotFoundException(e11.getMessage());
        }
    }

    @Override // sf.x
    @NotNull
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
