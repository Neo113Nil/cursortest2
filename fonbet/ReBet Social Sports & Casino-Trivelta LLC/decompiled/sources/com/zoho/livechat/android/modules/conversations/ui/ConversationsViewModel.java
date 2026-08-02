package com.zoho.livechat.android.modules.conversations.ui;

import Ph.AbstractC1455i;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import X9.m;
import android.app.Application;
import android.database.Cursor;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Q;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.S;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.x;
import lb.C5444x;
import me.C5582a;
import td.C6461a;
import uf.C6550a;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003J\u001b\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u000fJ\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0017j\b\u0012\u0004\u0012\u00020\f`\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\b\u0012\u0004\u0012\u00020\u001b0\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/ui/ConversationsViewModel;", "Landroidx/lifecycle/Q;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "Lkotlin/Function1;", "Lcom/zoho/livechat/android/modules/conversations/ui/ConversationsViewModel$a;", "", "observer", "o", "(Landroidx/lifecycle/s;Lkotlin/jvm/functions/Function1;)V", "", "searchQuery", "l", "(Ljava/lang/String;)V", C4527h.f48087o, com.google.android.material.shape.i.f35755A, "", "Lcom/zoho/livechat/android/models/SalesIQChat;", m.f13664a, "(Ljava/lang/String;)Ljava/util/List;", "p", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "k", "()Ljava/util/ArrayList;", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "chats", "n", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lkotlinx/coroutines/flow/x;", "s", "Lkotlinx/coroutines/flow/x;", "_uiEvents", "Lkotlinx/coroutines/flow/C;", "t", "Lkotlinx/coroutines/flow/C;", "getUiEvents", "()Lkotlinx/coroutines/flow/C;", "uiEvents", "Luf/a;", "u", "Lkotlin/Lazy;", "getMessagesRepository", "()Luf/a;", "messagesRepository", "Lyf/h;", "v", "getGetLastMessage", "()Lyf/h;", "getLastMessage", "Landroidx/lifecycle/B;", "w", "Landroidx/lifecycle/B;", "chatsMutableLiveData", "Landroidx/lifecycle/LiveData;", C5444x.f55808b, "Landroidx/lifecycle/LiveData;", "j", "()Landroidx/lifecycle/LiveData;", "chatsLiveData", "LPh/C0;", "y", "LPh/C0;", "messagesJob", "z", "Ljava/lang/String;", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsViewModel.kt\ncom/zoho/livechat/android/modules/conversations/ui/ConversationsViewModel\n+ 2 KotlinExtensions.kt\ncom/zoho/salesiqembed/ktx/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n206#2:177\n207#2,2:179\n1#3:178\n1202#4,2:181\n1230#4,4:183\n1557#4:187\n1628#4,3:188\n*S KotlinDebug\n*F\n+ 1 ConversationsViewModel.kt\ncom/zoho/livechat/android/modules/conversations/ui/ConversationsViewModel\n*L\n105#1:177\n105#1:179,2\n105#1:178\n164#1:181,2\n164#1:183,4\n165#1:187\n165#1:188,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ConversationsViewModel extends Q {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final x _uiEvents;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final C uiEvents;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final Lazy messagesRepository;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final Lazy getLastMessage;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final B chatsMutableLiveData;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final LiveData chatsLiveData;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public C0 messagesJob;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public String searchQuery;

    public static abstract class a {

        /* renamed from: com.zoho.livechat.android.modules.conversations.ui.ConversationsViewModel$a$a, reason: collision with other inner class name */
        public static final class C0623a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f43179a;

            /* renamed from: b, reason: collision with root package name */
            public final int f43180b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0623a(String chatId, int i10) {
                super(null);
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.f43179a = chatId;
                this.f43180b = i10;
            }

            public final String a() {
                return this.f43179a;
            }

            public final int b() {
                return this.f43180b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0623a)) {
                    return false;
                }
                C0623a c0623a = (C0623a) obj;
                return Intrinsics.areEqual(this.f43179a, c0623a.f43179a) && this.f43180b == c0623a.f43180b;
            }

            public int hashCode() {
                return (this.f43179a.hashCode() * 31) + Integer.hashCode(this.f43180b);
            }

            public String toString() {
                return "EndChatTimerFound(chatId=" + this.f43179a + ", remainingTimeInSeconds=" + this.f43180b + ')';
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f43181a = new b();

            public b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1926464503;
            }

            public String toString() {
                return "EndChatTimersComplete";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final List f43182a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List chats) {
                super(null);
                Intrinsics.checkNotNullParameter(chats, "chats");
                this.f43182a = chats;
            }

            public final List a() {
                return this.f43182a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f43182a, ((c) obj).f43182a);
            }

            public int hashCode() {
                return this.f43182a.hashCode();
            }

            public String toString() {
                return "SearchResultsReady(chats=" + this.f43182a + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43183n;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConversationsViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f43183n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it = ConversationsViewModel.this.k().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int i10 = LiveChatUtil.getremainingtime(str);
                if (i10 > 0) {
                    x xVar = ConversationsViewModel.this._uiEvents;
                    Intrinsics.checkNotNull(str);
                    xVar.a(new a.C0623a(str, i10));
                }
            }
            ConversationsViewModel.this._uiEvents.a(a.b.f43181a);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43185n;

        /* renamed from: o, reason: collision with root package name */
        public int f43186o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43187p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ConversationsViewModel f43188q;

        public static final class a extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f43189n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ConversationsViewModel f43190o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ ArrayList f43191p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ConversationsViewModel conversationsViewModel, ArrayList arrayList, Continuation continuation) {
                super(1, continuation);
                this.f43190o = conversationsViewModel;
                this.f43191p = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new a(this.f43190o, this.f43191p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f43189n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f43190o.chatsMutableLiveData.setValue(this.f43191p);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ConversationsViewModel conversationsViewModel, Continuation continuation) {
            super(2, continuation);
            this.f43187p = str;
            this.f43188q = conversationsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f43187p, this.f43188q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r7 != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        
            if (r7.c(r4, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
        
            if (r7 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList<SalesIQChat> conversations;
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43186o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                conversations = LiveChatUtil.getConversations(this.f43187p);
                yf.h getLastMessage = this.f43188q.getGetLastMessage();
                this.f43185n = conversations;
                this.f43186o = 1;
                obj = getLastMessage.a(this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                conversations = (ArrayList) this.f43185n;
                ResultKt.throwOnFailure(obj);
            }
            List list2 = (List) ((C5582a) obj).b();
            if (list2 == null || list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                ConversationsViewModel conversationsViewModel = this.f43188q;
                Intrinsics.checkNotNull(conversations);
                list = conversationsViewModel.n(list2, conversations);
            }
            list = conversations;
            if (list == null) {
                CollectionsKt.emptyList();
            }
            C6461a c6461a = C6461a.f65810a;
            a aVar = new a(this.f43188q, conversations, null);
            this.f43185n = null;
            this.f43186o = 2;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.h invoke() {
            return new yf.h(ConversationsViewModel.this.getMessagesRepository());
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f43193n;

        /* renamed from: o, reason: collision with root package name */
        public int f43194o;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43196n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f43197o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ ConversationsViewModel f43198p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ConversationsViewModel conversationsViewModel, Continuation continuation) {
                super(2, continuation);
                this.f43198p = conversationsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f43198p, continuation);
                aVar.f43197o = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, Continuation continuation) {
                return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f43196n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.f43197o;
                B b10 = this.f43198p.chatsMutableLiveData;
                ConversationsViewModel conversationsViewModel = this.f43198p;
                ArrayList<SalesIQChat> conversations = LiveChatUtil.getConversations(conversationsViewModel.searchQuery);
                Intrinsics.checkNotNullExpressionValue(conversations, "getConversations(...)");
                b10.postValue(conversationsViewModel.n(list, conversations));
                return Unit.INSTANCE;
            }
        }

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConversationsViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        
            if (kotlinx.coroutines.flow.AbstractC5323h.h(r3, r4, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43194o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.h getLastMessage = ConversationsViewModel.this.getGetLastMessage();
                this.f43194o = 1;
                obj = getLastMessage.c(this);
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
            C5582a c5582a = (C5582a) obj;
            ConversationsViewModel conversationsViewModel = ConversationsViewModel.this;
            if (c5582a.d()) {
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) c5582a.b();
                a aVar = new a(conversationsViewModel, null);
                this.f43193n = c5582a;
                this.f43194o = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43199n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43201p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation continuation) {
            super(2, continuation);
            this.f43201p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConversationsViewModel.this.new f(this.f43201p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43199n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.h getLastMessage = ConversationsViewModel.this.getGetLastMessage();
                this.f43199n = 1;
                obj = getLastMessage.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list2 = (List) ((C5582a) obj).b();
            if (list2 != null) {
                ConversationsViewModel conversationsViewModel = ConversationsViewModel.this;
                ArrayList<SalesIQChat> conversations = LiveChatUtil.getConversations(this.f43201p);
                Intrinsics.checkNotNullExpressionValue(conversations, "getConversations(...)");
                list = conversationsViewModel.n(list2, conversations);
            } else {
                list = null;
            }
            return list == null ? CollectionsKt.emptyList() : list;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f43202d = new g();

        public g() {
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

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43203n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2193s f43204o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ConversationsViewModel f43205p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function1 f43206q;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43207n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ConversationsViewModel f43208o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Function1 f43209p;

            /* renamed from: com.zoho.livechat.android.modules.conversations.ui.ConversationsViewModel$h$a$a, reason: collision with other inner class name */
            public static final class C0624a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function1 f43210a;

                public C0624a(Function1 function1) {
                    this.f43210a = function1;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(a aVar, Continuation continuation) {
                    this.f43210a.invoke(aVar);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ConversationsViewModel conversationsViewModel, Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f43208o = conversationsViewModel;
                this.f43209p = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f43208o, this.f43209p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f43207n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C uiEvents = this.f43208o.getUiEvents();
                    C0624a c0624a = new C0624a(this.f43209p);
                    this.f43207n = 1;
                    if (uiEvents.collect(c0624a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC2193s interfaceC2193s, ConversationsViewModel conversationsViewModel, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f43204o = interfaceC2193s;
            this.f43205p = conversationsViewModel;
            this.f43206q = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f43204o, this.f43205p, this.f43206q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43203n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC2193s interfaceC2193s = this.f43204o;
                AbstractC2185j.b bVar = AbstractC2185j.b.f20393d;
                a aVar = new a(this.f43205p, this.f43206q, null);
                this.f43203n = 1;
                if (RepeatOnLifecycleKt.b(interfaceC2193s, bVar, aVar, this) == coroutine_suspended) {
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

    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43211n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43213p;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43214n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ConversationsViewModel f43215o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f43216p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ConversationsViewModel conversationsViewModel, String str, Continuation continuation) {
                super(2, continuation);
                this.f43215o = conversationsViewModel;
                this.f43216p = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f43215o, this.f43216p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List list;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f43214n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    yf.h getLastMessage = this.f43215o.getGetLastMessage();
                    this.f43214n = 1;
                    obj = getLastMessage.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List list2 = (List) ((C5582a) obj).b();
                if (list2 != null) {
                    ConversationsViewModel conversationsViewModel = this.f43215o;
                    ArrayList<SalesIQChat> conversations = LiveChatUtil.getConversations(this.f43216p);
                    Intrinsics.checkNotNullExpressionValue(conversations, "getConversations(...)");
                    list = conversationsViewModel.n(list2, conversations);
                } else {
                    list = null;
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Continuation continuation) {
            super(2, continuation);
            this.f43213p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConversationsViewModel.this.new i(this.f43213p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43211n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                L b10 = C1452g0.b();
                a aVar = new a(ConversationsViewModel.this, this.f43213p, null);
                this.f43211n = 1;
                obj = AbstractC1455i.g(b10, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ConversationsViewModel.this._uiEvents.a(new a.c((List) obj));
            return Unit.INSTANCE;
        }
    }

    public ConversationsViewModel() {
        x b10 = E.b(0, 16, null, 5, null);
        this._uiEvents = b10;
        this.uiEvents = AbstractC5323h.a(b10);
        this.messagesRepository = LazyKt.lazy(g.f43202d);
        this.getLastMessage = LazyKt.lazy(new d());
        B b11 = new B();
        this.chatsMutableLiveData = b11;
        this.chatsLiveData = b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6550a getMessagesRepository() {
        return (C6550a) this.messagesRepository.getValue();
    }

    public final yf.h getGetLastMessage() {
        return (yf.h) this.getLastMessage.getValue();
    }

    public final C getUiEvents() {
        return this.uiEvents;
    }

    public final void h() {
        AbstractC1459k.d(S.a(this), C1452g0.b(), null, new b(null), 2, null);
    }

    public final void i(String searchQuery) {
        this.searchQuery = searchQuery;
        AbstractC1459k.d(S.a(this), C1452g0.b(), null, new c(searchQuery, this, null), 2, null);
    }

    /* renamed from: j, reason: from getter */
    public final LiveData getChatsLiveData() {
        return this.chatsLiveData;
    }

    public final ArrayList k() {
        Object m147constructorimpl;
        ArrayList arrayList = new ArrayList();
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE TIMER_END_TIME != 0 AND STATUS = 2");
            try {
                if (executeRawQuery.moveToFirst()) {
                    arrayList.add(executeRawQuery.getString(executeRawQuery.getColumnIndexOrThrow("CHATID")));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(executeRawQuery, null);
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return arrayList;
    }

    public final void l(String searchQuery) {
        C0 d10;
        C0 c02 = this.messagesJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.searchQuery = searchQuery;
        d10 = AbstractC1459k.d(S.a(this), C1452g0.b(), null, new e(null), 2, null);
        this.messagesJob = d10;
    }

    public final List m(String searchQuery) {
        Object b10;
        this.searchQuery = searchQuery;
        b10 = AbstractC1457j.b(null, new f(searchQuery, null), 1, null);
        return (List) b10;
    }

    public final List n(List list, List list2) {
        List list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((Message) obj).getChatId(), obj);
        }
        List<SalesIQChat> list4 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (SalesIQChat salesIQChat : list4) {
            Message message = (Message) linkedHashMap.get(salesIQChat.getChid());
            if (salesIQChat.getLastMessage() != null) {
                if (salesIQChat.getLastMessage().getClientTime() >= og.i.r(message != null ? Long.valueOf(message.getClientTime()) : null)) {
                    if (Intrinsics.areEqual(salesIQChat.getLastMessage().isDeleted(), message != null ? message.isDeleted() : null)) {
                        if (Intrinsics.areEqual(salesIQChat.getLastMessage().getContent(), message != null ? message.getContent() : null)) {
                            arrayList.add(salesIQChat);
                        }
                    }
                }
            }
            salesIQChat.setLastMessage(message);
            arrayList.add(salesIQChat);
        }
        return arrayList;
    }

    public final void o(InterfaceC2193s owner, Function1 observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        AbstractC1459k.d(AbstractC2194t.a(owner), null, null, new h(owner, this, observer, null), 3, null);
    }

    public final void p(String searchQuery) {
        this.searchQuery = searchQuery;
        AbstractC1459k.d(S.a(this), null, null, new i(searchQuery, null), 3, null);
    }
}
