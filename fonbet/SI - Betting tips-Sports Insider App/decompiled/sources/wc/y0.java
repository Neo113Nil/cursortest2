package wc;

import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f25226a;

    /* renamed from: b, reason: collision with root package name */
    public int f25227b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25228c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s7.t f25229d;

    /* renamed from: e, reason: collision with root package name */
    public int f25230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(s7.t tVar, mf.c cVar) {
        super(cVar);
        this.f25229d = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25228c = obj;
        this.f25230e |= Integer.MIN_VALUE;
        return this.f25229d.h(null, this);
    }
}
