package ru.ozon.app.android.marketing.widgets.coupon.data;

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
import ru.ozon.app.android.marketing.widgets.coupon.data.CouponDTO;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO$Gradient;", "gradientAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "nullableHighlightsCurrentMiniWidgetAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponDTOJsonAdapter extends JsonAdapter<CouponDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CouponDTO.Gradient> gradientAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<HighlightsCurrentMiniWidget> nullableHighlightsCurrentMiniWidgetAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public CouponDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("gradient", "code", "applyText", "subtitle", "appliedColor", "action", "trackingInfo", "currentMiniWidget");
        M m11 = M.f71699a;
        this.gradientAdapter = moshi.f(CouponDTO.Gradient.class, m11, "gradient");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "code");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.stringAdapter = moshi.f(String.class, m11, "appliedColor");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableHighlightsCurrentMiniWidgetAdapter = moshi.f(HighlightsCurrentMiniWidget.class, m11, "currentMiniWidget");
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(CouponDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CouponDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = null;
        boolean z11 = false;
        CouponDTO.Gradient gradient = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    gradient = this.gradientAdapter.fromJson(reader);
                    if (gradient == null) {
                        throw c.q("gradient", "gradient", reader);
                    }
                    break;
                case 1:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("code", "code", reader);
                    }
                    break;
                case 2:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("applyText", "applyText", reader);
                    }
                    break;
                case 3:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("appliedColor", "appliedColor", reader);
                    }
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    highlightsCurrentMiniWidget = this.nullableHighlightsCurrentMiniWidgetAdapter.fromJson(reader);
                    z11 = true;
                    break;
            }
        }
        reader.endObject();
        if (gradient == null) {
            throw c.j("gradient", "gradient", reader);
        }
        if (textAtom == null) {
            throw c.j("code", "code", reader);
        }
        if (textAtom2 == null) {
            throw c.j("applyText", "applyText", reader);
        }
        if (str == null) {
            throw c.j("appliedColor", "appliedColor", reader);
        }
        CouponDTO couponDTO = new CouponDTO(gradient, textAtom, textAtom2, textAtom3, str, atomActionDTO, map);
        if (z11) {
            couponDTO.setCurrentMiniWidget(highlightsCurrentMiniWidget);
        }
        return couponDTO;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CouponDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("gradient");
        this.gradientAdapter.mo44toJson(writer, (x) value.getGradient());
        writer.w("code");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getCode());
        writer.w("applyText");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getApplyText());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("appliedColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getAppliedColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("currentMiniWidget");
        this.nullableHighlightsCurrentMiniWidgetAdapter.mo44toJson(writer, (x) value.getCurrentMiniWidget());
        writer.p();
    }
}
