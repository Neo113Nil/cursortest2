package P5;

import Q5.r;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ti.C6478h;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8813a = new b();

    public final Pair a(Request request, String str) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestBody body = request.body();
        if (body == null) {
            return TuplesKt.to(null, request);
        }
        if (!c(str)) {
            return TuplesKt.to(null, request);
        }
        C6478h c6478h = new C6478h();
        body.writeTo(c6478h);
        byte[] W02 = c6478h.W0();
        String str2 = new String(W02, Charsets.UTF_8);
        return TuplesKt.to(str2.length() <= 1024 ? str2 : null, request.newBuilder().method(request.method(), RequestBody.Companion.create$default(RequestBody.INSTANCE, W02, body.get$mediaType(), 0, 0, 6, (Object) null)).build());
    }

    public final Map b(Map headers, List allowlist) {
        Object obj;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(allowlist, "allowlist");
        Map createMapBuilder = MapsKt.createMapBuilder();
        for (Map.Entry entry : headers.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Iterator it = allowlist.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) obj).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                    break;
                }
            }
            String str3 = (String) obj;
            if (str3 != null) {
                createMapBuilder.put(str3, str2);
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    public final boolean c(String str) {
        if (str == null) {
            return false;
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "json", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "text/", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "javascript", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "xml", false, 2, (Object) null);
    }

    public final r d(String url, List rules) {
        Object obj;
        Regex f10;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Iterator it = rules.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r rVar = (r) obj;
            if (Intrinsics.areEqual(rVar.e(), url) || ((f10 = rVar.f()) != null && f10.containsMatchIn(url))) {
                break;
            }
        }
        return (r) obj;
    }

    public final String e(Response response, String str) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!c(str)) {
            return null;
        }
        String string = response.peekBody(4096L).string();
        if (string.length() <= 1024) {
            return string;
        }
        return null;
    }
}
