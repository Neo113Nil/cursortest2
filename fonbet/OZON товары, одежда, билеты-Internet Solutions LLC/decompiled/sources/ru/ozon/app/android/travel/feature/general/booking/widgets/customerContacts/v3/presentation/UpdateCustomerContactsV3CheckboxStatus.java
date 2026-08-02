package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import A00.a;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@InterfaceC6346b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/UpdateCustomerContactsV3CheckboxStatus;", "LA00/a$J$a;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "checkboxStatus", "constructor-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "getCheckboxStatus", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateCustomerContactsV3CheckboxStatus implements a.J.InterfaceC0007a {

    @NotNull
    private final CheckBoxDTO.CheckboxStatus checkboxStatus;

    private /* synthetic */ UpdateCustomerContactsV3CheckboxStatus(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        this.checkboxStatus = checkboxStatus;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UpdateCustomerContactsV3CheckboxStatus m1161boximpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        return new UpdateCustomerContactsV3CheckboxStatus(checkboxStatus);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static CheckBoxDTO.CheckboxStatus m1162constructorimpl(@NotNull CheckBoxDTO.CheckboxStatus checkboxStatus) {
        Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
        return checkboxStatus;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1163equalsimpl(CheckBoxDTO.CheckboxStatus checkboxStatus, Object obj) {
        return (obj instanceof UpdateCustomerContactsV3CheckboxStatus) && checkboxStatus == ((UpdateCustomerContactsV3CheckboxStatus) obj).getCheckboxStatus();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1164hashCodeimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        return checkboxStatus.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1165toStringimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        return "UpdateCustomerContactsV3CheckboxStatus(checkboxStatus=" + checkboxStatus + ")";
    }

    public boolean equals(Object obj) {
        return m1163equalsimpl(this.checkboxStatus, obj);
    }

    public int hashCode() {
        return m1164hashCodeimpl(this.checkboxStatus);
    }

    public String toString() {
        return m1165toStringimpl(this.checkboxStatus);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ CheckBoxDTO.CheckboxStatus getCheckboxStatus() {
        return this.checkboxStatus;
    }
}
