package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation;

import Ak.b;
import B90.C2616s;
import Bl.C2639a;
import C.o0;
import Co.a;
import De.C2860c;
import El.C2971a;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import Pk0.f;
import V.e;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.ImageCarousel;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b<\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007hijklmnB\u0087\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0005\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'¢\u0006\u0004\b)\u0010*Jº\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0010\b\u0002\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b@\u0010<R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bA\u0010<R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\bN\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bP\u0010QR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\bR\u0010<R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bS\u0010<R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010:\u001a\u0004\bT\u0010<R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010[\u001a\u0004\b\\\u0010]R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010:\u001a\u0004\b^\u0010<R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010b\u001a\u0004\bc\u0010dR\u001f\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'8\u0006¢\u0006\f\n\u0004\b(\u0010e\u001a\u0004\bf\u0010g¨\u0006o"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Address;", "newAddress", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$BadgesHeader;", "badgesHeader", "Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;", "photos", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule;", "schedule", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Banner;", "banner", "deliveryConditions", "placeHeader", "metro", "placeDescriptions", "controls", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel;", "addressLabel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;", "numberPVZ", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;", "newDeliveryConditions", "", "deliveryConditionsOnTop", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$BadgesHeader;Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Banner;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;Ljava/util/List;ZLru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;LWZ/t;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$BadgesHeader;Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Banner;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;Ljava/util/List;ZLru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;LWZ/t;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAddress", "()Ljava/util/List;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getNewAddress", "getHeader", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$BadgesHeader;", "getBadgesHeader", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$BadgesHeader;", "Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;", "getPhotos", "()Lru/ozon/app/android/atoms/data/deprecated/ImageCarousel;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule;", "getSchedule", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Banner;", "getBanner", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Banner;", "getDeliveryConditions", "Lru/ozon/uni/atoms/data/AtomDTO;", "getPlaceHeader", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getMetro", "getPlaceDescriptions", "getControls", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel;", "getAddressLabel", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;", "getNumberPVZ", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;", "getNewDeliveryConditions", "Z", "getDeliveryConditionsOnTop", "()Z", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Schedule", "Banner", "BadgesHeader", "AddressLabel", "Address", "NumberPVZ", "DeliveryCondition", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditPickUpDetailVO implements c {

    @NotNull
    private final List<AtomDTO> address;
    private final AddressLabel addressLabel;
    private final DisclaimerAtom annotation;
    private final BadgesHeader badgesHeader;
    private final Banner banner;
    private final List<AtomDTO> controls;
    private final List<AtomDTO> deliveryConditions;
    private final boolean deliveryConditionsOnTop;
    private final DisclaimerDTO disclaimer;

    @NotNull
    private final List<AtomDTO> header;
    private final long id;
    private final List<AtomDTO> metro;
    private final List<Address> newAddress;
    private final List<DeliveryCondition> newDeliveryConditions;
    private final NumberPVZ numberPVZ;
    private final OnBoardingDTO onboarding;
    private final ImageCarousel photos;
    private final List<AtomDTO> placeDescriptions;
    private final AtomDTO placeHeader;
    private final Schedule schedule;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Address;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel;", "", "", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$ChipItemMobile;", "chipsMobile", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$TextField;", "textField", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/util/List;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$TextField;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChipsMobile", "()Ljava/util/List;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$TextField;", "getTextField", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$TextField;", "Ljava/lang/String;", "getValue", "ChipItemMobile", "TextField", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressLabel {
        private final List<ChipItemMobile> chipsMobile;
        private final TextField textField;
        private final String value;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$ChipItemMobile;", "", "", "hasTextField", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "<init>", "(ZLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "copy", "(ZLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$ChipItemMobile;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasTextField", "()Z", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChipItemMobile {
            private final boolean hasTextField;

            @NotNull
            private final TagButtonDTO tagButton;

            public ChipItemMobile(boolean z11, @NotNull TagButtonDTO tagButton) {
                Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                this.hasTextField = z11;
                this.tagButton = tagButton;
            }

            public static /* synthetic */ ChipItemMobile copy$default(ChipItemMobile chipItemMobile, boolean z11, TagButtonDTO tagButtonDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = chipItemMobile.hasTextField;
                }
                if ((i11 & 2) != 0) {
                    tagButtonDTO = chipItemMobile.tagButton;
                }
                return chipItemMobile.copy(z11, tagButtonDTO);
            }

            @NotNull
            public final ChipItemMobile copy(boolean hasTextField, @NotNull TagButtonDTO tagButton) {
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
                return this.hasTextField == chipItemMobile.hasTextField && Intrinsics.d(this.tagButton, chipItemMobile.tagButton);
            }

            public final boolean getHasTextField() {
                return this.hasTextField;
            }

            @NotNull
            public final TagButtonDTO getTagButton() {
                return this.tagButton;
            }

            public int hashCode() {
                return this.tagButton.hashCode() + (Boolean.hashCode(this.hasTextField) * 31);
            }

            @NotNull
            public String toString() {
                return "ChipItemMobile(hasTextField=" + this.hasTextField + ", tagButton=" + this.tagButton + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$AddressLabel$TextField;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getPlaceholder", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextField {
            private final String placeholder;
            private final String value;

            public TextField(String str, String str2) {
                this.value = str;
                this.placeholder = str2;
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$BadgesHeader;", "", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "ratingHeaderTitle", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Ljava/lang/String;", "getRatingHeaderTitle", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgesHeader {

        @NotNull
        private final List<BadgeDTO> badges;
        private final String ratingHeaderTitle;

        public BadgesHeader(@NotNull List<BadgeDTO> badges, String str) {
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.badges = badges;
            this.ratingHeaderTitle = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgesHeader)) {
                return false;
            }
            BadgesHeader badgesHeader = (BadgesHeader) other;
            return Intrinsics.d(this.badges, badgesHeader.badges) && Intrinsics.d(this.ratingHeaderTitle, badgesHeader.ratingHeaderTitle);
        }

        @NotNull
        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final String getRatingHeaderTitle() {
            return this.ratingHeaderTitle;
        }

        public int hashCode() {
            int hashCode = this.badges.hashCode() * 31;
            String str = this.ratingHeaderTitle;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return Bi.b.e("BadgesHeader(badges=", ", ratingHeaderTitle=", this.ratingHeaderTitle, ")", this.badges);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Banner;", "", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "dueDate", "marketingInfo", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "elements", "", "borderColor", "coverImage", "<init>", "(Lru/ozon/app/android/atoms/data/deprecated/CommonText;Lru/ozon/app/android/atoms/data/deprecated/CommonText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "getDueDate", "()Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "getMarketingInfo", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Ljava/lang/String;", "getBorderColor", "getCoverImage", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner {

        @NotNull
        private final String borderColor;

        @NotNull
        private final String coverImage;

        @NotNull
        private final CommonText dueDate;

        @NotNull
        private final List<AtomDTO> elements;

        @NotNull
        private final CommonText marketingInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public Banner(@NotNull CommonText dueDate, @NotNull CommonText marketingInfo, @NotNull List<? extends AtomDTO> elements, @NotNull String borderColor, @NotNull String coverImage) {
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
        public final CommonText getDueDate() {
            return this.dueDate;
        }

        @NotNull
        public final List<AtomDTO> getElements() {
            return this.elements;
        }

        @NotNull
        public final CommonText getMarketingInfo() {
            return this.marketingInfo;
        }

        public int hashCode() {
            return this.coverImage.hashCode() + g.a(g.b((this.marketingInfo.hashCode() + (this.dueDate.hashCode() * 31)) * 31, 31, this.elements), 31, this.borderColor);
        }

        @NotNull
        public String toString() {
            CommonText commonText = this.dueDate;
            CommonText commonText2 = this.marketingInfo;
            List<AtomDTO> list = this.elements;
            String str = this.borderColor;
            String str2 = this.coverImage;
            StringBuilder sb2 = new StringBuilder("Banner(dueDate=");
            sb2.append(commonText);
            sb2.append(", marketingInfo=");
            sb2.append(commonText2);
            sb2.append(", elements=");
            Cm.e.i(", borderColor=", str, ", coverImage=", sb2, list);
            return o0.c(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            return AZ.c.b(C2639a.d("DeliveryCondition(text=", ", icon=", ", badge=", iconDTO, textDTO), this.badge, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "number", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberPVZ {
        private final AtomAction action;

        @NotNull
        private final TextDTO number;

        public NumberPVZ(@NotNull TextDTO number, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NumberPVZ)) {
                return false;
            }
            NumberPVZ numberPVZ = (NumberPVZ) other;
            return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.action, numberPVZ.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getNumber() {
            return this.number;
        }

        public int hashCode() {
            int hashCode = this.number.hashCode() * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "NumberPVZ(number=" + this.number + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0094\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b\u000e\u0010(R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b\u000f\u0010(R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b*\u0010\u0017¨\u0006,"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule;", "", "", "collapseMoreThan", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "datesToDisplay", "datesToStore", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule$InlineDate;", "inlineDatesToDisplay", "inlineDatesToStore", "", "inlineDatesImage", "", "isCollapsed", "isShowHandle", "handleExpandText", "imageTintColor", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "copy", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCollapseMoreThan", "Ljava/util/List;", "getDatesToDisplay", "()Ljava/util/List;", "getDatesToStore", "getInlineDatesToDisplay", "getInlineDatesToStore", "Ljava/lang/String;", "getInlineDatesImage", "Z", "()Z", "getHandleExpandText", "getImageTintColor", "InlineDate", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Schedule {
        private final int collapseMoreThan;

        @NotNull
        private final List<AtomDTO> datesToDisplay;

        @NotNull
        private final List<AtomDTO> datesToStore;

        @NotNull
        private final String handleExpandText;
        private final String imageTintColor;
        private final String inlineDatesImage;
        private final List<InlineDate> inlineDatesToDisplay;
        private final List<InlineDate> inlineDatesToStore;
        private final boolean isCollapsed;
        private final boolean isShowHandle;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule$InlineDate;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "date", "time", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTime", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        public Schedule(int i11, @NotNull List<? extends AtomDTO> datesToDisplay, @NotNull List<? extends AtomDTO> datesToStore, List<InlineDate> list, List<InlineDate> list2, String str, boolean z11, boolean z12, @NotNull String handleExpandText, String str2) {
            Intrinsics.checkNotNullParameter(datesToDisplay, "datesToDisplay");
            Intrinsics.checkNotNullParameter(datesToStore, "datesToStore");
            Intrinsics.checkNotNullParameter(handleExpandText, "handleExpandText");
            this.collapseMoreThan = i11;
            this.datesToDisplay = datesToDisplay;
            this.datesToStore = datesToStore;
            this.inlineDatesToDisplay = list;
            this.inlineDatesToStore = list2;
            this.inlineDatesImage = str;
            this.isCollapsed = z11;
            this.isShowHandle = z12;
            this.handleExpandText = handleExpandText;
            this.imageTintColor = str2;
        }

        public static /* synthetic */ Schedule copy$default(Schedule schedule, int i11, List list, List list2, List list3, List list4, String str, boolean z11, boolean z12, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = schedule.collapseMoreThan;
            }
            if ((i12 & 2) != 0) {
                list = schedule.datesToDisplay;
            }
            if ((i12 & 4) != 0) {
                list2 = schedule.datesToStore;
            }
            if ((i12 & 8) != 0) {
                list3 = schedule.inlineDatesToDisplay;
            }
            if ((i12 & 16) != 0) {
                list4 = schedule.inlineDatesToStore;
            }
            if ((i12 & 32) != 0) {
                str = schedule.inlineDatesImage;
            }
            if ((i12 & 64) != 0) {
                z11 = schedule.isCollapsed;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z12 = schedule.isShowHandle;
            }
            if ((i12 & 256) != 0) {
                str2 = schedule.handleExpandText;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str3 = schedule.imageTintColor;
            }
            String str4 = str2;
            String str5 = str3;
            boolean z13 = z11;
            boolean z14 = z12;
            List list5 = list4;
            String str6 = str;
            return schedule.copy(i11, list, list2, list3, list5, str6, z13, z14, str4, str5);
        }

        @NotNull
        public final Schedule copy(int collapseMoreThan, @NotNull List<? extends AtomDTO> datesToDisplay, @NotNull List<? extends AtomDTO> datesToStore, List<InlineDate> inlineDatesToDisplay, List<InlineDate> inlineDatesToStore, String inlineDatesImage, boolean isCollapsed, boolean isShowHandle, @NotNull String handleExpandText, String imageTintColor) {
            Intrinsics.checkNotNullParameter(datesToDisplay, "datesToDisplay");
            Intrinsics.checkNotNullParameter(datesToStore, "datesToStore");
            Intrinsics.checkNotNullParameter(handleExpandText, "handleExpandText");
            return new Schedule(collapseMoreThan, datesToDisplay, datesToStore, inlineDatesToDisplay, inlineDatesToStore, inlineDatesImage, isCollapsed, isShowHandle, handleExpandText, imageTintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Schedule)) {
                return false;
            }
            Schedule schedule = (Schedule) other;
            return this.collapseMoreThan == schedule.collapseMoreThan && Intrinsics.d(this.datesToDisplay, schedule.datesToDisplay) && Intrinsics.d(this.datesToStore, schedule.datesToStore) && Intrinsics.d(this.inlineDatesToDisplay, schedule.inlineDatesToDisplay) && Intrinsics.d(this.inlineDatesToStore, schedule.inlineDatesToStore) && Intrinsics.d(this.inlineDatesImage, schedule.inlineDatesImage) && this.isCollapsed == schedule.isCollapsed && this.isShowHandle == schedule.isShowHandle && Intrinsics.d(this.handleExpandText, schedule.handleExpandText) && Intrinsics.d(this.imageTintColor, schedule.imageTintColor);
        }

        @NotNull
        public final List<AtomDTO> getDatesToDisplay() {
            return this.datesToDisplay;
        }

        @NotNull
        public final List<AtomDTO> getDatesToStore() {
            return this.datesToStore;
        }

        @NotNull
        public final String getHandleExpandText() {
            return this.handleExpandText;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final String getInlineDatesImage() {
            return this.inlineDatesImage;
        }

        public final List<InlineDate> getInlineDatesToDisplay() {
            return this.inlineDatesToDisplay;
        }

        public final List<InlineDate> getInlineDatesToStore() {
            return this.inlineDatesToStore;
        }

        public int hashCode() {
            int b11 = g.b(g.b(Integer.hashCode(this.collapseMoreThan) * 31, 31, this.datesToDisplay), 31, this.datesToStore);
            List<InlineDate> list = this.inlineDatesToDisplay;
            int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
            List<InlineDate> list2 = this.inlineDatesToStore;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.inlineDatesImage;
            int a11 = g.a(C3532b.a(C3532b.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCollapsed), 31, this.isShowHandle), 31, this.handleExpandText);
            String str2 = this.imageTintColor;
            return a11 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: isCollapsed, reason: from getter */
        public final boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        /* renamed from: isShowHandle, reason: from getter */
        public final boolean getIsShowHandle() {
            return this.isShowHandle;
        }

        @NotNull
        public String toString() {
            int i11 = this.collapseMoreThan;
            List<AtomDTO> list = this.datesToDisplay;
            List<AtomDTO> list2 = this.datesToStore;
            List<InlineDate> list3 = this.inlineDatesToDisplay;
            List<InlineDate> list4 = this.inlineDatesToStore;
            String str = this.inlineDatesImage;
            boolean z11 = this.isCollapsed;
            boolean z12 = this.isShowHandle;
            String str2 = this.handleExpandText;
            String str3 = this.imageTintColor;
            StringBuilder sb2 = new StringBuilder("Schedule(collapseMoreThan=");
            sb2.append(i11);
            sb2.append(", datesToDisplay=");
            sb2.append(list);
            sb2.append(", datesToStore=");
            C2616s.g(", inlineDatesToDisplay=", ", inlineDatesToStore=", sb2, list2, list3);
            Cm.e.i(", inlineDatesImage=", str, ", isCollapsed=", sb2, list4);
            f.c(", isShowHandle=", ", handleExpandText=", sb2, z11, z12);
            return C3173b.c(sb2, str2, ", imageTintColor=", str3, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditPickUpDetailVO(long j11, @NotNull List<? extends AtomDTO> address, DisclaimerAtom disclaimerAtom, List<Address> list, @NotNull List<? extends AtomDTO> header, BadgesHeader badgesHeader, ImageCarousel imageCarousel, Schedule schedule, Banner banner, List<? extends AtomDTO> list2, AtomDTO atomDTO, List<? extends AtomDTO> list3, List<? extends AtomDTO> list4, List<? extends AtomDTO> list5, AddressLabel addressLabel, OnBoardingDTO onBoardingDTO, NumberPVZ numberPVZ, List<DeliveryCondition> list6, boolean z11, DisclaimerDTO disclaimerDTO, t tVar) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(header, "header");
        this.id = j11;
        this.address = address;
        this.annotation = disclaimerAtom;
        this.newAddress = list;
        this.header = header;
        this.badgesHeader = badgesHeader;
        this.photos = imageCarousel;
        this.schedule = schedule;
        this.banner = banner;
        this.deliveryConditions = list2;
        this.placeHeader = atomDTO;
        this.metro = list3;
        this.placeDescriptions = list4;
        this.controls = list5;
        this.addressLabel = addressLabel;
        this.onboarding = onBoardingDTO;
        this.numberPVZ = numberPVZ;
        this.newDeliveryConditions = list6;
        this.deliveryConditionsOnTop = z11;
        this.disclaimer = disclaimerDTO;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ AddressEditPickUpDetailVO copy$default(AddressEditPickUpDetailVO addressEditPickUpDetailVO, long j11, List list, DisclaimerAtom disclaimerAtom, List list2, List list3, BadgesHeader badgesHeader, ImageCarousel imageCarousel, Schedule schedule, Banner banner, List list4, AtomDTO atomDTO, List list5, List list6, List list7, AddressLabel addressLabel, OnBoardingDTO onBoardingDTO, NumberPVZ numberPVZ, List list8, boolean z11, DisclaimerDTO disclaimerDTO, t tVar, int i11, Object obj) {
        t tVar2;
        DisclaimerDTO disclaimerDTO2;
        long j12 = (i11 & 1) != 0 ? addressEditPickUpDetailVO.id : j11;
        List list9 = (i11 & 2) != 0 ? addressEditPickUpDetailVO.address : list;
        DisclaimerAtom disclaimerAtom2 = (i11 & 4) != 0 ? addressEditPickUpDetailVO.annotation : disclaimerAtom;
        List list10 = (i11 & 8) != 0 ? addressEditPickUpDetailVO.newAddress : list2;
        List list11 = (i11 & 16) != 0 ? addressEditPickUpDetailVO.header : list3;
        BadgesHeader badgesHeader2 = (i11 & 32) != 0 ? addressEditPickUpDetailVO.badgesHeader : badgesHeader;
        ImageCarousel imageCarousel2 = (i11 & 64) != 0 ? addressEditPickUpDetailVO.photos : imageCarousel;
        Schedule schedule2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? addressEditPickUpDetailVO.schedule : schedule;
        Banner banner2 = (i11 & 256) != 0 ? addressEditPickUpDetailVO.banner : banner;
        List list12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? addressEditPickUpDetailVO.deliveryConditions : list4;
        AtomDTO atomDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? addressEditPickUpDetailVO.placeHeader : atomDTO;
        List list13 = (i11 & 2048) != 0 ? addressEditPickUpDetailVO.metro : list5;
        List list14 = (i11 & 4096) != 0 ? addressEditPickUpDetailVO.placeDescriptions : list6;
        long j13 = j12;
        List list15 = (i11 & 8192) != 0 ? addressEditPickUpDetailVO.controls : list7;
        AddressLabel addressLabel2 = (i11 & 16384) != 0 ? addressEditPickUpDetailVO.addressLabel : addressLabel;
        OnBoardingDTO onBoardingDTO2 = (i11 & 32768) != 0 ? addressEditPickUpDetailVO.onboarding : onBoardingDTO;
        NumberPVZ numberPVZ2 = (i11 & 65536) != 0 ? addressEditPickUpDetailVO.numberPVZ : numberPVZ;
        List list16 = (i11 & 131072) != 0 ? addressEditPickUpDetailVO.newDeliveryConditions : list8;
        boolean z12 = (i11 & 262144) != 0 ? addressEditPickUpDetailVO.deliveryConditionsOnTop : z11;
        DisclaimerDTO disclaimerDTO3 = (i11 & 524288) != 0 ? addressEditPickUpDetailVO.disclaimer : disclaimerDTO;
        if ((i11 & 1048576) != 0) {
            disclaimerDTO2 = disclaimerDTO3;
            tVar2 = addressEditPickUpDetailVO.tokenizedEvent;
        } else {
            tVar2 = tVar;
            disclaimerDTO2 = disclaimerDTO3;
        }
        return addressEditPickUpDetailVO.copy(j13, list9, disclaimerAtom2, list10, list11, badgesHeader2, imageCarousel2, schedule2, banner2, list12, atomDTO2, list13, list14, list15, addressLabel2, onBoardingDTO2, numberPVZ2, list16, z12, disclaimerDTO2, tVar2);
    }

    @NotNull
    public final AddressEditPickUpDetailVO copy(long id2, @NotNull List<? extends AtomDTO> address, DisclaimerAtom annotation, List<Address> newAddress, @NotNull List<? extends AtomDTO> header, BadgesHeader badgesHeader, ImageCarousel photos, Schedule schedule, Banner banner, List<? extends AtomDTO> deliveryConditions, AtomDTO placeHeader, List<? extends AtomDTO> metro, List<? extends AtomDTO> placeDescriptions, List<? extends AtomDTO> controls, AddressLabel addressLabel, OnBoardingDTO onboarding, NumberPVZ numberPVZ, List<DeliveryCondition> newDeliveryConditions, boolean deliveryConditionsOnTop, DisclaimerDTO disclaimer, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(header, "header");
        return new AddressEditPickUpDetailVO(id2, address, annotation, newAddress, header, badgesHeader, photos, schedule, banner, deliveryConditions, placeHeader, metro, placeDescriptions, controls, addressLabel, onboarding, numberPVZ, newDeliveryConditions, deliveryConditionsOnTop, disclaimer, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditPickUpDetailVO)) {
            return false;
        }
        AddressEditPickUpDetailVO addressEditPickUpDetailVO = (AddressEditPickUpDetailVO) other;
        return this.id == addressEditPickUpDetailVO.id && Intrinsics.d(this.address, addressEditPickUpDetailVO.address) && Intrinsics.d(this.annotation, addressEditPickUpDetailVO.annotation) && Intrinsics.d(this.newAddress, addressEditPickUpDetailVO.newAddress) && Intrinsics.d(this.header, addressEditPickUpDetailVO.header) && Intrinsics.d(this.badgesHeader, addressEditPickUpDetailVO.badgesHeader) && Intrinsics.d(this.photos, addressEditPickUpDetailVO.photos) && Intrinsics.d(this.schedule, addressEditPickUpDetailVO.schedule) && Intrinsics.d(this.banner, addressEditPickUpDetailVO.banner) && Intrinsics.d(this.deliveryConditions, addressEditPickUpDetailVO.deliveryConditions) && Intrinsics.d(this.placeHeader, addressEditPickUpDetailVO.placeHeader) && Intrinsics.d(this.metro, addressEditPickUpDetailVO.metro) && Intrinsics.d(this.placeDescriptions, addressEditPickUpDetailVO.placeDescriptions) && Intrinsics.d(this.controls, addressEditPickUpDetailVO.controls) && Intrinsics.d(this.addressLabel, addressEditPickUpDetailVO.addressLabel) && Intrinsics.d(this.onboarding, addressEditPickUpDetailVO.onboarding) && Intrinsics.d(this.numberPVZ, addressEditPickUpDetailVO.numberPVZ) && Intrinsics.d(this.newDeliveryConditions, addressEditPickUpDetailVO.newDeliveryConditions) && this.deliveryConditionsOnTop == addressEditPickUpDetailVO.deliveryConditionsOnTop && Intrinsics.d(this.disclaimer, addressEditPickUpDetailVO.disclaimer) && Intrinsics.d(this.tokenizedEvent, addressEditPickUpDetailVO.tokenizedEvent);
    }

    @NotNull
    public final List<AtomDTO> getAddress() {
        return this.address;
    }

    public final AddressLabel getAddressLabel() {
        return this.addressLabel;
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final BadgesHeader getBadgesHeader() {
        return this.badgesHeader;
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

    public final boolean getDeliveryConditionsOnTop() {
        return this.deliveryConditionsOnTop;
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final List<AtomDTO> getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.address);
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode = (b11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        List<Address> list = this.newAddress;
        int b12 = g.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.header);
        BadgesHeader badgesHeader = this.badgesHeader;
        int hashCode2 = (b12 + (badgesHeader == null ? 0 : badgesHeader.hashCode())) * 31;
        ImageCarousel imageCarousel = this.photos;
        int hashCode3 = (hashCode2 + (imageCarousel == null ? 0 : imageCarousel.hashCode())) * 31;
        Schedule schedule = this.schedule;
        int hashCode4 = (hashCode3 + (schedule == null ? 0 : schedule.hashCode())) * 31;
        Banner banner = this.banner;
        int hashCode5 = (hashCode4 + (banner == null ? 0 : banner.hashCode())) * 31;
        List<AtomDTO> list2 = this.deliveryConditions;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AtomDTO atomDTO = this.placeHeader;
        int hashCode7 = (hashCode6 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        List<AtomDTO> list3 = this.metro;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AtomDTO> list4 = this.placeDescriptions;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AtomDTO> list5 = this.controls;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        AddressLabel addressLabel = this.addressLabel;
        int hashCode11 = (hashCode10 + (addressLabel == null ? 0 : addressLabel.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode12 = (hashCode11 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        NumberPVZ numberPVZ = this.numberPVZ;
        int hashCode13 = (hashCode12 + (numberPVZ == null ? 0 : numberPVZ.hashCode())) * 31;
        List<DeliveryCondition> list6 = this.newDeliveryConditions;
        int a11 = C3532b.a((hashCode13 + (list6 == null ? 0 : list6.hashCode())) * 31, 31, this.deliveryConditionsOnTop);
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        int hashCode14 = (a11 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode14 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.address;
        DisclaimerAtom disclaimerAtom = this.annotation;
        List<Address> list2 = this.newAddress;
        List<AtomDTO> list3 = this.header;
        BadgesHeader badgesHeader = this.badgesHeader;
        ImageCarousel imageCarousel = this.photos;
        Schedule schedule = this.schedule;
        Banner banner = this.banner;
        List<AtomDTO> list4 = this.deliveryConditions;
        AtomDTO atomDTO = this.placeHeader;
        List<AtomDTO> list5 = this.metro;
        List<AtomDTO> list6 = this.placeDescriptions;
        List<AtomDTO> list7 = this.controls;
        AddressLabel addressLabel = this.addressLabel;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        NumberPVZ numberPVZ = this.numberPVZ;
        List<DeliveryCondition> list8 = this.newDeliveryConditions;
        boolean z11 = this.deliveryConditionsOnTop;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "AddressEditPickUpDetailVO(id=", ", address=", list);
        b11.append(", annotation=");
        b11.append(disclaimerAtom);
        b11.append(", newAddress=");
        b11.append(list2);
        b11.append(", header=");
        b11.append(list3);
        b11.append(", badgesHeader=");
        b11.append(badgesHeader);
        b11.append(", photos=");
        b11.append(imageCarousel);
        b11.append(", schedule=");
        b11.append(schedule);
        b11.append(", banner=");
        b11.append(banner);
        b11.append(", deliveryConditions=");
        b11.append(list4);
        b11.append(", placeHeader=");
        b11.append(atomDTO);
        b11.append(", metro=");
        b11.append(list5);
        C2860c.g(", placeDescriptions=", ", controls=", b11, list6, list7);
        b11.append(", addressLabel=");
        b11.append(addressLabel);
        b11.append(", onboarding=");
        b11.append(onBoardingDTO);
        b11.append(", numberPVZ=");
        b11.append(numberPVZ);
        b11.append(", newDeliveryConditions=");
        b11.append(list8);
        b11.append(", deliveryConditionsOnTop=");
        b11.append(z11);
        b11.append(", disclaimer=");
        b11.append(disclaimerDTO);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
