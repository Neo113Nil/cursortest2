package V1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12355b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12356c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12357d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f12355b = str;
        this.f12356c = str2;
        this.f12357d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f12356c, kVar.f12356c) && Objects.equals(this.f12355b, kVar.f12355b) && Objects.equals(this.f12357d, kVar.f12357d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12355b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12356c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12357d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // V1.i
    public String toString() {
        return this.f12353a + ": domain=" + this.f12355b + ", description=" + this.f12356c;
    }
}
