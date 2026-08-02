package e10;

import T00.j;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* renamed from: e10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC6251a extends AbstractC6252b {
    @NotNull
    public abstract List<j> combineWith(@NotNull List<j> list, @NotNull Map<String, ? extends List<j>> map);

    @NotNull
    public abstract Set<String> getCombineKeys();

    @Override // e10.AbstractC6252b, j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return getCombineKeys();
    }
}
