package ru.ozon.app.android.geo.addresseditpickupdetailv2.data;

import AZ.c;
import Ak.b;
import B90.C2616s;
import Bl.C2639a;
import C.o0;
import Co.a;
import El.C2971a;
import G.g;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.ImageCarousel;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006efghijB\u008f\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0004\b'\u0010(J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0003HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010DJ\u000b\u0010\\\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0017\u0010]\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$HÆ\u0003J¾\u0002\u0010^\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$HÆ\u0001¢\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020 2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020cHÖ\u0001J\t\u0010d\u001a\u00020%HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001f\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bH\u0010I¨\u0006k"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/AtomDTO;", "banner", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "newAddress", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Address;", "badges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "photos", "Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;", "schedule", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule;", "deliveryConditions", "placeHeader", "metro", "placeDescriptions", "controls", "addressLabel", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "numberPVZ", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;", "newDeliveryConditions", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$DeliveryCondition;", "deliveryConditionsOnTop", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/util/Map;)V", "getHeader", "()Ljava/util/List;", "getBanner", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;", "getAddress", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getNewAddress", "getBadges", "getPhotos", "()Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;", "getSchedule", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule;", "getDeliveryConditions", "getPlaceHeader", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getMetro", "getPlaceDescriptions", "getControls", "getAddressLabel", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getNumberPVZ", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;", "getNewDeliveryConditions", "getDeliveryConditionsOnTop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/util/Map;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;", "equals", "other", "hashCode", "", "toString", "Schedule", "Banner", "AddressLabel", "Address", "NumberPVZ", "DeliveryCondition", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditPickUpDetailDTO {
    private final List<AtomDTO> address;
    private final AddressLabel addressLabel;
    private final DisclaimerAtom annotation;
    private final List<BadgeDTO> badges;
    private final Banner banner;
    private final List<AtomDTO> controls;
    private final List<AtomDTO> deliveryConditions;
    private final Boolean deliveryConditionsOnTop;
    private final DisclaimerDTO disclaimer;

    @NotNull
    private final List<AtomDTO> header;
    private final List<AtomDTO> metro;
    private final List<Address> newAddress;
    private final List<DeliveryCondition> newDeliveryConditions;
    private final NumberPVZ numberPVZ;
    private final OnBoardingDTO onboarding;
    private final ImageCarousel photos;
    private final List<AtomDTO> placeDescriptions;
    private final AtomDTO placeHeader;
    private final Schedule schedule;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Address;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Address {
        private final CommonControlSettings common;
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;

        public Address(@NotNull TextDTO text, IconDTO iconDTO, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = iconDTO;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ Address copy$default(Address address, TextDTO textDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = address.text;
            }
            if ((i11 & 2) != 0) {
                iconDTO = address.icon;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = address.common;
            }
            return address.copy(textDTO, iconDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Address copy(@NotNull TextDTO text, IconDTO icon, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Address(text, icon, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Address)) {
                return false;
            }
            Address address = (Address) other;
            return Intrinsics.d(this.text, address.text) && Intrinsics.d(this.icon, address.icon) && Intrinsics.d(this.common, address.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.icon;
            return b.g(C2639a.d("Address(text=", ", icon=", ", common=", iconDTO, textDTO), this.common, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel;", "", "chipsMobile", "", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel$ChipItemMobile;", "textField", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel$TextField;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel$TextField;Ljava/lang/String;)V", "getChipsMobile", "()Ljava/util/List;", "getTextField", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel$TextField;", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ChipItemMobile", "TextField", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AddressLabel {
        private final List<ChipItemMobile> chipsMobile;
        private final TextField textField;
        private final String value;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel$ChipItemMobile;", "", "hasTextField", "", "tagButton", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "getHasTextField", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel$ChipItemMobile;", "equals", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChipItemMobile {
            private final Boolean hasTextField;

            @NotNull
            private final TagButtonDTO tagButton;

            public ChipItemMobile(Boolean bool, @NotNull TagButtonDTO tagButton) {
                Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                this.hasTextField = bool;
                this.tagButton = tagButton;
            }

            public static /* synthetic */ ChipItemMobile copy$default(ChipItemMobile chipItemMobile, Boolean bool, TagButtonDTO tagButtonDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    bool = chipItemMobile.hasTextField;
                }
                if ((i11 & 2) != 0) {
                    tagButtonDTO = chipItemMobile.tagButton;
                }
                return chipItemMobile.copy(bool, tagButtonDTO);
            }

            /* renamed from: component1, reason: from getter */
            public final Boolean getHasTextField() {
                return this.hasTextField;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TagButtonDTO getTagButton() {
                return this.tagButton;
            }

            @NotNull
            public final ChipItemMobile copy(Boolean hasTextField, @NotNull TagButtonDTO tagButton) {
                Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                return new ChipItemMobile(hasTextField, tagButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChipItemMobile)) {
                    return false;
                }
                ChipItemMobile chipItemMobile = (ChipItemMobile) other;
                return Intrinsics.d(this.hasTextField, chipItemMobile.hasTextField) && Intrinsics.d(this.tagButton, chipItemMobile.tagButton);
            }

            public final Boolean getHasTextField() {
                return this.hasTextField;
            }

            @NotNull
            public final TagButtonDTO getTagButton() {
                return this.tagButton;
            }

            public int hashCode() {
                Boolean bool = this.hasTextField;
                return this.tagButton.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return "ChipItemMobile(hasTextField=" + this.hasTextField + ", tagButton=" + this.tagButton + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$AddressLabel$TextField;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getPlaceholder", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextField {
            private final String placeholder;
            private final String value;

            public TextField(String str, String str2) {
                this.value = str;
                this.placeholder = str2;
            }

            public static /* synthetic */ TextField copy$default(TextField textField, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = textField.value;
                }
                if ((i11 & 2) != 0) {
                    str2 = textField.placeholder;
                }
                return textField.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @NotNull
            public final TextField copy(String value, String placeholder) {
                return new TextField(value, placeholder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextField)) {
                    return false;
                }
                TextField textField = (TextField) other;
                return Intrinsics.d(this.value, textField.value) && Intrinsics.d(this.placeholder, textField.placeholder);
            }

            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.value;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.placeholder;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return e.a("TextField(value=", this.value, ", placeholder=", this.placeholder, ")");
            }
        }

        public AddressLabel(List<ChipItemMobile> list, TextField textField, String str) {
            this.chipsMobile = list;
            this.textField = textField;
            this.value = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddressLabel copy$default(AddressLabel addressLabel, List list, TextField textField, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = addressLabel.chipsMobile;
            }
            if ((i11 & 2) != 0) {
                textField = addressLabel.textField;
            }
            if ((i11 & 4) != 0) {
                str = addressLabel.value;
            }
            return addressLabel.copy(list, textField, str);
        }

        public final List<ChipItemMobile> component1() {
            return this.chipsMobile;
        }

        /* renamed from: component2, reason: from getter */
        public final TextField getTextField() {
            return this.textField;
        }

        /* renamed from: component3, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final AddressLabel copy(List<ChipItemMobile> chipsMobile, TextField textField, String value) {
            return new AddressLabel(chipsMobile, textField, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressLabel)) {
                return false;
            }
            AddressLabel addressLabel = (AddressLabel) other;
            return Intrinsics.d(this.chipsMobile, addressLabel.chipsMobile) && Intrinsics.d(this.textField, addressLabel.textField) && Intrinsics.d(this.value, addressLabel.value);
        }

        public final List<ChipItemMobile> getChipsMobile() {
            return this.chipsMobile;
        }

        public final TextField getTextField() {
            return this.textField;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            List<ChipItemMobile> list = this.chipsMobile;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            TextField textField = this.textField;
            int hashCode2 = (hashCode + (textField == null ? 0 : textField.hashCode())) * 31;
            String str = this.value;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<ChipItemMobile> list = this.chipsMobile;
            TextField textField = this.textField;
            String str = this.value;
            StringBuilder sb2 = new StringBuilder("AddressLabel(chipsMobile=");
            sb2.append(list);
            sb2.append(", textField=");
            sb2.append(textField);
            sb2.append(", value=");
            return o0.c(sb2, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;", "", "dueDate", "Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "marketingInfo", "elements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "borderColor", "", "coverImage", "<init>", "(Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDueDate", "()Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "getMarketingInfo", "getElements", "()Ljava/util/List;", "getBorderColor", "()Ljava/lang/String;", "getCoverImage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner {

        @NotNull
        private final String borderColor;

        @NotNull
        private final String coverImage;

        @NotNull
        private final CommonText.TextMedium dueDate;

        @NotNull
        private final List<AtomDTO> elements;

        @NotNull
        private final CommonText.TextMedium marketingInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public Banner(@NotNull CommonText.TextMedium dueDate, @NotNull CommonText.TextMedium marketingInfo, @NotNull List<? extends AtomDTO> elements, @NotNull String borderColor, @NotNull String coverImage) {
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            Intrinsics.checkNotNullParameter(marketingInfo, "marketingInfo");
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(coverImage, "coverImage");
            this.dueDate = dueDate;
            this.marketingInfo = marketingInfo;
            this.elements = elements;
            this.borderColor = borderColor;
            this.coverImage = coverImage;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, CommonText.TextMedium textMedium, CommonText.TextMedium textMedium2, List list, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textMedium = banner.dueDate;
            }
            if ((i11 & 2) != 0) {
                textMedium2 = banner.marketingInfo;
            }
            if ((i11 & 4) != 0) {
                list = banner.elements;
            }
            if ((i11 & 8) != 0) {
                str = banner.borderColor;
            }
            if ((i11 & 16) != 0) {
                str2 = banner.coverImage;
            }
            String str3 = str2;
            List list2 = list;
            return banner.copy(textMedium, textMedium2, list2, str, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonText.TextMedium getDueDate() {
            return this.dueDate;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonText.TextMedium getMarketingInfo() {
            return this.marketingInfo;
        }

        @NotNull
        public final List<AtomDTO> component3() {
            return this.elements;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getCoverImage() {
            return this.coverImage;
        }

        @NotNull
        public final Banner copy(@NotNull CommonText.TextMedium dueDate, @NotNull CommonText.TextMedium marketingInfo, @NotNull List<? extends AtomDTO> elements, @NotNull String borderColor, @NotNull String coverImage) {
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            Intrinsics.checkNotNullParameter(marketingInfo, "marketingInfo");
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(coverImage, "coverImage");
            return new Banner(dueDate, marketingInfo, elements, borderColor, coverImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.dueDate, banner.dueDate) && Intrinsics.d(this.marketingInfo, banner.marketingInfo) && Intrinsics.d(this.elements, banner.elements) && Intrinsics.d(this.borderColor, banner.borderColor) && Intrinsics.d(this.coverImage, banner.coverImage);
        }

        @NotNull
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final String getCoverImage() {
            return this.coverImage;
        }

        @NotNull
        public final CommonText.TextMedium getDueDate() {
            return this.dueDate;
        }

        @NotNull
        public final List<AtomDTO> getElements() {
            return this.elements;
        }

        @NotNull
        public final CommonText.TextMedium getMarketingInfo() {
            return this.marketingInfo;
        }

        public int hashCode() {
            return this.coverImage.hashCode() + g.a(g.b((this.marketingInfo.hashCode() + (this.dueDate.hashCode() * 31)) * 31, 31, this.elements), 31, this.borderColor);
        }

        @NotNull
        public String toString() {
            CommonText.TextMedium textMedium = this.dueDate;
            CommonText.TextMedium textMedium2 = this.marketingInfo;
            List<AtomDTO> list = this.elements;
            String str = this.borderColor;
            String str2 = this.coverImage;
            StringBuilder sb2 = new StringBuilder("Banner(dueDate=");
            sb2.append(textMedium);
            sb2.append(", marketingInfo=");
            sb2.append(textMedium2);
            sb2.append(", elements=");
            Cm.e.i(", borderColor=", str, ", coverImage=", sb2, list);
            return o0.c(sb2, str2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$DeliveryCondition;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryCondition {
        private final BadgeDTO badge;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;

        public DeliveryCondition(@NotNull TextDTO text, @NotNull IconDTO icon, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.text = text;
            this.icon = icon;
            this.badge = badgeDTO;
        }

        public static /* synthetic */ DeliveryCondition copy$default(DeliveryCondition deliveryCondition, TextDTO textDTO, IconDTO iconDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = deliveryCondition.text;
            }
            if ((i11 & 2) != 0) {
                iconDTO = deliveryCondition.icon;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = deliveryCondition.badge;
            }
            return deliveryCondition.copy(textDTO, iconDTO, badgeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final DeliveryCondition copy(@NotNull TextDTO text, @NotNull IconDTO icon, BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new DeliveryCondition(text, icon, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryCondition)) {
                return false;
            }
            DeliveryCondition deliveryCondition = (DeliveryCondition) other;
            return Intrinsics.d(this.text, deliveryCondition.text) && Intrinsics.d(this.icon, deliveryCondition.icon) && Intrinsics.d(this.badge, deliveryCondition.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.icon, this.text.hashCode() * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            return a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.icon;
            return c.b(C2639a.d("DeliveryCondition(text=", ", icon=", ", badge=", iconDTO, textDTO), this.badge, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberPVZ {
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO number;

        public NumberPVZ(@NotNull TextDTO number, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ NumberPVZ copy$default(NumberPVZ numberPVZ, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = numberPVZ.number;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = numberPVZ.common;
            }
            return numberPVZ.copy(textDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getNumber() {
            return this.number;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final NumberPVZ copy(@NotNull TextDTO number, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(number, "number");
            return new NumberPVZ(number, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NumberPVZ)) {
                return false;
            }
            NumberPVZ numberPVZ = (NumberPVZ) other;
            return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.common, numberPVZ.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getNumber() {
            return this.number;
        }

        public int hashCode() {
            int hashCode = this.number.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "NumberPVZ(number=" + this.number + ", common=" + this.common + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule;", "", "collapseMoreThan", "", "dates", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "inlineDates", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule$InlineDate;", "inlineDatesImage", "", "imageTintColor", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCollapseMoreThan", "()I", "getDates", "()Ljava/util/List;", "getInlineDates", "getInlineDatesImage", "()Ljava/lang/String;", "getImageTintColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "InlineDate", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Schedule {
        private final int collapseMoreThan;

        @NotNull
        private final List<AtomDTO> dates;
        private final String imageTintColor;
        private final List<InlineDate> inlineDates;
        private final String inlineDatesImage;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule$InlineDate;", "", "date", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "time", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getDate", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InlineDate {

            @NotNull
            private final TextAtom date;

            @NotNull
            private final TextAtom time;

            public InlineDate(@NotNull TextAtom date, @NotNull TextAtom time) {
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(time, "time");
                this.date = date;
                this.time = time;
            }

            public static /* synthetic */ InlineDate copy$default(InlineDate inlineDate, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = inlineDate.date;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = inlineDate.time;
                }
                return inlineDate.copy(textAtom, textAtom2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getDate() {
                return this.date;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextAtom getTime() {
                return this.time;
            }

            @NotNull
            public final InlineDate copy(@NotNull TextAtom date, @NotNull TextAtom time) {
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(time, "time");
                return new InlineDate(date, time);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InlineDate)) {
                    return false;
                }
                InlineDate inlineDate = (InlineDate) other;
                return Intrinsics.d(this.date, inlineDate.date) && Intrinsics.d(this.time, inlineDate.time);
            }

            @NotNull
            public final TextAtom getDate() {
                return this.date;
            }

            @NotNull
            public final TextAtom getTime() {
                return this.time;
            }

            public int hashCode() {
                return this.time.hashCode() + (this.date.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.a("InlineDate(date=", this.date, ", time=", this.time, ")");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Schedule(int i11, @NotNull List<? extends AtomDTO> dates, List<InlineDate> list, String str, String str2) {
            Intrinsics.checkNotNullParameter(dates, "dates");
            this.collapseMoreThan = i11;
            this.dates = dates;
            this.inlineDates = list;
            this.inlineDatesImage = str;
            this.imageTintColor = str2;
        }

        public static /* synthetic */ Schedule copy$default(Schedule schedule, int i11, List list, List list2, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = schedule.collapseMoreThan;
            }
            if ((i12 & 2) != 0) {
                list = schedule.dates;
            }
            if ((i12 & 4) != 0) {
                list2 = schedule.inlineDates;
            }
            if ((i12 & 8) != 0) {
                str = schedule.inlineDatesImage;
            }
            if ((i12 & 16) != 0) {
                str2 = schedule.imageTintColor;
            }
            String str3 = str2;
            List list3 = list2;
            return schedule.copy(i11, list, list3, str, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCollapseMoreThan() {
            return this.collapseMoreThan;
        }

        @NotNull
        public final List<AtomDTO> component2() {
            return this.dates;
        }

        public final List<InlineDate> component3() {
            return this.inlineDates;
        }

        /* renamed from: component4, reason: from getter */
        public final String getInlineDatesImage() {
            return this.inlineDatesImage;
        }

        /* renamed from: component5, reason: from getter */
        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        @NotNull
        public final Schedule copy(int collapseMoreThan, @NotNull List<? extends AtomDTO> dates, List<InlineDate> inlineDates, String inlineDatesImage, String imageTintColor) {
            Intrinsics.checkNotNullParameter(dates, "dates");
            return new Schedule(collapseMoreThan, dates, inlineDates, inlineDatesImage, imageTintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Schedule)) {
                return false;
            }
            Schedule schedule = (Schedule) other;
            return this.collapseMoreThan == schedule.collapseMoreThan && Intrinsics.d(this.dates, schedule.dates) && Intrinsics.d(this.inlineDates, schedule.inlineDates) && Intrinsics.d(this.inlineDatesImage, schedule.inlineDatesImage) && Intrinsics.d(this.imageTintColor, schedule.imageTintColor);
        }

        public final int getCollapseMoreThan() {
            return this.collapseMoreThan;
        }

        @NotNull
        public final List<AtomDTO> getDates() {
            return this.dates;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final List<InlineDate> getInlineDates() {
            return this.inlineDates;
        }

        public final String getInlineDatesImage() {
            return this.inlineDatesImage;
        }

        public int hashCode() {
            int b11 = g.b(Integer.hashCode(this.collapseMoreThan) * 31, 31, this.dates);
            List<InlineDate> list = this.inlineDates;
            int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.inlineDatesImage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageTintColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.collapseMoreThan;
            List<AtomDTO> list = this.dates;
            List<InlineDate> list2 = this.inlineDates;
            String str = this.inlineDatesImage;
            String str2 = this.imageTintColor;
            StringBuilder sb2 = new StringBuilder("Schedule(collapseMoreThan=");
            sb2.append(i11);
            sb2.append(", dates=");
            sb2.append(list);
            sb2.append(", inlineDates=");
            Cm.e.i(", inlineDatesImage=", str, ", imageTintColor=", sb2, list2);
            return o0.c(sb2, str2, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditPickUpDetailDTO(@NotNull List<? extends AtomDTO> header, Banner banner, List<? extends AtomDTO> list, DisclaimerAtom disclaimerAtom, List<Address> list2, List<BadgeDTO> list3, ImageCarousel imageCarousel, Schedule schedule, List<? extends AtomDTO> list4, AtomDTO atomDTO, List<? extends AtomDTO> list5, List<? extends AtomDTO> list6, List<? extends AtomDTO> list7, AddressLabel addressLabel, OnBoardingDTO onBoardingDTO, NumberPVZ numberPVZ, List<DeliveryCondition> list8, Boolean bool, DisclaimerDTO disclaimerDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        this.banner = banner;
        this.address = list;
        this.annotation = disclaimerAtom;
        this.newAddress = list2;
        this.badges = list3;
        this.photos = imageCarousel;
        this.schedule = schedule;
        this.deliveryConditions = list4;
        this.placeHeader = atomDTO;
        this.metro = list5;
        this.placeDescriptions = list6;
        this.controls = list7;
        this.addressLabel = addressLabel;
        this.onboarding = onBoardingDTO;
        this.numberPVZ = numberPVZ;
        this.newDeliveryConditions = list8;
        this.deliveryConditionsOnTop = bool;
        this.disclaimer = disclaimerDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AddressEditPickUpDetailDTO copy$default(AddressEditPickUpDetailDTO addressEditPickUpDetailDTO, List list, Banner banner, List list2, DisclaimerAtom disclaimerAtom, List list3, List list4, ImageCarousel imageCarousel, Schedule schedule, List list5, AtomDTO atomDTO, List list6, List list7, List list8, AddressLabel addressLabel, OnBoardingDTO onBoardingDTO, NumberPVZ numberPVZ, List list9, Boolean bool, DisclaimerDTO disclaimerDTO, Map map, int i11, Object obj) {
        Map map2;
        DisclaimerDTO disclaimerDTO2;
        List list10 = (i11 & 1) != 0 ? addressEditPickUpDetailDTO.header : list;
        Banner banner2 = (i11 & 2) != 0 ? addressEditPickUpDetailDTO.banner : banner;
        List list11 = (i11 & 4) != 0 ? addressEditPickUpDetailDTO.address : list2;
        DisclaimerAtom disclaimerAtom2 = (i11 & 8) != 0 ? addressEditPickUpDetailDTO.annotation : disclaimerAtom;
        List list12 = (i11 & 16) != 0 ? addressEditPickUpDetailDTO.newAddress : list3;
        List list13 = (i11 & 32) != 0 ? addressEditPickUpDetailDTO.badges : list4;
        ImageCarousel imageCarousel2 = (i11 & 64) != 0 ? addressEditPickUpDetailDTO.photos : imageCarousel;
        Schedule schedule2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? addressEditPickUpDetailDTO.schedule : schedule;
        List list14 = (i11 & 256) != 0 ? addressEditPickUpDetailDTO.deliveryConditions : list5;
        AtomDTO atomDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? addressEditPickUpDetailDTO.placeHeader : atomDTO;
        List list15 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? addressEditPickUpDetailDTO.metro : list6;
        List list16 = (i11 & 2048) != 0 ? addressEditPickUpDetailDTO.placeDescriptions : list7;
        List list17 = (i11 & 4096) != 0 ? addressEditPickUpDetailDTO.controls : list8;
        AddressLabel addressLabel2 = (i11 & 8192) != 0 ? addressEditPickUpDetailDTO.addressLabel : addressLabel;
        List list18 = list10;
        OnBoardingDTO onBoardingDTO2 = (i11 & 16384) != 0 ? addressEditPickUpDetailDTO.onboarding : onBoardingDTO;
        NumberPVZ numberPVZ2 = (i11 & 32768) != 0 ? addressEditPickUpDetailDTO.numberPVZ : numberPVZ;
        List list19 = (i11 & 65536) != 0 ? addressEditPickUpDetailDTO.newDeliveryConditions : list9;
        Boolean bool2 = (i11 & 131072) != 0 ? addressEditPickUpDetailDTO.deliveryConditionsOnTop : bool;
        DisclaimerDTO disclaimerDTO3 = (i11 & 262144) != 0 ? addressEditPickUpDetailDTO.disclaimer : disclaimerDTO;
        if ((i11 & 524288) != 0) {
            disclaimerDTO2 = disclaimerDTO3;
            map2 = addressEditPickUpDetailDTO.trackingInfo;
        } else {
            map2 = map;
            disclaimerDTO2 = disclaimerDTO3;
        }
        return addressEditPickUpDetailDTO.copy(list18, banner2, list11, disclaimerAtom2, list12, list13, imageCarousel2, schedule2, list14, atomDTO2, list15, list16, list17, addressLabel2, onBoardingDTO2, numberPVZ2, list19, bool2, disclaimerDTO2, map2);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.header;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomDTO getPlaceHeader() {
        return this.placeHeader;
    }

    public final List<AtomDTO> component11() {
        return this.metro;
    }

    public final List<AtomDTO> component12() {
        return this.placeDescriptions;
    }

    public final List<AtomDTO> component13() {
        return this.controls;
    }

    /* renamed from: component14, reason: from getter */
    public final AddressLabel getAddressLabel() {
        return this.addressLabel;
    }

    /* renamed from: component15, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component16, reason: from getter */
    public final NumberPVZ getNumberPVZ() {
        return this.numberPVZ;
    }

    public final List<DeliveryCondition> component17() {
        return this.newDeliveryConditions;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getDeliveryConditionsOnTop() {
        return this.deliveryConditionsOnTop;
    }

    /* renamed from: component19, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component2, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    public final Map<String, TokenizedTrackingInfo> component20() {
        return this.trackingInfo;
    }

    public final List<AtomDTO> component3() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final List<Address> component5() {
        return this.newAddress;
    }

    public final List<BadgeDTO> component6() {
        return this.badges;
    }

    /* renamed from: component7, reason: from getter */
    public final ImageCarousel getPhotos() {
        return this.photos;
    }

    /* renamed from: component8, reason: from getter */
    public final Schedule getSchedule() {
        return this.schedule;
    }

    public final List<AtomDTO> component9() {
        return this.deliveryConditions;
    }

    @NotNull
    public final AddressEditPickUpDetailDTO copy(@NotNull List<? extends AtomDTO> header, Banner banner, List<? extends AtomDTO> address, DisclaimerAtom annotation, List<Address> newAddress, List<BadgeDTO> badges, ImageCarousel photos, Schedule schedule, List<? extends AtomDTO> deliveryConditions, AtomDTO placeHeader, List<? extends AtomDTO> metro, List<? extends AtomDTO> placeDescriptions, List<? extends AtomDTO> controls, AddressLabel addressLabel, OnBoardingDTO onboarding, NumberPVZ numberPVZ, List<DeliveryCondition> newDeliveryConditions, Boolean deliveryConditionsOnTop, DisclaimerDTO disclaimer, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new AddressEditPickUpDetailDTO(header, banner, address, annotation, newAddress, badges, photos, schedule, deliveryConditions, placeHeader, metro, placeDescriptions, controls, addressLabel, onboarding, numberPVZ, newDeliveryConditions, deliveryConditionsOnTop, disclaimer, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditPickUpDetailDTO)) {
            return false;
        }
        AddressEditPickUpDetailDTO addressEditPickUpDetailDTO = (AddressEditPickUpDetailDTO) other;
        return Intrinsics.d(this.header, addressEditPickUpDetailDTO.header) && Intrinsics.d(this.banner, addressEditPickUpDetailDTO.banner) && Intrinsics.d(this.address, addressEditPickUpDetailDTO.address) && Intrinsics.d(this.annotation, addressEditPickUpDetailDTO.annotation) && Intrinsics.d(this.newAddress, addressEditPickUpDetailDTO.newAddress) && Intrinsics.d(this.badges, addressEditPickUpDetailDTO.badges) && Intrinsics.d(this.photos, addressEditPickUpDetailDTO.photos) && Intrinsics.d(this.schedule, addressEditPickUpDetailDTO.schedule) && Intrinsics.d(this.deliveryConditions, addressEditPickUpDetailDTO.deliveryConditions) && Intrinsics.d(this.placeHeader, addressEditPickUpDetailDTO.placeHeader) && Intrinsics.d(this.metro, addressEditPickUpDetailDTO.metro) && Intrinsics.d(this.placeDescriptions, addressEditPickUpDetailDTO.placeDescriptions) && Intrinsics.d(this.controls, addressEditPickUpDetailDTO.controls) && Intrinsics.d(this.addressLabel, addressEditPickUpDetailDTO.addressLabel) && Intrinsics.d(this.onboarding, addressEditPickUpDetailDTO.onboarding) && Intrinsics.d(this.numberPVZ, addressEditPickUpDetailDTO.numberPVZ) && Intrinsics.d(this.newDeliveryConditions, addressEditPickUpDetailDTO.newDeliveryConditions) && Intrinsics.d(this.deliveryConditionsOnTop, addressEditPickUpDetailDTO.deliveryConditionsOnTop) && Intrinsics.d(this.disclaimer, addressEditPickUpDetailDTO.disclaimer) && Intrinsics.d(this.trackingInfo, addressEditPickUpDetailDTO.trackingInfo);
    }

    public final List<AtomDTO> getAddress() {
        return this.address;
    }

    public final AddressLabel getAddressLabel() {
        return this.addressLabel;
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final Banner getBanner() {
        return this.banner;
    }

    public final List<AtomDTO> getControls() {
        return this.controls;
    }

    public final List<AtomDTO> getDeliveryConditions() {
        return this.deliveryConditions;
    }

    public final Boolean getDeliveryConditionsOnTop() {
        return this.deliveryConditionsOnTop;
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final List<AtomDTO> getHeader() {
        return this.header;
    }

    public final List<AtomDTO> getMetro() {
        return this.metro;
    }

    public final List<Address> getNewAddress() {
        return this.newAddress;
    }

    public final List<DeliveryCondition> getNewDeliveryConditions() {
        return this.newDeliveryConditions;
    }

    public final NumberPVZ getNumberPVZ() {
        return this.numberPVZ;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final ImageCarousel getPhotos() {
        return this.photos;
    }

    public final List<AtomDTO> getPlaceDescriptions() {
        return this.placeDescriptions;
    }

    public final AtomDTO getPlaceHeader() {
        return this.placeHeader;
    }

    public final Schedule getSchedule() {
        return this.schedule;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        Banner banner = this.banner;
        int hashCode2 = (hashCode + (banner == null ? 0 : banner.hashCode())) * 31;
        List<AtomDTO> list = this.address;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode4 = (hashCode3 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        List<Address> list2 = this.newAddress;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BadgeDTO> list3 = this.badges;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ImageCarousel imageCarousel = this.photos;
        int hashCode7 = (hashCode6 + (imageCarousel == null ? 0 : imageCarousel.hashCode())) * 31;
        Schedule schedule = this.schedule;
        int hashCode8 = (hashCode7 + (schedule == null ? 0 : schedule.hashCode())) * 31;
        List<AtomDTO> list4 = this.deliveryConditions;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        AtomDTO atomDTO = this.placeHeader;
        int hashCode10 = (hashCode9 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        List<AtomDTO> list5 = this.metro;
        int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<AtomDTO> list6 = this.placeDescriptions;
        int hashCode12 = (hashCode11 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<AtomDTO> list7 = this.controls;
        int hashCode13 = (hashCode12 + (list7 == null ? 0 : list7.hashCode())) * 31;
        AddressLabel addressLabel = this.addressLabel;
        int hashCode14 = (hashCode13 + (addressLabel == null ? 0 : addressLabel.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode15 = (hashCode14 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        NumberPVZ numberPVZ = this.numberPVZ;
        int hashCode16 = (hashCode15 + (numberPVZ == null ? 0 : numberPVZ.hashCode())) * 31;
        List<DeliveryCondition> list8 = this.newDeliveryConditions;
        int hashCode17 = (hashCode16 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool = this.deliveryConditionsOnTop;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int hashCode19 = (hashCode18 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode19 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<AtomDTO> list = this.header;
        Banner banner = this.banner;
        List<AtomDTO> list2 = this.address;
        DisclaimerAtom disclaimerAtom = this.annotation;
        List<Address> list3 = this.newAddress;
        List<BadgeDTO> list4 = this.badges;
        ImageCarousel imageCarousel = this.photos;
        Schedule schedule = this.schedule;
        List<AtomDTO> list5 = this.deliveryConditions;
        AtomDTO atomDTO = this.placeHeader;
        List<AtomDTO> list6 = this.metro;
        List<AtomDTO> list7 = this.placeDescriptions;
        List<AtomDTO> list8 = this.controls;
        AddressLabel addressLabel = this.addressLabel;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        NumberPVZ numberPVZ = this.numberPVZ;
        List<DeliveryCondition> list9 = this.newDeliveryConditions;
        Boolean bool = this.deliveryConditionsOnTop;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AddressEditPickUpDetailDTO(header=");
        sb2.append(list);
        sb2.append(", banner=");
        sb2.append(banner);
        sb2.append(", address=");
        sb2.append(list2);
        sb2.append(", annotation=");
        sb2.append(disclaimerAtom);
        sb2.append(", newAddress=");
        C2616s.g(", badges=", ", photos=", sb2, list3, list4);
        sb2.append(imageCarousel);
        sb2.append(", schedule=");
        sb2.append(schedule);
        sb2.append(", deliveryConditions=");
        sb2.append(list5);
        sb2.append(", placeHeader=");
        sb2.append(atomDTO);
        sb2.append(", metro=");
        C2616s.g(", placeDescriptions=", ", controls=", sb2, list6, list7);
        sb2.append(list8);
        sb2.append(", addressLabel=");
        sb2.append(addressLabel);
        sb2.append(", onboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(", numberPVZ=");
        sb2.append(numberPVZ);
        sb2.append(", newDeliveryConditions=");
        sb2.append(list9);
        sb2.append(", deliveryConditionsOnTop=");
        sb2.append(bool);
        sb2.append(", disclaimer=");
        sb2.append(disclaimerDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
