package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data;

import Y9.b;
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
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data.DeliveryWidgetV4DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$ContentBlock;", "listOfContentBlockAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Progress;", "nullableProgressAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Chevron;", "chevronAdapter", "nullableStringAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Spacers;", "spacersAdapter", "", "longAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV4DTOJsonAdapter extends JsonAdapter<DeliveryWidgetV4DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<DeliveryWidgetV4DTO.Chevron> chevronAdapter;

    @NotNull
    private final JsonAdapter<List<DeliveryWidgetV4DTO.ContentBlock>> listOfContentBlockAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<DeliveryWidgetV4DTO.Progress> nullableProgressAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<DeliveryWidgetV4DTO.Spacers> spacersAdapter;

    public DeliveryWidgetV4DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("deliveryConditionsBlocks", "progress", "chevron", "borderColor", "backgroundColor", "spacers", "widgetUpdatePeriod", "action", "trackingInfo");
        b e11 = D.e(List.class, DeliveryWidgetV4DTO.ContentBlock.class);
        M m11 = M.f71699a;
        this.listOfContentBlockAdapter = moshi.f(e11, m11, "deliveryConditionsBlocks");
        this.nullableProgressAdapter = moshi.f(DeliveryWidgetV4DTO.Progress.class, m11, "progress");
        this.chevronAdapter = moshi.f(DeliveryWidgetV4DTO.Chevron.class, m11, "chevron");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.spacersAdapter = moshi.f(DeliveryWidgetV4DTO.Spacers.class, m11, "spacers");
        this.longAdapter = moshi.f(Long.TYPE, m11, "widgetUpdatePeriod");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(41, "GeneratedJsonAdapter(DeliveryWidgetV4DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryWidgetV4DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        List<DeliveryWidgetV4DTO.ContentBlock> list = null;
        DeliveryWidgetV4DTO.Progress progress = null;
        DeliveryWidgetV4DTO.Chevron chevron = null;
        String str = null;
        String str2 = null;
        DeliveryWidgetV4DTO.Spacers spacers = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Long l12 = l11;
            if (!reader.hasNext()) {
                reader.endObject();
                if (list == null) {
                    throw c.j("deliveryConditionsBlocks", "deliveryConditionsBlocks", reader);
                }
                if (chevron == null) {
                    throw c.j("chevron", "chevron", reader);
                }
                if (spacers == null) {
                    throw c.j("spacers", "spacers", reader);
                }
                if (l12 == null) {
                    throw c.j("widgetUpdatePeriod", "widgetUpdatePeriod", reader);
                }
                long longValue = l12.longValue();
                if (atomActionDTO != null) {
                    return new DeliveryWidgetV4DTO(list, progress, chevron, str, str2, spacers, longValue, atomActionDTO, map);
                }
                throw c.j("action", "action", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfContentBlockAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("deliveryConditionsBlocks", "deliveryConditionsBlocks", reader);
                    }
                    break;
                case 1:
                    progress = this.nullableProgressAdapter.fromJson(reader);
                    break;
                case 2:
                    chevron = this.chevronAdapter.fromJson(reader);
                    if (chevron == null) {
                        throw c.q("chevron", "chevron", reader);
                    }
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    spacers = this.spacersAdapter.fromJson(reader);
                    if (spacers == null) {
                        throw c.q("spacers", "spacers", reader);
                    }
                    break;
                case 6:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("widgetUpdatePeriod", "widgetUpdatePeriod", reader);
                    }
                    continue;
                case 7:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("action", "action", reader);
                    }
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            l11 = l12;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryWidgetV4DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("deliveryConditionsBlocks");
        this.listOfContentBlockAdapter.mo44toJson(writer, (x) value.getDeliveryConditionsBlocks());
        writer.w("progress");
        this.nullableProgressAdapter.mo44toJson(writer, (x) value.getProgress());
        writer.w("chevron");
        this.chevronAdapter.mo44toJson(writer, (x) value.getChevron());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("spacers");
        this.spacersAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.w("widgetUpdatePeriod");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getWidgetUpdatePeriod()));
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
