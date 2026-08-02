package m2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20207a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20208b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20209c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f20210d;

    /* renamed from: e, reason: collision with root package name */
    public CoroutineContext f20211e;

    /* renamed from: f, reason: collision with root package name */
    public Ref.ObjectRef f20212f;

    /* renamed from: g, reason: collision with root package name */
    public y8.d f20213g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f20214h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f20215i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, mf.c cVar) {
        super(cVar);
        this.f20215i = gVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20214h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f20215i.H(false, null, this);
    }
}
