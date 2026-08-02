package og;

import android.util.Log;
import com.google.gson.Gson;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.lang.reflect.Type;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: og.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5895g {
    public static final Object a(Gson gson, com.google.gson.h hVar, Class classOfT) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(classOfT, "classOfT");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(hVar != null ? gson.i(hVar, classOfT) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Gson JsonElement Serialization 2 Exception ");
            sb2.append(Log.getStackTraceString(m150exceptionOrNullimpl));
            sb2.append("  \n\n JSON String: ");
            sb2.append(hVar != null ? hVar.toString() : null);
            LiveChatUtil.log(sb2.toString());
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            return null;
        }
        return m147constructorimpl;
    }

    public static final Object b(Gson gson, String str, Class classOfT) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(classOfT, "classOfT");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(str != null ? gson.m(str, classOfT) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log("Gson String Serialization 1 Exception " + Log.getStackTraceString(m150exceptionOrNullimpl) + " \n\n JSON String: " + str);
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            return null;
        }
        return m147constructorimpl;
    }

    public static final Object c(Gson gson, String str, Type typeOfT) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str != null) {
                return gson.n(str, typeOfT);
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log("Gson JsonElement Serialization 3 Exception " + Log.getStackTraceString(m150exceptionOrNullimpl) + " \n\n JSON String: " + str);
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                return null;
            }
            return m147constructorimpl;
        }
    }
}
