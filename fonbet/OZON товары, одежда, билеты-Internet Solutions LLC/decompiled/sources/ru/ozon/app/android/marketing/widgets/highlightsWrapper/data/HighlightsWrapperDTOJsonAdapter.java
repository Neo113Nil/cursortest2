package ru.ozon.app.android.marketing.widgets.highlightsWrapper.data;

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
import ru.ozon.app.android.marketing.widgets.actionProgress.data.ActionProgressDTO;
import ru.ozon.app.android.marketing.widgets.coupon.data.CouponDTO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.data.HighlightProductsDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "nullableActionProgressDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "nullableCouponDTOAdapter", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "nullableHighlightProductsDTOAdapter", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "nullableHighlightsCurrentMiniWidgetAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "nullableHighlightsWrapperProgressTextAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightsWrapperDTOJsonAdapter extends JsonAdapter<HighlightsWrapperDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ActionProgressDTO> nullableActionProgressDTOAdapter;

    @NotNull
    private final JsonAdapter<CouponDTO> nullableCouponDTOAdapter;

    @NotNull
    private final JsonAdapter<HighlightProductsDTO> nullableHighlightProductsDTOAdapter;

    @NotNull
    private final JsonAdapter<HighlightsCurrentMiniWidget> nullableHighlightsCurrentMiniWidgetAdapter;

    @NotNull
    private final JsonAdapter<HighlightsWrapperProgressText> nullableHighlightsWrapperProgressTextAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final n.a options;

    public HighlightsWrapperDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("actionProgress", "coupon", "highlightProducts", "currentMiniWidget", "cartButton", "progressText");
        M m11 = M.f71699a;
        this.nullableActionProgressDTOAdapter = moshi.f(ActionProgressDTO.class, m11, "actionProgress");
        this.nullableCouponDTOAdapter = moshi.f(CouponDTO.class, m11, "coupon");
        this.nullableHighlightProductsDTOAdapter = moshi.f(HighlightProductsDTO.class, m11, "highlightProducts");
        this.nullableHighlightsCurrentMiniWidgetAdapter = moshi.f(HighlightsCurrentMiniWidget.class, m11, "currentMiniWidget");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "cartButton");
        this.nullableHighlightsWrapperProgressTextAdapter = moshi.f(HighlightsWrapperProgressText.class, m11, "progressText");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(HighlightsWrapperDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HighlightsWrapperDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ActionProgressDTO actionProgressDTO = null;
        CouponDTO couponDTO = null;
        HighlightProductsDTO highlightProductsDTO = null;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = null;
        ButtonV3Atom.LargeButton largeButton = null;
        HighlightsWrapperProgressText highlightsWrapperProgressText = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    actionProgressDTO = this.nullableActionProgressDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    couponDTO = this.nullableCouponDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    highlightProductsDTO = this.nullableHighlightProductsDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    highlightsCurrentMiniWidget = this.nullableHighlightsCurrentMiniWidgetAdapter.fromJson(reader);
                    break;
                case 4:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    highlightsWrapperProgressText = this.nullableHighlightsWrapperProgressTextAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new HighlightsWrapperDTO(actionProgressDTO, couponDTO, highlightProductsDTO, highlightsCurrentMiniWidget, largeButton, highlightsWrapperProgressText);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HighlightsWrapperDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("actionProgress");
        this.nullableActionProgressDTOAdapter.mo44toJson(writer, (x) value.getActionProgress());
        writer.w("coupon");
        this.nullableCouponDTOAdapter.mo44toJson(writer, (x) value.getCoupon());
        writer.w("highlightProducts");
        this.nullableHighlightProductsDTOAdapter.mo44toJson(writer, (x) value.getHighlightProducts());
        writer.w("currentMiniWidget");
        this.nullableHighlightsCurrentMiniWidgetAdapter.mo44toJson(writer, (x) value.getCurrentMiniWidget());
        writer.w("cartButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getCartButton());
        writer.w("progressText");
        this.nullableHighlightsWrapperProgressTextAdapter.mo44toJson(writer, (x) value.getProgressText());
        writer.p();
    }
}
