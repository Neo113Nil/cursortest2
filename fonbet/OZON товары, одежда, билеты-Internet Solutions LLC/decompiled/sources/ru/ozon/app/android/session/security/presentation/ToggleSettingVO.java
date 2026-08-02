package ru.ozon.app.android.session.security.presentation;

import G.g;
import I0.C3173b;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/security/presentation/ToggleSettingVO;", "", "", "successOn", "successOff", "failureOn", "failureOff", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSuccessOn", "getSuccessOff", "getFailureOn", "getFailureOff", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToggleSettingVO {

    @NotNull
    private final String failureOff;

    @NotNull
    private final String failureOn;

    @NotNull
    private final String successOff;

    @NotNull
    private final String successOn;

    public ToggleSettingVO(@NotNull String successOn, @NotNull String successOff, @NotNull String failureOn, @NotNull String failureOff) {
        Intrinsics.checkNotNullParameter(successOn, "successOn");
        Intrinsics.checkNotNullParameter(successOff, "successOff");
        Intrinsics.checkNotNullParameter(failureOn, "failureOn");
        Intrinsics.checkNotNullParameter(failureOff, "failureOff");
        this.successOn = successOn;
        this.successOff = successOff;
        this.failureOn = failureOn;
        this.failureOff = failureOff;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleSettingVO)) {
            return false;
        }
        ToggleSettingVO toggleSettingVO = (ToggleSettingVO) other;
        return Intrinsics.d(this.successOn, toggleSettingVO.successOn) && Intrinsics.d(this.successOff, toggleSettingVO.successOff) && Intrinsics.d(this.failureOn, toggleSettingVO.failureOn) && Intrinsics.d(this.failureOff, toggleSettingVO.failureOff);
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
        return C3173b.c(C3660k.d("ToggleSettingVO(successOn=", str, ", successOff=", str2, ", failureOn="), this.failureOn, ", failureOff=", this.failureOff, ")");
    }
}
