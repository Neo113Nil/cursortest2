package hc;

import android.os.Bundle;
import com.sports.insider.data.repository.room.news.NewsTable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f10494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10495b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10496c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10497d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10498e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10499f;

    public h(int i5, int i10, String str, String str2, String str3, String str4) {
        this.f10494a = i5;
        this.f10495b = i10;
        this.f10496c = str;
        this.f10497d = str2;
        this.f10498e = str3;
        this.f10499f = str4;
    }

    @Override // hc.f
    public final boolean areContentsTheSame(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z5 = obj instanceof h;
        String str = this.f10496c;
        String str2 = this.f10498e;
        String str3 = this.f10497d;
        String str4 = this.f10499f;
        int i5 = this.f10495b;
        if (z5) {
            h hVar = (h) obj;
            return i5 == hVar.f10495b && Intrinsics.areEqual(str4, hVar.f10499f) && Intrinsics.areEqual(str3, hVar.f10497d) && Intrinsics.areEqual(str2, hVar.f10498e) && Intrinsics.areEqual(str, hVar.f10496c);
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar2 = (h) obj;
        return i5 == hVar2.f10495b && Intrinsics.areEqual(str4, hVar2.f10499f) && Intrinsics.areEqual(str3, hVar2.f10497d) && Intrinsics.areEqual(str2, hVar2.f10498e) && Intrinsics.areEqual(str, hVar2.f10496c);
    }

    @Override // hc.f
    public final boolean areItemsTheSame(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z5 = obj instanceof h;
        int i5 = this.f10494a;
        return z5 ? i5 == ((h) obj).f10494a : obj instanceof h ? i5 == ((h) obj).f10494a : super.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f10494a == hVar.f10494a && this.f10495b == hVar.f10495b && Intrinsics.areEqual(this.f10496c, hVar.f10496c) && Intrinsics.areEqual(this.f10497d, hVar.f10497d) && Intrinsics.areEqual(this.f10498e, hVar.f10498e) && Intrinsics.areEqual(this.f10499f, hVar.f10499f);
    }

    @Override // hc.f
    public final Object getChangePayload(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        boolean z5 = obj instanceof h;
        String str = this.f10499f;
        int i5 = this.f10495b;
        String str2 = this.f10496c;
        String str3 = this.f10498e;
        String str4 = this.f10497d;
        if (z5) {
            Bundle bundle2 = new Bundle();
            h hVar = (h) obj;
            String str5 = hVar.f10499f;
            int i10 = hVar.f10495b;
            if (i5 != i10) {
                bundle2.putInt(NewsTable.DATE_TIME_COLUMN, i10);
            }
            if (!Intrinsics.areEqual(str, str5)) {
                bundle2.putString("dateTimeFormat", str5);
            }
            if (!Intrinsics.areEqual(str4, hVar.f10497d)) {
                bundle2.putString(NewsTable.PICTURE_COLUMN, str4);
            }
            if (!Intrinsics.areEqual(str3, hVar.f10498e)) {
                bundle2.putString(NewsTable.TEXT_COLUMN, str3);
            }
            if (!Intrinsics.areEqual(str2, hVar.f10496c)) {
                bundle2.putString("title", str2);
            }
            return bundle2;
        }
        if (obj instanceof h) {
            bundle = new Bundle();
            h hVar2 = (h) obj;
            String str6 = hVar2.f10499f;
            int i11 = hVar2.f10495b;
            if (i5 != i11) {
                bundle.putInt(NewsTable.DATE_TIME_COLUMN, i11);
            }
            if (!Intrinsics.areEqual(str, str6)) {
                bundle.putString("dateTimeFormat", str6);
            }
            if (!Intrinsics.areEqual(str4, hVar2.f10497d)) {
                bundle.putString(NewsTable.PICTURE_COLUMN, str4);
            }
            if (!Intrinsics.areEqual(str3, hVar2.f10498e)) {
                bundle.putString(NewsTable.TEXT_COLUMN, str3);
            }
            if (!Intrinsics.areEqual(str2, hVar2.f10496c)) {
                bundle.putString("title", str2);
            }
        }
        return bundle;
    }

    public final int hashCode() {
        int i5 = ((this.f10494a * 31) + this.f10495b) * 31;
        String str = this.f10496c;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10497d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10498e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10499f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewNewsImpl(id=");
        sb2.append(this.f10494a);
        sb2.append(", dateTime=");
        sb2.append(this.f10495b);
        sb2.append(", title=");
        sb2.append(this.f10496c);
        sb2.append(", picture=");
        sb2.append(this.f10497d);
        sb2.append(", text=");
        sb2.append(this.f10498e);
        sb2.append(", formatDateTime=");
        return d9.e.k(sb2, this.f10499f, ')');
    }
}
