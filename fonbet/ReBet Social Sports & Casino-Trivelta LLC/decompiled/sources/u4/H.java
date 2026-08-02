package u4;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract /* synthetic */ class H {
    public static /* synthetic */ Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        Objects.requireNonNull(obj2, "defaultObj");
        return obj2;
    }
}
