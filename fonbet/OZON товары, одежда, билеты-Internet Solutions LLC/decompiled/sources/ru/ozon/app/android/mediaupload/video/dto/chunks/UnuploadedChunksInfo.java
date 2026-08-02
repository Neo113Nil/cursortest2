package ru.ozon.app.android.mediaupload.video.dto.chunks;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/mediaupload/video/dto/chunks/UnuploadedChunksInfo;", "", "", "Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkInfo;", "unuploadedChunksPortions", "", "loadedPercent", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getUnuploadedChunksPortions", "()Ljava/util/List;", "I", "getLoadedPercent", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnuploadedChunksInfo {
    private final int loadedPercent;

    @NotNull
    private final List<List<ChunkInfo>> unuploadedChunksPortions;

    /* JADX WARN: Multi-variable type inference failed */
    public UnuploadedChunksInfo(@NotNull List<? extends List<ChunkInfo>> unuploadedChunksPortions, int i11) {
        Intrinsics.checkNotNullParameter(unuploadedChunksPortions, "unuploadedChunksPortions");
        this.unuploadedChunksPortions = unuploadedChunksPortions;
        this.loadedPercent = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnuploadedChunksInfo)) {
            return false;
        }
        UnuploadedChunksInfo unuploadedChunksInfo = (UnuploadedChunksInfo) other;
        return Intrinsics.d(this.unuploadedChunksPortions, unuploadedChunksInfo.unuploadedChunksPortions) && this.loadedPercent == unuploadedChunksInfo.loadedPercent;
    }

    public final int getLoadedPercent() {
        return this.loadedPercent;
    }

    @NotNull
    public final List<List<ChunkInfo>> getUnuploadedChunksPortions() {
        return this.unuploadedChunksPortions;
    }

    public int hashCode() {
        return Integer.hashCode(this.loadedPercent) + (this.unuploadedChunksPortions.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UnuploadedChunksInfo(unuploadedChunksPortions=" + this.unuploadedChunksPortions + ", loadedPercent=" + this.loadedPercent + ")";
    }
}
