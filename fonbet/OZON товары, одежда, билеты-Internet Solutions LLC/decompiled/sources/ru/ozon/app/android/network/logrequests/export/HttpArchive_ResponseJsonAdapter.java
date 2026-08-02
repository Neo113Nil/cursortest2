package ru.ozon.app.android.network.logrequests.export;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.logrequests.export.HttpArchive;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive_ResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Response;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/network/logrequests/export/HttpArchive$Response;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/network/logrequests/export/HttpArchive$Response;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Cookie;", "listOfCookieAdapter", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Header;", "listOfHeaderAdapter", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Content;", "nullableContentAdapter", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HttpArchive_ResponseJsonAdapter extends JsonAdapter<HttpArchive.Response> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<HttpArchive.Cookie>> listOfCookieAdapter;

    @NotNull
    private final JsonAdapter<List<HttpArchive.Header>> listOfHeaderAdapter;

    @NotNull
    private final JsonAdapter<HttpArchive.Content> nullableContentAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HttpArchive_ResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("status", "statusText", "httpVersion", "cookies", "headers", "content", "redirectURL", "headersSize", "bodySize");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "status");
        this.stringAdapter = moshi.f(String.class, m11, "statusText");
        this.listOfCookieAdapter = moshi.f(D.e(List.class, HttpArchive.Cookie.class), m11, "cookies");
        this.listOfHeaderAdapter = moshi.f(D.e(List.class, HttpArchive.Header.class), m11, "headers");
        this.nullableContentAdapter = moshi.f(HttpArchive.Content.class, m11, "content");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(HttpArchive.Response)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HttpArchive.Response fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        List<HttpArchive.Cookie> list = null;
        List<HttpArchive.Header> list2 = null;
        HttpArchive.Content content = null;
        String str3 = null;
        while (true) {
            Integer num4 = num;
            Integer num5 = num2;
            Integer num6 = num3;
            String str4 = str;
            if (!reader.hasNext()) {
                reader.endObject();
                if (num4 == null) {
                    throw c.j("status", "status", reader);
                }
                int intValue = num4.intValue();
                if (str4 == null) {
                    throw c.j("statusText", "statusText", reader);
                }
                if (str2 == null) {
                    throw c.j("httpVersion", "httpVersion", reader);
                }
                if (list == null) {
                    throw c.j("cookies", "cookies", reader);
                }
                if (list2 == null) {
                    throw c.j("headers", "headers", reader);
                }
                if (str3 == null) {
                    throw c.j("redirectURL", "redirectURL", reader);
                }
                if (num5 == null) {
                    throw c.j("headersSize", "headersSize", reader);
                }
                int intValue2 = num5.intValue();
                if (num6 != null) {
                    return new HttpArchive.Response(intValue, str4, str2, list, list2, content, str3, intValue2, num6.intValue());
                }
                throw c.j("bodySize", "bodySize", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str = str4;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("status", "status", reader);
                    }
                    num2 = num5;
                    num3 = num6;
                    str = str4;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("statusText", "statusText", reader);
                    }
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("httpVersion", "httpVersion", reader);
                    }
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str = str4;
                case 3:
                    list = this.listOfCookieAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cookies", "cookies", reader);
                    }
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str = str4;
                case 4:
                    list2 = this.listOfHeaderAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("headers", "headers", reader);
                    }
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str = str4;
                case 5:
                    content = this.nullableContentAdapter.fromJson(reader);
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str = str4;
                case 6:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("redirectURL", "redirectURL", reader);
                    }
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str = str4;
                case 7:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("headersSize", "headersSize", reader);
                    }
                    num = num4;
                    num3 = num6;
                    str = str4;
                case 8:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("bodySize", "bodySize", reader);
                    }
                    num = num4;
                    num2 = num5;
                    str = str4;
                default:
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HttpArchive.Response value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("status");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getStatus()));
        writer.w("statusText");
        this.stringAdapter.mo44toJson(writer, (x) value.getStatusText());
        writer.w("httpVersion");
        this.stringAdapter.mo44toJson(writer, (x) value.getHttpVersion());
        writer.w("cookies");
        this.listOfCookieAdapter.mo44toJson(writer, (x) value.getCookies());
        writer.w("headers");
        this.listOfHeaderAdapter.mo44toJson(writer, (x) value.getHeaders());
        writer.w("content");
        this.nullableContentAdapter.mo44toJson(writer, (x) value.getContent());
        writer.w("redirectURL");
        this.stringAdapter.mo44toJson(writer, (x) value.getRedirectURL());
        writer.w("headersSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getHeadersSize()));
        writer.w("bodySize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getBodySize()));
        writer.p();
    }
}
