package Gd;

import com.zoho.livechat.android.modules.brand.data.local.entities.FormEntity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f3925c;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f3927a = LazyKt.lazy(b.f3928d);

    /* renamed from: b, reason: collision with root package name */
    public static final C0085a f3924b = new C0085a(null);

    /* renamed from: d, reason: collision with root package name */
    public static Object f3926d = new Object();

    /* renamed from: Gd.a$a, reason: collision with other inner class name */
    public static final class C0085a {
        public /* synthetic */ C0085a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar;
            synchronized (a.f3926d) {
                aVar = a.f3925c;
                if (aVar == null) {
                    aVar = new a();
                    a.f3925c = aVar;
                }
            }
            return aVar;
        }

        public C0085a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f3928d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Hd.a invoke() {
            return Yd.a.h().h();
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f3929n;

        /* renamed from: p, reason: collision with root package name */
        public int f3931p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3929n = obj;
            this.f3931p |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f3932n;

        /* renamed from: p, reason: collision with root package name */
        public int f3934p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3932n = obj;
            this.f3934p |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Continuation continuation) {
        c cVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f3931p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f3931p = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f3929n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f3931p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Hd.a e10 = e();
                    cVar.f3931p = 1;
                    obj = e10.a(str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((FormEntity) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f3929n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f3931p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((FormEntity) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    public final Hd.a e() {
        return (Hd.a) this.f3927a.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(FormEntity formEntity, Continuation continuation) {
        d dVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f3934p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f3934p = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f3932n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f3934p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Hd.a e10 = e();
                    dVar.f3934p = 1;
                    if (e10.b(formEntity, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f3932n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f3934p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }
}
