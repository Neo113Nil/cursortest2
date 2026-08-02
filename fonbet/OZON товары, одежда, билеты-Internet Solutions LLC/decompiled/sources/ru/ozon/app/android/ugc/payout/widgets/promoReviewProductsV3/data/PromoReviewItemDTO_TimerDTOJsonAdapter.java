package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data;

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
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewItemDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO_TimerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "dateTimeAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoReviewItemDTO_TimerDTOJsonAdapter extends JsonAdapter<PromoReviewItemDTO.TimerDTO> {

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PromoReviewItemDTO_TimerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "textColor", "typographyToken", "serverTimestamp", "startTimestamp", "endTimestamp", "cornerRadius");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.dateTimeAdapter = moshi.f(DateTime.class, m11, "serverTimestamp");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(PromoReviewItemDTO.TimerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PromoReviewItemDTO.TimerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        DateTime dateTime3 = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("textColor", "textColor", reader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("typographyToken", "typographyToken", reader);
                    }
                    break;
                case 3:
                    dateTime = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime == null) {
                        throw c.q("serverTimestamp", "serverTimestamp", reader);
                    }
                    break;
                case 4:
                    dateTime2 = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime2 == null) {
                        throw c.q("startTimestamp", "startTimestamp", reader);
                    }
                    break;
                case 5:
                    dateTime3 = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime3 == null) {
                        throw c.q("endTimestamp", "endTimestamp", reader);
                    }
                    break;
                case 6:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (str2 == null) {
            throw c.j("textColor", "textColor", reader);
        }
        if (str3 == null) {
            throw c.j("typographyToken", "typographyToken", reader);
        }
        if (dateTime == null) {
            throw c.j("serverTimestamp", "serverTimestamp", reader);
        }
        if (dateTime2 == null) {
            throw c.j("startTimestamp", "startTimestamp", reader);
        }
        if (dateTime3 != null) {
            return new PromoReviewItemDTO.TimerDTO(str, str2, str3, dateTime, dateTime2, dateTime3, cornerRadius);
        }
        throw c.j("endTimestamp", "endTimestamp", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PromoReviewItemDTO.TimerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("textColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("typographyToken");
        this.stringAdapter.mo44toJson(writer, (x) value.getTypographyToken());
        writer.w("serverTimestamp");
        this.dateTimeAdapter.mo44toJson(writer, (x) value.getServerTimestamp());
        writer.w("startTimestamp");
        this.dateTimeAdapter.mo44toJson(writer, (x) value.getStartTimestamp());
        writer.w("endTimestamp");
        this.dateTimeAdapter.mo44toJson(writer, (x) value.getEndTimestamp());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
