package ru.ozon.app.android.video;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/video/MediaFormat;", "", "stringRepresentation", "", "extension", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getStringRepresentation", "()Ljava/lang/String;", "getExtension", "MP4", "HLS", "DASH", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaFormat {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MediaFormat[] $VALUES;

    @NotNull
    private final String extension;

    @NotNull
    private final String stringRepresentation;
    public static final MediaFormat MP4 = new MediaFormat("MP4", 0, "MP4", ".mp4");
    public static final MediaFormat HLS = new MediaFormat("HLS", 1, "HLS", ".m3u8");
    public static final MediaFormat DASH = new MediaFormat("DASH", 2, "DASH", ".mpd");

    private static final /* synthetic */ MediaFormat[] $values() {
        return new MediaFormat[]{MP4, HLS, DASH};
    }

    static {
        MediaFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MediaFormat(String str, int i11, String str2, String str3) {
        this.stringRepresentation = str2;
        this.extension = str3;
    }

    @NotNull
    public static a<MediaFormat> getEntries() {
        return $ENTRIES;
    }

    public static MediaFormat valueOf(String str) {
        return (MediaFormat) Enum.valueOf(MediaFormat.class, str);
    }

    public static MediaFormat[] values() {
        return (MediaFormat[]) $VALUES.clone();
    }

    @NotNull
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }
}
