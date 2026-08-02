package org.apache.commons.io.file;

import io.radar.sdk.RadarLogger$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.file.Counters;

/* loaded from: classes10.dex */
public class AccumulatorPathVisitor extends CountingPathVisitor {
    private final List<Path> dirList;
    private final List<Path> fileList;

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), basicFileAttributes);
    }

    public static AccumulatorPathVisitor withBigIntegerCounters() {
        return new AccumulatorPathVisitor(Counters.bigIntegerPathCounters());
    }

    public static AccumulatorPathVisitor withLongCounters() {
        return new AccumulatorPathVisitor(Counters.longPathCounters());
    }

    public AccumulatorPathVisitor(Counters.PathCounters pathCounters) {
        super(pathCounters);
        this.dirList = new ArrayList();
        this.fileList = new ArrayList();
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof AccumulatorPathVisitor)) {
            return false;
        }
        AccumulatorPathVisitor accumulatorPathVisitor = (AccumulatorPathVisitor) obj;
        return Objects.equals(this.dirList, accumulatorPathVisitor.dirList) && Objects.equals(this.fileList, accumulatorPathVisitor.fileList);
    }

    public List<Path> getDirList() {
        return this.dirList;
    }

    public List<Path> getFileList() {
        return this.fileList;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
        return (super.hashCode() * 31) + Objects.hash(this.dirList, this.fileList);
    }

    public List<Path> relativizeDirectories(Path path, boolean z, Comparator<? super Path> comparator) {
        return PathUtils.relativize(getDirList(), path, z, comparator);
    }

    public List<Path> relativizeFiles(Path path, boolean z, Comparator<? super Path> comparator) {
        return PathUtils.relativize(getFileList(), path, z, comparator);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        boolean isDirectory;
        Path normalize;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        List<Path> list = isDirectory ? this.dirList : this.fileList;
        normalize = path.normalize();
        list.add(normalize);
        return super.visitFile(path, basicFileAttributes);
    }
}
