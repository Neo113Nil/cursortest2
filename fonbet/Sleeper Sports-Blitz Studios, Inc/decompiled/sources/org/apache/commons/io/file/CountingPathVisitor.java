package org.apache.commons.io.file;

import io.radar.sdk.RadarLogger$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import org.apache.commons.io.file.Counters;

/* loaded from: classes10.dex */
public class CountingPathVisitor extends SimplePathVisitor {
    static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final Counters.PathCounters pathCounters;

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) throws IOException {
        return postVisitDirectory(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), basicFileAttributes);
    }

    public static CountingPathVisitor withBigIntegerCounters() {
        return new CountingPathVisitor(Counters.bigIntegerPathCounters());
    }

    public static CountingPathVisitor withLongCounters() {
        return new CountingPathVisitor(Counters.longPathCounters());
    }

    public CountingPathVisitor(Counters.PathCounters pathCounters) {
        this.pathCounters = (Counters.PathCounters) Objects.requireNonNull(pathCounters, "pathCounter");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountingPathVisitor) {
            return Objects.equals(this.pathCounters, ((CountingPathVisitor) obj).pathCounters);
        }
        return false;
    }

    public Counters.PathCounters getPathCounters() {
        return this.pathCounters;
    }

    public int hashCode() {
        return Objects.hash(this.pathCounters);
    }

    public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResult;
        this.pathCounters.getDirectoryCounter().increment();
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public String toString() {
        return this.pathCounters.toString();
    }

    protected void updateFileCounters(Path path, BasicFileAttributes basicFileAttributes) {
        long size;
        this.pathCounters.getFileCounter().increment();
        Counters.Counter byteCounter = this.pathCounters.getByteCounter();
        size = basicFileAttributes.size();
        byteCounter.add(size);
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        boolean exists;
        FileVisitResult fileVisitResult;
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            updateFileCounters(path, basicFileAttributes);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }
}
