package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.keyboard;

import B0.A0;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/keyboard/KeyboardShow;", "", "inputMode", "", "<init>", "(Ljava/lang/String;)V", "getInputMode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class KeyboardShow {

    @NotNull
    private final String inputMode;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardShow() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KeyboardShow copy$default(KeyboardShow keyboardShow, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = keyboardShow.inputMode;
        }
        return keyboardShow.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getInputMode() {
        return this.inputMode;
    }

    @NotNull
    public final KeyboardShow copy(@i(name = "inputmode") @NotNull String inputMode) {
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        return new KeyboardShow(inputMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KeyboardShow) && Intrinsics.d(this.inputMode, ((KeyboardShow) other).inputMode);
    }

    @NotNull
    public final String getInputMode() {
        return this.inputMode;
    }

    public int hashCode() {
        return this.inputMode.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("KeyboardShow(inputMode=", this.inputMode, ")");
    }

    public KeyboardShow(@i(name = "inputmode") @NotNull String inputMode) {
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        this.inputMode = inputMode;
    }

    public /* synthetic */ KeyboardShow(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
