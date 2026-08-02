package ru.ozon.app.android.ugc.widgets.reviewFormMobile.data;

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
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO_FooterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$PointsProgress;", "nullablePointsProgressAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$Footer$FooterCellDTO;", "nullableFooterCellDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableBooleanAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormDTO_FooterJsonAdapter extends JsonAdapter<ReviewFormDTO.Footer> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ReviewFormDTO.Footer.FooterCellDTO> nullableFooterCellDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ReviewFormDTO.Footer.PointsProgress> nullablePointsProgressAdapter;

    @NotNull
    private final n.a options;

    public ReviewFormDTO_FooterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("submitButton", "pointsProgress", "footerCell", "submitErrorTrackingInfo", "isBorderHidden", "isSticky");
        M m11 = M.f71699a;
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "submitButton");
        this.nullablePointsProgressAdapter = moshi.f(ReviewFormDTO.Footer.PointsProgress.class, m11, "pointsProgress");
        this.nullableFooterCellDTOAdapter = moshi.f(ReviewFormDTO.Footer.FooterCellDTO.class, m11, "footerCell");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "submitErrorTrackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isBorderHidden");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(ReviewFormDTO.Footer)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormDTO.Footer fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3DTO buttonV3DTO = null;
        ReviewFormDTO.Footer.PointsProgress pointsProgress = null;
        ReviewFormDTO.Footer.FooterCellDTO footerCellDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("submitButton", "submitButton", reader);
                    }
                    break;
                case 1:
                    pointsProgress = this.nullablePointsProgressAdapter.fromJson(reader);
                    break;
                case 2:
                    footerCellDTO = this.nullableFooterCellDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (buttonV3DTO != null) {
            return new ReviewFormDTO.Footer(buttonV3DTO, pointsProgress, footerCellDTO, map, bool, bool2);
        }
        throw c.j("submitButton", "submitButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormDTO.Footer value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("submitButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("pointsProgress");
        this.nullablePointsProgressAdapter.mo44toJson(writer, (x) value.getPointsProgress());
        writer.w("footerCell");
        this.nullableFooterCellDTOAdapter.mo44toJson(writer, (x) value.getFooterCell());
        writer.w("submitErrorTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSubmitErrorTrackingInfo());
        writer.w("isBorderHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isBorderHidden());
        writer.w("isSticky");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSticky());
        writer.p();
    }
}
