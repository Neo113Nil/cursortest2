package ru.ozon.id.nativeauth.biometry.data.dto;

import Ak.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO_DataDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "nullableAuthTokenDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO$Biometry;", "nullableBiometryAdapter", "", "nullableBooleanAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BiometryEntryActionDTO_DataDTOJsonAdapter extends JsonAdapter<BiometryEntryActionDTO.DataDTO> {

    @NotNull
    private final JsonAdapter<AuthTokenDTO> nullableAuthTokenDTOAdapter;

    @NotNull
    private final JsonAdapter<BiometryEntryActionDTO.DataDTO.Biometry> nullableBiometryAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final n.a options;

    public BiometryEntryActionDTO_DataDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("authToken", "biometry", "isRegister");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<AuthTokenDTO> f7 = moshi.f(AuthTokenDTO.class, m11, "authToken");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableAuthTokenDTOAdapter = f7;
        JsonAdapter<BiometryEntryActionDTO.DataDTO.Biometry> f11 = moshi.f(BiometryEntryActionDTO.DataDTO.Biometry.class, m11, "biometry");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBiometryAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "isRegister");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(BiometryEntryActionDTO.DataDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BiometryEntryActionDTO.DataDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AuthTokenDTO authTokenDTO = null;
        BiometryEntryActionDTO.DataDTO.Biometry biometry = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                authTokenDTO = this.nullableAuthTokenDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                biometry = this.nullableBiometryAdapter.fromJson(reader);
            } else if (v11 == 2) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new BiometryEntryActionDTO.DataDTO(authTokenDTO, biometry, bool);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BiometryEntryActionDTO.DataDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("authToken");
        this.nullableAuthTokenDTOAdapter.mo44toJson(writer, (x) value_.getAuthToken());
        writer.w("biometry");
        this.nullableBiometryAdapter.mo44toJson(writer, (x) value_.getBiometry());
        writer.w("isRegister");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isRegister());
        writer.p();
    }
}
