package com.zoho.livechat.android.modules.conversations.ui.viewmodels;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.P;
import a1.C1908a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.Q;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.conversations.domain.entities.LeaveMessageResponse;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import ie.EnumC4544a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.x;
import lb.C5444x;
import me.C5582a;
import pd.InterfaceC6064a;
import rd.C6218a;
import re.AbstractC6235a;
import re.C6239e;
import re.C6244j;
import re.C6247m;
import re.C6248n;
import re.C6249o;
import re.C6251q;
import td.C6461a;
import te.AbstractC6462a;
import uf.C6550a;
import we.AbstractC6744a;
import we.b;
import we.d;
import xe.C6822a;
import yf.C6888e;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001yB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010#\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u00020\b*\u00020%2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'JC\u0010,\u001a\u00020(2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020(2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J-\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u000200H\u0082@ø\u0001\u0000¢\u0006\u0004\b2\u00103J)\u00105\u001a\u00020(*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u00104\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b5\u00106J1\u00109\u001a\u00020\b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00108\u001a\u00020(H\u0002¢\u0006\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070?8\u0006¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010L\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bN\u0010OR\u001b\u0010T\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010E\u001a\u0004\bR\u0010SR\u001b\u0010X\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bV\u0010WR\u001b\u0010\\\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bZ\u0010[R\u001b\u0010`\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\b^\u0010_R\u001b\u0010d\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010E\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010E\u001a\u0004\bg\u0010hR\u001b\u0010l\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010E\u001a\u0004\b<\u0010kR\u001b\u0010q\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010E\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006z"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/ui/viewmodels/PreChatFormViewModel;", "Landroidx/lifecycle/Q;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "Lkotlin/Function1;", "Lcom/zoho/livechat/android/modules/conversations/ui/viewmodels/PreChatFormViewModel$a;", "", "observer", "z", "(Landroidx/lifecycle/s;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lcom/zoho/livechat/android/models/SalesIQChat;", "salesIQChat", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "message", "", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard$a;", "providedFields", "v", "(Landroid/content/Context;Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;Ljava/util/List;)V", "A", "(Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;)V", "w", "LMd/a;", "brandComponent", "Lie/a;", "appStatus", "D", "(LMd/a;Lie/a;)V", "question", "LPe/a;", "conversationType", "y", "(Landroid/content/Context;Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;Ljava/util/List;LPe/a;)V", "LPh/P;", "u", "(LPh/P;Lcom/zoho/livechat/android/models/SalesIQChat;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;Ljava/util/List;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isTriggeredChat", "Lcom/zoho/livechat/android/modules/core/domain/entities/Channel$Department;", "departments", "B", "(LMd/a;Lie/a;ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "acknowledgementKey", "Lme/a$b;", "error", "t", "(Lie/a;Ljava/lang/String;Lme/a$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previousAppStatus", C5444x.f55808b, "(Ljava/util/List;Lie/a;Lie/a;)Z", "chatId", "addStartTimer", "sendRefreshBroadCast", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lkotlinx/coroutines/flow/x;", "s", "Lkotlinx/coroutines/flow/x;", "_uiEvents", "Lkotlinx/coroutines/flow/C;", "Lkotlinx/coroutines/flow/C;", "getUiEvents", "()Lkotlinx/coroutines/flow/C;", "uiEvents", "LKe/a;", "Lkotlin/Lazy;", "getConversationsRepository", "()LKe/a;", "conversationsRepository", "Luf/a;", "getMessagesRepository", "()Luf/a;", "messagesRepository", "LKd/a;", "getBrandRepository", "()LKd/a;", "brandRepository", "LOd/g;", "getSyncBrandStatusUseCase", "()LOd/g;", "syncBrandStatusUseCase", "LOd/h;", "getSyncFormUseCase", "()LOd/h;", "syncFormUseCase", "LOd/a;", "getClearFormUseCase", "()LOd/a;", "clearFormUseCase", "Lyf/e;", "q", "()Lyf/e;", "deleteMessagesUseCase", "LRe/m;", "r", "()LRe/m;", "startNewConversationUseCase", "LRe/i;", "C", "getLeaveAsMissedConversation", "()LRe/i;", "leaveAsMissedConversation", "Lyf/x;", "()Lyf/x;", "syncMessageUseCase", "Lyf/k;", "E", "getGetMessagesUseCase", "()Lyf/k;", "getMessagesUseCase", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "application", "getAppScope", "()LPh/P;", "appScope", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreChatFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreChatFormViewModel.kt\ncom/zoho/livechat/android/modules/conversations/ui/viewmodels/PreChatFormViewModel\n+ 2 SalesIQResult.kt\ncom/zoho/livechat/android/modules/common/ui/result/entities/SalesIQResult\n+ 3 SalesIQResult.kt\ncom/zoho/livechat/android/modules/common/result/SalesIQResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,525:1\n22#2,4:526\n26#2:544\n30#2,5:545\n27#3,5:530\n46#3,9:535\n1#4:550\n1557#5:551\n1628#5,3:552\n1863#5,2:555\n*S KotlinDebug\n*F\n+ 1 PreChatFormViewModel.kt\ncom/zoho/livechat/android/modules/conversations/ui/viewmodels/PreChatFormViewModel\n*L\n150#1:526,4\n150#1:544\n199#1:545,5\n163#1:530,5\n169#1:535,9\n485#1:551\n485#1:552,3\n489#1:555,2\n*E\n"})
/* loaded from: classes4.dex */
public final class PreChatFormViewModel extends Q {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final Lazy deleteMessagesUseCase;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final Lazy startNewConversationUseCase;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final Lazy leaveAsMissedConversation;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final Lazy syncMessageUseCase;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final Lazy getMessagesUseCase;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final x _uiEvents;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final C uiEvents;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final Lazy conversationsRepository;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final Lazy messagesRepository;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Lazy brandRepository;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final Lazy syncBrandStatusUseCase;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final Lazy syncFormUseCase;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final Lazy clearFormUseCase;

    public static abstract class a {

        /* renamed from: com.zoho.livechat.android.modules.conversations.ui.viewmodels.PreChatFormViewModel$a$a, reason: collision with other inner class name */
        public static final class C0625a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0625a f43357a = new C0625a();

