package oe;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f21179a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f21181c;

    /* renamed from: d, reason: collision with root package name */
    public int f21182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, mf.c cVar) {
        super(cVar);
        this.f21181c = gVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21180b = obj;
        this.f21182d |= Integer.MIN_VALUE;
        return this.f21181c.i(null, null, this);
    }
}
