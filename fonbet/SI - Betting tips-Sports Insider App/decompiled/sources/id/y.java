package id;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f11226a;

    /* renamed from: b, reason: collision with root package name */
    public x f11227b;

    /* renamed from: c, reason: collision with root package name */
    public int f11228c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m3.f f11230e;

    /* renamed from: f, reason: collision with root package name */
    public int f11231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m3.f fVar, mf.c cVar) {
        super(cVar);
        this.f11230e = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11229d = obj;
        this.f11231f |= Integer.MIN_VALUE;
        return this.f11230e.i(null, null, this);
    }
}
