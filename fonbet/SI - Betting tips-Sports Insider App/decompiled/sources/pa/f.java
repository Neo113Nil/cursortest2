package pa;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f21586a;

    /* renamed from: b, reason: collision with root package name */
    public String f21587b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na.b f21589d;

    /* renamed from: e, reason: collision with root package name */
    public int f21590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(na.b bVar, mf.c cVar) {
        super(cVar);
        this.f21589d = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21588c = obj;
        this.f21590e |= Integer.MIN_VALUE;
        return this.f21589d.J0(null, null, null, null, this);
    }
}
