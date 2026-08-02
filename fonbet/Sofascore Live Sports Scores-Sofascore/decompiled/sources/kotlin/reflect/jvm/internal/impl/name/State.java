package kotlin.reflect.jvm.internal.impl.name;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
final class State {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;
    public static final State BEGINNING = new State("BEGINNING", 0);
    public static final State MIDDLE = new State("MIDDLE", 1);
    public static final State AFTER_DOT = new State("AFTER_DOT", 2);

    private static final /* synthetic */ State[] $values() {
        return new State[]{BEGINNING, MIDDLE, AFTER_DOT};
    }

    static {
        State[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private State(String str, int i) {
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}
