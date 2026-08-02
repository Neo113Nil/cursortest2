package Ue;

import Ph.AbstractC1459k;
import Ph.P;
import a1.C1908a;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Intent;
import cg.InterfaceC2919b;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import od.AbstractC5884j;
import pd.n;
import td.C6461a;
import xe.C6822a;
import zf.C6966g;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12187a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f12188b = LazyKt.lazy(j.f12212d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f12189c = LazyKt.lazy(i.f12211d);

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12196n;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12196n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it = a.f12187a.q().values().iterator();
            while (it.hasNext()) {
                ((Xf.b) it.next()).cancel();
            }
            a aVar = a.f12187a;
            aVar.q().clear();
            Iterator it2 = aVar.p().values().iterator();
            while (it2.hasNext()) {
                ((Xf.b) it2.next()).cancel();
            }
            a.f12187a.p().clear();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f12197n;

        /* renamed from: o, reason: collision with root package name */
        public Object f12198o;

        /* renamed from: p, reason: collision with root package name */
        public Object f12199p;

        /* renamed from: q, reason: collision with root package name */
        public Object f12200q;

        /* renamed from: r, reason: collision with root package name */
        public int f12201r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ContentResolver f12202s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ContentResolver contentResolver, Continuation continuation) {
            super(2, continuation);
            this.f12202s = contentResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f12202s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:5:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            ContentResolver contentResolver;
            String visitorid;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12201r;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                Intrinsics.checkNotNullExpressionValue(allOpenChatIds, "getAllOpenChatIds(...)");
                ContentResolver contentResolver2 = this.f12202s;
                it = allOpenChatIds.iterator();
                contentResolver = contentResolver2;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SalesIQChat chat = (SalesIQChat) this.f12200q;
            String str = (String) this.f12199p;
            it = (Iterator) this.f12198o;
            contentResolver = (ContentResolver) this.f12197n;
            ResultKt.throwOnFailure(obj);
            String str2 = str;
            Iterator it2 = it;
            ContentResolver contentResolver3 = contentResolver;
            if (((List) obj).isEmpty()) {
                com.zoho.livechat.android.provider.a.INSTANCE.deleteConversation(contentResolver3, chat.getVisitorid(), str2, false, false);
            }
            contentResolver = contentResolver3;
            it = it2;
            while (it.hasNext()) {
                str = (String) it.next();
                chat = LiveChatUtil.getChat(str);
                if (chat != null && ((visitorid = chat.getVisitorid()) == null || visitorid.length() == 0)) {
                    if (chat.getStatus() != 2 && chat.getStatus() != 3 && chat.getStatus() != 4) {
                        Intrinsics.checkNotNull(str);
                        this.f12197n = contentResolver;
                        this.f12198o = it;
                        this.f12199p = str;
                        this.f12200q = chat;
                        this.f12201r = 1;
                        obj = C6966g.M(str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        String str22 = str;
                        Iterator it22 = it;
                        ContentResolver contentResolver32 = contentResolver;
                        if (((List) obj).isEmpty()) {
                        }
                        contentResolver = contentResolver32;
                        it = it22;
                        while (it.hasNext()) {
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12203n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Application f12204o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f12205p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Application application, SalesIQChat salesIQChat, Continuation continuation) {
            super(2, continuation);
            this.f12204o = application;
            this.f12205p = salesIQChat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f12204o, this.f12205p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Rf.a a10;
            String o10;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12203n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Application application = this.f12204o;
            ContentResolver contentResolver = application != null ? application.getContentResolver() : null;
            if (contentResolver == null) {
                return Unit.INSTANCE;
            }
            AbstractC5884j.i(this.f12205p.getChid());
            com.zoho.livechat.android.provider.a.INSTANCE.deleteConversation(contentResolver, this.f12205p.getVisitorid(), this.f12205p.getChid(), true, false);
            SalesIQChat.b triggerData = this.f12205p.getTriggerData();
            if (triggerData != null && (a10 = triggerData.a()) != null && (o10 = Tf.b.o(a10)) != null) {
                SalesIQChat.b triggerData2 = this.f12205p.getTriggerData();
                if (Intrinsics.areEqual(triggerData2 != null ? triggerData2.c() : null, o10) && a10 != Rf.a.AccessedAnyPageOnApp && a10 != Rf.a.LandedOnApp) {
                    Tf.b.N(a10);
                }
            }
            LiveChatUtil.setFormContextCompleted();
            Te.a.E(this.f12205p.getConvID());
            LiveChatUtil.log("TTL, Expired chat " + this.f12205p.getChid() + " cleared from DB, sending broadcast to update UI");
            C1908a b10 = C1908a.b(this.f12204o);
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "validate_conversation_for_deletion");
            intent.putExtra("is_expired", true);
            b10.d(intent);
            ne.j.s0(false, 1, null);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12206n;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12206n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
            Intrinsics.checkNotNullExpressionValue(allOpenChatIds, "getAllOpenChatIds(...)");
            Iterator<T> it = allOpenChatIds.iterator();
            while (it.hasNext()) {
                SalesIQChat chat = LiveChatUtil.getChat((String) it.next());
                if (chat != null && (chat.getStatus() == 6 || chat.getStatus() == 5 || chat.getStatus() == 7)) {
                    a.c(chat);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12207n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f12208o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SalesIQChat salesIQChat, Continuation continuation) {
            super(2, continuation);
            this.f12208o = salesIQChat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f12208o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12207n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.f12208o != null) {
                a aVar = a.f12187a;
                if (aVar.p().containsKey(this.f12208o.getChid())) {
                    LiveChatUtil.log("TTL, Stopping TTL timer for chat " + this.f12208o.getChid());
                    Xf.b bVar = (Xf.b) aVar.p().get(this.f12208o.getChid());
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    aVar.p().remove(this.f12208o.getChid());
                    LiveChatUtil.log("TTL, TTL timer stopped for chat " + this.f12208o.getChid());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12209n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f12210o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SalesIQChat salesIQChat, Continuation continuation) {
            super(2, continuation);
            this.f12210o = salesIQChat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f12210o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12209n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.f12210o != null) {
                a aVar = a.f12187a;
                if (aVar.q().containsKey(this.f12210o.getChid())) {
                    Xf.b bVar = (Xf.b) aVar.q().get(this.f12210o.getChid());
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    aVar.q().remove(this.f12210o.getChid());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f12211d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f12212d = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public static final void c(SalesIQChat salesIQChat) {
        AbstractC1459k.d(f12187a.i(), null, null, new C0256a(salesIQChat, null), 3, null);
    }

    public static final void d(SalesIQChat salesIQChat) {
        AbstractC1459k.d(f12187a.i(), null, null, new b(salesIQChat, null), 3, null);
    }

    public static final void e() {
        AbstractC1459k.d(f12187a.i(), null, null, new c(null), 3, null);
    }

    public static final void f() {
        a aVar = f12187a;
        Application h10 = aVar.h();
        ContentResolver contentResolver = h10 != null ? h10.getContentResolver() : null;
        if (contentResolver == null) {
            return;
        }
        AbstractC1459k.d(aVar.j(), null, null, new d(contentResolver, null), 3, null);
    }

    public static final Long m() {
        Hashtable hashtable;
        Object obj;
        String obj2;
        Long longOrNull;
        Hashtable androidChannel = LiveChatUtil.getAndroidChannel();
        if (androidChannel == null) {
            return null;
        }
        Object obj3 = androidChannel.get("chat_inactivity_rules");
        Hashtable hashtable2 = obj3 instanceof Hashtable ? (Hashtable) obj3 : null;
        if (hashtable2 == null) {
            return null;
        }
        Object obj4 = hashtable2.get("rules");
        List list = obj4 instanceof List ? (List) obj4 : null;
        if (list == null || (hashtable = (Hashtable) CollectionsKt.firstOrNull(list)) == null || !hashtable.containsKey("delay_mins") || (obj = hashtable.get("delay_mins")) == null || (obj2 = obj.toString()) == null || (longOrNull = StringsKt.toLongOrNull(obj2)) == null) {
            return null;
        }
        return Long.valueOf(longOrNull.longValue() * 60000);
    }

    public static final void r() {
        AbstractC1459k.d(f12187a.j(), null, null, new f(null), 3, null);
    }

    public static final void s(SalesIQChat salesIQChat) {
        AbstractC1459k.d(f12187a.i(), null, null, new g(salesIQChat, null), 3, null);
    }

    public static final void t(SalesIQChat salesIQChat) {
        AbstractC1459k.d(f12187a.i(), null, null, new h(salesIQChat, null), 3, null);
    }

    public final void g(SalesIQChat salesIQChat) {
        LiveChatUtil.triggerChatListener("CHAT_EXPIRY", salesIQChat);
        LiveChatUtil.log("TTL, Clearing expired chat " + salesIQChat.getChid() + " for visitor " + salesIQChat.getVisitorid());
        AbstractC1459k.d(j(), null, null, new e(h(), salesIQChat, null), 3, null);
    }

    public final Application h() {
        return MobilistenInitProvider.INSTANCE.e();
    }

    public final P i() {
        return C6461a.f65810a.d();
    }

    public final P j() {
        return C6461a.f65810a.e();
    }

    public final long k() {
        return 86400000L;
    }

    public final long l() {
        return 7200000L;
    }

    public final long n() {
        Long longOrNull;
        String property = System.getProperty("siq_mobilisten_proactive_chat_ttl", "");
        return (property == null || (longOrNull = StringsKt.toLongOrNull(property)) == null) ? k() : longOrNull.longValue();
    }

    public final long o() {
        Long longOrNull;
        String property = System.getProperty("siq_mobilisten_triggered_chat_ttl", "");
        if (property != null && (longOrNull = StringsKt.toLongOrNull(property)) != null) {
            return longOrNull.longValue();
        }
        Long m10 = m();
        return m10 != null ? m10.longValue() : l();
    }

    public final Map p() {
        return (Map) f12189c.getValue();
    }

    public final Map q() {
        return (Map) f12188b.getValue();
    }

    /* renamed from: Ue.a$a, reason: collision with other inner class name */
    public static final class C0256a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12190n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f12191o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0256a(SalesIQChat salesIQChat, Continuation continuation) {
            super(2, continuation);
            this.f12191o = salesIQChat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0256a(this.f12191o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0256a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String chid;
            long o10;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12190n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SalesIQChat salesIQChat = this.f12191o;
            if (salesIQChat == null || (chid = salesIQChat.getChid()) == null || chid.length() == 0) {
                return Unit.INSTANCE;
            }
            a aVar = a.f12187a;
            if (aVar.p().containsKey(this.f12191o.getChid())) {
                return Unit.INSTANCE;
            }
            int status = this.f12191o.getStatus();
            if (status == 5 || status == 6) {
                o10 = aVar.o();
            } else {
                if (status != 7) {
                    return Unit.INSTANCE;
                }
                o10 = aVar.n();
            }
            long time = this.f12191o.getTime();
            if (time <= 0) {
                return Unit.INSTANCE;
            }
            long f10 = (o10 - (rd.b.f() - time)) - 30000;
            if (f10 <= 0) {
                aVar.g(this.f12191o);
                return Unit.INSTANCE;
            }
            LiveChatUtil.log("TTL, Starting TTL timer for chat " + this.f12191o.getChid() + " with remaining time: " + f10 + " ms");
            Map p10 = aVar.p();
            String chid2 = this.f12191o.getChid();
            Intrinsics.checkNotNullExpressionValue(chid2, "getChid(...)");
            Xf.b bVar = new Xf.b(this.f12191o.getChid(), f10, 1000L);
            bVar.a(new C0257a(this.f12191o));
            bVar.start();
            p10.put(chid2, bVar);
            LiveChatUtil.log("TTL, TTL timer started for chat " + this.f12191o.getChid() + ", will expire in " + f10 + " ms");
            return Unit.INSTANCE;
        }

        /* renamed from: Ue.a$a$a, reason: collision with other inner class name */
        public static final class C0257a implements InterfaceC2919b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SalesIQChat f12192a;

            public C0257a(SalesIQChat salesIQChat) {
                this.f12192a = salesIQChat;
            }

            @Override // cg.InterfaceC2919b
            public void H() {
                LiveChatUtil.log("TTL, TTL timer finished for chat " + this.f12192a.getChid() + ", verifying status before clearing");
                SalesIQChat chat = LiveChatUtil.getChat(this.f12192a.getChid());
                if (chat != null && (chat.getStatus() == 6 || chat.getStatus() == 5 || chat.getStatus() == 7)) {
                    a.f12187a.g(chat);
                }
                a.f12187a.p().remove(this.f12192a.getChid());
            }

            @Override // cg.InterfaceC2919b
            public void G(long j10) {
            }
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12193n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f12194o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SalesIQChat salesIQChat, Continuation continuation) {
            super(2, continuation);
            this.f12194o = salesIQChat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f12194o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int m10;
            Channel.CallConfigurations callConfigurations;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12193n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SalesIQChat salesIQChat = this.f12194o;
            Long l10 = null;
            if ((salesIQChat != null ? salesIQChat.getType() : null) == SalesIQChat.c.Chat) {
                m10 = og.i.m(Boxing.boxLong(LiveChatUtil.getChatWaitingTime()));
            } else {
                Channel m11 = C6822a.m();
                if (m11 != null && (callConfigurations = m11.getCallConfigurations()) != null) {
                    l10 = callConfigurations.getSdkWaitingTime();
                }
                m10 = og.i.m(l10);
            }
            SalesIQChat salesIQChat2 = this.f12194o;
            if (salesIQChat2 != null && !salesIQChat2.canShowQueue()) {
                a aVar = a.f12187a;
                if (!aVar.q().containsKey(this.f12194o.getChid()) && m10 > 0 && ((this.f12194o.getStatus() == 1 || this.f12194o.getStatus() == 5) && this.f12194o.getWaitingTimerStartTime() > 0)) {
                    Map q10 = aVar.q();
                    String chid = this.f12194o.getChid();
                    Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                    String chid2 = this.f12194o.getChid();
                    Long boxLong = Boxing.boxLong(this.f12194o.getWaitingTimerStartTime());
                    Intrinsics.checkNotNullExpressionValue(LiveChatUtil.getInteger(Boxing.boxInt(m10)), "getInteger(...)");
                    Xf.b bVar = new Xf.b(chid2, LiveChatUtil.getTimeRemaining(boxLong, r10.intValue()) * 1000, 1000L);
                    bVar.a(new C0258a(this.f12194o));
                    bVar.start();
                    q10.put(chid, bVar);
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: Ue.a$b$a, reason: collision with other inner class name */
        public static final class C0258a implements InterfaceC2919b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SalesIQChat f12195a;

            public C0258a(SalesIQChat salesIQChat) {
                this.f12195a = salesIQChat;
            }

            @Override // cg.InterfaceC2919b
            public void H() {
                SalesIQChat chat = LiveChatUtil.getChat(this.f12195a.getChid());
                if (chat != null && (chat.getStatus() == 1 || chat.getStatus() == 5)) {
                    new n(this.f12195a.getVisitorid(), true).c();
                }
                a.f12187a.q().remove(this.f12195a.getChid());
            }

            @Override // cg.InterfaceC2919b
            public void G(long j10) {
            }
        }
    }
}
