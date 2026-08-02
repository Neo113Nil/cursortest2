package ru.ozon.app.android.checkoutcomposer.splitDetailV2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.data.SplitDetailV2DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO_HorizontalType_Split_ProductImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType$Split$ProductImage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType$Split$ProductImage;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType$Split$ProductImage;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "nullablePromoIconPositionAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDetailV2DTO_HorizontalType_Split_ProductImageJsonAdapter extends JsonAdapter<SplitDetailV2DTO.HorizontalType.Split.ProductImage> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<PromoIconPosition> nullablePromoIconPositionAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SplitDetailV2DTO_HorizontalType_Split_ProductImageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "promoIcon", "promoIconPosition");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "promoIcon");
        this.nullablePromoIconPositionAdapter = moshi.f(PromoIconPosition.class, m11, "promoIconPosition");
    }

    @NotNull
    public String toString() {
        return b.c(72, "GeneratedJsonAdapter(SplitDetailV2DTO.HorizontalType.Split.ProductImage)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SplitDetailV2DTO.HorizontalType.Split.ProductImage fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        IconDTO iconDTO = null;
        PromoIconPosition promoIconPosition = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("image", "image", reader);
                }
            } else if (v11 == 1) {
                iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                promoIconPosition = this.nullablePromoIconPositionAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return new SplitDetailV2DTO.HorizontalType.Split.ProductImage(str, iconDTO, promoIconPosition);
        }
        throw c.j("image", "image", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SplitDetailV2DTO.HorizontalType.Split.ProductImage value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("promoIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getPromoIcon());
        writer.w("promoIconPosition");
        this.nullablePromoIconPositionAdapter.mo44toJson(writer, (x) value.getPromoIconPosition());
        writer.p();
    }
}
