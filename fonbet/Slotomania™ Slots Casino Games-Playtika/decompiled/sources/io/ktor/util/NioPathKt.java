package io.ktor.util;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NioPath.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/file/Path;", "relativePath", "combineSafe", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "normalizeAndRelativize", "(Ljava/nio/file/Path;)Ljava/nio/file/Path;", "dropLeadingTopDirs", "Ljava/io/File;", "(Ljava/io/File;Ljava/nio/file/Path;)Ljava/io/File;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NioPathKt {
    public static final Path combineSafe(Path path, Path relativePath) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Path normalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (normalizeAndRelativize.startsWith("..")) {
            throw new InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (normalizeAndRelativize.isAbsolute()) {
            throw new IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        if (path.getNameCount() == 0) {
            return normalizeAndRelativize;
        }
        Path resolve = path.resolve(normalizeAndRelativize);
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(...)");
        return resolve;
    }

    public static final Path normalizeAndRelativize(Path path) {
        Path relativize;
        Path normalize;
        Path dropLeadingTopDirs;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path root = path.getRoot();
        if (root != null && (relativize = root.relativize(path)) != null && (normalize = relativize.normalize()) != null && (dropLeadingTopDirs = dropLeadingTopDirs(normalize)) != null) {
            return dropLeadingTopDirs;
        }
        Path normalize2 = path.normalize();
        Intrinsics.checkNotNullExpressionValue(normalize2, "normalize(...)");
        return dropLeadingTopDirs(normalize2);
    }

    private static final Path dropLeadingTopDirs(Path path) {
        Iterator it = path.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            if (!Intrinsics.areEqual(((Path) next).toString(), "..")) {
                break;
            }
            i++;
        }
        if (i <= 0) {
            return path;
        }
        Path subpath = path.subpath(i, path.getNameCount());
        Intrinsics.checkNotNullExpressionValue(subpath, "subpath(...)");
        return subpath;
    }

    public static final File combineSafe(File file, Path relativePath) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Path normalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (normalizeAndRelativize.startsWith("..")) {
            throw new InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (normalizeAndRelativize.isAbsolute()) {
            throw new IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        return new File(file, normalizeAndRelativize.toString());
    }
}
