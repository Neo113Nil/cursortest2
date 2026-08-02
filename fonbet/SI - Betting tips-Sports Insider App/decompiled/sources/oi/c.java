package oi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends a {
    @Override // oi.a
    public final List a(Executor executor) {
        return Arrays.asList(new k(), new o(executor));
    }

    @Override // oi.a
    public final List b() {
        return Collections.singletonList(new b(1));
    }
}
