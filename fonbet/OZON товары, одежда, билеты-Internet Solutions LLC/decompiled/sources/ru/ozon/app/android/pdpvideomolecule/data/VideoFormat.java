package ru.ozon.app.android.pdpvideomolecule.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/data/VideoFormat;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "MP4", "HLS", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoFormat {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VideoFormat[] $VALUES;

    @i(name = "INVALID")
    public static final VideoFormat INVALID = new VideoFormat("INVALID", 0);

    @i(name = "MP4")
    public static final VideoFormat MP4 = new VideoFormat("MP4", 1);

    @i(name = "HLS")
    public static final VideoFormat HLS = new VideoFormat("HLS", 2);

    private static final /* synthetic */ VideoFormat[] $values() {
        return new VideoFormat[]{INVALID, MP4, HLS};
    }

    static {
        VideoFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private VideoFormat(String str, int i11) {
    }

    public static VideoFormat valueOf(String str) {
        return (VideoFormat) Enum.valueOf(VideoFormat.class, str);
    }

    public static VideoFormat[] values() {
        return (VideoFormat[]) $VALUES.clone();
    }
}
