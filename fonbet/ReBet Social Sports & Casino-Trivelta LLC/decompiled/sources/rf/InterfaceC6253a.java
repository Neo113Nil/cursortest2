package rf;

import E2.j;
import android.app.Application;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* renamed from: rf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6253a {

    /* renamed from: rf.a$a, reason: collision with other inner class name */
    public static final class C0893a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f64156n;

        /* renamed from: o, reason: collision with root package name */
        public Object f64157o;

        /* renamed from: p, reason: collision with root package name */
        public Object f64158p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f64159q;

        /* renamed from: s, reason: collision with root package name */
        public int f64161s;

        public C0893a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64159q = obj;
            this.f64161s |= Integer.MIN_VALUE;
            return InterfaceC6253a.e0(InterfaceC6253a.this, null, null, this);
        }
    }

    /* renamed from: rf.a$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f64162n;

        /* renamed from: o, reason: collision with root package name */
        public Object f64163o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f64164p;

        /* renamed from: r, reason: collision with root package name */
        public int f64166r;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64164p = obj;
            this.f64166r |= Integer.MIN_VALUE;
            return InterfaceC6253a.C(InterfaceC6253a.this, null, null, this);
        }
    }

    /* renamed from: rf.a$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64167n;

        /* renamed from: p, reason: collision with root package name */
        public int f64169p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64167n = obj;
            this.f64169p |= Integer.MIN_VALUE;
            return InterfaceC6253a.D(InterfaceC6253a.this, null, null, this);
        }
    }

    /* renamed from: rf.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f64170n;

        /* renamed from: o, reason: collision with root package name */
        public Object f64171o;

        /* renamed from: p, reason: collision with root package name */
        public Object f64172p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f64173q;

        /* renamed from: s, reason: collision with root package name */
        public int f64175s;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64173q = obj;
            this.f64175s |= Integer.MIN_VALUE;
            return InterfaceC6253a.g(InterfaceC6253a.this, null, this);
        }
    }

    /* renamed from: rf.a$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f64176n;

        /* renamed from: o, reason: collision with root package name */
        public Object f64177o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f64178p;

        /* renamed from: r, reason: collision with root package name */
        public int f64180r;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64178p = obj;
            this.f64180r |= Integer.MIN_VALUE;
            return InterfaceC6253a.f(InterfaceC6253a.this, null, null, null, null, this);
        }
    }

    /* renamed from: rf.a$f */
    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f64181n;

        /* renamed from: o, reason: collision with root package name */
        public Object f64182o;

        /* renamed from: p, reason: collision with root package name */
        public Object f64183p;

        /* renamed from: q, reason: collision with root package name */
        public Object f64184q;

        /* renamed from: r, reason: collision with root package name */
        public Object f64185r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f64186s;

        /* renamed from: u, reason: collision with root package name */
        public int f64188u;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64186s = obj;
            this.f64188u |= Integer.MIN_VALUE;
            return InterfaceC6253a.q(InterfaceC6253a.this, null, null, null, this);
        }
    }

    /* renamed from: rf.a$g */
    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f64189n;

        /* renamed from: o, reason: collision with root package name */
        public Object f64190o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f64191p;

        /* renamed from: r, reason: collision with root package name */
        public int f64193r;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64191p = obj;
            this.f64193r |= Integer.MIN_VALUE;
            return InterfaceC6253a.V(InterfaceC6253a.this, null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0056, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object C(InterfaceC6253a interfaceC6253a, String str, String str2, Continuation continuation) {
        b bVar;
        int i10;
        List list;
        InterfaceC6253a interfaceC6253a2;
        Iterator it;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f64166r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f64166r = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f64164p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f64166r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f a10 = interfaceC6253a.a(str, str2);
                    bVar.f64162n = interfaceC6253a;
                    bVar.f64166r = 1;
                    obj = AbstractC5323h.t(a10, bVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar.f64163o;
                        interfaceC6253a2 = (InterfaceC6253a) bVar.f64162n;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            Message message = (Message) it.next();
                            String chatId = message.getChatId();
                            String id2 = message.getId();
                            bVar.f64162n = interfaceC6253a2;
                            bVar.f64163o = it;
                            bVar.f64166r = 2;
                            if (interfaceC6253a2.k(chatId, id2, bVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    interfaceC6253a = (InterfaceC6253a) bVar.f64162n;
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (list != null) {
                    Application e10 = MobilistenInitProvider.INSTANCE.e();
                    Intrinsics.checkNotNull(e10);
                    List h10 = MessageRoomToDomainKt.h(list, e10, Yd.a.j(), false, null, 12, null);
                    if (h10 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : h10) {
                            Message.Extras extras = ((Message) obj2).getExtras();
                            if (extras != null ? Intrinsics.areEqual(extras.isTriggerChatInvite(), Boxing.boxBoolean(true)) : false) {
                                arrayList.add(obj2);
                            }
                        }
                        interfaceC6253a2 = interfaceC6253a;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        bVar = interfaceC6253a.new b(continuation);
        Object obj3 = bVar.f64164p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f64166r;
        if (i10 != 0) {
        }
        list = (List) obj3;
        if (list != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object D(InterfaceC6253a interfaceC6253a, String str, String str2, Continuation continuation) {
        c cVar;
        int i10;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f64169p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f64169p = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f64167n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f64169p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    cVar.f64169p = 1;
                    obj = interfaceC6253a.t(str, str2, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Number) obj).intValue() == 1);
            }
        }
        cVar = interfaceC6253a.new c(continuation);
        Object obj2 = cVar.f64167n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f64169p;
        if (i10 != 0) {
        }
        return Boxing.boxBoolean(((Number) obj2).intValue() == 1);
    }

    static /* synthetic */ Object R(InterfaceC6253a interfaceC6253a, String str, long j10, boolean z10, int i10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateReadStatus");
        }
        if ((i11 & 8) != 0) {
            i10 = Message.f.Sent.ordinal();
        }
        return interfaceC6253a.A(str, j10, z10, i10, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r7.n(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r7.a0(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r7.n(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r7.a0(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object V(InterfaceC6253a interfaceC6253a, Pair pair, Pair pair2, Continuation continuation) {
        g gVar;
        int i10;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f64193r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f64193r = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f64191p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f64193r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        MessageEntity messageEntity = (MessageEntity) pair.getFirst();
                        gVar.f64189n = interfaceC6253a;
                        gVar.f64190o = pair2;
                        gVar.f64193r = 1;
                    } else {
                        MessageEntity messageEntity2 = (MessageEntity) pair.getFirst();
                        gVar.f64189n = interfaceC6253a;
                        gVar.f64190o = pair2;
                        gVar.f64193r = 2;
                    }
                    return Boxing.boxBoolean(true);
                }
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(true);
                }
                pair2 = (Pair) gVar.f64190o;
                interfaceC6253a = (InterfaceC6253a) gVar.f64189n;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) pair2.getSecond()).booleanValue()) {
                    MessageEntity messageEntity3 = (MessageEntity) pair2.getFirst();
                    gVar.f64189n = null;
                    gVar.f64190o = null;
                    gVar.f64193r = 4;
                } else {
                    MessageEntity messageEntity4 = (MessageEntity) pair2.getFirst();
                    gVar.f64189n = null;
                    gVar.f64190o = null;
                    gVar.f64193r = 3;
                }
            }
        }
        gVar = interfaceC6253a.new g(continuation);
        Object obj2 = gVar.f64191p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f64193r;
        if (i10 != 0) {
        }
        if (((Boolean) pair2.getSecond()).booleanValue()) {
        }
    }

    static /* synthetic */ Object X(InterfaceC6253a interfaceC6253a, String str, String str2, String str3, long j10, boolean z10, int i10, Continuation continuation, int i11, Object obj) {
        if (obj == null) {
            return interfaceC6253a.y(str, str2, str3, j10, z10, (i11 & 32) != 0 ? Message.f.Sent.ordinal() : i10, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateReadStatus");
    }

    static /* synthetic */ Object d0(InterfaceC6253a interfaceC6253a, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessage");
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        return interfaceC6253a.M(str, str2, str3, str4, str5, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object e0(InterfaceC6253a interfaceC6253a, String str, List list, Continuation continuation) {
        C0893a c0893a;
        int i10;
        InterfaceC6253a interfaceC6253a2;
        Iterator it;
        String str2;
        if (continuation instanceof C0893a) {
            c0893a = (C0893a) continuation;
            int i11 = c0893a.f64161s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0893a.f64161s = i11 - Integer.MIN_VALUE;
                Object obj = c0893a.f64159q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0893a.f64161s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC6253a2 = interfaceC6253a;
                    it = list.iterator();
                    str2 = str;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0893a.f64158p;
                    String str3 = (String) c0893a.f64157o;
                    InterfaceC6253a interfaceC6253a3 = (InterfaceC6253a) c0893a.f64156n;
                    ResultKt.throwOnFailure(obj);
                    str2 = str3;
                    interfaceC6253a2 = interfaceC6253a3;
                }
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    c0893a.f64156n = interfaceC6253a2;
                    c0893a.f64157o = str2;
                    c0893a.f64158p = it;
                    c0893a.f64161s = 1;
                    if (interfaceC6253a2.k(str2, str4, c0893a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c0893a = interfaceC6253a.new C0893a(continuation);
        Object obj2 = c0893a.f64159q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0893a.f64161s;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r5.b0(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r5.Q(r6, r7, r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object f(InterfaceC6253a interfaceC6253a, String str, List list, List list2, Function2 function2, Continuation continuation) {
        e eVar;
        int i10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f64180r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f64180r = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f64178p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar.f64180r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    eVar.f64176n = interfaceC6253a;
                    eVar.f64177o = list2;
                    eVar.f64180r = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    list2 = (List) eVar.f64177o;
                    interfaceC6253a = (InterfaceC6253a) eVar.f64176n;
                    ResultKt.throwOnFailure(obj);
                }
                eVar.f64176n = null;
                eVar.f64177o = null;
                eVar.f64180r = 2;
            }
        }
        eVar = interfaceC6253a.new e(continuation);
        Object obj2 = eVar.f64178p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f64180r;
        if (i10 != 0) {
        }
        eVar.f64176n = null;
        eVar.f64177o = null;
        eVar.f64180r = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r0 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0078, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x027e -> B:12:0x027f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object g(InterfaceC6253a interfaceC6253a, List list, Continuation continuation) {
        d dVar;
        InterfaceC6253a interfaceC6253a2;
        int i10;
        Iterator it;
        InterfaceC6253a interfaceC6253a3;
        Ref.ObjectRef objectRef;
        Iterator it2;
        InterfaceC6253a interfaceC6253a4;
        MessageEntity.Time time;
        InterfaceC6253a interfaceC6253a5;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f64175s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f64175s = i11 - Integer.MIN_VALUE;
                interfaceC6253a2 = interfaceC6253a;
                Object obj = dVar.f64173q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f64175s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = list.iterator();
                    if (!it.hasNext()) {
                    }
                } else if (i10 == 1) {
                    objectRef = (Ref.ObjectRef) dVar.f64172p;
                    it = (Iterator) dVar.f64171o;
                    interfaceC6253a3 = (InterfaceC6253a) dVar.f64170n;
                    ResultKt.throwOnFailure(obj);
                    if (((Number) obj).longValue() == -1) {
                    }
                    interfaceC6253a2 = interfaceC6253a3;
                    if (!it.hasNext()) {
                    }
                } else if (i10 == 2) {
                    objectRef = (Ref.ObjectRef) dVar.f64172p;
                    it = (Iterator) dVar.f64171o;
                    interfaceC6253a3 = (InterfaceC6253a) dVar.f64170n;
                    ResultKt.throwOnFailure(obj);
                    Iterator it3 = it;
                    Ref.ObjectRef objectRef2 = objectRef;
                    it2 = it3;
                    MessageEntity messageEntity = (MessageEntity) obj;
                    if (messageEntity != null) {
                        MessageEntity.Time time2 = ((MessageEntity) objectRef2.element).getTime();
                        if ((messageEntity.getTime().getClientTime() > 0 ? interfaceC6253a3 : null) != null) {
                            MessageEntity messageEntity2 = (MessageEntity) objectRef2.element;
                            interfaceC6253a4 = null;
                            MessageEntity.Time copy$default = MessageEntity.Time.copy$default(time2, 0L, messageEntity.getTime().getClientTime(), 0L, 0L, 0L, null, 61, null);
                            Unit unit = Unit.INSTANCE;
                            objectRef2.element = MessageEntity.copy$default(messageEntity2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, copy$default, 67108863, null);
                            time = copy$default;
                        } else {
                            interfaceC6253a4 = null;
                            time = time2;
                        }
                        if ((messageEntity.getTime().getPreviousMessageTime() > 0 ? interfaceC6253a3 : interfaceC6253a4) != null) {
                            MessageEntity messageEntity3 = (MessageEntity) objectRef2.element;
                            MessageEntity.Time copy$default2 = MessageEntity.Time.copy$default(time, 0L, 0L, messageEntity.getTime().getPreviousMessageTime(), 0L, 0L, null, 59, null);
                            Unit unit2 = Unit.INSTANCE;
                            objectRef2.element = MessageEntity.copy$default(messageEntity3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, copy$default2, 67108863, null);
                        }
                        if ((Intrinsics.areEqual(messageEntity.getReadStatus(), Boxing.boxBoolean(true)) ? interfaceC6253a3 : interfaceC6253a4) != null) {
                            objectRef2.element = MessageEntity.copy$default((MessageEntity) objectRef2.element, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, Boxing.boxBoolean(true), null, null, null, null, null, false, null, null, 133955583, null);
                        }
                        if (messageEntity.isTyping() != null) {
                            objectRef2.element = MessageEntity.copy$default((MessageEntity) objectRef2.element, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, messageEntity.isTyping(), null, null, null, null, false, null, null, 133693439, null);
                        }
                        MessageEntity messageEntity4 = (MessageEntity) objectRef2.element;
                        dVar.f64170n = interfaceC6253a3;
                        dVar.f64171o = it2;
                        dVar.f64172p = interfaceC6253a4;
                        dVar.f64175s = 3;
                        obj = interfaceC6253a3.a0(messageEntity4, dVar);
                        if (obj != coroutine_suspended) {
                            interfaceC6253a5 = interfaceC6253a3;
                            Boxing.boxLong(((Number) obj).longValue());
                            InterfaceC6253a interfaceC6253a6 = interfaceC6253a5;
                            it = it2;
                            interfaceC6253a2 = interfaceC6253a6;
                            if (!it.hasNext()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    it = it2;
                    interfaceC6253a2 = interfaceC6253a3;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (Iterator) dVar.f64171o;
                    interfaceC6253a5 = (InterfaceC6253a) dVar.f64170n;
                    ResultKt.throwOnFailure(obj);
                    Boxing.boxLong(((Number) obj).longValue());
                    InterfaceC6253a interfaceC6253a62 = interfaceC6253a5;
                    it = it2;
                    interfaceC6253a2 = interfaceC6253a62;
                    if (!it.hasNext()) {
                        ?? r02 = (MessageEntity) it.next();
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        objectRef3.element = r02;
                        dVar.f64170n = interfaceC6253a2;
                        dVar.f64171o = it;
                        dVar.f64172p = objectRef3;
                        dVar.f64175s = 1;
                        obj = interfaceC6253a2.S(r02, dVar);
                        if (obj != coroutine_suspended) {
                            interfaceC6253a3 = interfaceC6253a2;
                            objectRef = objectRef3;
                            if (((Number) obj).longValue() == -1) {
                                String acknowledgementKey = ((MessageEntity) objectRef.element).getAcknowledgementKey();
                                String chatId = ((MessageEntity) objectRef.element).getChatId();
                                String messageId = ((MessageEntity) objectRef.element).getMessageId();
                                dVar.f64170n = interfaceC6253a3;
                                dVar.f64171o = it;
                                dVar.f64172p = objectRef;
                                dVar.f64175s = 2;
                                obj = interfaceC6253a3.K(acknowledgementKey, chatId, messageId, dVar);
                            }
                            interfaceC6253a2 = interfaceC6253a3;
                            if (!it.hasNext()) {
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }
        }
        InterfaceC6253a interfaceC6253a7 = interfaceC6253a;
        dVar = interfaceC6253a7.new d(continuation);
        interfaceC6253a2 = interfaceC6253a7;
        Object obj2 = dVar.f64173q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f64175s;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0136, code lost:
    
        if (r11.a0(r2, r3) == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        if (r2 == r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0136 -> B:27:0x0139). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object q(InterfaceC6253a interfaceC6253a, String str, List list, Function2 function2, Continuation continuation) {
        f fVar;
        int i10;
        List list2;
        Function2 function22;
        List list3;
        InterfaceC6253a interfaceC6253a2;
        String str2;
        List list4;
        Unit unit;
        InterfaceC6253a interfaceC6253a3;
        Iterator it;
        Function2 function23;
        List list5;
        String str3;
        Iterator it2;
        String str4;
        InterfaceC6253a interfaceC6253a4 = interfaceC6253a;
        String str5 = str;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f64188u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f64188u = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f64186s;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f64188u;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f N10 = interfaceC6253a4.N(null, str5, Message.g.LoadMore.getStringValue());
                    fVar.f64181n = interfaceC6253a4;
                    fVar.f64182o = str5;
                    list2 = list;
                    fVar.f64183p = list2;
                    function22 = function2;
                    fVar.f64184q = function22;
                    fVar.f64188u = 1;
                    obj = AbstractC5323h.t(N10, fVar);
                } else if (i10 == 1) {
                    Function2 function24 = (Function2) fVar.f64184q;
                    List list6 = (List) fVar.f64183p;
                    String str6 = (String) fVar.f64182o;
                    InterfaceC6253a interfaceC6253a5 = (InterfaceC6253a) fVar.f64181n;
                    ResultKt.throwOnFailure(obj);
                    list2 = list6;
                    str5 = str6;
                    function22 = function24;
                    interfaceC6253a4 = interfaceC6253a5;
                } else {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            list5 = (List) fVar.f64183p;
                            str3 = (String) fVar.f64182o;
                            interfaceC6253a2 = (InterfaceC6253a) fVar.f64181n;
                            ResultKt.throwOnFailure(obj);
                            str2 = str3;
                            list4 = list5;
                            it2 = list4.iterator();
                            str4 = str2;
                            while (it2.hasNext()) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it2 = (Iterator) fVar.f64183p;
                        str4 = (String) fVar.f64182o;
                        interfaceC6253a2 = (InterfaceC6253a) fVar.f64181n;
                        ResultKt.throwOnFailure(obj);
                        while (it2.hasNext()) {
                            String messageId = ((MessageEntity) it2.next()).getMessageId();
                            fVar.f64181n = interfaceC6253a2;
                            fVar.f64182o = str4;
                            fVar.f64183p = it2;
                            fVar.f64184q = null;
                            fVar.f64185r = null;
                            fVar.f64188u = 4;
                            if (interfaceC6253a2.k(str4, messageId, fVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    it = (Iterator) fVar.f64185r;
                    list4 = (List) fVar.f64184q;
                    function23 = (Function2) fVar.f64183p;
                    str2 = (String) fVar.f64182o;
                    interfaceC6253a3 = (InterfaceC6253a) fVar.f64181n;
                    ResultKt.throwOnFailure(obj);
                    if (it.hasNext()) {
                        unit = Unit.INSTANCE;
                        interfaceC6253a2 = interfaceC6253a3;
                        if (unit == null) {
                            String stringValue = Message.g.LoadMore.getStringValue();
                            fVar.f64181n = interfaceC6253a2;
                            fVar.f64182o = str2;
                            fVar.f64183p = list4;
                            fVar.f64184q = null;
                            fVar.f64185r = null;
                            fVar.f64188u = 3;
                            if (interfaceC6253a2.i(str2, stringValue, fVar) != coroutine_suspended) {
                                list5 = list4;
                                str3 = str2;
                                str2 = str3;
                                list4 = list5;
                            }
                            return coroutine_suspended;
                        }
                        it2 = list4.iterator();
                        str4 = str2;
                        while (it2.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    }
                    long longValue = ((Number) it.next()).longValue();
                    Iterator it3 = list4.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (((MessageEntity) it3.next()).getTime().getServerTime() == longValue) {
                            break;
                        }
                        i12++;
                    }
                    Integer boxInt = Boxing.boxInt(i12);
                    if (boxInt.intValue() == -1) {
                        boxInt = null;
                    }
                    if (boxInt != null) {
                    }
                    MessageEntity messageEntity = (MessageEntity) function23.invoke(str2, Boxing.boxLong(longValue));
                    fVar.f64181n = interfaceC6253a3;
                    fVar.f64182o = str2;
                    fVar.f64183p = function23;
                    fVar.f64184q = list4;
                    fVar.f64185r = it;
                    fVar.f64188u = 2;
                }
                list3 = (List) obj;
                if (list3 == null) {
                    list3 = CollectionsKt.emptyList();
                }
                List mutableList = CollectionsKt.toMutableList((Collection) list3);
                if (list2 != null) {
                    interfaceC6253a2 = interfaceC6253a4;
                    str2 = str5;
                    list4 = mutableList;
                    unit = null;
                    if (unit == null) {
                    }
                    it2 = list4.iterator();
                    str4 = str2;
                    while (it2.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                Function2 function25 = function22;
                interfaceC6253a3 = interfaceC6253a4;
                it = list2.iterator();
                function23 = function25;
                str2 = str5;
                list4 = mutableList;
                if (it.hasNext()) {
                }
            }
        }
        fVar = interfaceC6253a4.new f(continuation);
        Object obj2 = fVar.f64186s;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f64188u;
        if (i10 != 0) {
        }
        list3 = (List) obj2;
        if (list3 == null) {
        }
        List mutableList2 = CollectionsKt.toMutableList((Collection) list3);
        if (list2 != null) {
        }
    }

    Object A(String str, long j10, boolean z10, int i10, Continuation continuation);

    default Object B(String str, String str2, Continuation continuation) {
        return C(this, str, str2, continuation);
    }

    Object E(String str, Continuation continuation);

    Object F(j jVar, Continuation continuation);

    Object G(String str, Continuation continuation);

    Object H(String str, Continuation continuation);

    Object I(String str, String str2, Continuation continuation);

    Object J(j jVar, Continuation continuation);

    Object K(String str, String str2, String str3, Continuation continuation);

    Object L(String str, String str2, String str3, String str4, Continuation continuation);

    Object M(String str, String str2, String str3, String str4, String str5, Continuation continuation);

    InterfaceC5321f N(String str, String str2, String str3);

    Object O(String str, Continuation continuation);

    Object P(String str, String str2, String str3, String str4, String str5, Continuation continuation);

    default Object Q(String str, List list, Function2 function2, Continuation continuation) {
        return q(this, str, list, function2, continuation);
    }

    Object S(MessageEntity messageEntity, Continuation continuation);

    default Object T(String str, String str2, Continuation continuation) {
        return D(this, str, str2, continuation);
    }

    Object U(j jVar, Continuation continuation);

    Object W(List list, Continuation continuation);

    Object Y(String str, String str2, String str3, Continuation continuation);

    Object Z(String str, String str2, String str3, Continuation continuation);

    InterfaceC5321f a(String str, String str2);

    Object a0(MessageEntity messageEntity, Continuation continuation);

    Object b(String str, String str2, Boolean bool, Continuation continuation);

    default Object b0(List list, Continuation continuation) {
        return g(this, list, continuation);
    }

    Object c(Continuation continuation);

    Object c0(String str, String str2, boolean z10, long j10, Continuation continuation);

    Object d(j jVar, Continuation continuation);

    Object e(String str, String str2, Continuation continuation);

    Object f0(String str, Continuation continuation);

    default Object g0(Pair pair, Pair pair2, Continuation continuation) {
        return V(this, pair, pair2, continuation);
    }

    Object h(String str, Continuation continuation);

    Object h0(String str, List list, int i10, Continuation continuation);

    Object i(String str, String str2, Continuation continuation);

    Object j(String str, String str2, String str3, Continuation continuation);

    Object k(String str, String str2, Continuation continuation);

    Object l(String str, String str2, int i10, Continuation continuation);

    Object m(j jVar, Continuation continuation);

    Object n(MessageEntity messageEntity, Continuation continuation);

    Object o(String str, String str2, String str3, Continuation continuation);

    Object p(String str, String str2, Continuation continuation);

    Object r(String str, String str2, int i10, Continuation continuation);

    Object s(String str, String str2, Continuation continuation);

    Object t(String str, String str2, Continuation continuation);

    Object u(String str, String str2, int i10, Continuation continuation);

    Object v(String str, Continuation continuation);

    default Object w(String str, List list, List list2, Function2 function2, Continuation continuation) {
        return f(this, str, list, list2, function2, continuation);
    }

    default Object x(String str, List list, Continuation continuation) {
        return e0(this, str, list, continuation);
    }

    Object y(String str, String str2, String str3, long j10, boolean z10, int i10, Continuation continuation);

    InterfaceC5321f z();
}
