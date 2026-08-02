package com.vk.media.player.action;

import defpackage.q0;
import xsna.asp;
import xsna.dbs0;
import xsna.zrp;

/* compiled from: VideoClickAction.kt */
/* loaded from: classes3.dex */
public final class VideoSeekAction extends dbs0 {
    public final long a;
    public final Source b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoClickAction.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source DoubleTap;
        public static final Source PreciseSlider;
        public static final Source Slider;

        static {
            Source source = new Source("Slider", 0);
            Slider = source;
            Source source2 = new Source("PreciseSlider", 1);
            PreciseSlider = source2;
            Source source3 = new Source("DoubleTap", 2);
            DoubleTap = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public VideoSeekAction(long j, Source source, boolean z) {
        this.a = j;
        this.b = source;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSeekAction)) {
            return false;
        }
        VideoSeekAction videoSeekAction = (VideoSeekAction) obj;
        return this.a == videoSeekAction.a && this.b == videoSeekAction.b && this.c == videoSeekAction.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSeekAction(positionMs=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", fromFullscreen=");
        return q0.a(sb, this.c, ')');
    }
}
