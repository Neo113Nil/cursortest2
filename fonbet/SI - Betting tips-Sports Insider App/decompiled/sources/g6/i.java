package g6;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements d6.b {

    /* renamed from: b, reason: collision with root package name */
    public static final i f9849b = new i(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f9850a;

    public /* synthetic */ i(String str) {
        this.f9850a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return v.k(this.f9850a, ((i) obj).f9850a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9850a});
    }
}
