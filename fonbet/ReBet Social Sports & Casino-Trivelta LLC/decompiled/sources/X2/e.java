package X2;

import androidx.work.impl.model.SystemIdInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface e {
    default SystemIdInfo a(h id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return b(id2.b(), id2.a());
    }

    SystemIdInfo b(String str, int i10);

    List c();

    default void d(h id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        f(id2.b(), id2.a());
    }

    void e(SystemIdInfo systemIdInfo);

    void f(String str, int i10);

    void g(String str);
}
