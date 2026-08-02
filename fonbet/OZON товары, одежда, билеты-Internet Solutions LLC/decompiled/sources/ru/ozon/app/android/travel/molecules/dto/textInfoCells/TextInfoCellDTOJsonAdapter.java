package ru.ozon.app.android.travel.molecules.dto.textInfoCells;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO$MarkerAlignment;", "nullableMarkerAlignmentAdapter", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextInfoCellDTOJsonAdapter extends JsonAdapter<TextInfoCellDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TextInfoCellDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<TextInfoCellDTO.MarkerAlignment> nullableMarkerAlignmentAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TextInfoCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "topPadding", "isCenteredText", "marker", "markerAlignment", "offsetBetween", "serviceBadge");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "text");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "topPadding");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isCenteredText");
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "marker");
        this.nullableMarkerAlignmentAdapter = moshi.f(TextInfoCellDTO.MarkerAlignment.class, m11, "markerAlignment");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "offsetBetween");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "serviceBadge");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(TextInfoCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TextInfoCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Integer num = 0;
        Boolean bool2 = bool;
        TextAtom textAtom = null;
        Icon icon = null;
        TextInfoCellDTO.MarkerAlignment markerAlignment = null;
        Integer num2 = null;
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
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("topPadding", "topPadding", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isCenteredText", "isCenteredText", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 4:
                    markerAlignment = this.nullableMarkerAlignmentAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -23) {
            Icon icon2 = icon;
            if (textAtom == null) {
                throw c.j("text", "text", reader);
            }
            return new TextInfoCellDTO(textAtom, num.intValue(), bool2.booleanValue(), icon2, markerAlignment, num2, badgeDTO);
        }
        Icon icon3 = icon;
        Constructor<TextInfoCellDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = TextInfoCellDTO.class.getDeclaredConstructor(TextAtom.class, cls2, Boolean.TYPE, Icon.class, TextInfoCellDTO.MarkerAlignment.class, Integer.class, BadgeDTO.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textAtom == null) {
            throw c.j("text", "text", reader);
        }
        TextInfoCellDTO newInstance = constructor.newInstance(textAtom, num, bool2, icon3, markerAlignment, num2, badgeDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TextInfoCellDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("topPadding");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getTopPadding()));
        writer.w("isCenteredText");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isCenteredText()));
        writer.w("marker");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getMarker());
        writer.w("markerAlignment");
        this.nullableMarkerAlignmentAdapter.mo44toJson(writer, (x) value.getMarkerAlignment());
        writer.w("offsetBetween");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getOffsetBetween());
        writer.w("serviceBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getServiceBadge());
        writer.p();
    }
}
