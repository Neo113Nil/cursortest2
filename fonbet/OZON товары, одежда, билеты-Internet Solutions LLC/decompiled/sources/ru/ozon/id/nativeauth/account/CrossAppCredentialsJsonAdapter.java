package ru.ozon.id.nativeauth.account;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/id/nativeauth/account/CrossAppCredentialsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/account/CrossAppCredentials;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/account/CrossAppCredentials;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/account/CrossAppCredentials;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppCredentialsJsonAdapter extends JsonAdapter<CrossAppCredentials> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CrossAppCredentials> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CrossAppCredentialsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("createdAt", "appName", "appPackage", "cookiesData", "fromOldFormat");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Long> f7 = moshi.f(Long.TYPE, m11, "createdAt");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.longAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "appName");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.TYPE, m11, "fromOldFormat");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.booleanAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(CrossAppCredentials)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CrossAppCredentials fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("createdAt", "createdAt", reader);
                }
                i11 = -2;
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("appName", "appName", reader);
                }
            } else if (v11 == 2) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("appPackage", "appPackage", reader);
                }
            } else if (v11 == 3) {
                str3 = this.stringAdapter.fromJson(reader);
                if (str3 == null) {
                    throw c.q("cookiesData", "cookiesData", reader);
                }
            } else if (v11 == 4 && (bool = this.booleanAdapter.fromJson(reader)) == null) {
                throw c.q("fromOldFormat", "fromOldFormat", reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Boolean bool2 = bool;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            long longValue = l11.longValue();
            if (str4 == null) {
                throw c.j("appName", "appName", reader);
            }
            if (str5 == null) {
                throw c.j("appPackage", "appPackage", reader);
            }
            if (str6 == null) {
                throw c.j("cookiesData", "cookiesData", reader);
            }
            if (bool2 != null) {
                return new CrossAppCredentials(longValue, str4, str5, str6, bool2.booleanValue());
            }
            throw c.j("fromOldFormat", "fromOldFormat", reader);
        }
        String str7 = str2;
        Boolean bool3 = bool;
        String str8 = str;
        String str9 = str3;
        Constructor<CrossAppCredentials> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CrossAppCredentials.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CrossAppCredentials> constructor2 = constructor;
        if (str8 == null) {
            throw c.j("appName", "appName", reader);
        }
        if (str7 == null) {
            throw c.j("appPackage", "appPackage", reader);
        }
        if (str9 == null) {
            throw c.j("cookiesData", "cookiesData", reader);
        }
        if (bool3 == null) {
            throw c.j("fromOldFormat", "fromOldFormat", reader);
        }
        CrossAppCredentials newInstance = constructor2.newInstance(l11, str8, str7, str9, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CrossAppCredentials value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("createdAt");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getCreatedAt()));
        writer.w("appName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppName());
        writer.w("appPackage");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppPackage());
        writer.w("cookiesData");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCookiesData());
        writer.w("fromOldFormat");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getFromOldFormat()));
        writer.p();
    }
}
