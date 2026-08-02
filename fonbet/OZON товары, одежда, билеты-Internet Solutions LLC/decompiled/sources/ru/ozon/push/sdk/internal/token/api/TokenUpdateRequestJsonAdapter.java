package ru.ozon.push.sdk.internal.token.api;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$ApplicationInfo;", "applicationInfoAdapter", "", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo;", "setOfTokenInfoAdapter", "", "intAdapter", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$a;", "authorizationAdapter", "", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$b;", "listOfPermissionAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenUpdateRequestJsonAdapter extends JsonAdapter<TokenUpdateRequest> {

    @NotNull
    private final JsonAdapter<TokenUpdateRequest.ApplicationInfo> applicationInfoAdapter;

    @NotNull
    private final JsonAdapter<TokenUpdateRequest.a> authorizationAdapter;
    private volatile Constructor<TokenUpdateRequest> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<TokenUpdateRequest.b>> listOfPermissionAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Set<TokenUpdateRequest.TokenInfo>> setOfTokenInfoAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TokenUpdateRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("hwid", "hwidold", "application", "tokens", "tzOffset", "authorization", "permissions", "deviceModel", "microphone_permission", "is_teens_mode");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "hwid");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "oldHwId");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<TokenUpdateRequest.ApplicationInfo> f12 = moshi.f(TokenUpdateRequest.ApplicationInfo.class, m11, "application");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.applicationInfoAdapter = f12;
        JsonAdapter<Set<TokenUpdateRequest.TokenInfo>> f13 = moshi.f(D.e(Set.class, TokenUpdateRequest.TokenInfo.class), m11, "tokens");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.setOfTokenInfoAdapter = f13;
        JsonAdapter<Integer> f14 = moshi.f(Integer.TYPE, m11, "tzOffset");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.intAdapter = f14;
        JsonAdapter<TokenUpdateRequest.a> f15 = moshi.f(TokenUpdateRequest.a.class, m11, "authorization");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.authorizationAdapter = f15;
        JsonAdapter<List<TokenUpdateRequest.b>> f16 = moshi.f(D.e(List.class, TokenUpdateRequest.b.class), m11, "permissions");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.listOfPermissionAdapter = f16;
        JsonAdapter<Boolean> f17 = moshi.f(Boolean.class, m11, "isTeensModeEnabled");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableBooleanAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(TokenUpdateRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TokenUpdateRequest fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        TokenUpdateRequest.ApplicationInfo applicationInfo = null;
        Set<TokenUpdateRequest.TokenInfo> set = null;
        Integer num = null;
        TokenUpdateRequest.a aVar = null;
        List<TokenUpdateRequest.b> list = null;
        String str3 = null;
        Integer num2 = null;
        Boolean bool = null;
        while (true) {
            String str4 = str;
            String str5 = str2;
            TokenUpdateRequest.ApplicationInfo applicationInfo2 = applicationInfo;
            Set<TokenUpdateRequest.TokenInfo> set2 = set;
            Integer num3 = num;
            TokenUpdateRequest.a aVar2 = aVar;
            if (!reader.hasNext()) {
                List<TokenUpdateRequest.b> list2 = list;
                reader.endObject();
                if (i12 == -3) {
                    if (str4 == null) {
                        throw c.j("hwid", "hwid", reader);
                    }
                    if (applicationInfo2 == null) {
                        throw c.j("application", "application", reader);
                    }
                    if (set2 == null) {
                        throw c.j("tokens", "tokens", reader);
                    }
                    if (num3 == null) {
                        throw c.j("tzOffset", "tzOffset", reader);
                    }
                    int intValue = num3.intValue();
                    if (aVar2 == null) {
                        throw c.j("authorization", "authorization", reader);
                    }
                    if (list2 == null) {
                        throw c.j("permissions", "permissions", reader);
                    }
                    if (str3 == null) {
                        throw c.j("deviceModel", "deviceModel", reader);
                    }
                    if (num2 == null) {
                        throw c.j("microphonePermission", "microphone_permission", reader);
                    }
                    return new TokenUpdateRequest(str4, str5, applicationInfo2, set2, intValue, aVar2, list2, str3, num2.intValue(), bool);
                }
                Constructor<TokenUpdateRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    i11 = i12;
                    constructor = TokenUpdateRequest.class.getDeclaredConstructor(String.class, String.class, TokenUpdateRequest.ApplicationInfo.class, Set.class, cls2, TokenUpdateRequest.a.class, List.class, String.class, cls2, Boolean.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<TokenUpdateRequest> constructor2 = constructor;
                if (str4 == null) {
                    throw c.j("hwid", "hwid", reader);
                }
                if (applicationInfo2 == null) {
                    throw c.j("application", "application", reader);
                }
                if (set2 == null) {
                    throw c.j("tokens", "tokens", reader);
                }
                if (num3 == null) {
                    throw c.j("tzOffset", "tzOffset", reader);
                }
                if (aVar2 == null) {
                    throw c.j("authorization", "authorization", reader);
                }
                if (list2 == null) {
                    throw c.j("permissions", "permissions", reader);
                }
                if (str3 == null) {
                    throw c.j("deviceModel", "deviceModel", reader);
                }
                if (num2 == null) {
                    throw c.j("microphonePermission", "microphone_permission", reader);
                }
                TokenUpdateRequest newInstance = constructor2.newInstance(str4, str5, applicationInfo2, set2, num3, aVar2, list2, str3, num2, bool, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            List<TokenUpdateRequest.b> list3 = list;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("hwid", "hwid", reader);
                    }
                    list = list3;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    list = list3;
                    str = str4;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                    i12 = -3;
                case 2:
                    applicationInfo = this.applicationInfoAdapter.fromJson(reader);
                    if (applicationInfo == null) {
                        throw c.q("application", "application", reader);
                    }
                    list = list3;
                    str = str4;
                    str2 = str5;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                case 3:
                    set = this.setOfTokenInfoAdapter.fromJson(reader);
                    if (set == null) {
                        throw c.q("tokens", "tokens", reader);
                    }
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    num = num3;
                    aVar = aVar2;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("tzOffset", "tzOffset", reader);
                    }
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    aVar = aVar2;
                case 5:
                    aVar = this.authorizationAdapter.fromJson(reader);
                    if (aVar == null) {
                        throw c.q("authorization", "authorization", reader);
                    }
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                case 6:
                    list = this.listOfPermissionAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("permissions", "permissions", reader);
                    }
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                case 7:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("deviceModel", "deviceModel", reader);
                    }
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                case 8:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("microphonePermission", "microphone_permission", reader);
                    }
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                case 9:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
                default:
                    list = list3;
                    str = str4;
                    str2 = str5;
                    applicationInfo = applicationInfo2;
                    set = set2;
                    num = num3;
                    aVar = aVar2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TokenUpdateRequest value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("hwid");
        this.stringAdapter.mo44toJson(writer, (x) value_.getHwid());
        writer.w("hwidold");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOldHwId());
        writer.w("application");
        this.applicationInfoAdapter.mo44toJson(writer, (x) value_.getApplication());
        writer.w("tokens");
        this.setOfTokenInfoAdapter.mo44toJson(writer, (x) value_.getTokens());
        writer.w("tzOffset");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getTzOffset()));
        writer.w("authorization");
        this.authorizationAdapter.mo44toJson(writer, (x) value_.getAuthorization());
        writer.w("permissions");
        this.listOfPermissionAdapter.mo44toJson(writer, (x) value_.getPermissions());
        writer.w("deviceModel");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceModel());
        writer.w("microphone_permission");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getMicrophonePermission()));
        writer.w("is_teens_mode");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isTeensModeEnabled());
        writer.p();
    }
}
