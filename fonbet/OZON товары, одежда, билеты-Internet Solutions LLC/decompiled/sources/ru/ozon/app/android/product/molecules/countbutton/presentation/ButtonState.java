package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Kk.C3532b;
import Pk0.a;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/ButtonState;", "", "", "badgeText", "", "isDisabled", "isHapticEnabled", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBadgeText", "Z", "()Z", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ButtonState {
    private final String badgeText;
    private final boolean isDisabled;
    private final boolean isHapticEnabled;

    public ButtonState() {
        this(null, false, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonState)) {
            return false;
        }
        ButtonState buttonState = (ButtonState) other;
        return Intrinsics.d(this.badgeText, buttonState.badgeText) && this.isDisabled == buttonState.isDisabled && this.isHapticEnabled == buttonState.isHapticEnabled;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public int hashCode() {
        String str = this.badgeText;
        return Boolean.hashCode(this.isHapticEnabled) + C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isDisabled);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: isHapticEnabled, reason: from getter */
    public final boolean getIsHapticEnabled() {
        return this.isHapticEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.badgeText;
        boolean z11 = this.isDisabled;
        return a.a(")", C4636t5.b("ButtonState(badgeText=", str, ", isDisabled=", ", isHapticEnabled=", z11), this.isHapticEnabled);
    }

    public ButtonState(String str, boolean z11, boolean z12) {
        this.badgeText = str;
        this.isDisabled = z11;
        this.isHapticEnabled = z12;
    }

    public /* synthetic */ ButtonState(String str, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12);
    }
}
