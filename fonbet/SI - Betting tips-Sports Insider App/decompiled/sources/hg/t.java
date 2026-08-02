package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class t extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10762a;

    /* renamed from: b, reason: collision with root package name */
    public int f10763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f10764c;

    /* renamed from: d, reason: collision with root package name */
    public u f10765d;

    /* renamed from: e, reason: collision with root package name */
    public h f10766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation continuation) {
        super(continuation);
        this.f10764c = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10762a = obj;
        this.f10763b |= Integer.MIN_VALUE;
        return this.f10764c.a(null, this);
    }
}
