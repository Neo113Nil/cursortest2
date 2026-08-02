package ru.ozon.app.android.cart.familyGroup.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.familyGroup.data.FamilyGroupDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO_FamilyGroupSettingsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FamilyGroupDTO_FamilyGroupSettingsDTOJsonAdapter extends JsonAdapter<FamilyGroupDTO.FamilyGroupSettingsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final n.a options;

    public FamilyGroupDTO_FamilyGroupSettingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("horizontalMargin", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight", "cornerRadius");
        M m11 = M.f71699a;
        this.nullablePaddingsAdapter = moshi.f(Paddings.class, m11, "horizontalMargin");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(FamilyGroupDTO.FamilyGroupSettingsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FamilyGroupDTO.FamilyGroupSettingsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        Paddings paddings5 = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 1:
                    paddings2 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 2:
                    paddings3 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 3:
                    paddings4 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 4:
                    paddings5 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 5:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new FamilyGroupDTO.FamilyGroupSettingsDTO(paddings, paddings2, paddings3, paddings4, paddings5, cornerRadius);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FamilyGroupDTO.FamilyGroupSettingsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("horizontalMargin");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getHorizontalMargin());
        writer.w("paddingTop");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingTop());
        writer.w("paddingBottom");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingBottom());
        writer.w("paddingLeft");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingLeft());
        writer.w("paddingRight");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingRight());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
