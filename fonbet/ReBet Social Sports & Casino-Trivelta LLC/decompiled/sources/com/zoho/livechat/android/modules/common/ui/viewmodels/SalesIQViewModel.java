package com.zoho.livechat.android.modules.common.ui.viewmodels;

import Ph.AbstractC1440a0;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import android.app.Application;
import androidx.lifecycle.Q;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import i3.C4527h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import lb.C5444x;
import me.C5582a;
import rd.C6218a;
import re.AbstractC6235a;
import re.C6239e;
import re.C6247m;
import td.C6461a;
import te.AbstractC6462a;
import uf.C6550a;
import we.AbstractC6744a;
import xe.C6822a;
import yf.C6888e;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/zoho/livechat/android/modules/common/ui/viewmodels/SalesIQViewModel;", "Landroidx/lifecycle/Q;", "<init>", "()V", "", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", X9.m.f13664a, "n", "()Z", "o", "Lcom/zoho/livechat/android/models/SalesIQChat;", "salesIQChat", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "question", "LBg/a;", "zsiqavStartCallListener", "", "l", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;LBg/a;)V", "q", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;)V", "LPh/P;", "k", "(LPh/P;Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;LBg/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKe/a;", "s", "Lkotlin/Lazy;", "getConversationsRepository", "()LKe/a;", "conversationsRepository", "LKd/a;", "t", "getBrandRepository", "()LKd/a;", "brandRepository", "Luf/a;", "u", "getMessagesRepository", "()Luf/a;", "messagesRepository", "LRe/m;", "v", "j", "()LRe/m;", "startNewConversationUseCase", "LRe/i;", "w", com.google.android.material.shape.i.f35755A, "()LRe/i;", "leaveAsMissedConversationUseCase", "LOd/e;", C5444x.f55808b, "getGetIsFormSyncedUseCase", "()LOd/e;", "getIsFormSyncedUseCase", "Lyf/e;", "y", C4527h.f48087o, "()Lyf/e;", "deleteMessagesUseCase", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "application", "getAppScope", "()LPh/P;", "appScope", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSalesIQViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesIQViewModel.kt\ncom/zoho/livechat/android/modules/common/ui/viewmodels/SalesIQViewModel\n+ 2 SalesIQResult.kt\ncom/zoho/livechat/android/modules/common/result/SalesIQResult\n*L\n1#1,159:1\n46#2,9:160\n*S KotlinDebug\n*F\n+ 1 SalesIQViewModel.kt\ncom/zoho/livechat/android/modules/common/ui/viewmodels/SalesIQViewModel\n*L\n110#1:160,9\n*E\n"})
/* loaded from: classes4.dex */
public final class SalesIQViewModel extends Q {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final Lazy conversationsRepository = LazyKt.lazy(new b());

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Lazy brandRepository = LazyKt.lazy(new a());

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final Lazy messagesRepository = LazyKt.lazy(new l());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final Lazy startNewConversationUseCase = LazyKt.lazy(new m());

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Lazy leaveAsMissedConversationUseCase = LazyKt.lazy(new k());

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final Lazy getIsFormSyncedUseCase = LazyKt.lazy(new d());

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final Lazy deleteMessagesUseCase = LazyKt.lazy(new c());

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            return Kd.a.f6469f.a(SalesIQViewModel.this.getApplication());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ke.a invoke() {
            return Ke.a.f6496j.a(SalesIQViewModel.this.getApplication());
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6888e invoke() {
            return new C6888e(SalesIQViewModel.this.getMessagesRepository());
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.e invoke() {
            return new Od.e(SalesIQViewModel.this.getBrandRepository());
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42671n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f42672o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f42674q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Message f42675r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SalesIQChat salesIQChat, Message message, Bg.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f42674q = salesIQChat;
            this.f42675r = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = SalesIQViewModel.this.new e(this.f42674q, this.f42675r, null, continuation);
            eVar.f42672o = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42671n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P p10 = (P) this.f42672o;
                SalesIQViewModel salesIQViewModel = SalesIQViewModel.this;
                SalesIQChat salesIQChat = this.f42674q;
                Message message = this.f42675r;
                this.f42671n = 1;
                if (salesIQViewModel.k(p10, salesIQChat, message, null, this) == coroutine_suspended) {
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

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f42676n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42677o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42678p;

        /* renamed from: q, reason: collision with root package name */
        public Object f42679q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f42680r;

        /* renamed from: t, reason: collision with root package name */
        public int f42682t;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42680r = obj;
            this.f42682t |= Integer.MIN_VALUE;
            return SalesIQViewModel.this.k(null, null, null, null, this);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42683n;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42683n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Td.e.O0(null, null, Boxing.boxBoolean(false), null, 11, null);
                this.f42683n = 1;
                if (AbstractC1440a0.a(6000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Td.e.O0(null, null, Boxing.boxBoolean(true), null, 11, null);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42684n;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42684n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(LiveChatUtil.getConversations().isEmpty());
        }
    }

    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42685n;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42685n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(LiveChatUtil.checkMultipleChatRestriction());
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42686n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42687o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42688p;

        /* renamed from: q, reason: collision with root package name */
        public int f42689q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f42691s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Message f42692t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SalesIQChat salesIQChat, Message message, Continuation continuation) {
            super(2, continuation);
            this.f42691s = salesIQChat;
            this.f42692t = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SalesIQViewModel.this.new j(this.f42691s, this.f42692t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0104, code lost:
        
            if (r1.O(r3, r15) == r8) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        
            if (r0 == r8) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x011b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a10;
            C5582a c5582a;
            AbstractC6235a abstractC6235a;
            C5582a.b bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42689q;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Re.i i11 = SalesIQViewModel.this.i();
                String chid = this.f42691s.getChid();
                Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                String convID = this.f42691s.getConvID();
                Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                String deptid = this.f42691s.getDeptid();
                Intrinsics.checkNotNull(deptid);
                Message message = this.f42692t;
                String content = message != null ? message.getContent() : null;
                if (content == null) {
                    content = "";
                }
                String n10 = C6218a.n();
                Pe.a aVar = Pe.a.Audio;
                this.f42689q = 1;
                a10 = i11.a(chid, convID, deptid, content, n10, aVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC6235a = (AbstractC6235a) this.f42687o;
                        ResultKt.throwOnFailure(obj);
                        if (abstractC6235a.b() > 0) {
                            MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                        }
                        return Unit.INSTANCE;
                    }
                    abstractC6235a = (AbstractC6235a) this.f42688p;
                    bVar = (C5582a.b) this.f42687o;
                    c5582a = (C5582a) this.f42686n;
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(abstractC6235a, C6247m.f64127d)) {
                        Ud.b.f12184a.c(new AbstractC6744a.C0960a(bVar.c()));
                    } else {
                        com.zoho.livechat.android.modules.brand.ui.helpers.a aVar2 = com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a;
                        Md.a[] aVarArr = {Md.a.Call};
                        this.f42686n = c5582a;
                        this.f42687o = abstractC6235a;
                        this.f42688p = null;
                        this.f42689q = 3;
                    }
                    if (abstractC6235a.b() > 0) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                a10 = obj;
            }
            c5582a = (C5582a) a10;
            if (c5582a.d()) {
                MobilistenUtil.A(AbstractC6462a.a(C6822a.m()), 0, 2, null);
            }
            AbstractC6235a.c cVar = AbstractC6235a.c.Conversations;
            SalesIQViewModel salesIQViewModel = SalesIQViewModel.this;
            SalesIQChat salesIQChat = this.f42691s;
            if (!c5582a.d()) {
                C5582a.b c10 = c5582a.c();
                if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                C5582a.b c11 = c5582a.c();
                Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                C6888e h10 = salesIQViewModel.h();
                String chid2 = salesIQChat.getChid();
                Intrinsics.checkNotNullExpressionValue(chid2, "getChid(...)");
                Message.g gVar = Message.g.Question;
                this.f42686n = c5582a;
                this.f42687o = c11;
                this.f42688p = abstractC6235a;
                this.f42689q = 2;
                if (h10.c(chid2, gVar, this) != coroutine_suspended) {
                    bVar = c11;
                    if (Intrinsics.areEqual(abstractC6235a, C6247m.f64127d)) {
                    }
                    if (abstractC6235a.b() > 0) {
                    }
                }
                return coroutine_suspended;
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
        public final Re.i invoke() {
            return new Re.i(SalesIQViewModel.this.getConversationsRepository());
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            return C6550a.f66357j.a(SalesIQViewModel.this.getApplication());
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.m invoke() {
            return new Re.m(SalesIQViewModel.this.getConversationsRepository());
        }
    }

    public final P getAppScope() {
        return C6461a.f65810a.e();
    }

    public final Application getApplication() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final Kd.a getBrandRepository() {
        return (Kd.a) this.brandRepository.getValue();
    }

    public final Ke.a getConversationsRepository() {
        return (Ke.a) this.conversationsRepository.getValue();
    }

    public final C6550a getMessagesRepository() {
        return (C6550a) this.messagesRepository.getValue();
    }

    public final C6888e h() {
        return (C6888e) this.deleteMessagesUseCase.getValue();
    }

    public final Re.i i() {
        return (Re.i) this.leaveAsMissedConversationUseCase.getValue();
    }

    public final Re.m j() {
        return (Re.m) this.startNewConversationUseCase.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x012b, code lost:
    
        if (r3.O(r5, r4) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(P p10, SalesIQChat salesIQChat, Message message, Bg.a aVar, Continuation continuation) {
        f fVar;
        int i10;
        Object obj;
        int i11;
        f fVar2;
        SalesIQViewModel salesIQViewModel;
        Object obj2;
        P p11;
        C5582a c5582a;
        AbstractC6235a abstractC6235a;
        C5582a.b c10;
        P p12;
        C5582a c5582a2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f42682t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f42682t = i12 - Integer.MIN_VALUE;
                Object obj3 = fVar.f42680r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f42682t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    obj = coroutine_suspended;
                    Re.m j10 = j();
                    String convID = salesIQChat.getConvID();
                    Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                    String deptid = salesIQChat.getDeptid();
                    Intrinsics.checkNotNull(deptid);
                    Pe.a aVar2 = Pe.a.Audio;
                    String n10 = C6218a.n();
                    fVar.f42676n = this;
                    fVar.f42677o = p10;
                    fVar.f42682t = 1;
                    f fVar3 = fVar;
                    i11 = 2;
                    Object b10 = Re.m.b(j10, convID, null, deptid, aVar2, false, false, null, null, n10, message, aVar, null, fVar3, 2048, null);
                    fVar2 = fVar3;
                    if (b10 != obj) {
                        salesIQViewModel = this;
                        obj2 = b10;
                        p11 = p10;
                    }
                    return obj;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    }
                    AbstractC6235a abstractC6235a2 = (AbstractC6235a) fVar.f42679q;
                    C5582a.b bVar = (C5582a.b) fVar.f42678p;
                    c5582a2 = (C5582a) fVar.f42677o;
                    P p13 = (P) fVar.f42676n;
                    ResultKt.throwOnFailure(obj3);
                    obj = coroutine_suspended;
                    p12 = p13;
                    c10 = bVar;
                    abstractC6235a = abstractC6235a2;
                    fVar2 = fVar;
                    if (Intrinsics.areEqual(abstractC6235a, C6239e.f64119d)) {
                        Ud.b.f12184a.c(new AbstractC6744a.C0960a(c10.c()));
                    } else {
                        AbstractC1459k.d(p12, null, null, new g(null), 3, null);
                        com.zoho.livechat.android.modules.brand.ui.helpers.a aVar3 = com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a;
                        Md.a[] aVarArr = {Md.a.Call};
                        fVar2.f42676n = c5582a2;
                        fVar2.f42677o = null;
                        fVar2.f42678p = null;
                        fVar2.f42679q = null;
                        fVar2.f42682t = 3;
                    }
                    return Unit.INSTANCE;
                }
                P p14 = (P) fVar.f42677o;
                salesIQViewModel = (SalesIQViewModel) fVar.f42676n;
                ResultKt.throwOnFailure(obj3);
                obj2 = obj3;
                obj = coroutine_suspended;
                p11 = p14;
                fVar2 = fVar;
                i11 = 2;
                c5582a = (C5582a) obj2;
                AbstractC6235a.c cVar = AbstractC6235a.c.Conversations;
                if (!c5582a.d()) {
                    C5582a.b c11 = c5582a.c();
                    if (c11 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c11, cVar)) == null) {
                        abstractC6235a = AbstractC6235a.b.f64114d;
                    }
                    c10 = c5582a.c();
                    Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                    Td.e eVar = Td.e.f11456a;
                    String string = salesIQViewModel.getApplication().getString(abstractC6235a.b());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    fVar2.f42676n = p11;
                    fVar2.f42677o = c5582a;
                    fVar2.f42678p = c10;
                    fVar2.f42679q = abstractC6235a;
                    fVar2.f42682t = i11;
                    if (eVar.S0(string, fVar2) != obj) {
                        p12 = p11;
                        c5582a2 = c5582a;
                        if (Intrinsics.areEqual(abstractC6235a, C6239e.f64119d)) {
                        }
                    }
                    return obj;
                }
                return Unit.INSTANCE;
            }
        }
        fVar = new f(continuation);
        Object obj32 = fVar.f42680r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f42682t;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        AbstractC6235a.c cVar2 = AbstractC6235a.c.Conversations;
        if (!c5582a.d()) {
        }
        return Unit.INSTANCE;
    }

    public final void l(SalesIQChat salesIQChat, Message question, Bg.a zsiqavStartCallListener) {
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        String deptid = salesIQChat.getDeptid();
        if (deptid == null || deptid.length() == 0) {
            return;
        }
        AbstractC1459k.d(getAppScope(), null, null, new e(salesIQChat, question, zsiqavStartCallListener, null), 3, null);
    }

    public final Object m(Continuation continuation) {
        return AbstractC1455i.g(C1452g0.b(), new h(null), continuation);
    }

    public final boolean n() {
        return LiveChatUtil.isConversationEnabled();
    }

    public final boolean o() {
        return LiveChatUtil.isArticlesEnabled();
    }

    public final Object p(Continuation continuation) {
        return AbstractC1455i.g(C1452g0.b(), new i(null), continuation);
    }

    public final void q(SalesIQChat salesIQChat, Message question) {
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        String deptid = salesIQChat.getDeptid();
        if (deptid == null || deptid.length() == 0) {
            return;
        }
        AbstractC1459k.d(getAppScope(), null, null, new j(salesIQChat, question, null), 3, null);
    }
}
