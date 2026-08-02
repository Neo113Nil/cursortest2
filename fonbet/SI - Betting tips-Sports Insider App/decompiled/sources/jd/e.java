package jd;

import io.sentry.hints.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f18457a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f18459c;

    /* renamed from: d, reason: collision with root package name */
    public int f18460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, mf.c cVar) {
        super(cVar);
        this.f18459c = jVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f18458b = obj;
        this.f18460d |= Integer.MIN_VALUE;
        return this.f18459c.F(null, null, this);
    }
}
