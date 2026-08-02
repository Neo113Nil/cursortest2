package ru.ozon.app.android.geo.addressbook.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.geo.addressbook.data.AddressBookDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO_AddressList_AddressJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "", "booleanAdapter", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$Control;", "nullableListOfControlAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ;", "nullableNumberPVZAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookDTO_AddressList_AddressJsonAdapter extends JsonAdapter<AddressBookDTO.AddressList.Address> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AddressBookDTO.AddressList.Address> constructorRef;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AddressBookDTO.AddressList.Address.Control>> nullableListOfControlAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<AddressBookDTO.AddressList.Address.NumberPVZ> nullableNumberPVZAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AddressBookDTO_AddressList_AddressJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("addressBookId", SelectionItemFormDTO.TITLE_FIELD_NAME, "isSelected", "isEnabled", "elements", "bottomElements", "clickAction", "controls", "trackingInfo", "onboarding", "badges", "numberPVZ");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "addressBookId");
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "elements");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "clickAction");
        this.nullableListOfControlAdapter = moshi.f(D.e(List.class, AddressBookDTO.AddressList.Address.Control.class), m11, "controls");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "badges");
        this.nullableNumberPVZAdapter = moshi.f(AddressBookDTO.AddressList.Address.NumberPVZ.class, m11, "numberPVZ");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(AddressBookDTO.AddressList.Address)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressBookDTO.AddressList.Address fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        OzonSpannableString ozonSpannableString = null;
        List<AtomDTO> list = null;
        List<AtomDTO> list2 = null;
        AtomActionDTO atomActionDTO = null;
        List<AddressBookDTO.AddressList.Address.Control> list3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        OnBoardingDTO onBoardingDTO = null;
        List<BadgeDTO> list4 = null;
        AddressBookDTO.AddressList.Address.NumberPVZ numberPVZ = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("addressBookId", "addressBookId", reader);
                    }
                    break;
                case 1:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isEnabled", "isEnabled", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    list = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    list2 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("clickAction", "clickAction", reader);
                    }
                    break;
                case 7:
                    list3 = this.nullableListOfControlAdapter.fromJson(reader);
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    list4 = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    break;
                case 11:
                    numberPVZ = this.nullableNumberPVZAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -13) {
            if (str == null) {
                throw c.j("addressBookId", "addressBookId", reader);
            }
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool3.booleanValue();
            if (atomActionDTO != null) {
                return new AddressBookDTO.AddressList.Address(str, ozonSpannableString, booleanValue, booleanValue2, list, list2, atomActionDTO, list3, map, onBoardingDTO, list4, numberPVZ);
            }
            throw c.j("clickAction", "clickAction", reader);
        }
        Constructor<AddressBookDTO.AddressList.Address> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = AddressBookDTO.AddressList.Address.class.getDeclaredConstructor(String.class, OzonSpannableString.class, cls2, cls2, List.class, List.class, AtomActionDTO.class, List.class, Map.class, OnBoardingDTO.class, List.class, AddressBookDTO.AddressList.Address.NumberPVZ.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("addressBookId", "addressBookId", reader);
        }
        if (atomActionDTO == null) {
            throw c.j("clickAction", "clickAction", reader);
        }
        Constructor<AddressBookDTO.AddressList.Address> constructor2 = constructor;
        List<AtomDTO> list5 = list;
        AddressBookDTO.AddressList.Address newInstance = constructor2.newInstance(str, ozonSpannableString, bool2, bool3, list5, list2, atomActionDTO, list3, map, onBoardingDTO, list4, numberPVZ, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressBookDTO.AddressList.Address value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("addressBookId");
        this.stringAdapter.mo44toJson(writer, (x) value.getAddressBookId());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("isEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isEnabled()));
        writer.w("elements");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getElements());
        writer.w("bottomElements");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getBottomElements());
        writer.w("clickAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getClickAction());
        writer.w("controls");
        this.nullableListOfControlAdapter.mo44toJson(writer, (x) value.getControls());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("badges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("numberPVZ");
        this.nullableNumberPVZAdapter.mo44toJson(writer, (x) value.getNumberPVZ());
        writer.p();
    }
}
