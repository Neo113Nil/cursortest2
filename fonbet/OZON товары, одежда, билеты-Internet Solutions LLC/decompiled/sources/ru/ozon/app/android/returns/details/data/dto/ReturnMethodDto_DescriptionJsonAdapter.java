package ru.ozon.app.android.returns.details.data.dto;

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
import ru.ozon.app.android.returns.details.data.dto.ReturnMethodDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto_DescriptionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$Description;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$Description;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$Description;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextAtomAdapter", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;", "nullableTimeSlotSelectorAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "nullableSmallBorderlessButtonAdapter", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "badgeDTOAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnMethodDto_DescriptionJsonAdapter extends JsonAdapter<ReturnMethodDto.Description> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButton> nullableSmallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<ReturnMethodDto.TimeSlotSelector> nullableTimeSlotSelectorAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ReturnMethodDto_DescriptionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "timeSlotSelector", "link", "infoFields", "badge");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.nullableTimeSlotSelectorAdapter = moshi.f(ReturnMethodDto.TimeSlotSelector.class, m11, "timeSlotSelector");
        this.nullableSmallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "link");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "infoFields");
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(ReturnMethodDto.Description)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnMethodDto.Description fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        ReturnMethodDto.TimeSlotSelector timeSlotSelector = null;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        List<BadgeDTO> list = null;
        BadgeDTO badgeDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 2:
                    timeSlotSelector = this.nullableTimeSlotSelectorAdapter.fromJson(reader);
                    break;
                case 3:
                    smallBorderlessButton = this.nullableSmallBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("badge", "badge", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (badgeDTO != null) {
            return new ReturnMethodDto.Description(textAtom, textAtom2, timeSlotSelector, smallBorderlessButton, list, badgeDTO);
        }
        throw c.j("badge", "badge", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnMethodDto.Description value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("timeSlotSelector");
        this.nullableTimeSlotSelectorAdapter.mo44toJson(writer, (x) value.getTimeSlotSelector());
        writer.w("link");
        this.nullableSmallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("infoFields");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getInfoFields());
        writer.w("badge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.p();
    }
}
