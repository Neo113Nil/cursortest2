package gf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends b implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public ug.p f10013a;

    /* renamed from: b, reason: collision with root package name */
    public Unit f10014b;

    /* renamed from: c, reason: collision with root package name */
    public Continuation f10015c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10016d;

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f19227a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f10015c = null;
        this.f10016d = obj;
    }
}
