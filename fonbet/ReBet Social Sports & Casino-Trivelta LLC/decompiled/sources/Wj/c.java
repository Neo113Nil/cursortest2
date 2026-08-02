package Wj;

import Wj.j;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i f13334a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13335b;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13336n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f13337o;

        /* renamed from: q, reason: collision with root package name */
        public int f13339q;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13337o = obj;
            this.f13339q |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    public c(i accessTokenRestService, g mapper) {
        Intrinsics.checkNotNullParameter(accessTokenRestService, "accessTokenRestService");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f13334a = accessTokenRestService;
        this.f13335b = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        a aVar;
        int i10;
        c cVar;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f13339q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f13339q = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f13337o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f13339q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        i iVar = this.f13334a;
                        e eVar = new e(str);
                        aVar.f13336n = this;
                        aVar.f13339q = 1;
                        obj = iVar.a(eVar, aVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = (c) aVar.f13336n;
                        ResultKt.throwOnFailure(obj);
                    }
                    return cVar.f13335b.a((Response) obj);
                }
            }
            if (i10 != 0) {
            }
            return cVar.f13335b.a((Response) obj);
        } catch (Exception e10) {
            Tj.a.b(e10);
            return j.a.b.f13344a;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f13337o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f13339q;
    }
}
