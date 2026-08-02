package ru.ozon.app.android.session.security.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/security/data/ToggleSetting;", "", "successOn", "", "successOff", "failureOn", "failureOff", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuccessOn", "()Ljava/lang/String;", "getSuccessOff", "getFailureOn", "getFailureOff", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToggleSetting {
    public static final int $stable = 0;

    @NotNull
    private final String failureOff;

    @NotNull
    private final String failureOn;

    @NotNull
    private final String successOff;

    @NotNull
    private final String successOn;

    public ToggleSetting(@NotNull String successOn, @NotNull String successOff, @NotNull String failureOn, @NotNull String failureOff) {
        Intrinsics.checkNotNullParameter(successOn, "successOn");
        Intrinsics.checkNotNullParameter(successOff, "successOff");
        Intrinsics.checkNotNullParameter(failureOn, "failureOn");
        Intrinsics.checkNotNullParameter(failureOff, "failureOff");
        this.successOn = successOn;
        this.successOff = successOff;
        this.failureOn = failureOn;
        this.failureOff = failureOff;
    }

    public static /* synthetic */ ToggleSetting copy$default(ToggleSetting toggleSetting, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = toggleSetting.successOn;
        }
        if ((i11 & 2) != 0) {
            str2 = toggleSetting.successOff;
        }
        if ((i11 & 4) != 0) {
            str3 = toggleSetting.failureOn;
        }
        if ((i11 & 8) != 0) {
            str4 = toggleSetting.failureOff;
        }
        return toggleSetting.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSuccessOn() {
        return this.successOn;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSuccessOff() {
        return this.successOff;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFailureOn() {
        return this.failureOn;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFailureOff() {
        return this.failureOff;
    }

    @NotNull
    public final ToggleSetting copy(@NotNull String successOn, @NotNull String successOff, @NotNull String failureOn, @NotNull String failureOff) {
        Intrinsics.checkNotNullParameter(successOn, "successOn");
        Intrinsics.checkNotNullParameter(successOff, "successOff");
        Intrinsics.checkNotNullParameter(failureOn, "failureOn");
        Intrinsics.checkNotNullParameter(failureOff, "failureOff");
        return new ToggleSetting(successOn, successOff, failureOn, failureOff);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleSetting)) {
            return false;
        }
        ToggleSetting toggleSetting = (ToggleSetting) other;
        return Intrinsics.d(this.successOn, toggleSetting.successOn) && Intrinsics.d(this.successOff, toggleSetting.successOff) && Intrinsics.d(this.failureOn, toggleSetting.failureOn) && Intrinsics.d(this.failureOff, toggleSetting.failureOff);
    }

    @NotNull
    public final String getFailureOff() {
        return this.failureOff;
    }

    @NotNull
    public final String getFailureOn() {
        return this.failureOn;
    }

    @NotNull
    public final String getSuccessOff() {
        return this.successOff;
    }

    @NotNull
    public final String getSuccessOn() {
        return this.successOn;
    }

    public int hashCode() {
        return this.failureOff.hashCode() + g.a(g.a(this.successOn.hashCode() * 31, 31, this.successOff), 31, this.failureOn);
    }

    @NotNull
    public String toString() {
        String str = this.successOn;
        String str2 = this.successOff;
        return C3173b.c(C3660k.d("ToggleSetting(successOn=", str, ", successOff=", str2, ", failureOn="), this.failureOn, ", failureOff=", this.failureOff, ")");
    }
}
