package aa;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f116a = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n(this.f116a);
    }
}
