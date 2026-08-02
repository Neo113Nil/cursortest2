package com.zoho.livechat.android.modules.conversations.data.wms.handlers;

import Ph.AbstractC1459k;
import Ph.P;
import a1.C1908a;
import android.app.Application;
import android.content.Intent;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import eg.C4205b;
import fg.e;
import java.util.ArrayList;
import java.util.Hashtable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import td.C6461a;

/* loaded from: classes4.dex */
public final class b extends e {

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43103n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43105p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f43106q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f43107r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f43108s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f43109t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f43110u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43111v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f43112w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Object f43113x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f43114y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43115z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, Object obj2, String str8, Hashtable hashtable, Continuation continuation) {
            super(2, continuation);
            this.f43105p = str;
            this.f43106q = str2;
            this.f43107r = str3;
            this.f43108s = obj;
            this.f43109t = str4;
            this.f43110u = str5;
            this.f43111v = str6;
            this.f43112w = str7;
            this.f43113x = obj2;
            this.f43114y = str8;
            this.f43115z = hashtable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.f43105p, this.f43106q, this.f43107r, this.f43108s, this.f43109t, this.f43110u, this.f43111v, this.f43112w, this.f43113x, this.f43114y, this.f43115z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43103n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Intent intent = new Intent("receivelivechat");
                intent.putExtra("message", "ontyping");
                intent.putExtra("typing", false);
                C1908a.b(b.this.q()).d(intent);
                WmsConversationsEventsHandler a10 = WmsConversationsEventsHandler.f42873j.a();
                String str = this.f43105p;
                String str2 = this.f43106q;
                String str3 = this.f43107r;
                Object obj2 = this.f43108s;
                String str4 = this.f43109t;
                String str5 = this.f43110u;
                String str6 = this.f43111v;
                String str7 = this.f43112w;
                Object obj3 = this.f43113x;
                String str8 = this.f43114y;
                Hashtable hashtable = this.f43115z;
                this.f43103n = 1;
                if (a10.S(str, str2, str3, obj2, str4, str5, str6, str7, obj3, str8, hashtable, this) == coroutine_suspended) {
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

    /* renamed from: com.zoho.livechat.android.modules.conversations.data.wms.handlers.b$b, reason: collision with other inner class name */
    public static final class C0618b extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Hashtable f43116A;

        /* renamed from: n, reason: collision with root package name */
        public int f43117n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f43118o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43119p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f43120q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f43121r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f43122s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f43123t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f43124u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f43125v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Boolean f43126w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f43127x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Object f43128y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f43129z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0618b(String str, String str2, String str3, String str4, Object obj, String str5, String str6, String str7, Boolean bool, String str8, Object obj2, String str9, Hashtable hashtable, Continuation continuation) {
            super(2, continuation);
            this.f43118o = str;
            this.f43119p = str2;
            this.f43120q = str3;
            this.f43121r = str4;
            this.f43122s = obj;
            this.f43123t = str5;
            this.f43124u = str6;
            this.f43125v = str7;
            this.f43126w = bool;
            this.f43127x = str8;
            this.f43128y = obj2;
            this.f43129z = str9;
            this.f43116A = hashtable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0618b(this.f43118o, this.f43119p, this.f43120q, this.f43121r, this.f43122s, this.f43123t, this.f43124u, this.f43125v, this.f43126w, this.f43127x, this.f43128y, this.f43129z, this.f43116A, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0618b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            if (r0.T(r1, r3, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r17) == r15) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
        
            return r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
        
            if (r0.p0(r2, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r17) == r15) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43117n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (LiveChatUtil.isBotSender(this.f43118o)) {
                    WmsConversationsEventsHandler a10 = WmsConversationsEventsHandler.f42873j.a();
                    String str = this.f43119p;
                    String str2 = this.f43118o;
                    String str3 = this.f43120q;
                    String str4 = this.f43121r;
                    Object obj2 = this.f43122s;
                    String str5 = this.f43123t;
                    String str6 = this.f43124u;
                    String str7 = this.f43125v;
                    Boolean bool = this.f43126w;
                    String str8 = this.f43127x;
                    Object obj3 = this.f43128y;
                    String str9 = this.f43129z;
                    Hashtable hashtable = this.f43116A;
                    this.f43117n = 1;
                } else {
                    WmsConversationsEventsHandler a11 = WmsConversationsEventsHandler.f42873j.a();
                    String str10 = this.f43119p;
                    String str11 = this.f43118o;
                    String str12 = this.f43120q;
                    String str13 = this.f43121r;
                    Object obj4 = this.f43122s;
                    String str14 = this.f43123t;
                    String str15 = this.f43124u;
                    String str16 = this.f43125v;
                    Boolean bool2 = this.f43126w;
                    String str17 = this.f43127x;
                    Object obj5 = this.f43128y;
                    String str18 = this.f43129z;
                    Hashtable hashtable2 = this.f43116A;
                    this.f43117n = 2;
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

    @Override // fg.e, fg.InterfaceC4282a
    public void a(String str, String str2) {
        super.a(str, str2);
        LiveChatUtil.log("PEX | onTextEntered: " + str + ", " + str2);
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "ontyping");
        intent.putExtra("typing", false);
        intent.putExtra("chid", str);
        C1908a.b(q()).d(intent);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void b(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, Hashtable hashtable) {
        super.b(str, str2, str3, arrayList, str4, str5, hashtable);
        LiveChatUtil.log("PEX | onMembersDeleted: " + str + ", " + str2 + ", " + str3 + ", " + arrayList + ", " + str4 + ", " + str5 + ", " + hashtable);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void c(String str, String str2, String str3) {
        super.c(str, str2, str3);
        LiveChatUtil.log("PEX | onRemove: " + str + ", " + str2 + ", " + str3);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void d(String str, String str2, String str3, C4205b c4205b) {
        super.d(str, str2, str3, c4205b);
        LiveChatUtil.log("PEX | onMemberOut: " + str + ", " + str2 + ", " + str3 + ", " + c4205b);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void e(String str, String str2, String str3, String str4, Hashtable hashtable) {
        super.e(str, str2, str3, str4, hashtable);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void f(String str, String str2, Hashtable hashtable) {
        super.f(str, str2, hashtable);
        LiveChatUtil.log("PEX | onTyping: " + str + ", " + str2);
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "ontyping");
        intent.putExtra("typing", true);
        intent.putExtra("chid", str);
        C1908a.b(q()).d(intent);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void g(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, Hashtable hashtable) {
        super.g(str, str2, str3, arrayList, str4, str5, str6, hashtable);
        LiveChatUtil.log("PEX | onJoin: " + str + ", " + str2 + ", " + str3 + ", " + arrayList + ", " + str4 + ", " + str5 + ", " + str6 + ", " + hashtable);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void h(String str, String str2, String str3, String str4, String str5, String str6, Object obj, String str7, String str8, Object obj2, String str9, String str10, Object obj3) {
        LiveChatUtil.log("PEX | onInfoMessage: " + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + str6 + ", " + obj + ", " + str7 + ", " + str8 + ", " + obj2 + ", " + str9 + ", " + str10 + ", " + obj3);
        super.h(str, str2, str3, str4, str5, str6, obj, str7, str8, obj2, str9, str10, obj3);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void i(String str, String str2) {
        super.i(str, str2);
        LiveChatUtil.log("PEX | onIdle: " + str + ", " + str2);
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "ontyping");
        intent.putExtra("typing", false);
        C1908a.b(q()).d(intent);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void j(String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, boolean z10, String str8, String str9, Object obj2, String str10, Hashtable hashtable) {
        super.j(str, str2, str3, obj, str4, str5, str6, str7, z10, str8, str9, obj2, str10, hashtable);
        LiveChatUtil.log("PEX | onAttachment: " + str + ", " + str2 + ", " + str3 + ", " + obj + ", " + str4 + ", " + str5 + ", " + str6 + ", " + str7 + ", " + z10 + ", " + str8 + ", " + str9 + ", " + obj2 + ", " + str10 + ", " + hashtable);
        AbstractC1459k.d(p(), null, null, new a(str, str2, str3, obj, str4, str5, str8, str9, obj2, str10, hashtable, null), 3, null);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void k(String str, String str2, String str3) {
        super.k(str, str2, str3);
        LiveChatUtil.log("PEX | onInvite: " + str + ", " + str2 + ", " + str3);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void l(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, Hashtable hashtable) {
        super.l(str, str2, str3, arrayList, str4, str5, hashtable);
        LiveChatUtil.log("PEX | onMembersAdded: " + str + ", " + str2 + ", " + str3 + ", " + arrayList + ", " + str4 + ", " + str5 + ", " + hashtable);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void m(String str, String str2, String str3, String str4, Object obj, String str5, String str6, String str7, Boolean bool, String str8, Object obj2, String str9, Hashtable hashtable) {
        super.m(str, str2, str3, str4, obj, str5, str6, str7, bool, str8, obj2, str9, hashtable);
        LiveChatUtil.log("PEX | ServiceChat onMessage: " + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + obj + ", " + str5 + ", " + str6 + ", " + str7 + ", " + bool + ", " + str8 + ", " + obj2 + ", " + str9 + ", " + hashtable);
        AbstractC1459k.d(p(), null, null, new C0618b(str2, str, str3, str4, obj, str5, str6, str7, bool, str8, obj2, str9, hashtable, null), 3, null);
    }

    @Override // fg.e, fg.InterfaceC4282a
    public void n(String str, String str2, String str3, C4205b c4205b) {
        super.n(str, str2, str3, c4205b);
        LiveChatUtil.log("PEX | onMemberIn: " + str + ", " + str2 + ", " + str3 + ", " + c4205b);
    }

    public final P p() {
        return C6461a.f65810a.e();
    }

    public final Application q() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }
}
