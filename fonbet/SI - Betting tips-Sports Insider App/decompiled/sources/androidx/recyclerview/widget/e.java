package androidx.recyclerview.widget;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2369d;

    public e(f fVar) {
        this.f2369d = fVar;
    }

    @Override // androidx.recyclerview.widget.d
    public final boolean a(int i5, int i10) {
        f fVar = this.f2369d;
        Object oldItem = ((List) fVar.f2381c).get(i5);
        Object newItem = ((List) fVar.f2382d).get(i10);
        if (oldItem == null || newItem == null) {
            if (oldItem == null && newItem == null) {
                return true;
            }
            throw new AssertionError();
        }
        ((s7.s) ((h) fVar.f2383e).f2403b.f2473b).getClass();
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.d
    public final boolean b(int i5, int i10) {
        f fVar = this.f2369d;
        Object oldItem = ((List) fVar.f2381c).get(i5);
        Object newItem = ((List) fVar.f2382d).get(i10);
        if (oldItem == null || newItem == null) {
            return oldItem == null && newItem == null;
        }
        ((s7.s) ((h) fVar.f2383e).f2403b.f2473b).getClass();
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.d
    public final Object g(int i5, int i10) {
        f fVar = this.f2369d;
        Object obj = ((List) fVar.f2381c).get(i5);
        Object obj2 = ((List) fVar.f2382d).get(i10);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        ((s7.s) ((h) fVar.f2383e).f2403b.f2473b).getClass();
        return null;
    }

    @Override // androidx.recyclerview.widget.d
    public final int h() {
        return ((List) this.f2369d.f2382d).size();
    }

    @Override // androidx.recyclerview.widget.d
    public final int i() {
        return ((List) this.f2369d.f2381c).size();
    }
}
