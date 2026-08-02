package ve;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f24730a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f24731b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f24732c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f24733d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f24734e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f24735f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f24730a, i0Var.f24730a) && Intrinsics.areEqual(this.f24731b, i0Var.f24731b) && Intrinsics.areEqual(this.f24732c, i0Var.f24732c) && Intrinsics.areEqual(this.f24733d, i0Var.f24733d) && Intrinsics.areEqual(this.f24734e, i0Var.f24734e) && Intrinsics.areEqual(this.f24735f, i0Var.f24735f);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f24730a;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList arrayList2 = this.f24731b;
        int hashCode2 = (hashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.f24732c;
        int hashCode3 = (hashCode2 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList arrayList4 = this.f24733d;
        int hashCode4 = (hashCode3 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31;
        ArrayList arrayList5 = this.f24734e;
        int hashCode5 = (hashCode4 + (arrayList5 == null ? 0 : arrayList5.hashCode())) * 31;
        ArrayList arrayList6 = this.f24735f;
        return hashCode5 + (arrayList6 != null ? arrayList6.hashCode() : 0);
    }

    public final String toString() {
        return "GlobalDraw(clickAreasFirst=" + this.f24730a + ", clickAreasSecond=" + this.f24731b + ", itemsTxtFist=" + this.f24732c + ", itemsTxtSecond=" + this.f24733d + ", itemsIconFirst=" + this.f24734e + ", itemsIconSecond=" + this.f24735f + ')';
    }
}
