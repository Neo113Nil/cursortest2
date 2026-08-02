package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class add extends uha {
    public static Long T(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.uha, defpackage.s18
    public final void f(uae uaeVar, uae uaeVar2) {
        uaeVar.getClass();
        uaeVar2.getClass();
        try {
            Path path = Paths.get(uaeVar.a.w(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(uaeVar2.a.w(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            is8.e("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.uha, defpackage.s18
    public final ux4 p(uae uaeVar) {
        uae uaeVar2;
        uaeVar.getClass();
        Path path = Paths.get(uaeVar.a.w(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = uae.b;
                uaeVar2 = tnf.j(readSymbolicLink.toString(), false);
            } else {
                uaeVar2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long T = creationTime != null ? T(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long T2 = lastModifiedTime != null ? T(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new ux4(isRegularFile, isDirectory, uaeVar2, valueOf, T, T2, lastAccessTime != null ? T(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.uha
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
