package Rd;

import android.app.Application;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.Gson;
import com.google.gson.k;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.calls.data.model.CheckStatusResponse;
import com.zoho.livechat.android.modules.calls.data.model.MediaResponse;
import com.zoho.livechat.android.modules.calls.domain.entities.CallStatus;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.modules.conversations.data.local.entities.SalesIQConversationAttributes;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.MobilistenUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import me.C5582a;
import og.AbstractC5896h;
import xe.C6822a;
import ze.C6959a;

/* loaded from: classes4.dex */
public final class a implements Td.a {

    /* renamed from: e, reason: collision with root package name */
    public static a f10183e;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f10185a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10186b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f10187c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0197a f10182d = new C0197a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Object f10184f = new Object();

    /* renamed from: Rd.a$a, reason: collision with other inner class name */
    public static final class C0197a {
        public /* synthetic */ C0197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar;
            synchronized (a.f10184f) {
                aVar = a.f10183e;
                if (aVar == null) {
                    aVar = new a(null);
                    a.f10183e = aVar;
                }
            }
            return aVar;
        }

        public C0197a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f10188d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Pd.b invoke() {
            return Pd.b.f8964b.a();
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f10189n;

        /* renamed from: p, reason: collision with root package name */
        public int f10191p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10189n = obj;
            this.f10191p |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(a.this.j());
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f10193d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConversationsLocalDataSource invoke() {
            return ConversationsLocalDataSource.INSTANCE.getInstance$mobilisten_release();
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10194n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10195o;

        /* renamed from: p, reason: collision with root package name */
        public Object f10196p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10197q;

        /* renamed from: s, reason: collision with root package name */
        public int f10199s;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10197q = obj;
            this.f10199s |= Integer.MIN_VALUE;
            return a.this.c(null, null, null, this);
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10200n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10201o;

        /* renamed from: p, reason: collision with root package name */
        public Object f10202p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10203q;

        /* renamed from: s, reason: collision with root package name */
        public int f10205s;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10203q = obj;
            this.f10205s |= Integer.MIN_VALUE;
            return a.this.a(null, null, null, this);
        }
    }

    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f10206n;

