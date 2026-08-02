package com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels;

import Ph.AbstractC1459k;
import Ph.P;
import android.app.Application;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import gf.C4378a;
import jf.EnumC5132a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.x;
import lb.C5444x;
import lf.C5463a;
import me.C5582a;
import mf.C5583a;
import org.jetbrains.annotations.NotNull;
import re.AbstractC6235a;
import td.C6461a;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b%\u0010+R\u001b\u0010/\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0016\u0010.R\u001b\u00103\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u00102R\u001b\u00105\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b4\u00102R!\u0010:\u001a\b\u0012\u0004\u0012\u000207068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b8\u00109R!\u0010?\u001a\b\u0012\u0004\u0012\u0002070;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0017\u001a\u0004\b=\u0010>R$\u0010D\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b\u001c\u0010B\"\u0004\b*\u0010CR!\u0010H\u001a\b\u0012\u0004\u0012\u00020E068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0017\u001a\u0004\bG\u00109R!\u0010K\u001a\b\u0012\u0004\u0012\u00020E0;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0017\u001a\u0004\bJ\u0010>R\u0014\u0010O\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticleViewModel;", "Landroidx/lifecycle/Q;", "<init>", "()V", "", "articleId", "", "shouldUpdateViewActionOnCompletion", "Lkotlin/Function0;", "", "onComplete", C5444x.f55808b, "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "languageCode", "Ljf/a;", "articleAction", "z", "(Ljava/lang/String;Ljava/lang/String;Ljf/a;)V", "j", "(Ljava/lang/String;)V", "A", "Lgf/a;", "s", "Lkotlin/Lazy;", "o", "()Lgf/a;", "articlesRepository", "Llf/g;", "t", "u", "()Llf/g;", "syncArticles", "Llf/a;", "k", "()Llf/a;", "articleActionUseCase", "Llf/d;", "v", "r", "()Llf/d;", "getArticles", "Llf/h;", "w", "()Llf/h;", "updateArticle", "Llf/e;", "()Llf/e;", "knowledgeBaseConfiguration", "y", "q", "()Z", "canShowAuthorProfileInArticle", com.google.android.material.shape.i.f35755A, "allowLikeOrDisLikeArticle", "Lkotlinx/coroutines/flow/x;", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "n", "()Lkotlinx/coroutines/flow/x;", "articlesMutableStateFlow", "Lkotlinx/coroutines/flow/C;", "B", "p", "()Lkotlinx/coroutines/flow/C;", "articlesStateFlow", "C", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "()Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "(Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;)V", "salesIQArticle", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticleViewModel$a;", "D", "l", "articleSyncStateMutableSharedFlow", "E", X9.m.f13664a, "articleSyncStateSharedFlow", "LPh/P;", "getAppScope", "()LPh/P;", "appScope", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ArticleViewModel extends Q {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public SalesIQResource.Data salesIQArticle;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesRepository = LazyKt.lazy(g.f43574d);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Lazy syncArticles = LazyKt.lazy(new n());

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final Lazy articleActionUseCase = LazyKt.lazy(new c());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final Lazy getArticles = LazyKt.lazy(new k());

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Lazy updateArticle = LazyKt.lazy(new p());

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final Lazy knowledgeBaseConfiguration = LazyKt.lazy(new l());

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final Lazy canShowAuthorProfileInArticle = LazyKt.lazy(new i());

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final Lazy allowLikeOrDisLikeArticle = LazyKt.lazy(new b());

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesMutableStateFlow = LazyKt.lazy(f.f43573d);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesStateFlow = LazyKt.lazy(new h());

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final Lazy articleSyncStateMutableSharedFlow = LazyKt.lazy(d.f43571d);

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final Lazy articleSyncStateSharedFlow = LazyKt.lazy(new e());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Synced = new a("Synced", 0);
        public static final a Failed = new a("Failed", 1);
        public static final a Deleted = new a("Deleted", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{Synced, Failed, Deleted};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean bool = (Boolean) ArticleViewModel.this.s().a().b();
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C5463a invoke() {
            return new C5463a(ArticleViewModel.this.o());
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f43571d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return E.b(0, 0, null, 7, null);
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return ArticleViewModel.this.l();
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f43573d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return E.b(0, 0, null, 7, null);
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f43574d = new g();

        public g() {
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

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return ArticleViewModel.this.n();
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean bool = (Boolean) ArticleViewModel.this.s().b().b();
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43577n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43579p;

        public static final class a extends Lambda implements Function2 {

            /* renamed from: d, reason: collision with root package name */
            public static final a f43580d = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SalesIQResource.Data data, SalesIQResource.Data data2) {
                boolean z10;
                if (og.i.e(data2) && data != null && data.getEnabled() == data2.getEnabled() && Intrinsics.areEqual(data.getContent(), data2.getContent())) {
                    SalesIQResource.Data.Stats stats = data.getStats();
                    Integer valueOf = stats != null ? Integer.valueOf(stats.getLiked()) : null;
                    SalesIQResource.Data.Stats stats2 = data2.getStats();
                    if (Intrinsics.areEqual(valueOf, stats2 != null ? Integer.valueOf(stats2.getLiked()) : null)) {
                        SalesIQResource.Data.Stats stats3 = data.getStats();
                        Integer valueOf2 = stats3 != null ? Integer.valueOf(stats3.getDisliked()) : null;
                        SalesIQResource.Data.Stats stats4 = data2.getStats();
                        if (Intrinsics.areEqual(valueOf2, stats4 != null ? Integer.valueOf(stats4.getDisliked()) : null)) {
                            z10 = true;
                            return Boolean.valueOf(z10);
                        }
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
            }
        }

        public static final class b implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArticleViewModel f43581a;

            public b(ArticleViewModel articleViewModel) {
                this.f43581a = articleViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SalesIQResource.Data data, Continuation continuation) {
                if (data != null) {
                    ArticleViewModel articleViewModel = this.f43581a;
                    articleViewModel.w(data);
                    Object emit = articleViewModel.n().emit(data, continuation);
                    if (emit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return emit;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Continuation continuation) {
            super(2, continuation);
            this.f43579p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticleViewModel.this.new j(this.f43579p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC5321f l10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43577n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ArticleViewModel.this.r().i(this.f43579p).b();
                if (interfaceC5321f != null && (l10 = AbstractC5323h.l(interfaceC5321f, a.f43580d)) != null) {
                    b bVar = new b(ArticleViewModel.this);
                    this.f43577n = 1;
                    if (l10.collect(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.d invoke() {
            return new lf.d(ArticleViewModel.this.o());
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.e invoke() {
            return new lf.e(ArticleViewModel.this.o());
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43584n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43585o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43586p;

        /* renamed from: q, reason: collision with root package name */
        public int f43587q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f43589s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f43590t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f43591u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, Function0 function0, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f43589s = str;
            this.f43590t = function0;
            this.f43591u = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticleViewModel.this.new m(this.f43589s, this.f43590t, this.f43591u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((m) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        
            if (r11.emit(r4, r10) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
        
            r4 = r1;
            r1 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
        
            if (r11.emit(r5, r10) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
        
            if (r11.emit(r6, r10) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x005f, code lost:
        
            if (r11 == r0) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C5582a c5582a;
            AbstractC6235a abstractC6235a;
            Function0 function0;
            boolean z10;
            ArticleViewModel articleViewModel;
            String str;
            ArticleViewModel articleViewModel2;
            String str2;
            SalesIQResource.Data data;
            SalesIQResource.Data.Language language;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43587q;
            String str3 = null;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                lf.g u10 = ArticleViewModel.this.u();
                String str4 = this.f43589s;
                this.f43587q = 1;
                obj = u10.c(str4, this);
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        c5582a = (C5582a) this.f43584n;
                        ResultKt.throwOnFailure(obj);
                        ArticleViewModel articleViewModel3 = ArticleViewModel.this;
                        if (!c5582a.d()) {
                            C5582a.b c10 = c5582a.c();
                            Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                            AbstractC6235a a10 = AbstractC6235a.f64111c.a(c10, AbstractC6235a.c.KnowledgeBase);
                            if (a10 instanceof re.x) {
                                x l10 = articleViewModel3.l();
                                a aVar = a.Deleted;
                                this.f43584n = c5582a;
                                this.f43585o = a10;
                                this.f43586p = a10;
                                this.f43587q = 3;
                            } else {
                                x l11 = articleViewModel3.l();
                                a aVar2 = a.Failed;
                                this.f43584n = c5582a;
                                this.f43585o = a10;
                                this.f43586p = a10;
                                this.f43587q = 4;
                            }
                            if (og.i.k(Boxing.boxInt(abstractC6235a.a())) > 0) {
                            }
                            c5582a = r4;
                        }
                        function0 = this.f43590t;
                        z10 = this.f43591u;
                        articleViewModel = ArticleViewModel.this;
                        str = this.f43589s;
                        if (function0 != null) {
                        }
                        if (z10) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i10 != 3 && i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        articleViewModel2 = (ArticleViewModel) this.f43586p;
                        str2 = (String) this.f43585o;
                        ResultKt.throwOnFailure(obj);
                        data = (SalesIQResource.Data) obj;
                        if (data != null) {
                        }
                        articleViewModel = articleViewModel2;
                        str = str2;
                        articleViewModel2 = articleViewModel;
                        str2 = str;
                        articleViewModel2.z(str2, str3, EnumC5132a.Viewed);
                        return Unit.INSTANCE;
                    }
                    abstractC6235a = (AbstractC6235a) this.f43586p;
                    C5582a c5582a2 = (C5582a) this.f43584n;
                    ResultKt.throwOnFailure(obj);
                    if (og.i.k(Boxing.boxInt(abstractC6235a.a())) > 0) {
                        MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                    }
                    c5582a = c5582a2;
                    function0 = this.f43590t;
                    z10 = this.f43591u;
                    articleViewModel = ArticleViewModel.this;
                    str = this.f43589s;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    if (z10) {
                        InterfaceC5321f interfaceC5321f = (InterfaceC5321f) articleViewModel.r().i(str).b();
                        if (interfaceC5321f != null) {
                            this.f43584n = c5582a;
                            this.f43585o = str;
                            this.f43586p = articleViewModel;
                            this.f43587q = 5;
                            obj = AbstractC5323h.t(interfaceC5321f, this);
                            if (obj != coroutine_suspended) {
                                articleViewModel2 = articleViewModel;
                                str2 = str;
                                data = (SalesIQResource.Data) obj;
                                if (data != null || (language = data.getLanguage()) == null) {
                                    articleViewModel = articleViewModel2;
                                    str = str2;
                                } else {
                                    str3 = language.getCode();
                                    articleViewModel2.z(str2, str3, EnumC5132a.Viewed);
                                }
                            }
                            return coroutine_suspended;
                        }
                        articleViewModel2 = articleViewModel;
                        str2 = str;
                        articleViewModel2.z(str2, str3, EnumC5132a.Viewed);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            c5582a = (C5582a) obj;
            ArticleViewModel articleViewModel4 = ArticleViewModel.this;
            if (c5582a.d()) {
                x l12 = articleViewModel4.l();
                a aVar3 = a.Synced;
                this.f43584n = c5582a;
                this.f43587q = 2;
            }
            ArticleViewModel articleViewModel32 = ArticleViewModel.this;
            if (!c5582a.d()) {
            }
            function0 = this.f43590t;
            z10 = this.f43591u;
            articleViewModel = ArticleViewModel.this;
            str = this.f43589s;
            if (function0 != null) {
            }
            if (z10) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.g invoke() {
            return new lf.g(ArticleViewModel.this.o());
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43593n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43595p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f43596q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ EnumC5132a f43597r;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC5132a.values().length];
                try {
                    iArr[EnumC5132a.Viewed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5132a.Liked.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5132a.Disliked.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, EnumC5132a enumC5132a, Continuation continuation) {
            super(2, continuation);
            this.f43595p = str;
            this.f43596q = str2;
            this.f43597r = enumC5132a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticleViewModel.this.new o(this.f43595p, this.f43596q, this.f43597r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43593n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C5463a k10 = ArticleViewModel.this.k();
                String str = this.f43595p;
                String str2 = this.f43596q;
                EnumC5132a enumC5132a = this.f43597r;
                this.f43593n = 1;
                obj = k10.a(str, str2, enumC5132a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            EnumC5132a enumC5132a2 = this.f43597r;
            String str3 = this.f43595p;
            if (c5582a.d()) {
                int i11 = a.$EnumSwitchMapping$0[enumC5132a2.ordinal()];
                if (i11 == 2 || i11 == 3) {
                    C5583a.w(ZohoSalesIQ.k.Articles, enumC5132a2 == EnumC5132a.Liked ? C5583a.EnumC0818a.Liked : C5583a.EnumC0818a.Disliked, str3, null, 8, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.h invoke() {
            return new lf.h(ArticleViewModel.this.o());
        }
    }

    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43599n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43601p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, Continuation continuation) {
            super(2, continuation);
            this.f43601p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticleViewModel.this.new q(this.f43601p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43599n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                lf.h v10 = ArticleViewModel.this.v();
                String str = this.f43601p;
                this.f43599n = 1;
                if (v10.a(str, this) == coroutine_suspended) {
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

    private final P getAppScope() {
        return C6461a.f65810a.e();
    }

    public static /* synthetic */ void y(ArticleViewModel articleViewModel, String str, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        articleViewModel.x(str, z10, function0);
    }

    public final void A(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        AbstractC1459k.d(getAppScope(), null, null, new q(articleId, null), 3, null);
    }

    public final boolean i() {
        return ((Boolean) this.allowLikeOrDisLikeArticle.getValue()).booleanValue();
    }

    public final void j(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        AbstractC1459k.d(S.a(this), null, null, new j(articleId, null), 3, null);
    }

    public final C5463a k() {
        return (C5463a) this.articleActionUseCase.getValue();
    }

    public final x l() {
        return (x) this.articleSyncStateMutableSharedFlow.getValue();
    }

    public final C m() {
        return (C) this.articleSyncStateSharedFlow.getValue();
    }

    public final x n() {
        return (x) this.articlesMutableStateFlow.getValue();
    }

    public final C4378a o() {
        return (C4378a) this.articlesRepository.getValue();
    }

    public final C p() {
        return (C) this.articlesStateFlow.getValue();
    }

    public final boolean q() {
        return ((Boolean) this.canShowAuthorProfileInArticle.getValue()).booleanValue();
    }

    public final lf.d r() {
        return (lf.d) this.getArticles.getValue();
    }

    public final lf.e s() {
        return (lf.e) this.knowledgeBaseConfiguration.getValue();
    }

    /* renamed from: t, reason: from getter */
    public final SalesIQResource.Data getSalesIQArticle() {
        return this.salesIQArticle;
    }

    public final lf.g u() {
        return (lf.g) this.syncArticles.getValue();
    }

    public final lf.h v() {
        return (lf.h) this.updateArticle.getValue();
    }

    public final void w(SalesIQResource.Data data) {
        this.salesIQArticle = data;
    }

    public final void x(String articleId, boolean shouldUpdateViewActionOnCompletion, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        AbstractC1459k.d(getAppScope(), null, null, new m(articleId, onComplete, shouldUpdateViewActionOnCompletion, null), 3, null);
    }

    public final void z(String articleId, String languageCode, EnumC5132a articleAction) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(articleAction, "articleAction");
        AbstractC1459k.d(getAppScope(), null, null, new o(articleId, languageCode, articleAction, null), 3, null);
    }
}
