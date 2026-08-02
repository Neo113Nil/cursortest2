package sh0;

import E0.C2942q;
import Tc.d;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.push.sdk.external.service.RemoteMessage;
import sj.f;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static h f98781a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Regex f98782b = new Regex("[0-9]");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f98783c = 0;

    public static void a(@NotNull String tag, RemoteMessage remoteMessage, Throwable th2, Map map, @NotNull Function0 message) {
        String th3;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            c(tag, remoteMessage, th2, map, message);
        } catch (Throwable th4) {
            try {
                th3 = Log.getStackTraceString(th4);
                Intrinsics.checkNotNullExpressionValue(th3, "getStackTraceString(...)");
            } catch (Throwable th5) {
                th3 = th5.toString();
            }
            h hVar = f98781a;
            if (hVar != null) {
                d builder = new d();
                builder.put("inner_stack_trace", th3);
                Unit unit = Unit.f71690a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                h.a.a(hVar, "Smth went wrong during logging.", f.a(builder.u()), null, 4);
            }
        }
    }

    public static /* synthetic */ void b(String str, RemoteMessage remoteMessage, Throwable th2, Map map, Function0 function0, int i11) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        if ((i11 & 8) != 0) {
            map = null;
        }
        a(str, remoteMessage, th2, map, function0);
    }

    private static void c(String str, RemoteMessage remoteMessage, Throwable th2, Map map, Function0 function0) {
        String str2;
        String str3;
        if (th2 != null) {
            str2 = Log.getStackTraceString(th2);
            Intrinsics.checkNotNullExpressionValue(str2, "getStackTraceString(...)");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (remoteMessage != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("messageId", remoteMessage.getF97687a());
            for (Map.Entry<String, String> entry : remoteMessage.b().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (Intrinsics.d(key, CommentV3DTO.HEADER_FIELD_NAME) || Intrinsics.d(key, SelectionItemFormDTO.TITLE_FIELD_NAME)) {
                    value = f98782b.replace(value, "*");
                }
                jSONObject.put(key, value);
            }
            str3 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
        } else {
            str3 = null;
        }
        h hVar = f98781a;
        if (hVar != null) {
            String c11 = C2942q.c(C2942q.e(str, " "), (String) function0.invoke(), "toString(...)");
            if (map == null) {
                map = U.c();
            }
            LinkedHashMap u11 = U.u(map);
            u11.put("stack_trace", str2);
            if (str3 != null) {
                u11.put("original_message", str3);
            }
            Unit unit = Unit.f71690a;
            h.a.a(hVar, c11, f.a(u11), null, 4);
        }
    }

    public static void d(h hVar) {
        f98781a = hVar;
    }

    public static void e(@NotNull String tag, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool, @NotNull Function0 message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        h hVar = f98781a;
        if (hVar != null) {
            hVar.b(C2942q.c(C2942q.e(tag, " "), (String) message.invoke(), "toString(...)"), aVar, bool);
        }
    }

    public static /* synthetic */ void f(String str, xj.a aVar, Function0 function0, int i11) {
        Boolean bool = Boolean.FALSE;
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        e(str, aVar, bool, function0);
    }
}
