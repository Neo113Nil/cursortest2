package ru.ozon.uni.android.ds.compose.component.input;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputState;", "", "LZ1/h;", "borderWidth", "<init>", "(Ljava/lang/String;IF)V", "", "isActive$uni_release", "()Z", "isActive", "isDisabled$uni_release", "isDisabled", "F", "getBorderWidth-D9Ej5fM$uni_release", "()F", "ACTIVE", "DEFAULT", "DISABLED", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsInputState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsInputState[] $VALUES;
    public static final DsInputState ACTIVE;
    public static final DsInputState DEFAULT;
    public static final DsInputState DISABLED;
    private final float borderWidth;

    private static final /* synthetic */ DsInputState[] $values() {
        return new DsInputState[]{ACTIVE, DEFAULT, DISABLED};
    }

    static {
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        ACTIVE = new DsInputState("ACTIVE", 0, dsSpacings.m1847getDp2D9Ej5fM());
        DEFAULT = new DsInputState("DEFAULT", 1, dsSpacings.m1839getDp1D9Ej5fM());
        DISABLED = new DsInputState("DISABLED", 2, dsSpacings.m1839getDp1D9Ej5fM());
        DsInputState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsInputState(String str, int i11, float f7) {
        this.borderWidth = f7;
    }

    public static DsInputState valueOf(String str) {
        return (DsInputState) Enum.valueOf(DsInputState.class, str);
    }

    public static DsInputState[] values() {
        return (DsInputState[]) $VALUES.clone();
    }

    /* renamed from: getBorderWidth-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final boolean isActive$uni_release() {
        return this == ACTIVE;
    }

    public final boolean isDisabled$uni_release() {
        return this == DISABLED;
    }
}
