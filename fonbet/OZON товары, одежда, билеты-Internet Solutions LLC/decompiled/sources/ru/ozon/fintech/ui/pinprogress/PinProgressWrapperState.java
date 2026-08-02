package ru.ozon.fintech.ui.pinprogress;

import B0.C2454a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\bH\u0016J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006-"}, d2 = {"Lru/ozon/fintech/ui/pinprogress/PinProgressWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "selectedDot", "", "normalColor", "", "selectedColor", "errorColor", "dotsCount", "dotRadius", "", "selectedRadius", "<init>", "(Lru/ozon/fintech/ui/utils/Common;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IFF)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getSelectedDot", "()I", "getNormalColor", "()Ljava/lang/String;", "getSelectedColor", "getErrorColor", "getDotsCount", "getDotRadius", "()F", "getSelectedRadius", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PinProgressWrapperState implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final float dotRadius;
    private final int dotsCount;

    @NotNull
    private final String errorColor;

    @NotNull
    private final String normalColor;

    @NotNull
    private final String selectedColor;
    private final int selectedDot;
    private final float selectedRadius;

    public PinProgressWrapperState(@NotNull Common common, int i11, @NotNull String normalColor, @NotNull String selectedColor, @NotNull String errorColor, int i12, float f7, float f11) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(normalColor, "normalColor");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(errorColor, "errorColor");
        this.common = common;
        this.selectedDot = i11;
        this.normalColor = normalColor;
        this.selectedColor = selectedColor;
        this.errorColor = errorColor;
        this.dotsCount = i12;
        this.dotRadius = f7;
        this.selectedRadius = f11;
    }

    public static /* synthetic */ PinProgressWrapperState copy$default(PinProgressWrapperState pinProgressWrapperState, Common common, int i11, String str, String str2, String str3, int i12, float f7, float f11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            common = pinProgressWrapperState.common;
        }
        if ((i13 & 2) != 0) {
            i11 = pinProgressWrapperState.selectedDot;
        }
        if ((i13 & 4) != 0) {
            str = pinProgressWrapperState.normalColor;
        }
        if ((i13 & 8) != 0) {
            str2 = pinProgressWrapperState.selectedColor;
        }
        if ((i13 & 16) != 0) {
            str3 = pinProgressWrapperState.errorColor;
        }
        if ((i13 & 32) != 0) {
            i12 = pinProgressWrapperState.dotsCount;
        }
        if ((i13 & 64) != 0) {
            f7 = pinProgressWrapperState.dotRadius;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            f11 = pinProgressWrapperState.selectedRadius;
        }
        float f12 = f7;
        float f13 = f11;
        String str4 = str3;
        int i14 = i12;
        return pinProgressWrapperState.copy(common, i11, str, str2, str4, i14, f12, f13);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedDot() {
        return this.selectedDot;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNormalColor() {
        return this.normalColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getErrorColor() {
        return this.errorColor;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDotsCount() {
        return this.dotsCount;
    }

    /* renamed from: component7, reason: from getter */
    public final float getDotRadius() {
        return this.dotRadius;
    }

    /* renamed from: component8, reason: from getter */
    public final float getSelectedRadius() {
        return this.selectedRadius;
    }

    @NotNull
    public final PinProgressWrapperState copy(@NotNull Common common, int selectedDot, @NotNull String normalColor, @NotNull String selectedColor, @NotNull String errorColor, int dotsCount, float dotRadius, float selectedRadius) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(normalColor, "normalColor");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(errorColor, "errorColor");
        return new PinProgressWrapperState(common, selectedDot, normalColor, selectedColor, errorColor, dotsCount, dotRadius, selectedRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinProgressWrapperState)) {
            return false;
        }
        PinProgressWrapperState pinProgressWrapperState = (PinProgressWrapperState) other;
        return Intrinsics.d(this.common, pinProgressWrapperState.common) && this.selectedDot == pinProgressWrapperState.selectedDot && Intrinsics.d(this.normalColor, pinProgressWrapperState.normalColor) && Intrinsics.d(this.selectedColor, pinProgressWrapperState.selectedColor) && Intrinsics.d(this.errorColor, pinProgressWrapperState.errorColor) && this.dotsCount == pinProgressWrapperState.dotsCount && Float.compare(this.dotRadius, pinProgressWrapperState.dotRadius) == 0 && Float.compare(this.selectedRadius, pinProgressWrapperState.selectedRadius) == 0;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final float getDotRadius() {
        return this.dotRadius;
    }

    public final int getDotsCount() {
        return this.dotsCount;
    }

    @NotNull
    public final String getErrorColor() {
        return this.errorColor;
    }

    @NotNull
    public final String getNormalColor() {
        return this.normalColor;
    }

    @NotNull
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    public final int getSelectedDot() {
        return this.selectedDot;
    }

    public final float getSelectedRadius() {
        return this.selectedRadius;
    }

    public int hashCode() {
        return Float.hashCode(this.selectedRadius) + Pk0.b.a(this.dotRadius, C2454a.a(this.dotsCount, G.g.a(G.g.a(G.g.a(C2454a.a(this.selectedDot, this.common.hashCode() * 31, 31), 31, this.normalColor), 31, this.selectedColor), 31, this.errorColor), 31), 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        int i11 = this.selectedDot;
        String str = this.normalColor;
        String str2 = this.selectedColor;
        String str3 = this.errorColor;
        int i12 = this.dotsCount;
        float f7 = this.dotRadius;
        float f11 = this.selectedRadius;
        StringBuilder sb2 = new StringBuilder("PinProgressWrapperState(common=");
        sb2.append(common);
        sb2.append(", selectedDot=");
        sb2.append(i11);
        sb2.append(", normalColor=");
        Nh.a.h(sb2, str, ", selectedColor=", str2, ", errorColor=");
        Pk0.g.d(i12, str3, ", dotsCount=", ", dotRadius=", sb2);
        sb2.append(f7);
        sb2.append(", selectedRadius=");
        sb2.append(f11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
