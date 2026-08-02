package org.apache.commons.io.file;

import io.radar.sdk.RadarLogger$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.file.Counters;

/* loaded from: classes10.dex */
public class DeletingPathVisitor extends CountingPathVisitor {
    private final boolean overrideReadOnly;
    private final String[] skip;

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) throws IOException {
        return postVisitDirectory(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), basicFileAttributes);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), basicFileAttributes);
    }

    public static DeletingPathVisitor withBigIntegerCounters() {
        return new DeletingPathVisitor(Counters.bigIntegerPathCounters(), new String[0]);
    }

    public static DeletingPathVisitor withLongCounters() {
        return new DeletingPathVisitor(Counters.longPathCounters(), new String[0]);
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, DeleteOption[] deleteOptionArr, String... strArr) {
        super(pathCounters);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : EMPTY_STRING_ARRAY;
        Arrays.sort(strArr2);
        this.skip = strArr2;
        this.overrideReadOnly = StandardDeleteOption.overrideReadOnly(deleteOptionArr);
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, String... strArr) {
        this(pathCounters, PathUtils.EMPTY_DELETE_OPTION_ARRAY, strArr);
    }

    private boolean accept(Path path) {
        Path fileName;
        String[] strArr = this.skip;
        fileName = path.getFileName();
        return Arrays.binarySearch(strArr, Objects.toString(fileName, null)) < 0;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        DeletingPathVisitor deletingPathVisitor = (DeletingPathVisitor) obj;
        return this.overrideReadOnly == deletingPathVisitor.overrideReadOnly && Arrays.equals(this.skip, deletingPathVisitor.skip);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.skip)) * 31) + Objects.hash(Boolean.valueOf(this.overrideReadOnly));
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        if (PathUtils.isEmptyDirectory(path)) {
            Files.deleteIfExists(path);
        }
        return super.postVisitDirectory(path, iOException);
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        super.preVisitDirectory((Object) path, basicFileAttributes);
        if (accept(path)) {
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        LinkOption linkOption;
        boolean exists;
        LinkOption linkOption2;
        if (accept(path)) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(path, linkOption);
            if (exists) {
                if (this.overrideReadOnly) {
                    linkOption2 = LinkOption.NOFOLLOW_LINKS;
                    PathUtils.setReadOnly(path, false, linkOption2);
                }
                Files.deleteIfExists(path);
            }
        }
        updateFileCounters(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
