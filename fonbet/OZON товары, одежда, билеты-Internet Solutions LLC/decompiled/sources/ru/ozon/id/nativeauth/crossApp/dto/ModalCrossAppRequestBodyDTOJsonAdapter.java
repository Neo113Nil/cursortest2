package ru.ozon.id.nativeauth.crossApp.dto;

import Y9.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSharedStoreKeyDto;", "nullableListOfCrossAppSharedStoreKeyDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;", "nullableCrossAppChallengeInfoDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCrossAppRequestBodyDTOJsonAdapter extends JsonAdapter<ModalCrossAppRequestBodyDTO> {
    private volatile Constructor<ModalCrossAppRequestBodyDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CrossAppChallengeInfoDto> nullableCrossAppChallengeInfoDtoAdapter;

    @NotNull
    private final JsonAdapter<List<CrossAppSharedStoreKeyDto>> nullableListOfCrossAppSharedStoreKeyDtoAdapter;

    @NotNull
    private final n.a options;

    public ModalCrossAppRequestBodyDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("sharedStoreKeys", "challengeInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, CrossAppSharedStoreKeyDto.class);
        M m11 = M.f71699a;
        JsonAdapter<List<CrossAppSharedStoreKeyDto>> f7 = moshi.f(e11, m11, "sharedStoreKeys");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableListOfCrossAppSharedStoreKeyDtoAdapter = f7;
        JsonAdapter<CrossAppChallengeInfoDto> f11 = moshi.f(CrossAppChallengeInfoDto.class, m11, "challengeInfo");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableCrossAppChallengeInfoDtoAdapter = f11;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(49, "GeneratedJsonAdapter(ModalCrossAppRequestBodyDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ModalCrossAppRequestBodyDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<CrossAppSharedStoreKeyDto> list = null;
        CrossAppChallengeInfoDto crossAppChallengeInfoDto = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfCrossAppSharedStoreKeyDtoAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                crossAppChallengeInfoDto = this.nullableCrossAppChallengeInfoDtoAdapter.fromJson(reader);
                i11 &= -3;
            }
        }
        reader.endObject();
        if (i11 == -4) {
            return new ModalCrossAppRequestBodyDTO(list, crossAppChallengeInfoDto);
        }
        Constructor<ModalCrossAppRequestBodyDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ModalCrossAppRequestBodyDTO.class.getDeclaredConstructor(List.class, CrossAppChallengeInfoDto.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ModalCrossAppRequestBodyDTO newInstance = constructor.newInstance(list, crossAppChallengeInfoDto, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ModalCrossAppRequestBodyDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sharedStoreKeys");
        this.nullableListOfCrossAppSharedStoreKeyDtoAdapter.mo44toJson(writer, (x) value_.getSharedStoreKeys());
        writer.w("challengeInfo");
        this.nullableCrossAppChallengeInfoDtoAdapter.mo44toJson(writer, (x) value_.getChallengeInfo());
        writer.p();
    }
}
