package V1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12365b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12366c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f12365b = str2;
        this.f12366c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f12353a.equals(oVar.f12353a) && Objects.equals(this.f12365b, oVar.f12365b) && Objects.equals(this.f12366c, oVar.f12366c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (527 + this.f12353a.hashCode()) * 31;
        String str = this.f12365b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12366c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // V1.i
    public String toString() {
        return this.f12353a + ": url=" + this.f12366c;
    }
}
