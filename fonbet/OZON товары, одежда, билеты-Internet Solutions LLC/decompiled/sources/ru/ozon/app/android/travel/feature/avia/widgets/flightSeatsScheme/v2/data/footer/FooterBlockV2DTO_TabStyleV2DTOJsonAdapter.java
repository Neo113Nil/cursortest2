package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer;

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
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO_TabStyleV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FooterBlockV2DTO_TabStyleV2DTOJsonAdapter extends JsonAdapter<FooterBlockV2DTO.TabStyleV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FooterBlockV2DTO_TabStyleV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("tabDefaultColor", "tabSelectionColor", "tabDefaultTextColor", "tabSelectionTextColor", "indicatorDefaultColor", "indicatorSelectionColor", "indicatorDefaultTextColor", "indicatorSelectionTextColor");
        this.stringAdapter = moshi.f(String.class, M.f71699a, "tabDefaultColor");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(FooterBlockV2DTO.TabStyleV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FooterBlockV2DTO.TabStyleV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            if (!reader.hasNext()) {
                String str11 = str3;
                reader.endObject();
                if (str9 == null) {
                    throw c.j("tabDefaultColor", "tabDefaultColor", reader);
                }
                if (str10 == null) {
                    throw c.j("tabSelectionColor", "tabSelectionColor", reader);
                }
                if (str11 == null) {
                    throw c.j("tabDefaultTextColor", "tabDefaultTextColor", reader);
                }
                if (str4 == null) {
                    throw c.j("tabSelectionTextColor", "tabSelectionTextColor", reader);
                }
                if (str5 == null) {
                    throw c.j("indicatorDefaultColor", "indicatorDefaultColor", reader);
                }
                if (str6 == null) {
                    throw c.j("indicatorSelectionColor", "indicatorSelectionColor", reader);
                }
                if (str7 == null) {
                    throw c.j("indicatorDefaultTextColor", "indicatorDefaultTextColor", reader);
                }
                if (str8 != null) {
                    return new FooterBlockV2DTO.TabStyleV2DTO(str9, str10, str11, str4, str5, str6, str7, str8);
                }
                throw c.j("indicatorSelectionTextColor", "indicatorSelectionTextColor", reader);
            }
            String str12 = str3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str3 = str12;
                    str = str9;
                    str2 = str10;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("tabDefaultColor", "tabDefaultColor", reader);
                    }
                    str3 = str12;
                    str2 = str10;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("tabSelectionColor", "tabSelectionColor", reader);
                    }
                    str3 = str12;
                    str = str9;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("tabDefaultTextColor", "tabDefaultTextColor", reader);
                    }
                    str = str9;
                    str2 = str10;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("tabSelectionTextColor", "tabSelectionTextColor", reader);
                    }
                    str3 = str12;
                    str = str9;
                    str2 = str10;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("indicatorDefaultColor", "indicatorDefaultColor", reader);
                    }
                    str3 = str12;
                    str = str9;
                    str2 = str10;
                case 5:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("indicatorSelectionColor", "indicatorSelectionColor", reader);
                    }
                    str3 = str12;
                    str = str9;
                    str2 = str10;
                case 6:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("indicatorDefaultTextColor", "indicatorDefaultTextColor", reader);
                    }
                    str3 = str12;
                    str = str9;
                    str2 = str10;
                case 7:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("indicatorSelectionTextColor", "indicatorSelectionTextColor", reader);
                    }
                    str3 = str12;
                    str = str9;
                    str2 = str10;
                default:
                    str3 = str12;
                    str = str9;
                    str2 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FooterBlockV2DTO.TabStyleV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("tabDefaultColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTabDefaultColor());
        writer.w("tabSelectionColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTabSelectionColor());
        writer.w("tabDefaultTextColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTabDefaultTextColor());
        writer.w("tabSelectionTextColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTabSelectionTextColor());
        writer.w("indicatorDefaultColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getIndicatorDefaultColor());
        writer.w("indicatorSelectionColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getIndicatorSelectionColor());
        writer.w("indicatorDefaultTextColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getIndicatorDefaultTextColor());
        writer.w("indicatorSelectionTextColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getIndicatorSelectionTextColor());
        writer.p();
    }
}
