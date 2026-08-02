package org.apache.commons.io.file;

import io.radar.sdk.RadarLogger$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import okio.NioSystemFileSystem$$ExternalSyntheticApiModelOutline0;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.file.Counters;

/* loaded from: classes10.dex */
public final class PathUtils {
    public static final DeleteOption[] EMPTY_DELETE_OPTION_ARRAY = new DeleteOption[0];
    public static final FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY = new FileVisitOption[0];
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY = new LinkOption[0];
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY = new OpenOption[0];

    private static class RelativeSortedPaths {
        final boolean equals;
        final List<Path> relativeFileList1;
        final List<Path> relativeFileList2;

        private RelativeSortedPaths(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
            boolean exists;
            boolean exists2;
            List<Path> list;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.equals = true;
            } else {
                if ((path == null) ^ (path2 == null)) {
                    this.equals = false;
                } else {
                    exists = Files.exists(path, linkOptionArr);
                    exists2 = Files.exists(path2, linkOptionArr);
                    if (exists && exists2) {
                        AccumulatorPathVisitor accumulate = PathUtils.accumulate(path, i, fileVisitOptionArr);
                        AccumulatorPathVisitor accumulate2 = PathUtils.accumulate(path2, i, fileVisitOptionArr);
                        if (accumulate.getDirList().size() != accumulate2.getDirList().size() || accumulate.getFileList().size() != accumulate2.getFileList().size()) {
                            this.equals = false;
                        } else if (!accumulate.relativizeDirectories(path, true, null).equals(accumulate2.relativizeDirectories(path2, true, null))) {
                            this.equals = false;
                        } else {
                            List<Path> relativizeFiles = accumulate.relativizeFiles(path, true, null);
                            List<Path> relativizeFiles2 = accumulate2.relativizeFiles(path2, true, null);
                            this.equals = relativizeFiles.equals(relativizeFiles2);
                            list2 = relativizeFiles;
                            list = relativizeFiles2;
                            this.relativeFileList1 = list2;
                            this.relativeFileList2 = list;
                        }
                    } else {
                        this.equals = (exists || exists2) ? false : true;
                    }
                }
            }
            list = null;
            this.relativeFileList1 = list2;
            this.relativeFileList2 = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AccumulatorPathVisitor accumulate(Path path, int i, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return (AccumulatorPathVisitor) visitFileTree(AccumulatorPathVisitor.withLongCounters(), path, toFileVisitOptionSet(fileVisitOptionArr), i);
    }

