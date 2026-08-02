package bo.app;

import Ph.P;
import Rh.A;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class h6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public P f25508a;

    /* renamed from: b, reason: collision with root package name */
    public A f25509b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f25510c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f25511d;

    /* renamed from: e, reason: collision with root package name */
    public Ref.ObjectRef f25512e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f25513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o6 f25514g;

    /* renamed from: h, reason: collision with root package name */
    public int f25515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(o6 o6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25514g = o6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25513f = obj;
        this.f25515h |= Integer.MIN_VALUE;
        return this.f25514g.a(null, null, null, this);
    }
}
