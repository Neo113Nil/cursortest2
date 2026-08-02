package okio.internal;

import bg.i;
import bg.j;
import bg.k;
import d9.e;
import gf.d;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.Okio;
import okio.Path;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aH\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lokio/FileSystem;", "Lokio/Path;", "path", "Lokio/FileMetadata;", "commonMetadata", "(Lokio/FileSystem;Lokio/Path;)Lokio/FileMetadata;", "", "commonExists", "(Lokio/FileSystem;Lokio/Path;)Z", "dir", "mustCreate", "", "commonCreateDirectories", "(Lokio/FileSystem;Lokio/Path;Z)V", AdRevenueConstants.SOURCE_KEY, "target", "commonCopy", "(Lokio/FileSystem;Lokio/Path;Lokio/Path;)V", "fileOrDirectory", "mustExist", "commonDeleteRecursively", "followSymlinks", "Lkotlin/sequences/Sequence;", "commonListRecursively", "(Lokio/FileSystem;Lokio/Path;Z)Lkotlin/sequences/Sequence;", "Lbg/j;", "fileSystem", "Lkotlin/collections/l;", "stack", "postorder", "collectRecursively", "(Lbg/j;Lokio/FileSystem;Lkotlin/collections/l;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "symlinkTarget", "(Lokio/FileSystem;Lokio/Path;)Lokio/Path;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n58#2,4:156\n58#2,22:160\n66#2,10:182\n62#2,3:192\n77#2,3:195\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,4\n66#1:160,22\n65#1:182,10\n65#1:192,3\n65#1:195,3\n*E\n"})
/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes3.dex */
public final class FileSystem {
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f7, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f9, code lost:
    
