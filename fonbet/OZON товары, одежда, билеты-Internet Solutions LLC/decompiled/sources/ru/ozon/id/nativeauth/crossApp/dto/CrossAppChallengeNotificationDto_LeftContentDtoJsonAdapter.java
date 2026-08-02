package ru.ozon.id.nativeauth.crossApp.dto;

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
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeNotificationDto;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto_LeftContentDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto$LeftContentAtomDto;", "nullableLeftContentAtomDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;", "nullableAlignmentAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppChallengeNotificationDto_LeftContentDtoJsonAdapter extends JsonAdapter<CrossAppChallengeNotificationDto.LeftContentDto> {
    private volatile Constructor<CrossAppChallengeNotificationDto.LeftContentDto> constructorRef;

    @NotNull
    private final JsonAdapter<NotificationDTO.Alignment> nullableAlignmentAdapter;

    @NotNull
    private final JsonAdapter<CrossAppChallengeNotificationDto.LeftContentAtomDto> nullableLeftContentAtomDtoAdapter;

    @NotNull
    private final n.a options;

    public CrossAppChallengeNotificationDto_LeftContentDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("atom", "alignment");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CrossAppChallengeNotificationDto.LeftContentAtomDto> f7 = moshi.f(CrossAppChallengeNotificationDto.LeftContentAtomDto.class, m11, "atom");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableLeftContentAtomDtoAdapter = f7;
        JsonAdapter<NotificationDTO.Alignment> f11 = moshi.f(NotificationDTO.Alignment.class, m11, "alignment");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableAlignmentAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(69, "GeneratedJsonAdapter(CrossAppChallengeNotificationDto.LeftContentDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CrossAppChallengeNotificationDto.LeftContentDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CrossAppChallengeNotificationDto.LeftContentAtomDto leftContentAtomDto = null;
        NotificationDTO.Alignment alignment = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                leftContentAtomDto = this.nullableLeftContentAtomDtoAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                alignment = this.nullableAlignmentAdapter.fromJson(reader);
                i11 &= -3;
            }
        }
        reader.endObject();
        if (i11 == -4) {
            return new CrossAppChallengeNotificationDto.LeftContentDto(leftContentAtomDto, alignment);
        }
        Constructor<CrossAppChallengeNotificationDto.LeftContentDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CrossAppChallengeNotificationDto.LeftContentDto.class.getDeclaredConstructor(CrossAppChallengeNotificationDto.LeftContentAtomDto.class, NotificationDTO.Alignment.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CrossAppChallengeNotificationDto.LeftContentDto newInstance = constructor.newInstance(leftContentAtomDto, alignment, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CrossAppChallengeNotificationDto.LeftContentDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("atom");
        this.nullableLeftContentAtomDtoAdapter.mo44toJson(writer, (x) value_.getAtom());
        writer.w("alignment");
        this.nullableAlignmentAdapter.mo44toJson(writer, (x) value_.getAlignment());
        writer.p();
    }
}
