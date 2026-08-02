package He;

import Ph.AbstractC1459k;
import Ph.P;
import android.app.Application;
import com.google.gson.Gson;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Hashtable;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import me.C5582a;
import og.i;
import qf.C6152a;
import td.C6461a;
import vf.AbstractC6687a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static a f4886f;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f4888a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f4889b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f4890c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f4891d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0104a f4885e = new C0104a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f4887g = new Object();

    /* renamed from: He.a$a, reason: collision with other inner class name */
    public static final class C0104a {
        public /* synthetic */ C0104a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar;
            synchronized (a.f4887g) {
                aVar = a.f4886f;
                if (aVar == null) {
                    aVar = new a(null);
                    a.f4886f = aVar;
                }
            }
            return aVar;
        }

        public C0104a() {
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(a.this.j());
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f4893d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConversationsLocalDataSource invoke() {
            return ConversationsLocalDataSource.INSTANCE.getInstance$mobilisten_release();
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f4894d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Gson invoke() {
            return Yd.a.j();
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f4895d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6152a invoke() {
            return C6152a.f63488c.a();
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f4896n;

        /* renamed from: o, reason: collision with root package name */
        public Object f4897o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4898p;

        /* renamed from: q, reason: collision with root package name */
        public int f4899q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Hashtable f4900r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f4901s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Hashtable hashtable, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f4900r = hashtable;
            this.f4901s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f4900r, this.f4901s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00de A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:20:0x0034, B:21:0x00aa, B:24:0x00c2, B:26:0x00c8, B:31:0x00de), top: B:19:0x0034 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10, types: [Wh.a] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            Wh.a aVar;
            Hashtable hashtable;
            Wh.a aVar2;
            a aVar3;
            a aVar4;
            Wh.a aVar5;
            MessageEntity messageEntity;
            MessageEntity messageEntity2;
            Wh.a aVar6;
            MessageEntity.Time time;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f4899q;
            try {
                if (r12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Wh.a d10 = C6461a.C0913a.f65814a.d();
                    hashtable = this.f4900r;
                    a aVar7 = this.f4901s;
                    this.f4896n = d10;
                    this.f4897o = hashtable;
                    this.f4898p = aVar7;
                    this.f4899q = 1;
                    if (d10.f(null, this) != coroutine_suspended) {
                        aVar2 = d10;
                        aVar3 = aVar7;
                    }
                    return coroutine_suspended;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar6 = (Wh.a) this.f4896n;
                        ResultKt.throwOnFailure(obj);
                        aVar5 = aVar6;
                        r12 = aVar5;
                        Unit unit = Unit.INSTANCE;
                        r12.g(null);
                        return Unit.INSTANCE;
                    }
                    messageEntity = (MessageEntity) this.f4898p;
                    aVar4 = (a) this.f4897o;
                    aVar5 = (Wh.a) this.f4896n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        MessageEntity messageEntity3 = (MessageEntity) ((C5582a) obj).b();
                        if (messageEntity.getTime().getPreviousMessageTime() != -1 && (messageEntity3 == null || (time = messageEntity3.getTime()) == null || time.getServerTime() != messageEntity.getTime().getPreviousMessageTime())) {
                            messageEntity2 = null;
                            if (messageEntity2 != null) {
                                C6152a o10 = aVar4.o();
                                this.f4896n = aVar5;
                                this.f4897o = null;
                                this.f4898p = null;
                                this.f4899q = 3;
                                if (o10.T(messageEntity, true, this) != coroutine_suspended) {
                                    aVar6 = aVar5;
                                    aVar5 = aVar6;
                                }
                                return coroutine_suspended;
                            }
                            r12 = aVar5;
                            Unit unit2 = Unit.INSTANCE;
                            r12.g(null);
                            return Unit.INSTANCE;
                        }
                        messageEntity2 = messageEntity;
                        if (messageEntity2 != null) {
                        }
                        r12 = aVar5;
                        Unit unit22 = Unit.INSTANCE;
                        r12.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar = aVar5;
                        aVar.g(null);
                        throw th2;
                    }
                }
                a aVar8 = (a) this.f4898p;
                hashtable = (Hashtable) this.f4897o;
                Wh.a aVar9 = (Wh.a) this.f4896n;
                ResultKt.throwOnFailure(obj);
                aVar3 = aVar8;
                aVar2 = aVar9;
                Object obj2 = hashtable.get("chid");
                r12 = aVar2;
                if (obj2 != null) {
                    String obj3 = obj2.toString();
                    r12 = aVar2;
                    if (obj3 != null) {
                        MessageEntity h10 = vf.c.h(hashtable, null, obj3, null, null, 12, null);
                        C6152a o11 = aVar3.o();
                        String conversationId = h10.getConversationId();
                        String chatId = h10.getChatId();
                        this.f4896n = aVar2;
                        this.f4897o = aVar3;
                        this.f4898p = h10;
                        this.f4899q = 2;
                        Object x10 = o11.x(conversationId, chatId, false, this);
                        if (x10 != coroutine_suspended) {
                            aVar4 = aVar3;
                            obj = x10;
                            aVar5 = aVar2;
                            messageEntity = h10;
                            MessageEntity messageEntity32 = (MessageEntity) ((C5582a) obj).b();
                            if (messageEntity.getTime().getPreviousMessageTime() != -1) {
                                messageEntity2 = null;
                                if (messageEntity2 != null) {
                                }
                                r12 = aVar5;
                            }
                            messageEntity2 = messageEntity;
                            if (messageEntity2 != null) {
                            }
                            r12 = aVar5;
                        }
                        return coroutine_suspended;
                    }
                }
                Unit unit222 = Unit.INSTANCE;
                r12.g(null);
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th2 = th4;
                aVar = r12;
            }
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f4902n;

        /* renamed from: o, reason: collision with root package name */
        public Object f4903o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4904p;

        /* renamed from: q, reason: collision with root package name */
        public long f4905q;

        /* renamed from: r, reason: collision with root package name */
        public int f4906r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f4907s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Hashtable f4908t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f4909u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Hashtable hashtable, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f4908t = hashtable;
            this.f4909u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = new g(this.f4908t, this.f4909u, continuation);
            gVar.f4907s = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x0087, code lost:
        
            if (r10 == r0) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13, types: [Wh.a] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v2, types: [Wh.a] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            P p10;
            Hashtable hashtable;
            a aVar;
            String str;
            long j10;
            Object obj3;
            boolean z10;
            Object updateConversation;
            a aVar2;
            Wh.a aVar3;
            String str2;
            C6152a o10;
            String replace$default;
            Boolean boxBoolean;
            Long boxLong;
            Wh.a aVar4;
            g gVar = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = gVar.f4906r;
            try {
                try {
                    if (r12 == 0) {
                        ResultKt.throwOnFailure(obj);
                        p10 = (P) gVar.f4907s;
                        Wh.a d10 = C6461a.C0913a.f65814a.d();
                        hashtable = gVar.f4908t;
                        aVar = gVar.f4909u;
                        gVar.f4907s = p10;
                        gVar.f4902n = d10;
                        gVar.f4903o = hashtable;
                        gVar.f4904p = aVar;
                        gVar.f4906r = 1;
                        Object f10 = d10.f(null, gVar);
                        r12 = d10;
                    } else if (r12 == 1) {
                        a aVar5 = (a) gVar.f4904p;
                        hashtable = (Hashtable) gVar.f4903o;
                        Wh.a aVar6 = (Wh.a) gVar.f4902n;
                        p10 = (P) gVar.f4907s;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar5;
                        r12 = aVar6;
                    } else {
                        if (r12 != 2) {
                            if (r12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Wh.a aVar7 = (Wh.a) gVar.f4907s;
                            ResultKt.throwOnFailure(obj);
                            aVar4 = aVar7;
                            obj2 = null;
                            r12 = aVar4;
                            try {
                                Unit unit = Unit.INSTANCE;
                                r12.g(obj2);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                r12.g(obj2);
                                throw th;
                            }
                        }
                        long j11 = gVar.f4905q;
                        String str3 = (String) gVar.f4904p;
                        str = (String) gVar.f4903o;
                        aVar2 = (a) gVar.f4902n;
                        Wh.a aVar8 = (Wh.a) gVar.f4907s;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str2 = str3;
                            obj3 = null;
                            z10 = true;
                            j10 = j11;
                            aVar3 = aVar8;
                            try {
                                o10 = aVar2.o();
                                Intrinsics.checkNotNull(str2);
                                replace$default = StringsKt.replace$default(str2, "%", "_", false, 4, (Object) null);
                                boxBoolean = Boxing.boxBoolean(z10);
                                boxLong = Boxing.boxLong(j10);
                                gVar.f4907s = aVar3;
                                gVar.f4902n = obj3;
                                gVar.f4903o = obj3;
                                gVar.f4904p = obj3;
                                gVar.f4906r = 3;
                                obj2 = obj3;
                                try {
                                    if (o10.V(str, replace$default, boxBoolean, boxLong, gVar) != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    r12 = aVar3;
                                    Unit unit2 = Unit.INSTANCE;
                                    r12.g(obj2);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r12 = aVar3;
                                    r12.g(obj2);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj2 = null;
                            r12 = aVar8;
                            r12.g(obj2);
                            throw th;
                        }
                    }
                    String chatid = LiveChatUtil.getChatid(String.valueOf(hashtable.get("chid")));
                    Object obj4 = hashtable.get("msguid");
                    String obj5 = obj4 != null ? obj4.toString() : null;
                    if (!i.e(chatid) || !i.e(obj5)) {
                        p10 = null;
                    }
                    if (p10 == null) {
                        aVar4 = r12;
                        obj2 = null;
                        r12 = aVar4;
                        Unit unit22 = Unit.INSTANCE;
                        r12.g(obj2);
                        return Unit.INSTANCE;
                    }
                    long q10 = i.q(String.valueOf(hashtable.get("time")), -1L);
                    ConversationsLocalDataSource l10 = aVar.l();
                    Intrinsics.checkNotNull(chatid);
                    Long boxLong2 = Boxing.boxLong(q10);
                    gVar.f4907s = r12;
                    gVar.f4902n = aVar;
                    gVar.f4903o = chatid;
                    gVar.f4904p = obj5;
                    gVar.f4905q = q10;
                    gVar.f4906r = 2;
                    a aVar9 = aVar;
                    str = chatid;
                    String str4 = obj5;
                    j10 = q10;
                    Wh.a aVar10 = r12;
                    obj3 = null;
                    z10 = true;
                    try {
                        updateConversation = l10.updateConversation(str, (r39 & 2) != 0 ? null : boxLong2, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : null, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                        gVar = this;
                        if (updateConversation != coroutine_suspended) {
                            aVar2 = aVar9;
                            aVar3 = aVar10;
                            str2 = str4;
                            o10 = aVar2.o();
                            Intrinsics.checkNotNull(str2);
                            replace$default = StringsKt.replace$default(str2, "%", "_", false, 4, (Object) null);
                            boxBoolean = Boxing.boxBoolean(z10);
                            boxLong = Boxing.boxLong(j10);
                            gVar.f4907s = aVar3;
                            gVar.f4902n = obj3;
                            gVar.f4903o = obj3;
                            gVar.f4904p = obj3;
                            gVar.f4906r = 3;
                            obj2 = obj3;
                            if (o10.V(str, replace$default, boxBoolean, boxLong, gVar) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        th = th6;
                        obj2 = null;
                        r12 = aVar10;
                        r12.g(obj2);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj2 = null;
                    r12.g(obj2);
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f4910n;

        /* renamed from: o, reason: collision with root package name */
        public Object f4911o;

        /* renamed from: p, reason: collision with root package name */
        public Object f4912p;

        /* renamed from: q, reason: collision with root package name */
        public Object f4913q;

        /* renamed from: r, reason: collision with root package name */
        public Object f4914r;

        /* renamed from: s, reason: collision with root package name */
        public Object f4915s;

        /* renamed from: t, reason: collision with root package name */
        public int f4916t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4917u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Hashtable f4918v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ a f4919w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Hashtable hashtable, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f4918v = hashtable;
            this.f4919w = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            h hVar = new h(this.f4918v, this.f4919w, continuation);
            hVar.f4917u = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0243, code lost:
        
            if (qf.C6152a.U(r0, r1, false, r3, 2, null) == r9) goto L90;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0102 A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x0045, B:23:0x00f7, B:25:0x0102, B:26:0x011c, B:28:0x0120, B:30:0x0124, B:32:0x012b, B:33:0x0131, B:38:0x013c, B:39:0x0149, B:41:0x014f, B:42:0x0155, B:44:0x0159, B:46:0x015f, B:47:0x0165, B:49:0x0169, B:51:0x016f, B:52:0x0175, B:54:0x0179, B:56:0x017f, B:57:0x0185, B:65:0x018d, B:66:0x019a, B:68:0x0211), top: B:20:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x012b A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x0045, B:23:0x00f7, B:25:0x0102, B:26:0x011c, B:28:0x0120, B:30:0x0124, B:32:0x012b, B:33:0x0131, B:38:0x013c, B:39:0x0149, B:41:0x014f, B:42:0x0155, B:44:0x0159, B:46:0x015f, B:47:0x0165, B:49:0x0169, B:51:0x016f, B:52:0x0175, B:54:0x0179, B:56:0x017f, B:57:0x0185, B:65:0x018d, B:66:0x019a, B:68:0x0211), top: B:20:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x013c A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x0045, B:23:0x00f7, B:25:0x0102, B:26:0x011c, B:28:0x0120, B:30:0x0124, B:32:0x012b, B:33:0x0131, B:38:0x013c, B:39:0x0149, B:41:0x014f, B:42:0x0155, B:44:0x0159, B:46:0x015f, B:47:0x0165, B:49:0x0169, B:51:0x016f, B:52:0x0175, B:54:0x0179, B:56:0x017f, B:57:0x0185, B:65:0x018d, B:66:0x019a, B:68:0x0211), top: B:20:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014f A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x0045, B:23:0x00f7, B:25:0x0102, B:26:0x011c, B:28:0x0120, B:30:0x0124, B:32:0x012b, B:33:0x0131, B:38:0x013c, B:39:0x0149, B:41:0x014f, B:42:0x0155, B:44:0x0159, B:46:0x015f, B:47:0x0165, B:49:0x0169, B:51:0x016f, B:52:0x0175, B:54:0x0179, B:56:0x017f, B:57:0x0185, B:65:0x018d, B:66:0x019a, B:68:0x0211), top: B:20:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0159 A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x0045, B:23:0x00f7, B:25:0x0102, B:26:0x011c, B:28:0x0120, B:30:0x0124, B:32:0x012b, B:33:0x0131, B:38:0x013c, B:39:0x0149, B:41:0x014f, B:42:0x0155, B:44:0x0159, B:46:0x015f, B:47:0x0165, B:49:0x0169, B:51:0x016f, B:52:0x0175, B:54:0x0179, B:56:0x017f, B:57:0x0185, B:65:0x018d, B:66:0x019a, B:68:0x0211), top: B:20:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x018d A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x0045, B:23:0x00f7, B:25:0x0102, B:26:0x011c, B:28:0x0120, B:30:0x0124, B:32:0x012b, B:33:0x0131, B:38:0x013c, B:39:0x0149, B:41:0x014f, B:42:0x0155, B:44:0x0159, B:46:0x015f, B:47:0x0165, B:49:0x0169, B:51:0x016f, B:52:0x0175, B:54:0x0179, B:56:0x017f, B:57:0x0185, B:65:0x018d, B:66:0x019a, B:68:0x0211), top: B:20:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0211 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x0045, B:23:0x00f7, B:25:0x0102, B:26:0x011c, B:28:0x0120, B:30:0x0124, B:32:0x012b, B:33:0x0131, B:38:0x013c, B:39:0x0149, B:41:0x014f, B:42:0x0155, B:44:0x0159, B:46:0x015f, B:47:0x0165, B:49:0x0169, B:51:0x016f, B:52:0x0175, B:54:0x0179, B:56:0x017f, B:57:0x0185, B:65:0x018d, B:66:0x019a, B:68:0x0211), top: B:20:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
        /* JADX WARN: Type inference failed for: r0v26, types: [T, com.zoho.livechat.android.modules.messages.domain.entities.Message] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P p10;
            Wh.a aVar;
            Hashtable hashtable;
            a aVar2;
            Wh.a aVar3;
            String replace$default;
            Object y10;
            Wh.a aVar4;
            Hashtable hashtable2;
            P p11;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            String obj2;
            T t10;
            Message message;
            h hVar = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = hVar.f4916t;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    p10 = (P) hVar.f4917u;
                    Wh.a d10 = C6461a.C0913a.f65814a.d();
                    Hashtable hashtable3 = hVar.f4918v;
                    a aVar5 = hVar.f4919w;
                    hVar.f4917u = p10;
                    hVar.f4910n = d10;
                    hVar.f4911o = hashtable3;
                    hVar.f4912p = aVar5;
                    hVar.f4916t = 1;
                    if (d10.f(null, hVar) != coroutine_suspended) {
                        aVar = d10;
                        hashtable = hashtable3;
                        aVar2 = aVar5;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar3 = (Wh.a) hVar.f4917u;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            aVar3.g(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar3.g(null);
                            throw th;
                        }
                    }
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) hVar.f4915s;
                    String str = (String) hVar.f4914r;
                    objectRef2 = (Ref.ObjectRef) hVar.f4913q;
                    a aVar6 = (a) hVar.f4912p;
                    hashtable2 = (Hashtable) hVar.f4911o;
                    aVar4 = (Wh.a) hVar.f4910n;
                    p11 = (P) hVar.f4917u;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar2 = aVar6;
                        replace$default = str;
                        objectRef = objectRef3;
                        y10 = obj;
                        MessageEntity messageEntity = (MessageEntity) ((C5582a) y10).b();
                        objectRef.element = messageEntity == null ? MessageRoomToDomainKt.g(messageEntity, aVar2.j(), aVar2.m(), false, false, null, null, 60, null) : 0;
                        if (replace$default != null && (t10 = objectRef2.element) != 0) {
                            Message message2 = (Message) t10;
                            Message message3 = (Message) t10;
                            String valueOf = ((message3 == null ? message3.getMessageType() : null) != Message.g.Text ? p11 : null) == null ? String.valueOf(hashtable2.get("rmsg")) : null;
                            message = (Message) objectRef2.element;
                            if ((message == null ? message.getMessageType() : null) != Message.g.Image) {
                                Message message4 = (Message) objectRef2.element;
                                if ((message4 != null ? message4.getMessageType() : null) != Message.g.Video) {
                                    Message message5 = (Message) objectRef2.element;
                                    if ((message5 != null ? message5.getMessageType() : null) != Message.g.File) {
                                        Message message6 = (Message) objectRef2.element;
                                        if ((message6 != null ? message6.getMessageType() : null) != Message.g.Audio) {
                                            p11 = null;
                                        }
                                    }
                                }
                            }
                            objectRef2.element = Message.copy$default(message2, null, null, null, null, null, null, null, null, valueOf, p11 == null ? String.valueOf(hashtable2.get("rmsg")) : null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, Boxing.boxBoolean(true), null, null, null, null, i.q(String.valueOf(hashtable2.get("t")), -1L), 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -276824833, 1023, null);
                            if (aVar2.k().V() != null) {
                                C6152a o10 = aVar2.o();
                                Message message7 = (Message) objectRef2.element;
                                Gson m10 = aVar2.m();
                                String V10 = aVar2.k().V();
                                Intrinsics.checkNotNull(V10);
                                MessageEntity a10 = AbstractC6687a.a(message7, m10, V10);
                                hVar.f4917u = aVar4;
                                hVar.f4910n = null;
                                hVar.f4911o = null;
                                hVar.f4912p = null;
                                hVar.f4913q = null;
                                hVar.f4914r = null;
                                hVar.f4915s = null;
                                hVar.f4916t = 3;
                            }
                        }
                        aVar3 = aVar4;
                        Unit unit2 = Unit.INSTANCE;
                        aVar3.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar3 = aVar4;
                        aVar3.g(null);
                        throw th;
                    }
                }
                a aVar7 = (a) hVar.f4912p;
                Hashtable hashtable4 = (Hashtable) hVar.f4911o;
                Wh.a aVar8 = (Wh.a) hVar.f4910n;
                P p12 = (P) hVar.f4917u;
                ResultKt.throwOnFailure(obj);
                aVar2 = aVar7;
                hashtable = hashtable4;
                aVar = aVar8;
                p10 = p12;
                String valueOf2 = String.valueOf(hashtable.get("chid"));
                Object obj3 = hashtable.get("msguid");
                replace$default = (obj3 == null || (obj2 = obj3.toString()) == null) ? null : StringsKt.replace$default(obj2, "%", "_", false, 4, (Object) null);
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                C6152a o11 = aVar2.o();
                hVar.f4917u = p10;
                hVar.f4910n = aVar;
                hVar.f4911o = hashtable;
                hVar.f4912p = aVar2;
                hVar.f4913q = objectRef4;
                hVar.f4914r = replace$default;
                hVar.f4915s = objectRef4;
                hVar.f4916t = 2;
                P p13 = p10;
                y10 = C6152a.y(o11, null, valueOf2, null, replace$default, null, this, 16, null);
                hVar = this;
                if (y10 != coroutine_suspended) {
                    aVar4 = aVar;
                    hashtable2 = hashtable;
                    p11 = p13;
                    objectRef = objectRef4;
                    objectRef2 = objectRef;
                    MessageEntity messageEntity2 = (MessageEntity) ((C5582a) y10).b();
                    objectRef.element = messageEntity2 == null ? MessageRoomToDomainKt.g(messageEntity2, aVar2.j(), aVar2.m(), false, false, null, null, 60, null) : 0;
                    if (replace$default != null) {
                        Message message22 = (Message) t10;
                        Message message32 = (Message) t10;
                        if (((message32 == null ? message32.getMessageType() : null) != Message.g.Text ? p11 : null) == null) {
                        }
                        message = (Message) objectRef2.element;
                        if ((message == null ? message.getMessageType() : null) != Message.g.Image) {
                        }
                        objectRef2.element = Message.copy$default(message22, null, null, null, null, null, null, null, null, valueOf, p11 == null ? String.valueOf(hashtable2.get("rmsg")) : null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, Boxing.boxBoolean(true), null, null, null, null, i.q(String.valueOf(hashtable2.get("t")), -1L), 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -276824833, 1023, null);
                        if (aVar2.k().V() != null) {
                        }
                    }
                    aVar3 = aVar4;
                    Unit unit22 = Unit.INSTANCE;
                    aVar3.g(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
                aVar3 = aVar;
                aVar3.g(null);
                throw th;
            }
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final a n() {
        return f4885e.a();
    }

    public final P i() {
        return C6461a.f65810a.e();
    }

    public final Application j() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final Ae.a k() {
        return (Ae.a) this.f4891d.getValue();
    }

    public final ConversationsLocalDataSource l() {
        return (ConversationsLocalDataSource) this.f4890c.getValue();
    }

    public final Gson m() {
        return (Gson) this.f4888a.getValue();
    }

    public final C6152a o() {
        return (C6152a) this.f4889b.getValue();
    }

    public final void p(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
    }

    public final void q(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(i(), null, null, new f(messageTable, this, null), 3, null);
    }

    public final void r(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(i(), null, null, new g(messageTable, this, null), 3, null);
    }

    public final void s(Hashtable messageTable) {
        Intrinsics.checkNotNullParameter(messageTable, "messageTable");
        AbstractC1459k.d(i(), null, null, new h(messageTable, this, null), 3, null);
    }

    public a() {
        this.f4888a = LazyKt.lazy(d.f4894d);
        this.f4889b = LazyKt.lazy(e.f4895d);
        this.f4890c = LazyKt.lazy(c.f4893d);
        this.f4891d = LazyKt.lazy(new b());
    }
}
