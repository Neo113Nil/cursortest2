package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data;

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
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data.SellerTransparencyProfileDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;", "statisticsItemAdapter", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "switchingButtonAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "iconButtonDTOAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "", "Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO;", "nullableListOfIconLabelButtonDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerTransparencyProfileDTOJsonAdapter extends JsonAdapter<SellerTransparencyProfileDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconButtonDTO> iconButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<IconLabelButtonDTO>> nullableListOfIconLabelButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<SellerTransparencyProfileDTO.StatisticsItem> statisticsItemAdapter;

    @NotNull
    private final JsonAdapter<SwitchingButton> switchingButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public SellerTransparencyProfileDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("avatar", "subscribers", "reviews", "subscribe", "share", "sellerName", "trustFactors", "trackingInfo");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "avatar");
        this.statisticsItemAdapter = moshi.f(SellerTransparencyProfileDTO.StatisticsItem.class, m11, "subscribers");
        this.switchingButtonAdapter = moshi.f(SwitchingButton.class, m11, "subscribe");
        this.iconButtonDTOAdapter = moshi.f(IconButtonDTO.class, m11, "share");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "sellerName");
        this.nullableListOfIconLabelButtonDTOAdapter = moshi.f(D.e(List.class, IconLabelButtonDTO.class), m11, "trustFactors");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(SellerTransparencyProfileDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SellerTransparencyProfileDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconDTO iconDTO = null;
        SellerTransparencyProfileDTO.StatisticsItem statisticsItem = null;
        SellerTransparencyProfileDTO.StatisticsItem statisticsItem2 = null;
        SwitchingButton switchingButton = null;
        IconButtonDTO iconButtonDTO = null;
        TextAtom textAtom = null;
        List<IconLabelButtonDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            IconDTO iconDTO2 = iconDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("avatar", "avatar", reader);
                    }
                    continue;
                case 1:
                    statisticsItem = this.statisticsItemAdapter.fromJson(reader);
                    if (statisticsItem == null) {
                        throw c.q("subscribers", "subscribers", reader);
                    }
                    break;
                case 2:
                    statisticsItem2 = this.statisticsItemAdapter.fromJson(reader);
                    if (statisticsItem2 == null) {
                        throw c.q("reviews", "reviews", reader);
                    }
                    break;
                case 3:
                    switchingButton = this.switchingButtonAdapter.fromJson(reader);
                    if (switchingButton == null) {
                        throw c.q("subscribe", "subscribe", reader);
                    }
                    break;
                case 4:
                    iconButtonDTO = this.iconButtonDTOAdapter.fromJson(reader);
                    if (iconButtonDTO == null) {
                        throw c.q("share", "share", reader);
                    }
                    break;
                case 5:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("sellerName", "sellerName", reader);
                    }
                    break;
                case 6:
                    list = this.nullableListOfIconLabelButtonDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            iconDTO = iconDTO2;
        }
        IconDTO iconDTO3 = iconDTO;
        reader.endObject();
        if (iconDTO3 == null) {
            throw c.j("avatar", "avatar", reader);
        }
        if (statisticsItem == null) {
            throw c.j("subscribers", "subscribers", reader);
        }
        if (statisticsItem2 == null) {
            throw c.j("reviews", "reviews", reader);
        }
        if (switchingButton == null) {
            throw c.j("subscribe", "subscribe", reader);
        }
        if (iconButtonDTO == null) {
            throw c.j("share", "share", reader);
        }
        if (textAtom != null) {
            return new SellerTransparencyProfileDTO(iconDTO3, statisticsItem, statisticsItem2, switchingButton, iconButtonDTO, textAtom, list, map);
        }
        throw c.j("sellerName", "sellerName", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SellerTransparencyProfileDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("avatar");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getAvatar());
        writer.w("subscribers");
        this.statisticsItemAdapter.mo44toJson(writer, (x) value.getSubscribers());
        writer.w("reviews");
        this.statisticsItemAdapter.mo44toJson(writer, (x) value.getReviews());
        writer.w("subscribe");
        this.switchingButtonAdapter.mo44toJson(writer, (x) value.getSubscribe());
        writer.w("share");
        this.iconButtonDTOAdapter.mo44toJson(writer, (x) value.getShare());
        writer.w("sellerName");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getSellerName());
        writer.w("trustFactors");
        this.nullableListOfIconLabelButtonDTOAdapter.mo44toJson(writer, (x) value.getTrustFactors());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
