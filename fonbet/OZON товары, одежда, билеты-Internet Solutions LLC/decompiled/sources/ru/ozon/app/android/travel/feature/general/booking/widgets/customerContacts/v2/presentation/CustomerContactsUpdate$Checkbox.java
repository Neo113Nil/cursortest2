package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import A00.a;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@InterfaceC6346b
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"ru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsUpdate$Checkbox", "", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "status", "constructor-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)I", "hashCode", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "getStatus", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerContactsUpdate$Checkbox implements a.J.InterfaceC0007a {

    @NotNull
    private final CheckBoxDTO.CheckboxStatus status;

    private /* synthetic */ CustomerContactsUpdate$Checkbox(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        this.status = checkboxStatus;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CustomerContactsUpdate$Checkbox m1107boximpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        return new CustomerContactsUpdate$Checkbox(checkboxStatus);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static CheckBoxDTO.CheckboxStatus m1108constructorimpl(@NotNull CheckBoxDTO.CheckboxStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return status;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1109equalsimpl(CheckBoxDTO.CheckboxStatus checkboxStatus, Object obj) {
        return (obj instanceof CustomerContactsUpdate$Checkbox) && checkboxStatus == ((CustomerContactsUpdate$Checkbox) obj).getStatus();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1110hashCodeimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        return checkboxStatus.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1111toStringimpl(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        return "Checkbox(status=" + checkboxStatus + ")";
    }

    public boolean equals(Object obj) {
        return m1109equalsimpl(this.status, obj);
    }

    public int hashCode() {
        return m1110hashCodeimpl(this.status);
    }

    public String toString() {
        return m1111toStringimpl(this.status);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ CheckBoxDTO.CheckboxStatus getStatus() {
        return this.status;
    }
}
