package Qd;

import Ph.AbstractC1459k;
import Ph.P;
import Ph.h1;
import a1.C1908a;
import android.app.Application;
import android.content.Intent;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.Gson;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.calls.data.model.MediaResponse;
import com.zoho.livechat.android.modules.calls.domain.entities.CallStatus;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.livechat.android.utils.x;
import java.io.File;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import og.AbstractC5895g;
import og.AbstractC5896h;
import td.C6461a;
import uf.C6550a;
import ug.AbstractC6574b;
import xf.InterfaceC6823a;
import yf.y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final C0184a f9637h = new C0184a(null);

    /* renamed from: i, reason: collision with root package name */
    public static a f9638i;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f9639a = LazyKt.lazy(e.f9649d);

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9640b = LazyKt.lazy(f.f9650d);

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f9641c = LazyKt.lazy(new d());

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f9642d = LazyKt.lazy(b.f9646d);

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f9643e = LazyKt.lazy(new v());

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f9644f = LazyKt.lazy(new w());

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f9645g = LazyKt.lazy(new c());

    /* renamed from: Qd.a$a, reason: collision with other inner class name */
    public static final class C0184a {
        public /* synthetic */ C0184a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar;
            synchronized (this) {
                aVar = a.f9638i;
                if (aVar == null) {
                    aVar = new a();
                    a.f9638i = aVar;
                }
            }
            return aVar;
        }

        public C0184a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f9646d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Rd.a invoke() {
            return Rd.a.f10182d.a();
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Xd.a invoke() {
            return new Xd.a(a.this.v());
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(a.this.u());
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f9649d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConversationsLocalDataSource invoke() {
            return ConversationsLocalDataSource.INSTANCE.getInstance$mobilisten_release();
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f9650d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ie.a invoke() {
            return Ie.a.f5761b.a();
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f9651n;

        /* renamed from: o, reason: collision with root package name */
        public Object f9652o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f9653p;

        /* renamed from: r, reason: collision with root package name */
        public int f9655r;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9653p = obj;
            this.f9655r |= Integer.MIN_VALUE;
            return a.this.F(null, this);
        }
    }

    public static final class h extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f9656d = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.gson.k invoke(com.google.gson.k updateMediaToConversation) {
            String f10;
            Intrinsics.checkNotNullParameter(updateMediaToConversation, "$this$updateMediaToConversation");
            com.google.gson.h r10 = updateMediaToConversation.r("operation");
            if (r10 != null && (f10 = AbstractC5896h.f(r10)) != null) {
                updateMediaToConversation.p("status", f10);
            }
            return updateMediaToConversation;
        }
    }

    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f9657n;

        /* renamed from: p, reason: collision with root package name */
        public int f9659p;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9657n = obj;
            this.f9659p |= Integer.MIN_VALUE;
            return a.this.I(null, this);
        }
    }

    public static final class j extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f9660d = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.gson.k invoke(com.google.gson.k updateMediaToConversation) {
            String f10;
            Intrinsics.checkNotNullParameter(updateMediaToConversation, "$this$updateMediaToConversation");
            com.google.gson.h r10 = updateMediaToConversation.r("operation");
            if (r10 != null && (f10 = AbstractC5896h.f(r10)) != null) {
                updateMediaToConversation.p("status", f10);
            }
            return updateMediaToConversation;
        }
    }

    public static final class k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f9661n;

        /* renamed from: p, reason: collision with root package name */
        public int f9663p;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9661n = obj;
            this.f9663p |= Integer.MIN_VALUE;
            return a.this.K(null, null, this);
        }
    }

    public static final class l extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f9664n;

        /* renamed from: o, reason: collision with root package name */
        public Object f9665o;

        /* renamed from: p, reason: collision with root package name */
        public Object f9666p;

        /* renamed from: q, reason: collision with root package name */
        public Object f9667q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f9668r;

        /* renamed from: t, reason: collision with root package name */
        public int f9670t;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9668r = obj;
            this.f9670t |= Integer.MIN_VALUE;
            return a.this.M(null, this);
        }
    }

    public static final class m extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MediaResponse f9671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MediaResponse mediaResponse) {
            super(1);
            this.f9671d = mediaResponse;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.gson.k invoke(com.google.gson.k updateMediaToConversation) {
            String f10;
            Intrinsics.checkNotNullParameter(updateMediaToConversation, "$this$updateMediaToConversation");
            com.google.gson.h r10 = updateMediaToConversation.r("operation");
            if (r10 != null && (f10 = AbstractC5896h.f(r10)) != null) {
                updateMediaToConversation.p("status", f10);
            }
            updateMediaToConversation.p("initiated_by", Intrinsics.areEqual(this.f9671d.getPerformedByVisitor(), Boolean.TRUE) ? "visitor" : "operator");
            return updateMediaToConversation;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f9672n;

        /* renamed from: o, reason: collision with root package name */
        public Object f9673o;

        /* renamed from: p, reason: collision with root package name */
        public Object f9674p;

        /* renamed from: q, reason: collision with root package name */
        public int f9675q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f9676r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f9677s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MediaResponse f9678t;

        /* renamed from: Qd.a$n$a, reason: collision with other inner class name */
        public static final class C0185a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f9679d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f9680e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ MediaResponse f9681f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Continuation f9682g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0185a(Ref.ObjectRef objectRef, a aVar, MediaResponse mediaResponse, Continuation continuation) {
                super(1);
                this.f9679d = objectRef;
                this.f9680e = aVar;
                this.f9681f = mediaResponse;
                this.f9682g = continuation;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T, com.zoho.livechat.android.models.SalesIQChat] */
            public final void a(Boolean bool) {
                this.f9679d.element = this.f9680e.y().getChatFromConversationId(this.f9681f.getConversationId());
                Continuation continuation = this.f9682g;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Boolean) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef objectRef, a aVar, MediaResponse mediaResponse, Continuation continuation) {
            super(2, continuation);
            this.f9676r = objectRef;
            this.f9677s = aVar;
            this.f9678t = mediaResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f9676r, this.f9677s, this.f9678t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9675q;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef = this.f9676r;
                a aVar = this.f9677s;
                MediaResponse mediaResponse = this.f9678t;
                this.f9672n = objectRef;
                this.f9673o = aVar;
                this.f9674p = mediaResponse;
                this.f9675q = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                x xVar = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), new C0185a(objectRef, aVar, mediaResponse, safeContinuation));
                xVar.c(mediaResponse.getConversationId());
                LiveChatUtil.submitTaskToExecutorServiceSafely(xVar);
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (orThrow == coroutine_suspended) {
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

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f9683n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f9685p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ MediaResponse f9686q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Ref.ObjectRef objectRef, MediaResponse mediaResponse, Continuation continuation) {
            super(2, continuation);
            this.f9685p = objectRef;
            this.f9686q = mediaResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new o(this.f9685p, this.f9686q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9683n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6550a D10 = a.this.D();
                SalesIQChat salesIQChat = (SalesIQChat) this.f9685p.element;
                String convID = salesIQChat != null ? salesIQChat.getConvID() : null;
                String conversationId = this.f9686q.getConversationId();
                SalesIQChat salesIQChat2 = (SalesIQChat) this.f9685p.element;
                String chid = salesIQChat2 != null ? salesIQChat2.getChid() : null;
                Intrinsics.checkNotNull(chid);
                SalesIQChat salesIQChat3 = (SalesIQChat) this.f9685p.element;
                String rchatid = salesIQChat3 != null ? salesIQChat3.getRchatid() : null;
                y.a aVar = y.a.Bottom;
                this.f9683n = 1;
                if (InterfaceC6823a.n(D10, convID, conversationId, chid, rchatid, null, null, null, false, aVar, false, false, this, 1536, null) == coroutine_suspended) {
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

    public static final class p extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f9687n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MediaResponse f9688o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(MediaResponse mediaResponse, Continuation continuation) {
            super(2, continuation);
            this.f9688o = mediaResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new p(this.f9688o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((p) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9687n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Td.e eVar = Td.e.f11456a;
                MediaResponse.OperationalUser operationUser = this.f9688o.getOperationUser();
                String id2 = operationUser != null ? operationUser.getId() : null;
                this.f9687n = 1;
                obj = eVar.S(id2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Td.e.W0(null, null, null, obj, null, null, null, 119, null);
            return Unit.INSTANCE;
        }
    }

    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f9689n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MediaResponse f9690o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ a f9691p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Long f9692q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Map f9693r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f9694s;

        /* renamed from: Qd.a$q$a, reason: collision with other inner class name */
        public static final class C0186a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f9695n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ a f9696o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ MediaResponse f9697p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0186a(a aVar, MediaResponse mediaResponse, Continuation continuation) {
                super(2, continuation);
                this.f9696o = aVar;
                this.f9697p = mediaResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0186a(this.f9696o, this.f9697p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0186a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f9695n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SalesIQChat chatFromConversationId = this.f9696o.y().getChatFromConversationId(this.f9697p.getConversationId());
                this.f9696o.U(chatFromConversationId != null ? chatFromConversationId.getChid() : null, chatFromConversationId != null ? chatFromConversationId.getConvID() : null, "refreshchat");
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MediaResponse.Operation.values().length];
                try {
                    iArr[MediaResponse.Operation.Accept.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaResponse.Operation.Connected.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MediaResponse.Operation.Hold.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MediaResponse.Operation.Invite.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MediaResponse.Operation.Reject.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MediaResponse.Operation.End.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MediaResponse.Operation.Miss.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MediaResponse.Operation.Cancel.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MediaResponse.Operation.CallCancel.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MediaResponse.Operation.Chat.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MediaResponse.Operation.Dequeue.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[MediaResponse.Operation.Queue.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[MediaResponse.Operation.MonitorEnd.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[MediaResponse.Operation.MonitorJoin.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[MediaResponse.Operation.Initiate.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(MediaResponse mediaResponse, a aVar, Long l10, Map map, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f9690o = mediaResponse;
            this.f9691p = aVar;
            this.f9692q = l10;
            this.f9693r = map;
            this.f9694s = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new q(this.f9690o, this.f9691p, this.f9692q, this.f9693r, this.f9694s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (r0.T(r1, r14) == r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        
            if (r0.N(r1, r2, r3, r4, r14) == r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        
            if (r0.K(r1, r2, r14) == r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        
            if (r0.Q(r1, r14) == r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
        
            if (r0.M(r1, r14) == r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
        
            if (r0.I(r1, r14) == r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
        
            if (r0.F(r1, r14) == r6) goto L45;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f9689n) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    if (this.f9690o.getOperation() != MediaResponse.Operation.Invite && this.f9690o.getOperation() != MediaResponse.Operation.Cancel && og.i.f(Td.e.L()) && !Intrinsics.areEqual(this.f9690o.getMediaId(), Td.e.L())) {
                        return Unit.INSTANCE;
                    }
                    MediaResponse.Operation operation = this.f9690o.getOperation();
                    switch (operation == null ? -1 : b.$EnumSwitchMapping$0[operation.ordinal()]) {
                        case 1:
                            a aVar = this.f9691p;
                            MediaResponse mediaResponse = this.f9690o;
                            this.f9689n = 1;
                            break;
                        case 2:
                            a aVar2 = this.f9691p;
                            MediaResponse mediaResponse2 = this.f9690o;
                            this.f9689n = 2;
                            break;
                        case 3:
                            this.f9691p.L(this.f9690o);
                            break;
                        case 4:
                            a aVar3 = this.f9691p;
                            MediaResponse mediaResponse3 = this.f9690o;
                            this.f9689n = 3;
                            break;
                        case 5:
                            a aVar4 = this.f9691p;
                            MediaResponse mediaResponse4 = this.f9690o;
                            this.f9689n = 4;
                            break;
                        case 6:
                            a aVar5 = this.f9691p;
                            MediaResponse mediaResponse5 = this.f9690o;
                            Long l10 = this.f9692q;
                            this.f9689n = 5;
                            break;
                        case 7:
                        case 8:
                        case 9:
                            a aVar6 = this.f9691p;
                            MediaResponse mediaResponse6 = this.f9690o;
                            Long l11 = this.f9692q;
                            Map map = this.f9693r;
                            boolean z10 = this.f9694s;
                            this.f9689n = 6;
                            break;
                        case 10:
                            a aVar7 = this.f9691p;
                            MediaResponse mediaResponse7 = this.f9690o;
                            this.f9689n = 7;
                            break;
                        case 11:
                            this.f9691p.J(this.f9690o);
                            break;
                    }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    ResultKt.throwOnFailure(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1459k.d(this.f9691p.t(), null, null, new C0186a(this.f9691p, this.f9690o, null), 3, null);
            ne.j.s0(false, 1, null);
            return Unit.INSTANCE;
        }
    }

    public static final class r extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f9698n;

        /* renamed from: o, reason: collision with root package name */
        public Object f9699o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f9700p;

        /* renamed from: r, reason: collision with root package name */
        public int f9702r;

        public r(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9700p = obj;
            this.f9702r |= Integer.MIN_VALUE;
            return a.this.Q(null, this);
        }
    }

    public static final class s extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final s f9703d = new s();

        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.gson.k invoke(com.google.gson.k updateMediaToConversation) {
            Intrinsics.checkNotNullParameter(updateMediaToConversation, "$this$updateMediaToConversation");
            com.google.gson.h r10 = updateMediaToConversation.r("operation");
            if (r10 != null && AbstractC5896h.f(r10) != null) {
                updateMediaToConversation.p("status", "miss");
            }
            return updateMediaToConversation;
        }
    }

    public static final class t extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f9704n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ MediaResponse f9706p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(MediaResponse mediaResponse, Continuation continuation) {
            super(2, continuation);
            this.f9706p = mediaResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new t(this.f9706p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((t) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9704n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ie.a z10 = a.this.z();
                String screenName = LiveChatUtil.getScreenName();
                Intrinsics.checkNotNullExpressionValue(screenName, "getScreenName(...)");
                String conversationId = this.f9706p.getConversationId();
                this.f9704n = 1;
                if (z10.i(screenName, conversationId, false, this) == coroutine_suspended) {
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

    public static final class u extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f9707n;

        /* renamed from: o, reason: collision with root package name */
        public Object f9708o;

        /* renamed from: p, reason: collision with root package name */
        public int f9709p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f9710q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function2 f9711r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f9711r = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            u uVar = new u(this.f9711r, continuation);
            uVar.f9710q = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((u) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
            if (r8.f(null, r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P p10;
            Wh.a a10;
            Function2 function2;
            Wh.a aVar;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9709p;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    p10 = (P) this.f9710q;
                    a10 = C6461a.C0913a.f65814a.a();
                    function2 = this.f9711r;
                    this.f9710q = p10;
                    this.f9707n = a10;
                    this.f9708o = function2;
                    this.f9709p = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Wh.a) this.f9710q;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar.g(null);
                            throw th2;
                        }
                    }
                    function2 = (Function2) this.f9708o;
                    Wh.a aVar2 = (Wh.a) this.f9707n;
                    p10 = (P) this.f9710q;
                    ResultKt.throwOnFailure(obj);
                    a10 = aVar2;
                }
                this.f9710q = a10;
                this.f9707n = null;
                this.f9708o = null;
                this.f9709p = 2;
                if (function2.invoke(p10, this) != coroutine_suspended) {
                    aVar = a10;
                    Unit unit2 = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                aVar = a10;
                th2 = th4;
                aVar.g(null);
                throw th2;
            }
        }
    }

    public static final class v extends Lambda implements Function0 {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            return C6550a.f66357j.a(a.this.u());
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Xd.d invoke() {
            return new Xd.d(a.this.v());
        }
    }

    public static final a C() {
        return f9637h.a();
    }

    public static /* synthetic */ void H(a aVar, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        aVar.G(map, z10);
    }

    public static final void O(MediaResponse mediaResponse) {
        if (mediaResponse.getOperation() == MediaResponse.Operation.Miss) {
            Td.e.f11456a.J0(mediaResponse.getMediaId(), Intrinsics.areEqual(mediaResponse.getPerformedByVisitor(), Boolean.FALSE));
            Ud.a.f12180a.a(null, Dg.a.f2750d);
        } else {
            Td.e.K0(Td.e.f11456a, mediaResponse.getMediaId(), false, 2, null);
            Ud.a.f12180a.a(null, Dg.a.f2751e);
        }
    }

    public final Object A(SalesIQChat salesIQChat) {
        Td.e eVar = Td.e.f11456a;
        if (!eVar.F()) {
            return null;
        }
        File T10 = eVar.T(salesIQChat != null ? salesIQChat.getAttenderid() : null);
        if (T10 == null) {
            return Integer.valueOf(MobilistenUtil.k() ? od.p.f60127l2 : od.p.f60132m2);
        }
        return T10;
    }

    public final Gson B() {
        return Yd.a.j();
    }

    public final C6550a D() {
        return (C6550a) this.f9643e.getValue();
    }

    public final Xd.d E() {
        return (Xd.d) this.f9644f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        if (r2 != r4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(MediaResponse mediaResponse, Continuation continuation) {
        g gVar;
        int i10;
        a aVar;
        String name;
        String str;
        MediaResponse mediaResponse2 = mediaResponse;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f9655r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f9655r = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f9653p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f9655r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    h hVar = h.f9656d;
                    gVar.f9651n = this;
                    gVar.f9652o = mediaResponse2;
                    gVar.f9655r = 1;
                    if (V(mediaResponse2, hVar, gVar) != coroutine_suspended) {
                        aVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Td.e.W0(null, null, null, obj, null, null, null, 119, null);
                    return Unit.INSTANCE;
                }
                mediaResponse2 = (MediaResponse) gVar.f9652o;
                aVar = (a) gVar.f9651n;
                ResultKt.throwOnFailure(obj);
                if (Td.e.M() != Dg.b.f2757b) {
                    Td.e.f11456a.J0(mediaResponse2.getMediaId(), true);
                    Ud.a.f12180a.a(null, Dg.a.f2753g);
                } else {
                    Td.e eVar = Td.e.f11456a;
                    eVar.t0(Dg.b.f2758c);
                    SalesIQChat chatFromConversationId = aVar.y().getChatFromConversationId(mediaResponse2.getConversationId());
                    Pe.b I10 = Te.a.I(chatFromConversationId != null ? chatFromConversationId.getConvID() : null);
                    if (!Intrinsics.areEqual(mediaResponse2.getPerformedByVisitor(), Boxing.boxBoolean(true))) {
                        String conversationId = mediaResponse2.getConversationId();
                        String W10 = Td.e.W(I10, chatFromConversationId);
                        if (W10 == null || (name = og.m.d(W10)) == null) {
                            MediaResponse.OperationalUser operationUser = mediaResponse2.getOperationUser();
                            name = operationUser != null ? operationUser.getName() : null;
                            if (name == null) {
                                name = "";
                            }
                            if (!eVar.G()) {
                                name = null;
                            }
                            if (name == null && (name = Td.e.B()) == null) {
                                str = "";
                                Td.e.W0(conversationId, null, str, null, null, null, null, 122, null);
                                MediaResponse.OperationalUser operationUser2 = mediaResponse2.getOperationUser();
                                String id2 = operationUser2 == null ? operationUser2.getId() : null;
                                gVar.f9651n = null;
                                gVar.f9652o = null;
                                gVar.f9655r = 2;
                                obj = eVar.S(id2, gVar);
                            }
                        }
                        str = name;
                        Td.e.W0(conversationId, null, str, null, null, null, null, 122, null);
                        MediaResponse.OperationalUser operationUser22 = mediaResponse2.getOperationUser();
                        if (operationUser22 == null) {
                        }
                        gVar.f9651n = null;
                        gVar.f9652o = null;
                        gVar.f9655r = 2;
                        obj = eVar.S(id2, gVar);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f9653p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f9655r;
        if (i10 != 0) {
        }
        if (Td.e.M() != Dg.b.f2757b) {
        }
        return Unit.INSTANCE;
    }

    public final void G(Map message, boolean z10) {
        Map map;
        Intrinsics.checkNotNullParameter(message, "message");
        if (z10) {
            map = message;
        } else {
            Object obj = message.get("addInfo");
            Object d10 = AbstractC6574b.d(obj != null ? obj.toString() : null);
            Hashtable hashtable = d10 instanceof Hashtable ? (Hashtable) d10 : null;
            Object obj2 = hashtable != null ? hashtable.get("msg") : null;
            map = obj2 instanceof Hashtable ? (Hashtable) obj2 : null;
        }
        if (map != null) {
            Object obj3 = map.get("module");
            if (StringsKt.equals(obj3 instanceof String ? (String) obj3 : null, "media", true)) {
                Gson B10 = B();
                Gson B11 = B();
                Object obj4 = map.get("msg");
                if (obj4 == null) {
                    obj4 = map;
                }
                MediaResponse mediaResponse = (MediaResponse) AbstractC5895g.b(B10, B11.v(obj4), MediaResponse.class);
                if (mediaResponse != null) {
                    P(mediaResponse, Long.valueOf(og.i.q(String.valueOf(map.get("time")), -1L)), message, z10);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(MediaResponse mediaResponse, Continuation continuation) {
        i iVar;
        int i10;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f9659p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f9659p = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f9657n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = iVar.f9659p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(mediaResponse.getHold(), Boxing.boxBoolean(true))) {
                        L(mediaResponse);
                        return Unit.INSTANCE;
                    }
                    Function1 function1 = j.f9660d;
                    iVar.f9659p = 1;
                    if (V(mediaResponse, function1, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Td.e.f11456a.t0(Dg.b.f2760e);
                return Unit.INSTANCE;
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f9657n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = iVar.f9659p;
        if (i10 != 0) {
        }
        Td.e.f11456a.t0(Dg.b.f2760e);
        return Unit.INSTANCE;
    }

    public final void J(MediaResponse mediaResponse) {
        String x10;
        SalesIQChat.Extras extras;
        String str;
        SalesIQChat.Media media;
        String d10;
        Channel.CallConfigurations callConfigurations;
        SalesIQChat.Extras extras2;
        SalesIQChat.Extras.a aVar;
        String str2;
        SalesIQChat chatFromConversationId = y().getChatFromConversationId(mediaResponse.getConversationId());
        Td.e eVar = Td.e.f11456a;
        eVar.t0(Dg.b.f2761f);
        String str3 = null;
        Pe.b I10 = Te.a.I(chatFromConversationId != null ? chatFromConversationId.getConvID() : null);
        String conversationId = mediaResponse.getConversationId();
        String W10 = Td.e.W(I10, chatFromConversationId);
        if (!eVar.G() || !og.i.f(W10)) {
            W10 = null;
        }
        String str4 = (W10 == null && (W10 = Td.e.B()) == null) ? "" : W10;
        if (chatFromConversationId == null || (extras2 = chatFromConversationId.getExtras()) == null || (aVar = extras2.attributes) == null || (str2 = aVar.additionalInfo) == null || (x10 = og.m.d(str2)) == null) {
            if (chatFromConversationId != null && (extras = chatFromConversationId.getExtras()) != null) {
                extras.getCall();
            }
            x10 = Td.e.x(I10, chatFromConversationId);
        }
        Td.e.W0(conversationId, null, str4, null, null, x10, Boolean.TRUE, 26, null);
        Channel r10 = x().r();
        String appName = (r10 == null || (callConfigurations = r10.getCallConfigurations()) == null) ? null : callConfigurations.getAppName();
        String str5 = appName == null ? "" : appName;
        String e10 = MobilistenUtil.e();
        String packageName = u().getPackageName();
        MediaResponse.RTCPCredential rtcpCredential = mediaResponse.getRtcpCredential();
        String clientOtp = rtcpCredential != null ? rtcpCredential.getClientOtp() : null;
        MediaResponse.RTCPCredential rtcpCredential2 = mediaResponse.getRtcpCredential();
        String conferenceKey = rtcpCredential2 != null ? rtcpCredential2.getConferenceKey() : null;
        MediaResponse.RTCPCredential rtcpCredential3 = mediaResponse.getRtcpCredential();
        String userId = rtcpCredential3 != null ? rtcpCredential3.getUserId() : null;
        String mediaId = mediaResponse.getMediaId();
        String conversationId2 = mediaResponse.getConversationId();
        String recordingType = mediaResponse.getRecordingType();
        if (recordingType == null || (d10 = og.m.d(recordingType)) == null) {
            if (chatFromConversationId != null && (media = chatFromConversationId.getMedia()) != null) {
                str3 = media.recordingType;
            }
            str = str3;
        } else {
            str = d10;
        }
        String d11 = sd.d.d();
        Intrinsics.checkNotNull(d11);
        eVar.l0(new Cg.c(str5, e10, packageName, clientOtp, conferenceKey, userId, conversationId2, mediaId, "", str, false, d11, 1024, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(MediaResponse mediaResponse, Long l10, Continuation continuation) {
        k kVar;
        int i10;
        String chid;
        com.google.gson.k d10;
        com.google.gson.h r10;
        com.google.gson.k d11;
        com.google.gson.k d12;
        com.google.gson.h r11;
        Dg.b bVar;
        Object updateConversation;
        com.google.gson.h r12;
        String f10;
        com.google.gson.h B10;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f9663p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f9663p = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f9661n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = kVar.f9663p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    mediaResponse.getMediaId();
                    mediaResponse.getConversationId();
                    Td.e.K0(Td.e.f11456a, mediaResponse.getMediaId(), false, 2, null);
                    SalesIQChat chatFromConversationId = y().getChatFromConversationId(mediaResponse.getConversationId());
                    if (chatFromConversationId != null && (chid = chatFromConversationId.getChid()) != null) {
                        SalesIQChat.Media media = chatFromConversationId.getMedia();
                        com.google.gson.k d13 = (media == null || (B10 = B().B(media)) == null) ? null : AbstractC5896h.d(B10);
                        if (d13 != null && !R(d13)) {
                            com.google.gson.h B11 = B().B(mediaResponse);
                            Intrinsics.checkNotNullExpressionValue(B11, "toJsonTree(...)");
                            com.google.gson.k d14 = AbstractC5896h.d(B11);
                            if (d14 != null) {
                                com.google.gson.h r13 = d14.r("operation");
                                if (r13 != null && (f10 = AbstractC5896h.f(r13)) != null) {
                                    d14.p("status", f10);
                                }
                                d14.o("end_time", l10);
                                d14.p("ended_by", Intrinsics.areEqual(mediaResponse.getPerformedByVisitor(), Boxing.boxBoolean(true)) ? "visitor" : "operator");
                            } else {
                                d14 = null;
                            }
                            Set<Map.Entry> q10 = d13.q();
                            if (q10 != null) {
                                for (Map.Entry entry : q10) {
                                    if (d14 != null) {
                                        String str = (String) entry.getKey();
                                        com.google.gson.h r14 = d14.r((String) entry.getKey());
                                        if (r14 == null || (r14 instanceof com.google.gson.j)) {
                                            r14 = null;
                                        }
                                        if (r14 == null) {
                                            r14 = d13.r((String) entry.getKey());
                                        }
                                        d14.m(str, r14);
                                    }
                                }
                            }
                            if (d14 != null && (d10 = AbstractC5896h.d(d14)) != null && (r10 = d10.r("end_time")) != null && (!(r10 instanceof com.google.gson.j)) && (((d11 = AbstractC5896h.d(d14)) != null && (r12 = d11.r("connected_time")) != null && (!(r12 instanceof com.google.gson.j))) || ((d12 = AbstractC5896h.d(d14)) != null && (r11 = d12.r("pickup_time")) != null && (!(r11 instanceof com.google.gson.j))))) {
                                ConversationsLocalDataSource y10 = y();
                                String hVar = d14.toString();
                                kVar.f9663p = 1;
                                k kVar2 = kVar;
                                bVar = null;
                                updateConversation = y10.updateConversation(chid, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : hVar, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, kVar2);
                                if (updateConversation == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Ud.a.f12180a.a(bVar, Dg.a.f2753g);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bVar = null;
                Ud.a.f12180a.a(bVar, Dg.a.f2753g);
                return Unit.INSTANCE;
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f9661n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = kVar.f9663p;
        if (i10 != 0) {
        }
        bVar = null;
        Ud.a.f12180a.a(bVar, Dg.a.f2753g);
        return Unit.INSTANCE;
    }

    public final void L(MediaResponse mediaResponse) {
        Td.e.f11456a.t0(Intrinsics.areEqual(mediaResponse.getHold(), Boolean.TRUE) ? Dg.b.f2767l : mediaResponse.getOperatorOnTransfer() == MediaResponse.OperatorOnTransfer.Retain ? Dg.b.f2758c : Dg.b.f2760e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0093  */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.zoho.livechat.android.models.SalesIQChat] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(MediaResponse mediaResponse, Continuation continuation) {
        l lVar;
        int i10;
        Ref.ObjectRef objectRef;
        l lVar2;
        Object obj;
        a aVar;
        MediaResponse mediaResponse2;
        Ref.ObjectRef objectRef2;
        String chid;
        int i11;
        Object updateConversation;
        MediaResponse mediaResponse3;
        m mVar;
        Ref.ObjectRef objectRef3;
        MediaResponse mediaResponse4;
        a aVar2;
        MediaResponse mediaResponse5;
        a aVar3;
        CallStatus callStatus;
        String W10;
        MediaResponse.OperationalUser operationUser;
        String str;
        String str2;
        String B10;
        Object Q10;
        Object obj2;
        String status;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i12 = lVar.f9670t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lVar.f9670t = i12 - Integer.MIN_VALUE;
                Object obj3 = lVar.f9668r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = lVar.f9670t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (Td.e.m0()) {
                        if (mediaResponse.getMediaId() != null && !Intrinsics.areEqual(Td.e.K(), mediaResponse.getConversationId())) {
                            Xd.d E10 = E();
                            Dg.a aVar4 = Dg.a.f2752f;
                            String conversationId = mediaResponse.getConversationId();
                            String mediaId = mediaResponse.getMediaId();
                            lVar.f9670t = 1;
                            if (E10.a(aVar4, conversationId, mediaId, lVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        LiveChatUtil.log("CallsEventHandler: Call already in progress, rejecting new call. Media Id: " + mediaResponse.getMediaId() + ", Conversation Id: " + mediaResponse.getConversationId() + ", Current Call Conversation Id: " + Td.e.K());
                        return Unit.INSTANCE;
                    }
                    objectRef = new Ref.ObjectRef();
                    ?? chatFromConversationId = y().getChatFromConversationId(mediaResponse.getConversationId());
                    objectRef.element = chatFromConversationId;
                    if (chatFromConversationId == 0 || (chid = chatFromConversationId.getChid()) == null) {
                        lVar2 = lVar;
                        obj = coroutine_suspended;
                        aVar = this;
                        mediaResponse2 = mediaResponse;
                        objectRef2 = objectRef;
                        if (aVar.s((SalesIQChat) objectRef2.element)) {
                        }
                    } else {
                        ConversationsLocalDataSource y10 = y();
                        Long boxLong = Boxing.boxLong(0L);
                        Long boxLong2 = Boxing.boxLong(0L);
                        lVar.f9664n = this;
                        lVar.f9665o = mediaResponse;
                        lVar.f9666p = objectRef;
                        lVar.f9667q = chid;
                        lVar.f9670t = 2;
                        l lVar3 = lVar;
                        i11 = 3;
                        obj = coroutine_suspended;
                        updateConversation = y10.updateConversation(chid, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : boxLong, (r39 & 1024) != 0 ? null : boxLong2, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, lVar3);
                        lVar2 = lVar3;
                        if (updateConversation == obj) {
                            return obj;
                        }
                        aVar = this;
                        mediaResponse3 = mediaResponse;
                        SalesIQChat salesIQChat = (SalesIQChat) objectRef.element;
                        aVar.U(chid, salesIQChat == null ? salesIQChat.getConvID() : null, "endchattimer");
                        mVar = new m(mediaResponse3);
                        lVar2.f9664n = aVar;
                        lVar2.f9665o = mediaResponse3;
                        lVar2.f9666p = objectRef;
                        lVar2.f9667q = null;
                        lVar2.f9670t = i11;
                        if (aVar.V(mediaResponse3, mVar, lVar2) != obj) {
                        }
                    }
                } else {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    }
                    if (i10 == 2) {
                        chid = (String) lVar.f9667q;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) lVar.f9666p;
                        mediaResponse3 = (MediaResponse) lVar.f9665o;
                        a aVar5 = (a) lVar.f9664n;
                        ResultKt.throwOnFailure(obj3);
                        lVar2 = lVar;
                        obj = coroutine_suspended;
                        i11 = 3;
                        objectRef = objectRef4;
                        aVar = aVar5;
                        SalesIQChat salesIQChat2 = (SalesIQChat) objectRef.element;
                        aVar.U(chid, salesIQChat2 == null ? salesIQChat2.getConvID() : null, "endchattimer");
                        mVar = new m(mediaResponse3);
                        lVar2.f9664n = aVar;
                        lVar2.f9665o = mediaResponse3;
                        lVar2.f9666p = objectRef;
                        lVar2.f9667q = null;
                        lVar2.f9670t = i11;
                        if (aVar.V(mediaResponse3, mVar, lVar2) != obj) {
                            return obj;
                        }
                        objectRef2 = objectRef;
                        mediaResponse2 = mediaResponse3;
                        if (aVar.s((SalesIQChat) objectRef2.element)) {
                        }
                    } else if (i10 == 3) {
                        objectRef2 = (Ref.ObjectRef) lVar.f9666p;
                        mediaResponse2 = (MediaResponse) lVar.f9665o;
                        aVar = (a) lVar.f9664n;
                        ResultKt.throwOnFailure(obj3);
                        lVar2 = lVar;
                        obj = coroutine_suspended;
                        if (aVar.s((SalesIQChat) objectRef2.element)) {
                            objectRef3 = objectRef2;
                            mediaResponse4 = mediaResponse2;
                            aVar2 = aVar;
                            Xd.a w10 = aVar2.w();
                            String mediaId2 = mediaResponse4.getMediaId();
                            lVar2.f9664n = aVar2;
                            lVar2.f9665o = mediaResponse4;
                            lVar2.f9666p = objectRef3;
                            lVar2.f9670t = 5;
                            obj3 = w10.a(mediaId2, lVar2);
                            if (obj3 != obj) {
                            }
                        } else {
                            n nVar = new n(objectRef2, aVar, mediaResponse2, null);
                            lVar2.f9664n = aVar;
                            lVar2.f9665o = mediaResponse2;
                            lVar2.f9666p = objectRef2;
                            lVar2.f9670t = 4;
                            if (h1.d(30000L, nVar, lVar2) == obj) {
                                return obj;
                            }
                            mediaResponse5 = mediaResponse2;
                            aVar2 = aVar;
                            if (aVar2.s((SalesIQChat) objectRef2.element)) {
                            }
                        }
                    } else {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            objectRef3 = (Ref.ObjectRef) lVar.f9666p;
                            mediaResponse4 = (MediaResponse) lVar.f9665o;
                            aVar3 = (a) lVar.f9664n;
                            ResultKt.throwOnFailure(obj3);
                            callStatus = (CallStatus) ((C5582a) obj3).b();
                            if (callStatus == null && (status = callStatus.getStatus()) != null && CollectionsKt.listOf((Object[]) new String[]{ViewProps.END, "miss", "cancel"}).contains(status)) {
                                return Unit.INSTANCE;
                            }
                            SalesIQChat salesIQChat3 = (SalesIQChat) objectRef3.element;
                            Pe.b I10 = Te.a.I(salesIQChat3 == null ? salesIQChat3.getConvID() : null);
                            Td.e eVar = Td.e.f11456a;
                            eVar.s();
                            W10 = Td.e.W(I10, (SalesIQChat) objectRef3.element);
                            if (W10 != null || (B10 = og.m.d(W10)) == null) {
                                operationUser = mediaResponse4.getOperationUser();
                                if (operationUser != null || (str = operationUser.getName()) == null || !eVar.G() || str.length() <= 0) {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = str;
                                    Q10 = Td.e.Q(I10, (SalesIQChat) objectRef3.element);
                                    Td.e.x0(eVar, mediaResponse4.getMediaId(), str2, Td.e.x(I10, (SalesIQChat) objectRef3.element), mediaResponse4.getConversationId(), Q10 != null ? aVar3.A((SalesIQChat) objectRef3.element) : Q10, null, null, false, 96, null);
                                    if (Q10 != null) {
                                        obj2 = null;
                                        AbstractC1459k.d(aVar3.t(), null, null, new p(mediaResponse4, null), 3, null);
                                    } else {
                                        obj2 = null;
                                    }
                                    Td.e.E0(eVar, aVar3.u(), false, 2, obj2);
                                    Q.f44447F.f44471f = mediaResponse4.getMediaId();
                                    Td.e.U0(eVar.c0());
                                    if (aVar3.x().I() != null) {
                                        mediaResponse4.getMediaId();
                                    }
                                    return Unit.INSTANCE;
                                }
                                B10 = Td.e.B();
                                if (B10 == null) {
                                    return Unit.INSTANCE;
                                }
                            }
                            str2 = B10;
                            Q10 = Td.e.Q(I10, (SalesIQChat) objectRef3.element);
                            Td.e.x0(eVar, mediaResponse4.getMediaId(), str2, Td.e.x(I10, (SalesIQChat) objectRef3.element), mediaResponse4.getConversationId(), Q10 != null ? aVar3.A((SalesIQChat) objectRef3.element) : Q10, null, null, false, 96, null);
                            if (Q10 != null) {
                            }
                            Td.e.E0(eVar, aVar3.u(), false, 2, obj2);
                            Q.f44447F.f44471f = mediaResponse4.getMediaId();
                            Td.e.U0(eVar.c0());
                            if (aVar3.x().I() != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        objectRef2 = (Ref.ObjectRef) lVar.f9666p;
                        mediaResponse5 = (MediaResponse) lVar.f9665o;
                        aVar2 = (a) lVar.f9664n;
                        ResultKt.throwOnFailure(obj3);
                        lVar2 = lVar;
                        obj = coroutine_suspended;
                        if (aVar2.s((SalesIQChat) objectRef2.element)) {
                            LiveChatUtil.log("Invite call failed, chat not found or closed. Conversation Id: " + mediaResponse5.getConversationId());
                            return Unit.INSTANCE;
                        }
                        SalesIQChat salesIQChat4 = (SalesIQChat) objectRef2.element;
                        if ((salesIQChat4 != null ? salesIQChat4.getChid() : null) != null) {
                            AbstractC1459k.d(aVar2.t(), null, null, aVar2.new o(objectRef2, mediaResponse5, null), 3, null);
                        }
                        objectRef3 = objectRef2;
                        mediaResponse4 = mediaResponse5;
                        Xd.a w102 = aVar2.w();
                        String mediaId22 = mediaResponse4.getMediaId();
                        lVar2.f9664n = aVar2;
                        lVar2.f9665o = mediaResponse4;
                        lVar2.f9666p = objectRef3;
                        lVar2.f9670t = 5;
                        obj3 = w102.a(mediaId22, lVar2);
                        if (obj3 != obj) {
                            return obj;
                        }
                        aVar3 = aVar2;
                        callStatus = (CallStatus) ((C5582a) obj3).b();
                        if (callStatus == null) {
                        }
                        SalesIQChat salesIQChat32 = (SalesIQChat) objectRef3.element;
                        Pe.b I102 = Te.a.I(salesIQChat32 == null ? salesIQChat32.getConvID() : null);
                        Td.e eVar2 = Td.e.f11456a;
                        eVar2.s();
                        W10 = Td.e.W(I102, (SalesIQChat) objectRef3.element);
                        if (W10 != null) {
                        }
                        operationUser = mediaResponse4.getOperationUser();
                        if (operationUser != null) {
                        }
                        str = null;
                        if (str == null) {
                        }
                    }
                }
            }
        }
        lVar = new l(continuation);
        Object obj32 = lVar.f9668r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = lVar.f9670t;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r23.getOperationUser().getId(), x().V()) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(MediaResponse mediaResponse, Long l10, Map map, boolean z10, Continuation continuation) {
        SalesIQChat salesIQChat;
        String chid;
        Object updateConversation;
        String f10;
        com.google.gson.h B10;
        SalesIQChat chatFromConversationId;
        if (!z10) {
            if (!Intrinsics.areEqual(mediaResponse.getPerformedByVisitor(), Boxing.boxBoolean(false))) {
                MediaResponse.OperationalUser operationUser = mediaResponse.getOperationUser();
                if ((operationUser != null ? operationUser.getId() : null) != null) {
                }
            }
            O(mediaResponse);
            if (mediaResponse.getOperation() != MediaResponse.Operation.Cancel) {
                if (mediaResponse.getOperation() == MediaResponse.Operation.Miss && (chatFromConversationId = y().getChatFromConversationId(mediaResponse.getConversationId())) != null) {
                    Application u10 = u();
                    String chid2 = chatFromConversationId.getChid();
                    String convID = chatFromConversationId.getConvID();
                    MediaResponse.OperationalUser operationUser2 = mediaResponse.getOperationUser();
                    String name = operationUser2 != null ? operationUser2.getName() : null;
                    if (!og.i.f(name)) {
                        name = null;
                    }
                    if (name == null) {
                        name = chatFromConversationId.getAttenderName();
                    }
                    AbstractC5884j.l(u10, chid2, convID, name, map, false);
                }
                salesIQChat = null;
                if (mediaResponse.getOperation() == MediaResponse.Operation.Cancel) {
                }
                return Unit.INSTANCE;
            }
            salesIQChat = y().getChatFromConversationId(mediaResponse.getConversationId());
            if (salesIQChat != null) {
                Application u11 = u();
                String chid3 = salesIQChat.getChid();
                String convID2 = salesIQChat.getConvID();
                MediaResponse.OperationalUser operationUser3 = mediaResponse.getOperationUser();
                String name2 = operationUser3 != null ? operationUser3.getName() : null;
                if (!og.i.f(name2)) {
                    name2 = null;
                }
                if (name2 == null) {
                    name2 = salesIQChat.getAttenderName();
                }
                AbstractC5884j.j(u11, chid3, convID2, name2, map, false);
            }
            if (mediaResponse.getOperation() == MediaResponse.Operation.Cancel) {
                if (salesIQChat == null) {
                    salesIQChat = y().getChatFromConversationId(mediaResponse.getConversationId());
                }
                if (salesIQChat != null && (chid = salesIQChat.getChid()) != null) {
                    SalesIQChat.Media media = salesIQChat.getMedia();
                    com.google.gson.k d10 = (media == null || (B10 = B().B(media)) == null) ? null : AbstractC5896h.d(B10);
                    if (d10 != null && !R(d10)) {
                        com.google.gson.h B11 = B().B(mediaResponse);
                        Intrinsics.checkNotNullExpressionValue(B11, "toJsonTree(...)");
                        com.google.gson.k d11 = AbstractC5896h.d(B11);
                        if (d11 != null) {
                            com.google.gson.h r10 = d11.r("operation");
                            if (r10 != null && (f10 = AbstractC5896h.f(r10)) != null) {
                                d11.p("status", f10);
                            }
                            d11.o("end_time", l10);
                        } else {
                            d11 = null;
                        }
                        Set<Map.Entry> q10 = d10.q();
                        if (q10 != null) {
                            for (Map.Entry entry : q10) {
                                if (d11 != null) {
                                    String str = (String) entry.getKey();
                                    com.google.gson.h r11 = d11.r((String) entry.getKey());
                                    if (r11 == null || (r11 instanceof com.google.gson.j)) {
                                        r11 = null;
                                    }
                                    if (r11 == null) {
                                        r11 = d10.r((String) entry.getKey());
                                    }
                                    d11.m(str, r11);
                                }
                            }
                        }
                        updateConversation = y().updateConversation(chid, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : String.valueOf(d11), (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
                        if (updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return updateConversation;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(Td.e.K(), mediaResponse.getConversationId()) && Intrinsics.areEqual(Td.e.L(), mediaResponse.getMediaId())) {
            O(mediaResponse);
        }
        salesIQChat = null;
        if (mediaResponse.getOperation() == MediaResponse.Operation.Cancel) {
        }
        return Unit.INSTANCE;
    }

    public final void P(MediaResponse mediaResponse, Long l10, Map map, boolean z10) {
        S(new q(mediaResponse, this, l10, map, z10, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(MediaResponse mediaResponse, Continuation continuation) {
        r rVar;
        int i10;
        a aVar;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i11 = rVar.f9702r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f9702r = i11 - Integer.MIN_VALUE;
                Object obj = rVar.f9700p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = rVar.f9702r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    s sVar = s.f9703d;
                    rVar.f9698n = this;
                    rVar.f9699o = mediaResponse;
                    rVar.f9702r = 1;
                    if (V(mediaResponse, sVar, rVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mediaResponse = (MediaResponse) rVar.f9699o;
                    aVar = (a) rVar.f9698n;
                    ResultKt.throwOnFailure(obj);
                }
                LiveChatUtil.log("PEX, Call rejected: " + mediaResponse.getMediaId() + ' ' + mediaResponse.getConversationId() + ' ' + Td.e.K() + ' ' + Td.e.L());
                if (mediaResponse.getConversationId() != null && Intrinsics.areEqual(Td.e.K(), mediaResponse.getConversationId()) && Intrinsics.areEqual(Td.e.L(), mediaResponse.getMediaId())) {
                    Td.e eVar = Td.e.f11456a;
                    eVar.t0(Dg.b.f2765j);
                    eVar.J0(mediaResponse.getMediaId(), false);
                    AbstractC1459k.d(aVar.t(), null, null, aVar.new t(mediaResponse, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }
        rVar = new r(continuation);
        Object obj2 = rVar.f9700p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = rVar.f9702r;
        if (i10 != 0) {
        }
        LiveChatUtil.log("PEX, Call rejected: " + mediaResponse.getMediaId() + ' ' + mediaResponse.getConversationId() + ' ' + Td.e.K() + ' ' + Td.e.L());
        if (mediaResponse.getConversationId() != null) {
            Td.e eVar2 = Td.e.f11456a;
            eVar2.t0(Dg.b.f2765j);
            eVar2.J0(mediaResponse.getMediaId(), false);
            AbstractC1459k.d(aVar.t(), null, null, aVar.new t(mediaResponse, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean R(com.google.gson.k kVar) {
        com.google.gson.h r10;
        String f10;
        return (kVar == null || (r10 = kVar.r("status")) == null || (f10 = AbstractC5896h.f(r10)) == null || !CollectionsKt.listOf((Object[]) new String[]{ViewProps.END, "miss", "cancel", "reject"}).contains(f10)) ? false : true;
    }

    public final void S(Function2 function2) {
        AbstractC1459k.d(t(), null, null, new u(function2, null), 3, null);
    }

    public final Object T(MediaResponse mediaResponse, Continuation continuation) {
        Object updateConversation;
        String visitorid;
        String wmsChatId = mediaResponse.getWmsChatId();
        String chatId = wmsChatId != null ? y().getChatId(wmsChatId) : null;
        SalesIQChat chat$default = ConversationsLocalDataSource.getChat$default(y(), chatId, false, 2, null);
        Td.e.W0(null, null, null, null, null, null, Boxing.boxBoolean(false), 63, null);
        if (chat$default != null && (visitorid = chat$default.getVisitorid()) != null) {
            Td.e.W0(visitorid, null, null, null, null, null, null, 126, null);
        }
        if ((chat$default != null ? chat$default.getChid() : null) != null) {
            ConversationsLocalDataSource y10 = y();
            String chid = chat$default.getChid();
            Long time = mediaResponse.getTime();
            Intrinsics.checkNotNull(chid);
            updateConversation = y10.updateConversation(chid, (r39 & 2) != 0 ? null : time, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : "chat", (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
            return updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConversation : Unit.INSTANCE;
        }
        LiveChatUtil.log("CallsEventHandler: Chat not found for conversationId: " + mediaResponse.getConversationId() + ' ' + chatId);
        return Unit.INSTANCE;
    }

    public final void U(String str, String str2, String str3) {
        if (str == null && str2 == null) {
            return;
        }
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        C1908a b10 = C1908a.b(e10);
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", str3);
        if (str != null) {
            intent.putExtra("chid", str);
            intent.putExtra("chat_id", str);
        }
        if (str2 != null) {
            intent.putExtra("acknowledgement_key", str2);
        }
        b10.d(intent);
    }

    public final Object V(MediaResponse mediaResponse, Function1 function1, Continuation continuation) {
        String chid;
        Object updateConversation;
        com.google.gson.h B10;
        SalesIQChat chatFromConversationId = y().getChatFromConversationId(mediaResponse.getConversationId());
        if (chatFromConversationId != null && (chid = chatFromConversationId.getChid()) != null) {
            SalesIQChat.Media media = chatFromConversationId.getMedia();
            com.google.gson.k d10 = (media == null || (B10 = B().B(media)) == null) ? null : AbstractC5896h.d(B10);
            if (d10 != null && !R(d10)) {
                com.google.gson.h B11 = B().B(mediaResponse);
                Intrinsics.checkNotNullExpressionValue(B11, "toJsonTree(...)");
                com.google.gson.k d11 = AbstractC5896h.d(B11);
                if (d11 != null) {
                    function1.invoke(d11);
                } else {
                    d11 = null;
                }
                Set<Map.Entry> q10 = d10.q();
                if (q10 != null) {
                    for (Map.Entry entry : q10) {
                        if (d11 != null) {
                            String str = (String) entry.getKey();
                            com.google.gson.h r10 = d11.r((String) entry.getKey());
                            if (r10 == null || (r10 instanceof com.google.gson.j)) {
                                r10 = null;
                            }
                            if (r10 == null) {
                                r10 = d10.r((String) entry.getKey());
                            }
                            d11.m(str, r10);
                        }
                    }
                }
                updateConversation = y().updateConversation(chid, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : String.valueOf(d11), (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, continuation);
                if (updateConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return updateConversation;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean s(SalesIQChat salesIQChat) {
        return (salesIQChat == null || salesIQChat.getStatus() == 4 || salesIQChat.getStatus() == 3) ? false : true;
    }

    public final P t() {
        return C6461a.f65810a.e();
    }

    public final Application u() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final Rd.a v() {
        return (Rd.a) this.f9642d.getValue();
    }

    public final Xd.a w() {
        return (Xd.a) this.f9645g.getValue();
    }

    public final Ae.a x() {
        return (Ae.a) this.f9641c.getValue();
    }

    public final ConversationsLocalDataSource y() {
        return (ConversationsLocalDataSource) this.f9639a.getValue();
    }

    public final Ie.a z() {
        return (Ie.a) this.f9640b.getValue();
    }
}
