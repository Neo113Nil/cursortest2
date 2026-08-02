package ru.ozon.app.android.checkoutcomposer.couriersteps.data;

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
import ru.ozon.app.android.checkoutcomposer.couriersteps.data.CourierStepsDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO_SettingsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;", "paddingAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierStepsDTO_SettingsDTOJsonAdapter extends JsonAdapter<CourierStepsDTO.SettingsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CourierStepsDTO.Padding> paddingAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CourierStepsDTO_SettingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("bgColor", "padding", "outerBgColor", "outerPadding", "topCornerRadius", "topBorderColor");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "bgColor");
        this.paddingAdapter = moshi.f(CourierStepsDTO.Padding.class, m11, "padding");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "topCornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(CourierStepsDTO.SettingsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CourierStepsDTO.SettingsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        CourierStepsDTO.Padding padding = null;
        String str2 = null;
        CourierStepsDTO.Padding padding2 = null;
        CornerRadius cornerRadius = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("bgColor", "bgColor", reader);
                    }
                    break;
                case 1:
                    padding = this.paddingAdapter.fromJson(reader);
                    if (padding == null) {
                        throw c.q("padding", "padding", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("outerBgColor", "outerBgColor", reader);
                    }
                    break;
                case 3:
                    padding2 = this.paddingAdapter.fromJson(reader);
                    if (padding2 == null) {
                        throw c.q("outerPadding", "outerPadding", reader);
                    }
                    break;
                case 4:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("topCornerRadius", "topCornerRadius", reader);
                    }
                    break;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("topBorderColor", "topBorderColor", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("bgColor", "bgColor", reader);
        }
        if (padding == null) {
            throw c.j("padding", "padding", reader);
        }
        if (str2 == null) {
            throw c.j("outerBgColor", "outerBgColor", reader);
        }
        if (padding2 == null) {
            throw c.j("outerPadding", "outerPadding", reader);
        }
        if (cornerRadius == null) {
            throw c.j("topCornerRadius", "topCornerRadius", reader);
        }
        if (str3 != null) {
            return new CourierStepsDTO.SettingsDTO(str, padding, str2, padding2, cornerRadius, str3);
        }
        throw c.j("topBorderColor", "topBorderColor", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CourierStepsDTO.SettingsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("bgColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBgColor());
        writer.w("padding");
        this.paddingAdapter.mo44toJson(writer, (x) value.getPadding());
        writer.w("outerBgColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getOuterBgColor());
        writer.w("outerPadding");
        this.paddingAdapter.mo44toJson(writer, (x) value.getOuterPadding());
        writer.w("topCornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getTopCornerRadius());
        writer.w("topBorderColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTopBorderColor());
        writer.p();
    }
}
