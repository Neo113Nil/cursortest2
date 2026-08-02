package t30;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import t30.g;
import x30.j;

/* loaded from: classes3.dex */
public final class f implements Jb.e<j> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f99062a;

    public f(Pc.a<Context> aVar) {
        this.f99062a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((g.a.n) this.f99062a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new j(context);
    }
}
