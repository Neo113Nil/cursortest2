package l80;

import B4.C2584m;
import androidx.lifecycle.InterfaceC5431s;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f72968a;

    public /* synthetic */ e(f fVar) {
        this.f72968a = fVar;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String tabTag = (String) obj2;
        String tabName = (String) obj3;
        int i11 = f.f72971Z;
        Intrinsics.checkNotNullParameter((C2584m) obj, "<unused var>");
        Intrinsics.checkNotNullParameter(tabTag, "tabTag");
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        f fVar = this.f72968a;
        InterfaceC5431s U10 = fVar.f0().U();
        if (U10 instanceof I30.b) {
            ((I30.b) U10).o(false);
        }
        fVar.e0().P(tabName, tabTag);
        return Unit.f71690a;
    }
}
