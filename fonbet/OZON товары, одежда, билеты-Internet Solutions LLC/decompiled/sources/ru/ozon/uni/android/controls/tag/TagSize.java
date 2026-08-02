package ru.ozon.uni.android.controls.tag;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/controls/tag/TagSize;", "", "height", "", "cornerRadius", "cornerRadiusRounded", "padding", "<init>", "(Ljava/lang/String;IIIII)V", "getHeight", "()I", "getCornerRadius", "getCornerRadiusRounded", "getPadding", "TAG_500", "TAG_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TagSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TagSize[] $VALUES;
    public static final TagSize TAG_500 = new TagSize("TAG_500", 0, 24, 8, 12, 4);
    public static final TagSize TAG_600 = new TagSize("TAG_600", 1, 32, 10, 16, 8);
    private final int cornerRadius;
    private final int cornerRadiusRounded;
    private final int height;
    private final int padding;

    private static final /* synthetic */ TagSize[] $values() {
        return new TagSize[]{TAG_500, TAG_600};
    }

    static {
        TagSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TagSize(String str, int i11, int i12, int i13, int i14, int i15) {
        this.height = i12;
        this.cornerRadius = i13;
        this.cornerRadiusRounded = i14;
        this.padding = i15;
    }

    @NotNull
    public static a<TagSize> getEntries() {
        return $ENTRIES;
    }

    public static TagSize valueOf(String str) {
        return (TagSize) Enum.valueOf(TagSize.class, str);
    }

    public static TagSize[] values() {
        return (TagSize[]) $VALUES.clone();
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getCornerRadiusRounded() {
        return this.cornerRadiusRounded;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getPadding() {
        return this.padding;
    }
}
