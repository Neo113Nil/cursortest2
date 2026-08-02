package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.headers;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/headers/GetHeadersRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/headers/GetHeadersRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/headers/GetHeadersRequest;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/headers/GetHeadersRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetHeadersRequestJsonAdapter extends JsonAdapter<GetHeadersRequest> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public GetHeadersRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("x-app-version", "x-o3-device-type", "x-o3-app-name", "x-o3-app-version", "x-device-status", "x-ob-sessionid", "x-ob-model-device", "x-app-uuid", "x-ob-theme", "Sec-CH-Prefers-Color-Scheme", "x-o3-device-language", "x-ob-osver", "x-ob-interface-scale", "x-ob-insets", "x-ob-user-appsflyer-id", "x-o3-internal-headers-token", "x-o3-ab-variants", "ob-testing-features", "ob-testing-features-v2", "is-mobile-autotests", "x-o3-ob-testing-auth-ttl", "x-o3-test-name", "x-o3-meshversion", "x-fe-ob-features-mock", "x-o3-sample-trace", "x-ad-params");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "appVersion");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "xObSessionId");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "isAutotests");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(GetHeadersRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GetHeadersRequest fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        Boolean bool = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        while (true) {
            String str26 = str;
            String str27 = str2;
            String str28 = str3;
            String str29 = str4;
            String str30 = str5;
            String str31 = str6;
            String str32 = str7;
            String str33 = str8;
            String str34 = str9;
            String str35 = str10;
            if (!reader.hasNext()) {
                String str36 = str11;
                reader.endObject();
                if (str26 == null) {
                    throw c.j("appVersion", "x-app-version", reader);
                }
                if (str27 == null) {
                    throw c.j("o3DeviceType", "x-o3-device-type", reader);
                }
                if (str28 == null) {
                    throw c.j("o3AppName", "x-o3-app-name", reader);
                }
                if (str29 == null) {
                    throw c.j("o3AppVersion", "x-o3-app-version", reader);
                }
                if (str30 == null) {
                    throw c.j("xDeviceStatus", "x-device-status", reader);
                }
                if (str16 != null) {
                    return new GetHeadersRequest(str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str12, str13, str14, str15, str16, str17, str18, str19, bool, str20, str21, str22, str23, str24, str25);
                }
                throw c.j("o3InternalHeaderToken", "x-o3-internal-headers-token", reader);
            }
            String str37 = str11;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("appVersion", "x-app-version", reader);
                    }
                    str11 = str37;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("o3DeviceType", "x-o3-device-type", reader);
                    }
                    str2 = fromJson;
                    str11 = str37;
                    str = str26;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 2:
                    String fromJson2 = this.stringAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        throw c.q("o3AppName", "x-o3-app-name", reader);
                    }
                    str3 = fromJson2;
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("o3AppVersion", "x-o3-app-version", reader);
                    }
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("xDeviceStatus", "x-device-status", reader);
                    }
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 7:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str9 = str34;
                    str10 = str35;
                case 8:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str10 = str35;
                case 9:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                case 10:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 11:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 12:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 13:
                    str14 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 14:
                    str15 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 15:
                    str16 = this.stringAdapter.fromJson(reader);
                    if (str16 == null) {
                        throw c.q("o3InternalHeaderToken", "x-o3-internal-headers-token", reader);
                    }
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 16:
                    str17 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 17:
                    str18 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 18:
                    str19 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 19:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 20:
                    str20 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 21:
                    str21 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 22:
                    str22 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 23:
                    str23 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case 24:
                    str24 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    str25 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
                default:
                    str11 = str37;
                    str = str26;
                    str2 = str27;
                    str3 = str28;
                    str4 = str29;
                    str5 = str30;
                    str6 = str31;
                    str7 = str32;
                    str8 = str33;
                    str9 = str34;
                    str10 = str35;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GetHeadersRequest value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("x-app-version");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppVersion());
        writer.w("x-o3-device-type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getO3DeviceType());
        writer.w("x-o3-app-name");
        this.stringAdapter.mo44toJson(writer, (x) value_.getO3AppName());
        writer.w("x-o3-app-version");
        this.stringAdapter.mo44toJson(writer, (x) value_.getO3AppVersion());
        writer.w("x-device-status");
        this.stringAdapter.mo44toJson(writer, (x) value_.getXDeviceStatus());
        writer.w("x-ob-sessionid");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXObSessionId());
        writer.w("x-ob-model-device");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXObModelDevice());
        writer.w("x-app-uuid");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXAppUuid());
        writer.w("x-ob-theme");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXObTheme());
        writer.w("Sec-CH-Prefers-Color-Scheme");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAdditionalTheme());
        writer.w("x-o3-device-language");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLanguage());
        writer.w("x-ob-osver");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXObOsVer());
        writer.w("x-ob-interface-scale");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getInterfaceScale());
        writer.w("x-ob-insets");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getInsets());
        writer.w("x-ob-user-appsflyer-id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXO3AppsflyerId());
        writer.w("x-o3-internal-headers-token");
        this.stringAdapter.mo44toJson(writer, (x) value_.getO3InternalHeaderToken());
        writer.w("x-o3-ab-variants");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAbVariants());
        writer.w("ob-testing-features");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTestingFeatures());
        writer.w("ob-testing-features-v2");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTestingFeaturesV2());
        writer.w("is-mobile-autotests");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isAutotests());
        writer.w("x-o3-ob-testing-auth-ttl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTestingAuthTtl());
        writer.w("x-o3-test-name");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getO3TestName());
        writer.w("x-o3-meshversion");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXO3MeshVersion());
        writer.w("x-fe-ob-features-mock");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXFeObFeaturesMock());
        writer.w("x-o3-sample-trace");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSampleTraceHeader());
        writer.w("x-ad-params");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getXAdParams());
        writer.p();
    }
}
