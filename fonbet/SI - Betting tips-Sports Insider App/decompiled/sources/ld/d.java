package ld;

import android.content.Context;
import m3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f19687a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f19689c;

    /* renamed from: d, reason: collision with root package name */
    public int f19690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, mf.c cVar) {
        super(cVar);
        this.f19689c = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19688b = obj;
        this.f19690d |= Integer.MIN_VALUE;
        return this.f19689c.t(null, 0, this);
    }
}
