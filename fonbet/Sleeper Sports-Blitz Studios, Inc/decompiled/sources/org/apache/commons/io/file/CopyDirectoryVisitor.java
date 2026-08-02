package org.apache.commons.io.file;

import io.radar.sdk.RadarLogger$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.io.file.Counters;

/* loaded from: classes10.dex */
public class CopyDirectoryVisitor extends CountingPathVisitor {
    private static final CopyOption[] EMPTY_COPY_OPTIONS = new CopyOption[0];
    private final CopyOption[] copyOptions;
    private final Path sourceDirectory;
    private final Path targetDirectory;

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), basicFileAttributes);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile(RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m(obj), basicFileAttributes);
    }

    public CopyDirectoryVisitor(Counters.PathCounters pathCounters, Path path, Path path2, CopyOption... copyOptionArr) {
        super(pathCounters);
        this.sourceDirectory = path;
        this.targetDirectory = path2;
        this.copyOptions = copyOptionArr == null ? EMPTY_COPY_OPTIONS : (CopyOption[]) copyOptionArr.clone();
    }

    protected void copy(Path path, Path path2) throws IOException {
        Files.copy(path, path2, this.copyOptions);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        CopyDirectoryVisitor copyDirectoryVisitor = (CopyDirectoryVisitor) obj;
        return Arrays.equals(this.copyOptions, copyDirectoryVisitor.copyOptions) && Objects.equals(this.sourceDirectory, copyDirectoryVisitor.sourceDirectory) && Objects.equals(this.targetDirectory, copyDirectoryVisitor.targetDirectory);
    }

    public CopyOption[] getCopyOptions() {
        return (CopyOption[]) this.copyOptions.clone();
    }

    public Path getSourceDirectory() {
        return this.sourceDirectory;
    }

    public Path getTargetDirectory() {
        return this.targetDirectory;
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.copyOptions)) * 31) + Objects.hash(this.sourceDirectory, this.targetDirectory);
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path relativize;
        Path resolve;
        boolean notExists;
        Path path2 = this.targetDirectory;
        relativize = this.sourceDirectory.relativize(path);
        resolve = path2.resolve(relativize);
        notExists = Files.notExists(resolve, new LinkOption[0]);
        if (notExists) {
            Files.createDirectory(resolve, new FileAttribute[0]);
        }
        return super.preVisitDirectory((Object) path, basicFileAttributes);
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path relativize;
        Path resolve;
        Path path2 = this.targetDirectory;
        relativize = this.sourceDirectory.relativize(path);
        resolve = path2.resolve(relativize);
        copy(path, resolve);
        return super.visitFile(resolve, basicFileAttributes);
    }
}
