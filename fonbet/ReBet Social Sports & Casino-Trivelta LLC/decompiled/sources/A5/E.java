package A5;

import android.view.ViewGroup;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class E extends H {

    /* renamed from: w, reason: collision with root package name */
    public final ViewGroup f69w;

    /* renamed from: x, reason: collision with root package name */
    public int f70x;

    /* renamed from: y, reason: collision with root package name */
    public List f71y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(ViewGroup viewGroup) {
        super(viewGroup, null, 0, false, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 0, false, false, false, null, 1048574, null);
        List c10;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        this.f69w = viewGroup;
        this.f71y = CollectionsKt.emptyList();
        c10 = G.c(viewGroup);
        this.f71y = c10;
        this.f70x = c10.size();
    }

    @Override // A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return Intrinsics.areEqual(this.f69w, e10.f69w) && Intrinsics.areEqual(this.f71y, e10.f71y) && this.f70x == e10.f70x;
    }

    @Override // A5.H
    public int hashCode() {
        return (((this.f69w.hashCode() * 31) + this.f71y.hashCode()) * 31) + this.f70x;
    }

    public final List l() {
        return this.f71y;
    }

    @Override // A5.H
    public String toString() {
        return "ViewGroupMetadata(children=" + this.f71y + ", childCount=" + this.f70x + ")";
    }
}
