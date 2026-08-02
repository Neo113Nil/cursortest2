package p1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f62937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62938b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62939c;

    /* renamed from: d, reason: collision with root package name */
    public final String f62940d;

    /* renamed from: e, reason: collision with root package name */
    public final String f62941e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f62937a = str;
        this.f62938b = str2;
        this.f62939c = str3;
        this.f62940d = str4;
        this.f62941e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f62937a, hVar.f62937a) && Objects.equals(this.f62938b, hVar.f62938b) && Objects.equals(this.f62939c, hVar.f62939c) && Objects.equals(this.f62940d, hVar.f62940d) && Objects.equals(this.f62941e, hVar.f62941e);
    }

    public int hashCode() {
        String str = this.f62937a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f62938b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f62939c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f62940d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f62941e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
