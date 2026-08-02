package mm0;

import jm0.i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mm0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8350c implements km0.d<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8349b<Object> f76032a;

    C8350c(C8349b<Object> c8349b) {
        this.f76032a = c8349b;
    }

    @Override // km0.d
    public final void a(i d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
    }

    @Override // km0.d
    public final void onComplete() {
    }

    @Override // km0.d
    public final void onError(Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
    }

    @Override // km0.d
    public final void onNext(Object obj) {
        for (im0.c cVar : ((C8349b) this.f76032a).f76025c) {
            cVar.d(obj);
            cVar.c();
        }
    }
}
