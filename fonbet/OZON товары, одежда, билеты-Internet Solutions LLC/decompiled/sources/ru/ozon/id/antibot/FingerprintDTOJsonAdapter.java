package ru.ozon.id.antibot;

import Ak.b;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lru/ozon/id/antibot/FingerprintDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/antibot/FingerprintDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/antibot/FingerprintDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/antibot/FingerprintDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "nullableLongAdapter", "", "nullableListOfStringAdapter", "", "nullableFloatAdapter", "", "nullableBooleanAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintDTOJsonAdapter extends JsonAdapter<FingerprintDTO> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FingerprintDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("androidFingerprintType", "androidModel", "androidManufacturer", "androidBrand", "androidHardware", "androidBoard", "androidDevice", "androidProduct", "androidSdk", "androidRelease", "androidSecurityPatch", "androidBuildId", "androidRadioVersion", "androidFingerprint", "androidTags", "androidType", "androidTime", "androidUser", "androidBootloader", "androidSku", "androidOdmSku", "androidDisplay", "androidHost", "androidSupportedAbis", "androidSocManufacturer", "androidSocModel", "androidScreenWidth", "androidScreenHeight", "androidDensity", "androidDensityWidth", "androidDensityHeight", "androidPackageName", "androidVersionName", "androidFirstInstallTime", "androidLastUpdateTime", "androidVersionCode", "androidLocales", "androidTimezoneId", "androidTimezoneRawOffset", "androidTimezoneDisplayName", "androidIsDeviceSecure", "androidIsDebug", "androidConnectionType", "androidIsVpnConnected", "androidIsRoot", "androidIdentifierForVendor", "androidDeviceId", "androidDevelopmentSettingsEnabled", "androidAdbEnabled", "androidStayOnWhilePluggedIn", "androidDebugApp", "androidWaitForDebugger", "androidIsEmulator", "androidOzonIdSdkVersion");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "androidFingerprintType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.class, m11, "androidSdk");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIntAdapter = f11;
        JsonAdapter<Long> f12 = moshi.f(Long.class, m11, "androidTime");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLongAdapter = f12;
        JsonAdapter<List<String>> f13 = moshi.f(D.e(List.class, String.class), m11, "androidSupportedAbis");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfStringAdapter = f13;
        JsonAdapter<Float> f14 = moshi.f(Float.class, m11, "androidDensity");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableFloatAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.class, m11, "androidIsDeviceSecure");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBooleanAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(FingerprintDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FingerprintDTO fromJson(@NotNull n reader) {
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
        Integer num = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        Long l11 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        List<String> list = null;
        String str22 = null;
        String str23 = null;
        Integer num2 = null;
        Integer num3 = null;
        Float f7 = null;
        Float f11 = null;
        Float f12 = null;
        String str24 = null;
        String str25 = null;
        Long l12 = null;
        Long l13 = null;
        Integer num4 = null;
        List<String> list2 = null;
        String str26 = null;
        Integer num5 = null;
        String str27 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str28 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str29 = null;
        String str30 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        String str31 = null;
        Integer num9 = null;
        String str32 = null;
        String str33 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 9:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str14 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    str15 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 17:
                    str16 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    str17 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 19:
                    str18 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 20:
                    str19 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 21:
                    str20 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 22:
                    str21 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 23:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 24:
                    str22 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    str23 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 28:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 29:
                    f11 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    f12 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str24 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 32:
                    str25 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 33:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 34:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    list2 = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    str26 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 38:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    str27 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 40:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 41:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 42:
                    str28 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 43:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    str29 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 46:
                    str30 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 47:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 48:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 49:
                    num8 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 50:
                    str31 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 51:
                    num9 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 52:
                    str32 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 53:
                    str33 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new FingerprintDTO(str, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, str13, str14, str15, l11, str16, str17, str18, str19, str20, str21, list, str22, str23, num2, num3, f7, f11, f12, str24, str25, l12, l13, num4, list2, str26, num5, str27, bool, bool2, str28, bool3, bool4, str29, str30, num6, num7, num8, str31, num9, str32, str33);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FingerprintDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("androidFingerprintType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidFingerprintType());
        writer.w("androidModel");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidModel());
        writer.w("androidManufacturer");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidManufacturer());
        writer.w("androidBrand");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidBrand());
        writer.w("androidHardware");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidHardware());
        writer.w("androidBoard");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidBoard());
        writer.w("androidDevice");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidDevice());
        writer.w("androidProduct");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidProduct());
        writer.w("androidSdk");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidSdk());
        writer.w("androidRelease");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidRelease());
        writer.w("androidSecurityPatch");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidSecurityPatch());
        writer.w("androidBuildId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidBuildId());
        writer.w("androidRadioVersion");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidRadioVersion());
        writer.w("androidFingerprint");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidFingerprint());
        writer.w("androidTags");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidTags());
        writer.w("androidType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidType());
        writer.w("androidTime");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getAndroidTime());
        writer.w("androidUser");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidUser());
        writer.w("androidBootloader");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidBootloader());
        writer.w("androidSku");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidSku());
        writer.w("androidOdmSku");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidOdmSku());
        writer.w("androidDisplay");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidDisplay());
        writer.w("androidHost");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidHost());
        writer.w("androidSupportedAbis");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getAndroidSupportedAbis());
        writer.w("androidSocManufacturer");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidSocManufacturer());
        writer.w("androidSocModel");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidSocModel());
        writer.w("androidScreenWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidScreenWidth());
        writer.w("androidScreenHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidScreenHeight());
        writer.w("androidDensity");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getAndroidDensity());
        writer.w("androidDensityWidth");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getAndroidDensityWidth());
        writer.w("androidDensityHeight");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getAndroidDensityHeight());
        writer.w("androidPackageName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidPackageName());
        writer.w("androidVersionName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidVersionName());
        writer.w("androidFirstInstallTime");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getAndroidFirstInstallTime());
        writer.w("androidLastUpdateTime");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getAndroidLastUpdateTime());
        writer.w("androidVersionCode");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidVersionCode());
        writer.w("androidLocales");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getAndroidLocales());
        writer.w("androidTimezoneId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidTimezoneId());
        writer.w("androidTimezoneRawOffset");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidTimezoneRawOffset());
        writer.w("androidTimezoneDisplayName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidTimezoneDisplayName());
        writer.w("androidIsDeviceSecure");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getAndroidIsDeviceSecure());
        writer.w("androidIsDebug");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getAndroidIsDebug());
        writer.w("androidConnectionType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidConnectionType());
        writer.w("androidIsVpnConnected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getAndroidIsVpnConnected());
        writer.w("androidIsRoot");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getAndroidIsRoot());
        writer.w("androidIdentifierForVendor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidIdentifierForVendor());
        writer.w("androidDeviceId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidDeviceId());
        writer.w("androidDevelopmentSettingsEnabled");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidDevelopmentSettingsEnabled());
        writer.w("androidAdbEnabled");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidAdbEnabled());
        writer.w("androidStayOnWhilePluggedIn");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidStayOnWhilePluggedIn());
        writer.w("androidDebugApp");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidDebugApp());
        writer.w("androidWaitForDebugger");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAndroidWaitForDebugger());
        writer.w("androidIsEmulator");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidIsEmulator());
        writer.w("androidOzonIdSdkVersion");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAndroidOzonIdSdkVersion());
        writer.p();
    }
}
