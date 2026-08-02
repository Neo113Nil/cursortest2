package cf;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import android.app.Application;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.y;
import df.InterfaceC4065a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.EnumC5132a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import me.C5582a;

/* renamed from: cf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2917a {

    /* renamed from: d, reason: collision with root package name */
    public static C2917a f27758d;

    /* renamed from: a, reason: collision with root package name */
    public final Application f27760a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f27761b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0449a f27757c = new C0449a(null);

    /* renamed from: e, reason: collision with root package name */
    public static Object f27759e = new Object();

    /* renamed from: cf.a$a, reason: collision with other inner class name */
    public static final class C0449a {
        public /* synthetic */ C0449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2917a a(Application application) {
            C2917a c2917a;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (C2917a.f27759e) {
                c2917a = C2917a.f27758d;
                if (c2917a == null) {
                    c2917a = new C2917a(application, null);
                    C2917a.f27758d = c2917a;
                }
            }
            return c2917a;
        }

        public C0449a() {
        }
    }

    /* renamed from: cf.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f27762d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4065a invoke() {
            return Yd.a.h().g();
        }
    }

    /* renamed from: cf.a$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f27763n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f27764o;

        /* renamed from: q, reason: collision with root package name */
        public int f27766q;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27764o = obj;
            this.f27766q |= Integer.MIN_VALUE;
            return C2917a.this.f(this);
        }
    }

    /* renamed from: cf.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27767n;

        /* renamed from: p, reason: collision with root package name */
        public int f27769p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27767n = obj;
            this.f27769p |= Integer.MIN_VALUE;
            return C2917a.this.g(null, null, false, null, this);
        }
    }

    /* renamed from: cf.a$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public boolean f27770n;

        /* renamed from: o, reason: collision with root package name */
        public Object f27771o;

        /* renamed from: p, reason: collision with root package name */
        public Object f27772p;

        /* renamed from: q, reason: collision with root package name */
        public Object f27773q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27774r;

        /* renamed from: t, reason: collision with root package name */
        public int f27776t;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27774r = obj;
            this.f27776t |= Integer.MIN_VALUE;
            return C2917a.this.h(null, null, false, null, this);
        }
    }

    /* renamed from: cf.a$f */
    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27777n;

        /* renamed from: p, reason: collision with root package name */
        public int f27779p;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27777n = obj;
            this.f27779p |= Integer.MIN_VALUE;
            return C2917a.this.i(null, this);
        }
    }

    /* renamed from: cf.a$g */
    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27780n;

        /* renamed from: p, reason: collision with root package name */
        public int f27782p;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27780n = obj;
            this.f27782p |= Integer.MIN_VALUE;
            return C2917a.this.m(null, this);
        }
    }

    /* renamed from: cf.a$h */
    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27783n;

        /* renamed from: p, reason: collision with root package name */
        public int f27785p;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27783n = obj;
            this.f27785p |= Integer.MIN_VALUE;
            return C2917a.this.s(null, null, this);
        }
    }

    /* renamed from: cf.a$i */
    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f27786n;

        /* renamed from: o, reason: collision with root package name */
        public Object f27787o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f27788p;

        /* renamed from: r, reason: collision with root package name */
        public int f27790r;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27788p = obj;
            this.f27790r |= Integer.MIN_VALUE;
            return C2917a.this.t(null, this);
        }
    }

    /* renamed from: cf.a$j */
    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f27791n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f27792o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ File f27793p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ File f27794q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ArticleEntity f27795r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(File file, File file2, ArticleEntity articleEntity, Continuation continuation) {
            super(2, continuation);
            this.f27793p = file;
            this.f27794q = file2;
            this.f27795r = articleEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f27793p, this.f27794q, this.f27795r, continuation);
            jVar.f27792o = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f27791n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File file = this.f27793p;
            File file2 = this.f27794q;
            ArticleEntity articleEntity = this.f27795r;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (!file.exists()) {
                    file.mkdirs();
                }
                String content = articleEntity.getContent();
                Intrinsics.checkNotNull(content);
                FilesKt.writeText(file2, content, Charsets.UTF_8);
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return Result.m146boximpl(m147constructorimpl);
        }
    }

    /* renamed from: cf.a$k */
    public static final class k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public boolean f27796n;

        /* renamed from: o, reason: collision with root package name */
        public Object f27797o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f27798p;

        /* renamed from: r, reason: collision with root package name */
        public int f27800r;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27798p = obj;
            this.f27800r |= Integer.MIN_VALUE;
            return C2917a.this.u(null, false, this);
        }
    }

    /* renamed from: cf.a$l */
    public static final class l extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f27801n;

        /* renamed from: o, reason: collision with root package name */
        public Object f27802o;

        /* renamed from: p, reason: collision with root package name */
        public Object f27803p;

        /* renamed from: q, reason: collision with root package name */
        public Object f27804q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27805r;

        /* renamed from: t, reason: collision with root package name */
        public int f27807t;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27805r = obj;
            this.f27807t |= Integer.MIN_VALUE;
            return C2917a.this.w(null, this);
        }
    }

    /* renamed from: cf.a$m */
    public static final class m extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27808n;

        /* renamed from: p, reason: collision with root package name */
        public int f27810p;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27808n = obj;
            this.f27810p |= Integer.MIN_VALUE;
            return C2917a.this.x(null, 0L, this);
        }
    }

    /* renamed from: cf.a$n */
    public static final class n extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27811n;

        /* renamed from: p, reason: collision with root package name */
        public int f27813p;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27811n = obj;
            this.f27813p |= Integer.MIN_VALUE;
            return C2917a.this.y(null, null, this);
        }
    }

    /* renamed from: cf.a$o */
    public static final class o extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27814n;

        /* renamed from: p, reason: collision with root package name */
        public int f27816p;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27814n = obj;
            this.f27816p |= Integer.MIN_VALUE;
            return C2917a.this.z(null, 0L, this);
        }
    }

    public /* synthetic */ C2917a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static /* synthetic */ C5582a l(C2917a c2917a, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c2917a.k(str, str2, str3, z10);
    }

    public static /* synthetic */ Object v(C2917a c2917a, List list, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c2917a.u(list, z10, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(3:27|28|(2:30|26)(1:31))|24))|34|6|7|(0)(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r7.C(r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r7 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Continuation continuation) {
        c cVar;
        int i10;
        C2917a c2917a;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f27766q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f27766q = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f27764o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f27766q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    new File(y.INSTANCE.getFileCache().e(), "/articles").delete();
                    InterfaceC4065a o10 = o();
                    cVar.f27763n = this;
                    cVar.f27766q = 1;
                    if (o10.s(cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c2917a = this;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return me.b.a(m147constructorimpl);
                    }
                    c2917a = (C2917a) cVar.f27763n;
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC4065a o11 = c2917a.o();
                cVar.f27763n = null;
                cVar.f27766q = 2;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f27764o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f27766q;
        if (i10 != 0) {
        }
        InterfaceC4065a o112 = c2917a.o();
        cVar.f27763n = null;
        cVar.f27766q = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|29|6|7|8|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, boolean z10, List list, Continuation continuation) {
        d dVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f27769p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f27769p = i11 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f27767n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar2.f27769p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    dVar2.f27769p = 1;
                    if (o10.b(str, str2, z10, list, dVar2) == coroutine_suspended) {
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
        d dVar22 = dVar;
        Object obj2 = dVar22.f27767n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar22.f27769p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:(6:12|13|14|(1:16)|17|18)(2:21|22))(3:23|24|25))(3:30|31|(2:33|29)(1:34))|26|27))|38|6|7|8|(0)(0)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r1.B(r8, r3, r4, (java.util.List) r12, r6) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, boolean z10, List list, Continuation continuation) {
        e eVar;
        int i10;
        String str3;
        InterfaceC4065a interfaceC4065a;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f27776t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f27776t = i11 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.f27774r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar2.f27776t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    eVar2.f27771o = str2;
                    eVar2.f27772p = str;
                    eVar2.f27773q = o10;
                    eVar2.f27770n = z10;
                    eVar2.f27776t = 1;
                    Object w10 = w(list, eVar2);
                    if (w10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str2;
                    interfaceC4065a = o10;
                    obj = w10;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return me.b.a(m147constructorimpl);
                    }
                    z10 = eVar2.f27770n;
                    InterfaceC4065a interfaceC4065a2 = (InterfaceC4065a) eVar2.f27773q;
                    String str4 = (String) eVar2.f27772p;
                    String str5 = (String) eVar2.f27771o;
                    ResultKt.throwOnFailure(obj);
                    interfaceC4065a = interfaceC4065a2;
                    str = str4;
                    str3 = str5;
                }
                boolean z11 = z10;
                eVar2.f27771o = null;
                eVar2.f27772p = null;
                eVar2.f27773q = null;
                eVar2.f27776t = 2;
            }
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.f27774r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar22.f27776t;
        if (i10 != 0) {
        }
        boolean z112 = z10;
        eVar22.f27771o = null;
        eVar22.f27772p = null;
        eVar22.f27773q = null;
        eVar22.f27776t = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r8 = kotlin.Result.INSTANCE;
        r7 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, Continuation continuation) {
        f fVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f27779p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f27779p = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f27777n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f27779p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    new File(new File(y.INSTANCE.getFileCache().e(), "/articles"), str + ".html").delete();
                    InterfaceC4065a o10 = o();
                    fVar.f27779p = 1;
                    if (o10.A(str, fVar) == coroutine_suspended) {
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
        fVar = new f(continuation);
        Object obj2 = fVar.f27777n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f27779p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    public final C5582a j(String articleId) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(o().a(articleId));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a k(String str, String str2, String str3, boolean z10) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(o().e(str, str2, str3, z10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
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
    public final Object m(List list, Continuation continuation) {
        g gVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f27782p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f27782p = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f27780n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f27782p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    gVar.f27782p = 1;
                    obj = o10.i(list, gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl((List) obj);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f27780n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f27782p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((List) obj2);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    public final C5582a n(String str, String str2, String str3, boolean z10, boolean z11, List resourceDepartmentIds) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(resourceDepartmentIds, "resourceDepartmentIds");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(o().k(str, str2, str3, z10, z11, resourceDepartmentIds));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final InterfaceC4065a o() {
        return (InterfaceC4065a) this.f27761b.getValue();
    }

    public final C5582a p(String str, String str2, boolean z10, boolean z11, List resourceDepartmentIds, int i10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(resourceDepartmentIds, "resourceDepartmentIds");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(o().j(str, str2, z10, z11, resourceDepartmentIds, i10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a q(List resourceDepartmentIds) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(resourceDepartmentIds, "resourceDepartmentIds");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(o().n(resourceDepartmentIds));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a r(List exceptionalIds, String str, List resourceDepartmentIds) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(exceptionalIds, "exceptionalIds");
        Intrinsics.checkNotNullParameter(resourceDepartmentIds, "resourceDepartmentIds");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(o().y(exceptionalIds, str, resourceDepartmentIds));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
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
    public final Object s(String str, EnumC5132a enumC5132a, Continuation continuation) {
        h hVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f27785p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f27785p = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f27783n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = hVar.f27785p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    hVar.f27785p = 1;
                    if (o10.m(str, enumC5132a, hVar) == coroutine_suspended) {
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
        hVar = new h(continuation);
        Object obj2 = hVar.f27783n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar.f27785p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ArticleEntity articleEntity, Continuation continuation) {
        i iVar;
        int i10;
        Integer num;
        ArticleEntity articleEntity2;
        File file;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f27790r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f27790r = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f27788p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = iVar.f27790r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String content = articleEntity.getContent();
                    if (content != null) {
                        byte[] bytes = content.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        if (bytes != null) {
                            num = Boxing.boxInt(bytes.length);
                            if (og.i.k(num) > 1048576) {
                                return articleEntity;
                            }
                            File file2 = new File(y.INSTANCE.getFileCache().e(), "/articles");
                            File file3 = new File(file2, articleEntity.getId() + ".html");
                            L b10 = C1452g0.b();
                            j jVar = new j(file2, file3, articleEntity, null);
                            iVar.f27786n = articleEntity;
                            iVar.f27787o = file3;
                            iVar.f27790r = 1;
                            if (AbstractC1455i.g(b10, jVar, iVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            articleEntity2 = articleEntity;
                            file = file3;
                        }
                    }
                    num = null;
                    if (og.i.k(num) > 1048576) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = (File) iVar.f27787o;
                    ArticleEntity articleEntity3 = (ArticleEntity) iVar.f27786n;
                    ResultKt.throwOnFailure(obj);
                    articleEntity2 = articleEntity3;
                }
                return ArticleEntity.copy$default(articleEntity2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArticleEntity.a(file.getAbsolutePath()), 1966079, null);
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f27788p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = iVar.f27790r;
        if (i10 != 0) {
        }
        return ArticleEntity.copy$default(articleEntity2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArticleEntity.a(file.getAbsolutePath()), 1966079, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(3:27|28|(2:30|26)(1:31))|24))|34|6|7|(0)(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r7.f((java.util.List) r9, r8, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r8 = kotlin.Result.INSTANCE;
        r7 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(List list, boolean z10, Continuation continuation) {
        k kVar;
        int i10;
        InterfaceC4065a interfaceC4065a;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f27800r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f27800r = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f27798p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = kVar.f27800r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    kVar.f27797o = o10;
                    kVar.f27796n = z10;
                    kVar.f27800r = 1;
                    Object w10 = w(list, kVar);
                    if (w10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = w10;
                    interfaceC4065a = o10;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return me.b.a(m147constructorimpl);
                    }
                    z10 = kVar.f27796n;
                    interfaceC4065a = (InterfaceC4065a) kVar.f27797o;
                    ResultKt.throwOnFailure(obj);
                }
                kVar.f27797o = null;
                kVar.f27800r = 2;
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f27798p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = kVar.f27800r;
        if (i10 != 0) {
        }
        kVar.f27797o = null;
        kVar.f27800r = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:10:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(List list, Continuation continuation) {
        l lVar;
        int i10;
        C2917a c2917a;
        Iterator it;
        Collection collection;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i11 = lVar.f27807t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f27807t = i11 - Integer.MIN_VALUE;
                Object obj = lVar.f27805r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = lVar.f27807t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    c2917a = this;
                    it = list2.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) lVar.f27804q;
                    it = (Iterator) lVar.f27803p;
                    Collection collection2 = (Collection) lVar.f27802o;
                    c2917a = (C2917a) lVar.f27801n;
                    ResultKt.throwOnFailure(obj);
                    collection.add((ArticleEntity) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        ArticleEntity articleEntity = (ArticleEntity) it.next();
                        lVar.f27801n = c2917a;
                        lVar.f27802o = collection;
                        lVar.f27803p = it;
                        lVar.f27804q = collection;
                        lVar.f27807t = 1;
                        obj = c2917a.t(articleEntity, lVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        collection2 = collection;
                        collection.add((ArticleEntity) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        lVar = new l(continuation);
        Object obj2 = lVar.f27805r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = lVar.f27807t;
        if (i10 != 0) {
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
    public final Object x(String str, long j10, Continuation continuation) {
        m mVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f27810p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f27810p = i11 - Integer.MIN_VALUE;
                Object obj = mVar.f27808n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = mVar.f27810p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    mVar.f27810p = 1;
                    if (o10.D(str, j10, mVar) == coroutine_suspended) {
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
        mVar = new m(continuation);
        Object obj2 = mVar.f27808n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = mVar.f27810p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
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
    public final Object y(String str, String str2, Continuation continuation) {
        n nVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i11 = nVar.f27813p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f27813p = i11 - Integer.MIN_VALUE;
                Object obj = nVar.f27811n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = nVar.f27813p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    nVar.f27813p = 1;
                    if (o10.r(str, str2, nVar) == coroutine_suspended) {
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
        nVar = new n(continuation);
        Object obj2 = nVar.f27811n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = nVar.f27813p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
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
    public final Object z(String str, long j10, Continuation continuation) {
        o oVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i11 = oVar.f27816p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f27816p = i11 - Integer.MIN_VALUE;
                Object obj = oVar.f27814n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = oVar.f27816p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4065a o10 = o();
                    oVar.f27816p = 1;
                    if (o10.v(str, j10, oVar) == coroutine_suspended) {
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
        oVar = new o(continuation);
        Object obj2 = oVar.f27814n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = oVar.f27816p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    public C2917a(Application application) {
        this.f27760a = application;
        this.f27761b = LazyKt.lazy(b.f27762d);
    }
}