            public C0625a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0625a);
            }

            public int hashCode() {
                return -708571311;
            }

            public String toString() {
                return "DepartmentNotMapped";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final SalesIQChat f43358a;

            public b(SalesIQChat salesIQChat) {
                super(null);
                this.f43358a = salesIQChat;
            }

            public final SalesIQChat a() {
                return this.f43358a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f43358a, ((b) obj).f43358a);
            }

            public int hashCode() {
                SalesIQChat salesIQChat = this.f43358a;
                if (salesIQChat == null) {
                    return 0;
                }
                return salesIQChat.hashCode();
            }

            public String toString() {
                return "InitiateNewCallConversationComplete(chat=" + this.f43358a + ')';
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f43359a;

            /* renamed from: b, reason: collision with root package name */
            public final SalesIQChat f43360b;

            /* renamed from: c, reason: collision with root package name */
            public final Integer f43361c;

            public /* synthetic */ c(boolean z10, SalesIQChat salesIQChat, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10, salesIQChat, (i10 & 4) != 0 ? null : num);
            }

            public final SalesIQChat a() {
                return this.f43360b;
            }

            public final Integer b() {
                return this.f43361c;
            }

            public final boolean c() {
                return this.f43359a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f43359a == cVar.f43359a && Intrinsics.areEqual(this.f43360b, cVar.f43360b) && Intrinsics.areEqual(this.f43361c, cVar.f43361c);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7 */
            public int hashCode() {
                boolean z10 = this.f43359a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                int i10 = r02 * 31;
                SalesIQChat salesIQChat = this.f43360b;
                int hashCode = (i10 + (salesIQChat == null ? 0 : salesIQChat.hashCode())) * 31;
                Integer num = this.f43361c;
                return hashCode + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "InitiateNewChatComplete(isSuccess=" + this.f43359a + ", chat=" + this.f43360b + ", errorStringResId=" + this.f43361c + ')';
            }

            public c(boolean z10, SalesIQChat salesIQChat, Integer num) {
                super(null);
                this.f43359a = z10;
                this.f43360b = salesIQChat;
                this.f43361c = num;
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public final SalesIQChat f43362a;

            public d(SalesIQChat salesIQChat) {
                super(null);
                this.f43362a = salesIQChat;
            }

            public final SalesIQChat a() {
                return this.f43362a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f43362a, ((d) obj).f43362a);
            }

            public int hashCode() {
                SalesIQChat salesIQChat = this.f43362a;
                if (salesIQChat == null) {
                    return 0;
                }
                return salesIQChat.hashCode();
            }

            public String toString() {
                return "LeaveAsMissedComplete(chat=" + this.f43362a + ')';
            }
        }

        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f43363a;

            public e(int i10) {
                super(null);
                this.f43363a = i10;
            }

            public final int a() {
                return this.f43363a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f43363a == ((e) obj).f43363a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f43363a);
            }

            public String toString() {
                return "LeaveAsMissedError(errorStringResId=" + this.f43363a + ')';
            }
        }

        public static final class f extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f43364a;

            /* renamed from: b, reason: collision with root package name */
            public final SalesIQChat f43365b;

            /* renamed from: c, reason: collision with root package name */
            public final Integer f43366c;

            public /* synthetic */ f(boolean z10, SalesIQChat salesIQChat, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10, salesIQChat, (i10 & 4) != 0 ? null : num);
            }

            public final boolean a() {
                return this.f43364a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f43364a == fVar.f43364a && Intrinsics.areEqual(this.f43365b, fVar.f43365b) && Intrinsics.areEqual(this.f43366c, fVar.f43366c);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7 */
            public int hashCode() {
                boolean z10 = this.f43364a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                int i10 = r02 * 31;
                SalesIQChat salesIQChat = this.f43365b;
                int hashCode = (i10 + (salesIQChat == null ? 0 : salesIQChat.hashCode())) * 31;
                Integer num = this.f43366c;
                return hashCode + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "ReopenChatComplete(isSuccess=" + this.f43364a + ", chat=" + this.f43365b + ", errorCode=" + this.f43366c + ')';
            }

            public f(boolean z10, SalesIQChat salesIQChat, Integer num) {
                super(null);
                this.f43364a = z10;
                this.f43365b = salesIQChat;
                this.f43366c = num;
            }
        }

        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f43367a = new g();

            public g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 907257684;
            }

            public String toString() {
                return "ReopenDepartmentNotMapped";
            }
        }

        public static final class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Context f43368a;

            /* renamed from: b, reason: collision with root package name */
            public final SalesIQChat f43369b;

            /* renamed from: c, reason: collision with root package name */
            public final Message f43370c;

            /* renamed from: d, reason: collision with root package name */
            public final List f43371d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Context context, SalesIQChat salesIQChat, Message question, List providedFields) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
                Intrinsics.checkNotNullParameter(question, "question");
                Intrinsics.checkNotNullParameter(providedFields, "providedFields");
                this.f43368a = context;
                this.f43369b = salesIQChat;
                this.f43370c = question;
                this.f43371d = providedFields;
            }

            public final Context a() {
                return this.f43368a;
            }

            public final List b() {
                return this.f43371d;
            }

            public final Message c() {
                return this.f43370c;
            }

            public final SalesIQChat d() {
                return this.f43369b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.areEqual(this.f43368a, hVar.f43368a) && Intrinsics.areEqual(this.f43369b, hVar.f43369b) && Intrinsics.areEqual(this.f43370c, hVar.f43370c) && Intrinsics.areEqual(this.f43371d, hVar.f43371d);
            }

            public int hashCode() {
                return (((((this.f43368a.hashCode() * 31) + this.f43369b.hashCode()) * 31) + this.f43370c.hashCode()) * 31) + this.f43371d.hashCode();
            }

            public String toString() {
                return "ShowCallRecordingConsent(context=" + this.f43368a + ", salesIQChat=" + this.f43369b + ", question=" + this.f43370c + ", providedFields=" + this.f43371d + ')';
            }
        }

        public static final class i extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f43372a;

            public i(boolean z10) {
                super(null);
                this.f43372a = z10;
            }

            public final boolean a() {
                return this.f43372a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.f43372a == ((i) obj).f43372a;
            }

            public int hashCode() {
                boolean z10 = this.f43372a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return "SyncFormsComplete(isSynced=" + this.f43372a + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            return Kd.a.f6469f.a(PreChatFormViewModel.this.getApplication());
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.a invoke() {
            return new Od.a(PreChatFormViewModel.this.getBrandRepository());
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ke.a invoke() {
            return Ke.a.f6496j.a(PreChatFormViewModel.this.getApplication());
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6888e invoke() {
            return new C6888e(PreChatFormViewModel.this.getMessagesRepository());
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.k invoke() {
            return new yf.k(PreChatFormViewModel.this.getMessagesRepository());
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43378n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f43379o;

        /* renamed from: q, reason: collision with root package name */
        public int f43381q;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43379o = obj;
            this.f43381q |= Integer.MIN_VALUE;
            return PreChatFormViewModel.this.t(null, null, null, this);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43382n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f43383o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f43385q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Message f43386r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f43387s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f43388t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SalesIQChat salesIQChat, Message message, List list, Context context, Continuation continuation) {
            super(2, continuation);
            this.f43385q = salesIQChat;
            this.f43386r = message;
            this.f43387s = list;
            this.f43388t = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            h hVar = PreChatFormViewModel.this.new h(this.f43385q, this.f43386r, this.f43387s, this.f43388t, continuation);
            hVar.f43383o = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43382n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P p10 = (P) this.f43383o;
                PreChatFormViewModel preChatFormViewModel = PreChatFormViewModel.this;
                SalesIQChat salesIQChat = this.f43385q;
                Message message = this.f43386r;
                List list = this.f43387s;
                Context context = this.f43388t;
                this.f43382n = 1;
                if (preChatFormViewModel.u(p10, salesIQChat, message, list, context, this) == coroutine_suspended) {
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

    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43389n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43390o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43391p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43392q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43393r;

        /* renamed from: s, reason: collision with root package name */
        public Object f43394s;

        /* renamed from: t, reason: collision with root package name */
        public Object f43395t;

        /* renamed from: u, reason: collision with root package name */
        public Object f43396u;

        /* renamed from: v, reason: collision with root package name */
        public Object f43397v;

        /* renamed from: w, reason: collision with root package name */
        public Object f43398w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f43399x;

        /* renamed from: z, reason: collision with root package name */
        public int f43401z;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43399x = obj;
            this.f43401z |= Integer.MIN_VALUE;
            return PreChatFormViewModel.this.u(null, null, null, null, null, this);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43402n;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43402n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Td.e.O0(null, null, Boxing.boxBoolean(false), null, 11, null);
                this.f43402n = 1;
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

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ List f43403A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ Context f43404B;

        /* renamed from: n, reason: collision with root package name */
        public Object f43405n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43406o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43407p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43408q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43409r;

        /* renamed from: s, reason: collision with root package name */
        public Object f43410s;

        /* renamed from: t, reason: collision with root package name */
        public Object f43411t;

        /* renamed from: u, reason: collision with root package name */
        public Object f43412u;

        /* renamed from: v, reason: collision with root package name */
        public int f43413v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f43414w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f43415x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Message f43416y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ PreChatFormViewModel f43417z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(SalesIQChat salesIQChat, Message message, PreChatFormViewModel preChatFormViewModel, List list, Context context, Continuation continuation) {
            super(2, continuation);
            this.f43415x = salesIQChat;
            this.f43416y = message;
            this.f43417z = preChatFormViewModel;
            this.f43403A = list;
            this.f43404B = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            k kVar = new k(this.f43415x, this.f43416y, this.f43417z, this.f43403A, this.f43404B, continuation);
            kVar.f43414w = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((k) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x02f5, code lost:
        
            if (r8.b(r9, r14) == r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01f4, code lost:
        
            if (r5 == r6) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x03ed, code lost:
        
            if (r8 != null) goto L99;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x03da  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0304  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0289  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P p10;
            String deptid;
            Message message;
            SalesIQChat salesIQChat;
            PreChatFormViewModel preChatFormViewModel;
            List list;
            Context context;
            k kVar;
            Object b10;
            Message message2;
            SalesIQChat salesIQChat2;
            Context context2;
            List list2;
            Re.m r10;
            String convID;
            Object a10;
            Context context3;
            Re.m mVar;
            String str;
            Message message3;
            String str2;
            P p11;
            SalesIQChat salesIQChat3;
            String content;
            P p12;
            SalesIQChat salesIQChat4;
            PreChatFormViewModel preChatFormViewModel2;
            List list3;
            InterfaceC5321f interfaceC5321f;
            Object t10;
            SalesIQChat salesIQChat5;
            P p13;
            Object obj2;
            Object b11;
            SalesIQChat salesIQChat6;
            P p14;
            Message message4;
            PreChatFormViewModel preChatFormViewModel3;
            List list4;
            Context context4;
            Message message5;
            C5582a c5582a;
            Object obj3;
            C5582a c5582a2;
            PreChatFormViewModel preChatFormViewModel4;
            C5582a c5582a3;
            PreChatFormViewModel preChatFormViewModel5;
            C5582a c5582a4;
            Context context5;
            List list5;
            SalesIQChat salesIQChat7;
            Message message6;
            C5582a.b bVar;
            Integer b12;
            k kVar2 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (kVar2.f43413v) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    p10 = (P) kVar2.f43414w;
                    deptid = kVar2.f43415x.getDeptid();
                    if (deptid != null) {
                        message = kVar2.f43416y;
                        salesIQChat = kVar2.f43415x;
                        preChatFormViewModel = kVar2.f43417z;
                        list = kVar2.f43403A;
                        context = kVar2.f43404B;
                        if (message == null) {
                            kVar = kVar2;
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                            r10 = preChatFormViewModel.r();
                            convID = salesIQChat.getConvID();
                            Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                            if (message == null) {
                            }
                            yf.k getMessagesUseCase = preChatFormViewModel.getGetMessagesUseCase();
                            String convID2 = salesIQChat.getConvID();
                            String chid = salesIQChat.getChid();
                            Message.g gVar = Message.g.Question;
                            kVar.f43414w = p10;
                            kVar.f43405n = message;
                            kVar.f43406o = salesIQChat;
                            kVar.f43407p = preChatFormViewModel;
                            kVar.f43408q = list;
                            kVar.f43409r = context;
                            kVar.f43410s = deptid;
                            kVar.f43411t = convID;
                            kVar.f43412u = r10;
                            kVar.f43413v = 2;
                            a10 = getMessagesUseCase.a(convID2, chid, gVar, kVar);
                            if (a10 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        yf.x s10 = preChatFormViewModel.s();
                        kVar2.f43414w = p10;
                        kVar2.f43405n = message;
                        kVar2.f43406o = salesIQChat;
                        kVar2.f43407p = preChatFormViewModel;
                        kVar2.f43408q = list;
                        kVar2.f43409r = context;
                        kVar2.f43410s = deptid;
                        kVar2.f43413v = 1;
                        kVar = kVar2;
                        b10 = yf.x.b(s10, message, false, kVar, 2, null);
                        if (b10 != coroutine_suspended) {
                            message2 = message;
                            salesIQChat2 = salesIQChat;
                            context2 = context;
                            list2 = list;
                            context = context2;
                            list = list2;
                            salesIQChat = salesIQChat2;
                            message = message2;
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                            r10 = preChatFormViewModel.r();
                            convID = salesIQChat.getConvID();
                            Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                            if (message == null && (content = message.getContent()) != null) {
                                p12 = p10;
                                salesIQChat4 = salesIQChat;
                                preChatFormViewModel2 = preChatFormViewModel;
                                list3 = list;
                                Intrinsics.checkNotNull(deptid);
                                String str3 = content;
                                Pe.a aVar = Pe.a.Chat;
                                boolean i10 = og.i.i(Boxing.boxBoolean(salesIQChat4.isTriggeredChat()));
                                String n10 = C6218a.n();
                                kVar.f43414w = p12;
                                kVar.f43405n = message;
                                kVar.f43406o = salesIQChat4;
                                kVar.f43407p = preChatFormViewModel2;
                                kVar.f43408q = list3;
                                kVar.f43409r = context;
                                kVar.f43410s = null;
                                kVar.f43411t = null;
                                kVar.f43412u = null;
                                kVar.f43413v = 4;
                                P p15 = p12;
                                Message message7 = message;
                                PreChatFormViewModel preChatFormViewModel6 = preChatFormViewModel2;
                                List list6 = list3;
                                kVar2 = kVar;
                                SalesIQChat salesIQChat8 = salesIQChat4;
                                Context context6 = context;
                                obj2 = coroutine_suspended;
                                b11 = Re.m.b(r10, convID, str3, deptid, aVar, i10, false, null, null, n10, null, null, null, kVar2, 3584, null);
                                if (b11 != obj2) {
                                }
                                return obj2;
                            }
                            yf.k getMessagesUseCase2 = preChatFormViewModel.getGetMessagesUseCase();
                            String convID22 = salesIQChat.getConvID();
                            String chid2 = salesIQChat.getChid();
                            Message.g gVar2 = Message.g.Question;
                            kVar.f43414w = p10;
                            kVar.f43405n = message;
                            kVar.f43406o = salesIQChat;
                            kVar.f43407p = preChatFormViewModel;
                            kVar.f43408q = list;
                            kVar.f43409r = context;
                            kVar.f43410s = deptid;
                            kVar.f43411t = convID;
                            kVar.f43412u = r10;
                            kVar.f43413v = 2;
                            a10 = getMessagesUseCase2.a(convID22, chid2, gVar2, kVar);
                            if (a10 != coroutine_suspended) {
                                context3 = context;
                                mVar = r10;
                                str = deptid;
                                message3 = message;
                                str2 = convID;
                                SalesIQChat salesIQChat9 = salesIQChat;
                                p11 = p10;
                                salesIQChat3 = salesIQChat9;
                                interfaceC5321f = (InterfaceC5321f) ((C5582a) a10).b();
                                if (interfaceC5321f != null) {
                                    String str4 = str;
                                    r10 = mVar;
                                    context = context3;
                                    convID = str2;
                                    message = message3;
                                    deptid = str4;
                                    P p16 = p11;
                                    salesIQChat5 = salesIQChat3;
                                    p13 = p16;
                                    content = null;
                                    if (content == null) {
                                        content = "";
                                    }
                                    p12 = p13;
                                    salesIQChat4 = salesIQChat5;
                                    preChatFormViewModel2 = preChatFormViewModel;
                                    list3 = list;
                                    Intrinsics.checkNotNull(deptid);
                                    String str32 = content;
                                    Pe.a aVar2 = Pe.a.Chat;
                                    boolean i102 = og.i.i(Boxing.boxBoolean(salesIQChat4.isTriggeredChat()));
                                    String n102 = C6218a.n();
                                    kVar.f43414w = p12;
                                    kVar.f43405n = message;
                                    kVar.f43406o = salesIQChat4;
                                    kVar.f43407p = preChatFormViewModel2;
                                    kVar.f43408q = list3;
                                    kVar.f43409r = context;
                                    kVar.f43410s = null;
                                    kVar.f43411t = null;
                                    kVar.f43412u = null;
                                    kVar.f43413v = 4;
                                    P p152 = p12;
                                    Message message72 = message;
                                    PreChatFormViewModel preChatFormViewModel62 = preChatFormViewModel2;
                                    List list62 = list3;
                                    kVar2 = kVar;
                                    SalesIQChat salesIQChat82 = salesIQChat4;
                                    Context context62 = context;
                                    obj2 = coroutine_suspended;
                                    b11 = Re.m.b(r10, convID, str32, deptid, aVar2, i102, false, null, null, n102, null, null, null, kVar2, 3584, null);
                                    if (b11 != obj2) {
                                        salesIQChat6 = salesIQChat82;
                                        p14 = p152;
                                        message4 = message72;
                                        preChatFormViewModel3 = preChatFormViewModel62;
                                        list4 = list62;
                                        context4 = context62;
                                        c5582a = (C5582a) b11;
                                        if (c5582a.d()) {
                                            SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(salesIQChat6.getConvID());
                                            preChatFormViewModel3._uiEvents.a(new a.c(true, chatWithAnyId, null, 4, null));
                                            if (chatWithAnyId != null && chatWithAnyId.getStatus() == 3) {
                                                obj3 = null;
                                                MobilistenUtil.A(AbstractC6462a.b(C6822a.m()), 0, 2, null);
                                                Od.g syncBrandStatusUseCase = preChatFormViewModel3.getSyncBrandStatusUseCase();
                                                Md.a[] aVarArr = {Md.a.Chat};
                                                kVar2.f43414w = p14;
                                                kVar2.f43405n = message4;
                                                kVar2.f43406o = salesIQChat6;
                                                kVar2.f43407p = preChatFormViewModel3;
                                                kVar2.f43408q = list4;
                                                kVar2.f43409r = context4;
                                                kVar2.f43410s = c5582a;
                                                kVar2.f43413v = 5;
                                                break;
                                            }
                                        }
                                        obj3 = null;
                                        c5582a2 = c5582a;
                                        Context context7 = context4;
                                        List list7 = list4;
                                        preChatFormViewModel4 = preChatFormViewModel3;
                                        SalesIQChat salesIQChat10 = salesIQChat6;
                                        Message message8 = message4;
                                        if (!c5582a2.d()) {
                                            C5582a.b c10 = c5582a2.c();
                                            Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                                            com.zoho.livechat.android.provider.a.INSTANCE.deleteConversation(preChatFormViewModel4.getApplication().getContentResolver(), null, salesIQChat10.getChid(), true, false);
                                            Integer b13 = c10.b();
                                            int a11 = C6239e.f64119d.a();
                                            if (b13 == null || b13.intValue() != a11) {
                                                Integer b14 = c10.b();
                                                int a12 = C6248n.f64128d.a();
                                                if (b14 == null || b14.intValue() != a12) {
                                                    EnumC4544a enumC4544a = EnumC4544a.Online;
                                                    String convID3 = salesIQChat10.getConvID();
                                                    kVar2.f43414w = p14;
                                                    kVar2.f43405n = preChatFormViewModel4;
                                                    kVar2.f43406o = c5582a2;
                                                    kVar2.f43407p = obj3;
                                                    kVar2.f43408q = obj3;
                                                    kVar2.f43409r = obj3;
                                                    kVar2.f43410s = obj3;
                                                    kVar2.f43413v = 7;
                                                    if (preChatFormViewModel4.t(enumC4544a, convID3, c10, kVar2) != obj2) {
                                                        c5582a3 = c5582a2;
                                                        c5582a2 = c5582a3;
                                                        preChatFormViewModel4._uiEvents.a(new a.c(false, null, null, 4, null));
                                                        break;
                                                    }
                                                }
                                            }
                                            Md.a aVar3 = Md.a.Chat;
                                            boolean i11 = og.i.i(Boxing.boxBoolean(salesIQChat10.isTriggeredChat()));
                                            kVar2.f43414w = p14;
                                            kVar2.f43405n = message8;
                                            kVar2.f43406o = salesIQChat10;
                                            kVar2.f43407p = preChatFormViewModel4;
                                            kVar2.f43408q = list7;
                                            kVar2.f43409r = context7;
                                            kVar2.f43410s = c5582a2;
                                            kVar2.f43411t = c10;
                                            kVar2.f43413v = 6;
                                            Object obj4 = obj2;
                                            if (PreChatFormViewModel.C(preChatFormViewModel4, aVar3, null, i11, null, kVar2, 8, null) == obj4) {
                                                return obj4;
                                            }
                                            preChatFormViewModel5 = preChatFormViewModel4;
                                            c5582a4 = c5582a2;
                                            context5 = context7;
                                            list5 = list7;
                                            salesIQChat7 = salesIQChat10;
                                            message6 = message8;
                                            bVar = c10;
                                            b12 = bVar.b();
                                            int a13 = C6248n.f64128d.a();
                                            if (b12 != null && b12.intValue() == a13) {
                                                preChatFormViewModel5._uiEvents.a(a.C0625a.f43357a);
                                                return Unit.INSTANCE;
                                            }
                                            if (!preChatFormViewModel5.x(list5, EnumC4544a.Online, EnumC4544a.Offline)) {
                                                preChatFormViewModel5.y(context5, salesIQChat7, message6, list5, Pe.a.Chat);
                                                return Unit.INSTANCE;
                                            }
                                            c5582a2 = c5582a4;
                                            preChatFormViewModel4 = preChatFormViewModel5;
                                            preChatFormViewModel4._uiEvents.a(new a.c(false, null, null, 4, null));
                                        }
                                    }
                                    return obj2;
                                }
                                kVar.f43414w = p11;
                                kVar.f43405n = message3;
                                kVar.f43406o = salesIQChat3;
                                kVar.f43407p = preChatFormViewModel;
                                kVar.f43408q = list;
                                kVar.f43409r = context3;
                                kVar.f43410s = str;
                                kVar.f43411t = str2;
                                kVar.f43412u = mVar;
                                kVar.f43413v = 3;
                                t10 = AbstractC5323h.t(interfaceC5321f, kVar);
                                break;
                            }
                        }
                        return coroutine_suspended;
                    }
                    Boxing.boxBoolean(kVar2.f43417z._uiEvents.a(new a.c(false, null, null, 4, null)));
                    return Unit.INSTANCE;
                case 1:
                    String str5 = (String) kVar2.f43410s;
                    context2 = (Context) kVar2.f43409r;
                    list2 = (List) kVar2.f43408q;
                    PreChatFormViewModel preChatFormViewModel7 = (PreChatFormViewModel) kVar2.f43407p;
                    salesIQChat2 = (SalesIQChat) kVar2.f43406o;
                    message2 = (Message) kVar2.f43405n;
                    p10 = (P) kVar2.f43414w;
                    ResultKt.throwOnFailure(obj);
                    deptid = str5;
                    preChatFormViewModel = preChatFormViewModel7;
                    kVar = kVar2;
                    b10 = obj;
                    context = context2;
                    list = list2;
                    salesIQChat = salesIQChat2;
                    message = message2;
                    com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
                    r10 = preChatFormViewModel.r();
                    convID = salesIQChat.getConvID();
                    Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                    if (message == null) {
                    }
                    yf.k getMessagesUseCase22 = preChatFormViewModel.getGetMessagesUseCase();
                    String convID222 = salesIQChat.getConvID();
                    String chid22 = salesIQChat.getChid();
                    Message.g gVar22 = Message.g.Question;
                    kVar.f43414w = p10;
                    kVar.f43405n = message;
                    kVar.f43406o = salesIQChat;
                    kVar.f43407p = preChatFormViewModel;
                    kVar.f43408q = list;
                    kVar.f43409r = context;
                    kVar.f43410s = deptid;
                    kVar.f43411t = convID;
                    kVar.f43412u = r10;
                    kVar.f43413v = 2;
                    a10 = getMessagesUseCase22.a(convID222, chid22, gVar22, kVar);
                    if (a10 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    mVar = (Re.m) kVar2.f43412u;
                    str2 = (String) kVar2.f43411t;
                    str = (String) kVar2.f43410s;
                    Context context8 = (Context) kVar2.f43409r;
                    List list8 = (List) kVar2.f43408q;
                    PreChatFormViewModel preChatFormViewModel8 = (PreChatFormViewModel) kVar2.f43407p;
                    salesIQChat3 = (SalesIQChat) kVar2.f43406o;
                    message3 = (Message) kVar2.f43405n;
                    p11 = (P) kVar2.f43414w;
                    ResultKt.throwOnFailure(obj);
                    list = list8;
                    preChatFormViewModel = preChatFormViewModel8;
                    a10 = obj;
                    context3 = context8;
                    kVar = kVar2;
                    interfaceC5321f = (InterfaceC5321f) ((C5582a) a10).b();
                    if (interfaceC5321f != null) {
                    }
                    break;
                case 3:
                    mVar = (Re.m) kVar2.f43412u;
                    str2 = (String) kVar2.f43411t;
                    str = (String) kVar2.f43410s;
                    Context context9 = (Context) kVar2.f43409r;
                    List list9 = (List) kVar2.f43408q;
                    PreChatFormViewModel preChatFormViewModel9 = (PreChatFormViewModel) kVar2.f43407p;
                    salesIQChat3 = (SalesIQChat) kVar2.f43406o;
                    message3 = (Message) kVar2.f43405n;
                    p11 = (P) kVar2.f43414w;
                    ResultKt.throwOnFailure(obj);
                    list = list9;
                    preChatFormViewModel = preChatFormViewModel9;
                    t10 = obj;
                    context3 = context9;
                    kVar = kVar2;
                    List list10 = (List) t10;
                    if (list10 != null && (message5 = (Message) CollectionsKt.firstOrNull(list10)) != null) {
                        content = message5.getContent();
                        String str6 = str;
                        r10 = mVar;
                        context = context3;
                        convID = str2;
                        message = message3;
                        deptid = str6;
                        P p17 = p11;
                        salesIQChat5 = salesIQChat3;
                        p13 = p17;
                        if (content == null) {
                        }
                        p12 = p13;
                        salesIQChat4 = salesIQChat5;
                        preChatFormViewModel2 = preChatFormViewModel;
                        list3 = list;
                        Intrinsics.checkNotNull(deptid);
                        String str322 = content;
                        Pe.a aVar22 = Pe.a.Chat;
                        boolean i1022 = og.i.i(Boxing.boxBoolean(salesIQChat4.isTriggeredChat()));
                        String n1022 = C6218a.n();
                        kVar.f43414w = p12;
                        kVar.f43405n = message;
                        kVar.f43406o = salesIQChat4;
                        kVar.f43407p = preChatFormViewModel2;
                        kVar.f43408q = list3;
                        kVar.f43409r = context;
                        kVar.f43410s = null;
                        kVar.f43411t = null;
                        kVar.f43412u = null;
                        kVar.f43413v = 4;
                        P p1522 = p12;
                        Message message722 = message;
                        PreChatFormViewModel preChatFormViewModel622 = preChatFormViewModel2;
                        List list622 = list3;
                        kVar2 = kVar;
                        SalesIQChat salesIQChat822 = salesIQChat4;
                        Context context622 = context;
                        obj2 = coroutine_suspended;
                        b11 = Re.m.b(r10, convID, str322, deptid, aVar22, i1022, false, null, null, n1022, null, null, null, kVar2, 3584, null);
                        if (b11 != obj2) {
                        }
                        return obj2;
                    }
                    String str42 = str;
                    r10 = mVar;
                    context = context3;
                    convID = str2;
                    message = message3;
                    deptid = str42;
                    P p162 = p11;
                    salesIQChat5 = salesIQChat3;
                    p13 = p162;
                    content = null;
                    if (content == null) {
                    }
                    p12 = p13;
                    salesIQChat4 = salesIQChat5;
                    preChatFormViewModel2 = preChatFormViewModel;
                    list3 = list;
                    Intrinsics.checkNotNull(deptid);
                    String str3222 = content;
                    Pe.a aVar222 = Pe.a.Chat;
                    boolean i10222 = og.i.i(Boxing.boxBoolean(salesIQChat4.isTriggeredChat()));
                    String n10222 = C6218a.n();
                    kVar.f43414w = p12;
                    kVar.f43405n = message;
                    kVar.f43406o = salesIQChat4;
                    kVar.f43407p = preChatFormViewModel2;
                    kVar.f43408q = list3;
                    kVar.f43409r = context;
                    kVar.f43410s = null;
                    kVar.f43411t = null;
                    kVar.f43412u = null;
                    kVar.f43413v = 4;
                    P p15222 = p12;
                    Message message7222 = message;
                    PreChatFormViewModel preChatFormViewModel6222 = preChatFormViewModel2;
                    List list6222 = list3;
                    kVar2 = kVar;
                    SalesIQChat salesIQChat8222 = salesIQChat4;
                    Context context6222 = context;
                    obj2 = coroutine_suspended;
                    b11 = Re.m.b(r10, convID, str3222, deptid, aVar222, i10222, false, null, null, n10222, null, null, null, kVar2, 3584, null);
                    if (b11 != obj2) {
                    }
                    return obj2;
                case 4:
                    Context context10 = (Context) kVar2.f43409r;
                    List list11 = (List) kVar2.f43408q;
                    PreChatFormViewModel preChatFormViewModel10 = (PreChatFormViewModel) kVar2.f43407p;
                    SalesIQChat salesIQChat11 = (SalesIQChat) kVar2.f43406o;
                    Message message9 = (Message) kVar2.f43405n;
                    P p18 = (P) kVar2.f43414w;
                    ResultKt.throwOnFailure(obj);
                    context4 = context10;
                    obj2 = coroutine_suspended;
                    message4 = message9;
                    preChatFormViewModel3 = preChatFormViewModel10;
                    p14 = p18;
                    salesIQChat6 = salesIQChat11;
                    list4 = list11;
                    b11 = obj;
                    c5582a = (C5582a) b11;
                    if (c5582a.d()) {
                    }
                    obj3 = null;
                    c5582a2 = c5582a;
                    Context context72 = context4;
                    List list72 = list4;
                    preChatFormViewModel4 = preChatFormViewModel3;
                    SalesIQChat salesIQChat102 = salesIQChat6;
                    Message message82 = message4;
                    if (!c5582a2.d()) {
                    }
                    break;
                case 5:
                    C5582a c5582a5 = (C5582a) kVar2.f43410s;
                    Context context11 = (Context) kVar2.f43409r;
                    List list12 = (List) kVar2.f43408q;
                    PreChatFormViewModel preChatFormViewModel11 = (PreChatFormViewModel) kVar2.f43407p;
                    SalesIQChat salesIQChat12 = (SalesIQChat) kVar2.f43406o;
                    Message message10 = (Message) kVar2.f43405n;
                    p14 = (P) kVar2.f43414w;
                    ResultKt.throwOnFailure(obj);
                    c5582a = c5582a5;
                    obj2 = coroutine_suspended;
                    message4 = message10;
                    salesIQChat6 = salesIQChat12;
                    preChatFormViewModel3 = preChatFormViewModel11;
                    list4 = list12;
                    context4 = context11;
                    obj3 = null;
                    c5582a2 = c5582a;
                    Context context722 = context4;
                    List list722 = list4;
                    preChatFormViewModel4 = preChatFormViewModel3;
                    SalesIQChat salesIQChat1022 = salesIQChat6;
                    Message message822 = message4;
                    if (!c5582a2.d()) {
                    }
                    break;
                case 6:
                    bVar = (C5582a.b) kVar2.f43411t;
                    c5582a4 = (C5582a) kVar2.f43410s;
                    Context context12 = (Context) kVar2.f43409r;
                    List list13 = (List) kVar2.f43408q;
                    PreChatFormViewModel preChatFormViewModel12 = (PreChatFormViewModel) kVar2.f43407p;
                    SalesIQChat salesIQChat13 = (SalesIQChat) kVar2.f43406o;
                    Message message11 = (Message) kVar2.f43405n;
                    ResultKt.throwOnFailure(obj);
                    context5 = context12;
                    preChatFormViewModel5 = preChatFormViewModel12;
                    salesIQChat7 = salesIQChat13;
                    message6 = message11;
                    list5 = list13;
                    b12 = bVar.b();
                    int a132 = C6248n.f64128d.a();
                    if (b12 != null) {
                        preChatFormViewModel5._uiEvents.a(a.C0625a.f43357a);
                        return Unit.INSTANCE;
                    }
                    if (!preChatFormViewModel5.x(list5, EnumC4544a.Online, EnumC4544a.Offline)) {
                    }
                    break;
                case 7:
                    c5582a3 = (C5582a) kVar2.f43406o;
                    preChatFormViewModel4 = (PreChatFormViewModel) kVar2.f43405n;
                    ResultKt.throwOnFailure(obj);
                    c5582a2 = c5582a3;
                    preChatFormViewModel4._uiEvents.a(new a.c(false, null, null, 4, null));
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.i invoke() {
            return new Re.i(PreChatFormViewModel.this.getConversationsRepository());
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Context f43419A;

        /* renamed from: n, reason: collision with root package name */
        public Object f43420n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43421o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43422p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43423q;

        /* renamed from: r, reason: collision with root package name */
        public Object f43424r;

        /* renamed from: s, reason: collision with root package name */
        public Object f43425s;

        /* renamed from: t, reason: collision with root package name */
        public Object f43426t;

        /* renamed from: u, reason: collision with root package name */
        public int f43427u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f43428v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Message f43429w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ PreChatFormViewModel f43430x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Pe.a f43431y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ List f43432z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(SalesIQChat salesIQChat, Message message, PreChatFormViewModel preChatFormViewModel, Pe.a aVar, List list, Context context, Continuation continuation) {
            super(2, continuation);
            this.f43428v = salesIQChat;
            this.f43429w = message;
            this.f43430x = preChatFormViewModel;
            this.f43431y = aVar;
            this.f43432z = list;
            this.f43419A = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.f43428v, this.f43429w, this.f43430x, this.f43431y, this.f43432z, this.f43419A, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((m) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x00e7, code lost:
        
            if (r0 == r8) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x02ec, code lost:
        
            if (r1.c(r2, r3, r5) == r8) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0182, code lost:
        
            if (r0 == r8) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0123, code lost:
        
            if (r0 == r8) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00fb, code lost:
        
            if (r0 == r8) goto L104;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Message message;
            Object a10;
            Object t10;
            Message message2;
            Object b10;
            Message message3;
            Object a11;
            C5582a c5582a;
            PreChatFormViewModel preChatFormViewModel;
            SalesIQChat salesIQChat;
            List list;
            Context context;
            C5582a.b c10;
            C5582a.b bVar;
            PreChatFormViewModel preChatFormViewModel2;
            PreChatFormViewModel preChatFormViewModel3;
            SalesIQChat salesIQChat2;
            Message message4;
            List list2;
            Context context2;
            Integer b11;
            SalesIQChat salesIQChat3;
            Message message5;
            List list3;
            Context context3;
            m mVar = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (mVar.f43427u) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    String deptid = mVar.f43428v.getDeptid();
                    if (deptid != null && deptid.length() != 0) {
                        message = mVar.f43429w;
                        if (message == null) {
                            yf.k getMessagesUseCase = mVar.f43430x.getGetMessagesUseCase();
                            String convID = mVar.f43428v.getConvID();
                            String chid = mVar.f43428v.getChid();
                            Message.g gVar = Message.g.Question;
                            mVar.f43427u = 1;
                            a10 = getMessagesUseCase.a(convID, chid, gVar, mVar);
                            break;
                        }
                        message2 = message;
                        if (message2 != null) {
                            yf.x s10 = mVar.f43430x.s();
                            mVar.f43420n = message2;
                            mVar.f43427u = 3;
                            b10 = yf.x.b(s10, message2, false, this, 2, null);
                            mVar = this;
                            break;
                        }
                        message3 = message2;
                        if (mVar.f43431y == Pe.a.Chat) {
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(mVar.f43428v);
                        }
                        Re.i leaveAsMissedConversation = mVar.f43430x.getLeaveAsMissedConversation();
                        String chid2 = mVar.f43428v.getChid();
                        Intrinsics.checkNotNullExpressionValue(chid2, "getChid(...)");
                        String convID2 = mVar.f43428v.getConvID();
                        Intrinsics.checkNotNullExpressionValue(convID2, "getConvID(...)");
                        String deptid2 = mVar.f43428v.getDeptid();
                        Intrinsics.checkNotNull(deptid2);
                        if ((message3 != null || (r4 = message3.getContent()) == null) && (r4 = mVar.f43428v.getQuestion()) == null) {
                            String question = "";
                        }
                        String n10 = C6218a.n();
                        Pe.a aVar = mVar.f43431y;
                        mVar.f43420n = message3;
                        mVar.f43427u = 4;
                        m mVar2 = mVar;
                        a11 = leaveAsMissedConversation.a(chid2, convID2, deptid2, question, n10, aVar, mVar2);
                        mVar = mVar2;
                        break;
                    } else {
                        return Unit.INSTANCE;
                    }
                case 1:
                    ResultKt.throwOnFailure(obj);
                    a10 = obj;
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ((C5582a) a10).b();
                    if (interfaceC5321f != null) {
                        mVar.f43427u = 2;
                        t10 = AbstractC5323h.t(interfaceC5321f, mVar);
                        break;
                    }
                    message2 = null;
                    if (message2 != null) {
                    }
                    message3 = message2;
                    if (mVar.f43431y == Pe.a.Chat) {
                    }
                    Re.i leaveAsMissedConversation2 = mVar.f43430x.getLeaveAsMissedConversation();
                    String chid22 = mVar.f43428v.getChid();
                    Intrinsics.checkNotNullExpressionValue(chid22, "getChid(...)");
                    String convID22 = mVar.f43428v.getConvID();
                    Intrinsics.checkNotNullExpressionValue(convID22, "getConvID(...)");
                    String deptid22 = mVar.f43428v.getDeptid();
                    Intrinsics.checkNotNull(deptid22);
                    if (message3 != null) {
                        break;
                    }
                    String question2 = "";
                    String n102 = C6218a.n();
                    Pe.a aVar2 = mVar.f43431y;
                    mVar.f43420n = message3;
                    mVar.f43427u = 4;
                    m mVar22 = mVar;
                    a11 = leaveAsMissedConversation2.a(chid22, convID22, deptid22, question2, n102, aVar2, mVar22);
                    mVar = mVar22;
                    break;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    t10 = obj;
                    List list4 = (List) t10;
                    if (list4 != null) {
                        message = (Message) CollectionsKt.firstOrNull(list4);
                        message2 = message;
                        if (message2 != null) {
                        }
                        message3 = message2;
                        if (mVar.f43431y == Pe.a.Chat) {
                        }
                        Re.i leaveAsMissedConversation22 = mVar.f43430x.getLeaveAsMissedConversation();
                        String chid222 = mVar.f43428v.getChid();
                        Intrinsics.checkNotNullExpressionValue(chid222, "getChid(...)");
                        String convID222 = mVar.f43428v.getConvID();
                        Intrinsics.checkNotNullExpressionValue(convID222, "getConvID(...)");
                        String deptid222 = mVar.f43428v.getDeptid();
                        Intrinsics.checkNotNull(deptid222);
                        if (message3 != null) {
                        }
                        String question22 = "";
                        String n1022 = C6218a.n();
                        Pe.a aVar22 = mVar.f43431y;
                        mVar.f43420n = message3;
                        mVar.f43427u = 4;
                        m mVar222 = mVar;
                        a11 = leaveAsMissedConversation22.a(chid222, convID222, deptid222, question22, n1022, aVar22, mVar222);
                        mVar = mVar222;
                        break;
                    }
                    message2 = null;
                    if (message2 != null) {
                    }
                    message3 = message2;
                    if (mVar.f43431y == Pe.a.Chat) {
                    }
                    Re.i leaveAsMissedConversation222 = mVar.f43430x.getLeaveAsMissedConversation();
                    String chid2222 = mVar.f43428v.getChid();
                    Intrinsics.checkNotNullExpressionValue(chid2222, "getChid(...)");
                    String convID2222 = mVar.f43428v.getConvID();
                    Intrinsics.checkNotNullExpressionValue(convID2222, "getConvID(...)");
                    String deptid2222 = mVar.f43428v.getDeptid();
                    Intrinsics.checkNotNull(deptid2222);
                    if (message3 != null) {
                    }
                    String question222 = "";
                    String n10222 = C6218a.n();
                    Pe.a aVar222 = mVar.f43431y;
                    mVar.f43420n = message3;
                    mVar.f43427u = 4;
                    m mVar2222 = mVar;
                    a11 = leaveAsMissedConversation222.a(chid2222, convID2222, deptid2222, question222, n10222, aVar222, mVar2222);
                    mVar = mVar2222;
                    break;
                case 3:
                    Message message6 = (Message) mVar.f43420n;
                    ResultKt.throwOnFailure(obj);
                    message2 = message6;
                    b10 = obj;
                    message3 = message2;
                    if (mVar.f43431y == Pe.a.Chat) {
                    }
                    Re.i leaveAsMissedConversation2222 = mVar.f43430x.getLeaveAsMissedConversation();
                    String chid22222 = mVar.f43428v.getChid();
                    Intrinsics.checkNotNullExpressionValue(chid22222, "getChid(...)");
                    String convID22222 = mVar.f43428v.getConvID();
                    Intrinsics.checkNotNullExpressionValue(convID22222, "getConvID(...)");
                    String deptid22222 = mVar.f43428v.getDeptid();
                    Intrinsics.checkNotNull(deptid22222);
                    if (message3 != null) {
                    }
                    String question2222 = "";
                    String n102222 = C6218a.n();
                    Pe.a aVar2222 = mVar.f43431y;
                    mVar.f43420n = message3;
                    mVar.f43427u = 4;
                    m mVar22222 = mVar;
                    a11 = leaveAsMissedConversation2222.a(chid22222, convID22222, deptid22222, question2222, n102222, aVar2222, mVar22222);
                    mVar = mVar22222;
                    break;
                case 4:
                    Message message7 = (Message) mVar.f43420n;
                    ResultKt.throwOnFailure(obj);
                    message3 = message7;
                    a11 = obj;
                    c5582a = (C5582a) a11;
                    SalesIQChat salesIQChat4 = mVar.f43428v;
                    PreChatFormViewModel preChatFormViewModel4 = mVar.f43430x;
                    Pe.a aVar3 = mVar.f43431y;
                    if (c5582a.d()) {
                        LeaveMessageResponse leaveMessageResponse = (LeaveMessageResponse) c5582a.b();
                        SalesIQChat chatFromConvID = LiveChatUtil.getChatFromConvID(salesIQChat4.getConvID());
                        LiveChatUtil.triggerChatListener("CHAT_MISSED", chatFromConvID);
                        preChatFormViewModel4._uiEvents.a(new a.d(chatFromConvID));
                        preChatFormViewModel4.sendRefreshBroadCast(leaveMessageResponse.getChatId(), salesIQChat4.getConvID(), false);
                        MobilistenUtil.A(aVar3 == Pe.a.Chat ? AbstractC6462a.b(C6822a.m()) : AbstractC6462a.a(C6822a.m()), 0, 2, null);
                    }
                    Pe.a aVar4 = mVar.f43431y;
                    preChatFormViewModel = mVar.f43430x;
                    salesIQChat = mVar.f43428v;
                    list = mVar.f43432z;
                    context = mVar.f43419A;
                    if (!c5582a.d()) {
                        c10 = c5582a.c();
                        Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                        Integer b12 = c10.b();
                        int a12 = C6247m.f64127d.a();
                        if (b12 == null || b12.intValue() != a12) {
                            Integer b13 = c10.b();
                            int a13 = C6248n.f64128d.a();
                            if (b13 == null || b13.intValue() != a13) {
                                EnumC4544a enumC4544a = aVar4 == Pe.a.Chat ? EnumC4544a.Offline : EnumC4544a.CallOffline;
                                String convID3 = salesIQChat.getConvID();
                                mVar.f43420n = c5582a;
                                mVar.f43421o = preChatFormViewModel;
                                mVar.f43422p = c10;
                                mVar.f43427u = 8;
                                if (preChatFormViewModel.t(enumC4544a, convID3, c10, mVar) != coroutine_suspended) {
                                    bVar = c10;
                                    preChatFormViewModel._uiEvents.a(new a.d(null));
                                    preChatFormViewModel._uiEvents.a(new a.e(AbstractC6235a.f64111c.a(bVar, AbstractC6235a.c.Conversations).b()));
                                }
                                return coroutine_suspended;
                            }
                        }
                        if (aVar4 != Pe.a.Chat) {
                            preChatFormViewModel2 = preChatFormViewModel;
                            C6888e q10 = preChatFormViewModel2.q();
                            String chid3 = salesIQChat.getChid();
                            Intrinsics.checkNotNullExpressionValue(chid3, "getChid(...)");
                            Message.g gVar2 = Message.g.Question;
                            mVar.f43420n = message3;
                            mVar.f43421o = c5582a;
                            mVar.f43422p = preChatFormViewModel2;
                            mVar.f43423q = salesIQChat;
                            mVar.f43424r = list;
                            mVar.f43425s = context;
                            mVar.f43426t = c10;
                            mVar.f43427u = 6;
                            break;
                        } else {
                            com.zoho.livechat.android.provider.a.INSTANCE.deleteConversation(preChatFormViewModel.getApplication().getContentResolver(), null, salesIQChat.getChid(), true, false);
                            Md.a aVar5 = Md.a.Chat;
                            boolean i10 = og.i.i(Boxing.boxBoolean(salesIQChat.isTriggeredChat()));
                            mVar.f43420n = message3;
                            mVar.f43421o = c5582a;
                            mVar.f43422p = preChatFormViewModel;
                            mVar.f43423q = salesIQChat;
                            mVar.f43424r = list;
                            mVar.f43425s = context;
                            mVar.f43426t = c10;
                            mVar.f43427u = 5;
                            if (PreChatFormViewModel.C(preChatFormViewModel, aVar5, null, i10, null, mVar, 8, null) != coroutine_suspended) {
                                preChatFormViewModel3 = preChatFormViewModel;
                                salesIQChat2 = salesIQChat;
                                message4 = message3;
                                list2 = list;
                                context2 = context;
                                bVar = c10;
                                b11 = bVar.b();
                                int a14 = C6248n.f64128d.a();
                                if (b11 != null && b11.intValue() == a14) {
                                    preChatFormViewModel3._uiEvents.a(a.C0625a.f43357a);
                                    return Unit.INSTANCE;
                                }
                                if (!preChatFormViewModel3.x(list2, EnumC4544a.Offline, EnumC4544a.Online)) {
                                    preChatFormViewModel3.w(context2, salesIQChat2, message4, list2);
                                    return Unit.INSTANCE;
                                }
                                preChatFormViewModel3._uiEvents.a(new a.d(null));
                                preChatFormViewModel = preChatFormViewModel3;
                                preChatFormViewModel._uiEvents.a(new a.d(null));
                                preChatFormViewModel._uiEvents.a(new a.e(AbstractC6235a.f64111c.a(bVar, AbstractC6235a.c.Conversations).b()));
                            }
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    bVar = (C5582a.b) mVar.f43426t;
                    context2 = (Context) mVar.f43425s;
                    list2 = (List) mVar.f43424r;
                    salesIQChat2 = (SalesIQChat) mVar.f43423q;
                    preChatFormViewModel3 = (PreChatFormViewModel) mVar.f43422p;
                    message4 = (Message) mVar.f43420n;
                    ResultKt.throwOnFailure(obj);
                    b11 = bVar.b();
                    int a142 = C6248n.f64128d.a();
                    if (b11 != null) {
                        preChatFormViewModel3._uiEvents.a(a.C0625a.f43357a);
                        return Unit.INSTANCE;
                    }
                    if (!preChatFormViewModel3.x(list2, EnumC4544a.Offline, EnumC4544a.Online)) {
                    }
                    break;
                case 6:
                    C5582a.b bVar2 = (C5582a.b) mVar.f43426t;
                    Context context4 = (Context) mVar.f43425s;
                    List list5 = (List) mVar.f43424r;
                    SalesIQChat salesIQChat5 = (SalesIQChat) mVar.f43423q;
                    PreChatFormViewModel preChatFormViewModel5 = (PreChatFormViewModel) mVar.f43422p;
                    c5582a = (C5582a) mVar.f43421o;
                    Message message8 = (Message) mVar.f43420n;
                    ResultKt.throwOnFailure(obj);
                    c10 = bVar2;
                    context = context4;
                    list = list5;
                    salesIQChat = salesIQChat5;
                    preChatFormViewModel2 = preChatFormViewModel5;
                    message3 = message8;
                    Md.a aVar6 = Md.a.Call;
                    mVar.f43420n = message3;
                    mVar.f43421o = c5582a;
                    mVar.f43422p = preChatFormViewModel2;
                    mVar.f43423q = salesIQChat;
                    mVar.f43424r = list;
                    mVar.f43425s = context;
                    mVar.f43426t = c10;
                    mVar.f43427u = 7;
                    if (PreChatFormViewModel.C(preChatFormViewModel2, aVar6, null, false, null, mVar, 8, null) != coroutine_suspended) {
                        preChatFormViewModel3 = preChatFormViewModel2;
                        salesIQChat3 = salesIQChat;
                        message5 = message3;
                        list3 = list;
                        context3 = context;
                        bVar = c10;
                        if (preChatFormViewModel3.x(list3, EnumC4544a.CallOffline, EnumC4544a.CallOnline) && message5 != null) {
                            preChatFormViewModel3._uiEvents.a(new a.h(context3, salesIQChat3, message5, list3));
                            return Unit.INSTANCE;
                        }
                        preChatFormViewModel = preChatFormViewModel3;
                        preChatFormViewModel._uiEvents.a(new a.d(null));
                        preChatFormViewModel._uiEvents.a(new a.e(AbstractC6235a.f64111c.a(bVar, AbstractC6235a.c.Conversations).b()));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                case 7:
                    bVar = (C5582a.b) mVar.f43426t;
                    context3 = (Context) mVar.f43425s;
                    list3 = (List) mVar.f43424r;
                    salesIQChat3 = (SalesIQChat) mVar.f43423q;
                    preChatFormViewModel3 = (PreChatFormViewModel) mVar.f43422p;
                    message5 = (Message) mVar.f43420n;
                    ResultKt.throwOnFailure(obj);
                    if (preChatFormViewModel3.x(list3, EnumC4544a.CallOffline, EnumC4544a.CallOnline)) {
                        preChatFormViewModel3._uiEvents.a(new a.h(context3, salesIQChat3, message5, list3));
                        return Unit.INSTANCE;
                    }
                    preChatFormViewModel = preChatFormViewModel3;
                    preChatFormViewModel._uiEvents.a(new a.d(null));
                    preChatFormViewModel._uiEvents.a(new a.e(AbstractC6235a.f64111c.a(bVar, AbstractC6235a.c.Conversations).b()));
                    return Unit.INSTANCE;
                case 8:
                    bVar = (C5582a.b) mVar.f43422p;
                    preChatFormViewModel = (PreChatFormViewModel) mVar.f43421o;
                    ResultKt.throwOnFailure(obj);
                    preChatFormViewModel._uiEvents.a(new a.d(null));
                    preChatFormViewModel._uiEvents.a(new a.e(AbstractC6235a.f64111c.a(bVar, AbstractC6235a.c.Conversations).b()));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            return C6550a.f66357j.a(PreChatFormViewModel.this.getApplication());
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43434n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2193s f43435o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ PreChatFormViewModel f43436p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function1 f43437q;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f43438n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ PreChatFormViewModel f43439o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Function1 f43440p;

            /* renamed from: com.zoho.livechat.android.modules.conversations.ui.viewmodels.PreChatFormViewModel$o$a$a, reason: collision with other inner class name */
            public static final class C0626a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function1 f43441a;

                public C0626a(Function1 function1) {
                    this.f43441a = function1;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(a aVar, Continuation continuation) {
                    this.f43441a.invoke(aVar);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PreChatFormViewModel preChatFormViewModel, Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f43439o = preChatFormViewModel;
                this.f43440p = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f43439o, this.f43440p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f43438n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C uiEvents = this.f43439o.getUiEvents();
                    C0626a c0626a = new C0626a(this.f43440p);
                    this.f43438n = 1;
                    if (uiEvents.collect(c0626a, this) == coroutine_suspended) {
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
        public o(InterfaceC2193s interfaceC2193s, PreChatFormViewModel preChatFormViewModel, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f43435o = interfaceC2193s;
            this.f43436p = preChatFormViewModel;
            this.f43437q = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f43435o, this.f43436p, this.f43437q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43434n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC2193s interfaceC2193s = this.f43435o;
                AbstractC2185j.b bVar = AbstractC2185j.b.f20393d;
                a aVar = new a(this.f43436p, this.f43437q, null);
                this.f43434n = 1;
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

    public static final class p extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43442n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f43443o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f43444p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message f43445q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PreChatFormViewModel f43446r;

        public static final class a implements InterfaceC6064a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ P f43447a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalesIQChat f43448b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PreChatFormViewModel f43449c;

            /* renamed from: com.zoho.livechat.android.modules.conversations.ui.viewmodels.PreChatFormViewModel$p$a$a, reason: collision with other inner class name */
            public static final class C0627a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f43450n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ int f43451o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ PreChatFormViewModel f43452p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ SalesIQChat f43453q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f43454r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0627a(int i10, PreChatFormViewModel preChatFormViewModel, SalesIQChat salesIQChat, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f43451o = i10;
                    this.f43452p = preChatFormViewModel;
                    this.f43453q = salesIQChat;
                    this.f43454r = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0627a(this.f43451o, this.f43452p, this.f43453q, this.f43454r, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0627a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
                
                    if (r13.q0(r1, r3, r12) == r0) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
                
                    if (com.zoho.livechat.android.modules.conversations.ui.viewmodels.PreChatFormViewModel.C(r4, r5, null, r7, null, r9, 8, null) == r0) goto L34;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    C0627a c0627a;
                    String convID;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f43450n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.f43451o == C6248n.f64128d.a()) {
                            PreChatFormViewModel preChatFormViewModel = this.f43452p;
                            Md.a aVar = Md.a.Chat;
                            boolean isTriggeredChat = this.f43453q.isTriggeredChat();
                            this.f43450n = 1;
                            c0627a = this;
                        } else {
                            c0627a = this;
                            convID = c0627a.f43453q.getConvID();
                            if (convID == null && (convID = c0627a.f43453q.getChid()) == null) {
                                convID = "";
                            }
                            if (convID.length() != 0) {
                                return Unit.INSTANCE;
                            }
                            Te.a aVar2 = Te.a.f11572a;
                            String convID2 = c0627a.f43453q.getConvID();
                            String str = (convID2 == null && (convID2 = c0627a.f43453q.getChid()) == null) ? "" : convID2;
                            we.e a10 = we.e.f67680b.a(new d.b(c0627a.f43451o, c0627a.f43454r));
                            c0627a.f43450n = 2;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            c0627a = this;
                            c0627a.f43452p._uiEvents.a(new a.f(false, null, null, 4, null));
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        c0627a = this;
                    }
                    c0627a.f43452p._uiEvents.a(a.g.f43367a);
                    convID = c0627a.f43453q.getConvID();
                    if (convID == null) {
                        convID = "";
                    }
                    if (convID.length() != 0) {
                    }
                }
            }

            public static final class b extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public Object f43455n;

                /* renamed from: o, reason: collision with root package name */
                public int f43456o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ SalesIQChat f43457p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ PreChatFormViewModel f43458q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SalesIQChat salesIQChat, PreChatFormViewModel preChatFormViewModel, Continuation continuation) {
                    super(2, continuation);
                    this.f43457p = salesIQChat;
                    this.f43458q = preChatFormViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new b(this.f43457p, this.f43458q, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    SalesIQChat salesIQChat;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f43456o;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        SalesIQChat chatWithAnyId = LiveChatUtil.getChatWithAnyId(this.f43457p.getConvID());
                        Te.a aVar = Te.a.f11572a;
                        String convID = this.f43457p.getConvID();
                        if (convID == null && (convID = this.f43457p.getChid()) == null) {
                            convID = "";
                        }
                        we.e b10 = chatWithAnyId != null ? we.e.f67680b.b(chatWithAnyId) : we.e.f67680b.a(we.d.f67623E);
                        this.f43455n = chatWithAnyId;
                        this.f43456o = 1;
                        if (aVar.q0(convID, b10, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        salesIQChat = chatWithAnyId;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SalesIQChat salesIQChat2 = (SalesIQChat) this.f43455n;
                        ResultKt.throwOnFailure(obj);
                        salesIQChat = salesIQChat2;
                    }
                    this.f43458q._uiEvents.a(new a.f(true, salesIQChat, null, 4, null));
                    return Unit.INSTANCE;
                }
            }

            public a(P p10, SalesIQChat salesIQChat, PreChatFormViewModel preChatFormViewModel) {
                this.f43447a = p10;
                this.f43448b = salesIQChat;
                this.f43449c = preChatFormViewModel;
            }

            @Override // pd.InterfaceC6064a
            public void a(String str, int i10, String str2) {
                AbstractC1459k.d(this.f43447a, null, null, new C0627a(i10, this.f43449c, this.f43448b, str2, null), 3, null);
            }

            @Override // pd.InterfaceC6064a
            public void onComplete() {
            }

            @Override // pd.InterfaceC6064a
            public void onSuccess() {
                AbstractC1459k.d(this.f43447a, null, null, new b(this.f43448b, this.f43449c, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(SalesIQChat salesIQChat, Message message, PreChatFormViewModel preChatFormViewModel, Continuation continuation) {
            super(2, continuation);
            this.f43444p = salesIQChat;
            this.f43445q = message;
            this.f43446r = preChatFormViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            p pVar = new p(this.f43444p, this.f43445q, this.f43446r, continuation);
            pVar.f43443o = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((p) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f43442n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            P p10 = (P) this.f43443o;
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(this.f43444p);
            new pd.s(this.f43445q.getContent(), this.f43444p.getVisitorid(), this.f43445q.getId(), this.f43444p.getChid(), new a(p10, this.f43444p, this.f43446r)).run();
            return Unit.INSTANCE;
        }
    }

    public static final class q extends Lambda implements Function0 {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.m invoke() {
            return new Re.m(PreChatFormViewModel.this.getConversationsRepository());
        }
    }

    public static final class r extends Lambda implements Function0 {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.g invoke() {
            return new Od.g(PreChatFormViewModel.this.getBrandRepository());
        }
    }

    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.h invoke() {
            return new Od.h(PreChatFormViewModel.this.getBrandRepository());
        }
    }

    public static final class t extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f43462n;

        /* renamed from: o, reason: collision with root package name */
        public Object f43463o;

        /* renamed from: p, reason: collision with root package name */
        public Object f43464p;

        /* renamed from: q, reason: collision with root package name */
        public Object f43465q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f43466r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f43467s;

        /* renamed from: u, reason: collision with root package name */
        public int f43469u;

        public t(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43467s = obj;
            this.f43469u |= Integer.MIN_VALUE;
            return PreChatFormViewModel.this.B(null, null, false, null, this);
        }
    }

    public static final class u extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43470n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Md.a f43472p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ EnumC4544a f43473q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Md.a aVar, EnumC4544a enumC4544a, Continuation continuation) {
            super(2, continuation);
            this.f43472p = aVar;
            this.f43473q = enumC4544a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PreChatFormViewModel.this.new u(this.f43472p, this.f43473q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((u) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u uVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43470n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PreChatFormViewModel preChatFormViewModel = PreChatFormViewModel.this;
                Md.a aVar = this.f43472p;
                EnumC4544a enumC4544a = this.f43473q;
                this.f43470n = 1;
                uVar = this;
                obj = PreChatFormViewModel.C(preChatFormViewModel, aVar, enumC4544a, false, null, uVar, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                uVar = this;
            }
            PreChatFormViewModel.this._uiEvents.a(new a.i(((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class v extends Lambda implements Function0 {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.x invoke() {
            return new yf.x(PreChatFormViewModel.this.getMessagesRepository());
        }
    }

    public PreChatFormViewModel() {
        x b10 = E.b(0, 16, null, 5, null);
        this._uiEvents = b10;
        this.uiEvents = AbstractC5323h.a(b10);
        this.conversationsRepository = LazyKt.lazy(new d());
        this.messagesRepository = LazyKt.lazy(new n());
        this.brandRepository = LazyKt.lazy(new b());
        this.syncBrandStatusUseCase = LazyKt.lazy(new r());
        this.syncFormUseCase = LazyKt.lazy(new s());
        this.clearFormUseCase = LazyKt.lazy(new c());
        this.deleteMessagesUseCase = LazyKt.lazy(new e());
        this.startNewConversationUseCase = LazyKt.lazy(new q());
        this.leaveAsMissedConversation = LazyKt.lazy(new l());
        this.syncMessageUseCase = LazyKt.lazy(new v());
        this.getMessagesUseCase = LazyKt.lazy(new f());
    }

    public static /* synthetic */ Object C(PreChatFormViewModel preChatFormViewModel, Md.a aVar, EnumC4544a enumC4544a, boolean z10, List list, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC4544a = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return preChatFormViewModel.B(aVar, enumC4544a, z10, list, continuation);
    }

    private final P getAppScope() {
        return C6461a.f65810a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application getApplication() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Kd.a getBrandRepository() {
        return (Kd.a) this.brandRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ke.a getConversationsRepository() {
        return (Ke.a) this.conversationsRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6550a getMessagesRepository() {
        return (C6550a) this.messagesRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6888e q() {
        return (C6888e) this.deleteMessagesUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Re.m r() {
        return (Re.m) this.startNewConversationUseCase.getValue();
    }

    public final void A(SalesIQChat salesIQChat, Message message) {
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(getAppScope(), null, null, new p(salesIQChat, message, this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(Md.a aVar, EnumC4544a enumC4544a, boolean z10, List list, Continuation continuation) {
        t tVar;
        int i10;
        PreChatFormViewModel preChatFormViewModel;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i11 = tVar.f43469u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f43469u = i11 - Integer.MIN_VALUE;
                Object obj = tVar.f43467s;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = tVar.f43469u;
                boolean z11 = true;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (aVar != null) {
                        tVar.f43462n = this;
                        tVar.f43463o = aVar;
                        tVar.f43464p = enumC4544a;
                        tVar.f43465q = list;
                        tVar.f43466r = z10;
                        tVar.f43469u = 1;
                        obj = getSyncBrandStatusUseCase().b(new Md.a[]{aVar}, tVar);
                        if (obj != coroutine_suspended) {
                            preChatFormViewModel = this;
                        }
                        return coroutine_suspended;
                    }
                    preChatFormViewModel = this;
                    if (enumC4544a == null) {
                        enumC4544a = com.zoho.livechat.android.modules.brand.ui.helpers.a.r(aVar == Md.a.Call, z10, list);
                    }
                    if (!C6822a.C(enumC4544a)) {
                        Od.h syncFormUseCase = preChatFormViewModel.getSyncFormUseCase();
                        boolean z12 = !LiveChatUtil.isFormContextStarted();
                        tVar.f43462n = null;
                        tVar.f43463o = null;
                        tVar.f43464p = null;
                        tVar.f43465q = null;
                        tVar.f43469u = 2;
                        obj = syncFormUseCase.a(z12, null, enumC4544a, tVar);
                    }
                    return Boxing.boxBoolean(z11);
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    z11 = ((C5582a) obj).d();
                    return Boxing.boxBoolean(z11);
                }
                z10 = tVar.f43466r;
                list = (List) tVar.f43465q;
                enumC4544a = (EnumC4544a) tVar.f43464p;
                aVar = (Md.a) tVar.f43463o;
                preChatFormViewModel = (PreChatFormViewModel) tVar.f43462n;
                ResultKt.throwOnFailure(obj);
                if (enumC4544a == null) {
                }
                if (!C6822a.C(enumC4544a)) {
                }
                return Boxing.boxBoolean(z11);
            }
        }
        tVar = new t(continuation);
        Object obj2 = tVar.f43467s;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = tVar.f43469u;
        boolean z112 = true;
        if (i10 != 0) {
        }
        if (enumC4544a == null) {
        }
        if (!C6822a.C(enumC4544a)) {
        }
        return Boxing.boxBoolean(z112);
    }

    public final void D(Md.a brandComponent, EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        AbstractC1459k.d(getAppScope(), null, null, new u(brandComponent, appStatus, null), 3, null);
    }

    public final Od.a getClearFormUseCase() {
        return (Od.a) this.clearFormUseCase.getValue();
    }

    public final yf.k getGetMessagesUseCase() {
        return (yf.k) this.getMessagesUseCase.getValue();
    }

    public final Re.i getLeaveAsMissedConversation() {
        return (Re.i) this.leaveAsMissedConversation.getValue();
    }

    public final Od.g getSyncBrandStatusUseCase() {
        return (Od.g) this.syncBrandStatusUseCase.getValue();
    }

    public final Od.h getSyncFormUseCase() {
        return (Od.h) this.syncFormUseCase.getValue();
    }

    public final C getUiEvents() {
        return this.uiEvents;
    }

    public final yf.x s() {
        return (yf.x) this.syncMessageUseCase.getValue();
    }

    public final void sendRefreshBroadCast(String chatId, String acknowledgementKey, boolean addStartTimer) {
        if (chatId == null && acknowledgementKey == null) {
            return;
        }
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        C1908a b10 = C1908a.b(e10);
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "refreshchat");
        if (chatId != null) {
            intent.putExtra("chid", chatId);
        }
        if (acknowledgementKey != null) {
            intent.putExtra("conversation_id", acknowledgementKey);
        }
        if ((addStartTimer ? intent : null) != null) {
            intent.putExtra("StartWaitingTimer", true);
        }
        b10.d(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(EnumC4544a enumC4544a, String str, C5582a.b bVar, Continuation continuation) {
        g gVar;
        int i10;
        AbstractC6235a abstractC6235a;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f43381q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f43381q = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f43379o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f43381q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC6235a a10 = AbstractC6235a.f64111c.a(bVar, AbstractC6235a.c.Conversations);
                    if (!(a10 instanceof C6249o) && !(a10 instanceof C6244j) && !(a10 instanceof C6251q)) {
                        if (enumC4544a == EnumC4544a.CallOnline || enumC4544a == EnumC4544a.CallOffline) {
                            Ud.b.f12184a.c(new AbstractC6744a.C0960a(bVar.c()));
                        } else {
                            LiveChatUtil.triggerChatListener("CHAT_ERROR", LiveChatUtil.getChatFromConvID(str), new b.a(bVar.c()));
                        }
                        return Unit.INSTANCE;
                    }
                    getClearFormUseCase().b(enumC4544a);
                    Od.h syncFormUseCase = getSyncFormUseCase();
                    boolean z10 = !LiveChatUtil.isFormContextStarted();
                    gVar.f43378n = a10;
                    gVar.f43381q = 1;
                    if (syncFormUseCase.a(z10, null, enumC4544a, gVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    abstractC6235a = a10;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC6235a = (AbstractC6235a) gVar.f43378n;
                    ResultKt.throwOnFailure(obj);
                }
                MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                return Unit.INSTANCE;
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f43379o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f43381q;
        if (i10 != 0) {
        }
        MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(P p10, SalesIQChat salesIQChat, Message message, List list, Context context, Continuation continuation) {
        i iVar;
        i iVar2;
        PreChatFormViewModel preChatFormViewModel;
        P p11;
        Message message2;
        List list2;
        Context context2;
        Object j02;
        SalesIQChat salesIQChat2;
        PreChatFormViewModel preChatFormViewModel2;
        we.e eVar;
        P p12;
        we.e eVar2;
        Message message3;
        List list3;
        Context context3;
        String str;
        Object b10;
        Context context4;
        we.e eVar3;
        List list4;
        SalesIQChat salesIQChat3;
        P p13;
        Message message4;
        PreChatFormViewModel preChatFormViewModel3;
        C5582a c5582a;
        AbstractC6235a abstractC6235a;
        P p14;
        PreChatFormViewModel preChatFormViewModel4;
        Message message5;
        List list5;
        C5582a.b bVar;
        C5582a c5582a2;
        AbstractC6235a abstractC6235a2;
        C6888e q10;
        String chid;
        Message.g gVar;
        we.e eVar4;
        PreChatFormViewModel preChatFormViewModel5;
        Context context5;
        List list6;
        Message message6;
        PreChatFormViewModel preChatFormViewModel6;
        SalesIQChat salesIQChat4;
        we.e eVar5;
        Context context6;
        List list7;
        Message message7;
        SalesIQChat salesIQChat5;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i10 = iVar.f43401z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f43401z = i10 - Integer.MIN_VALUE;
                iVar2 = iVar;
                Object obj = iVar2.f43399x;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (iVar2.f43401z) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        String deptid = salesIQChat.getDeptid();
                        if (deptid == null || deptid.length() == 0) {
                            C6888e q11 = q();
                            String chid2 = salesIQChat.getChid();
                            Intrinsics.checkNotNullExpressionValue(chid2, "getChid(...)");
                            Message.g gVar2 = Message.g.Question;
                            iVar2.f43389n = this;
                            iVar2.f43401z = 1;
                            if (q11.c(chid2, gVar2, iVar2) != coroutine_suspended) {
                                preChatFormViewModel = this;
                                preChatFormViewModel._uiEvents.a(new a.b(null));
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }
                        Td.e eVar6 = Td.e.f11456a;
                        Application application = getApplication();
                        iVar2.f43389n = this;
                        p11 = p10;
                        iVar2.f43390o = p11;
                        iVar2.f43391p = salesIQChat;
                        message2 = message;
                        iVar2.f43392q = message2;
                        list2 = list;
                        iVar2.f43393r = list2;
                        context2 = context;
                        iVar2.f43394s = context2;
                        iVar2.f43401z = 2;
                        j02 = Td.e.j0(eVar6, application, salesIQChat, true, false, iVar2, 8, null);
                        if (j02 != coroutine_suspended) {
                            salesIQChat2 = salesIQChat;
                            preChatFormViewModel2 = this;
                            eVar = (we.e) j02;
                            if (eVar.d()) {
                                android.support.v4.media.session.b.a(eVar.b());
                                yf.x s10 = preChatFormViewModel2.s();
                                iVar2.f43389n = preChatFormViewModel2;
                                iVar2.f43390o = p11;
                                iVar2.f43391p = salesIQChat2;
                                iVar2.f43392q = message2;
                                iVar2.f43393r = list2;
                                iVar2.f43394s = context2;
                                iVar2.f43395t = eVar;
                                iVar2.f43396u = null;
                                iVar2.f43401z = 3;
                                if (yf.x.b(s10, message2, false, iVar2, 2, null) != coroutine_suspended) {
                                    p12 = p11;
                                    eVar2 = eVar;
                                    message3 = message2;
                                    list3 = list2;
                                    context3 = context2;
                                    Re.m r10 = preChatFormViewModel2.r();
                                    String convID = salesIQChat2.getConvID();
                                    Intrinsics.checkNotNullExpressionValue(convID, "getConvID(...)");
                                    String deptid2 = salesIQChat2.getDeptid();
                                    Intrinsics.checkNotNull(deptid2);
                                    Pe.a aVar = Pe.a.Audio;
                                    String n10 = C6218a.n();
                                    iVar2.f43389n = preChatFormViewModel2;
                                    iVar2.f43390o = p12;
                                    iVar2.f43391p = salesIQChat2;
                                    iVar2.f43392q = message3;
                                    iVar2.f43393r = list3;
                                    iVar2.f43394s = context3;
                                    iVar2.f43395t = eVar2;
                                    iVar2.f43396u = null;
                                    iVar2.f43401z = 4;
                                    Message message8 = message3;
                                    PreChatFormViewModel preChatFormViewModel7 = preChatFormViewModel2;
                                    Context context7 = context3;
                                    List list8 = list3;
                                    SalesIQChat salesIQChat6 = salesIQChat2;
                                    P p15 = p12;
                                    we.e eVar7 = eVar2;
                                    str = "getChid(...)";
                                    b10 = Re.m.b(r10, convID, null, deptid2, aVar, false, false, null, null, n10, null, null, null, iVar2, 2560, null);
                                    iVar2 = iVar2;
                                    if (b10 != coroutine_suspended) {
                                        context4 = context7;
                                        eVar3 = eVar7;
                                        list4 = list8;
                                        salesIQChat3 = salesIQChat6;
                                        p13 = p15;
                                        message4 = message8;
                                        preChatFormViewModel3 = preChatFormViewModel7;
                                        c5582a = (C5582a) b10;
                                        if (c5582a.d()) {
                                            preChatFormViewModel3._uiEvents.a(new a.b(LiveChatUtil.getChatFromConvID(salesIQChat3.getConvID())));
                                        }
                                        AbstractC6235a.c cVar = AbstractC6235a.c.Conversations;
                                        if (c5582a.d()) {
                                            C5582a.b c10 = c5582a.c();
                                            if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                                                abstractC6235a = AbstractC6235a.b.f64114d;
                                            }
                                            C5582a.b c11 = c5582a.c();
                                            Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                                            Td.e eVar8 = Td.e.f11456a;
                                            String string = preChatFormViewModel3.getApplication().getString(abstractC6235a.b());
                                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                            iVar2.f43389n = preChatFormViewModel3;
                                            iVar2.f43390o = p13;
                                            iVar2.f43391p = salesIQChat3;
                                            iVar2.f43392q = message4;
                                            iVar2.f43393r = list4;
                                            iVar2.f43394s = context4;
                                            iVar2.f43395t = eVar3;
                                            iVar2.f43396u = c5582a;
                                            iVar2.f43397v = c11;
                                            iVar2.f43398w = abstractC6235a;
                                            iVar2.f43401z = 5;
                                            if (eVar8.S0(string, iVar2) != coroutine_suspended) {
                                                p14 = p13;
                                                preChatFormViewModel4 = preChatFormViewModel3;
                                                message5 = message4;
                                                list5 = list4;
                                                bVar = c11;
                                                c5582a2 = c5582a;
                                                abstractC6235a2 = abstractC6235a;
                                                q10 = preChatFormViewModel4.q();
                                                chid = salesIQChat3.getChid();
                                                Intrinsics.checkNotNullExpressionValue(chid, str);
                                                gVar = Message.g.Question;
                                                iVar2.f43389n = preChatFormViewModel4;
                                                iVar2.f43390o = p14;
                                                iVar2.f43391p = salesIQChat3;
                                                iVar2.f43392q = message5;
                                                iVar2.f43393r = list5;
                                                iVar2.f43394s = context4;
                                                iVar2.f43395t = eVar3;
                                                iVar2.f43396u = c5582a2;
                                                iVar2.f43397v = bVar;
                                                iVar2.f43398w = abstractC6235a2;
                                                iVar2.f43401z = 6;
                                                if (q10.c(chid, gVar, iVar2) != coroutine_suspended) {
                                                    eVar4 = eVar3;
                                                    preChatFormViewModel5 = preChatFormViewModel4;
                                                    context5 = context4;
                                                    list6 = list5;
                                                    message6 = message5;
                                                    if (Intrinsics.areEqual(abstractC6235a2, C6239e.f64119d)) {
                                                        preChatFormViewModel6 = preChatFormViewModel5;
                                                        EnumC4544a enumC4544a = EnumC4544a.CallOnline;
                                                        String convID2 = salesIQChat3.getConvID();
                                                        iVar2.f43389n = preChatFormViewModel6;
                                                        iVar2.f43390o = eVar4;
                                                        iVar2.f43391p = c5582a2;
                                                        salesIQChat4 = null;
                                                        iVar2.f43392q = null;
                                                        iVar2.f43393r = null;
                                                        iVar2.f43394s = null;
                                                        iVar2.f43395t = null;
                                                        iVar2.f43396u = null;
                                                        iVar2.f43397v = null;
                                                        iVar2.f43398w = null;
                                                        iVar2.f43401z = 8;
                                                        if (preChatFormViewModel6.t(enumC4544a, convID2, bVar, iVar2) != coroutine_suspended) {
                                                            eVar5 = eVar4;
                                                            preChatFormViewModel6._uiEvents.a(new a.b(salesIQChat4));
                                                            preChatFormViewModel2 = preChatFormViewModel6;
                                                            eVar = eVar5;
                                                        }
                                                    } else {
                                                        AbstractC1459k.d(p14, null, null, new j(null), 3, null);
                                                        Md.a aVar2 = Md.a.Call;
                                                        iVar2.f43389n = preChatFormViewModel5;
                                                        iVar2.f43390o = salesIQChat3;
                                                        iVar2.f43391p = message6;
                                                        iVar2.f43392q = list6;
                                                        iVar2.f43393r = context5;
                                                        iVar2.f43394s = eVar4;
                                                        iVar2.f43395t = c5582a2;
                                                        iVar2.f43396u = null;
                                                        iVar2.f43397v = null;
                                                        iVar2.f43398w = null;
                                                        iVar2.f43401z = 7;
                                                        preChatFormViewModel6 = preChatFormViewModel5;
                                                        if (C(preChatFormViewModel6, aVar2, null, false, null, iVar2, 8, null) != coroutine_suspended) {
                                                            eVar5 = eVar4;
                                                            context6 = context5;
                                                            list7 = list6;
                                                            message7 = message6;
                                                            salesIQChat5 = salesIQChat3;
                                                            if (!preChatFormViewModel6.x(list7, EnumC4544a.CallOnline, EnumC4544a.CallOffline)) {
                                                                preChatFormViewModel6.y(context6, salesIQChat5, message7, list7, Pe.a.Audio);
                                                                return Unit.INSTANCE;
                                                            }
                                                            salesIQChat4 = null;
                                                            preChatFormViewModel6._uiEvents.a(new a.b(salesIQChat4));
                                                            preChatFormViewModel2 = preChatFormViewModel6;
                                                            eVar = eVar5;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            eVar = eVar3;
                                            preChatFormViewModel2 = preChatFormViewModel3;
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            if (!eVar.d()) {
                                Intrinsics.checkNotNull(eVar.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.ui.result.entities.SalesIQError");
                                preChatFormViewModel2._uiEvents.a(new a.b(null));
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    case 1:
                        preChatFormViewModel = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        preChatFormViewModel._uiEvents.a(new a.b(null));
                        return Unit.INSTANCE;
                    case 2:
                        Context context8 = (Context) iVar2.f43394s;
                        List list9 = (List) iVar2.f43393r;
                        Message message9 = (Message) iVar2.f43392q;
                        salesIQChat2 = (SalesIQChat) iVar2.f43391p;
                        P p16 = (P) iVar2.f43390o;
                        preChatFormViewModel2 = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        context2 = context8;
                        list2 = list9;
                        message2 = message9;
                        j02 = obj;
                        p11 = p16;
                        eVar = (we.e) j02;
                        if (eVar.d()) {
                        }
                        if (!eVar.d()) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        android.support.v4.media.session.b.a(iVar2.f43396u);
                        we.e eVar9 = (we.e) iVar2.f43395t;
                        Context context9 = (Context) iVar2.f43394s;
                        List list10 = (List) iVar2.f43393r;
                        Message message10 = (Message) iVar2.f43392q;
                        SalesIQChat salesIQChat7 = (SalesIQChat) iVar2.f43391p;
                        P p17 = (P) iVar2.f43390o;
                        PreChatFormViewModel preChatFormViewModel8 = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        eVar2 = eVar9;
                        context3 = context9;
                        list3 = list10;
                        message3 = message10;
                        salesIQChat2 = salesIQChat7;
                        p12 = p17;
                        preChatFormViewModel2 = preChatFormViewModel8;
                        Re.m r102 = preChatFormViewModel2.r();
                        String convID3 = salesIQChat2.getConvID();
                        Intrinsics.checkNotNullExpressionValue(convID3, "getConvID(...)");
                        String deptid22 = salesIQChat2.getDeptid();
                        Intrinsics.checkNotNull(deptid22);
                        Pe.a aVar3 = Pe.a.Audio;
                        String n102 = C6218a.n();
                        iVar2.f43389n = preChatFormViewModel2;
                        iVar2.f43390o = p12;
                        iVar2.f43391p = salesIQChat2;
                        iVar2.f43392q = message3;
                        iVar2.f43393r = list3;
                        iVar2.f43394s = context3;
                        iVar2.f43395t = eVar2;
                        iVar2.f43396u = null;
                        iVar2.f43401z = 4;
                        Message message82 = message3;
                        PreChatFormViewModel preChatFormViewModel72 = preChatFormViewModel2;
                        Context context72 = context3;
                        List list82 = list3;
                        SalesIQChat salesIQChat62 = salesIQChat2;
                        P p152 = p12;
                        we.e eVar72 = eVar2;
                        str = "getChid(...)";
                        b10 = Re.m.b(r102, convID3, null, deptid22, aVar3, false, false, null, null, n102, null, null, null, iVar2, 2560, null);
                        iVar2 = iVar2;
                        if (b10 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        we.e eVar10 = (we.e) iVar2.f43395t;
                        Context context10 = (Context) iVar2.f43394s;
                        list4 = (List) iVar2.f43393r;
                        Message message11 = (Message) iVar2.f43392q;
                        SalesIQChat salesIQChat8 = (SalesIQChat) iVar2.f43391p;
                        p13 = (P) iVar2.f43390o;
                        preChatFormViewModel3 = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        salesIQChat3 = salesIQChat8;
                        context4 = context10;
                        message4 = message11;
                        eVar3 = eVar10;
                        b10 = obj;
                        str = "getChid(...)";
                        c5582a = (C5582a) b10;
                        if (c5582a.d()) {
                        }
                        AbstractC6235a.c cVar2 = AbstractC6235a.c.Conversations;
                        if (c5582a.d()) {
                        }
                        break;
                    case 5:
                        abstractC6235a2 = (AbstractC6235a) iVar2.f43398w;
                        bVar = (C5582a.b) iVar2.f43397v;
                        c5582a2 = (C5582a) iVar2.f43396u;
                        eVar3 = (we.e) iVar2.f43395t;
                        context4 = (Context) iVar2.f43394s;
                        list5 = (List) iVar2.f43393r;
                        message5 = (Message) iVar2.f43392q;
                        salesIQChat3 = (SalesIQChat) iVar2.f43391p;
                        p14 = (P) iVar2.f43390o;
                        preChatFormViewModel4 = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        str = "getChid(...)";
                        q10 = preChatFormViewModel4.q();
                        chid = salesIQChat3.getChid();
                        Intrinsics.checkNotNullExpressionValue(chid, str);
                        gVar = Message.g.Question;
                        iVar2.f43389n = preChatFormViewModel4;
                        iVar2.f43390o = p14;
                        iVar2.f43391p = salesIQChat3;
                        iVar2.f43392q = message5;
                        iVar2.f43393r = list5;
                        iVar2.f43394s = context4;
                        iVar2.f43395t = eVar3;
                        iVar2.f43396u = c5582a2;
                        iVar2.f43397v = bVar;
                        iVar2.f43398w = abstractC6235a2;
                        iVar2.f43401z = 6;
                        if (q10.c(chid, gVar, iVar2) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 6:
                        abstractC6235a2 = (AbstractC6235a) iVar2.f43398w;
                        bVar = (C5582a.b) iVar2.f43397v;
                        c5582a2 = (C5582a) iVar2.f43396u;
                        we.e eVar11 = (we.e) iVar2.f43395t;
                        Context context11 = (Context) iVar2.f43394s;
                        List list11 = (List) iVar2.f43393r;
                        Message message12 = (Message) iVar2.f43392q;
                        SalesIQChat salesIQChat9 = (SalesIQChat) iVar2.f43391p;
                        P p18 = (P) iVar2.f43390o;
                        PreChatFormViewModel preChatFormViewModel9 = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        eVar4 = eVar11;
                        preChatFormViewModel5 = preChatFormViewModel9;
                        p14 = p18;
                        salesIQChat3 = salesIQChat9;
                        context5 = context11;
                        message6 = message12;
                        list6 = list11;
                        if (Intrinsics.areEqual(abstractC6235a2, C6239e.f64119d)) {
                        }
                        return coroutine_suspended;
                    case 7:
                        eVar5 = (we.e) iVar2.f43394s;
                        Context context12 = (Context) iVar2.f43393r;
                        List list12 = (List) iVar2.f43392q;
                        Message message13 = (Message) iVar2.f43391p;
                        SalesIQChat salesIQChat10 = (SalesIQChat) iVar2.f43390o;
                        PreChatFormViewModel preChatFormViewModel10 = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        context6 = context12;
                        preChatFormViewModel6 = preChatFormViewModel10;
                        list7 = list12;
                        message7 = message13;
                        salesIQChat5 = salesIQChat10;
                        if (!preChatFormViewModel6.x(list7, EnumC4544a.CallOnline, EnumC4544a.CallOffline)) {
                        }
                        break;
                    case 8:
                        eVar5 = (we.e) iVar2.f43390o;
                        preChatFormViewModel6 = (PreChatFormViewModel) iVar2.f43389n;
                        ResultKt.throwOnFailure(obj);
                        salesIQChat4 = null;
                        preChatFormViewModel6._uiEvents.a(new a.b(salesIQChat4));
                        preChatFormViewModel2 = preChatFormViewModel6;
                        eVar = eVar5;
                        if (!eVar.d()) {
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        iVar = new i(continuation);
        iVar2 = iVar;
        Object obj2 = iVar2.f43399x;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (iVar2.f43401z) {
        }
    }

    public final void v(Context context, SalesIQChat salesIQChat, Message message, List providedFields) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(providedFields, "providedFields");
        AbstractC1459k.d(getAppScope(), null, null, new h(salesIQChat, message, providedFields, context, null), 3, null);
    }

    public final void w(Context context, SalesIQChat salesIQChat, Message message, List providedFields) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        Intrinsics.checkNotNullParameter(providedFields, "providedFields");
        AbstractC1459k.d(getAppScope(), null, null, new k(salesIQChat, message, this, providedFields, context, null), 3, null);
    }

    public final boolean x(List list, EnumC4544a enumC4544a, EnumC4544a enumC4544a2) {
        List list2;
        Object obj;
        Form.Message.Meta.InputCard inputCard;
        Form.Message.Meta.InputCard inputCard2;
        List<Form.Message> messages;
        Form.Message.Meta.InputCard inputCard3;
        Form s10 = C6822a.s(enumC4544a);
        List<Form.Message> messages2 = s10 != null ? s10.getMessages() : null;
        if (messages2 == null) {
            messages2 = CollectionsKt.emptyList();
        }
        List mutableList = CollectionsKt.toMutableList((Collection) messages2);
        Form s11 = C6822a.s(enumC4544a);
        if (s11 == null || (messages = s11.getMessages()) == null) {
            list2 = null;
        } else {
            List<Form.Message> list3 = messages;
            list2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                Form.Message.Meta meta = ((Form.Message) it.next()).getMeta();
                list2.add((meta == null || (inputCard3 = meta.getInputCard()) == null) ? null : inputCard3.getType());
            }
        }
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        List mutableList2 = CollectionsKt.toMutableList((Collection) list2);
        Form s12 = C6822a.s(enumC4544a2);
        List<Form.Message> messages3 = s12 != null ? s12.getMessages() : null;
        if (messages3 == null) {
            messages3 = CollectionsKt.emptyList();
        }
        boolean z10 = true;
        for (Form.Message message : messages3) {
            Form.Message.Meta meta2 = message.getMeta();
            Form.Message.Meta.InputCard.a type = (meta2 == null || (inputCard2 = meta2.getInputCard()) == null) ? null : inputCard2.getType();
            if (mutableList2.contains(type)) {
                Iterator it2 = mutableList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    Form.Message.Meta meta3 = ((Form.Message) obj).getMeta();
                    if (((meta3 == null || (inputCard = meta3.getInputCard()) == null) ? null : inputCard.getType()) == type) {
                        break;
                    }
                }
                Form.Message message2 = (Form.Message) obj;
                if (message2 != null) {
                    Form.Message.Meta meta4 = message.getMeta();
                    if (meta4 != null ? Intrinsics.areEqual(meta4.isSkippable(), Boolean.FALSE) : false) {
                        Form.Message.Meta meta5 = message2.getMeta();
                        if ((meta5 != null ? Intrinsics.areEqual(meta5.isSkippable(), Boolean.TRUE) : false) && !CollectionsKt.contains(list, type)) {
                        }
                    }
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final void y(Context context, SalesIQChat salesIQChat, Message question, List providedFields, Pe.a conversationType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        Intrinsics.checkNotNullParameter(providedFields, "providedFields");
        Intrinsics.checkNotNullParameter(conversationType, "conversationType");
        AbstractC1459k.d(getAppScope(), null, null, new m(salesIQChat, question, this, conversationType, providedFields, context, null), 3, null);
    }

    public final void z(InterfaceC2193s owner, Function1 observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        AbstractC1459k.d(AbstractC2194t.a(owner), null, null, new o(owner, this, observer, null), 3, null);
    }
}
