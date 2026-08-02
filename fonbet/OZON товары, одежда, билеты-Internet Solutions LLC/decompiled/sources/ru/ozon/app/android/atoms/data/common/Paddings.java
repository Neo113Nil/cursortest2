package ru.ozon.app.android.atoms.data.common;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/atoms/data/common/Paddings;", "", "", "px", "<init>", "(Ljava/lang/String;II)V", "I", "getPx", "()I", "LZ1/h;", "getDp-D9Ej5fM", "()F", "dp", "NONE", "PADDING_100", "PADDING_200", "PADDING_250", "PADDING_300", "PADDING_350", "PADDING_400", "PADDING_450", "PADDING_500", "PADDING_550", "PADDING_600", "PADDING_700", "PADDING_800", "PADDING_900", "PADDING_950", "PADDING_1000", "PADDING_1050", "PADDING_1100", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Paddings {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Paddings[] $VALUES;
    private final int px;
    public static final Paddings NONE = new Paddings("NONE", 0, 0);
    public static final Paddings PADDING_100 = new Paddings("PADDING_100", 1, 2);
    public static final Paddings PADDING_200 = new Paddings("PADDING_200", 2, 4);
    public static final Paddings PADDING_250 = new Paddings("PADDING_250", 3, 6);
    public static final Paddings PADDING_300 = new Paddings("PADDING_300", 4, 8);
    public static final Paddings PADDING_350 = new Paddings("PADDING_350", 5, 10);
    public static final Paddings PADDING_400 = new Paddings("PADDING_400", 6, 12);
    public static final Paddings PADDING_450 = new Paddings("PADDING_450", 7, 14);
    public static final Paddings PADDING_500 = new Paddings("PADDING_500", 8, 16);
    public static final Paddings PADDING_550 = new Paddings("PADDING_550", 9, 18);
    public static final Paddings PADDING_600 = new Paddings("PADDING_600", 10, 20);
    public static final Paddings PADDING_700 = new Paddings("PADDING_700", 11, 24);
    public static final Paddings PADDING_800 = new Paddings("PADDING_800", 12, 32);
    public static final Paddings PADDING_900 = new Paddings("PADDING_900", 13, 40);
    public static final Paddings PADDING_950 = new Paddings("PADDING_950", 14, 44);
    public static final Paddings PADDING_1000 = new Paddings("PADDING_1000", 15, 48);
    public static final Paddings PADDING_1050 = new Paddings("PADDING_1050", 16, 52);
    public static final Paddings PADDING_1100 = new Paddings("PADDING_1100", 17, 56);

    private static final /* synthetic */ Paddings[] $values() {
        return new Paddings[]{NONE, PADDING_100, PADDING_200, PADDING_250, PADDING_300, PADDING_350, PADDING_400, PADDING_450, PADDING_500, PADDING_550, PADDING_600, PADDING_700, PADDING_800, PADDING_900, PADDING_950, PADDING_1000, PADDING_1050, PADDING_1100};
    }

    static {
        Paddings[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Paddings(String str, int i11, int i12) {
        this.px = i12;
    }

    @NotNull
    public static a<Paddings> getEntries() {
        return $ENTRIES;
    }

    public static Paddings valueOf(String str) {
        return (Paddings) Enum.valueOf(Paddings.class, str);
    }

    public static Paddings[] values() {
        return (Paddings[]) $VALUES.clone();
    }

    /* renamed from: getDp-D9Ej5fM, reason: not valid java name */
    public final float m491getDpD9Ej5fM() {
        return this.px;
    }

    public final int getPx() {
        return this.px;
    }
}
