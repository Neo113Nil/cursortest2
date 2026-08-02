package ru.ozon.app.android.orderdetails.radiogroup.data;

import G.g;
import N3.C3660k;
import Pk0.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/radiogroup/data/RadioButtonDTO;", "", "text", "", "deeplink", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "getDeeplink", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RadioButtonDTO {
    public static final int $stable = 0;

    @NotNull
    private final String deeplink;
    private final boolean isSelected;

    @NotNull
    private final String text;

    public RadioButtonDTO(@NotNull String text, @NotNull String deeplink, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.text = text;
        this.deeplink = deeplink;
        this.isSelected = z11;
    }

    public static /* synthetic */ RadioButtonDTO copy$default(RadioButtonDTO radioButtonDTO, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = radioButtonDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = radioButtonDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            z11 = radioButtonDTO.isSelected;
        }
        return radioButtonDTO.copy(str, str2, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final RadioButtonDTO copy(@NotNull String text, @NotNull String deeplink, boolean isSelected) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new RadioButtonDTO(text, deeplink, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioButtonDTO)) {
            return false;
        }
        RadioButtonDTO radioButtonDTO = (RadioButtonDTO) other;
        return Intrinsics.d(this.text, radioButtonDTO.text) && Intrinsics.d(this.deeplink, radioButtonDTO.deeplink) && this.isSelected == radioButtonDTO.isSelected;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + g.a(this.text.hashCode() * 31, 31, this.deeplink);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.deeplink;
        return a.a(")", C3660k.d("RadioButtonDTO(text=", str, ", deeplink=", str2, ", isSelected="), this.isSelected);
    }
}
