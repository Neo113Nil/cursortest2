package bi;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public interface f {
    default boolean b() {
        return false;
    }

    int c(String str);

    int d();

    String e(int i10);

    List f(int i10);

    f g(int i10);

    default List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    m getKind();

    String h();

    boolean i(int i10);

    default boolean isInline() {
        return false;
    }
}
