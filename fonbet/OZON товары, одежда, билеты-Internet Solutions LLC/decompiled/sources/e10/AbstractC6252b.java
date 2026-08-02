package e10;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Set;
import kotlin.collections.M;
import n20.j;
import org.jetbrains.annotations.NotNull;

/* renamed from: e10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC6252b implements InterfaceC7243a<List<? extends Object>> {
    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }
}
