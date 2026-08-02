package bd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public List f3139a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3140b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.ObjectRef f3141c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f3143e;

    /* renamed from: f, reason: collision with root package name */
    public int f3144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, mf.c cVar) {
        super(cVar);
        this.f3143e = jVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3142d = obj;
        this.f3144f |= Integer.MIN_VALUE;
        return j.b(this.f3143e, null, this);
    }
}
