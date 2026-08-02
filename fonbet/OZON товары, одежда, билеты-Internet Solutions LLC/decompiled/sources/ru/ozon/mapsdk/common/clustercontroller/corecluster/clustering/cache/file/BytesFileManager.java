package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import He.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Wc.a;
import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/BytesFileManager;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;", "", "Landroid/content/Context;", "context", "", "subdirectory", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "fileName", "Ljava/io/File;", "getFile", "(Ljava/lang/String;)Ljava/io/File;", "data", "", "writeToFile", "(Ljava/lang/String;[BLkotlin/coroutines/d;)Ljava/lang/Object;", "readFromFile", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeFile", "", "isFileExist", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "Ljava/lang/String;", "directory$delegate", "LSc/j;", "getDirectory", "()Ljava/io/File;", "directory", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BytesFileManager implements FileManager<byte[]> {

    @NotNull
    private final Context context;

    /* renamed from: directory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j directory;

    @NotNull
    private final String subdirectory;

    public BytesFileManager(@NotNull Context context, @NotNull String subdirectory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subdirectory, "subdirectory");
        this.context = context;
        this.subdirectory = subdirectory;
        this.directory = k.b(new BytesFileManager$directory$2(this));
    }

    private final File getDirectory() {
        return (File) this.directory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile(String fileName) {
        return new File(getDirectory(), fileName);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FileManager
    public boolean isFileExist(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return getFile(fileName).exists();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FileManager
    public Object readFromFile(@NotNull String str, @NotNull d<? super byte[]> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new BytesFileManager$readFromFile$2(this, str, null), dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FileManager
    public Object removeFile(@NotNull String str, @NotNull d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new BytesFileManager$removeFile$2(this, str, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FileManager
    public /* bridge */ /* synthetic */ Object writeToFile(String str, byte[] bArr, d dVar) {
        return writeToFile2(str, bArr, (d<? super Unit>) dVar);
    }

    /* renamed from: writeToFile, reason: avoid collision after fix types in other method */
    public Object writeToFile2(@NotNull String str, @NotNull byte[] bArr, @NotNull d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new BytesFileManager$writeToFile$2(this, str, bArr, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public /* synthetic */ BytesFileManager(Context context, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? "cluster_cache" : str);
    }
}
