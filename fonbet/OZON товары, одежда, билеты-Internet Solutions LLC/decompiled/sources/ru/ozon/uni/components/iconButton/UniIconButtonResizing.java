package ru.ozon.uni.components.iconButton;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonResizing;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "HUG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIconButtonResizing {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniIconButtonResizing[] $VALUES;
    public static final UniIconButtonResizing FILL = new UniIconButtonResizing("FILL", 0);
    public static final UniIconButtonResizing HUG = new UniIconButtonResizing("HUG", 1);

    private static final /* synthetic */ UniIconButtonResizing[] $values() {
        return new UniIconButtonResizing[]{FILL, HUG};
    }

    static {
        UniIconButtonResizing[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniIconButtonResizing(String str, int i11) {
    }

    public static UniIconButtonResizing valueOf(String str) {
        return (UniIconButtonResizing) Enum.valueOf(UniIconButtonResizing.class, str);
    }

    public static UniIconButtonResizing[] values() {
        return (UniIconButtonResizing[]) $VALUES.clone();
    }
}
