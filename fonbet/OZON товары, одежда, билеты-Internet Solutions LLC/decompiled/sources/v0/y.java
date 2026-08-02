package v0;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes.dex */
public interface y {
    default long a() {
        return 0L;
    }

    default int b() {
        return 0;
    }

    default int c() {
        return 0;
    }

    int d();

    default int e() {
        return 0;
    }

    int f();

    @NotNull
    List<InterfaceC10174n> g();

    @NotNull
    default EnumC9142v getOrientation() {
        return EnumC9142v.Vertical;
    }

    int h();
}
