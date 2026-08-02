package jg;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d implements eg.z {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f18494a;

    public d(CoroutineContext coroutineContext) {
        this.f18494a = coroutineContext;
    }

    @Override // eg.z
    public final CoroutineContext C() {
        return this.f18494a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f18494a + ')';
    }
}
