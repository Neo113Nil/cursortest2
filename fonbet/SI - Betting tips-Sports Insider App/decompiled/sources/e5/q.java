package e5;

import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements b5.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f8659a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8660b;

    /* renamed from: c, reason: collision with root package name */
    public final r f8661c;

    public q(Set set, i iVar, r rVar) {
        this.f8659a = set;
        this.f8660b = iVar;
        this.f8661c = rVar;
    }

    public final c4.d a(String str, b5.c cVar, b5.e eVar) {
        Set set = this.f8659a;
        if (set.contains(cVar)) {
            return new c4.d(this.f8660b, str, cVar, eVar, this.f8661c, 2);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
