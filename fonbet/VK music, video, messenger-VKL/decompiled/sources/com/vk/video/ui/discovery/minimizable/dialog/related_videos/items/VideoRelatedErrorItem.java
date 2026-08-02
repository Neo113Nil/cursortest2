package com.vk.video.ui.discovery.minimizable.dialog.related_videos.items;

import xsna.asp;
import xsna.hfz;
import xsna.zrp;

/* compiled from: VideoRelatedErrorItem.kt */
/* loaded from: classes7.dex */
public final class VideoRelatedErrorItem implements hfz {
    public final ChunkType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoRelatedErrorItem.kt */
    public static final class ChunkType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChunkType[] $VALUES;
        public static final ChunkType Next;
        public static final ChunkType Previous;

        static {
            ChunkType chunkType = new ChunkType("Previous", 0);
            Previous = chunkType;
            ChunkType chunkType2 = new ChunkType("Next", 1);
            Next = chunkType2;
            ChunkType[] chunkTypeArr = {chunkType, chunkType2};
            $VALUES = chunkTypeArr;
            $ENTRIES = new asp(chunkTypeArr);
        }

        public ChunkType() {
            throw null;
        }

        public static ChunkType valueOf(String str) {
            return (ChunkType) Enum.valueOf(ChunkType.class, str);
        }

        public static ChunkType[] values() {
            return (ChunkType[]) $VALUES.clone();
        }
    }

    public VideoRelatedErrorItem(ChunkType chunkType) {
        this.b = chunkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoRelatedErrorItem) && this.b == ((VideoRelatedErrorItem) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VideoRelatedErrorItem(chunkType=" + this.b + ')';
    }
}
