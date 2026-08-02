package ru.ozon.uni.android.wrappers.main.data;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSize;", "", "cornerRadius", "", "<init>", "(Ljava/lang/String;II)V", "getCornerRadius", "()I", "SIZE_200", "SIZE_300", "SIZE_350", "SIZE_400", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackgroundWrapperSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackgroundWrapperSize[] $VALUES;
    public static final BackgroundWrapperSize SIZE_200 = new BackgroundWrapperSize("SIZE_200", 0, 4);
    public static final BackgroundWrapperSize SIZE_300 = new BackgroundWrapperSize("SIZE_300", 1, 8);
    public static final BackgroundWrapperSize SIZE_350 = new BackgroundWrapperSize("SIZE_350", 2, 10);
    public static final BackgroundWrapperSize SIZE_400 = new BackgroundWrapperSize("SIZE_400", 3, 12);
    public static final BackgroundWrapperSize SIZE_500 = new BackgroundWrapperSize("SIZE_500", 4, 16);
    public static final BackgroundWrapperSize SIZE_600 = new BackgroundWrapperSize("SIZE_600", 5, 28);
    private final int cornerRadius;

    private static final /* synthetic */ BackgroundWrapperSize[] $values() {
        return new BackgroundWrapperSize[]{SIZE_200, SIZE_300, SIZE_350, SIZE_400, SIZE_500, SIZE_600};
    }

    static {
        BackgroundWrapperSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BackgroundWrapperSize(String str, int i11, int i12) {
        this.cornerRadius = i12;
    }

    public static BackgroundWrapperSize valueOf(String str) {
        return (BackgroundWrapperSize) Enum.valueOf(BackgroundWrapperSize.class, str);
    }

    public static BackgroundWrapperSize[] values() {
        return (BackgroundWrapperSize[]) $VALUES.clone();
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }
}
