package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;", "", "<init>", "(Ljava/lang/String;I)V", "DOUBLE_BUTTONS", "DOUBLE_FIRST", "DOUBLE_SECOND", "SINGLE_COUNTER", "SINGLE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonsV5ContainerState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CartButtonsV5ContainerState[] $VALUES;
    public static final CartButtonsV5ContainerState DOUBLE_BUTTONS = new CartButtonsV5ContainerState("DOUBLE_BUTTONS", 0);
    public static final CartButtonsV5ContainerState DOUBLE_FIRST = new CartButtonsV5ContainerState("DOUBLE_FIRST", 1);
    public static final CartButtonsV5ContainerState DOUBLE_SECOND = new CartButtonsV5ContainerState("DOUBLE_SECOND", 2);
    public static final CartButtonsV5ContainerState SINGLE_COUNTER = new CartButtonsV5ContainerState("SINGLE_COUNTER", 3);
    public static final CartButtonsV5ContainerState SINGLE = new CartButtonsV5ContainerState("SINGLE", 4);

    private static final /* synthetic */ CartButtonsV5ContainerState[] $values() {
        return new CartButtonsV5ContainerState[]{DOUBLE_BUTTONS, DOUBLE_FIRST, DOUBLE_SECOND, SINGLE_COUNTER, SINGLE};
    }

    static {
        CartButtonsV5ContainerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CartButtonsV5ContainerState(String str, int i11) {
    }

    public static CartButtonsV5ContainerState valueOf(String str) {
        return (CartButtonsV5ContainerState) Enum.valueOf(CartButtonsV5ContainerState.class, str);
    }

    public static CartButtonsV5ContainerState[] values() {
        return (CartButtonsV5ContainerState[]) $VALUES.clone();
    }
}
