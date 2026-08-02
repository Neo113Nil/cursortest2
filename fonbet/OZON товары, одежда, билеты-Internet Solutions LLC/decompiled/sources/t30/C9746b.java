package t30;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import t30.g;

/* renamed from: t30.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9746b implements Jb.e<w30.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f99056a;

    public C9746b(Pc.a<Context> aVar) {
        this.f99056a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((g.a.n) this.f99056a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new w30.b(context);
    }
}
