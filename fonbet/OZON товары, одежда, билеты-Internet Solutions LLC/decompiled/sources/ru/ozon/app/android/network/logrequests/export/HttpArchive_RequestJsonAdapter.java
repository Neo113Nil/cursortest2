package ru.ozon.app.android.network.logrequests.export;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.logrequests.export.HttpArchive;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive_RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/network/logrequests/export/HttpArchive$Request;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/network/logrequests/export/HttpArchive$Request;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Cookie;", "listOfCookieAdapter", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Header;", "listOfHeaderAdapter", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Query;", "listOfQueryAdapter", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$PostData;", "nullablePostDataAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HttpArchive_RequestJsonAdapter extends JsonAdapter<HttpArchive.Request> {
    private volatile Constructor<HttpArchive.Request> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<HttpArchive.Cookie>> listOfCookieAdapter;

    @NotNull
    private final JsonAdapter<List<HttpArchive.Header>> listOfHeaderAdapter;

    @NotNull
    private final JsonAdapter<List<HttpArchive.Query>> listOfQueryAdapter;

    @NotNull
    private final JsonAdapter<HttpArchive.PostData> nullablePostDataAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HttpArchive_RequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("method", ImagesContract.URL, "httpVersion", "cookies", "headers", "queryString", "postData", "headersSize", "bodySize");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "method");
        this.listOfCookieAdapter = moshi.f(D.e(List.class, HttpArchive.Cookie.class), m11, "cookies");
        this.listOfHeaderAdapter = moshi.f(D.e(List.class, HttpArchive.Header.class), m11, "headers");
        this.listOfQueryAdapter = moshi.f(D.e(List.class, HttpArchive.Query.class), m11, "queryString");
        this.nullablePostDataAdapter = moshi.f(HttpArchive.PostData.class, m11, "postData");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "headersSize");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(HttpArchive.Request)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HttpArchive.Request fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<HttpArchive.Cookie> list = null;
        List<HttpArchive.Header> list2 = null;
        List<HttpArchive.Query> list3 = null;
        HttpArchive.PostData postData = null;
        Integer num = null;
        Integer num2 = null;
        while (true) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (!reader.hasNext()) {
                List<HttpArchive.Header> list4 = list2;
                reader.endObject();
                if (i11 == -73) {
                    if (str4 == null) {
                        throw c.j("method", "method", reader);
                    }
                    if (str5 == null) {
                        throw c.j(ImagesContract.URL, ImagesContract.URL, reader);
                    }
                    if (str6 == null) {
                        throw c.j("httpVersion", "httpVersion", reader);
                    }
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.network.logrequests.export.HttpArchive.Cookie>");
                    if (list4 == null) {
                        throw c.j("headers", "headers", reader);
                    }
                    if (list3 == null) {
                        throw c.j("queryString", "queryString", reader);
                    }
                    if (num == null) {
                        throw c.j("headersSize", "headersSize", reader);
                    }
                    Integer num3 = num2;
                    int intValue = num.intValue();
                    if (num3 == null) {
                        throw c.j("bodySize", "bodySize", reader);
                    }
                    return new HttpArchive.Request(str4, str5, str6, list, list4, list3, postData, intValue, num3.intValue());
                }
                Integer num4 = num2;
                Constructor<HttpArchive.Request> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    constructor = HttpArchive.Request.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, List.class, List.class, HttpArchive.PostData.class, cls2, cls2, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                }
                if (str4 == null) {
                    throw c.j("method", "method", reader);
                }
                if (str5 == null) {
                    throw c.j(ImagesContract.URL, ImagesContract.URL, reader);
                }
                if (str6 == null) {
                    throw c.j("httpVersion", "httpVersion", reader);
                }
                if (list4 == null) {
                    throw c.j("headers", "headers", reader);
                }
                if (list3 == null) {
                    throw c.j("queryString", "queryString", reader);
                }
                if (num == null) {
                    throw c.j("headersSize", "headersSize", reader);
                }
                if (num4 == null) {
                    throw c.j("bodySize", "bodySize", reader);
                }
                HttpArchive.Request newInstance = constructor.newInstance(str4, str5, str6, list, list4, list3, postData, num, num4, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            List<HttpArchive.Header> list5 = list2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("method", "method", reader);
                    }
                    list2 = list5;
                    str2 = str5;
                    str3 = str6;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q(ImagesContract.URL, ImagesContract.URL, reader);
                    }
                    list2 = list5;
                    str = str4;
                    str3 = str6;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("httpVersion", "httpVersion", reader);
                    }
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                case 3:
                    list = this.listOfCookieAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cookies", "cookies", reader);
                    }
                    i11 &= -9;
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 4:
                    list2 = this.listOfHeaderAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("headers", "headers", reader);
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 5:
                    list3 = this.listOfQueryAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("queryString", "queryString", reader);
                    }
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 6:
                    postData = this.nullablePostDataAdapter.fromJson(reader);
                    i11 &= -65;
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 7:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("headersSize", "headersSize", reader);
                    }
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                case 8:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("bodySize", "bodySize", reader);
                    }
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                default:
                    list2 = list5;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HttpArchive.Request value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("method");
        this.stringAdapter.mo44toJson(writer, (x) value.getMethod());
        writer.w(ImagesContract.URL);
        this.stringAdapter.mo44toJson(writer, (x) value.getUrl());
        writer.w("httpVersion");
        this.stringAdapter.mo44toJson(writer, (x) value.getHttpVersion());
        writer.w("cookies");
        this.listOfCookieAdapter.mo44toJson(writer, (x) value.getCookies());
        writer.w("headers");
        this.listOfHeaderAdapter.mo44toJson(writer, (x) value.getHeaders());
        writer.w("queryString");
        this.listOfQueryAdapter.mo44toJson(writer, (x) value.getQueryString());
        writer.w("postData");
        this.nullablePostDataAdapter.mo44toJson(writer, (x) value.getPostData());
        writer.w("headersSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getHeadersSize()));
        writer.w("bodySize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getBodySize()));
        writer.p();
    }
}
