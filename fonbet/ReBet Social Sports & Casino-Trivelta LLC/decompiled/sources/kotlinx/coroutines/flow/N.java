package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final Sh.G f54663a = new Sh.G("NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final Sh.G f54664b = new Sh.G("PENDING");

    public static final y a(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.t.f54780a;
        }
        return new M(obj);
    }

    public static final InterfaceC5321f d(L l10, CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || dVar != Rh.d.f10308b) ? E.e(l10, coroutineContext, i10, dVar) : l10;
    }
}
