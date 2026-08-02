package ru.ozon.app.android.composer.view.layoutManager.prefetch;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "NORMAL", "HIGH", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrefetchCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PrefetchCategory[] $VALUES;
    public static final PrefetchCategory LOW = new PrefetchCategory("LOW", 0);
    public static final PrefetchCategory NORMAL = new PrefetchCategory("NORMAL", 1);
    public static final PrefetchCategory HIGH = new PrefetchCategory("HIGH", 2);

    private static final /* synthetic */ PrefetchCategory[] $values() {
        return new PrefetchCategory[]{LOW, NORMAL, HIGH};
    }

    static {
        PrefetchCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PrefetchCategory(String str, int i11) {
    }

    public static PrefetchCategory valueOf(String str) {
        return (PrefetchCategory) Enum.valueOf(PrefetchCategory.class, str);
    }

    public static PrefetchCategory[] values() {
        return (PrefetchCategory[]) $VALUES.clone();
    }
}
