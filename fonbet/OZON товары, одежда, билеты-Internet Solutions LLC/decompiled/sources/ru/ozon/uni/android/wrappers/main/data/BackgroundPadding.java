package ru.ozon.uni.android.wrappers.main.data;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/wrappers/main/data/BackgroundPadding;", "", "padding", "", "<init>", "(Ljava/lang/String;II)V", "getPadding", "()I", "PADDING_NONE", "PADDING_200", "PADDING_250", "PADDING_300", "PADDING_350", "PADDING_400", "PADDING_500", "PADDING_700", "PADDING_800", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackgroundPadding {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackgroundPadding[] $VALUES;
    private final int padding;
    public static final BackgroundPadding PADDING_NONE = new BackgroundPadding("PADDING_NONE", 0, 0);
    public static final BackgroundPadding PADDING_200 = new BackgroundPadding("PADDING_200", 1, 4);
    public static final BackgroundPadding PADDING_250 = new BackgroundPadding("PADDING_250", 2, 6);
    public static final BackgroundPadding PADDING_300 = new BackgroundPadding("PADDING_300", 3, 8);
    public static final BackgroundPadding PADDING_350 = new BackgroundPadding("PADDING_350", 4, 10);
    public static final BackgroundPadding PADDING_400 = new BackgroundPadding("PADDING_400", 5, 12);
    public static final BackgroundPadding PADDING_500 = new BackgroundPadding("PADDING_500", 6, 16);
    public static final BackgroundPadding PADDING_700 = new BackgroundPadding("PADDING_700", 7, 24);
    public static final BackgroundPadding PADDING_800 = new BackgroundPadding("PADDING_800", 8, 32);

    private static final /* synthetic */ BackgroundPadding[] $values() {
        return new BackgroundPadding[]{PADDING_NONE, PADDING_200, PADDING_250, PADDING_300, PADDING_350, PADDING_400, PADDING_500, PADDING_700, PADDING_800};
    }

    static {
        BackgroundPadding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BackgroundPadding(String str, int i11, int i12) {
        this.padding = i12;
    }

    public static BackgroundPadding valueOf(String str) {
        return (BackgroundPadding) Enum.valueOf(BackgroundPadding.class, str);
    }

    public static BackgroundPadding[] values() {
        return (BackgroundPadding[]) $VALUES.clone();
    }

    public final int getPadding() {
        return this.padding;
    }
}
