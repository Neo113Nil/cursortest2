package Kd;

import android.app.Application;
import com.google.gson.Gson;
import com.zoho.livechat.android.modules.brand.data.local.entities.FormEntity;
import com.zoho.livechat.android.modules.brand.data.remote.entities.BrandStatus;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import com.zoho.livechat.android.modules.brand.data.repositories.mappers.FormResponseToDomainKt;
import com.zoho.livechat.android.modules.brand.data.repositories.mappers.FormRoomToDomainKt;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.utils.LiveChatUtil;
import he.AbstractC4505a;
import ie.EnumC4544a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlin.text.StringsKt;
import me.C5582a;
import og.AbstractC5891c;
import og.i;
import ze.C6959a;

/* loaded from: classes4.dex */
public final class a implements Nd.a {

    /* renamed from: g, reason: collision with root package name */
    public static a f6470g;

    /* renamed from: a, reason: collision with root package name */
    public final Application f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f6473b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f6474c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f6475d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f6476e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0136a f6469f = new C0136a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f6471h = new Object();

    /* renamed from: Kd.a$a, reason: collision with other inner class name */
    public static final class C0136a {
        public /* synthetic */ C0136a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Application application) {
            a aVar;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (a.f6471h) {
                aVar = a.f6470g;
                if (aVar == null) {
                    aVar = new a(application, null);
                    a.f6470g = aVar;
                }
            }
            return aVar;
        }

