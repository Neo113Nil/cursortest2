package g6;

import T7.Y;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.twilio.voice.EventKeys;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: g6.K, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4339K {

    /* renamed from: i, reason: collision with root package name */
    public static final a f46964i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final String f46965j = C4339K.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final GraphRequest f46966a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f46967b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46968c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f46969d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONArray f46970e;

    /* renamed from: f, reason: collision with root package name */
    public final FacebookRequestError f46971f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONObject f46972g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONArray f46973h;

    /* renamed from: g6.K$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(List requests, HttpURLConnection httpURLConnection, C4357q c4357q) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            List list = requests;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C4339K((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, c4357q)));
            }
            return arrayList;
        }

        public final C4339K b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object NULL, Object obj) {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                FacebookRequestError a10 = FacebookRequestError.INSTANCE.a(jSONObject, obj, httpURLConnection);
                if (a10 != null) {
                    Log.e(C4339K.f46965j, a10.toString());
                    if (a10.getErrorCode() == 190) {
                        Y y10 = Y.f11042a;
                        if (Y.Z(graphRequest.m())) {
                            if (a10.getSubErrorCode() != 493) {
                                AccessToken.INSTANCE.i(null);
                            } else {
                                AccessToken.Companion companion = AccessToken.INSTANCE;
                                AccessToken e10 = companion.e();
                                if (Intrinsics.areEqual(e10 != null ? Boolean.valueOf(e10.N()) : null, Boolean.FALSE)) {
                                    companion.d();
                                }
                            }
                        }
                    }
                    return new C4339K(graphRequest, httpURLConnection, a10);
                }
                Object O10 = Y.O(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (O10 instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) O10;
                    return new C4339K(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (O10 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) O10;
                    return new C4339K(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new C4339K(graphRequest, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new C4357q(Intrinsics.stringPlus("Got unexpected object type in response, class: ", NULL.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List c(HttpURLConnection httpURLConnection, List list, Object obj) {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            int i10 = 0;
            if (size == 1) {
                GraphRequest graphRequest = (GraphRequest) list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put(EventKeys.ERROR_CODE, httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new C4339K(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e10)));
                } catch (JSONException e11) {
                    arrayList.add(new C4339K(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e11)));
                }
                if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    if (jSONArray2.length() == size) {
                        int length = jSONArray2.length();
                        if (length > 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                GraphRequest graphRequest2 = (GraphRequest) list.get(i10);
                                try {
                                    Object obj3 = ((JSONArray) obj2).get(i10);
                                    Intrinsics.checkNotNullExpressionValue(obj3, "obj");
                                    arrayList.add(b(graphRequest2, httpURLConnection, obj3, obj));
                                } catch (C4357q e12) {
                                    arrayList.add(new C4339K(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e12)));
                                } catch (JSONException e13) {
                                    arrayList.add(new C4339K(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e13)));
                                }
                                if (i11 >= length) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        return arrayList;
                    }
                }
                throw new C4357q("Unexpected number of results");
            }
            obj2 = obj;
            if (obj2 instanceof JSONArray) {
            }
            throw new C4357q("Unexpected number of results");
        }

        public final List d(InputStream inputStream, HttpURLConnection httpURLConnection, C4338J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            String v02 = Y.v0(inputStream);
            T7.J.f10993e.c(N.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(v02.length()), v02);
            return e(v02, httpURLConnection, requests);
        }

        public final List e(String responseString, HttpURLConnection httpURLConnection, C4338J requests) {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List c10 = c(httpURLConnection, requests, resultObject);
            T7.J.f10993e.c(N.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.n(), Integer.valueOf(responseString.length()), c10);
            return c10;
        }

        public final List f(HttpURLConnection connection, C4338J requests) {
            List a10;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            try {
                try {
                    if (!C4331C.F()) {
                        Log.e(C4339K.f46965j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new C4357q("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    InputStream errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    List d10 = d(errorStream, connection, requests);
                    Y.j(errorStream);
                    return d10;
                } catch (C4357q e10) {
                    T7.J.f10993e.c(N.REQUESTS, "Response", "Response <Error>: %s", e10);
                    a10 = a(requests, connection, e10);
                    Y.j(null);
                    return a10;
                } catch (Exception e11) {
                    T7.J.f10993e.c(N.REQUESTS, "Response", "Response <Error>: %s", e11);
                    a10 = a(requests, connection, new C4357q(e11));
                    Y.j(null);
                    return a10;
                }
            } catch (Throwable th2) {
                Y.j(null);
                throw th2;
            }
        }

        public a() {
        }
    }

    public C4339K(GraphRequest request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f46966a = request;
        this.f46967b = httpURLConnection;
        this.f46968c = str;
        this.f46969d = jSONObject;
        this.f46970e = jSONArray;
        this.f46971f = facebookRequestError;
        this.f46972g = jSONObject;
        this.f46973h = jSONArray;
    }

    public final FacebookRequestError b() {
        return this.f46971f;
    }

    public final JSONObject c() {
        return this.f46969d;
    }

    public final JSONObject d() {
        return this.f46972g;
    }

    public String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f46967b;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f46969d + ", error: " + this.f46971f + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4339K(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4339K(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4339K(GraphRequest request, HttpURLConnection httpURLConnection, FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
