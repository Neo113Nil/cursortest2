package w30;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f103570a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f103571b;

    public t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f103570a = context;
        this.f103571b = Sc.k.a(Sc.n.PUBLICATION, new B50.g(this, 4));
    }

    public static W9.b a(t tVar) {
        return new W9.b(tVar.f103570a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final boolean b() {
        return ((W9.b) this.f103571b.getValue()).c();
    }
}
