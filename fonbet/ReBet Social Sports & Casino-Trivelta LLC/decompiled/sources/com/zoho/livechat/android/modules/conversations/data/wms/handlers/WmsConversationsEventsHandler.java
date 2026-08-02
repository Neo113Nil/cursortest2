package com.zoho.livechat.android.modules.conversations.data.wms.handlers;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Ye.d;
import a1.C1908a;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.gson.Gson;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.AbstractC3934c;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import me.C5582a;
import od.AbstractC5884j;
import og.AbstractC5892d;
import og.AbstractC5895g;
import og.AbstractC5896h;
import org.jetbrains.annotations.NotNull;
import qf.C6152a;
import rd.C6218a;
import td.C6461a;
import uf.C6550a;
import vf.AbstractC6687a;
import vf.c;
import zf.C6966g;

/* loaded from: classes4.dex */
public final class WmsConversationsEventsHandler {

    /* renamed from: k, reason: collision with root package name */
    public static WmsConversationsEventsHandler f42874k;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f42876a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f42877b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f42878c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f42879d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f42880e;

    /* renamed from: f, reason: collision with root package name */
    public MessageEntity f42881f;

    /* renamed from: g, reason: collision with root package name */
    public C0 f42882g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f42883h;

    /* renamed from: i, reason: collision with root package name */
    public C0 f42884i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3861a f42873j = new C3861a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final Object f42875l = new Object();

    public static final class A extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public Object f42885A;

        /* renamed from: B, reason: collision with root package name */
        public Object f42886B;

        /* renamed from: C, reason: collision with root package name */
        public Object f42887C;

        /* renamed from: D, reason: collision with root package name */
        public /* synthetic */ Object f42888D;

        /* renamed from: F, reason: collision with root package name */
        public int f42890F;

        /* renamed from: n, reason: collision with root package name */
        public Object f42891n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42892o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42893p;

        /* renamed from: q, reason: collision with root package name */
        public Object f42894q;

        /* renamed from: r, reason: collision with root package name */
        public Object f42895r;

        /* renamed from: s, reason: collision with root package name */
        public Object f42896s;

        /* renamed from: t, reason: collision with root package name */
        public Object f42897t;

        /* renamed from: u, reason: collision with root package name */
        public Object f42898u;

        /* renamed from: v, reason: collision with root package name */
        public Object f42899v;

        /* renamed from: w, reason: collision with root package name */
        public Object f42900w;

        /* renamed from: x, reason: collision with root package name */
        public Object f42901x;

        /* renamed from: y, reason: collision with root package name */
        public Object f42902y;

        /* renamed from: z, reason: collision with root package name */
        public Object f42903z;