        /* renamed from: p, reason: collision with root package name */
        public int f10208p;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10206n = obj;
            this.f10208p |= Integer.MIN_VALUE;
            return a.this.e(null, null, null, this);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // Td.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, String str2, Dg.a aVar, Continuation continuation) {
        g gVar;
        int i10;
        a aVar2;
        String str3;
        Dg.a aVar3;
        SalesIQResponse salesIQResponse;
        Object updateConversation;
        SalesIQResponse salesIQResponse2;
        SalesIQChat.Media media;
        com.google.gson.h B10;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f10205s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f10205s = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f10203q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f10205s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Pd.b k10 = k();
                    String p10 = p();
                    String b10 = aVar.b();
                    gVar.f10200n = this;
                    gVar.f10201o = str;
                    gVar.f10202p = aVar;
                    gVar.f10205s = 1;
                    obj = k10.g(p10, str2, b10, gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar2 = this;
                    str3 = str;
                    aVar3 = aVar;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        salesIQResponse2 = (SalesIQResponse) gVar.f10200n;
                        ResultKt.throwOnFailure(obj);
                        salesIQResponse = salesIQResponse2;
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
                    }
                    aVar3 = (Dg.a) gVar.f10202p;
                    str3 = (String) gVar.f10201o;
                    aVar2 = (a) gVar.f10200n;
                    ResultKt.throwOnFailure(obj);
                }
                salesIQResponse = (SalesIQResponse) obj;
                if (salesIQResponse.getIsSuccess()) {
                    if (str3 == null) {
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
                    }
                    SalesIQChat chatFromConversationId = aVar2.n().getChatFromConversationId(str3);
                    k d10 = (chatFromConversationId == null || (media = chatFromConversationId.getMedia()) == null || (B10 = aVar2.o().B(media)) == null) ? null : AbstractC5896h.d(B10);
                    if (d10 == null || aVar2.q(d10) || aVar3 == Dg.a.f2753g) {
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
                    }
                    if (aVar3 == Dg.a.f2748b) {
                        d10.p("initiated_by", "visitor");
                    }
                    d10.p("status", aVar3.b());
                    String chid = chatFromConversationId.getChid();
                    if (chid != null) {
                        ConversationsLocalDataSource n10 = aVar2.n();
                        String hVar = d10.toString();
                        gVar.f10200n = salesIQResponse;
                        gVar.f10201o = null;
                        gVar.f10202p = null;
                        gVar.f10205s = 2;
                        updateConversation = n10.updateConversation(chid, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : hVar, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, gVar);
                        if (updateConversation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        salesIQResponse2 = salesIQResponse;
                        obj = updateConversation;
                        salesIQResponse = salesIQResponse2;
                    }
                }
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f10203q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f10205s;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        if (salesIQResponse.getIsSuccess()) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
    }

    @Override // Td.a
    public C5582a b(boolean z10) {
        List<Channel.Department> departments;
        Channel.Department department;
        Object obj;
        Channel m10 = C6822a.m();
        List<Channel.Department> callDepartments = m10 != null ? m10.getCallDepartments() : null;
        C5582a.C0817a c0817a = C5582a.f56502b;
        SalesIQConversationAttributes p10 = l().p();
        if (p10 != null && (departments = p10.getDepartments()) != null) {
            if (z10 || departments.isEmpty()) {
                departments = null;
            }
            if (departments != null) {
                ArrayList arrayList = new ArrayList();
                for (Channel.Department department2 : departments) {
                    if (callDepartments != null) {
                        Iterator<T> it = callDepartments.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.areEqual(((Channel.Department) obj).getId(), department2.getId())) {
                                break;
                            }
                        }
                        department = (Channel.Department) obj;
                    } else {
                        department = null;
                    }
                    if (department != null) {
                        arrayList.add(department);
                    }
                }
                callDepartments = arrayList;
                return c0817a.d(callDepartments);
            }
        }
        if (callDepartments == null) {
            callDepartments = CollectionsKt.emptyList();
        }
        return c0817a.d(callDepartments);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // Td.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(String str, String str2, Bg.a aVar, Continuation continuation) {
        f fVar;
        int i10;
        a aVar2;
        SalesIQResponse salesIQResponse;
        SalesIQResponse salesIQResponse2;
        SalesIQResponse salesIQResponse3;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f10199s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f10199s = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f10197q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f10199s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Pd.b k10 = k();
                    String p10 = p();
                    fVar.f10194n = this;
                    fVar.f10195o = str2;
                    fVar.f10196p = aVar;
                    fVar.f10199s = 1;
                    obj = k10.f(p10, str, fVar);
                    if (obj != coroutine_suspended) {
                        aVar2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    salesIQResponse2 = (SalesIQResponse) fVar.f10194n;
                    ResultKt.throwOnFailure(obj);
                    salesIQResponse = salesIQResponse2;
                    salesIQResponse3 = salesIQResponse;
                    if (!salesIQResponse3.getIsSuccess()) {
                        SalesIQResponse.Error error = salesIQResponse3.getError();
                        if (error == null) {
                            error = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                        }
                        Td.e.f11456a.L0(error, "initiate");
                    }
                    return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                }
                android.support.v4.media.session.b.a(fVar.f10196p);
                str2 = (String) fVar.f10195o;
                aVar2 = (a) fVar.f10194n;
                ResultKt.throwOnFailure(obj);
                aVar = null;
                salesIQResponse = (SalesIQResponse) obj;
                if (salesIQResponse.getIsSuccess()) {
                    MediaResponse mediaResponse = (MediaResponse) salesIQResponse.getData();
                    if (aVar != null) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        String e10 = MobilistenUtil.e();
                        String packageName = aVar2.j().getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                        Cg.c a10 = Sd.b.a(mediaResponse, str2, e10, packageName);
                        fVar.f10194n = salesIQResponse;
                        fVar.f10195o = null;
                        fVar.f10196p = null;
                        fVar.f10199s = 2;
                        if (aVar.b(a10, fVar) != coroutine_suspended) {
                            salesIQResponse2 = salesIQResponse;
                            salesIQResponse = salesIQResponse2;
                        }
                        return coroutine_suspended;
                    }
                }
                salesIQResponse3 = salesIQResponse;
                if (!salesIQResponse3.getIsSuccess()) {
                }
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f10197q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f10199s;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        if (salesIQResponse.getIsSuccess()) {
        }
        salesIQResponse3 = salesIQResponse;
        if (!salesIQResponse3.getIsSuccess()) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse3, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Td.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, Continuation continuation) {
        c cVar;
        int i10;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f10191p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f10191p = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f10189n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f10191p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Pd.b k10 = k();
                    String p10 = p();
                    cVar.f10191p = 1;
                    obj = k10.d(p10, str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SalesIQResponse salesIQResponse = (SalesIQResponse) obj;
                CheckStatusResponse checkStatusResponse = (CheckStatusResponse) salesIQResponse.getData();
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, new CallStatus(checkStatusResponse == null ? checkStatusResponse.getStatus() : null), null, 0, false, null, null, null, 126, null));
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f10189n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f10191p;
        if (i10 != 0) {
        }
        SalesIQResponse salesIQResponse2 = (SalesIQResponse) obj2;
        CheckStatusResponse checkStatusResponse2 = (CheckStatusResponse) salesIQResponse2.getData();
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, new CallStatus(checkStatusResponse2 == null ? checkStatusResponse2.getStatus() : null), null, 0, false, null, null, null, 126, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // Td.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(String str, Vd.a aVar, k kVar, Continuation continuation) {
        h hVar;
        int i10;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f10208p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f10208p = i11 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                Object obj = hVar2.f10206n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = hVar2.f10208p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Pd.b k10 = k();
                    String p10 = p();
                    int a10 = Sd.a.a(aVar);
                    hVar2.f10208p = 1;
                    obj = k10.h(p10, str, a10, kVar, hVar2);
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
        hVar = new h(continuation);
        h hVar22 = hVar;
        Object obj2 = hVar22.f10206n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar22.f10208p;
        if (i10 != 0) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default((SalesIQResponse) obj2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
    }

    public final Application j() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final Pd.b k() {
        return (Pd.b) this.f10185a.getValue();
    }

    public final C6959a l() {
        return C6959a.f68673u.b();
    }

    public final Ae.a m() {
        return (Ae.a) this.f10187c.getValue();
    }

    public final ConversationsLocalDataSource n() {
        return (ConversationsLocalDataSource) this.f10186b.getValue();
    }

    public final Gson o() {
        return Yd.a.j();
    }

    public final String p() {
        String I10 = m().I();
        Intrinsics.checkNotNull(I10);
        return I10;
    }

    public final boolean q(k kVar) {
        com.google.gson.h r10;
        String f10;
        return (kVar == null || (r10 = kVar.r("status")) == null || (f10 = AbstractC5896h.f(r10)) == null || !CollectionsKt.listOf((Object[]) new String[]{ViewProps.END, "miss", "cancel", "reject"}).contains(f10)) ? false : true;
    }

    public a() {
        this.f10185a = LazyKt.lazy(b.f10188d);
        this.f10186b = LazyKt.lazy(e.f10193d);
        this.f10187c = LazyKt.lazy(new d());
    }
}
