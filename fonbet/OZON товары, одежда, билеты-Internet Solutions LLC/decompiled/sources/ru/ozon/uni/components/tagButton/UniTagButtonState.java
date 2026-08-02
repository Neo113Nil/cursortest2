package ru.ozon.uni.components.tagButton;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/components/tagButton/UniTagButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "Selected", "Loading", "LoadingSelected", "Disabled", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTagButtonState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniTagButtonState[] $VALUES;
    public static final UniTagButtonState Default = new UniTagButtonState("Default", 0);
    public static final UniTagButtonState Selected = new UniTagButtonState("Selected", 1);
    public static final UniTagButtonState Loading = new UniTagButtonState("Loading", 2);
    public static final UniTagButtonState LoadingSelected = new UniTagButtonState("LoadingSelected", 3);
    public static final UniTagButtonState Disabled = new UniTagButtonState("Disabled", 4);

    private static final /* synthetic */ UniTagButtonState[] $values() {
        return new UniTagButtonState[]{Default, Selected, Loading, LoadingSelected, Disabled};
    }

    static {
        UniTagButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniTagButtonState(String str, int i11) {
    }

    public static UniTagButtonState valueOf(String str) {
        return (UniTagButtonState) Enum.valueOf(UniTagButtonState.class, str);
    }

    public static UniTagButtonState[] values() {
        return (UniTagButtonState[]) $VALUES.clone();
    }
}
