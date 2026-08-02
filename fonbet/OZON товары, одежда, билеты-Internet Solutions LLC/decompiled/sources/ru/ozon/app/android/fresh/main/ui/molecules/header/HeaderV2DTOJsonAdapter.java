package ru.ozon.app.android.fresh.main.ui.molecules.header;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "nullableDisclosureAtomAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderV2DTOJsonAdapter extends JsonAdapter<HeaderV2DTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HeaderV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclosureAtom> nullableDisclosureAtomAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public HeaderV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "action", "disclosure", "isTopCornersRounded", "trackingInfo", "backgroundColor");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableDisclosureAtomAdapter = moshi.f(DisclosureAtom.class, m11, "disclosure");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isTopCornersRounded");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(HeaderV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HeaderV2DTO fromJson(@NotNull n reader) {
        HeaderV2DTO newInstance;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        boolean z11 = false;
        int i11 = -1;
        TextAtom textAtom = null;
        AtomActionDTO atomActionDTO = null;
        DisclosureAtom disclosureAtom = null;
        Boolean bool = null;
        Map<String, TokenizedTrackingInfo> map = null;
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
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    disclosureAtom = this.nullableDisclosureAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isTopCornersRounded", "isTopCornersRounded", reader);
                    }
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 = -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    z11 = true;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            Boolean bool2 = bool;
            DisclosureAtom disclosureAtom2 = disclosureAtom;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            TextAtom textAtom2 = textAtom;
            if (textAtom2 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (bool2 == null) {
                throw c.j("isTopCornersRounded", "isTopCornersRounded", reader);
            }
            newInstance = new HeaderV2DTO(textAtom2, atomActionDTO2, disclosureAtom2, bool2.booleanValue(), map);
        } else {
            AtomActionDTO atomActionDTO3 = atomActionDTO;
            TextAtom textAtom3 = textAtom;
            DisclosureAtom disclosureAtom3 = disclosureAtom;
            Map<String, TokenizedTrackingInfo> map2 = map;
            Constructor<HeaderV2DTO> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = HeaderV2DTO.class.getDeclaredConstructor(TextAtom.class, AtomActionDTO.class, DisclosureAtom.class, Boolean.TYPE, Map.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            Constructor<HeaderV2DTO> constructor2 = constructor;
            if (textAtom3 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (bool == null) {
                throw c.j("isTopCornersRounded", "isTopCornersRounded", reader);
            }
            newInstance = constructor2.newInstance(textAtom3, atomActionDTO3, disclosureAtom3, bool, map2, Integer.valueOf(i11), null);
        }
        if (z11) {
            newInstance.setBackgroundColor(str);
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HeaderV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("disclosure");
        this.nullableDisclosureAtomAdapter.mo44toJson(writer, (x) value.getDisclosure());
        writer.w("isTopCornersRounded");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isTopCornersRounded()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
