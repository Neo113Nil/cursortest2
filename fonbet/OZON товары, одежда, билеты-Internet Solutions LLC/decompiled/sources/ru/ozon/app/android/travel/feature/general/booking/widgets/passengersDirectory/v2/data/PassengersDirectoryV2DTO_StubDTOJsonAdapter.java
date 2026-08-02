package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.data;

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
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.data.PassengersDirectoryV2DTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO_StubDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "themeImageV1DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "nullableLinkButtonDTOAdapter", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV2DTO_StubDTOJsonAdapter extends JsonAdapter<PassengersDirectoryV2DTO.StubDTO> {

    @NotNull
    private final JsonAdapter<LinkButtonDTO> nullableLinkButtonDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    @NotNull
    private final JsonAdapter<ThemeImageV1DTO> themeImageV1DTOAdapter;

    public PassengersDirectoryV2DTO_StubDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", CommentV3DTO.HEADER_FIELD_NAME, "explanation", "resetSearch");
        M m11 = M.f71699a;
        this.themeImageV1DTOAdapter = moshi.f(ThemeImageV1DTO.class, m11, "image");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableLinkButtonDTOAdapter = moshi.f(LinkButtonDTO.class, m11, "resetSearch");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(PassengersDirectoryV2DTO.StubDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PassengersDirectoryV2DTO.StubDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ThemeImageV1DTO themeImageV1DTO = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        LinkButtonDTO linkButtonDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                themeImageV1DTO = this.themeImageV1DTOAdapter.fromJson(reader);
                if (themeImageV1DTO == null) {
                    throw c.q("image", "image", reader);
                }
            } else if (v11 == 1) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 2) {
                textAtom2 = this.textAtomAdapter.fromJson(reader);
                if (textAtom2 == null) {
                    throw c.q("explanation", "explanation", reader);
                }
            } else if (v11 == 3) {
                linkButtonDTO = this.nullableLinkButtonDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (themeImageV1DTO == null) {
            throw c.j("image", "image", reader);
        }
        if (textAtom == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (textAtom2 != null) {
            return new PassengersDirectoryV2DTO.StubDTO(themeImageV1DTO, textAtom, textAtom2, linkButtonDTO);
        }
        throw c.j("explanation", "explanation", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PassengersDirectoryV2DTO.StubDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.themeImageV1DTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("explanation");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getExplanation());
        writer.w("resetSearch");
        this.nullableLinkButtonDTOAdapter.mo44toJson(writer, (x) value.getResetSearch());
        writer.p();
    }
}
