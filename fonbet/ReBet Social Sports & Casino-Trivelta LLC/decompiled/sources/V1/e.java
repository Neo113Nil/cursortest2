package V1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12343c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12344d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f12342b = str;
        this.f12343c = str2;
        this.f12344d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f12343c, eVar.f12343c) && Objects.equals(this.f12342b, eVar.f12342b) && Objects.equals(this.f12344d, eVar.f12344d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12342b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12343c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12344d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // V1.i
    public String toString() {
        return this.f12353a + ": language=" + this.f12342b + ", description=" + this.f12343c + ", text=" + this.f12344d;
    }
}
