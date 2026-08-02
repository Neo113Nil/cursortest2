package ru.ozon.uni.android.wrappers.main.data;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/wrappers/main/data/BackgroundMargin;", "", "", "margin", "<init>", "(Ljava/lang/String;II)V", "I", "getMargin", "()I", "MARGIN_NONE", "MARGIN_350", "MARGIN_400", "MARGIN_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackgroundMargin {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackgroundMargin[] $VALUES;
    private final int margin;
    public static final BackgroundMargin MARGIN_NONE = new BackgroundMargin("MARGIN_NONE", 0, 0);
    public static final BackgroundMargin MARGIN_350 = new BackgroundMargin("MARGIN_350", 1, 8);
    public static final BackgroundMargin MARGIN_400 = new BackgroundMargin("MARGIN_400", 2, 12);
    public static final BackgroundMargin MARGIN_500 = new BackgroundMargin("MARGIN_500", 3, 16);

    private static final /* synthetic */ BackgroundMargin[] $values() {
        return new BackgroundMargin[]{MARGIN_NONE, MARGIN_350, MARGIN_400, MARGIN_500};
    }

    static {
        BackgroundMargin[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BackgroundMargin(String str, int i11, int i12) {
        this.margin = i12;
    }

    public static BackgroundMargin valueOf(String str) {
        return (BackgroundMargin) Enum.valueOf(BackgroundMargin.class, str);
    }

    public static BackgroundMargin[] values() {
        return (BackgroundMargin[]) $VALUES.clone();
    }
}
