package com.zoho.livechat.android.modules.conversations.data.local;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.gson.Gson;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.x;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import me.C5582a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import re.C6237c;
import re.C6238d;
import yf.y;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 [2\u00020\u0001:\u0001[B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ#\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0017J)\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001aJ+\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JÕ\u0001\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107J/\u0010:\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u00112\b\u00109\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020&¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\n¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u0004\u0018\u00010\u00042\b\u0010C\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u0004\u0018\u00010\u00042\b\u0010F\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bG\u0010EJ#\u0010I\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010H\u001a\u00020$¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\bM\u0010NJ\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\bO\u0010LR\u001d\u0010U\u001a\u0004\u0018\u00010P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010Y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/local/ConversationsLocalDataSource;", "", "<init>", "()V", "Lcom/zoho/livechat/android/models/SalesIQChat;", "salesIQChat", "Lme/a;", "", BaseJavaModule.METHOD_TYPE_SYNC, "(Lcom/zoho/livechat/android/models/SalesIQChat;)Lme/a;", "", "chatId", "message", "saveDraft", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyf/y$a;", "syncType", "", "syncTime", "updateSyncTime", "(Ljava/lang/String;Lyf/y$a;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getUnSyncedTimeList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "time", "updateSyncTimeList", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeList", "syncTimeList", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeUnSyncTimeList", "getMessageLastModifiedTime", "updateMessageLastModifiedTime", "getSyncTime", "(Ljava/lang/String;Lyf/y$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastMessageTime", "", "isBotAttender", "", "unreadCount", "attenderName", "attenderEmail", "attenderId", "attenderImageKey", "Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;", "lastMessage", "timerStartTime", "timerEndTime", "type", "media", "Lcom/zoho/livechat/android/models/SalesIQChat$Extras;", "extras", "departmentId", "departmentName", "updateConversation", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/messages/domain/entities/Message;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/models/SalesIQChat$Extras;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentPosition", "averageResponseTime", "updateChatQueueDetails", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encryptedConversationId", "errorCode", "handleError", "(Ljava/lang/String;I)V", "wmsChatId", "getChatId", "(Ljava/lang/String;)Ljava/lang/String;", "acknowledgementKey", "getChatFromAcknowledgementKey", "(Ljava/lang/String;)Lcom/zoho/livechat/android/models/SalesIQChat;", "conversationId", "getChatFromConversationId", "includeTypeFiltration", "getChat", "(Ljava/lang/String;Z)Lcom/zoho/livechat/android/models/SalesIQChat;", "getLatestConversationTime", "(Ljava/lang/String;)Lme/a;", "updateLatestConversationTime", "(Ljava/lang/String;J)Lme/a;", "delete", "Landroid/content/ContentResolver;", "contentResolver$delegate", "Lkotlin/Lazy;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "Lcom/google/gson/Gson;", "gson$delegate", "getGson", "()Lcom/google/gson/Gson;", "gson", "Companion", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsLocalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsLocalDataSource.kt\ncom/zoho/livechat/android/modules/conversations/data/local/ConversationsLocalDataSource\n+ 2 SalesIQResult.kt\ncom/zoho/livechat/android/modules/common/result/SalesIQResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n106#2:485\n106#2:487\n106#2:489\n106#2:491\n106#2:493\n106#2:496\n106#2:498\n106#2:500\n1#3:486\n1#3:488\n1#3:490\n1#3:492\n1#3:494\n1#3:495\n1#3:497\n1#3:499\n1#3:501\n*S KotlinDebug\n*F\n+ 1 ConversationsLocalDataSource.kt\ncom/zoho/livechat/android/modules/conversations/data/local/ConversationsLocalDataSource\n*L\n48#1:485\n54#1:487\n121#1:489\n148#1:491\n172#1:493\n468#1:496\n472#1:498\n480#1:500\n48#1:486\n54#1:488\n121#1:490\n148#1:492\n172#1:494\n468#1:497\n472#1:499\n480#1:501\n*E\n"})
/* loaded from: classes4.dex */
public final class ConversationsLocalDataSource {

    @Nullable
    private static ConversationsLocalDataSource instance;

    /* renamed from: contentResolver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contentResolver;

    /* renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static Object lock = new Object();
    private static long defaultAverageResponseQueueTime = 60;

    @NotNull
    private static final ConcurrentHashMap<String, Long> latestConversationTimes = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/local/ConversationsLocalDataSource$Companion;", "", "()V", "defaultAverageResponseQueueTime", "", "instance", "Lcom/zoho/livechat/android/modules/conversations/data/local/ConversationsLocalDataSource;", "latestConversationTimes", "Ljava/util/concurrent/ConcurrentHashMap;", "", "lock", "getInstance", "getInstance$mobilisten_release", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationsLocalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsLocalDataSource.kt\ncom/zoho/livechat/android/modules/conversations/data/local/ConversationsLocalDataSource$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n1#2:485\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConversationsLocalDataSource getInstance$mobilisten_release() {
            ConversationsLocalDataSource conversationsLocalDataSource;
            synchronized (ConversationsLocalDataSource.lock) {
                conversationsLocalDataSource = ConversationsLocalDataSource.instance;
                if (conversationsLocalDataSource == null) {
                    conversationsLocalDataSource = new ConversationsLocalDataSource(null);
                    ConversationsLocalDataSource.instance = conversationsLocalDataSource;
                }
            }
            return conversationsLocalDataSource;
        }

        private Companion() {
        }
    }

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f42786d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ContentResolver invoke() {
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            if (e10 != null) {
                return e10.getContentResolver();
            }
            return null;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42787n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f42788o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f42789p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.f42789p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f42789p, continuation);
            bVar.f42788o = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            Object m147constructorimpl2;
            Long l10;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42787n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.f42789p;
            try {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = null;
                try {
                    Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", new String[]{str});
                    if (executeRawQuery != null) {
                        Intrinsics.checkNotNull(executeRawQuery);
                        try {
                            if (executeRawQuery.moveToFirst()) {
                                int columnIndexOrThrow = executeRawQuery.getColumnIndexOrThrow("LMTIME");
                                if (!executeRawQuery.isNull(columnIndexOrThrow)) {
                                    l10 = Boxing.boxLong(executeRawQuery.getLong(columnIndexOrThrow));
                                    CloseableKt.closeFinally(executeRawQuery, null);
                                }
                            }
                            l10 = null;
                            CloseableKt.closeFinally(executeRawQuery, null);
                        } finally {
                        }
                    } else {
                        l10 = null;
                    }
                    m147constructorimpl2 = Result.m147constructorimpl(l10);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                if (!Result.m153isFailureimpl(m147constructorimpl2)) {
                    obj2 = m147constructorimpl2;
                }
                m147constructorimpl = Result.m147constructorimpl((Long) obj2);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl2 != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl2);
            }
            return me.b.a(m147constructorimpl);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42790n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f42791o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f42792p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ y.a f42793q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, y.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f42792p = str;
            this.f42793q = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f42792p, this.f42793q, continuation);
            cVar.f42791o = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:(9:14|(2:16|(1:18)(5:19|20|21|22|23))(2:50|(2:52|(1:54)(5:55|20|21|22|23)))|25|(1:27)|28|29|(1:31)|32|33)|20|21|22|23) */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        
            r5 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
        
            r2 = r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:5:0x0012, B:25:0x008a, B:27:0x0090, B:28:0x0096, B:39:0x007f), top: B:4:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            Throwable m150exceptionOrNullimpl;
            Object obj2;
            Object m147constructorimpl2;
            Object obj3;
            Throwable m150exceptionOrNullimpl2;
            Cursor executeRawQuery;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42790n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.f42792p;
            y.a aVar = this.f42793q;
            try {
                Result.Companion companion = Result.INSTANCE;
                obj2 = null;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            try {
                executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", new String[]{str});
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th));
                obj3 = obj2;
                m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                if (m150exceptionOrNullimpl2 != null) {
                }
                m147constructorimpl = Result.m147constructorimpl(obj3);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                }
                return me.b.a(m147constructorimpl);
            }
            if (executeRawQuery != null) {
                Intrinsics.checkNotNull(executeRawQuery);
                try {
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    if (executeRawQuery.moveToFirst()) {
                        if (aVar == y.a.Bottom) {
                            int columnIndexOrThrow = executeRawQuery.getColumnIndexOrThrow("BOTTOM_SYNC_TIME");
                            if (!executeRawQuery.isNull(columnIndexOrThrow)) {
                                obj3 = Boxing.boxLong(executeRawQuery.getLong(columnIndexOrThrow));
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(executeRawQuery, null);
                                obj2 = Unit.INSTANCE;
                            }
                        } else if (aVar == y.a.Top) {
                            int columnIndexOrThrow2 = executeRawQuery.getColumnIndexOrThrow("SYNC_TIME");
                            if (!executeRawQuery.isNull(columnIndexOrThrow2)) {
                                obj3 = Boxing.boxLong(executeRawQuery.getLong(columnIndexOrThrow2));
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(executeRawQuery, null);
                                obj2 = Unit.INSTANCE;
                            }
                        }
                        m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                        if (m150exceptionOrNullimpl2 != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl2);
                        }
                        m147constructorimpl = Result.m147constructorimpl(obj3);
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        return me.b.a(m147constructorimpl);
                    }
                    Unit unit22 = Unit.INSTANCE;
                    CloseableKt.closeFinally(executeRawQuery, null);
                    obj2 = Unit.INSTANCE;
                } catch (Throwable th5) {
                    obj2 = obj3;
                    th = th5;
                    try {
                        throw th;
                    } finally {
                    }
                }
                obj3 = null;
            } else {
                obj3 = null;
            }
            m147constructorimpl2 = Result.m147constructorimpl(obj2);
            m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2);
            if (m150exceptionOrNullimpl2 != null) {
            }
            m147constructorimpl = Result.m147constructorimpl(obj3);
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
            }
            return me.b.a(m147constructorimpl);
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f42794d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Gson invoke() {
            return Yd.a.j();
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f42795d = new e();

        public e() {
            super(1);
        }

        public final void a(Boolean bool) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f42796n;

        /* renamed from: p, reason: collision with root package name */
        public int f42798p;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42796n = obj;
            this.f42798p |= Integer.MIN_VALUE;
            return ConversationsLocalDataSource.this.removeUnSyncTimeList(null, 0L, this);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42799n;

        /* renamed from: o, reason: collision with root package name */
        public long f42800o;

        /* renamed from: p, reason: collision with root package name */
        public int f42801p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f42802q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f42804s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f42805t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, long j10, Continuation continuation) {
            super(2, continuation);
            this.f42804s = str;
            this.f42805t = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = ConversationsLocalDataSource.this.new g(this.f42804s, this.f42805t, continuation);
            gVar.f42802q = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            ConversationsLocalDataSource conversationsLocalDataSource;
            String str;
            long j10;
            Integer num;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42801p;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    conversationsLocalDataSource = ConversationsLocalDataSource.this;
                    String str2 = this.f42804s;
                    long j11 = this.f42805t;
                    Result.Companion companion = Result.INSTANCE;
                    this.f42802q = conversationsLocalDataSource;
                    this.f42799n = str2;
                    this.f42800o = j11;
                    this.f42801p = 1;
                    Object unSyncedTimeList = conversationsLocalDataSource.getUnSyncedTimeList(str2, this);
                    if (unSyncedTimeList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str2;
                    obj = unSyncedTimeList;
                    j10 = j11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = this.f42800o;
                    str = (String) this.f42799n;
                    conversationsLocalDataSource = (ConversationsLocalDataSource) this.f42802q;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) ((C5582a) obj).b();
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                Set mutableSet = CollectionsKt.toMutableSet(list);
                mutableSet.remove(Boxing.boxLong(j10));
                ContentResolver contentResolver = conversationsLocalDataSource.getContentResolver();
                if (contentResolver != null) {
                    Uri uri = b.a.f44269a;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("UN_SYNCED_TIME_LIST", conversationsLocalDataSource.getGson().v(mutableSet));
                    Unit unit = Unit.INSTANCE;
                    num = Boxing.boxInt(contentResolver.update(uri, contentValues, "CHATID = ?", new String[]{str}));
                } else {
                    num = null;
                }
                m147constructorimpl = Result.m147constructorimpl(num);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f42809n;

        /* renamed from: p, reason: collision with root package name */
        public int f42811p;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42809n = obj;
            this.f42811p |= Integer.MIN_VALUE;
            return ConversationsLocalDataSource.this.saveDraft(null, null, this);
        }
    }

    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42812n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f42814p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f42815q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f42814p = str;
            this.f42815q = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConversationsLocalDataSource.this.new i(this.f42814p, this.f42815q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42812n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("DRAFT", this.f42815q);
            ContentResolver contentResolver = ConversationsLocalDataSource.this.getContentResolver();
            if (contentResolver != null) {
                Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CHATID = ?", new String[]{this.f42814p}));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f42816n;

        /* renamed from: p, reason: collision with root package name */
        public int f42818p;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42816n = obj;
            this.f42818p |= Integer.MIN_VALUE;
            return ConversationsLocalDataSource.this.syncTimeList(null, null, this);
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42819n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42820o;

        /* renamed from: p, reason: collision with root package name */
        public int f42821p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f42822q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f42824s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List f42825t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, List list, Continuation continuation) {
            super(2, continuation);
            this.f42824s = str;
            this.f42825t = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            k kVar = ConversationsLocalDataSource.this.new k(this.f42824s, this.f42825t, continuation);
            kVar.f42822q = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((k) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            String str;
            ConversationsLocalDataSource conversationsLocalDataSource;
            List list;
            Integer num;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42821p;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ConversationsLocalDataSource conversationsLocalDataSource2 = ConversationsLocalDataSource.this;
                    str = this.f42824s;
                    List list2 = this.f42825t;
                    Result.Companion companion = Result.INSTANCE;
                    this.f42822q = conversationsLocalDataSource2;
                    this.f42819n = str;
                    this.f42820o = list2;
                    this.f42821p = 1;
                    Object unSyncedTimeList = conversationsLocalDataSource2.getUnSyncedTimeList(str, this);
                    if (unSyncedTimeList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    conversationsLocalDataSource = conversationsLocalDataSource2;
                    obj = unSyncedTimeList;
                    list = list2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f42820o;
                    str = (String) this.f42819n;
                    conversationsLocalDataSource = (ConversationsLocalDataSource) this.f42822q;
                    ResultKt.throwOnFailure(obj);
                }
                List list3 = (List) ((C5582a) obj).b();
                if (list3 == null) {
                    list3 = CollectionsKt.emptyList();
                }
                Set mutableSet = CollectionsKt.toMutableSet(list3);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mutableSet.remove(Boxing.boxLong(((Number) it.next()).longValue()));
                }
                ContentResolver contentResolver = conversationsLocalDataSource.getContentResolver();
                if (contentResolver != null) {
                    Uri uri = b.a.f44269a;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("UN_SYNCED_TIME_LIST", conversationsLocalDataSource.getGson().v(mutableSet));
                    Unit unit = Unit.INSTANCE;
                    num = Boxing.boxInt(contentResolver.update(uri, contentValues, "CHATID = ?", new String[]{str}));
                } else {
                    num = null;
                }
                m147constructorimpl = Result.m147constructorimpl(num);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42826n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Long f42827o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Long f42828p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ConversationsLocalDataSource f42829q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f42830r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Long l10, Long l11, ConversationsLocalDataSource conversationsLocalDataSource, String str, Continuation continuation) {
            super(2, continuation);
            this.f42827o = l10;
            this.f42828p = l11;
            this.f42829q = conversationsLocalDataSource;
            this.f42830r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.f42827o, this.f42828p, this.f42829q, this.f42830r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((l) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42826n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long p10 = og.i.p(this.f42827o, -1L);
            Long l10 = this.f42828p;
            long longValue = l10 != null ? l10.longValue() : ConversationsLocalDataSource.defaultAverageResponseQueueTime;
            if (longValue < 1) {
                longValue = ConversationsLocalDataSource.defaultAverageResponseQueueTime;
            }
            if (p10 > 0) {
                ContentValues contentValues = new ContentValues();
                long j10 = longValue / 1000;
                if (j10 <= 0) {
                    j10 = 60;
                }
                contentValues.put("SHOW_QUEUE", Boxing.boxInt(1));
                contentValues.put("QUEUEPOSITION", Boxing.boxLong(p10));
                contentValues.put("QUEUE_START_TIME", Boxing.boxLong(rd.b.f()));
                contentValues.put("QUEUE_END_TIME", Boxing.boxLong(j10));
                ContentResolver contentResolver = this.f42829q.getContentResolver();
                if (contentResolver != null) {
                    Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{this.f42830r}));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Long f42831A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ Long f42832B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ String f42833C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ String f42834D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat.Extras f42835E;

        /* renamed from: n, reason: collision with root package name */
        public int f42836n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f42838p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Long f42839q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Boolean f42840r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Integer f42841s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f42842t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f42843u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f42844v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f42845w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f42846x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f42847y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Message f42848z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, Long l10, Boolean bool, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, Message message, Long l11, Long l12, String str8, String str9, SalesIQChat.Extras extras, Continuation continuation) {
            super(2, continuation);
            this.f42838p = str;
            this.f42839q = l10;
            this.f42840r = bool;
            this.f42841s = num;
            this.f42842t = str2;
            this.f42843u = str3;
            this.f42844v = str4;
            this.f42845w = str5;
            this.f42846x = str6;
            this.f42847y = str7;
            this.f42848z = message;
            this.f42831A = l11;
            this.f42832B = l12;
            this.f42833C = str8;
            this.f42834D = str9;
            this.f42835E = extras;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConversationsLocalDataSource.this.new m(this.f42838p, this.f42839q, this.f42840r, this.f42841s, this.f42842t, this.f42843u, this.f42844v, this.f42845w, this.f42846x, this.f42847y, this.f42848z, this.f42831A, this.f42832B, this.f42833C, this.f42834D, this.f42835E, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((m) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            SalesIQChat.Extras extras;
            ContentResolver contentResolver;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42836n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConversationsLocalDataSource conversationsLocalDataSource = ConversationsLocalDataSource.this;
            String str = this.f42838p;
            Long l10 = this.f42839q;
            Boolean bool = this.f42840r;
            Integer num = this.f42841s;
            String str2 = this.f42842t;
            String str3 = this.f42843u;
            String str4 = this.f42844v;
            String str5 = this.f42845w;
            String str6 = this.f42846x;
            String str7 = this.f42847y;
            Message message = this.f42848z;
            Long l11 = this.f42831A;
            Long l12 = this.f42832B;
            String str8 = this.f42833C;
            String str9 = this.f42834D;
            SalesIQChat.Extras extras2 = this.f42835E;
            try {
                Result.Companion companion = Result.INSTANCE;
                ContentValues contentValues = new ContentValues();
                if (l10 != null) {
                    extras = extras2;
                    contentValues.put("LMTIME", l10);
                } else {
                    extras = extras2;
                }
                if (bool != null) {
                    contentValues.put("ISBOTATTENDER", bool);
                }
                if (num != null) {
                    contentValues.put("UNREAD_COUNT", num);
                }
                if (str2 != null) {
                    contentValues.put("DEPTID", str2);
                }
                if (str3 != null) {
                    contentValues.put("DEPTNAME", str3);
                }
                if (str4 != null) {
                    contentValues.put("ATTENDER", str4);
                }
                if (str5 != null) {
                    contentValues.put("ATTENDER_EMAIL", str5);
                }
                if (str6 != null) {
                    contentValues.put("ATTENDER_ID", str6);
                }
                if (str7 != null) {
                    contentValues.put("ATTENDER_IMGKEY", str7);
                }
                if (message != null) {
                    contentValues.put("LASTMSG", conversationsLocalDataSource.getGson().v(message));
                }
                if (l11 != null) {
                    contentValues.put("TIMER_START_TIME", l11);
                }
                if (l12 != null) {
                    contentValues.put("TIMER_END_TIME", l12);
                }
                if (str8 != null) {
                    contentValues.put("TYPE", str8);
                }
                if (str9 != null) {
                    contentValues.put("MEDIA", str9);
                }
                if (extras != null) {
                    contentValues.put("EXTRAS", conversationsLocalDataSource.getGson().v(extras));
                }
                if (og.i.d(Boxing.boxInt(contentValues.size()), 0) && (contentResolver = conversationsLocalDataSource.getContentResolver()) != null) {
                    Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CHATID = ?", new String[]{str}));
                }
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            C5582a a10 = me.b.a(m147constructorimpl);
            if (a10.d()) {
                return a10.a(Unit.INSTANCE);
            }
            Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
            return a10;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42849n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f42851p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ long f42852q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, long j10, Continuation continuation) {
            super(2, continuation);
            this.f42851p = str;
            this.f42852q = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConversationsLocalDataSource.this.new n(this.f42851p, this.f42852q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42849n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConversationsLocalDataSource conversationsLocalDataSource = ConversationsLocalDataSource.this;
            String str = this.f42851p;
            long j10 = this.f42852q;
            try {
                Result.Companion companion = Result.INSTANCE;
                ContentValues contentValues = new ContentValues();
                contentValues.put("LMTIME", Boxing.boxLong(j10));
                ContentResolver contentResolver = conversationsLocalDataSource.getContentResolver();
                m147constructorimpl = Result.m147constructorimpl(contentResolver != null ? Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CHATID = ?", new String[]{str})) : null);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            C5582a a10 = me.b.a(m147constructorimpl);
            if (a10.d()) {
                return a10.a(Unit.INSTANCE);
            }
            Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
            return a10;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42853n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ y.a f42854o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Long f42855p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ConversationsLocalDataSource f42856q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f42857r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(y.a aVar, Long l10, ConversationsLocalDataSource conversationsLocalDataSource, String str, Continuation continuation) {
            super(2, continuation);
            this.f42854o = aVar;
            this.f42855p = l10;
            this.f42856q = conversationsLocalDataSource;
            this.f42857r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f42854o, this.f42855p, this.f42856q, this.f42857r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            ContentResolver contentResolver;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42853n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            y.a aVar = this.f42854o;
            Long l10 = this.f42855p;
            ConversationsLocalDataSource conversationsLocalDataSource = this.f42856q;
            String str = this.f42857r;
            try {
                Result.Companion companion = Result.INSTANCE;
                ContentValues contentValues = new ContentValues();
                if (aVar == y.a.Bottom) {
                    contentValues.put("BOTTOM_SYNC_TIME", l10);
                } else if (aVar == y.a.Top) {
                    contentValues.put("SYNC_TIME", l10);
                }
                Integer num = null;
                if (!og.i.d(Boxing.boxInt(contentValues.size()), 0)) {
                    contentValues = null;
                }
                if (contentValues != null && (contentResolver = conversationsLocalDataSource.getContentResolver()) != null) {
                    num = Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CHATID = ?", new String[]{str}));
                }
                m147constructorimpl = Result.m147constructorimpl(num);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            C5582a a10 = me.b.a(m147constructorimpl);
            if (a10.d()) {
                return a10.a(Unit.INSTANCE);
            }
            Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
            return a10;
        }
    }

    public static final class p extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f42858n;

        /* renamed from: p, reason: collision with root package name */
        public int f42860p;

        public p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42858n = obj;
            this.f42860p |= Integer.MIN_VALUE;
            return ConversationsLocalDataSource.this.updateSyncTimeList(null, 0L, this);
        }
    }

    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42861n;

        /* renamed from: o, reason: collision with root package name */
        public long f42862o;

        /* renamed from: p, reason: collision with root package name */
        public int f42863p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f42864q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f42866s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f42867t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, long j10, Continuation continuation) {
            super(2, continuation);
            this.f42866s = str;
            this.f42867t = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            q qVar = ConversationsLocalDataSource.this.new q(this.f42866s, this.f42867t, continuation);
            qVar.f42864q = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            ConversationsLocalDataSource conversationsLocalDataSource;
            String str;
            long j10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42863p;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    conversationsLocalDataSource = ConversationsLocalDataSource.this;
                    String str2 = this.f42866s;
                    long j11 = this.f42867t;
                    Result.Companion companion = Result.INSTANCE;
                    this.f42864q = conversationsLocalDataSource;
                    this.f42861n = str2;
                    this.f42862o = j11;
                    this.f42863p = 1;
                    Object unSyncedTimeList = conversationsLocalDataSource.getUnSyncedTimeList(str2, this);
                    if (unSyncedTimeList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str2;
                    obj = unSyncedTimeList;
                    j10 = j11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = this.f42862o;
                    str = (String) this.f42861n;
                    conversationsLocalDataSource = (ConversationsLocalDataSource) this.f42864q;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) ((C5582a) obj).b();
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                Set mutableSet = CollectionsKt.toMutableSet(list);
                mutableSet.add(Boxing.boxLong(j10));
                ContentValues contentValues = new ContentValues();
                contentValues.put("UN_SYNCED_TIME_LIST", conversationsLocalDataSource.getGson().v(mutableSet));
                ContentResolver contentResolver = conversationsLocalDataSource.getContentResolver();
                m147constructorimpl = Result.m147constructorimpl(contentResolver != null ? Boxing.boxInt(contentResolver.update(b.a.f44269a, contentValues, "CHATID = ?", new String[]{str})) : null);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ConversationsLocalDataSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ SalesIQChat getChat$default(ConversationsLocalDataSource conversationsLocalDataSource, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return conversationsLocalDataSource.getChat(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getContentResolver() {
        return (ContentResolver) this.contentResolver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    @NotNull
    public final C5582a delete(@NotNull String chatId) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        try {
            Result.Companion companion = Result.INSTANCE;
            com.zoho.livechat.android.provider.a.INSTANCE.deleteConversation(getContentResolver(), null, chatId, true, false);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SalesIQChat getChat(@Nullable String chatId, boolean includeTypeFiltration) {
        String str;
        Object m147constructorimpl;
        SalesIQChat salesIQChat;
        Throwable m150exceptionOrNullimpl;
        Object obj;
        Object obj2 = null;
        if (chatId == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?");
        if ((includeTypeFiltration ? this : null) != null) {
            str = " AND TYPE = " + SalesIQChat.c.Chat.value;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        String[] strArr = {chatId};
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(sb3, strArr);
            if (executeRawQuery != null) {
                Intrinsics.checkNotNull(executeRawQuery);
                try {
                    obj = executeRawQuery.moveToFirst() ? new SalesIQChat(executeRawQuery) : null;
                    try {
                        Unit unit = Unit.INSTANCE;
                        try {
                            CloseableKt.closeFinally(executeRawQuery, null);
                            obj2 = Unit.INSTANCE;
                            obj = obj;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = obj;
                            Result.Companion companion2 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                            salesIQChat = obj2;
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return salesIQChat;
                        }
                    } catch (Throwable th3) {
                        obj2 = obj;
                        th = th3;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                obj = null;
            }
            m147constructorimpl = Result.m147constructorimpl(obj2);
            salesIQChat = obj;
        } catch (Throwable th5) {
            th = th5;
            Result.Companion companion22 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
            salesIQChat = obj2;
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
            }
            return salesIQChat;
        }
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return salesIQChat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SalesIQChat getChatFromAcknowledgementKey(@Nullable String acknowledgementKey) {
        Object m147constructorimpl;
        SalesIQChat salesIQChat;
        Throwable m150exceptionOrNullimpl;
        Object obj;
        Object obj2 = null;
        if (acknowledgementKey == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CONVID = ?", new String[]{acknowledgementKey});
            if (executeRawQuery != null) {
                Intrinsics.checkNotNull(executeRawQuery);
                try {
                    obj = executeRawQuery.moveToFirst() ? new SalesIQChat(executeRawQuery) : null;
                    try {
                        Unit unit = Unit.INSTANCE;
                        try {
                            CloseableKt.closeFinally(executeRawQuery, null);
                            obj2 = Unit.INSTANCE;
                            obj = obj;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = obj;
                            Result.Companion companion2 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                            salesIQChat = obj2;
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return salesIQChat;
                        }
                    } catch (Throwable th3) {
                        Object obj3 = obj;
                        th = th3;
                        obj2 = obj3;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                obj = null;
            }
            m147constructorimpl = Result.m147constructorimpl(obj2);
            salesIQChat = obj;
        } catch (Throwable th5) {
            th = th5;
            Result.Companion companion22 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
            salesIQChat = obj2;
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
            }
            return salesIQChat;
        }
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return salesIQChat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SalesIQChat getChatFromConversationId(@Nullable String conversationId) {
        Object m147constructorimpl;
        SalesIQChat salesIQChat;
        Throwable m150exceptionOrNullimpl;
        Object obj;
        Object obj2 = null;
        if (conversationId == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE VISITORID = ?", new String[]{conversationId});
            if (executeRawQuery != null) {
                Intrinsics.checkNotNull(executeRawQuery);
                try {
                    obj = executeRawQuery.moveToFirst() ? new SalesIQChat(executeRawQuery) : null;
                    try {
                        Unit unit = Unit.INSTANCE;
                        try {
                            CloseableKt.closeFinally(executeRawQuery, null);
                            obj2 = Unit.INSTANCE;
                            obj = obj;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = obj;
                            Result.Companion companion2 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                            salesIQChat = obj2;
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return salesIQChat;
                        }
                    } catch (Throwable th3) {
                        Object obj3 = obj;
                        th = th3;
                        obj2 = obj3;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                obj = null;
            }
            m147constructorimpl = Result.m147constructorimpl(obj2);
            salesIQChat = obj;
        } catch (Throwable th5) {
            th = th5;
            Result.Companion companion22 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
            salesIQChat = obj2;
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
            }
            return salesIQChat;
        }
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return salesIQChat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getChatId(@NotNull String wmsChatId) {
        Object m147constructorimpl;
        String str;
        Throwable m150exceptionOrNullimpl;
        Object obj;
        Intrinsics.checkNotNullParameter(wmsChatId, "wmsChatId");
        String[] strArr = {wmsChatId};
        Object obj2 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE RCHATID = ?", strArr);
            if (executeRawQuery != null) {
                Intrinsics.checkNotNull(executeRawQuery);
                try {
                    obj = executeRawQuery.moveToFirst() ? executeRawQuery.getString(executeRawQuery.getColumnIndexOrThrow("CHATID")) : null;
                    try {
                        Unit unit = Unit.INSTANCE;
                        try {
                            CloseableKt.closeFinally(executeRawQuery, null);
                            obj2 = Unit.INSTANCE;
                            obj = obj;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = obj;
                            Result.Companion companion2 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                            str = obj2;
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return str;
                        }
                    } catch (Throwable th3) {
                        obj2 = obj;
                        th = th3;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                obj = null;
            }
            m147constructorimpl = Result.m147constructorimpl(obj2);
            str = obj;
        } catch (Throwable th5) {
            th = th5;
        }
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return str;
    }

    @NotNull
    public final C5582a getLatestConversationTime(@NotNull String chatId) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Long.valueOf(og.i.r(latestConversationTimes.get(chatId))));
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

    @Nullable
    public final Object getMessageLastModifiedTime(@NotNull String str, @NotNull Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new b(str, null), continuation);
    }

    @Nullable
    public final Object getSyncTime(@NotNull String str, @NotNull y.a aVar, @NotNull Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new c(str, aVar, null), continuation);
    }

    @Nullable
    public final Object getUnSyncedTimeList(@NotNull String str, @NotNull Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new ConversationsLocalDataSource$getUnSyncedTimeList$2(str, null), continuation);
    }

    public final void handleError(@NotNull String encryptedConversationId, int errorCode) {
        SalesIQChat chat;
        Intrinsics.checkNotNullParameter(encryptedConversationId, "encryptedConversationId");
        if ((errorCode == C6237c.f64117d.a() || errorCode == C6238d.f64118d.a()) && (chat = LiveChatUtil.getChat(LiveChatUtil.getChatidfromVisitorID(encryptedConversationId))) != null) {
            chat.setStatus(4);
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
            x xVar = new x(LiveChatUtil.getAVUID(), LiveChatUtil.getCVUID(), e.f42795d);
            xVar.c(chat.getVisitorid());
            LiveChatUtil.submitTaskToExecutorServiceSafely(xVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|28|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeUnSyncTimeList(@NotNull String str, long j10, @NotNull Continuation<? super C5582a> continuation) {
        f fVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f42798p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f42798p = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f42796n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f42798p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    L b10 = C1452g0.b();
                    g gVar = new g(str, j10, null);
                    fVar.f42798p = 1;
                    if (AbstractC1455i.g(b10, gVar, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f42796n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f42798p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r6 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveDraft(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super C5582a> continuation) {
        h hVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f42811p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f42811p = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f42809n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = hVar.f42811p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    L b10 = C1452g0.b();
                    i iVar = new i(str, str2, null);
                    hVar.f42811p = 1;
                    if (AbstractC1455i.g(b10, iVar, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f42809n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar.f42811p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    @NotNull
    public final C5582a sync(@NotNull SalesIQChat salesIQChat) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        try {
            Result.Companion companion = Result.INSTANCE;
            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(salesIQChat);
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

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r6 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncTimeList(@NotNull String str, @NotNull List<Long> list, @NotNull Continuation<? super C5582a> continuation) {
        j jVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f42818p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f42818p = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f42816n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = jVar.f42818p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    L b10 = C1452g0.b();
                    k kVar = new k(str, list, null);
                    jVar.f42818p = 1;
                    if (AbstractC1455i.g(b10, kVar, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        jVar = new j(continuation);
        Object obj2 = jVar.f42816n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = jVar.f42818p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    @Nullable
    public final Object updateChatQueueDetails(@NotNull String str, @Nullable Long l10, @Nullable Long l11, @NotNull Continuation<? super Unit> continuation) {
        Object g10 = AbstractC1455i.g(C1452g0.b(), new l(l10, l11, this, str, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateConversation(@NotNull String str, @Nullable Long l10, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Message message, @Nullable Long l11, @Nullable Long l12, @Nullable String str6, @Nullable String str7, @Nullable SalesIQChat.Extras extras, @Nullable String str8, @Nullable String str9, @NotNull Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new m(str, l10, bool, num, str8, str9, str2, str3, str4, str5, message, l11, l12, str6, str7, extras, null), continuation);
    }

    @NotNull
    public final C5582a updateLatestConversationTime(@NotNull String chatId, long time) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        try {
            Result.Companion companion = Result.INSTANCE;
            ConcurrentHashMap<String, Long> concurrentHashMap = latestConversationTimes;
            if (time > og.i.r(concurrentHashMap.get(chatId))) {
                concurrentHashMap.put(chatId, Long.valueOf(time));
            }
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

    @Nullable
    public final Object updateMessageLastModifiedTime(@NotNull String str, long j10, @NotNull Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new n(str, j10, null), continuation);
    }

    @Nullable
    public final Object updateSyncTime(@NotNull String str, @NotNull y.a aVar, @Nullable Long l10, @NotNull Continuation<? super C5582a> continuation) {
        return AbstractC1455i.g(C1452g0.b(), new o(aVar, l10, this, str, null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|28|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSyncTimeList(@NotNull String str, long j10, @NotNull Continuation<? super C5582a> continuation) {
        p pVar;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i11 = pVar.f42860p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f42860p = i11 - Integer.MIN_VALUE;
                Object obj = pVar.f42858n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = pVar.f42860p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    L b10 = C1452g0.b();
                    q qVar = new q(str, j10, null);
                    pVar.f42860p = 1;
                    if (AbstractC1455i.g(b10, qVar, pVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        pVar = new p(continuation);
        Object obj2 = pVar.f42858n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = pVar.f42860p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    private ConversationsLocalDataSource() {
        this.contentResolver = LazyKt.lazy(a.f42786d);
        this.gson = LazyKt.lazy(d.f42794d);
    }
}
