package sb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23423a;

    /* renamed from: b, reason: collision with root package name */
    public int f23424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f23425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, Continuation continuation) {
        super(continuation);
        this.f23425c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23423a = obj;
        this.f23424b |= Integer.MIN_VALUE;
        return this.f23425c.d(null, this);
    }
}