        if (r12 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fb, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0102, code lost:
    
        r3 = r1;
        r1 = r6;
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c A[Catch: all -> 0x014f, TRY_LEAVE, TryCatch #3 {all -> 0x014f, blocks: (B:22:0x0106, B:24:0x010c), top: B:21:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0148 -> B:20:0x0080). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectRecursively(@NotNull j jVar, @NotNull okio.FileSystem fileSystem, @NotNull l lVar, @NotNull Path path, boolean z5, boolean z7, @NotNull Continuation<? super Unit> continuation) {
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$1;
        int i5;
        l lVar2;
        j jVar2;
        boolean z10;
        okio.FileSystem fileSystem2;
        List<Path> listOrNull;
        int i10;
        boolean z11;
        l lVar3;
        boolean z12;
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$12;
        okio.FileSystem fileSystem3;
        j jVar3;
        Path path2 = path;
        boolean z13 = z7;
        if (continuation instanceof FileSystem$collectRecursively$1) {
            fileSystem$collectRecursively$1 = (FileSystem$collectRecursively$1) continuation;
            int i11 = fileSystem$collectRecursively$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fileSystem$collectRecursively$1.label = i11 - Integer.MIN_VALUE;
                Object obj = fileSystem$collectRecursively$1.result;
                lf.a aVar = lf.a.f20034a;
                i5 = fileSystem$collectRecursively$1.label;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (!z13) {
                        fileSystem$collectRecursively$1.L$0 = jVar;
                        fileSystem$collectRecursively$1.L$1 = fileSystem;
                        fileSystem$collectRecursively$1.L$2 = lVar;
                        fileSystem$collectRecursively$1.L$3 = path2;
                        fileSystem$collectRecursively$1.Z$0 = z5;
                        fileSystem$collectRecursively$1.Z$1 = z13;
                        fileSystem$collectRecursively$1.label = 1;
                        jVar.c(path2, fileSystem$collectRecursively$1);
                        return aVar;
                    }
                    lVar2 = lVar;
                    jVar2 = jVar;
                    z10 = z5;
                    fileSystem2 = fileSystem;
                } else if (i5 == 1) {
                    boolean z14 = fileSystem$collectRecursively$1.Z$1;
                    boolean z15 = fileSystem$collectRecursively$1.Z$0;
                    Path path3 = (Path) fileSystem$collectRecursively$1.L$3;
                    lVar2 = (l) fileSystem$collectRecursively$1.L$2;
                    fileSystem2 = (okio.FileSystem) fileSystem$collectRecursively$1.L$1;
                    jVar2 = (j) fileSystem$collectRecursively$1.L$0;
                    h8.b.B(obj);
                    z13 = z14;
                    z10 = z15;
                    path2 = path3;
                } else {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    int i12 = fileSystem$collectRecursively$1.I$0;
                    boolean z16 = fileSystem$collectRecursively$1.Z$1;
                    boolean z17 = fileSystem$collectRecursively$1.Z$0;
                    Iterator<Path> it = (Iterator) fileSystem$collectRecursively$1.L$6;
                    Path path4 = (Path) fileSystem$collectRecursively$1.L$3;
                    l lVar4 = (l) fileSystem$collectRecursively$1.L$2;
                    okio.FileSystem fileSystem4 = (okio.FileSystem) fileSystem$collectRecursively$1.L$1;
                    j jVar4 = (j) fileSystem$collectRecursively$1.L$0;
                    try {
                        h8.b.B(obj);
                        Path path5 = path4;
                        fileSystem2 = fileSystem4;
                        i10 = i12;
                        z10 = z17;
                        z13 = z16;
                        l lVar5 = lVar4;
                        jVar2 = jVar4;
                        try {
                            if (!it.hasNext()) {
                                try {
                                    Path next = it.next();
                                    fileSystem$collectRecursively$1.L$0 = jVar2;
                                    fileSystem$collectRecursively$1.L$1 = fileSystem2;
                                    fileSystem$collectRecursively$1.L$2 = lVar5;
                                    fileSystem$collectRecursively$1.L$3 = path5;
                                    fileSystem$collectRecursively$1.L$4 = null;
                                    fileSystem$collectRecursively$1.L$5 = null;
                                    fileSystem$collectRecursively$1.L$6 = it;
                                    fileSystem$collectRecursively$1.L$7 = null;
                                    fileSystem$collectRecursively$1.Z$0 = z10;
                                    fileSystem$collectRecursively$1.Z$1 = z13;
                                    fileSystem$collectRecursively$1.I$0 = i10;
                                    fileSystem$collectRecursively$1.label = 2;
                                    Object collectRecursively = collectRecursively(jVar3, fileSystem3, lVar3, next, z11, z12, fileSystem$collectRecursively$12);
                                    jVar4 = jVar3;
                                    fileSystem2 = fileSystem3;
                                    lVar4 = lVar3;
                                    z17 = z11;
                                    z16 = z12;
                                    fileSystem$collectRecursively$1 = fileSystem$collectRecursively$12;
                                    if (collectRecursively == aVar) {
                                        return aVar;
                                    }
                                    z10 = z17;
                                    z13 = z16;
                                    l lVar52 = lVar4;
                                    jVar2 = jVar4;
                                    if (!it.hasNext()) {
                                        j jVar5 = jVar2;
                                        lVar52.removeLast();
                                        jVar2 = jVar5;
                                        z13 = z13;
                                        path2 = path5;
                                        if (!z13) {
                                            return Unit.f19194a;
                                        }
                                        fileSystem$collectRecursively$1.L$0 = null;
                                        fileSystem$collectRecursively$1.L$1 = null;
                                        fileSystem$collectRecursively$1.L$2 = null;
                                        fileSystem$collectRecursively$1.L$3 = null;
                                        fileSystem$collectRecursively$1.L$4 = null;
                                        fileSystem$collectRecursively$1.L$5 = null;
                                        fileSystem$collectRecursively$1.L$6 = null;
                                        fileSystem$collectRecursively$1.L$7 = null;
                                        fileSystem$collectRecursively$1.Z$0 = z10;
                                        fileSystem$collectRecursively$1.Z$1 = z13;
                                        fileSystem$collectRecursively$1.label = 3;
                                        jVar2.c(path2, fileSystem$collectRecursively$1);
                                        lf.a aVar2 = lf.a.f20034a;
                                        return aVar;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    lVar4 = lVar3;
                                    lVar4.removeLast();
                                    throw th;
                                }
                                z11 = z10;
                                lVar3 = lVar52;
                                z12 = z13;
                                fileSystem$collectRecursively$12 = fileSystem$collectRecursively$1;
                                fileSystem3 = fileSystem2;
                                jVar3 = jVar2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            lVar4 = lVar52;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        lVar4.removeLast();
                        throw th;
                    }
                }
                listOrNull = fileSystem2.listOrNull(path2);
                if (listOrNull == null) {
                    listOrNull = e0.f19204a;
                }
                if (!listOrNull.isEmpty()) {
                    i10 = 0;
                    Path path6 = path2;
                    while (true) {
                        if (z10 && lVar2.contains(path6)) {
                            throw new IOException(e.o(path2, "symlink cycle at "));
                        }
                        Path symlinkTarget = symlinkTarget(fileSystem2, path6);
                        if (symlinkTarget == null) {
                            break;
                        }
                        i10++;
                        path6 = symlinkTarget;
                    }
                }
                if (!z13) {
                }
            }
        }
        fileSystem$collectRecursively$1 = new FileSystem$collectRecursively$1(continuation);
        Object obj2 = fileSystem$collectRecursively$1.result;
        lf.a aVar3 = lf.a.f20034a;
        i5 = fileSystem$collectRecursively$1.label;
        if (i5 != 0) {
        }
        listOrNull = fileSystem2.listOrNull(path2);
        if (listOrNull == null) {
        }
        if (!listOrNull.isEmpty()) {
        }
        if (!z13) {
        }
    }

    public static final void commonCopy(@NotNull okio.FileSystem fileSystem, @NotNull Path source, @NotNull Path target) throws IOException {
        Throwable th2;
        Long l6;
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Source source2 = fileSystem.source(source);
        Throwable th3 = null;
        try {
            BufferedSink buffer = Okio.buffer(okio.FileSystem.sink$default(fileSystem, target, false, 2, null));
            try {
                l6 = Long.valueOf(buffer.writeAll(source2));
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th6) {
                        d.a(th5, th6);
                    }
                }
                th2 = th5;
                l6 = null;
            }
        } catch (Throwable th7) {
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th8) {
                    d.a(th7, th8);
                }
            }
            th3 = th7;
        }
        if (th2 != null) {
            throw th2;
        }
        l6.longValue();
        if (source2 != null) {
            try {
                source2.close();
            } catch (Throwable th9) {
                th3 = th9;
            }
        }
        if (th3 != null) {
            throw th3;
        }
    }

    public static final void commonCreateDirectories(@NotNull okio.FileSystem fileSystem, @NotNull Path dir, boolean z5) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        l lVar = new l();
        for (Path path = dir; path != null && !fileSystem.exists(path); path = path.parent()) {
            lVar.addFirst(path);
        }
        if (z5 && lVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = lVar.iterator();
        while (it.hasNext()) {
            okio.FileSystem.createDirectory$default(fileSystem, (Path) it.next(), false, 2, null);
        }
    }

    public static final void commonDeleteRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path fileOrDirectory, boolean z5) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        FileSystem$commonDeleteRecursively$sequence$1 block = new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        i iVar = new i();
        iVar.f3218d = lf.d.a(block, iVar, iVar);
        while (iVar.hasNext()) {
            fileSystem.delete((Path) iVar.next(), z5 && !iVar.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final Sequence<Path> commonListRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path dir, boolean z5) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        FileSystem$commonListRecursively$1 block = new FileSystem$commonListRecursively$1(dir, fileSystem, z5, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return new k(block);
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        FileMetadata metadataOrNull = fileSystem.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(e.o(path, "no such file: "));
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path parent = path.parent();
        Intrinsics.checkNotNull(parent);
        return parent.resolve(symlinkTarget);
    }
}
