package ru.ozon.app.android.marketing.widgets.couponPromo.data;

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
import ru.ozon.app.android.marketing.widgets.couponPromo.data.CouponPromoDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShareDataDTO;", "nullableShareDataDTOAdapter", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ActivateActionDTO;", "nullableActivateActionDTOAdapter", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShowStepsActionDTO;", "nullableShowStepsActionDTOAdapter", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsTextDTO;", "stepsTextDTOAdapter", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsActionDTO;", "nullableStepsActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponPromoDTOJsonAdapter extends JsonAdapter<CouponPromoDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CouponPromoDTO.ActivateActionDTO> nullableActivateActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CouponPromoDTO.ShareDataDTO> nullableShareDataDTOAdapter;

    @NotNull
    private final JsonAdapter<CouponPromoDTO.ShowStepsActionDTO> nullableShowStepsActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CouponPromoDTO.StepsActionDTO> nullableStepsActionDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CouponPromoDTO.StepsTextDTO> stepsTextDTOAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CouponPromoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "backgroundColor", "textColor", "activated", "promoCode", "shareData", "activateAction", "showStepsAction", "stepsText", "stepsAction", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, "subtitle");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "activated");
        this.nullableShareDataDTOAdapter = moshi.f(CouponPromoDTO.ShareDataDTO.class, m11, "shareData");
        this.nullableActivateActionDTOAdapter = moshi.f(CouponPromoDTO.ActivateActionDTO.class, m11, "activateAction");
        this.nullableShowStepsActionDTOAdapter = moshi.f(CouponPromoDTO.ShowStepsActionDTO.class, m11, "showStepsAction");
        this.stepsTextDTOAdapter = moshi.f(CouponPromoDTO.StepsTextDTO.class, m11, "stepsText");
        this.nullableStepsActionDTOAdapter = moshi.f(CouponPromoDTO.StepsActionDTO.class, m11, "stepsAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(CouponPromoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CouponPromoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        CouponPromoDTO.ShareDataDTO shareDataDTO = null;
        CouponPromoDTO.ActivateActionDTO activateActionDTO = null;
        CouponPromoDTO.ShowStepsActionDTO showStepsActionDTO = null;
        CouponPromoDTO.StepsTextDTO stepsTextDTO = null;
        CouponPromoDTO.StepsActionDTO stepsActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Boolean bool2 = bool;
            String str6 = str;
            String str7 = str2;
            if (!reader.hasNext()) {
                String str8 = str3;
                reader.endObject();
                if (str6 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str8 == null) {
                    throw c.j("backgroundColor", "backgroundColor", reader);
                }
                if (bool2 == null) {
                    throw c.j("activated", "activated", reader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (str5 == null) {
                    throw c.j("promoCode", "promoCode", reader);
                }
                if (stepsTextDTO != null) {
                    return new CouponPromoDTO(str6, str7, str8, str4, booleanValue, str5, shareDataDTO, activateActionDTO, showStepsActionDTO, stepsTextDTO, stepsActionDTO, map);
                }
                throw c.j("stepsText", "stepsText", reader);
            }
            String str9 = str3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool = bool2;
                    str3 = str9;
                    str2 = str7;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    bool = bool2;
                    str = str6;
                    str2 = str7;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 4:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("activated", "activated", reader);
                    }
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 5:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("promoCode", "promoCode", reader);
                    }
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 6:
                    shareDataDTO = this.nullableShareDataDTOAdapter.fromJson(reader);
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 7:
                    activateActionDTO = this.nullableActivateActionDTOAdapter.fromJson(reader);
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 8:
                    showStepsActionDTO = this.nullableShowStepsActionDTOAdapter.fromJson(reader);
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 9:
                    stepsTextDTO = this.stepsTextDTOAdapter.fromJson(reader);
                    if (stepsTextDTO == null) {
                        throw c.q("stepsText", "stepsText", reader);
                    }
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 10:
                    stepsActionDTO = this.nullableStepsActionDTOAdapter.fromJson(reader);
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                default:
                    bool = bool2;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CouponPromoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("activated");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getActivated()));
        writer.w("promoCode");
        this.stringAdapter.mo44toJson(writer, (x) value.getPromoCode());
        writer.w("shareData");
        this.nullableShareDataDTOAdapter.mo44toJson(writer, (x) value.getShareData());
        writer.w("activateAction");
        this.nullableActivateActionDTOAdapter.mo44toJson(writer, (x) value.getActivateAction());
        writer.w("showStepsAction");
        this.nullableShowStepsActionDTOAdapter.mo44toJson(writer, (x) value.getShowStepsAction());
        writer.w("stepsText");
        this.stepsTextDTOAdapter.mo44toJson(writer, (x) value.getStepsText());
        writer.w("stepsAction");
        this.nullableStepsActionDTOAdapter.mo44toJson(writer, (x) value.getStepsAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
