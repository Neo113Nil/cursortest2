package okhttp3.internal.http;

import com.twilio.voice.EventKeys;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import ti.C6478h;
import ti.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lti/h;", "", "result", "", "readChallengeHeader", "(Lti/h;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lti/h;)Z", "", "prefix", "startsWith", "(Lti/h;B)Z", "readQuotedString", "(Lti/h;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", EventKeys.URL, "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lti/k;", "QUOTED_STRING_DELIMITERS", "Lti/k;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "HttpHeaders")
/* loaded from: classes5.dex */
public final class HttpHeaders {

    @NotNull
    private static final k QUOTED_STRING_DELIMITERS;

    @NotNull
    private static final k TOKEN_DELIMITERS;

    static {
        k.a aVar = k.f65867c;
        QUOTED_STRING_DELIMITERS = aVar.g("\"\\");
        TOKEN_DELIMITERS = aVar.g("\t ,=");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.equals(headerName, headers.name(i10), true)) {
                try {
                    readChallengeHeader(new C6478h().h0(headers.value(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !StringsKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(C6478h c6478h, List<Challenge> list) {
        String readToken;
        int skipAll;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipCommasAndWhitespace(c6478h);
                    str = readToken(c6478h);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(c6478h);
                readToken = readToken(c6478h);
                if (readToken == null) {
                    if (c6478h.X0()) {
                        list.add(new Challenge(str, (Map<String, String>) MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                skipAll = Util.skipAll(c6478h, Base64.padSymbol);
                boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(c6478h);
                if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !c6478h.X0())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int skipAll2 = skipAll + Util.skipAll(c6478h, Base64.padSymbol);
                    while (true) {
                        if (readToken == null) {
                            readToken = readToken(c6478h);
                            if (!skipCommasAndWhitespace(c6478h)) {
                                skipAll2 = Util.skipAll(c6478h, Base64.padSymbol);
                            }
                        }
                        if (skipAll2 != 0) {
                            if (skipAll2 > 1 || skipCommasAndWhitespace(c6478h)) {
                                return;
                            }
                            String readQuotedString = startsWith(c6478h, (byte) 34) ? readQuotedString(c6478h) : readToken(c6478h);
                            if (readQuotedString == null || ((String) linkedHashMap.put(readToken, readQuotedString)) != null) {
                                return;
                            }
                            if (!skipCommasAndWhitespace(c6478h) && !c6478h.X0()) {
                                return;
                            } else {
                                readToken = null;
                            }
                        }
                    }
                    list.add(new Challenge(str, linkedHashMap));
                    str = readToken;
                }
            }
            Map singletonMap = Collections.singletonMap(null, readToken + StringsKt.repeat("=", skipAll));
            Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(C6478h c6478h) {
        if (c6478h.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C6478h c6478h2 = new C6478h();
        while (true) {
            long f12 = c6478h.f1(QUOTED_STRING_DELIMITERS);
            if (f12 == -1) {
                return null;
            }
            if (c6478h.A0(f12) == 34) {
                c6478h2.write(c6478h, f12);
                c6478h.readByte();
                return c6478h2.G1();
            }
            if (c6478h.size() == f12 + 1) {
                return null;
            }
            c6478h2.write(c6478h, f12);
            c6478h.readByte();
            c6478h2.write(c6478h, 1L);
        }
    }

    private static final String readToken(C6478h c6478h) {
        long f12 = c6478h.f1(TOKEN_DELIMITERS);
        if (f12 == -1) {
            f12 = c6478h.size();
        }
        if (f12 != 0) {
            return c6478h.c2(f12);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl url, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.INSTANCE.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(C6478h c6478h) {
        boolean z10 = false;
        while (!c6478h.X0()) {
            byte A02 = c6478h.A0(0L);
            if (A02 == 44) {
                c6478h.readByte();
                z10 = true;
            } else {
                if (A02 != 32 && A02 != 9) {
                    break;
                }
                c6478h.readByte();
            }
        }
        return z10;
    }

    private static final boolean startsWith(C6478h c6478h, byte b10) {
        return !c6478h.X0() && c6478h.A0(0L) == b10;
    }
}
