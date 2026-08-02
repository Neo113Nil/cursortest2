package me;

import android.util.Log;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import we.d;
import we.e;

/* loaded from: classes4.dex */
public abstract class b {
    public static final C5582a a(Object obj) {
        if (Result.m154isSuccessimpl(obj)) {
            C5582a.C0817a c0817a = C5582a.f56502b;
            if (Result.m153isFailureimpl(obj)) {
                obj = null;
            }
            return c0817a.d(obj);
        }
        C5582a.C0817a c0817a2 = C5582a.f56502b;
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj);
        if (m150exceptionOrNullimpl == null) {
            m150exceptionOrNullimpl = new Exception();
        }
        LiveChatUtil.log("SalesIQResultException: " + Log.getStackTraceString(m150exceptionOrNullimpl));
        return C5582a.C0817a.c(c0817a2, m150exceptionOrNullimpl, false, 2, null);
    }

    public static final e b(C5582a c5582a) {
        Intrinsics.checkNotNullParameter(c5582a, "<this>");
        return c5582a.d() ? e.f67680b.b(c5582a.b()) : e.f67680b.a(d.f67649d);
    }
}
