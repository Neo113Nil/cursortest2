package ru.ozon.app.android.travel.molecules.dto.airlineCustomCell;

import Ak.b;
import C.o0;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.airlineCustomCell.AirlineCustomCellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO_LeftBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableImageDTOAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AirlineCustomCellDTO_LeftBlockDTOJsonAdapter extends JsonAdapter<AirlineCustomCellDTO.LeftBlockDTO> {
    private volatile Constructor<AirlineCustomCellDTO.LeftBlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final n.a options;

    public AirlineCustomCellDTO_LeftBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("mainCarrier", "operatingCarrier", "rightPadding");
        M m11 = M.f71699a;
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "mainCarrier");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "operatingCarrier");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "rightPadding");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AirlineCustomCellDTO.LeftBlockDTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        ImageDTO imageDTO = null;
        ImageDTO imageDTO2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                imageDTO = this.imageDTOAdapter.fromJson(reader);
                if (imageDTO == null) {
                    throw c.q("mainCarrier", "mainCarrier", reader);
                }
            } else if (v11 == 1) {
                imageDTO2 = this.nullableImageDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("rightPadding", "rightPadding", reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (imageDTO != null) {
                return new AirlineCustomCellDTO.LeftBlockDTO(imageDTO, imageDTO2, a11.intValue());
            }
            throw c.j("mainCarrier", "mainCarrier", reader);
        }
        Constructor<AirlineCustomCellDTO.LeftBlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = AirlineCustomCellDTO.LeftBlockDTO.class.getDeclaredConstructor(ImageDTO.class, ImageDTO.class, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (imageDTO == null) {
            throw c.j("mainCarrier", "mainCarrier", reader);
        }
        AirlineCustomCellDTO.LeftBlockDTO newInstance = constructor.newInstance(imageDTO, imageDTO2, a11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(AirlineCustomCellDTO.LeftBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AirlineCustomCellDTO.LeftBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("mainCarrier");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getMainCarrier());
        writer.w("operatingCarrier");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getOperatingCarrier());
        writer.w("rightPadding");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getRightPadding()));
        writer.p();
    }
}
