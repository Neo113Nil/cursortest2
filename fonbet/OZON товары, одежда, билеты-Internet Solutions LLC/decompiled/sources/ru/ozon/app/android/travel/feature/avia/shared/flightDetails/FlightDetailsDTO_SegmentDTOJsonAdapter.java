package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO_SegmentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentInfoDTO;", "segmentInfoDTOAdapter", "", "listOfBadgeDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$NoteDTO;", "nullableNoteDTOAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlightDetailsDTO_SegmentDTOJsonAdapter extends JsonAdapter<FlightDetailsDTO.SegmentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<FlightDetailsDTO.NoteDTO> nullableNoteDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<FlightDetailsDTO.SegmentInfoDTO> segmentInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public FlightDetailsDTO_SegmentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("airlineLogo", "subAirlineLogo", "airline", "segmentDuration", "segmentAirplane", "segmentBadge", "segmentDeparture", "segmentArrival", "luggageBadges", "segmentNote");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "airlineLogo");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "subAirlineLogo");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "airline");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "segmentAirplane");
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "segmentBadge");
        this.segmentInfoDTOAdapter = moshi.f(FlightDetailsDTO.SegmentInfoDTO.class, m11, "segmentDeparture");
        this.listOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "luggageBadges");
        this.nullableNoteDTOAdapter = moshi.f(FlightDetailsDTO.NoteDTO.class, m11, "segmentNote");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(FlightDetailsDTO.SegmentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightDetailsDTO.SegmentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconDTO iconDTO = null;
        IconDTO iconDTO2 = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        BadgeDTO badgeDTO = null;
        FlightDetailsDTO.SegmentInfoDTO segmentInfoDTO = null;
        FlightDetailsDTO.SegmentInfoDTO segmentInfoDTO2 = null;
        List<BadgeDTO> list = null;
        FlightDetailsDTO.NoteDTO noteDTO = null;
        while (true) {
            IconDTO iconDTO3 = iconDTO;
            IconDTO iconDTO4 = iconDTO2;
            TextDTO textDTO4 = textDTO;
            if (!reader.hasNext()) {
                TextDTO textDTO5 = textDTO2;
                reader.endObject();
                if (iconDTO3 == null) {
                    throw c.j("airlineLogo", "airlineLogo", reader);
                }
                if (textDTO4 == null) {
                    throw c.j("airline", "airline", reader);
                }
                if (textDTO5 == null) {
                    throw c.j("segmentDuration", "segmentDuration", reader);
                }
                if (badgeDTO == null) {
                    throw c.j("segmentBadge", "segmentBadge", reader);
                }
                if (segmentInfoDTO == null) {
                    throw c.j("segmentDeparture", "segmentDeparture", reader);
                }
                if (segmentInfoDTO2 == null) {
                    throw c.j("segmentArrival", "segmentArrival", reader);
                }
                if (list != null) {
                    return new FlightDetailsDTO.SegmentDTO(iconDTO3, iconDTO4, textDTO4, textDTO5, textDTO3, badgeDTO, segmentInfoDTO, segmentInfoDTO2, list, noteDTO);
                }
                throw c.j("luggageBadges", "luggageBadges", reader);
            }
            TextDTO textDTO6 = textDTO2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 0:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("airlineLogo", "airlineLogo", reader);
                    }
                    textDTO2 = textDTO6;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 1:
                    iconDTO2 = this.nullableIconDTOAdapter.fromJson(reader);
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    textDTO = textDTO4;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("airline", "airline", reader);
                    }
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                case 3:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("segmentDuration", "segmentDuration", reader);
                    }
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 4:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 5:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("segmentBadge", "segmentBadge", reader);
                    }
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 6:
                    segmentInfoDTO = this.segmentInfoDTOAdapter.fromJson(reader);
                    if (segmentInfoDTO == null) {
                        throw c.q("segmentDeparture", "segmentDeparture", reader);
                    }
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 7:
                    segmentInfoDTO2 = this.segmentInfoDTOAdapter.fromJson(reader);
                    if (segmentInfoDTO2 == null) {
                        throw c.q("segmentArrival", "segmentArrival", reader);
                    }
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 8:
                    list = this.listOfBadgeDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("luggageBadges", "luggageBadges", reader);
                    }
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                case 9:
                    noteDTO = this.nullableNoteDTOAdapter.fromJson(reader);
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
                default:
                    textDTO2 = textDTO6;
                    iconDTO = iconDTO3;
                    iconDTO2 = iconDTO4;
                    textDTO = textDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightDetailsDTO.SegmentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("airlineLogo");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getAirlineLogo());
        writer.w("subAirlineLogo");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getSubAirlineLogo());
        writer.w("airline");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getAirline());
        writer.w("segmentDuration");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSegmentDuration());
        writer.w("segmentAirplane");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSegmentAirplane());
        writer.w("segmentBadge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getSegmentBadge());
        writer.w("segmentDeparture");
        this.segmentInfoDTOAdapter.mo44toJson(writer, (x) value.getSegmentDeparture());
        writer.w("segmentArrival");
        this.segmentInfoDTOAdapter.mo44toJson(writer, (x) value.getSegmentArrival());
        writer.w("luggageBadges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getLuggageBadges());
        writer.w("segmentNote");
        this.nullableNoteDTOAdapter.mo44toJson(writer, (x) value.getSegmentNote());
        writer.p();
    }
}
