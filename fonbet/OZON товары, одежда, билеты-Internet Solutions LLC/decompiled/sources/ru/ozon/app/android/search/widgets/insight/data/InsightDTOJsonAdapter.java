package ru.ozon.app.android.search.widgets.insight.data;

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
import ru.ozon.app.android.search.widgets.insight.data.InsightDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/data/InsightDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/insight/data/InsightDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/insight/data/InsightDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/insight/data/InsightDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", "nullableFooterDTOAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsightDTOJsonAdapter extends JsonAdapter<InsightDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<NotificationDTO> notificationDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<InsightDTO.FooterDTO> nullableFooterDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public InsightDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "borderRadius", "marginTop", "marginBottom", CommentV3DTO.HEADER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, "deleteErrorNotification", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "borderRadius");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableFooterDTOAdapter = moshi.f(InsightDTO.FooterDTO.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.notificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "deleteErrorNotification");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(InsightDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InsightDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        CellDTO cellDTO = null;
        InsightDTO.FooterDTO footerDTO = null;
        NotificationDTO notificationDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    footerDTO = this.nullableFooterDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    notificationDTO = this.notificationDTOAdapter.fromJson(reader);
                    if (notificationDTO == null) {
                        throw c.q("deleteErrorNotification", "deleteErrorNotification", reader);
                    }
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (notificationDTO != null) {
            return new InsightDTO(str, num, num2, num3, cellDTO, footerDTO, notificationDTO, map);
        }
        throw c.j("deleteErrorNotification", "deleteErrorNotification", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InsightDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("borderRadius");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getBorderRadius());
        writer.w("marginTop");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMarginTop());
        writer.w("marginBottom");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMarginBottom());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableFooterDTOAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w("deleteErrorNotification");
        this.notificationDTOAdapter.mo44toJson(writer, (x) value.getDeleteErrorNotification());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
