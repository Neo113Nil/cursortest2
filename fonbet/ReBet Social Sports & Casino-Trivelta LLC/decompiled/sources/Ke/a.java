package Ke;

import Cg.c;
import Ph.AbstractC1459k;
import Ph.P;
import Re.f;
import a1.C1908a;
import ae.C1934a;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import ce.AbstractC2916a;
import com.facebook.react.common.assets.ReactFontManager;
import com.google.gson.Gson;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.calls.data.model.MediaResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.modules.conversations.data.local.entities.SalesIQConversationAttributes;
import com.zoho.livechat.android.modules.conversations.data.remote.entities.ConversationResponse;
import com.zoho.livechat.android.modules.conversations.domain.entities.LeaveMessageResponse;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.remote.responses.MessageResponse;
import com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.modules.triggers.data.TriggersRepository;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import me.C5582a;
import og.AbstractC5895g;
import og.AbstractC5896h;
import qf.C6152a;
import rd.C6218a;
import re.C6242h;
import re.C6244j;
import re.C6249o;
import re.C6251q;
import td.C6461a;
import uf.C6550a;
import vf.AbstractC6687a;
import we.b;
import xd.C6821a;
import yf.y;
import ze.C6959a;

/* loaded from: classes4.dex */
public final class a implements Qe.a {

    /* renamed from: k, reason: collision with root package name */
    public static a f6497k;

    /* renamed from: a, reason: collision with root package name */
    public final Application f6499a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f6500b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f6501c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f6502d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f6503e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f6504f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f6505g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f6506h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f6507i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0137a f6496j = new C0137a(null);

    /* renamed from: l, reason: collision with root package name */
    public static Object f6498l = new Object();

    public static final class A extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6508n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6509o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6510p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6511q;

        /* renamed from: r, reason: collision with root package name */
        public Object f6512r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f6513s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f6514t;

        /* renamed from: v, reason: collision with root package name */
        public int f6516v;

