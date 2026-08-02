package ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewItem;

import De.C2859b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/DeliveryOrderInputVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/InputFieldVO;", "inputField", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/InputFieldVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/InputFieldVO;", "getInputField", "()Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/InputFieldVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryOrderInputVO implements c {
    private final long id;

    @NotNull
    private final InputFieldVO inputField;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    public DeliveryOrderInputVO(long j11, @NotNull InputFieldVO inputField, @NotNull ButtonV3DTO submitButton, t tVar, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.inputField = inputField;
        this.submitButton = submitButton;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderInputVO)) {
            return false;
        }
        DeliveryOrderInputVO deliveryOrderInputVO = (DeliveryOrderInputVO) other;
        return this.id == deliveryOrderInputVO.id && Intrinsics.d(this.inputField, deliveryOrderInputVO.inputField) && Intrinsics.d(this.submitButton, deliveryOrderInputVO.submitButton) && Intrinsics.d(this.tokenizedEvent, deliveryOrderInputVO.tokenizedEvent) && Intrinsics.d(this.testInfo, deliveryOrderInputVO.testInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InputFieldVO getInputField() {
        return this.inputField;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.submitButton, (this.inputField.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryOrderInputVO(id=" + this.id + ", inputField=" + this.inputField + ", submitButton=" + this.submitButton + ", tokenizedEvent=" + this.tokenizedEvent + ", testInfo=" + this.testInfo + ")";
    }
}
