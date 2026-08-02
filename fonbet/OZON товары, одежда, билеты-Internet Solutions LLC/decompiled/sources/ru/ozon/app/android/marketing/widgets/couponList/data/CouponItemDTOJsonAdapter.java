package ru.ozon.app.android.marketing.widgets.couponList.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/data/CouponItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/couponList/data/CouponItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/couponList/data/CouponItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/couponList/data/CouponItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/couponList/data/ActionButtonDTO;", "actionButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/couponList/data/ConditionsDTO;", "conditionsDTOAdapter", "", "booleanAdapter", "stringAdapter", "", "intAdapter", "", "Lru/ozon/app/android/marketing/widgets/couponList/data/ProductDTO;", "listOfProductDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponItemDTOJsonAdapter extends JsonAdapter<CouponItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ActionButtonDTO> actionButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ConditionsDTO> conditionsDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<ProductDTO>> listOfProductDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CouponItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("actionButton", "conditions", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "couponCode", "headerImage", "deeplink", "description", "id", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isPointsVisible", "isLargeText", AppMeasurementSdk.ConditionalUserProperty.NAME, "products", "accentColor", "trackingInfo");
        M m11 = M.f71699a;
        this.actionButtonDTOAdapter = moshi.f(ActionButtonDTO.class, m11, "actionButton");
        this.conditionsDTOAdapter = moshi.f(ConditionsDTO.class, m11, "conditions");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        this.stringAdapter = moshi.f(String.class, m11, "couponCode");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "id");
        this.listOfProductDTOAdapter = moshi.f(D.e(List.class, ProductDTO.class), m11, "products");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(CouponItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CouponItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Integer num = null;
        ActionButtonDTO actionButtonDTO = null;
        ConditionsDTO conditionsDTO = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str5 = null;
        List<ProductDTO> list = null;
        String str6 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Boolean bool5 = bool;
            Integer num2 = num;
            ActionButtonDTO actionButtonDTO2 = actionButtonDTO;
            ConditionsDTO conditionsDTO2 = conditionsDTO;
            Boolean bool6 = bool2;
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            String str10 = str4;
            Boolean bool7 = bool3;
            Boolean bool8 = bool4;
            String str11 = str5;
            if (!reader.hasNext()) {
                reader.endObject();
                if (actionButtonDTO2 == null) {
                    throw c.j("actionButton", "actionButton", reader);
                }
                if (conditionsDTO2 == null) {
                    throw c.j("conditions", "conditions", reader);
                }
                if (bool5 == null) {
                    throw c.j(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, reader);
                }
                boolean booleanValue = bool5.booleanValue();
                if (str7 == null) {
                    throw c.j("couponCode", "couponCode", reader);
                }
                if (str8 == null) {
                    throw c.j("headerImage", "headerImage", reader);
                }
                if (str9 == null) {
                    throw c.j("deeplink", "deeplink", reader);
                }
                if (str10 == null) {
                    throw c.j("description", "description", reader);
                }
                if (num2 == null) {
                    throw c.j("id", "id", reader);
                }
                int intValue = num2.intValue();
                if (bool6 == null) {
                    throw c.j(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, reader);
                }
                boolean booleanValue2 = bool6.booleanValue();
                if (bool7 == null) {
                    throw c.j("isPointsVisible", "isPointsVisible", reader);
                }
                boolean booleanValue3 = bool7.booleanValue();
                if (bool8 == null) {
                    throw c.j("isLargeText", "isLargeText", reader);
                }
                boolean booleanValue4 = bool8.booleanValue();
                if (str11 == null) {
                    throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
                if (list == null) {
                    throw c.j("products", "products", reader);
                }
                if (str6 != null) {
                    return new CouponItemDTO(actionButtonDTO2, conditionsDTO2, booleanValue, str7, str8, str9, str10, intValue, booleanValue2, booleanValue3, booleanValue4, str11, list, str6, map);
                }
                throw c.j("accentColor", "accentColor", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 0:
                    actionButtonDTO = this.actionButtonDTOAdapter.fromJson(reader);
                    if (actionButtonDTO == null) {
                        throw c.q("actionButton", "actionButton", reader);
                    }
                    bool = bool5;
                    num = num2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 1:
                    conditionsDTO = this.conditionsDTOAdapter.fromJson(reader);
                    if (conditionsDTO == null) {
                        throw c.q("conditions", "conditions", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 2:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, reader);
                    }
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 3:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("couponCode", "couponCode", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 4:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("headerImage", "headerImage", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("deeplink", "deeplink", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 6:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("description", "description", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 7:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("id", "id", reader);
                    }
                    bool = bool5;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 9:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isPointsVisible", "isPointsVisible", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool4 = bool8;
                    str5 = str11;
                case 10:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("isLargeText", "isLargeText", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    str5 = str11;
                case 11:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                case 12:
                    list = this.listOfProductDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("products", "products", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 13:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("accentColor", "accentColor", reader);
                    }
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                case 14:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
                default:
                    bool = bool5;
                    num = num2;
                    actionButtonDTO = actionButtonDTO2;
                    conditionsDTO = conditionsDTO2;
                    bool2 = bool6;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    bool3 = bool7;
                    bool4 = bool8;
                    str5 = str11;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CouponItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("actionButton");
        this.actionButtonDTOAdapter.mo44toJson(writer, (x) value.getActionButton());
        writer.w("conditions");
        this.conditionsDTOAdapter.mo44toJson(writer, (x) value.getConditions());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getActive()));
        writer.w("couponCode");
        this.stringAdapter.mo44toJson(writer, (x) value.getCouponCode());
        writer.w("headerImage");
        this.stringAdapter.mo44toJson(writer, (x) value.getHeaderImage());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("description");
        this.stringAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("id");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getId()));
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isAdult()));
        writer.w("isPointsVisible");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isPointsVisible()));
        writer.w("isLargeText");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isLargeText()));
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("products");
        this.listOfProductDTOAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("accentColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getAccentColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
