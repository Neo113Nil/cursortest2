package ru.ozon.id.nativeauth.crossApp.dto;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeRequestDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeRequestDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;", "nullableCrossAppChallengeInfoDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppChallengeRequestDtoJsonAdapter extends JsonAdapter<CrossAppChallengeRequestDto> {

    @NotNull
    private final JsonAdapter<CrossAppChallengeInfoDto> nullableCrossAppChallengeInfoDtoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CrossAppChallengeRequestDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("challengeInfo", "deviceModel");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CrossAppChallengeInfoDto> f7 = moshi.f(CrossAppChallengeInfoDto.class, m11, "challengeInfo");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableCrossAppChallengeInfoDtoAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "deviceModel");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(CrossAppChallengeRequestDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CrossAppChallengeRequestDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CrossAppChallengeInfoDto crossAppChallengeInfoDto = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                crossAppChallengeInfoDto = this.nullableCrossAppChallengeInfoDtoAdapter.fromJson(reader);
            } else if (v11 == 1 && (str = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("deviceModel", "deviceModel", reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return new CrossAppChallengeRequestDto(crossAppChallengeInfoDto, str);
        }
        throw c.j("deviceModel", "deviceModel", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CrossAppChallengeRequestDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("challengeInfo");
        this.nullableCrossAppChallengeInfoDtoAdapter.mo44toJson(writer, (x) value_.getChallengeInfo());
        writer.w("deviceModel");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceModel());
        writer.p();
    }
}
