package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data;

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
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.TotalStickyV2DTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;", "summaryAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButtonAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;", "nullableDisabledButtonStyleDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TotalStickyV2DTOJsonAdapter extends JsonAdapter<TotalStickyV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<DisabledButtonStyleDTO> nullableDisabledButtonStyleDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> smallButtonAdapter;

    @NotNull
    private final JsonAdapter<TotalStickyV2DTO.Summary> summaryAdapter;

    public TotalStickyV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(FormPageDTO.Field.FIELD_TYPE_SUMMARY, "button", "badgeInfo", "trackingInfo", "disableSeparator", "backgroundColor", "showIsland", "disabledButtonStyle", "newButton");
        M m11 = M.f71699a;
        this.summaryAdapter = moshi.f(TotalStickyV2DTO.Summary.class, m11, FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.smallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "button");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "badgeInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "disableSeparator");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableDisabledButtonStyleDTOAdapter = moshi.f(DisabledButtonStyleDTO.class, m11, "disabledButtonStyle");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "newButton");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(TotalStickyV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalStickyV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TotalStickyV2DTO.Summary summary = null;
        ButtonV3Atom.SmallButton smallButton = null;
        Badge badge = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        DisabledButtonStyleDTO disabledButtonStyleDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    summary = this.summaryAdapter.fromJson(reader);
                    if (summary == null) {
                        throw c.q(FormPageDTO.Field.FIELD_TYPE_SUMMARY, FormPageDTO.Field.FIELD_TYPE_SUMMARY, reader);
                    }
                    break;
                case 1:
                    smallButton = this.smallButtonAdapter.fromJson(reader);
                    if (smallButton == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 2:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    break;
                case 3:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    disabledButtonStyleDTO = this.nullableDisabledButtonStyleDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (summary == null) {
            throw c.j(FormPageDTO.Field.FIELD_TYPE_SUMMARY, FormPageDTO.Field.FIELD_TYPE_SUMMARY, reader);
        }
        if (smallButton != null) {
            return new TotalStickyV2DTO(summary, smallButton, badge, map, bool, str, bool2, disabledButtonStyleDTO, buttonV3DTO);
        }
        throw c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalStickyV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.summaryAdapter.mo44toJson(writer, (x) value.getSummary());
        writer.w("button");
        this.smallButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("badgeInfo");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBadgeInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("disableSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getDisableSeparator());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("showIsland");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowIsland());
        writer.w("disabledButtonStyle");
        this.nullableDisabledButtonStyleDTOAdapter.mo44toJson(writer, (x) value.getDisabledButtonStyle());
        writer.w("newButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getNewButton());
        writer.p();
    }
}
