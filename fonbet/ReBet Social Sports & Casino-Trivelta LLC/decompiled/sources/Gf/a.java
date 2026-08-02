package Gf;

import android.database.Cursor;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import me.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f3948b;

    /* renamed from: a, reason: collision with root package name */
    public static final C0086a f3947a = new C0086a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3949c = new Object();

    /* renamed from: Gf.a$a, reason: collision with other inner class name */
    public static final class C0086a {
        public /* synthetic */ C0086a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar;
            synchronized (a.f3949c) {
                aVar = a.f3948b;
                if (aVar == null) {
                    aVar = new a();
                    a.f3948b = aVar;
                }
            }
            return aVar;
        }

        public C0086a() {
        }
    }

    public final C5582a d() {
        Object m147constructorimpl;
        Object m147constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            int i10 = 0;
            Cursor cursor = null;
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE UNREAD_COUNT != 0");
                while (true) {
                    Intrinsics.checkNotNull(cursor);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    i10 += cursor.getInt(cursor.getColumnIndexOrThrow("UNREAD_COUNT"));
                }
                m147constructorimpl2 = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            if (cursor != null) {
                cursor.close();
            }
            m147constructorimpl = Result.m147constructorimpl(Integer.valueOf(i10));
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl2 != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl2);
        }
        return b.a(m147constructorimpl);
    }
}