        public A(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42888D = obj;
            this.f42890F |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.p0(null, null, null, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    public static final class B extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42904n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42905o;

        /* renamed from: p, reason: collision with root package name */
        public int f42906p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Hashtable f42907q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f42908r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f42907q = hashtable;
            this.f42908r = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new B(this.f42907q, this.f42908r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((B) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String obj2;
            String obj3;
            String str;
            String str2;
            Object obj4;
            Object obj5;
            Object obj6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42906p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj7 = this.f42907q.get("msg");
                Hashtable hashtable = obj7 instanceof Hashtable ? (Hashtable) obj7 : null;
                Hashtable hashtable2 = (Hashtable) (hashtable != null ? hashtable.get("VISITORDATA") : null);
                String obj8 = (hashtable2 == null || (obj6 = hashtable2.get("name")) == null) ? null : obj6.toString();
                obj2 = (hashtable2 == null || (obj5 = hashtable2.get("email")) == null) ? null : obj5.toString();
                obj3 = (hashtable2 == null || (obj4 = hashtable2.get("phone")) == null) ? null : obj4.toString();
                if (obj8 != null) {
                    Ge.h.c(d.j().h(De.a.VisitorName, obj8), false, 1, null);
                    if (this.f42907q.containsKey("chid")) {
                        C6550a M10 = this.f42908r.M();
                        String valueOf = String.valueOf(this.f42907q.get("chid"));
                        this.f42904n = obj2;
                        this.f42905o = obj3;
                        this.f42906p = 1;
                        if (M10.J0(valueOf, obj8, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = obj3;
                        str2 = obj2;
                    }
                }
                if (obj2 != null) {
                    ZohoLiveChat.e.h(obj2);
                }
                if (obj3 != null) {
                    ZohoLiveChat.e.g(obj3);
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f42905o;
            str2 = (String) this.f42904n;
            ResultKt.throwOnFailure(obj);
            obj3 = str;
            obj2 = str2;
            if (obj2 != null) {
            }
            if (obj3 != null) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class C extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42909n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42910o;

        /* renamed from: p, reason: collision with root package name */
        public int f42911p;

        public C(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WmsConversationsEventsHandler.this.new C(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b0, code lost:
        
            if (Ph.AbstractC1440a0.a(r7, r10) != r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00db -> B:8:0x0054). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Rh.l it;
            Rh.l lVar;
            Pair pair;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42911p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                it = WmsConversationsEventsHandler.this.G().iterator();
            } else {
                if (i10 == 1) {
                    Rh.l lVar2 = (Rh.l) this.f42909n;
                    ResultKt.throwOnFailure(obj);
                    lVar = lVar2;
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    Pair pair2 = (Pair) lVar.next();
                    C6152a L10 = WmsConversationsEventsHandler.this.L();
                    String chatId = ((MessageEntity) pair2.getSecond()).getChatId();
                    String messageId = ((MessageEntity) pair2.getSecond()).getMessageId();
                    Boolean boxBoolean = Boxing.boxBoolean(true);
                    this.f42909n = lVar;
                    this.f42910o = pair2;
                    this.f42911p = 2;
                    if (L10.W(chatId, messageId, boxBoolean, this) != coroutine_suspended) {
                        pair = pair2;
                        long longValue = ((Number) pair.getFirst()).longValue();
                        this.f42909n = lVar;
                        this.f42910o = pair;
                        this.f42911p = 3;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 2) {
                    pair = (Pair) this.f42910o;
                    lVar = (Rh.l) this.f42909n;
                    ResultKt.throwOnFailure(obj);
                    long longValue2 = ((Number) pair.getFirst()).longValue();
                    this.f42909n = lVar;
                    this.f42910o = pair;
                    this.f42911p = 3;
                } else {
                    if (i10 == 3) {
                        pair = (Pair) this.f42910o;
                        lVar = (Rh.l) this.f42909n;
                        ResultKt.throwOnFailure(obj);
                        C6152a L11 = WmsConversationsEventsHandler.this.L();
                        String chatId2 = ((MessageEntity) pair.getSecond()).getChatId();
                        String messageId2 = ((MessageEntity) pair.getSecond()).getMessageId();
                        this.f42909n = lVar;
                        this.f42910o = null;
                        this.f42911p = 4;
                        if (L11.W(chatId2, messageId2, null, this) != coroutine_suspended) {
                            it = lVar;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Rh.l lVar3 = (Rh.l) this.f42909n;
                    ResultKt.throwOnFailure(obj);
                    it = lVar3;
                }
            }
            this.f42909n = it;
            this.f42911p = 1;
            Object b10 = it.b(this);
            if (b10 != coroutine_suspended) {
                lVar = it;
                obj = b10;
                if (((Boolean) obj).booleanValue()) {
                }
            }
            return coroutine_suspended;
        }
    }

    public static final class D extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f42913n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42914o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f42915p;

        /* renamed from: r, reason: collision with root package name */
        public int f42917r;

        public D(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42915p = obj;
            this.f42917r |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.v0(null, this);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.conversations.data.wms.handlers.WmsConversationsEventsHandler$a, reason: case insensitive filesystem */
    public static final class C3861a {
        public /* synthetic */ C3861a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WmsConversationsEventsHandler a() {
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            synchronized (WmsConversationsEventsHandler.f42875l) {
                wmsConversationsEventsHandler = WmsConversationsEventsHandler.f42874k;
                if (wmsConversationsEventsHandler == null) {
                    wmsConversationsEventsHandler = new WmsConversationsEventsHandler(null);
                    WmsConversationsEventsHandler.f42874k = wmsConversationsEventsHandler;
                }
            }
            return wmsConversationsEventsHandler;
        }

        public C3861a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zoho.livechat.android.modules.conversations.data.wms.handlers.WmsConversationsEventsHandler$b, reason: case insensitive filesystem */
    public static final class EnumC3862b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC3862b[] $VALUES;

        @NotNull
        private final String value;
        public static final EnumC3862b AcceptTransfer = new EnumC3862b("AcceptTransfer", 0, "acctranschat");
        public static final EnumC3862b AddSupportRepresentative = new EnumC3862b("AddSupportRepresentative", 1, "addsupportrep");
        public static final EnumC3862b AcceptForward = new EnumC3862b("AcceptForward", 2, "acceptforward");
        public static final EnumC3862b ForwardSupport = new EnumC3862b("ForwardSupport", 3, "forwardsupport");
        public static final EnumC3862b JoinSupport = new EnumC3862b("JoinSupport", 4, "joinsupport");
        public static final EnumC3862b TransferChat = new EnumC3862b("TransferChat", 5, "transchat");
        public static final EnumC3862b ReOpen = new EnumC3862b("ReOpen", 6, "reopen");
        public static final EnumC3862b Missed = new EnumC3862b("Missed", 7, "missed");
        public static final EnumC3862b UpdateChatParticipant = new EnumC3862b("UpdateChatParticipant", 8, "updatechatparticipant");
        public static final EnumC3862b ScreenSharing = new EnumC3862b("ScreenSharing", 9, "desktopsharing");
        public static final EnumC3862b Media = new EnumC3862b("Media", 10, "MEDIA");

        private static final /* synthetic */ EnumC3862b[] $values() {
            return new EnumC3862b[]{AcceptTransfer, AddSupportRepresentative, AcceptForward, ForwardSupport, JoinSupport, TransferChat, ReOpen, Missed, UpdateChatParticipant, ScreenSharing, Media};
        }

        static {
            EnumC3862b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EnumC3862b(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<EnumC3862b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC3862b valueOf(String str) {
            return (EnumC3862b) Enum.valueOf(EnumC3862b.class, str);
        }

        public static EnumC3862b[] values() {
            return (EnumC3862b[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.conversations.data.wms.handlers.WmsConversationsEventsHandler$c, reason: case insensitive filesystem */
    public /* synthetic */ class C3863c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Message.g.values().length];
            try {
                iArr[Message.g.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Message.g.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.conversations.data.wms.handlers.WmsConversationsEventsHandler$d, reason: case insensitive filesystem */
    public static final class C3864d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3864d f42918d = new C3864d();

        public C3864d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Rh.j invoke() {
            return Rh.m.b(Integer.MAX_VALUE, null, null, 6, null);
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f42919n;

        /* renamed from: p, reason: collision with root package name */
        public int f42921p;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42919n = obj;
            this.f42921p |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.C(null, null, false, this);
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(WmsConversationsEventsHandler.this.F());
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f42923d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConversationsLocalDataSource invoke() {
            return ConversationsLocalDataSource.INSTANCE.getInstance$mobilisten_release();
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f42924d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Gson invoke() {
            return Yd.a.j();
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f42925d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6152a invoke() {
            return C6152a.f63488c.a();
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            return C6550a.f66357j.a(WmsConversationsEventsHandler.this.F());
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42927n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42928o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42929p;

        /* renamed from: q, reason: collision with root package name */
        public int f42930q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Hashtable f42931r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f42932s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f42931r = hashtable;
            this.f42932s = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f42931r, this.f42932s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((k) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String chatidfromVisitorID;
            SalesIQChat chat;
            Object obj2;
            Object updateConversation;
            k kVar;
            SalesIQChat salesIQChat;
            MessageEntity messageEntity;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            WmsConversationsEventsHandler wmsConversationsEventsHandler2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42930q;
            int i11 = 1;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj3 = this.f42931r.get(StackTraceHelper.ID_KEY);
                String obj4 = obj3 != null ? obj3.toString() : null;
                this.f42931r.put("time", Boxing.boxLong(rd.b.f()));
                if (obj4 == null || !Intrinsics.areEqual(this.f42931r.get("type"), Message.g.RequestLog.getStringValue()) || !ZohoSalesIQ.i.a() || (chat = LiveChatUtil.getChat((chatidfromVisitorID = LiveChatUtil.getChatidfromVisitorID(obj4)))) == null) {
                    return Unit.INSTANCE;
                }
                Hashtable hashtable = this.f42931r;
                WmsConversationsEventsHandler wmsConversationsEventsHandler3 = this.f42932s;
                Object obj5 = hashtable.get("user_id");
                if (obj5 == null) {
                    obj5 = chat.getAttenderid();
                }
                if (obj5 != null) {
                    hashtable.put("sender", obj5);
                }
                Object obj6 = hashtable.get("dname");
                if (obj6 == null) {
                    obj6 = chat.getAttenderName();
                }
                if (obj6 != null) {
                    hashtable.put("dname", obj6);
                }
                MessageEntity h10 = c.h(hashtable, chat.getRchatid(), String.valueOf(rd.b.f()), null, chat, 4, null);
                ConversationsLocalDataSource J10 = wmsConversationsEventsHandler3.J();
                Intrinsics.checkNotNull(chatidfromVisitorID);
                Long boxLong = Boxing.boxLong(h10.getTime().getServerTime());
                Integer boxInt = Boxing.boxInt(chat.getUnreadCount() + 1);
                Message g10 = MessageRoomToDomainKt.g(h10, wmsConversationsEventsHandler3.F(), wmsConversationsEventsHandler3.K(), false, false, null, null, 60, null);
                this.f42927n = wmsConversationsEventsHandler3;
                this.f42928o = chat;
                this.f42929p = h10;
                this.f42930q = 1;
                obj2 = coroutine_suspended;
                updateConversation = J10.updateConversation(chatidfromVisitorID, (r39 & 2) != 0 ? null : boxLong, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : boxInt, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : g10, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                kVar = this;
                if (updateConversation != obj2) {
                    salesIQChat = chat;
                    messageEntity = h10;
                    wmsConversationsEventsHandler = wmsConversationsEventsHandler3;
                }
                return obj2;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                salesIQChat = (SalesIQChat) this.f42928o;
                WmsConversationsEventsHandler wmsConversationsEventsHandler4 = (WmsConversationsEventsHandler) this.f42927n;
                ResultKt.throwOnFailure(obj);
                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler4;
                LiveChatUtil.updateBadgeListener(Kf.a.d() + i11);
                WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler2, salesIQChat.getChid(), null, null, false, false, null, false, 126, null);
                return Unit.INSTANCE;
            }
            MessageEntity messageEntity2 = (MessageEntity) this.f42929p;
            SalesIQChat salesIQChat2 = (SalesIQChat) this.f42928o;
            wmsConversationsEventsHandler = (WmsConversationsEventsHandler) this.f42927n;
            ResultKt.throwOnFailure(obj);
            messageEntity = messageEntity2;
            kVar = this;
            obj2 = coroutine_suspended;
            salesIQChat = salesIQChat2;
            C6152a L10 = wmsConversationsEventsHandler.L();
            kVar.f42927n = wmsConversationsEventsHandler;
            kVar.f42928o = salesIQChat;
            kVar.f42929p = null;
            kVar.f42930q = 2;
            i11 = 1;
            if (L10.T(messageEntity, true, kVar) != obj2) {
                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler;
                LiveChatUtil.updateBadgeListener(Kf.a.d() + i11);
                WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler2, salesIQChat.getChid(), null, null, false, false, null, false, 126, null);
                return Unit.INSTANCE;
            }
            return obj2;
        }
    }

    public static final class l extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public /* synthetic */ Object f42933A;

        /* renamed from: C, reason: collision with root package name */
        public int f42935C;

        /* renamed from: n, reason: collision with root package name */
        public Object f42936n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42937o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42938p;

        /* renamed from: q, reason: collision with root package name */
        public Object f42939q;

        /* renamed from: r, reason: collision with root package name */
        public Object f42940r;

        /* renamed from: s, reason: collision with root package name */
        public Object f42941s;

        /* renamed from: t, reason: collision with root package name */
        public Object f42942t;

        /* renamed from: u, reason: collision with root package name */
        public Object f42943u;

        /* renamed from: v, reason: collision with root package name */
        public Object f42944v;

        /* renamed from: w, reason: collision with root package name */
        public Object f42945w;

        /* renamed from: x, reason: collision with root package name */
        public Object f42946x;

        /* renamed from: y, reason: collision with root package name */
        public Object f42947y;

        /* renamed from: z, reason: collision with root package name */
        public Object f42948z;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42933A = obj;
            this.f42935C |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.S(null, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    public static final class m extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public Object f42949A;

        /* renamed from: B, reason: collision with root package name */
        public Object f42950B;

        /* renamed from: C, reason: collision with root package name */
        public /* synthetic */ Object f42951C;

        /* renamed from: E, reason: collision with root package name */
        public int f42953E;

        /* renamed from: n, reason: collision with root package name */
        public Object f42954n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42955o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42956p;

        /* renamed from: q, reason: collision with root package name */
        public Object f42957q;

        /* renamed from: r, reason: collision with root package name */
        public Object f42958r;

        /* renamed from: s, reason: collision with root package name */
        public Object f42959s;

        /* renamed from: t, reason: collision with root package name */
        public Object f42960t;

        /* renamed from: u, reason: collision with root package name */
        public Object f42961u;

        /* renamed from: v, reason: collision with root package name */
        public Object f42962v;

        /* renamed from: w, reason: collision with root package name */
        public Object f42963w;

        /* renamed from: x, reason: collision with root package name */
        public Object f42964x;

        /* renamed from: y, reason: collision with root package name */
        public Object f42965y;

        /* renamed from: z, reason: collision with root package name */
        public Object f42966z;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42951C = obj;
            this.f42953E |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.T(null, null, null, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    public static final class n extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f42968e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f42969f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f42970g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f42971h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f42972i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f42973j;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f42974n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Throwable f42975o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f42976p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ WmsConversationsEventsHandler f42977q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ List f42978r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f42979s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ boolean f42980t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f42981u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f42982v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th2, Ref.ObjectRef objectRef, WmsConversationsEventsHandler wmsConversationsEventsHandler, List list, String str, boolean z10, Ref.ObjectRef objectRef2, Ref.IntRef intRef, Continuation continuation) {
                super(2, continuation);
                this.f42975o = th2;
                this.f42976p = objectRef;
                this.f42977q = wmsConversationsEventsHandler;
                this.f42978r = list;
                this.f42979s = str;
                this.f42980t = z10;
                this.f42981u = objectRef2;
                this.f42982v = intRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f42975o, this.f42976p, this.f42977q, this.f42978r, this.f42979s, this.f42980t, this.f42981u, this.f42982v, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object updateConversation;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f42974n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!(this.f42975o instanceof CancellationException)) {
                        return Unit.INSTANCE;
                    }
                    String str = (String) this.f42976p.element;
                    if (str == null) {
                        aVar = this;
                        aVar.f42977q.U(aVar.f42978r, aVar.f42979s, (String) aVar.f42976p.element, aVar.f42980t, null, true, (Function0) aVar.f42981u.element);
                        return Unit.INSTANCE;
                    }
                    WmsConversationsEventsHandler wmsConversationsEventsHandler = this.f42977q;
                    Ref.IntRef intRef = this.f42982v;
                    List list = this.f42978r;
                    ConversationsLocalDataSource J10 = wmsConversationsEventsHandler.J();
                    Integer boxInt = Boxing.boxInt(intRef.element + list.size());
                    this.f42974n = 1;
                    updateConversation = J10.updateConversation(str, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : boxInt, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                    aVar = this;
                    if (updateConversation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    updateConversation = obj;
                    aVar = this;
                }
                aVar.f42977q.U(aVar.f42978r, aVar.f42979s, (String) aVar.f42976p.element, aVar.f42980t, null, true, (Function0) aVar.f42981u.element);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef objectRef, List list, String str, boolean z10, Ref.ObjectRef objectRef2, Ref.IntRef intRef) {
            super(1);
            this.f42968e = objectRef;
            this.f42969f = list;
            this.f42970g = str;
            this.f42971h = z10;
            this.f42972i = objectRef2;
            this.f42973j = intRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            AbstractC1459k.d(WmsConversationsEventsHandler.this.E(), null, null, new a(th2, this.f42968e, WmsConversationsEventsHandler.this, this.f42969f, this.f42970g, this.f42971h, this.f42972i, this.f42973j, null), 3, null);
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42983n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42984o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42985p;

        /* renamed from: q, reason: collision with root package name */
        public int f42986q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Hashtable f42987r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f42988s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f42987r = hashtable;
            this.f42988s = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f42987r, this.f42988s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Hashtable hashtable;
            Wh.a aVar;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            String obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42986q;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Wh.a a10 = C6461a.C0913a.f65814a.a();
                hashtable = this.f42987r;
                WmsConversationsEventsHandler wmsConversationsEventsHandler2 = this.f42988s;
                this.f42983n = a10;
                this.f42984o = hashtable;
                this.f42985p = wmsConversationsEventsHandler2;
                this.f42986q = 1;
                if (a10.f(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = a10;
                wmsConversationsEventsHandler = wmsConversationsEventsHandler2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wmsConversationsEventsHandler = (WmsConversationsEventsHandler) this.f42985p;
                hashtable = (Hashtable) this.f42984o;
                aVar = (Wh.a) this.f42983n;
                ResultKt.throwOnFailure(obj);
            }
            try {
                Object obj3 = hashtable.get("chid");
                String chatId = (obj3 == null || (obj2 = obj3.toString()) == null) ? null : wmsConversationsEventsHandler.J().getChatId(obj2);
                if (chatId != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", Boxing.boxBoolean(Boolean.parseBoolean(String.valueOf(hashtable.get("attender_callenabled")))));
                    ContentResolver I10 = wmsConversationsEventsHandler.I();
                    if (I10 != null) {
                        Boxing.boxInt(I10.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{chatId}));
                    }
                    C1908a b10 = C1908a.b(wmsConversationsEventsHandler.F());
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("message", "refreshchat");
                    intent.putExtra("chid", chatId);
                    b10.d(intent);
                }
                Unit unit = Unit.INSTANCE;
                aVar.g(null);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                aVar.g(null);
                throw th2;
            }
        }
    }

    public static final class p extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43015n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43016o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43017p;

        /* renamed from: q, reason: collision with root package name */
        public int f43018q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43019r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f43020s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f43019r = hashtable;
            this.f43020s = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new p(this.f43019r, this.f43020s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((p) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Wh.a a10;
            Hashtable hashtable;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            Wh.a aVar;
            Throwable th2;
            String obj2;
            SalesIQChat chat;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43018q;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a10 = C6461a.C0913a.f65814a.a();
                    Hashtable hashtable2 = this.f43019r;
                    WmsConversationsEventsHandler wmsConversationsEventsHandler2 = this.f43020s;
                    this.f43015n = a10;
                    this.f43016o = hashtable2;
                    this.f43017p = wmsConversationsEventsHandler2;
                    this.f43018q = 1;
                    if (a10.f(null, this) != coroutine_suspended) {
                        hashtable = hashtable2;
                        wmsConversationsEventsHandler = wmsConversationsEventsHandler2;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    chat = (SalesIQChat) this.f43017p;
                    str = (String) this.f43016o;
                    aVar = (Wh.a) this.f43015n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj2 = str;
                        com.zoho.livechat.android.utils.B.d(obj2, chat);
                        Unit unit = Unit.INSTANCE;
                        aVar.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar.g(null);
                        throw th2;
                    }
                }
                wmsConversationsEventsHandler = (WmsConversationsEventsHandler) this.f43017p;
                hashtable = (Hashtable) this.f43016o;
                Wh.a aVar2 = (Wh.a) this.f43015n;
                ResultKt.throwOnFailure(obj);
                a10 = aVar2;
                Object obj3 = hashtable.get("ack_key");
                if (obj3 == null) {
                    obj3 = hashtable.get("chid");
                }
                obj2 = obj3 != null ? obj3.toString() : null;
                if (obj2 != null) {
                    SalesIQChat chat$default = ConversationsLocalDataSource.getChat$default(wmsConversationsEventsHandler.J(), obj2, false, 2, null);
                    C6966g.z(obj2);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("STATUS", Boxing.boxInt(3));
                    contentValues.put("ATTENDER_ID", "");
                    contentValues.put("ATTENDER", "");
                    contentValues.put("ATTENDER_IMGKEY", "");
                    contentValues.put("ATTENDER_EMAIL", "");
                    contentValues.put("UNREAD_COUNT", Boxing.boxInt(0));
                    contentValues.put("TIMER_START_TIME", Boxing.boxInt(0));
                    contentValues.put("TIMER_END_TIME", Boxing.boxInt(0));
                    contentValues.put("QUEUEPOSITION", Boxing.boxInt(-1));
                    contentValues.put("QUEUE_END_TIME", Boxing.boxInt(-1));
                    contentValues.put("QUEUE_START_TIME", Boxing.boxInt(-1));
                    contentValues.put("LMTIME", Boxing.boxLong(rd.b.f()));
                    contentValues.put("SHOW_QUEUE", Boxing.boxInt(0));
                    if ((chat$default != null ? chat$default.getType() : null) == SalesIQChat.c.Chat) {
                        LiveChatUtil.removeActiveChatPKID();
                    }
                    ContentResolver I10 = wmsConversationsEventsHandler.I();
                    if (I10 != null) {
                        Boxing.boxInt(I10.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{obj2}));
                    }
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("message", "refreshchat");
                    intent.putExtra("chid", obj2);
                    C1908a.b(wmsConversationsEventsHandler.F()).d(intent);
                    intent.putExtra("message", "refreshchatlist");
                    C1908a.b(wmsConversationsEventsHandler.F()).d(intent);
                    chat = LiveChatUtil.getChat(obj2);
                    if (chat != null) {
                        LiveChatUtil.triggerChatListener("CHAT_MISSED", chat);
                        if (chat.getType() != SalesIQChat.c.Call) {
                            aVar = a10;
                            com.zoho.livechat.android.utils.B.d(obj2, chat);
                            Unit unit2 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        }
                        this.f43015n = a10;
                        this.f43016o = obj2;
                        this.f43017p = chat;
                        this.f43018q = 2;
                        if (AbstractC1440a0.a(7500L, this) != coroutine_suspended) {
                            aVar = a10;
                            str = obj2;
                            obj2 = str;
                            com.zoho.livechat.android.utils.B.d(obj2, chat);
                            Unit unit22 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                }
                aVar = a10;
                Unit unit222 = Unit.INSTANCE;
                aVar.g(null);
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                aVar = a10;
                th2 = th4;
                aVar.g(null);
                throw th2;
            }
        }
    }

    public static final class q extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43021n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43022o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43023p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f43024q;

        /* renamed from: s, reason: collision with root package name */
        public int f43026s;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43024q = obj;
            this.f43026s |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.Z(null, null, null, this);
        }
    }

    public static final class r extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43027n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43028o;

        /* renamed from: p, reason: collision with root package name */
        public int f43029p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43030q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Hashtable hashtable, Continuation continuation) {
            super(2, continuation);
            this.f43030q = hashtable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.f43030q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((r) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Wh.a a10;
            Hashtable hashtable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43029p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a10 = C6461a.C0913a.f65814a.a();
                Hashtable hashtable2 = this.f43030q;
                this.f43027n = a10;
                this.f43028o = hashtable2;
                this.f43029p = 1;
                if (a10.f(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hashtable = hashtable2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hashtable = (Hashtable) this.f43028o;
                a10 = (Wh.a) this.f43027n;
                ResultKt.throwOnFailure(obj);
            }
            try {
                rd.b.e().k(hashtable);
                Unit unit = Unit.INSTANCE;
                a10.g(null);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                a10.g(null);
                throw th2;
            }
        }
    }

    public static final class s extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43031n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43032o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f43033p;

        /* renamed from: r, reason: collision with root package name */
        public int f43035r;

        public s(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43033p = obj;
            this.f43035r |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.c0(null, null, null, this);
        }
    }

    public static final class t extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43036n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43037o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43038p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43039q;

        /* renamed from: r, reason: collision with root package name */
        public int f43040r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43041s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f43042t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f43041s = hashtable;
            this.f43042t = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new t(this.f43041s, this.f43042t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((t) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Hashtable hashtable;
            Wh.a aVar;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            Wh.a aVar2;
            String chatId;
            Object obj2;
            String str;
            WmsConversationsEventsHandler wmsConversationsEventsHandler2;
            String str2;
            String attenderName;
            Object obj3;
            String obj4;
            Object obj5;
            String obj6;
            Object obj7;
            String obj8;
            String obj9;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43040r;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Wh.a a10 = C6461a.C0913a.f65814a.a();
                    hashtable = this.f43041s;
                    WmsConversationsEventsHandler wmsConversationsEventsHandler3 = this.f43042t;
                    this.f43036n = a10;
                    this.f43037o = hashtable;
                    this.f43038p = wmsConversationsEventsHandler3;
                    this.f43040r = 1;
                    if (a10.f(null, this) != coroutine_suspended) {
                        aVar = a10;
                        wmsConversationsEventsHandler = wmsConversationsEventsHandler3;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) this.f43039q;
                    str2 = (String) this.f43038p;
                    wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) this.f43037o;
                    aVar2 = (Wh.a) this.f43036n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj2 = obj;
                        str = str3;
                        Td.e.W0(null, null, str, obj2, null, null, null, 112, null);
                        chatId = str2;
                        wmsConversationsEventsHandler = wmsConversationsEventsHandler2;
                        C1908a b10 = C1908a.b(wmsConversationsEventsHandler.F());
                        Intent intent = new Intent("receivelivechat");
                        intent.putExtra("message", "refreshchat");
                        intent.putExtra("chid", chatId);
                        b10.d(intent);
                        Unit unit = Unit.INSTANCE;
                        aVar2.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.g(null);
                        throw th;
                    }
                }
                wmsConversationsEventsHandler = (WmsConversationsEventsHandler) this.f43038p;
                hashtable = (Hashtable) this.f43037o;
                aVar = (Wh.a) this.f43036n;
                ResultKt.throwOnFailure(obj);
                Object obj10 = hashtable.get("chid");
                chatId = (obj10 == null || (obj9 = obj10.toString()) == null) ? null : wmsConversationsEventsHandler.J().getChatId(obj9);
                if (chatId == null) {
                    aVar2 = aVar;
                    Unit unit2 = Unit.INSTANCE;
                    aVar2.g(null);
                    return Unit.INSTANCE;
                }
                Object obj11 = hashtable.get("opruser");
                Hashtable hashtable2 = obj11 instanceof Hashtable ? (Hashtable) obj11 : null;
                ContentValues contentValues = new ContentValues();
                contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", Boxing.boxBoolean(Boolean.parseBoolean(String.valueOf(hashtable.get("attender_callenabled")))));
                if (hashtable2 != null && (obj7 = hashtable2.get("lsuid")) != null && (obj8 = obj7.toString()) != null) {
                    contentValues.put("ATTENDER_ID", obj8);
                }
                if (hashtable2 != null && (obj5 = hashtable2.get("dname")) != null && (obj6 = obj5.toString()) != null) {
                    contentValues.put("ATTENDER", obj6);
                }
                if (hashtable2 != null && (obj3 = hashtable2.get("image_fkey")) != null && (obj4 = obj3.toString()) != null) {
                    contentValues.put("ATTENDER_IMGKEY", obj4);
                }
                ContentResolver I10 = wmsConversationsEventsHandler.I();
                if (I10 != null) {
                    Boxing.boxInt(I10.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{chatId}));
                }
                SalesIQChat chat$default = ConversationsLocalDataSource.getChat$default(wmsConversationsEventsHandler.J(), chatId, false, 2, null);
                String K10 = Td.e.K();
                if (K10 != null) {
                    if (Intrinsics.areEqual(K10, chat$default != null ? chat$default.getVisitorid() : null)) {
                        String W10 = Td.e.W(Te.a.I(chat$default != null ? chat$default.getConvID() : null), chat$default);
                        if (W10 == null) {
                            if (chat$default == null || (attenderName = chat$default.getAttenderName()) == null || (W10 = og.m.d(attenderName)) == null || !Td.e.f11456a.G()) {
                                W10 = null;
                            }
                            if (W10 == null) {
                                W10 = Td.e.B();
                            }
                        }
                        Td.e eVar = Td.e.f11456a;
                        String attenderid = chat$default != null ? chat$default.getAttenderid() : null;
                        this.f43036n = aVar;
                        this.f43037o = wmsConversationsEventsHandler;
                        this.f43038p = chatId;
                        this.f43039q = W10;
                        this.f43040r = 2;
                        Object S10 = eVar.S(attenderid, this);
                        if (S10 != coroutine_suspended) {
                            obj2 = S10;
                            str = W10;
                            aVar2 = aVar;
                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler;
                            str2 = chatId;
                            Td.e.W0(null, null, str, obj2, null, null, null, 112, null);
                            chatId = str2;
                            wmsConversationsEventsHandler = wmsConversationsEventsHandler2;
                            C1908a b102 = C1908a.b(wmsConversationsEventsHandler.F());
                            Intent intent2 = new Intent("receivelivechat");
                            intent2.putExtra("message", "refreshchat");
                            intent2.putExtra("chid", chatId);
                            b102.d(intent2);
                            Unit unit22 = Unit.INSTANCE;
                            aVar2.g(null);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                }
                aVar2 = aVar;
                C1908a b1022 = C1908a.b(wmsConversationsEventsHandler.F());
                Intent intent22 = new Intent("receivelivechat");
                intent22.putExtra("message", "refreshchat");
                intent22.putExtra("chid", chatId);
                b1022.d(intent22);
                Unit unit222 = Unit.INSTANCE;
                aVar2.g(null);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                aVar2.g(null);
                throw th;
            }
        }
    }

    public static final class u extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43043n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43044o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43045p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f43046q;

        /* renamed from: s, reason: collision with root package name */
        public int f43048s;

        public u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43046q = obj;
            this.f43048s |= Integer.MIN_VALUE;
            return WmsConversationsEventsHandler.this.e0(null, null, null, this);
        }
    }

    public static final class v extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43049n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43050o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43051p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43052q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43053r;

        /* renamed from: s, reason: collision with root package name */
        public Object f43054s;

        /* renamed from: t, reason: collision with root package name */
        public Object f43055t;

        /* renamed from: u, reason: collision with root package name */
        public Object f43056u;

        /* renamed from: v, reason: collision with root package name */
        public int f43057v;

        /* renamed from: w, reason: collision with root package name */
        public int f43058w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f43059x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43060y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f43061z;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43062n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ WmsConversationsEventsHandler f43063o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
                super(2, continuation);
                this.f43063o = wmsConversationsEventsHandler;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f43063o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
            
                if (qf.C6152a.U(r3, r4, false, r9, 2, null) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
            
                if (Ph.AbstractC1440a0.a(2000, r9) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f43062n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f43062n = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (og.i.e(this.f43063o.f42881f)) {
                    C6152a L10 = this.f43063o.L();
                    MessageEntity messageEntity = this.f43063o.f42881f;
                    Intrinsics.checkNotNull(messageEntity);
                    this.f43062n = 2;
                }
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC3862b.values().length];
                try {
                    iArr[EnumC3862b.AcceptTransfer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3862b.AddSupportRepresentative.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC3862b.AcceptForward.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC3862b.ForwardSupport.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC3862b.JoinSupport.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC3862b.UpdateChatParticipant.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC3862b.TransferChat.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC3862b.Missed.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC3862b.ReOpen.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC3862b.ScreenSharing.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC3862b.Media.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f43059x = str;
            this.f43060y = hashtable;
            this.f43061z = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new v(this.f43059x, this.f43060y, this.f43061z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((v) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0409, code lost:
        
            if (r15.c0(r14, r11, r0, r3) == r6) goto L127;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x043a  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0410 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0422  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0424  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x02c1 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x02e7 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0305 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x030c A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x032a A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0348 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0366 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0384 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x03a0 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x03c8 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x03e4 A[Catch: all -> 0x002d, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02b3 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #6 {all -> 0x002d, blocks: (B:8:0x0028, B:10:0x040c, B:12:0x0410, B:13:0x0418, B:16:0x0425, B:17:0x043c, B:35:0x0296, B:41:0x02c1, B:46:0x02e7, B:49:0x0305, B:50:0x030c, B:53:0x032a, B:56:0x0348, B:59:0x0366, B:62:0x0384, B:65:0x03a0, B:67:0x03a6, B:68:0x03ac, B:72:0x03c8, B:75:0x03e4, B:77:0x03ea, B:78:0x03f0, B:82:0x02b3), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0241 A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #5 {all -> 0x010b, blocks: (B:32:0x0100, B:89:0x0241, B:92:0x0257), top: B:2:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0255 A[ADDED_TO_REGION] */
        /* JADX WARN: Type inference failed for: r0v58, types: [int] */
        /* JADX WARN: Type inference failed for: r0v60, types: [int] */
        /* JADX WARN: Type inference failed for: r0v61, types: [int] */
        /* JADX WARN: Type inference failed for: r0v62, types: [int] */
        /* JADX WARN: Type inference failed for: r0v63, types: [int] */
        /* JADX WARN: Type inference failed for: r0v64, types: [int] */
        /* JADX WARN: Type inference failed for: r0v65, types: [int] */
        /* JADX WARN: Type inference failed for: r0v66, types: [int] */
        /* JADX WARN: Type inference failed for: r0v67, types: [int] */
        /* JADX WARN: Type inference failed for: r0v68, types: [int] */
        /* JADX WARN: Type inference failed for: r0v76, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wh.a aVar;
            String str;
            Hashtable hashtable;
            Wh.a aVar2;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            String str2;
            Wh.a aVar3;
            SalesIQChat chat;
            Message g10;
            Object obj2;
            EnumC3862b enumC3862b;
            Message message;
            EnumC3862b enumC3862b2;
            Wh.a aVar4;
            String str3;
            MessageEntity messageEntity;
            Hashtable hashtable2;
            WmsConversationsEventsHandler wmsConversationsEventsHandler2;
            WmsConversationsEventsHandler wmsConversationsEventsHandler3;
            Wh.a aVar5;
            String str4;
            Hashtable hashtable3;
            MessageEntity messageEntity2;
            SalesIQChat salesIQChat;
            boolean contains;
            boolean z10;
            Object Y10;
            MessageEntity messageEntity3;
            Message message2;
            WmsConversationsEventsHandler wmsConversationsEventsHandler4;
            String str5;
            EnumC3862b enumC3862b3;
            Hashtable hashtable4;
            EnumC3862b enumC3862b4;
            MessageEntity messageEntity4;
            WmsConversationsEventsHandler wmsConversationsEventsHandler5;
            boolean z11;
            MessageEntity messageEntity5;
            WmsConversationsEventsHandler wmsConversationsEventsHandler6;
            boolean z12;
            v vVar = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                try {
                    switch (vVar.f43058w) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            Wh.a a10 = C6461a.C0913a.f65814a.a();
                            str = vVar.f43059x;
                            Hashtable hashtable5 = vVar.f43060y;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler7 = vVar.f43061z;
                            vVar.f43049n = a10;
                            vVar.f43050o = str;
                            vVar.f43051p = hashtable5;
                            vVar.f43052q = wmsConversationsEventsHandler7;
                            vVar.f43058w = 1;
                            if (a10.f(null, vVar) != coroutine_suspended) {
                                hashtable = hashtable5;
                                aVar2 = a10;
                                wmsConversationsEventsHandler = wmsConversationsEventsHandler7;
                                str2 = str;
                                if (str2 != null) {
                                    aVar = aVar2;
                                    Unit unit = Unit.INSTANCE;
                                    aVar.g(null);
                                    return Unit.INSTANCE;
                                }
                                try {
                                    String chatid = LiveChatUtil.getChatid(str2);
                                    chat = LiveChatUtil.getChat(chatid);
                                    MessageEntity h10 = c.h(hashtable, str2, null, null, null, 14, null);
                                    g10 = MessageRoomToDomainKt.g(h10, wmsConversationsEventsHandler.F(), wmsConversationsEventsHandler.K(), false, false, null, null, 60, null);
                                    Iterator it = EnumC3862b.getEntries().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            try {
                                                obj2 = it.next();
                                                String value = ((EnumC3862b) obj2).getValue();
                                                Object obj3 = hashtable.get("module");
                                                if (Intrinsics.areEqual(value, obj3 != null ? obj3.toString() : null)) {
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                aVar = aVar2;
                                                aVar.g(null);
                                                throw th;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    enumC3862b = (EnumC3862b) obj2;
                                    if (enumC3862b == EnumC3862b.ReOpen) {
                                        wmsConversationsEventsHandler.f42881f = h10;
                                        AbstractC1459k.d(wmsConversationsEventsHandler.E(), null, null, new a(wmsConversationsEventsHandler, null), 3, null);
                                        wmsConversationsEventsHandler3 = wmsConversationsEventsHandler;
                                        aVar5 = aVar2;
                                        str4 = chatid;
                                        hashtable3 = hashtable;
                                        messageEntity2 = h10;
                                        salesIQChat = chat;
                                        contains = enumC3862b != null ? CollectionsKt.listOf((Object[]) new EnumC3862b[]{EnumC3862b.AcceptTransfer, EnumC3862b.AcceptForward}).contains(enumC3862b) : false;
                                        if (contains || str4 == null) {
                                            boolean z13 = contains ? 1 : 0;
                                            String str6 = str4;
                                            enumC3862b4 = enumC3862b;
                                            aVar = aVar5;
                                            switch (enumC3862b4 == null ? -1 : b.$EnumSwitchMapping$0[enumC3862b4.ordinal()]) {
                                                case 1:
                                                    Object obj4 = hashtable3.get("attenderemail");
                                                    String obj5 = obj4 != null ? obj4.toString() : null;
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 4;
                                                    break;
                                                case 2:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 5;
                                                    if (wmsConversationsEventsHandler3.o0(str6, salesIQChat, g10, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                        Q.f44447F.J(false);
                                                        ne.j.s0(false, 1, null);
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit2 = Unit.INSTANCE;
                                                    Unit unit3 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 3:
                                                    Object obj6 = hashtable3.get("attenderemail");
                                                    String obj7 = obj6 != null ? obj6.toString() : null;
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 6;
                                                    if (wmsConversationsEventsHandler3.c0(salesIQChat, g10, obj7, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit22 = Unit.INSTANCE;
                                                    Unit unit32 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 4:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 7;
                                                    if (wmsConversationsEventsHandler3.e0(str6, hashtable3, g10, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit222 = Unit.INSTANCE;
                                                    Unit unit322 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 5:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 8;
                                                    if (wmsConversationsEventsHandler3.h0(str6, salesIQChat, g10, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit2222 = Unit.INSTANCE;
                                                    Unit unit3222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 6:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 9;
                                                    if (wmsConversationsEventsHandler3.Z(str6, g10, salesIQChat, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit22222 = Unit.INSTANCE;
                                                    Unit unit32222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 7:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 10;
                                                    if (wmsConversationsEventsHandler3.q0(str6, salesIQChat, g10, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit222222 = Unit.INSTANCE;
                                                    Unit unit322222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 8:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 11;
                                                    if (wmsConversationsEventsHandler3.X(str6, g10, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit2222222 = Unit.INSTANCE;
                                                    Unit unit3222222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 9:
                                                    wmsConversationsEventsHandler3.b0(salesIQChat, g10, messageEntity2);
                                                    messageEntity4 = messageEntity2;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler3;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit22222222 = Unit.INSTANCE;
                                                    Unit unit32222222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 10:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 12;
                                                    if (wmsConversationsEventsHandler3.n0(salesIQChat, g10, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit222222222 = Unit.INSTANCE;
                                                    Unit unit322222222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                case 11:
                                                    vVar.f43049n = aVar;
                                                    vVar.f43050o = wmsConversationsEventsHandler3;
                                                    vVar.f43051p = messageEntity2;
                                                    vVar.f43052q = enumC3862b4;
                                                    vVar.f43053r = null;
                                                    vVar.f43054s = null;
                                                    vVar.f43055t = null;
                                                    vVar.f43056u = null;
                                                    vVar.f43057v = contains ? 1 : 0;
                                                    vVar.f43058w = 13;
                                                    if (wmsConversationsEventsHandler3.i0(salesIQChat, g10, vVar) == coroutine_suspended) {
                                                        break;
                                                    }
                                                    z11 = contains ? 1 : 0;
                                                    messageEntity5 = messageEntity2;
                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                    messageEntity4 = messageEntity5;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                                                    contains = z11;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit2222222222 = Unit.INSTANCE;
                                                    Unit unit3222222222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                                default:
                                                    messageEntity4 = messageEntity2;
                                                    wmsConversationsEventsHandler5 = wmsConversationsEventsHandler3;
                                                    if (enumC3862b4 != EnumC3862b.Missed) {
                                                    }
                                                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                                                    Unit unit22222222222 = Unit.INSTANCE;
                                                    Unit unit32222222222 = Unit.INSTANCE;
                                                    aVar.g(null);
                                                    return Unit.INSTANCE;
                                            }
                                        } else {
                                            C6152a L10 = wmsConversationsEventsHandler3.L();
                                            long serverTime = messageEntity2.getTime().getServerTime();
                                            vVar.f43049n = aVar5;
                                            vVar.f43050o = hashtable3;
                                            vVar.f43051p = wmsConversationsEventsHandler3;
                                            vVar.f43052q = str4;
                                            vVar.f43053r = salesIQChat;
                                            vVar.f43054s = messageEntity2;
                                            vVar.f43055t = g10;
                                            vVar.f43056u = enumC3862b;
                                            vVar.f43057v = contains ? 1 : 0;
                                            vVar.f43058w = 3;
                                            Hashtable hashtable6 = hashtable3;
                                            z10 = contains ? 1 : 0;
                                            try {
                                                Y10 = L10.Y(str4, serverTime, true, vVar);
                                                vVar = vVar;
                                                if (Y10 != coroutine_suspended) {
                                                    messageEntity3 = messageEntity2;
                                                    message2 = g10;
                                                    wmsConversationsEventsHandler4 = wmsConversationsEventsHandler3;
                                                    str5 = str4;
                                                    enumC3862b3 = enumC3862b;
                                                    hashtable4 = hashtable6;
                                                    aVar5 = aVar5;
                                                    wmsConversationsEventsHandler3 = wmsConversationsEventsHandler4;
                                                    hashtable3 = hashtable4;
                                                    enumC3862b = enumC3862b3;
                                                    g10 = message2;
                                                    str4 = str5;
                                                    messageEntity2 = messageEntity3;
                                                    contains = z10;
                                                    String str62 = str4;
                                                    enumC3862b4 = enumC3862b;
                                                    aVar = aVar5;
                                                    switch (enumC3862b4 == null ? -1 : b.$EnumSwitchMapping$0[enumC3862b4.ordinal()]) {
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                aVar = aVar5;
                                                aVar.g(null);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        C6152a L11 = wmsConversationsEventsHandler.L();
                                        vVar.f43049n = aVar2;
                                        vVar.f43050o = hashtable;
                                        vVar.f43051p = wmsConversationsEventsHandler;
                                        vVar.f43052q = chatid;
                                        vVar.f43053r = chat;
                                        vVar.f43054s = h10;
                                        vVar.f43055t = g10;
                                        vVar.f43056u = enumC3862b;
                                        vVar.f43058w = 2;
                                        WmsConversationsEventsHandler wmsConversationsEventsHandler8 = wmsConversationsEventsHandler;
                                        aVar3 = aVar2;
                                        try {
                                            if (C6152a.U(L11, h10, false, vVar, 2, null) != coroutine_suspended) {
                                                message = g10;
                                                enumC3862b2 = enumC3862b;
                                                aVar4 = aVar3;
                                                str3 = chatid;
                                                chat = chat;
                                                messageEntity = h10;
                                                hashtable2 = hashtable;
                                                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler8;
                                                wmsConversationsEventsHandler3 = wmsConversationsEventsHandler2;
                                                aVar5 = aVar4;
                                                enumC3862b = enumC3862b2;
                                                messageEntity2 = messageEntity;
                                                hashtable3 = hashtable2;
                                                g10 = message;
                                                str4 = str3;
                                                salesIQChat = chat;
                                                if (enumC3862b != null) {
                                                }
                                                if (contains) {
                                                }
                                                boolean z132 = contains ? 1 : 0;
                                                String str622 = str4;
                                                enumC3862b4 = enumC3862b;
                                                aVar = aVar5;
                                                switch (enumC3862b4 == null ? -1 : b.$EnumSwitchMapping$0[enumC3862b4.ordinal()]) {
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            aVar = aVar3;
                                            aVar.g(null);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    aVar3 = aVar2;
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            wmsConversationsEventsHandler = (WmsConversationsEventsHandler) vVar.f43052q;
                            Hashtable hashtable7 = (Hashtable) vVar.f43051p;
                            str = (String) vVar.f43050o;
                            Wh.a aVar6 = (Wh.a) vVar.f43049n;
                            ResultKt.throwOnFailure(obj);
                            hashtable = hashtable7;
                            aVar2 = aVar6;
                            str2 = str;
                            if (str2 != null) {
                            }
                            break;
                        case 2:
                            enumC3862b2 = (EnumC3862b) vVar.f43056u;
                            message = (Message) vVar.f43055t;
                            messageEntity = (MessageEntity) vVar.f43054s;
                            chat = (SalesIQChat) vVar.f43053r;
                            str3 = (String) vVar.f43052q;
                            wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) vVar.f43051p;
                            hashtable2 = (Hashtable) vVar.f43050o;
                            aVar4 = (Wh.a) vVar.f43049n;
                            try {
                                ResultKt.throwOnFailure(obj);
                                wmsConversationsEventsHandler3 = wmsConversationsEventsHandler2;
                                aVar5 = aVar4;
                                enumC3862b = enumC3862b2;
                                messageEntity2 = messageEntity;
                                hashtable3 = hashtable2;
                                g10 = message;
                                str4 = str3;
                                salesIQChat = chat;
                                if (enumC3862b != null) {
                                }
                                if (contains) {
                                }
                                boolean z1322 = contains ? 1 : 0;
                                String str6222 = str4;
                                enumC3862b4 = enumC3862b;
                                aVar = aVar5;
                                switch (enumC3862b4 == null ? -1 : b.$EnumSwitchMapping$0[enumC3862b4.ordinal()]) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                aVar = aVar4;
                                aVar.g(null);
                                throw th;
                            }
                        case 3:
                            ?? r02 = vVar.f43057v;
                            enumC3862b3 = (EnumC3862b) vVar.f43056u;
                            message2 = (Message) vVar.f43055t;
                            messageEntity3 = (MessageEntity) vVar.f43054s;
                            SalesIQChat salesIQChat2 = (SalesIQChat) vVar.f43053r;
                            str5 = (String) vVar.f43052q;
                            wmsConversationsEventsHandler4 = (WmsConversationsEventsHandler) vVar.f43051p;
                            hashtable4 = (Hashtable) vVar.f43050o;
                            aVar5 = (Wh.a) vVar.f43049n;
                            ResultKt.throwOnFailure(obj);
                            z10 = r02;
                            salesIQChat = salesIQChat2;
                            Y10 = obj;
                            aVar5 = aVar5;
                            wmsConversationsEventsHandler3 = wmsConversationsEventsHandler4;
                            hashtable3 = hashtable4;
                            enumC3862b = enumC3862b3;
                            g10 = message2;
                            str4 = str5;
                            messageEntity2 = messageEntity3;
                            contains = z10;
                            String str62222 = str4;
                            enumC3862b4 = enumC3862b;
                            aVar = aVar5;
                            switch (enumC3862b4 == null ? -1 : b.$EnumSwitchMapping$0[enumC3862b4.ordinal()]) {
                            }
                        case 4:
                            ?? r03 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r03;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit222222222222 = Unit.INSTANCE;
                            Unit unit322222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 5:
                            ?? r04 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r04;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit2222222222222 = Unit.INSTANCE;
                            Unit unit3222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 6:
                            ?? r05 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r05;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit22222222222222 = Unit.INSTANCE;
                            Unit unit32222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 7:
                            ?? r06 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r06;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit222222222222222 = Unit.INSTANCE;
                            Unit unit322222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 8:
                            ?? r07 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r07;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit2222222222222222 = Unit.INSTANCE;
                            Unit unit3222222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 9:
                            ?? r08 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r08;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit22222222222222222 = Unit.INSTANCE;
                            Unit unit32222222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 10:
                            ?? r09 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r09;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit222222222222222222 = Unit.INSTANCE;
                            Unit unit322222222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 11:
                            ?? r010 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r010;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit2222222222222222222 = Unit.INSTANCE;
                            Unit unit3222222222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 12:
                            ?? r011 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r011;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit22222222222222222222 = Unit.INSTANCE;
                            Unit unit32222222222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        case 13:
                            ?? r012 = vVar.f43057v;
                            enumC3862b4 = (EnumC3862b) vVar.f43052q;
                            messageEntity5 = (MessageEntity) vVar.f43051p;
                            wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) vVar.f43050o;
                            aVar = (Wh.a) vVar.f43049n;
                            z12 = r012;
                            ResultKt.throwOnFailure(obj);
                            z11 = z12;
                            messageEntity4 = messageEntity5;
                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler6;
                            contains = z11;
                            if (enumC3862b4 != EnumC3862b.Missed) {
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler5, messageEntity4.getChatId(), messageEntity4.getAcknowledgementKey(), messageEntity4, true, contains, null, false, 96, null);
                            Unit unit222222222222222222222 = Unit.INSTANCE;
                            Unit unit322222222222222222222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public static final class w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43064n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43065o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43066p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43067q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43068r;

        /* renamed from: s, reason: collision with root package name */
        public Object f43069s;

        /* renamed from: t, reason: collision with root package name */
        public Object f43070t;

        /* renamed from: u, reason: collision with root package name */
        public Object f43071u;

        /* renamed from: v, reason: collision with root package name */
        public long f43072v;

        /* renamed from: w, reason: collision with root package name */
        public int f43073w;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43075y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Hashtable hashtable, Continuation continuation) {
            super(2, continuation);
            this.f43075y = hashtable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WmsConversationsEventsHandler.this.new w(this.f43075y, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((w) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Not initialized variable reg: 15, insn: 0x00d1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:210), block:B:127:0x00d0 */
        /* JADX WARN: Removed duplicated region for block: B:16:0x02aa A[Catch: all -> 0x02bd, TryCatch #8 {all -> 0x02bd, blocks: (B:14:0x02a0, B:16:0x02aa, B:17:0x02d4), top: B:13:0x02a0 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x027e A[Catch: all -> 0x02c2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02c2, blocks: (B:35:0x0264, B:39:0x027e, B:66:0x0226), top: B:65:0x0226 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x02c5  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x025e  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Wh.a aVar;
            Wh.a aVar2;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            Wh.a aVar3;
            Hashtable hashtable;
            WmsConversationsEventsHandler wmsConversationsEventsHandler2;
            Object w10;
            String str;
            long j10;
            Hashtable hashtable2;
            String str2;
            String str3;
            String str4;
            String obj3;
            Wh.a aVar4;
            Wh.a aVar5;
            MessageEntity messageEntity;
            Message g10;
            String str5;
            long j11;
            int i10;
            boolean z10;
            Object updateConversation;
            Object obj4;
            String str6;
            Message message;
            Hashtable hashtable3;
            String str7;
            String str8;
            String str9;
            WmsConversationsEventsHandler wmsConversationsEventsHandler3;
            Wh.a aVar6;
            C6152a L10;
            Boolean boxBoolean;
            Long boxLong;
            String str10;
            w wVar;
            Object obj5;
            boolean z11;
            String str11;
            Message message2;
            String str12;
            String str13;
            String str14;
            boolean areEqual;
            Object w11;
            WmsConversationsEventsHandler wmsConversationsEventsHandler4;
            MessageEntity messageEntity2;
            w wVar2 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = wVar2.f43073w;
            try {
            } catch (Throwable th2) {
                th = th2;
                obj2 = null;
                aVar2 = aVar;
            }
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Wh.a d10 = C6461a.C0913a.f65814a.d();
                wmsConversationsEventsHandler = WmsConversationsEventsHandler.this;
                Hashtable hashtable4 = wVar2.f43075y;
                wVar2.f43064n = d10;
                wVar2.f43065o = wmsConversationsEventsHandler;
                wVar2.f43066p = hashtable4;
                wVar2.f43073w = 1;
                if (d10.f(null, wVar2) != coroutine_suspended) {
                    aVar3 = d10;
                    hashtable = hashtable4;
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                Hashtable hashtable5 = (Hashtable) wVar2.f43066p;
                wmsConversationsEventsHandler = (WmsConversationsEventsHandler) wVar2.f43065o;
                Wh.a aVar7 = (Wh.a) wVar2.f43064n;
                ResultKt.throwOnFailure(obj);
                hashtable = hashtable5;
                aVar3 = aVar7;
            } else {
                if (i11 != 2) {
                    if (i11 == 3) {
                        long j12 = wVar2.f43072v;
                        Message message3 = (Message) wVar2.f43071u;
                        String str15 = (String) wVar2.f43070t;
                        String str16 = (String) wVar2.f43069s;
                        str6 = (String) wVar2.f43068r;
                        str7 = (String) wVar2.f43067q;
                        hashtable3 = (Hashtable) wVar2.f43066p;
                        wmsConversationsEventsHandler3 = (WmsConversationsEventsHandler) wVar2.f43065o;
                        aVar6 = (Wh.a) wVar2.f43064n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            j11 = j12;
                            str8 = str16;
                            obj4 = coroutine_suspended;
                            i10 = 4;
                            z10 = true;
                            message = message3;
                            str9 = str15;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = aVar6;
                        }
                        try {
                            L10 = wmsConversationsEventsHandler3.L();
                            boxBoolean = Boxing.boxBoolean(Boolean.parseBoolean(String.valueOf(hashtable3.get("isdeleted"))));
                            boxLong = Boxing.boxLong(j11);
                            wVar2.f43064n = aVar6;
                            wVar2.f43065o = wmsConversationsEventsHandler3;
                            wVar2.f43066p = hashtable3;
                            wVar2.f43067q = str7;
                            wVar2.f43068r = str6;
                            wVar2.f43069s = str8;
                            wVar2.f43070t = str9;
                            wVar2.f43071u = message;
                            wVar2.f43073w = i10;
                            str10 = str6;
                            wVar = wVar2;
                            obj5 = obj4;
                            z11 = false;
                            wVar2 = wVar;
                            if (L10.V(str10, str9, boxBoolean, boxLong, wVar) != obj5) {
                                return obj5;
                            }
                            str11 = str9;
                            message2 = message;
                            str12 = str8;
                            str13 = str7;
                            str14 = str10;
                            AbstractC3934c.n(str12);
                            if (message2 == null) {
                            }
                            if (!areEqual) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj2 = null;
                            aVar2 = aVar6;
                            aVar2.g(obj2);
                            throw th;
                        }
                    } else if (i11 == 4) {
                        message2 = (Message) wVar2.f43071u;
                        String str17 = (String) wVar2.f43070t;
                        String str18 = (String) wVar2.f43069s;
                        String str19 = (String) wVar2.f43068r;
                        String str20 = (String) wVar2.f43067q;
                        Hashtable hashtable6 = (Hashtable) wVar2.f43066p;
                        WmsConversationsEventsHandler wmsConversationsEventsHandler5 = (WmsConversationsEventsHandler) wVar2.f43065o;
                        Wh.a aVar8 = (Wh.a) wVar2.f43064n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            hashtable3 = hashtable6;
                            wmsConversationsEventsHandler3 = wmsConversationsEventsHandler5;
                            aVar6 = aVar8;
                            z10 = true;
                            z11 = false;
                            str12 = str18;
                            str14 = str19;
                            str13 = str20;
                            obj5 = coroutine_suspended;
                            str11 = str17;
                            AbstractC3934c.n(str12);
                            if (message2 == null) {
                                try {
                                    areEqual = Intrinsics.areEqual(message2.isDeleted(), Boxing.boxBoolean(z10));
                                } catch (Throwable th5) {
                                    th = th5;
                                    aVar2 = aVar6;
                                    obj2 = null;
                                }
                            } else {
                                areEqual = z11;
                            }
                            if (!areEqual) {
                                obj2 = null;
                                aVar2 = aVar6;
                                Unit unit = Unit.INSTANCE;
                                aVar2.g(obj2);
                                return Unit.INSTANCE;
                            }
                            C6152a L11 = wmsConversationsEventsHandler3.L();
                            wVar2.f43064n = aVar6;
                            wVar2.f43065o = wmsConversationsEventsHandler3;
                            wVar2.f43066p = hashtable3;
                            obj2 = null;
                            try {
                                wVar2.f43067q = null;
                                wVar2.f43068r = null;
                                wVar2.f43069s = null;
                                wVar2.f43070t = null;
                                wVar2.f43071u = null;
                                wVar2.f43073w = 5;
                                w11 = L11.w(null, str14, str13, str11, str12, wVar2);
                                if (w11 == obj5) {
                                    return obj5;
                                }
                                aVar2 = aVar6;
                                wmsConversationsEventsHandler4 = wmsConversationsEventsHandler3;
                                messageEntity2 = (MessageEntity) ((C5582a) w11).b();
                                if (messageEntity2 != null) {
                                }
                                Unit unit2 = Unit.INSTANCE;
                                aVar2.g(obj2);
                                return Unit.INSTANCE;
                            } catch (Throwable th6) {
                                th = th6;
                                aVar2 = aVar6;
                                aVar2.g(obj2);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            aVar2 = aVar8;
                        }
                    } else {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Hashtable hashtable7 = (Hashtable) wVar2.f43066p;
                        wmsConversationsEventsHandler4 = (WmsConversationsEventsHandler) wVar2.f43065o;
                        aVar2 = (Wh.a) wVar2.f43064n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            hashtable3 = hashtable7;
                            obj2 = null;
                            z11 = false;
                            w11 = obj;
                            try {
                                messageEntity2 = (MessageEntity) ((C5582a) w11).b();
                                if (messageEntity2 != null) {
                                    String string = wmsConversationsEventsHandler4.F().getString(od.t.f61117t3);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    wmsConversationsEventsHandler4.P(messageEntity2, string, hashtable3, z11);
                                }
                                Unit unit22 = Unit.INSTANCE;
                                aVar2.g(obj2);
                                return Unit.INSTANCE;
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                    obj2 = null;
                    aVar2.g(obj2);
                    throw th;
                }
                long j13 = wVar2.f43072v;
                String str21 = (String) wVar2.f43070t;
                String str22 = (String) wVar2.f43069s;
                String str23 = (String) wVar2.f43068r;
                String str24 = (String) wVar2.f43067q;
                Hashtable hashtable8 = (Hashtable) wVar2.f43066p;
                wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) wVar2.f43065o;
                aVar3 = (Wh.a) wVar2.f43064n;
                ResultKt.throwOnFailure(obj);
                str4 = str24;
                hashtable2 = hashtable8;
                str2 = str21;
                str = str23;
                j10 = j13;
                str3 = str22;
                w10 = obj;
                aVar4 = aVar3;
                try {
                    messageEntity = (MessageEntity) ((C5582a) w10).b();
                    if (messageEntity == null) {
                        try {
                            g10 = MessageRoomToDomainKt.g(messageEntity, wmsConversationsEventsHandler2.F(), wmsConversationsEventsHandler2.K(), false, false, null, null, 60, null);
                        } catch (Throwable th10) {
                            th = th10;
                            aVar2 = aVar4;
                        }
                    } else {
                        g10 = null;
                    }
                    ConversationsLocalDataSource J10 = wmsConversationsEventsHandler2.J();
                    Long boxLong2 = Boxing.boxLong(j10);
                    wVar2.f43064n = aVar4;
                    wVar2.f43065o = wmsConversationsEventsHandler2;
                    wVar2.f43066p = hashtable2;
                    wVar2.f43067q = str4;
                    wVar2.f43068r = str;
                    wVar2.f43069s = str3;
                    wVar2.f43070t = str2;
                    wVar2.f43071u = g10;
                    wVar2.f43072v = j10;
                    wVar2.f43073w = 3;
                    String str25 = str2;
                    str5 = str;
                    String str26 = str4;
                    Hashtable hashtable9 = hashtable2;
                    WmsConversationsEventsHandler wmsConversationsEventsHandler6 = wmsConversationsEventsHandler2;
                    j11 = j10;
                    aVar5 = aVar4;
                    i10 = 4;
                    z10 = true;
                    Message message4 = g10;
                    String str27 = str3;
                    try {
                        updateConversation = J10.updateConversation(str5, (r39 & 2) != 0 ? null : boxLong2, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                        wVar2 = this;
                        if (updateConversation != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj4 = coroutine_suspended;
                        str6 = str5;
                        message = message4;
                        hashtable3 = hashtable9;
                        str7 = str26;
                        str8 = str27;
                        str9 = str25;
                        wmsConversationsEventsHandler3 = wmsConversationsEventsHandler6;
                        aVar6 = aVar5;
                        L10 = wmsConversationsEventsHandler3.L();
                        boxBoolean = Boxing.boxBoolean(Boolean.parseBoolean(String.valueOf(hashtable3.get("isdeleted"))));
                        boxLong = Boxing.boxLong(j11);
                        wVar2.f43064n = aVar6;
                        wVar2.f43065o = wmsConversationsEventsHandler3;
                        wVar2.f43066p = hashtable3;
                        wVar2.f43067q = str7;
                        wVar2.f43068r = str6;
                        wVar2.f43069s = str8;
                        wVar2.f43070t = str9;
                        wVar2.f43071u = message;
                        wVar2.f43073w = i10;
                        str10 = str6;
                        wVar = wVar2;
                        obj5 = obj4;
                        z11 = false;
                        wVar2 = wVar;
                        if (L10.V(str10, str9, boxBoolean, boxLong, wVar) != obj5) {
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj2 = null;
                        aVar2 = aVar5;
                        aVar2.g(obj2);
                        throw th;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    aVar5 = aVar4;
                    obj2 = null;
                }
            }
            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler;
            String O10 = wmsConversationsEventsHandler2.O(hashtable);
            String chatid = LiveChatUtil.getChatid(O10);
            Object obj6 = hashtable.get("msguid");
            String replace$default = (obj6 == null || (obj3 = obj6.toString()) == null) ? null : StringsKt.replace$default(obj3, "%", "_", false, 4, (Object) null);
            Object obj7 = hashtable.get("msgid");
            String obj8 = obj7 != null ? obj7.toString() : null;
            if (chatid == null || replace$default == null) {
                obj2 = null;
                aVar2 = aVar3;
                Unit unit222 = Unit.INSTANCE;
                aVar2.g(obj2);
                return Unit.INSTANCE;
            }
            long q10 = og.i.q(String.valueOf(hashtable.get("time")), -1L);
            C6152a L12 = wmsConversationsEventsHandler2.L();
            wVar2.f43064n = aVar3;
            wVar2.f43065o = wmsConversationsEventsHandler2;
            wVar2.f43066p = hashtable;
            wVar2.f43067q = O10;
            wVar2.f43068r = chatid;
            wVar2.f43069s = obj8;
            wVar2.f43070t = replace$default;
            wVar2.f43072v = q10;
            wVar2.f43073w = 2;
            w10 = L12.w(null, chatid, O10, replace$default, obj8, wVar2);
            if (w10 != coroutine_suspended) {
                Hashtable hashtable10 = hashtable;
                str = chatid;
                j10 = q10;
                hashtable2 = hashtable10;
                String str28 = obj8;
                str2 = replace$default;
                str3 = str28;
                str4 = O10;
                aVar4 = aVar3;
                messageEntity = (MessageEntity) ((C5582a) w10).b();
                if (messageEntity == null) {
                }
                ConversationsLocalDataSource J102 = wmsConversationsEventsHandler2.J();
                Long boxLong22 = Boxing.boxLong(j10);
                wVar2.f43064n = aVar4;
                wVar2.f43065o = wmsConversationsEventsHandler2;
                wVar2.f43066p = hashtable2;
                wVar2.f43067q = str4;
                wVar2.f43068r = str;
                wVar2.f43069s = str3;
                wVar2.f43070t = str2;
                wVar2.f43071u = g10;
                wVar2.f43072v = j10;
                wVar2.f43073w = 3;
                String str252 = str2;
                str5 = str;
                String str262 = str4;
                Hashtable hashtable92 = hashtable2;
                WmsConversationsEventsHandler wmsConversationsEventsHandler62 = wmsConversationsEventsHandler2;
                j11 = j10;
                aVar5 = aVar4;
                i10 = 4;
                z10 = true;
                Message message42 = g10;
                String str272 = str3;
                updateConversation = J102.updateConversation(str5, (r39 & 2) != 0 ? null : boxLong22, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                wVar2 = this;
                if (updateConversation != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public static final class x extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43076n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43077o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43078p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43079q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43080r;

        /* renamed from: s, reason: collision with root package name */
        public int f43081s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f43082t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43084v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Hashtable hashtable, Continuation continuation) {
            super(2, continuation);
            this.f43084v = hashtable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            x xVar = WmsConversationsEventsHandler.this.new x(this.f43084v, continuation);
            xVar.f43082t = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((x) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0301 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x031d A[Catch: all -> 0x013f, TryCatch #5 {all -> 0x013f, blocks: (B:101:0x02fd, B:104:0x0303, B:106:0x0309, B:109:0x031d, B:112:0x0327, B:115:0x030f, B:117:0x0315, B:14:0x00f8, B:17:0x012b, B:19:0x013c, B:21:0x0147, B:23:0x014f, B:24:0x0155, B:26:0x0159, B:27:0x015d, B:29:0x0163, B:31:0x0169, B:35:0x0175, B:37:0x0184, B:38:0x018a, B:43:0x0195, B:44:0x019b, B:46:0x019f, B:48:0x01a5, B:50:0x01ab, B:52:0x01b1, B:53:0x01b7, B:55:0x01c6, B:57:0x01cc, B:58:0x01d2, B:60:0x01d6, B:62:0x01dc, B:63:0x01e2, B:65:0x01e6, B:67:0x01ec, B:68:0x01f2, B:70:0x01f6, B:72:0x01fc, B:73:0x0202, B:82:0x020c, B:84:0x0214, B:86:0x021a, B:88:0x0220, B:89:0x0226, B:92:0x0237, B:94:0x023f, B:95:0x0245, B:97:0x02b2), top: B:13:0x00f8 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0325  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0322  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0315 A[Catch: all -> 0x013f, TryCatch #5 {all -> 0x013f, blocks: (B:101:0x02fd, B:104:0x0303, B:106:0x0309, B:109:0x031d, B:112:0x0327, B:115:0x030f, B:117:0x0315, B:14:0x00f8, B:17:0x012b, B:19:0x013c, B:21:0x0147, B:23:0x014f, B:24:0x0155, B:26:0x0159, B:27:0x015d, B:29:0x0163, B:31:0x0169, B:35:0x0175, B:37:0x0184, B:38:0x018a, B:43:0x0195, B:44:0x019b, B:46:0x019f, B:48:0x01a5, B:50:0x01ab, B:52:0x01b1, B:53:0x01b7, B:55:0x01c6, B:57:0x01cc, B:58:0x01d2, B:60:0x01d6, B:62:0x01dc, B:63:0x01e2, B:65:0x01e6, B:67:0x01ec, B:68:0x01f2, B:70:0x01f6, B:72:0x01fc, B:73:0x0202, B:82:0x020c, B:84:0x0214, B:86:0x021a, B:88:0x0220, B:89:0x0226, B:92:0x0237, B:94:0x023f, B:95:0x0245, B:97:0x02b2), top: B:13:0x00f8 }] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x031a  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x013c A[Catch: all -> 0x013f, TryCatch #5 {all -> 0x013f, blocks: (B:101:0x02fd, B:104:0x0303, B:106:0x0309, B:109:0x031d, B:112:0x0327, B:115:0x030f, B:117:0x0315, B:14:0x00f8, B:17:0x012b, B:19:0x013c, B:21:0x0147, B:23:0x014f, B:24:0x0155, B:26:0x0159, B:27:0x015d, B:29:0x0163, B:31:0x0169, B:35:0x0175, B:37:0x0184, B:38:0x018a, B:43:0x0195, B:44:0x019b, B:46:0x019f, B:48:0x01a5, B:50:0x01ab, B:52:0x01b1, B:53:0x01b7, B:55:0x01c6, B:57:0x01cc, B:58:0x01d2, B:60:0x01d6, B:62:0x01dc, B:63:0x01e2, B:65:0x01e6, B:67:0x01ec, B:68:0x01f2, B:70:0x01f6, B:72:0x01fc, B:73:0x0202, B:82:0x020c, B:84:0x0214, B:86:0x021a, B:88:0x0220, B:89:0x0226, B:92:0x0237, B:94:0x023f, B:95:0x0245, B:97:0x02b2), top: B:13:0x00f8 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0159 A[Catch: all -> 0x013f, TryCatch #5 {all -> 0x013f, blocks: (B:101:0x02fd, B:104:0x0303, B:106:0x0309, B:109:0x031d, B:112:0x0327, B:115:0x030f, B:117:0x0315, B:14:0x00f8, B:17:0x012b, B:19:0x013c, B:21:0x0147, B:23:0x014f, B:24:0x0155, B:26:0x0159, B:27:0x015d, B:29:0x0163, B:31:0x0169, B:35:0x0175, B:37:0x0184, B:38:0x018a, B:43:0x0195, B:44:0x019b, B:46:0x019f, B:48:0x01a5, B:50:0x01ab, B:52:0x01b1, B:53:0x01b7, B:55:0x01c6, B:57:0x01cc, B:58:0x01d2, B:60:0x01d6, B:62:0x01dc, B:63:0x01e2, B:65:0x01e6, B:67:0x01ec, B:68:0x01f2, B:70:0x01f6, B:72:0x01fc, B:73:0x0202, B:82:0x020c, B:84:0x0214, B:86:0x021a, B:88:0x0220, B:89:0x0226, B:92:0x0237, B:94:0x023f, B:95:0x0245, B:97:0x02b2), top: B:13:0x00f8 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0175 A[Catch: all -> 0x013f, TryCatch #5 {all -> 0x013f, blocks: (B:101:0x02fd, B:104:0x0303, B:106:0x0309, B:109:0x031d, B:112:0x0327, B:115:0x030f, B:117:0x0315, B:14:0x00f8, B:17:0x012b, B:19:0x013c, B:21:0x0147, B:23:0x014f, B:24:0x0155, B:26:0x0159, B:27:0x015d, B:29:0x0163, B:31:0x0169, B:35:0x0175, B:37:0x0184, B:38:0x018a, B:43:0x0195, B:44:0x019b, B:46:0x019f, B:48:0x01a5, B:50:0x01ab, B:52:0x01b1, B:53:0x01b7, B:55:0x01c6, B:57:0x01cc, B:58:0x01d2, B:60:0x01d6, B:62:0x01dc, B:63:0x01e2, B:65:0x01e6, B:67:0x01ec, B:68:0x01f2, B:70:0x01f6, B:72:0x01fc, B:73:0x0202, B:82:0x020c, B:84:0x0214, B:86:0x021a, B:88:0x0220, B:89:0x0226, B:92:0x0237, B:94:0x023f, B:95:0x0245, B:97:0x02b2), top: B:13:0x00f8 }] */
        /* JADX WARN: Type inference failed for: r1v21, types: [T, com.zoho.livechat.android.modules.messages.domain.entities.Message] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P p10;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            Wh.a aVar;
            Hashtable hashtable;
            Wh.a aVar2;
            Wh.a aVar3;
            Object obj2;
            Ref.ObjectRef objectRef;
            WmsConversationsEventsHandler wmsConversationsEventsHandler2;
            MessageEntity messageEntity;
            Ref.BooleanRef booleanRef;
            Message message;
            String comment;
            String u10;
            Wh.a aVar4;
            WmsConversationsEventsHandler wmsConversationsEventsHandler3;
            Hashtable hashtable2;
            Ref.ObjectRef objectRef2;
            P p11;
            String str;
            String str2;
            Object obj3;
            MessageEntity messageEntity2;
            T t10;
            String str3;
            String str4;
            Object obj4;
            String str5;
            Object obj5;
            String str6;
            Hashtable hashtable3;
            Wh.a aVar5;
            String O10;
            String chatid;
            C6152a L10;
            WmsConversationsEventsHandler wmsConversationsEventsHandler4;
            P p12;
            x xVar = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = xVar.f43081s;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        P p13 = (P) xVar.f43082t;
                        Wh.a d10 = C6461a.C0913a.f65814a.d();
                        WmsConversationsEventsHandler wmsConversationsEventsHandler5 = WmsConversationsEventsHandler.this;
                        Hashtable hashtable4 = xVar.f43084v;
                        xVar.f43082t = p13;
                        xVar.f43076n = d10;
                        xVar.f43077o = wmsConversationsEventsHandler5;
                        xVar.f43078p = hashtable4;
                        xVar.f43081s = 1;
                        if (d10.f(null, xVar) != coroutine_suspended) {
                            p10 = p13;
                            wmsConversationsEventsHandler = wmsConversationsEventsHandler5;
                            aVar = d10;
                            hashtable = hashtable4;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        try {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                booleanRef = (Ref.BooleanRef) xVar.f43080r;
                                objectRef2 = (Ref.ObjectRef) xVar.f43079q;
                                messageEntity = (MessageEntity) xVar.f43078p;
                                hashtable2 = (Hashtable) xVar.f43077o;
                                wmsConversationsEventsHandler3 = (WmsConversationsEventsHandler) xVar.f43076n;
                                aVar4 = (Wh.a) xVar.f43082t;
                                ResultKt.throwOnFailure(obj);
                                objectRef = objectRef2;
                                hashtable = hashtable2;
                                aVar2 = aVar4;
                                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler3;
                                if (booleanRef.element && messageEntity != null) {
                                    message = (Message) objectRef.element;
                                    if (message != null || (comment = message.getContent()) == null) {
                                        Message message2 = (Message) objectRef.element;
                                        comment = message2 == null ? message2.getComment() : null;
                                    }
                                    u10 = comment == null ? og.i.u(comment) : null;
                                    if (u10 == null) {
                                        u10 = "";
                                    }
                                    wmsConversationsEventsHandler2.P(messageEntity, u10, hashtable, false);
                                }
                                aVar3 = aVar2;
                                try {
                                    Unit unit = Unit.INSTANCE;
                                    aVar3.g(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = null;
                                    aVar3.g(obj2);
                                    throw th;
                                }
                            }
                            String str7 = (String) xVar.f43080r;
                            str2 = (String) xVar.f43079q;
                            Hashtable hashtable5 = (Hashtable) xVar.f43078p;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) xVar.f43077o;
                            Wh.a aVar6 = (Wh.a) xVar.f43076n;
                            p11 = (P) xVar.f43082t;
                            ResultKt.throwOnFailure(obj);
                            hashtable = hashtable5;
                            aVar2 = aVar6;
                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler6;
                            str = str7;
                            obj3 = obj;
                            try {
                                messageEntity2 = (MessageEntity) ((C5582a) obj3).b();
                                objectRef = new Ref.ObjectRef();
                                if (messageEntity2 == null) {
                                    try {
                                        messageEntity = messageEntity2;
                                        t10 = MessageRoomToDomainKt.g(messageEntity2, wmsConversationsEventsHandler2.F(), wmsConversationsEventsHandler2.K(), false, false, null, null, 60, null);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        aVar3 = aVar2;
                                        obj2 = null;
                                        aVar3.g(obj2);
                                        throw th;
                                    }
                                } else {
                                    messageEntity = messageEntity2;
                                    t10 = 0;
                                }
                                objectRef.element = t10;
                                booleanRef = new Ref.BooleanRef();
                                Object obj6 = hashtable.get("msg");
                                List list = !(obj6 instanceof List) ? (List) obj6 : null;
                                Object obj7 = (list != null || (hashtable3 = (Hashtable) CollectionsKt.getOrNull(list, 0)) == null) ? null : hashtable3.get("msg");
                                Hashtable hashtable6 = !(obj7 instanceof Hashtable) ? (Hashtable) obj7 : null;
                                if (og.i.e(str2) || !og.i.e(str) || !og.i.e(objectRef.element)) {
                                    p11 = null;
                                }
                                if (p11 != null) {
                                    T t11 = objectRef.element;
                                    Intrinsics.checkNotNull(t11);
                                    Message message3 = (Message) t11;
                                    Message message4 = (Message) objectRef.element;
                                    if (((message4 != null ? message4.getMessageType() : null) == Message.g.Text ? p11 : null) != null) {
                                        Object obj8 = hashtable6 != null ? hashtable6.get("msg") : null;
                                        String str8 = obj8 instanceof String ? (String) obj8 : null;
                                        if (str8 == null || (str6 = str8.toString()) == null) {
                                            str6 = null;
                                        } else {
                                            booleanRef.element = !Intrinsics.areEqual(str6, ((Message) objectRef.element) != null ? r4.getContent() : null);
                                        }
                                        str3 = str6;
                                    } else {
                                        str3 = null;
                                    }
                                    Message message5 = (Message) objectRef.element;
                                    if ((message5 != null ? message5.getMessageType() : null) != Message.g.Image) {
                                        Message message6 = (Message) objectRef.element;
                                        if ((message6 != null ? message6.getMessageType() : null) != Message.g.Video) {
                                            Message message7 = (Message) objectRef.element;
                                            if ((message7 != null ? message7.getMessageType() : null) != Message.g.File) {
                                                Message message8 = (Message) objectRef.element;
                                                if ((message8 != null ? message8.getMessageType() : null) != Message.g.Audio) {
                                                    p11 = null;
                                                }
                                            }
                                        }
                                    }
                                    if (p11 != null) {
                                        if (hashtable6 == null || (obj5 = hashtable6.get("comment")) == null || (str5 = obj5.toString()) == null) {
                                            str5 = null;
                                        } else {
                                            booleanRef.element = !Intrinsics.areEqual(str5, ((Message) objectRef.element) != null ? r4.getComment() : null);
                                        }
                                        str4 = str5;
                                    } else {
                                        str4 = null;
                                    }
                                    objectRef.element = Message.copy$default(message3, null, null, null, null, null, null, null, null, str3, str4, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, Boxing.boxBoolean(true), null, null, null, null, og.i.q((hashtable6 == null || (obj4 = hashtable6.get("time")) == null) ? null : obj4.toString(), -1L), 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -276824833, 1023, null);
                                    if (wmsConversationsEventsHandler2.H().V() != null) {
                                        C6152a L11 = wmsConversationsEventsHandler2.L();
                                        T t12 = objectRef.element;
                                        Intrinsics.checkNotNull(t12);
                                        Gson K10 = wmsConversationsEventsHandler2.K();
                                        String V10 = wmsConversationsEventsHandler2.H().V();
                                        Intrinsics.checkNotNull(V10);
                                        MessageEntity a10 = AbstractC6687a.a((Message) t12, K10, V10);
                                        xVar.f43082t = aVar2;
                                        xVar.f43076n = wmsConversationsEventsHandler2;
                                        xVar.f43077o = hashtable;
                                        xVar.f43078p = messageEntity;
                                        xVar.f43079q = objectRef;
                                        xVar.f43080r = booleanRef;
                                        xVar.f43081s = 3;
                                        MessageEntity messageEntity3 = messageEntity;
                                        if (C6152a.U(L11, a10, false, xVar, 2, null) != coroutine_suspended) {
                                            wmsConversationsEventsHandler3 = wmsConversationsEventsHandler2;
                                            aVar4 = aVar2;
                                            objectRef2 = objectRef;
                                            booleanRef = booleanRef;
                                            hashtable2 = hashtable;
                                            messageEntity = messageEntity3;
                                            objectRef = objectRef2;
                                            hashtable = hashtable2;
                                            aVar2 = aVar4;
                                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler3;
                                            if (booleanRef.element) {
                                                message = (Message) objectRef.element;
                                                if (message != null) {
                                                }
                                                Message message22 = (Message) objectRef.element;
                                                if (message22 == null) {
                                                }
                                                if (comment == null) {
                                                }
                                                if (u10 == null) {
                                                }
                                                wmsConversationsEventsHandler2.P(messageEntity, u10, hashtable, false);
                                            }
                                        }
                                        return coroutine_suspended;
                                    }
                                    if (booleanRef.element) {
                                    }
                                }
                                aVar3 = aVar2;
                                Unit unit2 = Unit.INSTANCE;
                                aVar3.g(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                aVar3 = aVar2;
                                obj2 = null;
                                aVar3.g(obj2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj2 = null;
                            aVar3.g(obj2);
                            throw th;
                        }
                    }
                    Hashtable hashtable7 = (Hashtable) xVar.f43078p;
                    WmsConversationsEventsHandler wmsConversationsEventsHandler7 = (WmsConversationsEventsHandler) xVar.f43077o;
                    aVar = (Wh.a) xVar.f43076n;
                    P p14 = (P) xVar.f43082t;
                    ResultKt.throwOnFailure(obj);
                    hashtable = hashtable7;
                    wmsConversationsEventsHandler = wmsConversationsEventsHandler7;
                    p10 = p14;
                    obj3 = C6152a.y(L10, null, chatid, O10, str, null, this, 16, null);
                    xVar = this;
                    if (obj3 != coroutine_suspended) {
                        str2 = chatid;
                        p11 = p12;
                        wmsConversationsEventsHandler2 = wmsConversationsEventsHandler4;
                        aVar2 = aVar5;
                        messageEntity2 = (MessageEntity) ((C5582a) obj3).b();
                        objectRef = new Ref.ObjectRef();
                        if (messageEntity2 == null) {
                        }
                        objectRef.element = t10;
                        booleanRef = new Ref.BooleanRef();
                        Object obj62 = hashtable.get("msg");
                        if (!(obj62 instanceof List)) {
                        }
                        if (list != null) {
                        }
                        if (!(obj7 instanceof Hashtable)) {
                        }
                        if (og.i.e(str2)) {
                        }
                        p11 = null;
                        if (p11 != null) {
                        }
                        aVar3 = aVar2;
                        Unit unit22 = Unit.INSTANCE;
                        aVar3.g(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th6) {
                    th = th6;
                    aVar3 = aVar5;
                    obj2 = null;
                    aVar3.g(obj2);
                    throw th;
                }
                O10 = wmsConversationsEventsHandler.O(hashtable);
                chatid = LiveChatUtil.getChatid(O10);
                String replace$default = StringsKt.replace$default(String.valueOf(hashtable.get("msguid")), "%", "_", false, 4, (Object) null);
                L10 = wmsConversationsEventsHandler.L();
                xVar.f43082t = p10;
                xVar.f43076n = aVar;
                xVar.f43077o = wmsConversationsEventsHandler;
                xVar.f43078p = hashtable;
                xVar.f43079q = chatid;
                xVar.f43080r = replace$default;
                xVar.f43081s = 2;
                Wh.a aVar7 = aVar;
                str = replace$default;
                wmsConversationsEventsHandler4 = wmsConversationsEventsHandler;
                aVar5 = aVar7;
                p12 = p10;
            } catch (Throwable th7) {
                th = th7;
                aVar5 = aVar;
            }
        }
    }

    public static final class y extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43085n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43086o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43087p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43088q;

        /* renamed from: r, reason: collision with root package name */
        public int f43089r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f43090s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43091t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f43092u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f43091t = hashtable;
            this.f43092u = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            y yVar = new y(this.f43091t, this.f43092u, continuation);
            yVar.f43090s = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((y) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wh.a aVar;
            Object obj2;
            P p10;
            Hashtable hashtable;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            boolean z10;
            SalesIQChat chat$default;
            MessageEntity h10;
            WmsConversationsEventsHandler wmsConversationsEventsHandler2;
            String str;
            WmsConversationsEventsHandler wmsConversationsEventsHandler3;
            MessageEntity messageEntity;
            Message copy$default;
            Wh.a aVar2;
            Object updateConversation;
            MessageEntity messageEntity2;
            Message lastMessage;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43089r;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        p10 = (P) this.f43090s;
                        Wh.a d10 = C6461a.C0913a.f65814a.d();
                        Hashtable hashtable2 = this.f43091t;
                        WmsConversationsEventsHandler wmsConversationsEventsHandler4 = this.f43092u;
                        this.f43090s = p10;
                        this.f43085n = d10;
                        this.f43086o = hashtable2;
                        this.f43087p = wmsConversationsEventsHandler4;
                        this.f43089r = 1;
                        if (d10.f(null, this) != coroutine_suspended) {
                            hashtable = hashtable2;
                            wmsConversationsEventsHandler = wmsConversationsEventsHandler4;
                            aVar = d10;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            messageEntity2 = (MessageEntity) this.f43086o;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler5 = (WmsConversationsEventsHandler) this.f43085n;
                            Wh.a aVar3 = (Wh.a) this.f43090s;
                            ResultKt.throwOnFailure(obj);
                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler5;
                            aVar2 = aVar3;
                            obj2 = null;
                            updateConversation = obj;
                            h10 = messageEntity2;
                            aVar = aVar2;
                            try {
                                WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler2, h10.getChatId(), null, null, false, false, null, false, 126, null);
                                Unit unit = Unit.INSTANCE;
                                aVar.g(obj2);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar.g(obj2);
                                throw th;
                            }
                        }
                        messageEntity = (MessageEntity) this.f43088q;
                        SalesIQChat salesIQChat = (SalesIQChat) this.f43087p;
                        String str2 = (String) this.f43086o;
                        WmsConversationsEventsHandler wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) this.f43085n;
                        Wh.a aVar4 = (Wh.a) this.f43090s;
                        try {
                            ResultKt.throwOnFailure(obj);
                            z10 = true;
                            chat$default = salesIQChat;
                            wmsConversationsEventsHandler3 = wmsConversationsEventsHandler6;
                            str = str2;
                            aVar = aVar4;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar4;
                            obj2 = null;
                            aVar.g(obj2);
                            throw th;
                        }
                        try {
                            ConversationsLocalDataSource J10 = wmsConversationsEventsHandler3.J();
                            copy$default = (chat$default != null || (lastMessage = chat$default.getLastMessage()) == null) ? null : Message.copy$default(lastMessage, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, Boxing.boxBoolean(z10), null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -2097153, 1023, null);
                            this.f43090s = aVar;
                            this.f43085n = wmsConversationsEventsHandler3;
                            this.f43086o = messageEntity;
                            this.f43087p = null;
                            this.f43088q = null;
                            this.f43089r = 3;
                            aVar2 = aVar;
                            MessageEntity messageEntity3 = messageEntity;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler7 = wmsConversationsEventsHandler3;
                            obj2 = null;
                            try {
                                updateConversation = J10.updateConversation(str, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : copy$default, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                                if (updateConversation != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler7;
                                messageEntity2 = messageEntity3;
                                h10 = messageEntity2;
                                aVar = aVar2;
                                WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler2, h10.getChatId(), null, null, false, false, null, false, 126, null);
                                Unit unit2 = Unit.INSTANCE;
                                aVar.g(obj2);
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                aVar = aVar2;
                                aVar.g(obj2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj2 = null;
                            aVar.g(obj2);
                            throw th;
                        }
                    }
                    WmsConversationsEventsHandler wmsConversationsEventsHandler8 = (WmsConversationsEventsHandler) this.f43087p;
                    Hashtable hashtable3 = (Hashtable) this.f43086o;
                    Wh.a aVar5 = (Wh.a) this.f43085n;
                    p10 = (P) this.f43090s;
                    ResultKt.throwOnFailure(obj);
                    wmsConversationsEventsHandler = wmsConversationsEventsHandler8;
                    hashtable = hashtable3;
                    aVar = aVar5;
                    Object obj3 = hashtable.get("msg");
                    Hashtable hashtable4 = obj3 instanceof Hashtable ? (Hashtable) obj3 : null;
                    String O10 = hashtable4 != null ? wmsConversationsEventsHandler.O(hashtable4) : null;
                    String chatid = LiveChatUtil.getChatid(O10);
                    z10 = true;
                    chat$default = ConversationsLocalDataSource.getChat$default(wmsConversationsEventsHandler.J(), chatid, false, 2, null);
                    h10 = c.h(hashtable, O10, null, null, null, 14, null);
                    Object obj4 = hashtable4 != null ? hashtable4.get("msguid") : null;
                    if (!og.i.e(chatid) || !og.i.e(obj4)) {
                        p10 = null;
                    }
                    if (p10 == null) {
                        obj2 = null;
                        wmsConversationsEventsHandler2 = wmsConversationsEventsHandler;
                        WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler2, h10.getChatId(), null, null, false, false, null, false, 126, null);
                        Unit unit22 = Unit.INSTANCE;
                        aVar.g(obj2);
                        return Unit.INSTANCE;
                    }
                    Object obj5 = obj4;
                    C6152a L10 = wmsConversationsEventsHandler.L();
                    Intrinsics.checkNotNull(chatid);
                    String replace$default = StringsKt.replace$default(String.valueOf(obj5), "%", "_", false, 4, (Object) null);
                    this.f43090s = aVar;
                    this.f43085n = wmsConversationsEventsHandler;
                    this.f43086o = chatid;
                    this.f43087p = chat$default;
                    this.f43088q = h10;
                    this.f43089r = 2;
                    Wh.a aVar6 = aVar;
                    try {
                        if (L10.Z(chatid, null, replace$default, true, this) != coroutine_suspended) {
                            str = chatid;
                            wmsConversationsEventsHandler3 = wmsConversationsEventsHandler;
                            messageEntity = h10;
                            aVar = aVar6;
                            ConversationsLocalDataSource J102 = wmsConversationsEventsHandler3.J();
                            if (chat$default != null) {
                            }
                            this.f43090s = aVar;
                            this.f43085n = wmsConversationsEventsHandler3;
                            this.f43086o = messageEntity;
                            this.f43087p = null;
                            this.f43088q = null;
                            this.f43089r = 3;
                            aVar2 = aVar;
                            MessageEntity messageEntity32 = messageEntity;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler72 = wmsConversationsEventsHandler3;
                            obj2 = null;
                            updateConversation = J102.updateConversation(str, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : copy$default, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                            if (updateConversation != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        th = th6;
                        obj2 = null;
                        aVar = aVar6;
                        aVar.g(obj2);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj2 = null;
                    aVar.g(obj2);
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public static final class z extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43093n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43094o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43095p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43096q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43097r;

        /* renamed from: s, reason: collision with root package name */
        public int f43098s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43099t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ WmsConversationsEventsHandler f43100u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Hashtable hashtable, WmsConversationsEventsHandler wmsConversationsEventsHandler, Continuation continuation) {
            super(2, continuation);
            this.f43099t = hashtable;
            this.f43100u = wmsConversationsEventsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new z(this.f43099t, this.f43100u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((z) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0233 A[Catch: all -> 0x0224, TryCatch #2 {all -> 0x0224, blocks: (B:10:0x021d, B:12:0x022d, B:14:0x0233, B:16:0x0239, B:17:0x023c, B:18:0x0313), top: B:9:0x021d }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01cc A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:40:0x0076, B:44:0x0085, B:47:0x00a1, B:52:0x00b9, B:55:0x00cb, B:58:0x00d9, B:61:0x00e7, B:64:0x00f5, B:66:0x00fd, B:67:0x0108, B:69:0x0113, B:70:0x0117, B:72:0x0123, B:74:0x0129, B:76:0x0131, B:81:0x014d, B:83:0x015e, B:84:0x0176, B:86:0x0185, B:88:0x018b, B:91:0x019a, B:93:0x01a9, B:95:0x01b1, B:96:0x01c2, B:98:0x01cc, B:99:0x01db, B:101:0x01e1, B:103:0x01ef, B:104:0x01f3, B:107:0x01fc, B:113:0x01bf, B:115:0x024c, B:117:0x025a, B:118:0x0277, B:120:0x0298, B:122:0x029e, B:125:0x02ad, B:127:0x02bc, B:129:0x02c4, B:130:0x02e0, B:132:0x02eb, B:134:0x02f1, B:135:0x02f4, B:137:0x02cc, B:139:0x02d8, B:141:0x026a), top: B:39:0x0076 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wh.a a10;
            Hashtable hashtable;
            WmsConversationsEventsHandler wmsConversationsEventsHandler;
            Wh.a aVar;
            String str;
            String str2;
            String str3;
            Object obj2;
            SalesIQChat salesIQChat;
            String str4;
            SalesIQChat salesIQChat2;
            ContentResolver contentResolver;
            SalesIQChat salesIQChat3;
            String str5;
            String str6;
            Object f10;
            String str7;
            String str8;
            String obj3;
            Object obj4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43098s;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a10 = C6461a.C0913a.f65814a.a();
                    hashtable = this.f43099t;
                    WmsConversationsEventsHandler wmsConversationsEventsHandler2 = this.f43100u;
                    this.f43093n = a10;
                    this.f43094o = hashtable;
                    this.f43095p = wmsConversationsEventsHandler2;
                    this.f43098s = 1;
                    if (a10.f(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wmsConversationsEventsHandler = wmsConversationsEventsHandler2;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SalesIQChat salesIQChat4 = (SalesIQChat) this.f43097r;
                        str8 = (String) this.f43096q;
                        str7 = (String) this.f43095p;
                        WmsConversationsEventsHandler wmsConversationsEventsHandler3 = (WmsConversationsEventsHandler) this.f43094o;
                        aVar = (Wh.a) this.f43093n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            wmsConversationsEventsHandler = wmsConversationsEventsHandler3;
                            salesIQChat3 = salesIQChat4;
                            f10 = obj;
                            try {
                                str6 = str8;
                                str5 = str7;
                                salesIQChat2 = salesIQChat3;
                                WmsConversationsEventsHandler wmsConversationsEventsHandler4 = wmsConversationsEventsHandler;
                                if (LiveChatUtil.isMultipleChatsDisabled() && LiveChatUtil.isTriggerChatAvailable()) {
                                    LiveChatUtil.deleteTriggerChat();
                                }
                                WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler4, str5, null, null, false, false, str6, false, 94, null);
                                Ue.a.s(salesIQChat2);
                                Unit unit = Unit.INSTANCE;
                                aVar.g(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                obj4 = null;
                                aVar.g(obj4);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj4 = null;
                            aVar.g(obj4);
                            throw th;
                        }
                    }
                    WmsConversationsEventsHandler wmsConversationsEventsHandler5 = (WmsConversationsEventsHandler) this.f43095p;
                    hashtable = (Hashtable) this.f43094o;
                    Wh.a aVar2 = (Wh.a) this.f43093n;
                    ResultKt.throwOnFailure(obj);
                    wmsConversationsEventsHandler = wmsConversationsEventsHandler5;
                    a10 = aVar2;
                }
                if (hashtable == null) {
                    Unit unit2 = Unit.INSTANCE;
                    a10.g(null);
                    return unit2;
                }
                try {
                    Object obj5 = hashtable.get("chid");
                    String obj6 = obj5 != null ? obj5.toString() : null;
                    long s10 = og.i.s(String.valueOf(hashtable.get("intime")));
                    Object obj7 = hashtable.get("question");
                    String obj8 = obj7 != null ? obj7.toString() : null;
                    Object obj9 = hashtable.get("chat_status");
                    Hashtable hashtable2 = obj9 instanceof Hashtable ? (Hashtable) obj9 : null;
                    int n10 = og.i.n(hashtable2 != null ? hashtable2.get("state") : null);
                    Object obj10 = hashtable.get("department_id");
                    String obj11 = obj10 != null ? obj10.toString() : null;
                    Object obj12 = hashtable.get("visit_id");
                    String obj13 = obj12 != null ? obj12.toString() : null;
                    Object obj14 = hashtable.get("wms_chat_id");
                    String obj15 = obj14 != null ? obj14.toString() : null;
                    Object obj16 = hashtable.get("conversation_id");
                    String obj17 = obj16 != null ? obj16.toString() : null;
                    Object obj18 = hashtable.get("ack_key");
                    String obj19 = obj18 != null ? obj18.toString() : null;
                    ContentValues contentValues = new ContentValues();
                    SalesIQChat chatFromConvID = LiveChatUtil.getChatFromConvID(obj19);
                    if (chatFromConvID == null) {
                        chatFromConvID = LiveChatUtil.getChat(obj6);
                    }
                    String str9 = obj19;
                    SalesIQChat salesIQChat5 = chatFromConvID;
                    Object obj20 = hashtable.get("type");
                    SalesIQChat.c from = (obj20 == null || (obj3 = obj20.toString()) == null) ? null : SalesIQChat.c.from(obj3);
                    if (from == null) {
                        from = SalesIQChat.c.Chat;
                    }
                    SalesIQChat.c cVar = from;
                    String str10 = obj8;
                    if (salesIQChat5 == null || obj6 == null) {
                        if (str9 == null || str9.length() == 0) {
                            str = obj13;
                            str2 = obj15;
                            str3 = "chat_queue";
                            obj2 = "queue_type";
                            String str11 = obj6;
                            salesIQChat = new SalesIQChat(str11, obj17, s10, n10, cVar);
                            str4 = str11;
                        } else {
                            String str12 = obj15;
                            str4 = obj6;
                            str2 = str12;
                            str = obj13;
                            str3 = "chat_queue";
                            obj2 = "queue_type";
                            salesIQChat = new SalesIQChat(str9, str4, obj17, s10, n10, cVar);
                        }
                        salesIQChat.setRchatid(str2);
                        salesIQChat.setVisitid(str);
                        salesIQChat.setQuestion(str10);
                        salesIQChat.setLastmsgtime(rd.b.f());
                        if (!StringsKt.equals(String.valueOf(hashtable.get("module")), str3, true) && (!hashtable.containsKey(obj2) || !StringsKt.equals(String.valueOf(hashtable.get(obj2)), "chat", true))) {
                            if (StringsKt.equals(String.valueOf(hashtable.get("module")), "addvisitor", true) && LiveChatUtil.getChatWaitingTime() > 0) {
                                salesIQChat.setWaitingTimerStartTime(rd.b.f());
                            }
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                            if (LiveChatUtil.isMultipleChatsDisabled() && LiveChatUtil.isTriggerChatAvailable()) {
                                LiveChatUtil.deleteTriggerChat();
                            }
                            SalesIQChat salesIQChat6 = salesIQChat;
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler, str4, null, null, false, false, null, !salesIQChat.canShowQueue(), 62, null);
                            AbstractC3945n.c(salesIQChat6.getConvID());
                            salesIQChat2 = salesIQChat6;
                            aVar = a10;
                            Ue.a.s(salesIQChat2);
                            Unit unit3 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        }
                        if (og.i.n(hashtable.get("current_position")) > 0) {
                            salesIQChat.setQueueData(hashtable);
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                        }
                        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                        if (LiveChatUtil.isMultipleChatsDisabled()) {
                            LiveChatUtil.deleteTriggerChat();
                        }
                        SalesIQChat salesIQChat62 = salesIQChat;
                        WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler, str4, null, null, false, false, null, !salesIQChat.canShowQueue(), 62, null);
                        AbstractC3945n.c(salesIQChat62.getConvID());
                        salesIQChat2 = salesIQChat62;
                        aVar = a10;
                        Ue.a.s(salesIQChat2);
                        Unit unit32 = Unit.INSTANCE;
                        aVar.g(null);
                        return Unit.INSTANCE;
                    }
                    contentValues.put("DEPTID", obj11);
                    contentValues.put("VISITID", obj13);
                    if (salesIQChat5.getStatus() != 2) {
                        contentValues.put("CHATID", obj6);
                        contentValues.put("RCHATID", obj15);
                        contentValues.put("VISITORID", obj17);
                        contentValues.put("STATUS", Boxing.boxInt(n10));
                    }
                    if (!StringsKt.equals(String.valueOf(hashtable.get("module")), "chat_queue", true) && (!hashtable.containsKey("queue_type") || !StringsKt.equals(String.valueOf(hashtable.get("queue_type")), "chat", true))) {
                        if (StringsKt.equals(String.valueOf(hashtable.get("module")), "addvisitor", true) && LiveChatUtil.getChatWaitingTime() > 0) {
                            contentValues.put("WAITING_TIMER_START_TIME", Boxing.boxLong(rd.b.f()));
                        }
                        contentResolver = wmsConversationsEventsHandler.F().getContentResolver();
                        if (contentResolver != null) {
                            Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CONVID=?", new String[]{str9}));
                        }
                        if (C6218a.k() && Intrinsics.areEqual(C6218a.y(), salesIQChat5.getChid())) {
                            C6218a.i0(true, obj6);
                        }
                        if (salesIQChat5.getStatus() != 2 || obj15 == null) {
                            salesIQChat3 = salesIQChat5;
                            aVar = a10;
                            str5 = obj6;
                            str6 = obj15;
                            salesIQChat2 = salesIQChat3;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler42 = wmsConversationsEventsHandler;
                            if (LiveChatUtil.isMultipleChatsDisabled()) {
                                LiveChatUtil.deleteTriggerChat();
                            }
                            WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler42, str5, null, null, false, false, str6, false, 94, null);
                            Ue.a.s(salesIQChat2);
                            Unit unit322 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        }
                        C6550a M10 = wmsConversationsEventsHandler.M();
                        this.f43093n = a10;
                        this.f43094o = wmsConversationsEventsHandler;
                        this.f43095p = obj6;
                        this.f43096q = obj15;
                        salesIQChat3 = salesIQChat5;
                        this.f43097r = salesIQChat3;
                        this.f43098s = 2;
                        f10 = M10.f("temp_chid", obj6, obj15, this);
                        if (f10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = a10;
                        str7 = obj6;
                        str8 = obj15;
                        str6 = str8;
                        str5 = str7;
                        salesIQChat2 = salesIQChat3;
                        WmsConversationsEventsHandler wmsConversationsEventsHandler422 = wmsConversationsEventsHandler;
                        if (LiveChatUtil.isMultipleChatsDisabled()) {
                        }
                        WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler422, str5, null, null, false, false, str6, false, 94, null);
                        Ue.a.s(salesIQChat2);
                        Unit unit3222 = Unit.INSTANCE;
                        aVar.g(null);
                        return Unit.INSTANCE;
                    }
                    MobilistenUtil.B(obj6, hashtable);
                    contentResolver = wmsConversationsEventsHandler.F().getContentResolver();
                    if (contentResolver != null) {
                    }
                    if (C6218a.k()) {
                        C6218a.i0(true, obj6);
                    }
                    if (salesIQChat5.getStatus() != 2) {
                    }
                    salesIQChat3 = salesIQChat5;
                    aVar = a10;
                    str5 = obj6;
                    str6 = obj15;
                    salesIQChat2 = salesIQChat3;
                    WmsConversationsEventsHandler wmsConversationsEventsHandler4222 = wmsConversationsEventsHandler;
                    if (LiveChatUtil.isMultipleChatsDisabled()) {
                    }
                    WmsConversationsEventsHandler.t0(wmsConversationsEventsHandler4222, str5, null, null, false, false, str6, false, 94, null);
                    Ue.a.s(salesIQChat2);
                    Unit unit32222 = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    aVar = a10;
                    obj4 = null;
                    aVar.g(obj4);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                aVar = a10;
                obj4 = null;
                aVar.g(obj4);
                throw th;
            }
        }
    }

    public /* synthetic */ WmsConversationsEventsHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Object D(WmsConversationsEventsHandler wmsConversationsEventsHandler, MessageEntity messageEntity, SalesIQChat salesIQChat, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return wmsConversationsEventsHandler.C(messageEntity, salesIQChat, z10, continuation);
    }

    public static /* synthetic */ void Q(WmsConversationsEventsHandler wmsConversationsEventsHandler, MessageEntity messageEntity, String str, Hashtable hashtable, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        wmsConversationsEventsHandler.P(messageEntity, str, hashtable, z10);
    }

    public static /* synthetic */ void V(WmsConversationsEventsHandler wmsConversationsEventsHandler, List list, String str, String str2, boolean z10, Rf.a aVar, boolean z11, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        }
        if ((i10 & 64) != 0) {
            function0 = null;
        }
        wmsConversationsEventsHandler.U(list, str, str2, z10, aVar, z11, function0);
    }

    public static final Hashtable f0(Hashtable hashtable) {
        Object obj = hashtable.get("msg");
        if (obj instanceof Hashtable) {
            return (Hashtable) obj;
        }
        return null;
    }

    public static /* synthetic */ void t0(WmsConversationsEventsHandler wmsConversationsEventsHandler, String str, String str2, MessageEntity messageEntity, boolean z10, boolean z11, String str3, boolean z12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            messageEntity = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        if ((i10 & 64) != 0) {
            z12 = false;
        }
        wmsConversationsEventsHandler.s0(str, str2, messageEntity, z10, z11, str3, z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((me.C5582a) r11).b(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(MessageEntity messageEntity, SalesIQChat salesIQChat, boolean z10, Continuation continuation) {
        e eVar;
        int i10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f42921p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f42921p = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f42919n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar.f42921p;
                boolean z11 = false;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String sender = messageEntity.getSender();
                    if (sender != null && !StringsKt.startsWith$default(sender, "$", false, 2, (Object) null) && !Intrinsics.areEqual(salesIQChat.getChid(), C6218a.y()) && !LiveChatUtil.isNotificationShown(messageEntity.getChatId(), messageEntity.getTime().getServerTime())) {
                        if (z10) {
                            C6152a L10 = L();
                            String chatId = messageEntity.getChatId();
                            String messageId = messageEntity.getMessageId();
                            eVar.f42921p = 1;
                            obj = L10.K(chatId, messageId, eVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        z11 = true;
                    }
                    return Boxing.boxBoolean(z11);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f42919n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f42921p;
        boolean z112 = false;
        if (i10 != 0) {
        }
    }

    public final P E() {
        return C6461a.f65810a.e();
    }

    public final Application F() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final Rh.j G() {
        return (Rh.j) this.f42883h.getValue();
    }

    public final Ae.a H() {
        return (Ae.a) this.f42877b.getValue();
    }

    public final ContentResolver I() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if (e10 != null) {
            return e10.getContentResolver();
        }
        return null;
    }

    public final ConversationsLocalDataSource J() {
        return (ConversationsLocalDataSource) this.f42876a.getValue();
    }

    public final Gson K() {
        return (Gson) this.f42879d.getValue();
    }

    public final C6152a L() {
        return (C6152a) this.f42878c.getValue();
    }

    public final C6550a M() {
        return (C6550a) this.f42880e.getValue();
    }

    public final Hashtable N(Object obj, String str, String str2, String str3, Object obj2, String str4, String str5, String str6) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("msg", obj);
        hashtable.put("addInfo", str3);
        if (str != null) {
            hashtable.put("dname", str);
        }
        if (obj2 != null) {
            hashtable.put("meta", obj2);
        }
        if (str4 != null) {
            hashtable.put("chid", str4);
        }
        if (str2 != null) {
            hashtable.put("sender", str2);
        }
        if (str6 != null) {
            hashtable.put("lmsguid", str6);
        }
        if (str5 != null) {
            hashtable.put("msguid", str5);
        }
        return hashtable;
    }

    public final String O(Hashtable hashtable) {
        Object obj = hashtable.get("chid");
        if (obj == null) {
            obj = hashtable.get("r_chat_id");
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final void P(MessageEntity messageEntity, String str, Hashtable hashtable, boolean z10) {
        Hashtable hashtable2;
        if (!LiveChatUtil.canShowInAppNotification() || Intrinsics.areEqual(C6218a.y(), messageEntity.getChatId()) || I() == null || Intrinsics.areEqual(messageEntity.getSender(), H().V())) {
            return;
        }
        com.zoho.livechat.android.provider.a aVar = com.zoho.livechat.android.provider.a.INSTANCE;
        ContentResolver I10 = I();
        Intrinsics.checkNotNull(I10);
        String chatId = messageEntity.getChatId();
        String sender = messageEntity.getSender();
        Message.b bVar = (Message.b) AbstractC5895g.b(K(), messageEntity.getDisplayName(), Message.b.class);
        String e10 = bVar != null ? bVar.e() : null;
        b.EnumC0639b enumC0639b = b.EnumC0639b.WMS;
        String messageUID = messageEntity.getMessageUID();
        Long valueOf = Long.valueOf(messageEntity.getTime().getServerTime());
        Boolean isEdited = messageEntity.isEdited();
        Boolean bool = Boolean.TRUE;
        aVar.insertPushNotification(I10, chatId, sender, e10, enumC0639b, null, messageUID, str, null, null, valueOf, Intrinsics.areEqual(isEdited, bool), Intrinsics.areEqual(messageEntity.isDeleted(), bool));
        Application F10 = F();
        String chatId2 = messageEntity.getChatId();
        String acknowledgementKey = messageEntity.getAcknowledgementKey();
        Message.b bVar2 = (Message.b) AbstractC5895g.b(K(), messageEntity.getDisplayName(), Message.b.class);
        String e11 = bVar2 != null ? bVar2.e() : null;
        Hashtable hashtable3 = hashtable.containsKey("chid") ? hashtable : null;
        if (hashtable3 == null) {
            hashtable.put("acknowledgement_key", messageEntity.getAcknowledgementKey());
            Unit unit = Unit.INSTANCE;
            hashtable2 = hashtable;
        } else {
            hashtable2 = hashtable3;
        }
        AbstractC5884j.n(F10, chatId2, acknowledgementKey, e11, str, hashtable2, messageEntity.getTime().getServerTime(), true, z10);
    }

    public final void R(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new k(messageTable, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0356 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00db, blocks: (B:33:0x034e, B:35:0x0356, B:39:0x036e, B:41:0x0378, B:42:0x037e, B:44:0x0391, B:46:0x0399, B:48:0x03b1, B:49:0x03d0, B:58:0x0371, B:59:0x0374, B:66:0x00cc, B:68:0x02c5, B:70:0x02fd), top: B:65:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1 A[Catch: all -> 0x02cf, TRY_LEAVE, TryCatch #4 {all -> 0x02cf, blocks: (B:78:0x0191, B:80:0x01c1, B:88:0x0204, B:90:0x0230), top: B:77:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0230 A[Catch: all -> 0x02cf, TRY_LEAVE, TryCatch #4 {all -> 0x02cf, blocks: (B:78:0x0191, B:80:0x01c1, B:88:0x0204, B:90:0x0230), top: B:77:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d3  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, Object obj2, String str8, Hashtable hashtable, Continuation continuation) {
        l lVar;
        int i10;
        boolean z10;
        String str9;
        Wh.a aVar;
        String str10;
        String str11;
        String str12;
        Object obj3;
        String str13;
        String str14;
        String str15;
        Object obj4;
        String str16;
        Hashtable hashtable2;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        Wh.a aVar2;
        SalesIQChat chat;
        boolean z11;
        Object obj5;
        SalesIQChat salesIQChat;
        MessageEntity messageEntity;
        boolean z12;
        Integer num;
        boolean z13;
        Integer num2;
        String str17;
        Object obj6;
        Message message;
        l lVar2;
        WmsConversationsEventsHandler wmsConversationsEventsHandler2;
        Wh.a aVar3;
        String str18;
        String str19;
        String str20;
        Object obj7;
        MessageEntity messageEntity2;
        String str21;
        Object obj8;
        Hashtable hashtable3;
        Object updateConversation;
        String str22;
        String str23;
        Object obj9;
        Hashtable hashtable4;
        String str24;
        Object D10;
        Message.b bVar;
        Object obj10;
        MessageEntity messageEntity3;
        MessageEntity messageEntity4;
        C6152a L10;
        WmsConversationsEventsHandler wmsConversationsEventsHandler3;
        String str25;
        Object obj11;
        try {
            if (continuation instanceof l) {
                lVar = (l) continuation;
                int i11 = lVar.f42935C;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    lVar.f42935C = i11 - Integer.MIN_VALUE;
                    Object obj12 = lVar.f42933A;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = lVar.f42935C;
                    if (i10 != 0) {
                        z10 = false;
                        ResultKt.throwOnFailure(obj12);
                        Wh.a d10 = C6461a.C0913a.f65814a.d();
                        lVar.f42936n = this;
                        lVar.f42937o = str;
                        lVar.f42938p = str2;
                        lVar.f42939q = str3;
                        lVar.f42940r = obj;
                        lVar.f42941s = str4;
                        str9 = str5;
                        lVar.f42942t = str9;
                        lVar.f42943u = str6;
                        lVar.f42944v = str7;
                        lVar.f42945w = obj2;
                        lVar.f42946x = str8;
                        lVar.f42947y = hashtable;
                        lVar.f42948z = d10;
                        lVar.f42935C = 1;
                        if (d10.f(null, lVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = d10;
                        str10 = str;
                        str11 = str2;
                        str12 = str3;
                        obj3 = obj;
                        str13 = str4;
                        str14 = str6;
                        str15 = str7;
                        obj4 = obj2;
                        str16 = str8;
                        hashtable2 = hashtable;
                        wmsConversationsEventsHandler = this;
                    } else if (i10 == 1) {
                        z10 = false;
                        Wh.a aVar4 = (Wh.a) lVar.f42948z;
                        Hashtable hashtable5 = (Hashtable) lVar.f42947y;
                        String str26 = (String) lVar.f42946x;
                        Object obj13 = lVar.f42945w;
                        String str27 = (String) lVar.f42944v;
                        String str28 = (String) lVar.f42943u;
                        str9 = (String) lVar.f42942t;
                        String str29 = (String) lVar.f42941s;
                        Object obj14 = lVar.f42940r;
                        String str30 = (String) lVar.f42939q;
                        String str31 = (String) lVar.f42938p;
                        String str32 = (String) lVar.f42937o;
                        WmsConversationsEventsHandler wmsConversationsEventsHandler4 = (WmsConversationsEventsHandler) lVar.f42936n;
                        ResultKt.throwOnFailure(obj12);
                        aVar = aVar4;
                        hashtable2 = hashtable5;
                        str16 = str26;
                        obj4 = obj13;
                        str15 = str27;
                        str14 = str28;
                        str13 = str29;
                        obj3 = obj14;
                        str12 = str30;
                        str11 = str31;
                        str10 = str32;
                        wmsConversationsEventsHandler = wmsConversationsEventsHandler4;
                    } else {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str25 = (String) lVar.f42938p;
                                aVar2 = (Wh.a) lVar.f42937o;
                                wmsConversationsEventsHandler3 = (WmsConversationsEventsHandler) lVar.f42936n;
                                try {
                                    ResultKt.throwOnFailure(obj12);
                                    t0(wmsConversationsEventsHandler3, str25, null, null, true, false, null, false, 118, null);
                                    z11 = false;
                                    ne.j.s0(z11, 1, null);
                                    Unit unit = Unit.INSTANCE;
                                    aVar2.g(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    num = null;
                                    aVar2.g(num);
                                    throw th;
                                }
                            }
                            bVar = (Message.b) lVar.f42948z;
                            Message message2 = (Message) lVar.f42947y;
                            MessageEntity messageEntity5 = (MessageEntity) lVar.f42946x;
                            String str33 = (String) lVar.f42945w;
                            Wh.a aVar5 = (Wh.a) lVar.f42944v;
                            hashtable3 = (Hashtable) lVar.f42943u;
                            obj8 = lVar.f42942t;
                            String str34 = (String) lVar.f42941s;
                            String str35 = (String) lVar.f42940r;
                            Object obj15 = lVar.f42939q;
                            str20 = (String) lVar.f42938p;
                            str19 = (String) lVar.f42937o;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler5 = (WmsConversationsEventsHandler) lVar.f42936n;
                            try {
                                ResultKt.throwOnFailure(obj12);
                                lVar2 = lVar;
                                messageEntity3 = messageEntity5;
                                str21 = str34;
                                obj7 = obj15;
                                aVar3 = aVar5;
                                str24 = str35;
                                str18 = str33;
                                message = message2;
                                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler5;
                                obj10 = obj12;
                                if (((Boolean) obj10).booleanValue()) {
                                    messageEntity4 = messageEntity3;
                                } else {
                                    Application F10 = wmsConversationsEventsHandler2.F();
                                    int i12 = C3863c.$EnumSwitchMapping$0[message.getMessageType().ordinal()];
                                    String str36 = str24;
                                    String string = F10.getString(i12 != 1 ? i12 != 2 ? od.t.f61133w1 : od.t.f61145y1 : od.t.f61139x1, bVar != null ? bVar.e() : null);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    WmsConversationsEventsHandler wmsConversationsEventsHandler6 = wmsConversationsEventsHandler2;
                                    wmsConversationsEventsHandler2 = wmsConversationsEventsHandler6;
                                    MessageEntity messageEntity6 = messageEntity3;
                                    Q(wmsConversationsEventsHandler2, messageEntity6, string, wmsConversationsEventsHandler6.N(obj7, messageEntity3.getDisplayName(), str20, str21, obj8, str19, str36, (hashtable3 == null || (obj11 = hashtable3.get("lmsgtime")) == null) ? null : obj11.toString()), false, 8, null);
                                    messageEntity4 = messageEntity6;
                                }
                                L10 = wmsConversationsEventsHandler2.L();
                                lVar2.f42936n = wmsConversationsEventsHandler2;
                                lVar2.f42937o = aVar3;
                                lVar2.f42938p = str18;
                                lVar2.f42939q = null;
                                lVar2.f42940r = null;
                                lVar2.f42941s = null;
                                lVar2.f42942t = null;
                                lVar2.f42943u = null;
                                lVar2.f42944v = null;
                                lVar2.f42945w = null;
                                lVar2.f42946x = null;
                                lVar2.f42947y = null;
                                lVar2.f42948z = null;
                                lVar2.f42935C = 4;
                                if (C6152a.U(L10, messageEntity4, false, lVar2, 2, null) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                wmsConversationsEventsHandler3 = wmsConversationsEventsHandler2;
                                str25 = str18;
                                aVar2 = aVar3;
                                t0(wmsConversationsEventsHandler3, str25, null, null, true, false, null, false, 118, null);
                                z11 = false;
                                ne.j.s0(z11, 1, null);
                                Unit unit2 = Unit.INSTANCE;
                                aVar2.g(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar2 = aVar5;
                                num = null;
                                aVar2.g(num);
                                throw th;
                            }
                        }
                        Message message3 = (Message) lVar.f42948z;
                        messageEntity2 = (MessageEntity) lVar.f42947y;
                        SalesIQChat salesIQChat2 = (SalesIQChat) lVar.f42946x;
                        str18 = (String) lVar.f42945w;
                        aVar3 = (Wh.a) lVar.f42944v;
                        hashtable4 = (Hashtable) lVar.f42943u;
                        obj9 = lVar.f42942t;
                        str21 = (String) lVar.f42941s;
                        String str37 = (String) lVar.f42940r;
                        obj7 = lVar.f42939q;
                        str23 = (String) lVar.f42938p;
                        str22 = (String) lVar.f42937o;
                        wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) lVar.f42936n;
                        try {
                            ResultKt.throwOnFailure(obj12);
                            salesIQChat = salesIQChat2;
                            str17 = str37;
                            message = message3;
                            lVar2 = lVar;
                            obj6 = coroutine_suspended;
                            updateConversation = obj12;
                            String str38 = str23;
                            hashtable3 = hashtable4;
                            str19 = str22;
                            obj8 = obj9;
                            str20 = str38;
                            str24 = str17;
                            Object obj16 = obj6;
                            Message.b bVar2 = (Message.b) AbstractC5895g.b(wmsConversationsEventsHandler2.K(), messageEntity2.getDisplayName(), Message.b.class);
                            lVar2.f42936n = wmsConversationsEventsHandler2;
                            lVar2.f42937o = str19;
                            lVar2.f42938p = str20;
                            lVar2.f42939q = obj7;
                            lVar2.f42940r = str24;
                            lVar2.f42941s = str21;
                            lVar2.f42942t = obj8;
                            lVar2.f42943u = hashtable3;
                            lVar2.f42944v = aVar3;
                            lVar2.f42945w = str18;
                            lVar2.f42946x = messageEntity2;
                            lVar2.f42947y = message;
                            lVar2.f42948z = bVar2;
                            lVar2.f42935C = 3;
                            D10 = D(wmsConversationsEventsHandler2, messageEntity2, salesIQChat, false, lVar2, 2, null);
                            coroutine_suspended = obj16;
                            if (D10 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            MessageEntity messageEntity7 = messageEntity2;
                            bVar = bVar2;
                            obj10 = D10;
                            messageEntity3 = messageEntity7;
                            if (((Boolean) obj10).booleanValue()) {
                            }
                            L10 = wmsConversationsEventsHandler2.L();
                            lVar2.f42936n = wmsConversationsEventsHandler2;
                            lVar2.f42937o = aVar3;
                            lVar2.f42938p = str18;
                            lVar2.f42939q = null;
                            lVar2.f42940r = null;
                            lVar2.f42941s = null;
                            lVar2.f42942t = null;
                            lVar2.f42943u = null;
                            lVar2.f42944v = null;
                            lVar2.f42945w = null;
                            lVar2.f42946x = null;
                            lVar2.f42947y = null;
                            lVar2.f42948z = null;
                            lVar2.f42935C = 4;
                            if (C6152a.U(L10, messageEntity4, false, lVar2, 2, null) != coroutine_suspended) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            aVar2 = aVar3;
                            num = null;
                            aVar2.g(num);
                            throw th;
                        }
                    }
                    String str39 = str9;
                    LiveChatUtil.log("WmsDelay, onAttachmentMessage released inside lock");
                    String chatid = LiveChatUtil.getChatid(str10);
                    chat = LiveChatUtil.getChat(chatid);
                    MessageEntity a10 = c.a(str10, chatid, chat, null, str11, str12, Constants.CASEFIRST_FALSE, obj3, str13, str39, str14, Boxing.boxBoolean(z10), str15, obj4, str16, hashtable2);
                    String str40 = str10;
                    String str41 = str11;
                    Object obj17 = obj3;
                    String str42 = str15;
                    Object obj18 = obj4;
                    Hashtable hashtable6 = hashtable2;
                    if (chat != null) {
                        aVar2 = aVar;
                        z11 = z10;
                        ne.j.s0(z11, 1, null);
                        Unit unit22 = Unit.INSTANCE;
                        aVar2.g(null);
                        return Unit.INSTANCE;
                    }
                    String sender = a10.getSender();
                    if (sender != null) {
                        obj5 = coroutine_suspended;
                        salesIQChat = chat;
                        messageEntity = a10;
                        z12 = z10;
                        num = null;
                        try {
                            if (!StringsKt.startsWith$default(sender, "$", z12, 2, (Object) null)) {
                                z13 = true;
                                num2 = Boxing.boxInt(salesIQChat.getUnreadCount() + 1);
                                LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                                Message g10 = MessageRoomToDomainKt.g(messageEntity, wmsConversationsEventsHandler.F(), wmsConversationsEventsHandler.K(), false, false, null, null, 60, null);
                                MessageEntity messageEntity8 = messageEntity;
                                if (chatid == null) {
                                    ConversationsLocalDataSource J10 = wmsConversationsEventsHandler.J();
                                    Long boxLong = Boxing.boxLong(messageEntity8.getTime().getServerTime());
                                    Long boxLong2 = Boxing.boxLong(0L);
                                    Long boxLong3 = Boxing.boxLong(0L);
                                    lVar.f42936n = wmsConversationsEventsHandler;
                                    lVar.f42937o = str40;
                                    lVar.f42938p = str41;
                                    lVar.f42939q = obj17;
                                    lVar.f42940r = str39;
                                    lVar.f42941s = str42;
                                    lVar.f42942t = obj18;
                                    lVar.f42943u = hashtable6;
                                    lVar.f42944v = aVar;
                                    lVar.f42945w = chatid;
                                    WmsConversationsEventsHandler wmsConversationsEventsHandler7 = wmsConversationsEventsHandler;
                                    SalesIQChat salesIQChat3 = salesIQChat;
                                    lVar.f42946x = salesIQChat3;
                                    lVar.f42947y = messageEntity8;
                                    lVar.f42948z = g10;
                                    salesIQChat = salesIQChat3;
                                    lVar.f42935C = 2;
                                    str17 = str39;
                                    message = g10;
                                    obj6 = obj5;
                                    l lVar3 = lVar;
                                    updateConversation = J10.updateConversation(chatid, (r39 & 2) != 0 ? null : boxLong, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : num2, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : message, (r39 & 512) != 0 ? null : boxLong2, (r39 & 1024) != 0 ? null : boxLong3, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, lVar3);
                                    lVar2 = lVar3;
                                    if (updateConversation == obj6) {
                                        return obj6;
                                    }
                                    wmsConversationsEventsHandler2 = wmsConversationsEventsHandler7;
                                    aVar3 = aVar;
                                    str18 = chatid;
                                    str22 = str40;
                                    str23 = str41;
                                    obj7 = obj17;
                                    messageEntity2 = messageEntity8;
                                    str21 = str42;
                                    obj9 = obj18;
                                    hashtable4 = hashtable6;
                                    String str382 = str23;
                                    hashtable3 = hashtable4;
                                    str19 = str22;
                                    obj8 = obj9;
                                    str20 = str382;
                                    str24 = str17;
                                    Object obj162 = obj6;
                                    Message.b bVar22 = (Message.b) AbstractC5895g.b(wmsConversationsEventsHandler2.K(), messageEntity2.getDisplayName(), Message.b.class);
                                    lVar2.f42936n = wmsConversationsEventsHandler2;
                                    lVar2.f42937o = str19;
                                    lVar2.f42938p = str20;
                                    lVar2.f42939q = obj7;
                                    lVar2.f42940r = str24;
                                    lVar2.f42941s = str21;
                                    lVar2.f42942t = obj8;
                                    lVar2.f42943u = hashtable3;
                                    lVar2.f42944v = aVar3;
                                    lVar2.f42945w = str18;
                                    lVar2.f42946x = messageEntity2;
                                    lVar2.f42947y = message;
                                    lVar2.f42948z = bVar22;
                                    lVar2.f42935C = 3;
                                    D10 = D(wmsConversationsEventsHandler2, messageEntity2, salesIQChat, false, lVar2, 2, null);
                                    coroutine_suspended = obj162;
                                    if (D10 == coroutine_suspended) {
                                    }
                                } else {
                                    WmsConversationsEventsHandler wmsConversationsEventsHandler8 = wmsConversationsEventsHandler;
                                    str17 = str39;
                                    obj6 = obj5;
                                    message = g10;
                                    lVar2 = lVar;
                                    wmsConversationsEventsHandler2 = wmsConversationsEventsHandler8;
                                    aVar3 = aVar;
                                    str18 = chatid;
                                    str19 = str40;
                                    str20 = str41;
                                    obj7 = obj17;
                                    messageEntity2 = messageEntity8;
                                    str21 = str42;
                                    obj8 = obj18;
                                    hashtable3 = hashtable6;
                                    str24 = str17;
                                    Object obj1622 = obj6;
                                    Message.b bVar222 = (Message.b) AbstractC5895g.b(wmsConversationsEventsHandler2.K(), messageEntity2.getDisplayName(), Message.b.class);
                                    lVar2.f42936n = wmsConversationsEventsHandler2;
                                    lVar2.f42937o = str19;
                                    lVar2.f42938p = str20;
                                    lVar2.f42939q = obj7;
                                    lVar2.f42940r = str24;
                                    lVar2.f42941s = str21;
                                    lVar2.f42942t = obj8;
                                    lVar2.f42943u = hashtable3;
                                    lVar2.f42944v = aVar3;
                                    lVar2.f42945w = str18;
                                    lVar2.f42946x = messageEntity2;
                                    lVar2.f42947y = message;
                                    lVar2.f42948z = bVar222;
                                    lVar2.f42935C = 3;
                                    D10 = D(wmsConversationsEventsHandler2, messageEntity2, salesIQChat, false, lVar2, 2, null);
                                    coroutine_suspended = obj1622;
                                    if (D10 == coroutine_suspended) {
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            aVar2 = aVar;
                            aVar2.g(num);
                            throw th;
                        }
                    } else {
                        obj5 = coroutine_suspended;
                        salesIQChat = chat;
                        messageEntity = a10;
                        z12 = z10;
                        num = null;
                    }
                    z13 = true;
                    num2 = num;
                    Message g102 = MessageRoomToDomainKt.g(messageEntity, wmsConversationsEventsHandler.F(), wmsConversationsEventsHandler.K(), false, false, null, null, 60, null);
                    MessageEntity messageEntity82 = messageEntity;
                    if (chatid == null) {
                    }
                }
            }
            LiveChatUtil.log("WmsDelay, onAttachmentMessage released inside lock");
            String chatid2 = LiveChatUtil.getChatid(str10);
            chat = LiveChatUtil.getChat(chatid2);
            MessageEntity a102 = c.a(str10, chatid2, chat, null, str11, str12, Constants.CASEFIRST_FALSE, obj3, str13, str39, str14, Boxing.boxBoolean(z10), str15, obj4, str16, hashtable2);
            String str402 = str10;
            String str412 = str11;
            Object obj172 = obj3;
            String str422 = str15;
            Object obj182 = obj4;
            Hashtable hashtable62 = hashtable2;
            if (chat != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            aVar2 = aVar;
            num = null;
            aVar2.g(num);
            throw th;
        }
        lVar = new l(continuation);
        Object obj122 = lVar.f42933A;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = lVar.f42935C;
        if (i10 != 0) {
        }
        String str392 = str9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|(1:(4:(1:(1:(7:12|13|14|15|16|17|18)(2:25|26))(9:27|28|29|30|31|(1:43)(1:35)|36|(5:39|15|16|17|18)|38))(6:47|48|49|50|51|(4:53|16|17|18)(2:54|(2:56|38)(7:57|31|(1:33)|43|36|(0)|38)))|22|23|24)(1:61))(3:79|(1:81)|38)|62|63|64|(1:66)(1:78)|67|(1:69)|70|(1:72)(1:77)|73|(2:75|38)(3:76|51|(0)(0))))|82|6|(0)(0)|62|63|64|(0)(0)|67|(0)|70|(0)(0)|73|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0156, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0157, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0216 A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:31:0x023a, B:33:0x024c, B:35:0x0252, B:36:0x0259, B:51:0x0201, B:54:0x0216, B:64:0x0140, B:66:0x014f, B:67:0x015b, B:69:0x0169, B:72:0x0175, B:73:0x017e), top: B:63:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:31:0x023a, B:33:0x024c, B:35:0x0252, B:36:0x0259, B:51:0x0201, B:54:0x0216, B:64:0x0140, B:66:0x014f, B:67:0x015b, B:69:0x0169, B:72:0x0175, B:73:0x017e), top: B:63:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169 A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:31:0x023a, B:33:0x024c, B:35:0x0252, B:36:0x0259, B:51:0x0201, B:54:0x0216, B:64:0x0140, B:66:0x014f, B:67:0x015b, B:69:0x0169, B:72:0x0175, B:73:0x017e), top: B:63:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175 A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:31:0x023a, B:33:0x024c, B:35:0x0252, B:36:0x0259, B:51:0x0201, B:54:0x0216, B:64:0x0140, B:66:0x014f, B:67:0x015b, B:69:0x0169, B:72:0x0175, B:73:0x017e), top: B:63:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(String str, String str2, String str3, String str4, Object obj, String str5, String str6, String str7, Boolean bool, String str8, Object obj2, String str9, Hashtable hashtable, Continuation continuation) {
        m mVar;
        Object coroutine_suspended;
        int i10;
        String str10;
        String str11;
        Hashtable hashtable2;
        Wh.a aVar;
        String str12;
        String str13;
        String str14;
        Object obj3;
        String str15;
        String str16;
        String str17;
        Boolean bool2;
        Object obj4;
        String str18;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        SalesIQChat chat;
        Object K10;
        MessageEntity messageEntity;
        WmsConversationsEventsHandler wmsConversationsEventsHandler2;
        Wh.a aVar2;
        Rh.j G10;
        Pair pair;
        WmsConversationsEventsHandler wmsConversationsEventsHandler3;
        Long typingDelay;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f42953E;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f42953E = i11 - Integer.MIN_VALUE;
                Object obj5 = mVar.f42951C;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = mVar.f42953E;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj5);
                    Wh.a d10 = C6461a.C0913a.f65814a.d();
                    mVar.f42954n = this;
                    mVar.f42955o = str;
                    mVar.f42956p = str2;
                    mVar.f42957q = str3;
                    mVar.f42958r = str4;
                    mVar.f42959s = obj;
                    mVar.f42960t = str5;
                    mVar.f42961u = str6;
                    mVar.f42962v = str7;
                    mVar.f42963w = bool;
                    str10 = str8;
                    mVar.f42964x = str10;
                    mVar.f42965y = obj2;
                    mVar.f42966z = str9;
                    mVar.f42949A = hashtable;
                    mVar.f42950B = d10;
                    mVar.f42953E = 1;
                    if (d10.f(null, mVar) != coroutine_suspended) {
                        str11 = str;
                        hashtable2 = hashtable;
                        aVar = d10;
                        str12 = str2;
                        str13 = str3;
                        str14 = str4;
                        obj3 = obj;
                        str15 = str5;
                        str16 = str6;
                        str17 = str7;
                        bool2 = bool;
                        obj4 = obj2;
                        str18 = str9;
                        wmsConversationsEventsHandler = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        MessageEntity messageEntity2 = (MessageEntity) mVar.f42956p;
                        Wh.a aVar3 = (Wh.a) mVar.f42955o;
                        wmsConversationsEventsHandler = (WmsConversationsEventsHandler) mVar.f42954n;
                        try {
                            ResultKt.throwOnFailure(obj5);
                            messageEntity = messageEntity2;
                            aVar = aVar3;
                            if (!Intrinsics.areEqual(((C5582a) obj5).b(), Boxing.boxBoolean(true))) {
                                aVar2 = aVar;
                                Unit unit = Unit.INSTANCE;
                                aVar2.g(null);
                                return Unit.INSTANCE;
                            }
                            C6152a L10 = wmsConversationsEventsHandler.L();
                            mVar.f42954n = wmsConversationsEventsHandler;
                            mVar.f42955o = aVar;
                            mVar.f42956p = messageEntity;
                            mVar.f42953E = 3;
                            if (C6152a.U(L10, messageEntity, false, mVar, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler;
                            Message.Meta meta = (Message.Meta) AbstractC5895g.b(wmsConversationsEventsHandler2.K(), messageEntity.getMeta(), Message.Meta.class);
                            if (meta != null) {
                            }
                            G10 = wmsConversationsEventsHandler2.G();
                            pair = new Pair(Boxing.boxLong(r5 * 1000), messageEntity);
                            mVar.f42954n = wmsConversationsEventsHandler2;
                            mVar.f42955o = aVar;
                            mVar.f42956p = null;
                            mVar.f42953E = 4;
                            if (G10.o(pair, mVar) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2 = aVar3;
                        }
                    } else if (i10 == 3) {
                        MessageEntity messageEntity3 = (MessageEntity) mVar.f42956p;
                        Wh.a aVar4 = (Wh.a) mVar.f42955o;
                        wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) mVar.f42954n;
                        try {
                            ResultKt.throwOnFailure(obj5);
                            messageEntity = messageEntity3;
                            aVar = aVar4;
                            Message.Meta meta2 = (Message.Meta) AbstractC5895g.b(wmsConversationsEventsHandler2.K(), messageEntity.getMeta(), Message.Meta.class);
                            long longValue = (meta2 != null || (typingDelay = meta2.getTypingDelay()) == null) ? 3L : typingDelay.longValue();
                            G10 = wmsConversationsEventsHandler2.G();
                            pair = new Pair(Boxing.boxLong(longValue * 1000), messageEntity);
                            mVar.f42954n = wmsConversationsEventsHandler2;
                            mVar.f42955o = aVar;
                            mVar.f42956p = null;
                            mVar.f42953E = 4;
                            if (G10.o(pair, mVar) != coroutine_suspended) {
                                aVar2 = aVar;
                                wmsConversationsEventsHandler3 = wmsConversationsEventsHandler2;
                                wmsConversationsEventsHandler3.u0();
                                Unit unit2 = Unit.INSTANCE;
                                aVar2.g(null);
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = aVar4;
                        }
                    } else {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (Wh.a) mVar.f42955o;
                        wmsConversationsEventsHandler3 = (WmsConversationsEventsHandler) mVar.f42954n;
                        try {
                            ResultKt.throwOnFailure(obj5);
                            wmsConversationsEventsHandler3.u0();
                            Unit unit22 = Unit.INSTANCE;
                            aVar2.g(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    aVar2.g(null);
                    throw th;
                }
                aVar = (Wh.a) mVar.f42950B;
                Hashtable hashtable3 = (Hashtable) mVar.f42949A;
                String str19 = (String) mVar.f42966z;
                Object obj6 = mVar.f42965y;
                str10 = (String) mVar.f42964x;
                Boolean bool3 = (Boolean) mVar.f42963w;
                String str20 = (String) mVar.f42962v;
                String str21 = (String) mVar.f42961u;
                String str22 = (String) mVar.f42960t;
                Object obj7 = mVar.f42959s;
                String str23 = (String) mVar.f42958r;
                String str24 = (String) mVar.f42957q;
                String str25 = (String) mVar.f42956p;
                String str26 = (String) mVar.f42955o;
                WmsConversationsEventsHandler wmsConversationsEventsHandler4 = (WmsConversationsEventsHandler) mVar.f42954n;
                ResultKt.throwOnFailure(obj5);
                str12 = str25;
                str11 = str26;
                str16 = str21;
                str15 = str22;
                obj3 = obj7;
                str13 = str24;
                str14 = str23;
                hashtable2 = hashtable3;
                str18 = str19;
                obj4 = obj6;
                bool2 = bool3;
                str17 = str20;
                wmsConversationsEventsHandler = wmsConversationsEventsHandler4;
                String str27 = str10;
                com.google.gson.h d11 = com.google.gson.m.d(str27);
                Intrinsics.checkNotNullExpressionValue(d11, "parseString(...)");
                com.google.gson.k d12 = AbstractC5896h.d(d11);
                String f10 = AbstractC5896h.f(d12 == null ? d12.r("38") : null);
                chat = LiveChatUtil.getChat(LiveChatUtil.getChatid(str11));
                if (chat == null) {
                    chat = wmsConversationsEventsHandler.J().getChatFromAcknowledgementKey(f10);
                }
                SalesIQChat salesIQChat = chat;
                MessageEntity copy$default = MessageEntity.copy$default(c.a(str11, salesIQChat == null ? salesIQChat.getChid() : null, salesIQChat, null, str12, str13, str14, obj3, str15, str16, str17, bool2, str27, obj4, str18, hashtable2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, Boxing.boxBoolean(false), null, null, null, null, false, null, null, 133693439, null);
                C6152a L11 = wmsConversationsEventsHandler.L();
                String chatId = copy$default.getChatId();
                String messageId = copy$default.getMessageId();
                mVar.f42954n = wmsConversationsEventsHandler;
                mVar.f42955o = aVar;
                mVar.f42956p = copy$default;
                mVar.f42957q = null;
                mVar.f42958r = null;
                mVar.f42959s = null;
                mVar.f42960t = null;
                mVar.f42961u = null;
                mVar.f42962v = null;
                mVar.f42963w = null;
                mVar.f42964x = null;
                mVar.f42965y = null;
                mVar.f42966z = null;
                mVar.f42949A = null;
                mVar.f42950B = null;
                mVar.f42953E = 2;
                K10 = L11.K(chatId, messageId, mVar);
                if (K10 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                messageEntity = copy$default;
                obj5 = K10;
                if (!Intrinsics.areEqual(((C5582a) obj5).b(), Boxing.boxBoolean(true))) {
                }
            }
        }
        mVar = new m(continuation);
        Object obj52 = mVar.f42951C;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = mVar.f42953E;
        if (i10 != 0) {
        }
        String str272 = str10;
        com.google.gson.h d112 = com.google.gson.m.d(str272);
        Intrinsics.checkNotNullExpressionValue(d112, "parseString(...)");
        com.google.gson.k d122 = AbstractC5896h.d(d112);
        String f102 = AbstractC5896h.f(d122 == null ? d122.r("38") : null);
        chat = LiveChatUtil.getChat(LiveChatUtil.getChatid(str11));
        if (chat == null) {
        }
        SalesIQChat salesIQChat2 = chat;
        MessageEntity copy$default2 = MessageEntity.copy$default(c.a(str11, salesIQChat2 == null ? salesIQChat2.getChid() : null, salesIQChat2, null, str12, str13, str14, obj3, str15, str16, str17, bool2, str272, obj4, str18, hashtable2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, Boxing.boxBoolean(false), null, null, null, null, false, null, null, 133693439, null);
        C6152a L112 = wmsConversationsEventsHandler.L();
        String chatId2 = copy$default2.getChatId();
        String messageId2 = copy$default2.getMessageId();
        mVar.f42954n = wmsConversationsEventsHandler;
        mVar.f42955o = aVar;
        mVar.f42956p = copy$default2;
        mVar.f42957q = null;
        mVar.f42958r = null;
        mVar.f42959s = null;
        mVar.f42960t = null;
        mVar.f42961u = null;
        mVar.f42962v = null;
        mVar.f42963w = null;
        mVar.f42964x = null;
        mVar.f42965y = null;
        mVar.f42966z = null;
        mVar.f42949A = null;
        mVar.f42950B = null;
        mVar.f42953E = 2;
        K10 = L112.K(chatId2, messageId2, mVar);
        if (K10 != coroutine_suspended) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(List messageTables, String str, String str2, boolean z10, Rf.a aVar, boolean z11, Function0 function0) {
        C0 d10;
        C0 c02;
        Intrinsics.checkNotNullParameter(messageTables, "messageTables");
        C0 c03 = this.f42882g;
        if (c03 != null) {
            C0.a.b(c03, null, 1, null);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str2;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = function0;
        d10 = AbstractC1459k.d(E(), null, null, new WmsConversationsEventsHandler$onBotMessages$1(messageTables, z10, objectRef2, objectRef, str, this, intRef, z11, aVar, null), 3, null);
        if (!z11) {
            this.f42882g = d10;
        }
        if (z11 || (c02 = this.f42882g) == null) {
            return;
        }
        c02.invokeOnCompletion(new n(objectRef, messageTables, str, z10, objectRef2, intRef));
    }

    public final void W(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new o(messageTable, this, null), 3, null);
    }

    public final Object X(String str, Message message, Continuation continuation) {
        Object updateConversation;
        if (str != null) {
            updateConversation = J().updateConversation(str, (r39 & 2) != 0 ? null : Boxing.boxLong(message.getServerTime()), (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
            if (updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return updateConversation;
            }
        }
        return Unit.INSTANCE;
    }

    public final void Y(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new p(messageTable, this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d2, code lost:
    
        if (((me.C5582a) r1) != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0150, code lost:
    
        if (r1 == r0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(String str, Message message, SalesIQChat salesIQChat, Continuation continuation) {
        q qVar;
        int i10;
        Object obj;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        String str2;
        Message message2;
        Message.User operationUser;
        Message.User operationUser2;
        Message.User operationUser3;
        String name;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i11 = qVar.f43026s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f43026s = i11 - Integer.MIN_VALUE;
                Object obj2 = qVar.f43024q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = qVar.f43026s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (str != null) {
                        Message.InfoMessage infoMessage = message.getInfoMessage();
                        WmsConversationsEventsHandler wmsConversationsEventsHandler2 = Intrinsics.areEqual(infoMessage != null ? infoMessage.getMode() : null, Message.InfoMessage.Mode.ChatMonitorJoin.getValue()) ? this : null;
                        if (wmsConversationsEventsHandler2 != null) {
                            ConversationsLocalDataSource J10 = wmsConversationsEventsHandler2.J();
                            Integer boxInt = salesIQChat != null ? Boxing.boxInt(salesIQChat.getUnreadCount() + 1) : null;
                            Long boxLong = Boxing.boxLong(message.getServerTime());
                            qVar.f43021n = this;
                            qVar.f43022o = str;
                            qVar.f43023p = message;
                            qVar.f43026s = 1;
                            q qVar2 = qVar;
                            obj = coroutine_suspended;
                            obj2 = J10.updateConversation(str, (r39 & 2) != 0 ? null : boxLong, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : boxInt, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, qVar2);
                            qVar = qVar2;
                            if (obj2 != obj) {
                                wmsConversationsEventsHandler = this;
                                str2 = str;
                                message2 = message;
                            }
                            return obj;
                        }
                        obj = coroutine_suspended;
                        wmsConversationsEventsHandler = this;
                        str2 = str;
                        message2 = message;
                        ConversationsLocalDataSource J11 = wmsConversationsEventsHandler.J();
                        Message.InfoMessage infoMessage2 = message2.getInfoMessage();
                        String obj3 = (infoMessage2 == null || (operationUser3 = infoMessage2.getOperationUser()) == null || (name = operationUser3.getName()) == null) ? null : StringsKt.trim((CharSequence) name).toString();
                        Message.InfoMessage infoMessage3 = message2.getInfoMessage();
                        String id2 = (infoMessage3 == null || (operationUser2 = infoMessage3.getOperationUser()) == null) ? null : operationUser2.getId();
                        Message.InfoMessage infoMessage4 = message2.getInfoMessage();
                        String imageFileKey = (infoMessage4 == null || (operationUser = infoMessage4.getOperationUser()) == null) ? null : operationUser.getImageFileKey();
                        Long boxLong2 = Boxing.boxLong(message2.getServerTime());
                        qVar.f43021n = null;
                        qVar.f43022o = null;
                        qVar.f43023p = null;
                        qVar.f43026s = 2;
                        obj2 = J11.updateConversation(str2, (r39 & 2) != 0 ? null : boxLong2, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : obj3, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : id2, (r39 & 128) != 0 ? null : imageFileKey, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, qVar);
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                message2 = (Message) qVar.f43023p;
                str2 = (String) qVar.f43022o;
                wmsConversationsEventsHandler = (WmsConversationsEventsHandler) qVar.f43021n;
                ResultKt.throwOnFailure(obj2);
                obj = coroutine_suspended;
            }
        }
        qVar = new q(continuation);
        Object obj22 = qVar.f43024q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = qVar.f43026s;
        if (i10 != 0) {
        }
    }

    public final void a0(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new r(messageTable, null), 3, null);
    }

    public final void b0(SalesIQChat salesIQChat, Message message, MessageEntity messageEntity) {
        Message.User operationUser;
        String id2;
        Message.User operationUser2;
        String name;
        Message.User operationUser3;
        Message.InfoMessage infoMessage = message.getInfoMessage();
        boolean areEqual = Intrinsics.areEqual((infoMessage == null || (operationUser3 = infoMessage.getOperationUser()) == null) ? null : operationUser3.getId(), LiveChatUtil.getAnnonID());
        if ((salesIQChat == null || salesIQChat.getStatus() != 2) && !areEqual) {
            if (salesIQChat != null) {
                salesIQChat.setStatus(2);
            }
            if (salesIQChat != null) {
                salesIQChat.setLastmsgtime(message.getServerTime());
            }
            if (salesIQChat != null) {
                Message.InfoMessage infoMessage2 = message.getInfoMessage();
                salesIQChat.setAttenderName((infoMessage2 == null || (operationUser2 = infoMessage2.getOperationUser()) == null || (name = operationUser2.getName()) == null) ? null : StringsKt.trim((CharSequence) name).toString());
            }
            if (salesIQChat != null) {
                Message.InfoMessage infoMessage3 = message.getInfoMessage();
                salesIQChat.setAttenderid((infoMessage3 == null || (operationUser = infoMessage3.getOperationUser()) == null || (id2 = operationUser.getId()) == null) ? null : StringsKt.trim((CharSequence) id2).toString());
            }
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
            t0(this, salesIQChat != null ? salesIQChat.getChid() : null, salesIQChat != null ? salesIQChat.getConvID() : null, messageEntity, false, true, null, false, 104, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(SalesIQChat salesIQChat, Message message, String str, Continuation continuation) {
        s sVar;
        int i10;
        String str2;
        boolean z10;
        Object updateConversation;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        Message.InfoMessage.Department department;
        Message.InfoMessage.Department department2;
        Message.User operationUser;
        Message.User operationUser2;
        Message.User operationUser3;
        String name;
        String K10;
        SalesIQChat salesIQChat2 = salesIQChat;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i11 = sVar.f43035r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.f43035r = i11 - Integer.MIN_VALUE;
                Object obj = sVar.f43033p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sVar.f43035r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (salesIQChat2 != null) {
                        ConversationsLocalDataSource J10 = J();
                        String chatId = message.getChatId();
                        int unreadCount = salesIQChat2.getUnreadCount() + 1;
                        long serverTime = message.getServerTime();
                        Message.InfoMessage infoMessage = message.getInfoMessage();
                        String obj2 = (infoMessage == null || (operationUser3 = infoMessage.getOperationUser()) == null || (name = operationUser3.getName()) == null) ? null : StringsKt.trim((CharSequence) name).toString();
                        Message.InfoMessage infoMessage2 = message.getInfoMessage();
                        String id2 = (infoMessage2 == null || (operationUser2 = infoMessage2.getOperationUser()) == null) ? null : operationUser2.getId();
                        Message.InfoMessage infoMessage3 = message.getInfoMessage();
                        String imageFileKey = (infoMessage3 == null || (operationUser = infoMessage3.getOperationUser()) == null) ? null : operationUser.getImageFileKey();
                        Message.InfoMessage infoMessage4 = message.getInfoMessage();
                        String id3 = (infoMessage4 == null || (department2 = infoMessage4.getDepartment()) == null) ? null : department2.getId();
                        Message.InfoMessage infoMessage5 = message.getInfoMessage();
                        String name2 = (infoMessage5 == null || (department = infoMessage5.getDepartment()) == null) ? null : department.getName();
                        Long boxLong = Boxing.boxLong(serverTime);
                        Boolean boxBoolean = Boxing.boxBoolean(false);
                        Integer boxInt = Boxing.boxInt(unreadCount);
                        String str3 = obj2;
                        String str4 = imageFileKey;
                        Long boxLong2 = Boxing.boxLong(0L);
                        Long boxLong3 = Boxing.boxLong(0L);
                        sVar.f43031n = this;
                        sVar.f43032o = salesIQChat2;
                        sVar.f43035r = 1;
                        str2 = null;
                        z10 = false;
                        updateConversation = J10.updateConversation(chatId, (r39 & 2) != 0 ? null : boxLong, (r39 & 4) != 0 ? null : boxBoolean, (r39 & 8) != 0 ? null : boxInt, (r39 & 16) != 0 ? null : str3, (r39 & 32) != 0 ? null : str, (r39 & 64) != 0 ? null : id2, (r39 & 128) != 0 ? null : str4, (r39 & 256) != 0 ? null : message, (r39 & 512) != 0 ? null : boxLong2, (r39 & 1024) != 0 ? null : boxLong3, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : id3, (r39 & 32768) != 0 ? null : name2, sVar);
                        if (updateConversation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        wmsConversationsEventsHandler = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                salesIQChat2 = (SalesIQChat) sVar.f43032o;
                wmsConversationsEventsHandler = (WmsConversationsEventsHandler) sVar.f43031n;
                ResultKt.throwOnFailure(obj);
                z10 = false;
                str2 = null;
                SalesIQChat chat$default = ConversationsLocalDataSource.getChat$default(wmsConversationsEventsHandler.J(), salesIQChat2.getChid(), z10, 2, str2);
                K10 = Td.e.K();
                if (K10 != null) {
                    if (Intrinsics.areEqual(K10, chat$default != null ? chat$default.getVisitorid() : str2)) {
                        Td.e.W0(null, null, null, null, null, Td.e.x(Te.a.I(chat$default != null ? chat$default.getConvID() : str2), chat$default), null, 95, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        sVar = new s(continuation);
        Object obj3 = sVar.f43033p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sVar.f43035r;
        if (i10 != 0) {
        }
        SalesIQChat chat$default2 = ConversationsLocalDataSource.getChat$default(wmsConversationsEventsHandler.J(), salesIQChat2.getChid(), z10, 2, str2);
        K10 = Td.e.K();
        if (K10 != null) {
        }
        return Unit.INSTANCE;
    }

    public final void d0(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new t(messageTable, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(String str, Hashtable hashtable, Message message, Continuation continuation) {
        u uVar;
        Object obj;
        Object coroutine_suspended;
        int i10;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        String str2;
        Message message2;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i11 = uVar.f43048s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f43048s = i11 - Integer.MIN_VALUE;
                obj = uVar.f43046q;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = uVar.f43048s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (str != null) {
                        ConversationsLocalDataSource J10 = J();
                        Object obj2 = hashtable.get("current_position");
                        if (obj2 == null) {
                            Hashtable f02 = f0(hashtable);
                            obj2 = f02 != null ? f02.get("current_position") : null;
                        }
                        Long boxLong = Boxing.boxLong(og.i.q(String.valueOf(obj2), -1L));
                        Object obj3 = hashtable.get("average_response_time");
                        if (obj3 == null) {
                            Hashtable f03 = f0(hashtable);
                            obj3 = f03 != null ? f03.get("average_response_time") : null;
                        }
                        Long boxLong2 = Boxing.boxLong(og.i.q(String.valueOf(obj3), -1L));
                        uVar.f43043n = this;
                        uVar.f43044o = str;
                        uVar.f43045p = message;
                        uVar.f43048s = 1;
                        if (J10.updateChatQueueDetails(str, boxLong, boxLong2, uVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        wmsConversationsEventsHandler = this;
                        str2 = str;
                        message2 = message;
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                message2 = (Message) uVar.f43045p;
                String str3 = (String) uVar.f43044o;
                WmsConversationsEventsHandler wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) uVar.f43043n;
                ResultKt.throwOnFailure(obj);
                str2 = str3;
                wmsConversationsEventsHandler = wmsConversationsEventsHandler2;
                ConversationsLocalDataSource J11 = wmsConversationsEventsHandler.J();
                Long boxLong3 = Boxing.boxLong(message2.getServerTime());
                uVar.f43043n = null;
                uVar.f43044o = null;
                uVar.f43045p = null;
                uVar.f43048s = 2;
                obj = J11.updateConversation(str2, (r39 & 2) != 0 ? null : boxLong3, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, uVar);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        uVar = new u(continuation);
        obj = uVar.f43046q;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = uVar.f43048s;
        if (i10 != 0) {
        }
        ConversationsLocalDataSource J112 = wmsConversationsEventsHandler.J();
        Long boxLong32 = Boxing.boxLong(message2.getServerTime());
        uVar.f43043n = null;
        uVar.f43044o = null;
        uVar.f43045p = null;
        uVar.f43048s = 2;
        obj = J112.updateConversation(str2, (r39 & 2) != 0 ? null : boxLong32, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, uVar);
        if (obj == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final void g0(Hashtable messageTable, String str) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new v(str, messageTable, this, null), 3, null);
    }

    public final Object h0(String str, SalesIQChat salesIQChat, Message message, Continuation continuation) {
        Object updateConversation;
        Message.User operationUser;
        Message.User operationUser2;
        Message.User operationUser3;
        String name;
        if (str != null) {
            ConversationsLocalDataSource J10 = J();
            Long boxLong = Boxing.boxLong(message.getServerTime());
            Boolean boxBoolean = Boxing.boxBoolean(false);
            String str2 = null;
            Integer boxInt = salesIQChat != null ? Boxing.boxInt(salesIQChat.getUnreadCount() + 1) : null;
            Message.InfoMessage infoMessage = message.getInfoMessage();
            String obj = (infoMessage == null || (operationUser3 = infoMessage.getOperationUser()) == null || (name = operationUser3.getName()) == null) ? null : StringsKt.trim((CharSequence) name).toString();
            Message.InfoMessage infoMessage2 = message.getInfoMessage();
            String id2 = (infoMessage2 == null || (operationUser2 = infoMessage2.getOperationUser()) == null) ? null : operationUser2.getId();
            Message.InfoMessage infoMessage3 = message.getInfoMessage();
            if (infoMessage3 != null && (operationUser = infoMessage3.getOperationUser()) != null) {
                str2 = operationUser.getImageFileKey();
            }
            updateConversation = J10.updateConversation(str, (r39 & 2) != 0 ? null : boxLong, (r39 & 4) != 0 ? null : boxBoolean, (r39 & 8) != 0 ? null : boxInt, (r39 & 16) != 0 ? null : obj, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : id2, (r39 & 128) != 0 ? null : str2, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
            if (updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return updateConversation;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if ((r0 != null ? r0.getOperation() : null) != com.zoho.livechat.android.modules.messages.domain.entities.Message.InfoMessage.Operation.CallEnd) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i0(SalesIQChat salesIQChat, Message message, Continuation continuation) {
        Object updateConversation;
        if (salesIQChat != null) {
            if (salesIQChat.getType() == SalesIQChat.c.Call) {
                Message.InfoMessage infoMessage = message.getInfoMessage();
            }
            ConversationsLocalDataSource J10 = J();
            String chid = salesIQChat.getChid();
            Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
            updateConversation = J10.updateConversation(chid, (r39 & 2) != 0 ? null : Boxing.boxLong(message.getServerTime()), (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : Boxing.boxInt(salesIQChat.getUnreadCount() + 1), (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
            return updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConversation : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void j0(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new w(messageTable, null), 3, null);
    }

    public final void k0(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new x(messageTable, null), 3, null);
    }

    public final void l0(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new y(messageTable, this, null), 3, null);
    }

    public final void m0(Hashtable hashtable) {
        AbstractC1459k.d(E(), null, null, new z(hashtable, this, null), 3, null);
    }

    public final Object n0(SalesIQChat salesIQChat, Message message, Continuation continuation) {
        Object updateConversation;
        if (salesIQChat != null) {
            ConversationsLocalDataSource J10 = J();
            String chid = salesIQChat.getChid();
            Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
            updateConversation = J10.updateConversation(chid, (r39 & 2) != 0 ? null : Boxing.boxLong(message.getServerTime()), (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : Boxing.boxInt(salesIQChat.getUnreadCount() + 1), (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
            if (updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return updateConversation;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object o0(String str, SalesIQChat salesIQChat, Message message, Continuation continuation) {
        Object updateConversation;
        if (str != null) {
            updateConversation = J().updateConversation(str, (r39 & 2) != 0 ? null : Boxing.boxLong(message.getServerTime()), (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : salesIQChat != null ? Boxing.boxInt(salesIQChat.getUnreadCount() + 1) : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
            if (updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return updateConversation;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:3|(15:5|6|(1:(12:(2:153|(1:(1:(16:157|158|159|160|70|71|72|73|74|75|76|(1:78)|79|80|81|82)(2:163|164))(10:165|166|167|116|(1:118)|119|57|58|59|(8:61|62|63|64|65|66|67|(1:97)(13:69|70|71|72|73|74|75|76|(0)|79|80|81|82))(11:105|72|73|74|75|76|(0)|79|80|81|82)))(8:168|169|170|56|57|58|59|(0)(0)))(13:10|11|12|13|14|15|(1:146)(7:18|19|20|21|22|23|(13:25|(2:138|139)(1:27)|(1:29)|(1:137)(2:33|34)|35|36|(1:136)(3:40|(3:42|43|44)(5:127|128|129|130|131)|45)|46|47|48|49|50|(3:52|53|(1:108)(6:55|56|57|58|59|(0)(0)))(8:109|110|(4:112|(2:114|115)|116|(0))|119|57|58|59|(0)(0))))|140|47|48|49|50|(0)(0))|126|92|93|74|75|76|(0)|79|80|81|82)(1:173))(2:211|(2:213|214)(1:215))|174|175|176|177|178|(2:205|206)(1:180)|181|(1:183)|184|(1:186)(1:204)|187|(2:189|(5:191|192|193|194|(1:197)(11:196|14|15|(0)|146|140|47|48|49|50|(0)(0)))(4:202|49|50|(0)(0)))(10:203|73|74|75|76|(0)|79|80|81|82)))|175|176|177|178|(0)(0)|181|(0)|184|(0)(0)|187|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x058b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x058c, code lost:
    
        r1 = null;
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x007b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:172:0x007b */
    /* JADX WARN: Removed duplicated region for block: B:105:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04b4 A[Catch: all -> 0x020a, TRY_LEAVE, TryCatch #6 {all -> 0x020a, blocks: (B:116:0x04ac, B:118:0x04b4, B:52:0x042a, B:112:0x0477, B:206:0x0203, B:183:0x021d, B:186:0x023f), top: B:205:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021d A[Catch: all -> 0x020a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x020a, blocks: (B:116:0x04ac, B:118:0x04b4, B:52:0x042a, B:112:0x0477, B:206:0x0203, B:183:0x021d, B:186:0x023f), top: B:205:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f A[Catch: all -> 0x020a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x020a, blocks: (B:116:0x04ac, B:118:0x04b4, B:52:0x042a, B:112:0x0477, B:206:0x0203, B:183:0x021d, B:186:0x023f), top: B:205:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0257 A[Catch: all -> 0x058b, TRY_LEAVE, TryCatch #7 {all -> 0x058b, blocks: (B:50:0x0422, B:110:0x0473, B:178:0x01f2, B:181:0x020f, B:184:0x0225, B:187:0x0245, B:189:0x0257), top: B:177:0x01f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x042a A[Catch: all -> 0x020a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x020a, blocks: (B:116:0x04ac, B:118:0x04b4, B:52:0x042a, B:112:0x0477, B:206:0x0203, B:183:0x021d, B:186:0x023f), top: B:205:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04cb A[Catch: all -> 0x0558, TRY_LEAVE, TryCatch #14 {all -> 0x0558, blocks: (B:59:0x04c5, B:61:0x04cb), top: B:58:0x04c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05a9 A[Catch: all -> 0x05af, TryCatch #10 {all -> 0x05af, blocks: (B:76:0x05a3, B:78:0x05a9, B:80:0x05b1), top: B:75:0x05a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p0(String str, String str2, String str3, String str4, Object obj, String str5, String str6, String str7, Boolean bool, String str8, Object obj2, String str9, Hashtable hashtable, Continuation continuation) {
        A a10;
        int i10;
        String str10;
        Object obj3;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        String str11;
        Hashtable hashtable2;
        Wh.a aVar;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Boolean bool2;
        String str17;
        Object obj4;
        String str18;
        Object obj5;
        com.google.gson.k d10;
        com.google.gson.h r10;
        Wh.a aVar2;
        SalesIQChat chat;
        Unit unit;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Hashtable hashtable3;
        A a11;
        SalesIQChat salesIQChat;
        Object obj6;
        boolean z10;
        MessageEntity messageEntity;
        WmsConversationsEventsHandler wmsConversationsEventsHandler2;
        Ref.ObjectRef objectRef;
        Message message;
        String string;
        Object obj7;
        MessageEntity messageEntity2;
        Ref.ObjectRef objectRef2;
        Object obj8;
        Object obj9;
        WmsConversationsEventsHandler wmsConversationsEventsHandler3;
        SharedPreferences sharedPreferences;
        SalesIQChat salesIQChat2;
        MessageEntity messageEntity3;
        MessageEntity messageEntity4;
        Wh.a aVar3;
        Message message2;
        C5582a c5582a;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        WmsConversationsEventsHandler wmsConversationsEventsHandler4;
        SalesIQChat salesIQChat3;
        SalesIQChat salesIQChat4;
        Wh.a aVar4;
        String chid;
        Object updateConversation;
        Wh.a aVar5;
        Message message3;
        Wh.a aVar6;
        String u10;
        T t10;
        Object obj10;
        Wh.a aVar7;
        try {
            if (continuation instanceof A) {
                a10 = (A) continuation;
                int i11 = a10.f42890F;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    a10.f42890F = i11 - Integer.MIN_VALUE;
                    Object obj11 = a10.f42888D;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = a10.f42890F;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj11);
                        Wh.a d11 = C6461a.C0913a.f65814a.d();
                        a10.f42891n = this;
                        a10.f42892o = str;
                        a10.f42893p = str2;
                        str10 = str3;
                        a10.f42894q = str10;
                        a10.f42895r = str4;
                        obj3 = obj;
                        a10.f42896s = obj3;
                        a10.f42897t = str5;
                        a10.f42898u = str6;
                        a10.f42899v = str7;
                        a10.f42900w = bool;
                        a10.f42901x = str8;
                        a10.f42902y = obj2;
                        a10.f42903z = str9;
                        a10.f42885A = hashtable;
                        a10.f42886B = d11;
                        a10.f42890F = 1;
                        if (d11.f(null, a10) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        wmsConversationsEventsHandler = this;
                        str11 = str9;
                        hashtable2 = hashtable;
                        aVar = d11;
                        str12 = str2;
                        str13 = str4;
                        str14 = str5;
                        str15 = str6;
                        str16 = str7;
                        bool2 = bool;
                        str17 = str8;
                        obj4 = obj2;
                        str18 = str;
                    } else if (i10 != 1) {
                        try {
                            try {
                                if (i10 != 2) {
                                    try {
                                    } catch (Throwable th2) {
                                        th = th2;
                                        aVar2 = aVar7;
                                    }
                                    if (i10 != 3) {
                                        if (i10 != 4) {
                                            if (i10 != 5) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            salesIQChat4 = (SalesIQChat) a10.f42893p;
                                            wmsConversationsEventsHandler4 = (WmsConversationsEventsHandler) a10.f42892o;
                                            aVar2 = (Wh.a) a10.f42891n;
                                            try {
                                                ResultKt.throwOnFailure(obj11);
                                                obj5 = null;
                                                try {
                                                    salesIQChat3 = salesIQChat4;
                                                    t0(wmsConversationsEventsHandler4, salesIQChat3.getChid(), null, null, true, false, null, false, 118, null);
                                                    unit = Unit.INSTANCE;
                                                    m147constructorimpl = Result.m147constructorimpl(unit);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                            aVar = aVar2;
                                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                            if (m150exceptionOrNullimpl != null) {
                                                LiveChatUtil.log(m150exceptionOrNullimpl);
                                            }
                                            ne.j.s0(false, 1, obj5);
                                            Unit unit2 = Unit.INSTANCE;
                                            aVar.g(obj5);
                                            return Unit.INSTANCE;
                                        }
                                        Message message4 = (Message) a10.f42896s;
                                        messageEntity3 = (MessageEntity) a10.f42895r;
                                        objectRef = (Ref.ObjectRef) a10.f42894q;
                                        salesIQChat2 = (SalesIQChat) a10.f42893p;
                                        wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) a10.f42892o;
                                        Wh.a aVar8 = (Wh.a) a10.f42891n;
                                        ResultKt.throwOnFailure(obj11);
                                        a11 = a10;
                                        obj6 = coroutine_suspended;
                                        message = message4;
                                        aVar = aVar8;
                                        z10 = false;
                                        c5582a = (C5582a) obj11;
                                        if (c5582a.d()) {
                                            ((Boolean) c5582a.b()).getClass();
                                            wmsConversationsEventsHandler2.f42881f = null;
                                        }
                                        messageEntity4 = messageEntity3;
                                        aVar3 = aVar;
                                        message2 = message;
                                        salesIQChat3 = salesIQChat2;
                                        wmsConversationsEventsHandler4 = wmsConversationsEventsHandler2;
                                        try {
                                            chid = salesIQChat3.getChid();
                                        } catch (Throwable th5) {
                                            th = th5;
                                            aVar4 = aVar3;
                                            obj5 = null;
                                        }
                                        if (chid != null) {
                                            obj5 = null;
                                            aVar2 = aVar3;
                                            t0(wmsConversationsEventsHandler4, salesIQChat3.getChid(), null, null, true, false, null, false, 118, null);
                                            unit = Unit.INSTANCE;
                                            m147constructorimpl = Result.m147constructorimpl(unit);
                                            aVar = aVar2;
                                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                            if (m150exceptionOrNullimpl != null) {
                                            }
                                            ne.j.s0(false, 1, obj5);
                                            Unit unit22 = Unit.INSTANCE;
                                            aVar.g(obj5);
                                            return Unit.INSTANCE;
                                        }
                                        ConversationsLocalDataSource J10 = wmsConversationsEventsHandler4.J();
                                        Long boxLong = Boxing.boxLong(messageEntity4.getTime().getServerTime());
                                        Integer num = (Integer) objectRef.element;
                                        Long boxLong2 = Boxing.boxLong(0L);
                                        Long boxLong3 = Boxing.boxLong(0L);
                                        a11.f42891n = aVar3;
                                        a11.f42892o = wmsConversationsEventsHandler4;
                                        a11.f42893p = salesIQChat3;
                                        try {
                                            a11.f42894q = null;
                                            a11.f42895r = null;
                                            a11.f42896s = null;
                                            a11.f42897t = null;
                                            a11.f42898u = null;
                                            a11.f42899v = null;
                                            a11.f42900w = null;
                                            a11.f42901x = null;
                                            a11.f42902y = null;
                                            a11.f42903z = null;
                                            a11.f42885A = null;
                                            a11.f42886B = null;
                                            a11.f42887C = null;
                                            a11.f42890F = 5;
                                            aVar4 = aVar3;
                                            A a12 = a11;
                                            obj5 = null;
                                            try {
                                                updateConversation = J10.updateConversation(chid, (r39 & 2) != 0 ? null : boxLong, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : num, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : message2, (r39 & 512) != 0 ? null : boxLong2, (r39 & 1024) != 0 ? null : boxLong3, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, a12);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                aVar2 = aVar4;
                                                Result.Companion companion = Result.INSTANCE;
                                                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                aVar = aVar2;
                                                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                if (m150exceptionOrNullimpl != null) {
                                                }
                                                ne.j.s0(false, 1, obj5);
                                                Unit unit222 = Unit.INSTANCE;
                                                aVar.g(obj5);
                                                return Unit.INSTANCE;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            aVar4 = aVar3;
                                            obj5 = null;
                                        }
                                        if (updateConversation == obj6) {
                                            return obj6;
                                        }
                                        salesIQChat4 = salesIQChat3;
                                        obj11 = updateConversation;
                                        aVar2 = aVar4;
                                        wmsConversationsEventsHandler4 = wmsConversationsEventsHandler4;
                                        salesIQChat3 = salesIQChat4;
                                        t0(wmsConversationsEventsHandler4, salesIQChat3.getChid(), null, null, true, false, null, false, 118, null);
                                        unit = Unit.INSTANCE;
                                        m147constructorimpl = Result.m147constructorimpl(unit);
                                        aVar = aVar2;
                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                        if (m150exceptionOrNullimpl != null) {
                                        }
                                        ne.j.s0(false, 1, obj5);
                                        Unit unit2222 = Unit.INSTANCE;
                                        aVar.g(obj5);
                                        return Unit.INSTANCE;
                                    }
                                    message3 = (Message) a10.f42896s;
                                    messageEntity4 = (MessageEntity) a10.f42895r;
                                    objectRef = (Ref.ObjectRef) a10.f42894q;
                                    salesIQChat2 = (SalesIQChat) a10.f42893p;
                                    wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) a10.f42892o;
                                    aVar5 = (Wh.a) a10.f42891n;
                                    ResultKt.throwOnFailure(obj11);
                                    a11 = a10;
                                    obj6 = coroutine_suspended;
                                    z10 = false;
                                    message2 = message3;
                                    aVar3 = aVar5;
                                    salesIQChat3 = salesIQChat2;
                                    wmsConversationsEventsHandler4 = wmsConversationsEventsHandler2;
                                    chid = salesIQChat3.getChid();
                                    if (chid != null) {
                                    }
                                } else {
                                    String str24 = (String) a10.f42887C;
                                    SharedPreferences sharedPreferences2 = (SharedPreferences) a10.f42886B;
                                    Message message5 = (Message) a10.f42885A;
                                    MessageEntity messageEntity5 = (MessageEntity) a10.f42903z;
                                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) a10.f42902y;
                                    SalesIQChat salesIQChat5 = (SalesIQChat) a10.f42901x;
                                    WmsConversationsEventsHandler wmsConversationsEventsHandler5 = (WmsConversationsEventsHandler) a10.f42900w;
                                    Wh.a aVar9 = (Wh.a) a10.f42899v;
                                    Hashtable hashtable4 = (Hashtable) a10.f42898u;
                                    Object obj12 = a10.f42897t;
                                    String str25 = (String) a10.f42896s;
                                    String str26 = (String) a10.f42895r;
                                    obj8 = a10.f42894q;
                                    String str27 = (String) a10.f42893p;
                                    String str28 = (String) a10.f42892o;
                                    String str29 = (String) a10.f42891n;
                                    try {
                                        ResultKt.throwOnFailure(obj11);
                                        str22 = str26;
                                        obj7 = obj11;
                                        messageEntity2 = messageEntity5;
                                        str23 = str25;
                                        a11 = a10;
                                        obj6 = coroutine_suspended;
                                        string = str24;
                                        salesIQChat = salesIQChat5;
                                        aVar = aVar9;
                                        str19 = str29;
                                        sharedPreferences = sharedPreferences2;
                                        objectRef2 = objectRef3;
                                        str20 = str28;
                                        message = message5;
                                        obj9 = obj12;
                                        wmsConversationsEventsHandler3 = wmsConversationsEventsHandler5;
                                        hashtable3 = hashtable4;
                                        str21 = str27;
                                        try {
                                            if (((Boolean) obj7).booleanValue() || string == null) {
                                                aVar6 = aVar;
                                            } else {
                                                aVar6 = aVar;
                                                try {
                                                    String str30 = str19;
                                                    try {
                                                        if (!StringsKt.equals(string, messageEntity2.getMessageId(), true)) {
                                                            String content = message.getContent();
                                                            if (content != null) {
                                                                try {
                                                                    u10 = og.i.u(content);
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    aVar2 = aVar6;
                                                                    obj5 = null;
                                                                    Result.Companion companion2 = Result.INSTANCE;
                                                                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                                    aVar = aVar2;
                                                                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                                    if (m150exceptionOrNullimpl != null) {
                                                                    }
                                                                    ne.j.s0(false, 1, obj5);
                                                                    Unit unit22222 = Unit.INSTANCE;
                                                                    aVar.g(obj5);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            } else {
                                                                u10 = null;
                                                            }
                                                            if (u10 == null) {
                                                                u10 = "";
                                                            }
                                                            String obj13 = (hashtable3 == null || (obj10 = hashtable3.get("lmsguid")) == null) ? null : obj10.toString();
                                                            WmsConversationsEventsHandler wmsConversationsEventsHandler6 = wmsConversationsEventsHandler3;
                                                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler6;
                                                            MessageEntity messageEntity6 = messageEntity2;
                                                            Q(wmsConversationsEventsHandler2, messageEntity6, u10, wmsConversationsEventsHandler6.N(obj8, str21, str20, str23, obj9, str30, str22, obj13), false, 8, null);
                                                            messageEntity = messageEntity6;
                                                            if (salesIQChat.getStatus() == 4 || salesIQChat.getStatus() == 3) {
                                                                z10 = false;
                                                            } else {
                                                                if (Intrinsics.areEqual(messageEntity.getSender(), wmsConversationsEventsHandler2.H().V())) {
                                                                    z10 = false;
                                                                    t10 = Boxing.boxInt(0);
                                                                } else {
                                                                    z10 = false;
                                                                    try {
                                                                        t10 = Boxing.boxInt(salesIQChat.getUnreadCount() + 1);
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        aVar2 = aVar6;
                                                                        obj5 = null;
                                                                        Result.Companion companion22 = Result.INSTANCE;
                                                                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                                        aVar = aVar2;
                                                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                                        if (m150exceptionOrNullimpl != null) {
                                                                        }
                                                                        ne.j.s0(false, 1, obj5);
                                                                        Unit unit222222 = Unit.INSTANCE;
                                                                        aVar.g(obj5);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                                objectRef2.element = t10;
                                                                LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                                                            }
                                                            SharedPreferences.Editor edit = sharedPreferences.edit();
                                                            edit.remove("proactive_received_msgid");
                                                            edit.apply();
                                                            Unit unit3 = Unit.INSTANCE;
                                                            aVar = aVar6;
                                                            objectRef = objectRef2;
                                                            MessageEntity messageEntity7 = messageEntity;
                                                            salesIQChat2 = salesIQChat;
                                                            if (og.i.g(wmsConversationsEventsHandler2.f42881f)) {
                                                                messageEntity3 = messageEntity7;
                                                                if (wmsConversationsEventsHandler2.f42881f != null) {
                                                                    C6152a L10 = wmsConversationsEventsHandler2.L();
                                                                    MessageEntity messageEntity8 = wmsConversationsEventsHandler2.f42881f;
                                                                    Intrinsics.checkNotNull(messageEntity8);
                                                                    a11.f42891n = aVar;
                                                                    a11.f42892o = wmsConversationsEventsHandler2;
                                                                    a11.f42893p = salesIQChat2;
                                                                    a11.f42894q = objectRef;
                                                                    a11.f42895r = messageEntity3;
                                                                    a11.f42896s = message;
                                                                    a11.f42897t = null;
                                                                    a11.f42898u = null;
                                                                    a11.f42899v = null;
                                                                    a11.f42900w = null;
                                                                    a11.f42901x = null;
                                                                    a11.f42902y = null;
                                                                    a11.f42903z = null;
                                                                    a11.f42885A = null;
                                                                    a11.f42886B = null;
                                                                    a11.f42887C = null;
                                                                    a11.f42890F = 4;
                                                                    obj11 = L10.X(messageEntity8, messageEntity3, a11);
                                                                    if (obj11 == obj6) {
                                                                        return obj6;
                                                                    }
                                                                    c5582a = (C5582a) obj11;
                                                                    if (c5582a.d()) {
                                                                    }
                                                                }
                                                                messageEntity4 = messageEntity3;
                                                                aVar3 = aVar;
                                                                message2 = message;
                                                                salesIQChat3 = salesIQChat2;
                                                                wmsConversationsEventsHandler4 = wmsConversationsEventsHandler2;
                                                                chid = salesIQChat3.getChid();
                                                                if (chid != null) {
                                                                }
                                                            } else {
                                                                C6152a L11 = wmsConversationsEventsHandler2.L();
                                                                a11.f42891n = aVar;
                                                                a11.f42892o = wmsConversationsEventsHandler2;
                                                                a11.f42893p = salesIQChat2;
                                                                a11.f42894q = objectRef;
                                                                a11.f42895r = messageEntity7;
                                                                a11.f42896s = message;
                                                                a11.f42897t = null;
                                                                a11.f42898u = null;
                                                                a11.f42899v = null;
                                                                a11.f42900w = null;
                                                                a11.f42901x = null;
                                                                a11.f42902y = null;
                                                                a11.f42903z = null;
                                                                a11.f42885A = null;
                                                                a11.f42886B = null;
                                                                a11.f42887C = null;
                                                                a11.f42890F = 3;
                                                                messageEntity4 = messageEntity7;
                                                                if (C6152a.U(L11, messageEntity7, false, a11, 2, null) == obj6) {
                                                                    return obj6;
                                                                }
                                                                aVar5 = aVar;
                                                                message3 = message;
                                                                message2 = message3;
                                                                aVar3 = aVar5;
                                                                salesIQChat3 = salesIQChat2;
                                                                wmsConversationsEventsHandler4 = wmsConversationsEventsHandler2;
                                                                chid = salesIQChat3.getChid();
                                                                if (chid != null) {
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        aVar2 = aVar6;
                                                        obj5 = null;
                                                        Result.Companion companion222 = Result.INSTANCE;
                                                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                        aVar = aVar2;
                                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                        if (m150exceptionOrNullimpl != null) {
                                                        }
                                                        ne.j.s0(false, 1, obj5);
                                                        Unit unit2222222 = Unit.INSTANCE;
                                                        aVar.g(obj5);
                                                        return Unit.INSTANCE;
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    aVar2 = aVar6;
                                                    obj5 = null;
                                                    Result.Companion companion2222 = Result.INSTANCE;
                                                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                    aVar = aVar2;
                                                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                    if (m150exceptionOrNullimpl != null) {
                                                    }
                                                    ne.j.s0(false, 1, obj5);
                                                    Unit unit22222222 = Unit.INSTANCE;
                                                    aVar.g(obj5);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler3;
                                            messageEntity = messageEntity2;
                                            z10 = false;
                                            Unit unit32 = Unit.INSTANCE;
                                            aVar = aVar6;
                                            objectRef = objectRef2;
                                            MessageEntity messageEntity72 = messageEntity;
                                            salesIQChat2 = salesIQChat;
                                            if (og.i.g(wmsConversationsEventsHandler2.f42881f)) {
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            aVar6 = aVar;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        aVar2 = aVar9;
                                    }
                                }
                                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                if (m150exceptionOrNullimpl != null) {
                                }
                                ne.j.s0(false, 1, obj5);
                                Unit unit222222222 = Unit.INSTANCE;
                                aVar.g(obj5);
                                return Unit.INSTANCE;
                            } catch (Throwable th14) {
                                th = th14;
                                aVar.g(obj5);
                                throw th;
                            }
                            Result.Companion companion22222 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                            aVar = aVar2;
                        } catch (Throwable th15) {
                            th = th15;
                            aVar = aVar2;
                            aVar.g(obj5);
                            throw th;
                        }
                        obj5 = null;
                    } else {
                        Wh.a aVar10 = (Wh.a) a10.f42886B;
                        Hashtable hashtable5 = (Hashtable) a10.f42885A;
                        String str31 = (String) a10.f42903z;
                        Object obj14 = a10.f42902y;
                        String str32 = (String) a10.f42901x;
                        Boolean bool3 = (Boolean) a10.f42900w;
                        String str33 = (String) a10.f42899v;
                        String str34 = (String) a10.f42898u;
                        String str35 = (String) a10.f42897t;
                        Object obj15 = a10.f42896s;
                        String str36 = (String) a10.f42895r;
                        str10 = (String) a10.f42894q;
                        String str37 = (String) a10.f42893p;
                        String str38 = (String) a10.f42892o;
                        WmsConversationsEventsHandler wmsConversationsEventsHandler7 = (WmsConversationsEventsHandler) a10.f42891n;
                        ResultKt.throwOnFailure(obj11);
                        str12 = str37;
                        wmsConversationsEventsHandler = wmsConversationsEventsHandler7;
                        hashtable2 = hashtable5;
                        str11 = str31;
                        obj4 = obj14;
                        str17 = str32;
                        bool2 = bool3;
                        str16 = str33;
                        str15 = str34;
                        str14 = str35;
                        obj3 = obj15;
                        str13 = str36;
                        aVar = aVar10;
                        str18 = str38;
                    }
                    String str39 = str10;
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("message", "ontyping");
                    intent.putExtra("typing", false);
                    C1908a.b(wmsConversationsEventsHandler.F()).d(intent);
                    Result.Companion companion3 = Result.INSTANCE;
                    com.google.gson.h d12 = com.google.gson.m.d(str17);
                    Intrinsics.checkNotNullExpressionValue(d12, "parseString(...)");
                    d10 = AbstractC5896h.d(d12);
                    if (d10 == null) {
                        try {
                            r10 = d10.r("38");
                        } catch (Throwable th16) {
                            th = th16;
                            aVar2 = aVar;
                            obj5 = null;
                            Result.Companion companion222222 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                            aVar = aVar2;
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            ne.j.s0(false, 1, obj5);
                            Unit unit2222222222 = Unit.INSTANCE;
                            aVar.g(obj5);
                            return Unit.INSTANCE;
                        }
                    } else {
                        r10 = null;
                    }
                    String f10 = AbstractC5896h.f(r10);
                    chat = LiveChatUtil.getChat(LiveChatUtil.getChatid(str18));
                    if (chat == null) {
                        chat = wmsConversationsEventsHandler.J().getChatFromAcknowledgementKey(f10);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Greetings test: ");
                    sb2.append(obj3);
                    sb2.append(' ');
                    sb2.append(str18);
                    sb2.append(' ');
                    sb2.append(chat == null ? chat.getChid() : null);
                    sb2.append(' ');
                    sb2.append(chat);
                    LiveChatUtil.log(sb2.toString());
                    if (chat != null) {
                        obj5 = null;
                        unit = null;
                        aVar2 = aVar;
                        m147constructorimpl = Result.m147constructorimpl(unit);
                        aVar = aVar2;
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        ne.j.s0(false, 1, obj5);
                        Unit unit22222222222 = Unit.INSTANCE;
                        aVar.g(obj5);
                        return Unit.INSTANCE;
                    }
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    String str40 = str18;
                    SalesIQChat salesIQChat6 = chat;
                    Object obj16 = obj3;
                    MessageEntity a13 = c.a(str40, chat.getChid(), salesIQChat6, Message.g.Text, str12, str39, str13, obj16, str14, str15, str16, bool2, str17, obj4, str11, hashtable2);
                    str19 = str40;
                    str20 = str12;
                    str21 = str39;
                    str22 = str15;
                    str23 = str17;
                    Object obj17 = obj4;
                    hashtable3 = hashtable2;
                    Message g10 = MessageRoomToDomainKt.g(a13, wmsConversationsEventsHandler.F(), wmsConversationsEventsHandler.K(), false, false, null, null, 60, null);
                    SharedPreferences M10 = C6218a.M();
                    if (M10 != null) {
                        try {
                            string = M10.getString("proactive_received_msgid", StackTraceHelper.ID_KEY);
                            a10.f42891n = str19;
                            a10.f42892o = str20;
                            a10.f42893p = str21;
                            a10.f42894q = obj16;
                            a10.f42895r = str22;
                            a10.f42896s = str23;
                            a10.f42897t = obj17;
                            a10.f42898u = hashtable3;
                            a10.f42899v = aVar;
                            a10.f42900w = wmsConversationsEventsHandler;
                            a10.f42901x = salesIQChat6;
                            a10.f42902y = objectRef4;
                            WmsConversationsEventsHandler wmsConversationsEventsHandler8 = wmsConversationsEventsHandler;
                            a10.f42903z = a13;
                            a10.f42885A = g10;
                            a10.f42886B = M10;
                            a10.f42887C = string;
                            a10.f42890F = 2;
                            A a14 = a10;
                            Object D10 = D(wmsConversationsEventsHandler8, a13, salesIQChat6, false, a14, 2, null);
                            salesIQChat = salesIQChat6;
                            a11 = a14;
                            obj6 = coroutine_suspended;
                            if (D10 == obj6) {
                                return obj6;
                            }
                            obj7 = D10;
                            messageEntity2 = a13;
                            objectRef2 = objectRef4;
                            message = g10;
                            obj8 = obj16;
                            obj9 = obj17;
                            wmsConversationsEventsHandler3 = wmsConversationsEventsHandler8;
                            sharedPreferences = M10;
                            if (((Boolean) obj7).booleanValue()) {
                            }
                            aVar6 = aVar;
                            wmsConversationsEventsHandler2 = wmsConversationsEventsHandler3;
                            messageEntity = messageEntity2;
                            z10 = false;
                            Unit unit322 = Unit.INSTANCE;
                            aVar = aVar6;
                            objectRef = objectRef2;
                            MessageEntity messageEntity722 = messageEntity;
                            salesIQChat2 = salesIQChat;
                            if (og.i.g(wmsConversationsEventsHandler2.f42881f)) {
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            aVar2 = aVar;
                            obj5 = null;
                            Result.Companion companion2222222 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                            aVar = aVar2;
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            ne.j.s0(false, 1, obj5);
                            Unit unit222222222222 = Unit.INSTANCE;
                            aVar.g(obj5);
                            return Unit.INSTANCE;
                        }
                    } else {
                        WmsConversationsEventsHandler wmsConversationsEventsHandler9 = wmsConversationsEventsHandler;
                        a11 = a10;
                        salesIQChat = salesIQChat6;
                        obj6 = coroutine_suspended;
                        z10 = false;
                        messageEntity = a13;
                        wmsConversationsEventsHandler2 = wmsConversationsEventsHandler9;
                        objectRef = objectRef4;
                        message = g10;
                        MessageEntity messageEntity7222 = messageEntity;
                        salesIQChat2 = salesIQChat;
                        if (og.i.g(wmsConversationsEventsHandler2.f42881f)) {
                        }
                    }
                }
            }
            Intent intent2 = new Intent("receivelivechat");
            intent2.putExtra("message", "ontyping");
            intent2.putExtra("typing", false);
            C1908a.b(wmsConversationsEventsHandler.F()).d(intent2);
            Result.Companion companion32 = Result.INSTANCE;
            com.google.gson.h d122 = com.google.gson.m.d(str17);
            Intrinsics.checkNotNullExpressionValue(d122, "parseString(...)");
            d10 = AbstractC5896h.d(d122);
            if (d10 == null) {
            }
            String f102 = AbstractC5896h.f(r10);
            chat = LiveChatUtil.getChat(LiveChatUtil.getChatid(str18));
            if (chat == null) {
            }
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Greetings test: ");
            sb22.append(obj3);
            sb22.append(' ');
            sb22.append(str18);
            sb22.append(' ');
            sb22.append(chat == null ? chat.getChid() : null);
            sb22.append(' ');
            sb22.append(chat);
            LiveChatUtil.log(sb22.toString());
            if (chat != null) {
            }
        } catch (Throwable th18) {
            th = th18;
            obj5 = null;
            aVar.g(obj5);
            throw th;
        }
        a10 = new A(continuation);
        Object obj112 = a10.f42888D;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = a10.f42890F;
        if (i10 != 0) {
        }
        String str392 = str10;
    }

    public final Object q0(String str, SalesIQChat salesIQChat, Message message, Continuation continuation) {
        Object updateConversation;
        Message.User operationUser;
        Message.User operationUser2;
        Message.User operationUser3;
        String name;
        if (str != null) {
            ConversationsLocalDataSource J10 = J();
            String str2 = null;
            Integer boxInt = salesIQChat != null ? Boxing.boxInt(salesIQChat.getUnreadCount() + 1) : null;
            long serverTime = message.getServerTime();
            Message.InfoMessage infoMessage = message.getInfoMessage();
            String obj = (infoMessage == null || (operationUser3 = infoMessage.getOperationUser()) == null || (name = operationUser3.getName()) == null) ? null : StringsKt.trim((CharSequence) name).toString();
            Message.InfoMessage infoMessage2 = message.getInfoMessage();
            String id2 = (infoMessage2 == null || (operationUser2 = infoMessage2.getOperationUser()) == null) ? null : operationUser2.getId();
            Message.InfoMessage infoMessage3 = message.getInfoMessage();
            if (infoMessage3 != null && (operationUser = infoMessage3.getOperationUser()) != null) {
                str2 = operationUser.getImageFileKey();
            }
            updateConversation = J10.updateConversation(str, (r39 & 2) != 0 ? null : Boxing.boxLong(serverTime), (r39 & 4) != 0 ? null : Boxing.boxBoolean(false), (r39 & 8) != 0 ? null : boxInt, (r39 & 16) != 0 ? null : obj, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : id2, (r39 & 128) != 0 ? null : str2, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
            if (updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return updateConversation;
            }
        }
        return Unit.INSTANCE;
    }

    public final void r0(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(E(), null, null, new B(messageTable, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(String str, String str2, MessageEntity messageEntity, boolean z10, boolean z11, String str3, boolean z12) {
        Intent intent;
        C1908a b10 = C1908a.b(F());
        Intent intent2 = new Intent("receivelivechat");
        intent2.putExtra("message", "refreshchat");
        if (str3 != null) {
            intent2.putExtra("rchid", str3);
        }
        if (str2 != null) {
            intent2.putExtra("acknowledgement_key", str2);
        }
        String chatId = str == null ? messageEntity != null ? messageEntity.getChatId() : null : str;
        if (chatId != null) {
            intent2.putExtra("chid", chatId);
        }
        if ((z12 ? intent2 : null) != null) {
            intent2.putExtra("StartWaitingTimer", true);
        }
        if (z11) {
            if (og.i.e(messageEntity != null ? messageEntity.getDisplayName() : null) && str != null && Intrinsics.areEqual(C6218a.y(), str)) {
                intent = intent2;
                if (intent != null) {
                    AbstractC5892d.n(F(), new long[]{0, 120, 1000, 0});
                    intent2.putExtra("show_connected_to_banner", true);
                    Message.b bVar = (Message.b) AbstractC5895g.b(K(), messageEntity != null ? messageEntity.getDisplayName() : null, Message.b.class);
                    intent2.putExtra("attender_name", bVar != null ? bVar.e() : null);
                }
                b10.d(intent2);
                if ((z10 ? this : null) == null) {
                    C1908a b11 = C1908a.b(F());
                    Intent intent3 = new Intent("receivelivechat");
                    intent3.putExtra("chat_id", str);
                    intent3.putExtra("acknowledgement_key", str2);
                    intent3.putExtra("message", "endchattimer");
                    b11.d(intent3);
                    return;
                }
                return;
            }
        }
        intent = null;
        if (intent != null) {
        }
        b10.d(intent2);
        if ((z10 ? this : null) == null) {
        }
    }

    public final void u0() {
        C0 d10;
        C0 c02 = this.f42884i;
        if (c02 == null || !c02.isActive()) {
            d10 = AbstractC1459k.d(E(), null, null, new C(null), 3, null);
            this.f42884i = d10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v0(MessageEntity messageEntity, Continuation continuation) {
        D d10;
        int i10;
        Object updateConversation;
        MessageEntity messageEntity2;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        if (continuation instanceof D) {
            d10 = (D) continuation;
            int i11 = d10.f42917r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d10.f42917r = i11 - Integer.MIN_VALUE;
                Object obj = d10.f42915p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = d10.f42917r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ConversationsLocalDataSource J10 = J();
                    String chatId = messageEntity.getChatId();
                    long serverTime = messageEntity.getTime().getServerTime();
                    Application F10 = F();
                    Message g10 = F10 != null ? MessageRoomToDomainKt.g(messageEntity, F10, K(), false, false, M().y0(), null, 44, null) : null;
                    boolean isBot = messageEntity.isBot();
                    Long boxLong = Boxing.boxLong(serverTime);
                    Boolean boxBoolean = Boxing.boxBoolean(isBot);
                    d10.f42913n = this;
                    d10.f42914o = messageEntity;
                    d10.f42917r = 1;
                    updateConversation = J10.updateConversation(chatId, (r39 & 2) != 0 ? null : boxLong, (r39 & 4) != 0 ? null : boxBoolean, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : g10, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, d10);
                    if (updateConversation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    messageEntity2 = messageEntity;
                    wmsConversationsEventsHandler = this;
                    obj = updateConversation;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    messageEntity2 = (MessageEntity) d10.f42914o;
                    WmsConversationsEventsHandler wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) d10.f42913n;
                    ResultKt.throwOnFailure(obj);
                    wmsConversationsEventsHandler = wmsConversationsEventsHandler2;
                }
                t0(wmsConversationsEventsHandler, messageEntity2.getChatId(), messageEntity2.getAcknowledgementKey(), null, true, false, null, false, 112, null);
                return Unit.INSTANCE;
            }
        }
        d10 = new D(continuation);
        Object obj2 = d10.f42915p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = d10.f42917r;
        if (i10 != 0) {
        }
        t0(wmsConversationsEventsHandler, messageEntity2.getChatId(), messageEntity2.getAcknowledgementKey(), null, true, false, null, false, 112, null);
        return Unit.INSTANCE;
    }

    public WmsConversationsEventsHandler() {
        this.f42876a = LazyKt.lazy(g.f42923d);
        this.f42877b = LazyKt.lazy(new f());
        this.f42878c = LazyKt.lazy(i.f42925d);
        this.f42879d = LazyKt.lazy(h.f42924d);
        this.f42880e = LazyKt.lazy(new j());
        this.f42883h = LazyKt.lazy(C3864d.f42918d);
    }
}
