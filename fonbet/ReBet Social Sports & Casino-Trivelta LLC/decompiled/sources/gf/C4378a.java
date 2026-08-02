package gf;

import android.app.Application;
import cf.C2917a;
import com.google.gson.Gson;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.ArticleCategoryResponse;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.SalesIQArticleResponse;
import com.zoho.livechat.android.modules.knowledgebase.data.repository.mapper.ArticleRoomToDomainKt;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.Resource;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.ResourceDepartment;
import com.zoho.livechat.android.utils.LiveChatUtil;
import ef.C4203a;
import hf.AbstractC4506a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.EnumC5132a;
import kf.InterfaceC5253a;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import me.C5582a;
import re.C6219A;
import ze.C6959a;

/* renamed from: gf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4378a implements InterfaceC5253a {

    /* renamed from: e, reason: collision with root package name */
    public static C4378a f47250e;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f47252a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f47253b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f47254c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0690a f47249d = new C0690a(null);

    /* renamed from: f, reason: collision with root package name */
    public static Object f47251f = new Object();

    /* renamed from: gf.a$a, reason: collision with other inner class name */
    public static final class C0690a {
        public /* synthetic */ C0690a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4378a a(Application application) {
            C4378a c4378a;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (C4378a.f47251f) {
                c4378a = C4378a.f47250e;
                if (c4378a == null) {
                    c4378a = new C4378a(application, null);
                    C4378a.f47250e = c4378a;
                }
            }
            return c4378a;
        }

        public C0690a() {
        }
    }

    /* renamed from: gf.a$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47255n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47256o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47257p;

        /* renamed from: q, reason: collision with root package name */
        public Object f47258q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f47259r;

        /* renamed from: t, reason: collision with root package name */
        public int f47261t;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47259r = obj;
            this.f47261t |= Integer.MIN_VALUE;
            return C4378a.this.i(null, false, this);
        }
    }

    /* renamed from: gf.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Application f47262d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Application application) {
            super(0);
            this.f47262d = application;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(this.f47262d);
        }
    }

    /* renamed from: gf.a$d */
    public static final class d implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f47263a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4378a f47264b;

        /* renamed from: gf.a$d$a, reason: collision with other inner class name */
        public static final class C0691a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f47265a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4378a f47266b;

            /* renamed from: gf.a$d$a$a, reason: collision with other inner class name */
            public static final class C0692a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f47267n;

                /* renamed from: o, reason: collision with root package name */
                public int f47268o;

                public C0692a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f47267n = obj;
                    this.f47268o |= Integer.MIN_VALUE;
                    return C0691a.this.emit(null, this);
                }
            }

            public C0691a(InterfaceC5322g interfaceC5322g, C4378a c4378a) {
                this.f47265a = interfaceC5322g;
                this.f47266b = c4378a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0692a c0692a;
                int i10;
                if (continuation instanceof C0692a) {
                    c0692a = (C0692a) continuation;
                    int i11 = c0692a.f47268o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0692a.f47268o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0692a.f47267n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0692a.f47268o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f47265a;
                            ArticleEntity articleEntity = (ArticleEntity) obj;
                            SalesIQResource.Data c10 = articleEntity != null ? ArticleRoomToDomainKt.c(articleEntity, this.f47266b.U(), false, 2, null) : null;
                            c0692a.f47268o = 1;
                            if (interfaceC5322g.emit(c10, c0692a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0692a = new C0692a(continuation);
                Object obj22 = c0692a.f47267n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0692a.f47268o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public d(InterfaceC5321f interfaceC5321f, C4378a c4378a) {
            this.f47263a = interfaceC5321f;
            this.f47264b = c4378a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f47263a.collect(new C0691a(interfaceC5322g, this.f47264b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: gf.a$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47270n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47271o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47272p;

        /* renamed from: q, reason: collision with root package name */
        public Object f47273q;

        /* renamed from: r, reason: collision with root package name */
        public Object f47274r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f47275s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f47276t;

        /* renamed from: v, reason: collision with root package name */
        public int f47278v;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47276t = obj;
            this.f47278v |= Integer.MIN_VALUE;
            return C4378a.this.f(null, null, false, this);
        }
    }

    /* renamed from: gf.a$f */
    public static final class f implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f47279a;

        /* renamed from: gf.a$f$a, reason: collision with other inner class name */
        public static final class C0693a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f47280a;

            /* renamed from: gf.a$f$a$a, reason: collision with other inner class name */
            public static final class C0694a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f47281n;

                /* renamed from: o, reason: collision with root package name */
                public int f47282o;

                public C0694a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f47281n = obj;
                    this.f47282o |= Integer.MIN_VALUE;
                    return C0693a.this.emit(null, this);
                }
            }

            public C0693a(InterfaceC5322g interfaceC5322g) {
                this.f47280a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0694a c0694a;
                int i10;
                if (continuation instanceof C0694a) {
                    c0694a = (C0694a) continuation;
                    int i11 = c0694a.f47282o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0694a.f47282o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0694a.f47281n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0694a.f47282o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f47280a;
                            List b10 = hf.d.b((List) obj);
                            c0694a.f47282o = 1;
                            if (interfaceC5322g.emit(b10, c0694a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0694a = new C0694a(continuation);
                Object obj22 = c0694a.f47281n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0694a.f47282o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public f(InterfaceC5321f interfaceC5321f) {
            this.f47279a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f47279a.collect(new C0693a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: gf.a$g */
    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47284n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f47285o;

        /* renamed from: q, reason: collision with root package name */
        public int f47287q;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47285o = obj;
            this.f47287q |= Integer.MIN_VALUE;
            return C4378a.this.M(null, null, this);
        }
    }

    /* renamed from: gf.a$h */
    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47288n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47289o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47290p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f47291q;

        /* renamed from: s, reason: collision with root package name */
        public int f47293s;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47291q = obj;
            this.f47293s |= Integer.MIN_VALUE;
            return C4378a.this.B(null, false, this);
        }
    }

    /* renamed from: gf.a$i */
    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47294n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f47295o;

        /* renamed from: q, reason: collision with root package name */
        public int f47297q;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47295o = obj;
            this.f47297q |= Integer.MIN_VALUE;
            return C4378a.this.N(null, false, this);
        }
    }

    /* renamed from: gf.a$j */
    public static final class j implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f47298a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4378a f47299b;

        /* renamed from: gf.a$j$a, reason: collision with other inner class name */
        public static final class C0695a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f47300a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4378a f47301b;

            /* renamed from: gf.a$j$a$a, reason: collision with other inner class name */
            public static final class C0696a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f47302n;

                /* renamed from: o, reason: collision with root package name */
                public int f47303o;

                public C0696a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f47302n = obj;
                    this.f47303o |= Integer.MIN_VALUE;
                    return C0695a.this.emit(null, this);
                }
            }

            public C0695a(InterfaceC5322g interfaceC5322g, C4378a c4378a) {
                this.f47300a = interfaceC5322g;
                this.f47301b = c4378a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0696a c0696a;
                int i10;
                if (continuation instanceof C0696a) {
                    c0696a = (C0696a) continuation;
                    int i11 = c0696a.f47303o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0696a.f47303o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0696a.f47302n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0696a.f47303o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f47300a;
                            List d10 = ArticleRoomToDomainKt.d((List) obj, this.f47301b.U(), false, 2, null);
                            c0696a.f47303o = 1;
                            if (interfaceC5322g.emit(d10, c0696a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0696a = new C0696a(continuation);
                Object obj22 = c0696a.f47302n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0696a.f47303o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public j(InterfaceC5321f interfaceC5321f, C4378a c4378a) {
            this.f47298a = interfaceC5321f;
            this.f47299b = c4378a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f47298a.collect(new C0695a(interfaceC5322g, this.f47299b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: gf.a$k */
    public static final class k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47305n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47306o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47307p;

        /* renamed from: q, reason: collision with root package name */
        public Object f47308q;

        /* renamed from: r, reason: collision with root package name */
        public Object f47309r;

        /* renamed from: s, reason: collision with root package name */
        public Object f47310s;

        /* renamed from: t, reason: collision with root package name */
        public Object f47311t;

        /* renamed from: u, reason: collision with root package name */
        public int f47312u;

        /* renamed from: v, reason: collision with root package name */
        public int f47313v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f47314w;

        /* renamed from: y, reason: collision with root package name */
        public int f47316y;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47314w = obj;
            this.f47316y |= Integer.MIN_VALUE;
            return C4378a.this.r(null, null, null, 0, 0, false, this);
        }
    }

    /* renamed from: gf.a$l */
    public static final class l extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47317n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47318o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f47319p;

        /* renamed from: r, reason: collision with root package name */
        public int f47321r;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47319p = obj;
            this.f47321r |= Integer.MIN_VALUE;
            return C4378a.this.p(null, null, null, 0, 0, this);
        }
    }

    /* renamed from: gf.a$m */
    public static final class m implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f47322a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4378a f47323b;

        /* renamed from: gf.a$m$a, reason: collision with other inner class name */
        public static final class C0697a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f47324a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4378a f47325b;

            /* renamed from: gf.a$m$a$a, reason: collision with other inner class name */
            public static final class C0698a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f47326n;

                /* renamed from: o, reason: collision with root package name */
                public int f47327o;

                public C0698a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f47326n = obj;
                    this.f47327o |= Integer.MIN_VALUE;
                    return C0697a.this.emit(null, this);
                }
            }

            public C0697a(InterfaceC5322g interfaceC5322g, C4378a c4378a) {
                this.f47324a = interfaceC5322g;
                this.f47325b = c4378a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0698a c0698a;
                int i10;
                if (continuation instanceof C0698a) {
                    c0698a = (C0698a) continuation;
                    int i11 = c0698a.f47327o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0698a.f47327o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0698a.f47326n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0698a.f47327o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f47324a;
                            List d10 = ArticleRoomToDomainKt.d((List) obj, this.f47325b.U(), false, 2, null);
                            c0698a.f47327o = 1;
                            if (interfaceC5322g.emit(d10, c0698a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0698a = new C0698a(continuation);
                Object obj22 = c0698a.f47326n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0698a.f47327o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public m(InterfaceC5321f interfaceC5321f, C4378a c4378a) {
            this.f47322a = interfaceC5321f;
            this.f47323b = c4378a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f47322a.collect(new C0697a(interfaceC5322g, this.f47323b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: gf.a$n */
    public static final class n implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f47329a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4378a f47330b;

        /* renamed from: gf.a$n$a, reason: collision with other inner class name */
        public static final class C0699a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f47331a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4378a f47332b;

            /* renamed from: gf.a$n$a$a, reason: collision with other inner class name */
            public static final class C0700a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f47333n;

                /* renamed from: o, reason: collision with root package name */
                public int f47334o;

                public C0700a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f47333n = obj;
                    this.f47334o |= Integer.MIN_VALUE;
                    return C0699a.this.emit(null, this);
                }
            }

            public C0699a(InterfaceC5322g interfaceC5322g, C4378a c4378a) {
                this.f47331a = interfaceC5322g;
                this.f47332b = c4378a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0700a c0700a;
                int i10;
                if (continuation instanceof C0700a) {
                    c0700a = (C0700a) continuation;
                    int i11 = c0700a.f47334o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0700a.f47334o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0700a.f47333n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0700a.f47334o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f47331a;
                            List d10 = ArticleRoomToDomainKt.d((List) obj, this.f47332b.U(), false, 2, null);
                            c0700a.f47334o = 1;
                            if (interfaceC5322g.emit(d10, c0700a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0700a = new C0700a(continuation);
                Object obj22 = c0700a.f47333n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0700a.f47334o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public n(InterfaceC5321f interfaceC5321f, C4378a c4378a) {
            this.f47329a = interfaceC5321f;
            this.f47330b = c4378a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f47329a.collect(new C0699a(interfaceC5322g, this.f47330b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: gf.a$o */
    public static final class o implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f47336a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4378a f47337b;

        /* renamed from: gf.a$o$a, reason: collision with other inner class name */
        public static final class C0701a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f47338a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4378a f47339b;

            /* renamed from: gf.a$o$a$a, reason: collision with other inner class name */
            public static final class C0702a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f47340n;

                /* renamed from: o, reason: collision with root package name */
                public int f47341o;

                public C0702a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f47340n = obj;
                    this.f47341o |= Integer.MIN_VALUE;
                    return C0701a.this.emit(null, this);
                }
            }

            public C0701a(InterfaceC5322g interfaceC5322g, C4378a c4378a) {
                this.f47338a = interfaceC5322g;
                this.f47339b = c4378a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0702a c0702a;
                int i10;
                if (continuation instanceof C0702a) {
                    c0702a = (C0702a) continuation;
                    int i11 = c0702a.f47341o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0702a.f47341o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0702a.f47340n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0702a.f47341o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f47338a;
                            List b10 = ArticleRoomToDomainKt.b((List) obj, this.f47339b.U(), true);
                            c0702a.f47341o = 1;
                            if (interfaceC5322g.emit(b10, c0702a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0702a = new C0702a(continuation);
                Object obj22 = c0702a.f47340n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0702a.f47341o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public o(InterfaceC5321f interfaceC5321f, C4378a c4378a) {
            this.f47336a = interfaceC5321f;
            this.f47337b = c4378a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f47336a.collect(new C0701a(interfaceC5322g, this.f47337b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: gf.a$p */
    public static final class p implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f47343a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4378a f47344b;

        /* renamed from: gf.a$p$a, reason: collision with other inner class name */
        public static final class C0703a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f47345a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4378a f47346b;

            /* renamed from: gf.a$p$a$a, reason: collision with other inner class name */
            public static final class C0704a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f47347n;

                /* renamed from: o, reason: collision with root package name */
                public int f47348o;

                public C0704a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f47347n = obj;
                    this.f47348o |= Integer.MIN_VALUE;
                    return C0703a.this.emit(null, this);
                }
            }

            public C0703a(InterfaceC5322g interfaceC5322g, C4378a c4378a) {
                this.f47345a = interfaceC5322g;
                this.f47346b = c4378a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0704a c0704a;
                int i10;
                if (continuation instanceof C0704a) {
                    c0704a = (C0704a) continuation;
                    int i11 = c0704a.f47348o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0704a.f47348o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0704a.f47347n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0704a.f47348o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f47345a;
                            ArticleEntity articleEntity = (ArticleEntity) obj;
                            Resource c10 = articleEntity != null ? hf.f.c(articleEntity, this.f47346b.U(), false, 2, null) : null;
                            c0704a.f47348o = 1;
                            if (interfaceC5322g.emit(c10, c0704a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0704a = new C0704a(continuation);
                Object obj22 = c0704a.f47347n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0704a.f47348o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public p(InterfaceC5321f interfaceC5321f, C4378a c4378a) {
            this.f47343a = interfaceC5321f;
            this.f47344b = c4378a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f47343a.collect(new C0703a(interfaceC5322g, this.f47344b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: gf.a$q */
    public static final class q extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47350n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47351o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47352p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f47353q;

        /* renamed from: s, reason: collision with root package name */
        public int f47355s;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47353q = obj;
            this.f47355s |= Integer.MIN_VALUE;
            return C4378a.this.c0(null, null, null, this);
        }
    }

    /* renamed from: gf.a$r */
    public static final class r extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Application f47356d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Application application) {
            super(0);
            this.f47356d = application;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2917a invoke() {
            return C2917a.f27757c.a(this.f47356d);
        }
    }

    /* renamed from: gf.a$s */
    public static final class s extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final s f47357d = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4203a invoke() {
            return C4203a.f45975e.a();
        }
    }

    /* renamed from: gf.a$t */
    public static final class t extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f47358n;

        /* renamed from: p, reason: collision with root package name */
        public int f47360p;

        public t(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47358n = obj;
            this.f47360p |= Integer.MIN_VALUE;
            return C4378a.this.f0(null, null, null, null, null, 0, 0, false, this);
        }
    }

    /* renamed from: gf.a$u */
    public static final class u extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47361n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47362o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47363p;

        /* renamed from: q, reason: collision with root package name */
        public Object f47364q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f47365r;

        /* renamed from: t, reason: collision with root package name */
        public int f47367t;

        public u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47365r = obj;
            this.f47367t |= Integer.MIN_VALUE;
            return C4378a.this.n(null, null, null, this);
        }
    }

    /* renamed from: gf.a$v */
    public static final class v extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47368n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47369o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47370p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f47371q;

        /* renamed from: s, reason: collision with root package name */
        public int f47373s;

        public v(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47371q = obj;
            this.f47373s |= Integer.MIN_VALUE;
            return C4378a.this.i0(null, this);
        }
    }

    /* renamed from: gf.a$w */
    public static final class w extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f47374n;

        /* renamed from: p, reason: collision with root package name */
        public int f47376p;

        public w(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47374n = obj;
            this.f47376p |= Integer.MIN_VALUE;
            return C4378a.this.h(null, this);
        }
    }

    /* renamed from: gf.a$x */
    public static final class x extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47377n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47378o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47379p;

        /* renamed from: q, reason: collision with root package name */
        public Object f47380q;

        /* renamed from: r, reason: collision with root package name */
        public Object f47381r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f47382s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f47383t;

        /* renamed from: v, reason: collision with root package name */
        public int f47385v;

        public x(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47383t = obj;
            this.f47385v |= Integer.MIN_VALUE;
            return C4378a.this.b(null, null, false, this);
        }
    }

    /* renamed from: gf.a$y */
    public static final class y extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47386n;

        /* renamed from: o, reason: collision with root package name */
        public Object f47387o;

        /* renamed from: p, reason: collision with root package name */
        public Object f47388p;

        /* renamed from: q, reason: collision with root package name */
        public Object f47389q;

        /* renamed from: r, reason: collision with root package name */
        public Object f47390r;

        /* renamed from: s, reason: collision with root package name */
        public Object f47391s;

        /* renamed from: t, reason: collision with root package name */
        public Object f47392t;

        /* renamed from: u, reason: collision with root package name */
        public int f47393u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f47394v;

        /* renamed from: x, reason: collision with root package name */
        public int f47396x;

        public y(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47394v = obj;
            this.f47396x |= Integer.MIN_VALUE;
            return C4378a.this.l(null, null, null, false, null, this);
        }
    }

    public /* synthetic */ C4378a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static /* synthetic */ Object O(C4378a c4378a, String str, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c4378a.N(str, z10, continuation);
    }

    public static /* synthetic */ Object Q(C4378a c4378a, String str, String str2, String str3, int i10, int i11, String str4, boolean z10, Continuation continuation, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i10 = 1;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = 99;
        }
        return c4378a.P(str, str2, str3, i13, i11, str4, (i12 & 64) != 0 ? false : z10, continuation);
    }

    public static /* synthetic */ String Y(C4378a c4378a, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c4378a.X(str, z10);
    }

    public static /* synthetic */ Object e0(C4378a c4378a, String str, String str2, List list, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c4378a.d0(str, str2, list, z10, continuation);
    }

    public static /* synthetic */ Object g0(C4378a c4378a, SalesIQResponse.Error error, SalesIQResponse salesIQResponse, String str, String str2, String str3, int i10, int i11, boolean z10, Continuation continuation, int i12, Object obj) {
        return c4378a.f0(error, salesIQResponse, str, str2, str3, (i12 & 32) != 0 ? 1 : i10, (i12 & 64) != 0 ? 99 : i11, (i12 & 128) != 0 ? false : z10, continuation);
    }

    @Override // kf.InterfaceC5253a
    public C5582a A() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(S().G());
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(String str, boolean z10, Continuation continuation) {
        h hVar;
        Object coroutine_suspended;
        int i10;
        C4378a c4378a;
        Object i11;
        SalesIQResponse salesIQResponse;
        C5582a.C0817a c0817a;
        C5582a.C0817a c0817a2;
        C4378a c4378a2;
        ArticleEntity articleEntity;
        String str2 = str;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f47293s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f47293s = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f47291q;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = hVar.f47293s;
                Resource resource = null;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    hVar.f47288n = this;
                    hVar.f47289o = str2;
                    hVar.f47293s = 1;
                    obj = i0(str2, hVar);
                    if (obj != coroutine_suspended) {
                        c4378a = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0817a2 = (C5582a.C0817a) hVar.f47289o;
                        c4378a2 = (C4378a) hVar.f47288n;
                        ResultKt.throwOnFailure(obj);
                        articleEntity = (ArticleEntity) obj;
                        if (articleEntity == null) {
                            resource = hf.f.c(articleEntity, c4378a2.U(), false, 2, null);
                            return c0817a2.d(resource);
                        }
                        c0817a = c0817a2;
                        c0817a2 = c0817a;
                        return c0817a2.d(resource);
                    }
                    SalesIQResponse salesIQResponse2 = (SalesIQResponse) hVar.f47290p;
                    String str3 = (String) hVar.f47289o;
                    C4378a c4378a3 = (C4378a) hVar.f47288n;
                    ResultKt.throwOnFailure(obj);
                    salesIQResponse = salesIQResponse2;
                    str2 = str3;
                    c4378a = c4378a3;
                    if (Intrinsics.areEqual(((C5582a) obj).b(), Boxing.boxBoolean(true))) {
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, null, null, 0, false, null, null, null, 126, null));
                    }
                    c0817a = C5582a.f56502b;
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) c4378a.V().j(str2).b();
                    if (interfaceC5321f != null) {
                        hVar.f47288n = c4378a;
                        hVar.f47289o = c0817a;
                        hVar.f47290p = null;
                        hVar.f47293s = 3;
                        Object t10 = AbstractC5323h.t(interfaceC5321f, hVar);
                        if (t10 != coroutine_suspended) {
                            obj = t10;
                            c0817a2 = c0817a;
                            c4378a2 = c4378a;
                            articleEntity = (ArticleEntity) obj;
                            if (articleEntity == null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    c0817a2 = c0817a;
                    return c0817a2.d(resource);
                }
                str2 = (String) hVar.f47289o;
                c4378a = (C4378a) hVar.f47288n;
                ResultKt.throwOnFailure(obj);
                SalesIQResponse salesIQResponse3 = (SalesIQResponse) obj;
                hVar.f47288n = c4378a;
                hVar.f47289o = str2;
                hVar.f47290p = salesIQResponse3;
                hVar.f47293s = 2;
                i11 = c4378a.i(str2, false, hVar);
                if (i11 != coroutine_suspended) {
                    salesIQResponse = salesIQResponse3;
                    obj = i11;
                    if (Intrinsics.areEqual(((C5582a) obj).b(), Boxing.boxBoolean(true))) {
                    }
                }
                return coroutine_suspended;
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f47291q;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar.f47293s;
        Resource resource2 = null;
        if (i10 != 0) {
        }
        SalesIQResponse salesIQResponse32 = (SalesIQResponse) obj2;
        hVar.f47288n = c4378a;
        hVar.f47289o = str2;
        hVar.f47290p = salesIQResponse32;
        hVar.f47293s = 2;
        i11 = c4378a.i(str2, false, hVar);
        if (i11 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final String L() {
        return S().D();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(String str, String str2, Continuation continuation) {
        g gVar;
        int i10;
        C5582a.C0817a c0817a;
        C5582a.C0817a c0817a2;
        List list;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f47287q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f47287q = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f47285o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f47287q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c0817a = C5582a.f56502b;
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) V().k(str, str2, null, true).b();
                    if (interfaceC5321f != null) {
                        gVar.f47284n = c0817a;
                        gVar.f47287q = 1;
                        Object t10 = AbstractC5323h.t(interfaceC5321f, gVar);
                        if (t10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = t10;
                        c0817a2 = c0817a;
                    }
                    List emptyList = CollectionsKt.emptyList();
                    c0817a2 = c0817a;
                    return c0817a2.d(emptyList);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0817a2 = (C5582a.C0817a) gVar.f47284n;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list != null || (emptyList = hf.c.b(list)) == null) {
                    c0817a = c0817a2;
                    List emptyList2 = CollectionsKt.emptyList();
                    c0817a2 = c0817a;
                }
                return c0817a2.d(emptyList2);
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f47285o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f47287q;
        if (i10 != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        c0817a = c0817a2;
        List emptyList22 = CollectionsKt.emptyList();
        c0817a2 = c0817a;
        return c0817a2.d(emptyList22);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(String str, boolean z10, Continuation continuation) {
        i iVar;
        int i10;
        C4378a c4378a;
        SalesIQResponse salesIQResponse;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f47297q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f47297q = i11 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.f47295o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = iVar2.f47297q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!og.i.e(T())) {
                        return SalesIQResponse.INSTANCE.b(new Throwable("App Id must be non-null"));
                    }
                    C4203a W10 = W();
                    String a02 = a0();
                    Intrinsics.checkNotNull(a02);
                    String T10 = T();
                    Intrinsics.checkNotNull(T10);
                    String Y10 = Y(this, null, z10, 1, null);
                    iVar2.f47294n = this;
                    iVar2.f47297q = 1;
                    obj = W10.e(a02, T10, str, Y10, iVar2);
                    if (obj != coroutine_suspended) {
                        c4378a = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SalesIQResponse salesIQResponse2 = (SalesIQResponse) iVar2.f47294n;
                    ResultKt.throwOnFailure(obj);
                    return salesIQResponse2;
                }
                c4378a = (C4378a) iVar2.f47294n;
                ResultKt.throwOnFailure(obj);
                salesIQResponse = (SalesIQResponse) obj;
                if (salesIQResponse.getIsSuccess()) {
                    SalesIQArticleResponse salesIQArticleResponse = (SalesIQArticleResponse) salesIQResponse.getData();
                    C2917a V10 = c4378a.V();
                    List listOf = CollectionsKt.listOf(hf.e.a(salesIQArticleResponse));
                    iVar2.f47294n = salesIQResponse;
                    iVar2.f47297q = 2;
                    if (V10.u(listOf, true, iVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return salesIQResponse;
            }
        }
        iVar = new i(continuation);
        i iVar22 = iVar;
        Object obj2 = iVar22.f47295o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = iVar22.f47297q;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        if (salesIQResponse.getIsSuccess()) {
        }
        return salesIQResponse;
    }

    public final Object P(String str, String str2, String str3, int i10, int i11, String str4, boolean z10, Continuation continuation) {
        C4203a W10 = W();
        String a02 = a0();
        Intrinsics.checkNotNull(a02);
        String T10 = T();
        Intrinsics.checkNotNull(T10);
        return W10.g(a02, T10, str, str2, str3, i10, Boxing.boxInt(i11), Boxing.boxBoolean(false), Y(this, str4, false, 2, null), z10, continuation);
    }

    public final C6959a R() {
        return C6959a.f68673u.b();
    }

    public final Ae.a S() {
        return (Ae.a) this.f47254c.getValue();
    }

    public final String T() {
        return S().h();
    }

    public final Gson U() {
        return Yd.a.j();
    }

    public final C2917a V() {
        return (C2917a) this.f47253b.getValue();
    }

    public final C4203a W() {
        return (C4203a) this.f47252a.getValue();
    }

    public final String X(String str, boolean z10) {
        return z10 ? S().v() : str == null ? S().H() : str;
    }

    public final List Z() {
        List G10 = S().G();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(G10, 10));
        Iterator it = G10.iterator();
        while (it.hasNext()) {
            arrayList.add(((SalesIQResource.b) it.next()).getId());
        }
        return arrayList;
    }

    @Override // kf.InterfaceC5253a
    public C5582a a(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        C5582a j10 = V().j(articleId);
        if (j10.d()) {
            return j10.a(new d((InterfaceC5321f) j10.b(), this));
        }
        Intrinsics.checkNotNull(j10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return j10;
    }

    public final String a0() {
        return S().I();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(String str, String str2, boolean z10, Continuation continuation) {
        x xVar;
        int i10;
        boolean z11;
        Object obj;
        Object f10;
        String str3;
        String str4;
        C4378a c4378a;
        SalesIQResponse salesIQResponse;
        List list;
        SalesIQResponse salesIQResponse2;
        String str5;
        String str6;
        SalesIQResponse salesIQResponse3;
        List list2;
        C4378a c4378a2;
        C4378a c4378a3;
        String str7;
        Object obj2;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i11 = xVar.f47385v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f47385v = i11 - Integer.MIN_VALUE;
                x xVar2 = xVar;
                Object obj3 = xVar2.f47383t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = xVar2.f47385v;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (!og.i.e(a0()) || !og.i.e(L())) {
                        return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Screen name or app Id is null"), false, 2, null);
                    }
                    C4203a W10 = W();
                    String a02 = a0();
                    Intrinsics.checkNotNull(a02);
                    String L10 = L();
                    Intrinsics.checkNotNull(L10);
                    String Y10 = Y(this, null, false, 2, null);
                    xVar2.f47377n = this;
                    xVar2.f47378o = str;
                    xVar2.f47379p = str2;
                    z11 = z10;
                    xVar2.f47382s = z11;
                    xVar2.f47385v = 1;
                    obj = null;
                    f10 = W10.f(a02, L10, Y10, str, str2, xVar2);
                    xVar2 = xVar2;
                    if (f10 != coroutine_suspended) {
                        str3 = str;
                        str4 = str2;
                        c4378a = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        list2 = (List) xVar2.f47381r;
                        salesIQResponse3 = (SalesIQResponse) xVar2.f47380q;
                        str6 = (String) xVar2.f47379p;
                        str5 = (String) xVar2.f47378o;
                        c4378a = (C4378a) xVar2.f47377n;
                        ResultKt.throwOnFailure(obj3);
                        obj = null;
                        salesIQResponse2 = salesIQResponse3;
                        str4 = str6;
                        str3 = str5;
                        list = list2;
                        c4378a2 = c4378a;
                        xVar2.f47377n = c4378a2;
                        xVar2.f47378o = str3;
                        xVar2.f47379p = str4;
                        xVar2.f47380q = salesIQResponse2;
                        xVar2.f47381r = obj;
                        xVar2.f47385v = 3;
                        if (e0(c4378a2, str3, str4, list, false, xVar2, 8, null) != coroutine_suspended) {
                            c4378a3 = c4378a2;
                            str7 = str3;
                            salesIQResponse = salesIQResponse2;
                            str3 = str7;
                            c4378a = c4378a3;
                            if (salesIQResponse.getIsSuccess()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 3) {
                        if (i10 == 4) {
                            ResultKt.throwOnFailure(obj3);
                            return obj3;
                        }
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                        return obj3;
                    }
                    salesIQResponse = (SalesIQResponse) xVar2.f47380q;
                    str4 = (String) xVar2.f47379p;
                    str7 = (String) xVar2.f47378o;
                    c4378a3 = (C4378a) xVar2.f47377n;
                    ResultKt.throwOnFailure(obj3);
                    obj = null;
                    str3 = str7;
                    c4378a = c4378a3;
                    if (salesIQResponse.getIsSuccess()) {
                        if (((List) salesIQResponse.getData()) != null && (!r6.isEmpty())) {
                            Iterable<ArticleCategoryResponse> iterable = (Iterable) salesIQResponse.getData();
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                for (ArticleCategoryResponse articleCategoryResponse : iterable) {
                                    if (articleCategoryResponse.getArticlesCount() > 0 || articleCategoryResponse.getChildrenCount() > 0) {
                                        C5582a.C0817a c0817a = C5582a.f56502b;
                                        Iterator it = ((Iterable) salesIQResponse.getData()).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj2 = obj;
                                                break;
                                            }
                                            obj2 = it.next();
                                            ArticleCategoryResponse articleCategoryResponse2 = (ArticleCategoryResponse) obj2;
                                            if (articleCategoryResponse2.getArticlesCount() > 0 || articleCategoryResponse2.getChildrenCount() > 0) {
                                                break;
                                            }
                                        }
                                        return c0817a.d(Boxing.boxBoolean(obj2 != null));
                                    }
                                }
                            }
                        }
                        xVar2.f47377n = obj;
                        xVar2.f47378o = obj;
                        xVar2.f47379p = obj;
                        xVar2.f47380q = obj;
                        xVar2.f47385v = 4;
                        Object c02 = c4378a.c0(salesIQResponse, str3, str4, xVar2);
                        if (c02 != coroutine_suspended) {
                            return c02;
                        }
                    } else {
                        xVar2.f47377n = obj;
                        xVar2.f47378o = obj;
                        xVar2.f47379p = obj;
                        xVar2.f47380q = obj;
                        xVar2.f47385v = 5;
                        Object c03 = c4378a.c0(salesIQResponse, str3, str4, xVar2);
                        if (c03 != coroutine_suspended) {
                            return c03;
                        }
                    }
                    return coroutine_suspended;
                }
                boolean z12 = xVar2.f47382s;
                str4 = (String) xVar2.f47379p;
                String str8 = (String) xVar2.f47378o;
                C4378a c4378a4 = (C4378a) xVar2.f47377n;
                ResultKt.throwOnFailure(obj3);
                z11 = z12;
                c4378a = c4378a4;
                f10 = obj3;
                obj = null;
                str3 = str8;
                salesIQResponse = (SalesIQResponse) f10;
                if (salesIQResponse.getIsSuccess()) {
                    if (salesIQResponse.getIsSuccess()) {
                    }
                    return coroutine_suspended;
                }
                list = (List) salesIQResponse.getData();
                if (!z11) {
                    salesIQResponse2 = salesIQResponse;
                    c4378a2 = c4378a;
                    xVar2.f47377n = c4378a2;
                    xVar2.f47378o = str3;
                    xVar2.f47379p = str4;
                    xVar2.f47380q = salesIQResponse2;
                    xVar2.f47381r = obj;
                    xVar2.f47385v = 3;
                    if (e0(c4378a2, str3, str4, list, false, xVar2, 8, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                C2917a V10 = c4378a.V();
                boolean z13 = !c4378a.S().b0();
                List emptyList = CollectionsKt.emptyList();
                xVar2.f47377n = c4378a;
                xVar2.f47378o = str3;
                xVar2.f47379p = str4;
                xVar2.f47380q = salesIQResponse;
                xVar2.f47381r = list;
                xVar2.f47385v = 2;
                if (V10.h(str3, str4, z13, emptyList, xVar2) != coroutine_suspended) {
                    str5 = str3;
                    str6 = str4;
                    salesIQResponse3 = salesIQResponse;
                    list2 = list;
                    salesIQResponse2 = salesIQResponse3;
                    str4 = str6;
                    str3 = str5;
                    list = list2;
                    c4378a2 = c4378a;
                    xVar2.f47377n = c4378a2;
                    xVar2.f47378o = str3;
                    xVar2.f47379p = str4;
                    xVar2.f47380q = salesIQResponse2;
                    xVar2.f47381r = obj;
                    xVar2.f47385v = 3;
                    if (e0(c4378a2, str3, str4, list, false, xVar2, 8, null) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        xVar = new x(continuation);
        x xVar22 = xVar;
        Object obj32 = xVar22.f47383t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = xVar22.f47385v;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) f10;
        if (salesIQResponse.getIsSuccess()) {
        }
    }

    public final String b0(String str, String str2, String str3) {
        List listOf = CollectionsKt.listOf((Object[]) new String[]{str, str2, str3});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            String str4 = (String) obj;
            if (!(str4 == null || str4.length() == 0)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, "_", null, null, 0, null, null, 62, null);
    }

    @Override // kf.InterfaceC5253a
    public C5582a c() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(S().q()));
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(SalesIQResponse salesIQResponse, String str, String str2, Continuation continuation) {
        q qVar;
        int i10;
        String str3;
        String str4;
        C4378a c4378a;
        SalesIQResponse salesIQResponse2;
        SalesIQResponse salesIQResponse3;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i11 = qVar.f47355s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f47355s = i11 - Integer.MIN_VALUE;
                q qVar2 = qVar;
                Object obj = qVar2.f47353q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = qVar2.f47355s;
                Object obj2 = null;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (salesIQResponse.getError() != null && !h0(salesIQResponse)) {
                        SalesIQResponse.Error error = salesIQResponse.getError();
                        Intrinsics.checkNotNull(error);
                        C5582a b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error);
                        if (b10.d()) {
                            ((Boolean) b10.b()).getClass();
                            return b10.a(Boxing.boxBoolean(false));
                        }
                        Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                        return b10;
                    }
                    C4203a W10 = W();
                    String a02 = a0();
                    Intrinsics.checkNotNull(a02);
                    String L10 = L();
                    Intrinsics.checkNotNull(L10);
                    String v10 = S().v();
                    qVar2.f47350n = this;
                    qVar2.f47351o = str;
                    qVar2.f47352p = str2;
                    qVar2.f47355s = 1;
                    obj = W10.f(a02, L10, v10, str, str2, qVar2);
                    qVar2 = qVar2;
                    if (obj != coroutine_suspended) {
                        str3 = str;
                        str4 = str2;
                        c4378a = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    salesIQResponse3 = (SalesIQResponse) qVar2.f47350n;
                    ResultKt.throwOnFailure(obj);
                    salesIQResponse2 = salesIQResponse3;
                    if (!salesIQResponse2.getIsSuccess()) {
                        SalesIQResponse.Error error2 = salesIQResponse2.getError();
                        Intrinsics.checkNotNull(error2);
                        C5582a b11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error2);
                        if (b11.d()) {
                            ((Boolean) b11.b()).getClass();
                            return b11.a(Boxing.boxBoolean(false));
                        }
                        Intrinsics.checkNotNull(b11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                        return b11;
                    }
                    C5582a.C0817a c0817a = C5582a.f56502b;
                    List list = (List) salesIQResponse2.getData();
                    if (list != null) {
                        for (Object obj3 : list) {
                            ArticleCategoryResponse articleCategoryResponse = (ArticleCategoryResponse) obj3;
                            if (articleCategoryResponse.getArticlesCount() > 0 || articleCategoryResponse.getChildrenCount() > 0) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        obj2 = (ArticleCategoryResponse) obj2;
                    }
                    return c0817a.d(Boxing.boxBoolean(obj2 != null));
                }
                String str5 = (String) qVar2.f47352p;
                str3 = (String) qVar2.f47351o;
                C4378a c4378a2 = (C4378a) qVar2.f47350n;
                ResultKt.throwOnFailure(obj);
                str4 = str5;
                c4378a = c4378a2;
                salesIQResponse2 = (SalesIQResponse) obj;
                if (salesIQResponse2.getIsSuccess()) {
                    List list2 = (List) salesIQResponse2.getData();
                    qVar2.f47350n = salesIQResponse2;
                    qVar2.f47351o = null;
                    qVar2.f47352p = null;
                    qVar2.f47355s = 2;
                    if (c4378a.d0(str3, str4, list2, true, qVar2) != coroutine_suspended) {
                        salesIQResponse3 = salesIQResponse2;
                        salesIQResponse2 = salesIQResponse3;
                    }
                    return coroutine_suspended;
                }
                if (!salesIQResponse2.getIsSuccess()) {
                }
            }
        }
        qVar = new q(continuation);
        q qVar22 = qVar;
        Object obj4 = qVar22.f47353q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = qVar22.f47355s;
        Object obj22 = null;
        if (i10 != 0) {
        }
        salesIQResponse2 = (SalesIQResponse) obj4;
        if (salesIQResponse2.getIsSuccess()) {
        }
        if (!salesIQResponse2.getIsSuccess()) {
        }
    }

    @Override // kf.InterfaceC5253a
    public C5582a d() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(S().b0()));
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

    public final Object d0(String str, String str2, List list, boolean z10, Continuation continuation) {
        Object g10 = V().g(str, str2, !S().b0(), hf.b.b(list, Y(this, null, z10, 1, null)), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    @Override // kf.InterfaceC5253a
    public C5582a e() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(S().o()));
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a0, code lost:
    
        if (r1 == r10) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(String str, String str2, boolean z10, Continuation continuation) {
        e eVar;
        int i10;
        C4378a c4378a;
        String str3;
        String str4;
        SalesIQResponse salesIQResponse;
        boolean h02;
        e eVar2;
        String str5;
        String str6;
        C4378a c4378a2;
        boolean z11;
        String str7;
        String str8;
        C4378a c4378a3;
        boolean z12;
        SalesIQResponse salesIQResponse2;
        C4378a c4378a4;
        String str9;
        String str10;
        SalesIQResponse salesIQResponse3;
        SalesIQResponse.Error error;
        Integer e10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f47278v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f47278v = i11 - Integer.MIN_VALUE;
                e eVar3 = eVar;
                Object obj = eVar3.f47276t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar3.f47278v;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z10 && og.i.e(a0()) && og.i.e(L())) {
                        C4203a W10 = W();
                        String a02 = a0();
                        Intrinsics.checkNotNull(a02);
                        String L10 = L();
                        Intrinsics.checkNotNull(L10);
                        String Y10 = Y(this, null, false, 3, null);
                        eVar3.f47270n = this;
                        eVar3.f47271o = str;
                        eVar3.f47272p = str2;
                        eVar3.f47278v = 1;
                        obj = W10.f(a02, L10, Y10, str2, str, eVar3);
                        if (obj != coroutine_suspended) {
                            c4378a = this;
                            str3 = str2;
                            str4 = str;
                        }
                    } else {
                        eVar3.f47278v = 5;
                        Object M10 = M(str, str2, eVar3);
                        if (M10 != coroutine_suspended) {
                            return M10;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    str3 = (String) eVar3.f47272p;
                    str4 = (String) eVar3.f47271o;
                    C4378a c4378a5 = (C4378a) eVar3.f47270n;
                    ResultKt.throwOnFailure(obj);
                    c4378a = c4378a5;
                } else if (i10 == 2) {
                    z12 = eVar3.f47275s;
                    str7 = (String) eVar3.f47272p;
                    str8 = (String) eVar3.f47271o;
                    c4378a3 = (C4378a) eVar3.f47270n;
                    ResultKt.throwOnFailure(obj);
                    eVar2 = eVar3;
                    salesIQResponse = (SalesIQResponse) obj;
                    String str11 = str8;
                    str5 = str7;
                    c4378a2 = c4378a3;
                    str6 = str11;
                    z11 = z12;
                    salesIQResponse2 = salesIQResponse;
                    if (salesIQResponse2.getIsSuccess()) {
                        List list = (List) salesIQResponse2.getData();
                        eVar2.f47270n = c4378a2;
                        eVar2.f47271o = str6;
                        eVar2.f47272p = str5;
                        eVar2.f47273q = salesIQResponse2;
                        eVar2.f47274r = salesIQResponse2;
                        eVar2.f47278v = 3;
                        e eVar4 = eVar2;
                        Object d02 = c4378a2.d0(str5, str6, list, z11, eVar4);
                        eVar3 = eVar4;
                        if (d02 != coroutine_suspended) {
                            String str12 = str6;
                            c4378a4 = c4378a2;
                            str9 = str5;
                            str10 = str12;
                            String str13 = str10;
                            str5 = str9;
                            c4378a2 = c4378a4;
                            str6 = str13;
                            salesIQResponse3 = salesIQResponse2;
                            if (salesIQResponse3.getIsSuccess()) {
                            }
                            eVar3.f47270n = null;
                            eVar3.f47271o = null;
                            eVar3.f47272p = null;
                            eVar3.f47273q = null;
                            eVar3.f47274r = null;
                            eVar3.f47278v = 4;
                            obj = c4378a2.M(str6, str5, eVar3);
                        }
                        return coroutine_suspended;
                    }
                    eVar3 = eVar2;
                    salesIQResponse3 = salesIQResponse2;
                    if (salesIQResponse3.getIsSuccess()) {
                    }
                    eVar3.f47270n = null;
                    eVar3.f47271o = null;
                    eVar3.f47272p = null;
                    eVar3.f47273q = null;
                    eVar3.f47274r = null;
                    eVar3.f47278v = 4;
                    obj = c4378a2.M(str6, str5, eVar3);
                } else {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            ResultKt.throwOnFailure(obj);
                            return (C5582a) obj;
                        }
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    salesIQResponse2 = (SalesIQResponse) eVar3.f47273q;
                    str9 = (String) eVar3.f47272p;
                    str10 = (String) eVar3.f47271o;
                    c4378a4 = (C4378a) eVar3.f47270n;
                    ResultKt.throwOnFailure(obj);
                    String str132 = str10;
                    str5 = str9;
                    c4378a2 = c4378a4;
                    str6 = str132;
                    salesIQResponse3 = salesIQResponse2;
                    if (salesIQResponse3.getIsSuccess() && ((error = salesIQResponse3.getError()) == null || (e10 = error.e()) == null || e10.intValue() != 600)) {
                        List list2 = (List) salesIQResponse3.getData();
                        List b10 = list2 != null ? AbstractC4506a.b(list2) : null;
                        if (b10 == null) {
                            b10 = CollectionsKt.emptyList();
                        }
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse3, b10, null, 0, false, null, null, null, 126, null));
                    }
                    eVar3.f47270n = null;
                    eVar3.f47271o = null;
                    eVar3.f47272p = null;
                    eVar3.f47273q = null;
                    eVar3.f47274r = null;
                    eVar3.f47278v = 4;
                    obj = c4378a2.M(str6, str5, eVar3);
                }
                salesIQResponse = (SalesIQResponse) obj;
                h02 = c4378a.h0(salesIQResponse);
                if (!h02) {
                    C4203a W11 = c4378a.W();
                    String a03 = c4378a.a0();
                    Intrinsics.checkNotNull(a03);
                    String L11 = c4378a.L();
                    Intrinsics.checkNotNull(L11);
                    String Y11 = Y(c4378a, null, true, 1, null);
                    eVar3.f47270n = c4378a;
                    eVar3.f47271o = str4;
                    eVar3.f47272p = str3;
                    eVar3.f47275s = h02;
                    eVar3.f47278v = 2;
                    String str14 = str4;
                    eVar2 = eVar3;
                    String str15 = str3;
                    obj = W11.f(a03, L11, Y11, str15, str14, eVar2);
                    if (obj != coroutine_suspended) {
                        str7 = str15;
                        str8 = str14;
                        c4378a3 = c4378a;
                        z12 = h02;
                        salesIQResponse = (SalesIQResponse) obj;
                        String str112 = str8;
                        str5 = str7;
                        c4378a2 = c4378a3;
                        str6 = str112;
                        z11 = z12;
                        salesIQResponse2 = salesIQResponse;
                        if (salesIQResponse2.getIsSuccess()) {
                        }
                    }
                    return coroutine_suspended;
                }
                eVar2 = eVar3;
                str5 = str3;
                str6 = str4;
                c4378a2 = c4378a;
                z11 = h02;
                salesIQResponse2 = salesIQResponse;
                if (salesIQResponse2.getIsSuccess()) {
                }
            }
        }
        eVar = new e(continuation);
        e eVar32 = eVar;
        Object obj2 = eVar32.f47276t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar32.f47278v;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        h02 = c4378a.h0(salesIQResponse);
        if (!h02) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r5.intValue() != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(SalesIQResponse.Error error, SalesIQResponse salesIQResponse, String str, String str2, String str3, int i10, int i11, boolean z10, Continuation continuation) {
        t tVar;
        int i12;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i13 = tVar.f47360p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                tVar.f47360p = i13 - Integer.MIN_VALUE;
                t tVar2 = tVar;
                Object obj = tVar2.f47358n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i12 = tVar2.f47360p;
                if (i12 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (S().q()) {
                        if (error != null) {
                            Integer b10 = error.b();
                            int a10 = re.y.f64139d.a();
                            if (b10 == null || b10.intValue() != a10) {
                                Integer b11 = error.b();
                                int a11 = re.w.f64137d.a();
                                if (b11 != null) {
                                }
                            }
                        }
                        String Y10 = Y(this, null, true, 1, null);
                        tVar2.f47360p = 1;
                        obj = P(str, str2, str3, i10, i11, Y10, z10, tVar2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return salesIQResponse;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (SalesIQResponse) obj;
            }
        }
        tVar = new t(continuation);
        t tVar22 = tVar;
        Object obj2 = tVar22.f47358n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i12 = tVar22.f47360p;
        if (i12 != 0) {
        }
        return (SalesIQResponse) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(String str, Continuation continuation) {
        w wVar;
        int i10;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i11 = wVar.f47376p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f47376p = i11 - Integer.MIN_VALUE;
                Object obj = wVar.f47374n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = wVar.f47376p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    wVar.f47376p = 1;
                    obj = i0(str, wVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default((SalesIQResponse) obj, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
            }
        }
        wVar = new w(continuation);
        Object obj2 = wVar.f47374n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = wVar.f47376p;
        if (i10 != 0) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default((SalesIQResponse) obj2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r0.intValue() != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r0.intValue() != r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0.intValue() != r2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(SalesIQResponse salesIQResponse) {
        if (!S().q()) {
            return false;
        }
        SalesIQResponse.Error error = salesIQResponse.getError();
        if (error != null) {
            Integer b10 = error.b();
            int a10 = re.y.f64139d.a();
            if (b10 != null) {
            }
        }
        SalesIQResponse.Error error2 = salesIQResponse.getError();
        if (error2 != null) {
            Integer b11 = error2.b();
            int a11 = C6219A.f64093d.a();
            if (b11 != null) {
            }
        }
        SalesIQResponse.Error error3 = salesIQResponse.getError();
        if (error3 != null) {
            Integer b12 = error3.b();
            int a12 = re.v.f64136d.a();
            if (b12 != null) {
            }
        }
        if (!salesIQResponse.getIsSuccess()) {
            return false;
        }
        List list = (List) salesIQResponse.getData();
        if (list == null || !list.isEmpty()) {
            List list2 = (List) salesIQResponse.getData();
            if (list2 == null) {
                return false;
            }
            List<ArticleCategoryResponse> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (ArticleCategoryResponse articleCategoryResponse : list3) {
                    if (articleCategoryResponse.getArticlesCount() > 0 || articleCategoryResponse.getChildrenCount() > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0185, code lost:
    
        if (r4.intValue() != r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bb, code lost:
    
        r4 = r11.W();
        r5 = r11.a0();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r6 = r11.T();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
        r8 = Y(r11, null, true, 1, null);
        r7.f47255n = r11;
        r7.f47256o = r1;
        r7.f47257p = null;
        r7.f47258q = null;
        r7.f47261t = 4;
        r9 = r7;
        r2 = r4.e(r5, r6, r15, r8, r9);
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e3, code lost:
    
        if (r2 != r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e6, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019f, code lost:
    
        if (r4.intValue() != r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b9, code lost:
    
        if (r4.intValue() != r5) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r5v12, types: [T, com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30, types: [T, com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity, java.lang.Object] */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, boolean z10, Continuation continuation) {
        b bVar;
        b bVar2;
        Ref.ObjectRef objectRef;
        C4378a c4378a;
        Ref.ObjectRef objectRef2;
        T t10;
        Object t11;
        C4378a c4378a2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        String str2;
        C4378a c4378a3;
        SalesIQResponse salesIQResponse;
        C4378a c4378a4;
        Ref.ObjectRef objectRef6;
        SalesIQResponse salesIQResponse2;
        C4378a c4378a5;
        String str3;
        SalesIQResponse.Error error;
        SalesIQResponse.Error error2;
        SalesIQResponse.Error error3;
        Ref.ObjectRef objectRef7;
        SalesIQResponse salesIQResponse3;
        SalesIQResponse salesIQResponse4;
        T t12;
        SalesIQResponse copy$default;
        C5582a c10;
        String str4 = str;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f47261t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f47261t = i10 - Integer.MIN_VALUE;
                bVar2 = bVar;
                Object obj = bVar2.f47259r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (bVar2.f47261t) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        objectRef = new Ref.ObjectRef();
                        InterfaceC5321f interfaceC5321f = (InterfaceC5321f) V().j(str4).b();
                        if (interfaceC5321f != null) {
                            bVar2.f47255n = this;
                            bVar2.f47256o = str4;
                            bVar2.f47257p = objectRef;
                            bVar2.f47258q = objectRef;
                            bVar2.f47261t = 1;
                            t11 = AbstractC5323h.t(interfaceC5321f, bVar2);
                            if (t11 != coroutine_suspended) {
                                c4378a2 = this;
                                objectRef3 = objectRef;
                                ArticleEntity articleEntity = (ArticleEntity) t11;
                                objectRef2 = objectRef;
                                objectRef = objectRef3;
                                t10 = articleEntity;
                                c4378a = c4378a2;
                                objectRef2.element = t10;
                                if (og.i.e(c4378a.T())) {
                                    if (og.i.g(objectRef.element)) {
                                        C4203a W10 = c4378a.W();
                                        String a02 = c4378a.a0();
                                        Intrinsics.checkNotNull(a02);
                                        String T10 = c4378a.T();
                                        Intrinsics.checkNotNull(T10);
                                        String Y10 = Y(c4378a, null, false, 3, null);
                                        bVar2.f47255n = c4378a;
                                        bVar2.f47256o = str4;
                                        bVar2.f47257p = objectRef;
                                        bVar2.f47258q = null;
                                        bVar2.f47261t = 2;
                                        String str5 = str4;
                                        Object e10 = W10.e(a02, T10, str5, Y10, bVar2);
                                        bVar2 = bVar2;
                                        if (e10 != coroutine_suspended) {
                                            Ref.ObjectRef objectRef8 = objectRef;
                                            obj = e10;
                                            objectRef5 = objectRef8;
                                            C4378a c4378a6 = c4378a;
                                            str2 = str5;
                                            c4378a3 = c4378a6;
                                            salesIQResponse = (SalesIQResponse) obj;
                                            if (salesIQResponse.getIsSuccess()) {
                                                c4378a4 = c4378a3;
                                                if (!salesIQResponse.getIsSuccess()) {
                                                    error = salesIQResponse.getError();
                                                    if (error != null) {
                                                    }
                                                    error2 = salesIQResponse.getError();
                                                    if (error2 != null) {
                                                    }
                                                    error3 = salesIQResponse.getError();
                                                    if (error3 != null) {
                                                    }
                                                }
                                                salesIQResponse4 = salesIQResponse;
                                                objectRef = objectRef5;
                                                t12 = objectRef.element;
                                                if (t12 == 0) {
                                                }
                                            } else {
                                                ?? a10 = hf.e.a((SalesIQArticleResponse) salesIQResponse.getData());
                                                objectRef5.element = a10;
                                                C2917a V10 = c4378a3.V();
                                                List listOf = CollectionsKt.listOf(a10);
                                                bVar2.f47255n = c4378a3;
                                                bVar2.f47256o = str2;
                                                bVar2.f47257p = objectRef5;
                                                bVar2.f47258q = salesIQResponse;
                                                bVar2.f47261t = 3;
                                                C4378a c4378a7 = c4378a3;
                                                if (C2917a.v(V10, listOf, false, bVar2, 2, null) != coroutine_suspended) {
                                                    objectRef6 = objectRef5;
                                                    salesIQResponse2 = salesIQResponse;
                                                    c4378a5 = c4378a7;
                                                    str3 = str2;
                                                    salesIQResponse = salesIQResponse2;
                                                    objectRef5 = objectRef6;
                                                    str2 = str3;
                                                    c4378a4 = c4378a5;
                                                    if (!salesIQResponse.getIsSuccess() && c4378a4.S().q()) {
                                                        error = salesIQResponse.getError();
                                                        if (error != null) {
                                                            Integer b10 = error.b();
                                                            int a11 = re.y.f64139d.a();
                                                            if (b10 != null) {
                                                                break;
                                                            }
                                                        }
                                                        error2 = salesIQResponse.getError();
                                                        if (error2 != null) {
                                                            Integer b11 = error2.b();
                                                            int a12 = re.x.f64138d.a();
                                                            if (b11 != null) {
                                                                break;
                                                            }
                                                        }
                                                        error3 = salesIQResponse.getError();
                                                        if (error3 != null) {
                                                            Integer b12 = error3.b();
                                                            int a13 = re.w.f64137d.a();
                                                            if (b12 != null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    salesIQResponse4 = salesIQResponse;
                                                    objectRef = objectRef5;
                                                    t12 = objectRef.element;
                                                    if (t12 == 0) {
                                                        return (salesIQResponse4 == null || (copy$default = SalesIQResponse.copy$default(salesIQResponse4, Boxing.boxBoolean(false), null, 0, false, null, null, null, 126, null)) == null || (c10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(copy$default)) == null) ? C5582a.C0817a.c(C5582a.f56502b, new Throwable("App Id may be null"), false, 2, null) : c10;
                                                    }
                                                    ArticleEntity articleEntity2 = (ArticleEntity) t12;
                                                    return articleEntity2 != null ? Intrinsics.areEqual(articleEntity2.getEnabled(), Boxing.boxBoolean(true)) : false ? C5582a.f56502b.d(Boxing.boxBoolean(true)) : C5582a.f56502b.b(new C5582a.b("Article not enabled", Boxing.boxInt(1001), new Throwable("Article not enabled")));
                                                }
                                            }
                                        }
                                    } else {
                                        bVar2.f47255n = objectRef;
                                        bVar2.f47256o = null;
                                        bVar2.f47257p = null;
                                        bVar2.f47258q = null;
                                        bVar2.f47261t = 6;
                                        if (c4378a.h(str4, bVar2) != coroutine_suspended) {
                                            objectRef4 = objectRef;
                                            objectRef = objectRef4;
                                        }
                                    }
                                }
                                salesIQResponse4 = null;
                                t12 = objectRef.element;
                                if (t12 == 0) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        c4378a = this;
                        objectRef2 = objectRef;
                        t10 = 0;
                        objectRef2.element = t10;
                        if (og.i.e(c4378a.T())) {
                        }
                        salesIQResponse4 = null;
                        t12 = objectRef.element;
                        if (t12 == 0) {
                        }
                        break;
                    case 1:
                        Ref.ObjectRef objectRef9 = (Ref.ObjectRef) bVar2.f47258q;
                        Ref.ObjectRef objectRef10 = (Ref.ObjectRef) bVar2.f47257p;
                        String str6 = (String) bVar2.f47256o;
                        c4378a2 = (C4378a) bVar2.f47255n;
                        ResultKt.throwOnFailure(obj);
                        objectRef = objectRef9;
                        str4 = str6;
                        objectRef3 = objectRef10;
                        t11 = obj;
                        ArticleEntity articleEntity3 = (ArticleEntity) t11;
                        objectRef2 = objectRef;
                        objectRef = objectRef3;
                        t10 = articleEntity3;
                        c4378a = c4378a2;
                        objectRef2.element = t10;
                        if (og.i.e(c4378a.T())) {
                        }
                        salesIQResponse4 = null;
                        t12 = objectRef.element;
                        if (t12 == 0) {
                        }
                        break;
                    case 2:
                        objectRef5 = (Ref.ObjectRef) bVar2.f47257p;
                        String str7 = (String) bVar2.f47256o;
                        C4378a c4378a8 = (C4378a) bVar2.f47255n;
                        ResultKt.throwOnFailure(obj);
                        str2 = str7;
                        c4378a3 = c4378a8;
                        salesIQResponse = (SalesIQResponse) obj;
                        if (salesIQResponse.getIsSuccess()) {
                        }
                        break;
                    case 3:
                        salesIQResponse2 = (SalesIQResponse) bVar2.f47258q;
                        objectRef6 = (Ref.ObjectRef) bVar2.f47257p;
                        str3 = (String) bVar2.f47256o;
                        c4378a5 = (C4378a) bVar2.f47255n;
                        ResultKt.throwOnFailure(obj);
                        salesIQResponse = salesIQResponse2;
                        objectRef5 = objectRef6;
                        str2 = str3;
                        c4378a4 = c4378a5;
                        if (!salesIQResponse.getIsSuccess()) {
                        }
                        salesIQResponse4 = salesIQResponse;
                        objectRef = objectRef5;
                        t12 = objectRef.element;
                        if (t12 == 0) {
                        }
                        break;
                    case 4:
                        objectRef5 = (Ref.ObjectRef) bVar2.f47256o;
                        C4378a c4378a9 = (C4378a) bVar2.f47255n;
                        ResultKt.throwOnFailure(obj);
                        salesIQResponse = (SalesIQResponse) obj;
                        if (salesIQResponse.getIsSuccess()) {
                            ?? a14 = hf.e.a((SalesIQArticleResponse) salesIQResponse.getData());
                            objectRef5.element = a14;
                            C2917a V11 = c4378a9.V();
                            List listOf2 = CollectionsKt.listOf(a14);
                            bVar2.f47255n = objectRef5;
                            bVar2.f47256o = salesIQResponse;
                            bVar2.f47261t = 5;
                            if (C2917a.v(V11, listOf2, false, bVar2, 2, null) != coroutine_suspended) {
                                objectRef7 = objectRef5;
                                salesIQResponse3 = salesIQResponse;
                                salesIQResponse = salesIQResponse3;
                                objectRef5 = objectRef7;
                            }
                            return coroutine_suspended;
                        }
                        salesIQResponse4 = salesIQResponse;
                        objectRef = objectRef5;
                        t12 = objectRef.element;
                        if (t12 == 0) {
                        }
                        break;
                    case 5:
                        salesIQResponse3 = (SalesIQResponse) bVar2.f47256o;
                        objectRef7 = (Ref.ObjectRef) bVar2.f47255n;
                        ResultKt.throwOnFailure(obj);
                        salesIQResponse = salesIQResponse3;
                        objectRef5 = objectRef7;
                        salesIQResponse4 = salesIQResponse;
                        objectRef = objectRef5;
                        t12 = objectRef.element;
                        if (t12 == 0) {
                        }
                        break;
                    case 6:
                        objectRef4 = (Ref.ObjectRef) bVar2.f47255n;
                        ResultKt.throwOnFailure(obj);
                        objectRef = objectRef4;
                        salesIQResponse4 = null;
                        t12 = objectRef.element;
                        if (t12 == 0) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        bVar = new b(continuation);
        bVar2 = bVar;
        Object obj2 = bVar2.f47259r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (bVar2.f47261t) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x017e, code lost:
    
        if (r1 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019b, code lost:
    
        if (r0.i(r4, r3) != r6) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c4, code lost:
    
        if (r5.intValue() != r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0108, code lost:
    
        r3.f47368n = r0;
        r3.f47369o = r2;
        r3.f47373s = 2;
        r1 = r0.N(r2, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0112, code lost:
    
        if (r1 != r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
    
        if (r5.intValue() != r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f0, code lost:
    
        if (r5.intValue() != r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        if (r4.intValue() != r5) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i0(String str, Continuation continuation) {
        v vVar;
        int i10;
        C4378a c4378a;
        String str2;
        SalesIQResponse salesIQResponse;
        ArticleEntity a10;
        SalesIQResponse salesIQResponse2;
        String str3;
        C4378a c4378a2;
        SalesIQArticleResponse salesIQArticleResponse;
        boolean z10;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i11 = vVar.f47373s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f47373s = i11 - Integer.MIN_VALUE;
                v vVar2 = vVar;
                Object obj = vVar2.f47371q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = vVar2.f47373s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!og.i.e(a0()) || !og.i.e(T())) {
                        return SalesIQResponse.INSTANCE.b(new Throwable("Screen name is null"));
                    }
                    vVar2.f47368n = this;
                    vVar2.f47369o = str;
                    vVar2.f47373s = 1;
                    Object O10 = O(this, str, false, vVar2, 2, null);
                    if (O10 != coroutine_suspended) {
                        c4378a = this;
                        obj = O10;
                        str2 = str;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    str2 = (String) vVar2.f47369o;
                    C4378a c4378a3 = (C4378a) vVar2.f47368n;
                    ResultKt.throwOnFailure(obj);
                    c4378a = c4378a3;
                } else if (i10 == 2) {
                    str2 = (String) vVar2.f47369o;
                    C4378a c4378a4 = (C4378a) vVar2.f47368n;
                    ResultKt.throwOnFailure(obj);
                    salesIQResponse = (SalesIQResponse) obj;
                    c4378a = c4378a4;
                    str3 = str2;
                    salesIQResponse2 = salesIQResponse;
                    salesIQArticleResponse = (SalesIQArticleResponse) salesIQResponse2.getData();
                    if (!(salesIQArticleResponse == null ? Intrinsics.areEqual(salesIQArticleResponse.getEnabled(), Boxing.boxBoolean(false)) : false)) {
                    }
                    c4378a.R().i().remove(str3);
                    C2917a V10 = c4378a.V();
                    vVar2.f47368n = salesIQResponse2;
                    vVar2.f47369o = null;
                    vVar2.f47370p = null;
                    vVar2.f47373s = 4;
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        salesIQResponse2 = (SalesIQResponse) vVar2.f47368n;
                        ResultKt.throwOnFailure(obj);
                        if (salesIQResponse2.getIsSuccess()) {
                            SalesIQArticleResponse salesIQArticleResponse2 = (SalesIQArticleResponse) salesIQResponse2.getData();
                            if (!(salesIQArticleResponse2 != null ? Intrinsics.areEqual(salesIQArticleResponse2.getEnabled(), Boxing.boxBoolean(true)) : false)) {
                                SalesIQResponse.Companion.c(SalesIQResponse.INSTANCE, new SalesIQResponse.Error(Boxing.boxInt(400), new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(re.x.f64138d.a()), "Article unavailable")), new Throwable("Article unavailable")), 0, 2, null);
                            }
                        }
                        return salesIQResponse2;
                    }
                    salesIQResponse2 = (SalesIQResponse) vVar2.f47370p;
                    str3 = (String) vVar2.f47369o;
                    c4378a2 = (C4378a) vVar2.f47368n;
                    ResultKt.throwOnFailure(obj);
                    c4378a = c4378a2;
                    salesIQArticleResponse = (SalesIQArticleResponse) salesIQResponse2.getData();
                    if (!(salesIQArticleResponse == null ? Intrinsics.areEqual(salesIQArticleResponse.getEnabled(), Boxing.boxBoolean(false)) : false)) {
                        SalesIQResponse.Error error = salesIQResponse2.getError();
                        if (error != null) {
                            Integer b10 = error.b();
                            int a11 = re.x.f64138d.a();
                            if (b10 != null && b10.intValue() == a11) {
                                z10 = true;
                            }
                        }
                        z10 = false;
                    }
                    c4378a.R().i().remove(str3);
                    C2917a V102 = c4378a.V();
                    vVar2.f47368n = salesIQResponse2;
                    vVar2.f47369o = null;
                    vVar2.f47370p = null;
                    vVar2.f47373s = 4;
                }
                salesIQResponse = (SalesIQResponse) obj;
                if (salesIQResponse.getIsSuccess()) {
                    SalesIQResponse.Error error2 = salesIQResponse.getError();
                    if (c4378a.S().q()) {
                        if (error2 != null) {
                            Integer b11 = error2.b();
                            int a12 = re.y.f64139d.a();
                            if (b11 != null) {
                            }
                        }
                        if (error2 != null) {
                            Integer b12 = error2.b();
                            int a13 = C6219A.f64093d.a();
                            if (b12 != null) {
                            }
                        }
                        if (error2 != null) {
                            Integer b13 = error2.b();
                            int a14 = re.x.f64138d.a();
                            if (b13 != null) {
                            }
                        }
                        if (error2 != null) {
                            Integer b14 = error2.b();
                            int a15 = re.v.f64136d.a();
                            if (b14 != null) {
                            }
                        }
                    }
                    str3 = str2;
                    salesIQResponse2 = salesIQResponse;
                } else {
                    SalesIQArticleResponse salesIQArticleResponse3 = (SalesIQArticleResponse) salesIQResponse.getData();
                    if (salesIQArticleResponse3 != null && (a10 = hf.e.a(salesIQArticleResponse3)) != null) {
                        C2917a V11 = c4378a.V();
                        List listOf = CollectionsKt.listOf(a10);
                        vVar2.f47368n = c4378a;
                        vVar2.f47369o = str2;
                        vVar2.f47370p = salesIQResponse;
                        vVar2.f47373s = 3;
                        Object u10 = V11.u(listOf, true, vVar2);
                        if (u10 != coroutine_suspended) {
                            String str4 = str2;
                            salesIQResponse2 = salesIQResponse;
                            obj = u10;
                            str3 = str4;
                            c4378a2 = c4378a;
                            c4378a = c4378a2;
                        }
                        return coroutine_suspended;
                    }
                    str3 = str2;
                    salesIQResponse2 = salesIQResponse;
                }
                salesIQArticleResponse = (SalesIQArticleResponse) salesIQResponse2.getData();
                if (!(salesIQArticleResponse == null ? Intrinsics.areEqual(salesIQArticleResponse.getEnabled(), Boxing.boxBoolean(false)) : false)) {
                }
                c4378a.R().i().remove(str3);
                C2917a V1022 = c4378a.V();
                vVar2.f47368n = salesIQResponse2;
                vVar2.f47369o = null;
                vVar2.f47370p = null;
                vVar2.f47373s = 4;
            }
        }
        vVar = new v(continuation);
        v vVar22 = vVar;
        Object obj2 = vVar22.f47371q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = vVar22.f47373s;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        if (salesIQResponse.getIsSuccess()) {
        }
        salesIQArticleResponse = (SalesIQArticleResponse) salesIQResponse2.getData();
        if (!(salesIQArticleResponse == null ? Intrinsics.areEqual(salesIQArticleResponse.getEnabled(), Boxing.boxBoolean(false)) : false)) {
        }
        c4378a.R().i().remove(str3);
        C2917a V10222 = c4378a.V();
        vVar22.f47368n = salesIQResponse2;
        vVar22.f47369o = null;
        vVar22.f47370p = null;
        vVar22.f47373s = 4;
    }

    @Override // kf.InterfaceC5253a
    public C5582a j() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(S().g()));
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

    @Override // kf.InterfaceC5253a
    public Object k(Continuation continuation) {
        R().f();
        return V().f(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0284, code lost:
    
        if (r8.h(r6, r7, r3, r5, r12) == r15) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02b3, code lost:
    
        if (cf.C2917a.v(r3, r5, false, r12, 2, null) == r15) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(String str, String str2, String str3, boolean z10, String str4, Continuation continuation) {
        y yVar;
        int i10;
        Integer num;
        Ref.ObjectRef objectRef;
        SalesIQArticleResponse salesIQArticleResponse;
        y yVar2;
        int i11;
        C4378a c4378a;
        String str5;
        String str6;
        String str7;
        int i12;
        T t10;
        Ref.ObjectRef objectRef2;
        SalesIQResponse salesIQResponse;
        String str8;
        int i13;
        boolean z11;
        int i14;
        SalesIQArticleResponse salesIQArticleResponse2;
        C4378a c4378a2;
        String str9;
        String str10;
        Ref.ObjectRef objectRef3;
        boolean z12;
        T t11;
        C4378a c4378a3;
        String str11;
        String str12;
        Ref.ObjectRef objectRef4;
        T t12;
        SalesIQResponse salesIQResponse2;
        T t13;
        SalesIQResponse salesIQResponse3;
        C5582a b10;
        SalesIQArticleResponse salesIQArticleResponse3;
        Object obj;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i15 = yVar.f47396x;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                yVar.f47396x = i15 - Integer.MIN_VALUE;
                y yVar3 = yVar;
                Object obj2 = yVar3.f47394v;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = yVar3.f47396x;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!og.i.e(a0()) || !og.i.e(L())) {
                        return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Screen name or app Id is null"), false, 2, null);
                    }
                    String b02 = b0(str, str2, str3);
                    if (z10) {
                        num = Boxing.boxInt(1);
                    } else {
                        num = (Integer) R().v().get(b02);
                        if (num == null) {
                            num = Boxing.boxInt(1);
                        }
                    }
                    int intValue = num.intValue();
                    objectRef = new Ref.ObjectRef();
                    String Y10 = Y(this, str4, false, 2, null);
                    yVar3.f47386n = this;
                    yVar3.f47387o = str;
                    yVar3.f47388p = str2;
                    yVar3.f47389q = str3;
                    yVar3.f47390r = objectRef;
                    yVar3.f47391s = objectRef;
                    yVar3.f47393u = intValue;
                    yVar3.f47396x = 1;
                    salesIQArticleResponse = null;
                    yVar2 = yVar3;
                    i11 = 2;
                    Object Q10 = Q(this, str, str2, str3, intValue, 0, Y10, false, yVar2, 80, null);
                    if (Q10 != coroutine_suspended) {
                        c4378a = this;
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        i12 = intValue;
                        t10 = Q10;
                        objectRef2 = objectRef;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    i12 = yVar3.f47393u;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) yVar3.f47391s;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) yVar3.f47390r;
                    str7 = (String) yVar3.f47389q;
                    String str13 = (String) yVar3.f47388p;
                    String str14 = (String) yVar3.f47387o;
                    C4378a c4378a4 = (C4378a) yVar3.f47386n;
                    ResultKt.throwOnFailure(obj2);
                    objectRef2 = objectRef6;
                    yVar2 = yVar3;
                    c4378a = c4378a4;
                    i11 = 2;
                    salesIQArticleResponse = null;
                    str5 = str14;
                    objectRef = objectRef5;
                    str6 = str13;
                    t10 = obj2;
                } else if (i10 == 2) {
                    int i16 = yVar3.f47393u;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) yVar3.f47392t;
                    objectRef3 = (Ref.ObjectRef) yVar3.f47390r;
                    str8 = (String) yVar3.f47389q;
                    String str15 = (String) yVar3.f47388p;
                    str9 = (String) yVar3.f47387o;
                    c4378a2 = (C4378a) yVar3.f47386n;
                    ResultKt.throwOnFailure(obj2);
                    z11 = false;
                    objectRef2 = objectRef7;
                    str10 = str15;
                    t12 = obj2;
                    i14 = i16;
                    salesIQArticleResponse2 = null;
                    i13 = 3;
                    objectRef2.element = t12;
                    objectRef2 = objectRef3;
                    str5 = str9;
                    str6 = str10;
                    c4378a = c4378a2;
                    t11 = objectRef2.element;
                    Intrinsics.checkNotNull(t11);
                    if (((SalesIQResponse) t11).getIsSuccess()) {
                        T t14 = objectRef2.element;
                        Intrinsics.checkNotNull(t14);
                        List list = (List) ((SalesIQResponse) t14).getData();
                        if (list != null) {
                            if (list.isEmpty()) {
                                T t15 = objectRef2.element;
                                Intrinsics.checkNotNull(t15);
                                yVar3.f47386n = c4378a;
                                yVar3.f47387o = str5;
                                yVar3.f47388p = str6;
                                yVar3.f47389q = str8;
                                yVar3.f47390r = objectRef2;
                                yVar3.f47391s = objectRef2;
                                yVar3.f47392t = salesIQArticleResponse2;
                                yVar3.f47393u = i14;
                                yVar3.f47396x = i13;
                                z12 = true;
                                Object g02 = g0(c4378a, null, (SalesIQResponse) t15, str5, str6, str8, i14, 0, false, yVar3, 192, null);
                                if (g02 != coroutine_suspended) {
                                    c4378a3 = c4378a;
                                    str11 = str5;
                                    str12 = str6;
                                    objectRef4 = objectRef2;
                                    t13 = g02;
                                    objectRef2.element = t13;
                                    objectRef2 = objectRef4;
                                    str5 = str11;
                                    str6 = str12;
                                    c4378a = c4378a3;
                                    T t16 = objectRef2.element;
                                    Intrinsics.checkNotNull(t16);
                                    salesIQResponse2 = (SalesIQResponse) t16;
                                    if (salesIQResponse2.getIsSuccess()) {
                                    }
                                    salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                                    if (salesIQResponse3 != null) {
                                    }
                                    T t17 = objectRef2.element;
                                    Intrinsics.checkNotNull(t17);
                                    SalesIQResponse.Error error = ((SalesIQResponse) t17).getError();
                                    Intrinsics.checkNotNull(error);
                                    b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error);
                                    if (b10.d()) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            z12 = true;
                            T t162 = objectRef2.element;
                            Intrinsics.checkNotNull(t162);
                            salesIQResponse2 = (SalesIQResponse) t162;
                            if (salesIQResponse2.getIsSuccess()) {
                            }
                            salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                            if (salesIQResponse3 != null) {
                            }
                            T t172 = objectRef2.element;
                            Intrinsics.checkNotNull(t172);
                            SalesIQResponse.Error error2 = ((SalesIQResponse) t172).getError();
                            Intrinsics.checkNotNull(error2);
                            b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error2);
                            if (b10.d()) {
                            }
                        }
                    }
                    z12 = true;
                    T t1622 = objectRef2.element;
                    Intrinsics.checkNotNull(t1622);
                    salesIQResponse2 = (SalesIQResponse) t1622;
                    if (salesIQResponse2.getIsSuccess()) {
                    }
                    salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                    if (salesIQResponse3 != null) {
                    }
                    T t1722 = objectRef2.element;
                    Intrinsics.checkNotNull(t1722);
                    SalesIQResponse.Error error22 = ((SalesIQResponse) t1722).getError();
                    Intrinsics.checkNotNull(error22);
                    b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error22);
                    if (b10.d()) {
                    }
                } else {
                    if (i10 != 3) {
                        if (i10 != 4 && i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ref.ObjectRef objectRef8 = (Ref.ObjectRef) yVar3.f47386n;
                        ResultKt.throwOnFailure(obj2);
                        objectRef2 = objectRef8;
                        z11 = false;
                        z12 = true;
                        salesIQArticleResponse2 = null;
                        salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                        if (salesIQResponse3 != null || salesIQResponse3.getIsSuccess() != z12) {
                            T t17222 = objectRef2.element;
                            Intrinsics.checkNotNull(t17222);
                            SalesIQResponse.Error error222 = ((SalesIQResponse) t17222).getError();
                            Intrinsics.checkNotNull(error222);
                            b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error222);
                            if (b10.d()) {
                                Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                                return b10;
                            }
                            ((Boolean) b10.b()).getClass();
                            return b10.a(Boxing.boxBoolean(z11));
                        }
                        C5582a.C0817a c0817a = C5582a.f56502b;
                        T t18 = objectRef2.element;
                        Intrinsics.checkNotNull(t18);
                        List list2 = (List) ((SalesIQResponse) t18).getData();
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = salesIQArticleResponse2;
                                    break;
                                }
                                obj = it.next();
                                if (Intrinsics.areEqual(((SalesIQArticleResponse) obj).getEnabled(), Boxing.boxBoolean(z12))) {
                                    break;
                                }
                            }
                            salesIQArticleResponse3 = (SalesIQArticleResponse) obj;
                        } else {
                            salesIQArticleResponse3 = salesIQArticleResponse2;
                        }
                        if (salesIQArticleResponse3 != null) {
                            z11 = z12;
                        }
                        return c0817a.d(Boxing.boxBoolean(z11));
                    }
                    int i17 = yVar3.f47393u;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) yVar3.f47391s;
                    objectRef4 = (Ref.ObjectRef) yVar3.f47390r;
                    str8 = (String) yVar3.f47389q;
                    String str16 = (String) yVar3.f47388p;
                    str11 = (String) yVar3.f47387o;
                    c4378a3 = (C4378a) yVar3.f47386n;
                    ResultKt.throwOnFailure(obj2);
                    z11 = false;
                    objectRef2 = objectRef9;
                    str12 = str16;
                    t13 = obj2;
                    i14 = i17;
                    z12 = true;
                    salesIQArticleResponse2 = null;
                    objectRef2.element = t13;
                    objectRef2 = objectRef4;
                    str5 = str11;
                    str6 = str12;
                    c4378a = c4378a3;
                    T t16222 = objectRef2.element;
                    Intrinsics.checkNotNull(t16222);
                    salesIQResponse2 = (SalesIQResponse) t16222;
                    if (salesIQResponse2.getIsSuccess()) {
                        List list3 = (List) salesIQResponse2.getData();
                        if (i14 == z12 && (str8 == null || str8.length() == 0)) {
                            C2917a V10 = c4378a.V();
                            boolean b03 = c4378a.S().b0() ^ z12;
                            List b11 = hf.e.b(list3);
                            yVar3.f47386n = objectRef2;
                            yVar3.f47387o = salesIQResponse2;
                            yVar3.f47388p = salesIQArticleResponse2;
                            yVar3.f47389q = salesIQArticleResponse2;
                            yVar3.f47390r = salesIQArticleResponse2;
                            yVar3.f47391s = salesIQArticleResponse2;
                            yVar3.f47392t = salesIQArticleResponse2;
                            yVar3.f47396x = 4;
                        } else {
                            C2917a V11 = c4378a.V();
                            List b12 = hf.e.b(list3);
                            yVar3.f47386n = objectRef2;
                            yVar3.f47387o = salesIQResponse2;
                            yVar3.f47388p = salesIQArticleResponse2;
                            yVar3.f47389q = salesIQArticleResponse2;
                            yVar3.f47390r = salesIQArticleResponse2;
                            yVar3.f47391s = salesIQArticleResponse2;
                            yVar3.f47392t = salesIQArticleResponse2;
                            yVar3.f47396x = 5;
                        }
                    }
                    salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                    if (salesIQResponse3 != null) {
                    }
                    T t172222 = objectRef2.element;
                    Intrinsics.checkNotNull(t172222);
                    SalesIQResponse.Error error2222 = ((SalesIQResponse) t172222).getError();
                    Intrinsics.checkNotNull(error2222);
                    b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error2222);
                    if (b10.d()) {
                    }
                }
                objectRef.element = t10;
                if (str7 != null || str7.length() == 0) {
                    salesIQResponse = (SalesIQResponse) objectRef2.element;
                    if (salesIQResponse.getIsSuccess()) {
                        SalesIQResponse.Error error3 = salesIQResponse.getError();
                        if (error3 == null) {
                            error3 = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                        }
                        T t19 = objectRef2.element;
                        Intrinsics.checkNotNull(t19);
                        yVar2.f47386n = c4378a;
                        yVar2.f47387o = str5;
                        yVar2.f47388p = str6;
                        yVar2.f47389q = str7;
                        yVar2.f47390r = objectRef2;
                        yVar2.f47391s = salesIQResponse;
                        yVar2.f47392t = objectRef2;
                        yVar2.f47393u = i12;
                        yVar2.f47396x = i11;
                        int i18 = i12;
                        salesIQArticleResponse2 = salesIQArticleResponse;
                        i13 = 3;
                        yVar3 = yVar2;
                        str8 = str7;
                        i14 = i18;
                        z11 = false;
                        Object g03 = g0(c4378a, error3, (SalesIQResponse) t19, str5, str6, str8, i14, 0, false, yVar3, 192, null);
                        if (g03 != coroutine_suspended) {
                            c4378a2 = c4378a;
                            str9 = str5;
                            str10 = str6;
                            objectRef3 = objectRef2;
                            t12 = g03;
                            objectRef2.element = t12;
                            objectRef2 = objectRef3;
                            str5 = str9;
                            str6 = str10;
                            c4378a = c4378a2;
                            t11 = objectRef2.element;
                            Intrinsics.checkNotNull(t11);
                            if (((SalesIQResponse) t11).getIsSuccess()) {
                            }
                            z12 = true;
                            T t162222 = objectRef2.element;
                            Intrinsics.checkNotNull(t162222);
                            salesIQResponse2 = (SalesIQResponse) t162222;
                            if (salesIQResponse2.getIsSuccess()) {
                            }
                            salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                            if (salesIQResponse3 != null) {
                            }
                            T t1722222 = objectRef2.element;
                            Intrinsics.checkNotNull(t1722222);
                            SalesIQResponse.Error error22222 = ((SalesIQResponse) t1722222).getError();
                            Intrinsics.checkNotNull(error22222);
                            b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error22222);
                            if (b10.d()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    yVar3 = yVar2;
                    str8 = str7;
                    i13 = 3;
                    z11 = false;
                    i14 = i12;
                    salesIQArticleResponse2 = salesIQArticleResponse;
                    t11 = objectRef2.element;
                    Intrinsics.checkNotNull(t11);
                    if (((SalesIQResponse) t11).getIsSuccess()) {
                    }
                    z12 = true;
                    T t1622222 = objectRef2.element;
                    Intrinsics.checkNotNull(t1622222);
                    salesIQResponse2 = (SalesIQResponse) t1622222;
                    if (salesIQResponse2.getIsSuccess()) {
                    }
                    salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                    if (salesIQResponse3 != null) {
                    }
                    T t17222222 = objectRef2.element;
                    Intrinsics.checkNotNull(t17222222);
                    SalesIQResponse.Error error222222 = ((SalesIQResponse) t17222222).getError();
                    Intrinsics.checkNotNull(error222222);
                    b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error222222);
                    if (b10.d()) {
                    }
                } else {
                    yVar3 = yVar2;
                    str8 = str7;
                    z12 = true;
                    z11 = false;
                    i14 = i12;
                    salesIQArticleResponse2 = salesIQArticleResponse;
                    T t16222222 = objectRef2.element;
                    Intrinsics.checkNotNull(t16222222);
                    salesIQResponse2 = (SalesIQResponse) t16222222;
                    if (salesIQResponse2.getIsSuccess()) {
                    }
                    salesIQResponse3 = (SalesIQResponse) objectRef2.element;
                    if (salesIQResponse3 != null) {
                    }
                    T t172222222 = objectRef2.element;
                    Intrinsics.checkNotNull(t172222222);
                    SalesIQResponse.Error error2222222 = ((SalesIQResponse) t172222222).getError();
                    Intrinsics.checkNotNull(error2222222);
                    b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.b(error2222222);
                    if (b10.d()) {
                    }
                }
            }
        }
        yVar = new y(continuation);
        y yVar32 = yVar;
        Object obj22 = yVar32.f47394v;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = yVar32.f47396x;
        if (i10 != 0) {
        }
        objectRef.element = t10;
        if (str7 != null) {
        }
        salesIQResponse = (SalesIQResponse) objectRef2.element;
        if (salesIQResponse.getIsSuccess()) {
        }
    }

    @Override // kf.InterfaceC5253a
    public C5582a m(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        C5582a j10 = V().j(articleId);
        if (j10.d()) {
            return j10.a(new p((InterfaceC5321f) j10.b(), this));
        }
        Intrinsics.checkNotNull(j10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(String str, String str2, EnumC5132a enumC5132a, Continuation continuation) {
        u uVar;
        int i10;
        SalesIQResponse b10;
        C4378a c4378a;
        String str3;
        EnumC5132a enumC5132a2;
        SalesIQResponse salesIQResponse;
        SalesIQResponse salesIQResponse2;
        String str4;
        SalesIQResponse salesIQResponse3;
        EnumC5132a enumC5132a3;
        C2917a V10;
        SalesIQResponse salesIQResponse4;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i11 = uVar.f47367t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f47367t = i11 - Integer.MIN_VALUE;
                u uVar2 = uVar;
                Object obj = uVar2.f47365r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = uVar2.f47367t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!og.i.e(a0())) {
                        b10 = SalesIQResponse.INSTANCE.b(new Throwable("Screen name is null"));
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                    }
                    C4203a W10 = W();
                    String a02 = a0();
                    Intrinsics.checkNotNull(a02);
                    String Y10 = Y(this, str2, false, 2, null);
                    uVar2.f47361n = this;
                    uVar2.f47362o = str;
                    uVar2.f47363p = enumC5132a;
                    uVar2.f47367t = 1;
                    obj = W10.o(a02, str, enumC5132a, Y10, uVar2);
                    if (obj != coroutine_suspended) {
                        c4378a = this;
                        str3 = str;
                        enumC5132a2 = enumC5132a;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        salesIQResponse4 = (SalesIQResponse) uVar2.f47361n;
                        ResultKt.throwOnFailure(obj);
                        salesIQResponse2 = salesIQResponse4;
                        b10 = SalesIQResponse.copy$default(salesIQResponse2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                    }
                    salesIQResponse3 = (SalesIQResponse) uVar2.f47364q;
                    enumC5132a3 = (EnumC5132a) uVar2.f47363p;
                    str4 = (String) uVar2.f47362o;
                    c4378a = (C4378a) uVar2.f47361n;
                    ResultKt.throwOnFailure(obj);
                    EnumC5132a enumC5132a4 = enumC5132a3;
                    salesIQResponse = salesIQResponse3;
                    str3 = str4;
                    enumC5132a2 = enumC5132a4;
                    V10 = c4378a.V();
                    uVar2.f47361n = salesIQResponse;
                    uVar2.f47362o = null;
                    uVar2.f47363p = null;
                    uVar2.f47364q = null;
                    uVar2.f47367t = 3;
                    if (V10.s(str3, enumC5132a2, uVar2) != coroutine_suspended) {
                        salesIQResponse4 = salesIQResponse;
                        salesIQResponse2 = salesIQResponse4;
                        b10 = SalesIQResponse.copy$default(salesIQResponse2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                    }
                    return coroutine_suspended;
                }
                enumC5132a2 = (EnumC5132a) uVar2.f47363p;
                str3 = (String) uVar2.f47362o;
                C4378a c4378a2 = (C4378a) uVar2.f47361n;
                ResultKt.throwOnFailure(obj);
                c4378a = c4378a2;
                salesIQResponse = (SalesIQResponse) obj;
                if (salesIQResponse.getIsSuccess()) {
                    salesIQResponse2 = salesIQResponse;
                    b10 = SalesIQResponse.copy$default(salesIQResponse2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null);
                    return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                }
                if (enumC5132a2 == EnumC5132a.Liked || enumC5132a2 == EnumC5132a.Disliked) {
                    C2917a V11 = c4378a.V();
                    String value = enumC5132a2.getValue();
                    uVar2.f47361n = c4378a;
                    uVar2.f47362o = str3;
                    uVar2.f47363p = enumC5132a2;
                    uVar2.f47364q = salesIQResponse;
                    uVar2.f47367t = 2;
                    if (V11.y(str3, value, uVar2) != coroutine_suspended) {
                        EnumC5132a enumC5132a5 = enumC5132a2;
                        str4 = str3;
                        salesIQResponse3 = salesIQResponse;
                        enumC5132a3 = enumC5132a5;
                        EnumC5132a enumC5132a42 = enumC5132a3;
                        salesIQResponse = salesIQResponse3;
                        str3 = str4;
                        enumC5132a2 = enumC5132a42;
                    }
                    return coroutine_suspended;
                }
                V10 = c4378a.V();
                uVar2.f47361n = salesIQResponse;
                uVar2.f47362o = null;
                uVar2.f47363p = null;
                uVar2.f47364q = null;
                uVar2.f47367t = 3;
                if (V10.s(str3, enumC5132a2, uVar2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        uVar = new u(continuation);
        u uVar22 = uVar;
        Object obj2 = uVar22.f47365r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = uVar22.f47367t;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        if (salesIQResponse.getIsSuccess()) {
        }
    }

    @Override // kf.InterfaceC5253a
    public C5582a o(List exceptionalIds, String str) {
        Intrinsics.checkNotNullParameter(exceptionalIds, "exceptionalIds");
        C5582a r10 = V().r(exceptionalIds, str, Z());
        if (r10.d()) {
            return r10.a(new o((InterfaceC5321f) r10.b(), this));
        }
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return r10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if (r1 != r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(String str, String str2, String str3, int i10, int i11, Continuation continuation) {
        l lVar;
        l lVar2;
        Object obj;
        int i12;
        int i13;
        Object h10;
        C4378a c4378a;
        SalesIQResponse salesIQResponse;
        List list;
        List b10;
        SalesIQResponse salesIQResponse2;
        List list2;
        List list3;
        List b11;
        List list4;
        C5582a.C0817a c0817a;
        List b12;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i14 = lVar.f47321r;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f47321r = i14 - Integer.MIN_VALUE;
                lVar2 = lVar;
                obj = lVar2.f47319p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i12 = lVar2.f47321r;
                if (i12 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!og.i.e(a0()) || !og.i.e(T())) {
                        return C5582a.f56502b.b(new C5582a.b("Screen name or app Id is null", Boxing.boxInt(-1), null, 4, null));
                    }
                    C4203a W10 = W();
                    i13 = 2;
                    String a02 = a0();
                    Intrinsics.checkNotNull(a02);
                    String T10 = T();
                    Intrinsics.checkNotNull(T10);
                    Integer boxInt = Boxing.boxInt(i11);
                    String Y10 = Y(this, null, false, 3, null);
                    lVar2.f47317n = this;
                    lVar2.f47321r = 1;
                    h10 = C4203a.h(W10, a02, T10, str, str2, str3, i10, boxInt, null, Y10, true, lVar2, 128, null);
                    if (h10 != coroutine_suspended) {
                        c4378a = this;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0817a = (C5582a.C0817a) lVar2.f47317n;
                        ResultKt.throwOnFailure(obj);
                        list4 = null;
                        List list5 = (List) ((C5582a) obj).b();
                        b12 = list5 == null ? hf.g.b(list5) : list4;
                        if (b12 == null) {
                            b12 = CollectionsKt.emptyList();
                        }
                        return c0817a.d(b12);
                    }
                    salesIQResponse = (SalesIQResponse) lVar2.f47318o;
                    c4378a = (C4378a) lVar2.f47317n;
                    ResultKt.throwOnFailure(obj);
                    salesIQResponse2 = salesIQResponse;
                    list2 = (List) salesIQResponse2.getData();
                    if (list2 != null) {
                        List list6 = list2;
                        list3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                        Iterator it = list6.iterator();
                        while (it.hasNext()) {
                            list3.add(((SalesIQArticleResponse) it.next()).getId());
                        }
                    } else {
                        list3 = null;
                    }
                    if (list3 == null) {
                        list3 = CollectionsKt.emptyList();
                    }
                    if (!salesIQResponse2.getIsSuccess()) {
                        List list7 = (List) salesIQResponse2.getData();
                        List b13 = (list7 == null || (b11 = hf.e.b(list7)) == null) ? null : hf.g.b(b11);
                        if (b13 == null) {
                            b13 = CollectionsKt.emptyList();
                        }
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, b13, null, 0, false, null, null, null, 126, null));
                    }
                    C5582a.C0817a c0817a2 = C5582a.f56502b;
                    C2917a V10 = c4378a.V();
                    lVar2.f47317n = c0817a2;
                    list4 = null;
                    lVar2.f47318o = null;
                    lVar2.f47321r = 3;
                    Object m10 = V10.m(list3, lVar2);
                    if (m10 != coroutine_suspended) {
                        c0817a = c0817a2;
                        obj = m10;
                        List list52 = (List) ((C5582a) obj).b();
                        if (list52 == null) {
                        }
                        if (b12 == null) {
                        }
                        return c0817a.d(b12);
                    }
                    return coroutine_suspended;
                }
                C4378a c4378a2 = (C4378a) lVar2.f47317n;
                ResultKt.throwOnFailure(obj);
                h10 = obj;
                i13 = 2;
                c4378a = c4378a2;
                salesIQResponse = (SalesIQResponse) h10;
                list = (List) salesIQResponse.getData();
                if (list != null && (b10 = hf.e.b(list)) != null) {
                    C2917a V11 = c4378a.V();
                    lVar2.f47317n = c4378a;
                    lVar2.f47318o = salesIQResponse;
                    lVar2.f47321r = i13;
                    obj = C2917a.v(V11, b10, false, lVar2, 2, null);
                }
                salesIQResponse2 = salesIQResponse;
                list2 = (List) salesIQResponse2.getData();
                if (list2 != null) {
                }
                if (list3 == null) {
                }
                if (!salesIQResponse2.getIsSuccess()) {
                }
            }
        }
        lVar = new l(continuation);
        lVar2 = lVar;
        obj = lVar2.f47319p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i12 = lVar2.f47321r;
        if (i12 != 0) {
        }
        salesIQResponse = (SalesIQResponse) h10;
        list = (List) salesIQResponse.getData();
        if (list != null) {
            C2917a V112 = c4378a.V();
            lVar2.f47317n = c4378a;
            lVar2.f47318o = salesIQResponse;
            lVar2.f47321r = i13;
            obj = C2917a.v(V112, b10, false, lVar2, 2, null);
        }
        salesIQResponse2 = salesIQResponse;
        list2 = (List) salesIQResponse2.getData();
        if (list2 != null) {
        }
        if (list3 == null) {
        }
        if (!salesIQResponse2.getIsSuccess()) {
        }
    }

    @Override // kf.InterfaceC5253a
    public Object q(String str, Continuation continuation) {
        return V().x(str, rd.b.f(), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x024b, code lost:
    
        if (cf.C2917a.v(r4, r1, false, r12, 2, null) == r2) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // kf.InterfaceC5253a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(String str, String str2, String str3, int i10, int i11, boolean z10, Continuation continuation) {
        k kVar;
        int i12;
        int i13;
        int i14;
        String str4;
        String str5;
        String str6;
        int i15;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        T t10;
        int i16;
        C4378a c4378a;
        SalesIQResponse salesIQResponse;
        C4378a c4378a2;
        String str7;
        String str8;
        int i17;
        int i18;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        String str9;
        C4378a c4378a3;
        Ref.ObjectRef objectRef5;
        T t11;
        C4378a c4378a4;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        T t12;
        SalesIQResponse salesIQResponse2;
        T t13;
        List list;
        List list2;
        T t14;
        List b10;
        List list3;
        C5582a.C0817a c0817a;
        C4378a c4378a5;
        Object obj;
        List b11;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i19 = kVar.f47316y;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                kVar.f47316y = i19 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj2 = kVar2.f47314w;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i12 = kVar2.f47316y;
                if (i12 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!og.i.e(a0()) || !og.i.e(T())) {
                        return C5582a.f56502b.b(new C5582a.b("Screen name or app Id is null", Boxing.boxInt(-1), null, 4, null));
                    }
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    C4203a W10 = W();
                    String a02 = a0();
                    Intrinsics.checkNotNull(a02);
                    String T10 = T();
                    Intrinsics.checkNotNull(T10);
                    String Y10 = Y(this, null, false, 3, null);
                    Integer boxInt = Boxing.boxInt(i11);
                    Boolean boxBoolean = Boxing.boxBoolean(z10);
                    kVar2.f47305n = this;
                    kVar2.f47306o = str;
                    kVar2.f47307p = str2;
                    kVar2.f47308q = str3;
                    kVar2.f47309r = objectRef8;
                    kVar2.f47310s = objectRef8;
                    kVar2.f47312u = i10;
                    i13 = -1;
                    kVar2.f47313v = i11;
                    kVar2.f47316y = 1;
                    i14 = 2;
                    Object g10 = W10.g(a02, T10, str, str2, str3, i10, boxInt, boxBoolean, Y10, true, kVar2);
                    kVar2 = kVar2;
                    if (g10 != coroutine_suspended) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        i15 = i10;
                        objectRef = objectRef8;
                        objectRef2 = objectRef;
                        t10 = g10;
                        i16 = i11;
                        c4378a = this;
                    }
                    return coroutine_suspended;
                }
                if (i12 == 1) {
                    int i20 = kVar2.f47313v;
                    int i21 = kVar2.f47312u;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) kVar2.f47310s;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) kVar2.f47309r;
                    String str10 = (String) kVar2.f47308q;
                    String str11 = (String) kVar2.f47307p;
                    String str12 = (String) kVar2.f47306o;
                    C4378a c4378a6 = (C4378a) kVar2.f47305n;
                    ResultKt.throwOnFailure(obj2);
                    i15 = i21;
                    objectRef = objectRef9;
                    str6 = str10;
                    str5 = str11;
                    i14 = 2;
                    i13 = -1;
                    i16 = i20;
                    c4378a = c4378a6;
                    objectRef2 = objectRef10;
                    str4 = str12;
                    t10 = obj2;
                } else if (i12 == 2) {
                    i18 = kVar2.f47313v;
                    i17 = kVar2.f47312u;
                    objectRef3 = (Ref.ObjectRef) kVar2.f47311t;
                    objectRef4 = (Ref.ObjectRef) kVar2.f47309r;
                    str9 = (String) kVar2.f47308q;
                    str8 = (String) kVar2.f47307p;
                    str7 = (String) kVar2.f47306o;
                    c4378a2 = (C4378a) kVar2.f47305n;
                    ResultKt.throwOnFailure(obj2);
                    t12 = obj2;
                    objectRef3.element = t12;
                    i16 = i18;
                    c4378a = c4378a2;
                    i15 = i17;
                    str6 = str9;
                    str5 = str8;
                    str4 = str7;
                    objectRef2 = objectRef4;
                    t11 = objectRef2.element;
                    Intrinsics.checkNotNull(t11);
                    if (((SalesIQResponse) t11).getIsSuccess()) {
                        T t15 = objectRef2.element;
                        Intrinsics.checkNotNull(t15);
                        List list4 = (List) ((SalesIQResponse) t15).getData();
                        if (list4 != null && list4.isEmpty()) {
                            T t16 = objectRef2.element;
                            Intrinsics.checkNotNull(t16);
                            SalesIQResponse.Error error = ((SalesIQResponse) t16).getError();
                            T t17 = objectRef2.element;
                            Intrinsics.checkNotNull(t17);
                            kVar2.f47305n = c4378a;
                            kVar2.f47306o = objectRef2;
                            kVar2.f47307p = objectRef2;
                            kVar2.f47308q = null;
                            kVar2.f47309r = null;
                            kVar2.f47310s = null;
                            kVar2.f47311t = null;
                            kVar2.f47316y = 3;
                            Object f02 = c4378a.f0(error, (SalesIQResponse) t17, str4, str5, str6, i15, i16, true, kVar2);
                            if (f02 != coroutine_suspended) {
                                c4378a4 = c4378a;
                                objectRef6 = objectRef2;
                                objectRef7 = objectRef6;
                                t13 = f02;
                                objectRef6.element = t13;
                                objectRef5 = objectRef7;
                                c4378a3 = c4378a4;
                                T t18 = objectRef5.element;
                                Intrinsics.checkNotNull(t18);
                                salesIQResponse2 = (SalesIQResponse) t18;
                                if (salesIQResponse2.getIsSuccess()) {
                                }
                                T t19 = objectRef5.element;
                                Intrinsics.checkNotNull(t19);
                                list = (List) ((SalesIQResponse) t19).getData();
                                if (list == null) {
                                }
                                if (list2 == null) {
                                }
                                t14 = objectRef5.element;
                                Intrinsics.checkNotNull(t14);
                                if (((SalesIQResponse) t14).getIsSuccess()) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    c4378a3 = c4378a;
                    objectRef5 = objectRef2;
                    T t182 = objectRef5.element;
                    Intrinsics.checkNotNull(t182);
                    salesIQResponse2 = (SalesIQResponse) t182;
                    if (salesIQResponse2.getIsSuccess()) {
                    }
                    T t192 = objectRef5.element;
                    Intrinsics.checkNotNull(t192);
                    list = (List) ((SalesIQResponse) t192).getData();
                    if (list == null) {
                    }
                    if (list2 == null) {
                    }
                    t14 = objectRef5.element;
                    Intrinsics.checkNotNull(t14);
                    if (((SalesIQResponse) t14).getIsSuccess()) {
                    }
                } else {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0817a = (C5582a.C0817a) kVar2.f47306o;
                            c4378a5 = (C4378a) kVar2.f47305n;
                            ResultKt.throwOnFailure(obj2);
                            list3 = null;
                            obj = obj2;
                            List list5 = (List) ((C5582a) obj).b();
                            b11 = list5 == null ? hf.f.b(list5, c4378a5.U()) : list3;
                            if (b11 == null) {
                                b11 = CollectionsKt.emptyList();
                            }
                            return c0817a.d(b11);
                        }
                        objectRef5 = (Ref.ObjectRef) kVar2.f47306o;
                        c4378a3 = (C4378a) kVar2.f47305n;
                        ResultKt.throwOnFailure(obj2);
                        T t1922 = objectRef5.element;
                        Intrinsics.checkNotNull(t1922);
                        list = (List) ((SalesIQResponse) t1922).getData();
                        if (list == null) {
                            List list6 = list;
                            list2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                            Iterator it = list6.iterator();
                            while (it.hasNext()) {
                                list2.add(((SalesIQArticleResponse) it.next()).getId());
                            }
                        } else {
                            list2 = null;
                        }
                        if (list2 == null) {
                            list2 = CollectionsKt.emptyList();
                        }
                        t14 = objectRef5.element;
                        Intrinsics.checkNotNull(t14);
                        if (((SalesIQResponse) t14).getIsSuccess()) {
                            T t20 = objectRef5.element;
                            Intrinsics.checkNotNull(t20);
                            SalesIQResponse salesIQResponse3 = (SalesIQResponse) t20;
                            List list7 = (List) salesIQResponse3.getData();
                            List b12 = (list7 == null || (b10 = hf.e.b(list7)) == null) ? null : hf.f.b(b10, c4378a3.U());
                            if (b12 == null) {
                                b12 = CollectionsKt.emptyList();
                            }
                            return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse3, b12, null, 0, false, null, null, null, 126, null));
                        }
                        C5582a.C0817a c0817a2 = C5582a.f56502b;
                        C2917a V10 = c4378a3.V();
                        kVar2.f47305n = c4378a3;
                        kVar2.f47306o = c0817a2;
                        list3 = null;
                        kVar2.f47307p = null;
                        kVar2.f47308q = null;
                        kVar2.f47309r = null;
                        kVar2.f47310s = null;
                        kVar2.f47311t = null;
                        kVar2.f47316y = 5;
                        Object m10 = V10.m(list2, kVar2);
                        if (m10 != coroutine_suspended) {
                            c0817a = c0817a2;
                            c4378a5 = c4378a3;
                            obj = m10;
                            List list52 = (List) ((C5582a) obj).b();
                            if (list52 == null) {
                            }
                            if (b11 == null) {
                            }
                            return c0817a.d(b11);
                        }
                        return coroutine_suspended;
                    }
                    objectRef6 = (Ref.ObjectRef) kVar2.f47307p;
                    objectRef7 = (Ref.ObjectRef) kVar2.f47306o;
                    c4378a4 = (C4378a) kVar2.f47305n;
                    ResultKt.throwOnFailure(obj2);
                    t13 = obj2;
                    objectRef6.element = t13;
                    objectRef5 = objectRef7;
                    c4378a3 = c4378a4;
                    T t1822 = objectRef5.element;
                    Intrinsics.checkNotNull(t1822);
                    salesIQResponse2 = (SalesIQResponse) t1822;
                    if (salesIQResponse2.getIsSuccess()) {
                        List list8 = (List) salesIQResponse2.getData();
                        C2917a V11 = c4378a3.V();
                        List b13 = hf.e.b(list8);
                        kVar2.f47305n = c4378a3;
                        kVar2.f47306o = objectRef5;
                        kVar2.f47307p = salesIQResponse2;
                        kVar2.f47308q = null;
                        kVar2.f47309r = null;
                        kVar2.f47310s = null;
                        kVar2.f47311t = null;
                        kVar2.f47316y = 4;
                    }
                    T t19222 = objectRef5.element;
                    Intrinsics.checkNotNull(t19222);
                    list = (List) ((SalesIQResponse) t19222).getData();
                    if (list == null) {
                    }
                    if (list2 == null) {
                    }
                    t14 = objectRef5.element;
                    Intrinsics.checkNotNull(t14);
                    if (((SalesIQResponse) t14).getIsSuccess()) {
                    }
                }
                objectRef.element = t10;
                if (str6 != null || str6.length() == 0) {
                    salesIQResponse = (SalesIQResponse) objectRef2.element;
                    if (!salesIQResponse.getIsSuccess()) {
                        SalesIQResponse.Error error2 = salesIQResponse.getError();
                        if (error2 == null) {
                            error2 = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(i13), "Error is null")), null, 5, null);
                        }
                        T t21 = objectRef2.element;
                        Intrinsics.checkNotNull(t21);
                        kVar2.f47305n = c4378a;
                        kVar2.f47306o = str4;
                        kVar2.f47307p = str5;
                        kVar2.f47308q = str6;
                        kVar2.f47309r = objectRef2;
                        kVar2.f47310s = salesIQResponse;
                        kVar2.f47311t = objectRef2;
                        kVar2.f47312u = i15;
                        kVar2.f47313v = i16;
                        kVar2.f47316y = i14;
                        Object f03 = c4378a.f0(error2, (SalesIQResponse) t21, str4, str5, str6, i15, i16, true, kVar2);
                        if (f03 != coroutine_suspended) {
                            c4378a2 = c4378a;
                            str7 = str4;
                            str8 = str5;
                            i17 = i15;
                            i18 = i16;
                            objectRef3 = objectRef2;
                            objectRef4 = objectRef3;
                            str9 = str6;
                            t12 = f03;
                            objectRef3.element = t12;
                            i16 = i18;
                            c4378a = c4378a2;
                            i15 = i17;
                            str6 = str9;
                            str5 = str8;
                            str4 = str7;
                            objectRef2 = objectRef4;
                        }
                        return coroutine_suspended;
                    }
                    t11 = objectRef2.element;
                    Intrinsics.checkNotNull(t11);
                    if (((SalesIQResponse) t11).getIsSuccess()) {
                    }
                }
                c4378a3 = c4378a;
                objectRef5 = objectRef2;
                T t18222 = objectRef5.element;
                Intrinsics.checkNotNull(t18222);
                salesIQResponse2 = (SalesIQResponse) t18222;
                if (salesIQResponse2.getIsSuccess()) {
                }
                T t192222 = objectRef5.element;
                Intrinsics.checkNotNull(t192222);
                list = (List) ((SalesIQResponse) t192222).getData();
                if (list == null) {
                }
                if (list2 == null) {
                }
                t14 = objectRef5.element;
                Intrinsics.checkNotNull(t14);
                if (((SalesIQResponse) t14).getIsSuccess()) {
                }
            }
        }
        kVar = new k(continuation);
        k kVar22 = kVar;
        Object obj22 = kVar22.f47314w;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i12 = kVar22.f47316y;
        if (i12 != 0) {
        }
        objectRef.element = t10;
        if (str6 != null) {
        }
        salesIQResponse = (SalesIQResponse) objectRef2.element;
        if (!salesIQResponse.getIsSuccess()) {
        }
        t11 = objectRef2.element;
        Intrinsics.checkNotNull(t11);
        if (((SalesIQResponse) t11).getIsSuccess()) {
        }
        c4378a3 = c4378a;
        objectRef5 = objectRef2;
        T t182222 = objectRef5.element;
        Intrinsics.checkNotNull(t182222);
        salesIQResponse2 = (SalesIQResponse) t182222;
        if (salesIQResponse2.getIsSuccess()) {
        }
        T t1922222 = objectRef5.element;
        Intrinsics.checkNotNull(t1922222);
        list = (List) ((SalesIQResponse) t1922222).getData();
        if (list == null) {
        }
        if (list2 == null) {
        }
        t14 = objectRef5.element;
        Intrinsics.checkNotNull(t14);
        if (((SalesIQResponse) t14).getIsSuccess()) {
        }
    }

    @Override // kf.InterfaceC5253a
    public C5582a s(String str, String str2, boolean z10) {
        C2917a V10 = V();
        boolean z11 = !S().b0();
        List Z10 = Z();
        Object b10 = S().y(Ce.a.a(De.a.KnowledgeBaseRecentlyViewedLimit), 5).b();
        Intrinsics.checkNotNull(b10);
        C5582a p10 = V10.p(str, str2, z10, z11, Z10, ((Number) b10).intValue());
        if (p10.d()) {
            return p10.a(new m((InterfaceC5321f) p10.b(), this));
        }
        Intrinsics.checkNotNull(p10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return p10;
    }

    @Override // kf.InterfaceC5253a
    public C5582a t() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(S().v());
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

    @Override // kf.InterfaceC5253a
    public C5582a u() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(S().c0()));
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

    @Override // kf.InterfaceC5253a
    public C5582a v(String str, String str2, String str3, boolean z10, boolean z11) {
        C5582a n10 = V().n(str, str2, str3, z10, z11, Z());
        if (n10.d()) {
            return n10.a(new j((InterfaceC5321f) n10.b(), this));
        }
        Intrinsics.checkNotNull(n10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return n10;
    }

    @Override // kf.InterfaceC5253a
    public C5582a w() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<SalesIQResource.b> G10 = S().G();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(G10, 10));
            for (SalesIQResource.b bVar : G10) {
                arrayList.add(new ResourceDepartment(bVar.getId(), bVar.a()));
            }
            m147constructorimpl = Result.m147constructorimpl(arrayList);
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

    @Override // kf.InterfaceC5253a
    public Object x(String str, Continuation continuation) {
        return V().z(str, rd.b.f(), continuation);
    }

    @Override // kf.InterfaceC5253a
    public C5582a y() {
        C5582a q10 = V().q(Z());
        if (q10.d()) {
            return q10.a(new n((InterfaceC5321f) q10.b(), this));
        }
        Intrinsics.checkNotNull(q10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return q10;
    }

    @Override // kf.InterfaceC5253a
    public C5582a z(String str, String str2, String str3) {
        C5582a l10 = C2917a.l(V(), str, str2, str3, false, 8, null);
        if (l10.d()) {
            return l10.a(new f((InterfaceC5321f) l10.b()));
        }
        Intrinsics.checkNotNull(l10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
        return l10;
    }

    public C4378a(Application application) {
        this.f47252a = LazyKt.lazy(s.f47357d);
        this.f47253b = LazyKt.lazy(new r(application));
        this.f47254c = LazyKt.lazy(new c(application));
    }
}
