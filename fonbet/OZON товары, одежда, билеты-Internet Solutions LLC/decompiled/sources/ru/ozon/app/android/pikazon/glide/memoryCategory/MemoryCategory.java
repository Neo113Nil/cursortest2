package ru.ozon.app.android.pikazon.glide.memoryCategory;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "NORMAL", "HIGH", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoryCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MemoryCategory[] $VALUES;
    public static final MemoryCategory LOW = new MemoryCategory("LOW", 0);
    public static final MemoryCategory NORMAL = new MemoryCategory("NORMAL", 1);
    public static final MemoryCategory HIGH = new MemoryCategory("HIGH", 2);

    private static final /* synthetic */ MemoryCategory[] $values() {
        return new MemoryCategory[]{LOW, NORMAL, HIGH};
    }

    static {
        MemoryCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MemoryCategory(String str, int i11) {
    }

    public static MemoryCategory valueOf(String str) {
        return (MemoryCategory) Enum.valueOf(MemoryCategory.class, str);
    }

    public static MemoryCategory[] values() {
        return (MemoryCategory[]) $VALUES.clone();
    }
}
