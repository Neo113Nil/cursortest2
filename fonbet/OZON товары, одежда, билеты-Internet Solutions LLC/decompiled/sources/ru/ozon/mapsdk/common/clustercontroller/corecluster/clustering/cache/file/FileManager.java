package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;", "DATA", "", "", "fileName", "data", "", "writeToFile", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "readFromFile", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeFile", "", "isFileExist", "(Ljava/lang/String;)Z", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FileManager<DATA> {
    boolean isFileExist(@NotNull String fileName);

    Object readFromFile(@NotNull String str, @NotNull d<? super DATA> dVar);

    Object removeFile(@NotNull String str, @NotNull d<? super Unit> dVar);

    Object writeToFile(@NotNull String str, DATA data, @NotNull d<? super Unit> dVar);
}
