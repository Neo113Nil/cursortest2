package e5;

import android.util.Base64;
import androidx.appcompat.app.v0;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f8641a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8642b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.d f8643c;

    public i(String str, byte[] bArr, b5.d dVar) {
        this.f8641a = str;
        this.f8642b = bArr;
        this.f8643c = dVar;
    }

    public static v0 a() {
        v0 v0Var = new v0(9, false);
        v0Var.f366d = b5.d.f3026a;
        return v0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f8641a.equals(iVar.f8641a) && Arrays.equals(this.f8642b, iVar.f8642b) && this.f8643c.equals(iVar.f8643c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8641a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8642b)) * 1000003) ^ this.f8643c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f8642b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f8641a);
        sb2.append(", ");
        sb2.append(this.f8643c);
        sb2.append(", ");
        return d9.e.l(sb2, encodeToString, ")");
    }
}
