package ru.ozon.uni.android.ds.compose.component.textarea;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaState;", "", "LZ1/h;", "borderWidth", "<init>", "(Ljava/lang/String;IF)V", "", "isActive", "()Z", "isDisabled", "F", "getBorderWidth-D9Ej5fM", "()F", "ACTIVE", "DEFAULT", "DISABLED", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTextAreaState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsTextAreaState[] $VALUES;
    public static final DsTextAreaState ACTIVE;
    public static final DsTextAreaState DEFAULT;
    public static final DsTextAreaState DISABLED;
    private final float borderWidth;

    private static final /* synthetic */ DsTextAreaState[] $values() {
        return new DsTextAreaState[]{ACTIVE, DEFAULT, DISABLED};
    }

    static {
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        ACTIVE = new DsTextAreaState("ACTIVE", 0, dsSpacings.m1847getDp2D9Ej5fM());
        DEFAULT = new DsTextAreaState("DEFAULT", 1, dsSpacings.m1839getDp1D9Ej5fM());
        DISABLED = new DsTextAreaState("DISABLED", 2, dsSpacings.m1839getDp1D9Ej5fM());
        DsTextAreaState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsTextAreaState(String str, int i11, float f7) {
        this.borderWidth = f7;
    }

    public static DsTextAreaState valueOf(String str) {
        return (DsTextAreaState) Enum.valueOf(DsTextAreaState.class, str);
    }

    public static DsTextAreaState[] values() {
        return (DsTextAreaState[]) $VALUES.clone();
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final boolean isActive() {
        return this == ACTIVE;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }
}
