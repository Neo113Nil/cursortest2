package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.keyboard;

import B90.C2618u;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/keyboard/KeyboardVisibility;", "", "isVisible", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class KeyboardVisibility {
    private final boolean isVisible;

    public KeyboardVisibility(@i(name = "isVisible") boolean z11) {
        this.isVisible = z11;
    }

    public static /* synthetic */ KeyboardVisibility copy$default(KeyboardVisibility keyboardVisibility, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = keyboardVisibility.isVisible;
        }
        return keyboardVisibility.copy(z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final KeyboardVisibility copy(@i(name = "isVisible") boolean isVisible) {
        return new KeyboardVisibility(isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KeyboardVisibility) && this.isVisible == ((KeyboardVisibility) other).isVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVisible);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        return C2618u.g("KeyboardVisibility(isVisible=", ")", this.isVisible);
    }
}