        public A(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6514t = obj;
            this.f6516v |= Integer.MIN_VALUE;
            return a.this.W(null, null, null, false, this);
        }
    }

    public static final class B extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6517n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f6518o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ a f6519p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f6520q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ConversationResponse f6521r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(SalesIQChat salesIQChat, a aVar, String str, ConversationResponse conversationResponse, Continuation continuation) {
            super(2, continuation);
            this.f6518o = salesIQChat;
            this.f6519p = aVar;
            this.f6520q = str;
            this.f6521r = conversationResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new B(this.f6518o, this.f6519p, this.f6520q, this.f6521r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((B) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
        
            if (xf.InterfaceC6823a.n(r0, r2, r3, r4, r5, null, null, null, false, r9, false, false, r16, 512, null) != r15) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
        
            return r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            if (Ph.AbstractC1440a0.a(r3, r16) == r15) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        
            if (r0 == r15) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        
            if (Ph.AbstractC1440a0.a(3000, r16) == r15) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object H10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6517n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f6518o.isBotAttender() && this.f6518o.isTriggeredChat()) {
                    this.f6517n = 1;
                }
                C6550a N10 = this.f6519p.N();
                String str = this.f6520q;
                String id2 = this.f6521r.getId();
                String chatId = this.f6521r.getChatId();
                String wmsChatId = this.f6521r.getWmsChatId();
                y.a aVar = y.a.Reconnection;
                this.f6517n = 4;
            } else if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
                C6152a M10 = this.f6519p.M();
                String str2 = this.f6520q;
                String chatId2 = this.f6521r.getChatId();
                this.f6517n = 2;
                H10 = M10.H(str2, chatId2, this);
            } else if (i10 == 2) {
                ResultKt.throwOnFailure(obj);
                H10 = obj;
                long r10 = og.i.r((Number) ((C5582a) H10).b()) * 1000;
                this.f6517n = 3;
            } else if (i10 == 3) {
                ResultKt.throwOnFailure(obj);
                C6550a N102 = this.f6519p.N();
                String str3 = this.f6520q;
                String id22 = this.f6521r.getId();
                String chatId3 = this.f6521r.getChatId();
                String wmsChatId2 = this.f6521r.getWmsChatId();
                y.a aVar2 = y.a.Reconnection;
                this.f6517n = 4;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class C extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f6522n;

        /* renamed from: o, reason: collision with root package name */
        public int f6523o;

        public C(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new C(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6523o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (a.this.G().I() != null) {
                    a aVar2 = a.this;
                    Kd.a E10 = aVar2.E();
                    List listOf = CollectionsKt.listOf(Md.a.Chat);
                    this.f6522n = aVar2;
                    this.f6523o = 1;
                    if (E10.b(listOf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = aVar2;
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) this.f6522n;
            ResultKt.throwOnFailure(obj);
            C1908a b10 = C1908a.b(aVar.f6499a);
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "appstatus");
            b10.d(intent);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: Ke.a$a, reason: collision with other inner class name */
    public static final class C0137a {
        public /* synthetic */ C0137a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Application application) {
            a aVar;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (a.f6498l) {
                aVar = a.f6497k;
                if (aVar == null) {
                    aVar = new a(application, null);
                    a.f6497k = aVar;
                }
            }
            return aVar;
        }

        public C0137a() {
        }
    }

    /* renamed from: Ke.a$b, reason: case insensitive filesystem */
    public /* synthetic */ class C1374b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Form.Message.Meta.InputCard.a.values().length];
            try {
                iArr[Form.Message.Meta.InputCard.a.VisitorName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Form.Message.Meta.InputCard.a.VisitorEmail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Form.Message.Meta.InputCard.a.VisitorPhone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Form.Message.Meta.InputCard.a.Department.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Form.Message.Meta.InputCard.a.Campaign.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[f.a.values().length];
            try {
                iArr2[f.a.WaitingMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: Ke.a$c, reason: case insensitive filesystem */
    public static final class C1375c extends Lambda implements Function0 {
        public C1375c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            return Kd.a.f6469f.a(a.this.f6499a);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6526n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6527o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6528p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6529q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f6530r;

        /* renamed from: t, reason: collision with root package name */
        public int f6532t;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6530r = obj;
            this.f6532t |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f6533d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f6533d = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Pair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(CollectionsKt.contains(this.f6533d, it.getSecond()));
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(a.this.f6499a);
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f6535d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1934a invoke() {
            return C1934a.f15123b.a();
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f6536d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConversationsLocalDataSource invoke() {
            return ConversationsLocalDataSource.INSTANCE.getInstance$mobilisten_release();
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f6537d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ie.a invoke() {
            return Ie.a.f5761b.a();
        }
    }

    public static final class j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public int f6538n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6539o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6540p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f6541q;

        /* renamed from: s, reason: collision with root package name */
        public int f6543s;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6541q = obj;
            this.f6543s |= Integer.MIN_VALUE;
            return a.this.C(null, null, false, null, this);
        }
    }

    public static final class k extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final k f6544d = new k();

        public k() {
            super(1);
        }

        public final CharSequence a(int i10) {
            if (i10 != 1 && i10 != 5) {
                return "STATUS != ? ";
            }
            return "(STATUS != ? OR (STATUS == '" + i10 + "' AND VISITORID IS NOT NULL))";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class l extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final l f6545d = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Pair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (CharSequence) it.getSecond();
        }
    }

    public static final class m extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6546n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6547o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6548p;

        /* renamed from: r, reason: collision with root package name */
        public int f6550r;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6548p = obj;
            this.f6550r |= Integer.MIN_VALUE;
            return a.this.P(null, null, this);
        }
    }

    public static final class n extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6551n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6552o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6553p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6554q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f6555r;

        /* renamed from: t, reason: collision with root package name */
        public int f6557t;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6555r = obj;
            this.f6557t |= Integer.MIN_VALUE;
            return a.this.S(null, this);
        }
    }

    public static final class o extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6558n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6559o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6560p;

        /* renamed from: r, reason: collision with root package name */
        public int f6562r;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6560p = obj;
            this.f6562r |= Integer.MIN_VALUE;
            return a.this.h(null, null, this);
        }
    }

    public static final class p extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6563n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6564o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6565p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6566q;

        /* renamed from: r, reason: collision with root package name */
        public Object f6567r;

        /* renamed from: s, reason: collision with root package name */
        public Object f6568s;

        /* renamed from: t, reason: collision with root package name */
        public Object f6569t;

        /* renamed from: u, reason: collision with root package name */
        public Object f6570u;

        /* renamed from: v, reason: collision with root package name */
        public Object f6571v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f6572w;

        /* renamed from: y, reason: collision with root package name */
        public int f6574y;

        public p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6572w = obj;
            this.f6574y |= Integer.MIN_VALUE;
            return a.this.m(null, null, null, null, null, null, this);
        }
    }

    public static final class q extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f6575n;

        /* renamed from: p, reason: collision with root package name */
        public int f6577p;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6575n = obj;
            this.f6577p |= Integer.MIN_VALUE;
            return a.this.i(null, this);
        }
    }

    public static final class r extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6578n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6579o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6580p;

        /* renamed from: r, reason: collision with root package name */
        public int f6582r;

        public r(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6580p = obj;
            this.f6582r |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    public static final class s extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final s f6583d = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6152a invoke() {
            return C6152a.f63488c.a();
        }
    }

    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            return C6550a.f66357j.a(a.this.f6499a);
        }
    }

    public static final class u extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6585n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6586o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6587p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6588q;

        /* renamed from: r, reason: collision with root package name */
        public Object f6589r;

        /* renamed from: s, reason: collision with root package name */
        public Object f6590s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f6591t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f6592u;

        /* renamed from: w, reason: collision with root package name */
        public int f6594w;

        public u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6592u = obj;
            this.f6594w |= Integer.MIN_VALUE;
            return a.this.U(null, null, false, null, null, this);
        }
    }

    public static final class v extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f6595n;

        /* renamed from: p, reason: collision with root package name */
        public int f6597p;

        public v(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6595n = obj;
            this.f6597p |= Integer.MIN_VALUE;
            return a.this.g(null, null, null, null, false, false, null, null, null, null, null, null, this);
        }
    }

    public static final class w extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public Object f6598A;

        /* renamed from: B, reason: collision with root package name */
        public Object f6599B;

        /* renamed from: C, reason: collision with root package name */
        public Object f6600C;

        /* renamed from: D, reason: collision with root package name */
        public boolean f6601D;

        /* renamed from: E, reason: collision with root package name */
        public boolean f6602E;

        /* renamed from: F, reason: collision with root package name */
        public /* synthetic */ Object f6603F;

        /* renamed from: H, reason: collision with root package name */
        public int f6605H;

        /* renamed from: n, reason: collision with root package name */
        public Object f6606n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6607o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6608p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6609q;

        /* renamed from: r, reason: collision with root package name */
        public Object f6610r;

        /* renamed from: s, reason: collision with root package name */
        public Object f6611s;

        /* renamed from: t, reason: collision with root package name */
        public Object f6612t;

        /* renamed from: u, reason: collision with root package name */
        public Object f6613u;

        /* renamed from: v, reason: collision with root package name */
        public Object f6614v;

        /* renamed from: w, reason: collision with root package name */
        public Object f6615w;

        /* renamed from: x, reason: collision with root package name */
        public Object f6616x;

        /* renamed from: y, reason: collision with root package name */
        public Object f6617y;

        /* renamed from: z, reason: collision with root package name */
        public Object f6618z;

        public w(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6603F = obj;
            this.f6605H |= Integer.MIN_VALUE;
            return a.this.V(null, null, null, null, false, false, null, null, null, null, null, null, this);
        }
    }

    public static final class x extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f6619n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function0 f6620o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Function0 function0, Continuation continuation) {
            super(1, continuation);
            this.f6620o = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new x(this.f6620o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6619n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function0 function0 = this.f6620o;
            if (function0 == null) {
                return null;
            }
            function0.invoke();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((x) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TriggersRepository invoke() {
            return TriggersRepository.f44142g.a(a.this.f6499a);
        }
    }

    public static final class z extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6622n;

        /* renamed from: o, reason: collision with root package name */
        public Object f6623o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6624p;

        /* renamed from: q, reason: collision with root package name */
        public Object f6625q;

        /* renamed from: r, reason: collision with root package name */
        public Object f6626r;

        /* renamed from: s, reason: collision with root package name */
        public Object f6627s;

        /* renamed from: t, reason: collision with root package name */
        public Object f6628t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f6629u;

        /* renamed from: w, reason: collision with root package name */
        public int f6631w;

        public z(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6629u = obj;
            this.f6631w |= Integer.MIN_VALUE;
            return a.this.f(null, null, null, null, null, this);
        }
    }

    public /* synthetic */ a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static /* synthetic */ Object D(a aVar, String str, String str2, boolean z10, Integer[] numArr, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            numArr = new Integer[0];
        }
        return aVar.C(str, str2, z10, numArr, continuation);
    }

    public static /* synthetic */ Object Q(a aVar, String str, String str2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return aVar.P(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(String str, String str2, boolean z10, Integer[] numArr, Continuation continuation) {
        j jVar;
        int i10;
        ArrayList arrayList;
        int i11;
        ContentResolver contentResolver;
        Uri uri;
        StringBuilder sb2;
        String sb3;
        String[] strArr;
        String[] strArr2;
        int delete;
        int i12;
        Iterator it;
        a aVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i13 = jVar.f6543s;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f6543s = i13 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.f6541q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = jVar2.f6543s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    if (z10 && og.i.g(str) && og.i.g(str2)) {
                        I("SELECT CHATID, VISITORID FROM SIQ_CONVERSATIONS WHERE (STATUS != '1' AND STATUS != '5' AND STATUS != '6' AND STATUS != '7')", arrayList2);
                    }
                    ContentResolver contentResolver2 = this.f6499a.getContentResolver();
                    Uri uri2 = b.a.f44269a;
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = "";
                    if (numArr.length == 0) {
                        arrayList = arrayList2;
                        contentResolver = contentResolver2;
                        uri = uri2;
                        i11 = 1;
                        sb3 = "";
                        sb2 = sb4;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append('(');
                        arrayList = arrayList2;
                        i11 = 1;
                        contentResolver = contentResolver2;
                        uri = uri2;
                        sb2 = sb4;
                        sb5.append(ArraysKt.joinToString$default(numArr, " AND ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, k.f6544d, 30, (Object) null));
                        sb5.append(')');
                        sb3 = sb5.toString();
                    }
                    sb2.append(sb3);
                    if (og.i.e(str) && og.i.e(str2)) {
                        str3 = "(CHATID =? OR VISITORID =? )";
                    } else if (og.i.e(str)) {
                        str3 = "(CHATID =?)";
                    } else if (og.i.e(str2)) {
                        str3 = "(VISITORID =?)";
                    }
                    sb2.append(str3);
                    String sb6 = sb2.toString();
                    if ((numArr.length == 0 ? i11 : 0) == 0 && og.i.g(str) && og.i.g(str2)) {
                        ArrayList arrayList3 = new ArrayList(numArr.length);
                        for (Integer num : numArr) {
                            arrayList3.add(String.valueOf(num.intValue()));
                        }
                        strArr = (String[]) arrayList3.toArray(new String[0]);
                    } else {
                        if (str != null && str2 != null) {
                            if ((numArr.length == 0 ? i11 : 0) == 0) {
                                ArrayList arrayList4 = new ArrayList(numArr.length);
                                for (Integer num2 : numArr) {
                                    arrayList4.add(String.valueOf(num2.intValue()));
                                }
                                strArr = (String[]) CollectionsKt.plus((Collection<? extends String>) CollectionsKt.plus((Collection<? extends String>) arrayList4, str), str2).toArray(new String[0]);
                            }
                        }
                        if (str != null && str2 != null) {
                            strArr2 = new String[2];
                            strArr2[0] = str;
                            strArr2[i11] = str2;
                        } else if (str != null) {
                            strArr2 = new String[i11];
                            strArr2[0] = str;
                        } else {
                            strArr = null;
                        }
                        strArr = strArr2;
                    }
                    delete = contentResolver.delete(uri, sb6, strArr);
                    if (z10) {
                        if (!og.i.e(str) && !og.i.e(str2)) {
                            it = arrayList.iterator();
                            i12 = delete;
                            aVar = this;
                            while (it.hasNext()) {
                            }
                            delete = i12;
                        } else if (str != null) {
                            C6550a N10 = N();
                            jVar2.f6538n = delete;
                            jVar2.f6543s = 1;
                            obj = N10.l(str, str2, jVar2);
                            if (obj != coroutine_suspended) {
                                i12 = delete;
                                delete = i12;
                            }
                            return coroutine_suspended;
                        }
                    }
                } else if (i10 == 1) {
                    i12 = jVar2.f6538n;
                    ResultKt.throwOnFailure(obj);
                    delete = i12;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = jVar2.f6538n;
                    it = (Iterator) jVar2.f6540p;
                    aVar = (a) jVar2.f6539o;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str4 = (String) pair.getFirst();
                        if (str4 != null) {
                            C6550a N11 = aVar.N();
                            String str5 = (String) pair.getSecond();
                            jVar2.f6539o = aVar;
                            jVar2.f6540p = it;
                            jVar2.f6538n = i12;
                            jVar2.f6543s = 2;
                            if (N11.l(str4, str5, jVar2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    delete = i12;
                }
                return Boxing.boxInt(delete);
            }
        }
        jVar = new j(continuation);
        j jVar22 = jVar;
        Object obj2 = jVar22.f6541q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = jVar22.f6543s;
        if (i10 != 0) {
        }
        return Boxing.boxInt(delete);
    }

    public final Kd.a E() {
        return (Kd.a) this.f6502d.getValue();
    }

    public final C6959a F() {
        return C6959a.f68673u.b();
    }

    public final Ae.a G() {
        return (Ae.a) this.f6504f.getValue();
    }

    public final C1934a H() {
        return (C1934a) this.f6501c.getValue();
    }

    public final void I(String str, ArrayList arrayList) {
        Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(str);
        executeRawQuery.moveToFirst();
        if (og.i.d(Integer.valueOf(executeRawQuery.getCount()), 0)) {
            do {
                arrayList.add(new Pair(executeRawQuery.getString(executeRawQuery.getColumnIndexOrThrow("CHATID")), executeRawQuery.getString(executeRawQuery.getColumnIndexOrThrow("VISITORID"))));
            } while (executeRawQuery.moveToNext());
        }
        executeRawQuery.close();
    }

    public final ConversationsLocalDataSource J() {
        return (ConversationsLocalDataSource) this.f6503e.getValue();
    }

    public final Ie.a K() {
        return (Ie.a) this.f6500b.getValue();
    }

    public final Gson L() {
        return Yd.a.j();
    }

    public final C6152a M() {
        return (C6152a) this.f6505g.getValue();
    }

    public final C6550a N() {
        return (C6550a) this.f6506h.getValue();
    }

    public final String O(List list) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Pair pair = (Pair) obj;
            if (og.i.g(pair.getFirst()) || String.valueOf(pair.getFirst()).length() == 0) {
                arrayList.add(obj);
            }
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, l.f6545d, 30, null));
        sb2.append('.');
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(String str, String str2, Continuation continuation) {
        m mVar;
        int i10;
        C5582a E10;
        a aVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f6550r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f6550r = i11 - Integer.MIN_VALUE;
                Object obj = mVar.f6548p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = mVar.f6550r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    E10 = M().E(str, str2, Message.g.Question);
                    if (!E10.d()) {
                        Intrinsics.checkNotNull(E10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                        return E10.b();
                    }
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) E10.b();
                    mVar.f6546n = this;
                    mVar.f6547o = E10;
                    mVar.f6550r = 1;
                    obj = AbstractC5323h.r(interfaceC5321f, mVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    E10 = (C5582a) mVar.f6547o;
                    aVar = (a) mVar.f6546n;
                    ResultKt.throwOnFailure(obj);
                }
                MessageEntity messageEntity = (MessageEntity) CollectionsKt.firstOrNull((List) obj);
                E10 = E10.a(messageEntity == null ? MessageRoomToDomainKt.g(messageEntity, aVar.f6499a, aVar.L(), false, false, null, null, 60, null) : null);
                return E10.b();
            }
        }
        mVar = new m(continuation);
        Object obj2 = mVar.f6548p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = mVar.f6550r;
        if (i10 != 0) {
        }
        MessageEntity messageEntity2 = (MessageEntity) CollectionsKt.firstOrNull((List) obj2);
        E10 = E10.a(messageEntity2 == null ? MessageRoomToDomainKt.g(messageEntity2, aVar.f6499a, aVar.L(), false, false, null, null, 60, null) : null);
        return E10.b();
    }

    public final TriggersRepository R() {
        return (TriggersRepository) this.f6507i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba A[Catch: all -> 0x0164, TRY_LEAVE, TryCatch #4 {all -> 0x0164, blocks: (B:12:0x00ab, B:14:0x00ba, B:17:0x00e7, B:20:0x00f6, B:23:0x0120, B:25:0x0149, B:26:0x016a, B:28:0x017e, B:30:0x018d, B:89:0x0173), top: B:11:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017e A[Catch: all -> 0x0164, TryCatch #4 {all -> 0x0164, blocks: (B:12:0x00ab, B:14:0x00ba, B:17:0x00e7, B:20:0x00f6, B:23:0x0120, B:25:0x0149, B:26:0x016a, B:28:0x017e, B:30:0x018d, B:89:0x0173), top: B:11:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ad A[Catch: all -> 0x025d, TryCatch #6 {all -> 0x025d, blocks: (B:40:0x0290, B:42:0x02ad, B:43:0x02b6, B:45:0x02c3, B:46:0x02c8, B:48:0x02ce, B:49:0x02d3, B:51:0x02fc, B:52:0x0301, B:54:0x0309, B:55:0x031c, B:68:0x02b2, B:34:0x0256), top: B:33:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c3 A[Catch: all -> 0x025d, TryCatch #6 {all -> 0x025d, blocks: (B:40:0x0290, B:42:0x02ad, B:43:0x02b6, B:45:0x02c3, B:46:0x02c8, B:48:0x02ce, B:49:0x02d3, B:51:0x02fc, B:52:0x0301, B:54:0x0309, B:55:0x031c, B:68:0x02b2, B:34:0x0256), top: B:33:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ce A[Catch: all -> 0x025d, TryCatch #6 {all -> 0x025d, blocks: (B:40:0x0290, B:42:0x02ad, B:43:0x02b6, B:45:0x02c3, B:46:0x02c8, B:48:0x02ce, B:49:0x02d3, B:51:0x02fc, B:52:0x0301, B:54:0x0309, B:55:0x031c, B:68:0x02b2, B:34:0x0256), top: B:33:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fc A[Catch: all -> 0x025d, TryCatch #6 {all -> 0x025d, blocks: (B:40:0x0290, B:42:0x02ad, B:43:0x02b6, B:45:0x02c3, B:46:0x02c8, B:48:0x02ce, B:49:0x02d3, B:51:0x02fc, B:52:0x0301, B:54:0x0309, B:55:0x031c, B:68:0x02b2, B:34:0x0256), top: B:33:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0309 A[Catch: all -> 0x025d, TryCatch #6 {all -> 0x025d, blocks: (B:40:0x0290, B:42:0x02ad, B:43:0x02b6, B:45:0x02c3, B:46:0x02c8, B:48:0x02ce, B:49:0x02d3, B:51:0x02fc, B:52:0x0301, B:54:0x0309, B:55:0x031c, B:68:0x02b2, B:34:0x0256), top: B:33:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b2 A[Catch: all -> 0x025d, TryCatch #6 {all -> 0x025d, blocks: (B:40:0x0290, B:42:0x02ad, B:43:0x02b6, B:45:0x02c3, B:46:0x02c8, B:48:0x02ce, B:49:0x02d3, B:51:0x02fc, B:52:0x0301, B:54:0x0309, B:55:0x031c, B:68:0x02b2, B:34:0x0256), top: B:33:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0173 A[Catch: all -> 0x0164, TryCatch #4 {all -> 0x0164, blocks: (B:12:0x00ab, B:14:0x00ba, B:17:0x00e7, B:20:0x00f6, B:23:0x0120, B:25:0x0149, B:26:0x016a, B:28:0x017e, B:30:0x018d, B:89:0x0173), top: B:11:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(ConversationResponse conversationResponse, Continuation continuation) {
        n nVar;
        int i10;
        ConversationResponse conversationResponse2;
        Wh.a aVar;
        a aVar2;
        Wh.a aVar3;
        Throwable th2;
        Object obj;
        Wh.a aVar4;
        a aVar5;
        ConversationResponse conversationResponse3;
        SalesIQChat salesIQChat;
        String missedTime;
        String startTime;
        String endTime;
        ContentResolver contentResolver;
        SalesIQChat salesIQChat2;
        a aVar6;
        Wh.a aVar7;
        ConversationResponse conversationResponse4;
        C6152a M10;
        String acknowledgementKey;
        String id2;
        String chatId;
        String wmsChatId;
        a aVar8;
        ConversationResponse conversationResponse5;
        SalesIQChat salesIQChat3;
        String id3;
        try {
            if (continuation instanceof n) {
                nVar = (n) continuation;
                int i11 = nVar.f6557t;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    nVar.f6557t = i11 - Integer.MIN_VALUE;
                    n nVar2 = nVar;
                    Object obj2 = nVar2.f6555r;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = nVar2.f6557t;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Wh.a a10 = C6461a.C0913a.f65814a.a();
                        nVar2.f6551n = this;
                        conversationResponse2 = conversationResponse;
                        nVar2.f6552o = conversationResponse2;
                        nVar2.f6553p = a10;
                        nVar2.f6557t = 1;
                        if (a10.f(null, nVar2) != coroutine_suspended) {
                            aVar = a10;
                            aVar2 = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        try {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    aVar3 = (Wh.a) nVar2.f6551n;
                                    try {
                                        ResultKt.throwOnFailure(obj2);
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        obj = null;
                                        aVar3.g(obj);
                                        throw th2;
                                    }
                                    try {
                                        aVar = aVar3;
                                        aVar.g(null);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        obj = null;
                                        aVar3.g(obj);
                                        throw th2;
                                    }
                                }
                                salesIQChat = (SalesIQChat) nVar2.f6554q;
                                conversationResponse3 = (ConversationResponse) nVar2.f6553p;
                                aVar4 = (Wh.a) nVar2.f6552o;
                                aVar5 = (a) nVar2.f6551n;
                                ResultKt.throwOnFailure(obj2);
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("CHATID", conversationResponse3.getChatId());
                                contentValues.put("RCHATID", conversationResponse3.getWmsChatId());
                                Long lastModifiedTime = conversationResponse3.getLastModifiedTime();
                                contentValues.put("LMTIME", Boxing.boxLong(lastModifiedTime == null ? lastModifiedTime.longValue() : rd.b.f()));
                                missedTime = conversationResponse3.getMissedTime();
                                if (missedTime != null) {
                                    contentValues.put("MISSED_TIME", missedTime);
                                }
                                startTime = conversationResponse3.getStartTime();
                                if (startTime != null) {
                                    contentValues.put("LAST_INITIATED_TIME", startTime);
                                }
                                contentValues.put("STATUS", Boxing.boxInt(3));
                                contentValues.put("VISITORID", conversationResponse3.getId());
                                contentValues.put("CHATID", conversationResponse3.getChatId());
                                contentValues.put("VISITID", conversationResponse3.getReferenceId());
                                endTime = conversationResponse3.getEndTime();
                                if (endTime != null) {
                                    contentValues.put("END_TIME", endTime);
                                }
                                contentResolver = aVar5.f6499a.getContentResolver();
                                if (contentResolver != null) {
                                    Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{salesIQChat.getChid()}));
                                }
                                C6152a M11 = aVar5.M();
                                String id4 = conversationResponse3.getId();
                                Message.g gVar = Message.g.Question;
                                Message.f fVar = Message.f.Sent;
                                nVar2.f6551n = aVar4;
                                nVar2.f6552o = null;
                                nVar2.f6553p = null;
                                nVar2.f6554q = null;
                                nVar2.f6557t = 4;
                                obj2 = M11.b0(id4, gVar, fVar, nVar2);
                                if (obj2 != coroutine_suspended) {
                                    aVar3 = aVar4;
                                    aVar = aVar3;
                                    aVar.g(null);
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            }
                            salesIQChat3 = (SalesIQChat) nVar2.f6554q;
                            conversationResponse5 = (ConversationResponse) nVar2.f6553p;
                            aVar4 = (Wh.a) nVar2.f6552o;
                            aVar8 = (a) nVar2.f6551n;
                            ResultKt.throwOnFailure(obj2);
                            try {
                                salesIQChat2 = salesIQChat3;
                                conversationResponse4 = conversationResponse5;
                                aVar7 = aVar4;
                                aVar6 = aVar8;
                                try {
                                    M10 = aVar6.M();
                                    acknowledgementKey = conversationResponse4.getAcknowledgementKey();
                                    id2 = conversationResponse4.getId();
                                    chatId = conversationResponse4.getChatId();
                                    wmsChatId = conversationResponse4.getWmsChatId();
                                    nVar2.f6551n = aVar6;
                                    nVar2.f6552o = aVar7;
                                    nVar2.f6553p = conversationResponse4;
                                    nVar2.f6554q = salesIQChat2;
                                    nVar2.f6557t = 3;
                                    if (M10.Q(null, acknowledgementKey, id2, chatId, wmsChatId, nVar2) != coroutine_suspended) {
                                        conversationResponse3 = conversationResponse4;
                                        aVar4 = aVar7;
                                        aVar5 = aVar6;
                                        salesIQChat = salesIQChat2;
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("CHATID", conversationResponse3.getChatId());
                                        contentValues2.put("RCHATID", conversationResponse3.getWmsChatId());
                                        Long lastModifiedTime2 = conversationResponse3.getLastModifiedTime();
                                        contentValues2.put("LMTIME", Boxing.boxLong(lastModifiedTime2 == null ? lastModifiedTime2.longValue() : rd.b.f()));
                                        missedTime = conversationResponse3.getMissedTime();
                                        if (missedTime != null) {
                                        }
                                        startTime = conversationResponse3.getStartTime();
                                        if (startTime != null) {
                                        }
                                        contentValues2.put("STATUS", Boxing.boxInt(3));
                                        contentValues2.put("VISITORID", conversationResponse3.getId());
                                        contentValues2.put("CHATID", conversationResponse3.getChatId());
                                        contentValues2.put("VISITID", conversationResponse3.getReferenceId());
                                        endTime = conversationResponse3.getEndTime();
                                        if (endTime != null) {
                                        }
                                        contentResolver = aVar5.f6499a.getContentResolver();
                                        if (contentResolver != null) {
                                        }
                                        C6152a M112 = aVar5.M();
                                        String id42 = conversationResponse3.getId();
                                        Message.g gVar2 = Message.g.Question;
                                        Message.f fVar2 = Message.f.Sent;
                                        nVar2.f6551n = aVar4;
                                        nVar2.f6552o = null;
                                        nVar2.f6553p = null;
                                        nVar2.f6554q = null;
                                        nVar2.f6557t = 4;
                                        obj2 = M112.b0(id42, gVar2, fVar2, nVar2);
                                        if (obj2 != coroutine_suspended) {
                                        }
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    aVar3 = aVar7;
                                    obj = null;
                                    aVar3.g(obj);
                                    throw th2;
                                }
                            } catch (Throwable th6) {
                                th2 = th6;
                                aVar3 = aVar4;
                                obj = null;
                                aVar3.g(obj);
                                throw th2;
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            aVar3 = 1;
                        }
                    } else {
                        Wh.a aVar9 = (Wh.a) nVar2.f6553p;
                        ConversationResponse conversationResponse6 = (ConversationResponse) nVar2.f6552o;
                        aVar2 = (a) nVar2.f6551n;
                        ResultKt.throwOnFailure(obj2);
                        aVar = aVar9;
                        conversationResponse2 = conversationResponse6;
                    }
                    aVar2.a(conversationResponse2.getAcknowledgementKey());
                    if (conversationResponse2.getType() != ConversationResponse.Type.Call) {
                        salesIQChat2 = new SalesIQChat(conversationResponse2.getAcknowledgementKey(), conversationResponse2.getChatId(), conversationResponse2.getId(), og.i.r(conversationResponse2.getLastModifiedTime()), 1, SalesIQChat.c.Call);
                        ConversationResponse.Department department = conversationResponse2.getDepartment();
                        if (department != null) {
                            try {
                                id3 = department.getId();
                            } catch (Throwable th8) {
                                th2 = th8;
                                aVar3 = aVar;
                                obj = null;
                                aVar3.g(obj);
                                throw th2;
                            }
                        } else {
                            id3 = null;
                        }
                        salesIQChat2.setDeptid(id3);
                        ConversationResponse.Department department2 = conversationResponse2.getDepartment();
                        salesIQChat2.setDepartmentName(department2 != null ? department2.getName() : null);
                        salesIQChat2.setMedia((SalesIQChat.Media) AbstractC5895g.b(aVar2.L(), aVar2.L().v(conversationResponse2.getMediaData()), SalesIQChat.Media.class));
                        String startTime2 = conversationResponse2.getStartTime();
                        salesIQChat2.setChatLastInitiatedTime(startTime2 != null ? StringsKt.toLongOrNull(startTime2) : null);
                        salesIQChat2.setQuestion(conversationResponse2.getQuestion());
                        salesIQChat2.setLastmsgtime(og.i.r(conversationResponse2.getLastModifiedTime()));
                        SalesIQConversationAttributes salesIQConversationAttributes = (SalesIQConversationAttributes) aVar2.F().q().get(conversationResponse2.getAcknowledgementKey());
                        salesIQChat2.setExtras(salesIQConversationAttributes != null ? new SalesIQChat.Extras(new SalesIQChat.Extras.a(salesIQConversationAttributes.getName(), salesIQConversationAttributes.getAdditionalInfo(), salesIQConversationAttributes.getEncodedDisplayPicture(), salesIQConversationAttributes.getCustomSecretFields())) : null);
                        com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat2);
                    } else {
                        salesIQChat2 = LiveChatUtil.getChatFromConvID(conversationResponse2.getAcknowledgementKey());
                    }
                    if (salesIQChat2 != null) {
                        long f10 = rd.b.f() + ReactFontManager.TypefaceStyle.BOLD;
                        String chatId2 = conversationResponse2.getChatId();
                        if (chatId2 == null) {
                            conversationResponse4 = conversationResponse2;
                            aVar7 = aVar;
                            aVar6 = aVar2;
                            M10 = aVar6.M();
                            acknowledgementKey = conversationResponse4.getAcknowledgementKey();
                            id2 = conversationResponse4.getId();
                            chatId = conversationResponse4.getChatId();
                            wmsChatId = conversationResponse4.getWmsChatId();
                            nVar2.f6551n = aVar6;
                            nVar2.f6552o = aVar7;
                            nVar2.f6553p = conversationResponse4;
                            nVar2.f6554q = salesIQChat2;
                            nVar2.f6557t = 3;
                            if (M10.Q(null, acknowledgementKey, id2, chatId, wmsChatId, nVar2) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        C6152a M12 = aVar2.M();
                        MessageEntity messageEntity = new MessageEntity(conversationResponse2.getAcknowledgementKey(), conversationResponse2.getId(), chatId2, null, null, Message.g.InfoMessage.getStringValue(), Boxing.boxInt(Message.f.Sent.ordinal()), String.valueOf(f10), "", aVar2.L().v(new MessageResponse.Message(null, null, null, null, null, "MISSED_CHAT", null, null, null, null, null, null, null, null, null, null, null, null, 262110, null)), null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, new MessageEntity.Time(f10, f10, -1L, 0L, 0L, null, 56, null), 50187264, null);
                        nVar2.f6551n = aVar2;
                        nVar2.f6552o = aVar;
                        nVar2.f6553p = conversationResponse2;
                        nVar2.f6554q = salesIQChat2;
                        nVar2.f6557t = 2;
                        obj2 = M12.T(messageEntity, true, nVar2);
                        if (obj2 != coroutine_suspended) {
                            conversationResponse5 = conversationResponse2;
                            aVar4 = aVar;
                            aVar8 = aVar2;
                            salesIQChat3 = salesIQChat2;
                            salesIQChat2 = salesIQChat3;
                            conversationResponse4 = conversationResponse5;
                            aVar7 = aVar4;
                            aVar6 = aVar8;
                            M10 = aVar6.M();
                            acknowledgementKey = conversationResponse4.getAcknowledgementKey();
                            id2 = conversationResponse4.getId();
                            chatId = conversationResponse4.getChatId();
                            wmsChatId = conversationResponse4.getWmsChatId();
                            nVar2.f6551n = aVar6;
                            nVar2.f6552o = aVar7;
                            nVar2.f6553p = conversationResponse4;
                            nVar2.f6554q = salesIQChat2;
                            nVar2.f6557t = 3;
                            if (M10.Q(null, acknowledgementKey, id2, chatId, wmsChatId, nVar2) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
            }
            aVar2.a(conversationResponse2.getAcknowledgementKey());
            if (conversationResponse2.getType() != ConversationResponse.Type.Call) {
            }
            if (salesIQChat2 != null) {
            }
            aVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th9) {
            th2 = th9;
            aVar3 = aVar;
            obj = null;
            aVar3.g(obj);
            throw th2;
        }
        nVar = new n(continuation);
        n nVar22 = nVar;
        Object obj22 = nVar22.f6555r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = nVar22.f6557t;
        if (i10 != 0) {
        }
    }

    public final Object T(AbstractC2916a abstractC2916a, Continuation continuation) {
        if ((og.i.e(G().I()) ? this : null) != null) {
            C1934a H10 = H();
            String I10 = G().I();
            Intrinsics.checkNotNull(I10);
            Object f10 = H10.f(I10, abstractC2916a, continuation);
            if (f10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return f10;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0297, code lost:
    
        if (r9.W(r1, r2, r4, r3, r8) != r11) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
    
        if (Bg.a.C0025a.a(r5, r6, null, r8, 2, null) == r11) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0201, code lost:
    
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0274, code lost:
    
        if (r5.a(r6, r7, r9, r8) == r11) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(ConversationResponse conversationResponse, String str, boolean z10, Message message, Bg.a aVar, Continuation continuation) {
        u uVar;
        int i10;
        a aVar2;
        a aVar3;
        MediaResponse mediaData;
        Object h10;
        ConversationResponse conversationResponse2;
        boolean z11;
        String str2;
        Message message2;
        Channel.CallConfigurations callConfigurations;
        ConversationResponse conversationResponse3 = conversationResponse;
        String str3 = str;
        boolean z12 = z10;
        Message message3 = message;
        Bg.a aVar4 = aVar;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i11 = uVar.f6594w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f6594w = i11 - Integer.MIN_VALUE;
                u uVar2 = uVar;
                Object obj = uVar2.f6592u;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = uVar2.f6594w;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            boolean z13 = uVar2.f6591t;
                            MediaResponse mediaResponse = (MediaResponse) uVar2.f6590s;
                            android.support.v4.media.session.b.a(uVar2.f6589r);
                            Message message4 = (Message) uVar2.f6588q;
                            String str4 = (String) uVar2.f6587p;
                            ConversationResponse conversationResponse4 = (ConversationResponse) uVar2.f6586o;
                            a aVar5 = (a) uVar2.f6585n;
                            ResultKt.throwOnFailure(obj);
                            aVar2 = aVar5;
                            h10 = obj;
                            mediaData = mediaResponse;
                            str3 = str4;
                            message3 = message4;
                            z12 = z13;
                            conversationResponse3 = conversationResponse4;
                            aVar4 = null;
                            if (aVar4 != null) {
                                Channel r10 = aVar2.G().r();
                                String appName = (r10 == null || (callConfigurations = r10.getCallConfigurations()) == null) ? null : callConfigurations.getAppName();
                                if (appName == null) {
                                    appName = "";
                                }
                                String str5 = appName;
                                String e10 = MobilistenUtil.e();
                                String packageName = aVar2.f6499a.getPackageName();
                                MediaResponse.RTCPCredential rtcpCredential = mediaData.getRtcpCredential();
                                String clientOtp = rtcpCredential != null ? rtcpCredential.getClientOtp() : null;
                                MediaResponse.RTCPCredential rtcpCredential2 = mediaData.getRtcpCredential();
                                String conferenceKey = rtcpCredential2 != null ? rtcpCredential2.getConferenceKey() : null;
                                MediaResponse.RTCPCredential rtcpCredential3 = mediaData.getRtcpCredential();
                                String userId = rtcpCredential3 != null ? rtcpCredential3.getUserId() : null;
                                String mediaId = mediaData.getMediaId();
                                String conversationId = mediaData.getConversationId();
                                String recordingType = mediaData.getRecordingType();
                                String d10 = sd.d.d();
                                Intrinsics.checkNotNull(d10);
                                c cVar = new c(str5, e10, packageName, clientOtp, conferenceKey, userId, conversationId, mediaId, "", recordingType, false, d10, 1024, null);
                                uVar2.f6585n = aVar2;
                                uVar2.f6586o = conversationResponse3;
                                uVar2.f6587p = str3;
                                uVar2.f6588q = message3;
                                uVar2.f6589r = null;
                                uVar2.f6590s = null;
                                uVar2.f6591t = z12;
                                uVar2.f6594w = 3;
                                if (aVar4.b(cVar, uVar2) != coroutine_suspended) {
                                    Message message5 = message3;
                                    conversationResponse2 = conversationResponse3;
                                    z11 = z12;
                                    str2 = str3;
                                    message2 = message5;
                                    aVar3 = aVar2;
                                    String str6 = str2;
                                    z12 = z11;
                                    conversationResponse3 = conversationResponse2;
                                    message3 = message2;
                                    str3 = str6;
                                    aVar2 = aVar3;
                                }
                                return coroutine_suspended;
                            }
                        } else if (i10 == 3) {
                            z11 = uVar2.f6591t;
                            message2 = (Message) uVar2.f6588q;
                            str2 = (String) uVar2.f6587p;
                            conversationResponse2 = (ConversationResponse) uVar2.f6586o;
                            aVar3 = (a) uVar2.f6585n;
                            ResultKt.throwOnFailure(obj);
                            String str62 = str2;
                            z12 = z11;
                            conversationResponse3 = conversationResponse2;
                            message3 = message2;
                            str3 = str62;
                            aVar2 = aVar3;
                        } else if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                    }
                    boolean z14 = uVar2.f6591t;
                    Message message6 = (Message) uVar2.f6588q;
                    String str7 = (String) uVar2.f6587p;
                    ConversationResponse conversationResponse5 = (ConversationResponse) uVar2.f6586o;
                    aVar3 = (a) uVar2.f6585n;
                    ResultKt.throwOnFailure(obj);
                    z12 = z14;
                    conversationResponse3 = conversationResponse5;
                    message3 = message6;
                    str3 = str7;
                    aVar2 = aVar3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (conversationResponse3 == null) {
                        return Unit.INSTANCE;
                    }
                    a(conversationResponse3.getAcknowledgementKey());
                    SalesIQConversationAttributes salesIQConversationAttributes = (SalesIQConversationAttributes) F().q().get(str3);
                    if (salesIQConversationAttributes != null) {
                    }
                    if (conversationResponse3.getType() == ConversationResponse.Type.Call) {
                        if (conversationResponse3.getQueueType() == null) {
                            MediaResponse mediaData2 = conversationResponse3.getMediaData();
                            if ((mediaData2 != null ? mediaData2.getOperation() : null) != MediaResponse.Operation.Queue) {
                                if (conversationResponse3.getMediaData() != null) {
                                    mediaData = conversationResponse3.getMediaData();
                                    String chatId = conversationResponse3.getChatId();
                                    if (chatId != null) {
                                        String id2 = conversationResponse3.getId();
                                        uVar2.f6585n = this;
                                        uVar2.f6586o = conversationResponse3;
                                        uVar2.f6587p = str3;
                                        uVar2.f6588q = message3;
                                        uVar2.f6589r = aVar4;
                                        uVar2.f6590s = mediaData;
                                        uVar2.f6591t = z12;
                                        uVar2.f6594w = 2;
                                        h10 = h(chatId, id2, uVar2);
                                        if (h10 != coroutine_suspended) {
                                            aVar2 = this;
                                            if (aVar4 != null) {
                                            }
                                        }
                                    } else {
                                        aVar2 = this;
                                        if (aVar4 != null) {
                                        }
                                    }
                                } else if (aVar4 != null) {
                                    String string = this.f6499a.getString(od.t.f61025g);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    uVar2.f6585n = this;
                                    uVar2.f6586o = conversationResponse3;
                                    uVar2.f6587p = str3;
                                    uVar2.f6588q = message3;
                                    uVar2.f6591t = z12;
                                    uVar2.f6594w = 4;
                                }
                                return coroutine_suspended;
                            }
                        }
                        String id3 = conversationResponse3.getId();
                        MediaResponse mediaData3 = conversationResponse3.getMediaData();
                        Td.e.W0(id3, mediaData3 != null ? mediaData3.getMediaId() : null, null, null, null, null, null, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        if (aVar4 != null) {
                            int i12 = od.t.f60861F3;
                            String format = new DecimalFormat("00").format(Boxing.boxInt(og.i.l(conversationResponse3.getCurrentPosition(), 1)));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            boolean areEqual = Intrinsics.areEqual(Ae.a.m(G(), Ce.a.a(De.a.CallsQueuePosition), false, 2, null).b(), Boxing.boxBoolean(true));
                            uVar2.f6585n = this;
                            uVar2.f6586o = conversationResponse3;
                            uVar2.f6587p = str3;
                            uVar2.f6588q = message3;
                            uVar2.f6591t = z12;
                            uVar2.f6594w = 1;
                        }
                    }
                    aVar2 = this;
                }
                uVar2.f6585n = null;
                uVar2.f6586o = null;
                uVar2.f6587p = null;
                uVar2.f6588q = null;
                uVar2.f6589r = null;
                uVar2.f6590s = null;
                uVar2.f6594w = 5;
            }
        }
        uVar = new u(continuation);
        u uVar22 = uVar;
        Object obj2 = uVar22.f6592u;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = uVar22.f6594w;
        if (i10 == 0) {
        }
        uVar22.f6585n = null;
        uVar22.f6586o = null;
        uVar22.f6587p = null;
        uVar22.f6588q = null;
        uVar22.f6589r = null;
        uVar22.f6590s = null;
        uVar22.f6594w = 5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:131|(3:210|211|(15:213|(5:135|(1:137)(1:176)|138|(1:140)(1:175)|(4:142|(1:144)(1:174)|145|(3:147|(1:149)(1:173)|(4:151|(1:153)(1:172)|154|(4:156|(1:158)(1:171)|159|(3:161|(1:163)(1:170)|164))))))|177|178|179|180|181|(1:183)(3:200|201|(2:203|204)(7:205|185|186|187|188|189|(1:192)(16:191|112|113|114|(2:116|(2:118|119))|101|(2:103|(2:105|106)(2:107|78))|79|80|(12:82|(1:84)|85|(7:88|(1:90)|91|(1:93)|94|(2:96|97)|53)|54|(1:73)(1:56)|57|(1:71)(1:59)|60|(1:68)(1:62)|63|(2:65|66)(2:67|44))|45|(1:47)(1:49)|48|19|20|21)))|184|185|186|187|188|189|(0)(0)))|133|(0)|177|178|179|180|181|(0)(0)|184|185|186|187|188|189|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0b30, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0b31, code lost:
    
        r2 = r47;
        r6 = r49;
        r13 = r52;
        r9 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0b39, code lost:
    
        r5 = r7;
        r7 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0ac6, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0ac1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0ac2, code lost:
    
        r2 = r3;
        r9 = r5;
        r5 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0b3d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0b3e, code lost:
    
        r9 = r5;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0836, code lost:
    
        r8 = r3.getTriggerData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x083a, code lost:
    
        if (r8 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x083c, code lost:
    
        r8 = r8.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0840, code lost:
    
        if (r8 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0842, code lost:
    
        r8 = com.google.gson.m.d(r8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "parseString(...)");
        r8 = og.AbstractC5896h.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x084d, code lost:
    
        if (r8 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x084f, code lost:
    
        r9 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0855, code lost:
    
        if (r8.t(r9) != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0857, code lost:
    
        r54 = r11;
        r11 = r25;
        r25 = r8.r(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x085f, code lost:
    
        if (r25 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0861, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r25);
        r55 = r13;
        r13 = og.AbstractC5896h.c(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x086a, code lost:
    
        if (r13 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x086c, code lost:
    
        r8.m(r9, r13);
        r8.v(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0872, code lost:
    
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x087a, code lost:
    
        r11 = r8.r(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x087e, code lost:
    
        if (r11 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0880, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r11);
        r11 = og.AbstractC5896h.d(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0887, code lost:
    
        if (r11 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0889, code lost:
    
        r11 = r11.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x088d, code lost:
    
        if (r11 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x088f, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r11);
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x089a, code lost:
    
        if (r11.hasNext() == false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x089c, code lost:
    
        r13 = (java.util.Map.Entry) r11.next();
        r8.m((java.lang.String) r13.getKey(), (com.google.gson.h) r13.getValue());
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x08b8, code lost:
    
        r11 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x08ba, code lost:
    
        r11 = r3.getTriggerData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x08be, code lost:
    
        if (r11 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x08c0, code lost:
    
        r11 = r11.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x08c4, code lost:
    
        if (r11 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x08c6, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r11);
        r8.o("time", kotlin.coroutines.jvm.internal.Boxing.boxLong(r11.longValue()));
        r11 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x08de, code lost:
    
        if (r8.t("isBot") == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x08e0, code lost:
    
        r9 = og.AbstractC5896h.f(r8.r(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x08ec, code lost:
    
        if (og.i.f(r9) == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x08f0, code lost:
    
        if (r9 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x08f2, code lost:
    
        r8.p("botid", r9);
        r9 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x08f9, code lost:
    
        r11 = r23;
        r8.p("mode", r11);
        r8.p("module", r11);
        r8.p("lsid", r2.G().D());
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x08ef, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x091a, code lost:
    
        if (r8.t(r49) != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x091c, code lost:
    
        r11 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0922, code lost:
    
        if (r8.t(r11) == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0924, code lost:
    
        r13 = r8.r(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0928, code lost:
    
        if (r13 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x092a, code lost:
    
        r13 = og.AbstractC5896h.f(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x092e, code lost:
    
        if (r13 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0930, code lost:
    
        r8.p(r49, r13);
        r8.p("triggername", r13);
        r8.v(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x093b, code lost:
    
        r9 = r20;
        r11 = r8.r(r9);
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0941, code lost:
    
        if (r11 == null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0943, code lost:
    
        r11 = og.AbstractC5896h.f(r11);
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0947, code lost:
    
        if (r11 == null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0949, code lost:
    
        r8.p("sendername", r11);
        r8.v(r9);
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0877, code lost:
    
        r55 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0875, code lost:
    
        r54 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x06b4, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0c4f, code lost:
    
        if (r0.intValue() == r2) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0c51, code lost:
    
        r1 = com.zoho.livechat.android.modules.messages.domain.entities.Message.f.Sent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0c40, code lost:
    
        if (r0.intValue() == r2) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0c31, code lost:
    
        if (r0.intValue() == r2) goto L425;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0b83 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0b51 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0a00 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0a1a A[Catch: all -> 0x0a13, TryCatch #8 {all -> 0x0a13, blocks: (B:211:0x0a08, B:213:0x0a0e, B:135:0x0a1a, B:137:0x0a24, B:138:0x0a2a, B:140:0x0a39, B:142:0x0a41, B:144:0x0a47, B:145:0x0a4d, B:147:0x0a53, B:149:0x0a59, B:151:0x0a61, B:153:0x0a67, B:154:0x0a6d, B:156:0x0a71, B:158:0x0a77, B:159:0x0a7d, B:161:0x0a81, B:163:0x0a8b, B:164:0x0a91), top: B:210:0x0a08 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0e06 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0aa2 A[Catch: all -> 0x0ac1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0ac1, blocks: (B:183:0x0aa2, B:203:0x0ad1), top: B:181:0x0aa0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0e0e A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b8 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0e36 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06e6 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0722 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0e0b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0732 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x073e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x076c A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x077b A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07ab A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07dc A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0806 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0819 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x095c A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x097c A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0dec A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07e5 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0de6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05ee A[Catch: all -> 0x05f5, TryCatch #9 {all -> 0x05f5, blocks: (B:388:0x05ce, B:390:0x05ee, B:391:0x05fa, B:394:0x060c, B:400:0x061c, B:404:0x0634, B:413:0x0cb1, B:416:0x0cb9, B:419:0x0cc2, B:420:0x0d4f, B:422:0x0d54, B:424:0x0d5c, B:429:0x0d94, B:435:0x0ce4, B:437:0x0d16, B:438:0x0d1c, B:440:0x0d25, B:441:0x0d2b), top: B:387:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0cb7  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0d54 A[Catch: all -> 0x05f5, TryCatch #9 {all -> 0x05f5, blocks: (B:388:0x05ce, B:390:0x05ee, B:391:0x05fa, B:394:0x060c, B:400:0x061c, B:404:0x0634, B:413:0x0cb1, B:416:0x0cb9, B:419:0x0cc2, B:420:0x0d4f, B:422:0x0d54, B:424:0x0d5c, B:429:0x0d94, B:435:0x0ce4, B:437:0x0d16, B:438:0x0d1c, B:440:0x0d25, B:441:0x0d2b), top: B:387:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0d5c A[Catch: all -> 0x05f5, TryCatch #9 {all -> 0x05f5, blocks: (B:388:0x05ce, B:390:0x05ee, B:391:0x05fa, B:394:0x060c, B:400:0x061c, B:404:0x0634, B:413:0x0cb1, B:416:0x0cb9, B:419:0x0cc2, B:420:0x0d4f, B:422:0x0d54, B:424:0x0d5c, B:429:0x0d94, B:435:0x0ce4, B:437:0x0d16, B:438:0x0d1c, B:440:0x0d25, B:441:0x0d2b), top: B:387:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0d94 A[Catch: all -> 0x05f5, TRY_LEAVE, TryCatch #9 {all -> 0x05f5, blocks: (B:388:0x05ce, B:390:0x05ee, B:391:0x05fa, B:394:0x060c, B:400:0x061c, B:404:0x0634, B:413:0x0cb1, B:416:0x0cb9, B:419:0x0cc2, B:420:0x0d4f, B:422:0x0d54, B:424:0x0d5c, B:429:0x0d94, B:435:0x0ce4, B:437:0x0d16, B:438:0x0d1c, B:440:0x0d25, B:441:0x0d2b), top: B:387:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0d59  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0d16 A[Catch: all -> 0x05f5, TryCatch #9 {all -> 0x05f5, blocks: (B:388:0x05ce, B:390:0x05ee, B:391:0x05fa, B:394:0x060c, B:400:0x061c, B:404:0x0634, B:413:0x0cb1, B:416:0x0cb9, B:419:0x0cc2, B:420:0x0d4f, B:422:0x0d54, B:424:0x0d5c, B:429:0x0d94, B:435:0x0ce4, B:437:0x0d16, B:438:0x0d1c, B:440:0x0d25, B:441:0x0d2b), top: B:387:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0d25 A[Catch: all -> 0x05f5, TryCatch #9 {all -> 0x05f5, blocks: (B:388:0x05ce, B:390:0x05ee, B:391:0x05fa, B:394:0x060c, B:400:0x061c, B:404:0x0634, B:413:0x0cb1, B:416:0x0cb9, B:419:0x0cc2, B:420:0x0d4f, B:422:0x0d54, B:424:0x0d5c, B:429:0x0d94, B:435:0x0ce4, B:437:0x0d16, B:438:0x0d1c, B:440:0x0d25, B:441:0x0d2b), top: B:387:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x04c5 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0477 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0c80 A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x054c A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0434 A[Catch: all -> 0x0521, TRY_LEAVE, TryCatch #0 {all -> 0x0521, blocks: (B:494:0x042e, B:496:0x0434), top: B:493:0x042e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0c2c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0c4b A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0c3c A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0c2d A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0bbc A[Catch: all -> 0x0052, TryCatch #7 {all -> 0x0052, blocks: (B:13:0x004d, B:14:0x0e02, B:16:0x0e06, B:18:0x0e0e, B:22:0x0e36, B:29:0x0dec, B:35:0x0dcc, B:43:0x00b3, B:45:0x0c78, B:47:0x0c80, B:48:0x0c86, B:51:0x00cc, B:53:0x0c1c, B:54:0x0c1e, B:57:0x0c33, B:60:0x0c42, B:63:0x0c53, B:68:0x0c4b, B:70:0x0c51, B:71:0x0c3c, B:73:0x0c2d, B:76:0x00ed, B:78:0x0ba4, B:80:0x0bb6, B:82:0x0bbc, B:84:0x0bc2, B:85:0x0be8, B:88:0x0bef, B:91:0x0bf7, B:94:0x0bff, B:99:0x0112, B:101:0x0b7d, B:103:0x0b83, B:114:0x0b4b, B:116:0x0b51, B:122:0x0b41, B:129:0x09f7, B:131:0x0a00, B:177:0x0a97, B:220:0x06a2, B:222:0x06a8, B:227:0x06b8, B:231:0x06cb, B:233:0x06e6, B:234:0x06ec, B:237:0x0724, B:248:0x075a, B:250:0x076c, B:252:0x0772, B:254:0x077b, B:258:0x0784, B:261:0x07a1, B:263:0x07ab, B:265:0x07b3, B:267:0x07dc, B:268:0x07ed, B:270:0x0806, B:272:0x080c, B:276:0x0819, B:278:0x081f, B:280:0x0825, B:286:0x095c, B:288:0x0962, B:291:0x097c, B:293:0x0982, B:295:0x099c, B:302:0x0972, B:304:0x0836, B:306:0x083c, B:308:0x0842, B:310:0x084f, B:312:0x0857, B:314:0x0861, B:316:0x086c, B:318:0x087a, B:320:0x0880, B:322:0x0889, B:324:0x088f, B:325:0x0896, B:327:0x089c, B:329:0x08b8, B:330:0x08ba, B:332:0x08c0, B:334:0x08c6, B:335:0x08d8, B:337:0x08e0, B:341:0x08f2, B:342:0x08f9, B:344:0x0914, B:346:0x091c, B:348:0x0924, B:350:0x092a, B:352:0x0930, B:353:0x093b, B:355:0x0943, B:357:0x0949, B:362:0x07e5, B:370:0x0734, B:373:0x06c2, B:384:0x05a0, B:451:0x02a2, B:452:0x04e6, B:453:0x04e8, B:457:0x02b5, B:460:0x04c5, B:464:0x02cd, B:466:0x04a2, B:473:0x046f, B:475:0x0477, B:481:0x052c, B:483:0x054c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25, types: [T] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r4v122 */
    /* JADX WARN: Type inference failed for: r4v123 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Wh.a] */
    /* JADX WARN: Type inference failed for: r8v43, types: [com.google.gson.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(String str, String str2, String str3, Pe.a aVar, boolean z10, boolean z11, String str4, String str5, String str6, Message message, Bg.a aVar2, Function0 function0, Continuation continuation) {
        w wVar;
        Rf.a aVar3;
        ?? r42;
        String str7;
        String str8;
        Pe.a aVar4;
        boolean z12;
        boolean z13;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        a aVar5;
        String str17;
        String str18;
        String str19;
        Message message2;
        Bg.a aVar6;
        Function0 function02;
        Wh.a aVar7;
        String str20;
        boolean z14;
        boolean z15;
        Message message3;
        Wh.a aVar8;
        Bg.a aVar9;
        String str21;
        Message message4;
        Function0 function03;
        boolean z16;
        a aVar10;
        Bg.a aVar11;
        String str22;
        String str23;
        String I10;
        boolean z17;
        boolean z18;
        String str24;
        Message message5;
        Message message6;
        Object obj;
        Function0 function04;
        Wh.a aVar12;
        String str25;
        String str26;
        String str27;
        String str28;
        Object obj2;
        String str29;
        Bg.a aVar13;
        Message message7;
        String str30;
        String str31;
        String str32;
        a aVar14;
        C6152a M10;
        Message.g gVar;
        Message.f fVar;
        SalesIQChat chatWithAnyId;
        w wVar2;
        Object obj3;
        String sb2;
        String str33;
        SalesIQChat salesIQChat;
        Wh.a aVar15;
        Bg.a aVar16;
        a aVar17;
        SalesIQChat salesIQChat2;
        Wh.a aVar18;
        String str34;
        SalesIQChat salesIQChat3;
        String str35;
        String str36;
        String str37;
        a aVar19;
        String str38;
        String str39;
        boolean z19;
        String str40;
        Message message8;
        Bg.a aVar20;
        Wh.a aVar21;
        String str41;
        String str42;
        Message message9;
        boolean z20;
        String valueOf;
        Message message10;
        Pe.a aVar22;
        a aVar23;
        String str43;
        String str44;
        String str45;
        String str46;
        String Y10;
        String c10;
        com.google.gson.k y10;
        String str47;
        String str48;
        com.google.gson.k kVar;
        String str49;
        String str50;
        Object obj4;
        String str51;
        String str52;
        String str53;
        com.google.gson.h hVar;
        Ie.a aVar24;
        String str54;
        com.google.gson.k kVar2;
        SalesIQConversationAttributes p10;
        com.google.gson.k kVar3;
        Rf.a aVar25;
        Object obj5;
        w wVar3;
        Bg.a aVar26;
        a aVar27;
        Message message11;
        String str55;
        Pe.a aVar28;
        boolean z21;
        com.google.gson.k kVar4;
        String convID;
        SalesIQChat.b triggerData;
        String e10;
        ?? d10;
        SalesIQChat.b triggerData2;
        SalesIQChat.b triggerData3;
        String content;
        Wh.a aVar29;
        SalesIQResponse salesIQResponse;
        w wVar4;
        String str56;
        SalesIQResponse salesIQResponse2;
        a aVar30;
        Rf.a a10;
        a aVar31;
        Pe.a aVar32;
        Ref.ObjectRef objectRef;
        Message message12;
        ?? r15;
        w wVar5;
        String str57;
        a aVar33;
        Bg.a aVar34;
        Object m147constructorimpl;
        Wh.a aVar35;
        Throwable m150exceptionOrNullimpl;
        Wh.a aVar36;
        AbstractC2916a abstractC2916a;
        SalesIQResponse salesIQResponse3;
        Pe.a aVar37;
        String str58;
        a aVar38;
        Wh.a aVar39;
        SalesIQResponse.Error error;
        Wh.a aVar40;
        Wh.a aVar41;
        Wh.a aVar42;
        Integer b10;
        Message.f fVar2;
        C6152a M11;
        Message.g gVar2;
        SalesIQResponse salesIQResponse4;
        Wh.a aVar43;
        Wh.a aVar44;
        C5582a c11;
        Wh.a aVar45;
        AbstractC2916a.j jVar;
        String str59;
        SalesIQChat salesIQChat4;
        Object obj6;
        Wh.a aVar46;
        Wh.a aVar47;
        Wh.a aVar48;
        Wh.a aVar49;
        Object obj7 = "message";
        try {
            try {
                if (continuation instanceof w) {
                    wVar = (w) continuation;
                    int i10 = wVar.f6605H;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wVar.f6605H = i10 - Integer.MIN_VALUE;
                        Object obj8 = wVar.f6603F;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (wVar.f6605H) {
                            case 0:
                                ResultKt.throwOnFailure(obj8);
                                Wh.a a11 = C6461a.C0913a.f65814a.a();
                                wVar.f6606n = this;
                                wVar.f6607o = str;
                                str7 = str2;
                                wVar.f6608p = str7;
                                str8 = str3;
                                wVar.f6609q = str8;
                                aVar4 = aVar;
                                wVar.f6610r = aVar4;
                                wVar.f6611s = str4;
                                wVar.f6612t = str5;
                                wVar.f6613u = str6;
                                wVar.f6614v = message;
                                wVar.f6615w = aVar2;
                                wVar.f6616x = function0;
                                wVar.f6617y = a11;
                                wVar.f6601D = z10;
                                wVar.f6602E = z11;
                                wVar.f6605H = 1;
                                if (a11.f(null, wVar) != coroutine_suspended) {
                                    z12 = z10;
                                    z13 = z11;
                                    str9 = "Call failed";
                                    str10 = "sender_name";
                                    str11 = "message";
                                    str12 = "BOT_MESSAGE";
                                    str13 = "attender";
                                    str14 = "msg_list";
                                    str15 = "msglist";
                                    str16 = EventKeys.VALUE_KEY;
                                    aVar5 = this;
                                    str17 = str4;
                                    str18 = str5;
                                    str19 = str6;
                                    message2 = message;
                                    aVar6 = aVar2;
                                    function02 = function0;
                                    aVar7 = a11;
                                    str20 = str;
                                    try {
                                        if (qd.c.k()) {
                                            C6821a c6821a = C6821a.f68119a;
                                            wVar.f6606n = aVar5;
                                            wVar.f6607o = str20;
                                            wVar.f6608p = str7;
                                            wVar.f6609q = str8;
                                            wVar.f6610r = aVar4;
                                            wVar.f6611s = str17;
                                            wVar.f6612t = str18;
                                            wVar.f6613u = str19;
                                            wVar.f6614v = message2;
                                            wVar.f6615w = aVar6;
                                            wVar.f6616x = function02;
                                            wVar.f6617y = aVar7;
                                            wVar.f6601D = z12;
                                            wVar.f6602E = z13;
                                            z14 = z12;
                                            wVar.f6605H = 2;
                                            Object a12 = c6821a.a(wVar);
                                            coroutine_suspended = coroutine_suspended;
                                            if (a12 != coroutine_suspended) {
                                                String str60 = str17;
                                                str21 = str20;
                                                obj8 = a12;
                                                message4 = message2;
                                                aVar8 = aVar7;
                                                function03 = function02;
                                                z16 = z13;
                                                aVar10 = aVar5;
                                                aVar11 = aVar6;
                                                str22 = str18;
                                                str23 = str60;
                                                if (((Boolean) obj8).booleanValue()) {
                                                    AbstractC2916a.z zVar = new AbstractC2916a.z();
                                                    wVar.f6606n = aVar10;
                                                    wVar.f6607o = str21;
                                                    wVar.f6608p = aVar11;
                                                    wVar.f6609q = aVar8;
                                                    wVar.f6610r = null;
                                                    wVar.f6611s = null;
                                                    wVar.f6612t = null;
                                                    wVar.f6613u = null;
                                                    wVar.f6614v = null;
                                                    wVar.f6615w = null;
                                                    wVar.f6616x = null;
                                                    wVar.f6617y = null;
                                                    wVar.f6605H = 3;
                                                    if (aVar10.T(zVar, wVar) != coroutine_suspended) {
                                                        str32 = str21;
                                                        aVar14 = aVar10;
                                                        LiveChatUtil.log("WmsConnection, onConversationStart, Wms connection failed");
                                                        M10 = aVar14.M();
                                                        gVar = Message.g.Question;
                                                        fVar = Message.f.Failure;
                                                        wVar.f6606n = aVar14;
                                                        wVar.f6607o = aVar11;
                                                        wVar.f6608p = aVar8;
                                                        wVar.f6609q = null;
                                                        wVar.f6605H = 4;
                                                        if (M10.e0(str32, gVar, fVar, wVar) == coroutine_suspended) {
                                                        }
                                                        if (aVar11 != null) {
                                                            String string = aVar14.f6499a.getString(od.t.f61025g);
                                                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                            wVar.f6606n = aVar8;
                                                            wVar.f6607o = null;
                                                            wVar.f6608p = null;
                                                            wVar.f6605H = 5;
                                                            if (aVar11.c(string, "Wms connection failed", wVar) == coroutine_suspended) {
                                                            }
                                                            Unit unit = Unit.INSTANCE;
                                                        }
                                                        C5582a.C0817a c0817a = C5582a.f56502b;
                                                        b.d dVar = b.d.f67612j0;
                                                        C5582a b11 = c0817a.b(new C5582a.b(dVar.b(), Boxing.boxInt(dVar.a()), null, 4, null));
                                                        aVar8.g(null);
                                                        return b11;
                                                    }
                                                } else {
                                                    a aVar50 = aVar10;
                                                    message3 = message4;
                                                    z15 = z16;
                                                    function02 = function03;
                                                    aVar9 = aVar11;
                                                    aVar5 = aVar50;
                                                    str20 = str21;
                                                    str17 = str23;
                                                    str18 = str22;
                                                    boolean z22 = z14;
                                                    Object obj9 = coroutine_suspended;
                                                    I10 = aVar5.G().I();
                                                    z17 = z15;
                                                    String V10 = aVar5.G().V();
                                                    z18 = z22;
                                                    String h10 = aVar5.G().h();
                                                    if (message3 != null) {
                                                        wVar.f6606n = aVar5;
                                                        wVar.f6607o = str20;
                                                        wVar.f6608p = str7;
                                                        wVar.f6609q = str8;
                                                        wVar.f6610r = aVar4;
                                                        wVar.f6611s = str17;
                                                        wVar.f6612t = str18;
                                                        wVar.f6613u = str19;
                                                        wVar.f6614v = message3;
                                                        wVar.f6615w = aVar9;
                                                        wVar.f6616x = function02;
                                                        wVar.f6617y = aVar8;
                                                        wVar.f6618z = I10;
                                                        wVar.f6598A = V10;
                                                        wVar.f6599B = h10;
                                                        wVar.f6601D = z18;
                                                        z18 = z18;
                                                        wVar.f6602E = z17;
                                                        z17 = z17;
                                                        wVar.f6605H = 6;
                                                        String str61 = str20;
                                                        obj8 = Q(aVar5, str61, null, wVar, 2, null);
                                                        obj2 = obj9;
                                                        if (obj8 == obj2) {
                                                            return obj2;
                                                        }
                                                        str29 = h10;
                                                        aVar13 = aVar9;
                                                        message7 = message3;
                                                        str30 = str61;
                                                        str31 = V10;
                                                        String str62 = str18;
                                                        str26 = str17;
                                                        str27 = str30;
                                                        function04 = function02;
                                                        aVar12 = aVar8;
                                                        str25 = str62;
                                                        message5 = (Message) obj8;
                                                        str24 = str31;
                                                        str28 = str29;
                                                        aVar9 = aVar13;
                                                        obj = obj2;
                                                        message6 = message7;
                                                        boolean z23 = z17;
                                                        boolean z24 = z18;
                                                        try {
                                                            chatWithAnyId = LiveChatUtil.getChatWithAnyId(str27);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            String str63 = I10;
                                                            sb3.append("DuplicateChatsTest ");
                                                            sb3.append(Q.q());
                                                            sb3.append(' ');
                                                            sb3.append(chatWithAnyId != null ? chatWithAnyId.getVisitorid() : null);
                                                            LiveChatUtil.log(sb3.toString());
                                                            if (Q.q() == null) {
                                                                if ((chatWithAnyId != null ? chatWithAnyId.getVisitorid() : null) == null && str63 != null && str24 != null && str28 != null) {
                                                                    if ((message5 != null ? message5.getContent() : null) == null) {
                                                                        if (str7 != null) {
                                                                        }
                                                                    }
                                                                    Q.L(str27);
                                                                    C6461a c6461a = C6461a.f65810a;
                                                                    x xVar = new x(function04, null);
                                                                    wVar.f6606n = aVar5;
                                                                    wVar.f6607o = str27;
                                                                    wVar.f6608p = str7;
                                                                    wVar.f6609q = str8;
                                                                    wVar.f6610r = aVar4;
                                                                    wVar.f6611s = str26;
                                                                    wVar.f6612t = str25;
                                                                    wVar.f6613u = str19;
                                                                    wVar.f6614v = message6;
                                                                    wVar.f6615w = aVar9;
                                                                    wVar.f6616x = aVar12;
                                                                    wVar.f6617y = str63;
                                                                    wVar.f6618z = str24;
                                                                    String str64 = str28;
                                                                    wVar.f6598A = str64;
                                                                    Message message13 = message6;
                                                                    Message message14 = message5;
                                                                    wVar.f6599B = message14;
                                                                    str34 = str26;
                                                                    salesIQChat3 = chatWithAnyId;
                                                                    wVar.f6600C = salesIQChat3;
                                                                    str35 = str25;
                                                                    wVar.f6601D = z24;
                                                                    wVar.f6602E = z23;
                                                                    wVar.f6605H = 7;
                                                                    Object c12 = c6461a.c(xVar, wVar);
                                                                    coroutine_suspended = obj;
                                                                    if (c12 != coroutine_suspended) {
                                                                        String str65 = str8;
                                                                        str36 = str24;
                                                                        str37 = str27;
                                                                        aVar19 = aVar5;
                                                                        str38 = str64;
                                                                        str39 = str63;
                                                                        z19 = z24;
                                                                        str40 = str65;
                                                                        Bg.a aVar51 = aVar9;
                                                                        message8 = message14;
                                                                        aVar20 = aVar51;
                                                                        aVar21 = aVar12;
                                                                        str41 = str19;
                                                                        str42 = str11;
                                                                        message9 = message13;
                                                                        z20 = z23;
                                                                        Object obj10 = coroutine_suspended;
                                                                        Ie.a K10 = aVar19.K();
                                                                        if (message8 != null && (content = message8.getContent()) != null) {
                                                                            str7 = content;
                                                                            if (message8 != null) {
                                                                                valueOf = message8.getId();
                                                                                if (valueOf != null) {
                                                                                }
                                                                                message10 = message8;
                                                                                String str66 = str38;
                                                                                String str67 = str42;
                                                                                Boolean bool = (Boolean) aVar19.G().l(Ce.a.a(De.a.IsLoggerEnabled), true).b();
                                                                                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                                                                                String J10 = aVar19.G().J();
                                                                                String f10 = aVar19.G().f();
                                                                                String n10 = aVar19.G().n();
                                                                                String T10 = aVar19.G().T();
                                                                                String R10 = aVar19.G().R();
                                                                                String U10 = aVar19.G().U();
                                                                                boolean z25 = booleanValue;
                                                                                aVar22 = Pe.a.Chat;
                                                                                if (aVar4 == aVar22 && str35 != null && str35.length() != 0) {
                                                                                    aVar23 = aVar19;
                                                                                    if (aVar23 != null || str35 == null) {
                                                                                        str35 = aVar19.F().n();
                                                                                    }
                                                                                    if (((aVar4 == aVar22 || !z19) ? null : aVar19) != null) {
                                                                                        String str68 = str34;
                                                                                        str43 = str15;
                                                                                        str44 = T10;
                                                                                        str45 = U10;
                                                                                        str46 = str68;
                                                                                    } else {
                                                                                        str43 = str15;
                                                                                        str44 = T10;
                                                                                        str45 = U10;
                                                                                        str46 = null;
                                                                                    }
                                                                                    String X10 = aVar19.G().X();
                                                                                    Y10 = aVar19.G().Y();
                                                                                    c10 = (salesIQChat3 != null || (triggerData3 = salesIQChat3.getTriggerData()) == null) ? null : triggerData3.c();
                                                                                    if (c10 != null && c10.length() != 0) {
                                                                                        Y10 = null;
                                                                                    }
                                                                                    y10 = aVar19.F().y();
                                                                                    if (y10.isEmpty()) {
                                                                                        str47 = str43;
                                                                                        str48 = X10;
                                                                                        kVar = null;
                                                                                    } else {
                                                                                        str47 = str43;
                                                                                        str48 = X10;
                                                                                        kVar = y10;
                                                                                    }
                                                                                    od.y w10 = aVar19.F().w();
                                                                                    if (message10 != null) {
                                                                                        str49 = J10;
                                                                                        Message.RespondedMessage respondedMessage = message10.getRespondedMessage();
                                                                                        if (respondedMessage != null) {
                                                                                            str50 = f10;
                                                                                            String str69 = Y10;
                                                                                            hVar = aVar19.L().B(respondedMessage);
                                                                                            obj4 = obj10;
                                                                                            str51 = R10;
                                                                                            str52 = str35;
                                                                                            str53 = str69;
                                                                                            Long o10 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                                                                            Object obj11 = obj4;
                                                                                            Boolean bool2 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                                                                            String c13 = (salesIQChat3 != null || (triggerData2 = salesIQChat3.getTriggerData()) == null) ? null : triggerData2.c();
                                                                                            if (salesIQChat3 != null && (triggerData = salesIQChat3.getTriggerData()) != null && (e10 = triggerData.e()) != null && (d10 = com.google.gson.m.d(e10)) != 0) {
                                                                                                aVar24 = K10;
                                                                                                str54 = str7;
                                                                                                kVar2 = d10;
                                                                                                com.google.gson.k kVar5 = kVar2;
                                                                                                if (salesIQChat3 != null || (convID = salesIQChat3.getConvID()) == null || (p10 = (SalesIQConversationAttributes) aVar19.F().q().get(convID)) == null) {
                                                                                                    p10 = aVar19.F().p();
                                                                                                }
                                                                                                if (p10 == null) {
                                                                                                    Map<String, String> customSecretFields = p10.getCustomSecretFields();
                                                                                                    if (customSecretFields != null) {
                                                                                                        com.google.gson.h d11 = com.google.gson.m.d(aVar19.L().v(customSecretFields));
                                                                                                        Intrinsics.checkNotNullExpressionValue(d11, "parseString(...)");
                                                                                                        kVar4 = AbstractC5896h.d(d11);
                                                                                                    } else {
                                                                                                        kVar4 = null;
                                                                                                    }
                                                                                                    kVar3 = kVar4;
                                                                                                } else {
                                                                                                    kVar3 = null;
                                                                                                }
                                                                                                boolean o02 = Td.e.o0();
                                                                                                wVar.f6606n = aVar19;
                                                                                                wVar.f6607o = str37;
                                                                                                wVar.f6608p = aVar4;
                                                                                                wVar.f6609q = message9;
                                                                                                wVar.f6610r = aVar20;
                                                                                                wVar.f6611s = aVar21;
                                                                                                wVar.f6612t = str39;
                                                                                                wVar.f6613u = salesIQChat3;
                                                                                                wVar.f6614v = null;
                                                                                                wVar.f6615w = null;
                                                                                                wVar.f6616x = null;
                                                                                                wVar.f6617y = null;
                                                                                                wVar.f6618z = null;
                                                                                                wVar.f6598A = null;
                                                                                                wVar.f6599B = null;
                                                                                                wVar.f6600C = null;
                                                                                                wVar.f6601D = z19;
                                                                                                wVar.f6605H = 8;
                                                                                                String str70 = str37;
                                                                                                boolean z26 = z19;
                                                                                                aVar25 = null;
                                                                                                w wVar6 = wVar;
                                                                                                String str71 = valueOf;
                                                                                                obj5 = obj11;
                                                                                                Pe.a aVar52 = aVar4;
                                                                                                obj8 = aVar24.j(str39, str66, str36, str54, str70, str71, str40, aVar52, z25, z26, z20, str49, str50, n10, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o10, w10, bool2, c13, kVar5, kVar3, o02, wVar6);
                                                                                                wVar3 = wVar6;
                                                                                                if (obj8 != obj5) {
                                                                                                    return obj5;
                                                                                                }
                                                                                                aVar26 = aVar20;
                                                                                                aVar27 = aVar19;
                                                                                                message11 = message9;
                                                                                                str55 = str70;
                                                                                                aVar28 = aVar52;
                                                                                                z21 = z26;
                                                                                                aVar29 = aVar21;
                                                                                                salesIQResponse = (SalesIQResponse) obj8;
                                                                                                if (salesIQResponse.getIsSuccess()) {
                                                                                                    wVar4 = wVar3;
                                                                                                    str56 = str55;
                                                                                                    salesIQResponse2 = salesIQResponse;
                                                                                                    aVar30 = aVar27;
                                                                                                    aVar39 = aVar29;
                                                                                                    aVar44 = aVar39;
                                                                                                    if (!salesIQResponse2.getIsSuccess()) {
                                                                                                    }
                                                                                                    ConversationResponse conversationResponse = (ConversationResponse) salesIQResponse2.getData();
                                                                                                    c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse == null ? conversationResponse.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                                                                                    Q.n();
                                                                                                    aVar47 = aVar44;
                                                                                                    obj6 = null;
                                                                                                    aVar46 = aVar47;
                                                                                                    aVar46.g(obj6);
                                                                                                    return c11;
                                                                                                }
                                                                                                ConversationResponse conversationResponse2 = (ConversationResponse) salesIQResponse.getData();
                                                                                                if (salesIQChat3 != null) {
                                                                                                    try {
                                                                                                        SalesIQChat.b triggerData4 = salesIQChat3.getTriggerData();
                                                                                                        if (triggerData4 != null) {
                                                                                                            a10 = triggerData4.a();
                                                                                                            if (a10 != null) {
                                                                                                                TriggersRepository R11 = aVar27.R();
                                                                                                                SalesIQChat.b triggerData5 = salesIQChat3.getTriggerData();
                                                                                                                Rf.a a13 = triggerData5 != null ? triggerData5.a() : aVar25;
                                                                                                                Intrinsics.checkNotNull(a13);
                                                                                                                Rf.b bVar = (Rf.b) R11.f(a13).b();
                                                                                                                Object a14 = bVar != null ? bVar.a() : aVar25;
                                                                                                                if (a14 != null) {
                                                                                                                    SalesIQChat.b triggerData6 = salesIQChat3.getTriggerData();
                                                                                                                    if (Intrinsics.areEqual(triggerData6 != null ? triggerData6.c() : aVar25, a14)) {
                                                                                                                        SalesIQChat.b triggerData7 = salesIQChat3.getTriggerData();
                                                                                                                        if ((triggerData7 != null ? triggerData7.a() : aVar25) != null) {
                                                                                                                            SalesIQChat.b triggerData8 = salesIQChat3.getTriggerData();
                                                                                                                            if ((triggerData8 != null ? triggerData8.a() : aVar25) != Rf.a.AccessedAnyPageOnApp) {
                                                                                                                                SalesIQChat.b triggerData9 = salesIQChat3.getTriggerData();
                                                                                                                                if ((triggerData9 != null ? triggerData9.a() : aVar25) != Rf.a.LandedOnApp) {
                                                                                                                                    TriggersRepository R12 = aVar27.R();
                                                                                                                                    SalesIQChat.b triggerData10 = salesIQChat3.getTriggerData();
                                                                                                                                    Rf.a a15 = triggerData10 != null ? triggerData10.a() : aVar25;
                                                                                                                                    Intrinsics.checkNotNull(a15);
                                                                                                                                    R12.a(a15);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                                                                                            Result.Companion companion = Result.INSTANCE;
                                                                                                            if (conversationResponse2 != null) {
                                                                                                                StringBuilder sb4 = new StringBuilder();
                                                                                                                message12 = message11;
                                                                                                                sb4.append("The response of open conversation is null screen name: ");
                                                                                                                sb4.append(str39);
                                                                                                                sb4.append(" acknowledgement key: ");
                                                                                                                sb4.append(str55);
                                                                                                                r15 = new AbstractC2916a.s(sb4.toString());
                                                                                                            } else {
                                                                                                                message12 = message11;
                                                                                                                if (conversationResponse2.getId() != null) {
                                                                                                                    r15 = 0;
                                                                                                                    objectRef2.element = r15;
                                                                                                                    wVar3.f6606n = aVar27;
                                                                                                                    wVar3.f6607o = str55;
                                                                                                                    wVar3.f6608p = aVar28;
                                                                                                                    wVar3.f6609q = aVar26;
                                                                                                                    wVar3.f6610r = aVar29;
                                                                                                                    wVar3.f6611s = salesIQResponse;
                                                                                                                    wVar3.f6612t = objectRef2;
                                                                                                                    wVar3.f6613u = null;
                                                                                                                    wVar3.f6605H = 9;
                                                                                                                    wVar5 = wVar3;
                                                                                                                    str57 = str55;
                                                                                                                    aVar33 = aVar27;
                                                                                                                    aVar34 = aVar26;
                                                                                                                    str55 = str57;
                                                                                                                    aVar26 = aVar34;
                                                                                                                    wVar4 = wVar5;
                                                                                                                    if (aVar33.U(conversationResponse2, str57, z21, message12, aVar34, wVar5) == obj5) {
                                                                                                                        return obj5;
                                                                                                                    }
                                                                                                                    aVar32 = aVar28;
                                                                                                                    aVar31 = aVar33;
                                                                                                                    objectRef = objectRef2;
                                                                                                                    salesIQResponse2 = salesIQResponse;
                                                                                                                    aVar29 = aVar29;
                                                                                                                    try {
                                                                                                                        m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                                                                                                                        aVar35 = aVar29;
                                                                                                                    } catch (Throwable th2) {
                                                                                                                        th = th2;
                                                                                                                        Result.Companion companion2 = Result.INSTANCE;
                                                                                                                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                                                                                                        aVar35 = aVar29;
                                                                                                                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                                                                                        aVar36 = aVar35;
                                                                                                                        if (m150exceptionOrNullimpl != null) {
                                                                                                                        }
                                                                                                                        abstractC2916a = (AbstractC2916a) objectRef.element;
                                                                                                                        aVar40 = aVar36;
                                                                                                                        if (abstractC2916a != null) {
                                                                                                                        }
                                                                                                                        a aVar53 = aVar31;
                                                                                                                        aVar28 = aVar32;
                                                                                                                        str56 = str55;
                                                                                                                        aVar30 = aVar53;
                                                                                                                        aVar39 = aVar40;
                                                                                                                        aVar44 = aVar39;
                                                                                                                        if (!salesIQResponse2.getIsSuccess()) {
                                                                                                                        }
                                                                                                                        ConversationResponse conversationResponse3 = (ConversationResponse) salesIQResponse2.getData();
                                                                                                                        c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse3 == null ? conversationResponse3.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                                                                                                        Q.n();
                                                                                                                        aVar47 = aVar44;
                                                                                                                        obj6 = null;
                                                                                                                        aVar46 = aVar47;
                                                                                                                        aVar46.g(obj6);
                                                                                                                        return c11;
                                                                                                                    }
                                                                                                                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                                                                                    aVar36 = aVar35;
                                                                                                                    if (m150exceptionOrNullimpl != null) {
                                                                                                                        LiveChatUtil.log(m150exceptionOrNullimpl);
                                                                                                                        AbstractC2916a.r rVar = new AbstractC2916a.r(m150exceptionOrNullimpl.getMessage(), ExceptionsKt.stackTraceToString(m150exceptionOrNullimpl));
                                                                                                                        wVar4.f6606n = aVar31;
                                                                                                                        wVar4.f6607o = str55;
                                                                                                                        wVar4.f6608p = aVar32;
                                                                                                                        wVar4.f6609q = aVar26;
                                                                                                                        wVar4.f6610r = aVar35;
                                                                                                                        wVar4.f6611s = salesIQResponse2;
                                                                                                                        wVar4.f6612t = objectRef;
                                                                                                                        wVar4.f6613u = m147constructorimpl;
                                                                                                                        wVar4.f6605H = 10;
                                                                                                                        aVar36 = aVar35;
                                                                                                                        if (aVar31.T(rVar, wVar4) == obj5) {
                                                                                                                            return obj5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    abstractC2916a = (AbstractC2916a) objectRef.element;
                                                                                                                    aVar40 = aVar36;
                                                                                                                    if (abstractC2916a != null) {
                                                                                                                        wVar4.f6606n = aVar31;
                                                                                                                        wVar4.f6607o = str55;
                                                                                                                        wVar4.f6608p = aVar32;
                                                                                                                        wVar4.f6609q = aVar26;
                                                                                                                        wVar4.f6610r = aVar36;
                                                                                                                        wVar4.f6611s = salesIQResponse2;
                                                                                                                        wVar4.f6612t = null;
                                                                                                                        wVar4.f6613u = null;
                                                                                                                        wVar4.f6605H = 11;
                                                                                                                        if (aVar31.T(abstractC2916a, wVar4) == obj5) {
                                                                                                                            return obj5;
                                                                                                                        }
                                                                                                                        salesIQResponse3 = salesIQResponse2;
                                                                                                                        aVar37 = aVar32;
                                                                                                                        str58 = str55;
                                                                                                                        aVar38 = aVar31;
                                                                                                                        aVar41 = aVar36;
                                                                                                                        Unit unit2 = Unit.INSTANCE;
                                                                                                                        aVar31 = aVar38;
                                                                                                                        str55 = str58;
                                                                                                                        aVar32 = aVar37;
                                                                                                                        salesIQResponse2 = salesIQResponse3;
                                                                                                                        aVar40 = aVar41;
                                                                                                                    }
                                                                                                                    a aVar532 = aVar31;
                                                                                                                    aVar28 = aVar32;
                                                                                                                    str56 = str55;
                                                                                                                    aVar30 = aVar532;
                                                                                                                    aVar39 = aVar40;
                                                                                                                    aVar44 = aVar39;
                                                                                                                    if (!salesIQResponse2.getIsSuccess()) {
                                                                                                                        SalesIQResponse.Error error2 = salesIQResponse2.getError();
                                                                                                                        if (error2 == null) {
                                                                                                                            error2 = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                                                                                                                        }
                                                                                                                        error = error2;
                                                                                                                        aVar42 = aVar39;
                                                                                                                        aVar42 = aVar39;
                                                                                                                        if (aVar28 == Pe.a.Audio && aVar26 != null) {
                                                                                                                            String d12 = error.d();
                                                                                                                            if (d12 == null) {
                                                                                                                                d12 = "";
                                                                                                                            }
                                                                                                                            String d13 = error.d();
                                                                                                                            if (d13 == null) {
                                                                                                                                d13 = "";
                                                                                                                            }
                                                                                                                            wVar4.f6606n = aVar30;
                                                                                                                            wVar4.f6607o = str56;
                                                                                                                            wVar4.f6608p = aVar39;
                                                                                                                            wVar4.f6609q = salesIQResponse2;
                                                                                                                            wVar4.f6610r = error;
                                                                                                                            wVar4.f6611s = null;
                                                                                                                            wVar4.f6612t = null;
                                                                                                                            wVar4.f6613u = null;
                                                                                                                            wVar4.f6605H = 12;
                                                                                                                            aVar43 = aVar39;
                                                                                                                            if (aVar26.c(d12, d13, wVar4) == obj5) {
                                                                                                                                return obj5;
                                                                                                                            }
                                                                                                                            Unit unit3 = Unit.INSTANCE;
                                                                                                                            aVar42 = aVar43;
                                                                                                                        }
                                                                                                                        b10 = error.b();
                                                                                                                        fVar2 = Message.f.Failure;
                                                                                                                        int a16 = C6244j.f64124d.a();
                                                                                                                        if (b10 != null) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        int a17 = C6249o.f64129d.a();
                                                                                                                        if (b10 != null) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        int a18 = C6251q.f64131d.a();
                                                                                                                        if (b10 != null) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        M11 = aVar30.M();
                                                                                                                        gVar2 = Message.g.Question;
                                                                                                                        wVar4.f6606n = aVar42;
                                                                                                                        wVar4.f6607o = salesIQResponse2;
                                                                                                                        wVar4.f6608p = null;
                                                                                                                        wVar4.f6609q = null;
                                                                                                                        wVar4.f6610r = null;
                                                                                                                        wVar4.f6611s = null;
                                                                                                                        wVar4.f6612t = null;
                                                                                                                        wVar4.f6613u = null;
                                                                                                                        wVar4.f6605H = 13;
                                                                                                                        if (M11.e0(str56, gVar2, fVar2, wVar4) != obj5) {
                                                                                                                            return obj5;
                                                                                                                        }
                                                                                                                        salesIQResponse4 = salesIQResponse2;
                                                                                                                        aVar45 = aVar42;
                                                                                                                        salesIQResponse2 = salesIQResponse4;
                                                                                                                        aVar44 = aVar45;
                                                                                                                    }
                                                                                                                    ConversationResponse conversationResponse32 = (ConversationResponse) salesIQResponse2.getData();
                                                                                                                    c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse32 == null ? conversationResponse32.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                                                                                                    Q.n();
                                                                                                                    aVar47 = aVar44;
                                                                                                                    obj6 = null;
                                                                                                                    aVar46 = aVar47;
                                                                                                                    aVar46.g(obj6);
                                                                                                                    return c11;
                                                                                                                }
                                                                                                                r15 = new AbstractC2916a.q("The chat Id from response of open conversation is null screen name: " + str39 + " acknowledgement key: " + str55);
                                                                                                            }
                                                                                                            objectRef2.element = r15;
                                                                                                            wVar3.f6606n = aVar27;
                                                                                                            wVar3.f6607o = str55;
                                                                                                            wVar3.f6608p = aVar28;
                                                                                                            wVar3.f6609q = aVar26;
                                                                                                            wVar3.f6610r = aVar29;
                                                                                                            wVar3.f6611s = salesIQResponse;
                                                                                                            wVar3.f6612t = objectRef2;
                                                                                                            wVar3.f6613u = null;
                                                                                                            wVar3.f6605H = 9;
                                                                                                            wVar5 = wVar3;
                                                                                                            str57 = str55;
                                                                                                            aVar33 = aVar27;
                                                                                                            aVar34 = aVar26;
                                                                                                            str55 = str57;
                                                                                                            aVar26 = aVar34;
                                                                                                            wVar4 = wVar5;
                                                                                                            if (aVar33.U(conversationResponse2, str57, z21, message12, aVar34, wVar5) == obj5) {
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th3) {
                                                                                                        th = th3;
                                                                                                        aVar3 = aVar25;
                                                                                                        r42 = aVar29;
                                                                                                        r42.g(aVar3);
                                                                                                        throw th;
                                                                                                    }
                                                                                                }
                                                                                                a10 = aVar25;
                                                                                                if (a10 != null) {
                                                                                                }
                                                                                                Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                                                                                                Result.Companion companion3 = Result.INSTANCE;
                                                                                                if (conversationResponse2 != null) {
                                                                                                }
                                                                                                objectRef22.element = r15;
                                                                                                wVar3.f6606n = aVar27;
                                                                                                wVar3.f6607o = str55;
                                                                                                wVar3.f6608p = aVar28;
                                                                                                wVar3.f6609q = aVar26;
                                                                                                wVar3.f6610r = aVar29;
                                                                                                wVar3.f6611s = salesIQResponse;
                                                                                                wVar3.f6612t = objectRef22;
                                                                                                wVar3.f6613u = null;
                                                                                                wVar3.f6605H = 9;
                                                                                                wVar5 = wVar3;
                                                                                                str57 = str55;
                                                                                                aVar33 = aVar27;
                                                                                                aVar34 = aVar26;
                                                                                                str55 = str57;
                                                                                                aVar26 = aVar34;
                                                                                                wVar4 = wVar5;
                                                                                                if (aVar33.U(conversationResponse2, str57, z21, message12, aVar34, wVar5) == obj5) {
                                                                                                }
                                                                                            }
                                                                                            aVar24 = K10;
                                                                                            str54 = str7;
                                                                                            kVar2 = null;
                                                                                            com.google.gson.k kVar52 = kVar2;
                                                                                            if (salesIQChat3 != null) {
                                                                                            }
                                                                                            p10 = aVar19.F().p();
                                                                                            if (p10 == null) {
                                                                                            }
                                                                                            boolean o022 = Td.e.o0();
                                                                                            wVar.f6606n = aVar19;
                                                                                            wVar.f6607o = str37;
                                                                                            wVar.f6608p = aVar4;
                                                                                            wVar.f6609q = message9;
                                                                                            wVar.f6610r = aVar20;
                                                                                            wVar.f6611s = aVar21;
                                                                                            wVar.f6612t = str39;
                                                                                            wVar.f6613u = salesIQChat3;
                                                                                            wVar.f6614v = null;
                                                                                            wVar.f6615w = null;
                                                                                            wVar.f6616x = null;
                                                                                            wVar.f6617y = null;
                                                                                            wVar.f6618z = null;
                                                                                            wVar.f6598A = null;
                                                                                            wVar.f6599B = null;
                                                                                            wVar.f6600C = null;
                                                                                            wVar.f6601D = z19;
                                                                                            wVar.f6605H = 8;
                                                                                            String str702 = str37;
                                                                                            boolean z262 = z19;
                                                                                            aVar25 = null;
                                                                                            w wVar62 = wVar;
                                                                                            String str712 = valueOf;
                                                                                            obj5 = obj11;
                                                                                            Pe.a aVar522 = aVar4;
                                                                                            obj8 = aVar24.j(str39, str66, str36, str54, str702, str712, str40, aVar522, z25, z262, z20, str49, str50, n10, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o10, w10, bool2, c13, kVar52, kVar3, o022, wVar62);
                                                                                            wVar3 = wVar62;
                                                                                            if (obj8 != obj5) {
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        str49 = J10;
                                                                                    }
                                                                                    str50 = f10;
                                                                                    obj4 = obj10;
                                                                                    str51 = R10;
                                                                                    str52 = str35;
                                                                                    str53 = Y10;
                                                                                    hVar = null;
                                                                                    Long o102 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                                                                    Object obj112 = obj4;
                                                                                    Boolean bool22 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                                                                    if (salesIQChat3 != null) {
                                                                                    }
                                                                                    if (salesIQChat3 != null) {
                                                                                        aVar24 = K10;
                                                                                        str54 = str7;
                                                                                        kVar2 = d10;
                                                                                        com.google.gson.k kVar522 = kVar2;
                                                                                        if (salesIQChat3 != null) {
                                                                                        }
                                                                                        p10 = aVar19.F().p();
                                                                                        if (p10 == null) {
                                                                                        }
                                                                                        boolean o0222 = Td.e.o0();
                                                                                        wVar.f6606n = aVar19;
                                                                                        wVar.f6607o = str37;
                                                                                        wVar.f6608p = aVar4;
                                                                                        wVar.f6609q = message9;
                                                                                        wVar.f6610r = aVar20;
                                                                                        wVar.f6611s = aVar21;
                                                                                        wVar.f6612t = str39;
                                                                                        wVar.f6613u = salesIQChat3;
                                                                                        wVar.f6614v = null;
                                                                                        wVar.f6615w = null;
                                                                                        wVar.f6616x = null;
                                                                                        wVar.f6617y = null;
                                                                                        wVar.f6618z = null;
                                                                                        wVar.f6598A = null;
                                                                                        wVar.f6599B = null;
                                                                                        wVar.f6600C = null;
                                                                                        wVar.f6601D = z19;
                                                                                        wVar.f6605H = 8;
                                                                                        String str7022 = str37;
                                                                                        boolean z2622 = z19;
                                                                                        aVar25 = null;
                                                                                        w wVar622 = wVar;
                                                                                        String str7122 = valueOf;
                                                                                        obj5 = obj112;
                                                                                        Pe.a aVar5222 = aVar4;
                                                                                        obj8 = aVar24.j(str39, str66, str36, str54, str7022, str7122, str40, aVar5222, z25, z2622, z20, str49, str50, n10, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o102, w10, bool22, c13, kVar522, kVar3, o0222, wVar622);
                                                                                        wVar3 = wVar622;
                                                                                        if (obj8 != obj5) {
                                                                                        }
                                                                                    }
                                                                                    aVar24 = K10;
                                                                                    str54 = str7;
                                                                                    kVar2 = null;
                                                                                    com.google.gson.k kVar5222 = kVar2;
                                                                                    if (salesIQChat3 != null) {
                                                                                    }
                                                                                    p10 = aVar19.F().p();
                                                                                    if (p10 == null) {
                                                                                    }
                                                                                    boolean o02222 = Td.e.o0();
                                                                                    wVar.f6606n = aVar19;
                                                                                    wVar.f6607o = str37;
                                                                                    wVar.f6608p = aVar4;
                                                                                    wVar.f6609q = message9;
                                                                                    wVar.f6610r = aVar20;
                                                                                    wVar.f6611s = aVar21;
                                                                                    wVar.f6612t = str39;
                                                                                    wVar.f6613u = salesIQChat3;
                                                                                    wVar.f6614v = null;
                                                                                    wVar.f6615w = null;
                                                                                    wVar.f6616x = null;
                                                                                    wVar.f6617y = null;
                                                                                    wVar.f6618z = null;
                                                                                    wVar.f6598A = null;
                                                                                    wVar.f6599B = null;
                                                                                    wVar.f6600C = null;
                                                                                    wVar.f6601D = z19;
                                                                                    wVar.f6605H = 8;
                                                                                    String str70222 = str37;
                                                                                    boolean z26222 = z19;
                                                                                    aVar25 = null;
                                                                                    w wVar6222 = wVar;
                                                                                    String str71222 = valueOf;
                                                                                    obj5 = obj112;
                                                                                    Pe.a aVar52222 = aVar4;
                                                                                    obj8 = aVar24.j(str39, str66, str36, str54, str70222, str71222, str40, aVar52222, z25, z26222, z20, str49, str50, n10, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o102, w10, bool22, c13, kVar5222, kVar3, o02222, wVar6222);
                                                                                    wVar3 = wVar6222;
                                                                                    if (obj8 != obj5) {
                                                                                    }
                                                                                }
                                                                                aVar23 = null;
                                                                                if (aVar23 != null) {
                                                                                }
                                                                                str35 = aVar19.F().n();
                                                                                if (((aVar4 == aVar22 || !z19) ? null : aVar19) != null) {
                                                                                }
                                                                                String X102 = aVar19.G().X();
                                                                                Y10 = aVar19.G().Y();
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                if (c10 != null) {
                                                                                    Y10 = null;
                                                                                }
                                                                                y10 = aVar19.F().y();
                                                                                if (y10.isEmpty()) {
                                                                                }
                                                                                od.y w102 = aVar19.F().w();
                                                                                if (message10 != null) {
                                                                                }
                                                                                str50 = f10;
                                                                                obj4 = obj10;
                                                                                str51 = R10;
                                                                                str52 = str35;
                                                                                str53 = Y10;
                                                                                hVar = null;
                                                                                Long o1022 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                                                                Object obj1122 = obj4;
                                                                                Boolean bool222 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                aVar24 = K10;
                                                                                str54 = str7;
                                                                                kVar2 = null;
                                                                                com.google.gson.k kVar52222 = kVar2;
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                p10 = aVar19.F().p();
                                                                                if (p10 == null) {
                                                                                }
                                                                                boolean o022222 = Td.e.o0();
                                                                                wVar.f6606n = aVar19;
                                                                                wVar.f6607o = str37;
                                                                                wVar.f6608p = aVar4;
                                                                                wVar.f6609q = message9;
                                                                                wVar.f6610r = aVar20;
                                                                                wVar.f6611s = aVar21;
                                                                                wVar.f6612t = str39;
                                                                                wVar.f6613u = salesIQChat3;
                                                                                wVar.f6614v = null;
                                                                                wVar.f6615w = null;
                                                                                wVar.f6616x = null;
                                                                                wVar.f6617y = null;
                                                                                wVar.f6618z = null;
                                                                                wVar.f6598A = null;
                                                                                wVar.f6599B = null;
                                                                                wVar.f6600C = null;
                                                                                wVar.f6601D = z19;
                                                                                wVar.f6605H = 8;
                                                                                String str702222 = str37;
                                                                                boolean z262222 = z19;
                                                                                aVar25 = null;
                                                                                w wVar62222 = wVar;
                                                                                String str712222 = valueOf;
                                                                                obj5 = obj1122;
                                                                                Pe.a aVar522222 = aVar4;
                                                                                obj8 = aVar24.j(str39, str66, str36, str54, str702222, str712222, str40, aVar522222, z25, z262222, z20, str49, str50, n10, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o1022, w102, bool222, c13, kVar52222, kVar3, o022222, wVar62222);
                                                                                wVar3 = wVar62222;
                                                                                if (obj8 != obj5) {
                                                                                }
                                                                            }
                                                                            valueOf = String.valueOf(rd.b.f());
                                                                            message10 = message8;
                                                                            String str662 = str38;
                                                                            String str672 = str42;
                                                                            Boolean bool3 = (Boolean) aVar19.G().l(Ce.a.a(De.a.IsLoggerEnabled), true).b();
                                                                            if (bool3 != null) {
                                                                            }
                                                                            String J102 = aVar19.G().J();
                                                                            String f102 = aVar19.G().f();
                                                                            String n102 = aVar19.G().n();
                                                                            String T102 = aVar19.G().T();
                                                                            String R102 = aVar19.G().R();
                                                                            String U102 = aVar19.G().U();
                                                                            boolean z252 = booleanValue;
                                                                            aVar22 = Pe.a.Chat;
                                                                            if (aVar4 == aVar22) {
                                                                                aVar23 = aVar19;
                                                                                if (aVar23 != null) {
                                                                                }
                                                                                str35 = aVar19.F().n();
                                                                                if (((aVar4 == aVar22 || !z19) ? null : aVar19) != null) {
                                                                                }
                                                                                String X1022 = aVar19.G().X();
                                                                                Y10 = aVar19.G().Y();
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                if (c10 != null) {
                                                                                }
                                                                                y10 = aVar19.F().y();
                                                                                if (y10.isEmpty()) {
                                                                                }
                                                                                od.y w1022 = aVar19.F().w();
                                                                                if (message10 != null) {
                                                                                }
                                                                                str50 = f102;
                                                                                obj4 = obj10;
                                                                                str51 = R102;
                                                                                str52 = str35;
                                                                                str53 = Y10;
                                                                                hVar = null;
                                                                                Long o10222 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                                                                Object obj11222 = obj4;
                                                                                Boolean bool2222 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                aVar24 = K10;
                                                                                str54 = str7;
                                                                                kVar2 = null;
                                                                                com.google.gson.k kVar522222 = kVar2;
                                                                                if (salesIQChat3 != null) {
                                                                                }
                                                                                p10 = aVar19.F().p();
                                                                                if (p10 == null) {
                                                                                }
                                                                                boolean o0222222 = Td.e.o0();
                                                                                wVar.f6606n = aVar19;
                                                                                wVar.f6607o = str37;
                                                                                wVar.f6608p = aVar4;
                                                                                wVar.f6609q = message9;
                                                                                wVar.f6610r = aVar20;
                                                                                wVar.f6611s = aVar21;
                                                                                wVar.f6612t = str39;
                                                                                wVar.f6613u = salesIQChat3;
                                                                                wVar.f6614v = null;
                                                                                wVar.f6615w = null;
                                                                                wVar.f6616x = null;
                                                                                wVar.f6617y = null;
                                                                                wVar.f6618z = null;
                                                                                wVar.f6598A = null;
                                                                                wVar.f6599B = null;
                                                                                wVar.f6600C = null;
                                                                                wVar.f6601D = z19;
                                                                                wVar.f6605H = 8;
                                                                                String str7022222 = str37;
                                                                                boolean z2622222 = z19;
                                                                                aVar25 = null;
                                                                                w wVar622222 = wVar;
                                                                                String str7122222 = valueOf;
                                                                                obj5 = obj11222;
                                                                                Pe.a aVar5222222 = aVar4;
                                                                                obj8 = aVar24.j(str39, str662, str36, str54, str7022222, str7122222, str40, aVar5222222, z252, z2622222, z20, str49, str50, n102, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o10222, w1022, bool2222, c13, kVar522222, kVar3, o0222222, wVar622222);
                                                                                wVar3 = wVar622222;
                                                                                if (obj8 != obj5) {
                                                                                }
                                                                            }
                                                                            aVar23 = null;
                                                                            if (aVar23 != null) {
                                                                            }
                                                                            str35 = aVar19.F().n();
                                                                            if (((aVar4 == aVar22 || !z19) ? null : aVar19) != null) {
                                                                            }
                                                                            String X10222 = aVar19.G().X();
                                                                            Y10 = aVar19.G().Y();
                                                                            if (salesIQChat3 != null) {
                                                                            }
                                                                            if (c10 != null) {
                                                                            }
                                                                            y10 = aVar19.F().y();
                                                                            if (y10.isEmpty()) {
                                                                            }
                                                                            od.y w10222 = aVar19.F().w();
                                                                            if (message10 != null) {
                                                                            }
                                                                            str50 = f102;
                                                                            obj4 = obj10;
                                                                            str51 = R102;
                                                                            str52 = str35;
                                                                            str53 = Y10;
                                                                            hVar = null;
                                                                            Long o102222 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                                                            Object obj112222 = obj4;
                                                                            Boolean bool22222 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                                                            if (salesIQChat3 != null) {
                                                                            }
                                                                            if (salesIQChat3 != null) {
                                                                            }
                                                                            aVar24 = K10;
                                                                            str54 = str7;
                                                                            kVar2 = null;
                                                                            com.google.gson.k kVar5222222 = kVar2;
                                                                            if (salesIQChat3 != null) {
                                                                            }
                                                                            p10 = aVar19.F().p();
                                                                            if (p10 == null) {
                                                                            }
                                                                            boolean o02222222 = Td.e.o0();
                                                                            wVar.f6606n = aVar19;
                                                                            wVar.f6607o = str37;
                                                                            wVar.f6608p = aVar4;
                                                                            wVar.f6609q = message9;
                                                                            wVar.f6610r = aVar20;
                                                                            wVar.f6611s = aVar21;
                                                                            wVar.f6612t = str39;
                                                                            wVar.f6613u = salesIQChat3;
                                                                            wVar.f6614v = null;
                                                                            wVar.f6615w = null;
                                                                            wVar.f6616x = null;
                                                                            wVar.f6617y = null;
                                                                            wVar.f6618z = null;
                                                                            wVar.f6598A = null;
                                                                            wVar.f6599B = null;
                                                                            wVar.f6600C = null;
                                                                            wVar.f6601D = z19;
                                                                            wVar.f6605H = 8;
                                                                            String str70222222 = str37;
                                                                            boolean z26222222 = z19;
                                                                            aVar25 = null;
                                                                            w wVar6222222 = wVar;
                                                                            String str71222222 = valueOf;
                                                                            obj5 = obj112222;
                                                                            Pe.a aVar52222222 = aVar4;
                                                                            obj8 = aVar24.j(str39, str662, str36, str54, str70222222, str71222222, str40, aVar52222222, z252, z26222222, z20, str49, str50, n102, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o102222, w10222, bool22222, c13, kVar5222222, kVar3, o02222222, wVar6222222);
                                                                            wVar3 = wVar6222222;
                                                                            if (obj8 != obj5) {
                                                                            }
                                                                        }
                                                                        if (message8 != null) {
                                                                        }
                                                                        valueOf = String.valueOf(rd.b.f());
                                                                        message10 = message8;
                                                                        String str6622 = str38;
                                                                        String str6722 = str42;
                                                                        Boolean bool32 = (Boolean) aVar19.G().l(Ce.a.a(De.a.IsLoggerEnabled), true).b();
                                                                        if (bool32 != null) {
                                                                        }
                                                                        String J1022 = aVar19.G().J();
                                                                        String f1022 = aVar19.G().f();
                                                                        String n1022 = aVar19.G().n();
                                                                        String T1022 = aVar19.G().T();
                                                                        String R1022 = aVar19.G().R();
                                                                        String U1022 = aVar19.G().U();
                                                                        boolean z2522 = booleanValue;
                                                                        aVar22 = Pe.a.Chat;
                                                                        if (aVar4 == aVar22) {
                                                                        }
                                                                        aVar23 = null;
                                                                        if (aVar23 != null) {
                                                                        }
                                                                        str35 = aVar19.F().n();
                                                                        if (((aVar4 == aVar22 || !z19) ? null : aVar19) != null) {
                                                                        }
                                                                        String X102222 = aVar19.G().X();
                                                                        Y10 = aVar19.G().Y();
                                                                        if (salesIQChat3 != null) {
                                                                        }
                                                                        if (c10 != null) {
                                                                        }
                                                                        y10 = aVar19.F().y();
                                                                        if (y10.isEmpty()) {
                                                                        }
                                                                        od.y w102222 = aVar19.F().w();
                                                                        if (message10 != null) {
                                                                        }
                                                                        str50 = f1022;
                                                                        obj4 = obj10;
                                                                        str51 = R1022;
                                                                        str52 = str35;
                                                                        str53 = Y10;
                                                                        hVar = null;
                                                                        Long o1022222 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                                                        Object obj1122222 = obj4;
                                                                        Boolean bool222222 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                                                        if (salesIQChat3 != null) {
                                                                        }
                                                                        if (salesIQChat3 != null) {
                                                                        }
                                                                        aVar24 = K10;
                                                                        str54 = str7;
                                                                        kVar2 = null;
                                                                        com.google.gson.k kVar52222222 = kVar2;
                                                                        if (salesIQChat3 != null) {
                                                                        }
                                                                        p10 = aVar19.F().p();
                                                                        if (p10 == null) {
                                                                        }
                                                                        boolean o022222222 = Td.e.o0();
                                                                        wVar.f6606n = aVar19;
                                                                        wVar.f6607o = str37;
                                                                        wVar.f6608p = aVar4;
                                                                        wVar.f6609q = message9;
                                                                        wVar.f6610r = aVar20;
                                                                        wVar.f6611s = aVar21;
                                                                        wVar.f6612t = str39;
                                                                        wVar.f6613u = salesIQChat3;
                                                                        wVar.f6614v = null;
                                                                        wVar.f6615w = null;
                                                                        wVar.f6616x = null;
                                                                        wVar.f6617y = null;
                                                                        wVar.f6618z = null;
                                                                        wVar.f6598A = null;
                                                                        wVar.f6599B = null;
                                                                        wVar.f6600C = null;
                                                                        wVar.f6601D = z19;
                                                                        wVar.f6605H = 8;
                                                                        String str702222222 = str37;
                                                                        boolean z262222222 = z19;
                                                                        aVar25 = null;
                                                                        w wVar62222222 = wVar;
                                                                        String str712222222 = valueOf;
                                                                        obj5 = obj1122222;
                                                                        Pe.a aVar522222222 = aVar4;
                                                                        obj8 = aVar24.j(str39, str6622, str36, str54, str702222222, str712222222, str40, aVar522222222, z2522, z262222222, z20, str49, str50, n1022, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o1022222, w102222, bool222222, c13, kVar52222222, kVar3, o022222222, wVar62222222);
                                                                        wVar3 = wVar62222222;
                                                                        if (obj8 != obj5) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            Message message15 = message5;
                                                            String str72 = str28;
                                                            wVar2 = wVar;
                                                            obj3 = obj;
                                                            if (Q.q() != null) {
                                                                if ((chatWithAnyId != null ? chatWithAnyId.getVisitorid() : null) != null) {
                                                                    sb2 = "onGoingAddVisitRequestId: " + Q.q() + ' ' + chatWithAnyId.getVisitorid();
                                                                    Q.n();
                                                                    if ((chatWithAnyId == null ? chatWithAnyId.getVisitorid() : null) == null) {
                                                                        AbstractC2916a.u uVar = new AbstractC2916a.u(sb2);
                                                                        wVar2.f6606n = aVar9;
                                                                        wVar2.f6607o = aVar12;
                                                                        wVar2.f6608p = chatWithAnyId;
                                                                        wVar2.f6609q = sb2;
                                                                        wVar2.f6610r = null;
                                                                        wVar2.f6611s = null;
                                                                        wVar2.f6612t = null;
                                                                        wVar2.f6613u = null;
                                                                        wVar2.f6614v = null;
                                                                        wVar2.f6615w = null;
                                                                        wVar2.f6616x = null;
                                                                        wVar2.f6617y = null;
                                                                        wVar2.f6618z = null;
                                                                        wVar2.f6598A = null;
                                                                        wVar2.f6599B = null;
                                                                        wVar2.f6605H = 14;
                                                                        if (aVar5.T(uVar, wVar2) == obj3) {
                                                                            return obj3;
                                                                        }
                                                                        salesIQChat2 = chatWithAnyId;
                                                                        aVar18 = aVar12;
                                                                        aVar16 = aVar9;
                                                                        str33 = sb2;
                                                                        str59 = str33;
                                                                        salesIQChat4 = salesIQChat2;
                                                                        Wh.a aVar54 = aVar18;
                                                                        aVar48 = aVar54;
                                                                        if (aVar16 != null) {
                                                                            wVar2.f6606n = aVar54;
                                                                            wVar2.f6607o = salesIQChat4;
                                                                            wVar2.f6608p = str59;
                                                                            wVar2.f6609q = null;
                                                                            wVar2.f6605H = 17;
                                                                            String str73 = str9;
                                                                            aVar49 = aVar54;
                                                                            if (aVar16.c(str73, str73, wVar2) == obj3) {
                                                                                return obj3;
                                                                            }
                                                                            Unit unit4 = Unit.INSTANCE;
                                                                            aVar48 = aVar49;
                                                                        }
                                                                        if ((salesIQChat4 != null ? salesIQChat4.getVisitorid() : null) == null) {
                                                                            obj6 = null;
                                                                            c11 = C5582a.C0817a.c(C5582a.f56502b, new Throwable(str59), false, 2, null);
                                                                            aVar46 = aVar48;
                                                                            aVar46.g(obj6);
                                                                            return c11;
                                                                        }
                                                                        c11 = C5582a.f56502b.b(new C5582a.b("Conversation already created", Boxing.boxInt(C6242h.f64122d.a()), null, 4, null));
                                                                        aVar47 = aVar48;
                                                                        obj6 = null;
                                                                        aVar46 = aVar47;
                                                                        aVar46.g(obj6);
                                                                        return c11;
                                                                    }
                                                                    C6152a M12 = aVar5.M();
                                                                    Message.g gVar3 = Message.g.Question;
                                                                    Message.f fVar3 = Message.f.Failure;
                                                                    wVar2.f6606n = aVar5;
                                                                    wVar2.f6607o = aVar9;
                                                                    wVar2.f6608p = aVar12;
                                                                    wVar2.f6609q = chatWithAnyId;
                                                                    wVar2.f6610r = sb2;
                                                                    wVar2.f6611s = null;
                                                                    wVar2.f6612t = null;
                                                                    wVar2.f6613u = null;
                                                                    wVar2.f6614v = null;
                                                                    wVar2.f6615w = null;
                                                                    wVar2.f6616x = null;
                                                                    wVar2.f6617y = null;
                                                                    wVar2.f6618z = null;
                                                                    wVar2.f6598A = null;
                                                                    wVar2.f6599B = null;
                                                                    wVar2.f6605H = 15;
                                                                    if (M12.e0(str27, gVar3, fVar3, wVar2) == obj3) {
                                                                        return obj3;
                                                                    }
                                                                    str33 = sb2;
                                                                    salesIQChat = chatWithAnyId;
                                                                    aVar15 = aVar12;
                                                                    aVar16 = aVar9;
                                                                    aVar17 = aVar5;
                                                                    jVar = new AbstractC2916a.j(str33);
                                                                    wVar2.f6606n = aVar16;
                                                                    wVar2.f6607o = aVar15;
                                                                    wVar2.f6608p = salesIQChat;
                                                                    wVar2.f6609q = str33;
                                                                    wVar2.f6610r = null;
                                                                    wVar2.f6605H = 16;
                                                                    if (aVar17.T(jVar, wVar2) != obj3) {
                                                                        return obj3;
                                                                    }
                                                                    aVar18 = aVar15;
                                                                    salesIQChat2 = salesIQChat;
                                                                    str59 = str33;
                                                                    salesIQChat4 = salesIQChat2;
                                                                    Wh.a aVar542 = aVar18;
                                                                    aVar48 = aVar542;
                                                                    if (aVar16 != null) {
                                                                    }
                                                                    if ((salesIQChat4 != null ? salesIQChat4.getVisitorid() : null) == null) {
                                                                    }
                                                                }
                                                            }
                                                            StringBuilder sb5 = new StringBuilder();
                                                            sb5.append("The following variable(s) must not be null for open conversation Id ");
                                                            sb5.append(str27);
                                                            sb5.append(": ");
                                                            sb5.append(aVar5.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str63, "screenName"), new Pair(str24, "visitorWmsId"), new Pair(message15, "question"), new Pair(str72, "appId"), new Pair(message15 != null ? message15.getContent() : null, "questionMessage"), new Pair(message15 != null ? message15.getId() : null, "questionId")})));
                                                            sb2 = sb5.toString();
                                                            Q.n();
                                                            if ((chatWithAnyId == null ? chatWithAnyId.getVisitorid() : null) == null) {
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            obj7 = aVar12;
                                                            aVar3 = null;
                                                            r42 = obj7;
                                                            r42.g(aVar3);
                                                            throw th;
                                                        }
                                                    } else {
                                                        String str74 = str20;
                                                        str24 = V10;
                                                        message5 = message3;
                                                        message6 = message5;
                                                        obj = obj9;
                                                        function04 = function02;
                                                        aVar12 = aVar8;
                                                        str25 = str18;
                                                        str26 = str17;
                                                        str27 = str74;
                                                        str28 = h10;
                                                        boolean z232 = z17;
                                                        boolean z242 = z18;
                                                        chatWithAnyId = LiveChatUtil.getChatWithAnyId(str27);
                                                        StringBuilder sb32 = new StringBuilder();
                                                        String str632 = I10;
                                                        sb32.append("DuplicateChatsTest ");
                                                        sb32.append(Q.q());
                                                        sb32.append(' ');
                                                        sb32.append(chatWithAnyId != null ? chatWithAnyId.getVisitorid() : null);
                                                        LiveChatUtil.log(sb32.toString());
                                                        if (Q.q() == null) {
                                                        }
                                                        Message message152 = message5;
                                                        String str722 = str28;
                                                        wVar2 = wVar;
                                                        obj3 = obj;
                                                        if (Q.q() != null) {
                                                        }
                                                        StringBuilder sb52 = new StringBuilder();
                                                        sb52.append("The following variable(s) must not be null for open conversation Id ");
                                                        sb52.append(str27);
                                                        sb52.append(": ");
                                                        sb52.append(aVar5.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str632, "screenName"), new Pair(str24, "visitorWmsId"), new Pair(message152, "question"), new Pair(str722, "appId"), new Pair(message152 != null ? message152.getContent() : null, "questionMessage"), new Pair(message152 != null ? message152.getId() : null, "questionId")})));
                                                        sb2 = sb52.toString();
                                                        Q.n();
                                                        if ((chatWithAnyId == null ? chatWithAnyId.getVisitorid() : null) == null) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            z14 = z12;
                                            z15 = z13;
                                            message3 = message2;
                                            aVar8 = aVar7;
                                            aVar9 = aVar6;
                                            boolean z222 = z14;
                                            Object obj92 = coroutine_suspended;
                                            I10 = aVar5.G().I();
                                            z17 = z15;
                                            String V102 = aVar5.G().V();
                                            z18 = z222;
                                            String h102 = aVar5.G().h();
                                            if (message3 != null) {
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj7 = aVar7;
                                        aVar3 = null;
                                        r42 = obj7;
                                        r42.g(aVar3);
                                        throw th;
                                    }
                                }
                                return coroutine_suspended;
                            case 1:
                                boolean z27 = wVar.f6602E;
                                boolean z28 = wVar.f6601D;
                                Wh.a aVar55 = (Wh.a) wVar.f6617y;
                                Function0 function05 = (Function0) wVar.f6616x;
                                android.support.v4.media.session.b.a(wVar.f6615w);
                                Message message16 = (Message) wVar.f6614v;
                                String str75 = (String) wVar.f6613u;
                                String str76 = (String) wVar.f6612t;
                                String str77 = (String) wVar.f6611s;
                                Pe.a aVar56 = (Pe.a) wVar.f6610r;
                                String str78 = (String) wVar.f6609q;
                                String str79 = (String) wVar.f6608p;
                                String str80 = (String) wVar.f6607o;
                                a aVar57 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                str20 = str80;
                                str10 = "sender_name";
                                str11 = "message";
                                str12 = "BOT_MESSAGE";
                                str13 = "attender";
                                str14 = "msg_list";
                                str15 = "msglist";
                                str16 = EventKeys.VALUE_KEY;
                                aVar5 = aVar57;
                                z12 = z28;
                                aVar7 = aVar55;
                                function02 = function05;
                                z13 = z27;
                                aVar6 = null;
                                message2 = message16;
                                str19 = str75;
                                str18 = str76;
                                aVar4 = aVar56;
                                str8 = str78;
                                str7 = str79;
                                str9 = "Call failed";
                                str17 = str77;
                                if (qd.c.k()) {
                                }
                                break;
                            case 2:
                                boolean z29 = wVar.f6602E;
                                boolean z30 = wVar.f6601D;
                                Wh.a aVar58 = (Wh.a) wVar.f6617y;
                                Function0 function06 = (Function0) wVar.f6616x;
                                android.support.v4.media.session.b.a(wVar.f6615w);
                                Message message17 = (Message) wVar.f6614v;
                                String str81 = (String) wVar.f6613u;
                                String str82 = (String) wVar.f6612t;
                                String str83 = (String) wVar.f6611s;
                                Pe.a aVar59 = (Pe.a) wVar.f6610r;
                                String str84 = (String) wVar.f6609q;
                                String str85 = (String) wVar.f6608p;
                                String str86 = (String) wVar.f6607o;
                                aVar10 = (a) wVar.f6606n;
                                try {
                                    ResultKt.throwOnFailure(obj8);
                                    message4 = message17;
                                    str10 = "sender_name";
                                    str11 = "message";
                                    str12 = "BOT_MESSAGE";
                                    str13 = "attender";
                                    str14 = "msg_list";
                                    str15 = "msglist";
                                    str16 = EventKeys.VALUE_KEY;
                                    z14 = z30;
                                    aVar8 = aVar58;
                                    function03 = function06;
                                    z16 = z29;
                                    aVar11 = null;
                                    str19 = str81;
                                    str22 = str82;
                                    str23 = str83;
                                    aVar4 = aVar59;
                                    str8 = str84;
                                    str7 = str85;
                                    str9 = "Call failed";
                                    str21 = str86;
                                    if (((Boolean) obj8).booleanValue()) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj7 = aVar58;
                                    aVar3 = null;
                                    r42 = obj7;
                                    r42.g(aVar3);
                                    throw th;
                                }
                                break;
                            case 3:
                                aVar8 = (Wh.a) wVar.f6609q;
                                android.support.v4.media.session.b.a(wVar.f6608p);
                                String str87 = (String) wVar.f6607o;
                                a aVar60 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                str32 = str87;
                                aVar14 = aVar60;
                                aVar11 = null;
                                LiveChatUtil.log("WmsConnection, onConversationStart, Wms connection failed");
                                M10 = aVar14.M();
                                gVar = Message.g.Question;
                                fVar = Message.f.Failure;
                                wVar.f6606n = aVar14;
                                wVar.f6607o = aVar11;
                                wVar.f6608p = aVar8;
                                wVar.f6609q = null;
                                wVar.f6605H = 4;
                                if (M10.e0(str32, gVar, fVar, wVar) == coroutine_suspended) {
                                }
                                if (aVar11 != null) {
                                }
                                C5582a.C0817a c0817a2 = C5582a.f56502b;
                                b.d dVar2 = b.d.f67612j0;
                                C5582a b112 = c0817a2.b(new C5582a.b(dVar2.b(), Boxing.boxInt(dVar2.a()), null, 4, null));
                                aVar8.g(null);
                                return b112;
                            case 4:
                                aVar8 = (Wh.a) wVar.f6608p;
                                android.support.v4.media.session.b.a(wVar.f6607o);
                                aVar14 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                aVar11 = null;
                                if (aVar11 != null) {
                                }
                                C5582a.C0817a c0817a22 = C5582a.f56502b;
                                b.d dVar22 = b.d.f67612j0;
                                C5582a b1122 = c0817a22.b(new C5582a.b(dVar22.b(), Boxing.boxInt(dVar22.a()), null, 4, null));
                                aVar8.g(null);
                                return b1122;
                            case 5:
                                aVar8 = (Wh.a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                Unit unit5 = Unit.INSTANCE;
                                C5582a.C0817a c0817a222 = C5582a.f56502b;
                                b.d dVar222 = b.d.f67612j0;
                                C5582a b11222 = c0817a222.b(new C5582a.b(dVar222.b(), Boxing.boxInt(dVar222.a()), null, 4, null));
                                aVar8.g(null);
                                return b11222;
                            case 6:
                                boolean z31 = wVar.f6602E;
                                boolean z32 = wVar.f6601D;
                                String str88 = (String) wVar.f6599B;
                                String str89 = (String) wVar.f6598A;
                                String str90 = (String) wVar.f6618z;
                                Wh.a aVar61 = (Wh.a) wVar.f6617y;
                                Function0 function07 = (Function0) wVar.f6616x;
                                android.support.v4.media.session.b.a(wVar.f6615w);
                                Message message18 = (Message) wVar.f6614v;
                                String str91 = (String) wVar.f6613u;
                                String str92 = (String) wVar.f6612t;
                                String str93 = (String) wVar.f6611s;
                                Pe.a aVar62 = (Pe.a) wVar.f6610r;
                                String str94 = (String) wVar.f6609q;
                                String str95 = (String) wVar.f6608p;
                                String str96 = (String) wVar.f6607o;
                                a aVar63 = (a) wVar.f6606n;
                                try {
                                    ResultKt.throwOnFailure(obj8);
                                    str10 = "sender_name";
                                    str11 = "message";
                                    str12 = "BOT_MESSAGE";
                                    str13 = "attender";
                                    str14 = "msg_list";
                                    str15 = "msglist";
                                    str16 = EventKeys.VALUE_KEY;
                                    obj2 = coroutine_suspended;
                                    aVar5 = aVar63;
                                    z18 = z32;
                                    str31 = str89;
                                    str29 = str88;
                                    z17 = z31;
                                    aVar13 = null;
                                    I10 = str90;
                                    aVar8 = aVar61;
                                    function02 = function07;
                                    message7 = message18;
                                    str19 = str91;
                                    str18 = str92;
                                    aVar4 = aVar62;
                                    str8 = str94;
                                    str7 = str95;
                                    str30 = str96;
                                    str9 = "Call failed";
                                    str17 = str93;
                                    String str622 = str18;
                                    str26 = str17;
                                    str27 = str30;
                                    function04 = function02;
                                    aVar12 = aVar8;
                                    str25 = str622;
                                    message5 = (Message) obj8;
                                    str24 = str31;
                                    str28 = str29;
                                    aVar9 = aVar13;
                                    obj = obj2;
                                    message6 = message7;
                                    boolean z2322 = z17;
                                    boolean z2422 = z18;
                                    chatWithAnyId = LiveChatUtil.getChatWithAnyId(str27);
                                    StringBuilder sb322 = new StringBuilder();
                                    String str6322 = I10;
                                    sb322.append("DuplicateChatsTest ");
                                    sb322.append(Q.q());
                                    sb322.append(' ');
                                    sb322.append(chatWithAnyId != null ? chatWithAnyId.getVisitorid() : null);
                                    LiveChatUtil.log(sb322.toString());
                                    if (Q.q() == null) {
                                    }
                                    Message message1522 = message5;
                                    String str7222 = str28;
                                    wVar2 = wVar;
                                    obj3 = obj;
                                    if (Q.q() != null) {
                                    }
                                    StringBuilder sb522 = new StringBuilder();
                                    sb522.append("The following variable(s) must not be null for open conversation Id ");
                                    sb522.append(str27);
                                    sb522.append(": ");
                                    sb522.append(aVar5.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str6322, "screenName"), new Pair(str24, "visitorWmsId"), new Pair(message1522, "question"), new Pair(str7222, "appId"), new Pair(message1522 != null ? message1522.getContent() : null, "questionMessage"), new Pair(message1522 != null ? message1522.getId() : null, "questionId")})));
                                    sb2 = sb522.toString();
                                    Q.n();
                                    if ((chatWithAnyId == null ? chatWithAnyId.getVisitorid() : null) == null) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj7 = aVar61;
                                    aVar3 = null;
                                    r42 = obj7;
                                    r42.g(aVar3);
                                    throw th;
                                }
                                break;
                            case 7:
                                boolean z33 = wVar.f6602E;
                                boolean z34 = wVar.f6601D;
                                SalesIQChat salesIQChat5 = (SalesIQChat) wVar.f6600C;
                                Message message19 = (Message) wVar.f6599B;
                                String str97 = (String) wVar.f6598A;
                                String str98 = (String) wVar.f6618z;
                                String str99 = (String) wVar.f6617y;
                                Wh.a aVar64 = (Wh.a) wVar.f6616x;
                                android.support.v4.media.session.b.a(wVar.f6615w);
                                Message message20 = (Message) wVar.f6614v;
                                String str100 = (String) wVar.f6613u;
                                String str101 = (String) wVar.f6612t;
                                String str102 = (String) wVar.f6611s;
                                Pe.a aVar65 = (Pe.a) wVar.f6610r;
                                String str103 = (String) wVar.f6609q;
                                String str104 = (String) wVar.f6608p;
                                String str105 = (String) wVar.f6607o;
                                aVar19 = (a) wVar.f6606n;
                                try {
                                    ResultKt.throwOnFailure(obj8);
                                    str41 = str100;
                                    str35 = str101;
                                    str34 = str102;
                                    str37 = str105;
                                    str10 = "sender_name";
                                    str12 = "BOT_MESSAGE";
                                    str13 = "attender";
                                    str14 = "msg_list";
                                    str15 = "msglist";
                                    str16 = EventKeys.VALUE_KEY;
                                    z19 = z34;
                                    message8 = message19;
                                    salesIQChat3 = salesIQChat5;
                                    str38 = str97;
                                    z20 = z33;
                                    aVar20 = null;
                                    str36 = str98;
                                    str39 = str99;
                                    message9 = message20;
                                    aVar4 = aVar65;
                                    str40 = str103;
                                    str7 = str104;
                                    str42 = "message";
                                    aVar21 = aVar64;
                                    Object obj102 = coroutine_suspended;
                                    Ie.a K102 = aVar19.K();
                                    if (message8 != null) {
                                        str7 = content;
                                        if (message8 != null) {
                                        }
                                        valueOf = String.valueOf(rd.b.f());
                                        message10 = message8;
                                        String str66222 = str38;
                                        String str67222 = str42;
                                        Boolean bool322 = (Boolean) aVar19.G().l(Ce.a.a(De.a.IsLoggerEnabled), true).b();
                                        if (bool322 != null) {
                                        }
                                        String J10222 = aVar19.G().J();
                                        String f10222 = aVar19.G().f();
                                        String n10222 = aVar19.G().n();
                                        String T10222 = aVar19.G().T();
                                        String R10222 = aVar19.G().R();
                                        String U10222 = aVar19.G().U();
                                        boolean z25222 = booleanValue;
                                        aVar22 = Pe.a.Chat;
                                        if (aVar4 == aVar22) {
                                        }
                                        aVar23 = null;
                                        if (aVar23 != null) {
                                        }
                                        str35 = aVar19.F().n();
                                        if (((aVar4 == aVar22 || !z19) ? null : aVar19) != null) {
                                        }
                                        String X1022222 = aVar19.G().X();
                                        Y10 = aVar19.G().Y();
                                        if (salesIQChat3 != null) {
                                        }
                                        if (c10 != null) {
                                        }
                                        y10 = aVar19.F().y();
                                        if (y10.isEmpty()) {
                                        }
                                        od.y w1022222 = aVar19.F().w();
                                        if (message10 != null) {
                                        }
                                        str50 = f10222;
                                        obj4 = obj102;
                                        str51 = R10222;
                                        str52 = str35;
                                        str53 = Y10;
                                        hVar = null;
                                        Long o10222222 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                        Object obj11222222 = obj4;
                                        Boolean bool2222222 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                        if (salesIQChat3 != null) {
                                        }
                                        if (salesIQChat3 != null) {
                                        }
                                        aVar24 = K102;
                                        str54 = str7;
                                        kVar2 = null;
                                        com.google.gson.k kVar522222222 = kVar2;
                                        if (salesIQChat3 != null) {
                                        }
                                        p10 = aVar19.F().p();
                                        if (p10 == null) {
                                        }
                                        boolean o0222222222 = Td.e.o0();
                                        wVar.f6606n = aVar19;
                                        wVar.f6607o = str37;
                                        wVar.f6608p = aVar4;
                                        wVar.f6609q = message9;
                                        wVar.f6610r = aVar20;
                                        wVar.f6611s = aVar21;
                                        wVar.f6612t = str39;
                                        wVar.f6613u = salesIQChat3;
                                        wVar.f6614v = null;
                                        wVar.f6615w = null;
                                        wVar.f6616x = null;
                                        wVar.f6617y = null;
                                        wVar.f6618z = null;
                                        wVar.f6598A = null;
                                        wVar.f6599B = null;
                                        wVar.f6600C = null;
                                        wVar.f6601D = z19;
                                        wVar.f6605H = 8;
                                        String str7022222222 = str37;
                                        boolean z2622222222 = z19;
                                        aVar25 = null;
                                        w wVar622222222 = wVar;
                                        String str7122222222 = valueOf;
                                        obj5 = obj11222222;
                                        Pe.a aVar5222222222 = aVar4;
                                        obj8 = aVar24.j(str39, str66222, str36, str54, str7022222222, str7122222222, str40, aVar5222222222, z25222, z2622222222, z20, str49, str50, n10222, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o10222222, w1022222, bool2222222, c13, kVar522222222, kVar3, o0222222222, wVar622222222);
                                        wVar3 = wVar622222222;
                                        if (obj8 != obj5) {
                                        }
                                        break;
                                    }
                                    if (message8 != null) {
                                    }
                                    valueOf = String.valueOf(rd.b.f());
                                    message10 = message8;
                                    String str662222 = str38;
                                    String str672222 = str42;
                                    Boolean bool3222 = (Boolean) aVar19.G().l(Ce.a.a(De.a.IsLoggerEnabled), true).b();
                                    if (bool3222 != null) {
                                    }
                                    String J102222 = aVar19.G().J();
                                    String f102222 = aVar19.G().f();
                                    String n102222 = aVar19.G().n();
                                    String T102222 = aVar19.G().T();
                                    String R102222 = aVar19.G().R();
                                    String U102222 = aVar19.G().U();
                                    boolean z252222 = booleanValue;
                                    aVar22 = Pe.a.Chat;
                                    if (aVar4 == aVar22) {
                                    }
                                    aVar23 = null;
                                    if (aVar23 != null) {
                                    }
                                    str35 = aVar19.F().n();
                                    if (((aVar4 == aVar22 || !z19) ? null : aVar19) != null) {
                                    }
                                    String X10222222 = aVar19.G().X();
                                    Y10 = aVar19.G().Y();
                                    if (salesIQChat3 != null) {
                                    }
                                    if (c10 != null) {
                                    }
                                    y10 = aVar19.F().y();
                                    if (y10.isEmpty()) {
                                    }
                                    od.y w10222222 = aVar19.F().w();
                                    if (message10 != null) {
                                    }
                                    str50 = f102222;
                                    obj4 = obj102;
                                    str51 = R102222;
                                    str52 = str35;
                                    str53 = Y10;
                                    hVar = null;
                                    Long o102222222 = aVar4 != aVar22 ? aVar19.F().o() : aVar19.F().k();
                                    Object obj112222222 = obj4;
                                    Boolean bool22222222 = (Boolean) aVar19.G().l("is_campaign_suggestions_subscribed", false).b();
                                    if (salesIQChat3 != null) {
                                    }
                                    if (salesIQChat3 != null) {
                                    }
                                    aVar24 = K102;
                                    str54 = str7;
                                    kVar2 = null;
                                    com.google.gson.k kVar5222222222 = kVar2;
                                    if (salesIQChat3 != null) {
                                    }
                                    p10 = aVar19.F().p();
                                    if (p10 == null) {
                                    }
                                    boolean o02222222222 = Td.e.o0();
                                    wVar.f6606n = aVar19;
                                    wVar.f6607o = str37;
                                    wVar.f6608p = aVar4;
                                    wVar.f6609q = message9;
                                    wVar.f6610r = aVar20;
                                    wVar.f6611s = aVar21;
                                    wVar.f6612t = str39;
                                    wVar.f6613u = salesIQChat3;
                                    wVar.f6614v = null;
                                    wVar.f6615w = null;
                                    wVar.f6616x = null;
                                    wVar.f6617y = null;
                                    wVar.f6618z = null;
                                    wVar.f6598A = null;
                                    wVar.f6599B = null;
                                    wVar.f6600C = null;
                                    wVar.f6601D = z19;
                                    wVar.f6605H = 8;
                                    String str70222222222 = str37;
                                    boolean z26222222222 = z19;
                                    aVar25 = null;
                                    w wVar6222222222 = wVar;
                                    String str71222222222 = valueOf;
                                    obj5 = obj112222222;
                                    Pe.a aVar52222222222 = aVar4;
                                    obj8 = aVar24.j(str39, str662222, str36, str54, str70222222222, str71222222222, str40, aVar52222222222, z252222, z26222222222, z20, str49, str50, n102222, str44, str51, str45, str52, str46, str48, str53, str41, kVar, hVar, o102222222, w10222222, bool22222222, c13, kVar5222222222, kVar3, o02222222222, wVar6222222222);
                                    wVar3 = wVar6222222222;
                                    if (obj8 != obj5) {
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj7 = aVar64;
                                    aVar3 = null;
                                    r42 = obj7;
                                    r42.g(aVar3);
                                    throw th;
                                }
                                break;
                            case 8:
                                z21 = wVar.f6601D;
                                salesIQChat3 = (SalesIQChat) wVar.f6613u;
                                String str106 = (String) wVar.f6612t;
                                Wh.a aVar66 = (Wh.a) wVar.f6611s;
                                android.support.v4.media.session.b.a(wVar.f6610r);
                                Message message21 = (Message) wVar.f6609q;
                                aVar28 = (Pe.a) wVar.f6608p;
                                String str107 = (String) wVar.f6607o;
                                a aVar67 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                str39 = str106;
                                aVar29 = aVar66;
                                message11 = message21;
                                str55 = str107;
                                aVar27 = aVar67;
                                wVar3 = wVar;
                                obj5 = coroutine_suspended;
                                aVar25 = null;
                                aVar26 = null;
                                salesIQResponse = (SalesIQResponse) obj8;
                                if (salesIQResponse.getIsSuccess()) {
                                }
                                break;
                            case 9:
                                objectRef = (Ref.ObjectRef) wVar.f6612t;
                                salesIQResponse2 = (SalesIQResponse) wVar.f6611s;
                                aVar29 = (Wh.a) wVar.f6610r;
                                android.support.v4.media.session.b.a(wVar.f6609q);
                                aVar32 = (Pe.a) wVar.f6608p;
                                str55 = (String) wVar.f6607o;
                                aVar31 = (a) wVar.f6606n;
                                try {
                                    ResultKt.throwOnFailure(obj8);
                                    wVar4 = wVar;
                                    obj5 = coroutine_suspended;
                                    aVar26 = null;
                                    aVar29 = aVar29;
                                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                                    aVar35 = aVar29;
                                } catch (Throwable th9) {
                                    th = th9;
                                    wVar4 = wVar;
                                    obj5 = coroutine_suspended;
                                    aVar26 = null;
                                    Result.Companion companion22 = Result.INSTANCE;
                                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                    aVar35 = aVar29;
                                    m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                    aVar36 = aVar35;
                                    if (m150exceptionOrNullimpl != null) {
                                    }
                                    abstractC2916a = (AbstractC2916a) objectRef.element;
                                    aVar40 = aVar36;
                                    if (abstractC2916a != null) {
                                    }
                                    a aVar5322 = aVar31;
                                    aVar28 = aVar32;
                                    str56 = str55;
                                    aVar30 = aVar5322;
                                    aVar39 = aVar40;
                                    aVar44 = aVar39;
                                    if (!salesIQResponse2.getIsSuccess()) {
                                    }
                                    ConversationResponse conversationResponse322 = (ConversationResponse) salesIQResponse2.getData();
                                    c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse322 == null ? conversationResponse322.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                    Q.n();
                                    aVar47 = aVar44;
                                    obj6 = null;
                                    aVar46 = aVar47;
                                    aVar46.g(obj6);
                                    return c11;
                                }
                                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                aVar36 = aVar35;
                                if (m150exceptionOrNullimpl != null) {
                                }
                                abstractC2916a = (AbstractC2916a) objectRef.element;
                                aVar40 = aVar36;
                                if (abstractC2916a != null) {
                                }
                                a aVar53222 = aVar31;
                                aVar28 = aVar32;
                                str56 = str55;
                                aVar30 = aVar53222;
                                aVar39 = aVar40;
                                aVar44 = aVar39;
                                if (!salesIQResponse2.getIsSuccess()) {
                                }
                                ConversationResponse conversationResponse3222 = (ConversationResponse) salesIQResponse2.getData();
                                c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse3222 == null ? conversationResponse3222.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                Q.n();
                                aVar47 = aVar44;
                                obj6 = null;
                                aVar46 = aVar47;
                                aVar46.g(obj6);
                                return c11;
                            case 10:
                                objectRef = (Ref.ObjectRef) wVar.f6612t;
                                salesIQResponse2 = (SalesIQResponse) wVar.f6611s;
                                Wh.a aVar68 = (Wh.a) wVar.f6610r;
                                android.support.v4.media.session.b.a(wVar.f6609q);
                                aVar32 = (Pe.a) wVar.f6608p;
                                str55 = (String) wVar.f6607o;
                                aVar31 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                wVar4 = wVar;
                                obj5 = coroutine_suspended;
                                aVar26 = null;
                                aVar36 = aVar68;
                                abstractC2916a = (AbstractC2916a) objectRef.element;
                                aVar40 = aVar36;
                                if (abstractC2916a != null) {
                                }
                                a aVar532222 = aVar31;
                                aVar28 = aVar32;
                                str56 = str55;
                                aVar30 = aVar532222;
                                aVar39 = aVar40;
                                aVar44 = aVar39;
                                if (!salesIQResponse2.getIsSuccess()) {
                                }
                                ConversationResponse conversationResponse32222 = (ConversationResponse) salesIQResponse2.getData();
                                c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse32222 == null ? conversationResponse32222.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                Q.n();
                                aVar47 = aVar44;
                                obj6 = null;
                                aVar46 = aVar47;
                                aVar46.g(obj6);
                                return c11;
                            case 11:
                                salesIQResponse3 = (SalesIQResponse) wVar.f6611s;
                                Wh.a aVar69 = (Wh.a) wVar.f6610r;
                                android.support.v4.media.session.b.a(wVar.f6609q);
                                aVar37 = (Pe.a) wVar.f6608p;
                                str58 = (String) wVar.f6607o;
                                aVar38 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                wVar4 = wVar;
                                obj5 = coroutine_suspended;
                                aVar26 = null;
                                aVar41 = aVar69;
                                Unit unit22 = Unit.INSTANCE;
                                aVar31 = aVar38;
                                str55 = str58;
                                aVar32 = aVar37;
                                salesIQResponse2 = salesIQResponse3;
                                aVar40 = aVar41;
                                a aVar5322222 = aVar31;
                                aVar28 = aVar32;
                                str56 = str55;
                                aVar30 = aVar5322222;
                                aVar39 = aVar40;
                                aVar44 = aVar39;
                                if (!salesIQResponse2.getIsSuccess()) {
                                }
                                ConversationResponse conversationResponse322222 = (ConversationResponse) salesIQResponse2.getData();
                                c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse322222 == null ? conversationResponse322222.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                Q.n();
                                aVar47 = aVar44;
                                obj6 = null;
                                aVar46 = aVar47;
                                aVar46.g(obj6);
                                return c11;
                            case 12:
                                error = (SalesIQResponse.Error) wVar.f6610r;
                                salesIQResponse2 = (SalesIQResponse) wVar.f6609q;
                                Wh.a aVar70 = (Wh.a) wVar.f6608p;
                                str56 = (String) wVar.f6607o;
                                aVar30 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                wVar4 = wVar;
                                obj5 = coroutine_suspended;
                                aVar43 = aVar70;
                                Unit unit32 = Unit.INSTANCE;
                                aVar42 = aVar43;
                                b10 = error.b();
                                fVar2 = Message.f.Failure;
                                int a162 = C6244j.f64124d.a();
                                if (b10 != null) {
                                }
                                int a172 = C6249o.f64129d.a();
                                if (b10 != null) {
                                }
                                int a182 = C6251q.f64131d.a();
                                if (b10 != null) {
                                }
                                M11 = aVar30.M();
                                gVar2 = Message.g.Question;
                                wVar4.f6606n = aVar42;
                                wVar4.f6607o = salesIQResponse2;
                                wVar4.f6608p = null;
                                wVar4.f6609q = null;
                                wVar4.f6610r = null;
                                wVar4.f6611s = null;
                                wVar4.f6612t = null;
                                wVar4.f6613u = null;
                                wVar4.f6605H = 13;
                                if (M11.e0(str56, gVar2, fVar2, wVar4) != obj5) {
                                }
                                break;
                            case 13:
                                salesIQResponse4 = (SalesIQResponse) wVar.f6607o;
                                Wh.a aVar71 = (Wh.a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                aVar45 = aVar71;
                                salesIQResponse2 = salesIQResponse4;
                                aVar44 = aVar45;
                                ConversationResponse conversationResponse3222222 = (ConversationResponse) salesIQResponse2.getData();
                                c11 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, conversationResponse3222222 == null ? conversationResponse3222222.getChatId() : null, null, 0, false, null, null, null, 126, null));
                                Q.n();
                                aVar47 = aVar44;
                                obj6 = null;
                                aVar46 = aVar47;
                                aVar46.g(obj6);
                                return c11;
                            case 14:
                                str33 = (String) wVar.f6609q;
                                salesIQChat2 = (SalesIQChat) wVar.f6608p;
                                aVar18 = (Wh.a) wVar.f6607o;
                                android.support.v4.media.session.b.a(wVar.f6606n);
                                ResultKt.throwOnFailure(obj8);
                                str9 = "Call failed";
                                wVar2 = wVar;
                                obj3 = coroutine_suspended;
                                aVar16 = null;
                                str59 = str33;
                                salesIQChat4 = salesIQChat2;
                                Wh.a aVar5422 = aVar18;
                                aVar48 = aVar5422;
                                if (aVar16 != null) {
                                }
                                if ((salesIQChat4 != null ? salesIQChat4.getVisitorid() : null) == null) {
                                }
                                break;
                            case 15:
                                str33 = (String) wVar.f6610r;
                                SalesIQChat salesIQChat6 = (SalesIQChat) wVar.f6609q;
                                Wh.a aVar72 = (Wh.a) wVar.f6608p;
                                android.support.v4.media.session.b.a(wVar.f6607o);
                                aVar17 = (a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                str9 = "Call failed";
                                salesIQChat = salesIQChat6;
                                aVar15 = aVar72;
                                wVar2 = wVar;
                                obj3 = coroutine_suspended;
                                aVar16 = null;
                                jVar = new AbstractC2916a.j(str33);
                                wVar2.f6606n = aVar16;
                                wVar2.f6607o = aVar15;
                                wVar2.f6608p = salesIQChat;
                                wVar2.f6609q = str33;
                                wVar2.f6610r = null;
                                wVar2.f6605H = 16;
                                if (aVar17.T(jVar, wVar2) != obj3) {
                                }
                                break;
                            case 16:
                                str33 = (String) wVar.f6609q;
                                salesIQChat2 = (SalesIQChat) wVar.f6608p;
                                aVar18 = (Wh.a) wVar.f6607o;
                                android.support.v4.media.session.b.a(wVar.f6606n);
                                ResultKt.throwOnFailure(obj8);
                                str9 = "Call failed";
                                wVar2 = wVar;
                                obj3 = coroutine_suspended;
                                aVar16 = null;
                                str59 = str33;
                                salesIQChat4 = salesIQChat2;
                                Wh.a aVar54222 = aVar18;
                                aVar48 = aVar54222;
                                if (aVar16 != null) {
                                }
                                if ((salesIQChat4 != null ? salesIQChat4.getVisitorid() : null) == null) {
                                }
                                break;
                            case 17:
                                str59 = (String) wVar.f6608p;
                                salesIQChat4 = (SalesIQChat) wVar.f6607o;
                                Wh.a aVar73 = (Wh.a) wVar.f6606n;
                                ResultKt.throwOnFailure(obj8);
                                aVar49 = aVar73;
                                Unit unit42 = Unit.INSTANCE;
                                aVar48 = aVar49;
                                if ((salesIQChat4 != null ? salesIQChat4.getVisitorid() : null) == null) {
                                }
                                break;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                switch (wVar.f6605H) {
                }
            } catch (Throwable th10) {
                th = th10;
                obj7 = "BOT_MESSAGE";
            }
        } catch (Throwable th11) {
            th = th11;
        }
        wVar = new w(continuation);
        Object obj82 = wVar.f6603F;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x05bf, code lost:
    
        if (r1.updateChatQueueDetails(r4, r7, r9, r6) == r11) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0598, code lost:
    
        if ((r1 != null ? r1.getOperation() : null) == com.zoho.livechat.android.modules.calls.data.model.MediaResponse.Operation.Queue) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x027a, code lost:
    
        if (r3.b(r4, r6) != r11) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x021f, code lost:
    
        if (qf.C6152a.U(r3, r4, false, r6, 2, null) == r11) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0625, code lost:
    
        if (r1.b0(r4, r7, r8, r6) != r11) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(ConversationResponse conversationResponse, String str, Message message, boolean z10, Continuation continuation) {
        A a10;
        A a11;
        ConversationResponse conversationResponse2;
        String str2;
        boolean z11;
        A a12;
        int i10;
        SalesIQChat chatFromConvID;
        a aVar;
        SalesIQChat salesIQChat;
        ConversationResponse conversationResponse3;
        boolean z12;
        boolean z13;
        ConversationResponse.ChatStatus chatStatus;
        boolean z14;
        String str3;
        Integer state;
        boolean z15;
        String str4;
        SalesIQChat salesIQChat2;
        ConversationResponse conversationResponse4;
        a aVar2;
        String str5;
        boolean z16;
        C6152a M10;
        String id2;
        String chatId;
        String wmsChatId;
        A a13;
        A a14;
        SalesIQChat salesIQChat3;
        String str6;
        ConversationResponse conversationResponse5;
        a aVar3;
        boolean z17;
        ConversationResponse conversationResponse6;
        boolean z18;
        C6152a M11;
        String id3;
        Message.g gVar;
        Message.f fVar;
        String str7;
        boolean z19;
        SalesIQChat salesIQChat4;
        ConversationResponse conversationResponse7;
        int m10;
        String module;
        Channel.CallConfigurations callConfigurations;
        Integer state2;
        String id4;
        ConversationResponse conversationResponse8;
        Message message2;
        a aVar4;
        ConversationResponse conversationResponse9;
        a aVar5;
        SalesIQChat salesIQChat5;
        String chatId2;
        String str8;
        SalesIQChat salesIQChat6;
        SalesIQChat salesIQChat7;
        SalesIQChat salesIQChat8;
        Message message3;
        if (continuation instanceof A) {
            a10 = (A) continuation;
            int i11 = a10.f6516v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a10.f6516v = i11 - Integer.MIN_VALUE;
                a11 = a10;
                Object obj = a11.f6514t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (a11.f6516v) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (conversationResponse.getType() == ConversationResponse.Type.Call) {
                            boolean z20 = true;
                            i10 = -1;
                            str2 = str;
                            chatFromConvID = new SalesIQChat(str2, conversationResponse.getChatId(), conversationResponse.getId(), og.i.r(conversationResponse.getLastModifiedTime()), 1, SalesIQChat.c.Call);
                            ConversationResponse.Department department = conversationResponse.getDepartment();
                            chatFromConvID.setDeptid(department != null ? department.getId() : null);
                            ConversationResponse.Department department2 = conversationResponse.getDepartment();
                            chatFromConvID.setDepartmentName(department2 != null ? department2.getName() : null);
                            chatFromConvID.setMedia((SalesIQChat.Media) AbstractC5895g.b(L(), L().v(conversationResponse.getMediaData()), SalesIQChat.Media.class));
                            String startTime = conversationResponse.getStartTime();
                            chatFromConvID.setChatLastInitiatedTime(startTime != null ? StringsKt.toLongOrNull(startTime) : null);
                            chatFromConvID.setQuestion(conversationResponse.getQuestion());
                            chatFromConvID.setLastmsgtime(og.i.r(conversationResponse.getLastModifiedTime()));
                            SalesIQConversationAttributes salesIQConversationAttributes = (SalesIQConversationAttributes) F().q().get(str2);
                            chatFromConvID.setExtras(salesIQConversationAttributes != null ? new SalesIQChat.Extras(new SalesIQChat.Extras.a(salesIQConversationAttributes.getName(), salesIQConversationAttributes.getAdditionalInfo(), salesIQConversationAttributes.getEncodedDisplayPicture(), salesIQConversationAttributes.getCustomSecretFields())) : null);
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chatFromConvID);
                            if (message != null && G().V() != null) {
                                C6152a M12 = M();
                                Gson L10 = L();
                                String V10 = G().V();
                                Intrinsics.checkNotNull(V10);
                                MessageEntity a15 = AbstractC6687a.a(message, L10, V10);
                                a11.f6508n = this;
                                conversationResponse2 = conversationResponse;
                                a11.f6509o = conversationResponse2;
                                a11.f6510p = str2;
                                a11.f6511q = chatFromConvID;
                                a11.f6513s = z10;
                                a11.f6516v = 1;
                                a12 = a11;
                                z11 = z20;
                                break;
                            } else {
                                conversationResponse2 = conversationResponse;
                                a12 = a11;
                                z11 = z20;
                            }
                        } else {
                            conversationResponse2 = conversationResponse;
                            str2 = str;
                            z11 = true;
                            a12 = a11;
                            i10 = -1;
                            chatFromConvID = LiveChatUtil.getChatFromConvID(str2);
                        }
                        aVar = this;
                        salesIQChat = chatFromConvID;
                        conversationResponse3 = conversationResponse2;
                        z12 = z10;
                        z13 = z11;
                        chatStatus = conversationResponse3.getChatStatus();
                        if (chatStatus != null && (state = chatStatus.getState()) != null && state.intValue() == 3) {
                            Kd.a E10 = aVar.E();
                            ArrayList arrayList = new ArrayList();
                            if (LiveChatUtil.isChatEnabled()) {
                                arrayList.add(Md.a.Chat);
                            }
                            if (Td.e.n0()) {
                                arrayList.add(Md.a.Call);
                            }
                            a12.f6508n = aVar;
                            a12.f6509o = conversationResponse3;
                            a12.f6510p = str2;
                            a12.f6511q = salesIQChat;
                            a12.f6513s = z12;
                            a12.f6516v = 2;
                            break;
                        }
                        String str9 = str2;
                        z14 = z12;
                        str3 = str9;
                        z15 = z13;
                        if (salesIQChat == null && salesIQChat.isTriggeredChat() == z15 && salesIQChat.getChid() != null) {
                            C6152a M13 = aVar.M();
                            String convID = salesIQChat.getConvID();
                            a12.f6508n = aVar;
                            a12.f6509o = conversationResponse3;
                            a12.f6510p = str3;
                            a12.f6511q = salesIQChat;
                            a12.f6513s = z14;
                            a12.f6516v = 3;
                            if (M13.k(convID, a12) != coroutine_suspended) {
                                str5 = str3;
                                z17 = z15;
                                SalesIQChat salesIQChat9 = salesIQChat;
                                conversationResponse6 = conversationResponse3;
                                a aVar6 = aVar;
                                if (conversationResponse6.getChatId() != null) {
                                    AbstractC1459k.d(C6461a.f65810a.e(), null, null, new B(salesIQChat9, aVar6, str5, conversationResponse6, null), 3, null);
                                }
                                salesIQChat2 = salesIQChat9;
                                aVar2 = aVar6;
                                str4 = str5;
                                conversationResponse4 = conversationResponse6;
                                z16 = z17;
                                M10 = aVar2.M();
                                id2 = conversationResponse4.getId();
                                chatId = conversationResponse4.getChatId();
                                wmsChatId = conversationResponse4.getWmsChatId();
                                a12.f6508n = aVar2;
                                a12.f6509o = conversationResponse4;
                                a12.f6510p = str4;
                                a12.f6511q = salesIQChat2;
                                a12.f6513s = z14;
                                a12.f6516v = 4;
                                a aVar7 = aVar2;
                                a13 = a12;
                                a14 = a13;
                                if (M10.Q(null, str4, id2, chatId, wmsChatId, a13) != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        SalesIQChat salesIQChat10 = salesIQChat;
                        str4 = str3;
                        salesIQChat2 = salesIQChat10;
                        conversationResponse4 = conversationResponse3;
                        aVar2 = aVar;
                        z16 = z15;
                        M10 = aVar2.M();
                        id2 = conversationResponse4.getId();
                        chatId = conversationResponse4.getChatId();
                        wmsChatId = conversationResponse4.getWmsChatId();
                        a12.f6508n = aVar2;
                        a12.f6509o = conversationResponse4;
                        a12.f6510p = str4;
                        a12.f6511q = salesIQChat2;
                        a12.f6513s = z14;
                        a12.f6516v = 4;
                        a aVar72 = aVar2;
                        a13 = a12;
                        a14 = a13;
                        if (M10.Q(null, str4, id2, chatId, wmsChatId, a13) != coroutine_suspended) {
                            String str10 = str4;
                            salesIQChat3 = salesIQChat2;
                            str6 = str10;
                            conversationResponse5 = conversationResponse4;
                            aVar3 = aVar72;
                            z18 = z16;
                            M11 = aVar3.M();
                            id3 = conversationResponse5.getId();
                            gVar = Message.g.Question;
                            fVar = Message.f.Sent;
                            a14.f6508n = aVar3;
                            a14.f6509o = conversationResponse5;
                            a14.f6510p = str6;
                            a14.f6511q = salesIQChat3;
                            a14.f6513s = z14;
                            a14.f6516v = 5;
                            if (M11.b0(id3, gVar, fVar, a14) != coroutine_suspended) {
                                str7 = str6;
                                z19 = z18;
                                boolean z21 = z14;
                                salesIQChat4 = salesIQChat3;
                                conversationResponse7 = conversationResponse5;
                                if (salesIQChat4 != null) {
                                    return Unit.INSTANCE;
                                }
                                ContentValues contentValues = new ContentValues();
                                ConversationResponse.Department department3 = conversationResponse7.getDepartment();
                                if (department3 != null && (id4 = department3.getId()) != null) {
                                    contentValues.put("DEPTID", id4);
                                    Unit unit = Unit.INSTANCE;
                                }
                                String referenceId = conversationResponse7.getReferenceId();
                                if (referenceId != null) {
                                    contentValues.put("VISITID", referenceId);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                String startTime2 = conversationResponse7.getStartTime();
                                if (startTime2 != null) {
                                    contentValues.put("LAST_INITIATED_TIME", startTime2);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                String endTime = conversationResponse7.getEndTime();
                                if (endTime != null) {
                                    contentValues.put("END_TIME", endTime);
                                    Unit unit4 = Unit.INSTANCE;
                                }
                                String missedTime = conversationResponse7.getMissedTime();
                                if (missedTime != null) {
                                    contentValues.put("MISSED_TIME", missedTime);
                                    Unit unit5 = Unit.INSTANCE;
                                }
                                Long lastModifiedTime = conversationResponse7.getLastModifiedTime();
                                contentValues.put("LMTIME", Boxing.boxLong(lastModifiedTime != null ? lastModifiedTime.longValue() : rd.b.f()));
                                if (conversationResponse7.getChatId() == null || og.i.s(conversationResponse7.getStartTime()) <= og.i.r((Number) aVar3.J().getLatestConversationTime(conversationResponse7.getChatId()).b())) {
                                    LiveChatUtil.log("NewConversationFallback");
                                } else {
                                    contentValues.put("CHATID", conversationResponse7.getChatId());
                                    contentValues.put("RCHATID", conversationResponse7.getWmsChatId());
                                    contentValues.put("RCHATID", conversationResponse7.getWmsChatId());
                                    contentValues.put("VISITORID", conversationResponse7.getId());
                                    ConversationResponse.ChatStatus chatStatus2 = conversationResponse7.getChatStatus();
                                    if (chatStatus2 == null || (state2 = chatStatus2.getState()) == null || state2.intValue() != 3) {
                                        contentValues.put("STATUS", Boxing.boxInt(z21 ? 5 : z19));
                                    } else {
                                        AbstractC1459k.d(C6461a.f65810a.e(), null, null, aVar3.new C(null), 3, null);
                                        contentValues.put("STATUS", Boxing.boxInt(3));
                                        ConversationResponse.Attender attender = conversationResponse7.getAttender();
                                        if (attender != null) {
                                            String id5 = attender.getId();
                                            if (id5 == null) {
                                                id5 = "";
                                            }
                                            contentValues.put("ATTENDER_ID", id5);
                                            String imageKey = attender.getImageKey();
                                            if (imageKey == null) {
                                                imageKey = "";
                                            }
                                            contentValues.put("ATTENDER_IMGKEY", imageKey);
                                            String name = attender.getName();
                                            if (name == null) {
                                                name = "";
                                            }
                                            contentValues.put("ATTENDER", name);
                                            contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", attender.getCallEnabled());
                                            contentValues.put("ISBOTATTENDER", attender.isBot());
                                            Unit unit6 = Unit.INSTANCE;
                                        }
                                        contentValues.put("ATTENDER_ID", "");
                                        contentValues.put("ATTENDER", "");
                                        contentValues.put("ATTENDER_IMGKEY", "");
                                        contentValues.put("ATTENDER_EMAIL", "");
                                        contentValues.put("UNREAD_COUNT", Boxing.boxInt(0));
                                        contentValues.put("TIMER_START_TIME", Boxing.boxInt(0));
                                        contentValues.put("TIMER_END_TIME", Boxing.boxInt(0));
                                        contentValues.put("QUEUEPOSITION", Boxing.boxInt(i10));
                                        contentValues.put("QUEUE_END_TIME", Boxing.boxInt(i10));
                                        contentValues.put("QUEUE_START_TIME", Boxing.boxInt(i10));
                                        contentValues.put("SHOW_QUEUE", Boxing.boxInt(0));
                                    }
                                }
                                if (conversationResponse7.getType() == ConversationResponse.Type.Call) {
                                    Channel r10 = aVar3.G().r();
                                    m10 = og.i.m((r10 == null || (callConfigurations = r10.getCallConfigurations()) == null) ? null : callConfigurations.getSdkWaitingTime());
                                } else {
                                    m10 = og.i.m(Boxing.boxLong(LiveChatUtil.getChatWaitingTime()));
                                }
                                if (og.i.g(conversationResponse7.getQueueType()) && m10 > 0) {
                                    contentValues.put("WAITING_TIMER_START_TIME", Boxing.boxLong(rd.b.f()));
                                }
                                Gson L11 = aVar3.L();
                                SalesIQChat.Extras extras = salesIQChat4.getExtras();
                                if (extras != null) {
                                    SalesIQChat.Extras.a aVar8 = extras.attributes;
                                    if (aVar8 != null) {
                                        aVar8.secretInfo = null;
                                    }
                                    Unit unit7 = Unit.INSTANCE;
                                } else {
                                    extras = null;
                                }
                                contentValues.put("EXTRAS", L11.v(extras));
                                ContentResolver contentResolver = aVar3.f6499a.getContentResolver();
                                if (contentResolver != null) {
                                    Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CONVID=?", new String[]{str7}));
                                }
                                if (C6218a.k() && Intrinsics.areEqual(C6218a.y(), salesIQChat4.getChid())) {
                                    C6218a.i0(z19, conversationResponse7.getChatId());
                                }
                                if (conversationResponse7.getQueueType() == null || (((module = conversationResponse7.getModule()) == null || StringsKt.equals(module, "chat_queue", z19) != z19) && !StringsKt.equals(conversationResponse7.getQueueType(), "chat", z19) && !StringsKt.equals(conversationResponse7.getQueueType(), "call", z19))) {
                                    MediaResponse mediaData = conversationResponse7.getMediaData();
                                    break;
                                }
                                if (conversationResponse7.getChatId() != null) {
                                    ConversationsLocalDataSource J10 = aVar3.J();
                                    String chatId3 = conversationResponse7.getChatId();
                                    Long currentPosition = conversationResponse7.getCurrentPosition();
                                    Long averageResponseTime = conversationResponse7.getAverageResponseTime();
                                    a14.f6508n = aVar3;
                                    a14.f6509o = conversationResponse7;
                                    a14.f6510p = str7;
                                    a14.f6511q = salesIQChat4;
                                    a14.f6516v = 6;
                                    break;
                                }
                                salesIQChat4.setQueuePosition(og.i.l(conversationResponse7.getCurrentPosition(), i10));
                                conversationResponse8 = conversationResponse7;
                                a aVar9 = aVar3;
                                String str11 = str7;
                                if (salesIQChat4.getStatus() == 2) {
                                    C6152a M14 = aVar9.M();
                                    String id6 = conversationResponse8.getId();
                                    String chatId4 = conversationResponse8.getChatId();
                                    String wmsChatId2 = conversationResponse8.getWmsChatId();
                                    a14.f6508n = aVar9;
                                    a14.f6509o = conversationResponse8;
                                    a14.f6510p = salesIQChat4;
                                    message2 = null;
                                    a14.f6511q = null;
                                    a14.f6516v = 7;
                                    A a16 = a14;
                                    a14 = a16;
                                    if (M14.Q(null, str11, id6, chatId4, wmsChatId2, a16) != coroutine_suspended) {
                                        conversationResponse9 = conversationResponse8;
                                        aVar5 = aVar9;
                                        salesIQChat4.setChid(conversationResponse9.getChatId());
                                        C6152a M15 = aVar5.M();
                                        String id7 = conversationResponse9.getId();
                                        Message.g gVar2 = Message.g.Question;
                                        Message.f fVar2 = Message.f.Sent;
                                        a14.f6508n = aVar5;
                                        a14.f6509o = conversationResponse9;
                                        a14.f6510p = salesIQChat4;
                                        a14.f6516v = 8;
                                        break;
                                    }
                                } else {
                                    message2 = null;
                                    aVar4 = aVar9;
                                    salesIQChat5 = salesIQChat4;
                                    if (LiveChatUtil.isMultipleChatsDisabled() && LiveChatUtil.isTriggerChatAvailable()) {
                                        LiveChatUtil.deleteTriggerChat();
                                    }
                                    if (salesIQChat5.getType() == SalesIQChat.c.Call && salesIQChat5.getQueuePosition() > 0) {
                                        LiveChatUtil.triggerChatListener("QUEUE_POSITION", salesIQChat5);
                                    }
                                    chatId2 = conversationResponse8.getChatId();
                                    str8 = "CHAT_OPEN";
                                    if (chatId2 != null) {
                                        salesIQChat6 = salesIQChat5;
                                        salesIQChat7 = salesIQChat6;
                                        message3 = salesIQChat5.getLastMessage();
                                        salesIQChat5 = salesIQChat6;
                                        salesIQChat5.setLastMessage(message3);
                                        LiveChatUtil.triggerChatListener(str8, salesIQChat7);
                                        return Unit.INSTANCE;
                                    }
                                    C6152a M16 = aVar4.M();
                                    a14.f6508n = aVar4;
                                    a14.f6509o = salesIQChat5;
                                    a14.f6510p = salesIQChat5;
                                    a14.f6511q = salesIQChat5;
                                    a14.f6512r = "CHAT_OPEN";
                                    a14.f6516v = 9;
                                    obj = M16.q(chatId2, a14);
                                    if (obj != coroutine_suspended) {
                                        salesIQChat8 = salesIQChat5;
                                        salesIQChat7 = salesIQChat8;
                                        MessageEntity messageEntity = (MessageEntity) ((C5582a) obj).b();
                                        message3 = messageEntity == null ? MessageRoomToDomainKt.g(messageEntity, aVar4.f6499a, aVar4.L(), false, false, null, null, 60, null) : message2;
                                        if (message3 == null) {
                                            salesIQChat6 = salesIQChat5;
                                            salesIQChat5 = salesIQChat8;
                                            message3 = salesIQChat5.getLastMessage();
                                            salesIQChat5 = salesIQChat6;
                                        }
                                        salesIQChat5.setLastMessage(message3);
                                        LiveChatUtil.triggerChatListener(str8, salesIQChat7);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        boolean z22 = a11.f6513s;
                        salesIQChat = (SalesIQChat) a11.f6511q;
                        String str12 = (String) a11.f6510p;
                        conversationResponse3 = (ConversationResponse) a11.f6509o;
                        aVar = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        z12 = z22;
                        z13 = true;
                        str2 = str12;
                        a12 = a11;
                        i10 = -1;
                        chatStatus = conversationResponse3.getChatStatus();
                        if (chatStatus != null) {
                            Kd.a E102 = aVar.E();
                            ArrayList arrayList2 = new ArrayList();
                            if (LiveChatUtil.isChatEnabled()) {
                            }
                            if (Td.e.n0()) {
                            }
                            a12.f6508n = aVar;
                            a12.f6509o = conversationResponse3;
                            a12.f6510p = str2;
                            a12.f6511q = salesIQChat;
                            a12.f6513s = z12;
                            a12.f6516v = 2;
                            break;
                        }
                        String str92 = str2;
                        z14 = z12;
                        str3 = str92;
                        z15 = z13;
                        if (salesIQChat == null) {
                            break;
                        }
                        SalesIQChat salesIQChat102 = salesIQChat;
                        str4 = str3;
                        salesIQChat2 = salesIQChat102;
                        conversationResponse4 = conversationResponse3;
                        aVar2 = aVar;
                        z16 = z15;
                        M10 = aVar2.M();
                        id2 = conversationResponse4.getId();
                        chatId = conversationResponse4.getChatId();
                        wmsChatId = conversationResponse4.getWmsChatId();
                        a12.f6508n = aVar2;
                        a12.f6509o = conversationResponse4;
                        a12.f6510p = str4;
                        a12.f6511q = salesIQChat2;
                        a12.f6513s = z14;
                        a12.f6516v = 4;
                        a aVar722 = aVar2;
                        a13 = a12;
                        a14 = a13;
                        if (M10.Q(null, str4, id2, chatId, wmsChatId, a13) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        z14 = a11.f6513s;
                        salesIQChat = (SalesIQChat) a11.f6511q;
                        String str13 = (String) a11.f6510p;
                        conversationResponse3 = (ConversationResponse) a11.f6509o;
                        aVar = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        z15 = true;
                        str3 = str13;
                        a12 = a11;
                        i10 = -1;
                        if (salesIQChat == null) {
                        }
                        SalesIQChat salesIQChat1022 = salesIQChat;
                        str4 = str3;
                        salesIQChat2 = salesIQChat1022;
                        conversationResponse4 = conversationResponse3;
                        aVar2 = aVar;
                        z16 = z15;
                        M10 = aVar2.M();
                        id2 = conversationResponse4.getId();
                        chatId = conversationResponse4.getChatId();
                        wmsChatId = conversationResponse4.getWmsChatId();
                        a12.f6508n = aVar2;
                        a12.f6509o = conversationResponse4;
                        a12.f6510p = str4;
                        a12.f6511q = salesIQChat2;
                        a12.f6513s = z14;
                        a12.f6516v = 4;
                        a aVar7222 = aVar2;
                        a13 = a12;
                        a14 = a13;
                        if (M10.Q(null, str4, id2, chatId, wmsChatId, a13) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        z14 = a11.f6513s;
                        salesIQChat = (SalesIQChat) a11.f6511q;
                        String str14 = (String) a11.f6510p;
                        conversationResponse3 = (ConversationResponse) a11.f6509o;
                        aVar = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        z17 = true;
                        str5 = str14;
                        a12 = a11;
                        i10 = -1;
                        SalesIQChat salesIQChat92 = salesIQChat;
                        conversationResponse6 = conversationResponse3;
                        a aVar62 = aVar;
                        if (conversationResponse6.getChatId() != null) {
                        }
                        salesIQChat2 = salesIQChat92;
                        aVar2 = aVar62;
                        str4 = str5;
                        conversationResponse4 = conversationResponse6;
                        z16 = z17;
                        M10 = aVar2.M();
                        id2 = conversationResponse4.getId();
                        chatId = conversationResponse4.getChatId();
                        wmsChatId = conversationResponse4.getWmsChatId();
                        a12.f6508n = aVar2;
                        a12.f6509o = conversationResponse4;
                        a12.f6510p = str4;
                        a12.f6511q = salesIQChat2;
                        a12.f6513s = z14;
                        a12.f6516v = 4;
                        a aVar72222 = aVar2;
                        a13 = a12;
                        a14 = a13;
                        if (M10.Q(null, str4, id2, chatId, wmsChatId, a13) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        z14 = a11.f6513s;
                        salesIQChat3 = (SalesIQChat) a11.f6511q;
                        String str15 = (String) a11.f6510p;
                        conversationResponse5 = (ConversationResponse) a11.f6509o;
                        aVar3 = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        z18 = true;
                        str6 = str15;
                        a14 = a11;
                        i10 = -1;
                        M11 = aVar3.M();
                        id3 = conversationResponse5.getId();
                        gVar = Message.g.Question;
                        fVar = Message.f.Sent;
                        a14.f6508n = aVar3;
                        a14.f6509o = conversationResponse5;
                        a14.f6510p = str6;
                        a14.f6511q = salesIQChat3;
                        a14.f6513s = z14;
                        a14.f6516v = 5;
                        if (M11.b0(id3, gVar, fVar, a14) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        z14 = a11.f6513s;
                        salesIQChat3 = (SalesIQChat) a11.f6511q;
                        String str16 = (String) a11.f6510p;
                        conversationResponse5 = (ConversationResponse) a11.f6509o;
                        aVar3 = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        z19 = 1;
                        str7 = str16;
                        a14 = a11;
                        i10 = -1;
                        boolean z212 = z14;
                        salesIQChat4 = salesIQChat3;
                        conversationResponse7 = conversationResponse5;
                        if (salesIQChat4 != null) {
                        }
                        break;
                    case 6:
                        salesIQChat4 = (SalesIQChat) a11.f6511q;
                        str7 = (String) a11.f6510p;
                        conversationResponse7 = (ConversationResponse) a11.f6509o;
                        a aVar10 = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        aVar3 = aVar10;
                        a14 = a11;
                        i10 = -1;
                        salesIQChat4.setQueuePosition(og.i.l(conversationResponse7.getCurrentPosition(), i10));
                        conversationResponse8 = conversationResponse7;
                        a aVar92 = aVar3;
                        String str112 = str7;
                        if (salesIQChat4.getStatus() == 2) {
                        }
                        break;
                    case 7:
                        salesIQChat4 = (SalesIQChat) a11.f6510p;
                        conversationResponse9 = (ConversationResponse) a11.f6509o;
                        aVar5 = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        message2 = null;
                        a14 = a11;
                        salesIQChat4.setChid(conversationResponse9.getChatId());
                        C6152a M152 = aVar5.M();
                        String id72 = conversationResponse9.getId();
                        Message.g gVar22 = Message.g.Question;
                        Message.f fVar22 = Message.f.Sent;
                        a14.f6508n = aVar5;
                        a14.f6509o = conversationResponse9;
                        a14.f6510p = salesIQChat4;
                        a14.f6516v = 8;
                        break;
                    case 8:
                        salesIQChat4 = (SalesIQChat) a11.f6510p;
                        conversationResponse9 = (ConversationResponse) a11.f6509o;
                        aVar5 = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        message2 = null;
                        a14 = a11;
                        conversationResponse8 = conversationResponse9;
                        aVar4 = aVar5;
                        salesIQChat5 = salesIQChat4;
                        if (LiveChatUtil.isMultipleChatsDisabled()) {
                            LiveChatUtil.deleteTriggerChat();
                            break;
                        }
                        if (salesIQChat5.getType() == SalesIQChat.c.Call) {
                            LiveChatUtil.triggerChatListener("QUEUE_POSITION", salesIQChat5);
                            break;
                        }
                        chatId2 = conversationResponse8.getChatId();
                        str8 = "CHAT_OPEN";
                        if (chatId2 != null) {
                        }
                        break;
                    case 9:
                        str8 = (String) a11.f6512r;
                        salesIQChat5 = (SalesIQChat) a11.f6511q;
                        salesIQChat8 = (SalesIQChat) a11.f6510p;
                        salesIQChat7 = (SalesIQChat) a11.f6509o;
                        aVar4 = (a) a11.f6508n;
                        ResultKt.throwOnFailure(obj);
                        message2 = null;
                        MessageEntity messageEntity2 = (MessageEntity) ((C5582a) obj).b();
                        if (messageEntity2 == null) {
                        }
                        if (message3 == null) {
                        }
                        salesIQChat5.setLastMessage(message3);
                        LiveChatUtil.triggerChatListener(str8, salesIQChat7);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        a10 = new A(continuation);
        a11 = a10;
        Object obj2 = a11.f6514t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (a11.f6516v) {
        }
    }

    @Override // Qe.a
    public C5582a a(String str) {
        Ae.a G10 = G();
        De.a aVar = De.a.OngoingConversationContextAcknowledgementKey;
        if (Intrinsics.areEqual(str, Ae.a.O(G10, Ce.a.a(aVar), null, 2, null).b())) {
            LiveChatUtil.log("Clearing Ongoing Context Data");
            G().m0(Ce.a.a(aVar));
            G().m0(Ce.a.a(De.a.OngoingConversationContextRequestedMessages));
            G().m0(Ce.a.a(De.a.OngoingConversationContextAppStatus));
            G().m0(Ce.a.a(De.a.IsOngoingConversationContextAutoReplyOn));
            G().m0(Ce.a.a(De.a.IsCampaignSuggestionsSubscribed));
        }
        return C5582a.f56502b.d(Unit.INSTANCE);
    }

    @Override // Qe.a
    public C5582a b(De.a preferenceKey, boolean z10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        try {
            Result.Companion companion = Result.INSTANCE;
            Boolean m10 = F().m(Ce.a.a(preferenceKey));
            if (m10 != null) {
                z10 = m10.booleanValue();
            }
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(z10));
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

    @Override // Qe.a
    public Object c(String str, String str2, Continuation continuation) {
        return J().saveDraft(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Qe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, Continuation continuation) {
        r rVar;
        int i10;
        a aVar;
        SalesIQResponse salesIQResponse;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i11 = rVar.f6582r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f6582r = i11 - Integer.MIN_VALUE;
                Object obj = rVar.f6580p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = rVar.f6582r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String R10 = G().R();
                    Ie.a K10 = K();
                    String I10 = G().I();
                    Intrinsics.checkNotNull(I10);
                    com.google.gson.e eVar = new com.google.gson.e();
                    eVar.n(R10);
                    Unit unit = Unit.INSTANCE;
                    rVar.f6578n = this;
                    rVar.f6579o = str;
                    rVar.f6582r = 1;
                    obj = K10.h(I10, str, eVar, rVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) rVar.f6579o;
                    aVar = (a) rVar.f6578n;
                    ResultKt.throwOnFailure(obj);
                }
                salesIQResponse = (SalesIQResponse) obj;
                if (!salesIQResponse.getIsSuccess()) {
                    SalesIQResponse.Error error = salesIQResponse.getError();
                    if (error == null) {
                        error = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                    }
                    Integer b10 = error.b();
                    if (b10 != null) {
                        aVar.J().handleError(str, b10.intValue());
                    }
                }
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
            }
        }
        rVar = new r(continuation);
        Object obj2 = rVar.f6580p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = rVar.f6582r;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        if (!salesIQResponse.getIsSuccess()) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b8 -> B:22:0x00bb). Please report as a decompilation issue!!! */
    @Override // Qe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(List list, Continuation continuation) {
        d dVar;
        int i10;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Iterator it;
        Ref.BooleanRef booleanRef3;
        a aVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f6532t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f6532t = i11 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f6530r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar2.f6532t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                    if (!list.isEmpty()) {
                        I("SELECT CHATID, VISITORID FROM SIQ_CONVERSATIONS WHERE (STATUS = '2' OR STATUS = '4' OR STATUS = '3')", arrayList);
                        CollectionsKt.removeAll((List) arrayList, (Function1) new e(list));
                        it = arrayList.iterator();
                        booleanRef3 = booleanRef4;
                        aVar = this;
                        if (it.hasNext()) {
                        }
                        return C5582a.f56502b.d(Boxing.boxBoolean(booleanRef3.element));
                    }
                    Integer[] numArr = {Boxing.boxInt(1), Boxing.boxInt(6), Boxing.boxInt(5), Boxing.boxInt(7)};
                    dVar2.f6526n = booleanRef4;
                    dVar2.f6527o = booleanRef4;
                    dVar2.f6532t = 2;
                    obj = D(this, null, null, false, numArr, dVar2, 7, null);
                    if (obj != coroutine_suspended) {
                        booleanRef = booleanRef4;
                        booleanRef2 = booleanRef;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    booleanRef3 = (Ref.BooleanRef) dVar2.f6529q;
                    it = (Iterator) dVar2.f6528p;
                    Ref.BooleanRef booleanRef5 = (Ref.BooleanRef) dVar2.f6527o;
                    a aVar2 = (a) dVar2.f6526n;
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar2;
                    booleanRef3.element = ((Number) obj).intValue() <= 0;
                    booleanRef3 = booleanRef5;
                    if (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str = (String) pair.getFirst();
                        String str2 = (String) pair.getSecond();
                        dVar2.f6526n = aVar;
                        dVar2.f6527o = booleanRef3;
                        dVar2.f6528p = it;
                        dVar2.f6529q = booleanRef3;
                        dVar2.f6532t = 1;
                        d dVar3 = dVar2;
                        obj = D(aVar, str, str2, false, null, dVar3, 12, null);
                        if (obj != coroutine_suspended) {
                            booleanRef5 = booleanRef3;
                            dVar2 = dVar3;
                            booleanRef3.element = ((Number) obj).intValue() <= 0;
                            booleanRef3 = booleanRef5;
                            if (it.hasNext()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    return C5582a.f56502b.d(Boxing.boxBoolean(booleanRef3.element));
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) dVar2.f6527o;
                booleanRef2 = (Ref.BooleanRef) dVar2.f6526n;
                ResultKt.throwOnFailure(obj);
                booleanRef.element = ((Number) obj).intValue() > 0;
                booleanRef3 = booleanRef2;
                return C5582a.f56502b.d(Boxing.boxBoolean(booleanRef3.element));
            }
        }
        dVar = new d(continuation);
        d dVar22 = dVar;
        Object obj2 = dVar22.f6530r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar22.f6532t;
        if (i10 != 0) {
        }
        booleanRef.element = ((Number) obj2).intValue() > 0;
        booleanRef3 = booleanRef2;
        return C5582a.f56502b.d(Boxing.boxBoolean(booleanRef3.element));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(4:(2:3|(10:5|6|(1:(1:(7:10|11|12|13|14|15|16)(2:25|26))(1:27))(2:40|(2:42|43)(1:44))|28|29|30|31|32|33|(1:36)(4:35|14|15|16)))|32|33|(0)(0))|45|6|(0)(0)|28|29|30|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // Qe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(String str, Integer num, Long l10, Long l11, SalesIQChat.Extras extras, Continuation continuation) {
        z zVar;
        Object coroutine_suspended;
        int i10;
        String str2;
        Long l12;
        Wh.a aVar;
        a aVar2;
        Long l13;
        SalesIQChat.Extras extras2;
        Integer num2;
        Wh.a aVar3;
        Object obj;
        Object updateConversation;
        try {
            if (continuation instanceof z) {
                zVar = (z) continuation;
                int i11 = zVar.f6631w;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zVar.f6631w = i11 - Integer.MIN_VALUE;
                    Object obj2 = zVar.f6629u;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zVar.f6631w;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Wh.a a10 = C6461a.C0913a.f65814a.a();
                        zVar.f6622n = this;
                        str2 = str;
                        zVar.f6623o = str2;
                        zVar.f6624p = num;
                        l12 = l10;
                        zVar.f6625q = l12;
                        zVar.f6626r = l11;
                        zVar.f6627s = extras;
                        zVar.f6628t = a10;
                        zVar.f6631w = 1;
                        if (a10.f(null, zVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = a10;
                        aVar2 = this;
                        l13 = l11;
                        extras2 = extras;
                        num2 = num;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (Wh.a) zVar.f6622n;
                            try {
                                ResultKt.throwOnFailure(obj2);
                                obj = null;
                                C5582a c5582a = (C5582a) obj2;
                                aVar3.g(obj);
                                return c5582a;
                            } catch (Throwable th2) {
                                th = th2;
                                obj = null;
                                aVar3.g(obj);
                                throw th;
                            }
                        }
                        Wh.a aVar4 = (Wh.a) zVar.f6628t;
                        SalesIQChat.Extras extras3 = (SalesIQChat.Extras) zVar.f6627s;
                        Long l14 = (Long) zVar.f6626r;
                        l12 = (Long) zVar.f6625q;
                        num2 = (Integer) zVar.f6624p;
                        String str3 = (String) zVar.f6623o;
                        aVar2 = (a) zVar.f6622n;
                        ResultKt.throwOnFailure(obj2);
                        extras2 = extras3;
                        l13 = l14;
                        aVar = aVar4;
                        str2 = str3;
                    }
                    Long l15 = l12;
                    ConversationsLocalDataSource J10 = aVar2.J();
                    zVar.f6622n = aVar;
                    zVar.f6623o = null;
                    zVar.f6624p = null;
                    zVar.f6625q = null;
                    zVar.f6626r = null;
                    zVar.f6627s = null;
                    zVar.f6628t = null;
                    zVar.f6631w = 2;
                    z zVar2 = zVar;
                    aVar3 = aVar;
                    obj = null;
                    updateConversation = J10.updateConversation(str2, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : num2, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : l15, (r39 & 1024) != 0 ? null : l13, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : extras2, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, zVar2);
                    if (updateConversation != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = updateConversation;
                    C5582a c5582a2 = (C5582a) obj2;
                    aVar3.g(obj);
                    return c5582a2;
                }
            }
            updateConversation = J10.updateConversation(str2, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : num2, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : l15, (r39 & 1024) != 0 ? null : l13, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : extras2, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, zVar2);
            if (updateConversation != coroutine_suspended) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar3.g(obj);
            throw th;
        }
        zVar = new z(continuation);
        Object obj22 = zVar.f6629u;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zVar.f6631w;
        if (i10 != 0) {
        }
        Long l152 = l12;
        ConversationsLocalDataSource J102 = aVar2.J();
        zVar.f6622n = aVar;
        zVar.f6623o = null;
        zVar.f6624p = null;
        zVar.f6625q = null;
        zVar.f6626r = null;
        zVar.f6627s = null;
        zVar.f6628t = null;
        zVar.f6631w = 2;
        z zVar22 = zVar;
        aVar3 = aVar;
        obj = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // Qe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(String str, String str2, String str3, Pe.a aVar, boolean z10, boolean z11, String str4, String str5, String str6, Message message, Bg.a aVar2, Function0 function0, Continuation continuation) {
        v vVar;
        a aVar3;
        int i10;
        C5582a c5582a;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i11 = vVar.f6597p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f6597p = i11 - Integer.MIN_VALUE;
                aVar3 = this;
                v vVar2 = vVar;
                Object obj = vVar2.f6595n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = vVar2.f6597p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    vVar2.f6597p = 1;
                    obj = aVar3.V(str, str2, str3, aVar, z10, z11, str6, str5, str4, message, aVar2, function0, vVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                    return c5582a;
                }
                return c5582a.a(Unit.INSTANCE);
            }
        }
        aVar3 = this;
        vVar = aVar3.new v(continuation);
        v vVar22 = vVar;
        Object obj2 = vVar22.f6595n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = vVar22.f6597p;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // Qe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(String str, String str2, Continuation continuation) {
        o oVar;
        int i10;
        String str3;
        StringBuilder sb2;
        String str4;
        a aVar;
        SalesIQResponse salesIQResponse;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i11 = oVar.f6562r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f6562r = i11 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj = oVar2.f6560p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = oVar2.f6562r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String I10 = G().I();
                    String V10 = G().V();
                    String J10 = G().J();
                    boolean contains = F().u().contains(str2);
                    if (I10 != null && V10 != null && J10 != null && !contains) {
                        Ie.a K10 = K();
                        oVar2.f6558n = this;
                        oVar2.f6559o = str2;
                        oVar2.f6562r = 1;
                        obj = K10.f(I10, str2, J10, V10, oVar2);
                        if (obj != coroutine_suspended) {
                            aVar = this;
                            salesIQResponse = (SalesIQResponse) obj;
                            if (salesIQResponse.getIsSuccess()) {
                            }
                            if (!salesIQResponse.getIsSuccess()) {
                            }
                            return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
                        }
                    } else if (contains) {
                        str3 = "Conversation already joined (ID: " + str2 + ')';
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("The following variable(s) must not be null for /join: ");
                        String O10 = O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(I10, "screenName"), new Pair(V10, "visitorWmsId"), new Pair(J10, "sessionId")}));
                        AbstractC2916a.i iVar = new AbstractC2916a.i(O10);
                        oVar2.f6558n = O10;
                        oVar2.f6559o = sb2;
                        oVar2.f6562r = 2;
                        if (T(iVar, oVar2) != coroutine_suspended) {
                            str4 = O10;
                            sb2.append(str4);
                            str3 = sb2.toString();
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    str2 = (String) oVar2.f6559o;
                    aVar = (a) oVar2.f6558n;
                    ResultKt.throwOnFailure(obj);
                    salesIQResponse = (SalesIQResponse) obj;
                    if (salesIQResponse.getIsSuccess()) {
                        aVar.F().u().add(str2);
                    }
                    if (!salesIQResponse.getIsSuccess()) {
                        SalesIQResponse.Error error = salesIQResponse.getError();
                        if (error == null) {
                            error = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                        }
                        Integer b10 = error.b();
                        if (b10 != null) {
                            aVar.J().handleError(str2, b10.intValue());
                        }
                    }
                    return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(salesIQResponse);
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sb2 = (StringBuilder) oVar2.f6559o;
                str4 = (String) oVar2.f6558n;
                ResultKt.throwOnFailure(obj);
                sb2.append(str4);
                str3 = sb2.toString();
                return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str3), false, 2, null);
            }
        }
        oVar = new o(continuation);
        o oVar22 = oVar;
        Object obj2 = oVar22.f6560p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = oVar22.f6562r;
        if (i10 != 0) {
        }
        return C5582a.C0817a.c(C5582a.f56502b, new Throwable(str3), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // Qe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, Continuation continuation) {
        q qVar;
        int i10;
        Form.Message.Meta meta;
        Form.Message.Meta.InputCard inputCard;
        Form.Message.Meta.InputCard.a type;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i11 = qVar.f6577p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f6577p = i11 - Integer.MIN_VALUE;
                Object obj = qVar.f6575n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = qVar.f6577p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Form.Message r10 = F().r();
                    if (r10 == null || (meta = r10.getMeta()) == null || (inputCard = meta.getInputCard()) == null || (type = inputCard.getType()) == null) {
                        return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Form is null"), false, 2, null);
                    }
                    ConversationsLocalDataSource J10 = J();
                    String str2 = (String) j(type).b();
                    qVar.f6577p = 1;
                    if (J10.saveDraft(str, str2, qVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return C5582a.C0817a.e(C5582a.f56502b, null, 1, null);
            }
        }
        qVar = new q(continuation);
        Object obj2 = qVar.f6575n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = qVar.f6577p;
        if (i10 != 0) {
        }
        return C5582a.C0817a.e(C5582a.f56502b, null, 1, null);
    }

    @Override // Qe.a
    public C5582a j(Form.Message.Meta.InputCard.a fieldType) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        int i10 = C1374b.$EnumSwitchMapping$0[fieldType.ordinal()];
        String str = null;
        if (i10 == 1) {
            String T10 = G().T();
            if (!LiveChatUtil.isAnnonVisitorbyName(T10)) {
                str = T10;
            }
        } else if (i10 == 2) {
            str = G().R();
        } else if (i10 == 3) {
            str = G().U();
        } else if (i10 != 4) {
        }
        try {
            m147constructorimpl = Result.m147constructorimpl(str);
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    @Override // Qe.a
    public C5582a k(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return J().getLatestConversationTime(chatId);
    }

    @Override // Qe.a
    public C5582a l(String chatId, f.a type) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(type, "type");
        C5582a.C0817a c0817a = C5582a.f56502b;
        boolean z10 = true;
        if (C1374b.$EnumSwitchMapping$1[type.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String W10 = G().W();
        if (W10 != null && W10.length() != 0) {
            z10 = false;
        }
        String str = null;
        if ((!z10 ? this : null) != null) {
            Intrinsics.checkNotNull(W10);
            if (StringsKt.contains$default((CharSequence) W10, (CharSequence) "%", false, 2, (Object) null)) {
                W10 = Vf.a.b(chatId, W10);
            }
            str = W10;
        }
        if (str == null) {
            str = this.f6499a.getString(od.t.f61151z1);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        return c0817a.d(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bd  */
    /* JADX WARN: Type inference failed for: r1v29, types: [T, java.lang.String] */
    @Override // Qe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(String str, String str2, String str3, String str4, String str5, Pe.a aVar, Continuation continuation) {
        p pVar;
        int i10;
        String str6;
        String str7;
        String str8;
        String str9;
        Pe.a aVar2;
        a aVar3;
        String str10;
        String str11;
        String str12;
        boolean z10;
        InterfaceC5321f interfaceC5321f;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        a aVar4;
        List list;
        MessageEntity messageEntity;
        Pe.a aVar5;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        a aVar6;
        String str23;
        boolean z11;
        String messageId;
        com.google.gson.k y10;
        int i11;
        Object obj;
        Object g10;
        p pVar2;
        List list2;
        T t10;
        SalesIQResponse salesIQResponse;
        Ref.ObjectRef objectRef;
        SalesIQResponse salesIQResponse2;
        ConversationResponse conversationResponse;
        SalesIQResponse salesIQResponse3;
        Ref.ObjectRef objectRef2;
        C5582a b10;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i12 = pVar.f6574y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pVar.f6574y = i12 - Integer.MIN_VALUE;
                Object obj2 = pVar.f6572w;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = pVar.f6574y;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    String I10 = G().I();
                    String V10 = G().V();
                    InterfaceC5321f interfaceC5321f2 = (InterfaceC5321f) M().E(str2, str, Message.g.ReopenQuestion).b();
                    if (interfaceC5321f2 != null) {
                        pVar.f6563n = this;
                        pVar.f6564o = str;
                        pVar.f6565p = str2;
                        str6 = str3;
                        pVar.f6566q = str6;
                        str7 = str4;
                        pVar.f6567r = str7;
                        pVar.f6568s = str5;
                        pVar.f6569t = aVar;
                        pVar.f6570u = I10;
                        pVar.f6571v = V10;
                        pVar.f6574y = 1;
                        Object r10 = AbstractC5323h.r(interfaceC5321f2, pVar);
                        if (r10 != coroutine_suspended) {
                            str8 = str;
                            str9 = V10;
                            aVar2 = aVar;
                            str11 = str2;
                            str12 = I10;
                            obj2 = r10;
                            str10 = str5;
                            aVar3 = this;
                        }
                        return coroutine_suspended;
                    }
                    str6 = str3;
                    str7 = str4;
                    str8 = str;
                    str9 = V10;
                    aVar2 = aVar;
                    aVar3 = this;
                    str10 = str5;
                    str11 = str2;
                    str12 = I10;
                    z10 = true;
                    interfaceC5321f = (InterfaceC5321f) aVar3.M().E(str11, str8, Message.g.Question).b();
                    if (interfaceC5321f != null) {
                        pVar.f6563n = aVar3;
                        pVar.f6564o = str8;
                        pVar.f6565p = str11;
                        pVar.f6566q = str6;
                        pVar.f6567r = str7;
                        pVar.f6568s = str10;
                        pVar.f6569t = aVar2;
                        pVar.f6570u = str12;
                        pVar.f6571v = str9;
                        pVar.f6574y = 2;
                        obj2 = AbstractC5323h.r(interfaceC5321f, pVar);
                        if (obj2 != coroutine_suspended) {
                            String str24 = str11;
                            str13 = str10;
                            str14 = str24;
                            a aVar7 = aVar3;
                            str15 = str6;
                            str16 = str8;
                            str17 = str7;
                            aVar4 = aVar7;
                            list2 = (List) obj2;
                            if (list2 == null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    aVar5 = aVar2;
                    str19 = str11;
                    messageEntity = null;
                    str21 = str12;
                    aVar6 = aVar3;
                    str23 = str10;
                    z11 = z10;
                    str18 = str6;
                    str20 = str9;
                    str22 = str8;
                    if (str21 != null) {
                    }
                    Q.n();
                    C5582a.C0817a c0817a = C5582a.f56502b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("The following variable(s) must not be null for /leavemessage: ");
                    sb2.append(aVar6.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str21, "screenName"), new Pair(str20, "visitorWmsId"), new Pair(messageEntity != null ? messageEntity.getMessageId() : null, "messageId")})));
                    return C5582a.C0817a.c(c0817a, new Throwable(sb2.toString()), false, 2, null);
                }
                if (i10 == 1) {
                    str9 = (String) pVar.f6571v;
                    str12 = (String) pVar.f6570u;
                    aVar2 = (Pe.a) pVar.f6569t;
                    str10 = (String) pVar.f6568s;
                    String str25 = (String) pVar.f6567r;
                    String str26 = (String) pVar.f6566q;
                    str11 = (String) pVar.f6565p;
                    str8 = (String) pVar.f6564o;
                    aVar3 = (a) pVar.f6563n;
                    ResultKt.throwOnFailure(obj2);
                    str7 = str25;
                    str6 = str26;
                } else {
                    if (i10 == 2) {
                        str9 = (String) pVar.f6571v;
                        str12 = (String) pVar.f6570u;
                        aVar2 = (Pe.a) pVar.f6569t;
                        str13 = (String) pVar.f6568s;
                        str17 = (String) pVar.f6567r;
                        str15 = (String) pVar.f6566q;
                        str14 = (String) pVar.f6565p;
                        str16 = (String) pVar.f6564o;
                        aVar4 = (a) pVar.f6563n;
                        ResultKt.throwOnFailure(obj2);
                        z10 = true;
                        list2 = (List) obj2;
                        if (list2 == null) {
                            messageEntity = (MessageEntity) CollectionsKt.firstOrNull(list2);
                            String str27 = str16;
                            str20 = str9;
                            str22 = str27;
                            aVar5 = aVar2;
                            str19 = str14;
                            z11 = z10;
                            str21 = str12;
                            aVar6 = aVar4;
                            str7 = str17;
                            str18 = str15;
                            str23 = str13;
                            if (str21 != null && str20 != null) {
                                messageId = messageEntity == null ? messageEntity.getMessageId() : null;
                                if (messageId != null && messageId.length() != 0) {
                                    Ie.a K10 = aVar6.K();
                                    String messageId2 = messageEntity == null ? messageEntity.getMessageId() : null;
                                    Intrinsics.checkNotNull(messageId2);
                                    String T10 = aVar6.G().T();
                                    String R10 = aVar6.G().R();
                                    String U10 = aVar6.G().U();
                                    String f10 = aVar6.G().f();
                                    String n10 = aVar6.G().n();
                                    String Y10 = aVar6.G().Y();
                                    y10 = aVar6.F().y();
                                    if (y10.isEmpty()) {
                                        y10 = null;
                                    }
                                    Boolean bool = !Intrinsics.areEqual(aVar6.G().e("is_campaign_suggestions_subscribed").b(), Boxing.boxBoolean(z11)) ? (Boolean) aVar6.G().l("is_campaign_suggestions_subscribed", false).b() : null;
                                    pVar.f6563n = aVar6;
                                    pVar.f6564o = str22;
                                    pVar.f6565p = null;
                                    pVar.f6566q = null;
                                    pVar.f6567r = null;
                                    pVar.f6568s = null;
                                    pVar.f6569t = null;
                                    pVar.f6570u = null;
                                    pVar.f6571v = null;
                                    pVar.f6574y = 3;
                                    p pVar3 = pVar;
                                    Boolean bool2 = bool;
                                    i11 = 4;
                                    String str28 = messageId2;
                                    obj = coroutine_suspended;
                                    g10 = K10.g(str21, str28, str20, T10, R10, U10, f10, n10, Y10, str23, y10, str7, str18, str19, aVar5, bool2, pVar3);
                                    pVar2 = pVar3;
                                    t10 = str22;
                                    if (g10 == obj) {
                                        return obj;
                                    }
                                    salesIQResponse = (SalesIQResponse) g10;
                                    objectRef = new Ref.ObjectRef();
                                    objectRef.element = t10;
                                    if (salesIQResponse.getIsSuccess()) {
                                    }
                                }
                            }
                            Q.n();
                            C5582a.C0817a c0817a2 = C5582a.f56502b;
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("The following variable(s) must not be null for /leavemessage: ");
                            sb22.append(aVar6.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str21, "screenName"), new Pair(str20, "visitorWmsId"), new Pair(messageEntity != null ? messageEntity.getMessageId() : null, "messageId")})));
                            return C5582a.C0817a.c(c0817a2, new Throwable(sb22.toString()), false, 2, null);
                        }
                        String str29 = str13;
                        str11 = str14;
                        str10 = str29;
                        String str30 = str17;
                        str8 = str16;
                        str6 = str15;
                        aVar3 = aVar4;
                        str7 = str30;
                        aVar5 = aVar2;
                        str19 = str11;
                        messageEntity = null;
                        str21 = str12;
                        aVar6 = aVar3;
                        str23 = str10;
                        z11 = z10;
                        str18 = str6;
                        str20 = str9;
                        str22 = str8;
                        if (str21 != null) {
                            if (messageEntity == null) {
                            }
                            if (messageId != null) {
                                Ie.a K102 = aVar6.K();
                                if (messageEntity == null) {
                                }
                                Intrinsics.checkNotNull(messageId2);
                                String T102 = aVar6.G().T();
                                String R102 = aVar6.G().R();
                                String U102 = aVar6.G().U();
                                String f102 = aVar6.G().f();
                                String n102 = aVar6.G().n();
                                String Y102 = aVar6.G().Y();
                                y10 = aVar6.F().y();
                                if (y10.isEmpty()) {
                                }
                                if (!Intrinsics.areEqual(aVar6.G().e("is_campaign_suggestions_subscribed").b(), Boxing.boxBoolean(z11))) {
                                }
                                pVar.f6563n = aVar6;
                                pVar.f6564o = str22;
                                pVar.f6565p = null;
                                pVar.f6566q = null;
                                pVar.f6567r = null;
                                pVar.f6568s = null;
                                pVar.f6569t = null;
                                pVar.f6570u = null;
                                pVar.f6571v = null;
                                pVar.f6574y = 3;
                                p pVar32 = pVar;
                                Boolean bool22 = bool;
                                i11 = 4;
                                String str282 = messageId2;
                                obj = coroutine_suspended;
                                g10 = K102.g(str21, str282, str20, T102, R102, U102, f102, n102, Y102, str23, y10, str7, str18, str19, aVar5, bool22, pVar32);
                                pVar2 = pVar32;
                                t10 = str22;
                                if (g10 == obj) {
                                }
                                salesIQResponse = (SalesIQResponse) g10;
                                objectRef = new Ref.ObjectRef();
                                objectRef.element = t10;
                                if (salesIQResponse.getIsSuccess()) {
                                }
                            }
                        }
                        Q.n();
                        C5582a.C0817a c0817a22 = C5582a.f56502b;
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append("The following variable(s) must not be null for /leavemessage: ");
                        sb222.append(aVar6.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str21, "screenName"), new Pair(str20, "visitorWmsId"), new Pair(messageEntity != null ? messageEntity.getMessageId() : null, "messageId")})));
                        return C5582a.C0817a.c(c0817a22, new Throwable(sb222.toString()), false, 2, null);
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        conversationResponse = (ConversationResponse) pVar.f6566q;
                        salesIQResponse3 = (SalesIQResponse) pVar.f6565p;
                        objectRef2 = (Ref.ObjectRef) pVar.f6564o;
                        salesIQResponse2 = (SalesIQResponse) pVar.f6563n;
                        ResultKt.throwOnFailure(obj2);
                        objectRef2.element = conversationResponse.getChatId();
                        objectRef = objectRef2;
                        salesIQResponse = salesIQResponse3;
                        Q.n();
                        if (!salesIQResponse.getIsSuccess()) {
                            if (salesIQResponse.getError() == null) {
                                new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                            }
                            Q.n();
                        }
                        LeaveMessageResponse leaveMessageResponse = new LeaveMessageResponse((String) objectRef.element, false, salesIQResponse2.getIsSuccess(), 2, null);
                        if (!salesIQResponse2.getIsSuccess()) {
                            return C5582a.f56502b.d(leaveMessageResponse);
                        }
                        SalesIQResponse.Error error = salesIQResponse2.getError();
                        return (error == null || (b10 = C5582a.f56502b.b(new C5582a.b(error.d(), error.b(), null, 4, null))) == null) ? C5582a.C0817a.c(C5582a.f56502b, new Throwable("Leave message failed and cause is null"), false, 2, null) : b10;
                    }
                    String str31 = (String) pVar.f6564o;
                    aVar6 = (a) pVar.f6563n;
                    ResultKt.throwOnFailure(obj2);
                    g10 = obj2;
                    obj = coroutine_suspended;
                    pVar2 = pVar;
                    i11 = 4;
                    t10 = str31;
                    salesIQResponse = (SalesIQResponse) g10;
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = t10;
                    if (salesIQResponse.getIsSuccess()) {
                        conversationResponse = (ConversationResponse) salesIQResponse.getData();
                        if (conversationResponse != null) {
                            pVar2.f6563n = salesIQResponse;
                            pVar2.f6564o = objectRef;
                            pVar2.f6565p = salesIQResponse;
                            pVar2.f6566q = conversationResponse;
                            pVar2.f6574y = i11;
                            if (aVar6.S(conversationResponse, pVar2) == obj) {
                                return obj;
                            }
                            salesIQResponse3 = salesIQResponse;
                            salesIQResponse2 = salesIQResponse3;
                            objectRef2 = objectRef;
                            objectRef2.element = conversationResponse.getChatId();
                            objectRef = objectRef2;
                            salesIQResponse = salesIQResponse3;
                            Q.n();
                            if (!salesIQResponse.getIsSuccess()) {
                            }
                            LeaveMessageResponse leaveMessageResponse2 = new LeaveMessageResponse((String) objectRef.element, false, salesIQResponse2.getIsSuccess(), 2, null);
                            if (!salesIQResponse2.getIsSuccess()) {
                            }
                        } else {
                            salesIQResponse2 = salesIQResponse;
                            Q.n();
                            if (!salesIQResponse.getIsSuccess()) {
                            }
                            LeaveMessageResponse leaveMessageResponse22 = new LeaveMessageResponse((String) objectRef.element, false, salesIQResponse2.getIsSuccess(), 2, null);
                            if (!salesIQResponse2.getIsSuccess()) {
                            }
                        }
                    } else {
                        salesIQResponse2 = salesIQResponse;
                        if (!salesIQResponse.getIsSuccess()) {
                        }
                        LeaveMessageResponse leaveMessageResponse222 = new LeaveMessageResponse((String) objectRef.element, false, salesIQResponse2.getIsSuccess(), 2, null);
                        if (!salesIQResponse2.getIsSuccess()) {
                        }
                    }
                }
                list = (List) obj2;
                if (list != null && (messageEntity = (MessageEntity) CollectionsKt.firstOrNull(list)) != null) {
                    aVar5 = aVar2;
                    str18 = str6;
                    str19 = str11;
                    str20 = str9;
                    str21 = str12;
                    str22 = str8;
                    aVar6 = aVar3;
                    str23 = str10;
                    z11 = true;
                    if (str21 != null) {
                    }
                    Q.n();
                    C5582a.C0817a c0817a222 = C5582a.f56502b;
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append("The following variable(s) must not be null for /leavemessage: ");
                    sb2222.append(aVar6.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str21, "screenName"), new Pair(str20, "visitorWmsId"), new Pair(messageEntity != null ? messageEntity.getMessageId() : null, "messageId")})));
                    return C5582a.C0817a.c(c0817a222, new Throwable(sb2222.toString()), false, 2, null);
                }
                z10 = true;
                interfaceC5321f = (InterfaceC5321f) aVar3.M().E(str11, str8, Message.g.Question).b();
                if (interfaceC5321f != null) {
                }
                aVar5 = aVar2;
                str19 = str11;
                messageEntity = null;
                str21 = str12;
                aVar6 = aVar3;
                str23 = str10;
                z11 = z10;
                str18 = str6;
                str20 = str9;
                str22 = str8;
                if (str21 != null) {
                }
                Q.n();
                C5582a.C0817a c0817a2222 = C5582a.f56502b;
                StringBuilder sb22222 = new StringBuilder();
                sb22222.append("The following variable(s) must not be null for /leavemessage: ");
                sb22222.append(aVar6.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str21, "screenName"), new Pair(str20, "visitorWmsId"), new Pair(messageEntity != null ? messageEntity.getMessageId() : null, "messageId")})));
                return C5582a.C0817a.c(c0817a2222, new Throwable(sb22222.toString()), false, 2, null);
            }
        }
        pVar = new p(continuation);
        Object obj22 = pVar.f6572w;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = pVar.f6574y;
        if (i10 != 0) {
        }
        list = (List) obj22;
        if (list != null) {
            aVar5 = aVar2;
            str18 = str6;
            str19 = str11;
            str20 = str9;
            str21 = str12;
            str22 = str8;
            aVar6 = aVar3;
            str23 = str10;
            z11 = true;
            if (str21 != null) {
            }
            Q.n();
            C5582a.C0817a c0817a22222 = C5582a.f56502b;
            StringBuilder sb222222 = new StringBuilder();
            sb222222.append("The following variable(s) must not be null for /leavemessage: ");
            sb222222.append(aVar6.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str21, "screenName"), new Pair(str20, "visitorWmsId"), new Pair(messageEntity != null ? messageEntity.getMessageId() : null, "messageId")})));
            return C5582a.C0817a.c(c0817a22222, new Throwable(sb222222.toString()), false, 2, null);
        }
        z10 = true;
        interfaceC5321f = (InterfaceC5321f) aVar3.M().E(str11, str8, Message.g.Question).b();
        if (interfaceC5321f != null) {
        }
        aVar5 = aVar2;
        str19 = str11;
        messageEntity = null;
        str21 = str12;
        aVar6 = aVar3;
        str23 = str10;
        z11 = z10;
        str18 = str6;
        str20 = str9;
        str22 = str8;
        if (str21 != null) {
        }
        Q.n();
        C5582a.C0817a c0817a222222 = C5582a.f56502b;
        StringBuilder sb2222222 = new StringBuilder();
        sb2222222.append("The following variable(s) must not be null for /leavemessage: ");
        sb2222222.append(aVar6.O(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(str21, "screenName"), new Pair(str20, "visitorWmsId"), new Pair(messageEntity != null ? messageEntity.getMessageId() : null, "messageId")})));
        return C5582a.C0817a.c(c0817a222222, new Throwable(sb2222222.toString()), false, 2, null);
    }

    @Override // Qe.a
    public C5582a n(De.a preferenceKey, boolean z10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        try {
            Result.Companion companion = Result.INSTANCE;
            F().H(Ce.a.a(preferenceKey), z10);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
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

    @Override // Qe.a
    public C5582a o(String chatId, long j10) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return J().updateLatestConversationTime(chatId, j10);
    }

    public a(Application application) {
        this.f6499a = application;
        this.f6500b = LazyKt.lazy(i.f6537d);
        this.f6501c = LazyKt.lazy(g.f6535d);
        this.f6502d = LazyKt.lazy(new C1375c());
        this.f6503e = LazyKt.lazy(h.f6536d);
        this.f6504f = LazyKt.lazy(new f());
        this.f6505g = LazyKt.lazy(s.f6583d);
        this.f6506h = LazyKt.lazy(new t());
        this.f6507i = LazyKt.lazy(new y());
    }
}
