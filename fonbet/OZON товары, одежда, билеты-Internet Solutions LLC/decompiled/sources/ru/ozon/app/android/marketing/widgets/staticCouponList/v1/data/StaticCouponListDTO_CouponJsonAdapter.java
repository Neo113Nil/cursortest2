package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

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
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO_CouponJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "backgroundAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "nullableIconDTOAdapter", "", "booleanAdapter", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon$Stub;", "stubAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListDTO_CouponJsonAdapter extends JsonAdapter<StaticCouponListDTO.Coupon> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<StaticCouponListDTO.Background> backgroundAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<StaticCouponListDTO.Coupon.Stub> stubAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public StaticCouponListDTO_CouponJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("bgColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "chevron", "leftIcon", "isApplied", "appliedStub", "unAppliedStub", "common");
        M m11 = M.f71699a;
        this.backgroundAdapter = moshi.f(StaticCouponListDTO.Background.class, m11, "bgColor");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "chevron");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "leftIcon");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isApplied");
        this.stubAdapter = moshi.f(StaticCouponListDTO.Coupon.Stub.class, m11, "appliedStub");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(StaticCouponListDTO.Coupon)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StaticCouponListDTO.Coupon fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        StaticCouponListDTO.Background background = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        IconDTO iconDTO = null;
        IconDTO iconDTO2 = null;
        StaticCouponListDTO.Coupon.Stub stub = null;
        StaticCouponListDTO.Coupon.Stub stub2 = null;
        CommonControlSettings commonControlSettings = null;
        while (true) {
            Boolean bool2 = bool;
            StaticCouponListDTO.Background background2 = background;
            TextDTO textDTO3 = textDTO;
            if (!reader.hasNext()) {
                TextDTO textDTO4 = textDTO2;
                reader.endObject();
                if (background2 == null) {
                    throw c.j("bgColor", "bgColor", reader);
                }
                if (textDTO3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textDTO4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (iconDTO == null) {
                    throw c.j("chevron", "chevron", reader);
                }
                if (bool2 == null) {
                    throw c.j("isApplied", "isApplied", reader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (stub == null) {
                    throw c.j("appliedStub", "appliedStub", reader);
                }
                if (stub2 == null) {
                    throw c.j("unAppliedStub", "unAppliedStub", reader);
                }
                if (commonControlSettings != null) {
                    return new StaticCouponListDTO.Coupon(background2, textDTO3, textDTO4, iconDTO, iconDTO2, booleanValue, stub, stub2, commonControlSettings);
                }
                throw c.j("common", "common", reader);
            }
            TextDTO textDTO5 = textDTO2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
                case 0:
                    background = this.backgroundAdapter.fromJson(reader);
                    if (background == null) {
                        throw c.q("bgColor", "bgColor", reader);
                    }
                    bool = bool2;
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                case 2:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    bool = bool2;
                    background = background2;
                    textDTO = textDTO3;
                case 3:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("chevron", "chevron", reader);
                    }
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
                case 4:
                    iconDTO2 = this.nullableIconDTOAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
                case 5:
                    Boolean fromJson = this.booleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("isApplied", "isApplied", reader);
                    }
                    bool = fromJson;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
                case 6:
                    stub = this.stubAdapter.fromJson(reader);
                    if (stub == null) {
                        throw c.q("appliedStub", "appliedStub", reader);
                    }
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
                case 7:
                    stub2 = this.stubAdapter.fromJson(reader);
                    if (stub2 == null) {
                        throw c.q("unAppliedStub", "unAppliedStub", reader);
                    }
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
                case 8:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("common", "common", reader);
                    }
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
                default:
                    bool = bool2;
                    textDTO2 = textDTO5;
                    background = background2;
                    textDTO = textDTO3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StaticCouponListDTO.Coupon value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("bgColor");
        this.backgroundAdapter.mo44toJson(writer, (x) value.getBgColor());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("chevron");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getChevron());
        writer.w("leftIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getLeftIcon());
        writer.w("isApplied");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isApplied()));
        writer.w("appliedStub");
        this.stubAdapter.mo44toJson(writer, (x) value.getAppliedStub());
        writer.w("unAppliedStub");
        this.stubAdapter.mo44toJson(writer, (x) value.getUnAppliedStub());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
