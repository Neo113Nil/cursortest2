package sb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23420a;

    /* renamed from: b, reason: collision with root package name */
    public int f23421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f23422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar, Continuation continuation) {
        super(continuation);
        this.f23422c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23420a = obj;
        this.f23421b |= Integer.MIN_VALUE;
        return this.f23422c.d(null, this);
    }
}
