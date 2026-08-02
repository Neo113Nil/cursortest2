package gg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10104b;

    public /* synthetic */ u(int i5, Object obj) {
        this.f10103a = i5;
        this.f10104b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i5 = this.f10103a;
        Object obj2 = this.f10104b;
        switch (i5) {
            case 0:
                gf.o oVar = gf.q.f10031a;
                Unit unit = Unit.f19194a;
                ((eg.l) obj2).resumeWith(unit);
                return unit;
            default:
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                throw new IllegalStateException(d9.e.l(new StringBuilder("Unable to open database '"), (String) obj2, "'. Was a proper path / name used in Room's database builder?"), error);
        }
    }
}
