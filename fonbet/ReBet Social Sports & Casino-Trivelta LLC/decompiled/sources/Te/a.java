package Te;

import Be.a;
import Kd.a;
import Ke.a;
import Ph.AbstractC1455i;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.L;
import Ph.M0;
import Ph.P;
import Re.g;
import Te.a;
import a1.C1908a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.zoho.livechat.android.VisitorChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.conversations.data.local.entities.Bot;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.conversations.models.SalesIQConversation;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.modules.triggers.domain.entities.Trigger;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.TrackingHelper;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import hg.C4507a;
import ie.EnumC4544a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import me.C5582a;
import od.AbstractC5886l;
import og.AbstractC5890b;
import og.AbstractC5892d;
import rd.C6218a;
import td.C6461a;
import uf.C6550a;
import ve.InterfaceC6686a;
import wd.d;
import we.e;
import xe.C6822a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f11590s;

    /* renamed from: t, reason: collision with root package name */
    public static String f11591t;

    /* renamed from: u, reason: collision with root package name */
    public static String f11592u;

    /* renamed from: y, reason: collision with root package name */
    public static String f11596y;

    /* renamed from: a, reason: collision with root package name */
    public static final a f11572a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f11573b = LazyKt.lazy(j.f11702d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f11574c = LazyKt.lazy(u.f11725d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f11575d = LazyKt.lazy(t.f11724d);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f11576e = LazyKt.lazy(s.f11723d);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f11577f = LazyKt.lazy(C1690d.f11694d);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f11578g = LazyKt.lazy(C1691e.f11695d);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f11579h = LazyKt.lazy(n.f11712d);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f11580i = LazyKt.lazy(p.f11715d);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f11581j = LazyKt.lazy(E.f11657d);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f11582k = LazyKt.lazy(i.f11701d);

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f11583l = LazyKt.lazy(C1688b.f11666d);

    /* renamed from: m, reason: collision with root package name */
    public static final Lazy f11584m = LazyKt.lazy(B.f11652d);

    /* renamed from: n, reason: collision with root package name */
    public static final Lazy f11585n = LazyKt.lazy(C1693g.f11698d);

    /* renamed from: o, reason: collision with root package name */
    public static final Lazy f11586o = LazyKt.lazy(D.f11656d);

    /* renamed from: p, reason: collision with root package name */
    public static final Lazy f11587p = LazyKt.lazy(l.f11710d);

    /* renamed from: q, reason: collision with root package name */
    public static final Lazy f11588q = LazyKt.lazy(v.f11726d);

    /* renamed from: r, reason: collision with root package name */
    public static final Lazy f11589r = LazyKt.lazy(m.f11711d);

    /* renamed from: v, reason: collision with root package name */
    public static final Lazy f11593v = LazyKt.lazy(y.f11736d);

    /* renamed from: w, reason: collision with root package name */
    public static final Lazy f11594w = LazyKt.lazy(z.f11737d);

    /* renamed from: x, reason: collision with root package name */
    public static final Lazy f11595x = LazyKt.lazy(x.f11735d);

    public static final class A extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11597n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f11598o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Activity f11599p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f11600q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f11601r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Channel.Department f11602s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f11603t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f11604u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f11605v;

        /* renamed from: Te.a$A$a, reason: collision with other inner class name */
        public static final class C0225a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11606n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ we.e f11607o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f11608p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ String f11609q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ boolean f11610r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Channel.Department f11611s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11612t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11613u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ P f11614v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Activity f11615w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0225a(we.e eVar, String str, String str2, boolean z10, Channel.Department department, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, P p10, Activity activity, Continuation continuation) {
                super(2, continuation);
                this.f11607o = eVar;
                this.f11608p = str;
                this.f11609q = str2;
                this.f11610r = z10;
                this.f11611s = department;
                this.f11612t = interfaceC6686a;
                this.f11613u = interfaceC6686a2;
                this.f11614v = p10;
                this.f11615w = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0225a(this.f11607o, this.f11608p, this.f11609q, this.f11610r, this.f11611s, this.f11612t, this.f11613u, this.f11614v, this.f11615w, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0225a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
            
                if (Te.a.A.r(r0, r1, r3, r3, r4, r5, r6, r7, null, r13, 256, null) == r12) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
            
                return r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
            
                if (Te.a.A.p(r0, r3, r4, r3, r4, r5, r6, r7, r2, r13) == r12) goto L23;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11606n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f11607o.d()) {
                        String str = this.f11608p;
                        String str2 = this.f11609q;
                        boolean z10 = this.f11610r;
                        Channel.Department department = this.f11611s;
                        InterfaceC6686a interfaceC6686a = this.f11612t;
                        InterfaceC6686a interfaceC6686a2 = this.f11613u;
                        P p10 = this.f11614v;
                        Activity activity = this.f11615w;
                        this.f11606n = 1;
                    } else {
                        we.d c10 = this.f11607o.c();
                        we.d dVar = we.d.f67673x;
                        if (Intrinsics.areEqual(c10, dVar)) {
                            String str3 = this.f11608p;
                            String str4 = this.f11609q;
                            boolean z11 = this.f11610r;
                            Channel.Department department2 = this.f11611s;
                            InterfaceC6686a interfaceC6686a3 = this.f11612t;
                            InterfaceC6686a interfaceC6686a4 = this.f11613u;
                            P p11 = this.f11614v;
                            Activity activity2 = this.f11615w;
                            if (!Intrinsics.areEqual(this.f11607o.c(), dVar)) {
                                dVar = null;
                            }
                            this.f11606n = 2;
                        } else {
                            InterfaceC6686a interfaceC6686a5 = this.f11612t;
                            InterfaceC6686a interfaceC6686a6 = this.f11613u;
                            String str5 = this.f11609q;
                            we.d c11 = this.f11607o.c();
                            Intrinsics.checkNotNull(c11);
                            A.m(interfaceC6686a5, interfaceC6686a6, str5, c11);
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f11616n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11617o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ SalesIQChat f11618p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC6686a interfaceC6686a, SalesIQChat salesIQChat, Continuation continuation) {
                super(1, continuation);
                this.f11617o = interfaceC6686a;
                this.f11618p = salesIQChat;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new b(this.f11617o, this.f11618p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11616n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC6686a interfaceC6686a = this.f11617o;
                e.a aVar = we.e.f67680b;
                SalesIQChat salesIQChat = this.f11618p;
                interfaceC6686a.a(aVar.b(salesIQChat != null ? a.f11572a.x0(salesIQChat) : null));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static final class c extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f11619n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11620o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ VisitorChat f11621p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC6686a interfaceC6686a, VisitorChat visitorChat, Continuation continuation) {
                super(1, continuation);
                this.f11620o = interfaceC6686a;
                this.f11621p = visitorChat;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new c(this.f11620o, this.f11621p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11619n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f11620o.a(we.e.f67680b.b(this.f11621p));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static final class d extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11622n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f11623o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ we.d f11624p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, we.d dVar, Continuation continuation) {
                super(2, continuation);
                this.f11623o = str;
                this.f11624p = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(this.f11623o, this.f11624p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11622n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = a.f11572a;
                    String str = this.f11623o;
                    we.e a10 = we.e.f67680b.a(this.f11624p);
                    this.f11622n = 1;
                    if (aVar.q0(str, a10, this) == coroutine_suspended) {
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

        public static final class e extends ContinuationImpl {

            /* renamed from: A, reason: collision with root package name */
            public boolean f11625A;

            /* renamed from: B, reason: collision with root package name */
            public boolean f11626B;

            /* renamed from: C, reason: collision with root package name */
            public /* synthetic */ Object f11627C;

            /* renamed from: D, reason: collision with root package name */
            public int f11628D;

            /* renamed from: n, reason: collision with root package name */
            public Object f11629n;

            /* renamed from: o, reason: collision with root package name */
            public Object f11630o;

            /* renamed from: p, reason: collision with root package name */
            public Object f11631p;

            /* renamed from: q, reason: collision with root package name */
            public Object f11632q;

            /* renamed from: r, reason: collision with root package name */
            public Object f11633r;

            /* renamed from: s, reason: collision with root package name */
            public Object f11634s;

            /* renamed from: t, reason: collision with root package name */
            public Object f11635t;

            /* renamed from: u, reason: collision with root package name */
            public Object f11636u;

            /* renamed from: v, reason: collision with root package name */
            public Object f11637v;

            /* renamed from: w, reason: collision with root package name */
            public Object f11638w;

            /* renamed from: x, reason: collision with root package name */
            public Object f11639x;

            /* renamed from: y, reason: collision with root package name */
            public Object f11640y;

            /* renamed from: z, reason: collision with root package name */
            public Object f11641z;

            public e(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f11627C = obj;
                this.f11628D |= Integer.MIN_VALUE;
                return A.p(null, null, false, null, null, null, null, null, null, this);
            }
        }

        public static final class f extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11642n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f11643o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, Continuation continuation) {
                super(2, continuation);
                this.f11643o = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new f(this.f11643o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            
                if (r7.q0(r1, r3, r6) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
            
                if (Ph.AbstractC1440a0.a(r4, r6) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11642n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long l10 = Tf.b.f11754a.l();
                    this.f11642n = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Tf.b.P(null);
                        Tf.b.R(null);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                a aVar = a.f11572a;
                String str = this.f11643o;
                we.e a10 = we.e.f67680b.a(we.d.f67619A);
                this.f11642n = 2;
            }
        }

        public static final class g extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11644n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f11645o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ we.d f11646p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str, we.d dVar, Continuation continuation) {
                super(2, continuation);
                this.f11645o = str;
                this.f11646p = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new g(this.f11645o, this.f11646p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11644n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = a.f11572a;
                    String str = this.f11645o;
                    we.e a10 = we.e.f67680b.a(this.f11646p);
                    this.f11644n = 1;
                    if (aVar.q0(str, a10, this) == coroutine_suspended) {
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

        public /* synthetic */ class h {
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

        public static final class i extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11647n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11648o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ we.d f11649p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11650q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f11651r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(InterfaceC6686a interfaceC6686a, we.d dVar, InterfaceC6686a interfaceC6686a2, String str, Continuation continuation) {
                super(2, continuation);
                this.f11648o = interfaceC6686a;
                this.f11649p = dVar;
                this.f11650q = interfaceC6686a2;
                this.f11651r = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new i(this.f11648o, this.f11649p, this.f11650q, this.f11651r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11647n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC6686a interfaceC6686a = this.f11648o;
                if (interfaceC6686a != null) {
                    interfaceC6686a.a(we.e.f67680b.a(this.f11649p));
                }
                InterfaceC6686a interfaceC6686a2 = this.f11650q;
                if (interfaceC6686a2 != null) {
                    interfaceC6686a2.a(we.e.f67680b.a(this.f11649p));
                }
                a.f11572a.F(this.f11651r);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(Activity activity, String str, String str2, Channel.Department department, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f11599p = activity;
            this.f11600q = str;
            this.f11601r = str2;
            this.f11602s = department;
            this.f11603t = interfaceC6686a;
            this.f11604u = interfaceC6686a2;
            this.f11605v = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, String str, we.d dVar) {
            AbstractC1459k.d(C6461a.f65810a.d(), null, null, new i(interfaceC6686a, dVar, interfaceC6686a2, str, null), 3, null);
        }

        public static final void o(String str, String str2, boolean z10, Channel.Department department, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, P p10, Activity activity, we.e eVar) {
            AbstractC1459k.d(a.f11572a.H(), null, null, new C0225a(eVar, str, str2, z10, department, interfaceC6686a, interfaceC6686a2, p10, activity, null), 3, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:0x04ed, code lost:
        
            if (((r4 == null || r4.length() == 0) ? r49 : r31) == false) goto L178;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x050e, code lost:
        
            if (com.zoho.livechat.android.modules.triggers.domain.entities.Trigger.Type.SendChatInvite == null) goto L194;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0525  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0532  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x053f  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x05c7  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x05dd  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0574  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0578  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x062d  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0652  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x06a3  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x06bc  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x047c  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0484  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x082c  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x04be  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x04b7  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x04af  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0481  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x044a  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x045e  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x083d  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x03be  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0862  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x088d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x07cb  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0811  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x074d  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x081d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0358  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x043e  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x046c  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x04db  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
        /* JADX WARN: Type inference failed for: r0v105, types: [T, com.zoho.livechat.android.modules.triggers.domain.entities.Trigger] */
        /* JADX WARN: Type inference failed for: r3v2, types: [T, com.zoho.livechat.android.modules.triggers.domain.entities.Trigger] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object p(String str, String str2, boolean z10, Channel.Department department, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, P p10, Activity activity, we.d dVar, Continuation continuation) {
            e eVar;
            int i10;
            String str3;
            String str4;
            String str5;
            Object obj;
            Bot bot;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            Class cls;
            String str11;
            String str12;
            String str13;
            String str14;
            boolean z11;
            boolean z12;
            String str15;
            String str16;
            boolean z13;
            Channel.Department department2;
            InterfaceC6686a interfaceC6686a3;
            InterfaceC6686a interfaceC6686a4;
            P p11;
            Activity activity2;
            we.d dVar2;
            Ref.BooleanRef booleanRef;
            Rf.a aVar;
            Ref.BooleanRef booleanRef2;
            Ref.ObjectRef objectRef;
            boolean z14;
            String str17;
            boolean z15;
            P p12;
            Activity activity3;
            we.d dVar3;
            Object obj2;
            Ref.BooleanRef booleanRef3;
            Rf.a aVar2;
            boolean z16;
            String str18;
            P p13;
            String id2;
            Trigger.Params params;
            Trigger.Params.Attender attender;
            String displayName;
            Trigger.Params params2;
            Trigger.Params.Attender attender2;
            Trigger trigger;
            Channel.Department department3;
            Trigger trigger2;
            boolean z17;
            WaitingChatDetails waitingChatDetails;
            boolean z18;
            Trigger.Params params3;
            Trigger.Params.Attender attender3;
            String str19;
            Ref.BooleanRef booleanRef4;
            Rf.a aVar3;
            String str20;
            String str21;
            Channel.Department department4;
            boolean booleanValue;
            Ref.BooleanRef booleanRef5;
            Class cls2;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            Object obj3;
            Rf.a aVar4;
            Channel.Department department5;
            InterfaceC6686a interfaceC6686a5;
            InterfaceC6686a interfaceC6686a6;
            we.d dVar4;
            Ref.BooleanRef booleanRef6;
            Activity activity4;
            Ref.BooleanRef booleanRef7;
            Object obj4;
            boolean z19;
            String str27;
            Ref.BooleanRef booleanRef8;
            C5582a c5582a;
            String str28;
            boolean z20;
            C5582a c5582a2;
            Ref.BooleanRef booleanRef9;
            Channel.Department department6;
            Ref.BooleanRef booleanRef10;
            String str29;
            Object obj5;
            VisitorChat visitorChat;
            VisitorChat visitorChat2;
            boolean z21;
            Object obj6;
            Rf.a aVar5;
            we.d dVar5;
            Activity activity5;
            Channel.Department department7;
            InterfaceC6686a interfaceC6686a7;
            InterfaceC6686a interfaceC6686a8;
            String str30;
            Ref.BooleanRef booleanRef11;
            String str31;
            Ref.BooleanRef booleanRef12;
            boolean z22;
            String str32;
            C5582a c5582a3;
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i11 = eVar.f11628D;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    eVar.f11628D = i11 - Integer.MIN_VALUE;
                    e eVar2 = eVar;
                    Object obj7 = eVar2.f11627C;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = eVar2.f11628D;
                    String str33 = "SINGLETASK";
                    String str34 = "chid";
                    String str35 = "department_name";
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj7);
                        Rf.a aVar6 = (str == null || str.length() == 0) ? Rf.a.Clicked : Rf.a.PerformedCustomAction;
                        if (!C6218a.c0()) {
                            m(interfaceC6686a, interfaceC6686a2, str2, we.d.f67651e);
                            MobilistenUtil.z(od.t.f61107s, 0, 2, null);
                            return Unit.INSTANCE;
                        }
                        Bot bot2 = og.i.f(str) ? UTSUtil.getBot(UTSUtil.EVENT_CUSTOM_ACTIONS, str) : UTSUtil.getBot(UTSUtil.EVENT_WIDGET_INTERACTION, null);
                        if (UTSUtil.isTrackingEnabled() && bot2 == null && (str == null || str.length() == 0)) {
                            m(interfaceC6686a, interfaceC6686a2, str2, we.d.f67628J);
                            return Unit.INSTANCE;
                        }
                        boolean hasTriggerBeenRequested = UTSUtil.hasTriggerBeenRequested();
                        Ref.BooleanRef booleanRef13 = new Ref.BooleanRef();
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        Tf.b bVar = Tf.b.f11754a;
                        Rf.a aVar7 = Rf.a.PerformedCustomAction;
                        str3 = "ignore_delay";
                        str4 = "has_custom_chat_id";
                        str5 = "acknowledgement_key";
                        ?? A10 = Tf.b.A(bVar, aVar7, str, null, 4, null);
                        objectRef2.element = A10;
                        if (A10 != 0) {
                            A10.getAction();
                        }
                        if (Trigger.Type.SendChatInvite == null) {
                            booleanRef13.element = hasTriggerBeenRequested;
                        } else {
                            Trigger trigger3 = (Trigger) objectRef2.element;
                            if (trigger3 != null) {
                                trigger3.getAction();
                            }
                            if (Trigger.Type.InvokeJSApi == null) {
                                m(interfaceC6686a, interfaceC6686a2, str2, we.d.f67624F);
                                return Unit.INSTANCE;
                            }
                        }
                        Ref.BooleanRef booleanRef14 = new Ref.BooleanRef();
                        boolean z23 = objectRef2.element == 0;
                        if ((UTSUtil.isTrackingEnabled() && bot2 == null && og.i.f(str) && z23) || (!UTSUtil.isTrackingEnabled() && og.i.f(str) && z23)) {
                            String a10 = ZohoSalesIQ.m.a(Uf.j.n());
                            String language = LiveChatUtil.getLanguage();
                            eVar2.f11629n = str;
                            eVar2.f11630o = str2;
                            eVar2.f11631p = department;
                            eVar2.f11632q = interfaceC6686a;
                            eVar2.f11633r = interfaceC6686a2;
                            eVar2.f11634s = p10;
                            eVar2.f11635t = activity;
                            eVar2.f11636u = dVar;
                            eVar2.f11637v = aVar6;
                            eVar2.f11638w = bot2;
                            eVar2.f11639x = booleanRef13;
                            eVar2.f11640y = objectRef2;
                            eVar2.f11641z = booleanRef14;
                            eVar2.f11625A = z10;
                            eVar2.f11626B = hasTriggerBeenRequested;
                            eVar2.f11628D = 1;
                            bot = bot2;
                            obj = coroutine_suspended;
                            str6 = "custom_action_name";
                            str7 = "action_type";
                            str8 = "initiate_trigger_api";
                            str9 = "is_triggered_chat";
                            str10 = "is_from_start_chat";
                            cls = ChatActivity.class;
                            str11 = str33;
                            str12 = "mode";
                            str13 = str34;
                            str14 = str35;
                            z11 = false;
                            Object F10 = Tf.b.F(bVar, aVar7, str, null, str2, a10, language, z10, true, false, true, false, eVar2, 1280, null);
                            if (F10 == obj) {
                                return obj;
                            }
                            str17 = str2;
                            z15 = z10;
                            department2 = department;
                            interfaceC6686a3 = interfaceC6686a;
                            interfaceC6686a4 = interfaceC6686a2;
                            p12 = p10;
                            activity3 = activity;
                            dVar3 = dVar;
                            obj2 = F10;
                            booleanRef3 = booleanRef14;
                            aVar2 = aVar6;
                            booleanRef2 = booleanRef13;
                            objectRef = objectRef2;
                            z16 = hasTriggerBeenRequested;
                            str18 = str;
                        } else {
                            obj = coroutine_suspended;
                            bot = bot2;
                            str6 = "custom_action_name";
                            str7 = "action_type";
                            str8 = "initiate_trigger_api";
                            str9 = "is_triggered_chat";
                            str10 = "is_from_start_chat";
                            cls = ChatActivity.class;
                            str11 = str33;
                            str12 = "mode";
                            str13 = str34;
                            str14 = str35;
                            z11 = false;
                            z12 = true;
                            str15 = str;
                            str16 = str2;
                            z13 = z10;
                            department2 = department;
                            interfaceC6686a3 = interfaceC6686a;
                            interfaceC6686a4 = interfaceC6686a2;
                            p11 = p10;
                            activity2 = activity;
                            dVar2 = dVar;
                            booleanRef = booleanRef14;
                            aVar = aVar6;
                            booleanRef2 = booleanRef13;
                            objectRef = objectRef2;
                            z14 = hasTriggerBeenRequested;
                            if (bot != null || (id2 = bot.getId()) == null) {
                                p13 = p11;
                                Trigger trigger4 = (Trigger) objectRef.element;
                                id2 = (trigger4 != null || (params = trigger4.getParams()) == null || (attender = params.getAttender()) == null) ? null : attender.getId();
                            } else {
                                p13 = p11;
                            }
                            if (bot != null || (displayName = bot.getName()) == null) {
                                Trigger trigger5 = (Trigger) objectRef.element;
                                displayName = (trigger5 != null || (params2 = trigger5.getParams()) == null || (attender2 = params2.getAttender()) == null) ? null : attender2.getDisplayName();
                                if (displayName == null) {
                                    Trigger trigger6 = (Trigger) objectRef.element;
                                    if (trigger6 != null) {
                                        trigger6.getAction();
                                    }
                                    displayName = null;
                                }
                            }
                            String str36 = displayName;
                            if (bot == null || objectRef.element != 0) {
                                trigger = (Trigger) objectRef.element;
                                if ((trigger == null ? trigger.getParams() : null) == null) {
                                    Trigger trigger7 = (Trigger) objectRef.element;
                                    if (trigger7 == null || (params3 = trigger7.getParams()) == null || (attender3 = params3.getAttender()) == null) {
                                        department3 = department2;
                                        z18 = z11;
                                    } else {
                                        department3 = department2;
                                        z18 = Intrinsics.areEqual(attender3.isBot(), Boxing.boxBoolean(z12));
                                    }
                                    if (!z18) {
                                        z17 = z12;
                                        waitingChatDetails = new WaitingChatDetails(id2, str36, z17, str16, department3 != null ? department3.getName() : null);
                                    }
                                } else {
                                    department3 = department2;
                                }
                                trigger2 = (Trigger) objectRef.element;
                                if (trigger2 != null) {
                                    trigger2.getAction();
                                }
                                z17 = z11;
                                waitingChatDetails = new WaitingChatDetails(id2, str36, z17, str16, department3 != null ? department3.getName() : null);
                            } else {
                                department3 = department2;
                                waitingChatDetails = null;
                            }
                            if (UTSUtil.isTrackingEnabled()) {
                                if (bot != null) {
                                    if (z14) {
                                    }
                                    if (interfaceC6686a3 != null) {
                                        a.f11572a.k0().put(str16, interfaceC6686a3);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    if (interfaceC6686a4 != null) {
                                        a.f11572a.l0().put(str16, interfaceC6686a4);
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    if (waitingChatDetails != null) {
                                        Tf.b.d(str16, waitingChatDetails);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    Ref.BooleanRef booleanRef15 = new Ref.BooleanRef();
                                    if (z14 || Intrinsics.areEqual(Tf.b.n(), str16)) {
                                        Tf.b.P(str16);
                                        Tf.b.R(Boxing.boxBoolean(z13));
                                        if ((str15 != null || str15.length() == 0) ? true : z11) {
                                            if (bot == null) {
                                                UTSUtil.updateBotTriggeredActionsList(TrackingHelper.INTELLIGENT_TRIGGER, UTSUtil.ActionState.Updated, CollectionsKt.listOf(str15));
                                            }
                                            UTSUtil.performCustomAction(str15);
                                        } else {
                                            UTSUtil.sendSDKOpenActionToUTS();
                                        }
                                        AbstractC1459k.d(p13, null, null, new f(str16, null), 3, null);
                                    } else {
                                        booleanRef15.element = z12;
                                    }
                                    Intent intent = new Intent(activity2, (Class<?>) cls);
                                    intent.putExtra(str10, true);
                                    intent.putExtra(str9, true);
                                    intent.putExtra(str8, booleanRef15.element);
                                    intent.putExtra(str7, Rf.a.Companion.b(aVar));
                                    if (str15 != null) {
                                        intent.putExtra(str6, str15);
                                    }
                                    intent.putExtra(str4, z13);
                                    intent.putExtra(str3, true);
                                    intent.putExtra(str5, str16);
                                    if (department3 != null) {
                                        intent.putExtra(str14, department3.getName());
                                    }
                                    intent.putExtra(str13, str16);
                                    intent.putExtra(str12, str11);
                                    intent.setFlags(268435456);
                                    Unit unit4 = Unit.INSTANCE;
                                    activity2.startActivity(intent);
                                    if (dVar2 != null && !Intrinsics.areEqual(dVar2, we.d.f67673x)) {
                                        AbstractC1459k.d(a.f11572a.H(), null, null, new g(str16, dVar2, null), 3, null);
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (!booleanRef2.element) {
                                    if (!((str15 == null || str15.length() == 0) ? z12 : z11)) {
                                        Trigger trigger8 = (Trigger) objectRef.element;
                                        if (trigger8 != null) {
                                            trigger8.getAction();
                                        }
                                    }
                                    if (interfaceC6686a3 != null) {
                                    }
                                    if (interfaceC6686a4 != null) {
                                    }
                                    if (waitingChatDetails != null) {
                                    }
                                    Ref.BooleanRef booleanRef152 = new Ref.BooleanRef();
                                    if (z14) {
                                    }
                                    Tf.b.P(str16);
                                    Tf.b.R(Boxing.boxBoolean(z13));
                                    if ((str15 != null || str15.length() == 0) ? true : z11) {
                                    }
                                    AbstractC1459k.d(p13, null, null, new f(str16, null), 3, null);
                                    Intent intent2 = new Intent(activity2, (Class<?>) cls);
                                    intent2.putExtra(str10, true);
                                    intent2.putExtra(str9, true);
                                    intent2.putExtra(str8, booleanRef152.element);
                                    intent2.putExtra(str7, Rf.a.Companion.b(aVar));
                                    if (str15 != null) {
                                    }
                                    intent2.putExtra(str4, z13);
                                    intent2.putExtra(str3, true);
                                    intent2.putExtra(str5, str16);
                                    if (department3 != null) {
                                    }
                                    intent2.putExtra(str13, str16);
                                    intent2.putExtra(str12, str11);
                                    intent2.setFlags(268435456);
                                    Unit unit42 = Unit.INSTANCE;
                                    activity2.startActivity(intent2);
                                    if (dVar2 != null) {
                                        AbstractC1459k.d(a.f11572a.H(), null, null, new g(str16, dVar2, null), 3, null);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            str19 = str5;
                            String str37 = str3;
                            str33 = str11;
                            String str38 = str12;
                            str34 = str13;
                            str35 = str14;
                            Class cls3 = cls;
                            if (!UTSUtil.isTrackingEnabled() && (!og.i.f(str15) || ((bot == null || !UTSUtil.hasTriggerBeenRequested()) && !booleanRef2.element))) {
                                m(interfaceC6686a3, interfaceC6686a4, str16, we.d.f67628J);
                                return Unit.INSTANCE;
                            }
                            booleanRef4 = new Ref.BooleanRef();
                            if (UTSUtil.isTrackingEnabled()) {
                                if (z14) {
                                    if (og.i.f(str15)) {
                                        UTSUtil.performCustomAction(str15);
                                    }
                                } else if (og.i.f(str15)) {
                                    booleanRef4.element = true;
                                }
                            }
                            WaitingChatDetails waitingChatDetails2 = waitingChatDetails;
                            String str39 = str15;
                            String str40 = str16;
                            InterfaceC6686a interfaceC6686a9 = interfaceC6686a4;
                            InterfaceC6686a interfaceC6686a10 = interfaceC6686a3;
                            Rf.a aVar8 = aVar;
                            Pair s10 = s(aVar8, str39, interfaceC6686a10, interfaceC6686a9, str40, waitingChatDetails2, department3);
                            aVar3 = aVar8;
                            str20 = str39;
                            str21 = str40;
                            department4 = department3;
                            booleanValue = ((Boolean) s10.component1()).booleanValue();
                            boolean booleanValue2 = ((Boolean) s10.component2()).booleanValue();
                            Object obj8 = obj;
                            booleanRef5 = new Ref.BooleanRef();
                            if (!booleanValue) {
                                if (!booleanValue2) {
                                    m(interfaceC6686a10, interfaceC6686a9, str21, we.d.f67628J);
                                    return Unit.INSTANCE;
                                }
                                booleanRef5.element = true;
                                cls2 = cls3;
                                str23 = str38;
                                str24 = str37;
                                str25 = str4;
                                str26 = str8;
                                Intent intent3 = new Intent(activity2, (Class<?>) cls2);
                                intent3.putExtra(str10, true);
                                intent3.putExtra(str9, true);
                                intent3.putExtra(str7, Rf.a.Companion.b(aVar3));
                                if (str20 != null) {
                                }
                                intent3.putExtra(str26, booleanRef5.element);
                                intent3.putExtra("should_use_trigger_cache", booleanRef.element);
                                intent3.putExtra("should_update_to_vts_socket", booleanRef4.element);
                                intent3.putExtra(str19, str21);
                                intent3.putExtra(str25, z13);
                                intent3.putExtra(str24, true);
                                if (department4 != null) {
                                }
                                intent3.putExtra(str34, str21);
                                intent3.putExtra(str23, str33);
                                intent3.setFlags(268435456);
                                Unit unit5 = Unit.INSTANCE;
                                activity2.startActivity(intent3);
                                if (dVar2 != null) {
                                    AbstractC1459k.d(a.f11572a.H(), null, null, new d(str21, dVar2, null), 3, null);
                                }
                                return Unit.INSTANCE;
                            }
                            if (waitingChatDetails2 != null) {
                                Tf.b.d(str21, waitingChatDetails2);
                                Unit unit6 = Unit.INSTANCE;
                            }
                            Tf.b bVar2 = Tf.b.f11754a;
                            String a11 = ZohoSalesIQ.m.a(Uf.j.n());
                            String language2 = LiveChatUtil.getLanguage();
                            eVar2.f11629n = str20;
                            eVar2.f11630o = str21;
                            eVar2.f11631p = department4;
                            eVar2.f11632q = interfaceC6686a10;
                            eVar2.f11633r = interfaceC6686a9;
                            eVar2.f11634s = activity2;
                            eVar2.f11635t = dVar2;
                            eVar2.f11636u = aVar3;
                            eVar2.f11637v = booleanRef;
                            eVar2.f11638w = booleanRef4;
                            eVar2.f11639x = booleanRef5;
                            eVar2.f11640y = null;
                            eVar2.f11641z = null;
                            eVar2.f11625A = z13;
                            eVar2.f11628D = 2;
                            Ref.BooleanRef booleanRef16 = booleanRef;
                            we.d dVar6 = dVar2;
                            cls2 = cls3;
                            str22 = str21;
                            Activity activity6 = activity2;
                            str23 = str38;
                            str24 = str37;
                            str25 = str4;
                            str26 = str8;
                            obj3 = obj8;
                            Object F11 = Tf.b.F(bVar2, aVar3, str20, null, str22, a11, language2, z13, false, false, true, false, eVar2, 1408, null);
                            eVar2 = eVar2;
                            if (F11 == obj3) {
                                return obj3;
                            }
                            aVar4 = aVar3;
                            department5 = department4;
                            interfaceC6686a5 = interfaceC6686a10;
                            interfaceC6686a6 = interfaceC6686a9;
                            dVar4 = dVar6;
                            booleanRef6 = booleanRef4;
                            activity4 = activity6;
                            booleanRef7 = booleanRef5;
                            obj4 = F11;
                            z19 = z13;
                            str27 = str20;
                            booleanRef8 = booleanRef16;
                            c5582a2 = (C5582a) obj4;
                            if (c5582a2.d()) {
                            }
                        }
                    } else if (i10 == 1) {
                        obj2 = obj7;
                        boolean z24 = eVar2.f11626B;
                        boolean z25 = eVar2.f11625A;
                        Ref.BooleanRef booleanRef17 = (Ref.BooleanRef) eVar2.f11641z;
                        Ref.ObjectRef objectRef3 = (Ref.ObjectRef) eVar2.f11640y;
                        Ref.BooleanRef booleanRef18 = (Ref.BooleanRef) eVar2.f11639x;
                        Bot bot3 = (Bot) eVar2.f11638w;
                        aVar2 = (Rf.a) eVar2.f11637v;
                        dVar3 = (we.d) eVar2.f11636u;
                        activity3 = (Activity) eVar2.f11635t;
                        P p14 = (P) eVar2.f11634s;
                        interfaceC6686a4 = (InterfaceC6686a) eVar2.f11633r;
                        interfaceC6686a3 = (InterfaceC6686a) eVar2.f11632q;
                        Channel.Department department8 = (Channel.Department) eVar2.f11631p;
                        String str41 = (String) eVar2.f11630o;
                        str18 = (String) eVar2.f11629n;
                        ResultKt.throwOnFailure(obj2);
                        str5 = "acknowledgement_key";
                        str3 = "ignore_delay";
                        str4 = "has_custom_chat_id";
                        bot = bot3;
                        p12 = p14;
                        str6 = "custom_action_name";
                        str7 = "action_type";
                        str8 = "initiate_trigger_api";
                        str9 = "is_triggered_chat";
                        str10 = "is_from_start_chat";
                        cls = ChatActivity.class;
                        str11 = str33;
                        str12 = "mode";
                        str13 = str34;
                        str14 = str35;
                        z11 = false;
                        z16 = z24;
                        department2 = department8;
                        obj = coroutine_suspended;
                        booleanRef2 = booleanRef18;
                        objectRef = objectRef3;
                        booleanRef3 = booleanRef17;
                        z15 = z25;
                        str17 = str41;
                    } else if (i10 == 2) {
                        obj4 = obj7;
                        boolean z26 = eVar2.f11625A;
                        Ref.BooleanRef booleanRef19 = (Ref.BooleanRef) eVar2.f11639x;
                        Ref.BooleanRef booleanRef20 = (Ref.BooleanRef) eVar2.f11638w;
                        Ref.BooleanRef booleanRef21 = (Ref.BooleanRef) eVar2.f11637v;
                        Rf.a aVar9 = (Rf.a) eVar2.f11636u;
                        we.d dVar7 = (we.d) eVar2.f11635t;
                        Activity activity7 = (Activity) eVar2.f11634s;
                        InterfaceC6686a interfaceC6686a11 = (InterfaceC6686a) eVar2.f11633r;
                        InterfaceC6686a interfaceC6686a12 = (InterfaceC6686a) eVar2.f11632q;
                        Channel.Department department9 = (Channel.Department) eVar2.f11631p;
                        String str42 = (String) eVar2.f11630o;
                        str27 = (String) eVar2.f11629n;
                        ResultKt.throwOnFailure(obj4);
                        dVar4 = dVar7;
                        department5 = department9;
                        interfaceC6686a6 = interfaceC6686a11;
                        str19 = "acknowledgement_key";
                        str24 = "ignore_delay";
                        str25 = "has_custom_chat_id";
                        booleanRef8 = booleanRef21;
                        str22 = str42;
                        str6 = "custom_action_name";
                        str7 = "action_type";
                        str26 = "initiate_trigger_api";
                        str9 = "is_triggered_chat";
                        str10 = "is_from_start_chat";
                        cls2 = ChatActivity.class;
                        str23 = "mode";
                        booleanRef7 = booleanRef19;
                        interfaceC6686a5 = interfaceC6686a12;
                        activity4 = activity7;
                        aVar4 = aVar9;
                        booleanRef6 = booleanRef20;
                        z19 = z26;
                        obj3 = coroutine_suspended;
                        c5582a2 = (C5582a) obj4;
                        if (c5582a2.d()) {
                            boolean z27 = z19;
                            booleanRef9 = booleanRef7;
                            department6 = department5;
                            dVar2 = dVar4;
                            booleanRef10 = booleanRef8;
                            str29 = str27;
                            z13 = z27;
                            activity2 = activity4;
                            aVar3 = aVar4;
                            if (c5582a2.d()) {
                            }
                        } else {
                            SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(str22);
                            if (chatWithAnyId != null) {
                                obj5 = obj3;
                                visitorChat = LiveChatUtil.getVisitorChatObject(chatWithAnyId);
                            } else {
                                obj5 = obj3;
                                visitorChat = null;
                            }
                            if (interfaceC6686a5 != null) {
                                boolean z28 = z19;
                                C6461a c6461a = C6461a.f65810a;
                                visitorChat2 = visitorChat;
                                b bVar3 = new b(interfaceC6686a5, chatWithAnyId, null);
                                eVar2.f11629n = str27;
                                eVar2.f11630o = str22;
                                eVar2.f11631p = department5;
                                eVar2.f11632q = interfaceC6686a5;
                                eVar2.f11633r = interfaceC6686a6;
                                eVar2.f11634s = activity4;
                                eVar2.f11635t = dVar4;
                                eVar2.f11636u = aVar4;
                                eVar2.f11637v = booleanRef8;
                                eVar2.f11638w = booleanRef6;
                                eVar2.f11639x = booleanRef7;
                                eVar2.f11640y = c5582a2;
                                eVar2.f11641z = visitorChat2;
                                z21 = z28;
                                eVar2.f11625A = z21;
                                eVar2.f11628D = 3;
                                Object c10 = c6461a.c(bVar3, eVar2);
                                obj6 = obj5;
                                if (c10 == obj6) {
                                    return obj6;
                                }
                                str30 = str27;
                                booleanRef11 = booleanRef8;
                                Unit unit7 = Unit.INSTANCE;
                                Activity activity8 = activity4;
                                department7 = department5;
                                booleanRef10 = booleanRef11;
                                aVar5 = aVar4;
                                dVar5 = dVar4;
                                activity5 = activity8;
                                InterfaceC6686a interfaceC6686a13 = interfaceC6686a5;
                                interfaceC6686a7 = interfaceC6686a6;
                                interfaceC6686a8 = interfaceC6686a13;
                                str29 = str30;
                                str31 = str22;
                                booleanRef12 = booleanRef7;
                                boolean z29 = z21;
                                VisitorChat visitorChat3 = visitorChat2;
                                if (interfaceC6686a7 != null) {
                                }
                            } else {
                                visitorChat2 = visitorChat;
                                z21 = z19;
                                obj6 = obj5;
                                Channel.Department department10 = department5;
                                booleanRef10 = booleanRef8;
                                str29 = str27;
                                aVar5 = aVar4;
                                dVar5 = dVar4;
                                activity5 = activity4;
                                department7 = department10;
                                InterfaceC6686a interfaceC6686a14 = interfaceC6686a5;
                                interfaceC6686a7 = interfaceC6686a6;
                                interfaceC6686a8 = interfaceC6686a14;
                                str31 = str22;
                                booleanRef12 = booleanRef7;
                                boolean z292 = z21;
                                VisitorChat visitorChat32 = visitorChat2;
                                if (interfaceC6686a7 != null) {
                                }
                            }
                        }
                    } else {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z22 = eVar2.f11625A;
                            c5582a3 = (C5582a) eVar2.f11640y;
                            booleanRef12 = (Ref.BooleanRef) eVar2.f11639x;
                            booleanRef6 = (Ref.BooleanRef) eVar2.f11638w;
                            booleanRef10 = (Ref.BooleanRef) eVar2.f11637v;
                            aVar5 = (Rf.a) eVar2.f11636u;
                            dVar5 = (we.d) eVar2.f11635t;
                            activity5 = (Activity) eVar2.f11634s;
                            interfaceC6686a7 = (InterfaceC6686a) eVar2.f11633r;
                            interfaceC6686a8 = (InterfaceC6686a) eVar2.f11632q;
                            department7 = (Channel.Department) eVar2.f11631p;
                            str31 = (String) eVar2.f11630o;
                            str32 = (String) eVar2.f11629n;
                            ResultKt.throwOnFailure(obj7);
                            str19 = "acknowledgement_key";
                            str24 = "ignore_delay";
                            str25 = "has_custom_chat_id";
                            str6 = "custom_action_name";
                            str7 = "action_type";
                            str26 = "initiate_trigger_api";
                            str9 = "is_triggered_chat";
                            str10 = "is_from_start_chat";
                            cls2 = ChatActivity.class;
                            str23 = "mode";
                            Unit unit8 = Unit.INSTANCE;
                            c5582a2 = c5582a3;
                            str29 = str32;
                            InterfaceC6686a interfaceC6686a15 = interfaceC6686a7;
                            interfaceC6686a5 = interfaceC6686a8;
                            interfaceC6686a6 = interfaceC6686a15;
                            boolean z30 = z22;
                            Ref.BooleanRef booleanRef22 = booleanRef12;
                            str22 = str31;
                            booleanRef9 = booleanRef22;
                            Rf.a aVar10 = aVar5;
                            z13 = z30;
                            department6 = department7;
                            aVar3 = aVar10;
                            dVar2 = dVar5;
                            activity2 = activity5;
                            if (c5582a2.d()) {
                                Intrinsics.checkNotNull(c5582a2.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                                m(interfaceC6686a5, interfaceC6686a6, str22, we.d.f67628J);
                                return Unit.INSTANCE;
                            }
                            booleanRef5 = booleanRef9;
                            booleanRef = booleanRef10;
                            str21 = str22;
                            str20 = str29;
                            department4 = department6;
                            booleanRef4 = booleanRef6;
                            Intent intent32 = new Intent(activity2, (Class<?>) cls2);
                            intent32.putExtra(str10, true);
                            intent32.putExtra(str9, true);
                            intent32.putExtra(str7, Rf.a.Companion.b(aVar3));
                            if (str20 != null) {
                                intent32.putExtra(str6, str20);
                            }
                            intent32.putExtra(str26, booleanRef5.element);
                            intent32.putExtra("should_use_trigger_cache", booleanRef.element);
                            intent32.putExtra("should_update_to_vts_socket", booleanRef4.element);
                            intent32.putExtra(str19, str21);
                            intent32.putExtra(str25, z13);
                            intent32.putExtra(str24, true);
                            if (department4 != null) {
                                intent32.putExtra(str35, department4.getName());
                            }
                            intent32.putExtra(str34, str21);
                            intent32.putExtra(str23, str33);
                            intent32.setFlags(268435456);
                            Unit unit52 = Unit.INSTANCE;
                            activity2.startActivity(intent32);
                            if (dVar2 != null && !Intrinsics.areEqual(dVar2, we.d.f67673x)) {
                                AbstractC1459k.d(a.f11572a.H(), null, null, new d(str21, dVar2, null), 3, null);
                            }
                            return Unit.INSTANCE;
                        }
                        boolean z31 = eVar2.f11625A;
                        VisitorChat visitorChat4 = (VisitorChat) eVar2.f11641z;
                        C5582a c5582a4 = (C5582a) eVar2.f11640y;
                        Ref.BooleanRef booleanRef23 = (Ref.BooleanRef) eVar2.f11639x;
                        booleanRef6 = (Ref.BooleanRef) eVar2.f11638w;
                        booleanRef11 = (Ref.BooleanRef) eVar2.f11637v;
                        aVar4 = (Rf.a) eVar2.f11636u;
                        dVar4 = (we.d) eVar2.f11635t;
                        activity4 = (Activity) eVar2.f11634s;
                        interfaceC6686a6 = (InterfaceC6686a) eVar2.f11633r;
                        interfaceC6686a5 = (InterfaceC6686a) eVar2.f11632q;
                        department5 = (Channel.Department) eVar2.f11631p;
                        String str43 = (String) eVar2.f11630o;
                        str30 = (String) eVar2.f11629n;
                        ResultKt.throwOnFailure(obj7);
                        str19 = "acknowledgement_key";
                        str24 = "ignore_delay";
                        str25 = "has_custom_chat_id";
                        booleanRef7 = booleanRef23;
                        str6 = "custom_action_name";
                        str7 = "action_type";
                        str26 = "initiate_trigger_api";
                        str9 = "is_triggered_chat";
                        str10 = "is_from_start_chat";
                        cls2 = ChatActivity.class;
                        str23 = "mode";
                        str22 = str43;
                        visitorChat2 = visitorChat4;
                        c5582a2 = c5582a4;
                        z21 = z31;
                        obj6 = coroutine_suspended;
                        Unit unit72 = Unit.INSTANCE;
                        Activity activity82 = activity4;
                        department7 = department5;
                        booleanRef10 = booleanRef11;
                        aVar5 = aVar4;
                        dVar5 = dVar4;
                        activity5 = activity82;
                        InterfaceC6686a interfaceC6686a132 = interfaceC6686a5;
                        interfaceC6686a7 = interfaceC6686a6;
                        interfaceC6686a8 = interfaceC6686a132;
                        str29 = str30;
                        str31 = str22;
                        booleanRef12 = booleanRef7;
                        boolean z2922 = z21;
                        VisitorChat visitorChat322 = visitorChat2;
                        if (interfaceC6686a7 != null) {
                            Object obj9 = obj6;
                            C6461a c6461a2 = C6461a.f65810a;
                            c cVar = new c(interfaceC6686a7, visitorChat322, null);
                            eVar2.f11629n = str29;
                            eVar2.f11630o = str31;
                            eVar2.f11631p = department7;
                            eVar2.f11632q = interfaceC6686a8;
                            eVar2.f11633r = interfaceC6686a7;
                            eVar2.f11634s = activity5;
                            eVar2.f11635t = dVar5;
                            eVar2.f11636u = aVar5;
                            eVar2.f11637v = booleanRef10;
                            eVar2.f11638w = booleanRef6;
                            eVar2.f11639x = booleanRef12;
                            eVar2.f11640y = c5582a2;
                            eVar2.f11641z = null;
                            z22 = z2922;
                            eVar2.f11625A = z22;
                            eVar2.f11628D = 4;
                            if (c6461a2.c(cVar, eVar2) == obj9) {
                                return obj9;
                            }
                            str32 = str29;
                            c5582a3 = c5582a2;
                            Unit unit82 = Unit.INSTANCE;
                            c5582a2 = c5582a3;
                            str29 = str32;
                            InterfaceC6686a interfaceC6686a152 = interfaceC6686a7;
                            interfaceC6686a5 = interfaceC6686a8;
                            interfaceC6686a6 = interfaceC6686a152;
                            boolean z302 = z22;
                            Ref.BooleanRef booleanRef222 = booleanRef12;
                            str22 = str31;
                            booleanRef9 = booleanRef222;
                            Rf.a aVar102 = aVar5;
                            z13 = z302;
                            department6 = department7;
                            aVar3 = aVar102;
                            dVar2 = dVar5;
                            activity2 = activity5;
                            if (c5582a2.d()) {
                            }
                        } else {
                            z22 = z2922;
                            InterfaceC6686a interfaceC6686a1522 = interfaceC6686a7;
                            interfaceC6686a5 = interfaceC6686a8;
                            interfaceC6686a6 = interfaceC6686a1522;
                            boolean z3022 = z22;
                            Ref.BooleanRef booleanRef2222 = booleanRef12;
                            str22 = str31;
                            booleanRef9 = booleanRef2222;
                            Rf.a aVar1022 = aVar5;
                            z13 = z3022;
                            department6 = department7;
                            aVar3 = aVar1022;
                            dVar2 = dVar5;
                            activity2 = activity5;
                            if (c5582a2.d()) {
                            }
                        }
                    }
                    c5582a = (C5582a) obj2;
                    if (c5582a.d()) {
                        str28 = str18;
                        z20 = z15;
                    } else {
                        String str44 = str18;
                        ?? A11 = Tf.b.A(Tf.b.f11754a, Rf.a.PerformedCustomAction, str44, null, 4, null);
                        str28 = str44;
                        objectRef.element = A11;
                        if (A11 != 0) {
                            A11.getAction();
                        }
                        Trigger.Type type = Trigger.Type.SendChatInvite;
                        z20 = z15;
                        if (type != null) {
                            Trigger trigger9 = (Trigger) objectRef.element;
                            if ((trigger9 != null ? trigger9.getType() : null) != type) {
                                Trigger trigger10 = (Trigger) objectRef.element;
                                if (trigger10 != null) {
                                    trigger10.getAction();
                                }
                                if (Trigger.Type.InvokeJSApi == null) {
                                    m(interfaceC6686a3, interfaceC6686a4, str17, we.d.f67624F);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        booleanRef3.element = true;
                        z12 = true;
                        Trigger trigger11 = (Trigger) objectRef.element;
                        if (trigger11 != null) {
                            trigger11.getAction();
                        }
                        if (type == null) {
                            booleanRef2.element = z16;
                        }
                        Ref.BooleanRef booleanRef24 = booleanRef3;
                        str16 = str17;
                        activity2 = activity3;
                        z14 = z16;
                        booleanRef = booleanRef24;
                        p11 = p12;
                        dVar2 = dVar3;
                        str15 = str28;
                        aVar = aVar2;
                        z13 = z20;
                        if (bot != null) {
                        }
                        p13 = p11;
                        Trigger trigger42 = (Trigger) objectRef.element;
                        if (trigger42 != null) {
                        }
                        if (bot != null) {
                        }
                        Trigger trigger52 = (Trigger) objectRef.element;
                        if (trigger52 != null) {
                        }
                        if (displayName == null) {
                        }
                        String str362 = displayName;
                        if (bot == null) {
                        }
                        trigger = (Trigger) objectRef.element;
                        if ((trigger == null ? trigger.getParams() : null) == null) {
                        }
                        trigger2 = (Trigger) objectRef.element;
                        if (trigger2 != null) {
                        }
                        z17 = z11;
                        waitingChatDetails = new WaitingChatDetails(id2, str362, z17, str16, department3 != null ? department3.getName() : null);
                        if (UTSUtil.isTrackingEnabled()) {
                        }
                        str19 = str5;
                        String str372 = str3;
                        str33 = str11;
                        String str382 = str12;
                        str34 = str13;
                        str35 = str14;
                        Class cls32 = cls;
                        if (!UTSUtil.isTrackingEnabled()) {
                        }
                        booleanRef4 = new Ref.BooleanRef();
                        if (UTSUtil.isTrackingEnabled()) {
                        }
                        WaitingChatDetails waitingChatDetails22 = waitingChatDetails;
                        String str392 = str15;
                        String str402 = str16;
                        InterfaceC6686a interfaceC6686a92 = interfaceC6686a4;
                        InterfaceC6686a interfaceC6686a102 = interfaceC6686a3;
                        Rf.a aVar82 = aVar;
                        Pair s102 = s(aVar82, str392, interfaceC6686a102, interfaceC6686a92, str402, waitingChatDetails22, department3);
                        aVar3 = aVar82;
                        str20 = str392;
                        str21 = str402;
                        department4 = department3;
                        booleanValue = ((Boolean) s102.component1()).booleanValue();
                        boolean booleanValue22 = ((Boolean) s102.component2()).booleanValue();
                        Object obj82 = obj;
                        booleanRef5 = new Ref.BooleanRef();
                        if (!booleanValue) {
                        }
                    }
                    z12 = true;
                    Ref.BooleanRef booleanRef242 = booleanRef3;
                    str16 = str17;
                    activity2 = activity3;
                    z14 = z16;
                    booleanRef = booleanRef242;
                    p11 = p12;
                    dVar2 = dVar3;
                    str15 = str28;
                    aVar = aVar2;
                    z13 = z20;
                    if (bot != null) {
                    }
                    p13 = p11;
                    Trigger trigger422 = (Trigger) objectRef.element;
                    if (trigger422 != null) {
                    }
                    if (bot != null) {
                    }
                    Trigger trigger522 = (Trigger) objectRef.element;
                    if (trigger522 != null) {
                    }
                    if (displayName == null) {
                    }
                    String str3622 = displayName;
                    if (bot == null) {
                    }
                    trigger = (Trigger) objectRef.element;
                    if ((trigger == null ? trigger.getParams() : null) == null) {
                    }
                    trigger2 = (Trigger) objectRef.element;
                    if (trigger2 != null) {
                    }
                    z17 = z11;
                    waitingChatDetails = new WaitingChatDetails(id2, str3622, z17, str16, department3 != null ? department3.getName() : null);
                    if (UTSUtil.isTrackingEnabled()) {
                    }
                    str19 = str5;
                    String str3722 = str3;
                    str33 = str11;
                    String str3822 = str12;
                    str34 = str13;
                    str35 = str14;
                    Class cls322 = cls;
                    if (!UTSUtil.isTrackingEnabled()) {
                    }
                    booleanRef4 = new Ref.BooleanRef();
                    if (UTSUtil.isTrackingEnabled()) {
                    }
                    WaitingChatDetails waitingChatDetails222 = waitingChatDetails;
                    String str3922 = str15;
                    String str4022 = str16;
                    InterfaceC6686a interfaceC6686a922 = interfaceC6686a4;
                    InterfaceC6686a interfaceC6686a1022 = interfaceC6686a3;
                    Rf.a aVar822 = aVar;
                    Pair s1022 = s(aVar822, str3922, interfaceC6686a1022, interfaceC6686a922, str4022, waitingChatDetails222, department3);
                    aVar3 = aVar822;
                    str20 = str3922;
                    str21 = str4022;
                    department4 = department3;
                    booleanValue = ((Boolean) s1022.component1()).booleanValue();
                    boolean booleanValue222 = ((Boolean) s1022.component2()).booleanValue();
                    Object obj822 = obj;
                    booleanRef5 = new Ref.BooleanRef();
                    if (!booleanValue) {
                    }
                }
            }
            eVar = new e(continuation);
            e eVar22 = eVar;
            Object obj72 = eVar22.f11627C;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = eVar22.f11628D;
            String str332 = "SINGLETASK";
            String str342 = "chid";
            String str352 = "department_name";
            if (i10 != 0) {
            }
            c5582a = (C5582a) obj2;
            if (c5582a.d()) {
            }
            z12 = true;
            Ref.BooleanRef booleanRef2422 = booleanRef3;
            str16 = str17;
            activity2 = activity3;
            z14 = z16;
            booleanRef = booleanRef2422;
            p11 = p12;
            dVar2 = dVar3;
            str15 = str28;
            aVar = aVar2;
            z13 = z20;
            if (bot != null) {
            }
            p13 = p11;
            Trigger trigger4222 = (Trigger) objectRef.element;
            if (trigger4222 != null) {
            }
            if (bot != null) {
            }
            Trigger trigger5222 = (Trigger) objectRef.element;
            if (trigger5222 != null) {
            }
            if (displayName == null) {
            }
            String str36222 = displayName;
            if (bot == null) {
            }
            trigger = (Trigger) objectRef.element;
            if ((trigger == null ? trigger.getParams() : null) == null) {
            }
            trigger2 = (Trigger) objectRef.element;
            if (trigger2 != null) {
            }
            z17 = z11;
            waitingChatDetails = new WaitingChatDetails(id2, str36222, z17, str16, department3 != null ? department3.getName() : null);
            if (UTSUtil.isTrackingEnabled()) {
            }
            str19 = str5;
            String str37222 = str3;
            str332 = str11;
            String str38222 = str12;
            str342 = str13;
            str352 = str14;
            Class cls3222 = cls;
            if (!UTSUtil.isTrackingEnabled()) {
            }
            booleanRef4 = new Ref.BooleanRef();
            if (UTSUtil.isTrackingEnabled()) {
            }
            WaitingChatDetails waitingChatDetails2222 = waitingChatDetails;
            String str39222 = str15;
            String str40222 = str16;
            InterfaceC6686a interfaceC6686a9222 = interfaceC6686a4;
            InterfaceC6686a interfaceC6686a10222 = interfaceC6686a3;
            Rf.a aVar8222 = aVar;
            Pair s10222 = s(aVar8222, str39222, interfaceC6686a10222, interfaceC6686a9222, str40222, waitingChatDetails2222, department3);
            aVar3 = aVar8222;
            str20 = str39222;
            str21 = str40222;
            department4 = department3;
            booleanValue = ((Boolean) s10222.component1()).booleanValue();
            boolean booleanValue2222 = ((Boolean) s10222.component2()).booleanValue();
            Object obj8222 = obj;
            booleanRef5 = new Ref.BooleanRef();
            if (!booleanValue) {
            }
        }

        public static /* synthetic */ Object r(String str, String str2, boolean z10, Channel.Department department, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, P p10, Activity activity, we.d dVar, Continuation continuation, int i10, Object obj) {
            return p(str, str2, z10, department, interfaceC6686a, interfaceC6686a2, p10, activity, (i10 & 256) != 0 ? null : dVar, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Pair s(Rf.a aVar, String str, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, String str2, WaitingChatDetails waitingChatDetails, Channel.Department department) {
            String str3;
            boolean z10;
            Trigger.Params.Attender attender;
            Trigger.Params.Attender attender2;
            Trigger A10 = Tf.b.A(Tf.b.f11754a, aVar, str, null, 4, null);
            if (A10 == null) {
                Boolean bool = Boolean.FALSE;
                return new Pair(bool, bool);
            }
            Trigger.Type type = A10.getType();
            if (type == null) {
                A10.getAction();
                type = null;
            }
            if ((type == null ? -1 : h.$EnumSwitchMapping$0[type.ordinal()]) != 1) {
                return new Pair(Boolean.TRUE, Boolean.FALSE);
            }
            if (interfaceC6686a != null) {
                a.f11572a.k0().put(str2, interfaceC6686a);
            }
            if (interfaceC6686a2 != null) {
                a.f11572a.l0().put(str2, interfaceC6686a2);
            }
            if (waitingChatDetails == null) {
                Trigger.Params params = A10.getParams();
                String id2 = (params == null || (attender2 = params.getAttender()) == null) ? null : attender2.getId();
                Trigger.Params params2 = A10.getParams();
                String displayName = (params2 == null || (attender = params2.getAttender()) == null) ? null : attender.getDisplayName();
                if (A10.getParams() != null) {
                    Trigger.Params.Attender attender3 = A10.getParams().getAttender();
                    if (!(attender3 != null ? Intrinsics.areEqual(attender3.isBot(), Boolean.TRUE) : false)) {
                        z10 = true;
                        str3 = str2;
                        waitingChatDetails = new WaitingChatDetails(id2, displayName, z10, str3, department != null ? department.getName() : null);
                    }
                }
                A10.getAction();
                z10 = false;
                str3 = str2;
                waitingChatDetails = new WaitingChatDetails(id2, displayName, z10, str3, department != null ? department.getName() : null);
            } else {
                str3 = str2;
            }
            Tf.b.d(str3, waitingChatDetails);
            Boolean bool2 = Boolean.TRUE;
            return new Pair(bool2, bool2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            A a10 = new A(this.f11599p, this.f11600q, this.f11601r, this.f11602s, this.f11603t, this.f11604u, this.f11605v, continuation);
            a10.f11598o = obj;
            return a10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((A) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11597n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final P p10 = (P) this.f11598o;
            if (this.f11599p == null) {
                m(this.f11603t, this.f11604u, this.f11600q, we.d.f67649d);
                return Unit.INSTANCE;
            }
            String str = this.f11600q;
            if (!this.f11605v) {
                str = null;
            }
            String str2 = this.f11601r;
            Channel.Department department = this.f11602s;
            String id2 = department != null ? department.getId() : null;
            final String str3 = this.f11601r;
            final String str4 = this.f11600q;
            final boolean z10 = this.f11605v;
            final Channel.Department department2 = this.f11602s;
            final InterfaceC6686a interfaceC6686a = this.f11603t;
            final InterfaceC6686a interfaceC6686a2 = this.f11604u;
            final Activity activity = this.f11599p;
            a.B(str, str2, false, true, id2, new InterfaceC6686a() { // from class: Te.c
                @Override // ve.InterfaceC6686a
                public final void a(e eVar) {
                    a.A.o(str3, str4, z10, department2, interfaceC6686a, interfaceC6686a2, p10, activity, eVar);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final class B extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final B f11652d = new B();

        public B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.h invoke() {
            return new Od.h(a.f11572a.J());
        }
    }

    public static final class C extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11653n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C4507a f11654o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Pe.b f11655p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(C4507a c4507a, Pe.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f11654o = c4507a;
            this.f11655p = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C(this.f11654o, this.f11655p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11653n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                d dVar = d.f67581a;
                Application e10 = MobilistenInitProvider.INSTANCE.e();
                Object d10 = this.f11654o.d();
                Intrinsics.checkNotNull(d10);
                this.f11653n = 1;
                obj = dVar.t(e10, d10, this);
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
            Pe.b bVar = this.f11655p;
            if (c5582a.d()) {
                a.f11572a.i0().d(Pe.b.b(bVar, null, null, null, null, AbstractC5890b.d((Bitmap) c5582a.b(), null, 0, 3, null), null, 47, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class D extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final D f11656d = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.n invoke() {
            return new Re.n(a.f11572a.P());
        }
    }

    public static final class E extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final E f11657d = new E();

        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.p invoke() {
            return new Re.p(a.f11572a.P());
        }
    }

    public static final class F extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11658n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11659o;

        /* renamed from: p, reason: collision with root package name */
        public int f11660p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.d f11661q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f11662r;

        /* renamed from: Te.a$F$a, reason: collision with other inner class name */
        public static final class DialogInterfaceOnClickListenerC0226a implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Continuation f11663a;

            public DialogInterfaceOnClickListenerC0226a(Continuation continuation) {
                this.f11663a = continuation;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SharedPreferences.Editor edit;
                SharedPreferences.Editor putBoolean;
                SharedPreferences M10 = C6218a.M();
                if (M10 != null && (edit = M10.edit()) != null && (putBoolean = edit.putBoolean("chat_gdpr_consent", true)) != null) {
                    putBoolean.commit();
                }
                Continuation continuation = this.f11663a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Boolean.TRUE));
            }
        }

        public static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Continuation f11664a;

            public b(Continuation continuation) {
                this.f11664a = continuation;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Continuation continuation = this.f11664a;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Boolean.FALSE));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(androidx.appcompat.view.d dVar, Ref.ObjectRef objectRef, Continuation continuation) {
            super(1, continuation);
            this.f11661q = dVar;
            this.f11662r = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new F(this.f11661q, this.f11662r, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11660p;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            androidx.appcompat.view.d dVar = this.f11661q;
            Ref.ObjectRef objectRef = this.f11662r;
            this.f11658n = dVar;
            this.f11659o = objectRef;
            this.f11660p = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            qe.d dVar2 = qe.d.f63485a;
            qe.d.i(dVar, dVar.getString(od.t.f60977Z), (SpannableString) objectRef.element, dVar.getString(od.t.f60885J3), new DialogInterfaceOnClickListenerC0226a(safeContinuation), null, dVar.getString(od.t.f60891K3), new b(safeContinuation), Boxing.boxInt(AbstractC5892d.h(dVar, Boxing.boxInt(AbstractC5886l.f59900w1), 0.0f, 2, null)), null, null, false, false, null, 13856, null);
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((F) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class G extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11665a;

        public G(String str) {
            this.f11665a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            LiveChatUtil.openUrl(this.f11665a);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(-16777216);
            ds.setUnderlineText(true);
        }
    }

    /* renamed from: Te.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0227a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Md.a.values().length];
            try {
                iArr[Md.a.Chat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Md.a.Call.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SalesIQChat.Media.Status.values().length];
            try {
                iArr2[SalesIQChat.Media.Status.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SalesIQChat.Media.Status.MISSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SalesIQChat.Media.Status.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SalesIQChat.Media.Status.CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SalesIQChat.Media.Status.INVITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SalesIQChat.Media.Status.INITIATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SalesIQChat.Media.Status.ACCEPTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SalesIQChat.Media.UserType.values().length];
            try {
                iArr3[SalesIQChat.Media.UserType.OPERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SalesIQChat.Media.UserType.VISITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: Te.a$b, reason: case insensitive filesystem */
    public static final class C1688b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1688b f11666d = new C1688b();

        public C1688b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            a.C0136a c0136a = Kd.a.f6469f;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0136a.a(e10);
        }
    }

    /* renamed from: Te.a$c, reason: case insensitive filesystem */
    public static final class C1689c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11667n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f11668o;

        /* renamed from: p, reason: collision with root package name */
        public int f11669p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Activity f11670q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f11671r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f11672s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f11673t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f11674u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11675v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f11676w;

        /* renamed from: Te.a$c$a, reason: collision with other inner class name */
        public static final class C0228a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11677n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f11678o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0228a(String str, Continuation continuation) {
                super(2, continuation);
                this.f11678o = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0228a(this.f11678o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0228a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11677n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LiveChatUtil.getChatWithAnyId(this.f11678o);
            }
        }

        /* renamed from: Te.a$c$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11679n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11680o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ we.d f11681p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC6686a interfaceC6686a, we.d dVar, Continuation continuation) {
                super(2, continuation);
                this.f11680o = interfaceC6686a;
                this.f11681p = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f11680o, this.f11681p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11679n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC6686a interfaceC6686a = this.f11680o;
                if (interfaceC6686a == null) {
                    return null;
                }
                interfaceC6686a.a(we.e.f67680b.a(this.f11681p));
                return Unit.INSTANCE;
            }
        }

        /* renamed from: Te.a$c$c, reason: collision with other inner class name */
        public static final class C0229c extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f11682n;

            /* renamed from: o, reason: collision with root package name */
            public Object f11683o;

            /* renamed from: p, reason: collision with root package name */
            public Object f11684p;

            /* renamed from: q, reason: collision with root package name */
            public boolean f11685q;

            /* renamed from: r, reason: collision with root package name */
            public boolean f11686r;

            /* renamed from: s, reason: collision with root package name */
            public boolean f11687s;

            /* renamed from: t, reason: collision with root package name */
            public int f11688t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f11689u;

            /* renamed from: v, reason: collision with root package name */
            public int f11690v;

            public C0229c(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f11689u = obj;
                this.f11690v |= Integer.MIN_VALUE;
                return C1689c.k(null, null, null, false, false, false, null, this);
            }
        }

        /* renamed from: Te.a$c$d */
        public static final class d extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11691n;

            public d(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11691n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LiveChatUtil.getConnectedChatIds();
            }
        }

        /* renamed from: Te.a$c$e */
        public static final class e extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11692n;

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
                if (this.f11692n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LiveChatUtil.getAllOpenChatIds();
            }
        }

        /* renamed from: Te.a$c$f */
        public static final class f extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11693n;

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
                if (this.f11693n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LiveChatUtil.getAllOpenChatIds();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1689c(Activity activity, boolean z10, String str, String str2, boolean z11, String str3, InterfaceC6686a interfaceC6686a, Continuation continuation) {
            super(2, continuation);
            this.f11670q = activity;
            this.f11671r = z10;
            this.f11672s = str;
            this.f11673t = str2;
            this.f11674u = z11;
            this.f11675v = str3;
            this.f11676w = interfaceC6686a;
        }

        public static final Object j(InterfaceC6686a interfaceC6686a, we.d dVar, Continuation continuation) {
            return AbstractC1455i.g(C1452g0.c(), new b(interfaceC6686a, dVar, null), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0267, code lost:
        
            if (j(r6, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x02c9, code lost:
        
            if (j(r6, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x02f1, code lost:
        
            if (j(r6, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x028d, code lost:
        
            if (j(r6, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0244, code lost:
        
            if (r2 != r3) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
        
            if (j(r1, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x01a3, code lost:
        
            if (j(r1, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01b2, code lost:
        
            if (j(r1, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
        
            if (j(r1, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
        
            if (j(r1, r0, r9) == r3) goto L148;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x021c  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x02e1  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object k(String str, String str2, Bot bot, boolean z10, boolean z11, boolean z12, InterfaceC6686a interfaceC6686a, Continuation continuation) {
            C0229c c0229c;
            C0229c c0229c2;
            String str3;
            InterfaceC6686a interfaceC6686a2;
            Object obj;
            int i10;
            boolean z13;
            boolean z14;
            C4507a.C0720a c0720a;
            C4507a R02;
            boolean z15;
            boolean z16;
            Bot bot2;
            int i11;
            Pair pair;
            Object g10;
            boolean z17;
            InterfaceC6686a interfaceC6686a3;
            List list;
            Bot bot3 = bot;
            boolean z18 = z10;
            if (continuation instanceof C0229c) {
                c0229c = (C0229c) continuation;
                int i12 = c0229c.f11690v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c0229c.f11690v = i12 - Integer.MIN_VALUE;
                    c0229c2 = c0229c;
                    Object obj2 = c0229c2.f11689u;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i13 = 0;
                    switch (c0229c2.f11690v) {
                        case 0:
                            ResultKt.throwOnFailure(obj2);
                            if (og.i.f(str) && og.i.f(str2)) {
                                Intrinsics.checkNotNull(str);
                                Pe.b h02 = a.h0(str);
                                if (h02 == null || (R02 = a.f11572a.R0(h02)) == null || (c0720a = R02.f()) == null) {
                                    c0720a = new C4507a.C0720a();
                                }
                                str3 = str;
                                a.C0(str3, c0720a.d(CollectionsKt.listOf(new od.w(str2, null, Se.a.CHAT))).a(), Pe.a.Chat);
                            } else {
                                str3 = str;
                            }
                            com.zoho.livechat.android.modules.brand.ui.helpers.a aVar = com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a;
                            Pe.a aVar2 = Pe.a.Chat;
                            boolean z19 = bot3 != null && z18;
                            c0229c2.f11682n = bot3;
                            c0229c2.f11683o = interfaceC6686a;
                            c0229c2.f11685q = z18;
                            c0229c2.f11686r = z11;
                            c0229c2.f11687s = z12;
                            c0229c2.f11688t = 1;
                            c0229c2.f11690v = 1;
                            Object k10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.k(aVar, aVar2, str3, z19, null, c0229c2, 8, null);
                            if (k10 != coroutine_suspended) {
                                interfaceC6686a2 = interfaceC6686a;
                                obj = k10;
                                i10 = 1;
                                z13 = z11;
                                z14 = z12;
                                if (!z13 && Result.m154isSuccessimpl(obj)) {
                                    if (Result.m153isFailureimpl(obj)) {
                                        obj = null;
                                    }
                                    pair = (Pair) obj;
                                    if (pair != null && ((Boolean) pair.getSecond()).booleanValue()) {
                                        L b10 = C1452g0.b();
                                        e eVar = new e(null);
                                        c0229c2.f11682n = interfaceC6686a2;
                                        c0229c2.f11683o = null;
                                        c0229c2.f11685q = z14;
                                        c0229c2.f11690v = 2;
                                        g10 = AbstractC1455i.g(b10, eVar, c0229c2);
                                        if (g10 != coroutine_suspended) {
                                            boolean z20 = z14;
                                            obj2 = g10;
                                            z17 = z20;
                                            interfaceC6686a3 = interfaceC6686a2;
                                            Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
                                            List list2 = (List) obj2;
                                            if (!z17) {
                                                if (!list2.isEmpty()) {
                                                    we.d dVar = we.d.f67672w;
                                                    c0229c2.f11682n = null;
                                                    c0229c2.f11690v = 3;
                                                    break;
                                                } else {
                                                    Channel m10 = C6822a.m();
                                                    if ((m10 != null ? m10.getFormType() : null) != Form.Type.Conversation || !LiveChatUtil.isFormContextStarted()) {
                                                        we.d dVar2 = we.d.f67673x;
                                                        c0229c2.f11682n = null;
                                                        c0229c2.f11690v = 5;
                                                        break;
                                                    } else {
                                                        we.d dVar3 = we.d.f67620B;
                                                        c0229c2.f11682n = null;
                                                        c0229c2.f11690v = 4;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                if (!list2.isEmpty() && LiveChatUtil.isFormContextStarted()) {
                                                    Channel m11 = C6822a.m();
                                                    if ((m11 != null ? m11.getFormType() : null) == Form.Type.Conversation) {
                                                        we.d dVar4 = we.d.f67620B;
                                                        c0229c2.f11682n = null;
                                                        c0229c2.f11690v = 6;
                                                        break;
                                                    }
                                                }
                                                we.d dVar5 = we.d.f67673x;
                                                c0229c2.f11682n = null;
                                                c0229c2.f11690v = 7;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (z14 && !z13) {
                                    i13 = i10;
                                    if (i13 != 0) {
                                        we.d dVar6 = we.d.f67672w;
                                        c0229c2.f11682n = null;
                                        c0229c2.f11683o = null;
                                        c0229c2.f11684p = null;
                                        c0229c2.f11690v = 13;
                                        break;
                                    } else {
                                        if (z18 || z13) {
                                            if (bot3 == null && UTSUtil.isTrackingEnabled()) {
                                                we.d dVar7 = we.d.f67628J;
                                                c0229c2.f11682n = null;
                                                c0229c2.f11683o = null;
                                                c0229c2.f11684p = null;
                                                c0229c2.f11690v = 12;
                                                break;
                                            } else if (interfaceC6686a2 != null) {
                                                interfaceC6686a2.a(we.e.f67680b.b(Boxing.boxBoolean(true)));
                                            }
                                        } else if (interfaceC6686a2 != null) {
                                            interfaceC6686a2.a(we.e.f67680b.b(Boxing.boxBoolean(true)));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    L b11 = C1452g0.b();
                                    d dVar8 = new d(null);
                                    c0229c2.f11682n = bot3;
                                    c0229c2.f11683o = interfaceC6686a2;
                                    c0229c2.f11685q = z18;
                                    c0229c2.f11686r = z13;
                                    c0229c2.f11688t = i10;
                                    c0229c2.f11690v = 8;
                                    obj2 = AbstractC1455i.g(b11, dVar8, c0229c2);
                                    if (obj2 != coroutine_suspended) {
                                        boolean z21 = z13;
                                        z15 = z18;
                                        z16 = z21;
                                        bot2 = bot3;
                                        i11 = i10;
                                        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
                                        list = (List) obj2;
                                        L b12 = C1452g0.b();
                                        f fVar = new f(null);
                                        c0229c2.f11682n = bot2;
                                        c0229c2.f11683o = interfaceC6686a2;
                                        c0229c2.f11684p = list;
                                        c0229c2.f11685q = z15;
                                        c0229c2.f11686r = z16;
                                        c0229c2.f11688t = i11;
                                        c0229c2.f11690v = 9;
                                        obj2 = AbstractC1455i.g(b12, fVar, c0229c2);
                                        break;
                                    }
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            int i14 = c0229c2.f11688t;
                            boolean z22 = c0229c2.f11687s;
                            z13 = c0229c2.f11686r;
                            boolean z23 = c0229c2.f11685q;
                            interfaceC6686a2 = (InterfaceC6686a) c0229c2.f11683o;
                            Bot bot4 = (Bot) c0229c2.f11682n;
                            ResultKt.throwOnFailure(obj2);
                            i10 = i14;
                            bot3 = bot4;
                            obj = ((Result) obj2).getValue();
                            z14 = z22;
                            z18 = z23;
                            if (!z13) {
                                if (Result.m153isFailureimpl(obj)) {
                                }
                                pair = (Pair) obj;
                                if (pair != null) {
                                    L b102 = C1452g0.b();
                                    e eVar2 = new e(null);
                                    c0229c2.f11682n = interfaceC6686a2;
                                    c0229c2.f11683o = null;
                                    c0229c2.f11685q = z14;
                                    c0229c2.f11690v = 2;
                                    g10 = AbstractC1455i.g(b102, eVar2, c0229c2);
                                    if (g10 != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                break;
                            }
                            if (z14) {
                            }
                            L b112 = C1452g0.b();
                            d dVar82 = new d(null);
                            c0229c2.f11682n = bot3;
                            c0229c2.f11683o = interfaceC6686a2;
                            c0229c2.f11685q = z18;
                            c0229c2.f11686r = z13;
                            c0229c2.f11688t = i10;
                            c0229c2.f11690v = 8;
                            obj2 = AbstractC1455i.g(b112, dVar82, c0229c2);
                            if (obj2 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        case 2:
                            z17 = c0229c2.f11685q;
                            interfaceC6686a3 = (InterfaceC6686a) c0229c2.f11682n;
                            ResultKt.throwOnFailure(obj2);
                            Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
                            List list22 = (List) obj2;
                            if (!z17) {
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        case 8:
                            i11 = c0229c2.f11688t;
                            z16 = c0229c2.f11686r;
                            z15 = c0229c2.f11685q;
                            InterfaceC6686a interfaceC6686a4 = (InterfaceC6686a) c0229c2.f11683o;
                            Bot bot5 = (Bot) c0229c2.f11682n;
                            ResultKt.throwOnFailure(obj2);
                            bot2 = bot5;
                            interfaceC6686a2 = interfaceC6686a4;
                            Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
                            list = (List) obj2;
                            L b122 = C1452g0.b();
                            f fVar2 = new f(null);
                            c0229c2.f11682n = bot2;
                            c0229c2.f11683o = interfaceC6686a2;
                            c0229c2.f11684p = list;
                            c0229c2.f11685q = z15;
                            c0229c2.f11686r = z16;
                            c0229c2.f11688t = i11;
                            c0229c2.f11690v = 9;
                            obj2 = AbstractC1455i.g(b122, fVar2, c0229c2);
                            break;
                        case 9:
                            i11 = c0229c2.f11688t;
                            z16 = c0229c2.f11686r;
                            z15 = c0229c2.f11685q;
                            list = (List) c0229c2.f11684p;
                            interfaceC6686a2 = (InterfaceC6686a) c0229c2.f11683o;
                            bot2 = (Bot) c0229c2.f11682n;
                            ResultKt.throwOnFailure(obj2);
                            Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
                            List list3 = (List) obj2;
                            if (!list.isEmpty()) {
                                if (z16) {
                                    we.d dVar9 = we.d.f67672w;
                                    c0229c2.f11682n = null;
                                    c0229c2.f11683o = null;
                                    c0229c2.f11684p = null;
                                    c0229c2.f11690v = 10;
                                    break;
                                }
                                boolean z24 = z15;
                                z13 = z16;
                                z18 = z24;
                            } else if (list3.isEmpty()) {
                                boolean z25 = z15;
                                z13 = z16;
                                z18 = z25;
                                i13 = i11;
                            } else {
                                if (z16) {
                                    we.d dVar10 = we.d.f67672w;
                                    c0229c2.f11682n = null;
                                    c0229c2.f11683o = null;
                                    c0229c2.f11684p = null;
                                    c0229c2.f11690v = 11;
                                    break;
                                }
                                boolean z242 = z15;
                                z13 = z16;
                                z18 = z242;
                            }
                            bot3 = bot2;
                            if (i13 != 0) {
                            }
                            return coroutine_suspended;
                        case 10:
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        case 11:
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        case 12:
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        case 13:
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            c0229c = new C0229c(continuation);
            c0229c2 = c0229c;
            Object obj22 = c0229c2.f11689u;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i132 = 0;
            switch (c0229c2.f11690v) {
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1689c(this.f11670q, this.f11671r, this.f11672s, this.f11673t, this.f11674u, this.f11675v, this.f11676w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C1689c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0193, code lost:
        
            if (j(r1, r2, r9) == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        
            if (j(r10, r1, r9) == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
        
            if (j(r10, r1, r9) == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
        
            if (j(r10, r1, r9) == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x01a8, code lost:
        
            if (k(r1, r2, r10, r4, r5, r6, r7, r9) == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x008f, code lost:
        
            if (r10 == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x005a, code lost:
        
            if (j(r10, r1, r9) == r0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0074, code lost:
        
            if (j(r10, r1, r9) == r0) goto L88;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            we.d Q10;
            boolean isMultipleChatsDisabled;
            Bot bot;
            String str;
            C5582a c5582a;
            C1689c c1689c;
            C5582a c5582a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f11669p) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    if (this.f11670q != null) {
                        Q10 = a.f11572a.Q();
                        if (Q10 != null) {
                            InterfaceC6686a interfaceC6686a = this.f11676w;
                            this.f11667n = Q10;
                            this.f11669p = 2;
                            break;
                        } else {
                            Q10 = null;
                        }
                        if (Q10 == null) {
                            L b10 = C1452g0.b();
                            C0228a c0228a = new C0228a(this.f11672s, null);
                            this.f11667n = null;
                            this.f11669p = 3;
                            obj = AbstractC1455i.g(b10, c0228a, this);
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    InterfaceC6686a interfaceC6686a2 = this.f11676w;
                    we.d dVar = we.d.f67649d;
                    this.f11669p = 1;
                    break;
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 2:
                    Q10 = (we.d) this.f11667n;
                    ResultKt.throwOnFailure(obj);
                    if (Q10 == null) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    if (obj == null) {
                        if (this.f11671r && ((str = this.f11672s) == null || str.length() == 0)) {
                            ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                            Intrinsics.checkNotNullExpressionValue(allOpenChatIds, "getAllOpenChatIds(...)");
                            if (!allOpenChatIds.isEmpty()) {
                                InterfaceC6686a interfaceC6686a3 = this.f11676w;
                                we.d dVar2 = we.d.f67627I;
                                this.f11669p = 5;
                                break;
                            }
                        }
                        isMultipleChatsDisabled = LiveChatUtil.isMultipleChatsDisabled();
                        Bot bot2 = og.i.f(this.f11673t) ? UTSUtil.getBot(UTSUtil.EVENT_CUSTOM_ACTIONS, this.f11673t) : UTSUtil.getBot(UTSUtil.EVENT_WIDGET_INTERACTION, null);
                        if (!UTSUtil.isTrackingEnabled() || bot2 != null || !this.f11674u) {
                            EnumC4544a w10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.w(this.f11672s, this.f11675v, this.f11671r);
                            if (C6822a.s(w10) == null && !C6822a.C(w10)) {
                                Channel m10 = C6822a.m();
                                if ((m10 != null ? m10.getFormType() : null) != Form.Type.Conversation) {
                                    Od.h m02 = a.f11572a.m0();
                                    boolean isFormContextStarted = true ^ LiveChatUtil.isFormContextStarted();
                                    this.f11667n = bot2;
                                    this.f11668o = isMultipleChatsDisabled;
                                    this.f11669p = 7;
                                    Object a10 = m02.a(isFormContextStarted, null, w10, this);
                                    if (a10 != coroutine_suspended) {
                                        bot = bot2;
                                        obj = a10;
                                        c5582a = (C5582a) obj;
                                        String str2 = this.f11672s;
                                        String str3 = this.f11675v;
                                        boolean z10 = this.f11671r;
                                        boolean z11 = this.f11674u;
                                        InterfaceC6686a interfaceC6686a4 = this.f11676w;
                                        if (c5582a.d()) {
                                            c1689c = this;
                                            InterfaceC6686a interfaceC6686a5 = c1689c.f11676w;
                                            if (!c5582a.d()) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        this.f11667n = c5582a;
                                        this.f11669p = 8;
                                        c1689c = this;
                                        if (k(str2, str3, bot, z10, z11, isMultipleChatsDisabled, interfaceC6686a4, c1689c) != coroutine_suspended) {
                                            c5582a2 = c5582a;
                                            c5582a = c5582a2;
                                            InterfaceC6686a interfaceC6686a52 = c1689c.f11676w;
                                            if (!c5582a.d()) {
                                                Intrinsics.checkNotNull(c5582a.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                                                we.d dVar3 = we.d.f67652e0;
                                                c1689c.f11667n = c5582a;
                                                c1689c.f11669p = 9;
                                                break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            String str4 = this.f11672s;
                            String str5 = this.f11675v;
                            boolean z12 = this.f11671r;
                            boolean z13 = this.f11674u;
                            InterfaceC6686a interfaceC6686a6 = this.f11676w;
                            this.f11669p = 6;
                            break;
                        } else {
                            InterfaceC6686a interfaceC6686a7 = this.f11676w;
                            we.d dVar4 = we.d.f67628J;
                            this.f11669p = 10;
                            break;
                        }
                    } else {
                        InterfaceC6686a interfaceC6686a8 = this.f11676w;
                        we.d dVar5 = we.d.f67671v;
                        this.f11669p = 4;
                        break;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 10:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 7:
                    boolean z14 = this.f11668o;
                    Bot bot3 = (Bot) this.f11667n;
                    ResultKt.throwOnFailure(obj);
                    isMultipleChatsDisabled = z14;
                    bot = bot3;
                    c5582a = (C5582a) obj;
                    String str22 = this.f11672s;
                    String str32 = this.f11675v;
                    boolean z102 = this.f11671r;
                    boolean z112 = this.f11674u;
                    InterfaceC6686a interfaceC6686a42 = this.f11676w;
                    if (c5582a.d()) {
                    }
                    break;
                case 8:
                    c5582a2 = (C5582a) this.f11667n;
                    ResultKt.throwOnFailure(obj);
                    c1689c = this;
                    c5582a = c5582a2;
                    InterfaceC6686a interfaceC6686a522 = c1689c.f11676w;
                    if (!c5582a.d()) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: Te.a$d, reason: case insensitive filesystem */
    public static final class C1690d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1690d f11694d = new C1690d();

        public C1690d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.a invoke() {
            return new Re.a(a.f11572a.P());
        }
    }

    /* renamed from: Te.a$e, reason: case insensitive filesystem */
    public static final class C1691e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1691e f11695d = new C1691e();

        public C1691e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.b invoke() {
            return new Re.b(a.f11572a.P());
        }
    }

    /* renamed from: Te.a$f, reason: case insensitive filesystem */
    public static final class C1692f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11696n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f11697o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1692f(List list, Continuation continuation) {
            super(2, continuation);
            this.f11697o = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1692f(this.f11697o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C1692f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11696n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Re.b M10 = a.f11572a.M();
                List list = this.f11697o;
                this.f11696n = 1;
                obj = M10.a(list, this);
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
            if (c5582a.d() && ((Boolean) c5582a.b()).booleanValue()) {
                Application e10 = MobilistenInitProvider.INSTANCE.e();
                Intrinsics.checkNotNull(e10);
                C1908a b10 = C1908a.b(e10);
                Intent intent = new Intent("receivelivechat");
                intent.putExtra("message", "validate_conversation_for_deletion");
                b10.d(intent);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: Te.a$g, reason: case insensitive filesystem */
    public static final class C1693g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1693g f11698d = new C1693g();

        public C1693g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.c invoke() {
            return new Re.c(a.f11572a.P());
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11699n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f11700o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation continuation) {
            super(2, continuation);
            this.f11700o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f11700o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11699n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a.f11572a.N().a(this.f11700o);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f11701d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Be.a invoke() {
            a.C0020a c0020a = Be.a.f866b;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0020a.a(e10);
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f11702d = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ke.a invoke() {
            a.C0137a c0137a = Ke.a.f6496j;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0137a.a(e10);
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11703n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f11704o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f11705p;

        /* renamed from: Te.a$k$a, reason: collision with other inner class name */
        public static final class C0230a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11706n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ SalesIQChat f11707o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f11708p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ VisitorChat f11709q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0230a(SalesIQChat salesIQChat, InterfaceC6686a interfaceC6686a, VisitorChat visitorChat, Continuation continuation) {
                super(2, continuation);
                this.f11707o = salesIQChat;
                this.f11708p = interfaceC6686a;
                this.f11709q = visitorChat;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0230a(this.f11707o, this.f11708p, this.f11709q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0230a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11706n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.f11707o != null) {
                    this.f11708p.a(e.f67680b.b(this.f11709q));
                } else {
                    this.f11708p.a(e.f67680b.a(we.d.f67623E));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, InterfaceC6686a interfaceC6686a, Continuation continuation) {
            super(2, continuation);
            this.f11704o = str;
            this.f11705p = interfaceC6686a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f11704o, this.f11705p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((k) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11703n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(this.f11704o);
                VisitorChat visitorChatObject = chatWithAnyId != null ? LiveChatUtil.getVisitorChatObject(chatWithAnyId) : null;
                M0 c10 = C1452g0.c();
                C0230a c0230a = new C0230a(chatWithAnyId, this.f11705p, visitorChatObject, null);
                this.f11703n = 1;
                if (AbstractC1455i.g(c10, c0230a, this) == coroutine_suspended) {
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

    public static final class l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final l f11710d = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.e invoke() {
            return new Re.e(a.f11572a.P());
        }
    }

    public static final class m extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final m f11711d = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.b invoke() {
            return new Ge.b(a.f11572a.O());
        }
    }

    public static final class n extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final n f11712d = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.h invoke() {
            return new yf.h(a.f11572a.c0());
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11713n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f11714o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(List list, Continuation continuation) {
            super(2, continuation);
            this.f11714o = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f11714o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a10;
            Message message;
            String feedbackResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11713n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.h T10 = a.f11572a.T();
                this.f11713n = 1;
                a10 = T10.a(this);
                if (a10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a10 = obj;
            }
            List list = (List) ((C5582a) a10).b();
            List<SalesIQChat> list2 = this.f11714o;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (SalesIQChat salesIQChat : list2) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            message = 0;
                            break;
                        }
                        message = it.next();
                        if (Intrinsics.areEqual(salesIQChat.getChid(), ((Message) message).getChatId())) {
                            break;
                        }
                    }
                    Message message2 = message;
                    if (message2 != null) {
                        if (message2.getMessageType() == Message.g.Feedback) {
                            Message.Attachment attachment = message2.getAttachment();
                            if (og.i.d(attachment != null ? attachment.getRating() : null, 0)) {
                                Application e10 = MobilistenInitProvider.INSTANCE.e();
                                Message.Attachment attachment2 = message2.getAttachment();
                                feedbackResponse = LiveChatUtil.getRatingResponse(e10, og.i.k(attachment2 != null ? attachment2.getRating() : null));
                            } else {
                                Message.Attachment attachment3 = message2.getAttachment();
                                feedbackResponse = og.i.f(attachment3 != null ? attachment3.getRatingMessage() : null) ? LiveChatUtil.getFeedbackResponse(salesIQChat, MobilistenInitProvider.INSTANCE.e()) : LiveChatUtil.getThankingResponse(salesIQChat, MobilistenInitProvider.INSTANCE.e());
                            }
                            message2 = Message.copy$default(message2, null, null, null, null, null, null, null, null, feedbackResponse, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -257, 1023, null);
                        }
                        salesIQChat.setLastMessage(message2);
                    }
                }
                arrayList.add(salesIQChat);
            }
            return arrayList;
        }
    }

    public static final class p extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final p f11715d = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(a.f11572a.P());
        }
    }

    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11716n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f11717o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f11718p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ e f11719q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, SalesIQChat salesIQChat, e eVar, Continuation continuation) {
            super(2, continuation);
            this.f11717o = str;
            this.f11718p = salesIQChat;
            this.f11719q = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new q(this.f11717o, this.f11718p, this.f11719q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e a10;
            e a11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11716n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a aVar = a.f11572a;
            InterfaceC6686a interfaceC6686a = (InterfaceC6686a) aVar.k0().get(this.f11717o);
            if (interfaceC6686a != null) {
                SalesIQChat salesIQChat = this.f11718p;
                e eVar = this.f11719q;
                String str = this.f11717o;
                if (salesIQChat != null) {
                    a11 = e.f67680b.b(aVar.x0(salesIQChat));
                } else {
                    e.a aVar2 = e.f67680b;
                    we.d c10 = eVar.c();
                    if (c10 == null) {
                        c10 = we.d.f67649d;
                    }
                    a11 = aVar2.a(c10);
                }
                interfaceC6686a.a(a11);
            }
            InterfaceC6686a interfaceC6686a2 = (InterfaceC6686a) aVar.l0().get(this.f11717o);
            if (interfaceC6686a2 == null) {
                return null;
            }
            SalesIQChat salesIQChat2 = this.f11718p;
            e eVar2 = this.f11719q;
            String str2 = this.f11717o;
            if (salesIQChat2 != null) {
                a10 = e.f67680b.b(LiveChatUtil.getVisitorChatObject(salesIQChat2));
            } else {
                e.a aVar3 = e.f67680b;
                we.d c11 = eVar2.c();
                if (c11 == null) {
                    c11 = we.d.f67649d;
                }
                a10 = aVar3.a(c11);
            }
            interfaceC6686a2.a(a10);
            return (InterfaceC6686a) aVar.l0().remove(str2);
        }
    }

    public static final class r extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11720n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f11721o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f11722p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f11721o = str;
            this.f11722p = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.f11721o, this.f11722p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((r) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11720n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Re.h X10 = a.f11572a.X();
                String str = this.f11721o;
                String str2 = this.f11722p;
                this.f11720n = 1;
                if (X10.a(str, str2, this) == coroutine_suspended) {
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

    public static final class s extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final s f11723d = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.h invoke() {
            return new Re.h(a.f11572a.P());
        }
    }

    public static final class t extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final t f11724d = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.j invoke() {
            return new Re.j(a.f11572a.P());
        }
    }

    public static final class u extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final u f11725d = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            C6550a.C0924a c0924a = C6550a.f66357j;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0924a.a(e10);
        }
    }

    public static final class v extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final v f11726d = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.g invoke() {
            return new Ge.g(a.f11572a.O());
        }
    }

    public static final class w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11727n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Activity f11728o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f11729p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Channel.Department f11730q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f11731r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f11732s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f11733t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f11734u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Activity activity, String str, Channel.Department department, String str2, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f11728o = activity;
            this.f11729p = str;
            this.f11730q = department;
            this.f11731r = str2;
            this.f11732s = interfaceC6686a;
            this.f11733t = interfaceC6686a2;
            this.f11734u = str3;
        }

        public static final void j(InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, String str, we.d dVar) {
            if (interfaceC6686a != null) {
                interfaceC6686a.a(e.f67680b.a(dVar));
            }
            if (interfaceC6686a2 != null) {
                interfaceC6686a2.a(e.f67680b.a(dVar));
            }
            a.f11572a.F(str);
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
        public static final void k(String str, String str2, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, Activity activity, String str3, Channel.Department department, e eVar) {
            SalesIQChat salesIQChat;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (eVar.d()) {
                if (C6218a.c0()) {
                    o(str2, interfaceC6686a, interfaceC6686a2, activity, str3, department, objectRef, false, null, false, 896, null);
                    return;
                } else {
                    j(interfaceC6686a, interfaceC6686a2, str2, we.d.f67651e);
                    MobilistenUtil.z(od.t.f61107s, 0, 2, null);
                    return;
                }
            }
            if (Intrinsics.areEqual(eVar.c(), we.d.f67671v)) {
                SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(str);
                if (chatWithAnyId != null) {
                    objectRef.element = chatWithAnyId.getChid();
                    r1 = chatWithAnyId.getStatus() == 4 || chatWithAnyId.getStatus() == 3;
                    salesIQChat = chatWithAnyId;
                } else {
                    salesIQChat = null;
                }
                if (r1) {
                    if (LiveChatUtil.isMultipleChatsDisabled()) {
                        ArrayList<String> allOpenChatIds = LiveChatUtil.getAllOpenChatIds();
                        Intrinsics.checkNotNullExpressionValue(allOpenChatIds, "getAllOpenChatIds(...)");
                        if (!allOpenChatIds.isEmpty()) {
                            j(interfaceC6686a, interfaceC6686a2, str2, we.d.f67672w);
                            return;
                        }
                    }
                    if (LiveChatUtil.isReopenEnabled()) {
                        o(str2, interfaceC6686a, interfaceC6686a2, activity, str3, department, objectRef, true, salesIQChat, false, 512, null);
                        return;
                    } else {
                        j(interfaceC6686a, interfaceC6686a2, str2, we.d.f67621C);
                        return;
                    }
                }
            }
            we.d c10 = eVar.c();
            we.d dVar = we.d.f67673x;
            if (Intrinsics.areEqual(c10, dVar)) {
                j(interfaceC6686a, interfaceC6686a2, str2, dVar);
                o(str2, interfaceC6686a, interfaceC6686a2, activity, str3, department, objectRef, false, null, false, 384, null);
            } else {
                we.d c11 = eVar.c();
                Intrinsics.checkNotNull(c11);
                j(interfaceC6686a, interfaceC6686a2, str2, c11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void m(String str, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, Activity activity, String str2, Channel.Department department, Ref.ObjectRef objectRef, boolean z10, SalesIQChat salesIQChat, boolean z11) {
            if (z11) {
                if ((salesIQChat != null ? salesIQChat.getConvID() : null) != null) {
                    a aVar = a.f11572a;
                    if (aVar.j0().contains(str)) {
                        aVar.j0().remove(str);
                    }
                    List j02 = aVar.j0();
                    String convID = salesIQChat.getConvID();
                    Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                    j02.add(convID);
                    if (interfaceC6686a != null) {
                        ConcurrentHashMap k02 = aVar.k0();
                        String convID2 = salesIQChat.getConvID();
                        Intrinsics.checkNotNullExpressionValue(convID2, "getConvID(...)");
                        k02.put(convID2, interfaceC6686a);
                    }
                    if (interfaceC6686a2 != null) {
                        ConcurrentHashMap l02 = aVar.l0();
                        String convID3 = salesIQChat.getConvID();
                        Intrinsics.checkNotNullExpressionValue(convID3, "getConvID(...)");
                        l02.put(convID3, interfaceC6686a2);
                    }
                } else {
                    if (interfaceC6686a != null) {
                        a.f11572a.k0().put(str, interfaceC6686a);
                    }
                    if (interfaceC6686a2 != null) {
                        a.f11572a.l0().put(str, interfaceC6686a2);
                    }
                }
            }
            Intent intent = new Intent(activity, (Class<?>) ChatActivity.class);
            if (z10) {
                intent.putExtra("should_reopen_chat", true);
            }
            intent.putExtra("is_from_start_chat", true);
            intent.putExtra("question", str2);
            if (department != null) {
                intent.putExtra("department_id", department.getId());
                intent.putExtra("department_name", department.getName());
            }
            if (salesIQChat != null) {
                intent.putExtra("acknowledgement_key", salesIQChat.getConvID());
                String chid = salesIQChat.getChid();
                if (chid == null) {
                    chid = salesIQChat.getConvID();
                }
                intent.putExtra("chid", chid);
            } else {
                intent.putExtra("acknowledgement_key", str);
                String str3 = (String) objectRef.element;
                if (str3 != null) {
                    str = str3;
                }
                intent.putExtra("chid", str);
            }
            intent.putExtra("mode", "SINGLETASK");
            intent.setFlags(268435456);
            activity.startActivity(intent);
        }

        public static /* synthetic */ void o(String str, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, Activity activity, String str2, Channel.Department department, Ref.ObjectRef objectRef, boolean z10, SalesIQChat salesIQChat, boolean z11, int i10, Object obj) {
            m(str, interfaceC6686a, interfaceC6686a2, activity, str2, department, objectRef, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? null : salesIQChat, (i10 & 512) != 0 ? true : z11);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w(this.f11728o, this.f11729p, this.f11730q, this.f11731r, this.f11732s, this.f11733t, this.f11734u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((w) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11727n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            rd.b.b();
            if (this.f11728o != null) {
                String str = this.f11729p;
                Channel.Department department = this.f11730q;
                String id2 = department != null ? department.getId() : null;
                final String str2 = this.f11731r;
                final String str3 = this.f11729p;
                final InterfaceC6686a interfaceC6686a = this.f11732s;
                final InterfaceC6686a interfaceC6686a2 = this.f11733t;
                final Activity activity = this.f11728o;
                final String str4 = this.f11734u;
                final Channel.Department department2 = this.f11730q;
                a.C(str, null, false, false, id2, new InterfaceC6686a() { // from class: Te.b
                    @Override // ve.InterfaceC6686a
                    public final void a(e eVar) {
                        a.w.k(str2, str3, interfaceC6686a, interfaceC6686a2, activity, str4, department2, eVar);
                    }
                }, 8, null);
            } else {
                j(this.f11732s, this.f11733t, this.f11729p, we.d.f67649d);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class x extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final x f11735d = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            return new ArrayList();
        }
    }

    public static final class y extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final y f11736d = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public static final class z extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final z f11737d = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public static final void B(String str, String str2, boolean z10, boolean z11, String str3, InterfaceC6686a interfaceC6686a) {
        AbstractC1459k.d(f11572a.H(), null, null, new C1689c(Uf.j.n(), z11, str, str2, z10, str3, interfaceC6686a, null), 3, null);
    }

    public static final void B0(String acknowledgementKey, Pe.b conversationAttributes) {
        Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
        Intrinsics.checkNotNullParameter(conversationAttributes, "conversationAttributes");
        f11572a.i0().a(acknowledgementKey, conversationAttributes);
    }

    public static /* synthetic */ void C(String str, String str2, boolean z10, boolean z11, String str3, InterfaceC6686a interfaceC6686a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC6686a = null;
        }
        B(str, str2, z10, z11, str3, interfaceC6686a);
    }

    public static final void C0(String acknowledgementKey, C4507a conversationAttributes, Pe.a conversationType) {
        Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
        Intrinsics.checkNotNullParameter(conversationAttributes, "conversationAttributes");
        Intrinsics.checkNotNullParameter(conversationType, "conversationType");
        a aVar = f11572a;
        Ge.g i02 = aVar.i0();
        List<Channel.Department> list = null;
        if (conversationType == Pe.a.Audio) {
            Channel m10 = C6822a.m();
            if (m10 != null) {
                list = m10.getCallDepartments();
            }
        } else {
            Channel m11 = C6822a.m();
            if (m11 != null) {
                list = m11.getChatDepartments();
            }
        }
        i02.a(acknowledgementKey, aVar.Q0(conversationAttributes, list));
    }

    public static final void D(List availableIds) {
        Intrinsics.checkNotNullParameter(availableIds, "availableIds");
        AbstractC1459k.d(f11572a.H(), null, null, new C1692f(availableIds, null), 3, null);
    }

    public static final void D0(boolean z10) {
        f11590s = z10;
    }

    public static final void E(String str) {
        AbstractC1459k.d(f11572a.H(), null, null, new h(str, null), 3, null);
    }

    public static final void E0(String str) {
        f11592u = str;
    }

    public static final void F0(String str) {
        f11591t = str;
    }

    public static final void G(String chatId, InterfaceC6686a callback) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1459k.d(f11572a.H(), null, null, new k(chatId, callback, null), 3, null);
    }

    public static final void G0(Long l10) {
        f11572a.i0().c(l10);
    }

    public static final void H0(String question, String str, C4507a c4507a, InterfaceC6686a interfaceC6686a) {
        Intrinsics.checkNotNullParameter(question, "question");
        K0(question, str, c4507a, interfaceC6686a, null, 16, null);
    }

    public static final Pe.b I(String str) {
        Pe.b bVar;
        return (str == null || (bVar = (Pe.b) f11572a.S().b(str).b()) == null) ? (Pe.b) f11572a.S().a().b() : bVar;
    }

    public static final void I0(String question, String str, C4507a c4507a, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2) {
        String uuid;
        List e10;
        List c10;
        Intrinsics.checkNotNullParameter(question, "question");
        if (str == null || (uuid = og.m.d(str)) == null) {
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        }
        String str2 = uuid;
        Activity n10 = Uf.j.n();
        Channel.Department department = null;
        C4507a c4507a2 = (c4507a == null || (c10 = c4507a.c()) == null || c10.size() != 1) ? null : c4507a;
        if (c4507a2 != null) {
            a aVar = f11572a;
            Channel m10 = C6822a.m();
            Pe.b Q02 = aVar.Q0(c4507a2, m10 != null ? m10.getChatDepartments() : null);
            if (Q02 != null && (e10 = Q02.e()) != null) {
                department = (Channel.Department) CollectionsKt.firstOrNull(e10);
            }
        }
        a aVar2 = f11572a;
        if (aVar2.p(str, interfaceC6686a2, interfaceC6686a)) {
            return;
        }
        if (str == null) {
            f11596y = str2;
        }
        aVar2.j0().add(str2);
        if (c4507a != null) {
            C0(str2, c4507a, Pe.a.Chat);
        }
        AbstractC1459k.d(aVar2.H(), null, null, new w(n10, str2, department, str, interfaceC6686a, interfaceC6686a2, question, null), 3, null);
    }

    public static final void J0(String question, String str, String str2, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2) {
        Intrinsics.checkNotNullParameter(question, "question");
        I0(question, str, (str2 == null || str2.length() == 0) ? null : new C4507a.C0720a().d(CollectionsKt.listOf(new od.w(str2, Se.a.CHAT))).a(), interfaceC6686a, interfaceC6686a2);
    }

    public static /* synthetic */ void K0(String str, String str2, C4507a c4507a, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC6686a = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC6686a2 = null;
        }
        I0(str, str2, c4507a, interfaceC6686a, interfaceC6686a2);
    }

    public static final void L0(String str, String str2) {
        P0(str, str2, null, null, null, 28, null);
    }

    public static final void M0(String str, String str2, C4507a c4507a, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2) {
        String uuid;
        List e10;
        List c10;
        boolean f10 = og.i.f(str);
        if (str == null || (uuid = og.m.d(str)) == null) {
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        }
        String str3 = uuid;
        Activity n10 = Uf.j.n();
        Channel.Department department = null;
        C4507a c4507a2 = (c4507a == null || (c10 = c4507a.c()) == null || c10.size() != 1) ? null : c4507a;
        if (c4507a2 != null) {
            a aVar = f11572a;
            Channel m10 = C6822a.m();
            Pe.b Q02 = aVar.Q0(c4507a2, m10 != null ? m10.getChatDepartments() : null);
            if (Q02 != null && (e10 = Q02.e()) != null) {
                department = (Channel.Department) CollectionsKt.firstOrNull(e10);
            }
        }
        Channel.Department department2 = department;
        a aVar2 = f11572a;
        if (aVar2.p(str, interfaceC6686a2, interfaceC6686a)) {
            return;
        }
        if (str == null) {
            f11596y = str3;
        }
        aVar2.j0().add(str3);
        if (c4507a != null) {
            C0(str3, c4507a, Pe.a.Chat);
        }
        AbstractC1459k.d(aVar2.H(), null, null, new A(n10, str3, str2, department2, interfaceC6686a, interfaceC6686a2, f10, null), 3, null);
    }

    public static final void N0(String str, String str2, String str3) {
        P0(str, str2, str3, null, null, 24, null);
    }

    public static final void O0(String str, String str2, String str3, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2) {
        M0(str, str2, (str3 == null || str3.length() == 0) ? null : new C4507a.C0720a().d(CollectionsKt.listOf(new od.w(str3, Se.a.CHAT))).a(), interfaceC6686a, interfaceC6686a2);
    }

    public static /* synthetic */ void P0(String str, String str2, String str3, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            a aVar = f11572a;
            if (ZohoSalesIQ.Chat.getDepts().size() != 1) {
                aVar = null;
            }
            if (aVar != null) {
                ArrayList<String> depts = ZohoSalesIQ.Chat.getDepts();
                Intrinsics.checkNotNullExpressionValue(depts, "getDepts(...)");
                str3 = (String) CollectionsKt.firstOrNull((List) depts);
            } else {
                str3 = null;
            }
        }
        if ((i10 & 8) != 0) {
            interfaceC6686a = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC6686a2 = null;
        }
        O0(str, str2, str3, interfaceC6686a, interfaceC6686a2);
    }

    public static final String S0(String str) {
        List split$default;
        String str2;
        if (str == null || (split$default = StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null)) == null || (str2 = (String) CollectionsKt.lastOrNull(split$default)) == null) {
            return null;
        }
        return StringsKt.removePrefix(str2, (CharSequence) com.google.crypto.tink.integration.android.b.f37029b);
    }

    public static final void T0(Function1 attributes) {
        C4507a.C0720a c0720a;
        C4507a R02;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        a aVar = f11572a;
        Pe.b bVar = (Pe.b) aVar.S().a().b();
        if (bVar == null || (R02 = aVar.R0(bVar)) == null || (c0720a = R02.f()) == null) {
            c0720a = new C4507a.C0720a();
        }
        C4507a a10 = ((C4507a.C0720a) attributes.invoke(c0720a)).a();
        Channel m10 = C6822a.m();
        Pe.b Q02 = aVar.Q0(a10, m10 != null ? m10.getChatAndCallDepartments() : null);
        aVar.i0().d(Q02);
        if (a10.d() != null) {
            AbstractC1459k.d(aVar.H(), null, null, new C(a10, Q02, null), 3, null);
        }
    }

    public static final void U0(De.a key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        f11572a.n0().a(key, z10);
    }

    public static final void V0(String chatId, long j10) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        f11572a.o0().a(chatId, j10);
    }

    public static final boolean W() {
        return f11590s;
    }

    public static final List Y(List chats) {
        Object b10;
        Intrinsics.checkNotNullParameter(chats, "chats");
        b10 = AbstractC1457j.b(null, new o(chats, null), 1, null);
        return (List) b10;
    }

    public static final long Z(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return og.i.r((Number) f11572a.U().a(chatId).b());
    }

    public static final String d0() {
        return f11592u;
    }

    public static final String e0() {
        return f11591t;
    }

    public static final Pe.b g0() {
        return (Pe.b) f11572a.S().a().b();
    }

    public static final Pe.b h0(String str) {
        if (str != null) {
            return (Pe.b) f11572a.S().b(str).b();
        }
        return null;
    }

    public static final Long p0() {
        return (Long) f11572a.S().c().b();
    }

    public static final void q(InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2) {
        if (interfaceC6686a != null) {
            interfaceC6686a.a(e.f67680b.a(we.d.f67622D));
        }
        if (interfaceC6686a2 != null) {
            interfaceC6686a2.a(e.f67680b.a(we.d.f67622D));
        }
    }

    public static final boolean t(Md.a aVar) {
        Channel m10 = C6822a.m();
        if (m10 != null ? Intrinsics.areEqual(m10.getHideWhenOffline(), Boolean.TRUE) : false) {
            int i10 = aVar == null ? -1 : C0227a.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i10 == 1 ? com.zoho.livechat.android.modules.brand.ui.helpers.a.w(null, null, false) == EnumC4544a.Offline : !(i10 == 2 ? com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a.v(null) != EnumC4544a.CallOffline : LiveChatUtil.getEmbedStatus())) {
                return true;
            }
        }
        return false;
    }

    public static final void v0(String chatId, String conversationId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        AbstractC1459k.d(f11572a.H(), null, null, new r(chatId, conversationId, null), 3, null);
    }

    public static final boolean z() {
        return og.i.j((Boolean) f11572a.V().b(De.a.ChatComponentQueuePosition, true).b());
    }

    public final boolean A() {
        return og.i.j((Boolean) V().b(De.a.ChatComponentReopenChat, true).b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r0, "$", false, 2, (java.lang.Object) null) == true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SalesIQConversation.b.a A0(Message message) {
        boolean z10;
        SalesIQConversation.b.a.C0620a c0620a;
        Spannable a10 = Vf.b.i().a(message.getDisplayName());
        String obj = a10 != null ? a10.toString() : null;
        String unescapeHtml = LiveChatUtil.unescapeHtml(message.getContent());
        String obj2 = message.getMessageType().toString();
        String sender = message.getSender();
        Long valueOf = Long.valueOf(message.getServerTime());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        Long valueOf2 = Long.valueOf(valueOf != null ? valueOf.longValue() : message.getClientTime());
        boolean areEqual = Intrinsics.areEqual(message.isRead(), Boolean.TRUE);
        String sender2 = message.getSender();
        if (sender2 != null) {
            z10 = true;
        }
        z10 = false;
        Message.Attachment attachment = message.getAttachment();
        if (!og.i.f(attachment != null ? attachment.getFileName() : null)) {
            if (!og.i.f(attachment != null ? attachment.getType() : null) && !og.i.f(message.getComment())) {
                c0620a = null;
                return new SalesIQConversation.b.a(obj, unescapeHtml, obj2, sender, valueOf2, areEqual, z10, c0620a, SalesIQConversation.b.a.EnumC0621b.valueOf(message.getStatus().name()));
            }
        }
        c0620a = new SalesIQConversation.b.a.C0620a(attachment != null ? attachment.getFileName() : null, attachment != null ? attachment.getType() : null, message.getComment(), attachment != null ? Long.valueOf(attachment.getSize()) : null);
        return new SalesIQConversation.b.a(obj, unescapeHtml, obj2, sender, valueOf2, areEqual, z10, c0620a, SalesIQConversation.b.a.EnumC0621b.valueOf(message.getStatus().name()));
    }

    public final void F(String acknowledgementId) {
        Intrinsics.checkNotNullParameter(acknowledgementId, "acknowledgementId");
        if (j0().contains(acknowledgementId)) {
            j0().remove(acknowledgementId);
        }
        if (Intrinsics.areEqual(f11596y, acknowledgementId)) {
            f11596y = null;
        }
    }

    public final P H() {
        return C6461a.f65810a.e();
    }

    public final Kd.a J() {
        return (Kd.a) f11583l.getValue();
    }

    public final SalesIQConversation.a.EnumC0619a K(int i10) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SalesIQConversation.a.EnumC0619a enumC0619a = SalesIQConversation.a.EnumC0619a.WAITING;
            m147constructorimpl = Result.m147constructorimpl(new SalesIQConversation.a.EnumC0619a[]{null, enumC0619a, SalesIQConversation.a.EnumC0619a.CONNECTED, SalesIQConversation.a.EnumC0619a.MISSED, SalesIQConversation.a.EnumC0619a.CLOSED, enumC0619a}[i10]);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        return (SalesIQConversation.a.EnumC0619a) m147constructorimpl;
    }

    public final SalesIQConversation.b.EnumC0622b L(int i10) {
        SalesIQConversation.b.EnumC0622b enumC0622b = SalesIQConversation.b.EnumC0622b.WAITING;
        return new SalesIQConversation.b.EnumC0622b[]{null, enumC0622b, SalesIQConversation.b.EnumC0622b.CONNECTED, SalesIQConversation.b.EnumC0622b.MISSED, SalesIQConversation.b.EnumC0622b.CLOSED, enumC0622b, SalesIQConversation.b.EnumC0622b.TRIGGERED, SalesIQConversation.b.EnumC0622b.PROACTIVE}[i10];
    }

    public final Re.b M() {
        return (Re.b) f11578g.getValue();
    }

    public final Re.c N() {
        return (Re.c) f11585n.getValue();
    }

    public final Be.a O() {
        return (Be.a) f11582k.getValue();
    }

    public final Ke.a P() {
        return (Ke.a) f11573b.getValue();
    }

    public final we.d Q() {
        we.d z10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.z();
        if (z10 != null) {
            return z10;
        }
        if (!LiveChatUtil.isChatEnabled()) {
            return we.d.f67661l;
        }
        if (LiveChatUtil.enableChatInOfflineMode()) {
            return null;
        }
        return we.d.f67663n;
    }

    public final Pe.b Q0(C4507a c4507a, List list) {
        ArrayList arrayList;
        Channel.Department department;
        Object obj;
        List<od.w> c10 = c4507a.c();
        if (c10 != null) {
            if (c10.isEmpty()) {
                c10 = null;
            }
            if (c10 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (od.w wVar : c10) {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            Channel.Department department2 = (Channel.Department) obj;
                            if (Intrinsics.areEqual(wVar.f61173a, department2.getId()) || Intrinsics.areEqual(wVar.f61174b, department2.getName())) {
                                break;
                            }
                        }
                        department = (Channel.Department) obj;
                    } else {
                        department = null;
                    }
                    if (department != null) {
                        arrayList2.add(department);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                    return new Pe.b(c4507a.e(), c4507a.a(), c4507a.d(), arrayList, null, c4507a.b(), 16, null);
                }
            }
        }
        arrayList = null;
        return new Pe.b(c4507a.e(), c4507a.a(), c4507a.d(), arrayList, null, c4507a.b(), 16, null);
    }

    public final Re.e R() {
        return (Re.e) f11587p.getValue();
    }

    public final C4507a R0(Pe.b bVar) {
        C4507a.C0720a c0720a = new C4507a.C0720a();
        String i10 = bVar.i();
        if (i10 != null) {
            c0720a.f(i10);
        }
        String c10 = bVar.c();
        if (c10 != null) {
            c0720a.b(c10);
        }
        List e10 = bVar.e();
        if (e10 != null) {
            List list = e10;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Xe.a.e((Channel.Department) it.next(), null, 1, null));
            }
            c0720a.d(arrayList);
        }
        Object f10 = bVar.f();
        if (f10 != null) {
            c0720a.e(f10);
        }
        Map d10 = bVar.d();
        if (d10 != null) {
            c0720a.c(d10);
        }
        return c0720a.a();
    }

    public final Ge.b S() {
        return (Ge.b) f11589r.getValue();
    }

    public final yf.h T() {
        return (yf.h) f11579h.getValue();
    }

    public final g U() {
        return (g) f11580i.getValue();
    }

    public final Ge.c V() {
        return Ye.d.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.text.SpannableString] */
    public final Object W0(Context context, Continuation continuation) {
        Channel.NotifyTerms notifyTerms;
        if (!LiveChatUtil.requireChatGDPRConsent()) {
            return Boxing.boxBoolean(true);
        }
        Channel m10 = C6822a.m();
        if (context == null) {
            context = MobilistenInitProvider.INSTANCE.e();
        }
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SpannableString(dVar.getString(od.t.f60965X));
        String string = dVar.getString(od.t.f61033h0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String url = (m10 == null || (notifyTerms = m10.getNotifyTerms()) == null) ? null : notifyTerms.getUrl();
        if (!TextUtils.isEmpty(url)) {
            ?? spannableString = new SpannableString(objectRef.element + ' ' + string);
            spannableString.setSpan(new G(url), ((SpannableString) objectRef.element).length() + 1, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(com.zoho.livechat.android.utils.P.a(dVar)), ((SpannableString) objectRef.element).length() + 1, spannableString.length(), 18);
            objectRef.element = spannableString;
        }
        return C6461a.f65810a.c(new F(dVar, objectRef, null), continuation);
    }

    public final Re.h X() {
        return (Re.h) f11576e.getValue();
    }

    public final SalesIQConversation.Media.a a0(SalesIQChat.Media.Status status) {
        switch (status == null ? -1 : C0227a.$EnumSwitchMapping$1[status.ordinal()]) {
            case 1:
                return SalesIQConversation.Media.a.ENDED;
            case 2:
                return SalesIQConversation.Media.a.MISSED;
            case 3:
                return SalesIQConversation.Media.a.CANCELLED;
            case 4:
                return SalesIQConversation.Media.a.CONNECTED;
            case 5:
                return SalesIQConversation.Media.a.INVITED;
            case 6:
                return SalesIQConversation.Media.a.INITIATED;
            case 7:
                return SalesIQConversation.Media.a.ACCEPTED;
            default:
                return null;
        }
    }

    public final SalesIQConversation.Media.b b0(SalesIQChat.Media.UserType userType) {
        int i10 = userType == null ? -1 : C0227a.$EnumSwitchMapping$2[userType.ordinal()];
        if (i10 == 1) {
            return SalesIQConversation.Media.b.OPERATOR;
        }
        if (i10 != 2) {
            return null;
        }
        return SalesIQConversation.Media.b.VISITOR;
    }

    public final C6550a c0() {
        return (C6550a) f11574c.getValue();
    }

    public final String f0(int i10) {
        if (i10 == 1) {
            return "sad";
        }
        if (i10 == 2) {
            return "neutral";
        }
        if (i10 != 3) {
            return null;
        }
        return "happy";
    }

    public final Ge.g i0() {
        return (Ge.g) f11588q.getValue();
    }

    public final List j0() {
        return (List) f11595x.getValue();
    }

    public final ConcurrentHashMap k0() {
        return (ConcurrentHashMap) f11593v.getValue();
    }

    public final ConcurrentHashMap l0() {
        return (ConcurrentHashMap) f11594w.getValue();
    }

    public final Od.h m0() {
        return (Od.h) f11584m.getValue();
    }

    public final Re.n n0() {
        return (Re.n) f11586o.getValue();
    }

    public final Re.p o0() {
        return (Re.p) f11581j.getValue();
    }

    public final boolean p(String str, InterfaceC6686a interfaceC6686a, InterfaceC6686a interfaceC6686a2) {
        if (f11596y == null) {
            if (str == null || !j0().contains(str)) {
                return false;
            }
            LiveChatUtil.log("StartChatTest, A chat is already being initiated. Please wait for the current chat to be initiated.");
            q(interfaceC6686a2, interfaceC6686a);
            return true;
        }
        if (str == null) {
            q(interfaceC6686a2, interfaceC6686a);
            return true;
        }
        if (!j0().contains(str)) {
            return false;
        }
        LiveChatUtil.log("StartChatTest, A chat is already being initiated. Please wait for the current chat to be initiated.");
        q(interfaceC6686a2, interfaceC6686a);
        return true;
    }

    public final Object q0(String str, e eVar, Continuation continuation) {
        SalesIQChat salesIQChat;
        F(str);
        if (!eVar.d() || eVar.b() == null) {
            salesIQChat = null;
        } else {
            Object b10 = eVar.b();
            Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type com.zoho.livechat.android.models.SalesIQChat");
            salesIQChat = (SalesIQChat) b10;
        }
        Object g10 = AbstractC1455i.g(C1452g0.c(), new q(str, salesIQChat, eVar, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    public final boolean r() {
        return og.i.j((Boolean) R().a(De.a.ChatComponentFileSharingWhenBotConnected, false).b());
    }

    public final boolean r0() {
        return t0() || u0() || s0() || LiveChatUtil.showFileShare();
    }

    public final boolean s() {
        return og.i.j((Boolean) R().a(De.a.ChatComponentVoiceNoteWhenBotConnected, false).b());
    }

    public final boolean s0() {
        return og.i.i((Boolean) R().a(De.a.ChatComponentGallery, true).b());
    }

    public final boolean t0() {
        return og.i.j((Boolean) R().a(De.a.ChatComponentTakePhoto, true).b());
    }

    public final boolean u() {
        return og.i.j((Boolean) R().a(De.a.ChatComponentCall, true).b());
    }

    public final boolean u0() {
        return og.i.i((Boolean) R().a(De.a.ChatComponentRecordVideo, false).b());
    }

    public final boolean v() {
        return og.i.j((Boolean) V().b(De.a.ChatComponentEndChat, true).b());
    }

    public final boolean w() {
        return og.i.j((Boolean) V().b(De.a.ChatComponentEndChatWhenInQueue, true).b());
    }

    public final SalesIQConversation.Media w0(SalesIQChat.Media media) {
        return new SalesIQConversation.Media(media.f42491id, media.endTime, b0(media.initiatedBy), media.pickupTime, media.connectedTime, a0(media.status), b0(media.endedBy), media.type, media.createdTime);
    }

    public final boolean x() {
        return og.i.j((Boolean) V().b(De.a.ChatComponentEndChatWithAgent, true).b());
    }

    public final SalesIQConversation x0(SalesIQChat salesIQChat) {
        Intrinsics.checkNotNullParameter(salesIQChat, "<this>");
        return salesIQChat.getType() == SalesIQChat.c.Call ? y0(salesIQChat) : z0(salesIQChat);
    }

    public final boolean y() {
        return og.i.j((Boolean) V().b(De.a.ChatComponentEndChatWithBot, true).b());
    }

    public final SalesIQConversation.a y0(SalesIQChat salesIQChat) {
        String visitid = salesIQChat.getVisitid();
        if (visitid == null) {
            visitid = salesIQChat.getConvID();
        }
        String str = visitid;
        String convID = salesIQChat.getConvID();
        String question = salesIQChat.getQuestion();
        String attenderid = salesIQChat.getAttenderid();
        String attenderName = salesIQChat.getAttenderName();
        String unescapeHtml = attenderName != null ? LiveChatUtil.unescapeHtml(attenderName) : null;
        String attenderEmail = salesIQChat.getAttenderEmail();
        String departmentName = salesIQChat.getDepartmentName();
        String unescapeHtml2 = departmentName != null ? LiveChatUtil.unescapeHtml(departmentName) : null;
        SalesIQConversation.a.EnumC0619a K10 = K(salesIQChat.getStatus());
        String feedback = salesIQChat.getFeedback();
        String f02 = f0(salesIQChat.getRating());
        int queuePosition = salesIQChat.getQueuePosition() > 0 ? salesIQChat.getQueuePosition() : -1;
        SalesIQChat.Media media = salesIQChat.getMedia();
        return new SalesIQConversation.a(str, convID, question, attenderid, unescapeHtml, attenderEmail, unescapeHtml2, K10, feedback, f02, queuePosition, media != null ? f11572a.w0(media) : null);
    }

    public final SalesIQConversation.b z0(SalesIQChat salesIQChat) {
        Spannable c10;
        String visitid = salesIQChat.getVisitid();
        if (visitid == null) {
            visitid = salesIQChat.getConvID();
        }
        String str = visitid;
        String convID = salesIQChat.getConvID();
        String question = salesIQChat.getQuestion();
        String attenderid = salesIQChat.getAttenderid();
        String attenderName = salesIQChat.getAttenderName();
        String obj = (attenderName == null || (c10 = Vf.b.i().c(LiveChatUtil.unescapeHtml(attenderName))) == null) ? null : c10.toString();
        String attenderEmail = salesIQChat.getAttenderEmail();
        String departmentName = salesIQChat.getDepartmentName();
        String obj2 = departmentName != null ? Vf.b.i().c(LiveChatUtil.unescapeHtml(departmentName)).toString() : null;
        boolean isBotAttender = salesIQChat.isBotAttender();
        SalesIQConversation.b.EnumC0622b L10 = L(salesIQChat.getStatus());
        String feedback = salesIQChat.getFeedback();
        String f02 = f0(salesIQChat.getRating());
        int unreadCount = salesIQChat.getUnreadCount();
        int queuePosition = salesIQChat.getQueuePosition() > 0 ? salesIQChat.getQueuePosition() : -1;
        Message lastMessage = salesIQChat.getLastMessage();
        SalesIQConversation.b.a A02 = lastMessage != null ? f11572a.A0(lastMessage) : null;
        SalesIQChat.Media media = salesIQChat.getMedia();
        return new SalesIQConversation.b(str, convID, question, attenderid, obj, attenderEmail, obj2, isBotAttender, L10, feedback, f02, unreadCount, queuePosition, A02, media != null ? f11572a.w0(media) : null);
    }
}
