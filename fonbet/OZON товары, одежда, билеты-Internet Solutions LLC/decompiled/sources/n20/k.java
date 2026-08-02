package n20;

import j20.InterfaceC7243a;
import java.util.Collection;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface k<M extends InterfaceC8046a<?, ? extends l20.c>> {
    boolean containsWidget(@NotNull String str);

    @NotNull
    Collection<InterfaceC7243a<? extends Object>> getConfigs(@NotNull String str, long j11);

    M getViewMapper(int i11);

    Collection<C8426f<M>> getViewMappers(@NotNull String str, long j11);

    void insert(@NotNull i iVar);
}
