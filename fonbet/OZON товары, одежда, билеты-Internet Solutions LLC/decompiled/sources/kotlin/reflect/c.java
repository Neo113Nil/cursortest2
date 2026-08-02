package kotlin.reflect;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface c<R> extends b {
    R call(@NotNull Object... objArr);

    R callBy(@NotNull Map<l, ? extends Object> map);

    @NotNull
    String getName();

    @NotNull
    List<l> getParameters();

    @NotNull
    q getReturnType();

    @NotNull
    List<r> getTypeParameters();

    t getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
