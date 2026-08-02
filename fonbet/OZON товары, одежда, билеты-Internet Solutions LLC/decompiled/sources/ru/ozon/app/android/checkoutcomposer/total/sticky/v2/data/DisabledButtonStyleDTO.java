package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;", "", "backgroundColor", "", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTextColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DisabledButtonStyleDTO {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final String textColor;

    public DisabledButtonStyleDTO(String str, String str2) {
        this.backgroundColor = str;
        this.textColor = str2;
    }

    public static /* synthetic */ DisabledButtonStyleDTO copy$default(DisabledButtonStyleDTO disabledButtonStyleDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = disabledButtonStyleDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = disabledButtonStyleDTO.textColor;
        }
        return disabledButtonStyleDTO.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final DisabledButtonStyleDTO copy(String backgroundColor, String textColor) {
        return new DisabledButtonStyleDTO(backgroundColor, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisabledButtonStyleDTO)) {
            return false;
        }
        DisabledButtonStyleDTO disabledButtonStyleDTO = (DisabledButtonStyleDTO) other;
        return Intrinsics.d(this.backgroundColor, disabledButtonStyleDTO.backgroundColor) && Intrinsics.d(this.textColor, disabledButtonStyleDTO.textColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return e.a("DisabledButtonStyleDTO(backgroundColor=", this.backgroundColor, ", textColor=", this.textColor, ")");
    }
}
