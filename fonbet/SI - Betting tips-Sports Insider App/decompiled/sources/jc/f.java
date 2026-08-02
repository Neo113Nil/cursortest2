package jc;

import android.graphics.Color;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f18436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18437b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18438c;

    /* renamed from: d, reason: collision with root package name */
    public final a f18439d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f18440e;

    public f(int i5, int i10, int i11, a icon, Integer num) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f18436a = i5;
        this.f18437b = i10;
        this.f18438c = i11;
        this.f18439d = icon;
        this.f18440e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f18436a == fVar.f18436a && this.f18437b == fVar.f18437b && this.f18438c == fVar.f18438c && Intrinsics.areEqual(this.f18439d, fVar.f18439d) && Intrinsics.areEqual(this.f18440e, fVar.f18440e);
    }

    public final int hashCode() {
        int hashCode = (this.f18439d.hashCode() + (((((this.f18436a * 31) + this.f18437b) * 31) + this.f18438c) * 31)) * 31;
        Integer num = this.f18440e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FaqSeparator(text=" + this.f18436a + ", description=" + this.f18437b + ", textRight=" + this.f18438c + ", icon=" + this.f18439d + ", backgroundColor=" + this.f18440e + ')';
    }

    public /* synthetic */ f(int i5, int i10, a aVar) {
        this(i5, i10, 0, aVar, Integer.valueOf(Color.parseColor("#0CCC99")));
    }
}
