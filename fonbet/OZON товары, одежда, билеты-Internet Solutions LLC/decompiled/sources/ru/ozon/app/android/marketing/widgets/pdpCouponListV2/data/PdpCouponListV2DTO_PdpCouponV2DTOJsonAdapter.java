package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.data.PdpCouponListV2DTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO_PdpCouponV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$PdpCouponV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$PdpCouponV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$PdpCouponV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Gradient;", "gradientAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Promocode;", "promocodeAdapter", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponText;", "couponTextAdapter", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponAction;", "nullableCouponActionAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpCouponListV2DTO_PdpCouponV2DTOJsonAdapter extends JsonAdapter<PdpCouponListV2DTO.PdpCouponV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PdpCouponListV2DTO.CouponText> couponTextAdapter;

    @NotNull
    private final JsonAdapter<PdpCouponListV2DTO.Gradient> gradientAdapter;

    @NotNull
    private final JsonAdapter<PdpCouponListV2DTO.CouponAction> nullableCouponActionAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PdpCouponListV2DTO.Promocode> promocodeAdapter;

    public PdpCouponListV2DTO_PdpCouponV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("gradient", "promocode", "couponText", "couponAction", "trackingInfo");
        M m11 = M.f71699a;
        this.gradientAdapter = moshi.f(PdpCouponListV2DTO.Gradient.class, m11, "gradient");
        this.promocodeAdapter = moshi.f(PdpCouponListV2DTO.Promocode.class, m11, "promocode");
        this.couponTextAdapter = moshi.f(PdpCouponListV2DTO.CouponText.class, m11, "couponText");
        this.nullableCouponActionAdapter = moshi.f(PdpCouponListV2DTO.CouponAction.class, m11, "couponAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(PdpCouponListV2DTO.PdpCouponV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PdpCouponListV2DTO.PdpCouponV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PdpCouponListV2DTO.Gradient gradient = null;
        PdpCouponListV2DTO.Promocode promocode = null;
        PdpCouponListV2DTO.CouponText couponText = null;
        PdpCouponListV2DTO.CouponAction couponAction = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                gradient = this.gradientAdapter.fromJson(reader);
                if (gradient == null) {
                    throw c.q("gradient", "gradient", reader);
                }
            } else if (v11 == 1) {
                promocode = this.promocodeAdapter.fromJson(reader);
                if (promocode == null) {
                    throw c.q("promocode", "promocode", reader);
                }
            } else if (v11 == 2) {
                couponText = this.couponTextAdapter.fromJson(reader);
                if (couponText == null) {
                    throw c.q("couponText", "couponText", reader);
                }
            } else if (v11 == 3) {
                couponAction = this.nullableCouponActionAdapter.fromJson(reader);
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (gradient == null) {
            throw c.j("gradient", "gradient", reader);
        }
        if (promocode == null) {
            throw c.j("promocode", "promocode", reader);
        }
        if (couponText != null) {
            return new PdpCouponListV2DTO.PdpCouponV2DTO(gradient, promocode, couponText, couponAction, map);
        }
        throw c.j("couponText", "couponText", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PdpCouponListV2DTO.PdpCouponV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("gradient");
        this.gradientAdapter.mo44toJson(writer, (x) value.getGradient());
        writer.w("promocode");
        this.promocodeAdapter.mo44toJson(writer, (x) value.getPromocode());
        writer.w("couponText");
        this.couponTextAdapter.mo44toJson(writer, (x) value.getCouponText());
        writer.w("couponAction");
        this.nullableCouponActionAdapter.mo44toJson(writer, (x) value.getCouponAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
