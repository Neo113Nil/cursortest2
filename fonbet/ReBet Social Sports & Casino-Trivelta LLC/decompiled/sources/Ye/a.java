package Ye;

import Ph.AbstractC1440a0;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.L;
import Ph.M0;
import Ph.P;
import Sf.c;
import Uf.j;
import Ye.a;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.react.devsupport.StackTraceHelper;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.conversations.data.local.entities.Bot;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.triggers.domain.entities.Trigger;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import gf.C4378a;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import me.C5582a;
import od.t;
import og.i;
import rd.C6218a;
import td.C6461a;
import ve.InterfaceC6686a;
import we.d;
import we.e;
import xe.C6822a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14151a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f14152b = LazyKt.lazy(C0294a.f14155d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f14153c = LazyKt.lazy(b.f14156d);

    /* renamed from: d, reason: collision with root package name */
    public static boolean f14154d = true;

    /* renamed from: Ye.a$a, reason: collision with other inner class name */
    public static final class C0294a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0294a f14155d = new C0294a();

        public C0294a() {
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

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f14156d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.d invoke() {
            return new lf.d(a.f14151a.j());
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ boolean f14157A;

        /* renamed from: n, reason: collision with root package name */
        public Object f14158n;

        /* renamed from: o, reason: collision with root package name */
        public Object f14159o;

        /* renamed from: p, reason: collision with root package name */
        public Object f14160p;

        /* renamed from: q, reason: collision with root package name */
        public Object f14161q;

        /* renamed from: r, reason: collision with root package name */
        public int f14162r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f14163s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f14164t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f14165u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ZohoSalesIQ.l f14166v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f14167w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Activity f14168x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f14169y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f14170z;

        /* renamed from: Ye.a$c$a, reason: collision with other inner class name */
        public static final class C0295a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f14171n;

            public C0295a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0295a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0295a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14171n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LiveChatUtil.getAllOpenChatIds(SalesIQChat.c.Chat);
            }
        }

        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f14172n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f14173o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f14174p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Ref.ObjectRef objectRef, Continuation continuation) {
                super(2, continuation);
                this.f14173o = str;
                this.f14174p = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f14173o, this.f14174p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [T, com.zoho.livechat.android.models.SalesIQChat, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14172n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ?? chatWithAnyId = LiveChatUtil.getChatWithAnyId(this.f14173o);
                if (chatWithAnyId == 0) {
                    return null;
                }
                this.f14174p.element = chatWithAnyId;
                return chatWithAnyId;
            }
        }

        /* renamed from: Ye.a$c$c, reason: collision with other inner class name */
        public static final class C0296c extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f14175n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f14176o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0296c(Ref.ObjectRef objectRef, Continuation continuation) {
                super(2, continuation);
                this.f14176o = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0296c(this.f14176o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0296c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14175n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LiveChatUtil.getChat(!((Collection) this.f14176o.element).isEmpty() ? (String) ((List) this.f14176o.element).get(0) : "temp_chid");
            }
        }

        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Trigger.Type.values().length];
                try {
                    iArr[Trigger.Type.SendChatInvite.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final class e extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f14177n;

            public e(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new e(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14177n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LiveChatUtil.getAllOpenChatIds(SalesIQChat.c.Chat);
            }
        }

        public static final class f extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f14178n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ZohoSalesIQ.l f14179o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f14180p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Intent f14181q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Activity f14182r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f14183s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f14184t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ boolean f14185u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f14186v;

            /* renamed from: Ye.a$c$f$a, reason: collision with other inner class name */
            public static final class C0297a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f14187n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC6686a f14188o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0297a(InterfaceC6686a interfaceC6686a, Continuation continuation) {
                    super(2, continuation);
                    this.f14188o = interfaceC6686a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0297a(this.f14188o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0297a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f14187n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InterfaceC6686a interfaceC6686a = this.f14188o;
                    if (interfaceC6686a == null) {
                        return null;
                    }
                    interfaceC6686a.a(we.e.f67680b.a(we.d.f67670u));
                    return Unit.INSTANCE;
                }
            }

            public static final class b extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f14189n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC6686a f14190o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ C5582a f14191p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InterfaceC6686a interfaceC6686a, C5582a c5582a, Continuation continuation) {
                    super(2, continuation);
                    this.f14190o = interfaceC6686a;
                    this.f14191p = c5582a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new b(this.f14190o, this.f14191p, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    we.d dVar;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f14189n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InterfaceC6686a interfaceC6686a = this.f14190o;
                    if (interfaceC6686a == null) {
                        return null;
                    }
                    e.a aVar = we.e.f67680b;
                    C5582a.b c10 = this.f14191p.c();
                    if ((c10 != null ? c10.b() : null) != null) {
                        C5582a.b c11 = this.f14191p.c();
                        Intrinsics.checkNotNull(c11);
                        Integer b10 = c11.b();
                        Intrinsics.checkNotNull(b10);
                        int intValue = b10.intValue();
                        C5582a.b c12 = this.f14191p.c();
                        Intrinsics.checkNotNull(c12);
                        dVar = new d.b(intValue, c12.c());
                    } else {
                        dVar = we.d.f67666q;
                    }
                    interfaceC6686a.a(aVar.a(dVar));
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: Ye.a$c$f$c, reason: collision with other inner class name */
            public static final class C0298c extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f14192n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC6686a f14193o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ ZohoSalesIQ.l f14194p;

                /* renamed from: Ye.a$c$f$c$a, reason: collision with other inner class name */
                public /* synthetic */ class C0299a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ZohoSalesIQ.l.values().length];
                        try {
                            iArr[ZohoSalesIQ.l.Conversations.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0298c(InterfaceC6686a interfaceC6686a, ZohoSalesIQ.l lVar, Continuation continuation) {
                    super(2, continuation);
                    this.f14193o = interfaceC6686a;
                    this.f14194p = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0298c(this.f14193o, this.f14194p, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0298c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f14192n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InterfaceC6686a interfaceC6686a = this.f14193o;
                    if (interfaceC6686a == null) {
                        return null;
                    }
                    interfaceC6686a.a(we.e.f67680b.a(C0299a.$EnumSwitchMapping$0[this.f14194p.ordinal()] == 1 ? we.d.f67664o : we.d.f67662m));
                    return Unit.INSTANCE;
                }
            }

            public static final class d extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f14195n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Activity f14196o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ Intent f14197p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Activity activity, Intent intent, Continuation continuation) {
                    super(2, continuation);
                    this.f14196o = activity;
                    this.f14197p = intent;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new d(this.f14196o, this.f14197p, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f14195n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.f14196o.startActivity(this.f14197p);
                    return Unit.INSTANCE;
                }
            }

            public /* synthetic */ class e {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ZohoSalesIQ.l.values().length];
                    try {
                        iArr[ZohoSalesIQ.l.Conversations.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ZohoSalesIQ.l.FAQ.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ZohoSalesIQ.l.KnowledgeBase.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(ZohoSalesIQ.l lVar, String str, Intent intent, Activity activity, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, boolean z10, InterfaceC6686a interfaceC6686a, Continuation continuation) {
                super(2, continuation);
                this.f14179o = lVar;
                this.f14180p = str;
                this.f14181q = intent;
                this.f14182r = activity;
                this.f14183s = objectRef;
                this.f14184t = booleanRef;
                this.f14185u = z10;
                this.f14186v = interfaceC6686a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new f(this.f14179o, this.f14180p, this.f14181q, this.f14182r, this.f14183s, this.f14184t, this.f14185u, this.f14186v, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:107:0x007b, code lost:
            
                if (Ph.AbstractC1455i.g(r12, r1, r11) == r0) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x00b7, code lost:
            
                if (r12 == r0) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0279, code lost:
            
                if (Ye.a.q(r12, r11) != r0) goto L142;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x00ff, code lost:
            
                if (Ph.AbstractC1455i.g(r12, r1, r11) == r0) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x0138, code lost:
            
                if (Ye.a.q(r12, r11) == r0) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0146, code lost:
            
                if (Ye.a.p(r12, r2, r11) == r0) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
            
                if (Ph.AbstractC1455i.g(r1, r2, r11) == r0) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x01d4, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r12 != null ? r12.getVisitorid() : null, Td.e.K()) != false) goto L107;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x026c, code lost:
            
                if (Ph.AbstractC1455i.g(r12, r1, r11) != r0) goto L139;
             */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01a8  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0206 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0221  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0229  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ZohoSalesIQ.l lVar;
                ZohoSalesIQ.l lVar2;
                ZohoSalesIQ.l lVar3;
                SalesIQChat chat;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.f14178n) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        ZohoSalesIQ.l lVar4 = this.f14179o;
                        if (lVar4 != null) {
                            boolean z10 = ((lVar4 == ZohoSalesIQ.l.KnowledgeBase || lVar4 == ZohoSalesIQ.l.FAQ) && LiveChatUtil.isArticlesEnabled()) || (this.f14179o == ZohoSalesIQ.l.Conversations && LiveChatUtil.isConversationEnabled());
                            if (!z10 && this.f14180p == null) {
                                M0 c10 = C1452g0.c();
                                C0298c c0298c = new C0298c(this.f14186v, this.f14179o, null);
                                this.f14178n = 6;
                                break;
                            } else {
                                if (z10) {
                                    this.f14181q.putExtra("tab", this.f14179o.name());
                                }
                                if (this.f14180p != null) {
                                    int i10 = e.$EnumSwitchMapping$0[this.f14179o.ordinal()];
                                    if (i10 == 1) {
                                        SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(this.f14180p);
                                        if (chatWithAnyId != null) {
                                            if (chatWithAnyId.getType() != SalesIQChat.c.Chat) {
                                                if (!Intrinsics.areEqual(Td.e.K(), chatWithAnyId.getVisitorid())) {
                                                    InterfaceC6686a interfaceC6686a = this.f14186v;
                                                    we.d dVar = we.d.f67654f0;
                                                    this.f14178n = 3;
                                                    break;
                                                } else {
                                                    Td.e.r0(this.f14182r);
                                                    InterfaceC6686a interfaceC6686a2 = this.f14186v;
                                                    this.f14178n = 2;
                                                    break;
                                                }
                                            } else {
                                                this.f14181q.putExtra("open_chat_window", true);
                                                this.f14181q.putExtra("chid", chatWithAnyId.getChid());
                                            }
                                        } else {
                                            M0 c11 = C1452g0.c();
                                            C0297a c0297a = new C0297a(this.f14186v, null);
                                            this.f14178n = 1;
                                            break;
                                        }
                                    } else if (i10 == 2 || i10 == 3) {
                                        lf.d k10 = a.f14151a.k();
                                        String str = this.f14180p;
                                        this.f14178n = 4;
                                        obj = k10.h(str, true, this);
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.f14181q.setFlags(268435456);
                        if (((List) this.f14183s.element).size() != 1 || this.f14184t.element) {
                            lVar = this.f14179o;
                            lVar2 = ZohoSalesIQ.l.FAQ;
                            if (lVar != lVar2 || lVar == ZohoSalesIQ.l.KnowledgeBase || this.f14184t.element || ((List) this.f14183s.element).size() == 1 || !LiveChatUtil.isConversationEnabled()) {
                                lVar3 = this.f14179o;
                                if (lVar3 != lVar2 && lVar3 != ZohoSalesIQ.l.KnowledgeBase) {
                                    if (Td.e.m0()) {
                                        if (((List) this.f14183s.element).size() == 1) {
                                            SalesIQChat chat2 = LiveChatUtil.getChat((String) CollectionsKt.firstOrNull((List) this.f14183s.element));
                                            break;
                                        }
                                        String onGoingChatId = LiveChatUtil.getOnGoingChatId();
                                        Intrinsics.checkNotNullExpressionValue(onGoingChatId, "getOnGoingChatId(...)");
                                        chat = LiveChatUtil.getChat(onGoingChatId);
                                        Ref.BooleanRef booleanRef = this.f14184t;
                                        booleanRef.element = !booleanRef.element && chat == null;
                                        C6218a.j0(true);
                                        if (!this.f14181q.hasExtra("chid")) {
                                            this.f14181q.putExtra("chid", onGoingChatId);
                                        }
                                        if (!this.f14185u || this.f14184t.element) {
                                            if (C6822a.s(com.zoho.livechat.android.modules.brand.ui.helpers.a.s(false, i.i(chat != null ? Boxing.boxBoolean(chat.isTriggeredChat()) : null), null, 4, null)) != null) {
                                                Channel m10 = C6822a.m();
                                                if ((m10 != null ? m10.getFormType() : null) == Form.Type.Traditional) {
                                                    this.f14181q.putExtra("can_skip_pre_chat_form", true);
                                                }
                                            }
                                        }
                                    }
                                    if (!((List) this.f14183s.element).isEmpty() || ((List) this.f14183s.element).size() == 1) {
                                        this.f14181q.putExtra("open_chat_window", true);
                                    }
                                    String onGoingChatId2 = LiveChatUtil.getOnGoingChatId();
                                    Intrinsics.checkNotNullExpressionValue(onGoingChatId2, "getOnGoingChatId(...)");
                                    chat = LiveChatUtil.getChat(onGoingChatId2);
                                    Ref.BooleanRef booleanRef2 = this.f14184t;
                                    booleanRef2.element = !booleanRef2.element && chat == null;
                                    C6218a.j0(true);
                                    if (!this.f14181q.hasExtra("chid")) {
                                    }
                                    if (!this.f14185u) {
                                    }
                                    if (C6822a.s(com.zoho.livechat.android.modules.brand.ui.helpers.a.s(false, i.i(chat != null ? Boxing.boxBoolean(chat.isTriggeredChat()) : null), null, 4, null)) != null) {
                                    }
                                }
                                M0 c12 = C1452g0.c();
                                d dVar2 = new d(this.f14182r, this.f14181q, null);
                                this.f14178n = 7;
                                break;
                            } else {
                                this.f14182r.startActivity(this.f14181q);
                            }
                        } else {
                            this.f14182r.startActivity(this.f14181q);
                        }
                        InterfaceC6686a interfaceC6686a3 = this.f14186v;
                        this.f14178n = 8;
                        break;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 2:
                    case 3:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        C5582a c5582a = (C5582a) obj;
                        if (c5582a.b() != null) {
                            this.f14181q.putExtra(StackTraceHelper.ID_KEY, this.f14180p);
                            this.f14181q.setFlags(268435456);
                            if (((List) this.f14183s.element).size() != 1) {
                                break;
                            }
                            lVar = this.f14179o;
                            lVar2 = ZohoSalesIQ.l.FAQ;
                            if (lVar != lVar2) {
                                break;
                            }
                            lVar3 = this.f14179o;
                            if (lVar3 != lVar2) {
                                if (Td.e.m0()) {
                                }
                                if (!((List) this.f14183s.element).isEmpty()) {
                                    break;
                                }
                                this.f14181q.putExtra("open_chat_window", true);
                                String onGoingChatId22 = LiveChatUtil.getOnGoingChatId();
                                Intrinsics.checkNotNullExpressionValue(onGoingChatId22, "getOnGoingChatId(...)");
                                chat = LiveChatUtil.getChat(onGoingChatId22);
                                Ref.BooleanRef booleanRef22 = this.f14184t;
                                booleanRef22.element = !booleanRef22.element && chat == null;
                                C6218a.j0(true);
                                if (!this.f14181q.hasExtra("chid")) {
                                }
                                if (!this.f14185u) {
                                }
                                if (C6822a.s(com.zoho.livechat.android.modules.brand.ui.helpers.a.s(false, i.i(chat != null ? Boxing.boxBoolean(chat.isTriggeredChat()) : null), null, 4, null)) != null) {
                                }
                                break;
                            }
                            M0 c122 = C1452g0.c();
                            d dVar22 = new d(this.f14182r, this.f14181q, null);
                            this.f14178n = 7;
                            break;
                        } else {
                            M0 c13 = C1452g0.c();
                            b bVar = new b(this.f14186v, c5582a, null);
                            this.f14178n = 5;
                            break;
                        }
                        break;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        InterfaceC6686a interfaceC6686a32 = this.f14186v;
                        this.f14178n = 8;
                        break;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        public static final class g extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f14198n;

            /* renamed from: o, reason: collision with root package name */
            public Object f14199o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f14200p;

            /* renamed from: q, reason: collision with root package name */
            public int f14201q;

            public g(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f14200p = obj;
                this.f14201q |= Integer.MIN_VALUE;
                return c.t(null, null, null, null, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, String str, ZohoSalesIQ.l lVar, InterfaceC6686a interfaceC6686a, Activity activity, boolean z12, Function1 function1, boolean z13, Continuation continuation) {
            super(2, continuation);
            this.f14163s = z10;
            this.f14164t = z11;
            this.f14165u = str;
            this.f14166v = lVar;
            this.f14167w = interfaceC6686a;
            this.f14168x = activity;
            this.f14169y = z12;
            this.f14170z = function1;
            this.f14157A = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void m(Ref.BooleanRef booleanRef, Intent intent, Ref.ObjectRef objectRef, InterfaceC6686a interfaceC6686a, boolean z10, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Activity activity, we.e eVar) {
            booleanRef.element = booleanRef.element && eVar.d() && Intrinsics.areEqual(eVar.b(), Boolean.TRUE);
            if (eVar.d() && Intrinsics.areEqual(eVar.b(), Boolean.TRUE)) {
                a.n(intent, z10, (WaitingChatDetails) objectRef.element);
            }
            p(intent, objectRef2, objectRef3, booleanRef, activity);
            if (interfaceC6686a != null) {
                interfaceC6686a.a(we.e.f67680b.b(Unit.INSTANCE));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void o(Ref.BooleanRef booleanRef, Intent intent, Ref.ObjectRef objectRef, String str, boolean z10, ZohoSalesIQ.l lVar, Activity activity, Ref.ObjectRef objectRef2, boolean z11, InterfaceC6686a interfaceC6686a, we.e eVar) {
            String str2;
            String str3;
            booleanRef.element = booleanRef.element && eVar.d() && Intrinsics.areEqual(eVar.b(), Boolean.TRUE);
            if (eVar.d()) {
                if (Intrinsics.areEqual(eVar.b(), Boolean.TRUE)) {
                    a.n(intent, z10, (WaitingChatDetails) objectRef.element);
                }
            } else if (Intrinsics.areEqual(eVar.c(), we.d.f67671v)) {
                SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(str);
                intent.putExtra("open_chat_window", true);
                if (chatWithAnyId == null || (str2 = chatWithAnyId.getChid()) == null) {
                    str2 = str;
                }
                intent.putExtra("chid", str2);
                if (chatWithAnyId == null || (str3 = chatWithAnyId.getConvID()) == null) {
                    str3 = str;
                }
                intent.putExtra("acknowledgement_key", str3);
            }
            r(lVar, str, intent, activity, objectRef2, booleanRef, z11, interfaceC6686a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void p(Intent intent, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.BooleanRef booleanRef, Activity activity) {
            if (!intent.hasExtra("chid")) {
                intent.putExtra("chid", (String) objectRef.element);
            }
            T t10 = objectRef2.element;
            if (t10 != 0 || booleanRef.element) {
                SalesIQChat salesIQChat = (SalesIQChat) t10;
                if (C6822a.s(com.zoho.livechat.android.modules.brand.ui.helpers.a.s(false, i.i(salesIQChat != null ? Boolean.valueOf(salesIQChat.isTriggeredChat()) : null), null, 4, null)) != null) {
                    Channel m10 = C6822a.m();
                    if ((m10 != null ? m10.getFormType() : null) == Form.Type.Traditional) {
                        intent.putExtra("can_skip_pre_chat_form", true);
                    }
                }
            }
            intent.setFlags(268435456);
            activity.startActivity(intent);
        }

        public static final void r(ZohoSalesIQ.l lVar, String str, Intent intent, Activity activity, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, boolean z10, InterfaceC6686a interfaceC6686a) {
            AbstractC1459k.d(a.f14151a.i(), null, null, new f(lVar, str, intent, activity, objectRef, booleanRef, z10, interfaceC6686a, null), 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails, java.lang.Object] */
        public static final boolean s(Ref.ObjectRef objectRef, String str, Ref.BooleanRef booleanRef) {
            Tf.b bVar = Tf.b.f11754a;
            Trigger A10 = Tf.b.A(bVar, Rf.a.Clicked, null, null, 6, null);
            if (A10 == null) {
                return false;
            }
            Trigger.Params params = A10.getParams();
            Trigger.Params.Attender attender = params != null ? params.getAttender() : null;
            Trigger.Type type = A10.getType();
            if ((type == null ? -1 : d.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
                ?? waitingChatDetails = new WaitingChatDetails(attender != null ? attender.getId() : null, attender != null ? attender.getDisplayName() : null, !(attender != null ? Intrinsics.areEqual(attender.isBot(), Boolean.TRUE) : false), str, null);
                objectRef.element = waitingChatDetails;
                Intrinsics.checkNotNull(waitingChatDetails);
                bVar.e(waitingChatDetails);
            } else {
                booleanRef.element = false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object t(Function1 function1, String str, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Continuation continuation) {
            g gVar;
            int i10;
            C5582a c5582a;
            Function1 function12 = function1;
            Ref.BooleanRef booleanRef2 = booleanRef;
            if (continuation instanceof g) {
                gVar = (g) continuation;
                int i11 = gVar.f14201q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    gVar.f14201q = i11 - Integer.MIN_VALUE;
                    Object obj = gVar.f14200p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = gVar.f14201q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!s(objectRef, str, booleanRef2)) {
                            if (function12 != null) {
                                function12.invoke(Boxing.boxBoolean(true));
                            }
                            Tf.b bVar = Tf.b.f11754a;
                            Rf.a aVar = Rf.a.Clicked;
                            String a10 = ZohoSalesIQ.m.a(j.n());
                            String language = LiveChatUtil.getLanguage();
                            gVar.f14198n = function12;
                            gVar.f14199o = booleanRef2;
                            gVar.f14201q = 1;
                            Object F10 = Tf.b.F(bVar, aVar, null, null, str, a10, language, false, false, false, false, false, gVar, 1920, null);
                            if (F10 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = F10;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) gVar.f14199o;
                    Function1 function13 = (Function1) gVar.f14198n;
                    ResultKt.throwOnFailure(obj);
                    booleanRef2 = booleanRef3;
                    function12 = function13;
                    c5582a = (C5582a) obj;
                    if (!c5582a.d()) {
                        Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        booleanRef2.element = false;
                    }
                    if (function12 != null) {
                        function12.invoke(Boxing.boxBoolean(false));
                    }
                    return Unit.INSTANCE;
                }
            }
            gVar = new g(continuation);
            Object obj2 = gVar.f14200p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = gVar.f14201q;
            if (i10 != 0) {
            }
            c5582a = (C5582a) obj2;
            if (!c5582a.d()) {
            }
            if (function12 != null) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f14163s, this.f14164t, this.f14165u, this.f14166v, this.f14167w, this.f14168x, this.f14169y, this.f14170z, this.f14157A, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:109:0x0143, code lost:
        
            if (t(r2, r10, r8, r9, r26) == r1) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0147, code lost:
        
            r2 = r8;
            r8 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x015e, code lost:
        
            if (t(r2, r10, r8, r9, r26) == r1) goto L87;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x02c7  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x02e6  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00e6  */
        /* JADX WARN: Type inference failed for: r1v25, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Ref.BooleanRef booleanRef;
            Ref.ObjectRef objectRef2;
            T t10;
            boolean isTrackingEnabled;
            Ref.ObjectRef objectRef3;
            String str;
            Ref.ObjectRef objectRef4;
            Object g10;
            final Ref.ObjectRef objectRef5;
            Ref.ObjectRef objectRef6;
            T t11;
            final boolean z10;
            Ref.ObjectRef objectRef7;
            Ref.BooleanRef booleanRef2;
            Object g11;
            Ref.ObjectRef objectRef8;
            Ref.BooleanRef booleanRef3;
            InterfaceC6686a interfaceC6686a;
            Ref.ObjectRef objectRef9;
            Object g12;
            Ref.ObjectRef objectRef10;
            T t12;
            T t13;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            String str2 = null;
            switch (this.f14162r) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                    booleanRef4.element = this.f14163s;
                    objectRef = new Ref.ObjectRef();
                    L b10 = C1452g0.b();
                    e eVar = new e(null);
                    this.f14158n = booleanRef4;
                    this.f14159o = objectRef;
                    this.f14160p = objectRef;
                    this.f14162r = 1;
                    Object g13 = AbstractC1455i.g(b10, eVar, this);
                    if (g13 != coroutine_suspended) {
                        booleanRef = booleanRef4;
                        objectRef2 = objectRef;
                        t10 = g13;
                        Intrinsics.checkNotNullExpressionValue(t10, "withContext(...)");
                        objectRef2.element = t10;
                        booleanRef.element = !booleanRef.element && ((List) objectRef.element).isEmpty();
                        isTrackingEnabled = UTSUtil.isTrackingEnabled();
                        objectRef3 = new Ref.ObjectRef();
                        if (isTrackingEnabled || this.f14164t) {
                            str = this.f14165u;
                            if (str != null || this.f14166v != ZohoSalesIQ.l.Conversations) {
                                str = null;
                            }
                            if (str == null) {
                                if (isTrackingEnabled) {
                                    UTSUtil.updateSDKOpen(booleanRef.element);
                                } else if (booleanRef.element) {
                                    Tf.b bVar = Tf.b.f11754a;
                                    Rf.a aVar = Rf.a.Clicked;
                                    Trigger A10 = Tf.b.A(bVar, aVar, null, c.a.Preferences, 2, null);
                                    if (A10 == null) {
                                        Function1 function1 = this.f14170z;
                                        String str3 = this.f14165u;
                                        this.f14158n = booleanRef;
                                        this.f14159o = objectRef;
                                        this.f14160p = objectRef3;
                                        this.f14162r = 3;
                                        break;
                                    } else if (A10.getParams() != null) {
                                        Function1 function12 = this.f14170z;
                                        String str4 = this.f14165u;
                                        this.f14158n = booleanRef;
                                        this.f14159o = objectRef;
                                        this.f14160p = objectRef3;
                                        this.f14162r = 2;
                                        break;
                                    } else {
                                        A10.getAction();
                                        if (bVar.L()) {
                                            booleanRef.element = false;
                                        } else {
                                            Tf.b.H(aVar, LiveChatUtil.getLanguage(), false, null, null, null, ZohoSalesIQ.m.a(j.n()), true, false, 256, null);
                                            booleanRef.element = false;
                                        }
                                    }
                                    booleanRef = r8;
                                    objectRef3 = r2;
                                }
                            }
                        }
                        objectRef4 = objectRef;
                        L b11 = C1452g0.b();
                        C0295a c0295a = new C0295a(null);
                        this.f14158n = booleanRef;
                        this.f14159o = objectRef4;
                        this.f14160p = objectRef3;
                        this.f14161q = objectRef4;
                        this.f14162r = 4;
                        g10 = AbstractC1455i.g(b11, c0295a, this);
                        if (g10 != coroutine_suspended) {
                            objectRef5 = objectRef3;
                            objectRef6 = objectRef4;
                            t11 = g10;
                            Intrinsics.checkNotNullExpressionValue(t11, "withContext(...)");
                            objectRef4.element = t11;
                            if (!LiveChatUtil.isConversationEnabled() || LiveChatUtil.isArticlesEnabled()) {
                                final Intent intent = new Intent(this.f14168x, (Class<?>) SalesIQActivity.class);
                                z10 = this.f14169y;
                                if (z10) {
                                    final Ref.ObjectRef objectRef11 = objectRef6;
                                    final Ref.BooleanRef booleanRef5 = booleanRef;
                                    final String str5 = this.f14165u;
                                    if (str5 != null && this.f14166v == ZohoSalesIQ.l.Conversations) {
                                        str2 = str5;
                                    }
                                    final boolean z11 = this.f14157A;
                                    final ZohoSalesIQ.l lVar = this.f14166v;
                                    final Activity activity = this.f14168x;
                                    final InterfaceC6686a interfaceC6686a2 = this.f14167w;
                                    Te.a.C(str2, null, true, false, null, new InterfaceC6686a() { // from class: Ye.c
                                        @Override // ve.InterfaceC6686a
                                        public final void a(e eVar2) {
                                            a.c.o(Ref.BooleanRef.this, intent, objectRef5, str5, z11, lVar, activity, objectRef11, z10, interfaceC6686a2, eVar2);
                                        }
                                    }, 24, null);
                                } else {
                                    a.n(intent, this.f14157A, (WaitingChatDetails) objectRef5.element);
                                    r(this.f14166v, this.f14165u, intent, this.f14168x, objectRef6, booleanRef, this.f14169y, this.f14167w);
                                }
                                return Unit.INSTANCE;
                            }
                            objectRef7 = new Ref.ObjectRef();
                            ZohoSalesIQ.l lVar2 = this.f14166v;
                            if (lVar2 == ZohoSalesIQ.l.Conversations) {
                                if (i.f(this.f14165u)) {
                                    L b12 = C1452g0.b();
                                    b bVar2 = new b(this.f14165u, objectRef7, null);
                                    this.f14158n = booleanRef;
                                    this.f14159o = objectRef6;
                                    this.f14160p = objectRef5;
                                    this.f14161q = objectRef7;
                                    this.f14162r = 5;
                                    g11 = AbstractC1455i.g(b12, bVar2, this);
                                    if (g11 != coroutine_suspended) {
                                        objectRef8 = objectRef6;
                                        booleanRef3 = booleanRef;
                                        if (g11 != null) {
                                            Ref.BooleanRef booleanRef6 = booleanRef3;
                                            objectRef6 = objectRef8;
                                            booleanRef2 = booleanRef6;
                                            objectRef9 = objectRef5;
                                            L b13 = C1452g0.b();
                                            C0296c c0296c = new C0296c(objectRef6, null);
                                            this.f14158n = booleanRef2;
                                            this.f14159o = objectRef9;
                                            this.f14160p = objectRef7;
                                            this.f14161q = objectRef7;
                                            this.f14162r = 6;
                                            g12 = AbstractC1455i.g(b13, c0296c, this);
                                            if (g12 != coroutine_suspended) {
                                                objectRef10 = objectRef7;
                                                t12 = g12;
                                                final Ref.ObjectRef objectRef12 = objectRef9;
                                                final Ref.BooleanRef booleanRef7 = booleanRef2;
                                                objectRef10.element = t12;
                                                if (!LiveChatUtil.canAllowOpenChatActivityInOfflineState((SalesIQChat) objectRef7.element) || C6218a.c0()) {
                                                    final Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                                                    objectRef13.element = "temp_chid";
                                                    t13 = objectRef7.element;
                                                    if (t13 != 0) {
                                                        Intrinsics.checkNotNull(t13);
                                                        objectRef13.element = ((SalesIQChat) t13).getChid();
                                                        booleanRef7.element = false;
                                                    }
                                                    C6218a.j0(true);
                                                    final Intent intent2 = new Intent(this.f14168x, (Class<?>) ChatActivity.class);
                                                    if (this.f14169y) {
                                                        String str6 = this.f14165u;
                                                        if (str6 != null && this.f14166v == ZohoSalesIQ.l.Conversations) {
                                                            str2 = str6;
                                                        }
                                                        final InterfaceC6686a interfaceC6686a3 = this.f14167w;
                                                        final boolean z12 = this.f14157A;
                                                        final Activity activity2 = this.f14168x;
                                                        final Ref.ObjectRef objectRef14 = objectRef7;
                                                        Te.a.C(str2, null, true, false, null, new InterfaceC6686a() { // from class: Ye.b
                                                            @Override // ve.InterfaceC6686a
                                                            public final void a(e eVar2) {
                                                                a.c.m(Ref.BooleanRef.this, intent2, objectRef12, interfaceC6686a3, z12, objectRef13, objectRef14, activity2, eVar2);
                                                            }
                                                        }, 24, null);
                                                    } else {
                                                        a.n(intent2, this.f14157A, (WaitingChatDetails) objectRef12.element);
                                                        p(intent2, objectRef13, objectRef7, booleanRef7, this.f14168x);
                                                        InterfaceC6686a interfaceC6686a4 = this.f14167w;
                                                        if (interfaceC6686a4 != null) {
                                                            interfaceC6686a4.a(we.e.f67680b.b(Unit.INSTANCE));
                                                        }
                                                    }
                                                } else {
                                                    MobilistenUtil.w(t.f61107s, 0);
                                                    InterfaceC6686a interfaceC6686a5 = this.f14167w;
                                                    if (interfaceC6686a5 != null) {
                                                        interfaceC6686a5.a(we.e.f67680b.a(we.d.f67651e));
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                                interfaceC6686a = this.f14167w;
                                if (interfaceC6686a != null) {
                                    interfaceC6686a.a(we.e.f67680b.a(we.d.f67664o));
                                }
                                return Unit.INSTANCE;
                            }
                            if (lVar2 == ZohoSalesIQ.l.FAQ || lVar2 == ZohoSalesIQ.l.KnowledgeBase) {
                                InterfaceC6686a interfaceC6686a6 = this.f14167w;
                                if (interfaceC6686a6 != null) {
                                    interfaceC6686a6.a(we.e.f67680b.a(we.d.f67662m));
                                }
                                return Unit.INSTANCE;
                            }
                            booleanRef2 = booleanRef;
                            objectRef9 = objectRef5;
                            L b132 = C1452g0.b();
                            C0296c c0296c2 = new C0296c(objectRef6, null);
                            this.f14158n = booleanRef2;
                            this.f14159o = objectRef9;
                            this.f14160p = objectRef7;
                            this.f14161q = objectRef7;
                            this.f14162r = 6;
                            g12 = AbstractC1455i.g(b132, c0296c2, this);
                            if (g12 != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    objectRef2 = (Ref.ObjectRef) this.f14160p;
                    objectRef = (Ref.ObjectRef) this.f14159o;
                    Ref.BooleanRef booleanRef8 = (Ref.BooleanRef) this.f14158n;
                    ResultKt.throwOnFailure(obj);
                    booleanRef = booleanRef8;
                    t10 = obj;
                    Intrinsics.checkNotNullExpressionValue(t10, "withContext(...)");
                    objectRef2.element = t10;
                    if (booleanRef.element) {
                        break;
                    }
                    booleanRef.element = !booleanRef.element && ((List) objectRef.element).isEmpty();
                    isTrackingEnabled = UTSUtil.isTrackingEnabled();
                    objectRef3 = new Ref.ObjectRef();
                    if (isTrackingEnabled) {
                        break;
                    }
                    str = this.f14165u;
                    if (str != null) {
                        break;
                    }
                    str = null;
                    if (str == null) {
                    }
                    objectRef4 = objectRef;
                    L b112 = C1452g0.b();
                    C0295a c0295a2 = new C0295a(null);
                    this.f14158n = booleanRef;
                    this.f14159o = objectRef4;
                    this.f14160p = objectRef3;
                    this.f14161q = objectRef4;
                    this.f14162r = 4;
                    g10 = AbstractC1455i.g(b112, c0295a2, this);
                    if (g10 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                case 3:
                    Ref.ObjectRef objectRef15 = (Ref.ObjectRef) this.f14160p;
                    objectRef = (Ref.ObjectRef) this.f14159o;
                    Ref.BooleanRef booleanRef9 = (Ref.BooleanRef) this.f14158n;
                    ResultKt.throwOnFailure(obj);
                    booleanRef = booleanRef9;
                    objectRef3 = objectRef15;
                    objectRef4 = objectRef;
                    L b1122 = C1452g0.b();
                    C0295a c0295a22 = new C0295a(null);
                    this.f14158n = booleanRef;
                    this.f14159o = objectRef4;
                    this.f14160p = objectRef3;
                    this.f14161q = objectRef4;
                    this.f14162r = 4;
                    g10 = AbstractC1455i.g(b1122, c0295a22, this);
                    if (g10 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    objectRef4 = (Ref.ObjectRef) this.f14161q;
                    Ref.ObjectRef objectRef16 = (Ref.ObjectRef) this.f14160p;
                    objectRef6 = (Ref.ObjectRef) this.f14159o;
                    booleanRef = (Ref.BooleanRef) this.f14158n;
                    ResultKt.throwOnFailure(obj);
                    objectRef5 = objectRef16;
                    t11 = obj;
                    Intrinsics.checkNotNullExpressionValue(t11, "withContext(...)");
                    objectRef4.element = t11;
                    if (LiveChatUtil.isConversationEnabled()) {
                        break;
                    }
                    final Intent intent3 = new Intent(this.f14168x, (Class<?>) SalesIQActivity.class);
                    z10 = this.f14169y;
                    if (z10) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    objectRef7 = (Ref.ObjectRef) this.f14161q;
                    Ref.ObjectRef objectRef17 = (Ref.ObjectRef) this.f14160p;
                    objectRef8 = (Ref.ObjectRef) this.f14159o;
                    booleanRef3 = (Ref.BooleanRef) this.f14158n;
                    ResultKt.throwOnFailure(obj);
                    objectRef5 = objectRef17;
                    g11 = obj;
                    if (g11 != null) {
                    }
                    interfaceC6686a = this.f14167w;
                    if (interfaceC6686a != null) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    objectRef10 = (Ref.ObjectRef) this.f14161q;
                    objectRef7 = (Ref.ObjectRef) this.f14160p;
                    objectRef9 = (Ref.ObjectRef) this.f14159o;
                    booleanRef2 = (Ref.BooleanRef) this.f14158n;
                    ResultKt.throwOnFailure(obj);
                    t12 = obj;
                    final Ref.ObjectRef objectRef122 = objectRef9;
                    final Ref.BooleanRef booleanRef72 = booleanRef2;
                    objectRef10.element = t12;
                    if (LiveChatUtil.canAllowOpenChatActivityInOfflineState((SalesIQChat) objectRef7.element)) {
                        break;
                    }
                    final Ref.ObjectRef objectRef132 = new Ref.ObjectRef();
                    objectRef132.element = "temp_chid";
                    t13 = objectRef7.element;
                    if (t13 != 0) {
                    }
                    C6218a.j0(true);
                    final Intent intent22 = new Intent(this.f14168x, (Class<?>) ChatActivity.class);
                    if (this.f14169y) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class d extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f14202n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f14203o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ we.d f14204p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC6686a interfaceC6686a, we.d dVar, Continuation continuation) {
            super(1, continuation);
            this.f14203o = interfaceC6686a;
            this.f14204p = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new d(this.f14203o, this.f14204p, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14202n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC6686a interfaceC6686a = this.f14203o;
            if (interfaceC6686a == null) {
                return null;
            }
            interfaceC6686a.a(we.e.f67680b.a(this.f14204p));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class e extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f14205n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f14206o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC6686a interfaceC6686a, Continuation continuation) {
            super(1, continuation);
            this.f14206o = interfaceC6686a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new e(this.f14206o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14205n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC6686a interfaceC6686a = this.f14206o;
            if (interfaceC6686a == null) {
                return null;
            }
            interfaceC6686a.a(e.a.c(we.e.f67680b, null, 1, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f14207n;

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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f14207n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f14207n = 1;
                if (AbstractC1440a0.a(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            a.f14154d = true;
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f14208n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f14209o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ nd.e f14210p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, nd.e eVar, Continuation continuation) {
            super(2, continuation);
            this.f14209o = z10;
            this.f14210p = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f14209o, this.f14210p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14208n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.f14209o) {
                this.f14210p.a();
            } else {
                this.f14210p.b();
            }
            j applicationManager = ZohoLiveChat.getApplicationManager();
            if (applicationManager != null) {
                applicationManager.U(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final boolean l() {
        SharedPreferences M10 = C6218a.M();
        if (M10 != null) {
            return M10.getBoolean("ip_blocked", false);
        }
        return false;
    }

    public static final void m(Activity activity, String str, boolean z10, boolean z11, boolean z12, boolean z13, ZohoSalesIQ.l lVar, Function1 function1, InterfaceC6686a interfaceC6686a) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!i.f(str) || lVar != null) {
            AbstractC1459k.d(f14151a.h(), null, null, new c(z12, z11, str, lVar, interfaceC6686a, activity, z10, function1, z13, null), 3, null);
        } else if (interfaceC6686a != null) {
            interfaceC6686a.a(we.e.f67680b.a(we.d.f67665p));
        }
    }

    public static final void n(Intent intent, boolean z10, WaitingChatDetails waitingChatDetails) {
        boolean z11;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        Bot bot = UTSUtil.getBot(UTSUtil.EVENT_WIDGET_INTERACTION, null);
        if (waitingChatDetails == null) {
            waitingChatDetails = new WaitingChatDetails(bot != null ? bot.getId() : null, bot != null ? bot.getName() : null, false, uuid, null, 4, null);
        }
        Tf.b.d(uuid, waitingChatDetails);
        if (!UTSUtil.isTrackingEnabled() || (UTSUtil.hasTriggerBeenRequested() && !Intrinsics.areEqual(Tf.b.n(), uuid))) {
            z11 = true;
        } else {
            Tf.b.P(uuid);
            z11 = false;
        }
        intent.putExtra("acknowledgement_key", uuid);
        intent.putExtra("chid", uuid);
        intent.putExtra("is_triggered_chat", true);
        intent.putExtra("is_widget_interaction", z10);
        intent.putExtra("initiate_trigger_api", z11);
    }

    public static final Object p(InterfaceC6686a interfaceC6686a, we.d dVar, Continuation continuation) {
        return C6461a.f65810a.c(new d(interfaceC6686a, dVar, null), continuation);
    }

    public static final Object q(InterfaceC6686a interfaceC6686a, Continuation continuation) {
        return C6461a.f65810a.c(new e(interfaceC6686a, null), continuation);
    }

    public static final void r(boolean z10, nd.e eVar) {
        if (z10) {
            De.a aVar = De.a.IsEncryptedSharedPreferenceFailureAcknowledged;
            if (Ye.d.c(aVar) && !Ye.d.e(aVar, false) && f14154d) {
                f14154d = false;
                LiveChatUtil.triggerSalesIQListener("REGISTRATION_FAILED", null, null);
                AbstractC1459k.d(f14151a.h(), null, null, new f(null), 3, null);
            }
        }
        if (eVar == null) {
            j applicationManager = ZohoLiveChat.getApplicationManager();
            eVar = applicationManager != null ? applicationManager.t() : null;
        }
        if (eVar != null) {
            AbstractC1459k.d(f14151a.h(), null, null, new g(z10, eVar, null), 3, null);
        }
    }

    public final P h() {
        return C6461a.f65810a.d();
    }

    public final P i() {
        return C6461a.f65810a.e();
    }

    public final C4378a j() {
        return (C4378a) f14152b.getValue();
    }

    public final lf.d k() {
        return (lf.d) f14153c.getValue();
    }
}
