package ru.ozon.id.nativeauth.crossApp.autologin.data.dto;

import Ak.b;
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
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSelectedKeyDto;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinResponseDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinResponseDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "nullableCrossAppSelectedKeyDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfStringAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InitAutologinResponseDtoJsonAdapter extends JsonAdapter<InitAutologinResponseDto> {

    @NotNull
    private final JsonAdapter<CrossAppSelectedKeyDto> nullableCrossAppSelectedKeyDtoAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    public InitAutologinResponseDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("selectedKeyInfo", "unauthorizedKeys");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CrossAppSelectedKeyDto> f7 = moshi.f(CrossAppSelectedKeyDto.class, m11, "selectedKeyInfo");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableCrossAppSelectedKeyDtoAdapter = f7;
        JsonAdapter<List<String>> f11 = moshi.f(D.e(List.class, String.class), m11, "unauthorizedKeys");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfStringAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(InitAutologinResponseDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InitAutologinResponseDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CrossAppSelectedKeyDto crossAppSelectedKeyDto = null;
        List<String> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                crossAppSelectedKeyDto = this.nullableCrossAppSelectedKeyDtoAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.nullableListOfStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new InitAutologinResponseDto(crossAppSelectedKeyDto, list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InitAutologinResponseDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("selectedKeyInfo");
        this.nullableCrossAppSelectedKeyDtoAdapter.mo44toJson(writer, (x) value_.getSelectedKeyInfo());
        writer.w("unauthorizedKeys");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getUnauthorizedKeys());
        writer.p();
    }
}
