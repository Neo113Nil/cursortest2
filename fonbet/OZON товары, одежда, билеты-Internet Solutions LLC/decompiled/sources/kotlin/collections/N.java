package kotlin.collections;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface N<T, K> {
    K keyOf(T t2);

    @NotNull
    Iterator<T> sourceIterator();
}
