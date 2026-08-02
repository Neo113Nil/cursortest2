package ru.ozon.id.nativeauth.data.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO_FastEntryDataDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "nullableAuthTokenDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;", "nullableFastEntryAuthMethodDTOAdapter", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$MobileId;", "nullableMobileIdAdapter", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;", "nullableAuthCurtainAdapter", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "nullableFastEntryBiometryDTOAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "nullableAgreementSheetAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FastEntryActionDTO_FastEntryDataDTOJsonAdapter extends JsonAdapter<FastEntryActionDTO.FastEntryDataDTO> {

    @NotNull
    private final JsonAdapter<OtpDTO.AgreementSheet> nullableAgreementSheetAdapter;

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.AuthCurtain> nullableAuthCurtainAdapter;

    @NotNull
    private final JsonAdapter<AuthTokenDTO> nullableAuthTokenDTOAdapter;

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO> nullableFastEntryAuthMethodDTOAdapter;

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO> nullableFastEntryBiometryDTOAdapter;

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.MobileId> nullableMobileIdAdapter;

    @NotNull
    private final n.a options;

    public FastEntryActionDTO_FastEntryDataDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("authToken", "authMethod", "mobileId", "mobileIdCurtain", "vkIdCurtain", "biometry", "agreementCurtain");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<AuthTokenDTO> f7 = moshi.f(AuthTokenDTO.class, m11, "authToken");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableAuthTokenDTOAdapter = f7;
        JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO> f11 = moshi.f(FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO.class, m11, "authMethod");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableFastEntryAuthMethodDTOAdapter = f11;
        JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.MobileId> f12 = moshi.f(FastEntryActionDTO.FastEntryDataDTO.MobileId.class, m11, "mobileId");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableMobileIdAdapter = f12;
        JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.AuthCurtain> f13 = moshi.f(FastEntryActionDTO.FastEntryDataDTO.AuthCurtain.class, m11, "mobileIdCurtain");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableAuthCurtainAdapter = f13;
        JsonAdapter<FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO> f14 = moshi.f(FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO.class, m11, "biometry");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableFastEntryBiometryDTOAdapter = f14;
        JsonAdapter<OtpDTO.AgreementSheet> f15 = moshi.f(OtpDTO.AgreementSheet.class, m11, "agreementCurtain");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableAgreementSheetAdapter = f15;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(57, "GeneratedJsonAdapter(FastEntryActionDTO.FastEntryDataDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FastEntryActionDTO.FastEntryDataDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AuthTokenDTO authTokenDTO = null;
        FastEntryActionDTO.FastEntryDataDTO.FastEntryAuthMethodDTO fastEntryAuthMethodDTO = null;
        FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId = null;
        FastEntryActionDTO.FastEntryDataDTO.AuthCurtain authCurtain = null;
        FastEntryActionDTO.FastEntryDataDTO.AuthCurtain authCurtain2 = null;
        FastEntryActionDTO.FastEntryDataDTO.FastEntryBiometryDTO fastEntryBiometryDTO = null;
        OtpDTO.AgreementSheet agreementSheet = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    authTokenDTO = this.nullableAuthTokenDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    fastEntryAuthMethodDTO = this.nullableFastEntryAuthMethodDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    mobileId = this.nullableMobileIdAdapter.fromJson(reader);
                    break;
                case 3:
                    authCurtain = this.nullableAuthCurtainAdapter.fromJson(reader);
                    break;
                case 4:
                    authCurtain2 = this.nullableAuthCurtainAdapter.fromJson(reader);
                    break;
                case 5:
                    fastEntryBiometryDTO = this.nullableFastEntryBiometryDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    agreementSheet = this.nullableAgreementSheetAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new FastEntryActionDTO.FastEntryDataDTO(authTokenDTO, fastEntryAuthMethodDTO, mobileId, authCurtain, authCurtain2, fastEntryBiometryDTO, agreementSheet);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FastEntryActionDTO.FastEntryDataDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("authToken");
        this.nullableAuthTokenDTOAdapter.mo44toJson(writer, (x) value_.getAuthToken());
        writer.w("authMethod");
        this.nullableFastEntryAuthMethodDTOAdapter.mo44toJson(writer, (x) value_.getAuthMethod());
        writer.w("mobileId");
        this.nullableMobileIdAdapter.mo44toJson(writer, (x) value_.getMobileId());
        writer.w("mobileIdCurtain");
        this.nullableAuthCurtainAdapter.mo44toJson(writer, (x) value_.getMobileIdCurtain());
        writer.w("vkIdCurtain");
        this.nullableAuthCurtainAdapter.mo44toJson(writer, (x) value_.getVkIdCurtain());
        writer.w("biometry");
        this.nullableFastEntryBiometryDTOAdapter.mo44toJson(writer, (x) value_.getBiometry());
        writer.w("agreementCurtain");
        this.nullableAgreementSheetAdapter.mo44toJson(writer, (x) value_.getAgreementCurtain());
        writer.p();
    }
}
