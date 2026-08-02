package ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input;

import De.C2859b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.data.Input;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;", "input", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;", "complaintInfo", "<init>", "(JLru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;)V", "copy", "(JLru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;)Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;", "getInput", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;", "getComplaintInfo", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryDateChangedComplaintFormInputVO implements c {

    @NotNull
    private final ComplaintInfo complaintInfo;
    private final long id;

    @NotNull
    private final Input input;

    @NotNull
    private final ButtonV3DTO submitButton;

    public DeliveryDateChangedComplaintFormInputVO(long j11, @NotNull Input input, @NotNull ButtonV3DTO submitButton, @NotNull ComplaintInfo complaintInfo) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(complaintInfo, "complaintInfo");
        this.id = j11;
        this.input = input;
        this.submitButton = submitButton;
        this.complaintInfo = complaintInfo;
    }

    public static /* synthetic */ DeliveryDateChangedComplaintFormInputVO copy$default(DeliveryDateChangedComplaintFormInputVO deliveryDateChangedComplaintFormInputVO, long j11, Input input, ButtonV3DTO buttonV3DTO, ComplaintInfo complaintInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = deliveryDateChangedComplaintFormInputVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            input = deliveryDateChangedComplaintFormInputVO.input;
        }
        Input input2 = input;
        if ((i11 & 4) != 0) {
            buttonV3DTO = deliveryDateChangedComplaintFormInputVO.submitButton;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 8) != 0) {
            complaintInfo = deliveryDateChangedComplaintFormInputVO.complaintInfo;
        }
        return deliveryDateChangedComplaintFormInputVO.copy(j12, input2, buttonV3DTO2, complaintInfo);
    }

    @NotNull
    public final DeliveryDateChangedComplaintFormInputVO copy(long id2, @NotNull Input input, @NotNull ButtonV3DTO submitButton, @NotNull ComplaintInfo complaintInfo) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(complaintInfo, "complaintInfo");
        return new DeliveryDateChangedComplaintFormInputVO(id2, input, submitButton, complaintInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDateChangedComplaintFormInputVO)) {
            return false;
        }
        DeliveryDateChangedComplaintFormInputVO deliveryDateChangedComplaintFormInputVO = (DeliveryDateChangedComplaintFormInputVO) other;
        return this.id == deliveryDateChangedComplaintFormInputVO.id && Intrinsics.d(this.input, deliveryDateChangedComplaintFormInputVO.input) && Intrinsics.d(this.submitButton, deliveryDateChangedComplaintFormInputVO.submitButton) && Intrinsics.d(this.complaintInfo, deliveryDateChangedComplaintFormInputVO.complaintInfo);
    }

    @NotNull
    public final ComplaintInfo getComplaintInfo() {
        return this.complaintInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Input getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.complaintInfo.hashCode() + C2859b.c(this.submitButton, (this.input.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "DeliveryDateChangedComplaintFormInputVO(id=" + this.id + ", input=" + this.input + ", submitButton=" + this.submitButton + ", complaintInfo=" + this.complaintInfo + ")";
    }

    public /* synthetic */ DeliveryDateChangedComplaintFormInputVO(long j11, Input input, ButtonV3DTO buttonV3DTO, ComplaintInfo complaintInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, input, buttonV3DTO, (i11 & 8) != 0 ? new ComplaintInfo(null, null, 3, null) : complaintInfo);
    }
}
