package kotlin.reflect;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface d<T> extends g, b, f {
    boolean A(Object obj);

    String B();

    boolean g();

    int hashCode();

    boolean isAbstract();

    @NotNull
    List<d<? extends T>> m();

    boolean n();

    boolean s();

    String u();

    T v();
}
