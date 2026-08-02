package l1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class L0 {
    @NotNull
    public static String a(int i11) {
        return i11 == 0 ? "Clamp" : i11 == 1 ? "Repeated" : i11 == 2 ? "Mirror" : i11 == 3 ? "Decal" : "Unknown";
    }
}
