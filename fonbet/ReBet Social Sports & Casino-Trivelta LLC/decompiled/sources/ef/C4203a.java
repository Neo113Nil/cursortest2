package ef;

import android.app.Application;
import bf.C2420a;
import com.google.gson.k;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.ArticleCategoryResponse;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import ff.InterfaceC4281a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import jf.EnumC5132a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import og.i;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import ze.C6959a;

/* renamed from: ef.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4203a {

    /* renamed from: f, reason: collision with root package name */
    public static C4203a f45976f;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f45978a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f45979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45980c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaType f45981d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0666a f45975e = new C0666a(null);

    /* renamed from: g, reason: collision with root package name */
    public static Object f45977g = new Object();

    /* renamed from: ef.a$a, reason: collision with other inner class name */
    public static final class C0666a {
        public /* synthetic */ C0666a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4203a a() {
            C4203a c4203a;
            synchronized (C4203a.f45977g) {
                c4203a = C4203a.f45976f;
                if (c4203a == null) {
                    c4203a = new C4203a(null);
                    C4203a.f45976f = c4203a;
                }
            }
            return c4203a;
        }

        public C0666a() {
        }
    }

    /* renamed from: ef.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f45982d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return e10;
        }
    }

    /* renamed from: ef.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f45983d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4281a invoke() {
            return C2420a.f25020a.a();
        }
    }

    /* renamed from: ef.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f45984n;

        /* renamed from: o, reason: collision with root package name */
        public Object f45985o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f45986p;

        /* renamed from: r, reason: collision with root package name */
        public int f45988r;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45986p = obj;
            this.f45988r |= Integer.MIN_VALUE;
            return C4203a.this.e(null, null, null, null, this);
        }
    }

    /* renamed from: ef.a$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f45989n;

        /* renamed from: o, reason: collision with root package name */
        public Object f45990o;

        /* renamed from: p, reason: collision with root package name */
        public Object f45991p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f45992q;

        /* renamed from: s, reason: collision with root package name */
        public int f45994s;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45992q = obj;
            this.f45994s |= Integer.MIN_VALUE;
            return C4203a.this.f(null, null, null, null, null, this);
        }
    }

    /* renamed from: ef.a$f */
    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f45995n;

        /* renamed from: o, reason: collision with root package name */
        public Object f45996o;

        /* renamed from: p, reason: collision with root package name */
        public int f45997p;

        /* renamed from: q, reason: collision with root package name */
        public int f45998q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f45999r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f46000s;

        /* renamed from: u, reason: collision with root package name */
        public int f46002u;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46000s = obj;
            this.f46002u |= Integer.MIN_VALUE;
            return C4203a.this.g(null, null, null, null, null, 0, null, null, null, false, this);
        }
    }

    /* renamed from: ef.a$g */
    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f46003n;

        /* renamed from: p, reason: collision with root package name */
        public int f46005p;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46003n = obj;
            this.f46005p |= Integer.MIN_VALUE;
            return C4203a.this.o(null, null, null, null, this);
        }
    }

    public /* synthetic */ C4203a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Object h(C4203a c4203a, String str, String str2, String str3, String str4, String str5, int i10, Integer num, Boolean bool, String str6, boolean z10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            str5 = null;
        }
        if ((i11 & 32) != 0) {
            i10 = 1;
        }
        if ((i11 & 64) != 0) {
            num = null;
        }
        if ((i11 & 128) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i11 & 256) != 0) {
            str6 = c4203a.j().H();
        }
        if ((i11 & 512) != 0) {
            z10 = false;
        }
        return c4203a.g(str, str2, str3, str4, str5, i10, num, bool, str6, z10, continuation);
    }

    public static /* synthetic */ String m(C4203a c4203a, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        return c4203a.l(str, str2, str3, bool);
    }

    public final Application d() {
        return (Application) this.f45978a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x007e, B:15:0x0087, B:17:0x0126, B:32:0x00ea, B:34:0x00fa, B:36:0x0104, B:39:0x0112, B:40:0x0123, B:41:0x013b, B:43:0x0141, B:45:0x014b, B:49:0x015a, B:50:0x016a, B:24:0x0090, B:26:0x0098, B:29:0x00d4), top: B:11:0x0035, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x007e, B:15:0x0087, B:17:0x0126, B:32:0x00ea, B:34:0x00fa, B:36:0x0104, B:39:0x0112, B:40:0x0123, B:41:0x013b, B:43:0x0141, B:45:0x014b, B:49:0x015a, B:50:0x016a, B:24:0x0090, B:26:0x0098, B:29:0x00d4), top: B:11:0x0035, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, String str4, Continuation continuation) {
        d dVar;
        int i10;
        String str5;
        C4203a c4203a;
        Object m147constructorimpl;
        SalesIQResponse b10;
        Response response;
        SalesIQResponse a10;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f45988r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f45988r = i11 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f45986p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar2.f45988r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Boolean bool = (Boolean) k().i().get(str3);
                    if (bool == null) {
                        bool = Boxing.boxBoolean(false);
                    }
                    if (bool.booleanValue()) {
                        return SalesIQResponse.INSTANCE.b(new Throwable("Article categories has been synced already"));
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        InterfaceC4281a i12 = i();
                        dVar2.f45984n = this;
                        dVar2.f45985o = str3;
                        dVar2.f45988r = 1;
                        obj = i12.c(str, str3, str4, str2, dVar2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str5 = str3;
                        c4203a = this;
                    } catch (Throwable th2) {
                        th = th2;
                        str5 = str3;
                        c4203a = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        if (b10.getIsSuccess()) {
                        }
                        return b10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) dVar2.f45985o;
                    c4203a = (C4203a) dVar2.f45984n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        Throwable m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl2 != null) {
                        }
                        if (b10.getIsSuccess()) {
                        }
                        return b10;
                    }
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody != null) {
                        SalesIQResponse.Error a11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                        if (a11 != null && (a10 = SalesIQResponse.INSTANCE.a(a11, response.code())) != null) {
                            b10 = a10;
                        }
                        b10 = SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                    } else {
                        m147constructorimpl = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl22 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        b10 = m150exceptionOrNullimpl22 != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl22) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                } else {
                    SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) response.body();
                    if (salesIQRestResponse != null) {
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            b10 = salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                        } catch (Throwable th4) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th4));
                            if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                                SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                                if (a12 == null || (b10 = SalesIQResponse.INSTANCE.a(a12, response.code())) == null) {
                                    b10 = SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString()));
                                }
                            } else {
                                Result.m146boximpl(m147constructorimpl2);
                            }
                        }
                    }
                    b10 = SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                }
                if (b10.getIsSuccess()) {
                    C6959a k10 = c4203a.k();
                    LinkedHashMap i13 = c4203a.k().i();
                    i13.put(str5, Boxing.boxBoolean(true));
                    k10.E(i13);
                }
                return b10;
            }
        }
        dVar = new d(continuation);
        d dVar22 = dVar;
        Object obj2 = dVar22.f45986p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar22.f45988r;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
        if (b10.getIsSuccess()) {
        }
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:12:0x0038, B:13:0x0095, B:15:0x009e, B:17:0x013f, B:68:0x0103, B:70:0x0113, B:72:0x011d, B:75:0x012b, B:76:0x013c, B:77:0x0157, B:79:0x015d, B:81:0x0167, B:85:0x0176, B:86:0x0186, B:60:0x00a7, B:62:0x00af, B:65:0x00ea), top: B:11:0x0038, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:12:0x0038, B:13:0x0095, B:15:0x009e, B:17:0x013f, B:68:0x0103, B:70:0x0113, B:72:0x011d, B:75:0x012b, B:76:0x013c, B:77:0x0157, B:79:0x015d, B:81:0x0167, B:85:0x0176, B:86:0x0186, B:60:0x00a7, B:62:0x00af, B:65:0x00ea), top: B:11:0x0038, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        e eVar;
        int i10;
        String str6;
        C4203a c4203a;
        String str7;
        Object m147constructorimpl;
        SalesIQResponse b10;
        Response response;
        SalesIQResponse a10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f45994s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f45994s = i11 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.f45992q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar2.f45994s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String m10 = m(this, str4, str5, null, null, 12, null);
                    Boolean bool = (Boolean) k().h().get(m10);
                    if (bool == null) {
                        bool = Boxing.boxBoolean(false);
                    }
                    if (bool.booleanValue()) {
                        return SalesIQResponse.INSTANCE.a(new SalesIQResponse.Error(Boxing.boxInt(600), null, new Throwable("Article categories has been synced already")), 600);
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        InterfaceC4281a i12 = i();
                        eVar2.f45989n = this;
                        eVar2.f45990o = str3;
                        eVar2.f45991p = m10;
                        eVar2.f45994s = 1;
                        obj = i12.e(str, str2, str3, str4, str5, eVar2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str6 = str3;
                        c4203a = this;
                        str7 = m10;
                    } catch (Throwable th2) {
                        th = th2;
                        str6 = str3;
                        c4203a = this;
                        str7 = m10;
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        if (b10.getIsSuccess()) {
                        }
                        return b10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str7 = (String) eVar2.f45991p;
                    str6 = (String) eVar2.f45990o;
                    c4203a = (C4203a) eVar2.f45989n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        Throwable m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl2 != null) {
                        }
                        if (b10.getIsSuccess()) {
                        }
                        return b10;
                    }
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody != null) {
                        SalesIQResponse.Error a11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                        if (a11 != null && (a10 = SalesIQResponse.INSTANCE.a(a11, response.code())) != null) {
                            b10 = a10;
                        }
                        b10 = SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                    } else {
                        m147constructorimpl = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl22 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        b10 = m150exceptionOrNullimpl22 != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl22) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                } else {
                    SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) response.body();
                    if (salesIQRestResponse != null) {
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            b10 = salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                        } catch (Throwable th4) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th4));
                            if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                                SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                                if (a12 == null || (b10 = SalesIQResponse.INSTANCE.a(a12, response.code())) == null) {
                                    b10 = SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString()));
                                }
                            } else {
                                Result.m146boximpl(m147constructorimpl2);
                            }
                        }
                    }
                    b10 = SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                }
                if (b10.getIsSuccess()) {
                    List list = (List) b10.getData();
                    if (!list.isEmpty()) {
                        if (c4203a.j().q()) {
                            if (!Intrinsics.areEqual(c4203a.j().v(), str6)) {
                                List<ArticleCategoryResponse> list2 = list;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    for (ArticleCategoryResponse articleCategoryResponse : list2) {
                                        if (articleCategoryResponse.getArticlesCount() <= 0 && articleCategoryResponse.getChildrenCount() <= 0) {
                                        }
                                    }
                                }
                            }
                            C6959a k10 = c4203a.k();
                            LinkedHashMap h10 = c4203a.k().h();
                            c4203a.n(h10, str7, Boxing.boxBoolean(true));
                            k10.D(h10);
                            break;
                        }
                        List<ArticleCategoryResponse> list3 = list;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            for (ArticleCategoryResponse articleCategoryResponse2 : list3) {
                                if (articleCategoryResponse2.getArticlesCount() <= 0 && articleCategoryResponse2.getChildrenCount() <= 0) {
                                }
                                C6959a k102 = c4203a.k();
                                LinkedHashMap h102 = c4203a.k().h();
                                c4203a.n(h102, str7, Boxing.boxBoolean(true));
                                k102.D(h102);
                            }
                        }
                    }
                }
                return b10;
            }
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.f45992q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar22.f45994s;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
        if (b10.getIsSuccess()) {
        }
        return b10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|8|(2:130|(1:(4:133|134|135|38)(2:136|137))(4:138|139|140|111))(6:10|(1:12)|13|(3:15|(1:17)(1:128)|(2:19|(4:24|25|(10:99|100|(2:117|118)|102|(1:104)(1:116)|105|106|107|108|(2:110|111))(9:27|28|29|30|31|32|33|34|(2:37|38))|36)(2:21|22)))|129|(0)(0))|39|40|41|(3:43|(4:56|57|(1:59)(1:62)|60)|45)(2:74|(3:76|(1:81)|82)(3:83|84|(1:86)(1:87)))|46|(2:48|(2:50|(1:54)))|55))|144|6|7|8|(0)(0)|39|40|41|(0)(0)|46|(0)|55|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00bd, code lost:
    
        if (r6.length() == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x010d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0218, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0219, code lost:
    
        r2 = r5;
        r5 = r6;
        r6 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e A[Catch: all -> 0x0218, TRY_LEAVE, TryCatch #4 {all -> 0x0218, blocks: (B:41:0x0168, B:43:0x016e, B:45:0x0232, B:65:0x01f0, B:67:0x0200, B:69:0x020a, B:72:0x021e, B:73:0x022f, B:74:0x0258, B:76:0x025e, B:78:0x0268, B:82:0x0277, B:83:0x0287, B:57:0x0177, B:59:0x017f, B:62:0x01c9), top: B:40:0x0168, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258 A[Catch: all -> 0x0218, TryCatch #4 {all -> 0x0218, blocks: (B:41:0x0168, B:43:0x016e, B:45:0x0232, B:65:0x01f0, B:67:0x0200, B:69:0x020a, B:72:0x021e, B:73:0x022f, B:74:0x0258, B:76:0x025e, B:78:0x0268, B:82:0x0277, B:83:0x0287, B:57:0x0177, B:59:0x017f, B:62:0x01c9), top: B:40:0x0168, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bf  */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [retrofit2.Response] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ef.a] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, String str3, String str4, String str5, int i10, Integer num, Boolean bool, String str6, boolean z10, Continuation continuation) {
        f fVar;
        int i11;
        boolean z11;
        Object m147constructorimpl;
        ?? r72;
        SalesIQResponse b10;
        int i12;
        String str7;
        C4203a c4203a;
        Object obj;
        boolean z12;
        Response response;
        SalesIQResponse a10;
        boolean z13;
        boolean z14;
        int i13;
        String str8;
        Object obj2;
        ?? r62 = str4;
        ?? r22 = z10;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i14 = fVar.f46002u;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f46002u = i14 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj3 = fVar2.f46000s;
                ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = fVar2.f46002u;
                ?? r52 = 2;
                r52 = 2;
                if (i11 == 0) {
                    try {
                        if (i11 == 1) {
                            i12 = fVar2.f45998q;
                            boolean z15 = fVar2.f45999r;
                            i11 = fVar2.f45997p;
                            str7 = (String) fVar2.f45996o;
                            c4203a = (C4203a) fVar2.f45995n;
                            ResultKt.throwOnFailure(obj3);
                            obj = null;
                            z11 = true;
                            z12 = z15;
                            response = (Response) obj3;
                            coroutine_suspended = z12;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i12 = fVar2.f45998q;
                            boolean z16 = fVar2.f45999r;
                            i11 = fVar2.f45997p;
                            str7 = (String) fVar2.f45996o;
                            c4203a = (C4203a) fVar2.f45995n;
                            ResultKt.throwOnFailure(obj3);
                            obj = null;
                            z11 = true;
                            z13 = z16;
                            response = (Response) obj3;
                            coroutine_suspended = z13;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = true;
                        Result.Companion companion = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        r72 = r62;
                        r62 = r52;
                        r52 = r22;
                        coroutine_suspended = coroutine_suspended;
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        if (b10.getIsSuccess()) {
                        }
                        return b10;
                    }
                } else {
                    ResultKt.throwOnFailure(obj3);
                    int coerceAtMost = num != null ? RangesKt.coerceAtMost(num.intValue(), 99) : 99;
                    String l10 = l(str3, r62, str5, bool);
                    boolean z17 = false;
                    if (r22 == 0) {
                        Boolean bool2 = (Boolean) k().j().get(l10);
                        if (bool2 == null ? false : bool2.booleanValue()) {
                            z14 = true;
                            if (!z14) {
                                return SalesIQResponse.INSTANCE.a(new SalesIQResponse.Error(Boxing.boxInt(600), null, new Throwable("Articles has been synced already")), 600);
                            }
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                if (i.g(str5)) {
                                    try {
                                        InterfaceC4281a i15 = i();
                                        if (r62 != null) {
                                            try {
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r62 = this;
                                                coroutine_suspended = r22;
                                                r22 = coerceAtMost;
                                                i11 = i10;
                                                z11 = true;
                                                r52 = l10;
                                                Result.Companion companion3 = Result.INSTANCE;
                                                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                r72 = r62;
                                                r62 = r52;
                                                r52 = r22;
                                                coroutine_suspended = coroutine_suspended;
                                                Throwable m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                if (m150exceptionOrNullimpl2 != null) {
                                                }
                                                if (b10.getIsSuccess()) {
                                                }
                                                return b10;
                                            }
                                        }
                                        z17 = true;
                                        Boolean bool3 = z17 ? null : bool;
                                        fVar2.f45995n = this;
                                        fVar2.f45996o = l10;
                                        fVar2.f45997p = i10;
                                        fVar2.f45999r = r22;
                                        fVar2.f45998q = coerceAtMost;
                                        fVar2.f46002u = 1;
                                        obj2 = coroutine_suspended;
                                        obj = null;
                                        str8 = l10;
                                        i13 = coerceAtMost;
                                        z11 = true;
                                        try {
                                            Object a11 = InterfaceC4281a.a(i15, str, str2, str3, r62, i10, i13, null, str6, bool3, null, fVar2, 576, null);
                                            if (a11 != obj2) {
                                                z12 = z10;
                                                c4203a = this;
                                                obj3 = a11;
                                                i11 = i10;
                                                i12 = i13;
                                                str7 = str8;
                                                response = (Response) obj3;
                                                coroutine_suspended = z12;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            coroutine_suspended = z10;
                                            r62 = this;
                                            i11 = i10;
                                            r22 = i13;
                                            r52 = str8;
                                            Result.Companion companion32 = Result.INSTANCE;
                                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                            r72 = r62;
                                            r62 = r52;
                                            r52 = r22;
                                            coroutine_suspended = coroutine_suspended;
                                            Throwable m150exceptionOrNullimpl22 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                            if (m150exceptionOrNullimpl22 != null) {
                                            }
                                            if (b10.getIsSuccess()) {
                                            }
                                            return b10;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i13 = coerceAtMost;
                                        z11 = true;
                                        str8 = l10;
                                    }
                                } else {
                                    obj = null;
                                    z11 = true;
                                    str8 = l10;
                                    i13 = coerceAtMost;
                                    try {
                                        InterfaceC4281a i16 = i();
                                        Boolean boxBoolean = Boxing.boxBoolean(true);
                                        fVar2.f45995n = this;
                                        r52 = str8;
                                        try {
                                            fVar2.f45996o = r52;
                                            fVar2.f45997p = i10;
                                            fVar2.f45999r = z10;
                                            fVar2.f45998q = i13;
                                            fVar2.f46002u = 2;
                                            obj2 = coroutine_suspended;
                                            str8 = r52;
                                            Object a12 = InterfaceC4281a.a(i16, str, str2, str3, str4, i10, i13, str5, str6, boxBoolean, null, fVar2, 512, null);
                                            if (a12 != obj2) {
                                                i11 = i10;
                                                z13 = z10;
                                                c4203a = this;
                                                obj3 = a12;
                                                i12 = i13;
                                                str7 = str8;
                                                response = (Response) obj3;
                                                coroutine_suspended = z13;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            i11 = i10;
                                            coroutine_suspended = z10;
                                            r62 = this;
                                            r22 = i13;
                                            Result.Companion companion322 = Result.INSTANCE;
                                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                            r72 = r62;
                                            r62 = r52;
                                            r52 = r22;
                                            coroutine_suspended = coroutine_suspended;
                                            Throwable m150exceptionOrNullimpl222 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                            if (m150exceptionOrNullimpl222 != null) {
                                            }
                                            if (b10.getIsSuccess()) {
                                            }
                                            return b10;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        i11 = i10;
                                        coroutine_suspended = z10;
                                        r62 = this;
                                        r22 = i13;
                                        r52 = str8;
                                        Result.Companion companion3222 = Result.INSTANCE;
                                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                        r72 = r62;
                                        r62 = r52;
                                        r52 = r22;
                                        coroutine_suspended = coroutine_suspended;
                                        Throwable m150exceptionOrNullimpl2222 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                        if (m150exceptionOrNullimpl2222 != null) {
                                        }
                                        if (b10.getIsSuccess()) {
                                        }
                                        return b10;
                                    }
                                }
                                return obj2;
                            } catch (Throwable th8) {
                                th = th8;
                                i13 = coerceAtMost;
                                z11 = true;
                                str8 = l10;
                            }
                        }
                    }
                    z14 = false;
                    if (!z14) {
                    }
                }
                r72 = c4203a;
                r62 = str7;
                r52 = i12;
                r22 = response;
                if (r22.isSuccessful()) {
                    ResponseBody errorBody = r22.errorBody();
                    if (errorBody != null) {
                        SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(r22, Yd.a.j());
                        if (a13 != null && (a10 = SalesIQResponse.INSTANCE.a(a13, r22.code())) != null) {
                            b10 = a10;
                        }
                        b10 = SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                    } else {
                        m147constructorimpl = Result.m147constructorimpl(obj);
                        coroutine_suspended = coroutine_suspended;
                        r52 = r52;
                        r62 = r62;
                        r72 = r72;
                        Throwable m150exceptionOrNullimpl22222 = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        b10 = m150exceptionOrNullimpl22222 != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl22222) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                } else {
                    SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) r22.body();
                    if (salesIQRestResponse != null) {
                        try {
                            Result.Companion companion4 = Result.INSTANCE;
                            b10 = salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), r22.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(r22.raw().headers()), Boxing.boxLong(r22.raw().receivedResponseAtMillis() - r22.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, r22.code(), false, null, null, null, 60, null);
                        } catch (Throwable th9) {
                            Result.Companion companion5 = Result.INSTANCE;
                            Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th9));
                            if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                                SalesIQResponse.Error a14 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(r22, Yd.a.j());
                                if (a14 == null || (b10 = SalesIQResponse.INSTANCE.a(a14, r22.code())) == null) {
                                    b10 = SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString()));
                                }
                            } else {
                                Result.m146boximpl(m147constructorimpl2);
                            }
                        }
                    }
                    b10 = SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, r22.code(), false, null, null, null, 60, null);
                }
                if (b10.getIsSuccess()) {
                    List list = (List) b10.getData();
                    if (coroutine_suspended == 0) {
                        C6959a k10 = r72.k();
                        HashMap v10 = r72.k().v();
                        v10.put(r62, Boxing.boxInt(i11 + 1));
                        k10.P(v10);
                        if (!list.isEmpty() && list.size() <= r52) {
                            C6959a k11 = r72.k();
                            LinkedHashMap j10 = r72.k().j();
                            r72.n(j10, r62, Boxing.boxBoolean(z11));
                            k11.F(j10);
                        }
                    }
                }
                return b10;
            }
        }
        fVar = new f(continuation);
        f fVar22 = fVar;
        Object obj32 = fVar22.f46000s;
        ?? coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = fVar22.f46002u;
        ?? r522 = 2;
        r522 = 2;
        if (i11 == 0) {
        }
        r72 = c4203a;
        r62 = str7;
        r522 = i12;
        r22 = response;
        if (r22.isSuccessful()) {
        }
        if (b10.getIsSuccess()) {
        }
        return b10;
    }

    public final InterfaceC4281a i() {
        return (InterfaceC4281a) this.f45979b.getValue();
    }

    public final Ae.a j() {
        return Ae.a.f447b.b(d());
    }

    public final C6959a k() {
        return C6959a.f68673u.b();
    }

    public final String l(String str, String str2, String str3, Boolean bool) {
        List listOf = CollectionsKt.listOf(str, str2, str3, bool);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (obj != null && (!(obj instanceof String) || ((CharSequence) obj).length() > 0)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, "_", null, null, 0, null, null, 62, null);
    }

    public final void n(LinkedHashMap linkedHashMap, Object obj, Object obj2) {
        if (linkedHashMap.size() > this.f45980c) {
            linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
        }
        linkedHashMap.put(obj, obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x006d, B:13:0x0075, B:15:0x010e, B:27:0x00d3, B:29:0x00e3, B:31:0x00ed, B:35:0x00fb, B:37:0x010b, B:38:0x0121, B:40:0x0127, B:42:0x0131, B:46:0x013f, B:48:0x014f, B:58:0x0038, B:19:0x007d, B:21:0x0085, B:23:0x00c0), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x006d, B:13:0x0075, B:15:0x010e, B:27:0x00d3, B:29:0x00e3, B:31:0x00ed, B:35:0x00fb, B:37:0x010b, B:38:0x0121, B:40:0x0127, B:42:0x0131, B:46:0x013f, B:48:0x014f, B:58:0x0038, B:19:0x007d, B:21:0x0085, B:23:0x00c0), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, String str2, EnumC5132a enumC5132a, String str3, Continuation continuation) {
        g gVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f46005p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f46005p = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f46003n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f46005p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4281a i12 = i();
                    RequestBody.Companion companion2 = RequestBody.INSTANCE;
                    k kVar = new k();
                    kVar.p("action", enumC5132a.getValue());
                    kVar.p("language_code", str3);
                    Unit unit = Unit.INSTANCE;
                    String hVar = kVar.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    RequestBody create = companion2.create(hVar, this.f45981d);
                    gVar.f46005p = 1;
                    obj = i12.d(str, str2, create, gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        Object m147constructorimpl = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        return m150exceptionOrNullimpl != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                    SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a12 != null && (a10 = SalesIQResponse.INSTANCE.a(a12, response.code())) != null) {
                        return a10;
                    }
                    return SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                }
                SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) response.body();
                if (salesIQRestResponse != null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        return salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                            SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a13 == null || (a11 = SalesIQResponse.INSTANCE.a(a13, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl2);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f46003n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f46005p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public C4203a() {
        this.f45978a = LazyKt.lazy(b.f45982d);
        this.f45979b = LazyKt.lazy(c.f45983d);
        this.f45980c = 15;
        this.f45981d = MediaType.INSTANCE.parse("application/json; charset=utf-8");
    }
}
