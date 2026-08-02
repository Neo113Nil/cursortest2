package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class T extends J0 {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f45326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(String name, N generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f45326j = true;
    }

    @Override // di.J0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        bi.f fVar = (bi.f) obj;
        if (!Intrinsics.areEqual(h(), fVar.h())) {
            return false;
        }
        T t10 = (T) obj;
        if (!t10.isInline() || !Arrays.equals(s(), t10.s()) || d() != fVar.d()) {
            return false;
        }
        int d10 = d();
        for (int i10 = 0; i10 < d10; i10++) {
            if (!Intrinsics.areEqual(g(i10).h(), fVar.g(i10).h()) || !Intrinsics.areEqual(g(i10).getKind(), fVar.g(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // di.J0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // di.J0, bi.f
    public boolean isInline() {
        return this.f45326j;
    }
}
