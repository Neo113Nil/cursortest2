package j40;

import J7.h;
import android.content.Context;
import j40.C7282e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j40.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7279b implements Jb.e<J7.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f69430a;

    public C7279b(Pc.a<Context> aVar) {
        this.f69430a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((C7282e.c) this.f69430a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        h a11 = J7.d.a(context);
        Intrinsics.checkNotNullExpressionValue(a11, "create(...)");
        return a11;
    }
}
