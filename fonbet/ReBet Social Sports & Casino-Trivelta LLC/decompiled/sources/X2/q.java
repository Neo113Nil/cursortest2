package X2;

import androidx.work.impl.model.WorkTag;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface q {
    List a(String str);

    void b(WorkTag workTag);

    default void c(String id2, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            b(new WorkTag((String) it.next(), id2));
        }
    }
}
