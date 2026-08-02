package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cscore.padding.PaddingCompose;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "", DynamicElementDTO.TIMER, "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "paddings", "Lru/ozon/app/android/cscore/padding/PaddingCompose;", "<init>", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/cscore/padding/PaddingCompose;)V", "getTimer", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getPaddings", "()Lru/ozon/app/android/cscore/padding/PaddingCompose;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclaimerV2DTO {
    public static final int $stable = (PaddingCompose.$stable | TestInfo.$stable) | DisclaimerDTO.$stable;

    @NotNull
    private final DisclaimerDTO disclaimer;

    @NotNull
    private final PaddingCompose paddings;
    private final TestInfo testInfo;
    private final Timer timer;

    public DisclaimerV2DTO(Timer timer, @NotNull DisclaimerDTO disclaimer, TestInfo testInfo, @NotNull PaddingCompose paddings) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.timer = timer;
        this.disclaimer = disclaimer;
        this.testInfo = testInfo;
        this.paddings = paddings;
    }

    public static /* synthetic */ DisclaimerV2DTO copy$default(DisclaimerV2DTO disclaimerV2DTO, Timer timer, DisclaimerDTO disclaimerDTO, TestInfo testInfo, PaddingCompose paddingCompose, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            timer = disclaimerV2DTO.timer;
        }
        if ((i11 & 2) != 0) {
            disclaimerDTO = disclaimerV2DTO.disclaimer;
        }
        if ((i11 & 4) != 0) {
            testInfo = disclaimerV2DTO.testInfo;
        }
        if ((i11 & 8) != 0) {
            paddingCompose = disclaimerV2DTO.paddings;
        }
        return disclaimerV2DTO.copy(timer, disclaimerDTO, testInfo, paddingCompose);
    }

    /* renamed from: component1, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PaddingCompose getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final DisclaimerV2DTO copy(Timer timer, @NotNull DisclaimerDTO disclaimer, TestInfo testInfo, @NotNull PaddingCompose paddings) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new DisclaimerV2DTO(timer, disclaimer, testInfo, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerV2DTO)) {
            return false;
        }
        DisclaimerV2DTO disclaimerV2DTO = (DisclaimerV2DTO) other;
        return Intrinsics.d(this.timer, disclaimerV2DTO.timer) && Intrinsics.d(this.disclaimer, disclaimerV2DTO.disclaimer) && Intrinsics.d(this.testInfo, disclaimerV2DTO.testInfo) && Intrinsics.d(this.paddings, disclaimerV2DTO.paddings);
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final PaddingCompose getPaddings() {
        return this.paddings;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    public int hashCode() {
        Timer timer = this.timer;
        int hashCode = (this.disclaimer.hashCode() + ((timer == null ? 0 : timer.hashCode()) * 31)) * 31;
        TestInfo testInfo = this.testInfo;
        return this.paddings.hashCode() + ((hashCode + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "DisclaimerV2DTO(timer=" + this.timer + ", disclaimer=" + this.disclaimer + ", testInfo=" + this.testInfo + ", paddings=" + this.paddings + ")";
    }
}
