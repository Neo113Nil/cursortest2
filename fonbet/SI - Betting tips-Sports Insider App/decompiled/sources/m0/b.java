package m0;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f20105a;

    /* renamed from: b, reason: collision with root package name */
    public String f20106b;

    /* renamed from: c, reason: collision with root package name */
    public List f20107c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f20105a, bVar.f20105a) && Objects.equals(this.f20106b, bVar.f20106b) && Objects.equals(this.f20107c, bVar.f20107c);
    }

    public final int hashCode() {
        return Objects.hash(this.f20105a, this.f20106b, this.f20107c);
    }
}
