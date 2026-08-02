package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final f f19201a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19202b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19203c;

    public e(f list, int i5, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f19201a = list;
        this.f19202b = i5;
        c cVar = f.Companion;
        int size = list.size();
        cVar.getClass();
        c.d(i5, i10, size);
        this.f19203c = i10 - i5;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i5) {
        f.Companion.getClass();
        c.b(i5, this.f19203c);
        return this.f19201a.get(this.f19202b + i5);
    }

    @Override // kotlin.collections.a
    public final int getSize() {
        return this.f19203c;
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i5, int i10) {
        f.Companion.getClass();
        c.d(i5, i10, this.f19203c);
        int i11 = this.f19202b;
        return new e(this.f19201a, i5 + i11, i11 + i10);
    }
}