    public static Counters.PathCounters cleanDirectory(Path path) throws IOException {
        return cleanDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters cleanDirectory(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return ((CleaningPathVisitor) visitFileTree(new CleaningPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters copyDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        return ((CopyDirectoryVisitor) visitFileTree(new CopyDirectoryVisitor(Counters.longPathCounters(), path, path2, copyOptionArr), path)).getPathCounters();
    }

    public static Path copyFile(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream openStream = url.openStream();
        try {
            Files.copy(openStream, path, copyOptionArr);
            if (openStream != null) {
                openStream.close();
            }
            return path;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Path copyFileToDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path fileName;
        Path resolve;
        Path copy;
        fileName = path.getFileName();
        resolve = path2.resolve(fileName);
        copy = Files.copy(path, resolve, copyOptionArr);
        return copy;
    }

    public static Path copyFileToDirectory(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        Path resolve;
        InputStream openStream = url.openStream();
        try {
            resolve = path.resolve(url.getFile());
            Files.copy(openStream, resolve, copyOptionArr);
            if (openStream != null) {
                openStream.close();
            }
            return path;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Counters.PathCounters countDirectory(Path path) throws IOException {
        return ((CountingPathVisitor) visitFileTree(new CountingPathVisitor(Counters.longPathCounters()), path)).getPathCounters();
    }

    public static Counters.PathCounters delete(Path path) throws IOException {
        return delete(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters delete(Path path, DeleteOption... deleteOptionArr) throws IOException {
        LinkOption linkOption;
        boolean isDirectory;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(path, linkOption);
        return isDirectory ? deleteDirectory(path, deleteOptionArr) : deleteFile(path, deleteOptionArr);
    }

    public static Counters.PathCounters deleteDirectory(Path path) throws IOException {
        return deleteDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteDirectory(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters deleteFile(Path path) throws IOException {
        return deleteFile(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteFile(Path path, DeleteOption... deleteOptionArr) throws IOException {
        LinkOption linkOption;
        boolean isDirectory;
        String path2;
        LinkOption linkOption2;
        boolean exists;
        boolean deleteIfExists;
        LinkOption linkOption3;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(path, linkOption);
        if (isDirectory) {
            RadarLogger$$ExternalSyntheticApiModelOutline0.m$3();
            path2 = path.toString();
            throw NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m(path2);
        }
        Counters.PathCounters longPathCounters = Counters.longPathCounters();
        linkOption2 = LinkOption.NOFOLLOW_LINKS;
        exists = Files.exists(path, linkOption2);
        long size = exists ? Files.size(path) : 0L;
        if (overrideReadOnly(deleteOptionArr) && exists) {
            linkOption3 = LinkOption.NOFOLLOW_LINKS;
            setReadOnly(path, false, linkOption3);
        }
        deleteIfExists = Files.deleteIfExists(path);
        if (deleteIfExists) {
            longPathCounters.getFileCounter().increment();
            longPathCounters.getByteCounter().add(size);
        }
        return longPathCounters;
    }

    private static boolean overrideReadOnly(DeleteOption[] deleteOptionArr) {
        if (deleteOptionArr == null) {
            return false;
        }
        for (DeleteOption deleteOption : deleteOptionArr) {
            if (deleteOption == StandardDeleteOption.OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2) throws IOException {
        return directoryAndFileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        boolean exists;
        Path resolve;
        Path resolve2;
        boolean exists2;
        if (path == null && path2 == null) {
            return true;
        }
        if ((path == null) ^ (path2 == null)) {
            return false;
        }
        exists = Files.exists(path, new LinkOption[0]);
        if (!exists) {
            exists2 = Files.exists(path2, new LinkOption[0]);
            if (!exists2) {
                return true;
            }
        }
        RelativeSortedPaths relativeSortedPaths = new RelativeSortedPaths(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
        if (!relativeSortedPaths.equals) {
            return false;
        }
        List<Path> list = relativeSortedPaths.relativeFileList1;
        List<Path> list2 = relativeSortedPaths.relativeFileList2;
        Iterator<Path> it = list.iterator();
        while (it.hasNext()) {
            Path m13289m = RadarLogger$$ExternalSyntheticApiModelOutline0.m13289m((Object) it.next());
            if (Collections.binarySearch(list2, m13289m) > -1) {
                resolve = path.resolve(m13289m);
                resolve2 = path2.resolve(m13289m);
                if (!fileContentEquals(resolve, resolve2, linkOptionArr, openOptionArr)) {
                    return false;
                }
            } else {
                throw new IllegalStateException("Unexpected mismatch.");
            }
        }
        return true;
    }

    public static boolean directoryContentEquals(Path path, Path path2) throws IOException {
        return directoryContentEquals(path, path2, Integer.MAX_VALUE, EMPTY_LINK_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean directoryContentEquals(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return new RelativeSortedPaths(path, path2, i, linkOptionArr, fileVisitOptionArr).equals;
    }

    public static boolean fileContentEquals(Path path, Path path2) throws IOException {
        return fileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY);
    }

    public static boolean fileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr) throws IOException {
        Path normalize;
        Path normalize2;
        boolean exists;
        boolean exists2;
        boolean isDirectory;
        boolean isDirectory2;
        long size;
        long size2;
        boolean equals;
        InputStream newInputStream;
        InputStream newInputStream2;
        if (path == null && path2 == null) {
            return true;
        }
        if ((path == null) ^ (path2 == null)) {
            return false;
        }
        normalize = path.normalize();
        normalize2 = path2.normalize();
        exists = Files.exists(normalize, linkOptionArr);
        exists2 = Files.exists(normalize2, linkOptionArr);
        if (exists != exists2) {
            return false;
        }
        if (!exists) {
            return true;
        }
        isDirectory = Files.isDirectory(normalize, linkOptionArr);
        if (isDirectory) {
            throw new IOException("Can't compare directories, only files: " + normalize);
        }
        isDirectory2 = Files.isDirectory(normalize2, linkOptionArr);
        if (isDirectory2) {
            throw new IOException("Can't compare directories, only files: " + normalize2);
        }
        size = Files.size(normalize);
        size2 = Files.size(normalize2);
        if (size != size2) {
            return false;
        }
        equals = path.equals(path2);
        if (equals) {
            return true;
        }
        newInputStream = Files.newInputStream(normalize, openOptionArr);
        try {
            newInputStream2 = Files.newInputStream(normalize2, openOptionArr);
            try {
                boolean contentEquals = IOUtils.contentEquals(newInputStream, newInputStream2);
                if (newInputStream2 != null) {
                    newInputStream2.close();
                }
                if (newInputStream != null) {
                    newInputStream.close();
                }
                return contentEquals;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newInputStream != null) {
                    try {
                        newInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static List<AclEntry> getAclEntryList(Path path) throws IOException {
        FileAttributeView fileAttributeView;
        List<AclEntry> acl;
        fileAttributeView = Files.getFileAttributeView(path, NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m$1(), new LinkOption[0]);
        AclFileAttributeView m = NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m((Object) fileAttributeView);
        if (m == null) {
            return null;
        }
        acl = m.getAcl();
        return acl;
    }

    public static boolean isEmpty(Path path) throws IOException {
        boolean isDirectory;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        return isDirectory ? isEmptyDirectory(path) : isEmptyFile(path);
    }

    public static boolean isEmptyDirectory(Path path) throws IOException {
        DirectoryStream newDirectoryStream;
        Iterator it;
        newDirectoryStream = Files.newDirectoryStream(path);
        try {
            it = newDirectoryStream.iterator();
            if (it.hasNext()) {
                if (newDirectoryStream != null) {
                    newDirectoryStream.close();
                }
                return false;
            }
            if (newDirectoryStream == null) {
                return true;
            }
            newDirectoryStream.close();
            return true;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean isEmptyFile(Path path) throws IOException {
        long size;
        size = Files.size(path);
        return size <= 0;
    }

    static List<Path> relativize(Collection<Path> collection, final Path path, boolean z, Comparator<? super Path> comparator) {
        Stream<Path> stream = collection.stream();
        path.getClass();
        Stream map = stream.map(new Function() { // from class: org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda20
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Path relativize;
                relativize = path.relativize((Path) obj);
                return relativize;
            }
        });
        if (z) {
            map = comparator == null ? map.sorted() : map.sorted(comparator);
        }
        return (List) map.collect(Collectors.toList());
    }

    public static Path setReadOnly(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        FileAttributeView fileAttributeView;
        FileAttributeView fileAttributeView2;
        PosixFileAttributes readAttributes;
        Set permissions;
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        PosixFilePermission posixFilePermission3;
        Path posixFilePermissions;
        fileAttributeView = Files.getFileAttributeView(path, NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m$2(), linkOptionArr);
        DosFileAttributeView m15299m = NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m15299m((Object) fileAttributeView);
        if (m15299m != null) {
            m15299m.setReadOnly(z);
            return path;
        }
        fileAttributeView2 = Files.getFileAttributeView(path, NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m$3(), linkOptionArr);
        PosixFileAttributeView m15302m = NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m15302m((Object) fileAttributeView2);
        if (m15302m != null) {
            readAttributes = m15302m.readAttributes();
            permissions = readAttributes.permissions();
            posixFilePermission = PosixFilePermission.OWNER_WRITE;
            permissions.remove(posixFilePermission);
            posixFilePermission2 = PosixFilePermission.GROUP_WRITE;
            permissions.remove(posixFilePermission2);
            posixFilePermission3 = PosixFilePermission.OTHERS_WRITE;
            permissions.remove(posixFilePermission3);
            posixFilePermissions = Files.setPosixFilePermissions(path, permissions);
            return posixFilePermissions;
        }
        throw new IOException("No DosFileAttributeView or PosixFileAttributeView for " + path);
    }

    static Set<FileVisitOption> toFileVisitOptionSet(FileVisitOption... fileVisitOptionArr) {
        if (fileVisitOptionArr == null) {
            return EnumSet.noneOf(NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m$4());
        }
        return (Set) Arrays.stream(fileVisitOptionArr).collect(Collectors.toSet());
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path) throws IOException {
        Files.walkFileTree(path, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path, Set<FileVisitOption> set, int i) throws IOException {
        Files.walkFileTree(path, set, i, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, String str, String... strArr) throws IOException {
        Path path;
        path = Paths.get(str, strArr);
        return (T) visitFileTree(t, path);
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, URI uri) throws IOException {
        Path path;
        path = Paths.get(uri);
        return (T) visitFileTree(t, path);
    }

    private PathUtils() {
    }
}
