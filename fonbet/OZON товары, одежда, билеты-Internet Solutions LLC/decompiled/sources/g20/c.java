package g20;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;

/* loaded from: classes7.dex */
public final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8046a[] f63720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long[] jArr, InterfaceC8046a[] interfaceC8046aArr) {
        super("internal_composer", "loading_component", jArr);
        this.f63720a = interfaceC8046aArr;
    }

    @Override // n20.i
    public final InterfaceC7243a<? extends Object> config(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new d();
    }

    @Override // n20.i
    public final InterfaceC8046a<?, ? extends l20.c>[] viewMappers(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return this.f63720a;
    }

    @Override // n20.i
    public final C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return j.a();
    }
}
