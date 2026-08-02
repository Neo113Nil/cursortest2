package ru.ozon.uni.components.text;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/components/text/UniTextResizing;", "", "<init>", "(Ljava/lang/String;I)V", "Hug", "Fill", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTextResizing {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniTextResizing[] $VALUES;
    public static final UniTextResizing Hug = new UniTextResizing("Hug", 0);
    public static final UniTextResizing Fill = new UniTextResizing("Fill", 1);

    private static final /* synthetic */ UniTextResizing[] $values() {
        return new UniTextResizing[]{Hug, Fill};
    }

    static {
        UniTextResizing[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniTextResizing(String str, int i11) {
    }

    public static UniTextResizing valueOf(String str) {
        return (UniTextResizing) Enum.valueOf(UniTextResizing.class, str);
    }

    public static UniTextResizing[] values() {
        return (UniTextResizing[]) $VALUES.clone();
    }
}
