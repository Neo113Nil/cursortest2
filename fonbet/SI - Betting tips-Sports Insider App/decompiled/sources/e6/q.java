package e6;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final a f8746a;

    /* renamed from: b, reason: collision with root package name */
    public final Feature f8747b;

    public /* synthetic */ q(a aVar, Feature feature) {
        this.f8746a = aVar;
        this.f8747b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (g6.v.k(this.f8746a, qVar.f8746a) && g6.v.k(this.f8747b, qVar.f8747b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8746a, this.f8747b});
    }

    public final String toString() {
        l1.a aVar = new l1.a(this);
        aVar.i(this.f8746a, "key");
        aVar.i(this.f8747b, "feature");
        return aVar.toString();
    }
}
