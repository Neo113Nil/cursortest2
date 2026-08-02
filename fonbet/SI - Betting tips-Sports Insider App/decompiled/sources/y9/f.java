package y9;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements c {
    @Override // y9.c
    public final b a(a aVar) {
        throw new UnsupportedOperationException("InMemory storage does not persist batches.");
    }

    @Override // y9.c
    public final ArrayList f() {
        return new ArrayList();
    }

    @Override // y9.c
    public final b h(a aVar) {
        return new e(aVar);
    }
}
