package defpackage;

import com.sofascore.model.mvvm.model.Category;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ci6 extends p2 {
    public final Category b;
    public final ArrayList c;
    public boolean d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci6(Category category, ArrayList arrayList, boolean z, int i, int i2) {
        super(category, arrayList);
        category.getClass();
        this.b = category;
        this.c = arrayList;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.p2
    public final ArrayList d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci6)) {
            return false;
        }
        ci6 ci6Var = (ci6) obj;
        return Intrinsics.c(this.b, ci6Var.b) && this.c.equals(ci6Var.c) && this.d == ci6Var.d && this.e == ci6Var.e && this.f == ci6Var.f;
    }

    @Override // defpackage.p2
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + wv8.a(this.e, dmi.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31);
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder("CollapsibleCategory(category=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(", groupPosition=");
        sb.append(this.e);
        sb.append(", scrollToIndex=");
        return fc6.h(this.f, ")", sb);
    }
}
