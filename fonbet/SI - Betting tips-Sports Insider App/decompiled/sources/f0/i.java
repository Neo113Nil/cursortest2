package f0;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f9291a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f9292b;

    public i(Resources resources, Resources.Theme theme) {
        this.f9291a = resources;
        this.f9292b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f9291a.equals(iVar.f9291a) && Objects.equals(this.f9292b, iVar.f9292b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9291a, this.f9292b);
    }
}
