package zc;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f25916a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f25918c;

    /* renamed from: d, reason: collision with root package name */
    public int f25919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, mf.c cVar) {
        super(cVar);
        this.f25918c = jVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25917b = obj;
        this.f25919d |= Integer.MIN_VALUE;
        return this.f25918c.b(this);
    }
}
