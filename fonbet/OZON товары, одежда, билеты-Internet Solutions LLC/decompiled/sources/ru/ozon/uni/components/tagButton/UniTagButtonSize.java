package ru.ozon.uni.components.tagButton;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/components/tagButton/UniTagButtonSize;", "", "LZ1/h;", "height", "horizontalPadding", "cornerRadius", "<init>", "(Ljava/lang/String;IFFF)V", "F", "getHeight-D9Ej5fM$uni_release", "()F", "getHorizontalPadding-D9Ej5fM$uni_release", "getCornerRadius-D9Ej5fM$uni_release", "Size500", "Size600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTagButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniTagButtonSize[] $VALUES;
    public static final UniTagButtonSize Size500;
    public static final UniTagButtonSize Size600;
    private final float cornerRadius;
    private final float height;
    private final float horizontalPadding;

    private static final /* synthetic */ UniTagButtonSize[] $values() {
        return new UniTagButtonSize[]{Size500, Size600};
    }

    static {
        float f7 = 8;
        Size500 = new UniTagButtonSize("Size500", 0, 24, 4, f7);
        Size600 = new UniTagButtonSize("Size600", 1, 32, f7, 10);
        UniTagButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniTagButtonSize(String str, int i11, float f7, float f11, float f12) {
        this.height = f7;
        this.horizontalPadding = f11;
        this.cornerRadius = f12;
    }

    public static UniTagButtonSize valueOf(String str) {
        return (UniTagButtonSize) Enum.valueOf(UniTagButtonSize.class, str);
    }

    public static UniTagButtonSize[] values() {
        return (UniTagButtonSize[]) $VALUES.clone();
    }

    /* renamed from: getCornerRadius-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getHeight-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }
}
