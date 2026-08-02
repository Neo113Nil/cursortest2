package ru.ozon.fintech.analytic.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/fintech/analytic/models/GraylogDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/GraylogData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/GraylogData;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/GraylogData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraylogDataJsonAdapter extends JsonAdapter<GraylogData> {
    private volatile Constructor<GraylogData> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public GraylogDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("userId", "app_version", "service", "ts", "message", "env", "platform", "tag", "data", "delay", "uuid", "session_id", "team", "tab_id", "webview", ImagesContract.URL, "asset_url", "error_desc", "error_code", "status", "vpn", "network_type", "first_launch", "model", "manufacturer", "perm_post_notifications", "perm_camera", "perm_access_location", "perm_read_contacts", "perm_use_biometric", "platform_version", "ozonID_session_id", "push_type", "pins_data", "pins_sign_data", "pub_key", "result", "pins_type", "pins_hashes", "certs_chain", "logs_count", "store_name", "need_update", "rustore_status", "gms_status", "ozon_sdk_status", "barcode_recognition_type", "barcode_recognition_source", "barcode_recognition_available_types", "cluster_name", "region_name", "city_name");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "userId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "tag");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "delay");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "vpn");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(GraylogData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GraylogData fromJson(@NotNull n reader) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        int i13 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Integer num = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Integer num2 = null;
        String str18 = null;
        Boolean bool = null;
        String str19 = null;
        Boolean bool2 = null;
        String str20 = null;
        String str21 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        Boolean bool8 = null;
        String str28 = null;
        String str29 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        Boolean bool9 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        Integer num3 = null;
        String str36 = null;
        Integer num4 = null;
        String str37 = null;
        String str38 = null;
        String str39 = null;
        int i14 = -1;
        while (true) {
            String str40 = str2;
            String str41 = str3;
            String str42 = str4;
            String str43 = str5;
            String str44 = str6;
            String str45 = str7;
            String str46 = str9;
            String str47 = str10;
            if (!reader.hasNext()) {
                Integer num5 = num;
                reader.endObject();
                if (i13 == 63 && i14 == -1048576) {
                    if (str40 == null) {
                        throw c.j("userId", "userId", reader);
                    }
                    if (str41 == null) {
                        throw c.j("appVersion", "app_version", reader);
                    }
                    if (str42 == null) {
                        throw c.j("service", "service", reader);
                    }
                    if (str43 == null) {
                        throw c.j("timestamp", "ts", reader);
                    }
                    if (str44 == null) {
                        throw c.j("message", "message", reader);
                    }
                    if (str45 == null) {
                        throw c.j("env", "env", reader);
                    }
                    Intrinsics.g(str8, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.g(str11, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
                    String str48 = str21;
                    String str49 = str20;
                    Boolean bool10 = bool2;
                    String str50 = str19;
                    Boolean bool11 = bool;
                    String str51 = str18;
                    Integer num6 = num2;
                    String str52 = str17;
                    String str53 = str16;
                    String str54 = str15;
                    return new GraylogData(str40, str41, str42, str43, str44, str45, str8, str46, str47, num5, str11, str12, str, str13, str14, str54, str53, str52, num6, str51, bool11, str50, bool10, str49, str48, bool3, bool4, bool5, bool6, bool7, str22, str23, str24, str25, str26, str27, bool8, str28, str29, str30, str31, str32, bool9, str33, str34, str35, num3, str36, num4, str37, str38, str39);
                }
                String str55 = str13;
                String str56 = str;
                String str57 = str21;
                String str58 = str20;
                Boolean bool12 = bool2;
                String str59 = str19;
                Boolean bool13 = bool;
                String str60 = str18;
                Integer num7 = num2;
                String str61 = str17;
                String str62 = str16;
                String str63 = str15;
                String str64 = str14;
                Constructor<GraylogData> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    i11 = i13;
                    constructor = GraylogData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Boolean.class, String.class, Boolean.class, String.class, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, String.class, String.class, String.class, cls2, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i13;
                }
                if (str40 == null) {
                    throw c.j("userId", "userId", reader);
                }
                if (str41 == null) {
                    throw c.j("appVersion", "app_version", reader);
                }
                if (str42 == null) {
                    throw c.j("service", "service", reader);
                }
                if (str43 == null) {
                    throw c.j("timestamp", "ts", reader);
                }
                if (str44 == null) {
                    throw c.j("message", "message", reader);
                }
                if (str45 == null) {
                    throw c.j("env", "env", reader);
                }
                GraylogData newInstance = constructor.newInstance(str40, str41, str42, str43, str44, str45, str8, str46, str47, num5, str11, str12, str56, str55, str64, str63, str62, str61, num7, str60, bool13, str59, bool12, str58, str57, bool3, bool4, bool5, bool6, bool7, str22, str23, str24, str25, str26, str27, bool8, str28, str29, str30, str31, str32, bool9, str33, str34, str35, num3, str36, num4, str37, str38, str39, Integer.valueOf(i11), Integer.valueOf(i14), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Integer num8 = num;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("userId", "userId", reader);
                    }
                    num = num8;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("appVersion", "app_version", reader);
                    }
                    str3 = fromJson;
                    num = num8;
                    str2 = str40;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 2:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("service", "service", reader);
                    }
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 3:
                    String fromJson2 = this.stringAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        throw c.q("timestamp", "ts", reader);
                    }
                    str5 = fromJson2;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 4:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("message", "message", reader);
                    }
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 5:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("env", "env", reader);
                    }
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str9 = str46;
                    str10 = str47;
                case 6:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("platform", "platform", reader);
                    }
                    i13 &= -65;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 7:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -129;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str10 = str47;
                case 8:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -257;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                case 9:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -513;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 10:
                    str11 = this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        throw c.q("uuid", "uuid", reader);
                    }
                    i13 &= -1025;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 11:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2049;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 12:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("team", "team", reader);
                    }
                    i13 &= -4097;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 13:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -8193;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 14:
                    str14 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -16385;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 15:
                    str15 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -32769;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 16:
                    str16 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -65537;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 17:
                    str17 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -131073;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 18:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -262145;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 19:
                    str18 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -524289;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 20:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -1048577;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 21:
                    str19 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -2097153;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 22:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -4194305;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 23:
                    str20 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -8388609;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 24:
                    str21 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -16777217;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -33554433;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -67108865;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -134217729;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 28:
                    bool6 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -268435457;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 29:
                    bool7 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 = -536870913;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    str22 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -1073741825;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str23 = this.nullableStringAdapter.fromJson(reader);
                    i12 = Integer.MAX_VALUE;
                    i13 &= i12;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 32:
                    str24 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 33:
                    str25 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -3;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 34:
                    str26 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -5;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    str27 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -9;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    bool8 = this.nullableBooleanAdapter.fromJson(reader);
                    i14 &= -17;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    str28 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -33;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 38:
                    str29 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -65;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    str30 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -129;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 40:
                    str31 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -257;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 41:
                    str32 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -513;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 42:
                    bool9 = this.nullableBooleanAdapter.fromJson(reader);
                    i14 &= -1025;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 43:
                    str33 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -2049;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    str34 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -4097;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    str35 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -8193;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 46:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -16385;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 47:
                    str36 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -32769;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 48:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i14 &= -65537;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 49:
                    str37 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -131073;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 50:
                    str38 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -262145;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                case 51:
                    str39 = this.nullableStringAdapter.fromJson(reader);
                    i14 &= -524289;
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
                default:
                    num = num8;
                    str2 = str40;
                    str3 = str41;
                    str4 = str42;
                    str5 = str43;
                    str6 = str44;
                    str7 = str45;
                    str9 = str46;
                    str10 = str47;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GraylogData value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("userId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getUserId());
        writer.w("app_version");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppVersion());
        writer.w("service");
        this.stringAdapter.mo44toJson(writer, (x) value_.getService());
        writer.w("ts");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTimestamp());
        writer.w("message");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMessage());
        writer.w("env");
        this.stringAdapter.mo44toJson(writer, (x) value_.getEnv());
        writer.w("platform");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPlatform());
        writer.w("tag");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTag());
        writer.w("data");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getData());
        writer.w("delay");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getDelay());
        writer.w("uuid");
        this.stringAdapter.mo44toJson(writer, (x) value_.getUuid());
        writer.w("session_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSessionId());
        writer.w("team");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTeam());
        writer.w("tab_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTabId());
        writer.w("webview");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getWebViewVersion());
        writer.w(ImagesContract.URL);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.w("asset_url");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAssetUrl());
        writer.w("error_desc");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getErrorDescription());
        writer.w("error_code");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getErrorCode());
        writer.w("status");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("vpn");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getVpn());
        writer.w("network_type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getNetworkType());
        writer.w("first_launch");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getFirstLaunch());
        writer.w("model");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getModel());
        writer.w("manufacturer");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getManufacturer());
        writer.w("perm_post_notifications");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermPostNotification());
        writer.w("perm_camera");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermCamera());
        writer.w("perm_access_location");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermAccessLocation());
        writer.w("perm_read_contacts");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermReadContacts());
        writer.w("perm_use_biometric");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPermUseBiometric());
        writer.w("platform_version");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPlatformVersion());
        writer.w("ozonID_session_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOzonIdSessionId());
        writer.w("push_type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPushType());
        writer.w("pins_data");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPins());
        writer.w("pins_sign_data");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSign());
        writer.w("pub_key");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPubKey());
        writer.w("result");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getResult());
        writer.w("pins_type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPinsType());
        writer.w("pins_hashes");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPinsHashes());
        writer.w("certs_chain");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCertsChain());
        writer.w("logs_count");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLogsCount());
        writer.w("store_name");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStoreName());
        writer.w("need_update");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getNeedUpdate());
        writer.w("rustore_status");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRustoreStatus());
        writer.w("gms_status");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getGmsStatus());
        writer.w("ozon_sdk_status");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOzonSdkStatus());
        writer.w("barcode_recognition_type");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getBarcodeRecognitionType());
        writer.w("barcode_recognition_source");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBarcodeRecognitionSource());
        writer.w("barcode_recognition_available_types");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getBarcodeRecognitionAvailableTypes());
        writer.w("cluster_name");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getClusterName());
        writer.w("region_name");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRegionName());
        writer.w("city_name");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCityName());
        writer.p();
    }
}
