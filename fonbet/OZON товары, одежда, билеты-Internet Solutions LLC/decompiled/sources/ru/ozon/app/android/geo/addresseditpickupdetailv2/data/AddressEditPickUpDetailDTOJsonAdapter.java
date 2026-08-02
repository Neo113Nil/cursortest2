package ru.ozon.app.android.geo.addresseditpickupdetailv2.data;

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
import ru.ozon.app.android.atoms.data.deprecated.ImageCarousel;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.data.AddressEditPickUpDetailDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001aR\"\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001aR\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001aR(\u00107\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000206\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u001a¨\u00068"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "listOfAtomDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;", "nullableBannerAdapter", "nullableListOfAtomDTOAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Address;", "nullableListOfAddressAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;", "nullableImageCarouselAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule;", "nullableScheduleAdapter", "nullableAtomDTOAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel;", "nullableAddressLabelAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;", "nullableNumberPVZAdapter", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$DeliveryCondition;", "nullableListOfDeliveryConditionAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "nullableDisclaimerDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditPickUpDetailDTOJsonAdapter extends JsonAdapter<AddressEditPickUpDetailDTO> {

    @NotNull
    private final JsonAdapter<List<AtomDTO>> listOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<AddressEditPickUpDetailDTO.AddressLabel> nullableAddressLabelAdapter;

    @NotNull
    private final JsonAdapter<AtomDTO> nullableAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<AddressEditPickUpDetailDTO.Banner> nullableBannerAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO> nullableDisclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageCarousel> nullableImageCarouselAdapter;

    @NotNull
    private final JsonAdapter<List<AddressEditPickUpDetailDTO.Address>> nullableListOfAddressAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AddressEditPickUpDetailDTO.DeliveryCondition>> nullableListOfDeliveryConditionAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<AddressEditPickUpDetailDTO.NumberPVZ> nullableNumberPVZAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<AddressEditPickUpDetailDTO.Schedule> nullableScheduleAdapter;

    @NotNull
    private final n.a options;

    public AddressEditPickUpDetailDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "banner", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "annotation", "newAddress", "badges", "photos", "schedule", "deliveryConditions", "placeHeader", "metro", "placeDescriptions", "controls", "addressLabel", "onboarding", "numberPVZ", "newDeliveryConditions", "deliveryConditionsOnTop", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "trackingInfo");
        b e11 = D.e(List.class, AtomDTO.class);
        M m11 = M.f71699a;
        this.listOfAtomDTOAdapter = moshi.f(e11, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableBannerAdapter = moshi.f(AddressEditPickUpDetailDTO.Banner.class, m11, "banner");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.nullableListOfAddressAdapter = moshi.f(D.e(List.class, AddressEditPickUpDetailDTO.Address.class), m11, "newAddress");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "badges");
        this.nullableImageCarouselAdapter = moshi.f(ImageCarousel.class, m11, "photos");
        this.nullableScheduleAdapter = moshi.f(AddressEditPickUpDetailDTO.Schedule.class, m11, "schedule");
        this.nullableAtomDTOAdapter = moshi.f(AtomDTO.class, m11, "placeHeader");
        this.nullableAddressLabelAdapter = moshi.f(AddressEditPickUpDetailDTO.AddressLabel.class, m11, "addressLabel");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
        this.nullableNumberPVZAdapter = moshi.f(AddressEditPickUpDetailDTO.NumberPVZ.class, m11, "numberPVZ");
        this.nullableListOfDeliveryConditionAdapter = moshi.f(D.e(List.class, AddressEditPickUpDetailDTO.DeliveryCondition.class), m11, "newDeliveryConditions");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "deliveryConditionsOnTop");
        this.nullableDisclaimerDTOAdapter = moshi.f(DisclaimerDTO.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(48, "GeneratedJsonAdapter(AddressEditPickUpDetailDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressEditPickUpDetailDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<AtomDTO> list = null;
        AddressEditPickUpDetailDTO.Banner banner = null;
        List<AtomDTO> list2 = null;
        DisclaimerAtom disclaimerAtom = null;
        List<AddressEditPickUpDetailDTO.Address> list3 = null;
        List<BadgeDTO> list4 = null;
        ImageCarousel imageCarousel = null;
        AddressEditPickUpDetailDTO.Schedule schedule = null;
        List<AtomDTO> list5 = null;
        AtomDTO atomDTO = null;
        List<AtomDTO> list6 = null;
        List<AtomDTO> list7 = null;
        List<AtomDTO> list8 = null;
        AddressEditPickUpDetailDTO.AddressLabel addressLabel = null;
        OnBoardingDTO onBoardingDTO = null;
        AddressEditPickUpDetailDTO.NumberPVZ numberPVZ = null;
        List<AddressEditPickUpDetailDTO.DeliveryCondition> list9 = null;
        Boolean bool = null;
        DisclaimerDTO disclaimerDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            List<AtomDTO> list10 = list;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfAtomDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    continue;
                case 1:
                    banner = this.nullableBannerAdapter.fromJson(reader);
                    break;
                case 2:
                    list2 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    list3 = this.nullableListOfAddressAdapter.fromJson(reader);
                    break;
                case 5:
                    list4 = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    imageCarousel = this.nullableImageCarouselAdapter.fromJson(reader);
                    break;
                case 7:
                    schedule = this.nullableScheduleAdapter.fromJson(reader);
                    break;
                case 8:
                    list5 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    atomDTO = this.nullableAtomDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    list6 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 11:
                    list7 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 12:
                    list8 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 13:
                    addressLabel = this.nullableAddressLabelAdapter.fromJson(reader);
                    break;
                case 14:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 15:
                    numberPVZ = this.nullableNumberPVZAdapter.fromJson(reader);
                    break;
                case 16:
                    list9 = this.nullableListOfDeliveryConditionAdapter.fromJson(reader);
                    break;
                case 17:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 18:
                    disclaimerDTO = this.nullableDisclaimerDTOAdapter.fromJson(reader);
                    break;
                case 19:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            list = list10;
        }
        List<AtomDTO> list11 = list;
        reader.endObject();
        if (list11 != null) {
            return new AddressEditPickUpDetailDTO(list11, banner, list2, disclaimerAtom, list3, list4, imageCarousel, schedule, list5, atomDTO, list6, list7, list8, addressLabel, onBoardingDTO, numberPVZ, list9, bool, disclaimerDTO, map);
        }
        throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressEditPickUpDetailDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfAtomDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("banner");
        this.nullableBannerAdapter.mo44toJson(writer, (x) value.getBanner());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("annotation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("newAddress");
        this.nullableListOfAddressAdapter.mo44toJson(writer, (x) value.getNewAddress());
        writer.w("badges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("photos");
        this.nullableImageCarouselAdapter.mo44toJson(writer, (x) value.getPhotos());
        writer.w("schedule");
        this.nullableScheduleAdapter.mo44toJson(writer, (x) value.getSchedule());
        writer.w("deliveryConditions");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getDeliveryConditions());
        writer.w("placeHeader");
        this.nullableAtomDTOAdapter.mo44toJson(writer, (x) value.getPlaceHeader());
        writer.w("metro");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getMetro());
        writer.w("placeDescriptions");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getPlaceDescriptions());
        writer.w("controls");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getControls());
        writer.w("addressLabel");
        this.nullableAddressLabelAdapter.mo44toJson(writer, (x) value.getAddressLabel());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("numberPVZ");
        this.nullableNumberPVZAdapter.mo44toJson(writer, (x) value.getNumberPVZ());
        writer.w("newDeliveryConditions");
        this.nullableListOfDeliveryConditionAdapter.mo44toJson(writer, (x) value.getNewDeliveryConditions());
        writer.w("deliveryConditionsOnTop");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getDeliveryConditionsOnTop());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerDTOAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
