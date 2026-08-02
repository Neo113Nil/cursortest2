package ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.data;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/data/AvailablePromotionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/data/AvailablePromotionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/data/AvailablePromotionDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/data/AvailablePromotionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvailablePromotionDTOJsonAdapter extends JsonAdapter<AvailablePromotionDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;
    private volatile Constructor<AvailablePromotionDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AvailablePromotionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("promoBlockBgColor", "promoBlockCornerRadius", "promo", "details", "description", "isOpened");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "promoBlockBgColor");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "promoBlockCornerRadius");
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "promo");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "description");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isOpened");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(AvailablePromotionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AvailablePromotionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        CornerRadius cornerRadius = null;
        Boolean bool2 = bool;
        String str = null;
        CellDTO cellDTO = null;
        TextDTO textDTO = null;
        int i11 = -1;
        CellDTO cellDTO2 = null;
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
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 2:
                    cellDTO2 = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO2 == null) {
                        throw c.q("promo", "promo", reader);
                    }
                    break;
                case 3:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("details", "details", reader);
                    }
                    break;
                case 4:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("description", "description", reader);
                    }
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isOpened", "isOpened", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            if (cellDTO2 == null) {
                throw c.j("promo", "promo", reader);
            }
            if (cellDTO == null) {
                throw c.j("details", "details", reader);
            }
            if (textDTO != null) {
                return new AvailablePromotionDTO(str, cornerRadius, cellDTO2, cellDTO, textDTO, bool2.booleanValue());
            }
            throw c.j("description", "description", reader);
        }
        Constructor<AvailablePromotionDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AvailablePromotionDTO.class.getDeclaredConstructor(String.class, CornerRadius.class, CellDTO.class, CellDTO.class, TextDTO.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (cellDTO2 == null) {
            throw c.j("promo", "promo", reader);
        }
        if (cellDTO == null) {
            throw c.j("details", "details", reader);
        }
        if (textDTO == null) {
            throw c.j("description", "description", reader);
        }
        CellDTO cellDTO3 = cellDTO;
        TextDTO textDTO2 = textDTO;
        AvailablePromotionDTO newInstance = constructor.newInstance(str, cornerRadius, cellDTO2, cellDTO3, textDTO2, bool2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AvailablePromotionDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("promoBlockBgColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPromoBlockBgColor());
        writer.w("promoBlockCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getPromoBlockCornerRadius());
        writer.w("promo");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getPromo());
        writer.w("details");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getDetails());
        writer.w("description");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("isOpened");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isOpened()));
        writer.p();
    }
}
