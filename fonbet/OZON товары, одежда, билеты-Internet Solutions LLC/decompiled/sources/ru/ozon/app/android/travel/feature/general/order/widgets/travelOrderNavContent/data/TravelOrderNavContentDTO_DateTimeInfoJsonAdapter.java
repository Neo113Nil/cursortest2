package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.data;

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
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.data.TravelOrderNavContentDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO_DateTimeInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspectDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderNavContentDTO_DateTimeInfoJsonAdapter extends JsonAdapter<TravelOrderNavContentDTO.DateTimeInfo> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AspectDTO> aspectDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public TravelOrderNavContentDTO_DateTimeInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("fromTitle", "fromSubtitle", "toTitle", "toSubtitle", "aspect", "icon");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "fromTitle");
        this.aspectDTOAdapter = moshi.f(AspectDTO.class, m11, "aspect");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(TravelOrderNavContentDTO.DateTimeInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelOrderNavContentDTO.DateTimeInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        TextDTO textDTO4 = null;
        AspectDTO aspectDTO = null;
        IconDTO iconDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("fromTitle", "fromTitle", reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("fromSubtitle", "fromSubtitle", reader);
                    }
                    break;
                case 2:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("toTitle", "toTitle", reader);
                    }
                    break;
                case 3:
                    textDTO4 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO4 == null) {
                        throw c.q("toSubtitle", "toSubtitle", reader);
                    }
                    break;
                case 4:
                    aspectDTO = this.aspectDTOAdapter.fromJson(reader);
                    if (aspectDTO == null) {
                        throw c.q("aspect", "aspect", reader);
                    }
                    break;
                case 5:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j("fromTitle", "fromTitle", reader);
        }
        if (textDTO2 == null) {
            throw c.j("fromSubtitle", "fromSubtitle", reader);
        }
        if (textDTO3 == null) {
            throw c.j("toTitle", "toTitle", reader);
        }
        if (textDTO4 == null) {
            throw c.j("toSubtitle", "toSubtitle", reader);
        }
        if (aspectDTO != null) {
            return new TravelOrderNavContentDTO.DateTimeInfo(textDTO, textDTO2, textDTO3, textDTO4, aspectDTO, iconDTO);
        }
        throw c.j("aspect", "aspect", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelOrderNavContentDTO.DateTimeInfo value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("fromTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getFromTitle());
        writer.w("fromSubtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getFromSubtitle());
        writer.w("toTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getToTitle());
        writer.w("toSubtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getToSubtitle());
        writer.w("aspect");
        this.aspectDTOAdapter.mo44toJson(writer, (x) value.getAspect());
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.p();
    }
}
