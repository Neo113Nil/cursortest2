package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import A00.a;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@InterfaceC6346b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/UpdateCustomerContactsV3PhoneNumber;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "phoneNumber", "constructor-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "", "toString-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getPhoneNumber", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateCustomerContactsV3PhoneNumber implements a.J.InterfaceC0007a {

    @NotNull
    private final CommonInputV2VO.TextInputV2 phoneNumber;

    private /* synthetic */ UpdateCustomerContactsV3PhoneNumber(CommonInputV2VO.TextInputV2 textInputV2) {
        this.phoneNumber = textInputV2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UpdateCustomerContactsV3PhoneNumber m1173boximpl(CommonInputV2VO.TextInputV2 textInputV2) {
        return new UpdateCustomerContactsV3PhoneNumber(textInputV2);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static CommonInputV2VO.TextInputV2 m1174constructorimpl(@NotNull CommonInputV2VO.TextInputV2 phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return phoneNumber;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1175equalsimpl(CommonInputV2VO.TextInputV2 textInputV2, Object obj) {
        return (obj instanceof UpdateCustomerContactsV3PhoneNumber) && Intrinsics.d(textInputV2, ((UpdateCustomerContactsV3PhoneNumber) obj).getPhoneNumber());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1176hashCodeimpl(CommonInputV2VO.TextInputV2 textInputV2) {
        return textInputV2.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1177toStringimpl(CommonInputV2VO.TextInputV2 textInputV2) {
        return "UpdateCustomerContactsV3PhoneNumber(phoneNumber=" + textInputV2 + ")";
    }

    public boolean equals(Object obj) {
        return m1175equalsimpl(this.phoneNumber, obj);
    }

    public int hashCode() {
        return m1176hashCodeimpl(this.phoneNumber);
    }

    public String toString() {
        return m1177toStringimpl(this.phoneNumber);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ CommonInputV2VO.TextInputV2 getPhoneNumber() {
        return this.phoneNumber;
    }
}
