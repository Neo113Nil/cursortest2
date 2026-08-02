package ru.ozon.app.android.orders.cml.deliveryOrderInput.data;

import De.C2859b;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/DeliveryOrderInputDTO;", "", "inputField", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/InputFieldDTO;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/InputFieldDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getInputField", "()Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/InputFieldDTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryOrderInputDTO {
    public static final int $stable = 8;

    @NotNull
    private final InputFieldDTO inputField;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public DeliveryOrderInputDTO(@NotNull InputFieldDTO inputField, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.inputField = inputField;
        this.submitButton = submitButton;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryOrderInputDTO copy$default(DeliveryOrderInputDTO deliveryOrderInputDTO, InputFieldDTO inputFieldDTO, ButtonV3DTO buttonV3DTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            inputFieldDTO = deliveryOrderInputDTO.inputField;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = deliveryOrderInputDTO.submitButton;
        }
        if ((i11 & 4) != 0) {
            map = deliveryOrderInputDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            testInfo = deliveryOrderInputDTO.testInfo;
        }
        return deliveryOrderInputDTO.copy(inputFieldDTO, buttonV3DTO, map, testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputFieldDTO getInputField() {
        return this.inputField;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final DeliveryOrderInputDTO copy(@NotNull InputFieldDTO inputField, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new DeliveryOrderInputDTO(inputField, submitButton, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderInputDTO)) {
            return false;
        }
        DeliveryOrderInputDTO deliveryOrderInputDTO = (DeliveryOrderInputDTO) other;
        return Intrinsics.d(this.inputField, deliveryOrderInputDTO.inputField) && Intrinsics.d(this.submitButton, deliveryOrderInputDTO.submitButton) && Intrinsics.d(this.trackingInfo, deliveryOrderInputDTO.trackingInfo) && Intrinsics.d(this.testInfo, deliveryOrderInputDTO.testInfo);
    }

    @NotNull
    public final InputFieldDTO getInputField() {
        return this.inputField;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.submitButton, this.inputField.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (c11 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        InputFieldDTO inputFieldDTO = this.inputField;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("DeliveryOrderInputDTO(inputField=");
        sb2.append(inputFieldDTO);
        sb2.append(", submitButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return b.b(", testInfo=", ")", sb2, map, testInfo);
    }
}
