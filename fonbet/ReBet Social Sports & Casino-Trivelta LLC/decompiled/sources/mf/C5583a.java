package mf;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.M0;
import Ph.P;
import android.app.Application;
import android.content.SharedPreferences;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.FAQListener;
import com.zoho.livechat.android.listeners.SalesIQFAQListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.Resource;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.ResourceDepartment;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceCategoryListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourceListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.ResourcesListener;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.SalesIQKnowledgeBaseListener;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import gf.C4378a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import lf.C5464b;
import me.C5582a;
import org.jetbrains.annotations.NotNull;
import rd.C6218a;
import td.C6461a;

/* renamed from: mf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5583a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5583a f56511a = new C5583a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f56512b = LazyKt.lazy(b.f56517d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f56513c = LazyKt.lazy(e.f56530d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f56514d = LazyKt.lazy(k.f56585d);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f56515e = LazyKt.lazy(g.f56542d);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f56516f = LazyKt.lazy(m.f56586d);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: mf.a$a, reason: collision with other inner class name */
    public static final class EnumC0818a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0818a[] $VALUES;
        public static final EnumC0818a Opened = new EnumC0818a("Opened", 0);
        public static final EnumC0818a Closed = new EnumC0818a("Closed", 1);
        public static final EnumC0818a Liked = new EnumC0818a("Liked", 2);
        public static final EnumC0818a Disliked = new EnumC0818a("Disliked", 3);
        public static final EnumC0818a ErrorOccurred = new EnumC0818a("ErrorOccurred", 4);

        private static final /* synthetic */ EnumC0818a[] $values() {
            return new EnumC0818a[]{Opened, Closed, Liked, Disliked, ErrorOccurred};
        }

        static {
            EnumC0818a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EnumC0818a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<EnumC0818a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0818a valueOf(String str) {
            return (EnumC0818a) Enum.valueOf(EnumC0818a.class, str);
        }

        public static EnumC0818a[] values() {
            return (EnumC0818a[]) $VALUES.clone();
        }
    }

    /* renamed from: mf.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f56517d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4378a invoke() {
            C4378a.C0690a c0690a = C4378a.f47249d;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0690a.a(e10);
        }
    }

    /* renamed from: mf.a$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f56518n;

        /* renamed from: o, reason: collision with root package name */
        public int f56519o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f56520p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f56521q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function0 f56522r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function2 f56523s;

        /* renamed from: mf.a$c$a, reason: collision with other inner class name */
        public static final class C0819a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56524n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function0 f56525o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0819a(Function0 function0, Continuation continuation) {
                super(2, continuation);
                this.f56525o = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0819a(this.f56525o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0819a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56524n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function0 function0 = this.f56525o;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: mf.a$c$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56526n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function2 f56527o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C5582a.b f56528p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Function2 function2, C5582a.b bVar, Continuation continuation) {
                super(2, continuation);
                this.f56527o = function2;
                this.f56528p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f56527o, this.f56528p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56526n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f56527o;
                if (function2 != null) {
                    Integer boxInt = Boxing.boxInt(og.i.m(this.f56528p.b()));
                    String c10 = this.f56528p.c();
                    if (c10 == null) {
                        c10 = "";
                    }
                    function2.invoke(boxInt, c10);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z10, Function0 function0, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f56520p = str;
            this.f56521q = z10;
            this.f56522r = function0;
            this.f56523s = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f56520p, this.f56521q, this.f56522r, this.f56523s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
        
            if (Ph.AbstractC1455i.g(r5, r6, r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        
            if (Ph.AbstractC1455i.g(r5, r6, r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            if (r8 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C5582a c5582a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f56519o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                lf.d q10 = C5583a.f56511a.q();
                String str = this.f56520p;
                boolean z10 = this.f56521q;
                this.f56519o = 1;
                obj = q10.h(str, z10, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c5582a = (C5582a) this.f56518n;
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = this.f56523s;
                    if (!c5582a.d()) {
                        C5582a.b c10 = c5582a.c();
                        Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        M0 c11 = C1452g0.c();
                        b bVar = new b(function2, c10, null);
                        this.f56518n = c5582a;
                        this.f56519o = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            c5582a = (C5582a) obj;
            Function0 function0 = this.f56522r;
            if (c5582a.d()) {
                ((Boolean) c5582a.b()).getClass();
                M0 c12 = C1452g0.c();
                C0819a c0819a = new C0819a(function0, null);
                this.f56518n = c5582a;
                this.f56519o = 2;
            }
            Function2 function22 = this.f56523s;
            if (!c5582a.d()) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: mf.a$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f56529n;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f56529n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C5464b n10 = C5583a.f56511a.n();
                this.f56529n = 1;
                if (n10.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: mf.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f56530d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C5464b invoke() {
            return new C5464b(C5583a.f56511a.l());
        }
    }

    /* renamed from: mf.a$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f56531n;

        /* renamed from: o, reason: collision with root package name */
        public int f56532o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f56533p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f56534q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ResourceListener f56535r;

        /* renamed from: mf.a$f$a, reason: collision with other inner class name */
        public static final class C0820a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56536n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ResourceListener f56537o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Resource f56538p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0820a(ResourceListener resourceListener, Resource resource, Continuation continuation) {
                super(2, continuation);
                this.f56537o = resourceListener;
                this.f56538p = resource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0820a(this.f56537o, this.f56538p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0820a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56536n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ResourceListener resourceListener = this.f56537o;
                if (resourceListener != null) {
                    resourceListener.onSuccess(this.f56538p);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: mf.a$f$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56539n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ResourceListener f56540o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C5582a.b f56541p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ResourceListener resourceListener, C5582a.b bVar, Continuation continuation) {
                super(2, continuation);
                this.f56540o = resourceListener;
                this.f56541p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f56540o, this.f56541p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56539n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ResourceListener resourceListener = this.f56540o;
                if (resourceListener != null) {
                    resourceListener.onFailure(og.i.m(this.f56541p.b()), this.f56541p.c());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, ResourceListener resourceListener, Continuation continuation) {
            super(2, continuation);
            this.f56533p = str;
            this.f56534q = z10;
            this.f56535r = resourceListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f56533p, this.f56534q, this.f56535r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
        
            if (Ph.AbstractC1455i.g(r5, r6, r8) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            if (Ph.AbstractC1455i.g(r6, r7, r8) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            if (r9 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C5582a c5582a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f56532o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                lf.d q10 = C5583a.f56511a.q();
                String str = this.f56533p;
                boolean z10 = this.f56534q;
                this.f56532o = 1;
                obj = q10.k(str, z10, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c5582a = (C5582a) this.f56531n;
                    ResultKt.throwOnFailure(obj);
                    ResourceListener resourceListener = this.f56535r;
                    if (!c5582a.d()) {
                        C5582a.b c10 = c5582a.c();
                        Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        M0 c11 = C1452g0.c();
                        b bVar = new b(resourceListener, c10, null);
                        this.f56531n = c5582a;
                        this.f56532o = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            c5582a = (C5582a) obj;
            ResourceListener resourceListener2 = this.f56535r;
            if (c5582a.d()) {
                Resource resource = (Resource) c5582a.b();
                M0 c12 = C1452g0.c();
                C0820a c0820a = new C0820a(resourceListener2, resource, null);
                this.f56531n = c5582a;
                this.f56532o = 2;
            }
            ResourceListener resourceListener3 = this.f56535r;
            if (!c5582a.d()) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: mf.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f56542d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.c invoke() {
            return new lf.c(C5583a.f56511a.l());
        }
    }

    /* renamed from: mf.a$h */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f56543n;

        /* renamed from: o, reason: collision with root package name */
        public int f56544o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f56545p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f56546q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ResourceCategoryListener f56547r;

        /* renamed from: mf.a$h$a, reason: collision with other inner class name */
        public static final class C0821a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56548n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ResourceCategoryListener f56549o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ List f56550p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0821a(ResourceCategoryListener resourceCategoryListener, List list, Continuation continuation) {
                super(2, continuation);
                this.f56549o = resourceCategoryListener;
                this.f56550p = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0821a(this.f56549o, this.f56550p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0821a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56548n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ResourceCategoryListener resourceCategoryListener = this.f56549o;
                if (resourceCategoryListener != null) {
                    resourceCategoryListener.onSuccess(this.f56550p);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: mf.a$h$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56551n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ResourceCategoryListener f56552o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C5582a.b f56553p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ResourceCategoryListener resourceCategoryListener, C5582a.b bVar, Continuation continuation) {
                super(2, continuation);
                this.f56552o = resourceCategoryListener;
                this.f56553p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f56552o, this.f56553p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56551n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ResourceCategoryListener resourceCategoryListener = this.f56552o;
                if (resourceCategoryListener != null) {
                    resourceCategoryListener.onFailure(og.i.m(this.f56553p.b()), this.f56553p.c());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, ResourceCategoryListener resourceCategoryListener, Continuation continuation) {
            super(2, continuation);
            this.f56545p = str;
            this.f56546q = str2;
            this.f56547r = resourceCategoryListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f56545p, this.f56546q, this.f56547r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
        
            if (Ph.AbstractC1455i.g(r5, r6, r8) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            if (Ph.AbstractC1455i.g(r6, r7, r8) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            if (r9 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C5582a c5582a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f56544o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                lf.c p10 = C5583a.f56511a.p();
                String str = this.f56545p;
                String str2 = this.f56546q;
                this.f56544o = 1;
                obj = p10.a(str, str2, true, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c5582a = (C5582a) this.f56543n;
                    ResultKt.throwOnFailure(obj);
                    ResourceCategoryListener resourceCategoryListener = this.f56547r;
                    if (!c5582a.d()) {
                        C5582a.b c10 = c5582a.c();
                        Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        M0 c11 = C1452g0.c();
                        b bVar = new b(resourceCategoryListener, c10, null);
                        this.f56543n = c5582a;
                        this.f56544o = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            c5582a = (C5582a) obj;
            ResourceCategoryListener resourceCategoryListener2 = this.f56547r;
            if (c5582a.d()) {
                List list = (List) c5582a.b();
                M0 c12 = C1452g0.c();
                C0821a c0821a = new C0821a(resourceCategoryListener2, list, null);
                this.f56543n = c5582a;
                this.f56544o = 2;
            }
            ResourceCategoryListener resourceCategoryListener3 = this.f56547r;
            if (!c5582a.d()) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: mf.a$i */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f56554n;

        /* renamed from: o, reason: collision with root package name */
        public Object f56555o;

        /* renamed from: p, reason: collision with root package name */
        public int f56556p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f56557q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f56558r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f56559s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f56560t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f56561u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f56562v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ResourcesListener f56563w;

        /* renamed from: mf.a$i$a, reason: collision with other inner class name */
        public static final class C0822a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56564n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ResourcesListener f56565o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ List f56566p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ int f56567q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0822a(ResourcesListener resourcesListener, List list, int i10, Continuation continuation) {
                super(2, continuation);
                this.f56565o = resourcesListener;
                this.f56566p = list;
                this.f56567q = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0822a(this.f56565o, this.f56566p, this.f56567q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0822a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56564n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ResourcesListener resourcesListener = this.f56565o;
                if (resourcesListener != null) {
                    List list = this.f56566p;
                    resourcesListener.onSuccess(list.subList(0, RangesKt.coerceAtMost(this.f56567q, list.size())), this.f56566p.size() > this.f56567q);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: mf.a$i$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56568n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ResourcesListener f56569o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C5582a.b f56570p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ResourcesListener resourcesListener, C5582a.b bVar, Continuation continuation) {
                super(2, continuation);
                this.f56569o = resourcesListener;
                this.f56570p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f56569o, this.f56570p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56568n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ResourcesListener resourcesListener = this.f56569o;
                if (resourcesListener != null) {
                    resourcesListener.onFailure(og.i.m(this.f56570p.b()), this.f56570p.c());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i10, String str, String str2, String str3, int i11, boolean z10, ResourcesListener resourcesListener, Continuation continuation) {
            super(2, continuation);
            this.f56557q = i10;
            this.f56558r = str;
            this.f56559s = str2;
            this.f56560t = str3;
            this.f56561u = i11;
            this.f56562v = z10;
            this.f56563w = resourcesListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f56557q, this.f56558r, this.f56559s, this.f56560t, this.f56561u, this.f56562v, this.f56563w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
        
            if (Ph.AbstractC1455i.g(r5, r6, r14) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            i iVar;
            int i10;
            C5582a c5582a;
            C5582a c5582a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56556p;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                int coerceAtMost = RangesKt.coerceAtMost(this.f56557q, 99);
                lf.d q10 = C5583a.f56511a.q();
                String str = this.f56558r;
                String str2 = this.f56559s;
                String str3 = this.f56560t;
                int i12 = this.f56561u;
                boolean z10 = this.f56562v;
                this.f56554n = coerceAtMost;
                this.f56556p = 1;
                iVar = this;
                obj = q10.a(str, str2, str3, i12, coerceAtMost, z10, iVar);
                if (obj != coroutine_suspended) {
                    i10 = coerceAtMost;
                }
                return coroutine_suspended;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                c5582a2 = (C5582a) this.f56555o;
                ResultKt.throwOnFailure(obj);
                iVar = this;
                c5582a = c5582a2;
                ResourcesListener resourcesListener = iVar.f56563w;
                if (!c5582a.d()) {
                    C5582a.b c10 = c5582a.c();
                    Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                    M0 c11 = C1452g0.c();
                    b bVar = new b(resourcesListener, c10, null);
                    iVar.f56555o = c5582a;
                    iVar.f56556p = 3;
                }
                return Unit.INSTANCE;
            }
            i10 = this.f56554n;
            ResultKt.throwOnFailure(obj);
            iVar = this;
            c5582a = (C5582a) obj;
            ResourcesListener resourcesListener2 = iVar.f56563w;
            if (c5582a.d()) {
                List list = (List) c5582a.b();
                M0 c12 = C1452g0.c();
                C0822a c0822a = new C0822a(resourcesListener2, list, i10, null);
                iVar.f56555o = c5582a;
                iVar.f56556p = 2;
                if (AbstractC1455i.g(c12, c0822a, this) != coroutine_suspended) {
                    c5582a2 = c5582a;
                    c5582a = c5582a2;
                }
                return coroutine_suspended;
            }
            ResourcesListener resourcesListener3 = iVar.f56563w;
            if (!c5582a.d()) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: mf.a$j */
    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f56571n;

        /* renamed from: o, reason: collision with root package name */
        public int f56572o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f56573p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f56574q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f56575r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f56576s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f56577t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ FAQListener f56578u;

        /* renamed from: mf.a$j$a, reason: collision with other inner class name */
        public static final class C0823a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56579n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ FAQListener f56580o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ List f56581p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0823a(FAQListener fAQListener, List list, Continuation continuation) {
                super(2, continuation);
                this.f56580o = fAQListener;
                this.f56581p = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0823a(this.f56580o, this.f56581p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0823a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56579n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FAQListener fAQListener = this.f56580o;
                if (fAQListener != null) {
                    fAQListener.onSuccess(new ArrayList<>(this.f56581p));
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: mf.a$j$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f56582n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ FAQListener f56583o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C5582a.b f56584p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FAQListener fAQListener, C5582a.b bVar, Continuation continuation) {
                super(2, continuation);
                this.f56583o = fAQListener;
                this.f56584p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f56583o, this.f56584p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56582n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FAQListener fAQListener = this.f56583o;
                if (fAQListener != null) {
                    fAQListener.onFailure(og.i.m(this.f56584p.b()), this.f56584p.c());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, String str3, int i10, int i11, FAQListener fAQListener, Continuation continuation) {
            super(2, continuation);
            this.f56573p = str;
            this.f56574q = str2;
            this.f56575r = str3;
            this.f56576s = i10;
            this.f56577t = i11;
            this.f56578u = fAQListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f56573p, this.f56574q, this.f56575r, this.f56576s, this.f56577t, this.f56578u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
        
            if (Ph.AbstractC1455i.g(r5, r6, r13) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (Ph.AbstractC1455i.g(r6, r7, r13) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        
            if (r14 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j jVar;
            C5582a c5582a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f56572o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                lf.d q10 = C5583a.f56511a.q();
                String str = this.f56573p;
                String str2 = this.f56574q;
                String str3 = this.f56575r;
                int i11 = this.f56576s;
                int i12 = this.f56577t;
                this.f56572o = 1;
                jVar = this;
                obj = q10.b(str, str2, str3, i11, i12, jVar);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c5582a = (C5582a) this.f56571n;
                    ResultKt.throwOnFailure(obj);
                    jVar = this;
                    FAQListener fAQListener = jVar.f56578u;
                    if (!c5582a.d()) {
                        C5582a.b c10 = c5582a.c();
                        Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        M0 c11 = C1452g0.c();
                        b bVar = new b(fAQListener, c10, null);
                        jVar.f56571n = c5582a;
                        jVar.f56572o = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                jVar = this;
            }
            c5582a = (C5582a) obj;
            FAQListener fAQListener2 = jVar.f56578u;
            if (c5582a.d()) {
                List list = (List) c5582a.b();
                M0 c12 = C1452g0.c();
                C0823a c0823a = new C0823a(fAQListener2, list, null);
                jVar.f56571n = c5582a;
                jVar.f56572o = 2;
            }
            FAQListener fAQListener3 = jVar.f56578u;
            if (!c5582a.d()) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: mf.a$k */
    public static final class k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final k f56585d = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.d invoke() {
            return new lf.d(C5583a.f56511a.l());
        }
    }

    /* renamed from: mf.a$l */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((ResourceDepartment) obj).getId(), ((ResourceDepartment) obj2).getId());
        }
    }

    /* renamed from: mf.a$m */
    public static final class m extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final m f56586d = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.e invoke() {
            return new lf.e(C5583a.f56511a.l());
        }
    }

    /* renamed from: mf.a$n */
    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f56587n;

        /* renamed from: o, reason: collision with root package name */
        public Object f56588o;

        /* renamed from: p, reason: collision with root package name */
        public int f56589p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ZohoSalesIQ.k f56590q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f56591r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ EnumC0818a f56592s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ we.c f56593t;

        /* renamed from: mf.a$n$a, reason: collision with other inner class name */
        public static final class C0824a extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f56594n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ EnumC0818a f56595o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ SalesIQKnowledgeBaseListener f56596p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ ZohoSalesIQ.k f56597q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Resource f56598r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ SalesIQFAQListener f56599s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ we.c f56600t;

            /* renamed from: mf.a$n$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0825a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC0818a.values().length];
                    try {
                        iArr[EnumC0818a.Opened.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC0818a.Closed.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC0818a.Liked.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC0818a.Disliked.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EnumC0818a.ErrorOccurred.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0824a(EnumC0818a enumC0818a, SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener, ZohoSalesIQ.k kVar, Resource resource, SalesIQFAQListener salesIQFAQListener, we.c cVar, Continuation continuation) {
                super(1, continuation);
                this.f56595o = enumC0818a;
                this.f56596p = salesIQKnowledgeBaseListener;
                this.f56597q = kVar;
                this.f56598r = resource;
                this.f56599s = salesIQFAQListener;
                this.f56600t = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0824a(this.f56595o, this.f56596p, this.f56597q, this.f56598r, this.f56599s, this.f56600t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                we.c cVar;
                SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56594n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i10 = C0825a.$EnumSwitchMapping$0[this.f56595o.ordinal()];
                if (i10 == 1) {
                    SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener2 = this.f56596p;
                    if (salesIQKnowledgeBaseListener2 != null) {
                        salesIQKnowledgeBaseListener2.handleResourceOpened(this.f56597q, this.f56598r);
                    }
                    SalesIQFAQListener salesIQFAQListener = this.f56599s;
                    if (salesIQFAQListener != null) {
                        Resource resource = this.f56598r;
                        salesIQFAQListener.handleArticleOpened(resource != null ? resource.getId() : null);
                    }
                } else if (i10 == 2) {
                    SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener3 = this.f56596p;
                    if (salesIQKnowledgeBaseListener3 != null) {
                        salesIQKnowledgeBaseListener3.handleResourceClosed(this.f56597q, this.f56598r);
                    }
                    SalesIQFAQListener salesIQFAQListener2 = this.f56599s;
                    if (salesIQFAQListener2 != null) {
                        Resource resource2 = this.f56598r;
                        salesIQFAQListener2.handleArticleClosed(resource2 != null ? resource2.getId() : null);
                    }
                } else if (i10 == 3) {
                    SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener4 = this.f56596p;
                    if (salesIQKnowledgeBaseListener4 != null) {
                        salesIQKnowledgeBaseListener4.handleResourceLiked(this.f56597q, this.f56598r);
                    }
                    SalesIQFAQListener salesIQFAQListener3 = this.f56599s;
                    if (salesIQFAQListener3 != null) {
                        Resource resource3 = this.f56598r;
                        salesIQFAQListener3.handleArticleLiked(resource3 != null ? resource3.getId() : null);
                    }
                } else if (i10 == 4) {
                    SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener5 = this.f56596p;
                    if (salesIQKnowledgeBaseListener5 != null) {
                        salesIQKnowledgeBaseListener5.handleResourceDisliked(this.f56597q, this.f56598r);
                    }
                    SalesIQFAQListener salesIQFAQListener4 = this.f56599s;
                    if (salesIQFAQListener4 != null) {
                        Resource resource4 = this.f56598r;
                        salesIQFAQListener4.handleArticleDisliked(resource4 != null ? resource4.getId() : null);
                    }
                } else if (i10 == 5 && (cVar = this.f56600t) != null && (salesIQKnowledgeBaseListener = this.f56596p) != null) {
                    salesIQKnowledgeBaseListener.onError(this.f56597q, this.f56598r, cVar);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C0824a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: mf.a$n$b */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ZohoSalesIQ.k.values().length];
                try {
                    iArr[ZohoSalesIQ.k.Articles.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ZohoSalesIQ.k kVar, String str, EnumC0818a enumC0818a, we.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f56590q = kVar;
            this.f56591r = str;
            this.f56592s = enumC0818a;
            this.f56593t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f56590q, this.f56591r, this.f56592s, this.f56593t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
        
            if (r15.c(r5, r14) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SalesIQKnowledgeBaseListener f10;
            SalesIQFAQListener salesIQFAQListener;
            Resource resource;
            SalesIQFAQListener salesIQFAQListener2;
            Resource resource2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f56589p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SalesIQFAQListener e10 = ZohoLiveChat.b.e();
                f10 = ZohoSalesIQ.g.f();
                if (e10 == null && f10 == null) {
                    return Unit.INSTANCE;
                }
                if (b.$EnumSwitchMapping$0[this.f56590q.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = this.f56591r;
                if (str != null) {
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) C5583a.f56511a.q().j(str).b();
                    if (interfaceC5321f != null) {
                        this.f56587n = e10;
                        this.f56588o = f10;
                        this.f56589p = 1;
                        Object t10 = AbstractC5323h.t(interfaceC5321f, this);
                        if (t10 != coroutine_suspended) {
                            salesIQFAQListener2 = e10;
                            obj = t10;
                        }
                        return coroutine_suspended;
                    }
                    salesIQFAQListener2 = e10;
                    resource2 = null;
                    resource = resource2;
                    salesIQFAQListener = salesIQFAQListener2;
                    SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener = f10;
                    C6461a c6461a = C6461a.f65810a;
                    C0824a c0824a = new C0824a(this.f56592s, salesIQKnowledgeBaseListener, this.f56590q, resource, salesIQFAQListener, this.f56593t, null);
                    this.f56587n = null;
                    this.f56588o = null;
                    this.f56589p = 2;
                } else {
                    salesIQFAQListener = e10;
                    resource = null;
                    SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener2 = f10;
                    C6461a c6461a2 = C6461a.f65810a;
                    C0824a c0824a2 = new C0824a(this.f56592s, salesIQKnowledgeBaseListener2, this.f56590q, resource, salesIQFAQListener, this.f56593t, null);
                    this.f56587n = null;
                    this.f56588o = null;
                    this.f56589p = 2;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                f10 = (SalesIQKnowledgeBaseListener) this.f56588o;
                salesIQFAQListener2 = (SalesIQFAQListener) this.f56587n;
                ResultKt.throwOnFailure(obj);
            }
            resource2 = (Resource) obj;
            resource = resource2;
            salesIQFAQListener = salesIQFAQListener2;
            SalesIQKnowledgeBaseListener salesIQKnowledgeBaseListener22 = f10;
            C6461a c6461a22 = C6461a.f65810a;
            C0824a c0824a22 = new C0824a(this.f56592s, salesIQKnowledgeBaseListener22, this.f56590q, resource, salesIQFAQListener, this.f56593t, null);
            this.f56587n = null;
            this.f56588o = null;
            this.f56589p = 2;
        }
    }

    public static final void e(String articleId, boolean z10, Function0 function0, Function2 function2) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        AbstractC1459k.d(f56511a.g(), null, null, new c(articleId, z10, function0, function2, null), 3, null);
    }

    public static final void f() {
        AbstractC1459k.d(f56511a.g(), null, null, new d(null), 3, null);
    }

    public static final void h(String id2, boolean z10, ResourceListener resourceListener) {
        Intrinsics.checkNotNullParameter(id2, "id");
        AbstractC1459k.d(f56511a.g(), null, null, new f(id2, z10, resourceListener, null), 3, null);
    }

    public static final void i(String str, String str2, ResourceCategoryListener resourceCategoryListener) {
        AbstractC1459k.d(f56511a.g(), null, null, new h(str, str2, resourceCategoryListener, null), 3, null);
    }

    public static final void j(String str, String str2, String str3, int i10, int i11, boolean z10, ResourcesListener resourcesListener) {
        AbstractC1459k.d(f56511a.g(), null, null, new i(i11, str, str2, str3, i10, z10, resourcesListener, null), 3, null);
    }

    public static final void k(String str, String str2, String str3, int i10, int i11, FAQListener fAQListener) {
        AbstractC1459k.d(f56511a.g(), null, null, new j(str, str2, str3, i10, i11, fAQListener, null), 3, null);
    }

    public static final boolean m() {
        return og.i.i((Boolean) f56511a.r().c().b());
    }

    public static final String o() {
        return (String) f56511a.r().d().b();
    }

    public static final List s() {
        List list = (List) f56511a.r().f().b();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return CollectionsKt.sortedWith(list, new l());
    }

    public static final boolean t() {
        return og.i.i((Boolean) f56511a.r().g().b());
    }

    public static final boolean u() {
        return og.i.i((Boolean) f56511a.r().h().b());
    }

    public static final void v(ZohoSalesIQ.k resourceType, EnumC0818a action, String str, we.c cVar) {
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(action, "action");
        AbstractC1459k.d(f56511a.g(), null, null, new n(resourceType, str, action, cVar, null), 3, null);
    }

    public static /* synthetic */ void w(ZohoSalesIQ.k kVar, EnumC0818a enumC0818a, String str, we.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            cVar = null;
        }
        v(kVar, enumC0818a, str, cVar);
    }

    public static final void x(String str, String str2, String str3, boolean z10, boolean z11, boolean z12, List resourceDepartments) {
        Intrinsics.checkNotNullParameter(resourceDepartments, "resourceDepartments");
        List list = resourceDepartments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResourceDepartment) it.next()).getId());
        }
        List s10 = s();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(s10, 10));
        Iterator it2 = s10.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ResourceDepartment) it2.next()).getId());
        }
        boolean areEqual = Intrinsics.areEqual(arrayList, arrayList2);
        SharedPreferences M10 = C6218a.M();
        if (Intrinsics.areEqual(str, M10 != null ? M10.getString("mobilisten_locale", null) : null) && Intrinsics.areEqual(str2, LiveChatUtil.getLanguageOrNull()) && z11 == t() && Intrinsics.areEqual(str3, o()) && m() == z10 && z12 == u() && areEqual) {
            return;
        }
        f();
    }

    public final P g() {
        return C6461a.f65810a.e();
    }

    public final C4378a l() {
        return (C4378a) f56512b.getValue();
    }

    public final C5464b n() {
        return (C5464b) f56513c.getValue();
    }

    public final lf.c p() {
        return (lf.c) f56515e.getValue();
    }

    public final lf.d q() {
        return (lf.d) f56514d.getValue();
    }

    public final lf.e r() {
        return (lf.e) f56516f.getValue();
    }
}
