package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO_HeaderImageDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ImagePosition;", "imagePositionAtEnumNullFallbackAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersModalInfoDTO_HeaderImageDTOJsonAdapter extends JsonAdapter<MilesForBuyersModalInfoDTO.HeaderImageDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<MilesForBuyersModalInfoDTO.HeaderImageDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<MilesForBuyersModalInfoDTO.ImagePosition> imagePositionAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public MilesForBuyersModalInfoDTO_HeaderImageDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "imagePosition", "isBackgroundHeader");
        M m11 = M.f71699a;
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.imagePositionAtEnumNullFallbackAdapter = moshi.f(MilesForBuyersModalInfoDTO.ImagePosition.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoDTO_HeaderImageDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "imagePosition");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isBackgroundHeader");
    }

    @NotNull
    public String toString() {
        return b.c(63, "GeneratedJsonAdapter(MilesForBuyersModalInfoDTO.HeaderImageDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MilesForBuyersModalInfoDTO.HeaderImageDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        ImageDTO imageDTO = null;
        MilesForBuyersModalInfoDTO.ImagePosition imagePosition = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                imageDTO = this.imageDTOAdapter.fromJson(reader);
                if (imageDTO == null) {
                    throw c.q("image", "image", reader);
                }
            } else if (v11 == 1) {
                imagePosition = this.imagePositionAtEnumNullFallbackAdapter.fromJson(reader);
                if (imagePosition == null) {
                    throw c.q("imagePosition", "imagePosition", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("isBackgroundHeader", "isBackgroundHeader", reader);
                }
                i11 &= -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            if (imageDTO == null) {
                throw c.j("image", "image", reader);
            }
            Intrinsics.g(imagePosition, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoDTO.ImagePosition");
            return new MilesForBuyersModalInfoDTO.HeaderImageDTO(imageDTO, imagePosition, bool.booleanValue());
        }
        Constructor<MilesForBuyersModalInfoDTO.HeaderImageDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MilesForBuyersModalInfoDTO.HeaderImageDTO.class.getDeclaredConstructor(ImageDTO.class, MilesForBuyersModalInfoDTO.ImagePosition.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (imageDTO == null) {
            throw c.j("image", "image", reader);
        }
        MilesForBuyersModalInfoDTO.HeaderImageDTO newInstance = constructor.newInstance(imageDTO, imagePosition, bool, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MilesForBuyersModalInfoDTO.HeaderImageDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("imagePosition");
        this.imagePositionAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getImagePosition());
        writer.w("isBackgroundHeader");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isBackgroundHeader()));
        writer.p();
    }
}
