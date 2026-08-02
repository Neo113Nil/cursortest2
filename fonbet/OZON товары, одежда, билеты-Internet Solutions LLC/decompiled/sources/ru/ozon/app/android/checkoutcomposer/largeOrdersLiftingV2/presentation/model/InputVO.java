package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model;

import B3.p;
import G.g;
import Ih.a;
import N3.C3660k;
import P4.f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;", "", "", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, "emptyValidationText", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "textChangeAction", "", "textChangeActionDebounce", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholder", "getValue", "getEmptyValidationText", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTextChangeAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "J", "getTextChangeActionDebounce", "()J", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputVO {

    @NotNull
    private final String emptyValidationText;

    @NotNull
    private final String placeholder;

    @NotNull
    private final AtomActionDTO textChangeAction;
    private final long textChangeActionDebounce;
    private final String value;

    public InputVO(@NotNull String placeholder, String str, @NotNull String emptyValidationText, @NotNull AtomActionDTO textChangeAction, long j11) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(emptyValidationText, "emptyValidationText");
        Intrinsics.checkNotNullParameter(textChangeAction, "textChangeAction");
        this.placeholder = placeholder;
        this.value = str;
        this.emptyValidationText = emptyValidationText;
        this.textChangeAction = textChangeAction;
        this.textChangeActionDebounce = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputVO)) {
            return false;
        }
        InputVO inputVO = (InputVO) other;
        return Intrinsics.d(this.placeholder, inputVO.placeholder) && Intrinsics.d(this.value, inputVO.value) && Intrinsics.d(this.emptyValidationText, inputVO.emptyValidationText) && Intrinsics.d(this.textChangeAction, inputVO.textChangeAction) && this.textChangeActionDebounce == inputVO.textChangeActionDebounce;
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

    public final long getTextChangeActionDebounce() {
        return this.textChangeActionDebounce;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.placeholder.hashCode() * 31;
        String str = this.value;
        return Long.hashCode(this.textChangeActionDebounce) + a.b(this.textChangeAction, g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.emptyValidationText), 31);
    }

    @NotNull
    public String toString() {
        String str = this.placeholder;
        String str2 = this.value;
        String str3 = this.emptyValidationText;
        AtomActionDTO atomActionDTO = this.textChangeAction;
        long j11 = this.textChangeActionDebounce;
        StringBuilder d11 = C3660k.d("InputVO(placeholder=", str, ", value=", str2, ", emptyValidationText=");
        p.c(str3, ", textChangeAction=", ", textChangeActionDebounce=", d11, atomActionDTO);
        return f.a(j11, ")", d11);
    }
}
