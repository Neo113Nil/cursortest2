package com.zoho.livechat.android.modules.conversations.data.local;

import Ph.P;
import android.database.Cursor;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zoho.livechat.android.provider.a;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.b;
import og.AbstractC5895g;

/* loaded from: classes4.dex */
public final class ConversationsLocalDataSource$getUnSyncedTimeList$2 extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public int f42806n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f42807o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f42808p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsLocalDataSource$getUnSyncedTimeList$2(String str, Continuation continuation) {
        super(2, continuation);
        this.f42808p = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConversationsLocalDataSource$getUnSyncedTimeList$2 conversationsLocalDataSource$getUnSyncedTimeList$2 = new ConversationsLocalDataSource$getUnSyncedTimeList$2(this.f42808p, continuation);
        conversationsLocalDataSource$getUnSyncedTimeList$2.f42807o = obj;
        return conversationsLocalDataSource$getUnSyncedTimeList$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(P p10, Continuation continuation) {
        return ((ConversationsLocalDataSource$getUnSyncedTimeList$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x007b, TryCatch #4 {all -> 0x007b, blocks: (B:5:0x0010, B:12:0x0071, B:14:0x0077, B:15:0x007d, B:17:0x0081, B:18:0x0085, B:29:0x0066), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: all -> 0x007b, TryCatch #4 {all -> 0x007b, blocks: (B:5:0x0010, B:12:0x0071, B:14:0x0077, B:15:0x007d, B:17:0x0081, B:18:0x0085, B:29:0x0066), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
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
        List list;
        Object obj4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f42806n != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.f42808p;
        try {
            Result.Companion companion = Result.INSTANCE;
            obj2 = null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            Cursor executeRawQuery = a.INSTANCE.executeRawQuery("SELECT UN_SYNCED_TIME_LIST FROM SIQ_CONVERSATIONS WHERE CHATID = ?", new String[]{str});
            if (executeRawQuery != null) {
                try {
                    if (executeRawQuery.moveToFirst()) {
                        Type type = new TypeToken<List<? extends Long>>() { // from class: com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource$getUnSyncedTimeList$2$1$1$1$listType$1
                        }.getType();
                        Gson j10 = Yd.a.j();
                        String string = executeRawQuery.getString(executeRawQuery.getColumnIndexOrThrow("UN_SYNCED_TIME_LIST"));
                        Intrinsics.checkNotNull(type);
                        obj4 = AbstractC5895g.c(j10, string, type);
                    } else {
                        obj4 = null;
                    }
                    try {
                        Unit unit = Unit.INSTANCE;
                        try {
                            CloseableKt.closeFinally(executeRawQuery, null);
                            obj2 = Unit.INSTANCE;
                            obj4 = obj4;
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = obj4;
                            Result.Companion companion3 = Result.INSTANCE;
                            m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th));
                            obj3 = obj2;
                            m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                            if (m150exceptionOrNullimpl2 != null) {
                            }
                            list = (List) obj3;
                            if (list == null) {
                            }
                            m147constructorimpl = Result.m147constructorimpl(list);
                            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                            if (m150exceptionOrNullimpl != null) {
                            }
                            return b.a(m147constructorimpl);
                        }
                    } catch (Throwable th4) {
                        obj2 = obj4;
                        th = th4;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                obj4 = null;
            }
            m147constructorimpl2 = Result.m147constructorimpl(obj2);
            obj3 = obj4;
        } catch (Throwable th6) {
            th = th6;
            Result.Companion companion32 = Result.INSTANCE;
            m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th));
            obj3 = obj2;
            m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2);
            if (m150exceptionOrNullimpl2 != null) {
            }
            list = (List) obj3;
            if (list == null) {
            }
            m147constructorimpl = Result.m147constructorimpl(list);
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
            }
            return b.a(m147constructorimpl);
        }
        m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl2 != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl2);
        }
        list = (List) obj3;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        m147constructorimpl = Result.m147constructorimpl(list);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return b.a(m147constructorimpl);
    }
}
