package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data;

import B3.p;
import B90.C2619v;
import G.g;
import Ih.a;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/InputDTO;", "", HammersV3BodyDTO.PLACEHOLDER, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "emptyValidationText", "textChangeAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "delayAction", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;D)V", "getPlaceholder", "()Ljava/lang/String;", "getValue", "getEmptyValidationText", "getTextChangeAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDelayAction", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputDTO {
    public static final int $stable = 0;
    private final double delayAction;

    @NotNull
    private final String emptyValidationText;

    @NotNull
    private final String placeholder;

    @NotNull
    private final AtomActionDTO textChangeAction;
    private final String value;

    public InputDTO(@NotNull String placeholder, String str, @NotNull String emptyValidationText, @NotNull AtomActionDTO textChangeAction, double d11) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(emptyValidationText, "emptyValidationText");
        Intrinsics.checkNotNullParameter(textChangeAction, "textChangeAction");
        this.placeholder = placeholder;
        this.value = str;
        this.emptyValidationText = emptyValidationText;
        this.textChangeAction = textChangeAction;
        this.delayAction = d11;
    }

    public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, String str3, AtomActionDTO atomActionDTO, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputDTO.placeholder;
        }
        if ((i11 & 2) != 0) {
            str2 = inputDTO.value;
        }
        if ((i11 & 4) != 0) {
            str3 = inputDTO.emptyValidationText;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = inputDTO.textChangeAction;
        }
        if ((i11 & 16) != 0) {
            d11 = inputDTO.delayAction;
        }
        double d12 = d11;
        return inputDTO.copy(str, str2, str3, atomActionDTO, d12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEmptyValidationText() {
        return this.emptyValidationText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getTextChangeAction() {
        return this.textChangeAction;
    }

    /* renamed from: component5, reason: from getter */
    public final double getDelayAction() {
        return this.delayAction;
    }

    @NotNull
    public final InputDTO copy(@NotNull String placeholder, String value, @NotNull String emptyValidationText, @NotNull AtomActionDTO textChangeAction, double delayAction) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(emptyValidationText, "emptyValidationText");
        Intrinsics.checkNotNullParameter(textChangeAction, "textChangeAction");
        return new InputDTO(placeholder, value, emptyValidationText, textChangeAction, delayAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDTO)) {
            return false;
        }
        InputDTO inputDTO = (InputDTO) other;
        return Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.emptyValidationText, inputDTO.emptyValidationText) && Intrinsics.d(this.textChangeAction, inputDTO.textChangeAction) && Double.compare(this.delayAction, inputDTO.delayAction) == 0;
    }

    public final double getDelayAction() {
        return this.delayAction;
    }

    @NotNull
    public final String getEmptyValidationText() {
        return this.emptyValidationText;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final AtomActionDTO getTextChangeAction() {
        return this.textChangeAction;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.placeholder.hashCode() * 31;
        String str = this.value;
        return Double.hashCode(this.delayAction) + a.b(this.textChangeAction, g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.emptyValidationText), 31);
    }

    @NotNull
    public String toString() {
        String str = this.placeholder;
        String str2 = this.value;
        String str3 = this.emptyValidationText;
        AtomActionDTO atomActionDTO = this.textChangeAction;
        double d11 = this.delayAction;
        StringBuilder d12 = C3660k.d("InputDTO(placeholder=", str, ", value=", str2, ", emptyValidationText=");
        p.c(str3, ", textChangeAction=", ", delayAction=", d12, atomActionDTO);
        return C2619v.c(d12, d11, ")");
    }
}
