package ug;

import com.android.billingclient.api.l0;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public gf.b f24291a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f24292b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedHashMap f24293c;

    /* renamed from: d, reason: collision with root package name */
    public String f24294d;

    /* renamed from: e, reason: collision with root package name */
    public int f24295e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f24296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f24297g;

    /* renamed from: h, reason: collision with root package name */
    public int f24298h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l0 l0Var, mf.a aVar) {
        super(aVar);
        this.f24297g = l0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24296f = obj;
        this.f24298h |= Integer.MIN_VALUE;
        return l0.a(this.f24297g, null, this);
    }
}
