package e5;

import androidx.appcompat.widget.a0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f8635a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8636b;

    /* renamed from: c, reason: collision with root package name */
    public final l f8637c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8638d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8639e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f8640f;

    public h(String str, Integer num, l lVar, long j, long j6, HashMap hashMap) {
        this.f8635a = str;
        this.f8636b = num;
        this.f8637c = lVar;
        this.f8638d = j;
        this.f8639e = j6;
        this.f8640f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f8640f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f8640f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a0 c() {
        a0 a0Var = new a0(7);
        String str = this.f8635a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        a0Var.f680b = str;
        a0Var.f681c = this.f8636b;
        l lVar = this.f8637c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        a0Var.f682d = lVar;
        a0Var.f683e = Long.valueOf(this.f8638d);
        a0Var.f684f = Long.valueOf(this.f8639e);
        a0Var.f685g = new HashMap(this.f8640f);
        return a0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f8636b;
            if (this.f8635a.equals(hVar.f8635a) && ((num = this.f8636b) != null ? num.equals(num2) : num2 == null) && this.f8637c.equals(hVar.f8637c) && this.f8638d == hVar.f8638d && this.f8639e == hVar.f8639e && this.f8640f.equals(hVar.f8640f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f8635a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f8636b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f8637c.hashCode()) * 1000003;
        long j = this.f8638d;
        int i5 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.f8639e;
        return ((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f8640f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f8635a + ", code=" + this.f8636b + ", encodedPayload=" + this.f8637c + ", eventMillis=" + this.f8638d + ", uptimeMillis=" + this.f8639e + ", autoMetadata=" + this.f8640f + "}";
    }
}