        public C0136a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4544a.values().length];
            try {
                iArr[EnumC4544a.CallOnline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4544a.Online.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4544a.Offline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4544a.CallOffline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f6477d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Id.a invoke() {
            return new Id.a();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(a.this.l());
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f6479d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Gd.a invoke() {
            return Gd.a.f3924b.a();
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f6480d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Gson invoke() {
            return Yd.a.j();
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6481n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6482o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6483p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6484q;

        /* renamed from: r, reason: collision with root package name */
        public Object f6485r;

        /* renamed from: s, reason: collision with root package name */
        public Object f6486s;

        /* renamed from: t, reason: collision with root package name */
        public Object f6487t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f6488u;

        /* renamed from: w, reason: collision with root package name */
        public int f6490w;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6488u = obj;
            this.f6490w |= Integer.MIN_VALUE;
            return a.this.c(false, null, null, this);
        }
    }

    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6491n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6492o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6493p;

        /* renamed from: r, reason: collision with root package name */
        public int f6495r;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6493p = obj;
            this.f6495r |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public /* synthetic */ a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static final Form.Message r(Form.Message message, a aVar) {
        if (message.getMeta() == null) {
            return message;
        }
        String text = message.getText();
        String obj = text != null ? StringsKt.trim((CharSequence) text).toString() : null;
        if (obj != null && obj.length() != 0) {
            return message;
        }
        Integer stringResourceId = Form.Message.INSTANCE.c(message).getStringResourceId();
        String string = stringResourceId != null ? aVar.f6472a.getString(stringResourceId.intValue()) : null;
        if (string == null) {
            string = "";
        }
        return Form.Message.copy$default(message, null, null, string, null, 11, null);
    }

    @Override // Nd.a
    public C5582a a() {
        n().L(null);
        return C5582a.C0817a.e(C5582a.f56502b, null, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:0|1|(2:3|(27:5|6|(1:(3:9|10|11)(2:100|101))(7:102|103|104|(2:107|105)|108|109|(1:111)(1:112))|12|13|(1:15)|16|(1:18)|19|(12:(1:95)(1:26)|27|(1:29)|(2:31|(1:33)(7:34|(1:93)(1:40)|41|(1:43)|(2:45|(1:47)(2:48|49))|92|49))|94|(1:36)|93|41|(0)|(0)|92|49)(1:96)|50|(1:91)(1:56)|57|(1:88)(1:63)|64|(1:66)|67|(1:69)|70|(1:73)|74|75|76|77|(1:79)|80|81))|116|6|(0)(0)|12|13|(0)|16|(0)|19|(0)(0)|50|(1:52)|89|91|57|(1:59)|86|88|64|(0)|67|(0)|70|(1:73)|74|75|76|77|(0)|80|81|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c8, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    @Override // Nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(List list, Continuation continuation) {
        h hVar;
        int i10;
        boolean z10;
        a aVar;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        Channel r10;
        Channel channel;
        Boolean bool;
        boolean booleanValue;
        Boolean bool2;
        Throwable m150exceptionOrNullimpl2;
        BrandStatus.Component chat;
        BrandStatus.Component call;
        List<Channel.Department> list2;
        List<Channel.Department> b10;
        List<Channel.Department> list3;
        BrandStatus.Component call2;
        List<BrandStatus.Component.Department> departments;
        BrandStatus.Component chat2;
        List<BrandStatus.Component.Department> departments2;
        List list4 = list;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f6495r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f6495r = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f6493p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = hVar.f6495r;
                z10 = true;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Id.a m10 = m();
                        String I10 = o().I();
                        Intrinsics.checkNotNull(I10);
                        String h10 = o().h();
                        Intrinsics.checkNotNull(h10);
                        List list5 = list4;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            String lowerCase = ((Md.a) it.next()).name().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            arrayList.add(lowerCase);
                        }
                        hVar.f6491n = this;
                        hVar.f6492o = list4;
                        hVar.f6495r = 1;
                        obj = m10.c(I10, h10, arrayList, hVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        if (Result.m153isFailureimpl(m147constructorimpl)) {
                        }
                        BrandStatus brandStatus = (BrandStatus) m147constructorimpl;
                        Ae.a o10 = aVar.o();
                        De.a aVar2 = De.a.AndroidChannel;
                        Gson q10 = aVar.q();
                        r10 = aVar.o().r();
                        if (r10 == null) {
                        }
                        o10.k0(aVar2, q10.v(channel), true);
                        if (brandStatus != null) {
                        }
                        if (brandStatus != null) {
                        }
                        if (list4.contains(Md.a.Call)) {
                        }
                        if (list4.contains(Md.a.Chat)) {
                        }
                        Boolean bool3 = (Boolean) Ae.a.m(aVar.o(), "embedstatus", false, 2, null).b();
                        if (!booleanValue) {
                        }
                        aVar.o().h0("embedstatus", z10);
                        aVar.n().G(null);
                        Object m147constructorimpl2 = Result.m147constructorimpl(new Pair(Boxing.boxBoolean(Intrinsics.areEqual(bool3, Boxing.boxBoolean(z10))), Boxing.boxBoolean(z10)));
                        m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                        if (m150exceptionOrNullimpl2 != null) {
                        }
                        return me.b.a(m147constructorimpl2);
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list4 = (List) hVar.f6492o;
                    aVar = (a) hVar.f6491n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        if (Result.m153isFailureimpl(m147constructorimpl)) {
                        }
                        BrandStatus brandStatus2 = (BrandStatus) m147constructorimpl;
                        Ae.a o102 = aVar.o();
                        De.a aVar22 = De.a.AndroidChannel;
                        Gson q102 = aVar.q();
                        r10 = aVar.o().r();
                        if (r10 == null) {
                        }
                        o102.k0(aVar22, q102.v(channel), true);
                        if (brandStatus2 != null) {
                        }
                        if (brandStatus2 != null) {
                        }
                        if (list4.contains(Md.a.Call)) {
                        }
                        if (list4.contains(Md.a.Chat)) {
                        }
                        Boolean bool32 = (Boolean) Ae.a.m(aVar.o(), "embedstatus", false, 2, null).b();
                        if (!booleanValue) {
                        }
                        aVar.o().h0("embedstatus", z10);
                        aVar.n().G(null);
                        Object m147constructorimpl22 = Result.m147constructorimpl(new Pair(Boxing.boxBoolean(Intrinsics.areEqual(bool32, Boxing.boxBoolean(z10))), Boxing.boxBoolean(z10)));
                        m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl22);
                        if (m150exceptionOrNullimpl2 != null) {
                        }
                        return me.b.a(m147constructorimpl22);
                    }
                }
                m147constructorimpl = Result.m147constructorimpl((BrandStatus) ((SalesIQResponse) obj).getData());
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                if (Result.m153isFailureimpl(m147constructorimpl)) {
                    m147constructorimpl = null;
                }
                BrandStatus brandStatus22 = (BrandStatus) m147constructorimpl;
                Ae.a o1022 = aVar.o();
                De.a aVar222 = De.a.AndroidChannel;
                Gson q1022 = aVar.q();
                r10 = aVar.o().r();
                if (r10 == null) {
                    List<Channel.Department> b11 = (brandStatus22 == null || (chat2 = brandStatus22.getChat()) == null || (departments2 = chat2.getDepartments()) == null) ? null : Ld.a.b(departments2);
                    if (!list4.contains(Md.a.Chat)) {
                        b11 = null;
                    }
                    if (b11 == null) {
                        Channel r11 = aVar.o().r();
                        if (r11 != null) {
                            b11 = r11.getChatDepartments();
                        } else {
                            list2 = null;
                            b10 = (brandStatus22 != null || (call2 = brandStatus22.getCall()) == null || (departments = call2.getDepartments()) == null) ? null : Ld.a.b(departments);
                            if (!list4.contains(Md.a.Call)) {
                                b10 = null;
                            }
                            if (b10 == null) {
                                Channel r12 = aVar.o().r();
                                if (r12 != null) {
                                    b10 = r12.getCallDepartments();
                                } else {
                                    list3 = null;
                                    channel = Channel.copy$default(r10, null, null, null, null, null, null, null, null, null, list3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67109377, -1, 4194303, null);
                                }
                            }
                            list3 = b10;
                            channel = Channel.copy$default(r10, null, null, null, null, null, null, null, null, null, list3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67109377, -1, 4194303, null);
                        }
                    }
                    list2 = b11;
                    if (brandStatus22 != null) {
                    }
                    if (!list4.contains(Md.a.Call)) {
                    }
                    if (b10 == null) {
                    }
                    list3 = b10;
                    channel = Channel.copy$default(r10, null, null, null, null, null, null, null, null, null, list3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67109377, -1, 4194303, null);
                } else {
                    channel = null;
                }
                o1022.k0(aVar222, q1022.v(channel), true);
                booleanValue = ((brandStatus22 != null || (call = brandStatus22.getCall()) == null || (bool = call.getOnline()) == null) && (bool = (Boolean) aVar.o().l("app_call_status", false).b()) == null) ? false : bool.booleanValue();
                boolean booleanValue2 = ((brandStatus22 != null || (chat = brandStatus22.getChat()) == null || (bool2 = chat.getOnline()) == null) && (bool2 = (Boolean) aVar.o().l("app_chat_status", false).b()) == null) ? false : bool2.booleanValue();
                if (list4.contains(Md.a.Call)) {
                    aVar.o().h0("app_call_status", booleanValue);
                    aVar.o().j0("app_call_status_sync_time", rd.b.f());
                }
                if (list4.contains(Md.a.Chat)) {
                    aVar.o().h0("app_chat_status", booleanValue2);
                    aVar.o().j0("app_chat_status_sync_time", rd.b.f());
                }
                Boolean bool322 = (Boolean) Ae.a.m(aVar.o(), "embedstatus", false, 2, null).b();
                if (!booleanValue && !booleanValue2) {
                    z10 = false;
                }
                aVar.o().h0("embedstatus", z10);
                aVar.n().G(null);
                Object m147constructorimpl222 = Result.m147constructorimpl(new Pair(Boxing.boxBoolean(Intrinsics.areEqual(bool322, Boxing.boxBoolean(z10))), Boxing.boxBoolean(z10)));
                m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl222);
                if (m150exceptionOrNullimpl2 != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl2);
                }
                return me.b.a(m147constructorimpl222);
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f6493p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar.f6495r;
        z10 = true;
        if (i10 != 0) {
        }
        m147constructorimpl = Result.m147constructorimpl((BrandStatus) ((SalesIQResponse) obj2).getData());
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
        }
        BrandStatus brandStatus222 = (BrandStatus) m147constructorimpl;
        Ae.a o10222 = aVar.o();
        De.a aVar2222 = De.a.AndroidChannel;
        Gson q10222 = aVar.q();
        r10 = aVar.o().r();
        if (r10 == null) {
        }
        o10222.k0(aVar2222, q10222.v(channel), true);
        if (brandStatus222 != null) {
        }
        if (brandStatus222 != null) {
        }
        if (list4.contains(Md.a.Call)) {
        }
        if (list4.contains(Md.a.Chat)) {
        }
        Boolean bool3222 = (Boolean) Ae.a.m(aVar.o(), "embedstatus", false, 2, null).b();
        if (!booleanValue) {
            z10 = false;
        }
        aVar.o().h0("embedstatus", z10);
        aVar.n().G(null);
        Object m147constructorimpl2222 = Result.m147constructorimpl(new Pair(Boxing.boxBoolean(Intrinsics.areEqual(bool3222, Boxing.boxBoolean(z10))), Boxing.boxBoolean(z10)));
        m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2222);
        if (m150exceptionOrNullimpl2 != null) {
        }
        return me.b.a(m147constructorimpl2222);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // Nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(boolean z10, String str, EnumC4544a enumC4544a, Continuation continuation) {
        g gVar;
        int i10;
        De.a aVar;
        String str2;
        Long l10;
        boolean z11;
        String str3;
        a aVar2;
        Long l11;
        De.a aVar3;
        SalesIQResponse salesIQResponse;
        FormResponse formResponse;
        Form a10;
        Object obj;
        long j10;
        FormEntity a11;
        a aVar4;
        De.a aVar5;
        FormResponse formResponse2;
        EnumC4544a enumC4544a2;
        SalesIQResponse salesIQResponse2;
        Form form;
        String str4;
        EnumC4544a enumC4544a3;
        a aVar6;
        SalesIQResponse salesIQResponse3;
        FormResponse formResponse3;
        SalesIQResponse salesIQResponse4;
        Long syncTime;
        EnumC4544a enumC4544a4 = enumC4544a;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f6490w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f6490w = i11 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj2 = gVar2.f6488u;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar2.f6490w;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    String I10 = o().I();
                    String h10 = o().h();
                    String f10 = o().f();
                    if (Intrinsics.areEqual(g(enumC4544a4).b(), Boxing.boxBoolean(true)) && (str == null || str.length() == 0)) {
                        return C5582a.f56502b.d(Unit.INSTANCE);
                    }
                    if (I10 == null || I10.length() == 0 || h10 == null || h10.length() == 0 || f10 == null || f10.length() == 0) {
                        return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Screen name, appId or AVUID is null for syncForms"), false, 2, null);
                    }
                    int i12 = b.$EnumSwitchMapping$0[enumC4544a4.ordinal()];
                    if (i12 == 1) {
                        aVar = De.a.AppCallOnlinePreChatFormSyncTime;
                    } else if (i12 == 2) {
                        aVar = De.a.AppOnlinePreChatFormSyncTime;
                    } else if (i12 == 3) {
                        aVar = De.a.AppOfflinePreChatFormSyncTime;
                    } else {
                        if (i12 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = De.a.AppCallOfflinePreChatFormSyncTime;
                    }
                    De.a aVar7 = aVar;
                    Long l12 = (Long) Ae.a.C(o(), aVar7, 0L, 2, null).b();
                    if (l12 == null || l12.longValue() <= 0) {
                        l12 = null;
                    }
                    boolean z12 = enumC4544a4 == EnumC4544a.CallOnline || enumC4544a4 == EnumC4544a.CallOffline;
                    Id.a m10 = m();
                    Boolean boxBoolean = Boxing.boxBoolean(z10);
                    boxBoolean.getClass();
                    if (z12) {
                        boxBoolean = null;
                    }
                    boolean i13 = i.i(boxBoolean);
                    String a12 = AbstractC4505a.a(enumC4544a4);
                    if (str == null || str.length() == 0) {
                        str2 = f10;
                        l10 = l12;
                    } else {
                        str2 = f10;
                        l10 = null;
                    }
                    Boolean boxBoolean2 = Boxing.boxBoolean(z12 || str == null || str.length() == 0);
                    gVar2.f6481n = this;
                    gVar2.f6482o = str;
                    gVar2.f6483p = enumC4544a4;
                    gVar2.f6484q = aVar7;
                    gVar2.f6485r = l12;
                    gVar2.f6490w = 1;
                    Long l13 = l12;
                    z11 = true;
                    obj2 = m10.b(I10, h10, str2, i13, a12, str, l10, boxBoolean2, gVar2);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                    aVar2 = this;
                    l11 = l13;
                    aVar3 = aVar7;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            form = (Form) gVar2.f6487t;
                            formResponse2 = (FormResponse) gVar2.f6486s;
                            salesIQResponse2 = (SalesIQResponse) gVar2.f6485r;
                            aVar5 = (De.a) gVar2.f6484q;
                            enumC4544a2 = (EnumC4544a) gVar2.f6483p;
                            str3 = (String) gVar2.f6482o;
                            aVar4 = (a) gVar2.f6481n;
                            ResultKt.throwOnFailure(obj2);
                            z11 = true;
                            a10 = form;
                            formResponse = formResponse2;
                            salesIQResponse = salesIQResponse2;
                            aVar3 = aVar5;
                            enumC4544a4 = enumC4544a2;
                            aVar2 = aVar4;
                            if (aVar2.n().s() == null) {
                            }
                            if (a10 != null) {
                            }
                            if (formResponse != null) {
                                aVar2.o().i0(aVar3, syncTime.longValue(), z11);
                            }
                            salesIQResponse4 = salesIQResponse;
                            if (!salesIQResponse4.getIsSuccess()) {
                                new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                            }
                            return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse4, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        formResponse3 = (FormResponse) gVar2.f6486s;
                        salesIQResponse3 = (SalesIQResponse) gVar2.f6485r;
                        aVar3 = (De.a) gVar2.f6484q;
                        enumC4544a3 = (EnumC4544a) gVar2.f6483p;
                        str4 = (String) gVar2.f6482o;
                        aVar6 = (a) gVar2.f6481n;
                        ResultKt.throwOnFailure(obj2);
                        z11 = true;
                        FormEntity formEntity = (FormEntity) ((C5582a) obj2).b();
                        Form a13 = formEntity == null ? FormRoomToDomainKt.a(formEntity, aVar6.q()) : null;
                        salesIQResponse = salesIQResponse3;
                        a10 = a13;
                        enumC4544a4 = enumC4544a3;
                        aVar2 = aVar6;
                        formResponse = formResponse3;
                        str3 = str4;
                        if (aVar2.n().s() == null) {
                            aVar2.n().M(new HashMap());
                        }
                        if (a10 != null) {
                            HashMap s10 = aVar2.n().s();
                            if (s10 != null) {
                            }
                        } else if (AbstractC5891c.d(a10.getMessages())) {
                            if (a10.getType() == Form.Type.Conversation) {
                                if (i.f(str3)) {
                                    aVar2.o().k0(De.a.OngoingConversationContextAppStatus, AbstractC4505a.a(enumC4544a4), z11);
                                }
                                C6959a n10 = aVar2.n();
                                List<Form.Message> messages = a10.getMessages();
                                Intrinsics.checkNotNull(messages);
                                Form.Message message = (Form.Message) CollectionsKt.firstOrNull((List) messages);
                                n10.L(message != null ? r(message, aVar2) : null);
                            }
                            HashMap s11 = aVar2.n().s();
                            if (s11 != null) {
                                String a14 = AbstractC4505a.a(enumC4544a4);
                                List<Form.Message> messages2 = a10.getMessages();
                                Intrinsics.checkNotNull(messages2);
                                List<Form.Message> list = messages2;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(r((Form.Message) it.next(), aVar2));
                                }
                            }
                        } else {
                            HashMap s12 = aVar2.n().s();
                            if (s12 != null) {
                            }
                        }
                        if (formResponse != null && (syncTime = formResponse.getSyncTime()) != null) {
                            aVar2.o().i0(aVar3, syncTime.longValue(), z11);
                        }
                        salesIQResponse4 = salesIQResponse;
                        if (!salesIQResponse4.getIsSuccess() && salesIQResponse4.getError() == null) {
                            new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                        }
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse4, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                    }
                    l11 = (Long) gVar2.f6485r;
                    De.a aVar8 = (De.a) gVar2.f6484q;
                    EnumC4544a enumC4544a5 = (EnumC4544a) gVar2.f6483p;
                    str3 = (String) gVar2.f6482o;
                    a aVar9 = (a) gVar2.f6481n;
                    ResultKt.throwOnFailure(obj2);
                    z11 = true;
                    aVar3 = aVar8;
                    aVar2 = aVar9;
                    enumC4544a4 = enumC4544a5;
                }
                salesIQResponse = (SalesIQResponse) obj2;
                if (salesIQResponse.getIsSuccess()) {
                    formResponse = (FormResponse) salesIQResponse.getData();
                    a10 = FormResponseToDomainKt.a(formResponse, aVar2.q(), (enumC4544a4 == EnumC4544a.CallOnline || enumC4544a4 == EnumC4544a.CallOffline) ? z11 : false);
                    Ae.a o10 = aVar2.o();
                    Long syncTime2 = salesIQResponse.getSyncTime();
                    if (syncTime2 != null) {
                        long longValue = syncTime2.longValue();
                        obj = coroutine_suspended;
                        j10 = longValue;
                    } else {
                        obj = coroutine_suspended;
                        j10 = 0;
                    }
                    o10.i0(aVar3, j10, z11);
                    if (l11 != null) {
                        if (Intrinsics.areEqual(l11, formResponse != null ? formResponse.getSyncTime() : null) && a10 == null) {
                            Gd.a p10 = aVar2.p();
                            String a15 = AbstractC4505a.a(enumC4544a4);
                            gVar2.f6481n = aVar2;
                            gVar2.f6482o = str3;
                            gVar2.f6483p = enumC4544a4;
                            gVar2.f6484q = aVar3;
                            gVar2.f6485r = salesIQResponse;
                            gVar2.f6486s = formResponse;
                            gVar2.f6490w = 3;
                            Object d10 = p10.d(a15, gVar2);
                            if (d10 == obj) {
                                return obj;
                            }
                            str4 = str3;
                            enumC4544a3 = enumC4544a4;
                            aVar6 = aVar2;
                            salesIQResponse3 = salesIQResponse;
                            obj2 = d10;
                            formResponse3 = formResponse;
                            FormEntity formEntity2 = (FormEntity) ((C5582a) obj2).b();
                            if (formEntity2 == null) {
                            }
                            salesIQResponse = salesIQResponse3;
                            a10 = a13;
                            enumC4544a4 = enumC4544a3;
                            aVar2 = aVar6;
                            formResponse = formResponse3;
                            str3 = str4;
                            if (aVar2.n().s() == null) {
                            }
                            if (a10 != null) {
                            }
                            if (formResponse != null) {
                            }
                        }
                    }
                    if (formResponse != null && (a11 = Ld.c.a(formResponse, aVar2.q(), enumC4544a4)) != null) {
                        Gd.a p11 = aVar2.p();
                        gVar2.f6481n = aVar2;
                        gVar2.f6482o = str3;
                        gVar2.f6483p = enumC4544a4;
                        gVar2.f6484q = aVar3;
                        gVar2.f6485r = salesIQResponse;
                        gVar2.f6486s = formResponse;
                        gVar2.f6487t = a10;
                        gVar2.f6490w = 2;
                        Object f11 = p11.f(a11, gVar2);
                        if (f11 == obj) {
                            return obj;
                        }
                        aVar4 = aVar2;
                        aVar5 = aVar3;
                        formResponse2 = formResponse;
                        enumC4544a2 = enumC4544a4;
                        salesIQResponse2 = salesIQResponse;
                        obj2 = f11;
                        form = a10;
                        a10 = form;
                        formResponse = formResponse2;
                        salesIQResponse = salesIQResponse2;
                        aVar3 = aVar5;
                        enumC4544a4 = enumC4544a2;
                        aVar2 = aVar4;
                    }
                    if (aVar2.n().s() == null) {
                    }
                    if (a10 != null) {
                    }
                    if (formResponse != null) {
                    }
                }
                salesIQResponse4 = salesIQResponse;
                if (!salesIQResponse4.getIsSuccess()) {
                }
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse4, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
            }
        }
        gVar = new g(continuation);
        g gVar22 = gVar;
        Object obj22 = gVar22.f6488u;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar22.f6490w;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj22;
        if (salesIQResponse.getIsSuccess()) {
        }
        salesIQResponse4 = salesIQResponse;
        if (!salesIQResponse4.getIsSuccess()) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse4, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
    }

    @Override // Nd.a
    public C5582a d() {
        return C5582a.f56502b.d(n().r());
    }

    @Override // Nd.a
    public C5582a e(EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        C5582a.C0817a c0817a = C5582a.f56502b;
        HashMap s10 = n().s();
        return c0817a.d(s10 != null ? (Form) s10.get(AbstractC4505a.a(appStatus)) : null);
    }

    @Override // Nd.a
    public C5582a f(EnumC4544a enumC4544a) {
        HashMap s10;
        String a10;
        HashMap s11;
        if (enumC4544a != null && (a10 = AbstractC4505a.a(enumC4544a)) != null && (s11 = n().s()) != null) {
        }
        if (enumC4544a == null || ((s10 = n().s()) != null && s10.isEmpty())) {
            n().M(null);
        }
        n().L(null);
        return C5582a.f56502b.d(Unit.INSTANCE);
    }

    @Override // Nd.a
    public C5582a g(EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        C5582a.C0817a c0817a = C5582a.f56502b;
        HashMap s10 = n().s();
        boolean z10 = false;
        if (s10 != null && s10.containsKey(AbstractC4505a.a(appStatus))) {
            z10 = true;
        }
        return c0817a.d(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (og.i.f(r6) == false) goto L18;
     */
    @Override // Nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5582a h(EnumC4544a appStatus, String str, String str2, boolean z10) {
        boolean z11;
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        String a10 = AbstractC4505a.a(appStatus);
        C5582a.C0817a c0817a = C5582a.f56502b;
        HashMap s10 = n().s();
        if (s10 != null) {
            z11 = true;
            if (s10.containsKey(a10)) {
                HashMap s11 = n().s();
                Form form = s11 != null ? (Form) s11.get(a10) : null;
                if (form != null) {
                    Form.Companion companion = Form.INSTANCE;
                    if (!companion.c(form, z10, str)) {
                        if (companion.a(form)) {
                        }
                    }
                }
                return c0817a.d(Boolean.valueOf(z11));
            }
        }
        z11 = false;
        return c0817a.d(Boolean.valueOf(z11));
    }

    public final Application l() {
        return this.f6472a;
    }

    public final Id.a m() {
        return (Id.a) this.f6474c.getValue();
    }

    public final C6959a n() {
        return C6959a.f68673u.b();
    }

    public final Ae.a o() {
        return (Ae.a) this.f6475d.getValue();
    }

    public final Gd.a p() {
        return (Gd.a) this.f6476e.getValue();
    }

    public final Gson q() {
        return (Gson) this.f6473b.getValue();
    }

    public a(Application application) {
        this.f6472a = application;
        this.f6473b = LazyKt.lazy(f.f6480d);
        this.f6474c = LazyKt.lazy(c.f6477d);
        this.f6475d = LazyKt.lazy(new d());
        this.f6476e = LazyKt.lazy(e.f6479d);
    }
}
