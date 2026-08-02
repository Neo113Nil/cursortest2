package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailModelTypeDto;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SQUARE_ICON", "VERTICAL_TWO_BY_THREE", "MAIN_THUMBNAIL", "GIF", "ANIMATED_THUMBNAIL_POSTER", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThumbnailModelTypeDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ThumbnailModelTypeDto[] $VALUES;

    @NotNull
    private final String value;

    @b6h("SquareIcon")
    public static final ThumbnailModelTypeDto SQUARE_ICON = new ThumbnailModelTypeDto("SQUARE_ICON", 0, "SquareIcon");

    @b6h("VerticalTwoByThree")
    public static final ThumbnailModelTypeDto VERTICAL_TWO_BY_THREE = new ThumbnailModelTypeDto("VERTICAL_TWO_BY_THREE", 1, "VerticalTwoByThree");

    @b6h("MainThumbnail")
    public static final ThumbnailModelTypeDto MAIN_THUMBNAIL = new ThumbnailModelTypeDto("MAIN_THUMBNAIL", 2, "MainThumbnail");

    @b6h("Gif")
    public static final ThumbnailModelTypeDto GIF = new ThumbnailModelTypeDto("GIF", 3, "Gif");

    @b6h("AnimatedThumbnailPoster")
    public static final ThumbnailModelTypeDto ANIMATED_THUMBNAIL_POSTER = new ThumbnailModelTypeDto("ANIMATED_THUMBNAIL_POSTER", 4, "AnimatedThumbnailPoster");

    private static final /* synthetic */ ThumbnailModelTypeDto[] $values() {
        return new ThumbnailModelTypeDto[]{SQUARE_ICON, VERTICAL_TWO_BY_THREE, MAIN_THUMBNAIL, GIF, ANIMATED_THUMBNAIL_POSTER};
    }

    static {
        ThumbnailModelTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private ThumbnailModelTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ThumbnailModelTypeDto valueOf(String str) {
        return (ThumbnailModelTypeDto) Enum.valueOf(ThumbnailModelTypeDto.class, str);
    }

    public static ThumbnailModelTypeDto[] values() {
        return (ThumbnailModelTypeDto[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
